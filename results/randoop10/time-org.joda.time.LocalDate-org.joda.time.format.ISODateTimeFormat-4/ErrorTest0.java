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
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = timeOfDay21.toDateTimeToday(dateTimeZone22);
        mutableDateTime16.setZoneRetainFields(dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime16, readableDuration25);
        boolean boolean27 = dateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.ReadableDuration readableDuration32 = null;
        mutableDateTime31.add(readableDuration32, 0);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime31.dayOfWeek();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.yearOfEra();
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology40 = localTime39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) 5, chronology40);
        org.joda.time.Chronology chronology42 = chronology40.withUTC();
        mutableDateTime31.setChronology(chronology40);
        org.joda.time.DateTime dateTime44 = dateTime12.toDateTime(chronology40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and mutableDateTime31", (mutableDateTime16.compareTo(mutableDateTime31) == 0) == mutableDateTime16.equals(mutableDateTime31));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        java.lang.String str16 = dateTimeZone13.getShortName((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime11.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime17.toMutableDateTime(chronology18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime17", (dateTime11.compareTo(dateTime17) == 0) == dateTime11.equals(dateTime17));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = timeOfDay9.toDateTimeToday(dateTimeZone10);
        mutableDateTime4.setZoneRetainFields(dateTimeZone10);
        mutableDateTime4.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        mutableDateTime4.setZone(dateTimeZone15);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((-1L), (long) 17, chronology23);
        mutableDateTime4.setChronology(chronology23);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime4.copy();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.joda.time.DateTime dateTime29 = mutableDateTime4.toDateTime(dateTimeZone28);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((long) 'a', dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime29", (mutableDateTime4.compareTo(dateTime29) == 0) == mutableDateTime4.equals(dateTime29));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = timeOfDay5.getFields();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTimeToday(dateTimeZone7);
        org.joda.time.DateTime.Property property9 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime11 = dateTime8.minusMillis((int) (byte) -1);
        boolean boolean13 = dateTime8.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        boolean boolean16 = dateTime8.isSupported(dateTimeFieldType14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        org.joda.time.DateTime dateTime19 = dateTime18.toDateTime();
        boolean boolean20 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.MutablePeriod mutablePeriod22 = period21.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod();
        mutablePeriod24.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod24.setPeriod((long) 15, chronology28);
        mutablePeriod24.setMinutes(1970);
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology37 = localTime36.getChronology();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) 5, chronology37);
        org.joda.time.Chronology chronology39 = chronology37.withUTC();
        mutablePeriod24.setPeriod((long) 0, (long) 1, chronology39);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        int int44 = dateTimeZone42.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime52 = timeOfDay50.toDateTimeToday(dateTimeZone51);
        mutableDateTime45.setZoneRetainFields(dateTimeZone51);
        mutableDateTime45.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        int int58 = dateTimeZone56.getStandardOffset((long) 100);
        mutableDateTime45.setZone(dateTimeZone56);
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology64 = localTime63.getChronology();
        org.joda.time.Interval interval65 = new org.joda.time.Interval((-1L), (long) 17, chronology64);
        mutableDateTime45.setChronology(chronology64);
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(chronology64);
        org.joda.time.Period period69 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period71 = org.joda.time.Period.minutes(1);
        java.lang.String str72 = period71.toString();
        org.joda.time.Period period73 = period69.withFields((org.joda.time.ReadablePeriod) period71);
        org.joda.time.Period period75 = period73.plusMillis(100);
        org.joda.time.Period period76 = period73.negated();
        org.joda.time.Period period78 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period80 = org.joda.time.Period.minutes(1);
        java.lang.String str81 = period80.toString();
        org.joda.time.Period period82 = period78.withFields((org.joda.time.ReadablePeriod) period80);
        org.joda.time.Period period84 = period82.plusMillis(100);
        boolean boolean85 = period76.equals((java.lang.Object) period84);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period87 = period76.withFields((org.joda.time.ReadablePeriod) mutablePeriod86);
        int[] intArray90 = chronology64.get((org.joda.time.ReadablePeriod) period87, 0L, 6L);
        org.joda.time.DateTimeField dateTimeField91 = chronology64.dayOfMonth();
        mutablePeriod24.add((long) 2022, chronology64);
        mutablePeriod22.setPeriod((long) 2025, chronology64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime67", (dateTime18.compareTo(mutableDateTime67) == 0) == dateTime18.equals(mutableDateTime67));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        java.lang.String str16 = dateTimeZone13.getShortName((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime11.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime17.toMutableDateTime(chronology18);
        org.joda.time.DateTime dateTime20 = dateTime17.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime22 = dateTime17.withWeekyear((-292275054));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime17", (dateTime11.compareTo(dateTime17) == 0) == dateTime11.equals(dateTime17));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        mutableDateTime3.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        mutableDateTime3.setZone(dateTimeZone14);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((-1L), (long) 17, chronology22);
        mutableDateTime3.setChronology(chronology22);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime3.copy();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.joda.time.DateTime dateTime28 = mutableDateTime3.toDateTime(dateTimeZone27);
        mutableDateTime3.add((-2234643900016L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime25 and dateTime28", (mutableDateTime25.compareTo(dateTime28) == 0) == mutableDateTime25.equals(dateTime28));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        java.lang.String str16 = dateTimeZone13.getShortName((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime11.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime17.toMutableDateTime(chronology18);
        org.joda.time.DateTime dateTime20 = dateTime17.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime22 = dateTime17.withMillisOfDay(26164018);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime17", (dateTime11.compareTo(dateTime17) == 0) == dateTime11.equals(dateTime17));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period8 = period6.plusMillis(100);
        org.joda.time.LocalTime localTime9 = localTime0.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.LocalTime localTime11 = localTime0.minusHours((-1));
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime.Property property13 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 10, chronology20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Chronology chronology23 = null;
        mutablePeriod21.setPeriod(readableDuration22, chronology23);
        mutablePeriod21.setSeconds(0);
        int[] intArray28 = chronology17.get((org.joda.time.ReadablePeriod) mutablePeriod21, (long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray34 = timeOfDay33.getFields();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = timeOfDay33.toDateTimeToday(dateTimeZone35);
        org.joda.time.DateTime.Property property37 = dateTime36.monthOfYear();
        org.joda.time.DateTime dateTime39 = dateTime36.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.toDateTime(chronology40);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        int int44 = dateTimeZone42.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.TimeOfDay timeOfDay50 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime52 = timeOfDay50.toDateTimeToday(dateTimeZone51);
        mutableDateTime45.setZoneRetainFields(dateTimeZone51);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime45, readableDuration54);
        boolean boolean56 = dateTime41.isBefore((org.joda.time.ReadableInstant) mutableDateTime45);
        java.lang.Object obj57 = mutableDateTime45.clone();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        int int60 = dateTimeZone58.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(dateTimeZone58);
        org.joda.time.ReadableDuration readableDuration62 = null;
        mutableDateTime61.add(readableDuration62, 0);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime61.dayOfWeek();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime61.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime67 = property66.roundFloor();
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime67.millisOfDay();
        int int69 = mutableDateTime67.getYearOfEra();
        mutablePeriod21.setPeriod((org.joda.time.ReadableInstant) mutableDateTime45, (org.joda.time.ReadableInstant) mutableDateTime67);
        boolean boolean72 = mutableDateTime45.isBefore((long) 1970);
        java.util.Date date78 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        date78.setMinutes(54);
        org.joda.time.TimeOfDay timeOfDay81 = org.joda.time.TimeOfDay.fromDateFields(date78);
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = timeOfDay81.getFieldType(2);
        org.joda.time.MutableDateTime.Property property84 = mutableDateTime45.property(dateTimeFieldType83);
        boolean boolean85 = localTime14.isSupported(dateTimeFieldType83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and mutableDateTime45", (mutableDateTime18.compareTo(mutableDateTime45) == 0) == mutableDateTime18.equals(mutableDateTime45));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(chronology4);
        org.joda.time.Period period6 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology4);
        org.joda.time.DurationField durationField7 = chronology4.halfdays();
        org.joda.time.DurationField durationField8 = chronology4.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology4.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        boolean boolean10 = timeZone6.hasSameRules(timeZone9);
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone9, locale11);
        org.joda.time.DateTime dateTime13 = property2.setCopy("6", locale11);
        org.joda.time.DateTime dateTime14 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.weekyearOfCentury();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) dateTime14, chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime18", (dateTime1.compareTo(mutableDateTime18) == 0) == dateTime1.equals(mutableDateTime18));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        boolean boolean6 = timeZone2.hasSameRules(timeZone5);
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone5, locale7);
        int int10 = timeZone5.getOffset((long) 5);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        boolean boolean18 = timeZone14.hasSameRules(timeZone17);
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone17, locale19);
        boolean boolean21 = timeZone17.observesDaylightTime();
        timeZone17.setID("Korean");
        boolean boolean24 = timeZone5.hasSameRules(timeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar20", (calendar8.compareTo(calendar20) == 0) == calendar8.equals(calendar20));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        int int13 = dateTime10.getMillisOfDay();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 10, chronology19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Chronology chronology22 = null;
        mutablePeriod20.setPeriod(readableDuration21, chronology22);
        mutablePeriod20.setSeconds(0);
        int[] intArray27 = chronology16.get((org.joda.time.ReadablePeriod) mutablePeriod20, (long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray33 = timeOfDay32.getFields();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTimeToday(dateTimeZone34);
        org.joda.time.DateTime.Property property36 = dateTime35.monthOfYear();
        org.joda.time.DateTime dateTime38 = dateTime35.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.toDateTime(chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        int int43 = dateTimeZone41.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime51 = timeOfDay49.toDateTimeToday(dateTimeZone50);
        mutableDateTime44.setZoneRetainFields(dateTimeZone50);
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime44, readableDuration53);
        boolean boolean55 = dateTime40.isBefore((org.joda.time.ReadableInstant) mutableDateTime44);
        java.lang.Object obj56 = mutableDateTime44.clone();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        int int59 = dateTimeZone57.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(dateTimeZone57);
        org.joda.time.ReadableDuration readableDuration61 = null;
        mutableDateTime60.add(readableDuration61, 0);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime60.dayOfWeek();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime60.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime66 = property65.roundFloor();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime66.millisOfDay();
        int int68 = mutableDateTime66.getYearOfEra();
        mutablePeriod20.setPeriod((org.joda.time.ReadableInstant) mutableDateTime44, (org.joda.time.ReadableInstant) mutableDateTime66);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) 52, dateTimeZone72);
        mutableDateTime44.setZone(dateTimeZone72);
        org.joda.time.DateTime dateTime75 = dateTime10.withZone(dateTimeZone72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and mutableDateTime44", (mutableDateTime17.compareTo(mutableDateTime44) == 0) == mutableDateTime17.equals(mutableDateTime44));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 5, chronology3);
        org.joda.time.Chronology chronology5 = chronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str17 = locale14.getDisplayVariant(locale16);
        java.lang.String str18 = dateTimeZone11.getName((long) 5, locale14);
        org.joda.time.DateTime dateTime19 = dateTime9.withZoneRetainFields(dateTimeZone11);
        org.joda.time.Chronology chronology20 = chronology5.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField21 = chronology20.weekOfWeekyear();
        int int23 = dateTimeField21.getLeapAmount(21168000000L);
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime.Property property25 = localTime24.hourOfDay();
        org.joda.time.DateTime dateTime26 = localTime24.toDateTimeToday();
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology30 = localTime29.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 10, chronology33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Chronology chronology36 = null;
        mutablePeriod34.setPeriod(readableDuration35, chronology36);
        mutablePeriod34.setSeconds(0);
        int[] intArray41 = chronology30.get((org.joda.time.ReadablePeriod) mutablePeriod34, (long) (short) -1);
        int[] intArray43 = dateTimeField21.addWrapField((org.joda.time.ReadablePartial) localTime24, (int) (short) 1, intArray41, 6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime31", (dateTime8.compareTo(mutableDateTime31) == 0) == dateTime8.equals(mutableDateTime31));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        int int10 = localDate9.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withCenturyOfEra((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight15.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str25 = dateTimeZone24.getID();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime28 = dateTime26.plusSeconds(17);
        org.joda.time.Period period30 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(1);
        java.lang.String str33 = period32.toString();
        org.joda.time.Period period34 = period30.withFields((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period36 = period34.plusMillis(100);
        org.joda.time.Period period38 = period34.minusMillis((int) (byte) 1);
        org.joda.time.DateTime dateTime40 = dateTime28.withPeriodAdded((org.joda.time.ReadablePeriod) period38, 15);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight22.withPeriodAdded((org.joda.time.ReadablePeriod) period38, 31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and dateTime26", (mutableDateTime21.compareTo(dateTime26) == 0) == mutableDateTime21.equals(dateTime26));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 10, chronology5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod6.setPeriod(readableDuration7, chronology8);
        mutablePeriod6.setSeconds(0);
        int[] intArray13 = chronology2.get((org.joda.time.ReadablePeriod) mutablePeriod6, (long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = timeOfDay18.getFields();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.monthOfYear();
        org.joda.time.DateTime dateTime24 = dateTime21.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = timeOfDay35.toDateTimeToday(dateTimeZone36);
        mutableDateTime30.setZoneRetainFields(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime30, readableDuration39);
        boolean boolean41 = dateTime26.isBefore((org.joda.time.ReadableInstant) mutableDateTime30);
        java.lang.Object obj42 = mutableDateTime30.clone();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime46.add(readableDuration47, 0);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime46.dayOfWeek();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundFloor();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.millisOfDay();
        int int54 = mutableDateTime52.getYearOfEra();
        mutablePeriod6.setPeriod((org.joda.time.ReadableInstant) mutableDateTime30, (org.joda.time.ReadableInstant) mutableDateTime52);
        boolean boolean57 = mutableDateTime30.isBefore((long) 1970);
        java.util.Date date63 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        date63.setMinutes(54);
        org.joda.time.TimeOfDay timeOfDay66 = org.joda.time.TimeOfDay.fromDateFields(date63);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = timeOfDay66.getFieldType(2);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime30.property(dateTimeFieldType68);
        org.joda.time.MutableDateTime mutableDateTime71 = property69.set(6);
        java.lang.String str72 = mutableDateTime71.toString();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(chronology73);
        org.joda.time.DateTime.Property property75 = dateTime74.yearOfCentury();
        int int76 = dateTime74.getHourOfDay();
        mutableDateTime71.setTime((org.joda.time.ReadableInstant) dateTime74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime71", (mutableDateTime3.compareTo(mutableDateTime71) == 0) == mutableDateTime3.equals(mutableDateTime71));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTime.Property property10 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property10.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime15.add(readableDuration16, 0);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime15.dayOfWeek();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.minuteOfDay();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = timeOfDay25.toDateTimeToday(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime31 = dateTime27.plusDays((int) (byte) -1);
        java.util.Date date32 = dateTime31.toDate();
        org.joda.time.DateTime.Property property33 = dateTime31.dayOfMonth();
        mutableDateTime15.setMillis((org.joda.time.ReadableInstant) dateTime31);
        int int35 = dateTime11.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        int int38 = dateTimeZone36.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutableDateTime39.add(readableDuration40, 0);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime39.dayOfWeek();
        mutableDateTime39.addSeconds(69);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime39.weekOfWeekyear();
        java.util.Locale locale47 = java.util.Locale.CHINA;
        int int48 = property46.getMaximumShortTextLength(locale47);
        java.util.Calendar calendar49 = mutableDateTime15.toCalendar(locale47);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((java.lang.Object) calendar49);
        java.lang.Object obj51 = calendar49.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and dateTime50", (mutableDateTime15.compareTo(dateTime50) == 0) == mutableDateTime15.equals(dateTime50));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 10, chronology5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod6.setPeriod(readableDuration7, chronology8);
        mutablePeriod6.setSeconds(0);
        int[] intArray13 = chronology2.get((org.joda.time.ReadablePeriod) mutablePeriod6, (long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = timeOfDay18.getFields();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.monthOfYear();
        org.joda.time.DateTime dateTime24 = dateTime21.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = timeOfDay35.toDateTimeToday(dateTimeZone36);
        mutableDateTime30.setZoneRetainFields(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime30, readableDuration39);
        boolean boolean41 = dateTime26.isBefore((org.joda.time.ReadableInstant) mutableDateTime30);
        java.lang.Object obj42 = mutableDateTime30.clone();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime46.add(readableDuration47, 0);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime46.dayOfWeek();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundFloor();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.millisOfDay();
        int int54 = mutableDateTime52.getYearOfEra();
        mutablePeriod6.setPeriod((org.joda.time.ReadableInstant) mutableDateTime30, (org.joda.time.ReadableInstant) mutableDateTime52);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((int) '4', (-1), (int) (short) 100, (-1));
        org.joda.time.LocalTime localTime66 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology67 = localTime66.getChronology();
        org.joda.time.Interval interval68 = new org.joda.time.Interval((-1L), (long) 17, chronology67);
        mutablePeriod61.add((long) 26163694, chronology67);
        mutablePeriod6.setPeriod(0L, chronology67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime30", (mutableDateTime3.compareTo(mutableDateTime30) == 0) == mutableDateTime3.equals(mutableDateTime30));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(chronology4);
        org.joda.time.Period period6 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology4);
        org.joda.time.Period period8 = period6.minusHours(53);
        org.joda.time.Period period9 = period6.negated();
        int int10 = period6.getMonths();
        org.joda.time.Period period11 = period6.toPeriod();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray18 = timeOfDay17.getFields();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTimeToday(dateTimeZone19);
        org.joda.time.DateTime.Property property21 = dateTime20.monthOfYear();
        org.joda.time.DateTime dateTime23 = dateTime20.minusMillis((int) (byte) -1);
        boolean boolean25 = dateTime20.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType26.getDurationType();
        boolean boolean28 = dateTime20.isSupported(dateTimeFieldType26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology29);
        org.joda.time.DateTime dateTime31 = dateTime30.toDateTime();
        boolean boolean32 = dateTime20.isAfter((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Period period33 = new org.joda.time.Period(readableDuration12, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutablePeriod mutablePeriod34 = period33.toMutablePeriod();
        org.joda.time.Period period35 = period6.minus((org.joda.time.ReadablePeriod) period33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and dateTime30", (mutableDateTime5.compareTo(dateTime30) == 0) == mutableDateTime5.equals(dateTime30));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTime dateTime11 = dateTime9.plusSeconds(3172001);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod();
        mutablePeriod12.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod12.setPeriod((long) 15, chronology16);
        mutablePeriod12.setMinutes(1970);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 5, chronology25);
        org.joda.time.Chronology chronology27 = chronology25.withUTC();
        mutablePeriod12.setPeriod((long) 0, (long) 1, chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.hourOfDay();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology27);
        org.joda.time.DateTime dateTime31 = dateTime11.withChronology(chronology27);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.yearDay();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(periodType32);
        org.joda.time.DateTime dateTime35 = dateTime31.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod33, 4);
        boolean boolean36 = dateTime31.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime31", (dateTime11.compareTo(dateTime31) == 0) == dateTime11.equals(dateTime31));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.Instant instant2 = dateTime1.toInstant();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str5 = dateTimeZone4.getID();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = instant2.toDateTime(dateTimeZone4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime6", (dateTime1.compareTo(dateTime6) == 0) == dateTime1.equals(dateTime6));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTime dateTime11 = dateTime9.plusSeconds(3172001);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod();
        mutablePeriod12.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod12.setPeriod((long) 15, chronology16);
        mutablePeriod12.setMinutes(1970);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 5, chronology25);
        org.joda.time.Chronology chronology27 = chronology25.withUTC();
        mutablePeriod12.setPeriod((long) 0, (long) 1, chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.hourOfDay();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology27);
        org.joda.time.DateTime dateTime31 = dateTime11.withChronology(chronology27);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.yearDay();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(periodType32);
        org.joda.time.DateTime dateTime35 = dateTime31.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod33, 4);
        org.joda.time.DateTime dateTime37 = dateTime35.withWeekyear(23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime35", (dateTime11.compareTo(dateTime35) == 0) == dateTime11.equals(dateTime35));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getHourOfDay();
        org.joda.time.DateTime dateTime3 = dateTime0.minus((long) 256);
        org.joda.time.YearMonthDay yearMonthDay4 = dateTime3.toYearMonthDay();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        boolean boolean6 = calendar5.isWeekDateSupported();
        org.joda.time.YearMonthDay yearMonthDay7 = org.joda.time.YearMonthDay.fromCalendarFields(calendar5);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.millis();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.Period period15 = new org.joda.time.Period((long) 25, (long) (-1), periodType10, chronology13);
        org.joda.time.PeriodType periodType16 = periodType10.withWeeksRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadablePartial) yearMonthDay4, (org.joda.time.ReadablePartial) yearMonthDay7, periodType16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and mutableDateTime14", (dateTime0.compareTo(mutableDateTime14) == 0) == dateTime0.equals(mutableDateTime14));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime10 = dateTime6.plusDays((int) (byte) -1);
        java.util.Date date11 = dateTime10.toDate();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, readableDuration12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime17.add(readableDuration18, 0);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        mutableDateTime17.set(dateTimeFieldType23, (int) ' ');
        boolean boolean27 = interval13.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        boolean boolean29 = interval13.contains((long) 17);
        org.joda.time.Interval interval32 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        int int35 = dateTimeZone33.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.ReadableDuration readableDuration37 = null;
        mutableDateTime36.add(readableDuration37, 0);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime36.dayOfWeek();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime42 = property41.roundHalfEven();
        boolean boolean43 = interval32.isBefore((org.joda.time.ReadableInstant) mutableDateTime42);
        int int44 = mutableDateTime42.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType46 = dateTimeFieldType45.getDurationType();
        mutableDateTime42.set(dateTimeFieldType45, 15);
        boolean boolean49 = interval13.contains((org.joda.time.ReadableInstant) mutableDateTime42);
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology52 = localTime51.getChronology();
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(chronology52);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 10, chronology55);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.Chronology chronology58 = null;
        mutablePeriod56.setPeriod(readableDuration57, chronology58);
        mutablePeriod56.setSeconds(0);
        int[] intArray63 = chronology52.get((org.joda.time.ReadablePeriod) mutablePeriod56, (long) (short) -1);
        org.joda.time.LocalTime localTime68 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology69 = localTime68.getChronology();
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((long) 5, chronology69);
        org.joda.time.Chronology chronology71 = chronology69.withUTC();
        org.joda.time.TimeOfDay timeOfDay72 = new org.joda.time.TimeOfDay((long) 2022, chronology71);
        org.joda.time.LocalTime localTime73 = org.joda.time.LocalTime.now(chronology71);
        mutablePeriod56.add((long) (short) 10, chronology71);
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(chronology71);
        mutableDateTime42.setTime((org.joda.time.ReadableInstant) mutableDateTime75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime42 and mutableDateTime53", (mutableDateTime42.compareTo(mutableDateTime53) == 0) == mutableDateTime42.equals(mutableDateTime53));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        java.lang.String str16 = dateTimeZone13.getShortName((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime11.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime17.toMutableDateTime(chronology18);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMonths((-60));
        org.joda.time.DateTime dateTime23 = dateTime17.plusWeeks(1970);
        int int24 = dateTime23.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime17", (dateTime11.compareTo(dateTime17) == 0) == dateTime11.equals(dateTime17));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTime.Property property10 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property10.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime15.add(readableDuration16, 0);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime15.dayOfWeek();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.minuteOfDay();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = timeOfDay25.toDateTimeToday(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime31 = dateTime27.plusDays((int) (byte) -1);
        java.util.Date date32 = dateTime31.toDate();
        org.joda.time.DateTime.Property property33 = dateTime31.dayOfMonth();
        mutableDateTime15.setMillis((org.joda.time.ReadableInstant) dateTime31);
        int int35 = dateTime11.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        int int38 = dateTimeZone36.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutableDateTime39.add(readableDuration40, 0);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime39.dayOfWeek();
        mutableDateTime39.addSeconds(69);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime39.weekOfWeekyear();
        java.util.Locale locale47 = java.util.Locale.CHINA;
        int int48 = property46.getMaximumShortTextLength(locale47);
        java.util.Calendar calendar49 = mutableDateTime15.toCalendar(locale47);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((java.lang.Object) calendar49);
        calendar49.setLenient(false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and dateTime50", (mutableDateTime15.compareTo(dateTime50) == 0) == mutableDateTime15.equals(dateTime50));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.millisOfDay();
        int int11 = mutableDateTime9.getYearOfEra();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.secondOfMinute();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.secondOfMinute();
        mutableDateTime9.addMillis(61);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 10, chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMinuteOfHour(0);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 10, chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.withFields((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 10, chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime26.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod31, 15);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType34.getDurationType();
        int int36 = localDateTime33.get(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.plusSeconds(12);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withDayOfYear((int) (short) 100);
        org.joda.time.Chronology chronology41 = localDateTime38.getChronology();
        org.joda.time.DateTime dateTime42 = mutableDateTime9.toDateTime(chronology41);
        org.joda.time.DurationField durationField43 = chronology41.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime42", (mutableDateTime3.compareTo(dateTime42) == 0) == mutableDateTime3.equals(dateTime42));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.minusMillis((int) 'a');
        int int15 = dateTime14.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime14.withYear(55);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 5, chronology21);
        org.joda.time.Chronology chronology23 = chronology21.withUTC();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 10, chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod26.setPeriod(readableDuration27, chronology28);
        long long32 = chronology23.add((org.joda.time.ReadablePeriod) mutablePeriod26, (long) 32772, 6);
        org.joda.time.DateTimeField dateTimeField33 = chronology23.era();
        org.joda.time.DateTime dateTime34 = dateTime14.withChronology(chronology23);
        org.joda.time.DateTimeField dateTimeField35 = chronology23.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime34", (dateTime14.compareTo(dateTime34) == 0) == dateTime14.equals(dateTime34));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.yearOfEra();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 5, chronology12);
        org.joda.time.Chronology chronology14 = chronology12.withUTC();
        mutableDateTime3.setChronology(chronology12);
        org.joda.time.DateTimeField dateTimeField16 = chronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.clockhourOfHalfday();
        int int18 = dateTimeField17.getMinimumValue();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        boolean boolean30 = timeZone26.hasSameRules(timeZone29);
        java.util.Locale locale31 = java.util.Locale.KOREAN;
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone29, locale31);
        org.joda.time.DateTime dateTime33 = property22.setCopy("6", locale31);
        java.lang.String str34 = dateTimeField17.getAsShortText(22, locale31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime21", (mutableDateTime3.compareTo(dateTime21) == 0) == mutableDateTime3.equals(dateTime21));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy((long) 12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusDays(99);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        int int18 = dateTimeZone16.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = localDateTime15.toDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime22 = dateTime20.plusSeconds(5);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime22.toMutableDateTime();
        org.joda.time.Instant instant24 = dateTime22.toInstant();
        org.joda.time.DateTime dateTime26 = dateTime22.plusMillis(26188548);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and instant24", (mutableDateTime23.compareTo(instant24) == 0) == mutableDateTime23.equals(instant24));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.Interval interval5 = new org.joda.time.Interval((-1L), (long) 17, chronology4);
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = timeOfDay10.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime16 = dateTime12.plusDays((int) (byte) -1);
        java.util.Date date17 = dateTime16.toDate();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, readableDuration18);
        org.joda.time.Period period20 = interval19.toPeriod();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = timeOfDay25.toDateTimeToday(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime31 = dateTime27.plusDays((int) (byte) -1);
        java.util.Date date32 = dateTime31.toDate();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime31, readableDuration33);
        org.joda.time.Interval interval37 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        int int40 = dateTimeZone38.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.ReadableDuration readableDuration42 = null;
        mutableDateTime41.add(readableDuration42, 0);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime41.dayOfWeek();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime41.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime47 = property46.roundHalfEven();
        boolean boolean48 = interval37.isBefore((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray54 = timeOfDay53.getFields();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = timeOfDay53.toDateTimeToday(dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime56.withYearOfCentury(16);
        boolean boolean59 = interval37.isAfter((org.joda.time.ReadableInstant) dateTime58);
        boolean boolean60 = interval34.abuts((org.joda.time.ReadableInterval) interval37);
        org.joda.time.Duration duration61 = interval37.toDuration();
        org.joda.time.Interval interval62 = interval19.withDurationAfterStart((org.joda.time.ReadableDuration) duration61);
        org.joda.time.Interval interval63 = interval5.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration61);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        int int66 = dateTimeZone64.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(dateTimeZone64);
        org.joda.time.ReadableDuration readableDuration68 = null;
        mutableDateTime67.add(readableDuration68, 0);
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime67.dayOfWeek();
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime67.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime73 = property72.roundHalfEven();
        org.joda.time.DateTimeField dateTimeField74 = property72.getField();
        org.joda.time.MutableDateTime mutableDateTime75 = property72.getMutableDateTime();
        boolean boolean76 = duration61.equals((java.lang.Object) property72);
        java.lang.String str77 = duration61.toString();
        org.joda.time.LocalTime localTime81 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology82 = localTime81.getChronology();
        org.joda.time.MutableDateTime mutableDateTime83 = org.joda.time.MutableDateTime.now(chronology82);
        org.joda.time.Period period84 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology82);
        org.joda.time.DurationField durationField85 = chronology82.halfdays();
        org.joda.time.DurationField durationField86 = chronology82.eras();
        boolean boolean87 = duration61.equals((java.lang.Object) durationField86);
        org.joda.time.Chronology chronology88 = null;
        org.joda.time.DateTime dateTime89 = new org.joda.time.DateTime(chronology88);
        org.joda.time.DateTime.Property property90 = dateTime89.yearOfCentury();
        org.joda.time.DateTime dateTime91 = dateTime89.withTimeAtStartOfDay();
        long long92 = dateTime89.getMillis();
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration61, (org.joda.time.ReadableInstant) dateTime89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField85 and durationField86", Math.signum(durationField85.compareTo(durationField86)) == -Math.signum(durationField86.compareTo(durationField85)));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTime.Property property10 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property10.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime15.add(readableDuration16, 0);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime15.dayOfWeek();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.minuteOfDay();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = timeOfDay25.toDateTimeToday(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime31 = dateTime27.plusDays((int) (byte) -1);
        java.util.Date date32 = dateTime31.toDate();
        org.joda.time.DateTime.Property property33 = dateTime31.dayOfMonth();
        mutableDateTime15.setMillis((org.joda.time.ReadableInstant) dateTime31);
        int int35 = dateTime11.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        int int38 = dateTimeZone36.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutableDateTime39.add(readableDuration40, 0);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime39.dayOfWeek();
        mutableDateTime39.addSeconds(69);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime39.weekOfWeekyear();
        java.util.Locale locale47 = java.util.Locale.CHINA;
        int int48 = property46.getMaximumShortTextLength(locale47);
        java.util.Calendar calendar49 = mutableDateTime15.toCalendar(locale47);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((java.lang.Object) calendar49);
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray56 = timeOfDay55.getFields();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = timeOfDay55.toDateTimeToday(dateTimeZone57);
        org.joda.time.DateTime.Property property59 = dateTime58.monthOfYear();
        org.joda.time.DateTime dateTime61 = dateTime58.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = dateTime61.toDateTime(chronology62);
        org.joda.time.DateTime dateTime65 = dateTime61.minusMillis((int) 'a');
        int int66 = dateTime65.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime68 = dateTime65.withYear(55);
        org.joda.time.TimeOfDay timeOfDay69 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay71 = timeOfDay69.plusSeconds(26164018);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = timeOfDay69.getFieldType(1);
        org.joda.time.DateTime dateTime75 = dateTime65.withField(dateTimeFieldType73, 53);
        org.joda.time.DateTime dateTime77 = dateTime65.plusMillis((int) (byte) 0);
        org.joda.time.DateTime.Property property78 = dateTime77.minuteOfHour();
        org.joda.time.DateTime dateTime79 = property78.getDateTime();
        boolean boolean80 = calendar49.after((java.lang.Object) dateTime79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and dateTime50", (mutableDateTime15.compareTo(dateTime50) == 0) == mutableDateTime15.equals(dateTime50));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.plusSeconds(26164018);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, 0);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.yearOfEra();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology15 = localTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 5, chronology15);
        org.joda.time.Chronology chronology17 = chronology15.withUTC();
        mutableDateTime6.setChronology(chronology15);
        org.joda.time.DateTimeField dateTimeField19 = chronology15.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay0.withChronologyRetainFields(chronology15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        int int23 = dateTimeZone21.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = timeOfDay29.toDateTimeToday(dateTimeZone30);
        mutableDateTime24.setZoneRetainFields(dateTimeZone30);
        mutableDateTime24.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        int int37 = dateTimeZone35.getStandardOffset((long) 100);
        mutableDateTime24.setZone(dateTimeZone35);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology43 = localTime42.getChronology();
        org.joda.time.Interval interval44 = new org.joda.time.Interval((-1L), (long) 17, chronology43);
        mutableDateTime24.setChronology(chronology43);
        java.lang.String str46 = chronology43.toString();
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = timeOfDay51.toDateTimeToday(dateTimeZone52);
        org.joda.time.Chronology chronology54 = chronology43.withZone(dateTimeZone52);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(chronology54);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime55.property(dateTimeFieldType56);
        int int58 = timeOfDay0.indexOf(dateTimeFieldType56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and mutableDateTime55", (mutableDateTime6.compareTo(mutableDateTime55) == 0) == mutableDateTime6.equals(mutableDateTime55));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.millis();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(chronology9);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 25, (long) (-1), periodType6, chronology9);
        org.joda.time.PeriodType periodType12 = periodType6.withWeeksRemoved();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((-1L), (long) 17, chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.yearOfCentury();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology17);
        org.joda.time.Period period22 = new org.joda.time.Period(345600000L, (long) '#', periodType6, chronology17);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(chronology27);
        org.joda.time.Period period29 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology27);
        org.joda.time.DurationField durationField30 = chronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField31 = chronology27.halfdayOfDay();
        org.joda.time.Period period32 = new org.joda.time.Period(0L, (long) 55, periodType6, chronology27);
        org.joda.time.DurationField durationField33 = chronology27.eras();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 10, chronology35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Chronology chronology38 = null;
        mutablePeriod36.setPeriod(readableDuration37, chronology38);
        mutablePeriod36.setSeconds(0);
        int int42 = mutablePeriod36.getDays();
        int[] intArray45 = chronology27.get((org.joda.time.ReadablePeriod) mutablePeriod36, 1645404772000L, 8L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField30 and durationField33", Math.signum(durationField30.compareTo(durationField33)) == -Math.signum(durationField33.compareTo(durationField30)));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.minusMillis((int) 'a');
        int int15 = dateTime14.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime14.withYear(55);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 5, chronology21);
        org.joda.time.Chronology chronology23 = chronology21.withUTC();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 10, chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod26.setPeriod(readableDuration27, chronology28);
        long long32 = chronology23.add((org.joda.time.ReadablePeriod) mutablePeriod26, (long) 32772, 6);
        org.joda.time.DateTimeField dateTimeField33 = chronology23.era();
        org.joda.time.DateTime dateTime34 = dateTime14.withChronology(chronology23);
        org.joda.time.DurationField durationField35 = chronology23.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime34", (dateTime14.compareTo(dateTime34) == 0) == dateTime14.equals(dateTime34));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = timeOfDay5.getFields();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTimeToday(dateTimeZone7);
        org.joda.time.DateTime.Property property9 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime11 = dateTime8.minusMillis((int) (byte) -1);
        boolean boolean13 = dateTime8.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        boolean boolean16 = dateTime8.isSupported(dateTimeFieldType14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        org.joda.time.DateTime dateTime19 = dateTime18.toDateTime();
        boolean boolean20 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime21 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology26 = localTime25.getChronology();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((-1L), (long) 17, chronology26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTimeField dateTimeField29 = chronology26.dayOfWeek();
        org.joda.time.DateTime dateTime30 = dateTime21.toDateTime(chronology26);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(955240819200000100L, chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime28", (dateTime18.compareTo(dateTime28) == 0) == dateTime18.equals(dateTime28));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(chronology4);
        org.joda.time.Period period6 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology4);
        org.joda.time.DurationField durationField7 = chronology4.halfdays();
        org.joda.time.DurationField durationField8 = chronology4.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology4.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.minusMillis((int) 'a');
        int int15 = dateTime14.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime14.withYear(55);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 5, chronology21);
        org.joda.time.Chronology chronology23 = chronology21.withUTC();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 10, chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod26.setPeriod(readableDuration27, chronology28);
        long long32 = chronology23.add((org.joda.time.ReadablePeriod) mutablePeriod26, (long) 32772, 6);
        org.joda.time.DateTimeField dateTimeField33 = chronology23.era();
        org.joda.time.DateTime dateTime34 = dateTime14.withChronology(chronology23);
        org.joda.time.DateTime dateTime35 = dateTime34.withLaterOffsetAtOverlap();
        int int36 = dateTime34.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime34", (dateTime14.compareTo(dateTime34) == 0) == dateTime14.equals(dateTime34));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = timeOfDay8.getFields();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = timeOfDay8.toDateTimeToday(dateTimeZone10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(1);
        java.lang.String str16 = period15.toString();
        org.joda.time.Period period17 = period13.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period19 = period13.normalizedStandard(periodType18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration3, (org.joda.time.ReadableInstant) dateTime11, periodType18);
        org.joda.time.PeriodType periodType21 = periodType18.withMillisRemoved();
        org.joda.time.Period period22 = interval2.toPeriod(periodType21);
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray28 = timeOfDay27.getFields();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTimeToday(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfCentury(16);
        org.joda.time.DateTime dateTime34 = dateTime30.plusYears((-1));
        boolean boolean35 = interval2.contains((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology37);
        org.joda.time.DateTime.Property property39 = dateTime38.secondOfMinute();
        org.joda.time.Interval interval40 = new org.joda.time.Interval(readableDuration36, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Interval interval41 = interval2.overlap((org.joda.time.ReadableInterval) interval40);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        int int44 = dateTimeZone42.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.ReadableDuration readableDuration46 = null;
        mutableDateTime45.add(readableDuration46, 0);
        mutableDateTime45.setYear((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod();
        mutablePeriod51.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology55 = null;
        mutablePeriod51.setPeriod((long) 15, chronology55);
        mutablePeriod51.setMinutes(1970);
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology64 = localTime63.getChronology();
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime((long) 5, chronology64);
        org.joda.time.Chronology chronology66 = chronology64.withUTC();
        mutablePeriod51.setPeriod((long) 0, (long) 1, chronology66);
        mutableDateTime45.setChronology(chronology66);
        org.joda.time.DateTimeField dateTimeField69 = chronology66.millisOfSecond();
        org.joda.time.Period period71 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period73 = org.joda.time.Period.minutes(1);
        java.lang.String str74 = period73.toString();
        org.joda.time.Period period75 = period71.withFields((org.joda.time.ReadablePeriod) period73);
        int int76 = period71.getMinutes();
        long long79 = chronology66.add((org.joda.time.ReadablePeriod) period71, 0L, 26190505);
        org.joda.time.Interval interval80 = interval2.withChronology(chronology66);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod82 = mutablePeriod81.copy();
        org.joda.time.LocalTime localTime87 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology88 = localTime87.getChronology();
        org.joda.time.MutableDateTime mutableDateTime89 = org.joda.time.MutableDateTime.now(chronology88);
        org.joda.time.Period period90 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology88);
        mutablePeriod81.setPeriod((long) 15, chronology88);
        int int92 = mutablePeriod81.getMinutes();
        org.joda.time.Interval interval93 = interval2.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) mutablePeriod81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and mutableDateTime89", (dateTime38.compareTo(mutableDateTime89) == 0) == dateTime38.equals(mutableDateTime89));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, 0);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfEven();
        boolean boolean13 = interval2.isBefore((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = timeOfDay18.getFields();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfCentury(16);
        boolean boolean24 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = timeOfDay29.toDateTimeToday(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime35 = dateTime31.plusDays((int) (byte) -1);
        java.util.Date date36 = dateTime35.toDate();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Interval interval38 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime35, readableDuration37);
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        int int44 = dateTimeZone42.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.ReadableDuration readableDuration46 = null;
        mutableDateTime45.add(readableDuration46, 0);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime45.dayOfWeek();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime51 = property50.roundHalfEven();
        boolean boolean52 = interval41.isBefore((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray58 = timeOfDay57.getFields();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = timeOfDay57.toDateTimeToday(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime60.withYearOfCentury(16);
        boolean boolean63 = interval41.isAfter((org.joda.time.ReadableInstant) dateTime62);
        boolean boolean64 = interval38.abuts((org.joda.time.ReadableInterval) interval41);
        org.joda.time.Interval interval65 = interval2.overlap((org.joda.time.ReadableInterval) interval38);
        org.joda.time.Duration duration66 = interval2.toDuration();
        org.joda.time.MutableInterval mutableInterval67 = interval2.toMutableInterval();
        org.joda.time.Duration duration68 = interval2.toDuration();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(chronology69);
        org.joda.time.Instant instant71 = dateTime70.toInstant();
        org.joda.time.Interval interval72 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration68, (org.joda.time.ReadableInstant) instant71);
        long long73 = interval72.getEndMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime70 and instant71", (dateTime70.compareTo(instant71) == 0) == dateTime70.equals(instant71));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.secondOfMinute();
        org.joda.time.Interval interval4 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime2);
        boolean boolean5 = interval4.isAfterNow();
        java.util.Date date14 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.fromDateFields(date14);
        int int16 = localDate15.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        int int19 = dateTimeZone17.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime20 = localDate15.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period25 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period27 = org.joda.time.Period.minutes(1);
        java.lang.String str28 = period27.toString();
        org.joda.time.Period period29 = period25.withFields((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Period period31 = period29.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.months();
        int int33 = period31.get(durationFieldType32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight21.withPeriodAdded((org.joda.time.ReadablePeriod) period31, 0);
        org.joda.time.DateMidnight.Property property36 = dateMidnight21.monthOfYear();
        org.joda.time.DateMidnight dateMidnight37 = property36.roundHalfFloorCopy();
        org.joda.time.DateMidnight dateMidnight39 = property36.addToCopy((int) (byte) 10);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateMidnight.Property property42 = dateMidnight41.weekyear();
        org.joda.time.DateMidnight dateMidnight44 = property42.setCopy("22");
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight44.minusYears((int) (byte) 100);
        boolean boolean47 = interval4.contains((org.joda.time.ReadableInstant) dateMidnight46);
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology52 = localTime51.getChronology();
        org.joda.time.DurationField durationField53 = chronology52.hours();
        org.joda.time.DateTimeField dateTimeField54 = chronology52.year();
        org.joda.time.DateTimeField dateTimeField55 = chronology52.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(chronology52);
        org.joda.time.Period period57 = new org.joda.time.Period(561540000L, (long) 15, chronology52);
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime(chronology52);
        org.joda.time.Period period60 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period62 = org.joda.time.Period.minutes(1);
        java.lang.String str63 = period62.toString();
        org.joda.time.Period period64 = period60.withFields((org.joda.time.ReadablePeriod) period62);
        org.joda.time.Period period66 = period64.plusMillis(100);
        org.joda.time.Period period68 = period66.minusWeeks(81);
        int[] intArray71 = chronology52.get((org.joda.time.ReadablePeriod) period68, (long) 26264290, (long) (-3172001));
        org.joda.time.Period period72 = new org.joda.time.Period((java.lang.Object) interval4, chronology52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and mutableDateTime56", (dateTime2.compareTo(mutableDateTime56) == 0) == dateTime2.equals(mutableDateTime56));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(10);
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(1);
        java.lang.String str13 = period12.toString();
        org.joda.time.Period period14 = period10.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period16 = period14.plusMillis(100);
        org.joda.time.Period period17 = period14.negated();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        boolean boolean20 = period14.isSupported(durationFieldType19);
        org.joda.time.Period period22 = period14.minusYears(0);
        org.joda.time.DateTime dateTime23 = dateTime8.minus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.DateTime.Property property24 = dateTime8.hourOfDay();
        org.joda.time.DateTime dateTime25 = property24.getDateTime();
        org.joda.time.DateTime dateTime27 = property24.setCopy(0);
        org.joda.time.DateTime dateTime28 = property24.withMinimumValue();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology33 = localTime32.getChronology();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((-1L), (long) 17, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology33);
        org.joda.time.DateTimeField dateTimeField36 = chronology33.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.yearOfCentury();
        org.joda.time.DateTime dateTime38 = dateTime28.withChronology(chronology33);
        org.joda.time.DateTime.Property property39 = dateTime28.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime38", (dateTime28.compareTo(dateTime38) == 0) == dateTime28.equals(dateTime38));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.hours();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((long) 38, chronology5);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(30844800000L, (long) 'x', chronology5);
        int int9 = mutablePeriod8.getMillis();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) (short) 100, (long) 12);
        org.joda.time.format.PeriodFormatter periodFormatter14 = null;
        java.lang.String str15 = mutablePeriod13.toString(periodFormatter14);
        org.joda.time.DurationFieldType[] durationFieldTypeArray16 = mutablePeriod13.getFieldTypes();
        mutablePeriod13.addMinutes(2);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.secondOfMinute();
        org.joda.time.Interval interval23 = new org.joda.time.Interval(readableDuration19, (org.joda.time.ReadableInstant) dateTime21);
        boolean boolean24 = interval23.isAfterNow();
        org.joda.time.Period period25 = interval23.toPeriod();
        mutablePeriod13.mergePeriod((org.joda.time.ReadablePeriod) period25);
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = timeOfDay32.toDateTimeToday(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.withCenturyOfEra(10);
        boolean boolean37 = dateTime36.isEqualNow();
        org.joda.time.Chronology chronology38 = dateTime36.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.secondOfMinute();
        org.joda.time.DurationField durationField40 = chronology38.hours();
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(chronology38);
        mutablePeriod13.setPeriod(1645514285512L, chronology38);
        mutablePeriod8.setPeriod((long) 26277709, chronology38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField40", (durationField6.compareTo(durationField40) == 0) == durationField6.equals(durationField40));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = period1.withFields((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period7 = period5.plusMillis(100);
        org.joda.time.Period period8 = period5.negated();
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(1);
        java.lang.String str13 = period12.toString();
        org.joda.time.Period period14 = period10.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period16 = period14.plusMillis(100);
        boolean boolean17 = period8.equals((java.lang.Object) period16);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period19 = period8.withFields((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        int int24 = dateTimeZone22.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration26 = null;
        mutableDateTime25.add(readableDuration26, 0);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime25.dayOfWeek();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.yearOfEra();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 5, chronology34);
        org.joda.time.Chronology chronology36 = chronology34.withUTC();
        mutableDateTime25.setChronology(chronology34);
        org.joda.time.DateTimeField dateTimeField38 = chronology34.millisOfSecond();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) (short) 10, (long) 18, chronology34);
        mutablePeriod18.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod39);
        java.util.Date date46 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate47 = org.joda.time.LocalDate.fromDateFields(date46);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = localDate47.toDateTimeAtCurrentTime(dateTimeZone48);
        org.joda.time.LocalDate localDate51 = localDate47.plusWeeks((int) (short) 0);
        int int52 = localDate47.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str55 = dateTimeZone54.getID();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(dateTimeZone54);
        org.joda.time.DateMidnight dateMidnight57 = localDate47.toDateMidnight(dateTimeZone54);
        org.joda.time.DateMidnight.Property property58 = dateMidnight57.monthOfYear();
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight57.withMillis((long) 3);
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight57.plusYears((int) 'a');
        org.joda.time.DateMidnight.Property property63 = dateMidnight57.dayOfYear();
        org.joda.time.DateMidnight dateMidnight65 = property63.addWrapFieldToCopy(1970);
        org.joda.time.TimeOfDay timeOfDay70 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray71 = timeOfDay70.getFields();
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.DateTime dateTime73 = timeOfDay70.toDateTimeToday(dateTimeZone72);
        org.joda.time.DateTime.Property property74 = dateTime73.monthOfYear();
        org.joda.time.DateTime dateTime76 = dateTime73.minusMillis((int) (byte) -1);
        boolean boolean78 = dateTime73.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType80 = dateTimeFieldType79.getDurationType();
        boolean boolean81 = dateTime73.isSupported(dateTimeFieldType79);
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime(chronology82);
        org.joda.time.DateTime dateTime84 = dateTime83.toDateTime();
        boolean boolean85 = dateTime73.isAfter((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.DateTime dateTime86 = dateTime73.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime87 = dateTime73.toDateTimeISO();
        mutablePeriod18.setPeriod((org.joda.time.ReadableInstant) dateMidnight65, (org.joda.time.ReadableInstant) dateTime87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime25 and dateTime56", (mutableDateTime25.compareTo(dateTime56) == 0) == mutableDateTime25.equals(dateTime56));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = timeOfDay5.getFields();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTimeToday(dateTimeZone7);
        org.joda.time.DateTime.Property property9 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime8.toDateTime();
        org.joda.time.Period period12 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period14 = org.joda.time.Period.minutes(1);
        java.lang.String str15 = period14.toString();
        org.joda.time.Period period16 = period12.withFields((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Period period18 = period16.plusMillis(100);
        org.joda.time.Period period19 = period16.negated();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getDurationType();
        boolean boolean22 = period16.isSupported(durationFieldType21);
        org.joda.time.Weeks weeks23 = period16.toStandardWeeks();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 5, chronology27);
        org.joda.time.Period period29 = new org.joda.time.Period((java.lang.Object) period16, chronology27);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime8.toMutableDateTime(chronology27);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 26214, chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime30", (dateTime8.compareTo(mutableDateTime30) == 0) == dateTime8.equals(mutableDateTime30));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, 0);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfEven();
        boolean boolean13 = interval2.isBefore((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = timeOfDay18.getFields();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfCentury(16);
        boolean boolean24 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = timeOfDay29.toDateTimeToday(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime35 = dateTime31.plusDays((int) (byte) -1);
        java.util.Date date36 = dateTime35.toDate();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Interval interval38 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime35, readableDuration37);
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        int int44 = dateTimeZone42.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.ReadableDuration readableDuration46 = null;
        mutableDateTime45.add(readableDuration46, 0);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime45.dayOfWeek();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime51 = property50.roundHalfEven();
        boolean boolean52 = interval41.isBefore((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray58 = timeOfDay57.getFields();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = timeOfDay57.toDateTimeToday(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime60.withYearOfCentury(16);
        boolean boolean63 = interval41.isAfter((org.joda.time.ReadableInstant) dateTime62);
        boolean boolean64 = interval38.abuts((org.joda.time.ReadableInterval) interval41);
        org.joda.time.Interval interval65 = interval2.overlap((org.joda.time.ReadableInterval) interval38);
        org.joda.time.Duration duration66 = interval2.toDuration();
        org.joda.time.MutableInterval mutableInterval67 = interval2.toMutableInterval();
        org.joda.time.Duration duration68 = interval2.toDuration();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(chronology69);
        org.joda.time.Instant instant71 = dateTime70.toInstant();
        org.joda.time.Interval interval72 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration68, (org.joda.time.ReadableInstant) instant71);
        boolean boolean73 = interval72.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime70 and instant71", (dateTime70.compareTo(instant71) == 0) == dateTime70.equals(instant71));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfCentury(16);
        org.joda.time.DateTime dateTime11 = dateTime9.plus((long) 1);
        org.joda.time.DateTime dateTime12 = dateTime9.toDateTimeISO();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((-1L), (long) 17, chronology17);
        org.joda.time.DurationField durationField19 = chronology17.halfdays();
        org.joda.time.DateTime dateTime20 = dateTime9.toDateTime(chronology17);
        org.joda.time.DateTime dateTime22 = dateTime9.plusMillis(1961);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime20", (dateTime9.compareTo(dateTime20) == 0) == dateTime9.equals(dateTime20));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, 0);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundFloor();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = timeOfDay22.toDateTimeToday(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withCenturyOfEra(10);
        boolean boolean27 = dateTime26.isEqualNow();
        org.joda.time.Chronology chronology28 = dateTime26.getChronology();
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(15, 5, chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.clockhourOfDay();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(1L, chronology28);
        boolean boolean32 = dateTimeFieldType14.isSupported(chronology28);
        mutableDateTime12.setChronology(chronology28);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((-68803869717836306L), (long) 54, chronology28);
        org.joda.time.DurationField durationField35 = chronology28.eras();
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(52254751446427999L, chronology28);
        org.joda.time.DateTimeField dateTimeField37 = chronology28.minuteOfDay();
        org.joda.time.DurationField durationField38 = chronology28.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField38, and durationField35", !(durationField35.compareTo(durationField38) == 0) || (Math.signum(durationField35.compareTo(durationField35)) == Math.signum(durationField38.compareTo(durationField35))));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        boolean boolean7 = timeZone3.hasSameRules(timeZone6);
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone6, locale8);
        java.util.Calendar.Builder builder10 = builder0.setTimeZone(timeZone6);
        java.util.Date date16 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.fromDateFields(date16);
        long long18 = date16.getTime();
        date16.setHours(99);
        int int21 = date16.getDay();
        java.util.Calendar.Builder builder22 = builder0.setInstant(date16);
        java.util.Calendar.Builder builder24 = builder0.setLenient(false);
        java.util.Date date30 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.fromDateFields(date30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate31.toDateTimeAtCurrentTime(dateTimeZone32);
        org.joda.time.LocalDate localDate35 = localDate31.plusWeeks((int) (short) 0);
        int int36 = localDate31.getDayOfWeek();
        java.util.Date date37 = localDate31.toDate();
        int int38 = date37.getDate();
        java.util.Calendar.Builder builder39 = builder0.setInstant(date37);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone42 = dateTimeZone41.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone45 = dateTimeZone44.toTimeZone();
        boolean boolean46 = timeZone42.hasSameRules(timeZone45);
        java.util.Locale locale47 = java.util.Locale.KOREAN;
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone45, locale47);
        int int50 = timeZone45.getOffset((long) 5);
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(timeZone45);
        java.util.Locale locale52 = java.util.Locale.KOREAN;
        java.util.Locale locale54 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str55 = locale52.getDisplayVariant(locale54);
        java.util.Locale locale56 = locale54.stripExtensions();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str59 = dateTimeZone58.getID();
        java.util.Locale locale61 = java.util.Locale.KOREAN;
        java.util.Locale locale63 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str64 = locale61.getDisplayVariant(locale63);
        java.lang.String str65 = dateTimeZone58.getName((long) 5, locale61);
        java.util.Locale locale66 = java.util.Locale.KOREAN;
        java.lang.String str67 = locale61.getDisplayScript(locale66);
        java.lang.String str68 = locale56.getDisplayName(locale61);
        java.util.Calendar calendar69 = java.util.Calendar.getInstance(timeZone45, locale56);
        timeZone45.setID("hi!");
        java.util.Calendar.Builder builder72 = builder39.setTimeZone(timeZone45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar9 and calendar48", (calendar9.compareTo(calendar48) == 0) == calendar9.equals(calendar48));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType1.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray3 = new org.joda.time.DurationFieldType[] { durationFieldType2 };
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.forFields(durationFieldTypeArray3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime8.add(readableDuration9, 0);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.dayOfWeek();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.yearOfEra();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 5, chronology17);
        org.joda.time.Chronology chronology19 = chronology17.withUTC();
        mutableDateTime8.setChronology(chronology17);
        org.joda.time.DurationField durationField21 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.dayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 'a', periodType4, chronology17);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 10, chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withMinuteOfHour(0);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 10, chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.withFields((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 10, chronology38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime34.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod39, 15);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType42.getDurationType();
        int int44 = localDateTime41.get(dateTimeFieldType42);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime41.plusSeconds(12);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.withDayOfYear((int) (short) 100);
        org.joda.time.Chronology chronology49 = localDateTime46.getChronology();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.withEra(0);
        org.joda.time.Period period53 = org.joda.time.Period.months(15);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str56 = dateTimeZone55.getID();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(dateTimeZone55);
        org.joda.time.DateTime dateTime59 = dateTime57.plusSeconds(17);
        org.joda.time.DateTime dateTime61 = dateTime57.withDayOfMonth(2);
        org.joda.time.Duration duration62 = period53.toDurationTo((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime46.plus((org.joda.time.ReadableDuration) duration62);
        mutablePeriod23.setPeriod((org.joda.time.ReadableDuration) duration62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and dateTime57", (mutableDateTime8.compareTo(dateTime57) == 0) == mutableDateTime8.equals(dateTime57));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime3.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.add((long) (-292275054));
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (short) 100, (long) 12);
        org.joda.time.format.PeriodFormatter periodFormatter12 = null;
        java.lang.String str13 = mutablePeriod11.toString(periodFormatter12);
        org.joda.time.DurationFieldType[] durationFieldTypeArray14 = mutablePeriod11.getFieldTypes();
        mutablePeriod11.addMinutes(2);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology20 = localTime19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.hours();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.secondOfDay();
        org.joda.time.DurationField durationField23 = chronology20.months();
        mutablePeriod11.setPeriod((long) 26163694, chronology20);
        org.joda.time.DateTime dateTime25 = mutableDateTime8.toDateTime(chronology20);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime8.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and dateTime25", (mutableDateTime8.compareTo(dateTime25) == 0) == mutableDateTime8.equals(dateTime25));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        boolean boolean6 = timeZone2.hasSameRules(timeZone5);
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone5, locale7);
        boolean boolean9 = timeZone5.observesDaylightTime();
        timeZone5.setID("Korean");
        int int13 = timeZone5.getOffset((-62134819200000L));
        timeZone5.setRawOffset(438);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(0, (int) '4', chronology18);
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.plusMinutes(1899);
        org.joda.time.TimeOfDay.Property property22 = timeOfDay19.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone25 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        boolean boolean29 = timeZone25.hasSameRules(timeZone28);
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone28, locale30);
        int int32 = property22.getMaximumTextLength(locale30);
        java.lang.String str33 = locale30.getDisplayScript();
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone5, locale30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar31", (calendar8.compareTo(calendar31) == 0) == calendar8.equals(calendar31));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime9 = dateTime7.toDateTime();
        org.joda.time.Period period11 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period13 = org.joda.time.Period.minutes(1);
        java.lang.String str14 = period13.toString();
        org.joda.time.Period period15 = period11.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period17 = period15.plusMillis(100);
        org.joda.time.Period period18 = period15.negated();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType19.getDurationType();
        boolean boolean21 = period15.isSupported(durationFieldType20);
        org.joda.time.Weeks weeks22 = period15.toStandardWeeks();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology26 = localTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 5, chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period((java.lang.Object) period15, chronology26);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime7.toMutableDateTime(chronology26);
        org.joda.time.DurationField durationField30 = chronology26.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime29", (dateTime7.compareTo(mutableDateTime29) == 0) == dateTime7.equals(mutableDateTime29));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = timeOfDay5.getFields();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTimeToday(dateTimeZone7);
        org.joda.time.DateTime.Property property9 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime11 = dateTime8.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = timeOfDay23.toDateTimeToday(dateTimeZone24);
        mutableDateTime18.setZoneRetainFields(dateTimeZone24);
        mutableDateTime18.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        int int31 = dateTimeZone29.getStandardOffset((long) 100);
        mutableDateTime18.setZone(dateTimeZone29);
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology37 = localTime36.getChronology();
        org.joda.time.Interval interval38 = new org.joda.time.Interval((-1L), (long) 17, chronology37);
        mutableDateTime18.setChronology(chronology37);
        java.lang.String str40 = chronology37.toString();
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime47 = timeOfDay45.toDateTimeToday(dateTimeZone46);
        org.joda.time.Chronology chronology48 = chronology37.withZone(dateTimeZone46);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(chronology48);
        org.joda.time.Period period50 = new org.joda.time.Period((long) 53, chronology48);
        org.joda.time.DateTime dateTime51 = dateTime13.toDateTime(chronology48);
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime((long) (short) 10, chronology48);
        org.joda.time.DateTimeField dateTimeField53 = chronology48.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and mutableDateTime49", (mutableDateTime18.compareTo(mutableDateTime49) == 0) == mutableDateTime18.equals(mutableDateTime49));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTime.Property property10 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property10.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime15.add(readableDuration16, 0);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime15.dayOfWeek();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.minuteOfDay();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = timeOfDay25.toDateTimeToday(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime31 = dateTime27.plusDays((int) (byte) -1);
        java.util.Date date32 = dateTime31.toDate();
        org.joda.time.DateTime.Property property33 = dateTime31.dayOfMonth();
        mutableDateTime15.setMillis((org.joda.time.ReadableInstant) dateTime31);
        int int35 = dateTime11.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        int int38 = dateTimeZone36.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutableDateTime39.add(readableDuration40, 0);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime39.dayOfWeek();
        mutableDateTime39.addSeconds(69);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime39.weekOfWeekyear();
        java.util.Locale locale47 = java.util.Locale.CHINA;
        int int48 = property46.getMaximumShortTextLength(locale47);
        java.util.Calendar calendar49 = mutableDateTime15.toCalendar(locale47);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((java.lang.Object) calendar49);
        java.time.Instant instant51 = calendar49.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and dateTime50", (mutableDateTime15.compareTo(dateTime50) == 0) == mutableDateTime15.equals(dateTime50));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.secondOfMinute();
        org.joda.time.Interval interval4 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime2);
        boolean boolean5 = interval4.isAfterNow();
        long long6 = interval4.getEndMillis();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = timeOfDay11.getFields();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTimeToday(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfCentury(16);
        org.joda.time.DateTime dateTime18 = dateTime16.plus((long) 1);
        org.joda.time.DateTime dateTime19 = dateTime16.toDateTimeISO();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((-1L), (long) 17, chronology24);
        org.joda.time.DurationField durationField26 = chronology24.halfdays();
        org.joda.time.DateTime dateTime27 = dateTime16.toDateTime(chronology24);
        boolean boolean28 = interval4.isBefore((org.joda.time.ReadableInstant) dateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime27", (dateTime16.compareTo(dateTime27) == 0) == dateTime16.equals(dateTime27));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        int int13 = dateTime10.getMillisOfDay();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 10);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime15, readableDuration16);
        boolean boolean18 = dateTime10.equals((java.lang.Object) dateTime15);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.hours();
        org.joda.time.DateTimeField dateTimeField25 = chronology23.era();
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology23);
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(18, 13, chronology23);
        org.joda.time.DateTimeField dateTimeField28 = chronology23.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        int int31 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone29);
        java.lang.String str33 = dateTimeZone29.toString();
        org.joda.time.Chronology chronology34 = chronology23.withZone(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.millisOfSecond();
        org.joda.time.DateTime dateTime36 = dateTime10.withChronology(chronology34);
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology41 = localTime40.getChronology();
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(chronology41);
        org.joda.time.Period period43 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology41);
        org.joda.time.Period period45 = period43.minusHours(53);
        org.joda.time.Period period46 = period43.negated();
        org.joda.time.Period period48 = org.joda.time.Period.seconds(29);
        org.joda.time.Period period50 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period52 = org.joda.time.Period.minutes(1);
        java.lang.String str53 = period52.toString();
        org.joda.time.Period period54 = period50.withFields((org.joda.time.ReadablePeriod) period52);
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period56 = period50.normalizedStandard(periodType55);
        org.joda.time.PeriodType periodType57 = periodType55.withYearsRemoved();
        org.joda.time.LocalTime localTime58 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period60 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period62 = org.joda.time.Period.minutes(1);
        java.lang.String str63 = period62.toString();
        org.joda.time.Period period64 = period60.withFields((org.joda.time.ReadablePeriod) period62);
        org.joda.time.Period period66 = period64.plusMillis(100);
        org.joda.time.LocalTime localTime67 = localTime58.minus((org.joda.time.ReadablePeriod) period64);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        int int70 = dateTimeZone68.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(dateTimeZone68);
        org.joda.time.ReadableDuration readableDuration72 = null;
        mutableDateTime71.add(readableDuration72, 0);
        org.joda.time.Period period76 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period78 = org.joda.time.Period.minutes(1);
        java.lang.String str79 = period78.toString();
        org.joda.time.Period period80 = period76.withFields((org.joda.time.ReadablePeriod) period78);
        org.joda.time.Period period82 = period80.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType83 = org.joda.time.DurationFieldType.months();
        int int84 = period82.get(durationFieldType83);
        mutableDateTime71.add(durationFieldType83, 7);
        boolean boolean87 = period64.isSupported(durationFieldType83);
        int int88 = periodType57.indexOf(durationFieldType83);
        org.joda.time.Period period90 = period48.withFieldAdded(durationFieldType83, 38);
        org.joda.time.Period period92 = period43.withField(durationFieldType83, 36);
        org.joda.time.DateTime dateTime94 = dateTime36.withFieldAdded(durationFieldType83, 99);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and mutableDateTime42", (dateTime32.compareTo(mutableDateTime42) == 0) == dateTime32.equals(mutableDateTime42));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.millisOfDay();
        int int11 = mutableDateTime9.getYearOfEra();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.secondOfMinute();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.secondOfMinute();
        mutableDateTime9.addMillis(61);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 10, chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMinuteOfHour(0);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 10, chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.withFields((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 10, chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime26.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod31, 15);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType34.getDurationType();
        int int36 = localDateTime33.get(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.plusSeconds(12);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withDayOfYear((int) (short) 100);
        org.joda.time.Chronology chronology41 = localDateTime38.getChronology();
        org.joda.time.DateTime dateTime42 = mutableDateTime9.toDateTime(chronology41);
        org.joda.time.Period period44 = org.joda.time.Period.seconds(26215220);
        int[] intArray47 = chronology41.get((org.joda.time.ReadablePeriod) period44, 33L, (long) 26164018);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime42", (mutableDateTime3.compareTo(dateTime42) == 0) == mutableDateTime3.equals(dateTime42));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime13 = property11.addToCopy((long) 12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusDays(99);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        int int18 = dateTimeZone16.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = localDateTime15.toDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime22 = dateTime20.plusSeconds(5);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime22.toMutableDateTime();
        org.joda.time.Instant instant24 = dateTime22.toInstant();
        org.joda.time.Period period26 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(1);
        java.lang.String str29 = period28.toString();
        org.joda.time.Period period30 = period26.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period32 = period30.plusMillis(100);
        org.joda.time.Period period34 = period30.minusMillis((int) (byte) 1);
        org.joda.time.Period period36 = period34.plusMinutes(99);
        org.joda.time.DateTime dateTime37 = dateTime22.plus((org.joda.time.ReadablePeriod) period36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and instant24", (mutableDateTime23.compareTo(instant24) == 0) == mutableDateTime23.equals(instant24));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutableDateTime4.add(readableDuration5, 0);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime4.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime4.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundFloor();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = timeOfDay20.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.withCenturyOfEra(10);
        boolean boolean25 = dateTime24.isEqualNow();
        org.joda.time.Chronology chronology26 = dateTime24.getChronology();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(15, 5, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.clockhourOfDay();
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(1L, chronology26);
        boolean boolean30 = dateTimeFieldType12.isSupported(chronology26);
        mutableDateTime10.setChronology(chronology26);
        org.joda.time.DurationField durationField32 = durationFieldType0.getField(chronology26);
        org.joda.time.DurationField durationField33 = chronology26.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField33, and durationField32", !(durationField32.compareTo(durationField33) == 0) || (Math.signum(durationField32.compareTo(durationField32)) == Math.signum(durationField33.compareTo(durationField32))));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = timeOfDay7.getFields();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTimeToday(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = timeOfDay7.toDateTimeToday(dateTimeZone12);
        org.joda.time.DateTime dateTime16 = localTime1.toDateTimeToday(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        int int19 = dateTimeZone17.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime20.add(readableDuration21, 0);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime20.dayOfWeek();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.yearOfEra();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 5, chronology29);
        org.joda.time.Chronology chronology31 = chronology29.withUTC();
        mutableDateTime20.setChronology(chronology29);
        org.joda.time.DateTimeField dateTimeField33 = chronology29.weekyearOfCentury();
        org.joda.time.DurationField durationField34 = chronology29.centuries();
        org.joda.time.DateTime dateTime35 = dateTime16.toDateTime(chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and mutableDateTime20", (dateTime14.compareTo(mutableDateTime20) == 0) == dateTime14.equals(mutableDateTime20));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.Instant instant2 = dateTime1.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property4 = dateTime1.property(dateTimeFieldType3);
        org.joda.time.DateTime dateTime5 = property4.roundFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant2", (dateTime1.compareTo(instant2) == 0) == dateTime1.equals(instant2));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        mutableDateTime3.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        mutableDateTime3.setZone(dateTimeZone14);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((-1L), (long) 17, chronology22);
        mutableDateTime3.setChronology(chronology22);
        org.joda.time.DateTimeField dateTimeField25 = chronology22.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = chronology22.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray33 = timeOfDay32.getFields();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = timeOfDay32.toDateTimeToday(dateTimeZone34);
        org.joda.time.DateTime.Property property36 = dateTime35.monthOfYear();
        org.joda.time.DateTime dateTime38 = dateTime35.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.toDateTime(chronology39);
        int int41 = dateTime38.getMillisOfDay();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 10);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime43, readableDuration44);
        boolean boolean46 = dateTime38.equals((java.lang.Object) dateTime43);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology51 = localTime50.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.hours();
        org.joda.time.DateTimeField dateTimeField53 = chronology51.era();
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight(chronology51);
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay(18, 13, chronology51);
        org.joda.time.DateTimeField dateTimeField56 = chronology51.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        int int59 = dateTimeZone57.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(dateTimeZone57);
        java.lang.String str61 = dateTimeZone57.toString();
        org.joda.time.Chronology chronology62 = chronology51.withZone(dateTimeZone57);
        org.joda.time.DateTimeField dateTimeField63 = chronology62.millisOfSecond();
        org.joda.time.DateTime dateTime64 = dateTime38.withChronology(chronology62);
        org.joda.time.LocalTime localTime68 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology69 = localTime68.getChronology();
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((long) 5, chronology69);
        org.joda.time.Chronology chronology71 = chronology69.withUTC();
        org.joda.time.DateTimeField dateTimeField72 = chronology71.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight73 = new org.joda.time.DateMidnight((-259200000L), chronology71);
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight(chronology71);
        org.joda.time.DateTime dateTime75 = dateTime64.withChronology(chronology71);
        mutableDateTime27.setChronology(chronology71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and dateTime75", (dateTime38.compareTo(dateTime75) == 0) == dateTime38.equals(dateTime75));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withDefaultYear(32772);
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod();
        mutablePeriod3.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod3.setPeriod((long) 15, chronology7);
        mutablePeriod3.setMinutes(1970);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 5, chronology16);
        org.joda.time.Chronology chronology18 = chronology16.withUTC();
        mutablePeriod3.setPeriod((long) 0, (long) 1, chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.hourOfDay();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter2.withChronology(chronology18);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        int int25 = dateTimeZone23.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone23);
        int int28 = dateTimeZone23.getOffsetFromLocal(21168000036L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter22.withZone(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and mutableDateTime26", (dateTime21.compareTo(mutableDateTime26) == 0) == dateTime21.equals(mutableDateTime26));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(10);
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(1);
        java.lang.String str13 = period12.toString();
        org.joda.time.Period period14 = period10.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period16 = period14.plusMillis(100);
        org.joda.time.Period period17 = period14.negated();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        boolean boolean20 = period14.isSupported(durationFieldType19);
        org.joda.time.Period period22 = period14.minusYears(0);
        org.joda.time.DateTime dateTime23 = dateTime8.minus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.DateTime.Property property24 = dateTime8.hourOfDay();
        org.joda.time.DateTime dateTime25 = property24.getDateTime();
        org.joda.time.DateTime dateTime27 = property24.setCopy(0);
        org.joda.time.DateTime dateTime28 = property24.withMinimumValue();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology33 = localTime32.getChronology();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((-1L), (long) 17, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology33);
        org.joda.time.DateTimeField dateTimeField36 = chronology33.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.yearOfCentury();
        org.joda.time.DateTime dateTime38 = dateTime28.withChronology(chronology33);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime41 = dateTime38.withPeriodAdded(readablePeriod39, 71);
        org.joda.time.TimeOfDay timeOfDay42 = dateTime41.toTimeOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime41", (dateTime8.compareTo(dateTime41) == 0) == dateTime8.equals(dateTime41));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        int int10 = localDate9.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone11);
        org.joda.time.Interval interval16 = dateMidnight15.toInterval();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        org.joda.time.DateTime dateTime19 = dateTime18.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str22 = dateTimeZone21.getID();
        java.util.Locale locale24 = java.util.Locale.KOREAN;
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str27 = locale24.getDisplayVariant(locale26);
        java.lang.String str28 = dateTimeZone21.getName((long) 5, locale24);
        org.joda.time.DateTime dateTime29 = dateTime19.withZoneRetainFields(dateTimeZone21);
        boolean boolean30 = dateMidnight15.isEqual((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight15.withYear(26188858);
        org.joda.time.Instant instant33 = dateMidnight15.toInstant();
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight15.withMillis((-68803869717836306L));
        org.joda.time.MutableDateTime mutableDateTime36 = dateMidnight35.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight15 and instant33", (dateMidnight15.compareTo(instant33) == 0) == dateMidnight15.equals(instant33));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        org.joda.time.DateTime dateTime5 = dateTime1.withSecondOfMinute(16);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = timeOfDay14.toDateTimeToday(dateTimeZone15);
        mutableDateTime9.setZoneRetainFields(dateTimeZone15);
        mutableDateTime9.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        int int22 = dateTimeZone20.getStandardOffset((long) 100);
        mutableDateTime9.setZone(dateTimeZone20);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((-1L), (long) 17, chronology28);
        mutableDateTime9.setChronology(chronology28);
        org.joda.time.DateTimeField dateTimeField31 = chronology28.yearOfCentury();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(chronology28);
        org.joda.time.DateTimeField dateTimeField33 = chronology28.secondOfDay();
        org.joda.time.DurationField durationField34 = chronology28.halfdays();
        org.joda.time.DurationField durationField35 = chronology28.centuries();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime5, chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime32", (dateTime1.compareTo(dateTime32) == 0) == dateTime1.equals(dateTime32));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((java.lang.Object) mutableDateTime3);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.plusMonths(7);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay11.minusYears(69);
        org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay13.minusYears(5603523);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = yearMonthDay13.getFieldTypes();
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period21 = period18.plusWeeks(17);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology26 = localTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology26);
        org.joda.time.Period period28 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology26);
        org.joda.time.Period period30 = period28.minusHours(53);
        org.joda.time.Period period32 = period28.withWeeks((int) '#');
        org.joda.time.Period period33 = period18.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period35 = period33.minusHours(26164018);
        org.joda.time.Period period37 = period35.minusMonths(26361522);
        org.joda.time.YearMonthDay yearMonthDay38 = yearMonthDay13.minus((org.joda.time.ReadablePeriod) period35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime27", (mutableDateTime3.compareTo(mutableDateTime27) == 0) == mutableDateTime3.equals(mutableDateTime27));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = timeOfDay21.toDateTimeToday(dateTimeZone22);
        mutableDateTime16.setZoneRetainFields(dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime16, readableDuration25);
        boolean boolean27 = dateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        java.lang.Object obj28 = mutableDateTime16.clone();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.halfdays();
        mutableDateTime16.add(durationFieldType29, 18);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        int int34 = dateTimeZone32.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone32);
        mutableDateTime16.setZoneRetainFields(dateTimeZone32);
        org.joda.time.DateMidnight dateMidnight37 = org.joda.time.DateMidnight.now(dateTimeZone32);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology44 = localTime43.getChronology();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((-1L), (long) 17, chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.secondOfDay();
        org.joda.time.DateTimeField dateTimeField47 = chronology44.yearOfCentury();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(chronology44);
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(chronology44);
        org.joda.time.Period period51 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period53 = org.joda.time.Period.minutes(1);
        java.lang.String str54 = period53.toString();
        org.joda.time.Period period55 = period51.withFields((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Period period57 = period55.plusMillis(100);
        org.joda.time.Period period58 = period55.negated();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType60 = dateTimeFieldType59.getDurationType();
        boolean boolean61 = period55.isSupported(durationFieldType60);
        org.joda.time.Period period63 = period55.minusYears(0);
        org.joda.time.Period period65 = period63.plusMonths(15);
        org.joda.time.Period period67 = period63.withMinutes(48);
        org.joda.time.DateTime dateTime69 = dateTime49.withPeriodAdded((org.joda.time.ReadablePeriod) period63, 26196);
        org.joda.time.DateTime dateTime70 = dateTime49.toDateTime();
        boolean boolean71 = dateMidnight39.isEqual((org.joda.time.ReadableInstant) dateTime70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime35 and dateTime48", (mutableDateTime35.compareTo(dateTime48) == 0) == mutableDateTime35.equals(dateTime48));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.minusMillis((int) 'a');
        int int15 = dateTime14.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime14.withYear(55);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 5, chronology21);
        org.joda.time.Chronology chronology23 = chronology21.withUTC();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 10, chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod26.setPeriod(readableDuration27, chronology28);
        long long32 = chronology23.add((org.joda.time.ReadablePeriod) mutablePeriod26, (long) 32772, 6);
        org.joda.time.DateTimeField dateTimeField33 = chronology23.era();
        org.joda.time.DateTime dateTime34 = dateTime14.withChronology(chronology23);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(chronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime34", (dateTime14.compareTo(dateTime34) == 0) == dateTime14.equals(dateTime34));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        boolean boolean6 = timeZone2.hasSameRules(timeZone5);
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone5, locale7);
        boolean boolean9 = timeZone5.observesDaylightTime();
        java.util.Calendar.Builder builder10 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        boolean boolean17 = timeZone13.hasSameRules(timeZone16);
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone16, locale18);
        java.util.Calendar.Builder builder20 = builder10.setTimeZone(timeZone16);
        timeZone16.setID("19");
        java.util.Date date28 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.fromDateFields(date28);
        int int30 = localDate29.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime34 = localDate29.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay37 = yearMonthDay35.withYear(1899);
        org.joda.time.Interval interval38 = yearMonthDay35.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray39 = yearMonthDay35.getFieldTypes();
        org.joda.time.YearMonthDay.Property property40 = yearMonthDay35.year();
        org.joda.time.YearMonthDay yearMonthDay41 = property40.withMaximumValue();
        java.util.Date date48 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate49 = org.joda.time.LocalDate.fromDateFields(date48);
        org.joda.time.LocalDate.Property property50 = localDate49.weekOfWeekyear();
        org.joda.time.LocalDate localDate51 = property50.getLocalDate();
        org.joda.time.DateTimeField dateTimeField52 = property50.getField();
        long long55 = dateTimeField52.set((long) 15, 12);
        java.util.Locale locale57 = java.util.Locale.KOREAN;
        java.util.Locale locale58 = java.util.Locale.KOREAN;
        java.lang.String str59 = locale57.getDisplayVariant(locale58);
        java.lang.String str60 = dateTimeField52.getAsText((long) 1970, locale58);
        java.lang.String str61 = yearMonthDay41.toString("\ufffd\ufffd\ufffd38", locale58);
        java.util.Calendar calendar62 = java.util.Calendar.getInstance(timeZone16, locale58);
        java.util.Date date63 = calendar62.getTime();
        boolean boolean64 = timeZone5.inDaylightTime(date63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar19", (calendar8.compareTo(calendar19) == 0) == calendar8.equals(calendar19));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusSeconds(17);
        int int6 = dateTime3.getHourOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.minus((long) 9);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = timeOfDay15.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minus((long) (short) 0);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period23 = org.joda.time.Period.minutes(1);
        java.lang.String str24 = period23.toString();
        org.joda.time.Period period25 = period21.withFields((org.joda.time.ReadablePeriod) period23);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period27 = period21.normalizedStandard(periodType26);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableDuration10, (org.joda.time.ReadableInstant) dateTime19, periodType26);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime8, readableDuration9, periodType26);
        org.joda.time.PeriodType periodType30 = mutablePeriod29.getPeriodType();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology37 = localTime36.getChronology();
        org.joda.time.Interval interval38 = new org.joda.time.Interval((-1L), (long) 17, chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.secondOfDay();
        org.joda.time.DateTimeField dateTimeField40 = chronology37.yearOfCentury();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology37);
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(chronology37);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(1645514312043L, chronology37);
        mutablePeriod29.setPeriod(98L, chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime41", (dateTime3.compareTo(dateTime41) == 0) == dateTime3.equals(dateTime41));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        int int6 = dateTimeZone4.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 16, dateTimeZone4);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 10, chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMinuteOfHour(0);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 10, chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withFields((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime13.withDurationAdded(readableDuration20, (int) (byte) 10);
        boolean boolean23 = dateTimeZone4.isLocalDateTimeGap(localDateTime13);
        boolean boolean24 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        org.joda.time.Chronology chronology25 = localDateTime13.getChronology();
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(chronology25);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and dateTime27", (mutableDateTime7.compareTo(dateTime27) == 0) == mutableDateTime7.equals(dateTime27));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        mutableDateTime4.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime4.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.add((long) (-292275054));
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (short) 100, (long) 12);
        org.joda.time.format.PeriodFormatter periodFormatter13 = null;
        java.lang.String str14 = mutablePeriod12.toString(periodFormatter13);
        org.joda.time.DurationFieldType[] durationFieldTypeArray15 = mutablePeriod12.getFieldTypes();
        mutablePeriod12.addMinutes(2);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.hours();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.secondOfDay();
        org.joda.time.DurationField durationField24 = chronology21.months();
        mutablePeriod12.setPeriod((long) 26163694, chronology21);
        org.joda.time.DateTime dateTime26 = mutableDateTime9.toDateTime(chronology21);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(1817572000L, chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime26", (mutableDateTime4.compareTo(dateTime26) == 0) == mutableDateTime4.equals(dateTime26));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((java.lang.Object) mutableDateTime3);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.plusMonths(7);
        int[] intArray12 = yearMonthDay9.getValues();
        java.util.Date date18 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.fromDateFields(date18);
        org.joda.time.LocalDate.Property property20 = localDate19.weekOfWeekyear();
        org.joda.time.LocalDate localDate21 = property20.getLocalDate();
        org.joda.time.Period period23 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period25 = org.joda.time.Period.minutes(1);
        java.lang.String str26 = period25.toString();
        org.joda.time.Period period27 = period23.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period29 = period27.plusMillis(100);
        org.joda.time.Period period30 = period27.negated();
        org.joda.time.Period period32 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period34 = org.joda.time.Period.minutes(1);
        java.lang.String str35 = period34.toString();
        org.joda.time.Period period36 = period32.withFields((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Period period38 = period36.plusMillis(100);
        boolean boolean39 = period30.equals((java.lang.Object) period38);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period41 = period30.withFields((org.joda.time.ReadablePeriod) mutablePeriod40);
        org.joda.time.LocalDate localDate42 = localDate21.plus((org.joda.time.ReadablePeriod) mutablePeriod40);
        mutablePeriod40.addMillis(0);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod();
        mutablePeriod45.addWeeks((int) (byte) 100);
        mutablePeriod40.add((org.joda.time.ReadablePeriod) mutablePeriod45);
        mutablePeriod40.setValue(4, 24);
        org.joda.time.YearMonthDay yearMonthDay52 = yearMonthDay9.plus((org.joda.time.ReadablePeriod) mutablePeriod40);
        mutablePeriod40.setWeeks(0);
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology59 = localTime58.getChronology();
        org.joda.time.MutableDateTime mutableDateTime60 = org.joda.time.MutableDateTime.now(chronology59);
        org.joda.time.Period period61 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology59);
        org.joda.time.Period period63 = period61.minusHours(53);
        org.joda.time.Period period65 = period61.withWeeks((int) '#');
        org.joda.time.DurationFieldType durationFieldType66 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean67 = period61.isSupported(durationFieldType66);
        java.lang.String str68 = durationFieldType66.getName();
        int int69 = mutablePeriod40.indexOf(durationFieldType66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime60", (mutableDateTime3.compareTo(mutableDateTime60) == 0) == mutableDateTime3.equals(mutableDateTime60));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone0);
        int int5 = localDate4.getDayOfMonth();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Period period9 = org.joda.time.Period.minutes(1);
        java.lang.String str10 = period9.toString();
        org.joda.time.LocalTime localTime11 = localTime7.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 10, chronology13);
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod14.setPeriod((long) 0, chronology16);
        org.joda.time.LocalTime localTime19 = localTime11.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod14, 55);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.hours();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.DateTimeField dateTimeField25 = chronology22.centuryOfEra();
        org.joda.time.Chronology chronology26 = chronology22.withUTC();
        org.joda.time.DateTimeZone dateTimeZone27 = chronology22.getZone();
        org.joda.time.DateTime dateTime28 = localDate4.toDateTime(localTime11, dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime24", (mutableDateTime3.compareTo(mutableDateTime24) == 0) == mutableDateTime3.equals(mutableDateTime24));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 10, chronology5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod6.setPeriod(readableDuration7, chronology8);
        mutablePeriod6.setSeconds(0);
        int[] intArray13 = chronology2.get((org.joda.time.ReadablePeriod) mutablePeriod6, (long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = timeOfDay18.getFields();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.monthOfYear();
        org.joda.time.DateTime dateTime24 = dateTime21.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = timeOfDay35.toDateTimeToday(dateTimeZone36);
        mutableDateTime30.setZoneRetainFields(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime30, readableDuration39);
        boolean boolean41 = dateTime26.isBefore((org.joda.time.ReadableInstant) mutableDateTime30);
        java.lang.Object obj42 = mutableDateTime30.clone();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime46.add(readableDuration47, 0);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime46.dayOfWeek();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundFloor();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.millisOfDay();
        int int54 = mutableDateTime52.getYearOfEra();
        mutablePeriod6.setPeriod((org.joda.time.ReadableInstant) mutableDateTime30, (org.joda.time.ReadableInstant) mutableDateTime52);
        boolean boolean57 = mutableDateTime30.isBefore((long) 1970);
        java.util.Date date63 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        date63.setMinutes(54);
        org.joda.time.TimeOfDay timeOfDay66 = org.joda.time.TimeOfDay.fromDateFields(date63);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = timeOfDay66.getFieldType(2);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime30.property(dateTimeFieldType68);
        org.joda.time.DurationFieldType durationFieldType70 = dateTimeFieldType68.getDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime30", (mutableDateTime3.compareTo(mutableDateTime30) == 0) == mutableDateTime3.equals(mutableDateTime30));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = timeOfDay9.toDateTimeToday(dateTimeZone10);
        mutableDateTime4.setZoneRetainFields(dateTimeZone10);
        mutableDateTime4.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        mutableDateTime4.setZone(dateTimeZone15);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((-1L), (long) 17, chronology23);
        mutableDateTime4.setChronology(chronology23);
        java.lang.String str26 = chronology23.toString();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = timeOfDay31.toDateTimeToday(dateTimeZone32);
        org.joda.time.Chronology chronology34 = chronology23.withZone(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology34);
        org.joda.time.Period period36 = new org.joda.time.Period((long) 53, chronology34);
        org.joda.time.DateTimeField dateTimeField37 = chronology34.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology34.weekOfWeekyear();
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology41 = localTime40.getChronology();
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(chronology41);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 10, chronology44);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Chronology chronology47 = null;
        mutablePeriod45.setPeriod(readableDuration46, chronology47);
        mutablePeriod45.setSeconds(0);
        int[] intArray52 = chronology41.get((org.joda.time.ReadablePeriod) mutablePeriod45, (long) (short) -1);
        int[] intArray55 = chronology34.get((org.joda.time.ReadablePeriod) mutablePeriod45, 259200018L, (long) 69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime35 and mutableDateTime42", (mutableDateTime35.compareTo(mutableDateTime42) == 0) == mutableDateTime35.equals(mutableDateTime42));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfEven();
        org.joda.time.DateTimeField dateTimeField10 = property8.getField();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.getMutableDateTime();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 5, chronology16);
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 3172001, chronology16);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime11.toMutableDateTime(chronology16);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period22 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period24 = org.joda.time.Period.minutes(1);
        java.lang.String str25 = period24.toString();
        org.joda.time.Period period26 = period22.withFields((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Period period28 = period26.plusMillis(100);
        org.joda.time.LocalTime localTime29 = localTime20.minus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.LocalTime localTime31 = localTime20.minusHours((-1));
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.minusSeconds(3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
        java.lang.String str41 = timeOfDay37.toString(dateTimeFormatter40);
        int int42 = property32.compareTo((org.joda.time.ReadablePartial) timeOfDay37);
        org.joda.time.LocalTime localTime43 = property32.roundFloorCopy();
        org.joda.time.LocalTime localTime44 = property32.getLocalTime();
        boolean boolean45 = mutableDateTime11.equals((java.lang.Object) property32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and mutableDateTime19", (mutableDateTime11.compareTo(mutableDateTime19) == 0) == mutableDateTime11.equals(mutableDateTime19));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusSeconds(17);
        int int6 = dateTime3.getHourOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.minus((long) 9);
        java.util.Date date17 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.fromDateFields(date17);
        int int19 = localDate18.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        int int22 = dateTimeZone20.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime23 = localDate18.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period30 = org.joda.time.Period.minutes(1);
        java.lang.String str31 = period30.toString();
        org.joda.time.Period period32 = period28.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period34 = period32.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.months();
        int int36 = period34.get(durationFieldType35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight24.withPeriodAdded((org.joda.time.ReadablePeriod) period34, 0);
        boolean boolean39 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.DateMidnight.Property property40 = dateMidnight24.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str43 = dateTimeZone42.getID();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone42);
        org.joda.time.DateTime dateTime46 = dateTime44.plusSeconds(17);
        org.joda.time.DateTime dateTime48 = dateTime44.withDayOfMonth(2);
        org.joda.time.DateTime dateTime50 = dateTime48.withMillisOfSecond(29);
        org.joda.time.DateTime dateTime52 = dateTime48.withMillisOfSecond(12);
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight24, (org.joda.time.ReadableInstant) dateTime48);
        int int54 = dateTime48.getMinuteOfDay();
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology59 = localTime58.getChronology();
        org.joda.time.Interval interval60 = new org.joda.time.Interval((-1L), (long) 17, chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology59.secondOfDay();
        org.joda.time.DateTimeField dateTimeField62 = chronology59.yearOfCentury();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(chronology59);
        org.joda.time.DateTime dateTime64 = org.joda.time.DateTime.now(chronology59);
        org.joda.time.Period period66 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period68 = org.joda.time.Period.minutes(1);
        java.lang.String str69 = period68.toString();
        org.joda.time.Period period70 = period66.withFields((org.joda.time.ReadablePeriod) period68);
        org.joda.time.Period period72 = period70.plusMillis(100);
        org.joda.time.Period period73 = period70.negated();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType75 = dateTimeFieldType74.getDurationType();
        boolean boolean76 = period70.isSupported(durationFieldType75);
        org.joda.time.Period period78 = period70.minusYears(0);
        org.joda.time.Period period80 = period78.plusMonths(15);
        org.joda.time.Period period82 = period78.withMinutes(48);
        org.joda.time.DateTime dateTime84 = dateTime64.withPeriodAdded((org.joda.time.ReadablePeriod) period78, 26196);
        org.joda.time.DateTime.Property property85 = dateTime84.era();
        boolean boolean86 = dateTime48.isAfter((org.joda.time.ReadableInstant) dateTime84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime63", (dateTime3.compareTo(dateTime63) == 0) == dateTime3.equals(dateTime63));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = timeOfDay5.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minus((long) (short) 0);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(36);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.Period period18 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology16);
        org.joda.time.DurationField durationField19 = chronology16.halfdays();
        org.joda.time.DateTime dateTime20 = dateTime11.withChronology(chronology16);
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.fromMillisOfDay(1645514205352L, chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime20", (dateTime11.compareTo(dateTime20) == 0) == dateTime11.equals(dateTime20));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime1.getDayOfWeek();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 5, chronology9);
        org.joda.time.Chronology chronology11 = chronology9.withUTC();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay((long) 2022, chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime1.toMutableDateTime(chronology11);
        org.joda.time.DateTimeField dateTimeField15 = chronology11.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime14", (dateTime1.compareTo(mutableDateTime14) == 0) == dateTime1.equals(mutableDateTime14));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.millisOfDay();
        int int11 = mutableDateTime9.getYearOfEra();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.secondOfMinute();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.secondOfMinute();
        mutableDateTime9.addMillis(61);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 10, chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMinuteOfHour(0);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 10, chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.withFields((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 10, chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime26.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod31, 15);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType34.getDurationType();
        int int36 = localDateTime33.get(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.plusSeconds(12);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withDayOfYear((int) (short) 100);
        org.joda.time.Chronology chronology41 = localDateTime38.getChronology();
        org.joda.time.DateTime dateTime42 = mutableDateTime9.toDateTime(chronology41);
        int int43 = mutableDateTime9.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and dateTime42", (mutableDateTime9.compareTo(dateTime42) == 0) == mutableDateTime9.equals(dateTime42));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        boolean boolean12 = dateTime7.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getDurationType();
        boolean boolean15 = dateTime7.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime dateTime18 = dateTime17.toDateTime();
        boolean boolean19 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime22 = dateTime7.minus((long) (byte) 0);
        org.joda.time.DateTime dateTime24 = dateTime7.plusMinutes(38);
        int int25 = dateTime7.getMillisOfSecond();
        org.joda.time.DateTime dateTime27 = dateTime7.withCenturyOfEra(56035);
        org.joda.time.DateTime dateTime29 = dateTime27.minusSeconds(437);
        org.joda.time.Instant instant30 = dateTime27.toInstant();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay((java.lang.Object) dateTime27);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime27.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and instant30", (dateTime27.compareTo(instant30) == 0) == dateTime27.equals(instant30));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.addWeeks((int) (byte) 100);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = timeOfDay11.getFields();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTimeToday(dateTimeZone13);
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period22 = period16.normalizedStandard(periodType21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableDuration6, (org.joda.time.ReadableInstant) dateTime14, periodType21);
        org.joda.time.PeriodType periodType24 = periodType21.withMillisRemoved();
        org.joda.time.Period period25 = interval5.toPeriod(periodType24);
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray31 = timeOfDay30.getFields();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTimeToday(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.withYearOfCentury(16);
        org.joda.time.DateTime dateTime37 = dateTime33.plusYears((-1));
        boolean boolean38 = interval5.contains((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        org.joda.time.DateTime.Property property42 = dateTime41.secondOfMinute();
        org.joda.time.Interval interval43 = new org.joda.time.Interval(readableDuration39, (org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Interval interval44 = interval5.overlap((org.joda.time.ReadableInterval) interval43);
        mutablePeriod0.setPeriod((org.joda.time.ReadableInterval) interval43);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology51 = localTime50.getChronology();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((-1L), (long) 17, chronology51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(chronology51);
        org.joda.time.LocalTime localTime54 = org.joda.time.LocalTime.now(chronology51);
        mutablePeriod0.add((long) (-82), chronology51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and dateTime53", (dateTime41.compareTo(dateTime53) == 0) == dateTime41.equals(dateTime53));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTime dateTime11 = dateTime9.plusSeconds(3172001);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod();
        mutablePeriod12.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod12.setPeriod((long) 15, chronology16);
        mutablePeriod12.setMinutes(1970);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 5, chronology25);
        org.joda.time.Chronology chronology27 = chronology25.withUTC();
        mutablePeriod12.setPeriod((long) 0, (long) 1, chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.hourOfDay();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology27);
        org.joda.time.DateTime dateTime31 = dateTime11.withChronology(chronology27);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.yearDay();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(periodType32);
        org.joda.time.DateTime dateTime35 = dateTime31.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod33, 4);
        org.joda.time.DateTime dateTime37 = dateTime35.plusMillis(26339772);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime35", (dateTime11.compareTo(dateTime35) == 0) == dateTime11.equals(dateTime35));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        boolean boolean12 = dateTime7.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getDurationType();
        boolean boolean15 = dateTime7.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime dateTime18 = dateTime17.toDateTime();
        boolean boolean19 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime22 = dateTime7.minus((long) (byte) 0);
        org.joda.time.DateTime dateTime24 = dateTime7.plusMinutes(38);
        int int25 = dateTime7.getMillisOfSecond();
        org.joda.time.DateTime dateTime27 = dateTime7.withCenturyOfEra(56035);
        org.joda.time.DateTime dateTime29 = dateTime27.minusSeconds(437);
        org.joda.time.Instant instant30 = dateTime27.toInstant();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay((java.lang.Object) dateTime27);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime27.toMutableDateTime();
        org.joda.time.DateTime dateTime34 = dateTime27.plus((long) 26269919);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant30 and mutableDateTime32", (instant30.compareTo(mutableDateTime32) == 0) == instant30.equals(mutableDateTime32));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusSeconds(17);
        org.joda.time.Period period7 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period9 = org.joda.time.Period.minutes(1);
        java.lang.String str10 = period9.toString();
        org.joda.time.Period period11 = period7.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period11.plusMillis(100);
        org.joda.time.Period period15 = period11.minusMillis((int) (byte) 1);
        org.joda.time.DateTime dateTime17 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period15, 15);
        org.joda.time.DateTime dateTime19 = dateTime17.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTime dateTime21 = dateTime19.minusWeeks(1971);
        org.joda.time.DateTime dateTime23 = dateTime19.plusHours(2000);
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = timeOfDay28.toDateTimeToday(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.minus((long) (short) 0);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMonths(36);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology39 = localTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(chronology39);
        org.joda.time.Period period41 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology39);
        org.joda.time.DurationField durationField42 = chronology39.halfdays();
        org.joda.time.DateTime dateTime43 = dateTime34.withChronology(chronology39);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTime43.getZone();
        org.joda.time.DateTime dateTime45 = dateTime23.toDateTime(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime40", (dateTime3.compareTo(mutableDateTime40) == 0) == dateTime3.equals(mutableDateTime40));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = timeOfDay5.getFields();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTimeToday(dateTimeZone7);
        org.joda.time.DateTime.Property property9 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime11 = dateTime8.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime11.minusMillis((int) 'a');
        int int16 = dateTime15.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime18 = dateTime15.withYear(55);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) 5, chronology22);
        org.joda.time.Chronology chronology24 = chronology22.withUTC();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 10, chronology26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Chronology chronology29 = null;
        mutablePeriod27.setPeriod(readableDuration28, chronology29);
        long long33 = chronology24.add((org.joda.time.ReadablePeriod) mutablePeriod27, (long) 32772, 6);
        org.joda.time.DateTimeField dateTimeField34 = chronology24.era();
        org.joda.time.DateTime dateTime35 = dateTime15.withChronology(chronology24);
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay(1894L, chronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime35", (dateTime15.compareTo(dateTime35) == 0) == dateTime15.equals(dateTime35));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.millis();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.Period period8 = new org.joda.time.Period((long) 25, (long) (-1), periodType3, chronology6);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.millisOfDay();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((-2234643900016L), chronology6);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.hours();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.era();
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.fromMillisOfDay(0L, chronology14);
        org.joda.time.Chronology chronology19 = timeOfDay18.getChronology();
        java.util.Calendar calendar20 = java.util.Calendar.getInstance();
        int int22 = calendar20.getMaximum((int) (short) 0);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromCalendarFields(calendar20);
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.now();
        org.joda.time.Period period26 = org.joda.time.Period.minutes(1);
        org.joda.time.LocalTime localTime28 = localTime24.withPeriodAdded((org.joda.time.ReadablePeriod) period26, (int) ' ');
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray35 = timeOfDay34.getFields();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = timeOfDay34.toDateTimeToday(dateTimeZone36);
        org.joda.time.DateTime.Property property38 = dateTime37.monthOfYear();
        org.joda.time.DateTime dateTime40 = dateTime37.minusMillis((int) (byte) -1);
        boolean boolean42 = dateTime37.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType44 = dateTimeFieldType43.getDurationType();
        boolean boolean45 = dateTime37.isSupported(dateTimeFieldType43);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology46);
        org.joda.time.DateTime dateTime48 = dateTime47.toDateTime();
        boolean boolean49 = dateTime37.isAfter((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Period period50 = new org.joda.time.Period(readableDuration29, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.TimeOfDay timeOfDay56 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime58 = timeOfDay56.toDateTimeToday(dateTimeZone57);
        org.joda.time.DateTime dateTime60 = dateTime58.minus((long) (short) 0);
        org.joda.time.Period period62 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period64 = org.joda.time.Period.minutes(1);
        java.lang.String str65 = period64.toString();
        org.joda.time.Period period66 = period62.withFields((org.joda.time.ReadablePeriod) period64);
        org.joda.time.PeriodType periodType67 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period68 = period62.normalizedStandard(periodType67);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod(readableDuration51, (org.joda.time.ReadableInstant) dateTime60, periodType67);
        int int70 = mutablePeriod69.getMonths();
        org.joda.time.Period period71 = period50.minus((org.joda.time.ReadablePeriod) mutablePeriod69);
        org.joda.time.LocalTime localTime73 = localTime24.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod69, 0);
        org.joda.time.LocalTime localTime74 = localTime23.minus((org.joda.time.ReadablePeriod) mutablePeriod69);
        org.joda.time.TimeOfDay timeOfDay75 = timeOfDay18.minus((org.joda.time.ReadablePeriod) mutablePeriod69);
        int int76 = localTime10.compareTo((org.joda.time.ReadablePartial) timeOfDay75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and dateTime47", (mutableDateTime7.compareTo(dateTime47) == 0) == mutableDateTime7.equals(dateTime47));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, 0);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfEven();
        boolean boolean13 = interval2.isBefore((org.joda.time.ReadableInstant) mutableDateTime12);
        int int14 = mutableDateTime12.getHourOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime12.toMutableDateTime();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 10, chronology17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Chronology chronology20 = null;
        mutablePeriod18.setPeriod(readableDuration19, chronology20);
        mutablePeriod18.setSeconds(0);
        mutableDateTime12.add((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        int int27 = dateTimeZone25.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = timeOfDay33.toDateTimeToday(dateTimeZone34);
        mutableDateTime28.setZoneRetainFields(dateTimeZone34);
        mutableDateTime28.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        int int41 = dateTimeZone39.getStandardOffset((long) 100);
        mutableDateTime28.setZone(dateTimeZone39);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology47 = localTime46.getChronology();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((-1L), (long) 17, chronology47);
        mutableDateTime28.setChronology(chronology47);
        org.joda.time.DateTimeField dateTimeField50 = chronology47.yearOfCentury();
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(chronology47);
        org.joda.time.DateTimeField dateTimeField52 = chronology47.secondOfDay();
        org.joda.time.DurationField durationField53 = chronology47.halfdays();
        mutableDateTime12.setChronology(chronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and mutableDateTime15", (mutableDateTime12.compareTo(mutableDateTime15) == 0) == mutableDateTime12.equals(mutableDateTime15));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutableDateTime4.add(readableDuration5, 0);
        org.joda.time.Period period9 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period11 = org.joda.time.Period.minutes(1);
        java.lang.String str12 = period11.toString();
        org.joda.time.Period period13 = period9.withFields((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period15 = period13.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.months();
        int int17 = period15.get(durationFieldType16);
        mutableDateTime4.add(durationFieldType16, 7);
        mutableDateTime4.addSeconds((-292275054));
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        int int24 = dateTimeZone22.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration26 = null;
        mutableDateTime25.add(readableDuration26, 0);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime25.dayOfWeek();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.yearOfEra();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 5, chronology34);
        org.joda.time.Chronology chronology36 = chronology34.withUTC();
        mutableDateTime25.setChronology(chronology34);
        mutableDateTime25.setYear((int) (byte) 100);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology43 = localTime42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology43.getZone();
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay((-11056028000L), chronology43);
        org.joda.time.DurationField durationField47 = chronology43.years();
        mutableDateTime25.setChronology(chronology43);
        long long52 = chronology43.add((long) 17, (long) 17, 1969);
        org.joda.time.DateTime dateTime53 = mutableDateTime4.toDateTime(chronology43);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) 11975520, chronology43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime53", (mutableDateTime4.compareTo(dateTime53) == 0) == mutableDateTime4.equals(dateTime53));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 5, chronology3);
        org.joda.time.Chronology chronology5 = chronology3.withUTC();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(chronology11);
        org.joda.time.Period period13 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology11);
        org.joda.time.DurationField durationField14 = chronology11.halfdays();
        long long16 = durationField14.getValueAsLong((long) (byte) 100);
        long long19 = durationField14.getMillis(4233600010L, (long) 26165226);
        long long20 = durationField14.getUnitMillis();
        int int21 = durationField6.compareTo(durationField14);
        long long23 = durationField14.getMillis(1584);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField14, and durationField6", !(durationField6.compareTo(durationField14) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField14.compareTo(durationField6))));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        int int10 = localDate9.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withYearOfEra(16);
        org.joda.time.DateMidnight.Property property18 = dateMidnight17.year();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight17.plus(readablePeriod19);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod();
        mutablePeriod21.addWeeks((int) (byte) 100);
        java.util.Date date29 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.fromDateFields(date29);
        int int31 = localDate30.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        int int34 = dateTimeZone32.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime35 = localDate30.toDateTimeAtCurrentTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str38 = dateTimeZone37.getID();
        java.lang.String str40 = dateTimeZone37.getShortName((long) (short) 100);
        org.joda.time.DateTime dateTime41 = dateTime35.withZone(dateTimeZone37);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime41.toMutableDateTime(chronology42);
        org.joda.time.DateTime dateTime45 = dateTime41.plusMonths((-60));
        org.joda.time.DateTime dateTime47 = dateTime41.plusWeeks(1970);
        org.joda.time.Duration duration48 = mutablePeriod21.toDurationFrom((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight17.withDurationAdded((org.joda.time.ReadableDuration) duration48, (int) 'x');
        org.joda.time.DateMidnight.Property property51 = dateMidnight50.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight50.withYear(25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime41", (dateTime14.compareTo(dateTime41) == 0) == dateTime14.equals(dateTime41));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = timeOfDay22.toDateTimeToday(dateTimeZone23);
        mutableDateTime17.setZoneRetainFields(dateTimeZone23);
        mutableDateTime17.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        mutableDateTime17.setZone(dateTimeZone28);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology36 = localTime35.getChronology();
        org.joda.time.Interval interval37 = new org.joda.time.Interval((-1L), (long) 17, chronology36);
        mutableDateTime17.setChronology(chronology36);
        java.lang.String str39 = chronology36.toString();
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime46 = timeOfDay44.toDateTimeToday(dateTimeZone45);
        org.joda.time.Chronology chronology47 = chronology36.withZone(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(chronology47);
        org.joda.time.Period period49 = new org.joda.time.Period((long) 53, chronology47);
        org.joda.time.DateTime dateTime50 = dateTime12.toDateTime(chronology47);
        org.joda.time.DateTime.Property property51 = dateTime12.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and mutableDateTime48", (mutableDateTime17.compareTo(mutableDateTime48) == 0) == mutableDateTime17.equals(mutableDateTime48));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 10, chronology5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod6.setPeriod(readableDuration7, chronology8);
        mutablePeriod6.setSeconds(0);
        int[] intArray13 = chronology2.get((org.joda.time.ReadablePeriod) mutablePeriod6, (long) (short) -1);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 5, chronology19);
        org.joda.time.Chronology chronology21 = chronology19.withUTC();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay((long) 2022, chronology21);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.now(chronology21);
        mutablePeriod6.add((long) (short) 10, chronology21);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology21);
        org.joda.time.DurationField durationField26 = chronology21.weeks();
        org.joda.time.DurationFieldType durationFieldType27 = durationField26.getType();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone28);
        mutableDateTime31.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime31.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.add((long) (-292275054));
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 10, chronology38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod39.setPeriod(readableDuration40, chronology41);
        mutablePeriod39.setSeconds(0);
        int int45 = mutablePeriod39.getMillis();
        int int46 = mutablePeriod39.getYears();
        mutableDateTime36.add((org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = org.joda.time.format.ISODateTimeFormat.hour();
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.lang.String str52 = locale50.getDisplayVariant(locale51);
        java.util.Set<java.lang.String> strSet53 = locale50.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter49.withLocale(locale50);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        int int57 = dateTimeZone55.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(dateTimeZone55);
        org.joda.time.ReadableDuration readableDuration59 = null;
        mutableDateTime58.add(readableDuration59, 0);
        org.joda.time.Period period63 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period65 = org.joda.time.Period.minutes(1);
        java.lang.String str66 = period65.toString();
        org.joda.time.Period period67 = period63.withFields((org.joda.time.ReadablePeriod) period65);
        org.joda.time.Period period69 = period67.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType70 = org.joda.time.DurationFieldType.months();
        int int71 = period69.get(durationFieldType70);
        mutableDateTime58.add(durationFieldType70, 7);
        mutableDateTime58.setMillis((long) 100);
        mutableDateTime58.setSecondOfMinute((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay84 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime86 = timeOfDay84.toDateTimeToday(dateTimeZone85);
        org.joda.time.DateTime dateTime88 = dateTime86.withCenturyOfEra(10);
        boolean boolean89 = dateTime88.isEqualNow();
        org.joda.time.Chronology chronology90 = dateTime88.getChronology();
        org.joda.time.TimeOfDay timeOfDay91 = new org.joda.time.TimeOfDay(15, 5, chronology90);
        org.joda.time.DurationField durationField92 = chronology90.weeks();
        mutableDateTime58.setChronology(chronology90);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter94 = dateTimeFormatter49.withChronology(chronology90);
        mutablePeriod39.setPeriod(1645514312043L, chronology90);
        org.joda.time.DateTimeField dateTimeField96 = chronology90.millisOfSecond();
        boolean boolean97 = durationFieldType27.isSupported(chronology90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField26 and durationField92", (durationField26.compareTo(durationField92) == 0) == durationField26.equals(durationField92));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        java.lang.String str16 = dateTimeZone13.getShortName((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime11.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime17.toMutableDateTime(chronology18);
        org.joda.time.DateTime.Property property20 = dateTime17.yearOfEra();
        org.joda.time.DateTime dateTime22 = property20.addToCopy((long) 116);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime17", (dateTime11.compareTo(dateTime17) == 0) == dateTime11.equals(dateTime17));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusSeconds(17);
        org.joda.time.Period period7 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period9 = org.joda.time.Period.minutes(1);
        java.lang.String str10 = period9.toString();
        org.joda.time.Period period11 = period7.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period11.plusMillis(100);
        org.joda.time.Period period15 = period11.minusMillis((int) (byte) 1);
        org.joda.time.DateTime dateTime17 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period15, 15);
        org.joda.time.DateTime dateTime19 = dateTime17.withDayOfMonth(17);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        int int23 = dateTimeZone21.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = timeOfDay29.toDateTimeToday(dateTimeZone30);
        mutableDateTime24.setZoneRetainFields(dateTimeZone30);
        mutableDateTime24.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        int int37 = dateTimeZone35.getStandardOffset((long) 100);
        mutableDateTime24.setZone(dateTimeZone35);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology43 = localTime42.getChronology();
        org.joda.time.Interval interval44 = new org.joda.time.Interval((-1L), (long) 17, chronology43);
        mutableDateTime24.setChronology(chronology43);
        java.lang.String str46 = chronology43.toString();
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = timeOfDay51.toDateTimeToday(dateTimeZone52);
        org.joda.time.Chronology chronology54 = chronology43.withZone(dateTimeZone52);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(chronology54);
        org.joda.time.Period period56 = new org.joda.time.Period((long) 53, chronology54);
        org.joda.time.DateTimeField dateTimeField57 = chronology54.clockhourOfDay();
        org.joda.time.DurationField durationField58 = chronology54.hours();
        org.joda.time.DateTime dateTime59 = dateTime17.withChronology(chronology54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime55", (dateTime3.compareTo(mutableDateTime55) == 0) == dateTime3.equals(mutableDateTime55));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = timeOfDay21.toDateTimeToday(dateTimeZone22);
        mutableDateTime16.setZoneRetainFields(dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime16, readableDuration25);
        boolean boolean27 = dateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.ReadableDuration readableDuration32 = null;
        mutableDateTime31.add(readableDuration32, 0);
        mutableDateTime16.setMillis((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime16.weekOfWeekyear();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology39 = localTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.centuryOfEra();
        mutableDateTime16.setChronology(chronology39);
        org.joda.time.DateTimeField dateTimeField42 = chronology39.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and mutableDateTime31", (mutableDateTime16.compareTo(mutableDateTime31) == 0) == mutableDateTime16.equals(mutableDateTime31));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        mutablePeriod0.addWeeks((int) (byte) 100);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = timeOfDay11.getFields();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTimeToday(dateTimeZone13);
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period22 = period16.normalizedStandard(periodType21);
        org.joda.time.Period period23 = new org.joda.time.Period(readableDuration6, (org.joda.time.ReadableInstant) dateTime14, periodType21);
        org.joda.time.PeriodType periodType24 = periodType21.withMillisRemoved();
        org.joda.time.Period period25 = interval5.toPeriod(periodType24);
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray31 = timeOfDay30.getFields();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = timeOfDay30.toDateTimeToday(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.withYearOfCentury(16);
        org.joda.time.DateTime dateTime37 = dateTime33.plusYears((-1));
        boolean boolean38 = interval5.contains((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        org.joda.time.DateTime.Property property42 = dateTime41.secondOfMinute();
        org.joda.time.Interval interval43 = new org.joda.time.Interval(readableDuration39, (org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Interval interval44 = interval5.overlap((org.joda.time.ReadableInterval) interval43);
        mutablePeriod0.setPeriod((org.joda.time.ReadableInterval) interval43);
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology50 = localTime49.getChronology();
        org.joda.time.Interval interval51 = new org.joda.time.Interval((-1L), (long) 17, chronology50);
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period53 = interval51.toPeriod(periodType52);
        org.joda.time.Period period54 = interval43.toPeriod(periodType52);
        org.joda.time.Interval interval57 = new org.joda.time.Interval((-11056028000L), 10L);
        org.joda.time.Interval interval58 = interval43.gap((org.joda.time.ReadableInterval) interval57);
        org.joda.time.Interval interval60 = interval43.withStartMillis((long) 14);
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology65 = localTime64.getChronology();
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((long) 5, chronology65);
        org.joda.time.TimeOfDay timeOfDay67 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 3172001, chronology65);
        org.joda.time.DurationField durationField68 = chronology65.halfdays();
        org.joda.time.DateTimeField dateTimeField69 = chronology65.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime70 = org.joda.time.MutableDateTime.now(chronology65);
        org.joda.time.DateTimeField dateTimeField71 = chronology65.monthOfYear();
        org.joda.time.Interval interval72 = interval60.withChronology(chronology65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and mutableDateTime70", (dateTime41.compareTo(mutableDateTime70) == 0) == dateTime41.equals(mutableDateTime70));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate6.plusWeeks((int) (short) 0);
        int int11 = localDate6.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = localDate6.toDateMidnight(dateTimeZone13);
        java.util.Date date22 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.fromDateFields(date22);
        int int24 = localDate23.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        int int27 = dateTimeZone25.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime28 = localDate23.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay(dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight16.withZoneRetainFields(dateTimeZone25);
        java.lang.String str31 = dateTimeZone25.getID();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone25);
        java.util.Locale.Category category34 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale35 = java.util.Locale.getDefault(category34);
        java.util.Locale locale37 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale37);
        java.util.Locale.setDefault(category34, locale37);
        java.util.Locale locale40 = java.util.Locale.KOREA;
        java.util.Locale.setDefault(category34, locale40);
        java.util.Locale locale42 = java.util.Locale.getDefault(category34);
        java.util.Set<java.lang.String> strSet43 = locale42.getUnicodeLocaleAttributes();
        java.lang.String str44 = dateTimeZone25.getName(252528995790505L, locale42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime32", (dateTime15.compareTo(dateTime32) == 0) == dateTime15.equals(dateTime32));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime10 = dateTime6.plusDays((int) (byte) -1);
        java.util.Date date11 = dateTime10.toDate();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, readableDuration12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime17.add(readableDuration18, 0);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        mutableDateTime17.set(dateTimeFieldType23, (int) ' ');
        boolean boolean27 = interval13.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray33 = timeOfDay32.getFields();
        org.joda.time.Period period35 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period37 = org.joda.time.Period.minutes(1);
        java.lang.String str38 = period37.toString();
        org.joda.time.Period period39 = period35.withFields((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period41 = period39.plusMillis(100);
        org.joda.time.Period period42 = period39.negated();
        org.joda.time.Period period44 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period46 = org.joda.time.Period.minutes(1);
        java.lang.String str47 = period46.toString();
        org.joda.time.Period period48 = period44.withFields((org.joda.time.ReadablePeriod) period46);
        org.joda.time.Period period50 = period48.plusMillis(100);
        boolean boolean51 = period42.equals((java.lang.Object) period50);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period53 = period42.withFields((org.joda.time.ReadablePeriod) mutablePeriod52);
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay32.plus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType56 = dateTimeFieldType55.getDurationType();
        int int57 = period42.get(durationFieldType56);
        mutableDateTime17.add(durationFieldType56, 256);
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime17.copy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = org.joda.time.format.ISODateTimeFormat.basicTimeNoMillis();
        java.lang.String str62 = mutableDateTime60.toString(dateTimeFormatter61);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime60.era();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime65 = mutableDateTime60.toDateTime(dateTimeZone64);
        mutableDateTime60.addWeeks(10745);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and dateTime65", (mutableDateTime17.compareTo(dateTime65) == 0) == mutableDateTime17.equals(dateTime65));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime9 = dateTime7.toDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone11);
        mutableDateTime14.setMillis((long) 1);
        java.lang.String str17 = dateTimeFormatter10.print((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter10.withPivotYear(26188858);
        java.lang.String str20 = dateTime7.toString(dateTimeFormatter10);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(chronology25);
        org.joda.time.Period period27 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology25);
        org.joda.time.DurationField durationField28 = chronology25.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = chronology25.halfdayOfDay();
        org.joda.time.DateTime dateTime30 = dateTime7.withChronology(chronology25);
        org.joda.time.DateTime dateTime32 = dateTime7.minus(1031998930499984L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime30", (dateTime7.compareTo(dateTime30) == 0) == dateTime7.equals(dateTime30));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean5 = dateTimeZone0.isStandardOffset((long) 10);
        long long9 = dateTimeZone0.convertLocalToUTC((long) 38, true, 1645514205352L);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray15 = timeOfDay14.getFields();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plus((long) '4');
        org.joda.time.DateTime dateTime21 = dateTime19.plusSeconds(3172001);
        boolean boolean22 = dateTimeZone0.equals((java.lang.Object) dateTime19);
        org.joda.time.Chronology chronology23 = dateTime19.getChronology();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(chronology28);
        org.joda.time.Period period30 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology28);
        org.joda.time.Period period32 = period30.minusHours(53);
        org.joda.time.Period period33 = period30.negated();
        int int34 = period30.getMonths();
        org.joda.time.Period period35 = period30.toPeriod();
        org.joda.time.Period period37 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period39 = org.joda.time.Period.minutes(1);
        java.lang.String str40 = period39.toString();
        org.joda.time.Period period41 = period37.withFields((org.joda.time.ReadablePeriod) period39);
        org.joda.time.Period period43 = period41.plusMillis(100);
        org.joda.time.Period period44 = period41.negated();
        org.joda.time.Period period46 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period48 = org.joda.time.Period.minutes(1);
        java.lang.String str49 = period48.toString();
        org.joda.time.Period period50 = period46.withFields((org.joda.time.ReadablePeriod) period48);
        org.joda.time.Period period52 = period50.plusMillis(100);
        boolean boolean53 = period44.equals((java.lang.Object) period52);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period55 = period44.withFields((org.joda.time.ReadablePeriod) mutablePeriod54);
        org.joda.time.Period period57 = period44.withWeeks((int) (byte) -1);
        org.joda.time.Period period58 = period35.minus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.Period period60 = period58.plusYears(10745);
        org.joda.time.Period period62 = period58.withMonths(26283);
        long long65 = chronology23.add((org.joda.time.ReadablePeriod) period62, (-347155200000L), 89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime29", (mutableDateTime3.compareTo(mutableDateTime29) == 0) == mutableDateTime3.equals(mutableDateTime29));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(10);
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(1);
        java.lang.String str13 = period12.toString();
        org.joda.time.Period period14 = period10.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period16 = period14.plusMillis(100);
        org.joda.time.Period period17 = period14.negated();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        boolean boolean20 = period14.isSupported(durationFieldType19);
        org.joda.time.Period period22 = period14.minusYears(0);
        org.joda.time.DateTime dateTime23 = dateTime8.minus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.DateTime.Property property24 = dateTime8.hourOfDay();
        org.joda.time.DateTime dateTime25 = property24.getDateTime();
        org.joda.time.DateTime dateTime27 = property24.setCopy(0);
        org.joda.time.DateTime dateTime28 = property24.withMinimumValue();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology33 = localTime32.getChronology();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((-1L), (long) 17, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology33);
        org.joda.time.DateTimeField dateTimeField36 = chronology33.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.yearOfCentury();
        org.joda.time.DateTime dateTime38 = dateTime28.withChronology(chronology33);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(0, (int) '4', chronology41);
        org.joda.time.TimeOfDay.Property property43 = timeOfDay42.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay44 = property43.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay44.minusMinutes(3172001);
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay46.plusSeconds(16);
        int int49 = timeOfDay46.size();
        org.joda.time.Period period51 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period53 = org.joda.time.Period.minutes(1);
        java.lang.String str54 = period53.toString();
        org.joda.time.Period period55 = period51.withFields((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Period period57 = period53.minusSeconds((int) (short) 100);
        org.joda.time.Period period59 = period53.minusHours((int) (byte) 1);
        org.joda.time.Hours hours60 = period53.toStandardHours();
        int int61 = period53.getWeeks();
        org.joda.time.Period period63 = period53.plusMinutes(86340000);
        org.joda.time.Period period65 = period63.withSeconds(26244041);
        org.joda.time.TimeOfDay timeOfDay67 = timeOfDay46.withPeriodAdded((org.joda.time.ReadablePeriod) period65, 0);
        int[] intArray69 = chronology33.get((org.joda.time.ReadablePartial) timeOfDay67, 41904001969L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime38", (dateTime8.compareTo(dateTime38) == 0) == dateTime8.equals(dateTime38));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.DateTimeZone dateTimeZone5 = instant4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant4", (dateTime3.compareTo(instant4) == 0) == dateTime3.equals(instant4));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.yearOfEra();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 5, chronology12);
        org.joda.time.Chronology chronology14 = chronology12.withUTC();
        mutableDateTime3.setChronology(chronology12);
        org.joda.time.DurationField durationField16 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.dayOfMonth();
        long long21 = chronology12.add((long) 1961, (long) 4, (-2));
        org.joda.time.DurationField durationField22 = chronology12.weekyears();
        org.joda.time.DurationField durationField23 = chronology12.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField22", (durationField16.compareTo(durationField22) == 0) == durationField16.equals(durationField22));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfCentury(16);
        org.joda.time.DateTime dateTime11 = dateTime7.plusYears((-1));
        org.joda.time.TimeOfDay timeOfDay12 = dateTime7.toTimeOfDay();
        org.joda.time.DateTime.Property property13 = dateTime7.minuteOfHour();
        org.joda.time.DateTime dateTime14 = property13.getDateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.plusMillis(3);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.millis();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.Period period24 = new org.joda.time.Period((long) 25, (long) (-1), periodType19, chronology22);
        org.joda.time.DateTimeField dateTimeField25 = chronology22.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime16.toMutableDateTime(chronology22);
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = timeOfDay31.toDateTimeToday(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.minus((long) (short) 0);
        org.joda.time.DateTime dateTime37 = dateTime35.minusMonths(36);
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology42 = localTime41.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(chronology42);
        org.joda.time.Period period44 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology42);
        org.joda.time.DurationField durationField45 = chronology42.halfdays();
        org.joda.time.DateTime dateTime46 = dateTime37.withChronology(chronology42);
        org.joda.time.DateTimeZone dateTimeZone47 = dateTime46.getZone();
        org.joda.time.DateTime dateTime48 = dateTime16.withZone(dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and dateTime46", (dateTime37.compareTo(dateTime46) == 0) == dateTime37.equals(dateTime46));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(chronology5);
        org.joda.time.Period period7 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology5);
        org.joda.time.Period period8 = new org.joda.time.Period((long) 3, chronology5);
        org.joda.time.DurationField durationField9 = chronology5.eras();
        org.joda.time.DurationField durationField10 = chronology5.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField10, and durationField9", !(durationField9.compareTo(durationField10) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField10.compareTo(durationField9))));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        int int2 = localTime1.getMillisOfDay();
        org.joda.time.LocalTime localTime4 = localTime1.withMillisOfSecond((int) ' ');
        org.joda.time.LocalTime localTime6 = localTime1.withSecondOfMinute(4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.DateTime dateTime8 = localTime1.toDateTime(readableInstant7);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = timeOfDay13.getFields();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTimeToday(dateTimeZone15);
        org.joda.time.DateTime.Property property17 = dateTime16.monthOfYear();
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime();
        org.joda.time.Period period20 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period22 = org.joda.time.Period.minutes(1);
        java.lang.String str23 = period22.toString();
        org.joda.time.Period period24 = period20.withFields((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period26 = period24.plusMillis(100);
        org.joda.time.Period period27 = period24.negated();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType29 = dateTimeFieldType28.getDurationType();
        boolean boolean30 = period24.isSupported(durationFieldType29);
        org.joda.time.Weeks weeks31 = period24.toStandardWeeks();
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology35 = localTime34.getChronology();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) 5, chronology35);
        org.joda.time.Period period37 = new org.joda.time.Period((java.lang.Object) period24, chronology35);
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime16.toMutableDateTime(chronology35);
        org.joda.time.DateTime dateTime39 = dateTime8.withChronology(chronology35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and mutableDateTime38", (dateTime16.compareTo(mutableDateTime38) == 0) == dateTime16.equals(mutableDateTime38));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.minusMillis((int) 'a');
        int int15 = dateTime14.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime14.withYear(55);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 5, chronology21);
        org.joda.time.Chronology chronology23 = chronology21.withUTC();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 10, chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod26.setPeriod(readableDuration27, chronology28);
        long long32 = chronology23.add((org.joda.time.ReadablePeriod) mutablePeriod26, (long) 32772, 6);
        org.joda.time.DateTimeField dateTimeField33 = chronology23.era();
        org.joda.time.DateTime dateTime34 = dateTime14.withChronology(chronology23);
        org.joda.time.DateTime dateTime35 = dateTime34.withLaterOffsetAtOverlap();
        int int36 = dateTime35.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime35", (dateTime14.compareTo(dateTime35) == 0) == dateTime14.equals(dateTime35));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.LocalTime localTime4 = localTime0.withPeriodAdded((org.joda.time.ReadablePeriod) period2, (int) ' ');
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = timeOfDay10.getFields();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = timeOfDay10.toDateTimeToday(dateTimeZone12);
        org.joda.time.DateTime.Property property14 = dateTime13.monthOfYear();
        org.joda.time.DateTime dateTime16 = dateTime13.minusMillis((int) (byte) -1);
        boolean boolean18 = dateTime13.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType19.getDurationType();
        boolean boolean21 = dateTime13.isSupported(dateTimeFieldType19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        org.joda.time.DateTime dateTime24 = dateTime23.toDateTime();
        boolean boolean25 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableDuration5, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = timeOfDay32.toDateTimeToday(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.minus((long) (short) 0);
        org.joda.time.Period period38 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period40 = org.joda.time.Period.minutes(1);
        java.lang.String str41 = period40.toString();
        org.joda.time.Period period42 = period38.withFields((org.joda.time.ReadablePeriod) period40);
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period44 = period38.normalizedStandard(periodType43);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(readableDuration27, (org.joda.time.ReadableInstant) dateTime36, periodType43);
        int int46 = mutablePeriod45.getMonths();
        org.joda.time.Period period47 = period26.minus((org.joda.time.ReadablePeriod) mutablePeriod45);
        org.joda.time.LocalTime localTime49 = localTime0.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod45, 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = org.joda.time.format.ISODateTimeFormat.dateParser();
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology56 = localTime55.getChronology();
        org.joda.time.MutableDateTime mutableDateTime57 = org.joda.time.MutableDateTime.now(chronology56);
        org.joda.time.Period period58 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology56);
        org.joda.time.DurationField durationField59 = chronology56.halfdays();
        org.joda.time.DateTimeField dateTimeField60 = chronology56.halfdayOfDay();
        org.joda.time.DurationField durationField61 = chronology56.months();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter51.withChronology(chronology56);
        mutablePeriod45.add((long) 51, chronology56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and mutableDateTime57", (dateTime23.compareTo(mutableDateTime57) == 0) == dateTime23.equals(mutableDateTime57));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withHourOfDay(3);
        int int5 = dateTime4.getSecondOfMinute();
        int int6 = dateTime4.getMinuteOfHour();
        org.joda.time.DateTime dateTime8 = dateTime4.minusMonths(10);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str11 = dateTimeZone10.getID();
        org.joda.time.DateMidnight dateMidnight12 = org.joda.time.DateMidnight.now(dateTimeZone10);
        long long14 = dateTimeZone10.previousTransition(26361538L);
        org.joda.time.DateTime dateTime15 = dateTime4.toDateTime(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(0L, dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime15", (dateTime4.compareTo(dateTime15) == 0) == dateTime4.equals(dateTime15));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        mutableDateTime4.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime4.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.add((long) (-292275054));
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (short) 100, (long) 12);
        org.joda.time.format.PeriodFormatter periodFormatter13 = null;
        java.lang.String str14 = mutablePeriod12.toString(periodFormatter13);
        org.joda.time.DurationFieldType[] durationFieldTypeArray15 = mutablePeriod12.getFieldTypes();
        mutablePeriod12.addMinutes(2);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.hours();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.secondOfDay();
        org.joda.time.DurationField durationField24 = chronology21.months();
        mutablePeriod12.setPeriod((long) 26163694, chronology21);
        org.joda.time.DateTime dateTime26 = mutableDateTime9.toDateTime(chronology21);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) 26405449, chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime26", (mutableDateTime4.compareTo(dateTime26) == 0) == mutableDateTime4.equals(dateTime26));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod1 = mutablePeriod0.copy();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology7);
        org.joda.time.Period period9 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology7);
        mutablePeriod0.setPeriod((long) 15, chronology7);
        int int11 = mutablePeriod0.getMinutes();
        mutablePeriod0.setWeeks(99);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance();
        int int16 = calendar14.getMaximum((int) (short) 0);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromCalendarFields(calendar14);
        calendar14.set(10, (int) (byte) 0, (int) '#', (int) (byte) -1, (int) ' ');
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.fromCalendarFields(calendar14);
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.plusMinutes((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = timeOfDay36.toDateTimeToday(dateTimeZone37);
        mutableDateTime31.setZoneRetainFields(dateTimeZone37);
        mutableDateTime31.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        int int44 = dateTimeZone42.getStandardOffset((long) 100);
        mutableDateTime31.setZone(dateTimeZone42);
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology50 = localTime49.getChronology();
        org.joda.time.Interval interval51 = new org.joda.time.Interval((-1L), (long) 17, chronology50);
        mutableDateTime31.setChronology(chronology50);
        java.lang.String str53 = chronology50.toString();
        org.joda.time.TimeOfDay timeOfDay58 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime60 = timeOfDay58.toDateTimeToday(dateTimeZone59);
        org.joda.time.Chronology chronology61 = chronology50.withZone(dateTimeZone59);
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(chronology61);
        org.joda.time.Period period63 = new org.joda.time.Period((long) 53, chronology61);
        org.joda.time.Period period65 = period63.multipliedBy(12160);
        org.joda.time.TimeOfDay timeOfDay67 = timeOfDay26.withPeriodAdded((org.joda.time.ReadablePeriod) period63, 81);
        mutablePeriod0.add((org.joda.time.ReadablePeriod) period63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime62", (mutableDateTime8.compareTo(mutableDateTime62) == 0) == mutableDateTime8.equals(mutableDateTime62));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes(7);
        java.util.Date date10 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.fromDateFields(date10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate11.plusWeeks((int) (short) 0);
        int int16 = localDate11.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str19 = dateTimeZone18.getID();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight21 = localDate11.toDateMidnight(dateTimeZone18);
        java.util.Date date27 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.fromDateFields(date27);
        int int29 = localDate28.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        int int32 = dateTimeZone30.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime33 = localDate28.toDateTimeAtCurrentTime(dateTimeZone30);
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay(dateTimeZone30);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight21.withZoneRetainFields(dateTimeZone30);
        java.lang.String str36 = dateTimeZone30.getID();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(98L, dateTimeZone30);
        java.lang.String str40 = dateTimeZone30.getShortName((long) 11);
        org.joda.time.DateTime dateTime41 = dateTime1.withZone(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime37", (dateTime20.compareTo(dateTime37) == 0) == dateTime20.equals(dateTime37));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        int int10 = localDate9.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period23.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.months();
        int int27 = period25.get(durationFieldType26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight15.withPeriodAdded((org.joda.time.ReadablePeriod) period25, 0);
        org.joda.time.DateMidnight.Property property30 = dateMidnight15.monthOfYear();
        org.joda.time.DateMidnight dateMidnight32 = property30.addToCopy(15);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.withYearOfCentury(55);
        int int35 = dateMidnight32.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight32.minus(readablePeriod36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.plusDays((-2));
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str42 = dateTimeZone41.getID();
        org.joda.time.DateMidnight dateMidnight43 = org.joda.time.DateMidnight.now(dateTimeZone41);
        int int45 = dateTimeZone41.getOffsetFromLocal(10L);
        java.lang.String str47 = dateTimeZone41.getShortName((long) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight37.toMutableDateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime49 = dateMidnight37.toMutableDateTime();
        java.lang.String str50 = mutableDateTime49.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight32 and mutableDateTime48", (dateMidnight32.compareTo(mutableDateTime48) == 0) == dateMidnight32.equals(mutableDateTime48));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum((int) (short) 0);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        calendar0.set(10, (int) (byte) 0, (int) '#', (int) (byte) -1, (int) ' ');
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromCalendarFields(calendar0);
        calendar0.set(1975, (-1), 18, 26217, 26277709, (int) 'u');
        int int18 = calendar0.getWeeksInWeekYear();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone19);
        mutableDateTime22.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime22.monthOfYear();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay((long) 1899);
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay29.withMillisOfSecond(2);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray38 = timeOfDay37.getFields();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = timeOfDay37.toDateTimeToday(dateTimeZone39);
        org.joda.time.Period period42 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period44 = org.joda.time.Period.minutes(1);
        java.lang.String str45 = period44.toString();
        org.joda.time.Period period46 = period42.withFields((org.joda.time.ReadablePeriod) period44);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period48 = period42.normalizedStandard(periodType47);
        org.joda.time.Period period49 = new org.joda.time.Period(readableDuration32, (org.joda.time.ReadableInstant) dateTime40, periodType47);
        boolean boolean51 = periodType47.equals((java.lang.Object) 100L);
        org.joda.time.Period period52 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime27, (org.joda.time.ReadablePartial) timeOfDay31, periodType47);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalTime localTime54 = localTime27.minus(readablePeriod53);
        org.joda.time.DateTime dateTime55 = localTime27.toDateTimeToday();
        long long56 = property25.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Instant instant57 = dateTime55.toInstant();
        boolean boolean58 = calendar0.after((java.lang.Object) dateTime55);
        calendar0.clear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime55 and instant57", (dateTime55.compareTo(instant57) == 0) == dateTime55.equals(instant57));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 10, chronology5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod6.setPeriod(readableDuration7, chronology8);
        mutablePeriod6.setSeconds(0);
        int[] intArray13 = chronology2.get((org.joda.time.ReadablePeriod) mutablePeriod6, (long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = timeOfDay18.getFields();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.monthOfYear();
        org.joda.time.DateTime dateTime24 = dateTime21.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = timeOfDay35.toDateTimeToday(dateTimeZone36);
        mutableDateTime30.setZoneRetainFields(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime30, readableDuration39);
        boolean boolean41 = dateTime26.isBefore((org.joda.time.ReadableInstant) mutableDateTime30);
        java.lang.Object obj42 = mutableDateTime30.clone();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime46.add(readableDuration47, 0);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime46.dayOfWeek();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundFloor();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.millisOfDay();
        int int54 = mutableDateTime52.getYearOfEra();
        mutablePeriod6.setPeriod((org.joda.time.ReadableInstant) mutableDateTime30, (org.joda.time.ReadableInstant) mutableDateTime52);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) 52, dateTimeZone58);
        mutableDateTime30.setZone(dateTimeZone58);
        java.lang.String str61 = dateTimeZone58.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime30", (mutableDateTime3.compareTo(mutableDateTime30) == 0) == mutableDateTime3.equals(mutableDateTime30));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(chronology5);
        org.joda.time.Period period7 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology5);
        org.joda.time.DurationField durationField8 = chronology5.halfdays();
        org.joda.time.DurationField durationField9 = chronology5.eras();
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(26160000L, chronology5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        mutableDateTime3.addDays(1899);
        boolean boolean9 = mutableDateTime3.isBeforeNow();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime3.yearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withDefaultYear(81);
        java.lang.String str14 = mutableDateTime3.toString(dateTimeFormatter11);
        org.joda.time.Instant instant15 = mutableDateTime3.toInstant();
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = timeOfDay20.getFields();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = timeOfDay20.toDateTimeToday(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withYearOfCentury(16);
        org.joda.time.DateTime dateTime27 = dateTime25.plus((long) 1);
        org.joda.time.DateTime dateTime28 = dateTime25.toDateTimeISO();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology33 = localTime32.getChronology();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((-1L), (long) 17, chronology33);
        org.joda.time.DurationField durationField35 = chronology33.halfdays();
        org.joda.time.DateTime dateTime36 = dateTime25.toDateTime(chronology33);
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableInstant) instant15, (org.joda.time.ReadableInstant) dateTime36);
        int int38 = dateTime36.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant15", (mutableDateTime3.compareTo(instant15) == 0) == mutableDateTime3.equals(instant15));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        int int10 = localDate9.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period23.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.months();
        int int27 = period25.get(durationFieldType26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight15.withPeriodAdded((org.joda.time.ReadablePeriod) period25, 0);
        org.joda.time.DateMidnight.Property property30 = dateMidnight15.monthOfYear();
        org.joda.time.DateMidnight dateMidnight32 = property30.addToCopy(15);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.withYearOfCentury(55);
        int int35 = dateMidnight32.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight32.minus(readablePeriod36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.plusDays((-2));
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str42 = dateTimeZone41.getID();
        org.joda.time.DateMidnight dateMidnight43 = org.joda.time.DateMidnight.now(dateTimeZone41);
        int int45 = dateTimeZone41.getOffsetFromLocal(10L);
        java.lang.String str47 = dateTimeZone41.getShortName((long) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight37.toMutableDateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime49 = dateMidnight37.toMutableDateTime();
        mutableDateTime49.addMonths(26257730);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight32 and mutableDateTime48", (dateMidnight32.compareTo(mutableDateTime48) == 0) == dateMidnight32.equals(mutableDateTime48));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((java.lang.Object) mutableDateTime3);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.plusMonths(7);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.withYear(69);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay9.withPeriodAdded(readablePeriod14, 32772);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.hours();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.year();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology21);
        org.joda.time.Period period26 = new org.joda.time.Period(561540000L, (long) 15, chronology21);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(chronology21);
        org.joda.time.Period period29 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period31 = org.joda.time.Period.minutes(1);
        java.lang.String str32 = period31.toString();
        org.joda.time.Period period33 = period29.withFields((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Period period35 = period33.plusMillis(100);
        org.joda.time.Period period37 = period35.minusWeeks(81);
        int[] intArray40 = chronology21.get((org.joda.time.ReadablePeriod) period37, (long) 26264290, (long) (-3172001));
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay45.minusSeconds(3);
        org.joda.time.Period period49 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period51 = org.joda.time.Period.minutes(1);
        java.lang.String str52 = period51.toString();
        org.joda.time.Period period53 = period49.withFields((org.joda.time.ReadablePeriod) period51);
        org.joda.time.Period period55 = period53.plusMillis(100);
        org.joda.time.Period period56 = period53.negated();
        int int57 = period53.getDays();
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay47.minus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.TimeOfDay timeOfDay60 = timeOfDay47.plusSeconds(0);
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology65 = localTime64.getChronology();
        org.joda.time.DurationField durationField66 = chronology65.hours();
        org.joda.time.DateTimeField dateTimeField67 = chronology65.year();
        org.joda.time.DateTimeField dateTimeField68 = chronology65.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime69 = org.joda.time.MutableDateTime.now(chronology65);
        org.joda.time.Period period70 = new org.joda.time.Period(561540000L, (long) 15, chronology65);
        org.joda.time.LocalTime localTime71 = new org.joda.time.LocalTime(chronology65);
        org.joda.time.Period period73 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period75 = org.joda.time.Period.minutes(1);
        java.lang.String str76 = period75.toString();
        org.joda.time.Period period77 = period73.withFields((org.joda.time.ReadablePeriod) period75);
        org.joda.time.Period period79 = period77.plusMillis(100);
        org.joda.time.Period period81 = period79.minusWeeks(81);
        int[] intArray84 = chronology65.get((org.joda.time.ReadablePeriod) period81, (long) 26264290, (long) (-3172001));
        chronology21.validate((org.joda.time.ReadablePartial) timeOfDay60, intArray84);
        org.joda.time.DateTime dateTime86 = yearMonthDay9.toDateTime(timeOfDay60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime25", (mutableDateTime3.compareTo(mutableDateTime25) == 0) == mutableDateTime3.equals(mutableDateTime25));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        boolean boolean12 = dateTime7.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getDurationType();
        boolean boolean15 = dateTime7.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime dateTime18 = dateTime17.toDateTime();
        boolean boolean19 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime22 = dateTime7.minus((long) (byte) 0);
        org.joda.time.DateTime dateTime24 = dateTime7.plusMinutes(38);
        org.joda.time.Instant instant25 = dateTime24.toInstant();
        org.joda.time.TimeOfDay timeOfDay26 = dateTime24.toTimeOfDay();
        org.joda.time.DateTime dateTime27 = timeOfDay26.toDateTimeToday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant25", (dateTime24.compareTo(instant25) == 0) == dateTime24.equals(instant25));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        java.lang.Object obj0 = null;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period8 = period2.normalizedStandard(periodType7);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(periodType7);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(obj0, periodType7);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period14 = org.joda.time.Period.minutes(1);
        java.lang.String str15 = period14.toString();
        org.joda.time.Period period16 = period12.withFields((org.joda.time.ReadablePeriod) period14);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period18 = period12.normalizedStandard(periodType17);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((-1L), (long) 17, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.secondOfDay();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.yearOfCentury();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology23);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(obj0, periodType17, chronology23);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str32 = dateTimeZone31.getID();
        java.lang.String str34 = dateTimeZone31.getShortName((long) (short) 100);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 1, dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(dateTimeZone31);
        org.joda.time.Chronology chronology37 = chronology23.withZone(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and mutableDateTime36", (dateTime27.compareTo(mutableDateTime36) == 0) == dateTime27.equals(mutableDateTime36));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        mutableDateTime4.setMillis((long) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime4.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.add((long) (-292275054));
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (short) 100, (long) 12);
        org.joda.time.format.PeriodFormatter periodFormatter13 = null;
        java.lang.String str14 = mutablePeriod12.toString(periodFormatter13);
        org.joda.time.DurationFieldType[] durationFieldTypeArray15 = mutablePeriod12.getFieldTypes();
        mutablePeriod12.addMinutes(2);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.hours();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.secondOfDay();
        org.joda.time.DurationField durationField24 = chronology21.months();
        mutablePeriod12.setPeriod((long) 26163694, chronology21);
        org.joda.time.DateTime dateTime26 = mutableDateTime9.toDateTime(chronology21);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) (byte) 10, chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime26", (mutableDateTime4.compareTo(dateTime26) == 0) == mutableDateTime4.equals(dateTime26));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = timeOfDay7.getFields();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTimeToday(dateTimeZone9);
        org.joda.time.DateTime.Property property11 = dateTime10.monthOfYear();
        org.joda.time.DateTime dateTime13 = dateTime10.minusMillis((int) (byte) -1);
        boolean boolean15 = dateTime10.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getDurationType();
        boolean boolean18 = dateTime10.isSupported(dateTimeFieldType16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        org.joda.time.DateTime dateTime21 = dateTime20.toDateTime();
        boolean boolean22 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime21);
        int int23 = dateTime10.getYearOfEra();
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period26 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(1);
        java.lang.String str29 = period28.toString();
        org.joda.time.Period period30 = period26.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period32 = period30.plusMillis(100);
        org.joda.time.LocalTime localTime33 = localTime24.minus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period35 = period30.plusHours((int) 'a');
        org.joda.time.DateTime dateTime37 = dateTime10.withPeriodAdded((org.joda.time.ReadablePeriod) period35, 5);
        org.joda.time.Period period39 = period35.plusDays(0);
        org.joda.time.PeriodType periodType40 = period35.getPeriodType();
        org.joda.time.PeriodType periodType41 = periodType40.withSecondsRemoved();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) -1, periodType41, chronology42);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType46 = dateTimeFieldType45.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray47 = new org.joda.time.DurationFieldType[] { durationFieldType46 };
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.forFields(durationFieldTypeArray47);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        int int51 = dateTimeZone49.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone49);
        org.joda.time.ReadableDuration readableDuration53 = null;
        mutableDateTime52.add(readableDuration53, 0);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime52.dayOfWeek();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime52.yearOfEra();
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology61 = localTime60.getChronology();
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((long) 5, chronology61);
        org.joda.time.Chronology chronology63 = chronology61.withUTC();
        mutableDateTime52.setChronology(chronology61);
        org.joda.time.DurationField durationField65 = chronology61.years();
        org.joda.time.DateTimeField dateTimeField66 = chronology61.dayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 'a', periodType48, chronology61);
        java.lang.String str68 = chronology61.toString();
        org.joda.time.Period period69 = new org.joda.time.Period(446195897579L, (-11L), periodType41, chronology61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and mutableDateTime52", (dateTime20.compareTo(mutableDateTime52) == 0) == dateTime20.equals(mutableDateTime52));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.LocalDate localDate9 = property7.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate11 = property7.setCopy(1);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.DateMidnight dateMidnight15 = localDate11.toDateMidnight(dateTimeZone13);
        boolean boolean16 = dateMidnight15.isEqualNow();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.String str18 = dateTimeFieldType17.toString();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight15.withField(dateTimeFieldType17, 54);
        org.joda.time.Period period22 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period24 = org.joda.time.Period.minutes(1);
        java.lang.String str25 = period24.toString();
        org.joda.time.Period period26 = period22.withFields((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Period period28 = period24.minusSeconds((int) (short) 100);
        org.joda.time.Period period30 = period24.minusHours((int) (byte) 1);
        org.joda.time.Hours hours31 = period24.toStandardHours();
        int int32 = period24.getWeeks();
        org.joda.time.Period period34 = period24.plusMinutes(86340000);
        org.joda.time.Period period36 = period24.minusMinutes(9);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight15.plus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod();
        mutablePeriod38.addWeeks((int) (byte) 100);
        java.util.Date date46 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate47 = org.joda.time.LocalDate.fromDateFields(date46);
        int int48 = localDate47.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        int int51 = dateTimeZone49.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime52 = localDate47.toDateTimeAtCurrentTime(dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str55 = dateTimeZone54.getID();
        java.lang.String str57 = dateTimeZone54.getShortName((long) (short) 100);
        org.joda.time.DateTime dateTime58 = dateTime52.withZone(dateTimeZone54);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime58.toMutableDateTime(chronology59);
        org.joda.time.DateTime dateTime62 = dateTime58.plusMonths((-60));
        org.joda.time.DateTime dateTime64 = dateTime58.plusWeeks(1970);
        org.joda.time.Duration duration65 = mutablePeriod38.toDurationFrom((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight37.withDurationAdded((org.joda.time.ReadableDuration) duration65, (int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime52 and dateTime58", (dateTime52.compareTo(dateTime58) == 0) == dateTime52.equals(dateTime58));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 5, chronology4);
        org.joda.time.Chronology chronology6 = chronology4.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight((-259200000L), chronology6);
        org.joda.time.DurationField durationField9 = chronology6.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.minuteOfHour();
        org.joda.time.DurationField durationField11 = chronology6.seconds();
        long long14 = durationField11.add((long) 38, 38);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.millis();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology24);
        org.joda.time.Period period26 = new org.joda.time.Period((long) 25, (long) (-1), periodType21, chronology24);
        org.joda.time.PeriodType periodType27 = periodType21.withWeeksRemoved();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((-1L), (long) 17, chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.secondOfDay();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.yearOfCentury();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology32);
        org.joda.time.Period period37 = new org.joda.time.Period(345600000L, (long) '#', periodType21, chronology32);
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology42 = localTime41.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(chronology42);
        org.joda.time.Period period44 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology42);
        org.joda.time.DurationField durationField45 = chronology42.halfdays();
        org.joda.time.DateTimeField dateTimeField46 = chronology42.halfdayOfDay();
        org.joda.time.Period period47 = new org.joda.time.Period(0L, (long) 55, periodType21, chronology42);
        org.joda.time.DurationField durationField48 = chronology42.eras();
        int int49 = durationField11.compareTo(durationField48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField48, durationField9, and durationField45", !(durationField48.compareTo(durationField9) == 0) || (Math.signum(durationField48.compareTo(durationField45)) == Math.signum(durationField9.compareTo(durationField45))));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        java.lang.String str16 = dateTimeZone13.getShortName((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime11.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime17.toMutableDateTime(chronology18);
        org.joda.time.DateTime dateTime20 = dateTime17.withLaterOffsetAtOverlap();
        java.lang.String str21 = dateTime17.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime17", (dateTime11.compareTo(dateTime17) == 0) == dateTime11.equals(dateTime17));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.LocalDate localDate10 = property7.addToCopy(100);
        org.joda.time.LocalDate localDate12 = property7.addToCopy(0);
        org.joda.time.LocalDate localDate14 = property7.addToCopy(23);
        org.joda.time.LocalDate localDate15 = property7.getLocalDate();
        java.util.Date date22 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.fromDateFields(date22);
        int int24 = localDate23.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        int int27 = dateTimeZone25.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime28 = localDate23.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay(dateTimeZone25);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTime dateTime32 = dateTime31.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str35 = dateTimeZone34.getID();
        java.util.Locale locale37 = java.util.Locale.KOREAN;
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str40 = locale37.getDisplayVariant(locale39);
        java.lang.String str41 = dateTimeZone34.getName((long) 5, locale37);
        org.joda.time.DateTime dateTime42 = dateTime32.withZoneRetainFields(dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight43 = yearMonthDay29.toDateMidnight(dateTimeZone34);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) (short) 100, dateTimeZone34);
        java.util.TimeZone timeZone45 = dateTimeZone34.toTimeZone();
        org.joda.time.Interval interval46 = localDate15.toInterval(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str49 = dateTimeZone48.getID();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(dateTimeZone48);
        org.joda.time.DateTime dateTime52 = dateTime50.plusSeconds(17);
        org.joda.time.Period period54 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period56 = org.joda.time.Period.minutes(1);
        java.lang.String str57 = period56.toString();
        org.joda.time.Period period58 = period54.withFields((org.joda.time.ReadablePeriod) period56);
        org.joda.time.Period period60 = period58.plusMillis(100);
        org.joda.time.Period period62 = period58.minusMillis((int) (byte) 1);
        org.joda.time.DateTime dateTime64 = dateTime52.withPeriodAdded((org.joda.time.ReadablePeriod) period62, 15);
        org.joda.time.DateTime dateTime66 = dateTime64.withDayOfMonth(17);
        org.joda.time.DateTime.Property property67 = dateTime64.yearOfCentury();
        org.joda.time.DateTime dateTime69 = dateTime64.withYear(2025);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone73 = dateTimeZone72.toTimeZone();
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate((long) (-1), dateTimeZone72);
        org.joda.time.DateTime dateTime75 = dateTime69.toDateTime(dateTimeZone72);
        org.joda.time.Period period77 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period79 = org.joda.time.Period.minutes(1);
        java.lang.String str80 = period79.toString();
        org.joda.time.Period period81 = period77.withFields((org.joda.time.ReadablePeriod) period79);
        org.joda.time.Period period83 = period81.plusMillis(100);
        org.joda.time.Period period84 = period81.negated();
        int int85 = period81.getDays();
        int int86 = period81.size();
        org.joda.time.DurationFieldType durationFieldType87 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Period period89 = period81.withField(durationFieldType87, (int) (short) 100);
        org.joda.time.DateTime dateTime90 = dateTime69.plus((org.joda.time.ReadablePeriod) period89);
        org.joda.time.Period period92 = period89.withMillis(0);
        org.joda.time.LocalDate localDate93 = localDate15.plus((org.joda.time.ReadablePeriod) period89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime50", (dateTime31.compareTo(dateTime50) == 0) == dateTime31.equals(dateTime50));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        java.lang.String str16 = dateTimeZone13.getShortName((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime11.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime17.toMutableDateTime(chronology18);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMonths((-60));
        int int22 = dateTime21.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime17", (dateTime11.compareTo(dateTime17) == 0) == dateTime11.equals(dateTime17));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        mutableDateTime3.addDays(1899);
        boolean boolean9 = mutableDateTime3.isBeforeNow();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime3.yearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withDefaultYear(81);
        java.lang.String str14 = mutableDateTime3.toString(dateTimeFormatter11);
        org.joda.time.Instant instant15 = mutableDateTime3.toInstant();
        mutableDateTime3.add((-3974400001L));
        java.util.Date date26 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.fromDateFields(date26);
        int int28 = localDate27.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        int int31 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime32 = localDate27.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.withYearOfEra(16);
        org.joda.time.DateMidnight.Property property36 = dateMidnight35.year();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight35.plus(readablePeriod37);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod();
        mutablePeriod39.addWeeks((int) (byte) 100);
        java.util.Date date47 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate48 = org.joda.time.LocalDate.fromDateFields(date47);
        int int49 = localDate48.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        int int52 = dateTimeZone50.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime53 = localDate48.toDateTimeAtCurrentTime(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str56 = dateTimeZone55.getID();
        java.lang.String str58 = dateTimeZone55.getShortName((long) (short) 100);
        org.joda.time.DateTime dateTime59 = dateTime53.withZone(dateTimeZone55);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = dateTime59.toMutableDateTime(chronology60);
        org.joda.time.DateTime dateTime63 = dateTime59.plusMonths((-60));
        org.joda.time.DateTime dateTime65 = dateTime59.plusWeeks(1970);
        org.joda.time.Duration duration66 = mutablePeriod39.toDurationFrom((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight35.withDurationAdded((org.joda.time.ReadableDuration) duration66, (int) 'x');
        mutableDateTime3.add((org.joda.time.ReadableDuration) duration66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime59", (dateTime32.compareTo(dateTime59) == 0) == dateTime32.equals(dateTime59));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = timeOfDay21.toDateTimeToday(dateTimeZone22);
        mutableDateTime16.setZoneRetainFields(dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime16, readableDuration25);
        boolean boolean27 = dateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.ReadableDuration readableDuration32 = null;
        mutableDateTime31.add(readableDuration32, 0);
        mutableDateTime16.setMillis((org.joda.time.ReadableInstant) mutableDateTime31);
        int int36 = mutableDateTime31.getRoundingMode();
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.millis();
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology46 = localTime45.getChronology();
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(chronology46);
        org.joda.time.Period period48 = new org.joda.time.Period((long) 25, (long) (-1), periodType43, chronology46);
        org.joda.time.PeriodType periodType49 = periodType43.withWeeksRemoved();
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology54 = localTime53.getChronology();
        org.joda.time.Interval interval55 = new org.joda.time.Interval((-1L), (long) 17, chronology54);
        org.joda.time.DateTimeField dateTimeField56 = chronology54.secondOfDay();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.yearOfCentury();
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(chronology54);
        org.joda.time.Period period59 = new org.joda.time.Period(345600000L, (long) '#', periodType43, chronology54);
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology64 = localTime63.getChronology();
        org.joda.time.MutableDateTime mutableDateTime65 = org.joda.time.MutableDateTime.now(chronology64);
        org.joda.time.Period period66 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology64);
        org.joda.time.DurationField durationField67 = chronology64.halfdays();
        org.joda.time.DateTimeField dateTimeField68 = chronology64.halfdayOfDay();
        org.joda.time.Period period69 = new org.joda.time.Period(0L, (long) 55, periodType43, chronology64);
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod(periodType43);
        mutableDateTime31.add((org.joda.time.ReadablePeriod) mutablePeriod70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and mutableDateTime47", (mutableDateTime16.compareTo(mutableDateTime47) == 0) == mutableDateTime16.equals(mutableDateTime47));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.ReadableInstant readableInstant0 = null;
        java.util.Date date9 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.fromDateFields(date9);
        int int11 = localDate10.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime15 = localDate10.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.withYearOfEra(16);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.year();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight18.plus(readablePeriod20);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod();
        mutablePeriod22.addWeeks((int) (byte) 100);
        java.util.Date date30 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.fromDateFields(date30);
        int int32 = localDate31.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        int int35 = dateTimeZone33.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime36 = localDate31.toDateTimeAtCurrentTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str39 = dateTimeZone38.getID();
        java.lang.String str41 = dateTimeZone38.getShortName((long) (short) 100);
        org.joda.time.DateTime dateTime42 = dateTime36.withZone(dateTimeZone38);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime42.toMutableDateTime(chronology43);
        org.joda.time.DateTime dateTime46 = dateTime42.plusMonths((-60));
        org.joda.time.DateTime dateTime48 = dateTime42.plusWeeks(1970);
        org.joda.time.Duration duration49 = mutablePeriod22.toDurationFrom((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight18.withDurationAdded((org.joda.time.ReadableDuration) duration49, (int) 'x');
        org.joda.time.Period period52 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableDuration) duration49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime42", (dateTime15.compareTo(dateTime42) == 0) == dateTime15.equals(dateTime42));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        java.lang.String str16 = dateTimeZone13.getShortName((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime11.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime17.toMutableDateTime(chronology18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime17", (dateTime11.compareTo(dateTime17) == 0) == dateTime11.equals(dateTime17));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = timeOfDay5.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minus((long) (short) 0);
        org.joda.time.Period period11 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period13 = org.joda.time.Period.minutes(1);
        java.lang.String str14 = period13.toString();
        org.joda.time.Period period15 = period11.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period17 = period11.normalizedStandard(periodType16);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableDuration0, (org.joda.time.ReadableInstant) dateTime9, periodType16);
        org.joda.time.DateTime dateTime20 = dateTime9.minusHours(0);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(chronology21);
        org.joda.time.DateTime dateTime23 = dateTime9.withFields((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray29 = timeOfDay28.getFields();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = timeOfDay28.toDateTimeToday(dateTimeZone30);
        org.joda.time.DateTime.Property property32 = dateTime31.monthOfYear();
        org.joda.time.DateTime dateTime34 = dateTime31.minusMillis((int) (byte) -1);
        boolean boolean36 = dateTime31.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getDurationType();
        boolean boolean39 = dateTime31.isSupported(dateTimeFieldType37);
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray45 = timeOfDay44.getFields();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = timeOfDay44.toDateTimeToday(dateTimeZone46);
        org.joda.time.DateTime.Property property48 = dateTime47.monthOfYear();
        org.joda.time.DateTime dateTime50 = dateTime47.minusMillis((int) (byte) -1);
        boolean boolean52 = dateTime47.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType54 = dateTimeFieldType53.getDurationType();
        boolean boolean55 = dateTime47.isSupported(dateTimeFieldType53);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(chronology56);
        org.joda.time.DateTime dateTime58 = dateTime57.toDateTime();
        boolean boolean59 = dateTime47.isAfter((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime60 = dateTime47.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime62 = dateTime47.minus((long) (byte) 0);
        org.joda.time.DateTime dateTime64 = dateTime47.plusMinutes(38);
        org.joda.time.Instant instant65 = dateTime64.toInstant();
        boolean boolean66 = dateTime31.isAfter((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTime.Property property67 = dateTime64.weekyear();
        org.joda.time.DateTime dateTime69 = dateTime64.plusMillis(26405449);
        boolean boolean70 = localTime22.equals((java.lang.Object) dateTime69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime64 and instant65", (dateTime64.compareTo(instant65) == 0) == dateTime64.equals(instant65));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str3 = dateTimeZone2.getID();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime6 = dateTime4.plusSeconds(17);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        java.lang.String str11 = period10.toString();
        org.joda.time.Period period12 = period8.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period12.plusMillis(100);
        org.joda.time.Period period16 = period12.minusMillis((int) (byte) 1);
        org.joda.time.DateTime dateTime18 = dateTime6.withPeriodAdded((org.joda.time.ReadablePeriod) period16, 15);
        org.joda.time.DateTime dateTime20 = dateTime18.withDayOfMonth(17);
        org.joda.time.DateTime.Property property21 = dateTime18.yearOfCentury();
        org.joda.time.DateTime dateTime23 = dateTime18.withYear(2025);
        org.joda.time.LocalDate localDate24 = dateTime23.toLocalDate();
        java.util.Date date32 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate33 = org.joda.time.LocalDate.fromDateFields(date32);
        int int34 = localDate33.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        int int37 = dateTimeZone35.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime38 = localDate33.toDateTimeAtCurrentTime(dateTimeZone35);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay(dateTimeZone35);
        org.joda.time.YearMonthDay yearMonthDay41 = yearMonthDay39.withYear(1899);
        org.joda.time.Interval interval42 = yearMonthDay39.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray43 = yearMonthDay39.getFieldTypes();
        org.joda.time.YearMonthDay.Property property44 = yearMonthDay39.year();
        org.joda.time.YearMonthDay yearMonthDay45 = property44.withMaximumValue();
        java.util.Date date51 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate52 = org.joda.time.LocalDate.fromDateFields(date51);
        int int53 = localDate52.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        int int56 = dateTimeZone54.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime57 = localDate52.toDateTimeAtCurrentTime(dateTimeZone54);
        org.joda.time.YearMonthDay yearMonthDay58 = new org.joda.time.YearMonthDay(dateTimeZone54);
        org.joda.time.Interval interval59 = yearMonthDay45.toInterval(dateTimeZone54);
        org.joda.time.Interval interval60 = new org.joda.time.Interval(1645514181308L, 52254719996827999L, dateTimeZone54);
        org.joda.time.DateTime dateTime61 = dateTime23.withZoneRetainFields(dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime62 = org.joda.time.MutableDateTime.now(dateTimeZone54);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((-26219842006L), dateTimeZone54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime62", (dateTime4.compareTo(mutableDateTime62) == 0) == dateTime4.equals(mutableDateTime62));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        boolean boolean12 = dateTime7.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getDurationType();
        boolean boolean15 = dateTime7.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime dateTime18 = dateTime17.toDateTime();
        boolean boolean19 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime22 = dateTime7.minus((long) (byte) 0);
        org.joda.time.DateTime dateTime24 = dateTime7.plusMinutes(38);
        int int25 = dateTime7.getMillisOfSecond();
        org.joda.time.DateTime dateTime27 = dateTime7.withCenturyOfEra(56035);
        org.joda.time.DateTime dateTime29 = dateTime27.minusSeconds(437);
        org.joda.time.Instant instant30 = dateTime27.toInstant();
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology36 = localTime35.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology36);
        org.joda.time.Period period38 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology36);
        org.joda.time.Period period39 = new org.joda.time.Period((long) 3, chronology36);
        org.joda.time.DateTimeField dateTimeField40 = chronology36.minuteOfDay();
        org.joda.time.DateTime dateTime41 = instant30.toDateTime(chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and mutableDateTime37", (dateTime17.compareTo(mutableDateTime37) == 0) == dateTime17.equals(mutableDateTime37));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = timeOfDay13.toDateTimeToday(dateTimeZone14);
        mutableDateTime8.setZoneRetainFields(dateTimeZone14);
        mutableDateTime8.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        mutableDateTime8.setZone(dateTimeZone19);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((-1L), (long) 17, chronology27);
        mutableDateTime8.setChronology(chronology27);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology27);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.minuteOfDay();
        boolean boolean32 = instant4.isBefore((org.joda.time.ReadableInstant) mutableDateTime30);
        java.lang.String str33 = mutableDateTime30.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant4", (dateTime3.compareTo(instant4) == 0) == dateTime3.equals(instant4));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = timeOfDay13.toDateTimeToday(dateTimeZone14);
        mutableDateTime8.setZoneRetainFields(dateTimeZone14);
        mutableDateTime8.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        mutableDateTime8.setZone(dateTimeZone19);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((-1L), (long) 17, chronology27);
        mutableDateTime8.setChronology(chronology27);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology27);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.minuteOfDay();
        boolean boolean32 = instant4.isBefore((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.millis();
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Period period37 = org.joda.time.Period.minutes(1);
        java.lang.String str38 = period37.toString();
        org.joda.time.LocalTime localTime39 = localTime35.plus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 10, chronology41);
        org.joda.time.Chronology chronology44 = null;
        mutablePeriod42.setPeriod((long) 0, chronology44);
        org.joda.time.LocalTime localTime47 = localTime39.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod42, 55);
        org.joda.time.Period period49 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period51 = org.joda.time.Period.minutes(1);
        java.lang.String str52 = period51.toString();
        org.joda.time.Period period53 = period49.withFields((org.joda.time.ReadablePeriod) period51);
        int int54 = period49.getMinutes();
        int int55 = period49.size();
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.TimeOfDay timeOfDay61 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray62 = timeOfDay61.getFields();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateTime dateTime64 = timeOfDay61.toDateTimeToday(dateTimeZone63);
        org.joda.time.Period period66 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period68 = org.joda.time.Period.minutes(1);
        java.lang.String str69 = period68.toString();
        org.joda.time.Period period70 = period66.withFields((org.joda.time.ReadablePeriod) period68);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period72 = period66.normalizedStandard(periodType71);
        org.joda.time.Period period73 = new org.joda.time.Period(readableDuration56, (org.joda.time.ReadableInstant) dateTime64, periodType71);
        org.joda.time.PeriodType periodType74 = periodType71.withMillisRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType76 = dateTimeFieldType75.getDurationType();
        boolean boolean77 = periodType74.isSupported(durationFieldType76);
        int int78 = period49.get(durationFieldType76);
        org.joda.time.LocalTime localTime80 = localTime47.withFieldAdded(durationFieldType76, 2000);
        boolean boolean81 = periodType33.isSupported(durationFieldType76);
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType83 = dateTimeFieldType82.getDurationType();
        java.lang.String str84 = durationFieldType83.getName();
        int int85 = periodType33.indexOf(durationFieldType83);
        mutableDateTime30.add(durationFieldType83, 6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant4", (dateTime3.compareTo(instant4) == 0) == dateTime3.equals(instant4));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.hours();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DurationField durationField6 = chronology2.weekyears();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 10);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = timeOfDay13.getFields();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTimeToday(dateTimeZone15);
        org.joda.time.DateTime.Property property17 = dateTime16.monthOfYear();
        org.joda.time.DateTime dateTime19 = dateTime16.minusMillis((int) (byte) -1);
        boolean boolean21 = dateTime16.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getDurationType();
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType22);
        boolean boolean25 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone26);
        int int30 = dateTime16.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Chronology chronology31 = dateTime16.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.days();
        int int33 = durationField6.compareTo(durationField32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime29", (mutableDateTime4.compareTo(dateTime29) == 0) == mutableDateTime4.equals(dateTime29));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.hours();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.era();
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(18, 13, chronology4);
        org.joda.time.DateTimeField dateTimeField9 = chronology4.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = chronology4.weekyearOfCentury();
        boolean boolean11 = dateTimeField10.isSupported();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(1);
        java.lang.String str16 = period15.toString();
        org.joda.time.LocalTime localTime17 = localTime13.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.LocalTime.Property property18 = localTime13.minuteOfHour();
        org.joda.time.LocalTime localTime19 = property18.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.roundCeilingCopy();
        org.joda.time.LocalTime localTime23 = property20.addCopy(0);
        org.joda.time.LocalTime localTime24 = property20.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = timeOfDay34.toDateTimeToday(dateTimeZone35);
        mutableDateTime29.setZoneRetainFields(dateTimeZone35);
        mutableDateTime29.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        int int42 = dateTimeZone40.getStandardOffset((long) 100);
        mutableDateTime29.setZone(dateTimeZone40);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology48 = localTime47.getChronology();
        org.joda.time.Interval interval49 = new org.joda.time.Interval((-1L), (long) 17, chronology48);
        mutableDateTime29.setChronology(chronology48);
        java.lang.String str51 = chronology48.toString();
        org.joda.time.TimeOfDay timeOfDay56 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime58 = timeOfDay56.toDateTimeToday(dateTimeZone57);
        org.joda.time.Chronology chronology59 = chronology48.withZone(dateTimeZone57);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(chronology59);
        org.joda.time.Period period61 = new org.joda.time.Period((long) 53, chronology59);
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology65 = localTime64.getChronology();
        org.joda.time.DurationField durationField66 = chronology65.hours();
        org.joda.time.TimeOfDay timeOfDay67 = new org.joda.time.TimeOfDay((long) 38, chronology65);
        org.joda.time.DurationField durationField68 = chronology65.days();
        org.joda.time.DurationFieldType durationFieldType69 = durationField68.getType();
        int int70 = period61.get(durationFieldType69);
        org.joda.time.LocalTime localTime71 = localTime24.plus((org.joda.time.ReadablePeriod) period61);
        org.joda.time.LocalTime localTime73 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology74 = localTime73.getChronology();
        org.joda.time.DurationField durationField75 = chronology74.hours();
        org.joda.time.DateTimeField dateTimeField76 = chronology74.year();
        org.joda.time.DateTimeField dateTimeField77 = chronology74.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime78 = org.joda.time.MutableDateTime.now(chronology74);
        org.joda.time.Period period80 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period82 = org.joda.time.Period.minutes(1);
        java.lang.String str83 = period82.toString();
        org.joda.time.Period period84 = period80.withFields((org.joda.time.ReadablePeriod) period82);
        int int85 = period80.getMinutes();
        org.joda.time.Period period86 = period80.toPeriod();
        org.joda.time.Period period87 = period86.negated();
        org.joda.time.Period period89 = period87.plusMillis(3172000);
        java.lang.String str90 = period89.toString();
        org.joda.time.Period period92 = period89.minusWeeks(5);
        org.joda.time.format.PeriodFormatter periodFormatter93 = null;
        java.lang.String str94 = period92.toString(periodFormatter93);
        int[] intArray97 = chronology74.get((org.joda.time.ReadablePeriod) period92, (long) 58, 2021L);
        int int98 = dateTimeField10.getMinimumValue((org.joda.time.ReadablePartial) localTime24, intArray97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime60 and mutableDateTime78", (mutableDateTime60.compareTo(mutableDateTime78) == 0) == mutableDateTime60.equals(mutableDateTime78));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 10);
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = timeOfDay6.getFields();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = timeOfDay6.toDateTimeToday(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.monthOfYear();
        org.joda.time.DateTime dateTime12 = dateTime9.minusMillis((int) (byte) -1);
        boolean boolean14 = dateTime9.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        boolean boolean17 = dateTime9.isSupported(dateTimeFieldType15);
        boolean boolean18 = dateTime1.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime.Property property19 = dateTime9.millisOfDay();
        org.joda.time.DateTime dateTime21 = dateTime9.withMinuteOfHour(16);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime9.getZone();
        org.joda.time.DateTime.Property property23 = dateTime9.weekyear();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((java.lang.Object) dateTime9, chronology24);
        org.joda.time.LocalTime localTime26 = dateTime9.toLocalTime();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray32 = timeOfDay31.getFields();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = timeOfDay31.toDateTimeToday(dateTimeZone33);
        org.joda.time.DateTime.Property property35 = dateTime34.monthOfYear();
        org.joda.time.DateTime dateTime37 = dateTime34.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.toDateTime(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime37.minusMillis((int) 'a');
        int int42 = dateTime41.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime44 = dateTime41.withYear(55);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology48 = localTime47.getChronology();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) 5, chronology48);
        org.joda.time.Chronology chronology50 = chronology48.withUTC();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 10, chronology52);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.Chronology chronology55 = null;
        mutablePeriod53.setPeriod(readableDuration54, chronology55);
        long long59 = chronology50.add((org.joda.time.ReadablePeriod) mutablePeriod53, (long) 32772, 6);
        org.joda.time.DateTimeField dateTimeField60 = chronology50.era();
        org.joda.time.DateTime dateTime61 = dateTime41.withChronology(chronology50);
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.TimeOfDay timeOfDay67 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime69 = timeOfDay67.toDateTimeToday(dateTimeZone68);
        org.joda.time.DateTime dateTime71 = dateTime69.minus((long) (short) 0);
        org.joda.time.Period period73 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period75 = org.joda.time.Period.minutes(1);
        java.lang.String str76 = period75.toString();
        org.joda.time.Period period77 = period73.withFields((org.joda.time.ReadablePeriod) period75);
        org.joda.time.PeriodType periodType78 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period79 = period73.normalizedStandard(periodType78);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod(readableDuration62, (org.joda.time.ReadableInstant) dateTime71, periodType78);
        int int81 = mutablePeriod80.getMonths();
        int int82 = mutablePeriod80.getMonths();
        org.joda.time.DurationFieldType durationFieldType83 = org.joda.time.DurationFieldType.seconds();
        boolean boolean84 = mutablePeriod80.isSupported(durationFieldType83);
        org.joda.time.DateTime dateTime86 = dateTime61.withFieldAdded(durationFieldType83, (int) 'a');
        org.joda.time.LocalTime localTime88 = localTime26.withFieldAdded(durationFieldType83, 3172000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and dateTime61", (dateTime41.compareTo(dateTime61) == 0) == dateTime41.equals(dateTime61));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        mutableDateTime4.setMillis((long) 1);
        java.lang.String str7 = dateTimeFormatter0.print((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = timeOfDay13.getFields();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTimeToday(dateTimeZone15);
        org.joda.time.DateTime.Property property17 = dateTime16.monthOfYear();
        org.joda.time.DateTime dateTime19 = dateTime16.minusMillis((int) (byte) -1);
        boolean boolean21 = dateTime16.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getDurationType();
        boolean boolean24 = dateTime16.isSupported(dateTimeFieldType22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology25);
        org.joda.time.DateTime dateTime27 = dateTime26.toDateTime();
        boolean boolean28 = dateTime16.isAfter((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Period period29 = new org.joda.time.Period(readableDuration8, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = timeOfDay35.toDateTimeToday(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.minus((long) (short) 0);
        org.joda.time.Period period41 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period43 = org.joda.time.Period.minutes(1);
        java.lang.String str44 = period43.toString();
        org.joda.time.Period period45 = period41.withFields((org.joda.time.ReadablePeriod) period43);
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period47 = period41.normalizedStandard(periodType46);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(readableDuration30, (org.joda.time.ReadableInstant) dateTime39, periodType46);
        int int49 = mutablePeriod48.getMonths();
        org.joda.time.Period period50 = period29.minus((org.joda.time.ReadablePeriod) mutablePeriod48);
        mutableDateTime4.add((org.joda.time.ReadablePeriod) period50, 12);
        java.lang.String str53 = mutableDateTime4.toString();
        mutableDateTime4.setMillis(2629746000L);
        org.joda.time.PeriodType periodType58 = org.joda.time.PeriodType.yearDay();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod(periodType58);
        org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.millis();
        org.joda.time.LocalTime localTime68 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology69 = localTime68.getChronology();
        org.joda.time.MutableDateTime mutableDateTime70 = org.joda.time.MutableDateTime.now(chronology69);
        org.joda.time.Period period71 = new org.joda.time.Period((long) 25, (long) (-1), periodType66, chronology69);
        org.joda.time.PeriodType periodType72 = periodType66.withWeeksRemoved();
        org.joda.time.LocalTime localTime76 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology77 = localTime76.getChronology();
        org.joda.time.Interval interval78 = new org.joda.time.Interval((-1L), (long) 17, chronology77);
        org.joda.time.DateTimeField dateTimeField79 = chronology77.secondOfDay();
        org.joda.time.DateTimeField dateTimeField80 = chronology77.yearOfCentury();
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime(chronology77);
        org.joda.time.Period period82 = new org.joda.time.Period(345600000L, (long) '#', periodType66, chronology77);
        org.joda.time.LocalTime localTime86 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology87 = localTime86.getChronology();
        org.joda.time.MutableDateTime mutableDateTime88 = org.joda.time.MutableDateTime.now(chronology87);
        org.joda.time.Period period89 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology87);
        org.joda.time.DurationField durationField90 = chronology87.halfdays();
        org.joda.time.DateTimeField dateTimeField91 = chronology87.halfdayOfDay();
        org.joda.time.Period period92 = new org.joda.time.Period(0L, (long) 55, periodType66, chronology87);
        org.joda.time.MutablePeriod mutablePeriod93 = new org.joda.time.MutablePeriod((long) 7, 1645514261022L, periodType58, chronology87);
        org.joda.time.DateMidnight dateMidnight94 = org.joda.time.DateMidnight.now(chronology87);
        mutableDateTime4.setTime((org.joda.time.ReadableInstant) dateMidnight94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and mutableDateTime70", (dateTime26.compareTo(mutableDateTime70) == 0) == dateTime26.equals(mutableDateTime70));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(86340000, 1, (-1), 52, 18, (int) '#', 1970, 17);
        org.joda.time.PeriodType periodType11 = mutablePeriod10.getPeriodType();
        org.joda.time.PeriodType periodType12 = periodType11.withMillisRemoved();
        org.joda.time.PeriodType periodType13 = periodType12.withMonthsRemoved();
        org.joda.time.PeriodType periodType14 = periodType13.withMillisRemoved();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.hours();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(chronology18);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(0L, chronology18);
        org.joda.time.DurationField durationField24 = chronology18.days();
        org.joda.time.Period period25 = new org.joda.time.Period(41904000091L, (long) 12176, periodType14, chronology18);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutableDateTime29.add(readableDuration30, 0);
        mutableDateTime29.setYear((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod();
        mutablePeriod35.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology39 = null;
        mutablePeriod35.setPeriod((long) 15, chronology39);
        mutablePeriod35.setMinutes(1970);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology48 = localTime47.getChronology();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) 5, chronology48);
        org.joda.time.Chronology chronology50 = chronology48.withUTC();
        mutablePeriod35.setPeriod((long) 0, (long) 1, chronology50);
        mutableDateTime29.setChronology(chronology50);
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray58 = timeOfDay57.getFields();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = timeOfDay57.toDateTimeToday(dateTimeZone59);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str63 = dateTimeZone62.getID();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(dateTimeZone62);
        org.joda.time.DateTime dateTime65 = timeOfDay57.toDateTimeToday(dateTimeZone62);
        int int66 = mutableDateTime29.compareTo((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.Duration duration67 = period25.toDurationTo((org.joda.time.ReadableInstant) dateTime65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime22 and dateTime64", (mutableDateTime22.compareTo(dateTime64) == 0) == mutableDateTime22.equals(dateTime64));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayVariant(locale1);
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale[] localeArray7 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList8 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList8, localeArray7);
        java.util.List<java.util.Locale> localeList10 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList8);
        boolean boolean11 = strSet3.removeAll((java.util.Collection<java.util.Locale>) localeList10);
        strSet3.clear();
        boolean boolean13 = strSet3.isEmpty();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime17.add(readableDuration18, 0);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((java.lang.Object) mutableDateTime17);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay23.plusMonths(7);
        boolean boolean26 = strSet3.equals((java.lang.Object) yearMonthDay23);
        java.util.Date date32 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate33 = org.joda.time.LocalDate.fromDateFields(date32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDate33.toDateTimeAtCurrentTime(dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate33.plusWeeks((int) (short) 0);
        int int38 = localDate33.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str41 = dateTimeZone40.getID();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.DateMidnight dateMidnight43 = localDate33.toDateMidnight(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        int int47 = dateTimeZone45.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) 1899, dateTimeZone45);
        long long50 = dateTimeZone45.nextTransition((long) 0);
        org.joda.time.YearMonthDay yearMonthDay51 = new org.joda.time.YearMonthDay(dateTimeZone45);
        long long53 = dateTimeZone45.convertUTCToLocal((long) (short) 0);
        org.joda.time.DateTime dateTime54 = localDate33.toDateTimeAtStartOfDay(dateTimeZone45);
        org.joda.time.DateTime dateTime56 = dateTime54.plusMinutes((-8));
        org.joda.time.DateTime.Property property57 = dateTime56.millisOfSecond();
        boolean boolean58 = strSet3.remove((java.lang.Object) dateTime56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and dateTime42", (mutableDateTime17.compareTo(dateTime42) == 0) == mutableDateTime17.equals(dateTime42));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str3 = dateTimeZone2.getID();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime6 = dateTime4.plusSeconds(17);
        int int7 = dateTime4.getHourOfDay();
        org.joda.time.DateTime dateTime9 = dateTime4.minus((long) 9);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = timeOfDay16.toDateTimeToday(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.minus((long) (short) 0);
        org.joda.time.Period period22 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period24 = org.joda.time.Period.minutes(1);
        java.lang.String str25 = period24.toString();
        org.joda.time.Period period26 = period22.withFields((org.joda.time.ReadablePeriod) period24);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period28 = period22.normalizedStandard(periodType27);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(readableDuration11, (org.joda.time.ReadableInstant) dateTime20, periodType27);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime9, readableDuration10, periodType27);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.halfdays();
        int int32 = periodType27.indexOf(durationFieldType31);
        mutableDateTime0.add(durationFieldType31, 3);
        int int35 = mutableDateTime0.getWeekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondFraction();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        int int40 = dateTimeZone38.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.ReadableDuration readableDuration42 = null;
        mutableDateTime41.add(readableDuration42, 0);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime41.dayOfWeek();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime41.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime47 = property46.roundFloor();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.millisOfDay();
        int int49 = mutableDateTime47.getYearOfEra();
        int int52 = dateTimeFormatter37.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime47, "\ufffd\ufffd", (int) (short) 0);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(chronology53);
        org.joda.time.DateTime dateTime56 = dateTime54.withHourOfDay(3);
        java.util.Date date65 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate66 = org.joda.time.LocalDate.fromDateFields(date65);
        int int67 = localDate66.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        int int70 = dateTimeZone68.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime71 = localDate66.toDateTimeAtCurrentTime(dateTimeZone68);
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone68);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period76 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period78 = org.joda.time.Period.minutes(1);
        java.lang.String str79 = period78.toString();
        org.joda.time.Period period80 = period76.withFields((org.joda.time.ReadablePeriod) period78);
        org.joda.time.Period period82 = period80.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType83 = org.joda.time.DurationFieldType.months();
        int int84 = period82.get(durationFieldType83);
        org.joda.time.DateMidnight dateMidnight86 = dateMidnight72.withPeriodAdded((org.joda.time.ReadablePeriod) period82, 0);
        org.joda.time.Interval interval87 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime56, (org.joda.time.ReadablePeriod) period82);
        org.joda.time.DateTime.Property property88 = dateTime56.secondOfDay();
        org.joda.time.DateTime dateTime91 = dateTime56.withDurationAdded(1645514238326L, 13);
        boolean boolean92 = mutableDateTime47.isAfter((org.joda.time.ReadableInstant) dateTime91);
        org.joda.time.Interval interval93 = new org.joda.time.Interval(readableDuration36, (org.joda.time.ReadableInstant) mutableDateTime47);
        mutableDateTime0.setDate((org.joda.time.ReadableInstant) mutableDateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime54", (dateTime4.compareTo(dateTime54) == 0) == dateTime4.equals(dateTime54));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, 0);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfEven();
        boolean boolean13 = interval2.isBefore((org.joda.time.ReadableInstant) mutableDateTime12);
        int int14 = mutableDateTime12.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        mutableDateTime12.set(dateTimeFieldType15, 15);
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str22 = locale19.getDisplayVariant(locale21);
        java.util.Calendar calendar23 = mutableDateTime12.toCalendar(locale19);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime12.monthOfYear();
        mutableDateTime12.addWeeks((int) ' ');
        org.joda.time.DateTimeField dateTimeField27 = mutableDateTime12.getRoundingField();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str30 = dateTimeZone29.getID();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = dateTime31.plusSeconds(17);
        boolean boolean34 = mutableDateTime12.equals((java.lang.Object) dateTime31);
        java.util.Date date40 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate41 = org.joda.time.LocalDate.fromDateFields(date40);
        int int42 = localDate41.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime46 = localDate41.toDateTimeAtCurrentTime(dateTimeZone43);
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay(dateTimeZone43);
        org.joda.time.YearMonthDay yearMonthDay49 = yearMonthDay47.withYear(1899);
        org.joda.time.Chronology chronology50 = yearMonthDay47.getChronology();
        org.joda.time.DateTime dateTime51 = dateTime31.toDateTime(chronology50);
        org.joda.time.DurationField durationField52 = chronology50.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime51", (dateTime31.compareTo(dateTime51) == 0) == dateTime31.equals(dateTime51));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.hours();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.era();
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.fromMillisOfDay(0L, chronology3);
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.withMillisOfSecond((int) (short) 100);
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray20 = timeOfDay19.getFields();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = timeOfDay19.toDateTimeToday(dateTimeZone21);
        org.joda.time.Period period24 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period26 = org.joda.time.Period.minutes(1);
        java.lang.String str27 = period26.toString();
        org.joda.time.Period period28 = period24.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period30 = period24.normalizedStandard(periodType29);
        org.joda.time.Period period31 = new org.joda.time.Period(readableDuration14, (org.joda.time.ReadableInstant) dateTime22, periodType29);
        org.joda.time.PeriodType periodType32 = periodType29.withMillisRemoved();
        org.joda.time.Period period33 = interval13.toPeriod(periodType32);
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray39 = timeOfDay38.getFields();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = timeOfDay38.toDateTimeToday(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.withYearOfCentury(16);
        org.joda.time.DateTime dateTime45 = dateTime41.plusYears((-1));
        boolean boolean46 = interval13.contains((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(chronology48);
        org.joda.time.DateTime.Property property50 = dateTime49.secondOfMinute();
        org.joda.time.Interval interval51 = new org.joda.time.Interval(readableDuration47, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Interval interval52 = interval13.overlap((org.joda.time.ReadableInterval) interval51);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        int int55 = dateTimeZone53.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(dateTimeZone53);
        org.joda.time.ReadableDuration readableDuration57 = null;
        mutableDateTime56.add(readableDuration57, 0);
        mutableDateTime56.setYear((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod();
        mutablePeriod62.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology66 = null;
        mutablePeriod62.setPeriod((long) 15, chronology66);
        mutablePeriod62.setMinutes(1970);
        org.joda.time.LocalTime localTime74 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology75 = localTime74.getChronology();
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime((long) 5, chronology75);
        org.joda.time.Chronology chronology77 = chronology75.withUTC();
        mutablePeriod62.setPeriod((long) 0, (long) 1, chronology77);
        mutableDateTime56.setChronology(chronology77);
        org.joda.time.DateTimeField dateTimeField80 = chronology77.millisOfSecond();
        org.joda.time.Period period82 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period84 = org.joda.time.Period.minutes(1);
        java.lang.String str85 = period84.toString();
        org.joda.time.Period period86 = period82.withFields((org.joda.time.ReadablePeriod) period84);
        int int87 = period82.getMinutes();
        long long90 = chronology77.add((org.joda.time.ReadablePeriod) period82, 0L, 26190505);
        org.joda.time.Interval interval91 = interval13.withChronology(chronology77);
        org.joda.time.DurationField durationField92 = chronology77.eras();
        org.joda.time.TimeOfDay timeOfDay93 = timeOfDay10.withChronologyRetainFields(chronology77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField92", Math.signum(durationField4.compareTo(durationField92)) == -Math.signum(durationField92.compareTo(durationField4)));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime2 = dateTime1.toDateTime();
        long long3 = dateTime2.getMillis();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = timeOfDay13.toDateTimeToday(dateTimeZone14);
        mutableDateTime8.setZoneRetainFields(dateTimeZone14);
        mutableDateTime8.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        mutableDateTime8.setZone(dateTimeZone19);
        java.util.TimeZone timeZone23 = dateTimeZone19.toTimeZone();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 3174023, dateTimeZone19);
        org.joda.time.DateTime dateTime25 = dateTime2.withZoneRetainFields(dateTimeZone19);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (short) 100, (long) 12);
        org.joda.time.format.PeriodFormatter periodFormatter29 = null;
        java.lang.String str30 = mutablePeriod28.toString(periodFormatter29);
        org.joda.time.DurationFieldType[] durationFieldTypeArray31 = mutablePeriod28.getFieldTypes();
        mutablePeriod28.addMinutes(2);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.secondOfMinute();
        org.joda.time.Interval interval38 = new org.joda.time.Interval(readableDuration34, (org.joda.time.ReadableInstant) dateTime36);
        boolean boolean39 = interval38.isAfterNow();
        org.joda.time.Period period40 = interval38.toPeriod();
        mutablePeriod28.mergePeriod((org.joda.time.ReadablePeriod) period40);
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime49 = timeOfDay47.toDateTimeToday(dateTimeZone48);
        org.joda.time.DateTime dateTime51 = dateTime49.withCenturyOfEra(10);
        boolean boolean52 = dateTime51.isEqualNow();
        org.joda.time.Chronology chronology53 = dateTime51.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.secondOfMinute();
        org.joda.time.DurationField durationField55 = chronology53.hours();
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(chronology53);
        mutablePeriod28.setPeriod(1645514285512L, chronology53);
        org.joda.time.DateTime dateTime58 = dateTime2.toDateTime(chronology53);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours(29);
        org.joda.time.DateTime dateTime61 = dateTime2.withZone(dateTimeZone60);
        org.joda.time.DateTime.Property property62 = dateTime2.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime61", (dateTime2.compareTo(dateTime61) == 0) == dateTime2.equals(dateTime61));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        int int10 = localDate9.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period23.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.months();
        int int27 = period25.get(durationFieldType26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight15.withPeriodAdded((org.joda.time.ReadablePeriod) period25, 0);
        org.joda.time.DateMidnight.Property property30 = dateMidnight15.monthOfYear();
        org.joda.time.DateMidnight dateMidnight32 = property30.addToCopy(15);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.withYearOfCentury(55);
        int int35 = dateMidnight32.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight32.minus(readablePeriod36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.plusDays((-2));
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str42 = dateTimeZone41.getID();
        org.joda.time.DateMidnight dateMidnight43 = org.joda.time.DateMidnight.now(dateTimeZone41);
        int int45 = dateTimeZone41.getOffsetFromLocal(10L);
        java.lang.String str47 = dateTimeZone41.getShortName((long) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight37.toMutableDateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime49 = dateMidnight37.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone50 = dateMidnight37.getZone();
        org.joda.time.DateMidnight.Property property51 = dateMidnight37.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight37 and mutableDateTime48", (dateMidnight37.compareTo(mutableDateTime48) == 0) == dateMidnight37.equals(mutableDateTime48));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        java.util.Date date6 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromDateFields(date6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = dateTime9.withZone(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(54);
        java.util.Date date19 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.fromDateFields(date19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate20.plusWeeks((int) (short) 0);
        int int25 = localDate20.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str28 = dateTimeZone27.getID();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight30 = localDate20.toDateMidnight(dateTimeZone27);
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.now(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime33 = dateTime13.withZone(dateTimeZone27);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) 26327597, dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime33", (dateTime13.compareTo(dateTime33) == 0) == dateTime13.equals(dateTime33));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusSeconds(17);
        int int6 = dateTime3.getHourOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.minus((long) 9);
        java.util.Date date17 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.fromDateFields(date17);
        int int19 = localDate18.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        int int22 = dateTimeZone20.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime23 = localDate18.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period30 = org.joda.time.Period.minutes(1);
        java.lang.String str31 = period30.toString();
        org.joda.time.Period period32 = period28.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period34 = period32.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.months();
        int int36 = period34.get(durationFieldType35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight24.withPeriodAdded((org.joda.time.ReadablePeriod) period34, 0);
        boolean boolean39 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.DateMidnight.Property property40 = dateMidnight24.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str43 = dateTimeZone42.getID();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone42);
        org.joda.time.DateTime dateTime46 = dateTime44.plusSeconds(17);
        org.joda.time.DateTime dateTime48 = dateTime44.withDayOfMonth(2);
        org.joda.time.DateTime dateTime50 = dateTime48.withMillisOfSecond(29);
        org.joda.time.DateTime dateTime52 = dateTime48.withMillisOfSecond(12);
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight24, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.MutableDateTime mutableDateTime54 = dateMidnight24.toMutableDateTimeISO();
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight24.withYearOfCentury(0);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime();
        int int58 = dateTime57.getHourOfDay();
        org.joda.time.DateTime dateTime60 = dateTime57.minus((long) 256);
        org.joda.time.DateTime dateTime62 = dateTime60.minus(446195897579L);
        org.joda.time.DateTime dateTime64 = dateTime60.plusSeconds(33);
        int int65 = dateMidnight24.compareTo((org.joda.time.ReadableInstant) dateTime60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and dateTime57", (dateTime44.compareTo(dateTime57) == 0) == dateTime44.equals(dateTime57));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        int int10 = localDate9.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period23.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.months();
        int int27 = period25.get(durationFieldType26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight15.withPeriodAdded((org.joda.time.ReadablePeriod) period25, 0);
        org.joda.time.DateMidnight.Property property30 = dateMidnight15.monthOfYear();
        org.joda.time.DateMidnight dateMidnight32 = property30.addToCopy(15);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.withYearOfCentury(55);
        int int35 = dateMidnight32.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight32.minus(readablePeriod36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.plusDays((-2));
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str42 = dateTimeZone41.getID();
        org.joda.time.DateMidnight dateMidnight43 = org.joda.time.DateMidnight.now(dateTimeZone41);
        int int45 = dateTimeZone41.getOffsetFromLocal(10L);
        java.lang.String str47 = dateTimeZone41.getShortName((long) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight37.toMutableDateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime49 = dateMidnight37.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone50 = dateMidnight37.getZone();
        java.lang.String str52 = dateTimeZone50.getNameKey(31557600000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight32 and mutableDateTime48", (dateMidnight32.compareTo(mutableDateTime48) == 0) == dateMidnight32.equals(mutableDateTime48));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime2 = dateTime1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.centuryOfEra();
        org.joda.time.YearMonthDay yearMonthDay4 = dateTime2.toYearMonthDay();
        org.joda.time.DateTime.Property property5 = dateTime2.minuteOfHour();
        org.joda.time.DateTime dateTime6 = property5.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str9 = dateTimeZone8.getID();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(17);
        int int13 = dateTime10.getHourOfDay();
        org.joda.time.DateTime dateTime15 = dateTime10.minus((long) 9);
        java.util.Date date24 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.fromDateFields(date24);
        int int26 = localDate25.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime30 = localDate25.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period35 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period37 = org.joda.time.Period.minutes(1);
        java.lang.String str38 = period37.toString();
        org.joda.time.Period period39 = period35.withFields((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period41 = period39.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.months();
        int int43 = period41.get(durationFieldType42);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight31.withPeriodAdded((org.joda.time.ReadablePeriod) period41, 0);
        boolean boolean46 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateMidnight31);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight31.plusMonths(69);
        int int49 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateMidnight48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime10", (dateTime1.compareTo(dateTime10) == 0) == dateTime1.equals(dateTime10));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        java.lang.String str11 = period10.toString();
        org.joda.time.Period period12 = period8.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period12.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.months();
        int int16 = period14.get(durationFieldType15);
        mutableDateTime3.add(durationFieldType15, 7);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime3.dayOfYear();
        boolean boolean20 = mutableDateTime3.isEqualNow();
        mutableDateTime3.setYear((int) '#');
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str25 = dateTimeZone24.getID();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime28 = dateTime26.plusSeconds(17);
        org.joda.time.DateTime dateTime30 = dateTime26.withDayOfMonth(2);
        org.joda.time.DateTime dateTime32 = dateTime30.withMillisOfSecond(29);
        org.joda.time.DateTime dateTime34 = dateTime30.withMillisOfSecond(12);
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        int int38 = dateTimeZone36.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutableDateTime39.add(readableDuration40, 0);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime39.dayOfWeek();
        int int44 = mutableDateTime39.getMinuteOfHour();
        mutableDateTime3.setMillis((org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime3.yearOfCentury();
        int int47 = property46.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime26", (mutableDateTime3.compareTo(dateTime26) == 0) == mutableDateTime3.equals(dateTime26));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.TimeOfDay.Property property7 = timeOfDay4.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay8 = property7.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay10 = property7.addToCopy(0);
        int int11 = property7.getMinimumValueOverall();
        org.joda.time.TimeOfDay timeOfDay13 = property7.addToCopy((int) ' ');
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.withSecondOfMinute(17);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.plusHours((int) ' ');
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        int int23 = dateTimeZone21.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.ReadableDuration readableDuration25 = null;
        mutableDateTime24.add(readableDuration25, 0);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime24.dayOfWeek();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundHalfEven();
        boolean boolean31 = interval20.isBefore((org.joda.time.ReadableInstant) mutableDateTime30);
        int int32 = mutableDateTime30.getHourOfDay();
        org.joda.time.DateTime dateTime33 = timeOfDay17.toDateTime((org.joda.time.ReadableInstant) mutableDateTime30);
        int int34 = mutableDateTime30.getYearOfCentury();
        int int35 = mutableDateTime30.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        int int38 = dateTimeZone36.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime46 = timeOfDay44.toDateTimeToday(dateTimeZone45);
        mutableDateTime39.setZoneRetainFields(dateTimeZone45);
        mutableDateTime39.setSecondOfMinute((int) (short) 0);
        mutableDateTime30.setTime((org.joda.time.ReadableInstant) mutableDateTime39);
        mutableDateTime39.addHours(108);
        mutableDateTime39.setYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        int int57 = dateTimeZone55.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(dateTimeZone55);
        org.joda.time.TimeOfDay timeOfDay63 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime65 = timeOfDay63.toDateTimeToday(dateTimeZone64);
        mutableDateTime58.setZoneRetainFields(dateTimeZone64);
        mutableDateTime58.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        int int71 = dateTimeZone69.getStandardOffset((long) 100);
        mutableDateTime58.setZone(dateTimeZone69);
        org.joda.time.LocalTime localTime76 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology77 = localTime76.getChronology();
        org.joda.time.Interval interval78 = new org.joda.time.Interval((-1L), (long) 17, chronology77);
        mutableDateTime58.setChronology(chronology77);
        java.lang.String str80 = chronology77.toString();
        mutableDateTime39.setChronology(chronology77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and mutableDateTime58", (mutableDateTime24.compareTo(mutableDateTime58) == 0) == mutableDateTime24.equals(mutableDateTime58));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = timeOfDay9.toDateTimeToday(dateTimeZone10);
        mutableDateTime4.setZoneRetainFields(dateTimeZone10);
        mutableDateTime4.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        mutableDateTime4.setZone(dateTimeZone15);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((-1L), (long) 17, chronology23);
        mutableDateTime4.setChronology(chronology23);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(chronology23);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period30 = org.joda.time.Period.minutes(1);
        java.lang.String str31 = period30.toString();
        org.joda.time.Period period32 = period28.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period34 = period32.plusMillis(100);
        org.joda.time.Period period35 = period32.negated();
        org.joda.time.Period period37 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period39 = org.joda.time.Period.minutes(1);
        java.lang.String str40 = period39.toString();
        org.joda.time.Period period41 = period37.withFields((org.joda.time.ReadablePeriod) period39);
        org.joda.time.Period period43 = period41.plusMillis(100);
        boolean boolean44 = period35.equals((java.lang.Object) period43);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period46 = period35.withFields((org.joda.time.ReadablePeriod) mutablePeriod45);
        int[] intArray49 = chronology23.get((org.joda.time.ReadablePeriod) period46, 0L, 6L);
        org.joda.time.DateTimeField dateTimeField50 = chronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField51 = chronology23.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(3172001L, chronology23);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str55 = dateTimeZone54.getID();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(dateTimeZone54);
        org.joda.time.DateTime dateTime58 = dateTime56.plusSeconds(17);
        org.joda.time.DateTime dateTime60 = dateTime56.withDayOfMonth(2);
        org.joda.time.DateTime dateTime62 = dateTime60.withMillisOfSecond(29);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = null;
        boolean boolean64 = dateTime60.isSupported(dateTimeFieldType63);
        org.joda.time.DateTime.Property property65 = dateTime60.dayOfWeek();
        org.joda.time.DateTime dateTime67 = property65.addWrapFieldToCopy(437);
        org.joda.time.DateTime dateTime69 = dateTime67.minusMillis(980);
        org.joda.time.DateTime dateTime70 = dateTime69.withEarlierOffsetAtOverlap();
        org.joda.time.Interval interval71 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight52, (org.joda.time.ReadableInstant) dateTime69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime26 and dateTime56", (mutableDateTime26.compareTo(dateTime56) == 0) == mutableDateTime26.equals(dateTime56));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.millisOfDay();
        int int11 = mutableDateTime9.getYearOfEra();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.secondOfMinute();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.secondOfMinute();
        mutableDateTime9.addMillis(61);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 10, chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMinuteOfHour(0);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 10, chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.withFields((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 10, chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime26.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod31, 15);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType34.getDurationType();
        int int36 = localDateTime33.get(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.plusSeconds(12);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withDayOfYear((int) (short) 100);
        org.joda.time.Chronology chronology41 = localDateTime38.getChronology();
        org.joda.time.DateTime dateTime42 = mutableDateTime9.toDateTime(chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime42", (mutableDateTime3.compareTo(dateTime42) == 0) == mutableDateTime3.equals(dateTime42));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean5 = dateTimeZone0.isStandardOffset((long) 10);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 5, chronology11);
        org.joda.time.Chronology chronology13 = chronology11.withUTC();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay((long) 2022, chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology13);
        int int17 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        int int22 = dateTimeZone20.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.ReadableDuration readableDuration24 = null;
        mutableDateTime23.add(readableDuration24, 0);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime23.dayOfWeek();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundFloor();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = timeOfDay39.toDateTimeToday(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.withCenturyOfEra(10);
        boolean boolean44 = dateTime43.isEqualNow();
        org.joda.time.Chronology chronology45 = dateTime43.getChronology();
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay(15, 5, chronology45);
        org.joda.time.DateTimeField dateTimeField47 = chronology45.clockhourOfDay();
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay(1L, chronology45);
        boolean boolean49 = dateTimeFieldType31.isSupported(chronology45);
        mutableDateTime29.setChronology(chronology45);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((-68803869717836306L), (long) 54, chronology45);
        org.joda.time.DurationField durationField52 = chronology45.eras();
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime16, chronology45);
        org.joda.time.DurationField durationField54 = chronology45.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and mutableDateTime53", (mutableDateTime16.compareTo(mutableDateTime53) == 0) == mutableDateTime16.equals(mutableDateTime53));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("26215220");
        int int2 = mutableDateTime1.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, 0);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType12.getDurationType();
        mutableDateTime6.set(dateTimeFieldType12, (int) ' ');
        boolean boolean16 = mutableDateTime1.isSupported(dateTimeFieldType12);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        int int19 = dateTimeZone17.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime20.add(readableDuration21, 0);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime20.dayOfWeek();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundHalfEven();
        org.joda.time.DateTimeField dateTimeField27 = property25.getField();
        org.joda.time.MutableDateTime mutableDateTime28 = property25.getMutableDateTime();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology33 = localTime32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 5, chronology33);
        org.joda.time.TimeOfDay timeOfDay35 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 3172001, chronology33);
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime28.toMutableDateTime(chronology33);
        boolean boolean37 = dateTimeFieldType12.isSupported(chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and mutableDateTime36", (mutableDateTime20.compareTo(mutableDateTime36) == 0) == mutableDateTime20.equals(mutableDateTime36));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTime dateTime11 = dateTime9.plusSeconds(3172001);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod();
        mutablePeriod12.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod12.setPeriod((long) 15, chronology16);
        mutablePeriod12.setMinutes(1970);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 5, chronology25);
        org.joda.time.Chronology chronology27 = chronology25.withUTC();
        mutablePeriod12.setPeriod((long) 0, (long) 1, chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.hourOfDay();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology27);
        org.joda.time.DateTime dateTime31 = dateTime11.withChronology(chronology27);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        int int34 = dateTimeZone32.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone32);
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = timeOfDay40.toDateTimeToday(dateTimeZone41);
        mutableDateTime35.setZoneRetainFields(dateTimeZone41);
        mutableDateTime35.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        int int48 = dateTimeZone46.getStandardOffset((long) 100);
        mutableDateTime35.setZone(dateTimeZone46);
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology54 = localTime53.getChronology();
        org.joda.time.Interval interval55 = new org.joda.time.Interval((-1L), (long) 17, chronology54);
        mutableDateTime35.setChronology(chronology54);
        java.lang.String str57 = chronology54.toString();
        org.joda.time.DurationField durationField58 = chronology54.centuries();
        org.joda.time.DurationField durationField59 = chronology54.weeks();
        org.joda.time.DateTime dateTime60 = dateTime11.withChronology(chronology54);
        org.joda.time.DateTime dateTime62 = dateTime60.withMillis((-68803869700800000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime31", (dateTime11.compareTo(dateTime31) == 0) == dateTime11.equals(dateTime31));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 10, chronology5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod6.setPeriod(readableDuration7, chronology8);
        mutablePeriod6.setSeconds(0);
        int[] intArray13 = chronology2.get((org.joda.time.ReadablePeriod) mutablePeriod6, (long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = timeOfDay18.getFields();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.monthOfYear();
        org.joda.time.DateTime dateTime24 = dateTime21.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = timeOfDay35.toDateTimeToday(dateTimeZone36);
        mutableDateTime30.setZoneRetainFields(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime30, readableDuration39);
        boolean boolean41 = dateTime26.isBefore((org.joda.time.ReadableInstant) mutableDateTime30);
        java.lang.Object obj42 = mutableDateTime30.clone();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime46.add(readableDuration47, 0);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime46.dayOfWeek();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundFloor();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.millisOfDay();
        int int54 = mutableDateTime52.getYearOfEra();
        mutablePeriod6.setPeriod((org.joda.time.ReadableInstant) mutableDateTime30, (org.joda.time.ReadableInstant) mutableDateTime52);
        boolean boolean57 = mutableDateTime30.isBefore((long) 1970);
        java.util.Date date63 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        date63.setMinutes(54);
        org.joda.time.TimeOfDay timeOfDay66 = org.joda.time.TimeOfDay.fromDateFields(date63);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = timeOfDay66.getFieldType(2);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime30.property(dateTimeFieldType68);
        org.joda.time.MutableDateTime mutableDateTime71 = property69.add((long) 1970);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime(chronology72);
        org.joda.time.Instant instant74 = dateTime73.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property76 = dateTime73.property(dateTimeFieldType75);
        boolean boolean77 = mutableDateTime71.isSupported(dateTimeFieldType75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime73 and instant74", (dateTime73.compareTo(instant74) == 0) == dateTime73.equals(instant74));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        mutableDateTime3.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        mutableDateTime3.setZone(dateTimeZone14);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((-1L), (long) 17, chronology22);
        mutableDateTime3.setChronology(chronology22);
        java.lang.String str25 = chronology22.toString();
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = timeOfDay30.toDateTimeToday(dateTimeZone31);
        org.joda.time.Chronology chronology33 = chronology22.withZone(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(chronology33);
        org.joda.time.DurationField durationField35 = chronology33.seconds();
        java.lang.String str36 = durationField35.toString();
        org.joda.time.DurationFieldType durationFieldType37 = durationField35.getType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime34", (mutableDateTime3.compareTo(mutableDateTime34) == 0) == mutableDateTime3.equals(mutableDateTime34));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime10 = dateTime6.plusDays((int) (byte) -1);
        java.util.Date date11 = dateTime10.toDate();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, readableDuration12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime17.add(readableDuration18, 0);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        mutableDateTime17.set(dateTimeFieldType23, (int) ' ');
        boolean boolean27 = interval13.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray33 = timeOfDay32.getFields();
        org.joda.time.Period period35 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period37 = org.joda.time.Period.minutes(1);
        java.lang.String str38 = period37.toString();
        org.joda.time.Period period39 = period35.withFields((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period41 = period39.plusMillis(100);
        org.joda.time.Period period42 = period39.negated();
        org.joda.time.Period period44 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period46 = org.joda.time.Period.minutes(1);
        java.lang.String str47 = period46.toString();
        org.joda.time.Period period48 = period44.withFields((org.joda.time.ReadablePeriod) period46);
        org.joda.time.Period period50 = period48.plusMillis(100);
        boolean boolean51 = period42.equals((java.lang.Object) period50);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period53 = period42.withFields((org.joda.time.ReadablePeriod) mutablePeriod52);
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay32.plus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType56 = dateTimeFieldType55.getDurationType();
        int int57 = period42.get(durationFieldType56);
        mutableDateTime17.add(durationFieldType56, 256);
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime17.copy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = org.joda.time.format.ISODateTimeFormat.basicTimeNoMillis();
        java.lang.String str62 = mutableDateTime60.toString(dateTimeFormatter61);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime60.era();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime65 = mutableDateTime60.toDateTime(dateTimeZone64);
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((int) '4', (-1), (int) (short) 100, (-1));
        org.joda.time.LocalTime localTime78 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology79 = localTime78.getChronology();
        org.joda.time.Interval interval80 = new org.joda.time.Interval((-1L), (long) 17, chronology79);
        mutablePeriod73.add((long) 26163694, chronology79);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((long) 99, 4233600010L, periodType68, chronology79);
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime(chronology79);
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime(chronology79);
        boolean boolean85 = dateTimeZone64.equals((java.lang.Object) dateTime84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and dateTime65", (mutableDateTime17.compareTo(dateTime65) == 0) == mutableDateTime17.equals(dateTime65));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 10);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime1, readableDuration2);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.hours();
        org.joda.time.Period period9 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period11 = org.joda.time.Period.minutes(1);
        java.lang.String str12 = period11.toString();
        org.joda.time.Period period13 = period9.withFields((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period15 = period13.plusMillis(100);
        org.joda.time.Period period16 = period13.negated();
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period20 = org.joda.time.Period.minutes(1);
        java.lang.String str21 = period20.toString();
        org.joda.time.Period period22 = period18.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Period period24 = period22.plusMillis(100);
        boolean boolean25 = period16.equals((java.lang.Object) period24);
        int[] intArray28 = chronology6.get((org.joda.time.ReadablePeriod) period16, (long) 100, (long) (-1));
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology6);
        org.joda.time.DateTimeField dateTimeField30 = chronology6.weekyear();
        org.joda.time.DateTimeField dateTimeField31 = chronology6.clockhourOfHalfday();
        java.lang.String str32 = chronology6.toString();
        org.joda.time.DateTime dateTime33 = dateTime1.toDateTime(chronology6);
        org.joda.time.DurationField durationField34 = chronology6.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime33", (dateTime1.compareTo(dateTime33) == 0) == dateTime1.equals(dateTime33));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plus((long) 'a');
        org.joda.time.Period period6 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(1);
        java.lang.String str9 = period8.toString();
        org.joda.time.Period period10 = period6.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period10.plusMillis(100);
        org.joda.time.Period period13 = period10.negated();
        org.joda.time.Period period15 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period17 = org.joda.time.Period.minutes(1);
        java.lang.String str18 = period17.toString();
        org.joda.time.Period period19 = period15.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period21 = period19.plusMillis(100);
        boolean boolean22 = period13.equals((java.lang.Object) period21);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period24 = period13.withFields((org.joda.time.ReadablePeriod) mutablePeriod23);
        mutablePeriod23.clear();
        org.joda.time.DateTime dateTime26 = dateTime4.minus((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(86340000, 1, (-1), 52, 18, (int) '#', 1970, 17);
        org.joda.time.PeriodType periodType39 = mutablePeriod38.getPeriodType();
        org.joda.time.PeriodType periodType40 = periodType39.withMillisRemoved();
        org.joda.time.PeriodType periodType41 = periodType40.withMonthsRemoved();
        org.joda.time.PeriodType periodType42 = periodType41.withMillisRemoved();
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology46 = localTime45.getChronology();
        org.joda.time.DurationField durationField47 = chronology46.hours();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField49 = chronology46.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(chronology46);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(0L, chronology46);
        org.joda.time.DurationField durationField52 = chronology46.days();
        org.joda.time.Period period53 = new org.joda.time.Period(41904000091L, (long) 12176, periodType42, chronology46);
        org.joda.time.DateTimeField dateTimeField54 = chronology46.dayOfYear();
        org.joda.time.DateTimeField dateTimeField55 = chronology46.minuteOfDay();
        mutablePeriod23.add((long) 86340000, chronology46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and mutableDateTime50", (dateTime2.compareTo(mutableDateTime50) == 0) == dateTime2.equals(mutableDateTime50));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getDurationType();
        org.joda.time.DateTime dateTime13 = dateTime9.withField(dateTimeFieldType10, 16);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.DurationField durationField18 = chronology17.hours();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay((long) 38, chronology17);
        boolean boolean20 = dateTimeFieldType10.isSupported(chronology17);
        org.joda.time.DurationField durationField21 = chronology17.seconds();
        java.lang.String str22 = chronology17.toString();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        int int25 = dateTimeZone23.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.ReadableDuration readableDuration27 = null;
        mutableDateTime26.add(readableDuration27, 0);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime26.dayOfWeek();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime26.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime32 = property31.roundHalfEven();
        org.joda.time.DateTimeField dateTimeField33 = property31.getField();
        org.joda.time.MutableDateTime mutableDateTime34 = property31.getMutableDateTime();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology39 = localTime38.getChronology();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((-1L), (long) 17, chronology39);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology39);
        org.joda.time.DateTimeField dateTimeField42 = chronology39.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.yearOfCentury();
        mutableDateTime34.setChronology(chronology39);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 10, chronology46);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Chronology chronology49 = null;
        mutablePeriod47.setPeriod(readableDuration48, chronology49);
        mutablePeriod47.setSeconds(0);
        mutablePeriod47.setPeriod((long) (byte) 100);
        mutableDateTime34.add((org.joda.time.ReadablePeriod) mutablePeriod47, 26318644);
        int[] intArray58 = chronology17.get((org.joda.time.ReadablePeriod) mutablePeriod47, (long) 55);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        int int61 = dateTimeZone59.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime62 = org.joda.time.DateTime.now(dateTimeZone59);
        java.lang.String str63 = dateTimeZone59.toString();
        java.lang.String str64 = dateTimeZone59.toString();
        long long67 = dateTimeZone59.adjustOffset((long) 100, false);
        org.joda.time.Chronology chronology68 = chronology17.withZone(dateTimeZone59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and dateTime62", (dateTime41.compareTo(dateTime62) == 0) == dateTime41.equals(dateTime62));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str3 = dateTimeZone2.getID();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime6 = dateTime4.minusHours((int) ' ');
        org.joda.time.Period period7 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime9 = dateTime4.minus((-6652799968L));
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 10, chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMinuteOfHour(0);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 10, chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withFields((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 10, chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime20.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod25, 15);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime20.plusMonths(12);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 10, chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.plusMillis((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = localDateTime36.getFieldType(0);
        org.joda.time.LocalDateTime.Property property39 = localDateTime29.property(dateTimeFieldType38);
        org.joda.time.DurationFieldType durationFieldType40 = dateTimeFieldType38.getRangeDurationType();
        org.joda.time.DateTime dateTime42 = dateTime4.withField(dateTimeFieldType38, 436);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(dateTimeZone43);
        int int48 = localDate47.getEra();
        org.joda.time.LocalDate localDate50 = localDate47.withYearOfEra((int) (byte) 1);
        int int51 = localDate47.size();
        org.joda.time.LocalDate.Property property52 = localDate47.dayOfWeek();
        org.joda.time.LocalDate localDate53 = property52.roundCeilingCopy();
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        boolean boolean55 = dateTimeFieldType38.isSupported(chronology54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime46", (dateTime4.compareTo(mutableDateTime46) == 0) == dateTime4.equals(mutableDateTime46));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        java.lang.String str16 = dateTimeZone13.getShortName((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime11.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime17.toMutableDateTime(chronology18);
        org.joda.time.DateTime dateTime20 = dateTime17.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime20", (dateTime11.compareTo(dateTime20) == 0) == dateTime11.equals(dateTime20));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        java.lang.String str16 = dateTimeZone13.getShortName((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime11.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime17.toMutableDateTime(chronology18);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMonths((-60));
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        int int24 = dateTimeZone22.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration26 = null;
        mutableDateTime25.add(readableDuration26, 0);
        java.lang.String str29 = mutableDateTime25.toString();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime25.copy();
        boolean boolean31 = dateTime21.isAfter((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime21.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime17", (dateTime11.compareTo(dateTime17) == 0) == dateTime11.equals(dateTime17));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate6.plusWeeks((int) (short) 0);
        int int11 = localDate6.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = localDate6.toDateMidnight(dateTimeZone13);
        java.util.Date date22 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.fromDateFields(date22);
        int int24 = localDate23.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        int int27 = dateTimeZone25.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime28 = localDate23.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay(dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight16.withZoneRetainFields(dateTimeZone25);
        java.lang.String str31 = dateTimeZone25.getID();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone25);
        boolean boolean34 = dateTimeZone25.isStandardOffset(31535999958L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime32", (dateTime15.compareTo(dateTime32) == 0) == dateTime15.equals(dateTime32));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        java.lang.String str16 = dateTimeZone13.getShortName((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime11.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime17.toMutableDateTime(chronology18);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMonths((-60));
        org.joda.time.DateTime.Property property22 = dateTime21.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime17", (dateTime11.compareTo(dateTime17) == 0) == dateTime11.equals(dateTime17));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.withYear(1899);
        org.joda.time.Interval interval15 = yearMonthDay12.toInterval();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = yearMonthDay12.getFieldTypes();
        org.joda.time.YearMonthDay.Property property17 = yearMonthDay12.year();
        org.joda.time.YearMonthDay yearMonthDay19 = property17.addToCopy((int) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.plusYears(4);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.minusDays(2598);
        java.util.Date date29 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.fromDateFields(date29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDate30.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.LocalDate localDate34 = localDate30.plusWeeks((int) (short) 0);
        int int35 = localDate30.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str38 = dateTimeZone37.getID();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone37);
        org.joda.time.DateMidnight dateMidnight40 = localDate30.toDateMidnight(dateTimeZone37);
        java.util.Date date46 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate47 = org.joda.time.LocalDate.fromDateFields(date46);
        int int48 = localDate47.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        int int51 = dateTimeZone49.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime52 = localDate47.toDateTimeAtCurrentTime(dateTimeZone49);
        org.joda.time.YearMonthDay yearMonthDay53 = new org.joda.time.YearMonthDay(dateTimeZone49);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight40.withZoneRetainFields(dateTimeZone49);
        java.lang.String str55 = dateTimeZone49.getID();
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(dateTimeZone49);
        org.joda.time.DateMidnight dateMidnight57 = org.joda.time.DateMidnight.now(dateTimeZone49);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(dateTimeZone49);
        org.joda.time.DateTime dateTime59 = yearMonthDay19.toDateTimeAtCurrentTime(dateTimeZone49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime58", (dateTime39.compareTo(dateTime58) == 0) == dateTime39.equals(dateTime58));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str23 = locale20.getDisplayVariant(locale22);
        java.lang.String str24 = dateTimeZone17.getName((long) 5, locale20);
        org.joda.time.DateTime dateTime25 = dateTime15.withZoneRetainFields(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight26 = yearMonthDay12.toDateMidnight(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.plusWeeks((int) ' ');
        int int29 = dateMidnight26.getWeekOfWeekyear();
        org.joda.time.Interval interval30 = dateMidnight26.toInterval();
        org.joda.time.Interval interval31 = interval30.toInterval();
        org.joda.time.Period period33 = org.joda.time.Period.months(15);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str36 = dateTimeZone35.getID();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone35);
        org.joda.time.DateTime dateTime39 = dateTime37.plusSeconds(17);
        org.joda.time.DateTime dateTime41 = dateTime37.withDayOfMonth(2);
        org.joda.time.Duration duration42 = period33.toDurationTo((org.joda.time.ReadableInstant) dateTime41);
        java.lang.String str43 = duration42.toString();
        java.util.Date date49 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate50 = org.joda.time.LocalDate.fromDateFields(date49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = localDate50.toDateTimeAtCurrentTime(dateTimeZone51);
        org.joda.time.LocalDate localDate54 = localDate50.plusWeeks((int) (short) 0);
        int int55 = localDate50.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str58 = dateTimeZone57.getID();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(dateTimeZone57);
        org.joda.time.DateMidnight dateMidnight60 = localDate50.toDateMidnight(dateTimeZone57);
        org.joda.time.DateMidnight.Property property61 = dateMidnight60.monthOfYear();
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight60.withMillis((long) 3);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight60.plusYears((int) 'a');
        org.joda.time.Interval interval66 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration42, (org.joda.time.ReadableInstant) dateMidnight60);
        boolean boolean67 = interval30.isAfter((org.joda.time.ReadableInterval) interval66);
        org.joda.time.Duration duration68 = interval66.toDuration();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime37", (dateTime14.compareTo(dateTime37) == 0) == dateTime14.equals(dateTime37));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        mutableDateTime3.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        mutableDateTime3.setZone(dateTimeZone14);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((-1L), (long) 17, chronology22);
        mutableDateTime3.setChronology(chronology22);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime3.copy();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.joda.time.DateTime dateTime28 = mutableDateTime3.toDateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(45);
        java.util.Date date31 = dateTime28.toDate();
        org.joda.time.YearMonthDay yearMonthDay32 = org.joda.time.YearMonthDay.fromDateFields(date31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime28", (mutableDateTime3.compareTo(dateTime28) == 0) == mutableDateTime3.equals(dateTime28));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        boolean boolean10 = timeZone6.hasSameRules(timeZone9);
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone9, locale11);
        org.joda.time.DateTime dateTime13 = property2.setCopy("6", locale11);
        org.joda.time.DateTime dateTime14 = property2.roundFloorCopy();
        org.joda.time.DateTime dateTime15 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime17 = dateTime15.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableDateTime21.add(readableDuration22, 0);
        mutableDateTime21.setYear((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod();
        mutablePeriod27.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology31 = null;
        mutablePeriod27.setPeriod((long) 15, chronology31);
        mutablePeriod27.setMinutes(1970);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology40 = localTime39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) 5, chronology40);
        org.joda.time.Chronology chronology42 = chronology40.withUTC();
        mutablePeriod27.setPeriod((long) 0, (long) 1, chronology42);
        mutableDateTime21.setChronology(chronology42);
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray50 = timeOfDay49.getFields();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = timeOfDay49.toDateTimeToday(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str55 = dateTimeZone54.getID();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(dateTimeZone54);
        org.joda.time.DateTime dateTime57 = timeOfDay49.toDateTimeToday(dateTimeZone54);
        int int58 = mutableDateTime21.compareTo((org.joda.time.ReadableInstant) dateTime57);
        boolean boolean59 = dateTime15.isAfter((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str62 = dateTimeZone61.getID();
        java.util.Locale locale64 = java.util.Locale.KOREAN;
        java.util.Locale locale66 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str67 = locale64.getDisplayVariant(locale66);
        java.lang.String str68 = dateTimeZone61.getName((long) 5, locale64);
        mutableDateTime21.setZone(dateTimeZone61);
        long long71 = dateTimeZone61.previousTransition((long) 625);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime56", (dateTime1.compareTo(dateTime56) == 0) == dateTime1.equals(dateTime56));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = timeOfDay13.toDateTimeToday(dateTimeZone14);
        mutableDateTime8.setZoneRetainFields(dateTimeZone14);
        mutableDateTime8.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        mutableDateTime8.setZone(dateTimeZone19);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((-1L), (long) 17, chronology27);
        mutableDateTime8.setChronology(chronology27);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology27);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.minuteOfDay();
        boolean boolean32 = instant4.isBefore((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = timeOfDay37.toDateTimeToday(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime43 = dateTime39.plusDays((int) (byte) -1);
        java.util.Date date44 = dateTime43.toDate();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.Interval interval46 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, readableDuration45);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        int int49 = dateTimeZone47.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(dateTimeZone47);
        org.joda.time.ReadableDuration readableDuration51 = null;
        mutableDateTime50.add(readableDuration51, 0);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime50.dayOfWeek();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime50.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType57 = dateTimeFieldType56.getDurationType();
        mutableDateTime50.set(dateTimeFieldType56, (int) ' ');
        boolean boolean60 = interval46.isAfter((org.joda.time.ReadableInstant) mutableDateTime50);
        java.lang.Object obj61 = null;
        boolean boolean62 = interval46.equals(obj61);
        org.joda.time.Duration duration63 = interval46.toDuration();
        org.joda.time.LocalTime localTime64 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period66 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period68 = org.joda.time.Period.minutes(1);
        java.lang.String str69 = period68.toString();
        org.joda.time.Period period70 = period66.withFields((org.joda.time.ReadablePeriod) period68);
        org.joda.time.Period period72 = period70.plusMillis(100);
        org.joda.time.LocalTime localTime73 = localTime64.minus((org.joda.time.ReadablePeriod) period70);
        int int74 = period70.getMinutes();
        boolean boolean75 = duration63.equals((java.lang.Object) int74);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant4, (org.joda.time.ReadableDuration) duration63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime30", (dateTime3.compareTo(mutableDateTime30) == 0) == dateTime3.equals(mutableDateTime30));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate6.plusWeeks((int) (short) 0);
        int int11 = localDate6.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = localDate6.toDateMidnight(dateTimeZone13);
        org.joda.time.LocalDate.Property property17 = localDate6.dayOfYear();
        org.joda.time.LocalDate localDate18 = property17.roundFloorCopy();
        org.joda.time.LocalDate localDate20 = localDate18.plusYears(180);
        java.util.Date date26 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        int int27 = date26.getSeconds();
        date26.setHours((int) (byte) 1);
        org.joda.time.YearMonthDay yearMonthDay30 = org.joda.time.YearMonthDay.fromDateFields(date26);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime();
        java.util.Date date40 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate41 = org.joda.time.LocalDate.fromDateFields(date40);
        int int42 = localDate41.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime46 = localDate41.toDateTimeAtCurrentTime(dateTimeZone43);
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone43);
        mutableDateTime31.setZone(dateTimeZone43);
        org.joda.time.DateTime dateTime49 = yearMonthDay30.toDateTimeAtMidnight(dateTimeZone43);
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(dateTimeZone43);
        org.joda.time.DateTime dateTime51 = localDate20.toDateTimeAtStartOfDay(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and mutableDateTime31", (dateTime15.compareTo(mutableDateTime31) == 0) == dateTime15.equals(mutableDateTime31));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfEven();
        org.joda.time.DateTimeField dateTimeField10 = property8.getField();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.getMutableDateTime();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((-1L), (long) 17, chronology16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTimeField dateTimeField19 = chronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.yearOfCentury();
        mutableDateTime11.setChronology(chronology16);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.secondOfMinute();
        org.joda.time.Interval interval26 = new org.joda.time.Interval(readableDuration22, (org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology27 = dateTime24.getChronology();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime11, chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime24", (dateTime18.compareTo(dateTime24) == 0) == dateTime18.equals(dateTime24));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((-1L), (long) 17, chronology5);
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period8 = interval6.toPeriod(periodType7);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((int) '4', (-1), (int) (short) 100, (-1));
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((-1L), (long) 17, chronology19);
        mutablePeriod13.add((long) 26163694, chronology19);
        org.joda.time.Interval interval22 = interval6.withPeriodAfterStart((org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = timeOfDay31.toDateTimeToday(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.withCenturyOfEra(10);
        boolean boolean36 = dateTime35.isEqualNow();
        org.joda.time.Chronology chronology37 = dateTime35.getChronology();
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(15, 5, chronology37);
        org.joda.time.DurationField durationField39 = chronology37.years();
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) 26164018, chronology37);
        mutablePeriod13.add((long) (short) -1, chronology37);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(chronology37);
        org.joda.time.DateTimeField dateTimeField43 = chronology37.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField44 = chronology37.clockhourOfDay();
        org.joda.time.Period period45 = new org.joda.time.Period(1645514377359L, chronology37);
        org.joda.time.DurationField durationField46 = chronology37.eras();
        org.joda.time.DateTimeZone dateTimeZone47 = chronology37.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField39 and durationField46", Math.signum(durationField39.compareTo(durationField46)) == -Math.signum(durationField46.compareTo(durationField39)));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.yearOfEra();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 5, chronology12);
        org.joda.time.Chronology chronology14 = chronology12.withUTC();
        mutableDateTime3.setChronology(chronology12);
        org.joda.time.DurationField durationField16 = chronology12.years();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(1645514175124L);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str23 = dateTimeZone22.getID();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime26 = dateTime24.plusSeconds(17);
        int int27 = dateTime24.getHourOfDay();
        org.joda.time.DateTime dateTime29 = dateTime24.minus((long) 9);
        java.util.Date date38 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate39 = org.joda.time.LocalDate.fromDateFields(date38);
        int int40 = localDate39.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        int int43 = dateTimeZone41.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime44 = localDate39.toDateTimeAtCurrentTime(dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period49 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period51 = org.joda.time.Period.minutes(1);
        java.lang.String str52 = period51.toString();
        org.joda.time.Period period53 = period49.withFields((org.joda.time.ReadablePeriod) period51);
        org.joda.time.Period period55 = period53.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.months();
        int int57 = period55.get(durationFieldType56);
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight45.withPeriodAdded((org.joda.time.ReadablePeriod) period55, 0);
        boolean boolean60 = dateTime24.isEqual((org.joda.time.ReadableInstant) dateMidnight45);
        org.joda.time.DateMidnight.Property property61 = dateMidnight45.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone64 = dateTimeZone63.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone67 = dateTimeZone66.toTimeZone();
        boolean boolean68 = timeZone64.hasSameRules(timeZone67);
        java.util.Locale locale69 = java.util.Locale.KOREAN;
        java.util.Calendar calendar70 = java.util.Calendar.getInstance(timeZone67, locale69);
        int int72 = timeZone67.getOffset((long) 5);
        java.util.Calendar calendar73 = java.util.Calendar.getInstance(timeZone67);
        java.util.TimeZone timeZone74 = calendar73.getTimeZone();
        java.util.Locale.LanguageRange[] languageRangeArray75 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList76 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList76, languageRangeArray75);
        java.util.Locale[] localeArray78 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList79 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList79, localeArray78);
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList76, (java.util.Collection<java.util.Locale>) localeList79);
        java.util.Locale locale84 = new java.util.Locale("2022-02-22T07:16:11.187Z", "February");
        boolean boolean85 = localeList81.add(locale84);
        java.util.Calendar calendar86 = java.util.Calendar.getInstance(timeZone74, locale84);
        int int87 = property61.getMaximumTextLength(locale84);
        java.lang.String str88 = locale84.getDisplayName();
        java.lang.String str89 = dateTimeField17.getAsShortText((org.joda.time.ReadablePartial) localDateTime19, 69, locale84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime24", (mutableDateTime3.compareTo(dateTime24) == 0) == mutableDateTime3.equals(dateTime24));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfCentury(16);
        org.joda.time.DateTime dateTime11 = dateTime9.plus((long) 1);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.plus((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = timeOfDay23.toDateTimeToday(dateTimeZone24);
        mutableDateTime18.setZoneRetainFields(dateTimeZone24);
        mutableDateTime18.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        int int31 = dateTimeZone29.getStandardOffset((long) 100);
        mutableDateTime18.setZone(dateTimeZone29);
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology37 = localTime36.getChronology();
        org.joda.time.Interval interval38 = new org.joda.time.Interval((-1L), (long) 17, chronology37);
        mutableDateTime18.setChronology(chronology37);
        java.lang.String str40 = chronology37.toString();
        org.joda.time.DurationField durationField41 = chronology37.centuries();
        org.joda.time.LocalTime localTime42 = org.joda.time.LocalTime.now(chronology37);
        org.joda.time.DateTime dateTime43 = localTime42.toDateTimeToday();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        long long47 = dateTimeZone45.previousTransition((long) 8);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((java.lang.Object) dateTime43, dateTimeZone45);
        java.lang.String str49 = dateTimeZone45.getID();
        org.joda.time.DateTime dateTime50 = dateTime14.withZone(dateTimeZone45);
        org.joda.time.DateTime dateTime51 = dateTime50.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and dateTime48", (dateTime43.compareTo(dateTime48) == 0) == dateTime43.equals(dateTime48));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 5, chronology3);
        org.joda.time.Chronology chronology5 = chronology3.withUTC();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(chronology11);
        org.joda.time.Period period13 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology11);
        org.joda.time.DurationField durationField14 = chronology11.halfdays();
        long long16 = durationField14.getValueAsLong((long) (byte) 100);
        long long19 = durationField14.getMillis(4233600010L, (long) 26165226);
        long long20 = durationField14.getUnitMillis();
        int int21 = durationField6.compareTo(durationField14);
        long long24 = durationField14.add(100162491494426217L, (-292275054));
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField14, and durationField6", !(durationField6.compareTo(durationField14) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField14.compareTo(durationField6))));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean5 = dateTimeZone0.isStandardOffset((long) 10);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 5, chronology11);
        org.joda.time.Chronology chronology13 = chronology11.withUTC();
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay((long) 2022, chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, chronology13);
        int int17 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        int int22 = dateTimeZone20.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.ReadableDuration readableDuration24 = null;
        mutableDateTime23.add(readableDuration24, 0);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime23.dayOfWeek();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundFloor();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = timeOfDay39.toDateTimeToday(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.withCenturyOfEra(10);
        boolean boolean44 = dateTime43.isEqualNow();
        org.joda.time.Chronology chronology45 = dateTime43.getChronology();
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay(15, 5, chronology45);
        org.joda.time.DateTimeField dateTimeField47 = chronology45.clockhourOfDay();
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay(1L, chronology45);
        boolean boolean49 = dateTimeFieldType31.isSupported(chronology45);
        mutableDateTime29.setChronology(chronology45);
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((-68803869717836306L), (long) 54, chronology45);
        org.joda.time.DurationField durationField52 = chronology45.eras();
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime16, chronology45);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime16.minuteOfHour();
        long long55 = property54.remainder();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and mutableDateTime53", (mutableDateTime16.compareTo(mutableDateTime53) == 0) == mutableDateTime16.equals(mutableDateTime53));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 10, chronology5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod6.setPeriod(readableDuration7, chronology8);
        mutablePeriod6.setSeconds(0);
        int[] intArray13 = chronology2.get((org.joda.time.ReadablePeriod) mutablePeriod6, (long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = timeOfDay18.getFields();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.monthOfYear();
        org.joda.time.DateTime dateTime24 = dateTime21.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = timeOfDay35.toDateTimeToday(dateTimeZone36);
        mutableDateTime30.setZoneRetainFields(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime30, readableDuration39);
        boolean boolean41 = dateTime26.isBefore((org.joda.time.ReadableInstant) mutableDateTime30);
        java.lang.Object obj42 = mutableDateTime30.clone();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime46.add(readableDuration47, 0);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime46.dayOfWeek();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundFloor();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.millisOfDay();
        int int54 = mutableDateTime52.getYearOfEra();
        mutablePeriod6.setPeriod((org.joda.time.ReadableInstant) mutableDateTime30, (org.joda.time.ReadableInstant) mutableDateTime52);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) 52, dateTimeZone58);
        mutableDateTime30.setZone(dateTimeZone58);
        java.lang.String str62 = dateTimeZone58.getShortName((long) (-9));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime30", (mutableDateTime3.compareTo(mutableDateTime30) == 0) == mutableDateTime3.equals(mutableDateTime30));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = timeOfDay21.toDateTimeToday(dateTimeZone22);
        mutableDateTime16.setZoneRetainFields(dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime16, readableDuration25);
        boolean boolean27 = dateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.ReadableDuration readableDuration32 = null;
        mutableDateTime31.add(readableDuration32, 0);
        mutableDateTime16.setMillis((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime16.weekOfWeekyear();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology39 = localTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.centuryOfEra();
        mutableDateTime16.setChronology(chronology39);
        org.joda.time.DurationField durationField42 = chronology39.millis();
        org.joda.time.DurationField durationField43 = chronology39.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and mutableDateTime31", (mutableDateTime16.compareTo(mutableDateTime31) == 0) == mutableDateTime16.equals(mutableDateTime31));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.minusMillis((int) 'a');
        int int15 = dateTime14.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime14.withYear(55);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 5, chronology21);
        org.joda.time.Chronology chronology23 = chronology21.withUTC();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 10, chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod26.setPeriod(readableDuration27, chronology28);
        long long32 = chronology23.add((org.joda.time.ReadablePeriod) mutablePeriod26, (long) 32772, 6);
        org.joda.time.DateTimeField dateTimeField33 = chronology23.era();
        org.joda.time.DateTime dateTime34 = dateTime14.withChronology(chronology23);
        org.joda.time.DateTime dateTime35 = dateTime34.withLaterOffsetAtOverlap();
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = timeOfDay40.toDateTimeToday(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime46 = dateTime42.plusDays((int) (byte) -1);
        org.joda.time.DateTime dateTime48 = dateTime42.minusMonths((int) (short) 1);
        org.joda.time.DateTime dateTime50 = dateTime42.withMillis((long) (short) 10);
        org.joda.time.TimeOfDay timeOfDay56 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray57 = timeOfDay56.getFields();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = timeOfDay56.toDateTimeToday(dateTimeZone58);
        org.joda.time.DateTime.Property property60 = dateTime59.monthOfYear();
        org.joda.time.DateTime dateTime62 = dateTime59.minusMillis((int) (byte) -1);
        boolean boolean64 = dateTime59.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType66 = dateTimeFieldType65.getDurationType();
        boolean boolean67 = dateTime59.isSupported(dateTimeFieldType65);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(chronology68);
        org.joda.time.DateTime dateTime70 = dateTime69.toDateTime();
        boolean boolean71 = dateTime59.isAfter((org.joda.time.ReadableInstant) dateTime70);
        int int72 = dateTime59.getYearOfEra();
        org.joda.time.LocalTime localTime73 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period75 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period77 = org.joda.time.Period.minutes(1);
        java.lang.String str78 = period77.toString();
        org.joda.time.Period period79 = period75.withFields((org.joda.time.ReadablePeriod) period77);
        org.joda.time.Period period81 = period79.plusMillis(100);
        org.joda.time.LocalTime localTime82 = localTime73.minus((org.joda.time.ReadablePeriod) period79);
        org.joda.time.Period period84 = period79.plusHours((int) 'a');
        org.joda.time.DateTime dateTime86 = dateTime59.withPeriodAdded((org.joda.time.ReadablePeriod) period84, 5);
        org.joda.time.Period period88 = period84.plusDays(0);
        org.joda.time.PeriodType periodType89 = period84.getPeriodType();
        org.joda.time.PeriodType periodType90 = periodType89.withSecondsRemoved();
        org.joda.time.Chronology chronology91 = null;
        org.joda.time.Period period92 = new org.joda.time.Period((long) (byte) -1, periodType90, chronology91);
        org.joda.time.PeriodType periodType93 = periodType90.withWeeksRemoved();
        org.joda.time.PeriodType periodType94 = periodType93.withWeeksRemoved();
        org.joda.time.Period period95 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime50, periodType94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime35", (dateTime14.compareTo(dateTime35) == 0) == dateTime14.equals(dateTime35));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecond();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 26283);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime8.add(readableDuration9, 0);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.dayOfWeek();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundFloor();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = timeOfDay24.toDateTimeToday(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.withCenturyOfEra(10);
        boolean boolean29 = dateTime28.isEqualNow();
        org.joda.time.Chronology chronology30 = dateTime28.getChronology();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(15, 5, chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.clockhourOfDay();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(1L, chronology30);
        boolean boolean34 = dateTimeFieldType16.isSupported(chronology30);
        mutableDateTime14.setChronology(chronology30);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((-68803869717836306L), (long) 54, chronology30);
        org.joda.time.DurationField durationField37 = chronology30.eras();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(chronology30);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.secondOfDay();
        int int42 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime38, "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4", 42528);
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime49 = timeOfDay47.toDateTimeToday(dateTimeZone48);
        org.joda.time.DateTime dateTime51 = dateTime49.withCenturyOfEra(10);
        boolean boolean52 = dateTime51.isEqualNow();
        org.joda.time.Chronology chronology53 = dateTime51.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.secondOfMinute();
        org.joda.time.DurationField durationField55 = chronology53.hours();
        org.joda.time.DurationField durationField56 = chronology53.weekyears();
        org.joda.time.TimeOfDay timeOfDay61 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray62 = timeOfDay61.getFields();
        org.joda.time.Period period64 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period66 = org.joda.time.Period.minutes(1);
        java.lang.String str67 = period66.toString();
        org.joda.time.Period period68 = period64.withFields((org.joda.time.ReadablePeriod) period66);
        org.joda.time.Period period70 = period68.plusMillis(100);
        org.joda.time.Period period71 = period68.negated();
        org.joda.time.Period period73 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period75 = org.joda.time.Period.minutes(1);
        java.lang.String str76 = period75.toString();
        org.joda.time.Period period77 = period73.withFields((org.joda.time.ReadablePeriod) period75);
        org.joda.time.Period period79 = period77.plusMillis(100);
        boolean boolean80 = period71.equals((java.lang.Object) period79);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period82 = period71.withFields((org.joda.time.ReadablePeriod) mutablePeriod81);
        org.joda.time.TimeOfDay timeOfDay83 = timeOfDay61.plus((org.joda.time.ReadablePeriod) period71);
        int[] intArray86 = chronology53.get((org.joda.time.ReadablePeriod) period71, (-61031145600016L), 1645514257456L);
        org.joda.time.Period period88 = period71.multipliedBy(24);
        mutableDateTime38.add((org.joda.time.ReadablePeriod) period88, 12176);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField37 and durationField55", Math.signum(durationField37.compareTo(durationField55)) == -Math.signum(durationField55.compareTo(durationField37)));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.millisOfDay();
        org.joda.time.DurationField durationField11 = property10.getRangeDurationField();
        long long14 = durationField11.subtract((long) (byte) 100, (-11056028000L));
        org.joda.time.DurationFieldType durationFieldType15 = durationField11.getType();
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(4, (int) ' ', (int) '#');
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.minusHours((-292275054));
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay19.minusHours(16);
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.minusMinutes(116);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray34 = timeOfDay33.getFields();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = timeOfDay33.toDateTimeToday(dateTimeZone35);
        org.joda.time.Period period38 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period40 = org.joda.time.Period.minutes(1);
        java.lang.String str41 = period40.toString();
        org.joda.time.Period period42 = period38.withFields((org.joda.time.ReadablePeriod) period40);
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period44 = period38.normalizedStandard(periodType43);
        org.joda.time.Period period45 = new org.joda.time.Period(readableDuration28, (org.joda.time.ReadableInstant) dateTime36, periodType43);
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology50 = localTime49.getChronology();
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.now(chronology50);
        org.joda.time.Period period52 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology50);
        org.joda.time.DurationField durationField53 = chronology50.halfdays();
        org.joda.time.DurationField durationField54 = chronology50.days();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 28, (long) ' ', periodType43, chronology50);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        int int59 = dateTimeZone57.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(dateTimeZone57);
        org.joda.time.ReadableDuration readableDuration61 = null;
        mutableDateTime60.add(readableDuration61, 0);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime60.dayOfWeek();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime60.yearOfEra();
        org.joda.time.LocalTime localTime68 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology69 = localTime68.getChronology();
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((long) 5, chronology69);
        org.joda.time.Chronology chronology71 = chronology69.withUTC();
        mutableDateTime60.setChronology(chronology69);
        org.joda.time.DateTimeField dateTimeField73 = chronology69.weekyearOfCentury();
        mutablePeriod55.add(8380800000L, chronology69);
        org.joda.time.TimeOfDay timeOfDay75 = timeOfDay25.withChronologyRetainFields(chronology69);
        org.joda.time.DurationField durationField76 = chronology69.centuries();
        org.joda.time.DurationField durationField77 = durationFieldType15.getField(chronology69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField77", (durationField11.compareTo(durationField77) == 0) == durationField11.equals(durationField77));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.yearOfEra();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay((java.lang.Object) mutableDateTime3);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.plusMonths(7);
        org.joda.time.Chronology chronology12 = yearMonthDay11.getChronology();
        org.joda.time.DateMidnight dateMidnight13 = org.joda.time.DateMidnight.now(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime14", (mutableDateTime3.compareTo(mutableDateTime14) == 0) == mutableDateTime3.equals(mutableDateTime14));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        java.lang.String str11 = period10.toString();
        org.joda.time.Period period12 = period8.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period12.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.months();
        int int16 = period14.get(durationFieldType15);
        mutableDateTime3.add(durationFieldType15, 7);
        mutableDateTime3.addSeconds((-292275054));
        long long21 = mutableDateTime3.getMillis();
        mutableDateTime3.setMillisOfSecond(24);
        mutableDateTime3.setDate((long) (-5599659));
        mutableDateTime3.setMinuteOfDay(16);
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) (short) 100);
        int int30 = localTime29.getMillisOfDay();
        org.joda.time.LocalTime localTime32 = localTime29.withMillisOfSecond((int) ' ');
        org.joda.time.LocalTime localTime34 = localTime29.withSecondOfMinute(4);
        org.joda.time.DateTime dateTime35 = localTime34.toDateTimeToday();
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology40 = localTime39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(chronology40);
        org.joda.time.Period period42 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology40);
        org.joda.time.DurationField durationField43 = chronology40.halfdays();
        org.joda.time.DateTimeField dateTimeField44 = chronology40.halfdayOfDay();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(chronology40);
        org.joda.time.DateTimeField dateTimeField46 = chronology40.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime35, chronology40);
        mutableDateTime3.setMillis((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime3.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and mutableDateTime47", (dateTime35.compareTo(mutableDateTime47) == 0) == dateTime35.equals(mutableDateTime47));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTime.Property property10 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property10.withMaximumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.plusWeeks(5603523);
        int int14 = dateTime13.getMinuteOfDay();
        org.joda.time.DateTime dateTime16 = dateTime13.withYearOfEra(26324141);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.millis();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology24);
        org.joda.time.Period period26 = new org.joda.time.Period((long) 25, (long) (-1), periodType21, chronology24);
        java.lang.String str27 = periodType21.toString();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology31 = localTime30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.hours();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay((long) 38, chronology31);
        org.joda.time.Period period34 = new org.joda.time.Period((long) 14, 52L, periodType21, chronology31);
        org.joda.time.DateTime dateTime35 = dateTime13.toDateTime(chronology31);
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray41 = timeOfDay40.getFields();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = timeOfDay40.toDateTimeToday(dateTimeZone42);
        org.joda.time.DateTime.Property property44 = dateTime43.monthOfYear();
        org.joda.time.DateTime dateTime46 = dateTime43.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = dateTime46.toDateTime(chronology47);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        int int51 = dateTimeZone49.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone49);
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime59 = timeOfDay57.toDateTimeToday(dateTimeZone58);
        mutableDateTime52.setZoneRetainFields(dateTimeZone58);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime52, readableDuration61);
        boolean boolean63 = dateTime48.isBefore((org.joda.time.ReadableInstant) mutableDateTime52);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        int int66 = dateTimeZone64.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(dateTimeZone64);
        org.joda.time.ReadableDuration readableDuration68 = null;
        mutableDateTime67.add(readableDuration68, 0);
        mutableDateTime52.setMillis((org.joda.time.ReadableInstant) mutableDateTime67);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str74 = dateTimeZone73.getID();
        java.util.Locale locale76 = java.util.Locale.KOREAN;
        java.util.Locale locale78 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str79 = locale76.getDisplayVariant(locale78);
        java.lang.String str80 = dateTimeZone73.getName((long) 5, locale76);
        org.joda.time.DateMidnight dateMidnight81 = new org.joda.time.DateMidnight((java.lang.Object) mutableDateTime67, dateTimeZone73);
        org.joda.time.DateMidnight dateMidnight82 = org.joda.time.DateMidnight.now(dateTimeZone73);
        org.joda.time.Chronology chronology83 = chronology31.withZone(dateTimeZone73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime35", (dateTime13.compareTo(dateTime35) == 0) == dateTime13.equals(dateTime35));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = dateTimeZone1.getName((long) 5, locale4);
        java.lang.String str9 = locale4.getVariant();
        java.lang.String str10 = locale4.getDisplayName();
        java.lang.String str11 = locale4.getVariant();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0, (int) '4', chronology14);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.plusMinutes(1899);
        org.joda.time.TimeOfDay.Property property18 = timeOfDay15.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        boolean boolean25 = timeZone21.hasSameRules(timeZone24);
        java.util.Locale locale26 = java.util.Locale.KOREAN;
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone24, locale26);
        int int28 = property18.getMaximumTextLength(locale26);
        java.lang.String str29 = locale26.getDisplayScript();
        java.util.Set<java.lang.String> strSet30 = locale26.getUnicodeLocaleKeys();
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(locale26);
        java.lang.String str32 = locale4.getDisplayScript(locale26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar31", (calendar27.compareTo(calendar31) == 0) == calendar27.equals(calendar31));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = timeOfDay9.toDateTimeToday(dateTimeZone10);
        mutableDateTime4.setZoneRetainFields(dateTimeZone10);
        mutableDateTime4.setSecondOfMinute((int) (short) 0);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.hours();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(readableDuration0, (org.joda.time.ReadableInstant) mutableDateTime4, periodType15);
        org.joda.time.PeriodType periodType17 = periodType15.withHoursRemoved();
        org.joda.time.PeriodType periodType18 = periodType17.withMinutesRemoved();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.millis();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Period period23 = org.joda.time.Period.minutes(1);
        java.lang.String str24 = period23.toString();
        org.joda.time.LocalTime localTime25 = localTime21.plus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 10, chronology27);
        org.joda.time.Chronology chronology30 = null;
        mutablePeriod28.setPeriod((long) 0, chronology30);
        org.joda.time.LocalTime localTime33 = localTime25.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod28, 55);
        org.joda.time.Period period35 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period37 = org.joda.time.Period.minutes(1);
        java.lang.String str38 = period37.toString();
        org.joda.time.Period period39 = period35.withFields((org.joda.time.ReadablePeriod) period37);
        int int40 = period35.getMinutes();
        int int41 = period35.size();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray48 = timeOfDay47.getFields();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = timeOfDay47.toDateTimeToday(dateTimeZone49);
        org.joda.time.Period period52 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period54 = org.joda.time.Period.minutes(1);
        java.lang.String str55 = period54.toString();
        org.joda.time.Period period56 = period52.withFields((org.joda.time.ReadablePeriod) period54);
        org.joda.time.PeriodType periodType57 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period58 = period52.normalizedStandard(periodType57);
        org.joda.time.Period period59 = new org.joda.time.Period(readableDuration42, (org.joda.time.ReadableInstant) dateTime50, periodType57);
        org.joda.time.PeriodType periodType60 = periodType57.withMillisRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType62 = dateTimeFieldType61.getDurationType();
        boolean boolean63 = periodType60.isSupported(durationFieldType62);
        int int64 = period35.get(durationFieldType62);
        org.joda.time.LocalTime localTime66 = localTime33.withFieldAdded(durationFieldType62, 2000);
        boolean boolean67 = periodType19.isSupported(durationFieldType62);
        int int68 = periodType18.indexOf(durationFieldType62);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        int int71 = dateTimeZone69.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(dateTimeZone69);
        org.joda.time.TimeOfDay timeOfDay77 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime79 = timeOfDay77.toDateTimeToday(dateTimeZone78);
        mutableDateTime72.setZoneRetainFields(dateTimeZone78);
        mutableDateTime72.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.getDefault();
        int int85 = dateTimeZone83.getStandardOffset((long) 100);
        mutableDateTime72.setZone(dateTimeZone83);
        org.joda.time.LocalTime localTime90 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology91 = localTime90.getChronology();
        org.joda.time.Interval interval92 = new org.joda.time.Interval((-1L), (long) 17, chronology91);
        mutableDateTime72.setChronology(chronology91);
        org.joda.time.DurationField durationField94 = chronology91.halfdays();
        org.joda.time.DurationFieldType durationFieldType95 = durationField94.getType();
        org.joda.time.Chronology chronology96 = null;
        boolean boolean97 = durationFieldType95.isSupported(chronology96);
        boolean boolean98 = periodType18.isSupported(durationFieldType95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and mutableDateTime72", (mutableDateTime4.compareTo(mutableDateTime72) == 0) == mutableDateTime4.equals(mutableDateTime72));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, 0);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfEven();
        boolean boolean13 = interval2.isBefore((org.joda.time.ReadableInstant) mutableDateTime12);
        int int14 = mutableDateTime12.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        mutableDateTime12.set(dateTimeFieldType15, 15);
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str22 = locale19.getDisplayVariant(locale21);
        java.util.Calendar calendar23 = mutableDateTime12.toCalendar(locale19);
        calendar23.setFirstDayOfWeek(2);
        int int26 = calendar23.getMinimalDaysInFirstWeek();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance();
        boolean boolean28 = calendar27.isWeekDateSupported();
        calendar27.setTimeInMillis((long) 52);
        java.util.Date date31 = calendar27.getTime();
        calendar23.setTime(date31);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology36 = localTime35.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) 5, chronology36);
        org.joda.time.Chronology chronology38 = chronology36.withUTC();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 10, chronology40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.Chronology chronology43 = null;
        mutablePeriod41.setPeriod(readableDuration42, chronology43);
        long long47 = chronology38.add((org.joda.time.ReadablePeriod) mutablePeriod41, (long) 32772, 6);
        org.joda.time.Period period48 = mutablePeriod41.toPeriod();
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime55 = timeOfDay53.toDateTimeToday(dateTimeZone54);
        org.joda.time.DateTime dateTime57 = dateTime55.withCenturyOfEra(10);
        org.joda.time.Period period59 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period61 = org.joda.time.Period.minutes(1);
        java.lang.String str62 = period61.toString();
        org.joda.time.Period period63 = period59.withFields((org.joda.time.ReadablePeriod) period61);
        org.joda.time.Period period65 = period63.plusMillis(100);
        org.joda.time.Period period66 = period63.negated();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType68 = dateTimeFieldType67.getDurationType();
        boolean boolean69 = period63.isSupported(durationFieldType68);
        org.joda.time.Period period71 = period63.minusYears(0);
        org.joda.time.DateTime dateTime72 = dateTime57.minus((org.joda.time.ReadablePeriod) period71);
        org.joda.time.DateTime.Property property73 = dateTime57.hourOfDay();
        org.joda.time.DateTime dateTime74 = property73.roundFloorCopy();
        org.joda.time.Interval interval75 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) mutablePeriod41, (org.joda.time.ReadableInstant) dateTime74);
        org.joda.time.format.PeriodFormatter periodFormatter76 = null;
        java.lang.String str77 = mutablePeriod41.toString(periodFormatter76);
        org.joda.time.PeriodType periodType78 = mutablePeriod41.getPeriodType();
        mutablePeriod41.setMonths(26405449);
        boolean boolean81 = date31.equals((java.lang.Object) mutablePeriod41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar23 and calendar27", (calendar23.compareTo(calendar27) == 0) == calendar23.equals(calendar27));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.LocalTime localTime5 = localTime1.plus((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.secondOfMinute();
        java.lang.String str9 = property8.getAsString();
        boolean boolean10 = localTime1.equals((java.lang.Object) str9);
        org.joda.time.LocalTime localTime12 = localTime1.minusMinutes(13);
        org.joda.time.LocalTime localTime14 = localTime1.minusHours(38090);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType18 = periodType17.withDaysRemoved();
        org.joda.time.Period period19 = new org.joda.time.Period(4233600010L, (long) 14, periodType18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str22 = dateTimeZone21.getID();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime25 = dateTime23.plusSeconds(17);
        int int26 = dateTime23.getHourOfDay();
        org.joda.time.DateTime dateTime28 = dateTime23.minus((long) 9);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = timeOfDay35.toDateTimeToday(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.minus((long) (short) 0);
        org.joda.time.Period period41 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period43 = org.joda.time.Period.minutes(1);
        java.lang.String str44 = period43.toString();
        org.joda.time.Period period45 = period41.withFields((org.joda.time.ReadablePeriod) period43);
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period47 = period41.normalizedStandard(periodType46);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(readableDuration30, (org.joda.time.ReadableInstant) dateTime39, periodType46);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime28, readableDuration29, periodType46);
        org.joda.time.DurationFieldType durationFieldType50 = org.joda.time.DurationFieldType.halfdays();
        int int51 = periodType46.indexOf(durationFieldType50);
        boolean boolean52 = periodType18.isSupported(durationFieldType50);
        org.joda.time.LocalTime localTime54 = localTime14.withFieldAdded(durationFieldType50, 436);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        int int57 = dateTimeZone55.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(dateTimeZone55);
        org.joda.time.ReadableDuration readableDuration59 = null;
        mutableDateTime58.add(readableDuration59, 0);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime58.dayOfWeek();
        int int63 = mutableDateTime58.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        int int66 = dateTimeZone64.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(dateTimeZone64);
        org.joda.time.TimeOfDay timeOfDay72 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime74 = timeOfDay72.toDateTimeToday(dateTimeZone73);
        mutableDateTime67.setZoneRetainFields(dateTimeZone73);
        int int76 = mutableDateTime67.getMillisOfDay();
        int int77 = mutableDateTime67.getWeekOfWeekyear();
        int int78 = mutableDateTime67.getWeekOfWeekyear();
        org.joda.time.TimeOfDay timeOfDay83 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray84 = timeOfDay83.getFields();
        org.joda.time.DateTimeZone dateTimeZone85 = null;
        org.joda.time.DateTime dateTime86 = timeOfDay83.toDateTimeToday(dateTimeZone85);
        org.joda.time.DateTime.Property property87 = dateTime86.monthOfYear();
        org.joda.time.DateTime dateTime89 = dateTime86.minusMillis((int) (byte) -1);
        boolean boolean91 = dateTime86.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType92 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType93 = dateTimeFieldType92.getDurationType();
        boolean boolean94 = dateTime86.isSupported(dateTimeFieldType92);
        org.joda.time.MutableDateTime.Property property95 = mutableDateTime67.property(dateTimeFieldType92);
        boolean boolean96 = mutableDateTime58.isSupported(dateTimeFieldType92);
        org.joda.time.DurationFieldType durationFieldType97 = dateTimeFieldType92.getDurationType();
        boolean boolean98 = localTime54.isSupported(dateTimeFieldType92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime23", (dateTime7.compareTo(dateTime23) == 0) == dateTime7.equals(dateTime23));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        boolean boolean10 = timeZone6.hasSameRules(timeZone9);
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone9, locale11);
        org.joda.time.DateTime dateTime13 = property2.setCopy("6", locale11);
        org.joda.time.DateTime dateTime14 = property2.roundFloorCopy();
        org.joda.time.DateTime dateTime15 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime17 = dateTime15.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableDateTime21.add(readableDuration22, 0);
        mutableDateTime21.setYear((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod();
        mutablePeriod27.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology31 = null;
        mutablePeriod27.setPeriod((long) 15, chronology31);
        mutablePeriod27.setMinutes(1970);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology40 = localTime39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) 5, chronology40);
        org.joda.time.Chronology chronology42 = chronology40.withUTC();
        mutablePeriod27.setPeriod((long) 0, (long) 1, chronology42);
        mutableDateTime21.setChronology(chronology42);
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray50 = timeOfDay49.getFields();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = timeOfDay49.toDateTimeToday(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str55 = dateTimeZone54.getID();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(dateTimeZone54);
        org.joda.time.DateTime dateTime57 = timeOfDay49.toDateTimeToday(dateTimeZone54);
        int int58 = mutableDateTime21.compareTo((org.joda.time.ReadableInstant) dateTime57);
        boolean boolean59 = dateTime15.isAfter((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str62 = dateTimeZone61.getID();
        java.util.Locale locale64 = java.util.Locale.KOREAN;
        java.util.Locale locale66 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str67 = locale64.getDisplayVariant(locale66);
        java.lang.String str68 = dateTimeZone61.getName((long) 5, locale64);
        mutableDateTime21.setZone(dateTimeZone61);
        int int71 = dateTimeZone61.getOffset(1571430300000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime56", (dateTime1.compareTo(dateTime56) == 0) == dateTime1.equals(dateTime56));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(chronology4);
        org.joda.time.Period period6 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology4);
        org.joda.time.DurationField durationField7 = chronology4.halfdays();
        org.joda.time.DurationField durationField8 = chronology4.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology4.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        int int10 = localDate9.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period23.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.months();
        int int27 = period25.get(durationFieldType26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight15.withPeriodAdded((org.joda.time.ReadablePeriod) period25, 0);
        org.joda.time.DateMidnight.Property property30 = dateMidnight15.monthOfYear();
        org.joda.time.DateMidnight dateMidnight32 = property30.addToCopy(15);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.withYearOfCentury(55);
        int int35 = dateMidnight32.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight32.minus(readablePeriod36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.plusDays((-2));
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str42 = dateTimeZone41.getID();
        org.joda.time.DateMidnight dateMidnight43 = org.joda.time.DateMidnight.now(dateTimeZone41);
        int int45 = dateTimeZone41.getOffsetFromLocal(10L);
        java.lang.String str47 = dateTimeZone41.getShortName((long) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight37.toMutableDateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime48.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime48.copy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight32 and mutableDateTime49", (dateMidnight32.compareTo(mutableDateTime49) == 0) == dateMidnight32.equals(mutableDateTime49));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutableDateTime4.add(readableDuration5, 0);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime4.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime4.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundFloor();
        int int13 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime10, "3172001", 3);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod();
        mutablePeriod15.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod15.setPeriod((long) 15, chronology19);
        mutablePeriod15.setMinutes(1970);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) 5, chronology28);
        org.joda.time.Chronology chronology30 = chronology28.withUTC();
        mutablePeriod15.setPeriod((long) 0, (long) 1, chronology30);
        org.joda.time.PeriodType periodType32 = mutablePeriod15.getPeriodType();
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology35 = localTime34.getChronology();
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(chronology35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 10, chronology38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod39.setPeriod(readableDuration40, chronology41);
        mutablePeriod39.setSeconds(0);
        int[] intArray46 = chronology35.get((org.joda.time.ReadablePeriod) mutablePeriod39, (long) (short) -1);
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology52 = localTime51.getChronology();
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) 5, chronology52);
        org.joda.time.Chronology chronology54 = chronology52.withUTC();
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay((long) 2022, chronology54);
        org.joda.time.LocalTime localTime56 = org.joda.time.LocalTime.now(chronology54);
        mutablePeriod39.add((long) (short) 10, chronology54);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(chronology54);
        org.joda.time.DateTime dateTime59 = org.joda.time.DateTime.now(chronology54);
        org.joda.time.Period period60 = new org.joda.time.Period((long) (-9), periodType32, chronology54);
        mutableDateTime10.add((org.joda.time.ReadablePeriod) period60, (int) (short) 1);
        org.joda.time.LocalTime localTime65 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology66 = localTime65.getChronology();
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime((long) 5, chronology66);
        org.joda.time.Chronology chronology68 = chronology66.withUTC();
        org.joda.time.DateTimeZone dateTimeZone69 = chronology68.getZone();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime(chronology70);
        org.joda.time.DateTime dateTime72 = dateTime71.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str75 = dateTimeZone74.getID();
        java.util.Locale locale77 = java.util.Locale.KOREAN;
        java.util.Locale locale79 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str80 = locale77.getDisplayVariant(locale79);
        java.lang.String str81 = dateTimeZone74.getName((long) 5, locale77);
        org.joda.time.DateTime dateTime82 = dateTime72.withZoneRetainFields(dateTimeZone74);
        org.joda.time.Chronology chronology83 = chronology68.withZone(dateTimeZone74);
        java.lang.String str84 = dateTimeZone74.getID();
        org.joda.time.LocalTime localTime85 = new org.joda.time.LocalTime((java.lang.Object) mutableDateTime10, dateTimeZone74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime36 and dateTime71", (mutableDateTime36.compareTo(dateTime71) == 0) == mutableDateTime36.equals(dateTime71));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.yearOfEra();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 5, chronology12);
        org.joda.time.Chronology chronology14 = chronology12.withUTC();
        mutableDateTime3.setChronology(chronology12);
        org.joda.time.DateTimeField dateTimeField16 = chronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.weekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.millisOfDay();
        java.lang.String str20 = dateTimeField18.getAsShortText(1191456000000L);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray26 = timeOfDay25.getFields();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = timeOfDay25.toDateTimeToday(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str31 = dateTimeZone30.getID();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = timeOfDay25.toDateTimeToday(dateTimeZone30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = org.joda.time.format.ISODateTimeFormat.basicWeekDateTimeNoMillis();
        java.lang.String str35 = timeOfDay25.toString(dateTimeFormatter34);
        java.util.Locale.Builder builder37 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder38 = builder37.clear();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 10, chronology40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.withMinuteOfHour(0);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) 10, chronology45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime43.withFields((org.joda.time.ReadablePartial) localDateTime46);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 10, chronology53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime49.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod54, 15);
        org.joda.time.LocalDateTime.Property property57 = localDateTime49.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str61 = dateTimeZone60.getID();
        java.util.Locale locale63 = java.util.Locale.KOREAN;
        java.util.Locale locale65 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str66 = locale63.getDisplayVariant(locale65);
        java.lang.String str67 = dateTimeZone60.getName((long) 5, locale63);
        org.joda.time.LocalDateTime localDateTime68 = property57.setCopy("18", locale63);
        java.util.Set<java.lang.Character> charSet69 = locale63.getExtensionKeys();
        java.util.Locale.Builder builder70 = builder37.setLocale(locale63);
        java.util.Locale locale71 = java.util.Locale.TAIWAN;
        java.lang.String str73 = locale71.getExtension('u');
        java.util.Locale.Builder builder74 = builder37.setLocale(locale71);
        java.util.Locale locale75 = builder37.build();
        java.lang.String str76 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) timeOfDay25, 459, locale75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime32", (mutableDateTime3.compareTo(dateTime32) == 0) == mutableDateTime3.equals(dateTime32));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(10);
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(1);
        java.lang.String str13 = period12.toString();
        org.joda.time.Period period14 = period10.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period16 = period14.plusMillis(100);
        org.joda.time.Period period17 = period14.negated();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        boolean boolean20 = period14.isSupported(durationFieldType19);
        org.joda.time.Period period22 = period14.minusYears(0);
        org.joda.time.DateTime dateTime23 = dateTime8.minus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.DateTime.Property property24 = dateTime8.hourOfDay();
        org.joda.time.DateTime dateTime25 = property24.getDateTime();
        org.joda.time.DateTime dateTime27 = property24.setCopy(0);
        org.joda.time.DateTime dateTime28 = property24.withMinimumValue();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology33 = localTime32.getChronology();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((-1L), (long) 17, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology33);
        org.joda.time.DateTimeField dateTimeField36 = chronology33.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.yearOfCentury();
        org.joda.time.DateTime dateTime38 = dateTime28.withChronology(chronology33);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime41 = dateTime38.withPeriodAdded(readablePeriod39, 71);
        org.joda.time.DateTime dateTime43 = dateTime41.minusYears(107);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime41", (dateTime8.compareTo(dateTime41) == 0) == dateTime8.equals(dateTime41));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.millis();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(chronology10);
        org.joda.time.Period period12 = new org.joda.time.Period((long) 25, (long) (-1), periodType7, chronology10);
        org.joda.time.PeriodType periodType13 = periodType7.withWeeksRemoved();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((-1L), (long) 17, chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.secondOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.yearOfCentury();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology18);
        org.joda.time.Period period23 = new org.joda.time.Period(345600000L, (long) '#', periodType7, chronology18);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(chronology28);
        org.joda.time.Period period30 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology28);
        org.joda.time.DurationField durationField31 = chronology28.halfdays();
        org.joda.time.DateTimeField dateTimeField32 = chronology28.halfdayOfDay();
        org.joda.time.Period period33 = new org.joda.time.Period(0L, (long) 55, periodType7, chronology28);
        org.joda.time.DurationFieldType durationFieldType34 = null;
        int int35 = periodType7.indexOf(durationFieldType34);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        int int38 = dateTimeZone36.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutableDateTime39.add(readableDuration40, 0);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime39.dayOfWeek();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime45 = property44.roundHalfEven();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime45.centuryOfEra();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime45.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        int int51 = dateTimeZone49.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone49);
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime59 = timeOfDay57.toDateTimeToday(dateTimeZone58);
        mutableDateTime52.setZoneRetainFields(dateTimeZone58);
        mutableDateTime52.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.getDefault();
        int int65 = dateTimeZone63.getStandardOffset((long) 100);
        mutableDateTime52.setZone(dateTimeZone63);
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology71 = localTime70.getChronology();
        org.joda.time.Interval interval72 = new org.joda.time.Interval((-1L), (long) 17, chronology71);
        mutableDateTime52.setChronology(chronology71);
        java.lang.String str74 = chronology71.toString();
        org.joda.time.TimeOfDay timeOfDay79 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime81 = timeOfDay79.toDateTimeToday(dateTimeZone80);
        org.joda.time.Chronology chronology82 = chronology71.withZone(dateTimeZone80);
        org.joda.time.MutableDateTime mutableDateTime83 = new org.joda.time.MutableDateTime(chronology82);
        org.joda.time.Period period84 = new org.joda.time.Period((long) 53, chronology82);
        org.joda.time.DateTimeField dateTimeField85 = chronology82.weekyear();
        mutableDateTime45.setChronology(chronology82);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod(26304819L, periodType7, chronology82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and mutableDateTime83", (mutableDateTime11.compareTo(mutableDateTime83) == 0) == mutableDateTime11.equals(mutableDateTime83));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.date();
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str4 = dateTimeZone3.getID();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 16, dateTimeZone6);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 10, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMinuteOfHour(0);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 10, chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.withFields((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime15.withDurationAdded(readableDuration22, (int) (byte) 10);
        boolean boolean25 = dateTimeZone6.isLocalDateTimeGap(localDateTime15);
        boolean boolean26 = dateTimeZone3.isLocalDateTimeGap(localDateTime15);
        org.joda.time.Chronology chronology27 = localDateTime15.getChronology();
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(chronology27);
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter0.withChronology(chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and dateTime29", (mutableDateTime9.compareTo(dateTime29) == 0) == mutableDateTime9.equals(dateTime29));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 5, chronology4);
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 3172001, chronology4);
        org.joda.time.DurationField durationField7 = chronology4.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology4);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.yearOfEra();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 10, chronology16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Chronology chronology19 = null;
        mutablePeriod17.setPeriod(readableDuration18, chronology19);
        mutablePeriod17.setSeconds(0);
        int[] intArray24 = chronology13.get((org.joda.time.ReadablePeriod) mutablePeriod17, (long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray30 = timeOfDay29.getFields();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = timeOfDay29.toDateTimeToday(dateTimeZone31);
        org.joda.time.DateTime.Property property33 = dateTime32.monthOfYear();
        org.joda.time.DateTime dateTime35 = dateTime32.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.toDateTime(chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        int int40 = dateTimeZone38.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime48 = timeOfDay46.toDateTimeToday(dateTimeZone47);
        mutableDateTime41.setZoneRetainFields(dateTimeZone47);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime41, readableDuration50);
        boolean boolean52 = dateTime37.isBefore((org.joda.time.ReadableInstant) mutableDateTime41);
        java.lang.Object obj53 = mutableDateTime41.clone();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        int int56 = dateTimeZone54.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(dateTimeZone54);
        org.joda.time.ReadableDuration readableDuration58 = null;
        mutableDateTime57.add(readableDuration58, 0);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime57.dayOfWeek();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime57.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime63 = property62.roundFloor();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime63.millisOfDay();
        int int65 = mutableDateTime63.getYearOfEra();
        mutablePeriod17.setPeriod((org.joda.time.ReadableInstant) mutableDateTime41, (org.joda.time.ReadableInstant) mutableDateTime63);
        boolean boolean68 = mutableDateTime41.isBefore((long) 1970);
        java.util.Date date74 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        date74.setMinutes(54);
        org.joda.time.TimeOfDay timeOfDay77 = org.joda.time.TimeOfDay.fromDateFields(date74);
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = timeOfDay77.getFieldType(2);
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime41.property(dateTimeFieldType79);
        boolean boolean81 = mutableDateTime9.isSupported(dateTimeFieldType79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and mutableDateTime41", (mutableDateTime14.compareTo(mutableDateTime41) == 0) == mutableDateTime14.equals(mutableDateTime41));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str3 = dateTimeZone2.getID();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime6 = dateTime4.plusSeconds(17);
        int int7 = dateTime4.getHourOfDay();
        org.joda.time.DateTime dateTime9 = dateTime4.minus((long) 9);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = timeOfDay16.toDateTimeToday(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.minus((long) (short) 0);
        org.joda.time.Period period22 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period24 = org.joda.time.Period.minutes(1);
        java.lang.String str25 = period24.toString();
        org.joda.time.Period period26 = period22.withFields((org.joda.time.ReadablePeriod) period24);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period28 = period22.normalizedStandard(periodType27);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(readableDuration11, (org.joda.time.ReadableInstant) dateTime20, periodType27);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime9, readableDuration10, periodType27);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.halfdays();
        int int32 = periodType27.indexOf(durationFieldType31);
        mutableDateTime0.add(durationFieldType31, 3);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        int int40 = dateTimeZone38.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.ReadableDuration readableDuration42 = null;
        mutableDateTime41.add(readableDuration42, 0);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime41.dayOfWeek();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime41.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime47 = property46.roundFloor();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.TimeOfDay timeOfDay57 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime59 = timeOfDay57.toDateTimeToday(dateTimeZone58);
        org.joda.time.DateTime dateTime61 = dateTime59.withCenturyOfEra(10);
        boolean boolean62 = dateTime61.isEqualNow();
        org.joda.time.Chronology chronology63 = dateTime61.getChronology();
        org.joda.time.TimeOfDay timeOfDay64 = new org.joda.time.TimeOfDay(15, 5, chronology63);
        org.joda.time.DateTimeField dateTimeField65 = chronology63.clockhourOfDay();
        org.joda.time.TimeOfDay timeOfDay66 = new org.joda.time.TimeOfDay(1L, chronology63);
        boolean boolean67 = dateTimeFieldType49.isSupported(chronology63);
        mutableDateTime47.setChronology(chronology63);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((-68803869717836306L), (long) 54, chronology63);
        org.joda.time.DurationField durationField70 = chronology63.eras();
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight(52254751446427999L, chronology63);
        org.joda.time.DateTimeField dateTimeField72 = chronology63.minuteOfDay();
        mutableDateTime0.setChronology(chronology63);
        org.joda.time.DurationField durationField74 = chronology63.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField70, durationField74, and durationField70", !(durationField70.compareTo(durationField74) == 0) || (Math.signum(durationField70.compareTo(durationField70)) == Math.signum(durationField74.compareTo(durationField70))));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        boolean boolean12 = dateTime7.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getDurationType();
        boolean boolean15 = dateTime7.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime dateTime18 = dateTime17.toDateTime();
        boolean boolean19 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime22 = dateTime7.withWeekyear((-60));
        org.joda.time.Period period24 = org.joda.time.Period.minutes(1);
        java.lang.String str25 = period24.toString();
        org.joda.time.Period period27 = period24.plusWeeks(17);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(chronology32);
        org.joda.time.Period period34 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology32);
        org.joda.time.Period period36 = period34.minusHours(53);
        org.joda.time.Period period38 = period34.withWeeks((int) '#');
        org.joda.time.Period period39 = period24.withFields((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Period period41 = period34.multipliedBy(29);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        int int44 = dateTimeZone42.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.ReadableDuration readableDuration46 = null;
        mutableDateTime45.add(readableDuration46, 0);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime45.dayOfWeek();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime51 = property50.roundFloor();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime51.millisOfDay();
        org.joda.time.DurationField durationField53 = property52.getRangeDurationField();
        int int56 = durationField53.getDifference(16L, (long) 2000);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        int int59 = dateTimeZone57.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(dateTimeZone57);
        org.joda.time.TimeOfDay timeOfDay65 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime67 = timeOfDay65.toDateTimeToday(dateTimeZone66);
        mutableDateTime60.setZoneRetainFields(dateTimeZone66);
        mutableDateTime60.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.getDefault();
        int int73 = dateTimeZone71.getStandardOffset((long) 100);
        mutableDateTime60.setZone(dateTimeZone71);
        org.joda.time.LocalTime localTime78 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology79 = localTime78.getChronology();
        org.joda.time.Interval interval80 = new org.joda.time.Interval((-1L), (long) 17, chronology79);
        mutableDateTime60.setChronology(chronology79);
        java.lang.String str82 = chronology79.toString();
        org.joda.time.DurationField durationField83 = chronology79.centuries();
        org.joda.time.DurationField durationField84 = chronology79.weeks();
        int int85 = durationField53.compareTo(durationField84);
        long long88 = durationField53.add((-6652799968L), (long) 12);
        org.joda.time.DurationFieldType durationFieldType89 = durationField53.getType();
        org.joda.time.Period period91 = period34.withFieldAdded(durationFieldType89, 26286964);
        org.joda.time.DateTime dateTime93 = dateTime22.withFieldAdded(durationFieldType89, 26550);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and mutableDateTime33", (dateTime17.compareTo(mutableDateTime33) == 0) == dateTime17.equals(mutableDateTime33));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.add(8);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime10.copy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant11", (mutableDateTime10.compareTo(instant11) == 0) == mutableDateTime10.equals(instant11));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        mutableDateTime3.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        mutableDateTime3.setZone(dateTimeZone14);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((-1L), (long) 17, chronology22);
        mutableDateTime3.setChronology(chronology22);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime3.copy();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.joda.time.DateTime dateTime28 = mutableDateTime3.toDateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(45);
        int int31 = dateTime28.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property32 = dateTime28.monthOfYear();
        org.joda.time.DateTime dateTime34 = dateTime28.withWeekyear(5026);
        int int35 = dateTime34.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime28", (mutableDateTime3.compareTo(dateTime28) == 0) == mutableDateTime3.equals(dateTime28));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getHourOfDay();
        org.joda.time.DateTime dateTime3 = dateTime0.minus((long) 256);
        java.util.Date date9 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.fromDateFields(date9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate10.plusWeeks((int) (short) 0);
        int int15 = localDate10.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight20 = localDate10.toDateMidnight(dateTimeZone17);
        java.util.Date date26 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.fromDateFields(date26);
        int int28 = localDate27.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        int int31 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime32 = localDate27.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight20.withZoneRetainFields(dateTimeZone29);
        java.lang.String str35 = dateTimeZone29.getID();
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight37 = org.joda.time.DateMidnight.now(dateTimeZone29);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(dateTimeZone29);
        org.joda.time.Period period40 = org.joda.time.Period.minutes(1);
        java.lang.String str41 = period40.toString();
        org.joda.time.Period period43 = period40.plusWeeks(17);
        boolean boolean44 = dateTimeZone29.equals((java.lang.Object) period40);
        org.joda.time.DateTime dateTime45 = dateTime3.toDateTime(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime19", (dateTime0.compareTo(dateTime19) == 0) == dateTime0.equals(dateTime19));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        java.util.Date date6 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromDateFields(date6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate7.plusWeeks((int) (short) 0);
        int int12 = localDate7.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str15 = dateTimeZone14.getID();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = localDate7.toDateMidnight(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 1899, dateTimeZone19);
        long long24 = dateTimeZone19.nextTransition((long) 0);
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay(dateTimeZone19);
        long long27 = dateTimeZone19.convertUTCToLocal((long) (short) 0);
        org.joda.time.DateTime dateTime28 = localDate7.toDateTimeAtStartOfDay(dateTimeZone19);
        int int29 = localDate7.getEra();
        org.joda.time.LocalDate localDate31 = localDate7.withYearOfCentury(9);
        int int32 = localDate31.getWeekOfWeekyear();
        int int33 = localDate31.getCenturyOfEra();
        org.joda.time.LocalDate.Property property34 = localDate31.weekOfWeekyear();
        org.joda.time.LocalDate localDate36 = localDate31.withCenturyOfEra(1969);
        java.util.Date date43 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        int int44 = date43.getSeconds();
        date43.setHours((int) (byte) 1);
        org.joda.time.YearMonthDay yearMonthDay47 = org.joda.time.YearMonthDay.fromDateFields(date43);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime();
        java.util.Date date57 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate58 = org.joda.time.LocalDate.fromDateFields(date57);
        int int59 = localDate58.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        int int62 = dateTimeZone60.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime63 = localDate58.toDateTimeAtCurrentTime(dateTimeZone60);
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone60);
        mutableDateTime48.setZone(dateTimeZone60);
        org.joda.time.DateTime dateTime66 = yearMonthDay47.toDateTimeAtMidnight(dateTimeZone60);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(16L, dateTimeZone60);
        java.lang.String str69 = dateTimeZone60.getShortName((long) 26389852);
        org.joda.time.DateMidnight dateMidnight70 = localDate31.toDateMidnight(dateTimeZone60);
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime((long) 439, dateTimeZone60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and mutableDateTime48", (dateTime16.compareTo(mutableDateTime48) == 0) == dateTime16.equals(mutableDateTime48));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        int int10 = localDate9.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period23.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.months();
        int int27 = period25.get(durationFieldType26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight15.withPeriodAdded((org.joda.time.ReadablePeriod) period25, 0);
        org.joda.time.DateMidnight.Property property30 = dateMidnight15.monthOfYear();
        org.joda.time.DateMidnight dateMidnight32 = property30.addToCopy(15);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.withYearOfCentury(55);
        int int35 = dateMidnight32.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight32.minus(readablePeriod36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.plusDays((-2));
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str42 = dateTimeZone41.getID();
        org.joda.time.DateMidnight dateMidnight43 = org.joda.time.DateMidnight.now(dateTimeZone41);
        int int45 = dateTimeZone41.getOffsetFromLocal(10L);
        java.lang.String str47 = dateTimeZone41.getShortName((long) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight37.toMutableDateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime49 = dateMidnight37.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone50 = dateMidnight37.getZone();
        int int52 = dateTimeZone50.getOffsetFromLocal((long) 26227847);
        long long54 = dateTimeZone50.convertUTCToLocal(26165226L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight32 and mutableDateTime48", (dateMidnight32.compareTo(mutableDateTime48) == 0) == dateMidnight32.equals(mutableDateTime48));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = dateTime8.withZone(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withMinuteOfHour(54);
        int int13 = dateTime10.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str16 = dateTimeZone15.getID();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime19 = dateTime17.plusSeconds(17);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period23 = org.joda.time.Period.minutes(1);
        java.lang.String str24 = period23.toString();
        org.joda.time.Period period25 = period21.withFields((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period27 = period25.plusMillis(100);
        org.joda.time.Period period29 = period25.minusMillis((int) (byte) 1);
        org.joda.time.DateTime dateTime31 = dateTime19.withPeriodAdded((org.joda.time.ReadablePeriod) period29, 15);
        org.joda.time.DateTime dateTime33 = dateTime31.withDayOfMonth(17);
        org.joda.time.DateTime.Property property34 = dateTime31.yearOfCentury();
        org.joda.time.DateTime dateTime36 = dateTime31.withYear(2025);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone40 = dateTimeZone39.toTimeZone();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) (-1), dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime36.toDateTime(dateTimeZone39);
        java.lang.String str44 = dateTimeZone39.getShortName(98L);
        org.joda.time.DateTime dateTime45 = dateTime10.toDateTime(dateTimeZone39);
        org.joda.time.DateTime.Property property46 = dateTime10.minuteOfDay();
        boolean boolean48 = dateTime10.isAfter((long) 256);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime45", (dateTime10.compareTo(dateTime45) == 0) == dateTime10.equals(dateTime45));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        java.util.Date date6 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromDateFields(date6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate7.plusWeeks((int) (short) 0);
        int int12 = localDate7.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str15 = dateTimeZone14.getID();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = localDate7.toDateMidnight(dateTimeZone14);
        java.util.Date date23 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.fromDateFields(date23);
        int int25 = localDate24.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime29 = localDate24.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight17.withZoneRetainFields(dateTimeZone26);
        java.lang.String str32 = dateTimeZone26.getID();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(98L, dateTimeZone26);
        boolean boolean35 = dateTime34.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime34.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime33", (dateTime16.compareTo(dateTime33) == 0) == dateTime16.equals(dateTime33));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        java.util.Date date6 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromDateFields(date6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate7.plusWeeks((int) (short) 0);
        int int12 = localDate7.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str15 = dateTimeZone14.getID();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = localDate7.toDateMidnight(dateTimeZone14);
        java.util.Date date23 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.fromDateFields(date23);
        int int25 = localDate24.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime29 = localDate24.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight17.withZoneRetainFields(dateTimeZone26);
        java.lang.String str32 = dateTimeZone26.getID();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(98L, dateTimeZone26);
        boolean boolean35 = dateTime34.isBeforeNow();
        org.joda.time.DateTime dateTime36 = dateTime34.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime33", (dateTime16.compareTo(dateTime33) == 0) == dateTime16.equals(dateTime33));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        java.lang.String str7 = mutableDateTime3.toString();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime3.copy();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.add((long) 11);
        org.joda.time.MutableDateTime mutableDateTime12 = property9.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.minuteOfDay();
        org.joda.time.Period period15 = org.joda.time.Period.months(15);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime21 = dateTime19.plusSeconds(17);
        org.joda.time.DateTime dateTime23 = dateTime19.withDayOfMonth(2);
        org.joda.time.Duration duration24 = period15.toDurationTo((org.joda.time.ReadableInstant) dateTime23);
        java.lang.String str25 = duration24.toString();
        org.joda.time.Duration duration26 = duration24.toDuration();
        java.util.Date date35 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate36 = org.joda.time.LocalDate.fromDateFields(date35);
        int int37 = localDate36.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        int int40 = dateTimeZone38.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime41 = localDate36.toDateTimeAtCurrentTime(dateTimeZone38);
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone38);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period46 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period48 = org.joda.time.Period.minutes(1);
        java.lang.String str49 = period48.toString();
        org.joda.time.Period period50 = period46.withFields((org.joda.time.ReadablePeriod) period48);
        org.joda.time.Period period52 = period50.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType53 = org.joda.time.DurationFieldType.months();
        int int54 = period52.get(durationFieldType53);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight42.withPeriodAdded((org.joda.time.ReadablePeriod) period52, 0);
        org.joda.time.DateMidnight.Property property57 = dateMidnight42.monthOfYear();
        org.joda.time.DateMidnight dateMidnight59 = property57.addToCopy(15);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight59.minusWeeks(22);
        org.joda.time.Interval interval62 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateMidnight61);
        int int63 = property13.compareTo((org.joda.time.ReadableInstant) dateMidnight61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and dateTime19", (mutableDateTime8.compareTo(dateTime19) == 0) == mutableDateTime8.equals(dateTime19));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(1);
        java.lang.String str13 = period12.toString();
        org.joda.time.Period period14 = period10.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period16 = period14.plusMillis(100);
        org.joda.time.Period period17 = period14.negated();
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period23.plusMillis(100);
        boolean boolean26 = period17.equals((java.lang.Object) period25);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period28 = period17.withFields((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.LocalDate localDate29 = localDate8.plus((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.LocalDate.Property property30 = localDate29.weekOfWeekyear();
        java.lang.String str31 = localDate29.toString();
        org.joda.time.LocalDate.Property property32 = localDate29.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str35 = dateTimeZone34.getID();
        org.joda.time.DateMidnight dateMidnight36 = org.joda.time.DateMidnight.now(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = localDate29.toDateTimeAtCurrentTime(dateTimeZone34);
        int int39 = dateTimeZone34.getOffset(89571984L);
        java.util.Date date45 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate46 = org.joda.time.LocalDate.fromDateFields(date45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localDate46.toDateTimeAtCurrentTime(dateTimeZone47);
        org.joda.time.LocalDate localDate50 = localDate46.plusWeeks((int) (short) 0);
        int int51 = localDate46.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str54 = dateTimeZone53.getID();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(dateTimeZone53);
        org.joda.time.DateMidnight dateMidnight56 = localDate46.toDateMidnight(dateTimeZone53);
        org.joda.time.LocalDate.Property property57 = localDate46.dayOfYear();
        org.joda.time.LocalDate localDate58 = property57.roundFloorCopy();
        org.joda.time.LocalDate localDate60 = localDate58.plusYears(180);
        int int61 = localDate58.getMonthOfYear();
        boolean boolean62 = dateTimeZone34.equals((java.lang.Object) localDate58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and dateTime48", (dateTime37.compareTo(dateTime48) == 0) == dateTime37.equals(dateTime48));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = timeOfDay9.toDateTimeToday(dateTimeZone10);
        mutableDateTime4.setZoneRetainFields(dateTimeZone10);
        mutableDateTime4.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        mutableDateTime4.setZone(dateTimeZone15);
        java.util.TimeZone timeZone19 = dateTimeZone15.toTimeZone();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) 3174023, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        int int24 = dateTimeZone22.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = timeOfDay30.toDateTimeToday(dateTimeZone31);
        mutableDateTime25.setZoneRetainFields(dateTimeZone31);
        mutableDateTime25.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        int int38 = dateTimeZone36.getStandardOffset((long) 100);
        mutableDateTime25.setZone(dateTimeZone36);
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology44 = localTime43.getChronology();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((-1L), (long) 17, chronology44);
        mutableDateTime25.setChronology(chronology44);
        org.joda.time.DateTimeField dateTimeField47 = chronology44.yearOfCentury();
        java.util.Locale locale48 = java.util.Locale.ROOT;
        int int49 = dateTimeField47.getMaximumShortTextLength(locale48);
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.util.Locale locale53 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str54 = locale51.getDisplayVariant(locale53);
        java.util.Locale locale55 = locale53.stripExtensions();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str58 = dateTimeZone57.getID();
        java.util.Locale locale60 = java.util.Locale.KOREAN;
        java.util.Locale locale62 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str63 = locale60.getDisplayVariant(locale62);
        java.lang.String str64 = dateTimeZone57.getName((long) 5, locale60);
        java.util.Locale locale65 = java.util.Locale.KOREAN;
        java.lang.String str66 = locale60.getDisplayScript(locale65);
        java.lang.String str67 = locale55.getDisplayName(locale60);
        java.lang.String str68 = locale60.getISO3Language();
        java.lang.String str69 = dateTimeField47.getAsShortText((long) 70, locale60);
        java.lang.String str70 = dateTimeZone15.getShortName((long) 26377, locale60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and mutableDateTime25", (mutableDateTime4.compareTo(mutableDateTime25) == 0) == mutableDateTime4.equals(mutableDateTime25));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = dateTime8.withZone(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withMinuteOfHour(54);
        int int13 = dateTime10.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str16 = dateTimeZone15.getID();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime19 = dateTime17.plusSeconds(17);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period23 = org.joda.time.Period.minutes(1);
        java.lang.String str24 = period23.toString();
        org.joda.time.Period period25 = period21.withFields((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period27 = period25.plusMillis(100);
        org.joda.time.Period period29 = period25.minusMillis((int) (byte) 1);
        org.joda.time.DateTime dateTime31 = dateTime19.withPeriodAdded((org.joda.time.ReadablePeriod) period29, 15);
        org.joda.time.DateTime dateTime33 = dateTime31.withDayOfMonth(17);
        org.joda.time.DateTime.Property property34 = dateTime31.yearOfCentury();
        org.joda.time.DateTime dateTime36 = dateTime31.withYear(2025);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone40 = dateTimeZone39.toTimeZone();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) (-1), dateTimeZone39);
        org.joda.time.DateTime dateTime42 = dateTime36.toDateTime(dateTimeZone39);
        java.lang.String str44 = dateTimeZone39.getShortName(98L);
        org.joda.time.DateTime dateTime45 = dateTime10.toDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime45", (dateTime8.compareTo(dateTime45) == 0) == dateTime8.equals(dateTime45));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        boolean boolean10 = timeZone6.hasSameRules(timeZone9);
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone9, locale11);
        org.joda.time.DateTime dateTime13 = property2.setCopy("6", locale11);
        org.joda.time.DateTime dateTime14 = property2.roundFloorCopy();
        org.joda.time.DateTime dateTime15 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime17 = dateTime15.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableDateTime21.add(readableDuration22, 0);
        mutableDateTime21.setYear((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod();
        mutablePeriod27.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology31 = null;
        mutablePeriod27.setPeriod((long) 15, chronology31);
        mutablePeriod27.setMinutes(1970);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology40 = localTime39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) 5, chronology40);
        org.joda.time.Chronology chronology42 = chronology40.withUTC();
        mutablePeriod27.setPeriod((long) 0, (long) 1, chronology42);
        mutableDateTime21.setChronology(chronology42);
        org.joda.time.TimeOfDay timeOfDay49 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray50 = timeOfDay49.getFields();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = timeOfDay49.toDateTimeToday(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str55 = dateTimeZone54.getID();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(dateTimeZone54);
        org.joda.time.DateTime dateTime57 = timeOfDay49.toDateTimeToday(dateTimeZone54);
        int int58 = mutableDateTime21.compareTo((org.joda.time.ReadableInstant) dateTime57);
        boolean boolean59 = dateTime15.isAfter((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.Period period61 = org.joda.time.Period.years(59);
        org.joda.time.Period period63 = period61.minusDays((-11));
        org.joda.time.DateTime dateTime65 = dateTime15.withPeriodAdded((org.joda.time.ReadablePeriod) period63, (-1));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime56", (dateTime1.compareTo(dateTime56) == 0) == dateTime1.equals(dateTime56));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.Period period1 = org.joda.time.Period.months(15);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str4 = dateTimeZone3.getID();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime7 = dateTime5.plusSeconds(17);
        org.joda.time.DateTime dateTime9 = dateTime5.withDayOfMonth(2);
        org.joda.time.Duration duration10 = period1.toDurationTo((org.joda.time.ReadableInstant) dateTime9);
        java.lang.String str11 = duration10.toString();
        org.joda.time.Duration duration12 = duration10.toDuration();
        org.joda.time.Period period13 = duration12.toPeriod();
        org.joda.time.Period period15 = new org.joda.time.Period((-604800000L));
        org.joda.time.PeriodType periodType16 = period15.getPeriodType();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        int int19 = dateTimeZone17.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime27 = timeOfDay25.toDateTimeToday(dateTimeZone26);
        mutableDateTime20.setZoneRetainFields(dateTimeZone26);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime20, readableDuration29);
        mutableDateTime20.setTime(10, 2, 0, 55);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime20.weekOfWeekyear();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Period period40 = org.joda.time.Period.minutes(1);
        java.lang.String str41 = period40.toString();
        org.joda.time.LocalTime localTime42 = localTime38.plus((org.joda.time.ReadablePeriod) period40);
        boolean boolean43 = mutableDateTime20.equals((java.lang.Object) localTime42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(chronology44);
        org.joda.time.DateTime.Property property46 = dateTime45.millisOfSecond();
        boolean boolean47 = localTime42.equals((java.lang.Object) dateTime45);
        int int48 = dateTime45.getSecondOfMinute();
        org.joda.time.Duration duration49 = period15.toDurationFrom((org.joda.time.ReadableInstant) dateTime45);
        boolean boolean50 = duration12.isLongerThan((org.joda.time.ReadableDuration) duration49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime45", (dateTime5.compareTo(dateTime45) == 0) == dateTime5.equals(dateTime45));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        int int4 = localTime3.getMillisOfDay();
        org.joda.time.LocalTime localTime6 = localTime3.withMillisOfSecond((int) ' ');
        org.joda.time.LocalTime localTime8 = localTime3.withSecondOfMinute(4);
        org.joda.time.DateTime dateTime9 = localTime8.toDateTimeToday();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology14);
        org.joda.time.Period period16 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology14);
        org.joda.time.DurationField durationField17 = chronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.halfdayOfDay();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField20 = chronology14.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime9, chronology14);
        org.joda.time.Period period22 = new org.joda.time.Period(0L, (long) 13, chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime21", (dateTime9.compareTo(mutableDateTime21) == 0) == dateTime9.equals(mutableDateTime21));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = timeOfDay7.getFields();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTimeToday(dateTimeZone9);
        org.joda.time.DateTime.Property property11 = dateTime10.monthOfYear();
        org.joda.time.DateTime dateTime13 = dateTime10.minusMillis((int) (byte) -1);
        boolean boolean15 = dateTime10.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getDurationType();
        boolean boolean18 = dateTime10.isSupported(dateTimeFieldType16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        org.joda.time.DateTime dateTime21 = dateTime20.toDateTime();
        boolean boolean22 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime21);
        int int23 = dateTime10.getYearOfEra();
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period26 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(1);
        java.lang.String str29 = period28.toString();
        org.joda.time.Period period30 = period26.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period32 = period30.plusMillis(100);
        org.joda.time.LocalTime localTime33 = localTime24.minus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period35 = period30.plusHours((int) 'a');
        org.joda.time.DateTime dateTime37 = dateTime10.withPeriodAdded((org.joda.time.ReadablePeriod) period35, 5);
        org.joda.time.Period period39 = period35.plusDays(0);
        org.joda.time.PeriodType periodType40 = period35.getPeriodType();
        org.joda.time.PeriodType periodType41 = periodType40.withSecondsRemoved();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((long) (byte) -1, periodType41, chronology42);
        org.joda.time.PeriodType periodType44 = periodType41.withWeeksRemoved();
        org.joda.time.PeriodType periodType45 = periodType44.withWeeksRemoved();
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology51 = localTime50.getChronology();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((-1L), (long) 17, chronology51);
        org.joda.time.DateTimeField dateTimeField53 = chronology51.secondOfDay();
        org.joda.time.DateTimeField dateTimeField54 = chronology51.yearOfCentury();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(chronology51);
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(chronology51);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(1645514312043L, chronology51);
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now(chronology51);
        org.joda.time.Period period59 = new org.joda.time.Period((long) 26361522, (-2797875054L), periodType44, chronology51);
        int int60 = periodType44.size();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime55", (dateTime20.compareTo(dateTime55) == 0) == dateTime20.equals(dateTime55));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.Interval interval5 = new org.joda.time.Interval((-1L), (long) 17, chronology4);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period7 = interval5.toPeriod(periodType6);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) '4', (-1), (int) (short) 100, (-1));
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((-1L), (long) 17, chronology18);
        mutablePeriod12.add((long) 26163694, chronology18);
        org.joda.time.Interval interval21 = interval5.withPeriodAfterStart((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Interval interval23 = interval21.withEnd(readableInstant22);
        org.joda.time.Interval interval25 = interval23.withEndMillis(120L);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime27.withHourOfDay(3);
        int int30 = dateTime27.getDayOfWeek();
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology35 = localTime34.getChronology();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) 5, chronology35);
        org.joda.time.Chronology chronology37 = chronology35.withUTC();
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay((long) 2022, chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime27.toMutableDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime40.copy();
        int int42 = mutableDateTime41.getDayOfYear();
        boolean boolean43 = interval25.isBefore((org.joda.time.ReadableInstant) mutableDateTime41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and mutableDateTime40", (dateTime27.compareTo(mutableDateTime40) == 0) == dateTime27.equals(mutableDateTime40));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime2 = dateTime1.toDateTime();
        long long3 = dateTime2.getMillis();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = timeOfDay13.toDateTimeToday(dateTimeZone14);
        mutableDateTime8.setZoneRetainFields(dateTimeZone14);
        mutableDateTime8.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        mutableDateTime8.setZone(dateTimeZone19);
        java.util.TimeZone timeZone23 = dateTimeZone19.toTimeZone();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 3174023, dateTimeZone19);
        org.joda.time.DateTime dateTime25 = dateTime2.withZoneRetainFields(dateTimeZone19);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (short) 100, (long) 12);
        org.joda.time.format.PeriodFormatter periodFormatter29 = null;
        java.lang.String str30 = mutablePeriod28.toString(periodFormatter29);
        org.joda.time.DurationFieldType[] durationFieldTypeArray31 = mutablePeriod28.getFieldTypes();
        mutablePeriod28.addMinutes(2);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.secondOfMinute();
        org.joda.time.Interval interval38 = new org.joda.time.Interval(readableDuration34, (org.joda.time.ReadableInstant) dateTime36);
        boolean boolean39 = interval38.isAfterNow();
        org.joda.time.Period period40 = interval38.toPeriod();
        mutablePeriod28.mergePeriod((org.joda.time.ReadablePeriod) period40);
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime49 = timeOfDay47.toDateTimeToday(dateTimeZone48);
        org.joda.time.DateTime dateTime51 = dateTime49.withCenturyOfEra(10);
        boolean boolean52 = dateTime51.isEqualNow();
        org.joda.time.Chronology chronology53 = dateTime51.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.secondOfMinute();
        org.joda.time.DurationField durationField55 = chronology53.hours();
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(chronology53);
        mutablePeriod28.setPeriod(1645514285512L, chronology53);
        org.joda.time.DateTime dateTime58 = dateTime2.toDateTime(chronology53);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours(29);
        org.joda.time.DateTime dateTime61 = dateTime2.withZone(dateTimeZone60);
        org.joda.time.DateTime dateTime63 = dateTime2.minus((long) 26421706);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime61", (dateTime2.compareTo(dateTime61) == 0) == dateTime2.equals(dateTime61));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 10, chronology5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod6.setPeriod(readableDuration7, chronology8);
        mutablePeriod6.setSeconds(0);
        int[] intArray13 = chronology2.get((org.joda.time.ReadablePeriod) mutablePeriod6, (long) (short) -1);
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = timeOfDay18.getFields();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.monthOfYear();
        org.joda.time.DateTime dateTime24 = dateTime21.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = timeOfDay35.toDateTimeToday(dateTimeZone36);
        mutableDateTime30.setZoneRetainFields(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime30, readableDuration39);
        boolean boolean41 = dateTime26.isBefore((org.joda.time.ReadableInstant) mutableDateTime30);
        java.lang.Object obj42 = mutableDateTime30.clone();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime46.add(readableDuration47, 0);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime46.dayOfWeek();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundFloor();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.millisOfDay();
        int int54 = mutableDateTime52.getYearOfEra();
        mutablePeriod6.setPeriod((org.joda.time.ReadableInstant) mutableDateTime30, (org.joda.time.ReadableInstant) mutableDateTime52);
        boolean boolean57 = mutableDateTime30.isBefore((long) 1970);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime30.hourOfDay();
        org.joda.time.DateTimeField dateTimeField59 = property58.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime30", (mutableDateTime3.compareTo(mutableDateTime30) == 0) == mutableDateTime3.equals(mutableDateTime30));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = timeOfDay8.getFields();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = timeOfDay8.toDateTimeToday(dateTimeZone10);
        org.joda.time.Period period13 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(1);
        java.lang.String str16 = period15.toString();
        org.joda.time.Period period17 = period13.withFields((org.joda.time.ReadablePeriod) period15);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period19 = period13.normalizedStandard(periodType18);
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration3, (org.joda.time.ReadableInstant) dateTime11, periodType18);
        org.joda.time.PeriodType periodType21 = periodType18.withMillisRemoved();
        org.joda.time.Period period22 = interval2.toPeriod(periodType21);
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray28 = timeOfDay27.getFields();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = timeOfDay27.toDateTimeToday(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfCentury(16);
        org.joda.time.DateTime dateTime34 = dateTime30.plusYears((-1));
        boolean boolean35 = interval2.contains((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        int int41 = dateTimeZone39.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(dateTimeZone39);
        org.joda.time.ReadableDuration readableDuration43 = null;
        mutableDateTime42.add(readableDuration43, 0);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime42.dayOfWeek();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime42.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime48 = property47.roundHalfEven();
        boolean boolean49 = interval38.isBefore((org.joda.time.ReadableInstant) mutableDateTime48);
        boolean boolean50 = interval2.overlaps((org.joda.time.ReadableInterval) interval38);
        org.joda.time.Interval interval51 = interval2.toInterval();
        java.lang.String str52 = interval2.toString();
        boolean boolean53 = interval2.isBeforeNow();
        org.joda.time.DateTime dateTime54 = interval2.getStart();
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology57 = localTime56.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.hours();
        org.joda.time.MutableDateTime mutableDateTime59 = org.joda.time.MutableDateTime.now(chronology57);
        org.joda.time.DateTimeField dateTimeField60 = chronology57.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField61 = chronology57.minuteOfDay();
        org.joda.time.DateTime dateTime62 = dateTime54.toDateTime(chronology57);
        org.joda.time.DurationField durationField63 = chronology57.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime54 and dateTime62", (dateTime54.compareTo(dateTime62) == 0) == dateTime54.equals(dateTime62));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(10);
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(1);
        java.lang.String str13 = period12.toString();
        org.joda.time.Period period14 = period10.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period16 = period14.plusMillis(100);
        org.joda.time.Period period17 = period14.negated();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        boolean boolean20 = period14.isSupported(durationFieldType19);
        org.joda.time.Period period22 = period14.minusYears(0);
        org.joda.time.DateTime dateTime23 = dateTime8.minus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.DateTime.Property property24 = dateTime8.hourOfDay();
        org.joda.time.DateTime dateTime25 = property24.getDateTime();
        org.joda.time.DateTime dateTime27 = property24.setCopy(0);
        org.joda.time.DateTime dateTime28 = property24.withMinimumValue();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology33 = localTime32.getChronology();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((-1L), (long) 17, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology33);
        org.joda.time.DateTimeField dateTimeField36 = chronology33.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.yearOfCentury();
        org.joda.time.DateTime dateTime38 = dateTime28.withChronology(chronology33);
        org.joda.time.DateTime dateTime40 = dateTime28.minusDays(48352);
        int int41 = dateTime40.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime38", (dateTime8.compareTo(dateTime38) == 0) == dateTime8.equals(dateTime38));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 10, chronology10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Chronology chronology13 = null;
        mutablePeriod11.setPeriod(readableDuration12, chronology13);
        mutablePeriod11.setSeconds(0);
        int[] intArray18 = chronology7.get((org.joda.time.ReadablePeriod) mutablePeriod11, (long) (short) -1);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 5, chronology24);
        org.joda.time.Chronology chronology26 = chronology24.withUTC();
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay((long) 2022, chronology26);
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.now(chronology26);
        mutablePeriod11.add((long) (short) 10, chronology26);
        int int30 = mutablePeriod11.getMinutes();
        org.joda.time.LocalDate localDate31 = localDate4.minus((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime8", (mutableDateTime3.compareTo(mutableDateTime8) == 0) == mutableDateTime3.equals(mutableDateTime8));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusSeconds(17);
        org.joda.time.Period period7 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period9 = org.joda.time.Period.minutes(1);
        java.lang.String str10 = period9.toString();
        org.joda.time.Period period11 = period7.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period11.plusMillis(100);
        org.joda.time.Period period15 = period11.minusMillis((int) (byte) 1);
        org.joda.time.DateTime dateTime17 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period15, 15);
        org.joda.time.DateTime dateTime19 = dateTime5.withMillis(6403347934000L);
        org.joda.time.DateTime dateTime21 = dateTime5.plusMinutes(37183940);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((-1L), (long) 17, chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.yearOfCentury();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology27);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(chronology27);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(1645514312043L, chronology27);
        org.joda.time.DateTimeZone dateTimeZone34 = chronology27.getZone();
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((java.lang.Object) dateTime5, chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime31", (dateTime3.compareTo(dateTime31) == 0) == dateTime3.equals(dateTime31));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 5, chronology3);
        org.joda.time.Chronology chronology5 = chronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.Locale locale12 = new java.util.Locale("2", "2", "55");
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone7, locale12);
        java.time.ZoneId zoneId14 = timeZone7.toZoneId();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone(zoneId14);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone(zoneId14);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone16);
        boolean boolean18 = timeZone16.useDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar17", (calendar13.compareTo(calendar17) == 0) == calendar13.equals(calendar17));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.yearOfEra();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 5, chronology12);
        org.joda.time.Chronology chronology14 = chronology12.withUTC();
        mutableDateTime3.setChronology(chronology12);
        org.joda.time.DurationField durationField16 = chronology12.years();
        long long18 = durationField16.getMillis((long) 29);
        org.joda.time.DurationFieldType durationFieldType19 = durationField16.getType();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        int int22 = dateTimeZone20.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = timeOfDay28.toDateTimeToday(dateTimeZone29);
        mutableDateTime23.setZoneRetainFields(dateTimeZone29);
        mutableDateTime23.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        int int36 = dateTimeZone34.getStandardOffset((long) 100);
        mutableDateTime23.setZone(dateTimeZone34);
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology42 = localTime41.getChronology();
        org.joda.time.Interval interval43 = new org.joda.time.Interval((-1L), (long) 17, chronology42);
        mutableDateTime23.setChronology(chronology42);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(chronology42);
        org.joda.time.Period period47 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period49 = org.joda.time.Period.minutes(1);
        java.lang.String str50 = period49.toString();
        org.joda.time.Period period51 = period47.withFields((org.joda.time.ReadablePeriod) period49);
        org.joda.time.Period period53 = period51.plusMillis(100);
        org.joda.time.Period period54 = period51.negated();
        org.joda.time.Period period56 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period58 = org.joda.time.Period.minutes(1);
        java.lang.String str59 = period58.toString();
        org.joda.time.Period period60 = period56.withFields((org.joda.time.ReadablePeriod) period58);
        org.joda.time.Period period62 = period60.plusMillis(100);
        boolean boolean63 = period54.equals((java.lang.Object) period62);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period65 = period54.withFields((org.joda.time.ReadablePeriod) mutablePeriod64);
        int[] intArray68 = chronology42.get((org.joda.time.ReadablePeriod) period65, 0L, 6L);
        org.joda.time.DateTimeField dateTimeField69 = chronology42.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField70 = chronology42.yearOfCentury();
        org.joda.time.DurationField durationField71 = chronology42.weekyears();
        org.joda.time.DurationField durationField72 = durationFieldType19.getField(chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField72 and durationField71", (durationField72.compareTo(durationField71) == 0) == durationField72.equals(durationField71));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.minusMillis((int) 'a');
        int int15 = dateTime14.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime14.withYear(55);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 5, chronology21);
        org.joda.time.Chronology chronology23 = chronology21.withUTC();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 10, chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod26.setPeriod(readableDuration27, chronology28);
        long long32 = chronology23.add((org.joda.time.ReadablePeriod) mutablePeriod26, (long) 32772, 6);
        org.joda.time.DateTimeField dateTimeField33 = chronology23.era();
        org.joda.time.DateTime dateTime34 = dateTime14.withChronology(chronology23);
        org.joda.time.DateTime dateTime35 = dateTime34.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime37 = dateTime35.plusMonths((int) (byte) 10);
        int int38 = dateTime37.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime34", (dateTime14.compareTo(dateTime34) == 0) == dateTime14.equals(dateTime34));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("59");
        int int2 = mutableDateTime1.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.monthOfYear();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.minuteOfHour();
        java.util.Date date10 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.fromDateFields(date10);
        int int12 = localDate11.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime16 = localDate11.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.DateTime dateTime20 = dateTime19.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str23 = dateTimeZone22.getID();
        java.util.Locale locale25 = java.util.Locale.KOREAN;
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str28 = locale25.getDisplayVariant(locale27);
        java.lang.String str29 = dateTimeZone22.getName((long) 5, locale25);
        org.joda.time.DateTime dateTime30 = dateTime20.withZoneRetainFields(dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight31 = yearMonthDay17.toDateMidnight(dateTimeZone22);
        mutableDateTime1.setZone(dateTimeZone22);
        int int33 = mutableDateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        org.joda.time.Instant instant36 = dateTime35.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime.Property property38 = dateTime35.property(dateTimeFieldType37);
        int int39 = mutableDateTime1.get(dateTimeFieldType37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant36", (dateTime35.compareTo(instant36) == 0) == dateTime35.equals(instant36));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfEven();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.centuryOfEra();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.millisOfSecond();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.era();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.withHourOfDay(3);
        int int17 = dateTime14.getDayOfWeek();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) 5, chronology22);
        org.joda.time.Chronology chronology24 = chronology22.withUTC();
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((long) 2022, chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime14.toMutableDateTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime27.copy();
        int int29 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        mutableDateTime9.setYear(5026);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and mutableDateTime27", (dateTime14.compareTo(mutableDateTime27) == 0) == dateTime14.equals(mutableDateTime27));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.LocalDate localDate9 = property7.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtMidnight();
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.DateTime dateTime14 = dateTime10.withDurationAdded(31556952000L, 26497427);
        org.joda.time.DateTime dateTime16 = dateTime10.withYearOfEra(27);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime16, readableDuration17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant11", (dateTime10.compareTo(instant11) == 0) == dateTime10.equals(instant11));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType2.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray4 = new org.joda.time.DurationFieldType[] { durationFieldType3 };
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.forFields(durationFieldTypeArray4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutableDateTime9.add(readableDuration10, 0);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.dayOfWeek();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.yearOfEra();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 5, chronology18);
        org.joda.time.Chronology chronology20 = chronology18.withUTC();
        mutableDateTime9.setChronology(chronology18);
        org.joda.time.DurationField durationField22 = chronology18.years();
        org.joda.time.DateTimeField dateTimeField23 = chronology18.dayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 'a', periodType5, chronology18);
        org.joda.time.PeriodType periodType25 = periodType5.withMinutesRemoved();
        org.joda.time.PeriodType periodType26 = periodType25.withYearsRemoved();
        org.joda.time.PeriodType periodType27 = periodType26.withDaysRemoved();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = timeOfDay36.toDateTimeToday(dateTimeZone37);
        mutableDateTime31.setZoneRetainFields(dateTimeZone37);
        mutableDateTime31.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        int int44 = dateTimeZone42.getStandardOffset((long) 100);
        mutableDateTime31.setZone(dateTimeZone42);
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology50 = localTime49.getChronology();
        org.joda.time.Interval interval51 = new org.joda.time.Interval((-1L), (long) 17, chronology50);
        mutableDateTime31.setChronology(chronology50);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(chronology50);
        org.joda.time.Period period55 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period57 = org.joda.time.Period.minutes(1);
        java.lang.String str58 = period57.toString();
        org.joda.time.Period period59 = period55.withFields((org.joda.time.ReadablePeriod) period57);
        org.joda.time.Period period61 = period59.plusMillis(100);
        org.joda.time.Period period62 = period59.negated();
        org.joda.time.Period period64 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period66 = org.joda.time.Period.minutes(1);
        java.lang.String str67 = period66.toString();
        org.joda.time.Period period68 = period64.withFields((org.joda.time.ReadablePeriod) period66);
        org.joda.time.Period period70 = period68.plusMillis(100);
        boolean boolean71 = period62.equals((java.lang.Object) period70);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period73 = period62.withFields((org.joda.time.ReadablePeriod) mutablePeriod72);
        int[] intArray76 = chronology50.get((org.joda.time.ReadablePeriod) period73, 0L, 6L);
        org.joda.time.DateTimeField dateTimeField77 = chronology50.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField78 = chronology50.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField79 = chronology50.yearOfCentury();
        org.joda.time.DurationField durationField80 = chronology50.eras();
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) 26508937, periodType27, chronology50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField80", Math.signum(durationField22.compareTo(durationField80)) == -Math.signum(durationField80.compareTo(durationField22)));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        long long4 = dateTime3.getMillis();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = timeOfDay14.toDateTimeToday(dateTimeZone15);
        mutableDateTime9.setZoneRetainFields(dateTimeZone15);
        mutableDateTime9.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        int int22 = dateTimeZone20.getStandardOffset((long) 100);
        mutableDateTime9.setZone(dateTimeZone20);
        java.util.TimeZone timeZone24 = dateTimeZone20.toTimeZone();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) 3174023, dateTimeZone20);
        org.joda.time.DateTime dateTime26 = dateTime3.withZoneRetainFields(dateTimeZone20);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) (short) 100, (long) 12);
        org.joda.time.format.PeriodFormatter periodFormatter30 = null;
        java.lang.String str31 = mutablePeriod29.toString(periodFormatter30);
        org.joda.time.DurationFieldType[] durationFieldTypeArray32 = mutablePeriod29.getFieldTypes();
        mutablePeriod29.addMinutes(2);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.secondOfMinute();
        org.joda.time.Interval interval39 = new org.joda.time.Interval(readableDuration35, (org.joda.time.ReadableInstant) dateTime37);
        boolean boolean40 = interval39.isAfterNow();
        org.joda.time.Period period41 = interval39.toPeriod();
        mutablePeriod29.mergePeriod((org.joda.time.ReadablePeriod) period41);
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime50 = timeOfDay48.toDateTimeToday(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.withCenturyOfEra(10);
        boolean boolean53 = dateTime52.isEqualNow();
        org.joda.time.Chronology chronology54 = dateTime52.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.secondOfMinute();
        org.joda.time.DurationField durationField56 = chronology54.hours();
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight(chronology54);
        mutablePeriod29.setPeriod(1645514285512L, chronology54);
        org.joda.time.DateTime dateTime59 = dateTime3.toDateTime(chronology54);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours(29);
        org.joda.time.DateTime dateTime62 = dateTime3.withZone(dateTimeZone61);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(830227007859180000L, dateTimeZone61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime62", (dateTime2.compareTo(dateTime62) == 0) == dateTime2.equals(dateTime62));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime2 = dateTime1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime5 = property3.addToCopy((long) 58);
        org.joda.time.DateTime dateTime6 = property3.roundHalfEvenCopy();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 10, chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withMinuteOfHour(0);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 10, chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withFields((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 10, chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod22, 15);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime17.plusMonths(12);
        org.joda.time.LocalDateTime.Property property27 = localDateTime17.era();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime17.plusMillis((-11));
        int int30 = localDateTime17.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime17.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str35 = dateTimeZone34.getID();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.DateTime dateTime38 = localDateTime32.toDateTime(dateTimeZone34);
        long long41 = dateTimeZone34.convertLocalToUTC((-604811000L), false);
        java.util.TimeZone timeZone42 = dateTimeZone34.toTimeZone();
        org.joda.time.DateTime dateTime43 = dateTime6.withZoneRetainFields(dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime36", (dateTime1.compareTo(dateTime36) == 0) == dateTime1.equals(dateTime36));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusSeconds(17);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period9 = new org.joda.time.Period((-292275054L), periodType8);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime3, readableDuration6, periodType8);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology15 = localTime14.getChronology();
        org.joda.time.Interval interval16 = new org.joda.time.Interval((-1L), (long) 17, chronology15);
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = timeOfDay21.toDateTimeToday(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime27 = dateTime23.plusDays((int) (byte) -1);
        java.util.Date date28 = dateTime27.toDate();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime27, readableDuration29);
        org.joda.time.Period period31 = interval30.toPeriod();
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = timeOfDay36.toDateTimeToday(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.withCenturyOfEra(10);
        org.joda.time.DateTime dateTime42 = dateTime38.plusDays((int) (byte) -1);
        java.util.Date date43 = dateTime42.toDate();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime42, readableDuration44);
        org.joda.time.Interval interval48 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        int int51 = dateTimeZone49.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone49);
        org.joda.time.ReadableDuration readableDuration53 = null;
        mutableDateTime52.add(readableDuration53, 0);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime52.dayOfWeek();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime52.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime58 = property57.roundHalfEven();
        boolean boolean59 = interval48.isBefore((org.joda.time.ReadableInstant) mutableDateTime58);
        org.joda.time.TimeOfDay timeOfDay64 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray65 = timeOfDay64.getFields();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = timeOfDay64.toDateTimeToday(dateTimeZone66);
        org.joda.time.DateTime dateTime69 = dateTime67.withYearOfCentury(16);
        boolean boolean70 = interval48.isAfter((org.joda.time.ReadableInstant) dateTime69);
        boolean boolean71 = interval45.abuts((org.joda.time.ReadableInterval) interval48);
        org.joda.time.Duration duration72 = interval48.toDuration();
        org.joda.time.Interval interval73 = interval30.withDurationAfterStart((org.joda.time.ReadableDuration) duration72);
        org.joda.time.Interval interval74 = interval16.withDurationBeforeEnd((org.joda.time.ReadableDuration) duration72);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.getDefault();
        int int77 = dateTimeZone75.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime(dateTimeZone75);
        org.joda.time.ReadableDuration readableDuration79 = null;
        mutableDateTime78.add(readableDuration79, 0);
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime78.dayOfWeek();
        org.joda.time.MutableDateTime.Property property83 = mutableDateTime78.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime84 = property83.roundHalfEven();
        org.joda.time.DateTimeField dateTimeField85 = property83.getField();
        org.joda.time.MutableDateTime mutableDateTime86 = property83.getMutableDateTime();
        boolean boolean87 = duration72.equals((java.lang.Object) property83);
        java.lang.String str88 = duration72.toString();
        org.joda.time.LocalTime localTime92 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology93 = localTime92.getChronology();
        org.joda.time.MutableDateTime mutableDateTime94 = org.joda.time.MutableDateTime.now(chronology93);
        org.joda.time.Period period95 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology93);
        org.joda.time.DurationField durationField96 = chronology93.halfdays();
        org.joda.time.DurationField durationField97 = chronology93.eras();
        boolean boolean98 = duration72.equals((java.lang.Object) durationField97);
        org.joda.time.DateTime dateTime99 = dateTime3.minus((org.joda.time.ReadableDuration) duration72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField96 and durationField97", Math.signum(durationField96.compareTo(durationField97)) == -Math.signum(durationField97.compareTo(durationField96)));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 5, chronology4);
        org.joda.time.Chronology chronology6 = chronology4.withUTC();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((long) 2022, chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = timeOfDay16.toDateTimeToday(dateTimeZone17);
        mutableDateTime11.setZoneRetainFields(dateTimeZone17);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime11, readableDuration20);
        mutableDateTime11.setTime(10, 2, 0, 55);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime11.weekOfWeekyear();
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Period period31 = org.joda.time.Period.minutes(1);
        java.lang.String str32 = period31.toString();
        org.joda.time.LocalTime localTime33 = localTime29.plus((org.joda.time.ReadablePeriod) period31);
        boolean boolean34 = mutableDateTime11.equals((java.lang.Object) localTime33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.millisOfSecond();
        boolean boolean38 = localTime33.equals((java.lang.Object) dateTime36);
        int int39 = timeOfDay7.compareTo((org.joda.time.ReadablePartial) localTime33);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str43 = dateTimeZone42.getID();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone42);
        org.joda.time.DateTime dateTime46 = dateTime44.minusHours((int) ' ');
        org.joda.time.Period period47 = new org.joda.time.Period(readableInstant40, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime49 = dateTime44.minus((-6652799968L));
        int int50 = dateTime44.getDayOfWeek();
        org.joda.time.DateTime dateTime52 = dateTime44.minusMonths(26404120);
        org.joda.time.TimeOfDay timeOfDay53 = dateTime44.toTimeOfDay();
        int int54 = localTime33.compareTo((org.joda.time.ReadablePartial) timeOfDay53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime44", (dateTime36.compareTo(dateTime44) == 0) == dateTime36.equals(dateTime44));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod1 = mutablePeriod0.copy();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology7);
        org.joda.time.Period period9 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology7);
        mutablePeriod0.setPeriod((long) 15, chronology7);
        int int11 = mutablePeriod0.getMinutes();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = timeOfDay18.getFields();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = timeOfDay18.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plus((long) '4');
        org.joda.time.DateTime dateTime25 = dateTime23.plusSeconds(3172001);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod();
        mutablePeriod26.addWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology30 = null;
        mutablePeriod26.setPeriod((long) 15, chronology30);
        mutablePeriod26.setMinutes(1970);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology39 = localTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) 5, chronology39);
        org.joda.time.Chronology chronology41 = chronology39.withUTC();
        mutablePeriod26.setPeriod((long) 0, (long) 1, chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.hourOfDay();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(chronology41);
        org.joda.time.DateTime dateTime45 = dateTime25.withChronology(chronology41);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        int int48 = dateTimeZone46.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone46);
        org.joda.time.TimeOfDay timeOfDay54 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime56 = timeOfDay54.toDateTimeToday(dateTimeZone55);
        mutableDateTime49.setZoneRetainFields(dateTimeZone55);
        mutableDateTime49.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        int int62 = dateTimeZone60.getStandardOffset((long) 100);
        mutableDateTime49.setZone(dateTimeZone60);
        org.joda.time.LocalTime localTime67 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology68 = localTime67.getChronology();
        org.joda.time.Interval interval69 = new org.joda.time.Interval((-1L), (long) 17, chronology68);
        mutableDateTime49.setChronology(chronology68);
        java.lang.String str71 = chronology68.toString();
        org.joda.time.DurationField durationField72 = chronology68.centuries();
        org.joda.time.DurationField durationField73 = chronology68.weeks();
        org.joda.time.DateTime dateTime74 = dateTime25.withChronology(chronology68);
        mutablePeriod0.setPeriod(436L, (-292275030L), chronology68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime45", (dateTime25.compareTo(dateTime45) == 0) == dateTime25.equals(dateTime45));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfEven();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.centuryOfEra();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.millisOfSecond();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.era();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime16.add(readableDuration17, 0);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime16.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.yearOfEra();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 5, chronology25);
        org.joda.time.Chronology chronology27 = chronology25.withUTC();
        mutableDateTime16.setChronology(chronology25);
        mutableDateTime16.setDate(1371555988124L);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime16.yearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone33 = chronology32.getZone();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime9, dateTimeZone33);
        boolean boolean36 = dateTimeZone33.isStandardOffset(1645514634801L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime34", (mutableDateTime3.compareTo(mutableDateTime34) == 0) == mutableDateTime3.equals(mutableDateTime34));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.hours();
        org.joda.time.Period period6 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(1);
        java.lang.String str9 = period8.toString();
        org.joda.time.Period period10 = period6.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period10.plusMillis(100);
        org.joda.time.Period period13 = period10.negated();
        org.joda.time.Period period15 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period17 = org.joda.time.Period.minutes(1);
        java.lang.String str18 = period17.toString();
        org.joda.time.Period period19 = period15.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period21 = period19.plusMillis(100);
        boolean boolean22 = period13.equals((java.lang.Object) period21);
        int[] intArray25 = chronology3.get((org.joda.time.ReadablePeriod) period13, (long) 100, (long) (-1));
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(89572000L, chronology3);
        org.joda.time.DateTimeField dateTimeField28 = chronology3.yearOfCentury();
        long long30 = dateTimeField28.roundCeiling((long) 28);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) (-5599659));
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone40 = dateTimeZone39.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone43 = dateTimeZone42.toTimeZone();
        boolean boolean44 = timeZone40.hasSameRules(timeZone43);
        java.util.Locale locale45 = java.util.Locale.KOREAN;
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone43, locale45);
        org.joda.time.DateTime dateTime47 = property36.setCopy("6", locale45);
        java.lang.String str48 = locale45.getVariant();
        java.lang.String str49 = dateTimeField28.getAsText((org.joda.time.ReadablePartial) localDateTime32, 26580937, locale45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime35", (dateTime26.compareTo(dateTime35) == 0) == dateTime26.equals(dateTime35));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        boolean boolean6 = timeZone2.hasSameRules(timeZone5);
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone5, locale7);
        int int10 = timeZone5.getOffset((long) 5);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone5);
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str15 = locale12.getDisplayVariant(locale14);
        java.util.Locale locale16 = locale14.stripExtensions();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str19 = dateTimeZone18.getID();
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str24 = locale21.getDisplayVariant(locale23);
        java.lang.String str25 = dateTimeZone18.getName((long) 5, locale21);
        java.util.Locale locale26 = java.util.Locale.KOREAN;
        java.lang.String str27 = locale21.getDisplayScript(locale26);
        java.lang.String str28 = locale16.getDisplayName(locale21);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone5, locale16);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone35 = dateTimeZone34.toTimeZone();
        boolean boolean36 = timeZone32.hasSameRules(timeZone35);
        boolean boolean37 = timeZone5.hasSameRules(timeZone35);
        boolean boolean38 = timeZone35.observesDaylightTime();
        boolean boolean39 = timeZone35.observesDaylightTime();
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("PT1M");
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str44 = dateTimeZone43.getID();
        java.util.Locale locale46 = java.util.Locale.KOREAN;
        java.util.Locale locale48 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str49 = locale46.getDisplayVariant(locale48);
        java.lang.String str50 = dateTimeZone43.getName((long) 5, locale46);
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.lang.String str52 = locale46.getDisplayScript(locale51);
        java.lang.String str53 = locale41.getDisplayLanguage(locale51);
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(timeZone35, locale51);
        timeZone35.setID("2022-02-22T07:22:00.208Z");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar54", (calendar8.compareTo(calendar54) == 0) == calendar8.equals(calendar54));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = timeOfDay9.toDateTimeToday(dateTimeZone10);
        mutableDateTime4.setZoneRetainFields(dateTimeZone10);
        mutableDateTime4.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        mutableDateTime4.setZone(dateTimeZone15);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((-1L), (long) 17, chronology23);
        mutableDateTime4.setChronology(chronology23);
        java.lang.String str26 = chronology23.toString();
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = timeOfDay31.toDateTimeToday(dateTimeZone32);
        org.joda.time.Chronology chronology34 = chronology23.withZone(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology34);
        org.joda.time.Period period36 = new org.joda.time.Period((long) 53, chronology34);
        org.joda.time.DurationField durationField37 = chronology34.months();
        org.joda.time.DateTimeField dateTimeField38 = chronology34.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = dateTimeField38.getType();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        int int42 = dateTimeZone40.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone40);
        org.joda.time.ReadableDuration readableDuration44 = null;
        mutableDateTime43.add(readableDuration44, 0);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime43.dayOfWeek();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.yearOfEra();
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology52 = localTime51.getChronology();
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) 5, chronology52);
        org.joda.time.Chronology chronology54 = chronology52.withUTC();
        mutableDateTime43.setChronology(chronology52);
        org.joda.time.DurationField durationField56 = chronology52.years();
        org.joda.time.DateTimeField dateTimeField57 = chronology52.dayOfMonth();
        long long61 = chronology52.add((long) 1961, (long) 4, (-2));
        org.joda.time.DateTimeField dateTimeField62 = chronology52.secondOfDay();
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType39.getField(chronology52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime35 and mutableDateTime43", (mutableDateTime35.compareTo(mutableDateTime43) == 0) == mutableDateTime35.equals(mutableDateTime43));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekyearOfCentury();
        int int6 = dateTimeField4.getMaximumValue((long) (-11));
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.util.Set<java.lang.String> strSet10 = locale7.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(locale7);
        int int12 = dateTimeField4.getMaximumTextLength(locale7);
        int int13 = dateTimeField4.getMaximumValue();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period22 = period20.plusMillis(100);
        org.joda.time.LocalTime localTime23 = localTime14.minus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.LocalTime.Property property24 = localTime14.minuteOfHour();
        int int25 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone26);
        boolean boolean31 = dateTimeZone26.isStandardOffset((long) 10);
        long long35 = dateTimeZone26.convertLocalToUTC((long) 38, true, 1645514205352L);
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray41 = timeOfDay40.getFields();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = timeOfDay40.toDateTimeToday(dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.plus((long) '4');
        org.joda.time.DateTime dateTime47 = dateTime45.plusSeconds(3172001);
        boolean boolean48 = dateTimeZone26.equals((java.lang.Object) dateTime45);
        org.joda.time.DateTime dateTime49 = localTime14.toDateTimeToday(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime29", (mutableDateTime3.compareTo(mutableDateTime29) == 0) == mutableDateTime3.equals(mutableDateTime29));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        int int10 = localDate9.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate9.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.Period period25 = period23.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.months();
        int int27 = period25.get(durationFieldType26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight15.withPeriodAdded((org.joda.time.ReadablePeriod) period25, 0);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight15.plusMonths((int) (short) 10);
        org.joda.time.YearMonthDay yearMonthDay32 = dateMidnight31.toYearMonthDay();
        org.joda.time.Instant instant33 = dateMidnight31.toInstant();
        org.joda.time.DateMidnight.Property property34 = dateMidnight31.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight35 = property34.roundHalfEvenCopy();
        org.joda.time.DateMidnight.Property property36 = dateMidnight35.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight35 and instant33", (dateMidnight35.compareTo(instant33) == 0) == dateMidnight35.equals(instant33));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, 0);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfEven();
        boolean boolean13 = interval2.isBefore((org.joda.time.ReadableInstant) mutableDateTime12);
        int int14 = mutableDateTime12.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        mutableDateTime12.set(dateTimeFieldType15, 15);
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str22 = locale19.getDisplayVariant(locale21);
        java.util.Calendar calendar23 = mutableDateTime12.toCalendar(locale19);
        calendar23.setFirstDayOfWeek(2);
        int int26 = calendar23.getWeekYear();
        calendar23.clear();
        calendar23.setFirstDayOfWeek(944);
        calendar23.setTimeInMillis(2269721001600000L);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance();
        int int34 = calendar32.getMaximum((int) (short) 0);
        java.util.Date date40 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        date40.setMinutes(54);
        calendar32.setTime(date40);
        int int44 = date40.getDate();
        int int45 = date40.getTimezoneOffset();
        int int46 = date40.getSeconds();
        calendar23.setTime(date40);
        date40.setDate((-3172002));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar23 and calendar32", (calendar23.compareTo(calendar32) == 0) == calendar23.equals(calendar32));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime2 = dateTime1.toDateTime();
        long long3 = dateTime2.getMillis();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = timeOfDay13.toDateTimeToday(dateTimeZone14);
        mutableDateTime8.setZoneRetainFields(dateTimeZone14);
        mutableDateTime8.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        mutableDateTime8.setZone(dateTimeZone19);
        java.util.TimeZone timeZone23 = dateTimeZone19.toTimeZone();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) 3174023, dateTimeZone19);
        org.joda.time.DateTime dateTime25 = dateTime2.withZoneRetainFields(dateTimeZone19);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (short) 100, (long) 12);
        org.joda.time.format.PeriodFormatter periodFormatter29 = null;
        java.lang.String str30 = mutablePeriod28.toString(periodFormatter29);
        org.joda.time.DurationFieldType[] durationFieldTypeArray31 = mutablePeriod28.getFieldTypes();
        mutablePeriod28.addMinutes(2);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.secondOfMinute();
        org.joda.time.Interval interval38 = new org.joda.time.Interval(readableDuration34, (org.joda.time.ReadableInstant) dateTime36);
        boolean boolean39 = interval38.isAfterNow();
        org.joda.time.Period period40 = interval38.toPeriod();
        mutablePeriod28.mergePeriod((org.joda.time.ReadablePeriod) period40);
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime49 = timeOfDay47.toDateTimeToday(dateTimeZone48);
        org.joda.time.DateTime dateTime51 = dateTime49.withCenturyOfEra(10);
        boolean boolean52 = dateTime51.isEqualNow();
        org.joda.time.Chronology chronology53 = dateTime51.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.secondOfMinute();
        org.joda.time.DurationField durationField55 = chronology53.hours();
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(chronology53);
        mutablePeriod28.setPeriod(1645514285512L, chronology53);
        org.joda.time.DateTime dateTime58 = dateTime2.toDateTime(chronology53);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours(29);
        org.joda.time.DateTime dateTime61 = dateTime2.withZone(dateTimeZone60);
        org.joda.time.DateTime.Property property62 = dateTime2.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime61", (dateTime2.compareTo(dateTime61) == 0) == dateTime2.equals(dateTime61));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) (short) 0);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMonths(36);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology15 = localTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology15);
        org.joda.time.Period period17 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology15);
        org.joda.time.DurationField durationField18 = chronology15.halfdays();
        org.joda.time.DateTime dateTime19 = dateTime10.withChronology(chronology15);
        org.joda.time.DurationField durationField20 = chronology15.weeks();
        org.joda.time.DurationField durationField21 = chronology15.seconds();
        long long24 = durationField21.getMillis((-2026L), 436L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime19", (dateTime10.compareTo(dateTime19) == 0) == dateTime10.equals(dateTime19));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = timeOfDay5.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minus((long) (short) 0);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(36);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.Period period18 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology16);
        org.joda.time.DurationField durationField19 = chronology16.halfdays();
        org.joda.time.DateTime dateTime20 = dateTime11.withChronology(chronology16);
        org.joda.time.DurationField durationField21 = chronology16.weeks();
        org.joda.time.DurationField durationField22 = chronology16.seconds();
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay((long) 11975520, chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime20", (dateTime11.compareTo(dateTime20) == 0) == dateTime11.equals(dateTime20));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.millisOfDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 10, chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Chronology chronology15 = null;
        mutablePeriod13.setPeriod(readableDuration14, chronology15);
        mutablePeriod13.setSeconds(0);
        int int19 = mutablePeriod13.getMillis();
        int int20 = mutablePeriod13.getYears();
        mutableDateTime9.add((org.joda.time.ReadablePeriod) mutablePeriod13);
        int int22 = mutableDateTime9.getYearOfEra();
        mutableDateTime9.addHours(1899);
        mutableDateTime9.setTime(955240819200000100L);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod28 = mutablePeriod27.copy();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.Period period36 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology34);
        mutablePeriod27.setPeriod((long) 15, chronology34);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = timeOfDay43.toDateTimeToday(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.minus((long) (short) 0);
        org.joda.time.Period period49 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period51 = org.joda.time.Period.minutes(1);
        java.lang.String str52 = period51.toString();
        org.joda.time.Period period53 = period49.withFields((org.joda.time.ReadablePeriod) period51);
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period55 = period49.normalizedStandard(periodType54);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(readableDuration38, (org.joda.time.ReadableInstant) dateTime47, periodType54);
        org.joda.time.DateTime dateTime58 = dateTime47.minusHours(0);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime(chronology59);
        org.joda.time.DateTime dateTime61 = dateTime47.withFields((org.joda.time.ReadablePartial) localTime60);
        org.joda.time.TimeOfDay timeOfDay66 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray67 = timeOfDay66.getFields();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = timeOfDay66.toDateTimeToday(dateTimeZone68);
        org.joda.time.DateTime dateTime71 = dateTime69.withYearOfCentury(16);
        org.joda.time.DateTime dateTime73 = dateTime69.plusYears((-1));
        org.joda.time.MutableDateTime mutableDateTime74 = dateTime73.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime74.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType77 = dateTimeFieldType76.getDurationType();
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime74.property(dateTimeFieldType76);
        org.joda.time.LocalTime.Property property79 = localTime60.property(dateTimeFieldType76);
        org.joda.time.DurationFieldType durationFieldType80 = dateTimeFieldType76.getDurationType();
        org.joda.time.DurationFieldType durationFieldType81 = dateTimeFieldType76.getRangeDurationType();
        mutablePeriod27.add(durationFieldType81, (-42529));
        mutableDateTime9.add((org.joda.time.ReadablePeriod) mutablePeriod27, 1894);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime35 and dateTime61", (mutableDateTime35.compareTo(dateTime61) == 0) == mutableDateTime35.equals(dateTime61));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.Interval interval5 = new org.joda.time.Interval((-1L), (long) 17, chronology4);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.millis();
        org.joda.time.Period period7 = interval5.toPeriod(periodType6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.secondOfMinute();
        java.lang.String str11 = property10.getAsString();
        java.lang.String str12 = property10.getAsShortText();
        org.joda.time.DateTime dateTime13 = property10.roundFloorCopy();
        java.lang.String str14 = property10.getAsString();
        org.joda.time.Interval interval15 = property10.toInterval();
        boolean boolean16 = interval5.isAfter((org.joda.time.ReadableInterval) interval15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = timeOfDay22.toDateTimeToday(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.minus((long) (short) 0);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period30 = org.joda.time.Period.minutes(1);
        java.lang.String str31 = period30.toString();
        org.joda.time.Period period32 = period28.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period34 = period28.normalizedStandard(periodType33);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(readableDuration17, (org.joda.time.ReadableInstant) dateTime26, periodType33);
        int int36 = mutablePeriod35.getMonths();
        mutablePeriod35.add((long) 1);
        mutablePeriod35.clear();
        int int40 = mutablePeriod35.getYears();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str43 = dateTimeZone42.getID();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone42);
        org.joda.time.Instant instant45 = dateTime44.toInstant();
        org.joda.time.Duration duration46 = mutablePeriod35.toDurationTo((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Interval interval47 = interval15.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) mutablePeriod35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime44", (dateTime9.compareTo(dateTime44) == 0) == dateTime9.equals(dateTime44));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str23 = locale20.getDisplayVariant(locale22);
        java.lang.String str24 = dateTimeZone17.getName((long) 5, locale20);
        org.joda.time.DateTime dateTime25 = dateTime15.withZoneRetainFields(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight26 = yearMonthDay12.toDateMidnight(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.plusWeeks((int) ' ');
        int int29 = dateMidnight26.getWeekOfWeekyear();
        org.joda.time.Interval interval30 = dateMidnight26.toInterval();
        org.joda.time.Interval interval31 = interval30.toInterval();
        org.joda.time.Period period33 = org.joda.time.Period.months(15);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str36 = dateTimeZone35.getID();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone35);
        org.joda.time.DateTime dateTime39 = dateTime37.plusSeconds(17);
        org.joda.time.DateTime dateTime41 = dateTime37.withDayOfMonth(2);
        org.joda.time.Duration duration42 = period33.toDurationTo((org.joda.time.ReadableInstant) dateTime41);
        java.lang.String str43 = duration42.toString();
        java.util.Date date49 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate50 = org.joda.time.LocalDate.fromDateFields(date49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = localDate50.toDateTimeAtCurrentTime(dateTimeZone51);
        org.joda.time.LocalDate localDate54 = localDate50.plusWeeks((int) (short) 0);
        int int55 = localDate50.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str58 = dateTimeZone57.getID();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(dateTimeZone57);
        org.joda.time.DateMidnight dateMidnight60 = localDate50.toDateMidnight(dateTimeZone57);
        org.joda.time.DateMidnight.Property property61 = dateMidnight60.monthOfYear();
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight60.withMillis((long) 3);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight60.plusYears((int) 'a');
        org.joda.time.Interval interval66 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration42, (org.joda.time.ReadableInstant) dateMidnight60);
        boolean boolean67 = interval30.isAfter((org.joda.time.ReadableInterval) interval66);
        long long68 = interval66.toDurationMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime37", (dateTime14.compareTo(dateTime37) == 0) == dateTime14.equals(dateTime37));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        java.lang.String str16 = dateTimeZone13.getShortName((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime11.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime17.toMutableDateTime(chronology18);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMonths((-60));
        org.joda.time.DateTime dateTime23 = dateTime17.plusWeeks(1970);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime25 = dateTime17.plus(readableDuration24);
        org.joda.time.DateTime.Property property26 = dateTime25.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime25", (dateTime11.compareTo(dateTime25) == 0) == dateTime11.equals(dateTime25));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        mutableDateTime3.addDays(1899);
        mutableDateTime3.addDays(2);
        mutableDateTime3.addHours(31);
        java.util.Date date21 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.fromDateFields(date21);
        int int23 = localDate22.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        int int26 = dateTimeZone24.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime27 = localDate22.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.withCenturyOfEra((int) (short) 1);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period34 = org.joda.time.Period.minutes(1);
        java.lang.String str35 = period34.toString();
        org.joda.time.Period period36 = period32.withFields((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Period period38 = period36.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType39 = org.joda.time.DurationFieldType.months();
        int int40 = period38.get(durationFieldType39);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight28.withPeriodAdded((org.joda.time.ReadablePeriod) period38, 0);
        org.joda.time.DateMidnight.Property property43 = dateMidnight28.monthOfYear();
        org.joda.time.DateMidnight dateMidnight45 = property43.addToCopy(15);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.withYearOfCentury(55);
        int int48 = dateMidnight45.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight45.minus(readablePeriod49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.plusDays((-2));
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str55 = dateTimeZone54.getID();
        org.joda.time.DateMidnight dateMidnight56 = org.joda.time.DateMidnight.now(dateTimeZone54);
        int int58 = dateTimeZone54.getOffsetFromLocal(10L);
        java.lang.String str60 = dateTimeZone54.getShortName((long) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime61 = dateMidnight50.toMutableDateTime(dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime62 = dateMidnight50.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone63 = dateMidnight50.getZone();
        mutableDateTime3.setZoneRetainFields(dateTimeZone63);
        mutableDateTime3.setMillisOfDay(26473591);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight45 and mutableDateTime61", (dateMidnight45.compareTo(mutableDateTime61) == 0) == dateMidnight45.equals(mutableDateTime61));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = timeOfDay5.getFields();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTimeToday(dateTimeZone7);
        org.joda.time.DateTime.Property property9 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime11 = dateTime8.minusMillis((int) (byte) -1);
        boolean boolean13 = dateTime8.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        boolean boolean16 = dateTime8.isSupported(dateTimeFieldType14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        org.joda.time.DateTime dateTime19 = dateTime18.toDateTime();
        boolean boolean20 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = timeOfDay27.toDateTimeToday(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.minus((long) (short) 0);
        org.joda.time.Period period33 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period35 = org.joda.time.Period.minutes(1);
        java.lang.String str36 = period35.toString();
        org.joda.time.Period period37 = period33.withFields((org.joda.time.ReadablePeriod) period35);
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period39 = period33.normalizedStandard(periodType38);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(readableDuration22, (org.joda.time.ReadableInstant) dateTime31, periodType38);
        int int41 = mutablePeriod40.getMonths();
        org.joda.time.Period period42 = period21.minus((org.joda.time.ReadablePeriod) mutablePeriod40);
        int int43 = period42.getDays();
        int int44 = period42.size();
        int int45 = period42.getYears();
        org.joda.time.Period period47 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period49 = org.joda.time.Period.minutes(1);
        java.lang.String str50 = period49.toString();
        org.joda.time.Period period51 = period47.withFields((org.joda.time.ReadablePeriod) period49);
        org.joda.time.Period period53 = period51.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType54 = org.joda.time.DurationFieldType.months();
        int int55 = period53.get(durationFieldType54);
        int int56 = period53.size();
        org.joda.time.Period period58 = period53.plusMinutes(0);
        org.joda.time.LocalTime localTime62 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology63 = localTime62.getChronology();
        org.joda.time.MutableDateTime mutableDateTime64 = org.joda.time.MutableDateTime.now(chronology63);
        org.joda.time.Period period65 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology63);
        org.joda.time.Period period66 = period53.minus((org.joda.time.ReadablePeriod) period65);
        org.joda.time.Period period67 = period42.plus((org.joda.time.ReadablePeriod) period66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime64", (dateTime18.compareTo(mutableDateTime64) == 0) == dateTime18.equals(mutableDateTime64));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.minusMillis((int) 'a');
        int int15 = dateTime14.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime14.withYear(55);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 5, chronology21);
        org.joda.time.Chronology chronology23 = chronology21.withUTC();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 10, chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod26.setPeriod(readableDuration27, chronology28);
        long long32 = chronology23.add((org.joda.time.ReadablePeriod) mutablePeriod26, (long) 32772, 6);
        org.joda.time.DateTimeField dateTimeField33 = chronology23.era();
        org.joda.time.DateTime dateTime34 = dateTime14.withChronology(chronology23);
        org.joda.time.DateTimeField dateTimeField35 = chronology23.dayOfYear();
        long long37 = dateTimeField35.remainder(88171200000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime34", (dateTime14.compareTo(dateTime34) == 0) == dateTime14.equals(dateTime34));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusSeconds(17);
        org.joda.time.Period period7 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period9 = org.joda.time.Period.minutes(1);
        java.lang.String str10 = period9.toString();
        org.joda.time.Period period11 = period7.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period11.plusMillis(100);
        org.joda.time.Period period15 = period11.minusMillis((int) (byte) 1);
        org.joda.time.DateTime dateTime17 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period15, 15);
        org.joda.time.DateTime dateTime19 = dateTime17.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTime dateTime21 = dateTime19.minusWeeks(1971);
        org.joda.time.DateTime dateTime23 = dateTime19.minus((long) 18);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.centuryOfEra();
        org.joda.time.TimeOfDay timeOfDay29 = org.joda.time.TimeOfDay.fromMillisOfDay(1645491171984L, chronology27);
        org.joda.time.DateTime dateTime30 = dateTime23.toDateTime(chronology27);
        org.joda.time.DateTimeField dateTimeField31 = chronology27.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime30", (dateTime23.compareTo(dateTime30) == 0) == dateTime23.equals(dateTime30));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = timeOfDay5.getFields();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTimeToday(dateTimeZone7);
        org.joda.time.DateTime.Property property9 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime11 = dateTime8.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime11.minusMillis((int) 'a');
        int int16 = dateTime15.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime18 = dateTime15.withYear(55);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) 5, chronology22);
        org.joda.time.Chronology chronology24 = chronology22.withUTC();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 10, chronology26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Chronology chronology29 = null;
        mutablePeriod27.setPeriod(readableDuration28, chronology29);
        long long33 = chronology24.add((org.joda.time.ReadablePeriod) mutablePeriod27, (long) 32772, 6);
        org.joda.time.DateTimeField dateTimeField34 = chronology24.era();
        org.joda.time.DateTime dateTime35 = dateTime15.withChronology(chronology24);
        org.joda.time.DateTime dateTime36 = dateTime35.withLaterOffsetAtOverlap();
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology40 = localTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone42 = chronology40.getZone();
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay((-11056028000L), chronology40);
        org.joda.time.DateTime dateTime44 = dateTime35.withChronology(chronology40);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) 26590897, chronology40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime35", (dateTime15.compareTo(dateTime35) == 0) == dateTime15.equals(dateTime35));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now(chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 10, chronology5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod6.setPeriod(readableDuration7, chronology8);
        mutablePeriod6.setSeconds(0);
        int[] intArray13 = chronology2.get((org.joda.time.ReadablePeriod) mutablePeriod6, (long) (short) -1);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 5, chronology19);
        org.joda.time.Chronology chronology21 = chronology19.withUTC();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay((long) 2022, chronology21);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.now(chronology21);
        mutablePeriod6.add((long) (short) 10, chronology21);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology21);
        mutableDateTime25.addDays(26165252);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = timeOfDay36.toDateTimeToday(dateTimeZone37);
        mutableDateTime31.setZoneRetainFields(dateTimeZone37);
        mutableDateTime31.setSecondOfMinute((int) (short) 0);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime31.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        int int45 = dateTimeZone43.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = timeOfDay51.toDateTimeToday(dateTimeZone52);
        mutableDateTime46.setZoneRetainFields(dateTimeZone52);
        org.joda.time.Chronology chronology55 = null;
        mutableDateTime46.setChronology(chronology55);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime46.centuryOfEra();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime46.yearOfEra();
        boolean boolean59 = mutableDateTime31.equals((java.lang.Object) property58);
        mutableDateTime25.setMillis((org.joda.time.ReadableInstant) mutableDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime46", (mutableDateTime3.compareTo(mutableDateTime46) == 0) == mutableDateTime3.equals(mutableDateTime46));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.yearOfCentury();
        long long2 = mutableDateTime0.getMillis();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.monthOfYear();
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = timeOfDay9.toDateTimeToday(dateTimeZone10);
        org.joda.time.TimeOfDay.Property property12 = timeOfDay9.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay13 = property12.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay15 = property12.addToCopy(0);
        int int16 = property12.getMinimumValueOverall();
        org.joda.time.TimeOfDay timeOfDay18 = property12.addToCopy((int) ' ');
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.withSecondOfMinute(17);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.plusHours((int) ' ');
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutableDateTime29.add(readableDuration30, 0);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime29.dayOfWeek();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime35 = property34.roundHalfEven();
        boolean boolean36 = interval25.isBefore((org.joda.time.ReadableInstant) mutableDateTime35);
        int int37 = mutableDateTime35.getHourOfDay();
        org.joda.time.DateTime dateTime38 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) mutableDateTime35);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime46 = timeOfDay44.toDateTimeToday(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime46.minus((long) (short) 0);
        org.joda.time.Period period50 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period52 = org.joda.time.Period.minutes(1);
        java.lang.String str53 = period52.toString();
        org.joda.time.Period period54 = period50.withFields((org.joda.time.ReadablePeriod) period52);
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period56 = period50.normalizedStandard(periodType55);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(readableDuration39, (org.joda.time.ReadableInstant) dateTime48, periodType55);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        int int61 = dateTimeZone59.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(dateTimeZone59);
        org.joda.time.ReadableDuration readableDuration63 = null;
        mutableDateTime62.add(readableDuration63, 0);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime62.dayOfWeek();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime62.yearOfEra();
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology71 = localTime70.getChronology();
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime((long) 5, chronology71);
        org.joda.time.Chronology chronology73 = chronology71.withUTC();
        mutableDateTime62.setChronology(chronology71);
        org.joda.time.DateTimeField dateTimeField75 = chronology71.millisOfSecond();
        mutablePeriod57.setPeriod(0L, chronology71);
        org.joda.time.TimeOfDay timeOfDay77 = timeOfDay22.withChronologyRetainFields(chronology71);
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime(chronology71);
        org.joda.time.DateTimeField dateTimeField79 = chronology71.secondOfDay();
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime(1645404772000L, chronology71);
        org.joda.time.MutableDateTime mutableDateTime81 = mutableDateTime0.toMutableDateTime(chronology71);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.LocalDateTime localDateTime84 = new org.joda.time.LocalDateTime((long) 10, chronology83);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime84.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime88 = localDateTime84.plusMillis((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime90 = localDateTime88.withMillisOfDay(1970);
        int[] intArray92 = chronology71.get((org.joda.time.ReadablePartial) localDateTime88, 2119739502000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and mutableDateTime81", (mutableDateTime0.compareTo(mutableDateTime81) == 0) == mutableDateTime0.equals(mutableDateTime81));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        java.lang.String str11 = period10.toString();
        org.joda.time.Period period12 = period8.withFields((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Period period14 = period12.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.months();
        int int16 = period14.get(durationFieldType15);
        mutableDateTime3.add(durationFieldType15, 7);
        mutableDateTime3.addSeconds((-292275054));
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        int int23 = dateTimeZone21.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.ReadableDuration readableDuration25 = null;
        mutableDateTime24.add(readableDuration25, 0);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime24.dayOfWeek();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.yearOfEra();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology33 = localTime32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 5, chronology33);
        org.joda.time.Chronology chronology35 = chronology33.withUTC();
        mutableDateTime24.setChronology(chronology33);
        mutableDateTime24.setYear((int) (byte) 100);
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology42 = localTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology42.getZone();
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay((-11056028000L), chronology42);
        org.joda.time.DurationField durationField46 = chronology42.years();
        mutableDateTime24.setChronology(chronology42);
        long long51 = chronology42.add((long) 17, (long) 17, 1969);
        org.joda.time.DateTime dateTime52 = mutableDateTime3.toDateTime(chronology42);
        org.joda.time.DurationField durationField53 = chronology42.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime52", (mutableDateTime3.compareTo(dateTime52) == 0) == mutableDateTime3.equals(dateTime52));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime9 = dateTime7.toDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone11);
        mutableDateTime14.setMillis((long) 1);
        java.lang.String str17 = dateTimeFormatter10.print((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter10.withPivotYear(26188858);
        java.lang.String str20 = dateTime7.toString(dateTimeFormatter10);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(chronology25);
        org.joda.time.Period period27 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology25);
        org.joda.time.DurationField durationField28 = chronology25.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = chronology25.halfdayOfDay();
        org.joda.time.DateTime dateTime30 = dateTime7.withChronology(chronology25);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime30", (dateTime7.compareTo(dateTime30) == 0) == dateTime7.equals(dateTime30));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = timeOfDay9.toDateTimeToday(dateTimeZone10);
        mutableDateTime4.setZoneRetainFields(dateTimeZone10);
        mutableDateTime4.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        mutableDateTime4.setZone(dateTimeZone15);
        boolean boolean19 = dateTimeZone15.isFixed();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone15);
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.lang.String str23 = dateTimeZone15.getShortName((-62134732800016L), locale22);
        java.lang.String str24 = dateTimeZone15.toString();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 26366559, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = timeOfDay34.toDateTimeToday(dateTimeZone35);
        mutableDateTime29.setZoneRetainFields(dateTimeZone35);
        mutableDateTime29.setSecondOfMinute((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        int int42 = dateTimeZone40.getStandardOffset((long) 100);
        mutableDateTime29.setZone(dateTimeZone40);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology48 = localTime47.getChronology();
        org.joda.time.Interval interval49 = new org.joda.time.Interval((-1L), (long) 17, chronology48);
        mutableDateTime29.setChronology(chronology48);
        java.lang.String str51 = chronology48.toString();
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(chronology48);
        org.joda.time.DateTimeField dateTimeField53 = chronology48.millisOfSecond();
        org.joda.time.DateTime dateTime54 = mutableDateTime25.toDateTime(chronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and mutableDateTime29", (mutableDateTime4.compareTo(mutableDateTime29) == 0) == mutableDateTime4.equals(mutableDateTime29));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.DateTimeZone dateTimeZone5 = instant4.getZone();
        java.lang.String str7 = dateTimeZone5.getShortName(2855L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant4", (dateTime3.compareTo(instant4) == 0) == dateTime3.equals(instant4));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTime.Property property10 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property10.withMaximumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.plusWeeks(5603523);
        int int14 = dateTime13.getMinuteOfDay();
        org.joda.time.DateTime dateTime16 = dateTime13.withYearOfEra(26324141);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.millis();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology24);
        org.joda.time.Period period26 = new org.joda.time.Period((long) 25, (long) (-1), periodType21, chronology24);
        java.lang.String str27 = periodType21.toString();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology31 = localTime30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.hours();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay((long) 38, chronology31);
        org.joda.time.Period period34 = new org.joda.time.Period((long) 14, 52L, periodType21, chronology31);
        org.joda.time.DateTime dateTime35 = dateTime13.toDateTime(chronology31);
        org.joda.time.DateTimeField dateTimeField36 = chronology31.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime35", (dateTime13.compareTo(dateTime35) == 0) == dateTime13.equals(dateTime35));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime9 = dateTime7.toDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone11);
        mutableDateTime14.setMillis((long) 1);
        java.lang.String str17 = dateTimeFormatter10.print((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter10.withPivotYear(26188858);
        java.lang.String str20 = dateTime7.toString(dateTimeFormatter10);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(chronology25);
        org.joda.time.Period period27 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology25);
        org.joda.time.DurationField durationField28 = chronology25.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = chronology25.halfdayOfDay();
        org.joda.time.DateTime dateTime30 = dateTime7.withChronology(chronology25);
        int int31 = dateTime30.getMillisOfSecond();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime30, readableDuration32);
        java.lang.String str34 = interval33.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime30", (dateTime7.compareTo(dateTime30) == 0) == dateTime7.equals(dateTime30));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str23 = locale20.getDisplayVariant(locale22);
        java.lang.String str24 = dateTimeZone17.getName((long) 5, locale20);
        org.joda.time.DateTime dateTime25 = dateTime15.withZoneRetainFields(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight26 = yearMonthDay12.toDateMidnight(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.plusWeeks((int) ' ');
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(53, (-1), (int) (short) 100, 100, 52, 59, 12, (int) (byte) 1);
        int int38 = mutablePeriod37.getMinutes();
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight26.plus((org.joda.time.ReadablePeriod) mutablePeriod37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        org.joda.time.Instant instant42 = dateTime41.toInstant();
        org.joda.time.DateTime dateTime44 = dateTime41.withWeekOfWeekyear(13);
        org.joda.time.DateTime dateTime46 = dateTime41.minusWeeks((-5599659));
        java.util.Date date53 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate54 = org.joda.time.LocalDate.fromDateFields(date53);
        int int55 = localDate54.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        int int58 = dateTimeZone56.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime59 = localDate54.toDateTimeAtCurrentTime(dateTimeZone56);
        long long61 = dateTimeZone56.convertUTCToLocal(10L);
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight((long) 12160, dateTimeZone56);
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.Period period65 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period67 = org.joda.time.Period.minutes(1);
        java.lang.String str68 = period67.toString();
        org.joda.time.Period period69 = period65.withFields((org.joda.time.ReadablePeriod) period67);
        org.joda.time.PeriodType periodType70 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period71 = period65.normalizedStandard(periodType70);
        org.joda.time.PeriodType periodType72 = periodType70.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight62, readableDuration63, periodType72);
        org.joda.time.Period period74 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight39, (org.joda.time.ReadableInstant) dateTime41, periodType72);
        int int75 = periodType72.size();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant42", (dateTime14.compareTo(instant42) == 0) == dateTime14.equals(instant42));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        boolean boolean6 = timeZone2.hasSameRules(timeZone5);
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone5, locale7);
        int int9 = timeZone5.getRawOffset();
        int int10 = timeZone5.getRawOffset();
        boolean boolean11 = timeZone5.observesDaylightTime();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period14 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        java.lang.String str17 = period16.toString();
        org.joda.time.Period period18 = period14.withFields((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period20 = period18.plusMillis(100);
        org.joda.time.LocalTime localTime21 = localTime12.minus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.LocalTime.Property property22 = localTime12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period26 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period28 = org.joda.time.Period.minutes(1);
        java.lang.String str29 = period28.toString();
        org.joda.time.Period period30 = period26.withFields((org.joda.time.ReadablePeriod) period28);
        org.joda.time.Period period32 = period30.plusMillis(100);
        org.joda.time.LocalTime localTime33 = localTime24.minus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.LocalTime localTime35 = localTime24.minusHours((-1));
        java.util.Locale locale37 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str38 = dateTimeField23.getAsText((org.joda.time.ReadablePartial) localTime24, locale37);
        java.lang.String str39 = locale37.getDisplayCountry();
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone5, locale37);
        java.util.Calendar calendar41 = java.util.Calendar.getInstance();
        boolean boolean42 = calendar41.isWeekDateSupported();
        calendar41.setTimeInMillis((long) 52);
        java.util.Date date50 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        int int51 = date50.getSeconds();
        date50.setHours((int) (byte) 1);
        date50.setYear(32772);
        org.joda.time.TimeOfDay timeOfDay56 = org.joda.time.TimeOfDay.fromDateFields(date50);
        calendar41.setTime(date50);
        int int58 = calendar41.getWeeksInWeekYear();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone61 = dateTimeZone60.toTimeZone();
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology65 = localTime64.getChronology();
        org.joda.time.DurationField durationField66 = chronology65.hours();
        org.joda.time.DateTimeField dateTimeField67 = chronology65.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField68 = chronology65.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime69 = org.joda.time.MutableDateTime.now(chronology65);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(0L, chronology65);
        int int71 = dateTimeZone60.getOffset((org.joda.time.ReadableInstant) dateTime70);
        java.util.TimeZone timeZone72 = dateTimeZone60.toTimeZone();
        java.util.Calendar calendar73 = java.util.Calendar.getInstance(timeZone72);
        boolean boolean74 = calendar41.before((java.lang.Object) timeZone72);
        int int75 = timeZone72.getRawOffset();
        boolean boolean76 = timeZone5.hasSameRules(timeZone72);
        timeZone5.setID("1970-01-01T00:00:00.032+00:00:00.016");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar40 and calendar73", (calendar40.compareTo(calendar73) == 0) == calendar40.equals(calendar73));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.Instant instant5 = dateTime3.toInstant();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str8 = dateTimeZone7.getID();
        java.lang.String str10 = dateTimeZone7.getShortName((long) (short) 100);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight12 = org.joda.time.DateMidnight.now(dateTimeZone7);
        org.joda.time.DateTime dateTime13 = instant5.toDateTime(dateTimeZone7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant4", (dateTime3.compareTo(instant4) == 0) == dateTime3.equals(instant4));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum((int) (short) 0);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now();
        org.joda.time.Period period6 = org.joda.time.Period.minutes(1);
        org.joda.time.LocalTime localTime8 = localTime4.withPeriodAdded((org.joda.time.ReadablePeriod) period6, (int) ' ');
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray15 = timeOfDay14.getFields();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTime.Property property18 = dateTime17.monthOfYear();
        org.joda.time.DateTime dateTime20 = dateTime17.minusMillis((int) (byte) -1);
        boolean boolean22 = dateTime17.isAfter((long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        boolean boolean25 = dateTime17.isSupported(dateTimeFieldType23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTime dateTime28 = dateTime27.toDateTime();
        boolean boolean29 = dateTime17.isAfter((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Period period30 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = timeOfDay36.toDateTimeToday(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.minus((long) (short) 0);
        org.joda.time.Period period42 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period44 = org.joda.time.Period.minutes(1);
        java.lang.String str45 = period44.toString();
        org.joda.time.Period period46 = period42.withFields((org.joda.time.ReadablePeriod) period44);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period48 = period42.normalizedStandard(periodType47);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(readableDuration31, (org.joda.time.ReadableInstant) dateTime40, periodType47);
        int int50 = mutablePeriod49.getMonths();
        org.joda.time.Period period51 = period30.minus((org.joda.time.ReadablePeriod) mutablePeriod49);
        org.joda.time.LocalTime localTime53 = localTime4.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod49, 0);
        org.joda.time.LocalTime localTime54 = localTime3.minus((org.joda.time.ReadablePeriod) mutablePeriod49);
        org.joda.time.LocalTime localTime56 = localTime3.plusSeconds((-983));
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) 10);
        org.joda.time.DateTime.Property property59 = dateTime58.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str62 = dateTimeZone61.getID();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(dateTimeZone61);
        org.joda.time.DateTime dateTime65 = dateTime63.minusHours((int) ' ');
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.Period period70 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period72 = org.joda.time.Period.minutes(1);
        java.lang.String str73 = period72.toString();
        org.joda.time.Period period74 = period70.withFields((org.joda.time.ReadablePeriod) period72);
        org.joda.time.Period period76 = period74.plusMillis(100);
        org.joda.time.Period period77 = period74.negated();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType79 = dateTimeFieldType78.getDurationType();
        boolean boolean80 = period74.isSupported(durationFieldType79);
        boolean boolean81 = periodType68.isSupported(durationFieldType79);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod((long) 59, (long) 9, periodType68);
        org.joda.time.PeriodType periodType83 = periodType68.withSecondsRemoved();
        org.joda.time.PeriodType periodType84 = periodType83.withDaysRemoved();
        org.joda.time.Period period85 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableInstant) dateTime63, periodType83);
        org.joda.time.LocalTime localTime86 = localTime56.minus((org.joda.time.ReadablePeriod) period85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime63", (dateTime27.compareTo(dateTime63) == 0) == dateTime27.equals(dateTime63));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.dayOfWeek();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        boolean boolean16 = timeZone12.hasSameRules(timeZone15);
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone15, locale17);
        int int20 = timeZone15.getOffset((long) 5);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone15);
        java.util.Locale locale22 = java.util.Locale.KOREAN;
        java.util.Locale locale24 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str25 = locale22.getDisplayVariant(locale24);
        java.util.Locale locale26 = locale24.stripExtensions();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str29 = dateTimeZone28.getID();
        java.util.Locale locale31 = java.util.Locale.KOREAN;
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str34 = locale31.getDisplayVariant(locale33);
        java.lang.String str35 = dateTimeZone28.getName((long) 5, locale31);
        java.util.Locale locale36 = java.util.Locale.KOREAN;
        java.lang.String str37 = locale31.getDisplayScript(locale36);
        java.lang.String str38 = locale26.getDisplayName(locale31);
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone15, locale26);
        timeZone15.setID("hi!");
        boolean boolean42 = property7.equals((java.lang.Object) "hi!");
        int int43 = property7.getMinimumValueOverall();
        org.joda.time.LocalDate localDate44 = property7.getLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar21", (calendar18.compareTo(calendar21) == 0) == calendar18.equals(calendar21));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusSeconds(17);
        org.joda.time.Period period7 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period9 = org.joda.time.Period.minutes(1);
        java.lang.String str10 = period9.toString();
        org.joda.time.Period period11 = period7.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period11.plusMillis(100);
        org.joda.time.Period period15 = period11.minusMillis((int) (byte) 1);
        org.joda.time.DateTime dateTime17 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period15, 15);
        org.joda.time.DateTime dateTime19 = dateTime17.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTime dateTime21 = dateTime19.minusWeeks(1971);
        org.joda.time.DateTime dateTime23 = dateTime19.minus((long) 18);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.centuryOfEra();
        org.joda.time.TimeOfDay timeOfDay29 = org.joda.time.TimeOfDay.fromMillisOfDay(1645491171984L, chronology27);
        org.joda.time.DateTime dateTime30 = dateTime23.toDateTime(chronology27);
        org.joda.time.DateTimeField dateTimeField31 = chronology27.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime30", (dateTime23.compareTo(dateTime30) == 0) == dateTime23.equals(dateTime30));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(8L);
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime4 = localTime1.minusMillis(44);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(chronology9);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 11, (-2234643900000L), chronology9);
        org.joda.time.DurationField durationField12 = chronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekyear();
        org.joda.time.DurationField durationField14 = chronology9.eras();
        boolean boolean15 = localTime1.equals((java.lang.Object) chronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField14", Math.signum(durationField12.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField12)));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.Interval interval5 = new org.joda.time.Interval((-1L), (long) 17, chronology4);
        org.joda.time.Interval interval8 = new org.joda.time.Interval((long) (-1), 97L);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray15 = timeOfDay14.getFields();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTimeToday(dateTimeZone16);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period25 = period19.normalizedStandard(periodType24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateTime17, periodType24);
        org.joda.time.PeriodType periodType27 = periodType24.withMillisRemoved();
        org.joda.time.Period period28 = interval8.toPeriod(periodType27);
        boolean boolean29 = interval8.isAfterNow();
        org.joda.time.MutableInterval mutableInterval30 = interval8.toMutableInterval();
        long long31 = interval8.getStartMillis();
        boolean boolean32 = interval5.isBefore((org.joda.time.ReadableInterval) interval8);
        org.joda.time.DateTime dateTime33 = interval5.getEnd();
        org.joda.time.DateTime dateTime35 = dateTime33.withWeekyear(44);
        org.joda.time.DateTime dateTime37 = dateTime33.plusMinutes(7);
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray43 = timeOfDay42.getFields();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = timeOfDay42.toDateTimeToday(dateTimeZone44);
        org.joda.time.DateTime.Property property46 = dateTime45.monthOfYear();
        org.joda.time.DateTime dateTime48 = dateTime45.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.toDateTime(chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        int int53 = dateTimeZone51.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(dateTimeZone51);
        org.joda.time.TimeOfDay timeOfDay59 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime61 = timeOfDay59.toDateTimeToday(dateTimeZone60);
        mutableDateTime54.setZoneRetainFields(dateTimeZone60);
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime54, readableDuration63);
        boolean boolean65 = dateTime50.isBefore((org.joda.time.ReadableInstant) mutableDateTime54);
        java.lang.Object obj66 = mutableDateTime54.clone();
        org.joda.time.DurationFieldType durationFieldType67 = org.joda.time.DurationFieldType.halfdays();
        mutableDateTime54.add(durationFieldType67, 18);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        org.joda.time.MutableDateTime mutableDateTime72 = mutableDateTime54.toMutableDateTime(dateTimeZone71);
        java.lang.String str73 = dateTimeZone71.toString();
        org.joda.time.DateTime dateTime74 = dateTime37.toDateTime(dateTimeZone71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime54 and mutableDateTime72", (mutableDateTime54.compareTo(mutableDateTime72) == 0) == mutableDateTime54.equals(mutableDateTime72));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        java.util.Date date6 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromDateFields(date6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate7.plusWeeks((int) (short) 0);
        int int12 = localDate7.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str15 = dateTimeZone14.getID();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = localDate7.toDateMidnight(dateTimeZone14);
        java.util.Date date23 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.fromDateFields(date23);
        int int25 = localDate24.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime29 = localDate24.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight17.withZoneRetainFields(dateTimeZone26);
        java.lang.String str32 = dateTimeZone26.getID();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(98L, dateTimeZone26);
        java.lang.String str36 = dateTimeZone26.getShortName((long) 11);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime33", (dateTime16.compareTo(dateTime33) == 0) == dateTime16.equals(dateTime33));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfMonth();
        org.joda.time.DateTime dateTime5 = property4.getDateTime();
        org.joda.time.Period period7 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period9 = org.joda.time.Period.minutes(1);
        java.lang.String str10 = period9.toString();
        org.joda.time.Period period11 = period7.withFields((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period13 = period11.plusMillis(100);
        org.joda.time.Period period14 = period11.negated();
        org.joda.time.Period period16 = period14.withMillis(1899);
        org.joda.time.Period period18 = period14.plusDays((int) (byte) 1);
        org.joda.time.Period period20 = period18.minusDays(944);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(chronology21);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(16, (int) '#', 1899, 99);
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay22.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod27, 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay29.withPeriodAdded(readablePeriod30, 48);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray41 = timeOfDay40.getFields();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = timeOfDay40.toDateTimeToday(dateTimeZone42);
        org.joda.time.Period period45 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period47 = org.joda.time.Period.minutes(1);
        java.lang.String str48 = period47.toString();
        org.joda.time.Period period49 = period45.withFields((org.joda.time.ReadablePeriod) period47);
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period51 = period45.normalizedStandard(periodType50);
        org.joda.time.Period period52 = new org.joda.time.Period(readableDuration35, (org.joda.time.ReadableInstant) dateTime43, periodType50);
        org.joda.time.PeriodType periodType53 = periodType50.withMillisRemoved();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType55 = dateTimeFieldType54.getDurationType();
        boolean boolean56 = periodType53.isSupported(durationFieldType55);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 'a', (long) 15, periodType53);
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay32.plus((org.joda.time.ReadablePeriod) mutablePeriod57);
        org.joda.time.Period period59 = period18.withFields((org.joda.time.ReadablePeriod) mutablePeriod57);
        org.joda.time.Period period61 = period59.multipliedBy(100);
        org.joda.time.DateTime dateTime63 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period61, 14);
        java.util.Date date72 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate73 = org.joda.time.LocalDate.fromDateFields(date72);
        int int74 = localDate73.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.getDefault();
        int int77 = dateTimeZone75.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime78 = localDate73.toDateTimeAtCurrentTime(dateTimeZone75);
        org.joda.time.DateMidnight dateMidnight79 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone75);
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight79.withCenturyOfEra((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.getDefault();
        int int84 = dateTimeZone82.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime85 = new org.joda.time.MutableDateTime(dateTimeZone82);
        org.joda.time.DateMidnight dateMidnight86 = dateMidnight79.withZoneRetainFields(dateTimeZone82);
        java.lang.String str88 = dateTimeZone82.getNameKey(0L);
        org.joda.time.DateTime dateTime89 = new org.joda.time.DateTime((java.lang.Object) dateTime63, dateTimeZone82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime85", (dateTime3.compareTo(mutableDateTime85) == 0) == dateTime3.equals(mutableDateTime85));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        java.lang.String str16 = dateTimeZone13.getShortName((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime11.withZone(dateTimeZone13);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime17.toMutableDateTime(chronology18);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMonths((-60));
        org.joda.time.DateTime dateTime23 = dateTime17.plusWeeks(1970);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime25 = dateTime17.plus(readableDuration24);
        org.joda.time.DateTime.Property property26 = dateTime25.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime25", (dateTime11.compareTo(dateTime25) == 0) == dateTime11.equals(dateTime25));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.plusSeconds(17);
        int int6 = dateTime3.getHourOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.minus((long) 9);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = timeOfDay15.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minus((long) (short) 0);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period23 = org.joda.time.Period.minutes(1);
        java.lang.String str24 = period23.toString();
        org.joda.time.Period period25 = period21.withFields((org.joda.time.ReadablePeriod) period23);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period27 = period21.normalizedStandard(periodType26);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableDuration10, (org.joda.time.ReadableInstant) dateTime19, periodType26);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime8, readableDuration9, periodType26);
        org.joda.time.PeriodType periodType30 = periodType26.withYearsRemoved();
        org.joda.time.Period period32 = org.joda.time.Period.millis(1439);
        int int33 = period32.size();
        java.util.Date date42 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.fromDateFields(date42);
        int int44 = localDate43.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        int int47 = dateTimeZone45.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime48 = localDate43.toDateTimeAtCurrentTime(dateTimeZone45);
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight((int) (short) 1, (int) (byte) 1, (int) (short) 10, dateTimeZone45);
        org.joda.time.Interval interval50 = dateMidnight49.toInterval();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(chronology51);
        org.joda.time.DateTime dateTime53 = dateTime52.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str56 = dateTimeZone55.getID();
        java.util.Locale locale58 = java.util.Locale.KOREAN;
        java.util.Locale locale60 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str61 = locale58.getDisplayVariant(locale60);
        java.lang.String str62 = dateTimeZone55.getName((long) 5, locale58);
        org.joda.time.DateTime dateTime63 = dateTime53.withZoneRetainFields(dateTimeZone55);
        boolean boolean64 = dateMidnight49.isEqual((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight49.withYear((-11));
        org.joda.time.DurationFieldType durationFieldType67 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight66.withFieldAdded(durationFieldType67, 0);
        org.joda.time.Period period71 = period32.withFieldAdded(durationFieldType67, 24);
        int int72 = periodType26.indexOf(durationFieldType67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime52", (dateTime3.compareTo(dateTime52) == 0) == dateTime3.equals(dateTime52));
    }
}

