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
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.plus(readableDuration6);
        org.joda.time.DateTime dateTime10 = dateTime5.withDurationAdded((long) 0, (int) (byte) 10);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        org.joda.time.DateTime.Property property19 = dateTime18.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology21 = null;
        boolean boolean22 = dateTimeFieldType20.isSupported(chronology21);
        int int23 = dateTime18.get(dateTimeFieldType20);
        boolean boolean24 = dateTime5.isSupported(dateTimeFieldType20);
        org.joda.time.Instant instant25 = dateTime5.toInstant();
        int int26 = dateTime5.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant25", (dateTime5.compareTo(instant25) == 0) == dateTime5.equals(instant25));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withMillisOfDay(5);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfWeek();
        boolean boolean17 = dateTime5.equals((java.lang.Object) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime5.withWeekyear((-292275054));
        org.joda.time.DateTime.Property property20 = dateTime5.millisOfDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate22.minus(readablePeriod23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate24.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.plus(readableDuration27);
        org.joda.time.DateTime dateTime31 = dateTime26.withDurationAdded((long) 0, (int) (byte) 10);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate35 = localDate33.minus(readablePeriod34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localDate35.toDateTimeAtMidnight(dateTimeZone36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.minus(readablePeriod38);
        org.joda.time.DateTime.Property property40 = dateTime39.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology42 = null;
        boolean boolean43 = dateTimeFieldType41.isSupported(chronology42);
        int int44 = dateTime39.get(dateTimeFieldType41);
        boolean boolean45 = dateTime26.isSupported(dateTimeFieldType41);
        org.joda.time.Instant instant46 = dateTime26.toInstant();
        int int47 = dateTime5.compareTo((org.joda.time.ReadableInstant) instant46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(chronology48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDate localDate51 = localDate49.minus(readablePeriod50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localDate51.toDateTimeAtMidnight(dateTimeZone52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.DateTime dateTime55 = dateTime53.minus(readablePeriod54);
        org.joda.time.DateTime.Property property56 = dateTime55.millisOfDay();
        boolean boolean57 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant46", (dateTime13.compareTo(instant46) == 0) == dateTime13.equals(instant46));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.plus(readableDuration6);
        org.joda.time.DateTime dateTime10 = dateTime5.withDurationAdded((long) 0, (int) (byte) 10);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        org.joda.time.DateTime.Property property19 = dateTime18.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology21 = null;
        boolean boolean22 = dateTimeFieldType20.isSupported(chronology21);
        int int23 = dateTime18.get(dateTimeFieldType20);
        boolean boolean24 = dateTime5.isSupported(dateTimeFieldType20);
        org.joda.time.Instant instant25 = dateTime5.toInstant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = dateTime5.toString(dateTimeFormatter26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant25", (dateTime5.compareTo(instant25) == 0) == dateTime5.equals(instant25));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long17 = dateTimeZone15.nextTransition((long) 4);
        org.joda.time.DateTime dateTime18 = dateTime13.withZone(dateTimeZone15);
        int int20 = dateTimeZone15.getStandardOffset((long) 4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime18", (dateTime13.compareTo(dateTime18) == 0) == dateTime13.equals(dateTime18));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long17 = dateTimeZone15.nextTransition((long) 4);
        org.joda.time.DateTime dateTime18 = dateTime13.withZone(dateTimeZone15);
        org.joda.time.DateTime dateTime20 = dateTime13.minusHours(0);
        org.joda.time.DateTime.Property property21 = dateTime13.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime13", (dateTime18.compareTo(dateTime13) == 0) == dateTime18.equals(dateTime13));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        org.joda.time.Instant instant9 = dateTime7.toInstant();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime11 = dateTime7.withZone(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant9", (dateTime7.compareTo(instant9) == 0) == dateTime7.equals(instant9));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.Chronology chronology11 = chronology10.withUTC();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType0.getField(chronology11);
        org.joda.time.DurationField durationField14 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.hourOfHalfday();
        org.joda.time.DurationField durationField16 = chronology11.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField16, and durationField14", !(durationField14.compareTo(durationField16) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField16.compareTo(durationField14))));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.Chronology chronology11 = chronology10.withUTC();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType0.getField(chronology11);
        org.joda.time.DurationField durationField14 = chronology11.eras();
        org.joda.time.DurationField durationField15 = chronology11.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField15, and durationField14", !(durationField14.compareTo(durationField15) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField15.compareTo(durationField14))));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long19 = dateTimeZone16.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str21 = dateTimeZone16.getNameKey(100L);
        org.joda.time.DateTime dateTime22 = dateTime13.withZoneRetainFields(dateTimeZone16);
        boolean boolean23 = dateTime22.isAfterNow();
        org.joda.time.DateTime.Property property24 = dateTime22.dayOfYear();
        org.joda.time.Instant instant25 = dateTime22.toInstant();
        org.joda.time.DateTime.Property property26 = dateTime22.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant25", (dateTime22.compareTo(instant25) == 0) == dateTime22.equals(instant25));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long19 = dateTimeZone16.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str21 = dateTimeZone16.getNameKey(100L);
        org.joda.time.DateTime dateTime22 = dateTime13.withZoneRetainFields(dateTimeZone16);
        boolean boolean23 = dateTime22.isAfterNow();
        org.joda.time.Instant instant24 = dateTime22.toInstant();
        org.joda.time.LocalDateTime localDateTime25 = dateTime22.toLocalDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant24", (dateTime22.compareTo(instant24) == 0) == dateTime22.equals(instant24));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime4.minus(readablePeriod7);
        org.joda.time.LocalTime localTime10 = localTime4.plusSeconds(9);
        org.joda.time.Chronology chronology11 = localTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.hourOfDay();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj1, chronology11);
        org.joda.time.DurationField durationField15 = chronology11.halfdays();
        org.joda.time.DurationField durationField16 = durationFieldType0.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField17 = chronology11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField18 = chronology11.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone22 = dateTimeZone21.toTimeZone();
        int int24 = dateTimeZone21.getStandardOffset((long) (short) 0);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(0L, dateTimeZone21);
        org.joda.time.Chronology chronology26 = chronology11.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField27 = chronology11.dayOfYear();
        org.joda.time.DurationField durationField28 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField15, and durationField16", !(durationField28.compareTo(durationField15) == 0) || (Math.signum(durationField28.compareTo(durationField16)) == Math.signum(durationField15.compareTo(durationField16))));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis(35332195);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        int int12 = dateTimeZone9.getStandardOffset((long) (short) 0);
        long long14 = dateTimeZone9.previousTransition((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime7.toMutableDateTime(dateTimeZone9);
        int int17 = dateTimeZone9.getOffsetFromLocal((long) 327);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime15", (dateTime7.compareTo(mutableDateTime15) == 0) == dateTime7.equals(mutableDateTime15));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        int int6 = localDate5.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property7 = localDate5.weekyear();
        org.joda.time.LocalDate localDate9 = property7.addToCopy((int) (byte) -1);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.joda.time.DurationField durationField12 = chronology10.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField12, and durationField11", !(durationField11.compareTo(durationField12) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField12.compareTo(durationField11))));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.plusMonths(292278994);
        org.joda.time.DateTime dateTime15 = dateTime9.plus(1644537599999L);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate17.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withMillisOfDay(5);
        org.joda.time.DateTime dateTime23 = dateTime19.withCenturyOfEra(20);
        org.joda.time.Instant instant24 = dateTime19.toInstant();
        boolean boolean25 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant24", (dateTime5.compareTo(instant24) == 0) == dateTime5.equals(instant24));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology11 = null;
        boolean boolean12 = dateTimeFieldType10.isSupported(chronology11);
        org.joda.time.Chronology chronology13 = null;
        boolean boolean14 = dateTimeFieldType10.isSupported(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType10.getRangeDurationType();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate18.minus(readablePeriod19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.Chronology chronology23 = localDate20.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long28 = dateTimeZone26.nextTransition((long) 4);
        org.joda.time.Chronology chronology29 = chronology23.withZone(dateTimeZone26);
        org.joda.time.DurationField durationField30 = chronology29.millis();
        org.joda.time.DurationField durationField31 = durationFieldType16.getField(chronology29);
        org.joda.time.DurationField durationField32 = chronology29.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField32 and durationField31", Math.signum(durationField32.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField32)));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.DateTime.Property property10 = dateTime5.secondOfDay();
        org.joda.time.DurationField durationField11 = property10.getDurationField();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate13.minus(readablePeriod14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.plus(readableDuration18);
        org.joda.time.DateTime dateTime22 = dateTime17.withDurationAdded((long) 0, (int) (byte) 10);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate26 = localDate24.minus(readablePeriod25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate26.toDateTimeAtMidnight(dateTimeZone27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.minus(readablePeriod29);
        org.joda.time.DateTime.Property property31 = dateTime30.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology33 = null;
        boolean boolean34 = dateTimeFieldType32.isSupported(chronology33);
        int int35 = dateTime30.get(dateTimeFieldType32);
        boolean boolean36 = dateTime17.isSupported(dateTimeFieldType32);
        org.joda.time.Instant instant37 = dateTime17.toInstant();
        int int38 = property10.compareTo((org.joda.time.ReadableInstant) instant37);
        org.joda.time.DateTime dateTime40 = property10.addWrapFieldToCopy(2022);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant37", (dateTime5.compareTo(instant37) == 0) == dateTime5.equals(instant37));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DurationField durationField6 = durationFieldType3.getField(chronology5);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean13 = localTime11.isSupported(durationFieldType12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime11.minus(readablePeriod14);
        org.joda.time.LocalTime localTime17 = localTime11.plusSeconds(9);
        org.joda.time.Chronology chronology18 = localTime11.getChronology();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology18.add(readablePeriod19, (-2L), 1);
        long long26 = chronology18.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology18);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) 9, chronology18);
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) 32770, chronology29);
        org.joda.time.DurationField durationField31 = durationFieldType3.getField(chronology29);
        org.joda.time.DateTimeField dateTimeField32 = chronology29.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField31", (durationField6.compareTo(durationField31) == 0) == durationField6.equals(durationField31));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.Chronology chronology10 = chronology9.withUTC();
        org.joda.time.DurationField durationField11 = chronology9.halfdays();
        java.lang.String str12 = chronology9.toString();
        org.joda.time.DurationField durationField13 = chronology9.eras();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now(chronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField13", Math.signum(durationField11.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField11)));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology10.add(readablePeriod11, (-2L), 1);
        long long18 = chronology10.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType0.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField21 = chronology10.dayOfYear();
        org.joda.time.DurationField durationField22 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField23 = chronology10.centuryOfEra();
        org.joda.time.DurationField durationField24 = chronology10.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField24, and durationField22", !(durationField22.compareTo(durationField24) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField24.compareTo(durationField22))));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean12 = localTime10.isSupported(durationFieldType11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime10.minus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime10.plusSeconds(9);
        org.joda.time.Chronology chronology17 = localTime10.getChronology();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(chronology17);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology19);
        org.joda.time.DateTimeField dateTimeField22 = chronology19.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField24 = chronology19.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField25 = chronology19.millisOfDay();
        org.joda.time.DurationField durationField26 = chronology19.minutes();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter6.withChronology(chronology19);
        org.joda.time.Chronology chronology28 = dateTimeFormatter27.getChronology();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology30);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean33 = localTime31.isSupported(durationFieldType32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime35 = localTime31.minus(readablePeriod34);
        org.joda.time.LocalTime localTime37 = localTime31.plusSeconds(9);
        org.joda.time.Chronology chronology38 = localTime31.getChronology();
        org.joda.time.Chronology chronology39 = chronology38.withUTC();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.era();
        org.joda.time.Chronology chronology41 = chronology39.withUTC();
        org.joda.time.DurationField durationField42 = chronology39.minutes();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter27.withChronology(chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter44.withPivotYear((java.lang.Integer) 2111);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology49);
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean52 = localTime50.isSupported(durationFieldType51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalTime localTime54 = localTime50.minus(readablePeriod53);
        org.joda.time.LocalTime localTime56 = localTime50.plusSeconds(9);
        org.joda.time.Chronology chronology57 = localTime50.getChronology();
        org.joda.time.Chronology chronology58 = chronology57.withUTC();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(chronology58);
        org.joda.time.DateTimeField dateTimeField60 = dateTimeFieldType47.getField(chronology58);
        org.joda.time.DurationField durationField61 = chronology58.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter44.withChronology(chronology58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField26 and durationField61", Math.signum(durationField26.compareTo(durationField61)) == -Math.signum(durationField61.compareTo(durationField26)));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DurationField durationField6 = durationFieldType3.getField(chronology5);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean13 = localTime11.isSupported(durationFieldType12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime11.minus(readablePeriod14);
        org.joda.time.LocalTime localTime17 = localTime11.plusSeconds(9);
        org.joda.time.Chronology chronology18 = localTime11.getChronology();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology18.add(readablePeriod19, (-2L), 1);
        long long26 = chronology18.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology18);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) 9, chronology18);
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) 32770, chronology29);
        org.joda.time.DurationField durationField31 = durationFieldType3.getField(chronology29);
        org.joda.time.DateTimeField dateTimeField32 = chronology29.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField31", (durationField6.compareTo(durationField31) == 0) == durationField6.equals(durationField31));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withMillisOfDay(5);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfWeek();
        boolean boolean17 = dateTime5.equals((java.lang.Object) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime5.withWeekyear((-292275054));
        org.joda.time.DateTime.Property property20 = dateTime5.millisOfDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate22.minus(readablePeriod23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate24.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.plus(readableDuration27);
        org.joda.time.DateTime dateTime31 = dateTime26.withDurationAdded((long) 0, (int) (byte) 10);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate35 = localDate33.minus(readablePeriod34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localDate35.toDateTimeAtMidnight(dateTimeZone36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.minus(readablePeriod38);
        org.joda.time.DateTime.Property property40 = dateTime39.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology42 = null;
        boolean boolean43 = dateTimeFieldType41.isSupported(chronology42);
        int int44 = dateTime39.get(dateTimeFieldType41);
        boolean boolean45 = dateTime26.isSupported(dateTimeFieldType41);
        org.joda.time.Instant instant46 = dateTime26.toInstant();
        int int47 = dateTime5.compareTo((org.joda.time.ReadableInstant) instant46);
        boolean boolean49 = dateTime5.isAfter((long) 8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant46", (dateTime13.compareTo(instant46) == 0) == dateTime13.equals(instant46));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plus((-25L));
        org.joda.time.DateTime dateTime9 = dateTime3.withMillisOfDay(2022);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.minus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.minus(readablePeriod16);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfWeek();
        org.joda.time.Instant instant19 = dateTime17.toInstant();
        int int20 = dateTime9.compareTo((org.joda.time.ReadableInstant) instant19);
        boolean boolean21 = dateTime9.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant19", (dateTime3.compareTo(instant19) == 0) == dateTime3.equals(instant19));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology12);
        int int15 = localTime14.size();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology17);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean20 = localTime18.isSupported(durationFieldType19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DurationField durationField22 = durationFieldType19.getField(chronology21);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology26);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean29 = localTime27.isSupported(durationFieldType28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalTime localTime31 = localTime27.minus(readablePeriod30);
        org.joda.time.LocalTime localTime33 = localTime27.plusSeconds(9);
        org.joda.time.Chronology chronology34 = localTime27.getChronology();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        long long38 = chronology34.add(readablePeriod35, (-2L), 1);
        long long42 = chronology34.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology34);
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((long) 9, chronology34);
        org.joda.time.Chronology chronology45 = localTime44.getChronology();
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((long) 32770, chronology45);
        org.joda.time.DurationField durationField47 = durationFieldType19.getField(chronology45);
        boolean boolean48 = localTime14.isSupported(durationFieldType19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField47", (durationField22.compareTo(durationField47) == 0) == durationField22.equals(durationField47));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.Chronology chronology11 = chronology10.withUTC();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType0.getField(chronology11);
        org.joda.time.DurationField durationField14 = chronology11.eras();
        org.joda.time.DurationField durationField15 = chronology11.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField15, and durationField14", !(durationField14.compareTo(durationField15) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField15.compareTo(durationField14))));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology10.add(readablePeriod11, (-2L), 1);
        long long18 = chronology10.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType0.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField21 = chronology10.dayOfYear();
        org.joda.time.DurationField durationField22 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField23 = chronology10.dayOfWeek();
        int int24 = dateTimeField23.getMaximumValue();
        org.joda.time.DurationField durationField25 = dateTimeField23.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField25, and durationField22", !(durationField22.compareTo(durationField25) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField25.compareTo(durationField22))));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        int int9 = dateMidnight8.getDayOfMonth();
        org.joda.time.Instant instant10 = dateMidnight8.toInstant();
        int int11 = dateMidnight8.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant10", (dateTime5.compareTo(instant10) == 0) == dateTime5.equals(instant10));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology10.add(readablePeriod11, (-2L), 1);
        long long18 = chronology10.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType0.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField21 = chronology10.dayOfYear();
        org.joda.time.DurationField durationField22 = chronology10.seconds();
        org.joda.time.DateTimeField dateTimeField23 = chronology10.millisOfSecond();
        org.joda.time.DurationField durationField24 = chronology10.months();
        org.joda.time.DurationField durationField25 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField22, and durationField24", !(durationField25.compareTo(durationField22) == 0) || (Math.signum(durationField25.compareTo(durationField24)) == Math.signum(durationField22.compareTo(durationField24))));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.lang.String str7 = timeZone6.getID();
        java.time.ZoneId zoneId8 = timeZone6.toZoneId();
        boolean boolean9 = dateTime5.equals((java.lang.Object) timeZone6);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) dateTime5);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate17 = localDate12.withFieldAdded(durationFieldType15, (int) (short) 0);
        org.joda.time.LocalDate.Property property18 = localDate12.year();
        org.joda.time.LocalDate localDate19 = property18.roundCeilingCopy();
        org.joda.time.LocalDate localDate20 = property18.roundFloorCopy();
        org.joda.time.LocalDate localDate21 = property18.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate23 = localDate21.plusYears(2022);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long28 = dateTimeZone25.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(dateTimeZone25);
        int int31 = dateTimeZone25.getOffset((long) 'a');
        org.joda.time.DateTime dateTime32 = localDate21.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime5.toMutableDateTime(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime5.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime33", (dateTime10.compareTo(mutableDateTime33) == 0) == dateTime10.equals(mutableDateTime33));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology11 = null;
        boolean boolean12 = dateTimeFieldType10.isSupported(chronology11);
        org.joda.time.Chronology chronology13 = null;
        boolean boolean14 = dateTimeFieldType10.isSupported(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType10.getRangeDurationType();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate18.minus(readablePeriod19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.Chronology chronology23 = localDate20.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long28 = dateTimeZone26.nextTransition((long) 4);
        org.joda.time.Chronology chronology29 = chronology23.withZone(dateTimeZone26);
        org.joda.time.DurationField durationField30 = chronology29.millis();
        org.joda.time.DurationField durationField31 = durationFieldType16.getField(chronology29);
        long long35 = chronology29.add((long) 86399, 0L, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField30 and durationField31", Math.signum(durationField30.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField30)));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology10.add(readablePeriod11, (-2L), 1);
        long long18 = chronology10.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType0.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField21 = chronology10.dayOfYear();
        org.joda.time.DurationField durationField22 = chronology10.eras();
        org.joda.time.DurationField durationField23 = chronology10.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField23, and durationField22", !(durationField22.compareTo(durationField23) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField23.compareTo(durationField22))));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate1.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate.Property property8 = localDate1.dayOfMonth();
        org.joda.time.LocalDate localDate10 = property8.addToCopy(1970);
        org.joda.time.LocalDate localDate11 = property8.roundCeilingCopy();
        org.joda.time.DateTime dateTime12 = localDate11.toDateTimeAtMidnight();
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        org.joda.time.Chronology chronology16 = dateTimeFormatter15.getChronolgy();
        java.lang.Integer int17 = dateTimeFormatter15.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter15.withPivotYear((java.lang.Integer) (-2022));
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(chronology20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate23 = localDate21.minus(readablePeriod22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate23.toDateTimeAtMidnight(dateTimeZone24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.minus(readablePeriod26);
        org.joda.time.DateTime.Property property28 = dateTime27.year();
        java.lang.String str29 = property28.getAsString();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(chronology30);
        int int32 = localDate31.getWeekOfWeekyear();
        int int33 = property28.compareTo((org.joda.time.ReadablePartial) localDate31);
        int int34 = localDate31.getEra();
        org.joda.time.LocalDate.Property property35 = localDate31.dayOfMonth();
        java.util.Date date36 = localDate31.toDate();
        org.joda.time.LocalDate.Property property37 = localDate31.weekOfWeekyear();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(chronology38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDate localDate41 = localDate39.minus(readablePeriod40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = localDate41.toDateTimeAtMidnight(dateTimeZone42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.minus(readablePeriod44);
        org.joda.time.DateTime dateTime47 = dateTime45.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = dateTime47.toDateTime(chronology48);
        org.joda.time.DateTime dateTime51 = dateTime47.withMonthOfYear(5);
        org.joda.time.DateTime.Property property52 = dateTime51.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long57 = dateTimeZone54.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str59 = dateTimeZone54.getNameKey(100L);
        org.joda.time.DateTime dateTime60 = dateTime51.withZoneRetainFields(dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone61 = dateTime51.getZone();
        boolean boolean63 = dateTimeZone61.isStandardOffset((long) 11);
        org.joda.time.DateTime dateTime64 = localDate31.toDateTimeAtStartOfDay(dateTimeZone61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter19.withZone(dateTimeZone61);
        org.joda.time.DateTime dateTime66 = localDate11.toDateTimeAtStartOfDay(dateTimeZone61);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate(chronology67);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateTime dateTime70 = localDate68.toDateTimeAtMidnight(dateTimeZone69);
        org.joda.time.DateTime dateTime72 = dateTime70.minusDays((-292275054));
        org.joda.time.DateTime dateTime74 = dateTime70.plusMillis(35332195);
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone77 = dateTimeZone76.toTimeZone();
        int int79 = dateTimeZone76.getStandardOffset((long) (short) 0);
        long long81 = dateTimeZone76.previousTransition((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime82 = dateTime74.toMutableDateTime(dateTimeZone76);
        org.joda.time.DateTime dateTime83 = dateTime66.toDateTime(dateTimeZone76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime74 and mutableDateTime82", (dateTime74.compareTo(mutableDateTime82) == 0) == dateTime74.equals(mutableDateTime82));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.LocalDate localDate16 = localDate12.plusMonths((int) (byte) 0);
        int int17 = localDate16.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property18 = localDate16.weekyear();
        org.joda.time.LocalDate localDate20 = property18.addToCopy((int) (byte) -1);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology21.getZone();
        int int24 = dateTimeZone22.getOffsetFromLocal((long) (-2731));
        org.joda.time.DateTime dateTime25 = dateTime9.toDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime27 = dateTime9.minusSeconds(2027);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime25", (dateTime9.compareTo(dateTime25) == 0) == dateTime9.equals(dateTime25));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.Chronology chronology10 = chronology9.withUTC();
        org.joda.time.DurationField durationField11 = chronology9.halfdays();
        java.lang.String str12 = chronology9.toString();
        org.joda.time.DurationField durationField13 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField13", Math.signum(durationField11.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField11)));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.hourOfDay();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj0, chronology10);
        org.joda.time.DateTime dateTime14 = dateTime13.toDateTime();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.days();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology17);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean20 = localTime18.isSupported(durationFieldType19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime22 = localTime18.minus(readablePeriod21);
        org.joda.time.LocalTime localTime24 = localTime18.plusSeconds(9);
        org.joda.time.Chronology chronology25 = localTime18.getChronology();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(chronology25);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.clockhourOfDay();
        org.joda.time.DurationField durationField30 = durationFieldType15.getField(chronology27);
        org.joda.time.DateTime dateTime31 = dateTime13.withChronology(chronology27);
        org.joda.time.DateTime.Property property32 = dateTime31.millisOfDay();
        org.joda.time.DateTime dateTime34 = dateTime31.withHourOfDay(3);
        org.joda.time.DateTime dateTime36 = dateTime34.minusWeeks(41);
        java.util.TimeZone timeZone37 = java.util.TimeZone.getDefault();
        java.lang.String str38 = timeZone37.getID();
        int int39 = timeZone37.getRawOffset();
        boolean boolean40 = timeZone37.observesDaylightTime();
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(timeZone37);
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone37);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone37);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology46);
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean49 = localTime47.isSupported(durationFieldType48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalTime localTime51 = localTime47.minus(readablePeriod50);
        org.joda.time.LocalTime localTime53 = localTime47.plusSeconds(9);
        org.joda.time.Chronology chronology54 = localTime47.getChronology();
        org.joda.time.Chronology chronology55 = chronology54.withUTC();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(chronology55);
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType44.getField(chronology55);
        org.joda.time.DateTimeField dateTimeField58 = chronology55.dayOfMonth();
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        boolean boolean69 = strSet62.addAll((java.util.Collection<java.lang.String>) strList67);
        java.util.Locale locale70 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str72 = locale70.getExtension('a');
        java.util.Set<java.lang.String> strSet73 = locale70.getUnicodeLocaleAttributes();
        java.util.Locale locale74 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str75 = locale70.getDisplayScript(locale74);
        java.util.Locale locale76 = java.util.Locale.ENGLISH;
        java.lang.String str77 = locale74.getDisplayVariant(locale76);
        boolean boolean78 = strSet62.equals((java.lang.Object) locale76);
        java.lang.String str79 = dateTimeField58.getAsShortText(9, locale76);
        java.util.Calendar calendar80 = java.util.Calendar.getInstance(timeZone37, locale76);
        java.util.Calendar calendar81 = dateTime34.toCalendar(locale76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar41 and calendar80", (calendar41.compareTo(calendar80) == 0) == calendar41.equals(calendar80));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plus((-25L));
        org.joda.time.DateTime dateTime9 = dateTime3.withMillisOfDay(2022);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.minus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.minus(readablePeriod16);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfWeek();
        org.joda.time.Instant instant19 = dateTime17.toInstant();
        int int20 = dateTime9.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.DateTimeZone dateTimeZone21 = instant19.getZone();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant19", (dateTime3.compareTo(instant19) == 0) == dateTime3.equals(instant19));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        org.joda.time.Instant instant9 = dateTime7.toInstant();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.minus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusMillis(32772);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime dateTime20 = dateTime17.withField(dateTimeFieldType18, 4);
        int int21 = dateTime7.get(dateTimeFieldType18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant9", (dateTime7.compareTo(instant9) == 0) == dateTime7.equals(instant9));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology9.add(readablePeriod10, (-2L), 1);
        org.joda.time.DateTimeZone dateTimeZone14 = chronology9.getZone();
        org.joda.time.DurationField durationField15 = chronology9.eras();
        org.joda.time.DurationField durationField16 = chronology9.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField16, and durationField15", !(durationField15.compareTo(durationField16) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField16.compareTo(durationField15))));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.LocalDate localDate16 = localDate12.plusMonths((int) (byte) 0);
        int int17 = localDate16.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property18 = localDate16.weekyear();
        org.joda.time.LocalDate localDate20 = property18.addToCopy((int) (byte) -1);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology21.getZone();
        int int24 = dateTimeZone22.getOffsetFromLocal((long) (-2731));
        org.joda.time.DateTime dateTime25 = dateTime9.toDateTime(dateTimeZone22);
        boolean boolean26 = dateTimeZone22.isFixed();
        boolean boolean28 = dateTimeZone22.isStandardOffset(1644572949443L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime25", (dateTime5.compareTo(dateTime25) == 0) == dateTime5.equals(dateTime25));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology12);
        org.joda.time.DurationField durationField15 = chronology12.eras();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long20 = dateTimeZone17.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str22 = dateTimeZone17.getNameKey(100L);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.now(dateTimeZone17);
        java.lang.String str24 = dateTimeZone17.toString();
        int int26 = dateTimeZone17.getOffset((long) (short) 10);
        org.joda.time.Chronology chronology27 = chronology12.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField28 = chronology12.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField28, and durationField15", !(durationField15.compareTo(durationField28) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField28.compareTo(durationField15))));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.LocalDate localDate16 = localDate12.plusMonths((int) (byte) 0);
        int int17 = localDate16.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property18 = localDate16.weekyear();
        org.joda.time.LocalDate localDate20 = property18.addToCopy((int) (byte) -1);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology21.getZone();
        int int24 = dateTimeZone22.getOffsetFromLocal((long) (-2731));
        org.joda.time.DateTime dateTime25 = dateTime9.toDateTime(dateTimeZone22);
        long long29 = dateTimeZone22.convertLocalToUTC((long) 60, true, (long) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime25", (dateTime5.compareTo(dateTime25) == 0) == dateTime5.equals(dateTime25));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        int int6 = localDate5.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property7 = localDate5.weekyear();
        int int8 = localDate5.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Interval interval10 = localDate5.toInterval(dateTimeZone9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.toDateTime(chronology21);
        org.joda.time.DateTime dateTime24 = dateTime20.withMonthOfYear(5);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long28 = dateTimeZone26.nextTransition((long) 4);
        org.joda.time.DateTime dateTime29 = dateTime24.withZone(dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight30 = localDate5.toDateMidnight(dateTimeZone26);
        java.lang.String str32 = dateTimeZone26.getName((long) 999);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime29", (dateTime24.compareTo(dateTime29) == 0) == dateTime24.equals(dateTime29));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        int int2 = localDate1.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate7 = localDate5.minus(readablePeriod6);
        org.joda.time.LocalDate localDate9 = localDate5.plusMonths((int) (byte) 0);
        int int10 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property11 = localDate9.weekyear();
        org.joda.time.LocalDate localDate12 = property11.withMaximumValue();
        org.joda.time.LocalDate.Property property13 = localDate12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long18 = dateTimeZone15.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(dateTimeZone15);
        int int21 = dateTimeZone15.getOffset((long) '#');
        org.joda.time.DateTime dateTime22 = localDate12.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.Interval interval23 = localDate1.toInterval(dateTimeZone15);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology28);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean31 = localTime29.isSupported(durationFieldType30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime33 = localTime29.minus(readablePeriod32);
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.lang.String str36 = dateTimeField26.getAsShortText((org.joda.time.ReadablePartial) localTime33, (int) (short) -1, locale35);
        java.lang.String str37 = localTime33.toString();
        int int38 = localTime33.size();
        org.joda.time.LocalTime.Property property39 = localTime33.hourOfDay();
        org.joda.time.LocalTime localTime41 = property39.addNoWrapToCopy((int) (short) 1);
        org.joda.time.LocalTime localTime42 = property39.roundCeilingCopy();
        org.joda.time.LocalTime localTime44 = property39.addCopy(86399);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalTime localTime47 = localTime44.withPeriodAdded(readablePeriod45, 2);
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology50);
        org.joda.time.DurationFieldType durationFieldType52 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean53 = localTime51.isSupported(durationFieldType52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.LocalTime localTime55 = localTime51.minus(readablePeriod54);
        org.joda.time.LocalTime localTime57 = localTime51.plusSeconds(9);
        org.joda.time.Chronology chronology58 = localTime51.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField60 = chronology58.hourOfDay();
        org.joda.time.DateTimeField dateTimeField61 = chronology58.secondOfMinute();
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(chronology58);
        boolean boolean63 = durationFieldType48.isSupported(chronology58);
        boolean boolean64 = localTime44.isSupported(durationFieldType48);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str68 = dateTimeZone66.getShortName(0L);
        org.joda.time.DateTime dateTime69 = localTime44.toDateTimeToday(dateTimeZone66);
        org.joda.time.DateTime dateTime70 = localDate1.toDateTimeAtStartOfDay(dateTimeZone66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime62", (dateTime3.compareTo(dateTime62) == 0) == dateTime3.equals(dateTime62));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.DateTime.Property property10 = dateTime5.secondOfDay();
        org.joda.time.DurationField durationField11 = property10.getDurationField();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate13.minus(readablePeriod14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.plus(readableDuration18);
        org.joda.time.DateTime dateTime22 = dateTime17.withDurationAdded((long) 0, (int) (byte) 10);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate26 = localDate24.minus(readablePeriod25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate26.toDateTimeAtMidnight(dateTimeZone27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.minus(readablePeriod29);
        org.joda.time.DateTime.Property property31 = dateTime30.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology33 = null;
        boolean boolean34 = dateTimeFieldType32.isSupported(chronology33);
        int int35 = dateTime30.get(dateTimeFieldType32);
        boolean boolean36 = dateTime17.isSupported(dateTimeFieldType32);
        org.joda.time.Instant instant37 = dateTime17.toInstant();
        int int38 = property10.compareTo((org.joda.time.ReadableInstant) instant37);
        org.joda.time.DateTime dateTime40 = property10.addWrapFieldToCopy(35434289);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant37", (dateTime5.compareTo(instant37) == 0) == dateTime5.equals(instant37));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0);
        long long3 = calendar2.getTimeInMillis();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.lang.String str5 = timeZone4.getID();
        int int6 = timeZone4.getRawOffset();
        calendar2.setTimeZone(timeZone4);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtMidnight(dateTimeZone12);
        java.util.Date date14 = localDate11.toDate();
        calendar9.setTime(date14);
        java.util.TimeZone timeZone16 = calendar9.getTimeZone();
        calendar9.clear();
        calendar9.clear();
        calendar9.set((-2731), 2022, 32769, (int) (short) 1, 100, 12);
        int int27 = calendar9.getGreatestMinimum(0);
        java.util.Date date28 = calendar9.getTime();
        calendar2.setTime(date28);
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.fromDateFields(date28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar9", (calendar2.compareTo(calendar9) == 0) == calendar2.equals(calendar9));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime11 = dateTime7.withCenturyOfEra((int) (byte) 0);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfYear();
        org.joda.time.DateTime dateTime13 = property12.withMinimumValue();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate15.minus(readablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate17.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.minus(readablePeriod20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.toDateTime(chronology24);
        org.joda.time.DateTime dateTime27 = dateTime23.withMonthOfYear(5);
        org.joda.time.DateTime.Property property28 = dateTime27.hourOfDay();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate32 = localDate30.minus(readablePeriod31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localDate32.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.minus(readablePeriod35);
        org.joda.time.DateMidnight dateMidnight37 = dateTime36.toDateMidnight();
        org.joda.time.DateTime dateTime38 = dateTime36.withEarlierOffsetAtOverlap();
        int int39 = dateTime27.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime.Property property40 = dateTime27.dayOfYear();
        org.joda.time.Instant instant41 = dateTime27.toInstant();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.DateTime dateTime43 = dateTime27.plus(readablePeriod42);
        int int44 = property12.getDifference((org.joda.time.ReadableInstant) dateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and instant41", (dateTime43.compareTo(instant41) == 0) == dateTime43.equals(instant41));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfDay(5);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfWeek();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate8.minus(readablePeriod9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtMidnight(dateTimeZone11);
        org.joda.time.DateTime.Property property13 = dateTime12.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateMidnight dateMidnight16 = dateTime12.toDateMidnight();
        int int17 = property6.compareTo((org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.Instant instant18 = dateMidnight16.toInstant();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate20.minus(readablePeriod21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate22.toDateTimeAtMidnight(dateTimeZone23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.minus(readablePeriod25);
        org.joda.time.DateMidnight dateMidnight27 = dateTime26.toDateMidnight();
        org.joda.time.DateTime dateTime28 = dateTime26.withEarlierOffsetAtOverlap();
        long long29 = dateTime28.getMillis();
        org.joda.time.DateTime dateTime31 = dateTime28.withDayOfMonth(2);
        org.joda.time.DateTime dateTime33 = dateTime28.withCenturyOfEra(59);
        org.joda.time.DateTime dateTime35 = dateTime28.withMillis((long) 23);
        boolean boolean36 = instant18.isAfter((org.joda.time.ReadableInstant) dateTime35);
        int int37 = dateTime35.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant18", (dateTime3.compareTo(instant18) == 0) == dateTime3.equals(instant18));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean12 = localTime10.isSupported(durationFieldType11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime10.minus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime10.plusSeconds(9);
        org.joda.time.Chronology chronology17 = localTime10.getChronology();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(chronology17);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology19);
        org.joda.time.DateTimeField dateTimeField22 = chronology19.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField24 = chronology19.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField25 = chronology19.millisOfDay();
        org.joda.time.DurationField durationField26 = chronology19.minutes();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter6.withChronology(chronology19);
        org.joda.time.Chronology chronology28 = dateTimeFormatter27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.eras();
        org.joda.time.DurationField durationField30 = chronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField26 and durationField30", Math.signum(durationField26.compareTo(durationField30)) == -Math.signum(durationField30.compareTo(durationField26)));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(dateTimeZone1);
        int int7 = dateTimeZone1.getOffset(1644537599999L);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.minus(readablePeriod10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMillis(32772);
        org.joda.time.DateTime dateTime17 = dateTime13.withMillis((long) ' ');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate19.toDateTimeAtMidnight(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withMillisOfDay(5);
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfWeek();
        boolean boolean25 = dateTime13.equals((java.lang.Object) dateTime23);
        org.joda.time.DateTime dateTime27 = dateTime13.withWeekyear((-292275054));
        org.joda.time.DateTime.Property property28 = dateTime13.millisOfDay();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate32 = localDate30.minus(readablePeriod31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localDate32.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.plus(readableDuration35);
        org.joda.time.DateTime dateTime39 = dateTime34.withDurationAdded((long) 0, (int) (byte) 10);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(chronology40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDate localDate43 = localDate41.minus(readablePeriod42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDate43.toDateTimeAtMidnight(dateTimeZone44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.minus(readablePeriod46);
        org.joda.time.DateTime.Property property48 = dateTime47.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology50 = null;
        boolean boolean51 = dateTimeFieldType49.isSupported(chronology50);
        int int52 = dateTime47.get(dateTimeFieldType49);
        boolean boolean53 = dateTime34.isSupported(dateTimeFieldType49);
        org.joda.time.Instant instant54 = dateTime34.toInstant();
        int int55 = dateTime13.compareTo((org.joda.time.ReadableInstant) instant54);
        boolean boolean56 = dateTimeZone1.equals((java.lang.Object) instant54);
        boolean boolean57 = dateTimeZone1.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant54", (dateTime13.compareTo(instant54) == 0) == dateTime13.equals(instant54));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime20 = localTime17.toDateTimeToday(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        int int23 = dateTimeZone21.getStandardOffset((long) 70);
        org.joda.time.DateTime dateTime24 = localTime9.toDateTimeToday(dateTimeZone21);
        int int25 = dateTime24.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime27 = dateTime24.withYear((int) (short) 10);
        int int28 = dateTime27.getDayOfMonth();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology31);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime35 = localTime32.toDateTimeToday(dateTimeZone34);
        int int37 = dateTimeZone34.getOffset((long) (short) -1);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(obj29, dateTimeZone34);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((java.lang.Object) dateTime27, dateTimeZone34);
        org.joda.time.DateTime dateTime41 = dateTime39.plus((long) 0);
        org.joda.time.DateTime.Property property42 = dateTime41.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology45);
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean48 = localTime46.isSupported(durationFieldType47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalTime localTime50 = localTime46.minus(readablePeriod49);
        org.joda.time.LocalTime localTime52 = localTime46.plusSeconds(9);
        org.joda.time.Chronology chronology53 = localTime46.getChronology();
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        long long57 = chronology53.add(readablePeriod54, (-2L), 1);
        long long61 = chronology53.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(chronology53);
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType43.getField(chronology53);
        java.util.Locale locale65 = java.util.Locale.KOREA;
        java.lang.String str66 = locale65.getDisplayVariant();
        java.lang.String str67 = dateTimeField63.getAsShortText(7, locale65);
        int int68 = dateTimeField63.getMinimumValue();
        java.util.Locale locale69 = java.util.Locale.JAPAN;
        java.util.Locale locale70 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str72 = locale70.getExtension('a');
        java.util.Set<java.lang.String> strSet73 = locale70.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet74 = locale70.getUnicodeLocaleKeys();
        java.lang.String str75 = locale69.getDisplayCountry(locale70);
        int int76 = dateTimeField63.getMaximumShortTextLength(locale69);
        java.lang.String str77 = locale69.getVariant();
        java.util.Locale.Category category78 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale79 = java.util.Locale.JAPAN;
        java.util.Locale.setDefault(category78, locale79);
        java.util.Locale locale81 = java.util.Locale.getDefault(category78);
        java.util.Locale locale82 = java.util.Locale.getDefault(category78);
        java.lang.String str83 = locale69.getDisplayScript(locale82);
        java.lang.String str84 = locale69.getLanguage();
        java.lang.String str85 = property42.getAsShortText(locale69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and dateTime62", (dateTime38.compareTo(dateTime62) == 0) == dateTime38.equals(dateTime62));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfDay(5);
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfWeek();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate8.minus(readablePeriod9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtMidnight(dateTimeZone11);
        org.joda.time.DateTime.Property property13 = dateTime12.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateMidnight dateMidnight16 = dateTime12.toDateMidnight();
        int int17 = property6.compareTo((org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.Instant instant18 = dateMidnight16.toInstant();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate20.minus(readablePeriod21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate22.toDateTimeAtMidnight(dateTimeZone23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.minus(readablePeriod25);
        org.joda.time.DateMidnight dateMidnight27 = dateTime26.toDateMidnight();
        org.joda.time.DateTime dateTime28 = dateTime26.withEarlierOffsetAtOverlap();
        long long29 = dateTime28.getMillis();
        org.joda.time.DateTime dateTime31 = dateTime28.withDayOfMonth(2);
        org.joda.time.DateTime dateTime33 = dateTime28.withCenturyOfEra(59);
        org.joda.time.DateTime dateTime35 = dateTime28.withMillis((long) 23);
        boolean boolean36 = instant18.isAfter((org.joda.time.ReadableInstant) dateTime35);
        boolean boolean37 = dateTime35.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant18", (dateTime3.compareTo(instant18) == 0) == dateTime3.equals(instant18));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate16.minus(readablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readablePeriod21);
        org.joda.time.DateMidnight dateMidnight23 = dateTime22.toDateMidnight();
        org.joda.time.DateTime dateTime24 = dateTime22.withEarlierOffsetAtOverlap();
        int int25 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime.Property property26 = dateTime13.dayOfYear();
        org.joda.time.Instant instant27 = dateTime13.toInstant();
        org.joda.time.DateTime dateTime30 = dateTime13.withDurationAdded(452769L, 365);
        org.joda.time.DateTime.Property property31 = dateTime30.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant27", (dateTime13.compareTo(instant27) == 0) == dateTime13.equals(instant27));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        java.lang.String str9 = property8.getAsString();
        java.lang.String str10 = property8.toString();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMillis(32772);
        org.joda.time.DateTime dateTime20 = dateTime16.withMillis((long) ' ');
        org.joda.time.DateTime dateTime22 = dateTime16.minusMillis(5);
        int int23 = dateTime16.getDayOfMonth();
        int int24 = property8.getDifference((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime26 = dateTime16.plusMonths(1970);
        org.joda.time.DateTime dateTime27 = dateTime16.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime29 = dateTime27.withCenturyOfEra(11);
        org.joda.time.DateTime dateTime31 = dateTime27.plusMinutes(32772);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 5);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        long long39 = dateTimeZone34.convertLocalToUTC(1644572942340L, false, (long) 990);
        int int41 = dateTimeZone34.getOffset(0L);
        org.joda.time.DateTime dateTime42 = dateTime31.withZone(dateTimeZone34);
        org.joda.time.DateTime dateTime44 = dateTime42.withMillis((-62161135848684L));
        int int45 = dateTime44.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime42", (dateTime31.compareTo(dateTime42) == 0) == dateTime31.equals(dateTime42));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        java.lang.String str9 = property8.getAsString();
        java.lang.String str10 = property8.toString();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMillis(32772);
        org.joda.time.DateTime dateTime20 = dateTime16.withMillis((long) ' ');
        org.joda.time.DateTime dateTime22 = dateTime16.minusMillis(5);
        int int23 = dateTime16.getDayOfMonth();
        int int24 = property8.getDifference((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime26 = dateTime16.plusMonths(1970);
        org.joda.time.DateTime dateTime27 = dateTime16.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime29 = dateTime27.withCenturyOfEra(11);
        org.joda.time.DateTime dateTime31 = dateTime27.plusMinutes(32772);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 5);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        long long39 = dateTimeZone34.convertLocalToUTC(1644572942340L, false, (long) 990);
        int int41 = dateTimeZone34.getOffset(0L);
        org.joda.time.DateTime dateTime42 = dateTime31.withZone(dateTimeZone34);
        org.joda.time.DateTime dateTime44 = dateTime42.withMillis((-62161135848684L));
        org.joda.time.ReadableInstant readableInstant45 = null;
        boolean boolean46 = dateTime44.isBefore(readableInstant45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime42", (dateTime31.compareTo(dateTime42) == 0) == dateTime31.equals(dateTime42));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate11 = localDate6.withFieldAdded(durationFieldType9, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str15 = dateTimeZone13.getShortName(0L);
        java.lang.String str16 = dateTimeZone13.toString();
        java.util.TimeZone timeZone17 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime18 = localDate11.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.LocalDate.Property property19 = localDate11.yearOfCentury();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(chronology20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate23 = localDate21.minus(readablePeriod22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate23.toDateTimeAtMidnight(dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.plus(readableDuration27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate32 = localDate30.minus(readablePeriod31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localDate32.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusMillis(32772);
        org.joda.time.DateTime dateTime38 = dateTime34.withMillis((long) ' ');
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate(chronology39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDate localDate42 = localDate40.plus(readablePeriod41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology44 = null;
        boolean boolean45 = dateTimeFieldType43.isSupported(chronology44);
        boolean boolean46 = localDate42.isSupported(dateTimeFieldType43);
        int int47 = dateTime38.get(dateTimeFieldType43);
        int int48 = dateTime25.get(dateTimeFieldType43);
        int int49 = localDate11.get(dateTimeFieldType43);
        boolean boolean50 = dateTime3.isSupported(dateTimeFieldType43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime8", (instant4.compareTo(dateTime8) == 0) == instant4.equals(dateTime8));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology9.add(readablePeriod10, (-2L), 1);
        org.joda.time.DurationField durationField14 = chronology9.eras();
        org.joda.time.DurationField durationField15 = chronology9.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField15, and durationField14", !(durationField14.compareTo(durationField15) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField15.compareTo(durationField14))));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        java.lang.String str9 = property8.getAsString();
        java.lang.String str10 = property8.toString();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMillis(32772);
        org.joda.time.DateTime dateTime20 = dateTime16.withMillis((long) ' ');
        org.joda.time.DateTime dateTime22 = dateTime16.minusMillis(5);
        int int23 = dateTime16.getDayOfMonth();
        int int24 = property8.getDifference((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime26 = dateTime16.plusMonths(1970);
        org.joda.time.DateTime dateTime27 = dateTime16.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime29 = dateTime27.withCenturyOfEra(11);
        org.joda.time.DateTime dateTime31 = dateTime27.plusMinutes(32772);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 5);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        long long39 = dateTimeZone34.convertLocalToUTC(1644572942340L, false, (long) 990);
        int int41 = dateTimeZone34.getOffset(0L);
        org.joda.time.DateTime dateTime42 = dateTime31.withZone(dateTimeZone34);
        long long44 = dateTimeZone34.convertUTCToLocal((long) 35434289);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime42", (dateTime31.compareTo(dateTime42) == 0) == dateTime31.equals(dateTime42));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate2.plus(readablePeriod3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology6 = null;
        boolean boolean7 = dateTimeFieldType5.isSupported(chronology6);
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.minus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMillis(32772);
        org.joda.time.DateTime dateTime18 = dateTime14.withMillis((long) ' ');
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate20.plus(readablePeriod21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology24 = null;
        boolean boolean25 = dateTimeFieldType23.isSupported(chronology24);
        boolean boolean26 = localDate22.isSupported(dateTimeFieldType23);
        int int27 = dateTime18.get(dateTimeFieldType23);
        boolean boolean28 = localDate4.isSupported(dateTimeFieldType23);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDate30.toDateTimeAtMidnight(dateTimeZone31);
        boolean boolean33 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate30);
        org.joda.time.LocalDate localDate35 = localDate30.minusMonths(32770);
        org.joda.time.LocalTime localTime36 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long42 = dateTimeZone39.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str44 = dateTimeZone39.getNameKey(100L);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 10, dateTimeZone39);
        org.joda.time.DateTime dateTime46 = localDate35.toDateTime(localTime36, dateTimeZone39);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(1644572942500L, dateTimeZone39);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(chronology48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDate localDate51 = localDate49.minus(readablePeriod50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localDate51.toDateTimeAtMidnight(dateTimeZone52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.DateTime dateTime55 = dateTime53.minus(readablePeriod54);
        org.joda.time.DateMidnight dateMidnight56 = dateTime55.toDateMidnight();
        org.joda.time.DateTime dateTime57 = dateTime55.withEarlierOffsetAtOverlap();
        long long58 = dateTime57.getMillis();
        org.joda.time.DateTime dateTime60 = dateTime57.withDayOfMonth(2);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.DateTime dateTime62 = dateTime57.plus(readableDuration61);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean64 = dateTime62.isSupported(dateTimeFieldType63);
        org.joda.time.Chronology chronology65 = dateTime62.getChronology();
        org.joda.time.DateTime dateTime66 = org.joda.time.DateTime.now(chronology65);
        org.joda.time.DateTime dateTime67 = dateTime47.withChronology(chronology65);
        org.joda.time.DurationField durationField68 = chronology65.centuries();
        org.joda.time.DurationField durationField69 = chronology65.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and dateTime67", (dateTime47.compareTo(dateTime67) == 0) == dateTime47.equals(dateTime67));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        int int12 = dateTime9.getDayOfWeek();
        boolean boolean14 = dateTime9.isEqual((long) 0);
        org.joda.time.DateTime dateTime16 = dateTime9.withMillisOfSecond(23);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate18.minus(readablePeriod19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.minus(readablePeriod23);
        org.joda.time.DateTime dateTime26 = dateTime24.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.toDateTime(chronology27);
        org.joda.time.DateTime dateTime30 = dateTime26.withMonthOfYear(5);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long34 = dateTimeZone32.nextTransition((long) 4);
        org.joda.time.DateTime dateTime35 = dateTime30.withZone(dateTimeZone32);
        org.joda.time.DateTime dateTime37 = dateTime30.minusHours(0);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.minus(readablePeriod38);
        boolean boolean40 = dateTime16.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Chronology chronology41 = dateTime16.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.days();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.year();
        java.util.Locale locale48 = new java.util.Locale("00:00:00.000", "1900-01-01T00:00:00.010", "German (Germany)");
        java.lang.String str49 = locale48.getVariant();
        java.lang.String str50 = dateTimeField43.getAsText((long) 2008, locale48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime35", (dateTime30.compareTo(dateTime35) == 0) == dateTime30.equals(dateTime35));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DurationField durationField6 = durationFieldType3.getField(chronology5);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean13 = localTime11.isSupported(durationFieldType12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime11.minus(readablePeriod14);
        org.joda.time.LocalTime localTime17 = localTime11.plusSeconds(9);
        org.joda.time.Chronology chronology18 = localTime11.getChronology();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology18.add(readablePeriod19, (-2L), 1);
        long long26 = chronology18.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology18);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) 9, chronology18);
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) 32770, chronology29);
        org.joda.time.DurationField durationField31 = durationFieldType3.getField(chronology29);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology34);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean37 = localTime35.isSupported(durationFieldType36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalTime localTime39 = localTime35.minus(readablePeriod38);
        org.joda.time.LocalTime localTime41 = localTime35.plusSeconds(9);
        org.joda.time.Chronology chronology42 = localTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField44 = chronology42.hourOfDay();
        org.joda.time.LocalTime localTime45 = org.joda.time.LocalTime.fromMillisOfDay((long) 35332195, chronology42);
        org.joda.time.DateTimeField dateTimeField46 = chronology42.minuteOfHour();
        boolean boolean47 = durationFieldType3.isSupported(chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField31", (durationField6.compareTo(durationField31) == 0) == durationField6.equals(durationField31));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.minutes();
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        org.joda.time.LocalTime localTime11 = localTime5.plusSeconds(9);
        org.joda.time.Chronology chronology12 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfDay();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj2, chronology12);
        org.joda.time.DurationField durationField16 = chronology12.halfdays();
        org.joda.time.DurationField durationField17 = durationFieldType1.getField(chronology12);
        org.joda.time.DateTimeField dateTimeField18 = chronology12.monthOfYear();
        org.joda.time.DateTimeField dateTimeField19 = chronology12.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        int int25 = dateTimeZone22.getStandardOffset((long) (short) 0);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(0L, dateTimeZone22);
        org.joda.time.Chronology chronology27 = chronology12.withZone(dateTimeZone22);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(chronology27);
        org.joda.time.DurationField durationField29 = chronology27.halfdays();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(365L, chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField29", (durationField16.compareTo(durationField29) == 0) == durationField16.equals(durationField29));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.util.Locale locale2 = new java.util.Locale("yearOfEra", "hourOfDay");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        calendar5.clear();
        int int7 = calendar5.getWeeksInWeekYear();
        java.lang.String str8 = calendar5.getCalendarType();
        calendar5.setLenient(true);
        java.util.Date date11 = calendar5.getTime();
        calendar3.setTime(date11);
        java.lang.Object obj13 = date11.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar5", (calendar3.compareTo(calendar5) == 0) == calendar3.equals(calendar5));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long19 = dateTimeZone16.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str21 = dateTimeZone16.getNameKey(100L);
        org.joda.time.DateTime dateTime22 = dateTime13.withZoneRetainFields(dateTimeZone16);
        boolean boolean23 = dateTime22.isAfterNow();
        org.joda.time.DateTime.Property property24 = dateTime22.dayOfYear();
        org.joda.time.Instant instant25 = dateTime22.toInstant();
        org.joda.time.Chronology chronology26 = dateTime22.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant25", (dateTime22.compareTo(instant25) == 0) == dateTime22.equals(instant25));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(dateTimeZone1);
        int int7 = dateTimeZone1.getOffset(1644537599999L);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.minus(readablePeriod10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMillis(32772);
        org.joda.time.DateTime dateTime17 = dateTime13.withMillis((long) ' ');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate19.toDateTimeAtMidnight(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withMillisOfDay(5);
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfWeek();
        boolean boolean25 = dateTime13.equals((java.lang.Object) dateTime23);
        org.joda.time.DateTime dateTime27 = dateTime13.withWeekyear((-292275054));
        org.joda.time.DateTime.Property property28 = dateTime13.millisOfDay();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate32 = localDate30.minus(readablePeriod31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localDate32.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.plus(readableDuration35);
        org.joda.time.DateTime dateTime39 = dateTime34.withDurationAdded((long) 0, (int) (byte) 10);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(chronology40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDate localDate43 = localDate41.minus(readablePeriod42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDate43.toDateTimeAtMidnight(dateTimeZone44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.minus(readablePeriod46);
        org.joda.time.DateTime.Property property48 = dateTime47.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology50 = null;
        boolean boolean51 = dateTimeFieldType49.isSupported(chronology50);
        int int52 = dateTime47.get(dateTimeFieldType49);
        boolean boolean53 = dateTime34.isSupported(dateTimeFieldType49);
        org.joda.time.Instant instant54 = dateTime34.toInstant();
        int int55 = dateTime13.compareTo((org.joda.time.ReadableInstant) instant54);
        boolean boolean56 = dateTimeZone1.equals((java.lang.Object) instant54);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant54", (dateTime13.compareTo(instant54) == 0) == dateTime13.equals(instant54));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        org.joda.time.Instant instant9 = dateTime7.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime7.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant9", (dateTime10.compareTo(instant9) == 0) == dateTime10.equals(instant9));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.plus(readablePeriod2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate7 = localDate5.minus(readablePeriod6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtMidnight(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate16.minus(readablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusMillis(32772);
        org.joda.time.DateTime dateTime24 = dateTime20.withMillis((long) ' ');
        org.joda.time.DateTime dateTime26 = dateTime20.minusMillis(5);
        boolean boolean27 = dateTime12.isAfter((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime.Property property28 = dateTime26.minuteOfHour();
        org.joda.time.DateTime dateTime29 = property28.roundHalfEvenCopy();
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = null;
        org.joda.time.format.DateTimeParser dateTimeParser31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser31);
        org.joda.time.Chronology chronology33 = dateTimeFormatter32.getChronolgy();
        boolean boolean34 = dateTimeFormatter32.isParser();
        org.joda.time.Chronology chronology35 = dateTimeFormatter32.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter32.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeFormatter36.getZone();
        org.joda.time.DateTime dateTime38 = dateTime29.withZone(dateTimeZone37);
        org.joda.time.Interval interval39 = localDate3.toInterval(dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime38", (dateTime9.compareTo(dateTime38) == 0) == dateTime9.equals(dateTime38));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate16.minus(readablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readablePeriod21);
        org.joda.time.DateMidnight dateMidnight23 = dateTime22.toDateMidnight();
        org.joda.time.DateTime dateTime24 = dateTime22.withEarlierOffsetAtOverlap();
        int int25 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime.Property property26 = dateTime13.dayOfYear();
        org.joda.time.Instant instant27 = dateTime13.toInstant();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime13.plus(readablePeriod28);
        int int30 = dateTime13.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant27 and dateTime13", (instant27.compareTo(dateTime13) == 0) == instant27.equals(dateTime13));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean12 = localTime10.isSupported(durationFieldType11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime10.minus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime10.plusSeconds(9);
        org.joda.time.Chronology chronology17 = localTime10.getChronology();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(chronology17);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology19);
        org.joda.time.DateTimeField dateTimeField22 = chronology19.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField24 = chronology19.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField25 = chronology19.millisOfDay();
        org.joda.time.DurationField durationField26 = chronology19.minutes();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter6.withChronology(chronology19);
        org.joda.time.Chronology chronology28 = dateTimeFormatter27.getChronology();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology30);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean33 = localTime31.isSupported(durationFieldType32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime35 = localTime31.minus(readablePeriod34);
        org.joda.time.LocalTime localTime37 = localTime31.plusSeconds(9);
        org.joda.time.Chronology chronology38 = localTime31.getChronology();
        org.joda.time.Chronology chronology39 = chronology38.withUTC();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.era();
        org.joda.time.Chronology chronology41 = chronology39.withUTC();
        org.joda.time.DurationField durationField42 = chronology39.minutes();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter27.withChronology(chronology39);
        java.lang.Integer int45 = dateTimeFormatter44.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter44.withDefaultYear(2922789);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology49);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime53 = localTime50.toDateTimeToday(dateTimeZone52);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology55);
        org.joda.time.DurationFieldType durationFieldType57 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean58 = localTime56.isSupported(durationFieldType57);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalTime localTime60 = localTime56.minus(readablePeriod59);
        org.joda.time.LocalTime localTime62 = localTime56.plusSeconds(9);
        org.joda.time.Chronology chronology63 = localTime56.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.minuteOfHour();
        org.joda.time.DateTime dateTime65 = dateTime53.toDateTime(chronology63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = dateTimeFormatter47.withChronology(chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime53 and dateTime65", (dateTime53.compareTo(dateTime65) == 0) == dateTime53.equals(dateTime65));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology10.add(readablePeriod11, (-2L), 1);
        long long18 = chronology10.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType0.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField21 = chronology10.dayOfYear();
        org.joda.time.DurationField durationField22 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField23 = chronology10.dayOfWeek();
        org.joda.time.DurationField durationField24 = chronology10.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField24, and durationField22", !(durationField22.compareTo(durationField24) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField24.compareTo(durationField22))));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plus((-25L));
        org.joda.time.DateTime dateTime9 = dateTime3.withMillisOfDay(2022);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.minus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.minus(readablePeriod16);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfWeek();
        org.joda.time.Instant instant19 = dateTime17.toInstant();
        int int20 = dateTime9.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.DateTimeZone dateTimeZone21 = instant19.getZone();
        int int23 = dateTimeZone21.getStandardOffset((-2722802814631001L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant19", (dateTime3.compareTo(instant19) == 0) == dateTime3.equals(instant19));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate16.minus(readablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readablePeriod21);
        org.joda.time.DateMidnight dateMidnight23 = dateTime22.toDateMidnight();
        org.joda.time.DateTime dateTime24 = dateTime22.withEarlierOffsetAtOverlap();
        int int25 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime.Property property26 = dateTime13.dayOfYear();
        org.joda.time.Instant instant27 = dateTime13.toInstant();
        org.joda.time.DateTime dateTime30 = dateTime13.withDurationAdded(452769L, 365);
        boolean boolean31 = dateTime30.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant27", (dateTime13.compareTo(instant27) == 0) == dateTime13.equals(instant27));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime20 = localTime17.toDateTimeToday(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        int int23 = dateTimeZone21.getStandardOffset((long) 70);
        org.joda.time.DateTime dateTime24 = localTime9.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTime dateTime26 = dateTime24.minusMillis((-1));
        org.joda.time.DateTime.Property property27 = dateTime24.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime24.plus(readablePeriod28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology32);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean35 = localTime33.isSupported(durationFieldType34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalTime localTime37 = localTime33.minus(readablePeriod36);
        org.joda.time.LocalTime localTime39 = localTime33.plusSeconds(9);
        org.joda.time.Chronology chronology40 = localTime33.getChronology();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        long long44 = chronology40.add(readablePeriod41, (-2L), 1);
        long long48 = chronology40.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(chronology40);
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType30.getField(chronology40);
        org.joda.time.DurationField durationField51 = chronology40.minutes();
        org.joda.time.DateTimeField dateTimeField52 = chronology40.yearOfEra();
        org.joda.time.DateTimeField dateTimeField53 = chronology40.hourOfHalfday();
        org.joda.time.DateTime dateTime54 = dateTime24.withChronology(chronology40);
        org.joda.time.LocalDate localDate55 = dateTime24.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime54", (dateTime20.compareTo(dateTime54) == 0) == dateTime20.equals(dateTime54));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime16 = dateTime9.minusHours(35332195);
        org.joda.time.DateTime dateTime18 = dateTime16.minusYears((int) '#');
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate20.minus(readablePeriod21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate22.toDateTimeAtMidnight(dateTimeZone23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.minus(readablePeriod25);
        org.joda.time.DateTime.Property property27 = dateTime26.year();
        java.lang.String str28 = property27.getAsString();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology29);
        int int31 = localDate30.getWeekOfWeekyear();
        int int32 = property27.compareTo((org.joda.time.ReadablePartial) localDate30);
        org.joda.time.LocalDate localDate34 = localDate30.plusDays((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long39 = dateTimeZone36.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate40 = org.joda.time.LocalDate.now(dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight41 = localDate34.toDateMidnight(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime18.toMutableDateTime(dateTimeZone36);
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime42", (dateTime18.compareTo(mutableDateTime42) == 0) == dateTime18.equals(mutableDateTime42));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.LocalDate localDate16 = localDate12.plusMonths((int) (byte) 0);
        int int17 = localDate16.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property18 = localDate16.weekyear();
        org.joda.time.LocalDate localDate20 = property18.addToCopy((int) (byte) -1);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology21.getZone();
        int int24 = dateTimeZone22.getOffsetFromLocal((long) (-2731));
        org.joda.time.DateTime dateTime25 = dateTime9.toDateTime(dateTimeZone22);
        boolean boolean26 = dateTimeZone22.isFixed();
        java.lang.String str28 = dateTimeZone22.getShortName((long) 13821426);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime25", (dateTime5.compareTo(dateTime25) == 0) == dateTime5.equals(dateTime25));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.era();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.DateTime.Property property10 = dateTime7.dayOfYear();
        org.joda.time.DateTime dateTime11 = property10.roundHalfEvenCopy();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.plus(readablePeriod12);
        org.joda.time.Instant instant14 = dateTime13.toInstant();
        org.joda.time.DateTime dateTime16 = dateTime13.minusHours(2111);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant14", (dateTime13.compareTo(instant14) == 0) == dateTime13.equals(instant14));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        int int3 = timeZone0.getOffset((-2104009200000L));
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtMidnight(dateTimeZone8);
        java.util.Date date10 = localDate7.toDate();
        calendar5.setTime(date10);
        java.util.TimeZone timeZone12 = calendar5.getTimeZone();
        boolean boolean13 = timeZone0.hasSameRules(timeZone12);
        boolean boolean14 = timeZone12.observesDaylightTime();
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str17 = locale15.getExtension('a');
        java.util.Set<java.lang.String> strSet18 = locale15.getUnicodeLocaleAttributes();
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone12, locale15);
        timeZone12.setRawOffset(42);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone12);
        boolean boolean23 = timeZone12.useDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar19 and calendar22", (calendar19.compareTo(calendar22) == 0) == calendar19.equals(calendar22));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        org.joda.time.LocalDateTime localDateTime9 = property5.addToCopy((int) '4');
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.centuries();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.hourOfDay();
        long long16 = chronology10.add((long) 28, (long) 97, 35410123);
        org.joda.time.DurationField durationField17 = chronology10.weekyears();
        org.joda.time.DurationField durationField18 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField11, and durationField17", !(durationField18.compareTo(durationField11) == 0) || (Math.signum(durationField18.compareTo(durationField17)) == Math.signum(durationField11.compareTo(durationField17))));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plus((-25L));
        org.joda.time.DateTime dateTime9 = dateTime3.withMillisOfDay(2022);
        org.joda.time.DateTime dateTime11 = dateTime9.plusDays(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime.Property property13 = dateTime11.property(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime11.minusDays(79200000);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 5);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = dateTime15.toDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate22.minus(readablePeriod23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate24.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.DateTime.Property property27 = dateTime26.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime26.plus(readableDuration28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusWeeks((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime29.minus(readableDuration32);
        org.joda.time.DateTime.Property property34 = dateTime29.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime36 = dateTime29.plus(readableDuration35);
        int int37 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) dateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime20", (dateTime15.compareTo(dateTime20) == 0) == dateTime15.equals(dateTime20));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfDay(5);
        org.joda.time.DateTime dateTime6 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property7 = dateTime5.weekOfWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.DateTime.Property property10 = dateTime8.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant9", (dateTime3.compareTo(instant9) == 0) == dateTime3.equals(instant9));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology11 = null;
        boolean boolean12 = dateTimeFieldType10.isSupported(chronology11);
        org.joda.time.Chronology chronology13 = null;
        boolean boolean14 = dateTimeFieldType10.isSupported(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType10.getRangeDurationType();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate18.minus(readablePeriod19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.Chronology chronology23 = localDate20.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long28 = dateTimeZone26.nextTransition((long) 4);
        org.joda.time.Chronology chronology29 = chronology23.withZone(dateTimeZone26);
        org.joda.time.DurationField durationField30 = chronology29.millis();
        org.joda.time.DurationField durationField31 = durationFieldType16.getField(chronology29);
        org.joda.time.DateTimeZone dateTimeZone32 = chronology29.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField30 and durationField31", Math.signum(durationField30.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField30)));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.LocalDate localDate16 = localDate12.plusMonths((int) (byte) 0);
        int int17 = localDate16.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property18 = localDate16.weekyear();
        org.joda.time.LocalDate localDate20 = property18.addToCopy((int) (byte) -1);
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology21.getZone();
        int int24 = dateTimeZone22.getOffsetFromLocal((long) (-2731));
        org.joda.time.DateTime dateTime25 = dateTime9.toDateTime(dateTimeZone22);
        java.util.Locale locale27 = java.util.Locale.FRANCE;
        java.lang.String str28 = dateTimeZone22.getShortName(30L, locale27);
        int int30 = dateTimeZone22.getOffsetFromLocal(1644573062283L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime25", (dateTime5.compareTo(dateTime25) == 0) == dateTime5.equals(dateTime25));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMillis(32772);
        org.joda.time.DateTime dateTime20 = dateTime16.withMillis((long) ' ');
        org.joda.time.DateTime dateTime22 = dateTime16.minusMillis(5);
        boolean boolean23 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime.Property property24 = dateTime22.minuteOfHour();
        org.joda.time.DateTime dateTime25 = property24.roundHalfEvenCopy();
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = null;
        org.joda.time.format.DateTimeParser dateTimeParser27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter26, dateTimeParser27);
        org.joda.time.Chronology chronology29 = dateTimeFormatter28.getChronolgy();
        boolean boolean30 = dateTimeFormatter28.isParser();
        org.joda.time.Chronology chronology31 = dateTimeFormatter28.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter28.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeFormatter32.getZone();
        org.joda.time.DateTime dateTime34 = dateTime25.withZone(dateTimeZone33);
        int int35 = dateTime25.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime34", (dateTime5.compareTo(dateTime34) == 0) == dateTime5.equals(dateTime34));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long5 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now(dateTimeZone2);
        int int8 = dateTimeZone2.getOffset(1644537599999L);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.minus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMillis(32772);
        org.joda.time.DateTime dateTime18 = dateTime14.withMillis((long) ' ');
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.withMillisOfDay(5);
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfWeek();
        boolean boolean26 = dateTime14.equals((java.lang.Object) dateTime24);
        org.joda.time.DateTime dateTime28 = dateTime14.withWeekyear((-292275054));
        org.joda.time.DateTime.Property property29 = dateTime14.millisOfDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(chronology30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDate localDate33 = localDate31.minus(readablePeriod32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDate33.toDateTimeAtMidnight(dateTimeZone34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.plus(readableDuration36);
        org.joda.time.DateTime dateTime40 = dateTime35.withDurationAdded((long) 0, (int) (byte) 10);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(chronology41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDate localDate44 = localDate42.minus(readablePeriod43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = localDate44.toDateTimeAtMidnight(dateTimeZone45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.DateTime dateTime48 = dateTime46.minus(readablePeriod47);
        org.joda.time.DateTime.Property property49 = dateTime48.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology51 = null;
        boolean boolean52 = dateTimeFieldType50.isSupported(chronology51);
        int int53 = dateTime48.get(dateTimeFieldType50);
        boolean boolean54 = dateTime35.isSupported(dateTimeFieldType50);
        org.joda.time.Instant instant55 = dateTime35.toInstant();
        int int56 = dateTime14.compareTo((org.joda.time.ReadableInstant) instant55);
        boolean boolean57 = dateTimeZone2.equals((java.lang.Object) instant55);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) 622, dateTimeZone2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant55", (dateTime14.compareTo(instant55) == 0) == dateTime14.equals(instant55));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMillis(32772);
        org.joda.time.DateTime dateTime20 = dateTime16.withMillis((long) ' ');
        org.joda.time.DateTime dateTime22 = dateTime16.minusMillis(5);
        boolean boolean23 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime.Property property24 = dateTime22.minuteOfHour();
        org.joda.time.DateTime dateTime25 = property24.roundHalfEvenCopy();
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = null;
        org.joda.time.format.DateTimeParser dateTimeParser27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter26, dateTimeParser27);
        org.joda.time.Chronology chronology29 = dateTimeFormatter28.getChronolgy();
        boolean boolean30 = dateTimeFormatter28.isParser();
        org.joda.time.Chronology chronology31 = dateTimeFormatter28.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter28.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeFormatter32.getZone();
        org.joda.time.DateTime dateTime34 = dateTime25.withZone(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((java.lang.Object) dateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime34", (dateTime5.compareTo(dateTime34) == 0) == dateTime5.equals(dateTime34));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long19 = dateTimeZone16.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str21 = dateTimeZone16.getNameKey(100L);
        org.joda.time.DateTime dateTime22 = dateTime13.withZoneRetainFields(dateTimeZone16);
        boolean boolean23 = dateTime22.isAfterNow();
        org.joda.time.DateTime.Property property24 = dateTime22.dayOfYear();
        org.joda.time.Instant instant25 = dateTime22.toInstant();
        org.joda.time.MutableDateTime mutableDateTime26 = instant25.toMutableDateTime();
        int int27 = mutableDateTime26.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant25", (dateTime13.compareTo(instant25) == 0) == dateTime13.equals(instant25));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long19 = dateTimeZone16.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str21 = dateTimeZone16.getNameKey(100L);
        org.joda.time.DateTime dateTime22 = dateTime13.withZoneRetainFields(dateTimeZone16);
        boolean boolean23 = dateTime22.isAfterNow();
        org.joda.time.DateTime.Property property24 = dateTime22.dayOfYear();
        org.joda.time.Instant instant25 = dateTime22.toInstant();
        org.joda.time.MutableDateTime mutableDateTime26 = instant25.toMutableDateTime();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate28.toDateTimeAtMidnight(dateTimeZone29);
        org.joda.time.LocalDate.Property property31 = localDate28.dayOfWeek();
        org.joda.time.LocalDate localDate32 = property31.getLocalDate();
        org.joda.time.LocalDate localDate33 = property31.getLocalDate();
        org.joda.time.LocalDate localDate34 = property31.getLocalDate();
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.lang.String str36 = property31.getAsShortText(locale35);
        java.util.Locale locale37 = locale35.stripExtensions();
        java.util.Calendar calendar38 = mutableDateTime26.toCalendar(locale37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant25", (dateTime22.compareTo(instant25) == 0) == dateTime22.equals(instant25));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtMidnight(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear(7);
        org.joda.time.LocalDate localDate8 = localDate6.withWeekOfWeekyear(9);
        org.joda.time.Chronology chronology9 = localDate6.getChronology();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'u', chronology9);
        org.joda.time.LocalDate localDate12 = localDate10.withYearOfEra((int) (short) 100);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate14.minus(readablePeriod15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.minus(readablePeriod19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.DateTime dateTime26 = dateTime22.withMonthOfYear(5);
        org.joda.time.DateTime.Property property27 = dateTime26.hourOfDay();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(chronology28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDate localDate31 = localDate29.minus(readablePeriod30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate31.toDateTimeAtMidnight(dateTimeZone32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.minus(readablePeriod34);
        org.joda.time.DateMidnight dateMidnight36 = dateTime35.toDateMidnight();
        org.joda.time.DateTime dateTime37 = dateTime35.withEarlierOffsetAtOverlap();
        int int38 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime39 = dateTime26.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(chronology40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDate localDate43 = localDate41.minus(readablePeriod42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDate43.toDateTimeAtMidnight(dateTimeZone44);
        org.joda.time.Chronology chronology46 = localDate43.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone48 = chronology46.getZone();
        org.joda.time.DateTime dateTime49 = dateTime26.withZone(dateTimeZone48);
        org.joda.time.Interval interval50 = localDate10.toInterval(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime49", (dateTime26.compareTo(dateTime49) == 0) == dateTime26.equals(dateTime49));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        org.joda.time.Instant instant9 = dateTime7.toInstant();
        org.joda.time.DateTime.Property property10 = dateTime7.centuryOfEra();
        org.joda.time.DateTime dateTime12 = property10.addToCopy((long) 70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant9", (dateTime5.compareTo(instant9) == 0) == dateTime5.equals(instant9));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plus((-25L));
        org.joda.time.DateTime dateTime9 = dateTime3.withMillisOfDay(2022);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.minus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.minus(readablePeriod16);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfWeek();
        org.joda.time.Instant instant19 = dateTime17.toInstant();
        int int20 = dateTime9.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        boolean boolean22 = dateTime9.isBefore(readableInstant21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant19", (dateTime3.compareTo(instant19) == 0) == dateTime3.equals(instant19));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTime.Property property9 = dateTime7.dayOfMonth();
        boolean boolean10 = dateTime7.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime7.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime7.withPeriodAdded(readablePeriod12, 292278993);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.LocalDate.Property property19 = localDate16.dayOfWeek();
        org.joda.time.LocalDate localDate20 = property19.getLocalDate();
        org.joda.time.LocalDate localDate22 = property19.addWrapFieldToCopy(70);
        org.joda.time.LocalDate localDate24 = property19.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.DateTime dateTime26 = dateTime14.withChronology(chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime14.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime26", (dateTime14.compareTo(dateTime26) == 0) == dateTime14.equals(dateTime26));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.Chronology chronology10 = chronology9.withUTC();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        java.lang.String str12 = chronology10.toString();
        long long16 = chronology10.add((long) 32, (long) (-2731), (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField17 = chronology10.dayOfWeek();
        org.joda.time.DurationField durationField18 = chronology10.halfdays();
        org.joda.time.DurationField durationField19 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField20 = chronology10.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField19", Math.signum(durationField18.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField18)));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.minuteOfDay();
        org.joda.time.DurationField durationField15 = chronology11.eras();
        org.joda.time.DurationField durationField16 = chronology11.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField16, and durationField15", !(durationField15.compareTo(durationField16) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField16.compareTo(durationField15))));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.Chronology chronology6 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long11 = dateTimeZone9.nextTransition((long) 4);
        org.joda.time.Chronology chronology12 = chronology6.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = chronology6.dayOfWeek();
        org.joda.time.DurationField durationField14 = chronology6.centuries();
        org.joda.time.DurationField durationField15 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField16 = chronology6.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField15", Math.signum(durationField14.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField14)));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = durationFieldType1.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean9 = localTime7.isSupported(durationFieldType8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime7.minus(readablePeriod10);
        org.joda.time.LocalTime localTime13 = localTime7.plusSeconds(9);
        org.joda.time.Chronology chronology14 = localTime7.getChronology();
        org.joda.time.Chronology chronology15 = chronology14.withUTC();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType4.getField(chronology15);
        org.joda.time.DurationField durationField18 = chronology15.eras();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 1, chronology15);
        org.joda.time.DurationField durationField20 = durationFieldType1.getField(chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField20, and durationField18", !(durationField18.compareTo(durationField20) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField20.compareTo(durationField18))));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str3 = dateTimeZone1.getShortName(0L);
        java.lang.String str4 = dateTimeZone1.toString();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.minutes();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean12 = localTime10.isSupported(durationFieldType11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime10.minus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime10.plusSeconds(9);
        org.joda.time.Chronology chronology17 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfDay();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj7, chronology17);
        org.joda.time.DurationField durationField21 = chronology17.halfdays();
        org.joda.time.DurationField durationField22 = durationFieldType6.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField23 = chronology17.monthOfYear();
        org.joda.time.DateTimeField dateTimeField24 = chronology17.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        int int30 = dateTimeZone27.getStandardOffset((long) (short) 0);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(0L, dateTimeZone27);
        org.joda.time.Chronology chronology32 = chronology17.withZone(dateTimeZone27);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(chronology32);
        org.joda.time.DurationField durationField34 = chronology32.halfdays();
        org.joda.time.DateTime dateTime35 = dateTime5.withChronology(chronology32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField34", (durationField21.compareTo(durationField34) == 0) == durationField21.equals(durationField34));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plus((-25L));
        org.joda.time.DateTime dateTime9 = dateTime3.withMillisOfDay(2022);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.minus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.minus(readablePeriod16);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfWeek();
        org.joda.time.Instant instant19 = dateTime17.toInstant();
        int int20 = dateTime9.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.DateTime dateTime22 = dateTime9.withWeekOfWeekyear(7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant19", (dateTime3.compareTo(instant19) == 0) == dateTime3.equals(instant19));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plus((-25L));
        org.joda.time.DateTime dateTime9 = dateTime3.withMillisOfDay(2022);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.minus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.minus(readablePeriod16);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfWeek();
        org.joda.time.Instant instant19 = dateTime17.toInstant();
        int int20 = dateTime9.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.DateTimeZone dateTimeZone21 = instant19.getZone();
        java.util.TimeZone timeZone22 = dateTimeZone21.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant19", (dateTime3.compareTo(instant19) == 0) == dateTime3.equals(instant19));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long17 = dateTimeZone15.nextTransition((long) 4);
        org.joda.time.DateTime dateTime18 = dateTime13.withZone(dateTimeZone15);
        org.joda.time.DateTime dateTime20 = dateTime13.minusHours(0);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readablePeriod21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate26 = localDate24.minus(readablePeriod25);
        org.joda.time.LocalDate localDate28 = localDate24.plusMonths((int) (byte) 0);
        int int29 = localDate28.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property30 = localDate28.weekyear();
        org.joda.time.Chronology chronology31 = localDate28.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.millisOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime20.toMutableDateTime(chronology31);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str38 = dateTimeZone36.getShortName(0L);
        java.lang.String str39 = dateTimeZone36.toString();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(chronology41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDate localDate44 = localDate42.minus(readablePeriod43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = localDate44.toDateTimeAtMidnight(dateTimeZone45);
        org.joda.time.DateTime.Property property47 = dateTime46.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.DateTime dateTime49 = dateTime46.plus(readableDuration48);
        org.joda.time.LocalDate localDate50 = dateTime46.toLocalDate();
        boolean boolean51 = dateTime40.isBefore((org.joda.time.ReadableInstant) dateTime46);
        int int52 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and mutableDateTime34", (dateTime20.compareTo(mutableDateTime34) == 0) == dateTime20.equals(mutableDateTime34));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        int int6 = localDate5.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property7 = localDate5.weekyear();
        org.joda.time.LocalDate localDate9 = property7.addToCopy((int) (byte) -1);
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.joda.time.DurationField durationField12 = chronology10.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField12, and durationField11", !(durationField11.compareTo(durationField12) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField12.compareTo(durationField11))));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long19 = dateTimeZone16.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str21 = dateTimeZone16.getNameKey(100L);
        org.joda.time.DateTime dateTime22 = dateTime13.withZoneRetainFields(dateTimeZone16);
        boolean boolean23 = dateTime22.isAfterNow();
        org.joda.time.DateTime.Property property24 = dateTime22.dayOfYear();
        org.joda.time.Instant instant25 = dateTime22.toInstant();
        org.joda.time.DateTime.Property property26 = dateTime22.dayOfYear();
        org.joda.time.DateTime.Property property27 = dateTime22.centuryOfEra();
        org.joda.time.DateTime dateTime28 = property27.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant25", (dateTime13.compareTo(instant25) == 0) == dateTime13.equals(instant25));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate2.minus(readablePeriod3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtMidnight(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readablePeriod7);
        org.joda.time.DateMidnight dateMidnight9 = dateTime8.toDateMidnight();
        org.joda.time.DateTime.Property property10 = dateTime8.dayOfMonth();
        boolean boolean11 = dateTime8.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime8.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime8.withPeriodAdded(readablePeriod13, 292278993);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate17.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.LocalDate.Property property20 = localDate17.dayOfWeek();
        org.joda.time.LocalDate localDate21 = property20.getLocalDate();
        org.joda.time.LocalDate localDate23 = property20.addWrapFieldToCopy(70);
        org.joda.time.LocalDate localDate25 = property20.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DateTime dateTime27 = dateTime15.withChronology(chronology26);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(1644573142815L, chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime27", (dateTime6.compareTo(dateTime27) == 0) == dateTime6.equals(dateTime27));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        java.util.Locale locale9 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str10 = property8.getAsShortText(locale9);
        org.joda.time.DateTime dateTime11 = property8.getDateTime();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.plus(readablePeriod12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate15.minus(readablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate17.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.minus(readablePeriod20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.toDateTime(chronology24);
        org.joda.time.DateTime dateTime27 = dateTime23.withMonthOfYear(5);
        org.joda.time.DateTime.Property property28 = dateTime27.hourOfDay();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate32 = localDate30.minus(readablePeriod31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localDate32.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.minus(readablePeriod35);
        org.joda.time.DateMidnight dateMidnight37 = dateTime36.toDateMidnight();
        org.joda.time.DateTime dateTime38 = dateTime36.withEarlierOffsetAtOverlap();
        int int39 = dateTime27.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime.Property property40 = dateTime27.dayOfYear();
        org.joda.time.Instant instant41 = dateTime27.toInstant();
        org.joda.time.DateTime dateTime44 = dateTime27.withDurationAdded(452769L, 365);
        int int45 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DateTime.Property property47 = dateTime13.property(dateTimeFieldType46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and instant41", (dateTime27.compareTo(instant41) == 0) == dateTime27.equals(instant41));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plus((-25L));
        org.joda.time.DateTime dateTime9 = dateTime3.minusDays((int) (short) 10);
        org.joda.time.DateTime dateTime11 = dateTime9.plus(31L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate13.minus(readablePeriod14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.minus(readablePeriod18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMillis((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int23 = dateTime21.get(dateTimeFieldType22);
        org.joda.time.DateTime.Property property24 = dateTime21.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.minus(readablePeriod25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(chronology27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDate localDate30 = localDate28.minus(readablePeriod29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDate30.toDateTimeAtMidnight(dateTimeZone31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.minus(readablePeriod33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.toDateTime(chronology37);
        org.joda.time.DateTime dateTime40 = dateTime36.withMonthOfYear(5);
        org.joda.time.DateTime.Property property41 = dateTime40.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long46 = dateTimeZone43.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str48 = dateTimeZone43.getNameKey(100L);
        org.joda.time.DateTime dateTime49 = dateTime40.withZoneRetainFields(dateTimeZone43);
        boolean boolean50 = dateTime49.isAfterNow();
        org.joda.time.DateTime.Property property51 = dateTime49.dayOfYear();
        java.lang.String str52 = property51.getAsString();
        org.joda.time.DateTime dateTime53 = property51.withMaximumValue();
        org.joda.time.DateTime dateTime54 = property51.getDateTime();
        int int55 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate(chronology56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = localDate57.toDateTimeAtMidnight(dateTimeZone58);
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate62 = localDate57.withFieldAdded(durationFieldType60, (int) (short) 0);
        org.joda.time.LocalDate.Property property63 = localDate57.year();
        org.joda.time.LocalDate localDate65 = property63.setCopy("32770");
        org.joda.time.LocalDate localDate66 = property63.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDate localDate68 = localDate66.plus(readablePeriod67);
        org.joda.time.Chronology chronology69 = localDate66.getChronology();
        org.joda.time.MutableDateTime mutableDateTime70 = dateTime54.toMutableDateTime(chronology69);
        boolean boolean71 = dateTime11.isBefore((org.joda.time.ReadableInstant) dateTime54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime54 and mutableDateTime70", (dateTime54.compareTo(mutableDateTime70) == 0) == dateTime54.equals(mutableDateTime70));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtMidnight(dateTimeZone3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate7 = localDate2.withFieldAdded(durationFieldType5, (int) (short) 0);
        org.joda.time.LocalDate.Property property8 = localDate2.year();
        org.joda.time.LocalDate localDate9 = property8.roundCeilingCopy();
        org.joda.time.LocalDate localDate10 = property8.withMaximumValue();
        org.joda.time.LocalDate localDate12 = property8.addToCopy(7);
        int int13 = localDate12.getDayOfYear();
        org.joda.time.LocalDate localDate15 = localDate12.minusDays(6);
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate12.minus(readablePeriod17);
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        org.joda.time.Chronology chronology22 = dateTimeFormatter21.getChronolgy();
        org.joda.time.Chronology chronology23 = dateTimeFormatter21.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter21.withZoneUTC();
        boolean boolean25 = dateTimeFormatter24.isParser();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeFormatter24.getZone();
        org.joda.time.DateTime dateTime27 = localDate12.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(1644573064277L, dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime27", (dateTime16.compareTo(dateTime27) == 0) == dateTime16.equals(dateTime27));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long19 = dateTimeZone16.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str21 = dateTimeZone16.getNameKey(100L);
        org.joda.time.DateTime dateTime22 = dateTime13.withZoneRetainFields(dateTimeZone16);
        long long26 = dateTimeZone16.convertLocalToUTC((long) 32, false, (long) (-4));
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(15);
        org.joda.time.DateTime dateTime30 = localDate27.toDateTimeAtMidnight(dateTimeZone29);
        java.util.GregorianCalendar gregorianCalendar31 = dateTime30.toGregorianCalendar();
        int int32 = gregorianCalendar31.getFirstDayOfWeek();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localDate34.toDateTimeAtMidnight(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.minusDays((-292275054));
        org.joda.time.DateTime dateTime40 = dateTime36.plus((-25L));
        org.joda.time.DateTime dateTime42 = dateTime36.withMillisOfDay(2022);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate(chronology43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDate localDate46 = localDate44.minus(readablePeriod45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localDate46.toDateTimeAtMidnight(dateTimeZone47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.minus(readablePeriod49);
        org.joda.time.DateTime.Property property51 = dateTime50.dayOfWeek();
        org.joda.time.Instant instant52 = dateTime50.toInstant();
        int int53 = dateTime42.compareTo((org.joda.time.ReadableInstant) instant52);
        boolean boolean54 = gregorianCalendar31.after((java.lang.Object) int53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant52", (dateTime5.compareTo(instant52) == 0) == dateTime5.equals(instant52));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.minuteOfDay();
        org.joda.time.DurationField durationField15 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField16 = chronology11.era();
        org.joda.time.Chronology chronology17 = chronology11.withUTC();
        org.joda.time.DurationField durationField18 = chronology11.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField18, and durationField15", !(durationField15.compareTo(durationField18) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField18.compareTo(durationField15))));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.lang.String str7 = timeZone6.getID();
        java.time.ZoneId zoneId8 = timeZone6.toZoneId();
        boolean boolean9 = dateTime5.equals((java.lang.Object) timeZone6);
        java.util.TimeZone.setDefault(timeZone6);
        boolean boolean11 = timeZone6.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.time.ZoneId zoneId14 = timeZone6.toZoneId();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        java.lang.String str16 = timeZone15.getID();
        int int18 = timeZone15.getOffset((-2104009200000L));
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(locale19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate22.toDateTimeAtMidnight(dateTimeZone23);
        java.util.Date date25 = localDate22.toDate();
        calendar20.setTime(date25);
        java.util.TimeZone timeZone27 = calendar20.getTimeZone();
        boolean boolean28 = timeZone15.hasSameRules(timeZone27);
        boolean boolean29 = timeZone27.observesDaylightTime();
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str32 = locale30.getExtension('a');
        java.util.Set<java.lang.String> strSet33 = locale30.getUnicodeLocaleAttributes();
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone27, locale30);
        timeZone27.setRawOffset(42);
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone27);
        boolean boolean38 = timeZone6.hasSameRules(timeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar34 and calendar37", (calendar34.compareTo(calendar37) == 0) == calendar34.equals(calendar37));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate2.plus(readablePeriod3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology6 = null;
        boolean boolean7 = dateTimeFieldType5.isSupported(chronology6);
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.minus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMillis(32772);
        org.joda.time.DateTime dateTime18 = dateTime14.withMillis((long) ' ');
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate20.plus(readablePeriod21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology24 = null;
        boolean boolean25 = dateTimeFieldType23.isSupported(chronology24);
        boolean boolean26 = localDate22.isSupported(dateTimeFieldType23);
        int int27 = dateTime18.get(dateTimeFieldType23);
        boolean boolean28 = localDate4.isSupported(dateTimeFieldType23);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDate30.toDateTimeAtMidnight(dateTimeZone31);
        boolean boolean33 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate30);
        org.joda.time.LocalDate localDate35 = localDate30.minusMonths(32770);
        org.joda.time.LocalTime localTime36 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long42 = dateTimeZone39.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str44 = dateTimeZone39.getNameKey(100L);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 10, dateTimeZone39);
        org.joda.time.DateTime dateTime46 = localDate35.toDateTime(localTime36, dateTimeZone39);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(1644572942500L, dateTimeZone39);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(chronology48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDate localDate51 = localDate49.minus(readablePeriod50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localDate51.toDateTimeAtMidnight(dateTimeZone52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.DateTime dateTime55 = dateTime53.minus(readablePeriod54);
        org.joda.time.DateMidnight dateMidnight56 = dateTime55.toDateMidnight();
        org.joda.time.DateTime dateTime57 = dateTime55.withEarlierOffsetAtOverlap();
        long long58 = dateTime57.getMillis();
        org.joda.time.DateTime dateTime60 = dateTime57.withDayOfMonth(2);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.DateTime dateTime62 = dateTime57.plus(readableDuration61);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean64 = dateTime62.isSupported(dateTimeFieldType63);
        org.joda.time.Chronology chronology65 = dateTime62.getChronology();
        org.joda.time.DateTime dateTime66 = org.joda.time.DateTime.now(chronology65);
        org.joda.time.DateTime dateTime67 = dateTime47.withChronology(chronology65);
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate(chronology65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and dateTime67", (dateTime47.compareTo(dateTime67) == 0) == dateTime47.equals(dateTime67));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        int int12 = dateTime9.getDayOfWeek();
        boolean boolean14 = dateTime9.isEqual((long) 0);
        org.joda.time.DateTime dateTime16 = dateTime9.withMillisOfSecond(23);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate18.minus(readablePeriod19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.minus(readablePeriod23);
        org.joda.time.DateTime dateTime26 = dateTime24.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.toDateTime(chronology27);
        org.joda.time.DateTime dateTime30 = dateTime26.withMonthOfYear(5);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long34 = dateTimeZone32.nextTransition((long) 4);
        org.joda.time.DateTime dateTime35 = dateTime30.withZone(dateTimeZone32);
        org.joda.time.DateTime dateTime37 = dateTime30.minusHours(0);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.minus(readablePeriod38);
        boolean boolean40 = dateTime16.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Chronology chronology41 = dateTime16.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.days();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.year();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime35", (dateTime30.compareTo(dateTime35) == 0) == dateTime30.equals(dateTime35));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withMillisOfDay(5);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfWeek();
        boolean boolean17 = dateTime5.equals((java.lang.Object) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime5.withWeekyear((-292275054));
        org.joda.time.DateTime.Property property20 = dateTime5.millisOfDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate22.minus(readablePeriod23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate24.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.plus(readableDuration27);
        org.joda.time.DateTime dateTime31 = dateTime26.withDurationAdded((long) 0, (int) (byte) 10);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate35 = localDate33.minus(readablePeriod34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localDate35.toDateTimeAtMidnight(dateTimeZone36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.minus(readablePeriod38);
        org.joda.time.DateTime.Property property40 = dateTime39.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology42 = null;
        boolean boolean43 = dateTimeFieldType41.isSupported(chronology42);
        int int44 = dateTime39.get(dateTimeFieldType41);
        boolean boolean45 = dateTime26.isSupported(dateTimeFieldType41);
        org.joda.time.Instant instant46 = dateTime26.toInstant();
        int int47 = dateTime5.compareTo((org.joda.time.ReadableInstant) instant46);
        org.joda.time.DateTime dateTime49 = dateTime5.plusSeconds(70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant46", (dateTime13.compareTo(instant46) == 0) == dateTime13.equals(instant46));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        int int5 = localDate4.getDayOfYear();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate7.minus(readablePeriod8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.minus(readablePeriod12);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.toDateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime15.withMonthOfYear(5);
        org.joda.time.DateTime.Property property20 = dateTime19.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long25 = dateTimeZone22.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str27 = dateTimeZone22.getNameKey(100L);
        org.joda.time.DateTime dateTime28 = dateTime19.withZoneRetainFields(dateTimeZone22);
        boolean boolean29 = dateTime28.isAfterNow();
        org.joda.time.DateTime.Property property30 = dateTime28.dayOfYear();
        org.joda.time.Instant instant31 = dateTime28.toInstant();
        org.joda.time.MutableDateTime mutableDateTime32 = instant31.toMutableDateTime();
        boolean boolean33 = localDate4.equals((java.lang.Object) instant31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and mutableDateTime32", (dateTime28.compareTo(mutableDateTime32) == 0) == dateTime28.equals(mutableDateTime32));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        int int6 = localDate5.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property7 = localDate5.weekyear();
        int int8 = localDate5.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Interval interval10 = localDate5.toInterval(dateTimeZone9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.toDateTime(chronology21);
        org.joda.time.DateTime dateTime24 = dateTime20.withMonthOfYear(5);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long28 = dateTimeZone26.nextTransition((long) 4);
        org.joda.time.DateTime dateTime29 = dateTime24.withZone(dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight30 = localDate5.toDateMidnight(dateTimeZone26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(chronology31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDate localDate34 = localDate32.minus(readablePeriod33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localDate34.toDateTimeAtMidnight(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.plusMillis(32772);
        org.joda.time.DateTime dateTime40 = dateTime36.withMillis((long) ' ');
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(chronology41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDate localDate44 = localDate42.plus(readablePeriod43);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology46 = null;
        boolean boolean47 = dateTimeFieldType45.isSupported(chronology46);
        boolean boolean48 = localDate44.isSupported(dateTimeFieldType45);
        int int49 = dateTime40.get(dateTimeFieldType45);
        java.util.Date date50 = dateTime40.toDate();
        org.joda.time.DateTime dateTime52 = dateTime40.minusDays((int) (byte) 100);
        org.joda.time.DateTime.Property property53 = dateTime52.minuteOfDay();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate(chronology54);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDate localDate57 = localDate55.minus(readablePeriod56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = localDate57.toDateTimeAtMidnight(dateTimeZone58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.DateTime dateTime61 = dateTime59.minus(readablePeriod60);
        org.joda.time.DateTime.Property property62 = dateTime61.year();
        java.lang.String str63 = property62.getAsString();
        java.lang.String str64 = property62.toString();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate(chronology65);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDate localDate68 = localDate66.minus(readablePeriod67);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateTime dateTime70 = localDate68.toDateTimeAtMidnight(dateTimeZone69);
        org.joda.time.DateTime dateTime72 = dateTime70.plusMillis(32772);
        org.joda.time.DateTime dateTime74 = dateTime70.withMillis((long) ' ');
        org.joda.time.DateTime dateTime76 = dateTime70.minusMillis(5);
        int int77 = dateTime70.getDayOfMonth();
        int int78 = property62.getDifference((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime dateTime80 = property62.addToCopy((int) (short) 0);
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.LocalDate localDate82 = new org.joda.time.LocalDate(chronology81);
        org.joda.time.ReadablePeriod readablePeriod83 = null;
        org.joda.time.LocalDate localDate84 = localDate82.minus(readablePeriod83);
        org.joda.time.DateTimeZone dateTimeZone85 = null;
        org.joda.time.DateTime dateTime86 = localDate84.toDateTimeAtMidnight(dateTimeZone85);
        org.joda.time.ReadablePeriod readablePeriod87 = null;
        org.joda.time.DateTime dateTime88 = dateTime86.minus(readablePeriod87);
        org.joda.time.DateMidnight dateMidnight89 = dateTime88.toDateMidnight();
        org.joda.time.DateTime.Property property90 = dateTime88.dayOfMonth();
        boolean boolean91 = dateTime88.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone92 = dateTime88.getZone();
        org.joda.time.LocalDate localDate93 = new org.joda.time.LocalDate(dateTimeZone92);
        org.joda.time.DateTime dateTime94 = dateTime80.withZone(dateTimeZone92);
        java.lang.String str96 = dateTimeZone92.getNameKey(1644573007080L);
        org.joda.time.MutableDateTime mutableDateTime97 = dateTime52.toMutableDateTime(dateTimeZone92);
        long long99 = dateTimeZone26.getMillisKeepLocal(dateTimeZone92, 3064707460859000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime29", (dateTime24.compareTo(dateTime29) == 0) == dateTime24.equals(dateTime29));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate6 = localDate1.withFieldAdded(durationFieldType4, (int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate1.year();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property7.withMaximumValue();
        org.joda.time.LocalDate localDate11 = property7.addToCopy(7);
        int int12 = localDate11.getDayOfYear();
        org.joda.time.LocalDate localDate14 = localDate11.minusDays(6);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate11.minus(readablePeriod16);
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = null;
        org.joda.time.format.DateTimeParser dateTimeParser19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser19);
        org.joda.time.Chronology chronology21 = dateTimeFormatter20.getChronolgy();
        org.joda.time.Chronology chronology22 = dateTimeFormatter20.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter20.withZoneUTC();
        boolean boolean24 = dateTimeFormatter23.isParser();
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeFormatter23.getZone();
        org.joda.time.DateTime dateTime26 = localDate11.toDateTimeAtCurrentTime(dateTimeZone25);
        long long28 = dateTimeZone25.previousTransition((-62161135603801L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime26", (dateTime15.compareTo(dateTime26) == 0) == dateTime15.equals(dateTime26));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime4.minus(readablePeriod7);
        org.joda.time.LocalTime localTime10 = localTime4.plusSeconds(9);
        org.joda.time.Chronology chronology11 = localTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.hourOfDay();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj1, chronology11);
        org.joda.time.DurationField durationField15 = chronology11.halfdays();
        org.joda.time.DurationField durationField16 = durationFieldType0.getField(chronology11);
        java.lang.String str17 = durationFieldType0.getName();
        java.lang.String str18 = durationFieldType0.getName();
        java.lang.String str19 = durationFieldType0.getName();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean25 = localTime23.isSupported(durationFieldType24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime27 = localTime23.minus(readablePeriod26);
        org.joda.time.LocalTime localTime29 = localTime23.plusSeconds(9);
        org.joda.time.Chronology chronology30 = localTime23.getChronology();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(chronology30);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.yearOfCentury();
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology32);
        org.joda.time.DurationField durationField35 = chronology32.eras();
        org.joda.time.DateTimeField dateTimeField36 = chronology32.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField37 = chronology32.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.Chronology chronology39 = chronology32.withZone(dateTimeZone38);
        boolean boolean40 = durationFieldType0.isSupported(chronology32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField35", Math.signum(durationField15.compareTo(durationField35)) == -Math.signum(durationField35.compareTo(durationField15)));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plus((-25L));
        org.joda.time.DateTime dateTime9 = dateTime3.withMillisOfDay(2022);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.minus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.minus(readablePeriod16);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfWeek();
        org.joda.time.Instant instant19 = dateTime17.toInstant();
        int int20 = dateTime9.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.DateTimeZone dateTimeZone21 = instant19.getZone();
        long long24 = dateTimeZone21.adjustOffset((long) 397, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant19", (dateTime3.compareTo(instant19) == 0) == dateTime3.equals(instant19));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate2.minus(readablePeriod3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtMidnight(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readablePeriod7);
        org.joda.time.DateMidnight dateMidnight9 = dateTime8.toDateMidnight();
        org.joda.time.DateTime.Property property10 = dateTime8.dayOfMonth();
        boolean boolean11 = dateTime8.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime8.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime8.withPeriodAdded(readablePeriod13, 292278993);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate17.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.LocalDate.Property property20 = localDate17.dayOfWeek();
        org.joda.time.LocalDate localDate21 = property20.getLocalDate();
        org.joda.time.LocalDate localDate23 = property20.addWrapFieldToCopy(70);
        org.joda.time.LocalDate localDate25 = property20.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DateTime dateTime27 = dateTime15.withChronology(chronology26);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) (short) -1, chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime27", (dateTime6.compareTo(dateTime27) == 0) == dateTime6.equals(dateTime27));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate2.minus(readablePeriod3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtMidnight(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readablePeriod7);
        org.joda.time.DateTime.Property property9 = dateTime8.year();
        java.util.Locale locale10 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str11 = property9.getAsShortText(locale10);
        java.lang.String str12 = locale10.getVariant();
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale14 = java.util.Locale.GERMANY;
        java.util.Locale.setDefault(category0, locale14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate17.minus(readablePeriod18);
        org.joda.time.LocalDate localDate21 = localDate17.plusMonths((int) (byte) 0);
        int int22 = localDate21.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property23 = localDate21.weekyear();
        org.joda.time.LocalDate localDate25 = property23.addToCopy((int) (byte) -1);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getDefault();
        java.lang.String str28 = timeZone27.getID();
        int int30 = timeZone27.getOffset((-2104009200000L));
        java.util.Locale locale31 = java.util.Locale.FRANCE;
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localDate34.toDateTimeAtMidnight(dateTimeZone35);
        java.util.Date date37 = localDate34.toDate();
        calendar32.setTime(date37);
        java.util.TimeZone timeZone39 = calendar32.getTimeZone();
        boolean boolean40 = timeZone27.hasSameRules(timeZone39);
        boolean boolean41 = timeZone39.observesDaylightTime();
        java.util.Locale locale42 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str44 = locale42.getExtension('a');
        java.util.Set<java.lang.String> strSet45 = locale42.getUnicodeLocaleAttributes();
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone39, locale42);
        java.lang.String str47 = localDate25.toString("7", locale42);
        java.lang.String str48 = locale42.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale42);
        java.util.Locale locale50 = java.util.Locale.JAPAN;
        java.util.Locale locale51 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str53 = locale51.getExtension('a');
        java.util.Set<java.lang.String> strSet54 = locale51.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet55 = locale51.getUnicodeLocaleKeys();
        java.lang.String str56 = locale50.getDisplayCountry(locale51);
        java.util.Locale.setDefault(category0, locale50);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate(chronology58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDate localDate61 = localDate59.minus(readablePeriod60);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = localDate61.toDateTimeAtMidnight(dateTimeZone62);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.DateTime dateTime65 = dateTime63.minus(readablePeriod64);
        org.joda.time.DateTime.Property property66 = dateTime65.dayOfWeek();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate(chronology67);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateTime dateTime70 = localDate68.toDateTimeAtMidnight(dateTimeZone69);
        org.joda.time.DateTime dateTime72 = dateTime70.minusDays((-292275054));
        org.joda.time.DateTime dateTime74 = dateTime70.plus((-25L));
        org.joda.time.DateTime dateTime76 = dateTime70.minusDays((int) (short) 10);
        java.util.Locale.Category category77 = java.util.Locale.Category.FORMAT;
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.LocalDate localDate79 = new org.joda.time.LocalDate(chronology78);
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        org.joda.time.LocalDate localDate81 = localDate79.minus(readablePeriod80);
        org.joda.time.DateTimeZone dateTimeZone82 = null;
        org.joda.time.DateTime dateTime83 = localDate81.toDateTimeAtMidnight(dateTimeZone82);
        org.joda.time.ReadablePeriod readablePeriod84 = null;
        org.joda.time.DateTime dateTime85 = dateTime83.minus(readablePeriod84);
        org.joda.time.DateTime.Property property86 = dateTime85.year();
        java.util.Locale locale87 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str88 = property86.getAsShortText(locale87);
        java.lang.String str89 = locale87.getVariant();
        java.util.Locale.setDefault(category77, locale87);
        java.util.Locale locale91 = java.util.Locale.getDefault(category77);
        java.lang.String str92 = locale91.toLanguageTag();
        java.util.Calendar calendar93 = dateTime70.toCalendar(locale91);
        int int94 = property66.getMaximumTextLength(locale91);
        java.util.Locale.setDefault(category0, locale91);
        java.lang.String str97 = locale91.getExtension('a');
        java.lang.String str98 = locale91.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet99 = locale91.getExtensionKeys();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar93", (calendar32.compareTo(calendar93) == 0) == calendar32.equals(calendar93));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("130");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime4.minus(readablePeriod7);
        org.joda.time.LocalTime localTime10 = localTime4.plusSeconds(9);
        org.joda.time.Chronology chronology11 = localTime4.getChronology();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.centuryOfEra();
        org.joda.time.DateTime dateTime14 = dateTime1.withChronology(chronology11);
        org.joda.time.DateTime dateTime16 = dateTime1.minusSeconds(327);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMillis(251);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime14", (dateTime1.compareTo(dateTime14) == 0) == dateTime1.equals(dateTime14));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        java.lang.String str9 = property8.getAsString();
        java.lang.String str10 = property8.toString();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMillis(32772);
        org.joda.time.DateTime dateTime20 = dateTime16.withMillis((long) ' ');
        org.joda.time.DateTime dateTime22 = dateTime16.minusMillis(5);
        int int23 = dateTime16.getDayOfMonth();
        int int24 = property8.getDifference((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime26 = dateTime16.plusMonths(1970);
        org.joda.time.DateTime dateTime27 = dateTime16.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime29 = dateTime27.withCenturyOfEra(11);
        org.joda.time.DateTime dateTime31 = dateTime27.plusMinutes(32772);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 5);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        long long39 = dateTimeZone34.convertLocalToUTC(1644572942340L, false, (long) 990);
        int int41 = dateTimeZone34.getOffset(0L);
        org.joda.time.DateTime dateTime42 = dateTime31.withZone(dateTimeZone34);
        org.joda.time.DateTime.Property property43 = dateTime31.yearOfCentury();
        org.joda.time.DateTime dateTime44 = property43.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime42", (dateTime31.compareTo(dateTime42) == 0) == dateTime31.equals(dateTime42));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plus((-25L));
        org.joda.time.DateTime dateTime9 = dateTime3.withMillisOfDay(2022);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.minus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.minus(readablePeriod16);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfWeek();
        org.joda.time.Instant instant19 = dateTime17.toInstant();
        int int20 = dateTime9.compareTo((org.joda.time.ReadableInstant) instant19);
        int int21 = dateTime9.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant19", (dateTime3.compareTo(instant19) == 0) == dateTime3.equals(instant19));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTime dateTime10 = dateTime7.plusDays(2022);
        int int11 = dateTime7.getSecondOfMinute();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate13.minus(readablePeriod14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTime.Property property18 = dateTime17.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate26 = localDate24.minus(readablePeriod25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate26.toDateTimeAtMidnight(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.plusMillis(32772);
        org.joda.time.DateTime dateTime32 = dateTime28.withMillis((long) ' ');
        org.joda.time.DateTime dateTime34 = dateTime28.minusMillis(5);
        boolean boolean35 = dateTime20.isAfter((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime.Property property36 = dateTime34.minuteOfHour();
        org.joda.time.DateTime dateTime37 = property36.roundHalfEvenCopy();
        org.joda.time.format.DateTimePrinter dateTimePrinter38 = null;
        org.joda.time.format.DateTimeParser dateTimeParser39 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter38, dateTimeParser39);
        org.joda.time.Chronology chronology41 = dateTimeFormatter40.getChronolgy();
        boolean boolean42 = dateTimeFormatter40.isParser();
        org.joda.time.Chronology chronology43 = dateTimeFormatter40.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter40.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone45 = dateTimeFormatter44.getZone();
        org.joda.time.DateTime dateTime46 = dateTime37.withZone(dateTimeZone45);
        org.joda.time.DateTime dateTime47 = dateTime7.toDateTime(dateTimeZone45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime46", (dateTime7.compareTo(dateTime46) == 0) == dateTime7.equals(dateTime46));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate2.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = localDate2.plusMonths((int) (byte) 0);
        int int7 = localDate6.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property8 = localDate6.weekyear();
        int int9 = localDate6.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Interval interval11 = localDate6.toInterval(dateTimeZone10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate13.minus(readablePeriod14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.minus(readablePeriod18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.toDateTime(chronology22);
        org.joda.time.DateTime dateTime25 = dateTime21.withMonthOfYear(5);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long29 = dateTimeZone27.nextTransition((long) 4);
        org.joda.time.DateTime dateTime30 = dateTime25.withZone(dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight31 = localDate6.toDateMidnight(dateTimeZone27);
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.now(dateTimeZone27);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(1118136021523199998L, dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime30", (dateTime25.compareTo(dateTime30) == 0) == dateTime25.equals(dateTime30));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.hourOfDay();
        boolean boolean13 = dateTimeFieldType0.isSupported(chronology10);
        org.joda.time.DurationField durationField14 = chronology10.hours();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.year();
        org.joda.time.DurationField durationField17 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField18 = chronology10.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField17", Math.signum(durationField14.compareTo(durationField17)) == -Math.signum(durationField17.compareTo(durationField14)));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 100);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.minus(readablePeriod2);
        org.joda.time.LocalTime localTime5 = localTime1.withMillisOfSecond(40);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfSecond();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean12 = localTime10.isSupported(durationFieldType11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime10.minus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime10.plusSeconds(9);
        org.joda.time.Chronology chronology17 = localTime10.getChronology();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology17.add(readablePeriod18, (-2L), 1);
        long long25 = chronology17.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology17);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) 9, chronology17);
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.secondOfDay();
        org.joda.time.DurationField durationField30 = chronology28.centuries();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((java.lang.Object) localTime5, chronology28);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = localTime5.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Chronology chronology34 = localTime5.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime32", (dateTime26.compareTo(dateTime32) == 0) == dateTime26.equals(dateTime32));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        java.util.Date date6 = localDate3.toDate();
        calendar1.setTime(date6);
        java.util.TimeZone timeZone8 = calendar1.getTimeZone();
        calendar1.clear();
        calendar1.clear();
        calendar1.setTimeInMillis((long) (byte) 0);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        java.lang.String str14 = timeZone13.getID();
        int int16 = timeZone13.getOffset((-2104009200000L));
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(locale17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        java.util.Date date23 = localDate20.toDate();
        calendar18.setTime(date23);
        java.util.TimeZone timeZone25 = calendar18.getTimeZone();
        boolean boolean26 = timeZone13.hasSameRules(timeZone25);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getDefault();
        java.lang.String str28 = timeZone27.getID();
        java.time.ZoneId zoneId29 = timeZone27.toZoneId();
        boolean boolean30 = timeZone25.hasSameRules(timeZone27);
        calendar1.setTimeZone(timeZone25);
        calendar1.clear();
        java.time.Instant instant33 = calendar1.toInstant();
        calendar1.setLenient(false);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localDate37.toDateTimeAtMidnight(dateTimeZone38);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate42 = localDate37.withFieldAdded(durationFieldType40, (int) (short) 0);
        java.util.Locale locale43 = java.util.Locale.FRANCE;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate(chronology45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localDate46.toDateTimeAtMidnight(dateTimeZone47);
        java.util.Date date49 = localDate46.toDate();
        calendar44.setTime(date49);
        boolean boolean51 = localDate37.equals((java.lang.Object) calendar44);
        java.lang.String str52 = calendar44.getCalendarType();
        int int54 = calendar44.getMinimum(0);
        java.util.Locale locale55 = java.util.Locale.JAPAN;
        java.util.Locale locale56 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str58 = locale56.getExtension('a');
        java.util.Set<java.lang.String> strSet59 = locale56.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet60 = locale56.getUnicodeLocaleKeys();
        java.lang.String str61 = locale55.getDisplayCountry(locale56);
        boolean boolean62 = calendar44.before((java.lang.Object) str61);
        calendar44.setLenient(false);
        boolean boolean65 = calendar1.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar44", (calendar18.compareTo(calendar44) == 0) == calendar18.equals(calendar44));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime5 = localTime2.toDateTimeToday(dateTimeZone4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology7);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean10 = localTime8.isSupported(durationFieldType9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime8.minus(readablePeriod11);
        org.joda.time.LocalTime localTime14 = localTime8.plusSeconds(9);
        org.joda.time.Chronology chronology15 = localTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.minuteOfHour();
        org.joda.time.DateTime dateTime17 = dateTime5.toDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField18 = chronology15.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime17", (dateTime5.compareTo(dateTime17) == 0) == dateTime5.equals(dateTime17));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfDay(5);
        org.joda.time.DateTime dateTime7 = dateTime3.withCenturyOfEra(20);
        org.joda.time.Instant instant8 = dateTime3.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime3.plusYears(35332195);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate21 = localDate16.withFieldAdded(durationFieldType19, (int) (short) 0);
        org.joda.time.LocalDate localDate23 = localDate14.withFieldAdded(durationFieldType19, 19);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(chronology24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate27 = localDate25.minus(readablePeriod26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate27.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.minus(readablePeriod30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.toDateTime(chronology34);
        org.joda.time.DateTime dateTime37 = dateTime33.withMonthOfYear(5);
        org.joda.time.DateTime.Property property38 = dateTime37.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long43 = dateTimeZone40.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str45 = dateTimeZone40.getNameKey(100L);
        org.joda.time.DateTime dateTime46 = dateTime37.withZoneRetainFields(dateTimeZone40);
        boolean boolean47 = dateTime46.isAfterNow();
        org.joda.time.DateTime dateTime48 = localDate14.toDateTime((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.LocalDate.Property property49 = localDate14.era();
        org.joda.time.LocalDate localDate51 = localDate14.minusWeeks((int) (byte) 0);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(chronology52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.LocalDate localDate55 = localDate53.minus(readablePeriod54);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = localDate55.toDateTimeAtMidnight(dateTimeZone56);
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.DateTime dateTime59 = dateTime57.plus(readableDuration58);
        org.joda.time.DateTime dateTime62 = dateTime57.withDurationAdded((long) 0, (int) (byte) 10);
        org.joda.time.DateTime dateTime63 = localDate51.toDateTime((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.DateTimeZone dateTimeZone64 = dateTime63.getZone();
        long long67 = dateTimeZone64.adjustOffset(1644572940297L, false);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate(chronology69);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalDate localDate72 = localDate70.minus(readablePeriod71);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateTime dateTime74 = localDate72.toDateTimeAtMidnight(dateTimeZone73);
        org.joda.time.Chronology chronology75 = localDate72.getChronology();
        org.joda.time.DateTimeField dateTimeField76 = chronology75.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long80 = dateTimeZone78.nextTransition((long) 4);
        org.joda.time.Chronology chronology81 = chronology75.withZone(dateTimeZone78);
        org.joda.time.DateTimeField dateTimeField82 = chronology75.secondOfMinute();
        java.util.Locale locale85 = java.util.Locale.forLanguageTag("");
        java.lang.String str86 = dateTimeField82.getAsText((int) '4', locale85);
        java.lang.String str87 = locale85.getDisplayCountry();
        java.lang.String str88 = dateTimeZone64.getShortName((long) 2922789, locale85);
        java.util.Calendar calendar89 = dateTime3.toCalendar(locale85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant8", (dateTime3.compareTo(instant8) == 0) == dateTime3.equals(instant8));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long19 = dateTimeZone16.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str21 = dateTimeZone16.getNameKey(100L);
        org.joda.time.DateTime dateTime22 = dateTime13.withZoneRetainFields(dateTimeZone16);
        boolean boolean23 = dateTime22.isAfterNow();
        org.joda.time.Instant instant24 = dateTime22.toInstant();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withPeriodAdded(readablePeriod25, 35498804);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and instant24", (dateTime27.compareTo(instant24) == 0) == dateTime27.equals(instant24));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long17 = dateTimeZone15.nextTransition((long) 4);
        org.joda.time.DateTime dateTime18 = dateTime13.withZone(dateTimeZone15);
        org.joda.time.DateTime dateTime20 = dateTime13.minusHours(0);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readablePeriod21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate26 = localDate24.minus(readablePeriod25);
        org.joda.time.LocalDate localDate28 = localDate24.plusMonths((int) (byte) 0);
        int int29 = localDate28.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property30 = localDate28.weekyear();
        org.joda.time.Chronology chronology31 = localDate28.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.millisOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime20.toMutableDateTime(chronology31);
        org.joda.time.DurationField durationField35 = chronology31.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime18", (dateTime13.compareTo(dateTime18) == 0) == dateTime13.equals(dateTime18));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate2.minus(readablePeriod3);
        org.joda.time.LocalDate localDate6 = localDate2.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate8 = localDate2.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate.Property property9 = localDate2.dayOfWeek();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.minus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.minus(readablePeriod16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime(chronology20);
        org.joda.time.DateTime dateTime23 = dateTime19.withMonthOfYear(5);
        org.joda.time.DateTime.Property property24 = dateTime23.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long29 = dateTimeZone26.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str31 = dateTimeZone26.getNameKey(100L);
        org.joda.time.DateTime dateTime32 = dateTime23.withZoneRetainFields(dateTimeZone26);
        org.joda.time.DateTime dateTime33 = localDate2.toDateTimeAtStartOfDay(dateTimeZone26);
        int int35 = dateTimeZone26.getStandardOffset((long) 5);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 22, dateTimeZone26);
        org.joda.time.YearMonthDay yearMonthDay37 = dateTime36.toYearMonthDay();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = dateTime36.withChronology(chronology38);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime36.toMutableDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar41 = dateTime36.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and mutableDateTime40", (dateTime39.compareTo(mutableDateTime40) == 0) == dateTime39.equals(mutableDateTime40));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        int int12 = dateTime9.getDayOfWeek();
        boolean boolean14 = dateTime9.isEqual((long) 0);
        org.joda.time.DateTime dateTime16 = dateTime9.withMillisOfSecond(23);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate18.minus(readablePeriod19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.minus(readablePeriod23);
        org.joda.time.DateTime dateTime26 = dateTime24.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.toDateTime(chronology27);
        org.joda.time.DateTime dateTime30 = dateTime26.withMonthOfYear(5);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long34 = dateTimeZone32.nextTransition((long) 4);
        org.joda.time.DateTime dateTime35 = dateTime30.withZone(dateTimeZone32);
        org.joda.time.DateTime dateTime37 = dateTime30.minusHours(0);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.minus(readablePeriod38);
        boolean boolean40 = dateTime16.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Chronology chronology41 = dateTime16.getChronology();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.DateTime dateTime43 = dateTime16.minus(readablePeriod42);
        org.joda.time.DateTime dateTime45 = dateTime43.plusHours(1439);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime35", (dateTime30.compareTo(dateTime35) == 0) == dateTime30.equals(dateTime35));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(86399, 1, 13);
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths(2000);
        org.joda.time.LocalDate localDate7 = localDate3.withWeekyear((-2731));
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.minus(readablePeriod10);
        org.joda.time.LocalDate localDate13 = localDate9.plusMonths((int) (byte) 0);
        int int14 = localDate13.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property15 = localDate13.weekyear();
        int int16 = localDate13.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Interval interval18 = localDate13.toInterval(dateTimeZone17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate20.minus(readablePeriod21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate22.toDateTimeAtMidnight(dateTimeZone23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.minus(readablePeriod25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.toDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = dateTime28.withMonthOfYear(5);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long36 = dateTimeZone34.nextTransition((long) 4);
        org.joda.time.DateTime dateTime37 = dateTime32.withZone(dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight38 = localDate13.toDateMidnight(dateTimeZone34);
        org.joda.time.LocalDate localDate39 = localDate7.withFields((org.joda.time.ReadablePartial) localDate13);
        int int40 = localDate13.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime37", (dateTime32.compareTo(dateTime37) == 0) == dateTime32.equals(dateTime37));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        int int2 = localDate1.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withWeekOfWeekyear((int) (short) 1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate8 = localDate6.minus(readablePeriod7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.DateTime.Property property11 = dateTime10.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate17.minus(readablePeriod18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate19.toDateTimeAtMidnight(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMillis(32772);
        org.joda.time.DateTime dateTime25 = dateTime21.withMillis((long) ' ');
        org.joda.time.DateTime dateTime27 = dateTime21.minusMillis(5);
        boolean boolean28 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime.Property property29 = dateTime27.minuteOfHour();
        org.joda.time.DateTime dateTime30 = property29.roundHalfEvenCopy();
        org.joda.time.format.DateTimePrinter dateTimePrinter31 = null;
        org.joda.time.format.DateTimeParser dateTimeParser32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter31, dateTimeParser32);
        org.joda.time.Chronology chronology34 = dateTimeFormatter33.getChronolgy();
        boolean boolean35 = dateTimeFormatter33.isParser();
        org.joda.time.Chronology chronology36 = dateTimeFormatter33.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter33.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeFormatter37.getZone();
        org.joda.time.DateTime dateTime39 = dateTime30.withZone(dateTimeZone38);
        org.joda.time.Interval interval40 = localDate4.toInterval(dateTimeZone38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime39", (dateTime10.compareTo(dateTime39) == 0) == dateTime10.equals(dateTime39));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long17 = dateTimeZone15.nextTransition((long) 4);
        org.joda.time.DateTime dateTime18 = dateTime13.withZone(dateTimeZone15);
        org.joda.time.DateTime dateTime20 = dateTime13.plus((long) (short) -1);
        int int21 = dateTime13.getCenturyOfEra();
        int int22 = dateTime13.getYearOfEra();
        org.joda.time.DateTime dateTime23 = dateTime13.toDateTime();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(chronology24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate27 = localDate25.minus(readablePeriod26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate27.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusMillis(32772);
        int int32 = dateTime31.getMillisOfSecond();
        boolean boolean33 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime13", (dateTime18.compareTo(dateTime13) == 0) == dateTime18.equals(dateTime13));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean12 = localTime10.isSupported(durationFieldType11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime10.minus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime10.plusSeconds(9);
        org.joda.time.Chronology chronology17 = localTime10.getChronology();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(chronology17);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology19);
        org.joda.time.DateTimeField dateTimeField22 = chronology19.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField24 = chronology19.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField25 = chronology19.millisOfDay();
        org.joda.time.DurationField durationField26 = chronology19.minutes();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter6.withChronology(chronology19);
        int int28 = dateTimeFormatter27.getDefaultYear();
        org.joda.time.Chronology chronology29 = dateTimeFormatter27.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.centuryOfEra();
        org.joda.time.DurationField durationField31 = chronology29.eras();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField26 and durationField31", Math.signum(durationField26.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField26)));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime20 = localTime17.toDateTimeToday(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        int int23 = dateTimeZone21.getStandardOffset((long) 70);
        org.joda.time.DateTime dateTime24 = localTime9.toDateTimeToday(dateTimeZone21);
        org.joda.time.Instant instant25 = dateTime24.toInstant();
        org.joda.time.Instant instant26 = instant25.toInstant();
        boolean boolean27 = instant25.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant25", (dateTime20.compareTo(instant25) == 0) == dateTime20.equals(instant25));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long9 = dateTimeZone6.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime4, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime4.withMillisOfDay(5);
        org.joda.time.Chronology chronology13 = localDateTime4.getChronology();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1, chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withMillisOfDay((int) (byte) 10);
        int int19 = localDateTime18.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField21 = localDateTime18.getField((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.plusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withYearOfCentury((int) (short) 0);
        long long27 = chronology13.set((org.joda.time.ReadablePartial) localDateTime25, (long) 13);
        org.joda.time.DurationField durationField28 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField29 = chronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = chronology13.centuryOfEra();
        org.joda.time.DurationField durationField31 = chronology13.eras();
        org.joda.time.DurationField durationField32 = chronology13.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField28 and durationField31", Math.signum(durationField28.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField28)));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfDay(5);
        org.joda.time.DateTime dateTime7 = dateTime3.withCenturyOfEra(20);
        org.joda.time.Instant instant8 = dateTime3.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime3.plusYears(35332195);
        org.joda.time.DateTime dateTime12 = dateTime10.minus((long) 864000000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant8", (dateTime3.compareTo(instant8) == 0) == dateTime3.equals(instant8));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long19 = dateTimeZone16.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str21 = dateTimeZone16.getNameKey(100L);
        org.joda.time.DateTime dateTime22 = dateTime13.withZoneRetainFields(dateTimeZone16);
        boolean boolean23 = dateTime22.isAfterNow();
        org.joda.time.DateTime.Property property24 = dateTime22.dayOfYear();
        org.joda.time.Instant instant25 = dateTime22.toInstant();
        org.joda.time.DateTime.Property property26 = dateTime22.dayOfYear();
        int int27 = dateTime22.getDayOfYear();
        int int28 = dateTime22.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant25", (dateTime22.compareTo(instant25) == 0) == dateTime22.equals(instant25));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime12 = dateTime9.minusYears(15);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime();
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        int int16 = dateTime14.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant15", (dateTime14.compareTo(instant15) == 0) == dateTime14.equals(instant15));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("999");
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone4 = dateTime1.getZone();
        org.joda.time.Chronology chronology5 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.dayOfMonth();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.minus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readablePeriod15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime(chronology19);
        org.joda.time.DateTime dateTime22 = dateTime20.withWeekOfWeekyear((int) '4');
        org.joda.time.Chronology chronology23 = dateTime20.getChronology();
        org.joda.time.DateTime.Property property24 = dateTime20.era();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime27 = dateTime20.withPeriodAdded(readablePeriod25, 35373897);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfEra(625);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime31 = dateTime27.minus(readablePeriod30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate35 = localDate33.minus(readablePeriod34);
        org.joda.time.LocalDate localDate37 = localDate33.plusMonths((int) (byte) 0);
        int int38 = localDate37.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property39 = localDate37.weekyear();
        org.joda.time.LocalDate localDate41 = property39.addToCopy((int) (byte) -1);
        org.joda.time.Chronology chronology42 = localDate41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime31.toMutableDateTime(chronology42);
        org.joda.time.DateTime dateTime45 = dateTime8.withChronology(chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime44", (dateTime18.compareTo(mutableDateTime44) == 0) == dateTime18.equals(mutableDateTime44));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("130");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime4.minus(readablePeriod7);
        org.joda.time.LocalTime localTime10 = localTime4.plusSeconds(9);
        org.joda.time.Chronology chronology11 = localTime4.getChronology();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.centuryOfEra();
        org.joda.time.DateTime dateTime14 = dateTime1.withChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField15 = chronology11.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime14", (dateTime1.compareTo(dateTime14) == 0) == dateTime1.equals(dateTime14));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology7);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean10 = localTime8.isSupported(durationFieldType9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime8.minus(readablePeriod11);
        org.joda.time.LocalTime localTime14 = localTime8.plusSeconds(9);
        org.joda.time.Chronology chronology15 = localTime8.getChronology();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology15.add(readablePeriod16, (-2L), 1);
        long long23 = chronology15.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.Chronology chronology24 = chronology15.withUTC();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (-292275054), chronology15);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str29 = dateTimeZone27.getShortName((long) 10);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.Chronology chronology31 = chronology15.withZone(dateTimeZone27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter2.withZone(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeFormatter2.getZone();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology35);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean38 = localTime36.isSupported(durationFieldType37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalTime localTime40 = localTime36.minus(readablePeriod39);
        org.joda.time.LocalTime localTime42 = localTime36.plusSeconds(9);
        org.joda.time.Chronology chronology43 = localTime36.getChronology();
        org.joda.time.Chronology chronology44 = chronology43.withUTC();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(chronology44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        long long49 = chronology44.add(readablePeriod46, (long) (byte) 0, 24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter2.withChronology(chronology44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime45", (dateTime30.compareTo(dateTime45) == 0) == dateTime30.equals(dateTime45));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.DateTime.Property property12 = dateTime9.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.minus(readablePeriod13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate16.minus(readablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readablePeriod21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime24.withMonthOfYear(5);
        org.joda.time.DateTime.Property property29 = dateTime28.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long34 = dateTimeZone31.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str36 = dateTimeZone31.getNameKey(100L);
        org.joda.time.DateTime dateTime37 = dateTime28.withZoneRetainFields(dateTimeZone31);
        boolean boolean38 = dateTime37.isAfterNow();
        org.joda.time.DateTime.Property property39 = dateTime37.dayOfYear();
        java.lang.String str40 = property39.getAsString();
        org.joda.time.DateTime dateTime41 = property39.withMaximumValue();
        org.joda.time.DateTime dateTime42 = property39.getDateTime();
        int int43 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate50 = localDate45.withFieldAdded(durationFieldType48, (int) (short) 0);
        org.joda.time.LocalDate.Property property51 = localDate45.year();
        org.joda.time.LocalDate localDate53 = property51.setCopy("32770");
        org.joda.time.LocalDate localDate54 = property51.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDate localDate56 = localDate54.plus(readablePeriod55);
        org.joda.time.Chronology chronology57 = localDate54.getChronology();
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime42.toMutableDateTime(chronology57);
        org.joda.time.DateTimeField dateTimeField59 = chronology57.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and mutableDateTime58", (dateTime37.compareTo(mutableDateTime58) == 0) == dateTime37.equals(mutableDateTime58));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate2.plus(readablePeriod3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology6 = null;
        boolean boolean7 = dateTimeFieldType5.isSupported(chronology6);
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.minus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMillis(32772);
        org.joda.time.DateTime dateTime18 = dateTime14.withMillis((long) ' ');
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate20.plus(readablePeriod21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology24 = null;
        boolean boolean25 = dateTimeFieldType23.isSupported(chronology24);
        boolean boolean26 = localDate22.isSupported(dateTimeFieldType23);
        int int27 = dateTime18.get(dateTimeFieldType23);
        boolean boolean28 = localDate4.isSupported(dateTimeFieldType23);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDate30.toDateTimeAtMidnight(dateTimeZone31);
        boolean boolean33 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate30);
        org.joda.time.LocalDate localDate35 = localDate30.minusMonths(32770);
        org.joda.time.LocalTime localTime36 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long42 = dateTimeZone39.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str44 = dateTimeZone39.getNameKey(100L);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 10, dateTimeZone39);
        org.joda.time.DateTime dateTime46 = localDate35.toDateTime(localTime36, dateTimeZone39);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(1644572942500L, dateTimeZone39);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(chronology48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDate localDate51 = localDate49.minus(readablePeriod50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localDate51.toDateTimeAtMidnight(dateTimeZone52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.DateTime dateTime55 = dateTime53.minus(readablePeriod54);
        org.joda.time.DateMidnight dateMidnight56 = dateTime55.toDateMidnight();
        org.joda.time.DateTime dateTime57 = dateTime55.withEarlierOffsetAtOverlap();
        long long58 = dateTime57.getMillis();
        org.joda.time.DateTime dateTime60 = dateTime57.withDayOfMonth(2);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.DateTime dateTime62 = dateTime57.plus(readableDuration61);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean64 = dateTime62.isSupported(dateTimeFieldType63);
        org.joda.time.Chronology chronology65 = dateTime62.getChronology();
        org.joda.time.DateTime dateTime66 = org.joda.time.DateTime.now(chronology65);
        org.joda.time.DateTime dateTime67 = dateTime47.withChronology(chronology65);
        org.joda.time.DateTime dateTime68 = org.joda.time.DateTime.now(chronology65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and dateTime67", (dateTime47.compareTo(dateTime67) == 0) == dateTime47.equals(dateTime67));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate1.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate.Property property8 = localDate1.dayOfWeek();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.minus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readablePeriod15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime(chronology19);
        org.joda.time.DateTime dateTime22 = dateTime18.withMonthOfYear(5);
        org.joda.time.DateTime.Property property23 = dateTime22.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long28 = dateTimeZone25.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str30 = dateTimeZone25.getNameKey(100L);
        org.joda.time.DateTime dateTime31 = dateTime22.withZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTime dateTime32 = localDate1.toDateTimeAtStartOfDay(dateTimeZone25);
        org.joda.time.LocalDate.Property property33 = localDate1.year();
        org.joda.time.LocalDate localDate34 = property33.roundCeilingCopy();
        org.joda.time.DateTime dateTime35 = localDate34.toDateTimeAtStartOfDay();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDate localDate39 = localDate37.minus(readablePeriod38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = localDate39.toDateTimeAtMidnight(dateTimeZone40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.DateTime dateTime43 = dateTime41.minus(readablePeriod42);
        org.joda.time.DateTime dateTime45 = dateTime43.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.toDateTime(chronology46);
        org.joda.time.DateTime dateTime49 = dateTime45.withMonthOfYear(5);
        org.joda.time.DateTime.Property property50 = dateTime49.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long55 = dateTimeZone52.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str57 = dateTimeZone52.getNameKey(100L);
        org.joda.time.DateTime dateTime58 = dateTime49.withZoneRetainFields(dateTimeZone52);
        java.util.TimeZone timeZone59 = dateTimeZone52.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime35.toMutableDateTime(dateTimeZone52);
        org.joda.time.Chronology chronology61 = mutableDateTime60.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone66 = dateTimeZone65.toTimeZone();
        java.util.Locale locale68 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str69 = locale68.getDisplayScript();
        java.lang.String str70 = dateTimeZone65.getShortName((long) (byte) 100, locale68);
        java.lang.String str71 = locale68.getScript();
        java.lang.String str72 = locale68.getVariant();
        java.lang.String str73 = dateTimeField62.getAsText(3155881930724L, locale68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and mutableDateTime60", (dateTime35.compareTo(mutableDateTime60) == 0) == dateTime35.equals(mutableDateTime60));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate6 = localDate1.withFieldAdded(durationFieldType4, (int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate1.year();
        org.joda.time.LocalDate localDate9 = property7.setCopy("32770");
        org.joda.time.LocalDate localDate10 = property7.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.plus(readablePeriod11);
        org.joda.time.LocalDate.Property property13 = localDate10.weekyear();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withMillisOfDay(5);
        org.joda.time.DateTime dateTime21 = dateTime19.plusDays(1);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(chronology22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDate localDate25 = localDate23.minus(readablePeriod24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate25.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.minus(readablePeriod28);
        org.joda.time.DateTime.Property property30 = dateTime29.year();
        org.joda.time.DurationField durationField31 = property30.getDurationField();
        org.joda.time.DateTime dateTime33 = property30.setCopy(14);
        org.joda.time.DateTime dateTime35 = dateTime33.withYearOfEra(19);
        boolean boolean36 = dateTime19.isEqual((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime37 = localDate10.toDateTime((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime39 = dateTime19.plusMillis(1999);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(chronology41);
        int int43 = localDate42.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime44 = localDate42.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate(chronology45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDate localDate48 = localDate46.minus(readablePeriod47);
        org.joda.time.LocalDate localDate50 = localDate46.plusMonths((int) (byte) 0);
        int int51 = localDate50.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property52 = localDate50.weekyear();
        org.joda.time.LocalDate localDate53 = property52.withMaximumValue();
        org.joda.time.LocalDate.Property property54 = localDate53.year();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long59 = dateTimeZone56.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate(dateTimeZone56);
        int int62 = dateTimeZone56.getOffset((long) '#');
        org.joda.time.DateTime dateTime63 = localDate53.toDateTimeAtMidnight(dateTimeZone56);
        org.joda.time.Interval interval64 = localDate42.toInterval(dateTimeZone56);
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) 32010, dateTimeZone56);
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime19.toMutableDateTime(dateTimeZone56);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate(chronology67);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalDate localDate70 = localDate68.minus(readablePeriod69);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = localDate70.toDateTimeAtMidnight(dateTimeZone71);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.DateTime dateTime74 = dateTime72.minus(readablePeriod73);
        org.joda.time.DateTime dateTime76 = dateTime74.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.DateTime dateTime78 = dateTime76.toDateTime(chronology77);
        org.joda.time.DateTime dateTime80 = dateTime76.withMonthOfYear(5);
        org.joda.time.DateTime.Property property81 = dateTime80.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long86 = dateTimeZone83.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str88 = dateTimeZone83.getNameKey(100L);
        org.joda.time.DateTime dateTime89 = dateTime80.withZoneRetainFields(dateTimeZone83);
        long long93 = dateTimeZone83.convertLocalToUTC((long) 32, false, (long) (-4));
        org.joda.time.LocalDate localDate94 = new org.joda.time.LocalDate(dateTimeZone83);
        long long96 = dateTimeZone56.getMillisKeepLocal(dateTimeZone83, (long) 32769);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and mutableDateTime66", (dateTime19.compareTo(mutableDateTime66) == 0) == dateTime19.equals(mutableDateTime66));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate2.minus(readablePeriod3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtMidnight(dateTimeZone5);
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusWeeks((int) (byte) 100);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate13.minus(readablePeriod14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localDate15.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMillis(32772);
        org.joda.time.DateTime dateTime21 = dateTime17.withMillis((long) ' ');
        org.joda.time.DateTime dateTime23 = dateTime17.minusMillis(5);
        boolean boolean24 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime.Property property25 = dateTime23.minuteOfHour();
        org.joda.time.DateTime dateTime26 = property25.roundHalfEvenCopy();
        org.joda.time.format.DateTimePrinter dateTimePrinter27 = null;
        org.joda.time.format.DateTimeParser dateTimeParser28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter27, dateTimeParser28);
        org.joda.time.Chronology chronology30 = dateTimeFormatter29.getChronolgy();
        boolean boolean31 = dateTimeFormatter29.isParser();
        org.joda.time.Chronology chronology32 = dateTimeFormatter29.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter29.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeFormatter33.getZone();
        org.joda.time.DateTime dateTime35 = dateTime26.withZone(dateTimeZone34);
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(1644573026000L, dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime35", (dateTime6.compareTo(dateTime35) == 0) == dateTime6.equals(dateTime35));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate16.minus(readablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readablePeriod21);
        org.joda.time.DateMidnight dateMidnight23 = dateTime22.toDateMidnight();
        org.joda.time.DateTime dateTime24 = dateTime22.withEarlierOffsetAtOverlap();
        int int25 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime.Property property26 = dateTime13.dayOfYear();
        int int27 = dateTime13.getMinuteOfHour();
        org.joda.time.DateTime dateTime29 = dateTime13.withCenturyOfEra(11);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime29.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property31 = dateTime29.hourOfDay();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate35 = localDate33.plus(readablePeriod34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localDate37.toDateTimeAtMidnight(dateTimeZone38);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate42 = localDate37.withFieldAdded(durationFieldType40, (int) (short) 0);
        org.joda.time.LocalDate localDate44 = localDate35.withFieldAdded(durationFieldType40, 19);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate(chronology45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDate localDate48 = localDate46.minus(readablePeriod47);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = localDate48.toDateTimeAtMidnight(dateTimeZone49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.DateTime dateTime52 = dateTime50.minus(readablePeriod51);
        org.joda.time.DateTime dateTime54 = dateTime52.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = dateTime54.toDateTime(chronology55);
        org.joda.time.DateTime dateTime58 = dateTime54.withMonthOfYear(5);
        org.joda.time.DateTime.Property property59 = dateTime58.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long64 = dateTimeZone61.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str66 = dateTimeZone61.getNameKey(100L);
        org.joda.time.DateTime dateTime67 = dateTime58.withZoneRetainFields(dateTimeZone61);
        boolean boolean68 = dateTime67.isAfterNow();
        org.joda.time.DateTime dateTime69 = localDate35.toDateTime((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        org.joda.time.DateTime dateTime71 = dateTime69.minus(readablePeriod70);
        org.joda.time.Instant instant72 = dateTime69.toInstant();
        boolean boolean73 = dateTime29.isEqual((org.joda.time.ReadableInstant) dateTime69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime69 and instant72", (dateTime69.compareTo(instant72) == 0) == dateTime69.equals(instant72));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.DateTime.Property property12 = dateTime9.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.minus(readablePeriod13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate16.minus(readablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readablePeriod21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime24.withMonthOfYear(5);
        org.joda.time.DateTime.Property property29 = dateTime28.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long34 = dateTimeZone31.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str36 = dateTimeZone31.getNameKey(100L);
        org.joda.time.DateTime dateTime37 = dateTime28.withZoneRetainFields(dateTimeZone31);
        boolean boolean38 = dateTime37.isAfterNow();
        org.joda.time.DateTime.Property property39 = dateTime37.dayOfYear();
        java.lang.String str40 = property39.getAsString();
        org.joda.time.DateTime dateTime41 = property39.withMaximumValue();
        org.joda.time.DateTime dateTime42 = property39.getDateTime();
        int int43 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate50 = localDate45.withFieldAdded(durationFieldType48, (int) (short) 0);
        org.joda.time.LocalDate.Property property51 = localDate45.year();
        org.joda.time.LocalDate localDate53 = property51.setCopy("32770");
        org.joda.time.LocalDate localDate54 = property51.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDate localDate56 = localDate54.plus(readablePeriod55);
        org.joda.time.Chronology chronology57 = localDate54.getChronology();
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime42.toMutableDateTime(chronology57);
        org.joda.time.TimeOfDay timeOfDay59 = dateTime42.toTimeOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and mutableDateTime58", (dateTime42.compareTo(mutableDateTime58) == 0) == dateTime42.equals(mutableDateTime58));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology11 = null;
        boolean boolean12 = dateTimeFieldType10.isSupported(chronology11);
        org.joda.time.Chronology chronology13 = null;
        boolean boolean14 = dateTimeFieldType10.isSupported(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime17 = dateTime9.plusHours(0);
        org.joda.time.Instant instant18 = dateTime17.toInstant();
        org.joda.time.DateTime dateTime20 = dateTime17.withYearOfCentury(93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant18", (dateTime17.compareTo(instant18) == 0) == dateTime17.equals(instant18));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("130");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime4.minus(readablePeriod7);
        org.joda.time.LocalTime localTime10 = localTime4.plusSeconds(9);
        org.joda.time.Chronology chronology11 = localTime4.getChronology();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.centuryOfEra();
        org.joda.time.DateTime dateTime14 = dateTime1.withChronology(chronology11);
        org.joda.time.DateTime dateTime16 = dateTime14.minusYears(6899);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withMillisOfDay(5);
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfWeek();
        org.joda.time.DateTime dateTime24 = property23.roundCeilingCopy();
        org.joda.time.DateTime.Property property25 = dateTime24.centuryOfEra();
        org.joda.time.DateTime dateTime26 = property25.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime26.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime16.toMutableDateTime(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime14", (dateTime1.compareTo(dateTime14) == 0) == dateTime1.equals(dateTime14));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DurationField durationField6 = durationFieldType3.getField(chronology5);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean13 = localTime11.isSupported(durationFieldType12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime11.minus(readablePeriod14);
        org.joda.time.LocalTime localTime17 = localTime11.plusSeconds(9);
        org.joda.time.Chronology chronology18 = localTime11.getChronology();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology18.add(readablePeriod19, (-2L), 1);
        long long26 = chronology18.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology18);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) 9, chronology18);
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) 32770, chronology29);
        org.joda.time.DurationField durationField31 = durationFieldType3.getField(chronology29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology33);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean36 = localTime34.isSupported(durationFieldType35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalTime localTime38 = localTime34.minus(readablePeriod37);
        org.joda.time.LocalTime localTime40 = localTime34.plusSeconds(9);
        org.joda.time.Chronology chronology41 = localTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.hourOfDay();
        org.joda.time.DurationField durationField44 = chronology41.weeks();
        org.joda.time.DateTimeField dateTimeField45 = chronology41.millisOfDay();
        boolean boolean46 = durationFieldType3.isSupported(chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField31", (durationField6.compareTo(durationField31) == 0) == durationField6.equals(durationField31));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withMillisOfDay(5);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfWeek();
        boolean boolean17 = dateTime5.equals((java.lang.Object) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime15.plus((long) 22);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.withPeriodAdded(readablePeriod20, 35405662);
        int int23 = dateTime22.getMillisOfDay();
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        org.joda.time.Chronology chronology27 = dateTimeFormatter26.getChronolgy();
        boolean boolean28 = dateTimeFormatter26.isParser();
        org.joda.time.Chronology chronology29 = dateTimeFormatter26.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter26.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter26.withZoneUTC();
        boolean boolean32 = dateTimeFormatter26.isParser();
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(locale33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localDate36.toDateTimeAtMidnight(dateTimeZone37);
        java.util.Date date39 = localDate36.toDate();
        calendar34.setTime(date39);
        java.util.TimeZone timeZone41 = calendar34.getTimeZone();
        calendar34.clear();
        calendar34.clear();
        java.util.TimeZone timeZone44 = java.util.TimeZone.getDefault();
        java.lang.String str45 = timeZone44.getID();
        int int46 = timeZone44.getRawOffset();
        boolean boolean47 = timeZone44.observesDaylightTime();
        calendar34.setTimeZone(timeZone44);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        boolean boolean50 = calendar34.before((java.lang.Object) dateTimeZone49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter26.withZone(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime22.withZone(dateTimeZone49);
        org.joda.time.DateTime.Property property53 = dateTime22.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime52", (dateTime22.compareTo(dateTime52) == 0) == dateTime22.equals(dateTime52));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis(35332195);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        int int12 = dateTimeZone9.getStandardOffset((long) (short) 0);
        long long14 = dateTimeZone9.previousTransition((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime7.toMutableDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime17 = dateTime7.plusYears(21);
        boolean boolean19 = dateTime17.isAfter(1644538739194L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime15", (dateTime7.compareTo(mutableDateTime15) == 0) == dateTime7.equals(mutableDateTime15));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate16.minus(readablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readablePeriod21);
        org.joda.time.DateMidnight dateMidnight23 = dateTime22.toDateMidnight();
        org.joda.time.DateTime dateTime24 = dateTime22.withEarlierOffsetAtOverlap();
        int int25 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(chronology27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDate localDate30 = localDate28.minus(readablePeriod29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDate30.toDateTimeAtMidnight(dateTimeZone31);
        org.joda.time.Chronology chronology33 = localDate30.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone35 = chronology33.getZone();
        org.joda.time.DateTime dateTime36 = dateTime13.withZone(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 28);
        boolean boolean39 = dateTimeZone35.isLocalDateTimeGap(localDateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime36", (dateTime13.compareTo(dateTime36) == 0) == dateTime13.equals(dateTime36));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate16.minus(readablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readablePeriod21);
        org.joda.time.DateMidnight dateMidnight23 = dateTime22.toDateMidnight();
        org.joda.time.DateTime dateTime24 = dateTime22.withEarlierOffsetAtOverlap();
        int int25 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(chronology27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDate localDate30 = localDate28.minus(readablePeriod29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDate30.toDateTimeAtMidnight(dateTimeZone31);
        org.joda.time.Chronology chronology33 = localDate30.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone35 = chronology33.getZone();
        org.joda.time.DateTime dateTime36 = dateTime13.withZone(dateTimeZone35);
        long long38 = dateTimeZone35.convertUTCToLocal(82800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime36", (dateTime13.compareTo(dateTime36) == 0) == dateTime13.equals(dateTime36));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long9 = dateTimeZone6.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime4, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime4.withMillisOfDay(5);
        org.joda.time.Chronology chronology13 = localDateTime4.getChronology();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1, chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withMillisOfDay((int) (byte) 10);
        int int19 = localDateTime18.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField21 = localDateTime18.getField((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.plusHours((int) '4');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withYearOfCentury((int) (short) 0);
        long long27 = chronology13.set((org.joda.time.ReadablePartial) localDateTime25, (long) 13);
        org.joda.time.DurationField durationField28 = chronology13.years();
        org.joda.time.DateTimeField dateTimeField29 = chronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = chronology13.centuryOfEra();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime.Property property32 = dateTime31.era();
        org.joda.time.DurationField durationField33 = property32.getDurationField();
        org.joda.time.DateTime dateTime34 = property32.getDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField28 and durationField33", Math.signum(durationField28.compareTo(durationField33)) == -Math.signum(durationField33.compareTo(durationField28)));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime13 = dateTime9.withDurationAdded((long) (short) 100, 35332195);
        java.util.GregorianCalendar gregorianCalendar14 = dateTime9.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone17);
        calendar18.setMinimalDaysInFirstWeek(22);
        calendar18.setMinimalDaysInFirstWeek((int) 'a');
        calendar18.set(4, (-292275054), 59, 53, (-2731), 8);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate31.toDateTimeAtMidnight(dateTimeZone32);
        java.util.Date date34 = localDate31.toDate();
        date34.setDate(0);
        int int37 = date34.getMonth();
        date34.setDate((int) (byte) -1);
        java.lang.String str40 = date34.toLocaleString();
        calendar18.setTime(date34);
        gregorianCalendar14.setTime(date34);
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.fromDateFields(date34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar14 and calendar18", (gregorianCalendar14.compareTo(calendar18) == 0) == gregorianCalendar14.equals(calendar18));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime5 = localTime2.toDateTimeToday(dateTimeZone4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology7);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean10 = localTime8.isSupported(durationFieldType9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime8.minus(readablePeriod11);
        org.joda.time.LocalTime localTime14 = localTime8.plusSeconds(9);
        org.joda.time.Chronology chronology15 = localTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.minuteOfHour();
        org.joda.time.DateTime dateTime17 = dateTime5.toDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField18 = chronology15.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime17", (dateTime5.compareTo(dateTime17) == 0) == dateTime5.equals(dateTime17));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withMillisOfDay(5);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfWeek();
        boolean boolean17 = dateTime5.equals((java.lang.Object) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime15.plus((long) 22);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.withPeriodAdded(readablePeriod20, 35405662);
        int int23 = dateTime22.getMillisOfDay();
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        org.joda.time.Chronology chronology27 = dateTimeFormatter26.getChronolgy();
        boolean boolean28 = dateTimeFormatter26.isParser();
        org.joda.time.Chronology chronology29 = dateTimeFormatter26.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter26.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter26.withZoneUTC();
        boolean boolean32 = dateTimeFormatter26.isParser();
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(locale33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localDate36.toDateTimeAtMidnight(dateTimeZone37);
        java.util.Date date39 = localDate36.toDate();
        calendar34.setTime(date39);
        java.util.TimeZone timeZone41 = calendar34.getTimeZone();
        calendar34.clear();
        calendar34.clear();
        java.util.TimeZone timeZone44 = java.util.TimeZone.getDefault();
        java.lang.String str45 = timeZone44.getID();
        int int46 = timeZone44.getRawOffset();
        boolean boolean47 = timeZone44.observesDaylightTime();
        calendar34.setTimeZone(timeZone44);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        boolean boolean50 = calendar34.before((java.lang.Object) dateTimeZone49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter26.withZone(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime22.withZone(dateTimeZone49);
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime52", (dateTime19.compareTo(dateTime52) == 0) == dateTime19.equals(dateTime52));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology12);
        org.joda.time.DurationField durationField15 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.Chronology chronology19 = chronology12.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField20 = chronology19.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField20, and durationField15", !(durationField15.compareTo(durationField20) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField20.compareTo(durationField15))));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        java.lang.String str9 = property8.getAsString();
        java.lang.String str10 = property8.toString();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMillis(32772);
        org.joda.time.DateTime dateTime20 = dateTime16.withMillis((long) ' ');
        org.joda.time.DateTime dateTime22 = dateTime16.minusMillis(5);
        int int23 = dateTime16.getDayOfMonth();
        int int24 = property8.getDifference((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime26 = dateTime16.plusMonths(1970);
        org.joda.time.DateTime dateTime27 = dateTime16.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime29 = dateTime27.withCenturyOfEra(11);
        org.joda.time.DateTime dateTime31 = dateTime27.plusMinutes(32772);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 5);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        long long39 = dateTimeZone34.convertLocalToUTC(1644572942340L, false, (long) 990);
        int int41 = dateTimeZone34.getOffset(0L);
        org.joda.time.DateTime dateTime42 = dateTime31.withZone(dateTimeZone34);
        org.joda.time.DateTime dateTime44 = dateTime42.withMillis((-62161135848684L));
        org.joda.time.DateTime.Property property45 = dateTime42.yearOfCentury();
        org.joda.time.DateTime dateTime46 = property45.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime42", (dateTime31.compareTo(dateTime42) == 0) == dateTime31.equals(dateTime42));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plus((-25L));
        org.joda.time.DateTime dateTime9 = dateTime3.withMillisOfDay(2022);
        org.joda.time.DateTime dateTime11 = dateTime9.plusDays(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime.Property property13 = dateTime11.property(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime11.minusDays(79200000);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 5);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = dateTime15.toDateTime(dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight21 = dateTime15.toDateMidnight();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate23.toDateTimeAtMidnight(dateTimeZone24);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate28 = localDate23.withFieldAdded(durationFieldType26, (int) (short) 0);
        int int29 = localDate23.getDayOfMonth();
        org.joda.time.LocalDate localDate31 = localDate23.minusYears(11);
        org.joda.time.LocalDate.Property property32 = localDate23.year();
        org.joda.time.LocalDate.Property property33 = localDate23.dayOfWeek();
        org.joda.time.LocalDate localDate34 = property33.roundCeilingCopy();
        org.joda.time.LocalDate localDate35 = property33.roundHalfEvenCopy();
        int int36 = localDate35.getCenturyOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getRangeDurationType();
        int int39 = localDate35.get(dateTimeFieldType37);
        int int40 = dateMidnight21.get(dateTimeFieldType37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime20", (dateTime15.compareTo(dateTime20) == 0) == dateTime15.equals(dateTime20));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtMidnight(dateTimeZone3);
        java.util.Date date5 = localDate2.toDate();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate7.minus(readablePeriod8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.minus(readablePeriod12);
        org.joda.time.DateTime.Property property14 = dateTime13.year();
        java.lang.String str15 = property14.getAsString();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        int int18 = localDate17.getWeekOfWeekyear();
        int int19 = property14.compareTo((org.joda.time.ReadablePartial) localDate17);
        int int20 = localDate17.getEra();
        org.joda.time.LocalDate.Property property21 = localDate17.dayOfMonth();
        java.util.Date date22 = localDate17.toDate();
        boolean boolean23 = date5.before(date22);
        java.util.Calendar.Builder builder24 = builder0.setInstant(date5);
        java.util.Calendar.Builder builder26 = builder0.setLenient(true);
        java.util.Calendar.Builder builder28 = builder26.setLenient(true);
        java.util.Locale locale29 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str31 = locale29.getExtension('a');
        java.util.Set<java.lang.String> strSet32 = locale29.getUnicodeLocaleAttributes();
        java.util.Calendar.Builder builder33 = builder26.setLocale(locale29);
        java.util.Locale.Category category34 = java.util.Locale.Category.FORMAT;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDate localDate38 = localDate36.minus(readablePeriod37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = localDate38.toDateTimeAtMidnight(dateTimeZone39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.DateTime dateTime42 = dateTime40.minus(readablePeriod41);
        org.joda.time.DateTime.Property property43 = dateTime42.year();
        java.util.Locale locale44 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str45 = property43.getAsShortText(locale44);
        java.lang.String str46 = locale44.getVariant();
        java.util.Locale.setDefault(category34, locale44);
        java.util.Locale locale48 = java.util.Locale.getDefault(category34);
        java.lang.String str49 = locale48.getDisplayLanguage();
        java.util.Calendar.Builder builder50 = builder33.setLocale(locale48);
        java.util.Calendar calendar51 = builder33.build();
        java.util.TimeZone timeZone52 = java.util.TimeZone.getDefault();
        java.lang.String str53 = timeZone52.getID();
        int int55 = timeZone52.getOffset((-2104009200000L));
        java.util.Locale locale56 = java.util.Locale.FRANCE;
        java.util.Calendar calendar57 = java.util.Calendar.getInstance(locale56);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate(chronology58);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTime dateTime61 = localDate59.toDateTimeAtMidnight(dateTimeZone60);
        java.util.Date date62 = localDate59.toDate();
        calendar57.setTime(date62);
        java.util.TimeZone timeZone64 = calendar57.getTimeZone();
        boolean boolean65 = timeZone52.hasSameRules(timeZone64);
        java.lang.String str66 = timeZone64.getID();
        calendar51.setTimeZone(timeZone64);
        timeZone64.setID("11.02.2022 09:49:24");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar51 and calendar57", (calendar51.compareTo(calendar57) == 0) == calendar51.equals(calendar57));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.plus(readableDuration6);
        org.joda.time.DateTime dateTime10 = dateTime5.withDurationAdded((long) 0, (int) (byte) 10);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        org.joda.time.DateTime.Property property19 = dateTime18.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology21 = null;
        boolean boolean22 = dateTimeFieldType20.isSupported(chronology21);
        int int23 = dateTime18.get(dateTimeFieldType20);
        boolean boolean24 = dateTime5.isSupported(dateTimeFieldType20);
        org.joda.time.Instant instant25 = dateTime5.toInstant();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime5.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant25", (dateTime5.compareTo(instant25) == 0) == dateTime5.equals(instant25));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.Chronology chronology10 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.era();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean16 = localTime14.isSupported(durationFieldType15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime18 = localTime14.minus(readablePeriod17);
        int[] intArray20 = chronology10.get((org.joda.time.ReadablePartial) localTime14, 1L);
        org.joda.time.DurationField durationField21 = chronology10.hours();
        org.joda.time.DurationField durationField22 = chronology10.months();
        org.joda.time.DurationField durationField23 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField21, and durationField22", !(durationField23.compareTo(durationField21) == 0) || (Math.signum(durationField23.compareTo(durationField22)) == Math.signum(durationField21.compareTo(durationField22))));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime11 = dateTime7.withCenturyOfEra((int) (byte) 0);
        java.util.Date date12 = dateTime11.toDate();
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate15.minus(readablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate17.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusMillis(32772);
        org.joda.time.DateTime dateTime23 = dateTime19.withMillis((long) ' ');
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfMonth();
        org.joda.time.DateTime dateTime27 = dateTime23.withDurationAdded((long) (short) 100, 35332195);
        org.joda.time.DateTime dateTime29 = dateTime27.plusWeeks(32);
        int int30 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime27);
        int int31 = dateTime27.getMinuteOfDay();
        org.joda.time.DateTime dateTime33 = dateTime27.minusSeconds(53);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance();
        java.util.Date date35 = calendar34.getTime();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDate localDate39 = localDate37.minus(readablePeriod38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = localDate39.toDateTimeAtMidnight(dateTimeZone40);
        org.joda.time.Chronology chronology42 = localDate39.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long47 = dateTimeZone45.nextTransition((long) 4);
        org.joda.time.Chronology chronology48 = chronology42.withZone(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField49 = chronology42.secondOfMinute();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate(chronology50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalDate localDate53 = localDate51.minus(readablePeriod52);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = localDate53.toDateTimeAtMidnight(dateTimeZone54);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.DateTime dateTime57 = dateTime55.minus(readablePeriod56);
        org.joda.time.DateTime dateTime59 = dateTime57.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTime dateTime61 = dateTime59.toDateTime(chronology60);
        int int62 = dateTime59.getDayOfWeek();
        boolean boolean64 = dateTime59.isEqual((long) 0);
        org.joda.time.DateTime dateTime66 = dateTime59.withMillisOfSecond(23);
        org.joda.time.DateTimeZone dateTimeZone67 = dateTime59.getZone();
        org.joda.time.Chronology chronology68 = chronology42.withZone(dateTimeZone67);
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate((java.lang.Object) calendar34, chronology42);
        org.joda.time.DateTime dateTime70 = dateTime27.toDateTime(chronology42);
        org.joda.time.DurationField durationField71 = chronology42.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime70", (dateTime27.compareTo(dateTime70) == 0) == dateTime27.equals(dateTime70));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology11 = null;
        boolean boolean12 = dateTimeFieldType10.isSupported(chronology11);
        org.joda.time.Chronology chronology13 = null;
        boolean boolean14 = dateTimeFieldType10.isSupported(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DateTime dateTime17 = dateTime9.plusHours(0);
        org.joda.time.Instant instant18 = dateTime17.toInstant();
        java.util.Date date19 = dateTime17.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant18", (dateTime17.compareTo(instant18) == 0) == dateTime17.equals(instant18));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtMidnight(dateTimeZone3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate7 = localDate2.withFieldAdded(durationFieldType5, (int) (short) 0);
        org.joda.time.LocalDate.Property property8 = localDate2.year();
        org.joda.time.LocalDate localDate9 = property8.roundHalfEvenCopy();
        org.joda.time.LocalDate.Property property10 = localDate9.weekOfWeekyear();
        org.joda.time.LocalDate.Property property11 = localDate9.monthOfYear();
        org.joda.time.LocalDate localDate12 = property11.roundCeilingCopy();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        int int15 = localDate14.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate18.minus(readablePeriod19);
        org.joda.time.LocalDate localDate22 = localDate18.plusMonths((int) (byte) 0);
        int int23 = localDate22.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property24 = localDate22.weekyear();
        org.joda.time.LocalDate localDate25 = property24.withMaximumValue();
        org.joda.time.LocalDate.Property property26 = localDate25.year();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long31 = dateTimeZone28.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(dateTimeZone28);
        int int34 = dateTimeZone28.getOffset((long) '#');
        org.joda.time.DateTime dateTime35 = localDate25.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.Interval interval36 = localDate14.toInterval(dateTimeZone28);
        java.lang.String str37 = dateTimeZone28.toString();
        org.joda.time.DateTime dateTime38 = localDate12.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((-62135596800000L), dateTimeZone28);
        java.util.TimeZone timeZone40 = dateTimeZone28.toTimeZone();
        org.joda.time.LocalDate localDate41 = org.joda.time.LocalDate.now(dateTimeZone28);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(chronology42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDate43.toDateTimeAtMidnight(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.withMillisOfDay(5);
        org.joda.time.DateTime.Property property48 = dateTime47.dayOfWeek();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(chronology49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDate localDate52 = localDate50.minus(readablePeriod51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = localDate52.toDateTimeAtMidnight(dateTimeZone53);
        org.joda.time.DateTime.Property property55 = dateTime54.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.DateTime dateTime57 = dateTime54.plus(readableDuration56);
        org.joda.time.DateMidnight dateMidnight58 = dateTime54.toDateMidnight();
        int int59 = property48.compareTo((org.joda.time.ReadableInstant) dateMidnight58);
        org.joda.time.DateTimeZone dateTimeZone60 = dateMidnight58.getZone();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate(chronology61);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalDate localDate64 = localDate62.minus(readablePeriod63);
        org.joda.time.LocalDate localDate66 = localDate62.plusMonths((int) (byte) 0);
        int int67 = localDate66.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property68 = localDate66.weekyear();
        org.joda.time.LocalDate localDate70 = property68.addToCopy((int) (byte) -1);
        org.joda.time.Chronology chronology71 = localDate70.getChronology();
        org.joda.time.DateTimeZone dateTimeZone72 = chronology71.getZone();
        int int74 = dateTimeZone72.getOffsetFromLocal((long) (-2731));
        org.joda.time.DateTime dateTime75 = org.joda.time.DateTime.now(dateTimeZone72);
        long long77 = dateTimeZone60.getMillisKeepLocal(dateTimeZone72, 0L);
        long long79 = dateTimeZone28.getMillisKeepLocal(dateTimeZone72, (-137249135L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime75", (dateTime16.compareTo(dateTime75) == 0) == dateTime16.equals(dateTime75));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtMidnight(dateTimeZone3);
        java.util.Date date5 = localDate2.toDate();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate7.minus(readablePeriod8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.minus(readablePeriod12);
        org.joda.time.DateTime.Property property14 = dateTime13.year();
        java.lang.String str15 = property14.getAsString();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        int int18 = localDate17.getWeekOfWeekyear();
        int int19 = property14.compareTo((org.joda.time.ReadablePartial) localDate17);
        int int20 = localDate17.getEra();
        org.joda.time.LocalDate.Property property21 = localDate17.dayOfMonth();
        java.util.Date date22 = localDate17.toDate();
        boolean boolean23 = date5.before(date22);
        java.util.Calendar.Builder builder24 = builder0.setInstant(date5);
        java.util.Calendar.Builder builder26 = builder0.setLenient(true);
        java.util.Calendar.Builder builder28 = builder26.setInstant((-2L));
        java.util.TimeZone timeZone29 = java.util.TimeZone.getDefault();
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str32 = locale30.getExtension('a');
        java.util.Set<java.lang.String> strSet33 = locale30.getUnicodeLocaleAttributes();
        java.util.Locale locale34 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str35 = locale30.getDisplayScript(locale34);
        java.lang.String str36 = locale34.getLanguage();
        java.lang.String str37 = locale34.getDisplayScript();
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone29, locale34);
        boolean boolean39 = timeZone29.observesDaylightTime();
        java.util.Calendar.Builder builder40 = builder28.setTimeZone(timeZone29);
        java.util.TimeZone timeZone41 = java.util.TimeZone.getDefault();
        java.lang.String str42 = timeZone41.getID();
        int int44 = timeZone41.getOffset((-2104009200000L));
        java.util.Locale locale45 = java.util.Locale.FRANCE;
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(locale45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology47);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = localDate48.toDateTimeAtMidnight(dateTimeZone49);
        java.util.Date date51 = localDate48.toDate();
        calendar46.setTime(date51);
        java.util.TimeZone timeZone53 = calendar46.getTimeZone();
        boolean boolean54 = timeZone41.hasSameRules(timeZone53);
        boolean boolean55 = timeZone53.observesDaylightTime();
        java.util.Locale locale56 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str58 = locale56.getExtension('a');
        java.util.Set<java.lang.String> strSet59 = locale56.getUnicodeLocaleAttributes();
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone53, locale56);
        timeZone53.setRawOffset((int) (short) 1);
        java.util.Locale locale64 = java.util.Locale.forLanguageTag("Fri Feb 11 00:00:00 UTC 2022");
        java.util.Locale.setDefault(locale64);
        java.util.Calendar calendar66 = java.util.Calendar.getInstance(timeZone53, locale64);
        java.lang.String str67 = timeZone29.getDisplayName(locale64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar38 and calendar60", (calendar38.compareTo(calendar60) == 0) == calendar38.equals(calendar60));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate1.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate.Property property8 = localDate1.dayOfWeek();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.minus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readablePeriod15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime(chronology19);
        org.joda.time.DateTime dateTime22 = dateTime18.withMonthOfYear(5);
        org.joda.time.DateTime.Property property23 = dateTime22.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long28 = dateTimeZone25.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str30 = dateTimeZone25.getNameKey(100L);
        org.joda.time.DateTime dateTime31 = dateTime22.withZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTime dateTime32 = localDate1.toDateTimeAtStartOfDay(dateTimeZone25);
        org.joda.time.LocalDate.Property property33 = localDate1.year();
        org.joda.time.LocalDate localDate34 = property33.roundCeilingCopy();
        org.joda.time.DateTime dateTime35 = localDate34.toDateTimeAtStartOfDay();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDate localDate39 = localDate37.minus(readablePeriod38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = localDate39.toDateTimeAtMidnight(dateTimeZone40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.DateTime dateTime43 = dateTime41.minus(readablePeriod42);
        org.joda.time.DateTime dateTime45 = dateTime43.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.toDateTime(chronology46);
        org.joda.time.DateTime dateTime49 = dateTime45.withMonthOfYear(5);
        org.joda.time.DateTime.Property property50 = dateTime49.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long55 = dateTimeZone52.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str57 = dateTimeZone52.getNameKey(100L);
        org.joda.time.DateTime dateTime58 = dateTime49.withZoneRetainFields(dateTimeZone52);
        java.util.TimeZone timeZone59 = dateTimeZone52.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime35.toMutableDateTime(dateTimeZone52);
        org.joda.time.Chronology chronology61 = mutableDateTime60.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.millisOfSecond();
        java.lang.String str64 = dateTimeField62.getAsText(1644573139955L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and mutableDateTime60", (dateTime35.compareTo(mutableDateTime60) == 0) == dateTime35.equals(mutableDateTime60));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.minus(readablePeriod4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate5.toDateTimeAtMidnight(dateTimeZone6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.minus(readablePeriod8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        int int14 = dateTime11.getDayOfWeek();
        boolean boolean16 = dateTime11.isEqual((long) 0);
        org.joda.time.DateTime dateTime18 = dateTime11.withMillisOfSecond(23);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate20.minus(readablePeriod21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate22.toDateTimeAtMidnight(dateTimeZone23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.minus(readablePeriod25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.toDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = dateTime28.withMonthOfYear(5);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long36 = dateTimeZone34.nextTransition((long) 4);
        org.joda.time.DateTime dateTime37 = dateTime32.withZone(dateTimeZone34);
        org.joda.time.DateTime dateTime39 = dateTime32.minusHours(0);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.minus(readablePeriod40);
        boolean boolean42 = dateTime18.isAfter((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Chronology chronology43 = dateTime18.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.days();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.year();
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType0.getField(chronology43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime37", (dateTime32.compareTo(dateTime37) == 0) == dateTime32.equals(dateTime37));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0);
        long long3 = calendar2.getTimeInMillis();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.lang.String str5 = timeZone4.getID();
        int int6 = timeZone4.getRawOffset();
        calendar2.setTimeZone(timeZone4);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtMidnight(dateTimeZone12);
        java.util.Date date14 = localDate11.toDate();
        calendar9.setTime(date14);
        java.util.TimeZone timeZone16 = calendar9.getTimeZone();
        calendar9.clear();
        calendar9.clear();
        calendar9.set((-2731), 2022, 32769, (int) (short) 1, 100, 12);
        int int27 = calendar9.getGreatestMinimum(0);
        java.util.Date date28 = calendar9.getTime();
        calendar2.setTime(date28);
        java.lang.String str30 = date28.toGMTString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar9", (calendar2.compareTo(calendar9) == 0) == calendar2.equals(calendar9));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.secondOfMinute();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology10);
        boolean boolean15 = durationFieldType0.isSupported(chronology10);
        java.lang.String str16 = durationFieldType0.toString();
        java.lang.String str17 = durationFieldType0.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType18.getField(chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean25 = localTime23.isSupported(durationFieldType24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime27 = localTime23.minus(readablePeriod26);
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.lang.String str30 = dateTimeField20.getAsShortText((org.joda.time.ReadablePartial) localTime27, (int) (short) -1, locale29);
        java.lang.String str31 = localTime27.toString();
        int int32 = localTime27.size();
        org.joda.time.LocalTime.Property property33 = localTime27.hourOfDay();
        org.joda.time.LocalTime localTime35 = property33.addNoWrapToCopy((int) (short) 1);
        org.joda.time.LocalTime localTime37 = property33.setCopy(22);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType38.getField(chronology39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology42);
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean45 = localTime43.isSupported(durationFieldType44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalTime localTime47 = localTime43.minus(readablePeriod46);
        java.util.Locale locale49 = java.util.Locale.KOREA;
        java.lang.String str50 = dateTimeField40.getAsShortText((org.joda.time.ReadablePartial) localTime47, (int) (short) -1, locale49);
        java.lang.String str51 = localTime47.toString();
        int int52 = localTime47.size();
        int int53 = localTime47.getMillisOfSecond();
        org.joda.time.DateTimeField[] dateTimeFieldArray54 = localTime47.getFields();
        org.joda.time.LocalTime localTime55 = localTime37.withFields((org.joda.time.ReadablePartial) localTime47);
        org.joda.time.Chronology chronology56 = localTime55.getChronology();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(chronology56);
        org.joda.time.DateTimeZone dateTimeZone58 = chronology56.getZone();
        org.joda.time.DurationField durationField59 = durationFieldType0.getField(chronology56);
        org.joda.time.DateTimeField dateTimeField60 = chronology56.minuteOfDay();
        org.joda.time.DurationField durationField61 = chronology56.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField59, durationField61, and durationField59", !(durationField59.compareTo(durationField61) == 0) || (Math.signum(durationField59.compareTo(durationField59)) == Math.signum(durationField61.compareTo(durationField59))));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        int int12 = localDate11.getWeekOfWeekyear();
        int int13 = property8.compareTo((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTime dateTime15 = property8.addWrapFieldToCopy(59);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate17.minus(readablePeriod18);
        org.joda.time.LocalDate localDate21 = localDate17.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate23 = localDate17.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate.Property property24 = localDate17.dayOfWeek();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(chronology25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate28 = localDate26.minus(readablePeriod27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate28.toDateTimeAtMidnight(dateTimeZone29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.minus(readablePeriod31);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.toDateTime(chronology35);
        org.joda.time.DateTime dateTime38 = dateTime34.withMonthOfYear(5);
        org.joda.time.DateTime.Property property39 = dateTime38.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long44 = dateTimeZone41.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str46 = dateTimeZone41.getNameKey(100L);
        org.joda.time.DateTime dateTime47 = dateTime38.withZoneRetainFields(dateTimeZone41);
        org.joda.time.DateTime dateTime48 = localDate17.toDateTimeAtStartOfDay(dateTimeZone41);
        boolean boolean50 = dateTimeZone41.isStandardOffset((long) 6);
        long long53 = dateTimeZone41.convertLocalToUTC(1644572932963L, true);
        org.joda.time.DateTime dateTime54 = dateTime15.toDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime55 = dateTime15.toDateTimeISO();
        org.joda.time.LocalDateTime localDateTime56 = dateTime15.toLocalDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime54 and dateTime15", (dateTime54.compareTo(dateTime15) == 0) == dateTime54.equals(dateTime15));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        org.joda.time.LocalTime.Property property15 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime17 = property15.addNoWrapToCopy((int) (short) 1);
        org.joda.time.LocalTime localTime18 = property15.roundCeilingCopy();
        java.lang.String str19 = property15.getAsShortText();
        long long20 = property15.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property15.getFieldType();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology23);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean26 = localTime24.isSupported(durationFieldType25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalTime localTime28 = localTime24.minus(readablePeriod27);
        org.joda.time.LocalTime localTime30 = localTime24.plusSeconds(9);
        org.joda.time.Chronology chronology31 = localTime24.getChronology();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = chronology31.add(readablePeriod32, (-2L), 1);
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(chronology31);
        org.joda.time.DateTimeField dateTimeField37 = chronology31.weekyear();
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType21.getField(chronology31);
        org.joda.time.DateTimeField dateTimeField39 = chronology31.hourOfDay();
        org.joda.time.DurationField durationField40 = chronology31.weeks();
        org.joda.time.DurationField durationField41 = chronology31.hours();
        org.joda.time.DurationField durationField42 = chronology31.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField42, durationField40, and durationField41", !(durationField42.compareTo(durationField40) == 0) || (Math.signum(durationField42.compareTo(durationField41)) == Math.signum(durationField40.compareTo(durationField41))));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate1.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate.Property property8 = localDate1.dayOfWeek();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.minus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readablePeriod15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime(chronology19);
        org.joda.time.DateTime dateTime22 = dateTime18.withMonthOfYear(5);
        org.joda.time.DateTime.Property property23 = dateTime22.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long28 = dateTimeZone25.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str30 = dateTimeZone25.getNameKey(100L);
        org.joda.time.DateTime dateTime31 = dateTime22.withZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTime dateTime32 = localDate1.toDateTimeAtStartOfDay(dateTimeZone25);
        org.joda.time.LocalDate localDate34 = localDate1.withYearOfEra(42);
        org.joda.time.LocalDate localDate36 = localDate34.minusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property37 = localDate36.weekyear();
        java.util.Locale locale38 = java.util.Locale.CANADA;
        java.lang.String str39 = locale38.getDisplayVariant();
        int int40 = property37.getMaximumShortTextLength(locale38);
        org.joda.time.LocalDate localDate41 = property37.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long46 = dateTimeZone43.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate47 = org.joda.time.LocalDate.now(dateTimeZone43);
        int int49 = dateTimeZone43.getOffset(1644537599999L);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate(chronology50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalDate localDate53 = localDate51.minus(readablePeriod52);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = localDate53.toDateTimeAtMidnight(dateTimeZone54);
        org.joda.time.DateTime dateTime57 = dateTime55.plusMillis(32772);
        org.joda.time.DateTime dateTime59 = dateTime55.withMillis((long) ' ');
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate(chronology60);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = localDate61.toDateTimeAtMidnight(dateTimeZone62);
        org.joda.time.DateTime dateTime65 = dateTime63.withMillisOfDay(5);
        org.joda.time.DateTime.Property property66 = dateTime65.dayOfWeek();
        boolean boolean67 = dateTime55.equals((java.lang.Object) dateTime65);
        org.joda.time.DateTime dateTime69 = dateTime55.withWeekyear((-292275054));
        org.joda.time.DateTime.Property property70 = dateTime55.millisOfDay();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.LocalDate localDate72 = new org.joda.time.LocalDate(chronology71);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.LocalDate localDate74 = localDate72.minus(readablePeriod73);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = localDate74.toDateTimeAtMidnight(dateTimeZone75);
        org.joda.time.ReadableDuration readableDuration77 = null;
        org.joda.time.DateTime dateTime78 = dateTime76.plus(readableDuration77);
        org.joda.time.DateTime dateTime81 = dateTime76.withDurationAdded((long) 0, (int) (byte) 10);
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.LocalDate localDate83 = new org.joda.time.LocalDate(chronology82);
        org.joda.time.ReadablePeriod readablePeriod84 = null;
        org.joda.time.LocalDate localDate85 = localDate83.minus(readablePeriod84);
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.DateTime dateTime87 = localDate85.toDateTimeAtMidnight(dateTimeZone86);
        org.joda.time.ReadablePeriod readablePeriod88 = null;
        org.joda.time.DateTime dateTime89 = dateTime87.minus(readablePeriod88);
        org.joda.time.DateTime.Property property90 = dateTime89.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology92 = null;
        boolean boolean93 = dateTimeFieldType91.isSupported(chronology92);
        int int94 = dateTime89.get(dateTimeFieldType91);
        boolean boolean95 = dateTime76.isSupported(dateTimeFieldType91);
        org.joda.time.Instant instant96 = dateTime76.toInstant();
        int int97 = dateTime55.compareTo((org.joda.time.ReadableInstant) instant96);
        boolean boolean98 = dateTimeZone43.equals((java.lang.Object) instant96);
        org.joda.time.DateTime dateTime99 = localDate41.toDateTimeAtMidnight(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant96", (dateTime14.compareTo(instant96) == 0) == dateTime14.equals(instant96));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTime.Property property9 = dateTime7.dayOfMonth();
        boolean boolean10 = dateTime7.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime7.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime7.withPeriodAdded(readablePeriod12, 292278993);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.LocalDate.Property property19 = localDate16.dayOfWeek();
        org.joda.time.LocalDate localDate20 = property19.getLocalDate();
        org.joda.time.LocalDate localDate22 = property19.addWrapFieldToCopy(70);
        org.joda.time.LocalDate localDate24 = property19.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.DateTime dateTime26 = dateTime14.withChronology(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime14.plusSeconds(625);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime26", (dateTime14.compareTo(dateTime26) == 0) == dateTime14.equals(dateTime26));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        java.util.Locale locale1 = new java.util.Locale("\u5354\u8abf\u4e16\u754c\u6642\u9593");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale.Builder builder5 = builder2.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("minutes");
        java.util.Locale.Builder builder11 = builder6.setExtension('a', "52");
        java.util.Locale locale12 = builder11.build();
        java.lang.String str13 = locale1.getDisplayScript(locale12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long18 = dateTimeZone15.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(dateTimeZone15);
        org.joda.time.DateTime dateTime20 = localDate19.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfCentury();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((java.lang.Object) dateTime20);
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder24 = builder23.clear();
        java.util.Locale.Builder builder25 = builder24.clearExtensions();
        java.util.Locale locale26 = builder25.build();
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(locale27);
        java.lang.String str29 = locale26.getDisplayCountry(locale27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate31.toDateTimeAtMidnight(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.withMillisOfDay(5);
        org.joda.time.DateTime.Property property36 = dateTime35.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField37 = property36.getField();
        int int39 = dateTimeField37.getMinimumValue(0L);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(chronology40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = localDate41.toDateTimeAtMidnight(dateTimeZone42);
        org.joda.time.LocalDate localDate45 = localDate41.withWeekyear(7);
        org.joda.time.LocalDate localDate47 = localDate45.withWeekOfWeekyear(9);
        org.joda.time.LocalDate localDate49 = localDate47.minusWeeks((int) (byte) 0);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        boolean boolean59 = strSet52.addAll((java.util.Collection<java.lang.String>) strList57);
        java.util.Locale locale60 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str62 = locale60.getExtension('a');
        java.util.Set<java.lang.String> strSet63 = locale60.getUnicodeLocaleAttributes();
        java.util.Locale locale64 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str65 = locale60.getDisplayScript(locale64);
        java.util.Locale locale66 = java.util.Locale.ENGLISH;
        java.lang.String str67 = locale64.getDisplayVariant(locale66);
        boolean boolean68 = strSet52.equals((java.lang.Object) locale66);
        java.lang.String str69 = dateTimeField37.getAsText((org.joda.time.ReadablePartial) localDate49, locale66);
        java.lang.String str70 = locale26.getDisplayVariant(locale66);
        java.util.TimeZone timeZone71 = java.util.TimeZone.getDefault();
        java.lang.String str72 = timeZone71.getID();
        int int74 = timeZone71.getOffset((-2104009200000L));
        java.util.Locale locale75 = java.util.Locale.FRANCE;
        java.util.Calendar calendar76 = java.util.Calendar.getInstance(locale75);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.LocalDate localDate78 = new org.joda.time.LocalDate(chronology77);
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.DateTime dateTime80 = localDate78.toDateTimeAtMidnight(dateTimeZone79);
        java.util.Date date81 = localDate78.toDate();
        calendar76.setTime(date81);
        java.util.TimeZone timeZone83 = calendar76.getTimeZone();
        boolean boolean84 = timeZone71.hasSameRules(timeZone83);
        boolean boolean85 = timeZone83.observesDaylightTime();
        java.util.Locale locale86 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str88 = locale86.getExtension('a');
        java.util.Set<java.lang.String> strSet89 = locale86.getUnicodeLocaleAttributes();
        java.util.Calendar calendar90 = java.util.Calendar.getInstance(timeZone83, locale86);
        java.lang.String str91 = locale26.getDisplayVariant(locale86);
        java.util.Locale locale92 = locale26.stripExtensions();
        java.util.Calendar calendar93 = dateTime20.toCalendar(locale26);
        java.lang.String str94 = locale12.getDisplayCountry(locale26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar28 and calendar93", (calendar28.compareTo(calendar93) == 0) == calendar28.equals(calendar93));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate11.minus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.minus(readablePeriod16);
        org.joda.time.DateMidnight dateMidnight18 = dateTime17.toDateMidnight();
        org.joda.time.DateTime dateTime19 = dateTime17.withEarlierOffsetAtOverlap();
        long long20 = dateTime19.getMillis();
        org.joda.time.DateTime.Property property21 = dateTime19.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        org.joda.time.DateTime dateTime23 = property21.withMaximumValue();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(chronology24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate27 = localDate25.minus(readablePeriod26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate27.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.minus(readablePeriod30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusMillis((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int35 = dateTime33.get(dateTimeFieldType34);
        org.joda.time.DateTime.Property property36 = dateTime33.yearOfCentury();
        org.joda.time.DateTime dateTime37 = property36.roundCeilingCopy();
        org.joda.time.DateTime dateTime38 = property36.withMaximumValue();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate(chronology39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDate localDate42 = localDate40.plus(readablePeriod41);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((java.lang.Object) localDate40);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDate localDate45 = localDate40.minus(readablePeriod44);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(chronology46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDate localDate49 = localDate47.minus(readablePeriod48);
        org.joda.time.LocalDate localDate51 = localDate47.plusMonths((int) (byte) 0);
        int int52 = localDate51.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property53 = localDate51.weekyear();
        org.joda.time.LocalDate localDate55 = property53.addToCopy((int) (byte) -1);
        org.joda.time.Chronology chronology56 = localDate55.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.minuteOfHour();
        boolean boolean58 = localDate45.equals((java.lang.Object) chronology56);
        org.joda.time.DateTimeField dateTimeField59 = chronology56.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime38.toMutableDateTime(chronology56);
        int int61 = mutableDateTime60.getMinuteOfDay();
        boolean boolean62 = dateTime23.isEqual((org.joda.time.ReadableInstant) mutableDateTime60);
        long long63 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and mutableDateTime60", (dateTime38.compareTo(mutableDateTime60) == 0) == dateTime38.equals(mutableDateTime60));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(240);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("zh_TW");
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone3, locale5);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("Italy");
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone8);
        boolean boolean10 = timeZone3.hasSameRules(timeZone8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar9", (calendar6.compareTo(calendar9) == 0) == calendar6.equals(calendar9));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtMidnight(dateTimeZone3);
        java.util.Date date5 = localDate2.toDate();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate7.minus(readablePeriod8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.minus(readablePeriod12);
        org.joda.time.DateTime.Property property14 = dateTime13.year();
        java.lang.String str15 = property14.getAsString();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        int int18 = localDate17.getWeekOfWeekyear();
        int int19 = property14.compareTo((org.joda.time.ReadablePartial) localDate17);
        int int20 = localDate17.getEra();
        org.joda.time.LocalDate.Property property21 = localDate17.dayOfMonth();
        java.util.Date date22 = localDate17.toDate();
        boolean boolean23 = date5.before(date22);
        java.util.Calendar.Builder builder24 = builder0.setInstant(date5);
        java.util.Calendar.Builder builder26 = builder0.setLenient(true);
        java.util.Calendar.Builder builder28 = builder26.setLenient(true);
        java.util.Locale locale29 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str31 = locale29.getExtension('a');
        java.util.Set<java.lang.String> strSet32 = locale29.getUnicodeLocaleAttributes();
        java.util.Calendar.Builder builder33 = builder26.setLocale(locale29);
        java.util.Locale.Category category34 = java.util.Locale.Category.FORMAT;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDate localDate38 = localDate36.minus(readablePeriod37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = localDate38.toDateTimeAtMidnight(dateTimeZone39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.DateTime dateTime42 = dateTime40.minus(readablePeriod41);
        org.joda.time.DateTime.Property property43 = dateTime42.year();
        java.util.Locale locale44 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str45 = property43.getAsShortText(locale44);
        java.lang.String str46 = locale44.getVariant();
        java.util.Locale.setDefault(category34, locale44);
        java.util.Locale locale48 = java.util.Locale.getDefault(category34);
        java.lang.String str49 = locale48.getDisplayLanguage();
        java.util.Calendar.Builder builder50 = builder33.setLocale(locale48);
        java.util.Calendar calendar51 = builder33.build();
        java.util.TimeZone timeZone52 = java.util.TimeZone.getDefault();
        java.lang.String str53 = timeZone52.getID();
        int int55 = timeZone52.getOffset((-2104009200000L));
        java.util.Locale locale56 = java.util.Locale.FRANCE;
        java.util.Calendar calendar57 = java.util.Calendar.getInstance(locale56);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate(chronology58);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTime dateTime61 = localDate59.toDateTimeAtMidnight(dateTimeZone60);
        java.util.Date date62 = localDate59.toDate();
        calendar57.setTime(date62);
        java.util.TimeZone timeZone64 = calendar57.getTimeZone();
        boolean boolean65 = timeZone52.hasSameRules(timeZone64);
        java.lang.String str66 = timeZone64.getID();
        calendar51.setTimeZone(timeZone64);
        calendar51.setLenient(true);
        calendar51.setMinimalDaysInFirstWeek(2029);
        java.util.TimeZone timeZone72 = java.util.TimeZone.getDefault();
        java.lang.String str73 = timeZone72.getID();
        int int74 = timeZone72.getRawOffset();
        boolean boolean75 = timeZone72.observesDaylightTime();
        java.util.Calendar calendar76 = java.util.Calendar.getInstance(timeZone72);
        java.util.Calendar calendar77 = java.util.Calendar.getInstance(timeZone72);
        java.util.Calendar calendar78 = java.util.Calendar.getInstance(timeZone72);
        int int79 = timeZone72.getRawOffset();
        timeZone72.setRawOffset(13);
        calendar51.setTimeZone(timeZone72);
        java.lang.String str83 = timeZone72.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar51 and calendar57", (calendar51.compareTo(calendar57) == 0) == calendar51.equals(calendar57));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        int int13 = localTime9.getMillisOfDay();
        org.joda.time.LocalTime localTime15 = localTime9.plusMinutes(6);
        org.joda.time.LocalTime.Property property16 = localTime9.minuteOfHour();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.LocalTime localTime18 = property16.withMinimumValue();
        org.joda.time.LocalTime localTime20 = property16.addCopy(130);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology22);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime26 = localTime23.toDateTimeToday(dateTimeZone25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology28);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean31 = localTime29.isSupported(durationFieldType30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime33 = localTime29.minus(readablePeriod32);
        org.joda.time.LocalTime localTime35 = localTime29.plusSeconds(9);
        org.joda.time.Chronology chronology36 = localTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.minuteOfHour();
        org.joda.time.DateTime dateTime38 = dateTime26.toDateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime26.toDateTime();
        int int40 = property16.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime38", (dateTime39.compareTo(dateTime38) == 0) == dateTime39.equals(dateTime38));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.minuteOfDay();
        org.joda.time.DurationField durationField15 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField16 = chronology11.era();
        org.joda.time.Chronology chronology17 = chronology11.withUTC();
        org.joda.time.DurationField durationField18 = chronology11.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField18, and durationField15", !(durationField15.compareTo(durationField18) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField18.compareTo(durationField15))));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime20 = localTime17.toDateTimeToday(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        int int23 = dateTimeZone21.getStandardOffset((long) 70);
        org.joda.time.DateTime dateTime24 = localTime9.toDateTimeToday(dateTimeZone21);
        int int25 = dateTime24.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime27 = dateTime24.withYear((int) (short) 10);
        int int28 = dateTime27.getDayOfMonth();
        org.joda.time.DateTime dateTime30 = dateTime27.minusWeeks((int) (short) 10);
        org.joda.time.DateTime dateTime31 = dateTime27.withLaterOffsetAtOverlap();
        org.joda.time.Instant instant32 = dateTime27.toInstant();
        org.joda.time.DateTime.Property property33 = dateTime27.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and instant32", (dateTime27.compareTo(instant32) == 0) == dateTime27.equals(instant32));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(86399, 1, 13);
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths(2000);
        org.joda.time.LocalDate localDate7 = localDate3.withWeekyear((-2731));
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.minus(readablePeriod10);
        org.joda.time.LocalDate localDate13 = localDate9.plusMonths((int) (byte) 0);
        int int14 = localDate13.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property15 = localDate13.weekyear();
        int int16 = localDate13.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Interval interval18 = localDate13.toInterval(dateTimeZone17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate20.minus(readablePeriod21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate22.toDateTimeAtMidnight(dateTimeZone23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.minus(readablePeriod25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.toDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = dateTime28.withMonthOfYear(5);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long36 = dateTimeZone34.nextTransition((long) 4);
        org.joda.time.DateTime dateTime37 = dateTime32.withZone(dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight38 = localDate13.toDateMidnight(dateTimeZone34);
        org.joda.time.LocalDate localDate39 = localDate7.withFields((org.joda.time.ReadablePartial) localDate13);
        org.joda.time.LocalDate.Property property40 = localDate7.monthOfYear();
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        java.lang.String str43 = property40.getAsShortText(locale42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime37", (dateTime32.compareTo(dateTime37) == 0) == dateTime32.equals(dateTime37));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long19 = dateTimeZone16.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str21 = dateTimeZone16.getNameKey(100L);
        org.joda.time.DateTime dateTime22 = dateTime13.withZoneRetainFields(dateTimeZone16);
        boolean boolean23 = dateTime22.isAfterNow();
        org.joda.time.DateTime.Property property24 = dateTime22.dayOfYear();
        org.joda.time.Instant instant25 = dateTime22.toInstant();
        org.joda.time.DateTime.Property property26 = dateTime22.dayOfYear();
        int int27 = dateTime22.getDayOfYear();
        org.joda.time.DateTime dateTime29 = dateTime22.withCenturyOfEra(120);
        org.joda.time.Chronology chronology30 = dateTime22.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant25", (dateTime22.compareTo(instant25) == 0) == dateTime22.equals(instant25));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.DateTime dateTime9 = property6.addToCopy(0L);
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.lang.String str12 = dateTime9.toString("11", locale11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate14.minus(readablePeriod15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.minus(readablePeriod19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.DateTime dateTime26 = dateTime24.withWeekOfWeekyear((int) '4');
        org.joda.time.DateTime.Property property27 = dateTime26.centuryOfEra();
        org.joda.time.DateTime dateTime28 = property27.roundHalfCeilingCopy();
        org.joda.time.DateTime.Property property29 = dateTime28.monthOfYear();
        boolean boolean30 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localDate32.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate37 = localDate32.withFieldAdded(durationFieldType35, (int) (short) 0);
        org.joda.time.LocalDate.Property property38 = localDate32.year();
        org.joda.time.LocalDate localDate39 = property38.roundCeilingCopy();
        org.joda.time.LocalDate localDate40 = property38.withMaximumValue();
        org.joda.time.LocalDate localDate42 = property38.addToCopy(7);
        int int43 = localDate42.getDayOfYear();
        org.joda.time.LocalDate localDate45 = localDate42.plusYears((int) '#');
        org.joda.time.LocalTime localTime46 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(35373897);
        org.joda.time.DateTime dateTime49 = localDate45.toDateTime(localTime46, dateTimeZone48);
        org.joda.time.DateTime dateTime50 = dateTime9.withZone(dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime50", (dateTime5.compareTo(dateTime50) == 0) == dateTime5.equals(dateTime50));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        int int12 = dateTime11.getWeekOfWeekyear();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("Mon Jan 10 01:02:00 UTC 1916");
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTime dateTime16 = dateTime11.withZone(dateTimeZone15);
        org.joda.time.DateTime.Property property17 = dateTime16.weekyear();
        org.joda.time.DateTime dateTime19 = property17.addWrapFieldToCopy(3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime16", (dateTime9.compareTo(dateTime16) == 0) == dateTime9.equals(dateTime16));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = chronology12.hourOfDay();
        org.joda.time.DurationField durationField18 = chronology12.eras();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology12.add(readablePeriod19, (long) 35368568, 2099);
        org.joda.time.DurationField durationField23 = chronology12.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField23, and durationField18", !(durationField18.compareTo(durationField23) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField23.compareTo(durationField18))));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Date date1 = calendar0.getTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.minus(readablePeriod4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate5.toDateTimeAtMidnight(dateTimeZone6);
        org.joda.time.Chronology chronology8 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long13 = dateTimeZone11.nextTransition((long) 4);
        org.joda.time.Chronology chronology14 = chronology8.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField15 = chronology8.secondOfMinute();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate17.minus(readablePeriod18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate19.toDateTimeAtMidnight(dateTimeZone20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.minus(readablePeriod22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.toDateTime(chronology26);
        int int28 = dateTime25.getDayOfWeek();
        boolean boolean30 = dateTime25.isEqual((long) 0);
        org.joda.time.DateTime dateTime32 = dateTime25.withMillisOfSecond(23);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime25.getZone();
        org.joda.time.Chronology chronology34 = chronology8.withZone(dateTimeZone33);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((java.lang.Object) calendar0, chronology8);
        org.joda.time.DateTimeField dateTimeField36 = chronology8.hourOfDay();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(chronology37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDate localDate40 = localDate38.minus(readablePeriod39);
        org.joda.time.LocalDate localDate42 = localDate38.plusMonths((int) (byte) 0);
        int int43 = localDate42.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property44 = localDate42.weekyear();
        org.joda.time.LocalDate localDate45 = property44.withMaximumValue();
        org.joda.time.LocalDate.Property property46 = localDate45.year();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long51 = dateTimeZone48.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate(dateTimeZone48);
        int int54 = dateTimeZone48.getOffset((long) '#');
        org.joda.time.DateTime dateTime55 = localDate45.toDateTimeAtMidnight(dateTimeZone48);
        int int56 = dateTimeField36.getMaximumValue((org.joda.time.ReadablePartial) localDate45);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTimeField dateTimeField60 = dateTimeFieldType58.getField(chronology59);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology62);
        org.joda.time.DurationFieldType durationFieldType64 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean65 = localTime63.isSupported(durationFieldType64);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        org.joda.time.LocalTime localTime67 = localTime63.minus(readablePeriod66);
        java.util.Locale locale69 = java.util.Locale.KOREA;
        java.lang.String str70 = dateTimeField60.getAsShortText((org.joda.time.ReadablePartial) localTime67, (int) (short) -1, locale69);
        java.lang.String str71 = localTime67.toString();
        int int72 = localTime67.size();
        org.joda.time.LocalTime.Property property73 = localTime67.hourOfDay();
        org.joda.time.LocalTime localTime75 = property73.addNoWrapToCopy((int) (short) 1);
        java.util.Locale locale76 = java.util.Locale.FRANCE;
        java.util.Calendar calendar77 = java.util.Calendar.getInstance(locale76);
        java.lang.String str78 = property73.getAsText(locale76);
        java.lang.String str79 = dateTimeField36.getAsText((long) 3954, locale76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar77", (calendar0.compareTo(calendar77) == 0) == calendar0.equals(calendar77));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTime.Property property9 = dateTime7.dayOfMonth();
        boolean boolean10 = dateTime7.isEqualNow();
        java.lang.String str11 = dateTime7.toString();
        int int12 = dateTime7.getYear();
        org.joda.time.DateTime dateTime13 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.Instant instant14 = dateTime13.toInstant();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate16.minus(readablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readablePeriod21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime24.withMonthOfYear(5);
        org.joda.time.DateTime.Property property29 = dateTime24.minuteOfDay();
        java.lang.String str30 = property29.getAsString();
        org.joda.time.DateTime dateTime32 = property29.setCopy(100);
        org.joda.time.DateTime.Property property33 = dateTime32.dayOfWeek();
        java.util.Date date34 = dateTime32.toDate();
        boolean boolean35 = dateTime13.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant14", (dateTime13.compareTo(instant14) == 0) == dateTime13.equals(instant14));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        java.lang.String str9 = property8.getAsString();
        java.lang.String str10 = property8.toString();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMillis(32772);
        org.joda.time.DateTime dateTime20 = dateTime16.withMillis((long) ' ');
        org.joda.time.DateTime dateTime22 = dateTime16.minusMillis(5);
        int int23 = dateTime16.getDayOfMonth();
        int int24 = property8.getDifference((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime26 = dateTime16.plusMonths(1970);
        org.joda.time.DateTime dateTime27 = dateTime16.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime29 = dateTime27.withCenturyOfEra(11);
        org.joda.time.DateTime dateTime31 = dateTime27.plusMinutes(32772);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 5);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        long long39 = dateTimeZone34.convertLocalToUTC(1644572942340L, false, (long) 990);
        int int41 = dateTimeZone34.getOffset(0L);
        org.joda.time.DateTime dateTime42 = dateTime31.withZone(dateTimeZone34);
        int int44 = dateTimeZone34.getStandardOffset((long) 3540010);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime42", (dateTime31.compareTo(dateTime42) == 0) == dateTime31.equals(dateTime42));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        int int3 = timeZone0.getOffset((-2104009200000L));
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtMidnight(dateTimeZone8);
        java.util.Date date10 = localDate7.toDate();
        calendar5.setTime(date10);
        java.util.TimeZone timeZone12 = calendar5.getTimeZone();
        boolean boolean13 = timeZone0.hasSameRules(timeZone12);
        boolean boolean14 = timeZone12.observesDaylightTime();
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str17 = locale15.getExtension('a');
        java.util.Set<java.lang.String> strSet18 = locale15.getUnicodeLocaleAttributes();
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone12, locale15);
        timeZone12.setRawOffset((int) (short) 1);
        java.util.TimeZone timeZone22 = java.util.TimeZone.getDefault();
        java.lang.String str23 = timeZone22.getID();
        int int25 = timeZone22.getOffset((-2104009200000L));
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(locale26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localDate29.toDateTimeAtMidnight(dateTimeZone30);
        java.util.Date date32 = localDate29.toDate();
        calendar27.setTime(date32);
        java.util.TimeZone timeZone34 = calendar27.getTimeZone();
        boolean boolean35 = timeZone22.hasSameRules(timeZone34);
        boolean boolean36 = timeZone34.observesDaylightTime();
        java.util.Locale locale37 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str39 = locale37.getExtension('a');
        java.util.Set<java.lang.String> strSet40 = locale37.getUnicodeLocaleAttributes();
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(timeZone34, locale37);
        java.lang.String str42 = locale37.getDisplayScript();
        java.util.Locale.setDefault(locale37);
        java.lang.String str44 = locale37.getDisplayScript();
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(timeZone12, locale37);
        int int46 = calendar45.getWeekYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar27", (calendar5.compareTo(calendar27) == 0) == calendar5.equals(calendar27));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate2.minus(readablePeriod3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtMidnight(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMillis(32772);
        org.joda.time.DateTime dateTime10 = dateTime6.withMillis((long) ' ');
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withMillisOfDay(5);
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfWeek();
        boolean boolean18 = dateTime6.equals((java.lang.Object) dateTime16);
        org.joda.time.DateTime dateTime20 = dateTime16.plus((long) 22);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.withPeriodAdded(readablePeriod21, 35405662);
        int int24 = dateTime23.getMillisOfDay();
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = null;
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter25, dateTimeParser26);
        org.joda.time.Chronology chronology28 = dateTimeFormatter27.getChronolgy();
        boolean boolean29 = dateTimeFormatter27.isParser();
        org.joda.time.Chronology chronology30 = dateTimeFormatter27.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter27.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter27.withZoneUTC();
        boolean boolean33 = dateTimeFormatter27.isParser();
        java.util.Locale locale34 = java.util.Locale.FRANCE;
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(locale34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localDate37.toDateTimeAtMidnight(dateTimeZone38);
        java.util.Date date40 = localDate37.toDate();
        calendar35.setTime(date40);
        java.util.TimeZone timeZone42 = calendar35.getTimeZone();
        calendar35.clear();
        calendar35.clear();
        java.util.TimeZone timeZone45 = java.util.TimeZone.getDefault();
        java.lang.String str46 = timeZone45.getID();
        int int47 = timeZone45.getRawOffset();
        boolean boolean48 = timeZone45.observesDaylightTime();
        calendar35.setTimeZone(timeZone45);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        boolean boolean51 = calendar35.before((java.lang.Object) dateTimeZone50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter27.withZone(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = dateTime23.withZone(dateTimeZone50);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(1644573100385L, dateTimeZone50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime53", (dateTime20.compareTo(dateTime53) == 0) == dateTime20.equals(dateTime53));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        int int11 = dateTime9.getYearOfEra();
        org.joda.time.DateTime.Property property12 = dateTime9.weekyear();
        org.joda.time.DateTime.Property property13 = dateTime9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long18 = dateTimeZone15.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone15);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.LocalDate localDate22 = localDate19.withField(dateTimeFieldType20, (int) 'a');
        org.joda.time.DateTime dateTime23 = localDate19.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDate localDate25 = localDate19.plus(readablePeriod24);
        org.joda.time.LocalDate.Property property26 = localDate25.dayOfMonth();
        int int27 = localDate25.getEra();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate32 = localDate30.plus(readablePeriod31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology34 = null;
        boolean boolean35 = dateTimeFieldType33.isSupported(chronology34);
        boolean boolean36 = localDate32.isSupported(dateTimeFieldType33);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(chronology37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDate localDate40 = localDate38.minus(readablePeriod39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localDate40.toDateTimeAtMidnight(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.plusMillis(32772);
        org.joda.time.DateTime dateTime46 = dateTime42.withMillis((long) ' ');
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDate localDate50 = localDate48.plus(readablePeriod49);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology52 = null;
        boolean boolean53 = dateTimeFieldType51.isSupported(chronology52);
        boolean boolean54 = localDate50.isSupported(dateTimeFieldType51);
        int int55 = dateTime46.get(dateTimeFieldType51);
        boolean boolean56 = localDate32.isSupported(dateTimeFieldType51);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate(chronology57);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = localDate58.toDateTimeAtMidnight(dateTimeZone59);
        boolean boolean61 = localDate32.isEqual((org.joda.time.ReadablePartial) localDate58);
        org.joda.time.LocalDate localDate63 = localDate58.minusMonths(32770);
        org.joda.time.LocalTime localTime64 = null;
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long70 = dateTimeZone67.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str72 = dateTimeZone67.getNameKey(100L);
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate((long) 10, dateTimeZone67);
        org.joda.time.DateTime dateTime74 = localDate63.toDateTime(localTime64, dateTimeZone67);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(1644572942500L, dateTimeZone67);
        org.joda.time.DateTime dateTime77 = dateTime75.withMillis((long) 99);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str80 = dateTimeZone78.getShortName(1644572938028L);
        java.util.TimeZone timeZone81 = dateTimeZone78.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime82 = dateTime75.toMutableDateTime(dateTimeZone78);
        org.joda.time.DateTime dateTime83 = localDate25.toDateTimeAtCurrentTime(dateTimeZone78);
        boolean boolean84 = dateTimeZone78.isFixed();
        org.joda.time.DateTime dateTime85 = dateTime9.toDateTime(dateTimeZone78);
        org.joda.time.LocalDate localDate86 = dateTime85.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime75 and mutableDateTime82", (dateTime75.compareTo(mutableDateTime82) == 0) == dateTime75.equals(mutableDateTime82));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate2.minus(readablePeriod3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtMidnight(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readablePeriod7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.withMonthOfYear(5);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long18 = dateTimeZone16.nextTransition((long) 4);
        org.joda.time.DateTime dateTime19 = dateTime14.withZone(dateTimeZone16);
        long long22 = dateTimeZone16.convertLocalToUTC(1644573010815L, false);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(1644572976886L, dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime19", (dateTime14.compareTo(dateTime19) == 0) == dateTime14.equals(dateTime19));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.Chronology chronology6 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long11 = dateTimeZone9.nextTransition((long) 4);
        org.joda.time.Chronology chronology12 = chronology6.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField13 = chronology6.dayOfWeek();
        org.joda.time.DurationField durationField14 = chronology6.centuries();
        org.joda.time.DurationField durationField15 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField16 = chronology6.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField15", Math.signum(durationField14.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField14)));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'x');
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate3.minus(readablePeriod4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate5.toDateTimeAtMidnight(dateTimeZone6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.minus(readablePeriod8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime11.withMonthOfYear(5);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long19 = dateTimeZone17.nextTransition((long) 4);
        org.joda.time.DateTime dateTime20 = dateTime15.withZone(dateTimeZone17);
        org.joda.time.DateTime dateTime22 = dateTime15.minusHours(0);
        boolean boolean23 = dateTimeZone1.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime20", (dateTime15.compareTo(dateTime20) == 0) == dateTime15.equals(dateTime20));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DurationField durationField6 = durationFieldType3.getField(chronology5);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean13 = localTime11.isSupported(durationFieldType12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime11.minus(readablePeriod14);
        org.joda.time.LocalTime localTime17 = localTime11.plusSeconds(9);
        org.joda.time.Chronology chronology18 = localTime11.getChronology();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology18.add(readablePeriod19, (-2L), 1);
        long long26 = chronology18.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology18);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) 9, chronology18);
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) 32770, chronology29);
        org.joda.time.DurationField durationField31 = durationFieldType3.getField(chronology29);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology35);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean38 = localTime36.isSupported(durationFieldType37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalTime localTime40 = localTime36.minus(readablePeriod39);
        org.joda.time.LocalTime localTime42 = localTime36.plusSeconds(9);
        org.joda.time.Chronology chronology43 = localTime36.getChronology();
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(chronology43);
        org.joda.time.Chronology chronology45 = localTime44.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.yearOfCentury();
        org.joda.time.LocalTime localTime47 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology45);
        org.joda.time.DateTimeField dateTimeField48 = chronology45.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField49 = chronology45.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField50 = chronology45.clockhourOfHalfday();
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.fromMillisOfDay(1644572968568L, chronology45);
        org.joda.time.DurationField durationField52 = chronology45.weekyears();
        org.joda.time.DateTimeField dateTimeField53 = chronology45.era();
        org.joda.time.DurationField durationField54 = durationFieldType3.getField(chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField54", (durationField6.compareTo(durationField54) == 0) == durationField6.equals(durationField54));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plus((-25L));
        org.joda.time.DateTime dateTime9 = dateTime3.withMillisOfDay(2022);
        org.joda.time.DateTime dateTime11 = dateTime9.plusDays(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime.Property property13 = dateTime11.property(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime11.minusDays(79200000);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 5);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = dateTime15.toDateTime(dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.plus(readableDuration21);
        org.joda.time.DateTime dateTime24 = dateTime20.withYearOfEra(79200000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime20", (dateTime15.compareTo(dateTime20) == 0) == dateTime15.equals(dateTime20));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate1.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate localDate9 = localDate1.minusYears((int) 'x');
        org.joda.time.LocalDate.Property property10 = localDate9.monthOfYear();
        org.joda.time.LocalDate localDate12 = property10.addToCopy(32770);
        int int13 = localDate12.getCenturyOfEra();
        org.joda.time.LocalDate localDate15 = localDate12.plusWeeks(0);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate17.minus(readablePeriod18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate19.toDateTimeAtMidnight(dateTimeZone20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.minus(readablePeriod22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.toDateTime(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime25.withMonthOfYear(5);
        org.joda.time.DateTime.Property property30 = dateTime29.hourOfDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(chronology31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDate localDate34 = localDate32.minus(readablePeriod33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localDate34.toDateTimeAtMidnight(dateTimeZone35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.minus(readablePeriod37);
        org.joda.time.DateMidnight dateMidnight39 = dateTime38.toDateMidnight();
        org.joda.time.DateTime dateTime40 = dateTime38.withEarlierOffsetAtOverlap();
        int int41 = dateTime29.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime42 = dateTime29.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate(chronology43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDate localDate46 = localDate44.minus(readablePeriod45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localDate46.toDateTimeAtMidnight(dateTimeZone47);
        org.joda.time.Chronology chronology49 = localDate46.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology49.getZone();
        org.joda.time.DateTime dateTime52 = dateTime29.withZone(dateTimeZone51);
        org.joda.time.DateTime dateTime53 = localDate15.toDateTimeAtStartOfDay(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and dateTime52", (dateTime29.compareTo(dateTime52) == 0) == dateTime29.equals(dateTime52));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean11 = localTime9.isSupported(durationFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime9.minus(readablePeriod12);
        org.joda.time.LocalTime localTime15 = localTime9.plusSeconds(9);
        org.joda.time.Chronology chronology16 = localTime9.getChronology();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = chronology16.add(readablePeriod17, (-2L), 1);
        long long24 = chronology16.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType6.getField(chronology16);
        org.joda.time.DateTimeField dateTimeField27 = chronology16.dayOfYear();
        org.joda.time.DurationField durationField28 = chronology16.seconds();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(0L, chronology16);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology31);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime35 = localTime32.toDateTimeToday(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime35.getZone();
        int int38 = dateTimeZone36.getStandardOffset((-2L));
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology40);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean43 = localTime41.isSupported(durationFieldType42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalTime localTime45 = localTime41.minus(readablePeriod44);
        org.joda.time.LocalTime localTime47 = localTime41.plusSeconds(9);
        org.joda.time.Chronology chronology48 = localTime41.getChronology();
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        long long52 = chronology48.add(readablePeriod49, (-2L), 1);
        long long56 = chronology48.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTimeZone dateTimeZone57 = chronology48.getZone();
        long long59 = dateTimeZone36.getMillisKeepLocal(dateTimeZone57, (-2L));
        java.util.TimeZone timeZone60 = dateTimeZone36.toTimeZone();
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(dateTimeZone36);
        org.joda.time.Chronology chronology62 = chronology16.withZone(dateTimeZone36);
        boolean boolean63 = durationFieldType3.isSupported(chronology16);
        org.joda.time.DateTime dateTime65 = org.joda.time.DateTime.parse("999");
        org.joda.time.DateTime dateTime67 = dateTime65.minusWeeks((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone68 = dateTime65.getZone();
        org.joda.time.Chronology chronology69 = dateTime65.getChronology();
        boolean boolean70 = durationFieldType3.isSupported(chronology69);
        org.joda.time.DateTime dateTime71 = org.joda.time.DateTime.now(chronology69);
        org.joda.time.DurationField durationField72 = chronology69.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime71", (dateTime25.compareTo(dateTime71) == 0) == dateTime25.equals(dateTime71));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.secondOfMinute();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology10);
        boolean boolean15 = durationFieldType0.isSupported(chronology10);
        java.lang.String str16 = durationFieldType0.toString();
        java.lang.String str17 = durationFieldType0.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType18.getField(chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean25 = localTime23.isSupported(durationFieldType24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime27 = localTime23.minus(readablePeriod26);
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.lang.String str30 = dateTimeField20.getAsShortText((org.joda.time.ReadablePartial) localTime27, (int) (short) -1, locale29);
        java.lang.String str31 = localTime27.toString();
        int int32 = localTime27.size();
        org.joda.time.LocalTime.Property property33 = localTime27.hourOfDay();
        org.joda.time.LocalTime localTime35 = property33.addNoWrapToCopy((int) (short) 1);
        org.joda.time.LocalTime localTime37 = property33.setCopy(22);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType38.getField(chronology39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology42);
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean45 = localTime43.isSupported(durationFieldType44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalTime localTime47 = localTime43.minus(readablePeriod46);
        java.util.Locale locale49 = java.util.Locale.KOREA;
        java.lang.String str50 = dateTimeField40.getAsShortText((org.joda.time.ReadablePartial) localTime47, (int) (short) -1, locale49);
        java.lang.String str51 = localTime47.toString();
        int int52 = localTime47.size();
        int int53 = localTime47.getMillisOfSecond();
        org.joda.time.DateTimeField[] dateTimeFieldArray54 = localTime47.getFields();
        org.joda.time.LocalTime localTime55 = localTime37.withFields((org.joda.time.ReadablePartial) localTime47);
        org.joda.time.Chronology chronology56 = localTime55.getChronology();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(chronology56);
        org.joda.time.DateTimeZone dateTimeZone58 = chronology56.getZone();
        org.joda.time.DurationField durationField59 = durationFieldType0.getField(chronology56);
        org.joda.time.DateTimeField dateTimeField60 = chronology56.minuteOfDay();
        long long64 = chronology56.add((long) 35373897, 1644572942690L, 32010);
        org.joda.time.DateTimeField dateTimeField65 = chronology56.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.DateTimeField dateTimeField68 = dateTimeFieldType66.getField(chronology67);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.LocalTime localTime71 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology70);
        org.joda.time.DurationFieldType durationFieldType72 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean73 = localTime71.isSupported(durationFieldType72);
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        org.joda.time.LocalTime localTime75 = localTime71.minus(readablePeriod74);
        java.util.Locale locale77 = java.util.Locale.KOREA;
        java.lang.String str78 = dateTimeField68.getAsShortText((org.joda.time.ReadablePartial) localTime75, (int) (short) -1, locale77);
        java.lang.String str79 = localTime75.toString();
        int int80 = localTime75.size();
        org.joda.time.LocalTime.Property property81 = localTime75.hourOfDay();
        org.joda.time.LocalTime localTime83 = property81.addNoWrapToCopy((int) (short) 1);
        org.joda.time.LocalTime localTime84 = property81.roundCeilingCopy();
        org.joda.time.LocalTime localTime86 = property81.addCopy((int) 'x');
        org.joda.time.LocalTime localTime87 = property81.getLocalTime();
        long long89 = chronology56.set((org.joda.time.ReadablePartial) localTime87, 47L);
        org.joda.time.DurationField durationField90 = chronology56.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField59, durationField90, and durationField59", !(durationField59.compareTo(durationField90) == 0) || (Math.signum(durationField59.compareTo(durationField59)) == Math.signum(durationField90.compareTo(durationField59))));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate16.minus(readablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readablePeriod21);
        org.joda.time.DateMidnight dateMidnight23 = dateTime22.toDateMidnight();
        org.joda.time.DateTime dateTime24 = dateTime22.withEarlierOffsetAtOverlap();
        int int25 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime.Property property26 = dateTime13.dayOfYear();
        org.joda.time.Instant instant27 = dateTime13.toInstant();
        org.joda.time.DateTime dateTime30 = dateTime13.withDurationAdded(452769L, 365);
        org.joda.time.DateTime dateTime32 = dateTime30.plusHours(35544503);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant27", (dateTime13.compareTo(instant27) == 0) == dateTime13.equals(instant27));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate6 = localDate1.withFieldAdded(durationFieldType4, (int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate1.year();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property7.roundFloorCopy();
        org.joda.time.LocalDate localDate10 = property7.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate12 = localDate10.plusYears(2022);
        int[] intArray13 = localDate10.getValues();
        org.joda.time.LocalDate localDate15 = localDate10.plusMonths(35373897);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate17.minus(readablePeriod18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate19.toDateTimeAtMidnight(dateTimeZone20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.minus(readablePeriod22);
        org.joda.time.DateMidnight dateMidnight24 = dateTime23.toDateMidnight();
        org.joda.time.DateTime dateTime25 = dateTime23.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property26 = dateTime23.secondOfDay();
        boolean boolean28 = dateTime23.isEqual((long) 8);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate32 = localDate30.minus(readablePeriod31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localDate32.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.Chronology chronology35 = localDate32.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long40 = dateTimeZone38.nextTransition((long) 4);
        org.joda.time.Chronology chronology41 = chronology35.withZone(dateTimeZone38);
        org.joda.time.DateTime dateTime42 = dateTime23.withZone(dateTimeZone38);
        org.joda.time.Interval interval43 = localDate10.toInterval(dateTimeZone38);
        java.util.Locale locale48 = new java.util.Locale("00:00:00.000", "1900-01-01T00:00:00.010", "German (Germany)");
        java.lang.String str49 = dateTimeZone38.getName((long) 575, locale48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime42", (dateTime3.compareTo(dateTime42) == 0) == dateTime3.equals(dateTime42));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        java.util.Locale locale2 = new java.util.Locale("yearOfEra", "hourOfDay");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        boolean boolean4 = calendar3.isWeekDateSupported();
        java.time.Instant instant5 = calendar3.toInstant();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate10 = localDate8.minus(readablePeriod9);
        org.joda.time.LocalDate localDate12 = localDate8.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate14 = localDate8.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate.Property property15 = localDate8.dayOfWeek();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate17.minus(readablePeriod18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate19.toDateTimeAtMidnight(dateTimeZone20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.minus(readablePeriod22);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.toDateTime(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime25.withMonthOfYear(5);
        org.joda.time.DateTime.Property property30 = dateTime29.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long35 = dateTimeZone32.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str37 = dateTimeZone32.getNameKey(100L);
        org.joda.time.DateTime dateTime38 = dateTime29.withZoneRetainFields(dateTimeZone32);
        org.joda.time.DateTime dateTime39 = localDate8.toDateTimeAtStartOfDay(dateTimeZone32);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate(obj6, dateTimeZone32);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(chronology42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDate43.toDateTimeAtMidnight(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.withMillisOfDay(5);
        org.joda.time.DateTime.Property property48 = dateTime47.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField49 = property48.getField();
        int int51 = dateTimeField49.getMinimumValue(0L);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(chronology52);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = localDate53.toDateTimeAtMidnight(dateTimeZone54);
        org.joda.time.LocalDate localDate57 = localDate53.withWeekyear(7);
        org.joda.time.LocalDate localDate59 = localDate57.withWeekOfWeekyear(9);
        org.joda.time.LocalDate localDate61 = localDate59.minusWeeks((int) (byte) 0);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        java.lang.String[] strArray68 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        boolean boolean71 = strSet64.addAll((java.util.Collection<java.lang.String>) strList69);
        java.util.Locale locale72 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str74 = locale72.getExtension('a');
        java.util.Set<java.lang.String> strSet75 = locale72.getUnicodeLocaleAttributes();
        java.util.Locale locale76 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str77 = locale72.getDisplayScript(locale76);
        java.util.Locale locale78 = java.util.Locale.ENGLISH;
        java.lang.String str79 = locale76.getDisplayVariant(locale78);
        boolean boolean80 = strSet64.equals((java.lang.Object) locale78);
        java.lang.String str81 = dateTimeField49.getAsText((org.joda.time.ReadablePartial) localDate61, locale78);
        java.lang.String str82 = dateTimeZone32.getName((long) '4', locale78);
        java.lang.String str83 = dateTimeZone32.toString();
        java.util.TimeZone timeZone84 = dateTimeZone32.toTimeZone();
        int int86 = timeZone84.getOffset(1644573009580L);
        calendar3.setTimeZone(timeZone84);
        java.lang.String str88 = timeZone84.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime47", (dateTime39.compareTo(dateTime47) == 0) == dateTime39.equals(dateTime47));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfDay(5);
        org.joda.time.DateTime dateTime6 = dateTime5.withLaterOffsetAtOverlap();
        int int7 = dateTime5.getEra();
        org.joda.time.DateTime dateTime9 = dateTime5.withMillisOfSecond(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        boolean boolean11 = dateTime9.isSupported(dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate18 = localDate13.withFieldAdded(durationFieldType16, (int) (short) 0);
        org.joda.time.LocalDate.Property property19 = localDate13.year();
        org.joda.time.LocalDate localDate20 = property19.roundCeilingCopy();
        org.joda.time.LocalDate localDate21 = property19.withMaximumValue();
        org.joda.time.LocalDate localDate23 = property19.addToCopy(7);
        int int24 = localDate23.getDayOfYear();
        org.joda.time.LocalDate localDate26 = localDate23.minusDays(6);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate28.toDateTimeAtMidnight(dateTimeZone29);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate33 = localDate28.withFieldAdded(durationFieldType31, (int) (short) 0);
        org.joda.time.LocalDate.Property property34 = localDate33.centuryOfEra();
        org.joda.time.LocalDate.Property property35 = localDate33.dayOfMonth();
        org.joda.time.LocalDate localDate37 = property35.addToCopy(32772);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDate localDate39 = localDate37.minus(readablePeriod38);
        int int40 = localDate39.getYear();
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean42 = localDate39.isSupported(durationFieldType41);
        org.joda.time.LocalDate.Property property43 = localDate39.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone46 = dateTimeZone45.toTimeZone();
        java.lang.String str47 = dateTimeZone45.getID();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(chronology49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDate localDate52 = localDate50.minus(readablePeriod51);
        org.joda.time.LocalDate localDate54 = localDate50.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate56 = localDate50.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate.Property property57 = localDate50.dayOfWeek();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate(chronology58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDate localDate61 = localDate59.minus(readablePeriod60);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = localDate61.toDateTimeAtMidnight(dateTimeZone62);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.DateTime dateTime65 = dateTime63.minus(readablePeriod64);
        org.joda.time.DateTime dateTime67 = dateTime65.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = dateTime67.toDateTime(chronology68);
        org.joda.time.DateTime dateTime71 = dateTime67.withMonthOfYear(5);
        org.joda.time.DateTime.Property property72 = dateTime71.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long77 = dateTimeZone74.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str79 = dateTimeZone74.getNameKey(100L);
        org.joda.time.DateTime dateTime80 = dateTime71.withZoneRetainFields(dateTimeZone74);
        org.joda.time.DateTime dateTime81 = localDate50.toDateTimeAtStartOfDay(dateTimeZone74);
        int int83 = dateTimeZone74.getStandardOffset((long) 5);
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime((long) 22, dateTimeZone74);
        int int86 = dateTimeZone74.getOffsetFromLocal((long) 622);
        long long88 = dateTimeZone45.getMillisKeepLocal(dateTimeZone74, 1644572974558L);
        org.joda.time.DateTime dateTime89 = localDate39.toDateTimeAtCurrentTime(dateTimeZone74);
        org.joda.time.DateMidnight dateMidnight90 = localDate23.toDateMidnight(dateTimeZone74);
        org.joda.time.DateTime dateTime91 = dateTime9.withZoneRetainFields(dateTimeZone74);
        org.joda.time.LocalDate localDate92 = dateTime9.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime81", (dateTime5.compareTo(dateTime81) == 0) == dateTime5.equals(dateTime81));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfDay(5);
        org.joda.time.DateTime.Property property6 = dateTime5.millisOfDay();
        org.joda.time.DateTime dateTime7 = property6.getDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.plusYears(13);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.Chronology chronology17 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.months();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 7, chronology17);
        int int21 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime7.plus(readableDuration22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(chronology24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate27 = localDate25.minus(readablePeriod26);
        org.joda.time.LocalDate localDate29 = localDate25.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate31 = localDate25.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate.Property property32 = localDate25.dayOfWeek();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(chronology33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate36 = localDate34.minus(readablePeriod35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localDate36.toDateTimeAtMidnight(dateTimeZone37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.minus(readablePeriod39);
        org.joda.time.DateTime dateTime42 = dateTime40.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.toDateTime(chronology43);
        org.joda.time.DateTime dateTime46 = dateTime42.withMonthOfYear(5);
        org.joda.time.DateTime.Property property47 = dateTime46.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long52 = dateTimeZone49.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str54 = dateTimeZone49.getNameKey(100L);
        org.joda.time.DateTime dateTime55 = dateTime46.withZoneRetainFields(dateTimeZone49);
        org.joda.time.DateTime dateTime56 = localDate25.toDateTimeAtStartOfDay(dateTimeZone49);
        boolean boolean58 = dateTimeZone49.isStandardOffset((long) 6);
        long long61 = dateTimeZone49.convertLocalToUTC(1644572932963L, true);
        org.joda.time.DateTime dateTime62 = dateTime23.toDateTime(dateTimeZone49);
        org.joda.time.DateTime dateTime63 = dateTime23.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime63 and dateTime56", (dateTime63.compareTo(dateTime56) == 0) == dateTime63.equals(dateTime56));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        java.util.Locale locale4 = new java.util.Locale("yearOfEra", "hourOfDay");
        boolean boolean5 = locale4.hasExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone0, locale4);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.minus(readablePeriod10);
        org.joda.time.LocalDate localDate13 = localDate9.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate15 = localDate9.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate.Property property16 = localDate9.dayOfWeek();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate18.minus(readablePeriod19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.minus(readablePeriod23);
        org.joda.time.DateTime dateTime26 = dateTime24.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.toDateTime(chronology27);
        org.joda.time.DateTime dateTime30 = dateTime26.withMonthOfYear(5);
        org.joda.time.DateTime.Property property31 = dateTime30.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long36 = dateTimeZone33.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str38 = dateTimeZone33.getNameKey(100L);
        org.joda.time.DateTime dateTime39 = dateTime30.withZoneRetainFields(dateTimeZone33);
        org.joda.time.DateTime dateTime40 = localDate9.toDateTimeAtStartOfDay(dateTimeZone33);
        int int42 = dateTimeZone33.getStandardOffset((long) 5);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 22, dateTimeZone33);
        org.joda.time.YearMonthDay yearMonthDay44 = dateTime43.toYearMonthDay();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = dateTime43.withChronology(chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime43.toMutableDateTimeISO();
        java.util.Date date48 = mutableDateTime47.toDate();
        boolean boolean49 = timeZone0.inDaylightTime(date48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and dateTime46", (dateTime43.compareTo(dateTime46) == 0) == dateTime43.equals(dateTime46));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long17 = dateTimeZone15.nextTransition((long) 4);
        org.joda.time.DateTime dateTime18 = dateTime13.withZone(dateTimeZone15);
        org.joda.time.DateTime dateTime20 = dateTime13.minusHours(0);
        org.joda.time.LocalDate localDate21 = dateTime13.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime13", (dateTime18.compareTo(dateTime13) == 0) == dateTime18.equals(dateTime13));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.Chronology chronology10 = chronology9.withUTC();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean16 = localTime14.isSupported(durationFieldType15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime18 = localTime14.minus(readablePeriod17);
        org.joda.time.LocalTime localTime20 = localTime14.plusSeconds(9);
        org.joda.time.Chronology chronology21 = localTime14.getChronology();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(chronology21);
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.yearOfCentury();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology23);
        org.joda.time.DurationField durationField26 = chronology23.eras();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long31 = dateTimeZone28.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str33 = dateTimeZone28.getNameKey(100L);
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.now(dateTimeZone28);
        java.lang.String str35 = dateTimeZone28.toString();
        int int37 = dateTimeZone28.getOffset((long) (short) 10);
        org.joda.time.Chronology chronology38 = chronology23.withZone(dateTimeZone28);
        int int40 = dateTimeZone28.getStandardOffset((long) 99);
        org.joda.time.Chronology chronology41 = chronology9.withZone(dateTimeZone28);
        org.joda.time.DurationField durationField42 = chronology41.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField42, and durationField26", !(durationField26.compareTo(durationField42) == 0) || (Math.signum(durationField26.compareTo(durationField26)) == Math.signum(durationField42.compareTo(durationField26))));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology9.add(readablePeriod10, (-2L), 1);
        long long17 = chronology9.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTimeZone dateTimeZone18 = chronology9.getZone();
        org.joda.time.DurationField durationField19 = chronology9.weeks();
        org.joda.time.DateTimeField dateTimeField20 = chronology9.year();
        org.joda.time.Chronology chronology21 = chronology9.withUTC();
        org.joda.time.DurationField durationField22 = chronology21.eras();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = chronology21.add(readablePeriod23, 1652140799999L, (-2));
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField22", Math.signum(durationField19.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField19)));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime5 = localTime2.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long11 = dateTimeZone8.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str13 = dateTimeZone8.getNameKey(100L);
        org.joda.time.DateTime dateTime14 = dateTime5.toDateTime(dateTimeZone8);
        int int15 = dateTime14.getCenturyOfEra();
        org.joda.time.Instant instant16 = dateTime14.toInstant();
        org.joda.time.Chronology chronology17 = dateTime14.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant16", (dateTime14.compareTo(instant16) == 0) == dateTime14.equals(instant16));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.DateTime dateTime9 = property6.addToCopy(0L);
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.lang.String str12 = dateTime9.toString("11", locale11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate14.minus(readablePeriod15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.minus(readablePeriod19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.DateTime dateTime26 = dateTime24.withWeekOfWeekyear((int) '4');
        org.joda.time.DateTime.Property property27 = dateTime26.centuryOfEra();
        org.joda.time.DateTime dateTime28 = property27.roundHalfCeilingCopy();
        org.joda.time.DateTime.Property property29 = dateTime28.monthOfYear();
        boolean boolean30 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localDate32.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate37 = localDate32.withFieldAdded(durationFieldType35, (int) (short) 0);
        org.joda.time.LocalDate.Property property38 = localDate32.year();
        org.joda.time.LocalDate localDate39 = property38.roundCeilingCopy();
        org.joda.time.LocalDate localDate40 = property38.withMaximumValue();
        org.joda.time.LocalDate localDate42 = property38.addToCopy(7);
        int int43 = localDate42.getDayOfYear();
        org.joda.time.LocalDate localDate45 = localDate42.plusYears((int) '#');
        org.joda.time.LocalTime localTime46 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(35373897);
        org.joda.time.DateTime dateTime49 = localDate45.toDateTime(localTime46, dateTimeZone48);
        org.joda.time.DateTime dateTime50 = dateTime9.withZone(dateTimeZone48);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime50", (dateTime5.compareTo(dateTime50) == 0) == dateTime5.equals(dateTime50));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.plus(readablePeriod2);
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfEra();
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 7);
        org.joda.time.DateTime dateTime9 = dateTime7.plusHours(622);
        org.joda.time.DateTime.Property property10 = dateTime9.monthOfYear();
        org.joda.time.tz.Provider provider11 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet12 = provider11.getAvailableIDs();
        java.util.Set<java.lang.String> strSet13 = provider11.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone15 = provider11.getZone("GMT");
        long long17 = dateTimeZone15.nextTransition(30L);
        org.joda.time.DateTime dateTime18 = dateTime9.withZoneRetainFields(dateTimeZone15);
        int int19 = dateTime9.getMillisOfDay();
        boolean boolean20 = dateTime5.isBefore((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime.Property property21 = dateTime5.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime18", (dateTime9.compareTo(dateTime18) == 0) == dateTime9.equals(dateTime18));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DurationField durationField6 = durationFieldType3.getField(chronology5);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean13 = localTime11.isSupported(durationFieldType12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime11.minus(readablePeriod14);
        org.joda.time.LocalTime localTime17 = localTime11.plusSeconds(9);
        org.joda.time.Chronology chronology18 = localTime11.getChronology();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology18.add(readablePeriod19, (-2L), 1);
        long long26 = chronology18.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology18);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) 9, chronology18);
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) 32770, chronology29);
        org.joda.time.DurationField durationField31 = durationFieldType3.getField(chronology29);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology33);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean36 = localTime34.isSupported(durationFieldType35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalTime localTime38 = localTime34.minus(readablePeriod37);
        org.joda.time.LocalTime localTime40 = localTime34.plusSeconds(9);
        org.joda.time.Chronology chronology41 = localTime34.getChronology();
        org.joda.time.Chronology chronology42 = chronology41.withUTC();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology45);
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean48 = localTime46.isSupported(durationFieldType47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalTime localTime50 = localTime46.minus(readablePeriod49);
        org.joda.time.LocalTime localTime52 = localTime46.plusSeconds(9);
        org.joda.time.Chronology chronology53 = localTime46.getChronology();
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(chronology53);
        org.joda.time.Chronology chronology55 = localTime54.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.yearOfCentury();
        org.joda.time.LocalTime localTime57 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology55);
        org.joda.time.DurationField durationField58 = chronology55.eras();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long63 = dateTimeZone60.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str65 = dateTimeZone60.getNameKey(100L);
        org.joda.time.LocalTime localTime66 = org.joda.time.LocalTime.now(dateTimeZone60);
        java.lang.String str67 = dateTimeZone60.toString();
        int int69 = dateTimeZone60.getOffset((long) (short) 10);
        org.joda.time.Chronology chronology70 = chronology55.withZone(dateTimeZone60);
        int int72 = dateTimeZone60.getStandardOffset((long) 99);
        org.joda.time.Chronology chronology73 = chronology41.withZone(dateTimeZone60);
        boolean boolean74 = durationFieldType3.isSupported(chronology73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField58", Math.signum(durationField6.compareTo(durationField58)) == -Math.signum(durationField58.compareTo(durationField6)));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        int int12 = localDate11.getWeekOfWeekyear();
        int int13 = property8.compareTo((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTime dateTime15 = property8.addWrapFieldToCopy(59);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate17.minus(readablePeriod18);
        org.joda.time.LocalDate localDate21 = localDate17.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate23 = localDate17.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate.Property property24 = localDate17.dayOfWeek();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(chronology25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate28 = localDate26.minus(readablePeriod27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate28.toDateTimeAtMidnight(dateTimeZone29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.minus(readablePeriod31);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.toDateTime(chronology35);
        org.joda.time.DateTime dateTime38 = dateTime34.withMonthOfYear(5);
        org.joda.time.DateTime.Property property39 = dateTime38.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long44 = dateTimeZone41.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str46 = dateTimeZone41.getNameKey(100L);
        org.joda.time.DateTime dateTime47 = dateTime38.withZoneRetainFields(dateTimeZone41);
        org.joda.time.DateTime dateTime48 = localDate17.toDateTimeAtStartOfDay(dateTimeZone41);
        boolean boolean50 = dateTimeZone41.isStandardOffset((long) 6);
        long long53 = dateTimeZone41.convertLocalToUTC(1644572932963L, true);
        org.joda.time.DateTime dateTime54 = dateTime15.toDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime56 = dateTime15.plusMonths((-709));
        org.joda.time.DateTime dateTime58 = dateTime56.withYear(49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime54", (dateTime15.compareTo(dateTime54) == 0) == dateTime15.equals(dateTime54));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTime dateTime9 = dateTime7.withEarlierOffsetAtOverlap();
        long long10 = dateTime9.getMillis();
        org.joda.time.DateTime dateTime12 = dateTime9.withDayOfMonth(2);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.plus(readableDuration13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean16 = dateTime14.isSupported(dateTimeFieldType15);
        org.joda.time.Chronology chronology17 = dateTime14.getChronology();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate20.minus(readablePeriod21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate22.toDateTimeAtMidnight(dateTimeZone23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.minus(readablePeriod25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.toDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = dateTime30.withWeekOfWeekyear((int) '4');
        org.joda.time.Chronology chronology33 = dateTime30.getChronology();
        org.joda.time.DateTime.Property property34 = dateTime30.era();
        org.joda.time.DateTime.Property property35 = dateTime30.dayOfWeek();
        int int36 = dateTime30.getMillisOfDay();
        boolean boolean37 = dateTime18.isAfter((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str41 = dateTimeZone39.getShortName(0L);
        java.lang.String str42 = dateTimeZone39.toString();
        int int44 = dateTimeZone39.getOffsetFromLocal((long) 14);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(dateTimeZone39);
        java.lang.String str46 = dateTimeZone39.getID();
        org.joda.time.DateTime dateTime47 = dateTime18.withZone(dateTimeZone39);
        int int49 = dateTimeZone39.getOffset(1644572949444L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime47", (dateTime18.compareTo(dateTime47) == 0) == dateTime18.equals(dateTime47));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate2.minus(readablePeriod3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtMidnight(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readablePeriod7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        int int13 = dateTime10.getDayOfWeek();
        boolean boolean15 = dateTime10.isEqual((long) 0);
        org.joda.time.DateTime dateTime17 = dateTime10.withMillisOfSecond(23);
        org.joda.time.DateTime dateTime19 = dateTime10.minusMillis(999);
        org.joda.time.DateTime dateTime21 = dateTime10.plusDays(15);
        org.joda.time.DateTime.Property property22 = dateTime10.millisOfDay();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate26 = localDate24.minus(readablePeriod25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate26.toDateTimeAtMidnight(dateTimeZone27);
        org.joda.time.Chronology chronology29 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long34 = dateTimeZone32.nextTransition((long) 4);
        org.joda.time.Chronology chronology35 = chronology29.withZone(dateTimeZone32);
        org.joda.time.DurationField durationField36 = chronology35.millis();
        org.joda.time.DurationField durationField37 = chronology35.seconds();
        org.joda.time.DateTime dateTime38 = dateTime10.toDateTime(chronology35);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((-137249135L), chronology35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime38", (dateTime10.compareTo(dateTime38) == 0) == dateTime10.equals(dateTime38));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        java.lang.String str13 = localTime9.toString();
        int int14 = localTime9.size();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime20 = localTime17.toDateTimeToday(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        int int23 = dateTimeZone21.getStandardOffset((long) 70);
        org.joda.time.DateTime dateTime24 = localTime9.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTime dateTime26 = dateTime24.minusMillis((-1));
        org.joda.time.DateTime.Property property27 = dateTime24.monthOfYear();
        org.joda.time.DateTime dateTime28 = property27.roundHalfEvenCopy();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology30);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.centuries();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.millisOfDay();
        org.joda.time.DurationField durationField35 = chronology32.halfdays();
        org.joda.time.DateTime dateTime36 = dateTime28.withChronology(chronology32);
        org.joda.time.DurationField durationField37 = chronology32.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime36", (dateTime28.compareTo(dateTime36) == 0) == dateTime28.equals(dateTime36));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime5 = localTime2.toDateTimeToday(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long11 = dateTimeZone8.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str13 = dateTimeZone8.getNameKey(100L);
        org.joda.time.DateTime dateTime14 = dateTime5.toDateTime(dateTimeZone8);
        int int15 = dateTime14.getCenturyOfEra();
        org.joda.time.Instant instant16 = dateTime14.toInstant();
        org.joda.time.YearMonthDay yearMonthDay17 = dateTime14.toYearMonthDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant16", (dateTime14.compareTo(instant16) == 0) == dateTime14.equals(instant16));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateMidnight dateMidnight9 = dateTime5.toDateMidnight();
        org.joda.time.DateTime dateTime11 = dateTime5.plusHours((int) (short) -1);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime11.toMutableDateTimeISO();
        java.util.Calendar.Builder builder15 = new java.util.Calendar.Builder();
        java.util.Calendar calendar16 = builder15.build();
        java.util.Calendar.Builder builder20 = builder15.setDate(120, 82800001, 946);
        java.util.TimeZone timeZone21 = java.util.TimeZone.getDefault();
        java.lang.String str22 = timeZone21.getID();
        java.time.ZoneId zoneId23 = timeZone21.toZoneId();
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone(zoneId23);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone24);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone.setDefault(timeZone27);
        boolean boolean29 = timeZone24.hasSameRules(timeZone27);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone24);
        java.util.Calendar.Builder builder31 = builder20.setTimeZone(timeZone24);
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder33 = builder32.clear();
        java.util.Locale locale34 = builder32.build();
        java.util.Locale.Builder builder35 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder36 = builder35.clear();
        java.util.Locale.Builder builder37 = builder36.clearExtensions();
        java.util.Locale locale38 = builder37.build();
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(locale39);
        java.lang.String str41 = locale38.getDisplayCountry(locale39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(chronology42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDate43.toDateTimeAtMidnight(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.withMillisOfDay(5);
        org.joda.time.DateTime.Property property48 = dateTime47.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField49 = property48.getField();
        int int51 = dateTimeField49.getMinimumValue(0L);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(chronology52);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = localDate53.toDateTimeAtMidnight(dateTimeZone54);
        org.joda.time.LocalDate localDate57 = localDate53.withWeekyear(7);
        org.joda.time.LocalDate localDate59 = localDate57.withWeekOfWeekyear(9);
        org.joda.time.LocalDate localDate61 = localDate59.minusWeeks((int) (byte) 0);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        java.lang.String[] strArray68 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        boolean boolean71 = strSet64.addAll((java.util.Collection<java.lang.String>) strList69);
        java.util.Locale locale72 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str74 = locale72.getExtension('a');
        java.util.Set<java.lang.String> strSet75 = locale72.getUnicodeLocaleAttributes();
        java.util.Locale locale76 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str77 = locale72.getDisplayScript(locale76);
        java.util.Locale locale78 = java.util.Locale.ENGLISH;
        java.lang.String str79 = locale76.getDisplayVariant(locale78);
        boolean boolean80 = strSet64.equals((java.lang.Object) locale78);
        java.lang.String str81 = dateTimeField49.getAsText((org.joda.time.ReadablePartial) localDate61, locale78);
        java.lang.String str82 = locale38.getDisplayVariant(locale78);
        java.util.Set<java.lang.String> strSet83 = locale78.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder84 = builder32.setLocale(locale78);
        java.util.Calendar.Builder builder85 = builder31.setLocale(locale78);
        java.lang.String str86 = mutableDateTime13.toString("82800001", locale78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar30 and calendar40", (calendar30.compareTo(calendar40) == 0) == calendar30.equals(calendar40));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.LocalDate localDate9 = dateTime5.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtStartOfDay(dateTimeZone10);
        org.joda.time.Instant instant12 = dateTime11.toInstant();
        org.joda.time.DateTime dateTime13 = dateTime11.withTimeAtStartOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant12", (dateTime5.compareTo(instant12) == 0) == dateTime5.equals(instant12));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("130");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime4.minus(readablePeriod7);
        org.joda.time.LocalTime localTime10 = localTime4.plusSeconds(9);
        org.joda.time.Chronology chronology11 = localTime4.getChronology();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.centuryOfEra();
        org.joda.time.DateTime dateTime14 = dateTime1.withChronology(chronology11);
        org.joda.time.DateTime dateTime16 = dateTime1.minusSeconds(327);
        boolean boolean18 = dateTime16.isBefore(35645531L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime14", (dateTime1.compareTo(dateTime14) == 0) == dateTime1.equals(dateTime14));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localTime5.isSupported(durationFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime5.minus(readablePeriod8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime9, (int) (short) -1, locale11);
        int int14 = dateTimeField2.getMinimumValue(0L);
        long long17 = dateTimeField2.getDifferenceAsLong((long) (short) -1, (long) (byte) 0);
        int int18 = dateTimeField2.getMaximumValue();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalTime localTime24 = localTime22.plus(readablePeriod23);
        java.lang.String str25 = localTime24.toString();
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        java.lang.String str28 = localTime24.toString("1970", locale27);
        java.lang.String str29 = dateTimeField2.getAsText((int) (byte) 1, locale27);
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.now();
        int int31 = dateTimeField2.getMaximumValue((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.DateTime dateTime32 = localTime30.toDateTimeToday();
        org.joda.time.DateTime dateTime33 = dateTime32.withEarlierOffsetAtOverlap();
        long long34 = dateTime32.getMillis();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime36 = dateTime32.minus(readablePeriod35);
        java.util.Locale locale39 = new java.util.Locale("yearOfEra", "hourOfDay");
        boolean boolean40 = locale39.hasExtensions();
        java.lang.String str41 = locale39.getLanguage();
        java.util.Locale locale42 = java.util.Locale.JAPANESE;
        java.util.Locale.setDefault(locale42);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale42);
        java.lang.String str45 = locale42.getDisplayLanguage();
        java.util.Locale.setDefault(locale42);
        java.lang.String str47 = locale39.getDisplayName(locale42);
        boolean boolean48 = locale39.hasExtensions();
        java.util.Locale locale50 = java.util.Locale.forLanguageTag("");
        java.lang.String str51 = locale50.getDisplayScript();
        java.lang.String str52 = locale39.getDisplayCountry(locale50);
        java.util.Calendar calendar53 = dateTime36.toCalendar(locale39);
        org.joda.time.DateTime dateTime54 = dateTime36.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar44 and calendar53", (calendar44.compareTo(calendar53) == 0) == calendar44.equals(calendar53));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTime dateTime9 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readablePeriod10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays(52);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate15.minus(readablePeriod16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate17.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.Chronology chronology20 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long25 = dateTimeZone23.nextTransition((long) 4);
        org.joda.time.Chronology chronology26 = chronology20.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField27 = chronology20.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime11.toMutableDateTime(chronology20);
        org.joda.time.DateTimeField dateTimeField29 = chronology20.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime28", (dateTime5.compareTo(mutableDateTime28) == 0) == dateTime5.equals(mutableDateTime28));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        org.joda.time.DateTime dateTime10 = dateTime7.withDayOfMonth(3);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.toDateTime(chronology21);
        org.joda.time.DateTime dateTime24 = dateTime22.withWeekOfWeekyear((int) '4');
        org.joda.time.Chronology chronology25 = dateTime22.getChronology();
        boolean boolean26 = dateTime7.isEqual((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(chronology27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDate localDate30 = localDate28.minus(readablePeriod29);
        org.joda.time.LocalDate localDate32 = localDate28.plusMonths((int) (byte) 0);
        int int33 = localDate32.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property34 = localDate32.weekyear();
        org.joda.time.LocalDate localDate36 = property34.addToCopy((int) (byte) -1);
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        org.joda.time.DateTimeZone dateTimeZone38 = chronology37.getZone();
        org.joda.time.DateTime dateTime39 = dateTime22.withZone(dateTimeZone38);
        int int40 = dateTime22.getMillisOfDay();
        org.joda.time.DateTime.Property property41 = dateTime22.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime39", (dateTime22.compareTo(dateTime39) == 0) == dateTime22.equals(dateTime39));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.plus(readableDuration6);
        org.joda.time.DateTime dateTime10 = dateTime5.withDurationAdded((long) 0, (int) (byte) 10);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        org.joda.time.DateTime.Property property19 = dateTime18.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology21 = null;
        boolean boolean22 = dateTimeFieldType20.isSupported(chronology21);
        int int23 = dateTime18.get(dateTimeFieldType20);
        boolean boolean24 = dateTime5.isSupported(dateTimeFieldType20);
        org.joda.time.Instant instant25 = dateTime5.toInstant();
        java.util.Date date26 = instant25.toDate();
        date26.setMinutes((-27409550));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant25", (dateTime5.compareTo(instant25) == 0) == dateTime5.equals(instant25));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.secondOfMinute();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology10);
        boolean boolean15 = durationFieldType0.isSupported(chronology10);
        java.lang.String str16 = durationFieldType0.toString();
        java.lang.String str17 = durationFieldType0.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType18.getField(chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean25 = localTime23.isSupported(durationFieldType24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime27 = localTime23.minus(readablePeriod26);
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.lang.String str30 = dateTimeField20.getAsShortText((org.joda.time.ReadablePartial) localTime27, (int) (short) -1, locale29);
        java.lang.String str31 = localTime27.toString();
        int int32 = localTime27.size();
        org.joda.time.LocalTime.Property property33 = localTime27.hourOfDay();
        org.joda.time.LocalTime localTime35 = property33.addNoWrapToCopy((int) (short) 1);
        org.joda.time.LocalTime localTime37 = property33.setCopy(22);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType38.getField(chronology39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology42);
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean45 = localTime43.isSupported(durationFieldType44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalTime localTime47 = localTime43.minus(readablePeriod46);
        java.util.Locale locale49 = java.util.Locale.KOREA;
        java.lang.String str50 = dateTimeField40.getAsShortText((org.joda.time.ReadablePartial) localTime47, (int) (short) -1, locale49);
        java.lang.String str51 = localTime47.toString();
        int int52 = localTime47.size();
        int int53 = localTime47.getMillisOfSecond();
        org.joda.time.DateTimeField[] dateTimeFieldArray54 = localTime47.getFields();
        org.joda.time.LocalTime localTime55 = localTime37.withFields((org.joda.time.ReadablePartial) localTime47);
        org.joda.time.Chronology chronology56 = localTime55.getChronology();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(chronology56);
        org.joda.time.DateTimeZone dateTimeZone58 = chronology56.getZone();
        org.joda.time.DurationField durationField59 = durationFieldType0.getField(chronology56);
        org.joda.time.DateTimeField dateTimeField60 = chronology56.minuteOfDay();
        long long64 = chronology56.add((long) 35373897, 1644572942690L, 32010);
        org.joda.time.DateTimeField dateTimeField65 = chronology56.era();
        org.joda.time.DateTimeField dateTimeField66 = chronology56.dayOfWeek();
        java.lang.String str67 = chronology56.toString();
        org.joda.time.DurationField durationField68 = chronology56.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField59, durationField68, and durationField59", !(durationField59.compareTo(durationField68) == 0) || (Math.signum(durationField59.compareTo(durationField59)) == Math.signum(durationField68.compareTo(durationField59))));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime9.minuteOfDay();
        java.lang.String str15 = property14.getAsString();
        org.joda.time.DateTime dateTime17 = property14.setCopy(100);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfWeek();
        java.util.Date date19 = dateTime17.toDate();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(chronology20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate23 = localDate21.minus(readablePeriod22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate23.toDateTimeAtMidnight(dateTimeZone24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.minus(readablePeriod26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.era();
        int int29 = dateTime27.get(dateTimeFieldType28);
        org.joda.time.DateTime.Property property30 = dateTime27.dayOfYear();
        boolean boolean31 = dateTime17.isEqual((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime.Property property32 = dateTime27.yearOfEra();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(chronology33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate36 = localDate34.minus(readablePeriod35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localDate36.toDateTimeAtMidnight(dateTimeZone37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.minus(readablePeriod39);
        org.joda.time.DateTime dateTime42 = dateTime40.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.toDateTime(chronology43);
        org.joda.time.DateTime dateTime46 = dateTime42.withMonthOfYear(5);
        org.joda.time.DateTime.Property property47 = dateTime46.hourOfDay();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(chronology48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDate localDate51 = localDate49.minus(readablePeriod50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localDate51.toDateTimeAtMidnight(dateTimeZone52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.DateTime dateTime55 = dateTime53.minus(readablePeriod54);
        org.joda.time.DateMidnight dateMidnight56 = dateTime55.toDateMidnight();
        org.joda.time.DateTime dateTime57 = dateTime55.withEarlierOffsetAtOverlap();
        int int58 = dateTime46.compareTo((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime dateTime59 = dateTime46.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate(chronology60);
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        org.joda.time.LocalDate localDate63 = localDate61.minus(readablePeriod62);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = localDate63.toDateTimeAtMidnight(dateTimeZone64);
        org.joda.time.Chronology chronology66 = localDate63.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone68 = chronology66.getZone();
        org.joda.time.DateTime dateTime69 = dateTime46.withZone(dateTimeZone68);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetMillis(43200000);
        java.lang.String str73 = dateTimeZone71.getNameKey(0L);
        org.joda.time.DateTime dateTime74 = dateTime46.toDateTime(dateTimeZone71);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((java.lang.Object) dateTime27, dateTimeZone71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime69", (dateTime13.compareTo(dateTime69) == 0) == dateTime13.equals(dateTime69));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        int int12 = dateTime9.getDayOfWeek();
        boolean boolean14 = dateTime9.isEqual((long) 0);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtMidnight(dateTimeZone17);
        boolean boolean19 = dateTime18.isEqualNow();
        org.joda.time.DateTime dateTime21 = dateTime18.minusYears(82800000);
        org.joda.time.DateTime dateTime23 = dateTime18.plus((-3482730L));
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(chronology24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate27 = localDate25.minus(readablePeriod26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate27.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.minus(readablePeriod30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime35 = dateTime31.withCenturyOfEra((int) (byte) 0);
        java.util.Date date36 = dateTime35.toDate();
        int int37 = dateTime35.getSecondOfDay();
        java.util.Date date38 = dateTime35.toDate();
        org.joda.time.DateTime dateTime40 = dateTime35.withYear((int) (byte) -1);
        org.joda.time.DateTime dateTime42 = dateTime40.withDayOfWeek(2);
        org.joda.time.DateTime dateTime44 = dateTime40.withMillisOfDay(1286);
        boolean boolean45 = dateTime23.isEqual((org.joda.time.ReadableInstant) dateTime44);
        int int46 = dateTime44.getYearOfEra();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDate localDate50 = localDate48.minus(readablePeriod49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = localDate50.toDateTimeAtMidnight(dateTimeZone51);
        org.joda.time.DateTime.Property property53 = dateTime52.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime55 = dateTime52.plus(readableDuration54);
        org.joda.time.DateMidnight dateMidnight56 = dateTime52.toDateMidnight();
        org.joda.time.DateTime dateTime58 = dateTime52.plusHours((int) (short) -1);
        org.joda.time.DateTime dateTime60 = dateTime58.withMonthOfYear(10);
        org.joda.time.Instant instant61 = dateTime60.toInstant();
        boolean boolean62 = dateTime44.isAfter((org.joda.time.ReadableInstant) instant61);
        boolean boolean63 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime60 and instant61", (dateTime60.compareTo(instant61) == 0) == dateTime60.equals(instant61));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfDay(5);
        org.joda.time.DateTime dateTime6 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property7 = dateTime5.weekOfWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        boolean boolean10 = dateTime8.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant9", (dateTime3.compareTo(instant9) == 0) == dateTime3.equals(instant9));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(7);
        java.util.Locale locale4 = new java.util.Locale("", "UTC");
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) locale4);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(locale4);
        calendar7.setFirstDayOfWeek(54675054);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate16 = localDate11.withFieldAdded(durationFieldType14, (int) (short) 0);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(locale17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        java.util.Date date23 = localDate20.toDate();
        calendar18.setTime(date23);
        boolean boolean25 = localDate11.equals((java.lang.Object) calendar18);
        java.lang.String str26 = calendar18.getCalendarType();
        calendar18.setTimeInMillis((long) 32);
        java.util.TimeZone timeZone29 = calendar18.getTimeZone();
        calendar7.setTimeZone(timeZone29);
        int int32 = timeZone29.getOffset(4181774471889000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar7", (calendar5.compareTo(calendar7) == 0) == calendar5.equals(calendar7));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime5 = localTime2.toDateTimeToday(dateTimeZone4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology7);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean10 = localTime8.isSupported(durationFieldType9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime8.minus(readablePeriod11);
        org.joda.time.LocalTime localTime14 = localTime8.plusSeconds(9);
        org.joda.time.Chronology chronology15 = localTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.minuteOfHour();
        org.joda.time.DateTime dateTime17 = dateTime5.toDateTime(chronology15);
        int int18 = dateTime17.getMinuteOfDay();
        org.joda.time.DateTime dateTime20 = dateTime17.plusMinutes(78822310);
        org.joda.time.DateTime dateTime22 = dateTime20.minusDays(141);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime17", (dateTime5.compareTo(dateTime17) == 0) == dateTime5.equals(dateTime17));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTime.Property property9 = dateTime7.dayOfMonth();
        org.joda.time.Instant instant10 = dateTime7.toInstant();
        org.joda.time.DateTime.Property property11 = dateTime7.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant10", (dateTime7.compareTo(instant10) == 0) == dateTime7.equals(instant10));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withMillisOfDay(5);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfWeek();
        boolean boolean17 = dateTime5.equals((java.lang.Object) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime15.plus((long) 22);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.withPeriodAdded(readablePeriod20, 35405662);
        int int23 = dateTime22.getMillisOfDay();
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        org.joda.time.Chronology chronology27 = dateTimeFormatter26.getChronolgy();
        boolean boolean28 = dateTimeFormatter26.isParser();
        org.joda.time.Chronology chronology29 = dateTimeFormatter26.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter26.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter26.withZoneUTC();
        boolean boolean32 = dateTimeFormatter26.isParser();
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(locale33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localDate36.toDateTimeAtMidnight(dateTimeZone37);
        java.util.Date date39 = localDate36.toDate();
        calendar34.setTime(date39);
        java.util.TimeZone timeZone41 = calendar34.getTimeZone();
        calendar34.clear();
        calendar34.clear();
        java.util.TimeZone timeZone44 = java.util.TimeZone.getDefault();
        java.lang.String str45 = timeZone44.getID();
        int int46 = timeZone44.getRawOffset();
        boolean boolean47 = timeZone44.observesDaylightTime();
        calendar34.setTimeZone(timeZone44);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        boolean boolean50 = calendar34.before((java.lang.Object) dateTimeZone49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter26.withZone(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime22.withZone(dateTimeZone49);
        org.joda.time.DateTime dateTime53 = dateTime22.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime53 and dateTime52", (dateTime53.compareTo(dateTime52) == 0) == dateTime53.equals(dateTime52));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withMillisOfDay(5);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfWeek();
        boolean boolean17 = dateTime5.equals((java.lang.Object) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime5.withWeekyear((-292275054));
        org.joda.time.DateTime.Property property20 = dateTime5.millisOfDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate22.minus(readablePeriod23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate24.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.plus(readableDuration27);
        org.joda.time.DateTime dateTime31 = dateTime26.withDurationAdded((long) 0, (int) (byte) 10);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate35 = localDate33.minus(readablePeriod34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localDate35.toDateTimeAtMidnight(dateTimeZone36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.minus(readablePeriod38);
        org.joda.time.DateTime.Property property40 = dateTime39.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology42 = null;
        boolean boolean43 = dateTimeFieldType41.isSupported(chronology42);
        int int44 = dateTime39.get(dateTimeFieldType41);
        boolean boolean45 = dateTime26.isSupported(dateTimeFieldType41);
        org.joda.time.Instant instant46 = dateTime26.toInstant();
        int int47 = dateTime5.compareTo((org.joda.time.ReadableInstant) instant46);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(1644573225369L);
        boolean boolean50 = dateTime5.isBefore((org.joda.time.ReadableInstant) dateTime49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant46", (dateTime13.compareTo(instant46) == 0) == dateTime13.equals(instant46));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis(32772);
        org.joda.time.DateTime dateTime9 = dateTime5.withMillis((long) ' ');
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        int int11 = dateTime9.getYearOfEra();
        org.joda.time.DateTime.Property property12 = dateTime9.weekyear();
        org.joda.time.DateTime.Property property13 = dateTime9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long18 = dateTimeZone15.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone15);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.LocalDate localDate22 = localDate19.withField(dateTimeFieldType20, (int) 'a');
        org.joda.time.DateTime dateTime23 = localDate19.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDate localDate25 = localDate19.plus(readablePeriod24);
        org.joda.time.LocalDate.Property property26 = localDate25.dayOfMonth();
        int int27 = localDate25.getEra();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate32 = localDate30.plus(readablePeriod31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology34 = null;
        boolean boolean35 = dateTimeFieldType33.isSupported(chronology34);
        boolean boolean36 = localDate32.isSupported(dateTimeFieldType33);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(chronology37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDate localDate40 = localDate38.minus(readablePeriod39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localDate40.toDateTimeAtMidnight(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.plusMillis(32772);
        org.joda.time.DateTime dateTime46 = dateTime42.withMillis((long) ' ');
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDate localDate50 = localDate48.plus(readablePeriod49);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology52 = null;
        boolean boolean53 = dateTimeFieldType51.isSupported(chronology52);
        boolean boolean54 = localDate50.isSupported(dateTimeFieldType51);
        int int55 = dateTime46.get(dateTimeFieldType51);
        boolean boolean56 = localDate32.isSupported(dateTimeFieldType51);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate(chronology57);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = localDate58.toDateTimeAtMidnight(dateTimeZone59);
        boolean boolean61 = localDate32.isEqual((org.joda.time.ReadablePartial) localDate58);
        org.joda.time.LocalDate localDate63 = localDate58.minusMonths(32770);
        org.joda.time.LocalTime localTime64 = null;
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long70 = dateTimeZone67.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str72 = dateTimeZone67.getNameKey(100L);
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate((long) 10, dateTimeZone67);
        org.joda.time.DateTime dateTime74 = localDate63.toDateTime(localTime64, dateTimeZone67);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(1644572942500L, dateTimeZone67);
        org.joda.time.DateTime dateTime77 = dateTime75.withMillis((long) 99);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str80 = dateTimeZone78.getShortName(1644572938028L);
        java.util.TimeZone timeZone81 = dateTimeZone78.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime82 = dateTime75.toMutableDateTime(dateTimeZone78);
        org.joda.time.DateTime dateTime83 = localDate25.toDateTimeAtCurrentTime(dateTimeZone78);
        boolean boolean84 = dateTimeZone78.isFixed();
        org.joda.time.DateTime dateTime85 = dateTime9.toDateTime(dateTimeZone78);
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime(dateTimeZone78);
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.LocalDate localDate88 = new org.joda.time.LocalDate(chronology87);
        org.joda.time.DateTimeZone dateTimeZone89 = null;
        org.joda.time.DateTime dateTime90 = localDate88.toDateTimeAtMidnight(dateTimeZone89);
        org.joda.time.DateTime dateTime92 = dateTime90.withMillisOfDay(5);
        org.joda.time.DateTime dateTime94 = dateTime92.plusDays(1);
        int int95 = dateTime92.getCenturyOfEra();
        int int96 = dateTime92.getEra();
        boolean boolean97 = dateTimeZone78.equals((java.lang.Object) int96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime75 and mutableDateTime82", (dateTime75.compareTo(mutableDateTime82) == 0) == dateTime75.equals(mutableDateTime82));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(86399, 1, 13);
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths(2000);
        org.joda.time.LocalDate localDate7 = localDate3.withWeekyear((-2731));
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.minus(readablePeriod10);
        org.joda.time.LocalDate localDate13 = localDate9.plusMonths((int) (byte) 0);
        int int14 = localDate13.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property15 = localDate13.weekyear();
        int int16 = localDate13.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Interval interval18 = localDate13.toInterval(dateTimeZone17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate20.minus(readablePeriod21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate22.toDateTimeAtMidnight(dateTimeZone23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.minus(readablePeriod25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.toDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = dateTime28.withMonthOfYear(5);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long36 = dateTimeZone34.nextTransition((long) 4);
        org.joda.time.DateTime dateTime37 = dateTime32.withZone(dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight38 = localDate13.toDateMidnight(dateTimeZone34);
        org.joda.time.LocalDate localDate39 = localDate7.withFields((org.joda.time.ReadablePartial) localDate13);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(chronology40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDate localDate43 = localDate41.plus(readablePeriod42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate45.toDateTimeAtMidnight(dateTimeZone46);
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate50 = localDate45.withFieldAdded(durationFieldType48, (int) (short) 0);
        org.joda.time.LocalDate localDate52 = localDate43.withFieldAdded(durationFieldType48, 19);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate(chronology53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDate localDate56 = localDate54.minus(readablePeriod55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = localDate56.toDateTimeAtMidnight(dateTimeZone57);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.DateTime dateTime60 = dateTime58.minus(readablePeriod59);
        org.joda.time.DateTime dateTime62 = dateTime60.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = dateTime62.toDateTime(chronology63);
        org.joda.time.DateTime dateTime66 = dateTime62.withMonthOfYear(5);
        org.joda.time.DateTime.Property property67 = dateTime66.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long72 = dateTimeZone69.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str74 = dateTimeZone69.getNameKey(100L);
        org.joda.time.DateTime dateTime75 = dateTime66.withZoneRetainFields(dateTimeZone69);
        boolean boolean76 = dateTime75.isAfterNow();
        org.joda.time.DateTime dateTime77 = localDate43.toDateTime((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.LocalDate.Property property78 = localDate43.era();
        org.joda.time.LocalDate localDate80 = localDate43.minusWeeks((int) (byte) 0);
        org.joda.time.LocalDate localDate82 = localDate43.minusYears(120);
        org.joda.time.LocalDate localDate83 = localDate7.withFields((org.joda.time.ReadablePartial) localDate82);
        org.joda.time.Chronology chronology84 = localDate7.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime37", (dateTime32.compareTo(dateTime37) == 0) == dateTime32.equals(dateTime37));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfDay(5);
        org.joda.time.DateTime dateTime6 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property7 = dateTime5.weekOfWeekyear();
        org.joda.time.DateTime dateTime9 = dateTime5.withYearOfCentury((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTimeISO();
        boolean boolean12 = dateTime9.isEqual((long) 34);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate14.minus(readablePeriod15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMillis(32772);
        org.joda.time.DateTime dateTime22 = dateTime18.withMillis((long) ' ');
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate26 = localDate24.plus(readablePeriod25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology28 = null;
        boolean boolean29 = dateTimeFieldType27.isSupported(chronology28);
        boolean boolean30 = localDate26.isSupported(dateTimeFieldType27);
        int int31 = dateTime22.get(dateTimeFieldType27);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate35 = localDate33.minus(readablePeriod34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localDate35.toDateTimeAtMidnight(dateTimeZone36);
        org.joda.time.Chronology chronology38 = localDate35.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long43 = dateTimeZone41.nextTransition((long) 4);
        org.joda.time.Chronology chronology44 = chronology38.withZone(dateTimeZone41);
        org.joda.time.DurationField durationField45 = chronology44.millis();
        boolean boolean46 = dateTimeFieldType27.isSupported(chronology44);
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(chronology44);
        org.joda.time.DateTimeField dateTimeField48 = chronology44.hourOfDay();
        org.joda.time.DateTime dateTime49 = dateTime9.withChronology(chronology44);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime51 = dateTime9.plus(readablePeriod50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and dateTime49", (mutableDateTime10.compareTo(dateTime49) == 0) == mutableDateTime10.equals(dateTime49));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.withMonthOfYear(5);
        org.joda.time.DateTime.Property property14 = dateTime9.minuteOfDay();
        java.lang.String str15 = property14.getAsString();
        org.joda.time.DateTime dateTime17 = property14.setCopy(100);
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfWeek();
        org.joda.time.DateTime dateTime20 = property18.addToCopy((-2731));
        org.joda.time.DateTime dateTime22 = dateTime20.minusSeconds(1286);
        org.joda.time.DateTime.Property property23 = dateTime20.minuteOfDay();
        org.joda.time.DateTime dateTime26 = dateTime20.withDurationAdded((-2174947200001L), 1899);
        org.joda.time.DateTime dateTime28 = dateTime20.minusMonths(7);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDate30.toDateTimeAtMidnight(dateTimeZone31);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate35 = localDate30.withFieldAdded(durationFieldType33, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str39 = dateTimeZone37.getShortName(0L);
        java.lang.String str40 = dateTimeZone37.toString();
        java.util.TimeZone timeZone41 = dateTimeZone37.toTimeZone();
        org.joda.time.DateTime dateTime42 = localDate35.toDateTimeAtCurrentTime(dateTimeZone37);
        long long45 = dateTimeZone37.convertLocalToUTC((long) 2022, true);
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime28.toMutableDateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime48 = dateTime28.plusHours(51);
        boolean boolean50 = dateTime48.isBefore(61915103519994L);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate(chronology51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDate localDate54 = localDate52.minus(readablePeriod53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = localDate54.toDateTimeAtMidnight(dateTimeZone55);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.DateTime dateTime58 = dateTime56.minus(readablePeriod57);
        org.joda.time.DateMidnight dateMidnight59 = dateTime58.toDateMidnight();
        org.joda.time.DateTime dateTime60 = dateTime58.withEarlierOffsetAtOverlap();
        long long61 = dateTime60.getMillis();
        org.joda.time.DateTime.Property property62 = dateTime60.minuteOfHour();
        org.joda.time.DateTime dateTime63 = property62.withMinimumValue();
        org.joda.time.DateTime dateTime64 = dateTime63.toDateTimeISO();
        boolean boolean65 = dateTime48.isEqual((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTime dateTime67 = dateTime64.plusWeeks(335);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and mutableDateTime46", (dateTime28.compareTo(mutableDateTime46) == 0) == dateTime28.equals(mutableDateTime46));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        java.lang.Integer int4 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-2022));
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.minutes();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean13 = localTime11.isSupported(durationFieldType12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime11.minus(readablePeriod14);
        org.joda.time.LocalTime localTime17 = localTime11.plusSeconds(9);
        org.joda.time.Chronology chronology18 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.hourOfDay();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj8, chronology18);
        org.joda.time.DurationField durationField22 = chronology18.halfdays();
        org.joda.time.DurationField durationField23 = durationFieldType7.getField(chronology18);
        org.joda.time.DateTimeField dateTimeField24 = chronology18.monthOfYear();
        org.joda.time.DateTimeField dateTimeField25 = chronology18.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        int int31 = dateTimeZone28.getStandardOffset((long) (short) 0);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(0L, dateTimeZone28);
        org.joda.time.Chronology chronology33 = chronology18.withZone(dateTimeZone28);
        long long35 = dateTimeZone28.convertUTCToLocal((long) (-292275054));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter2.withZone(dateTimeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter38.withZoneUTC();
        java.lang.Object obj40 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours(240);
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone42);
        java.util.TimeZone timeZone44 = dateTimeZone42.toTimeZone();
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(obj40, dateTimeZone42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter38.withZone(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime43", (dateTime21.compareTo(dateTime43) == 0) == dateTime21.equals(dateTime43));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTime dateTime9 = dateTime7.withEarlierOffsetAtOverlap();
        long long10 = dateTime9.getMillis();
        org.joda.time.DateTime dateTime12 = dateTime9.withDayOfMonth(2);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.plus(readableDuration13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean16 = dateTime14.isSupported(dateTimeFieldType15);
        org.joda.time.Chronology chronology17 = dateTime14.getChronology();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate20.minus(readablePeriod21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate22.toDateTimeAtMidnight(dateTimeZone23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.minus(readablePeriod25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.toDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = dateTime30.withWeekOfWeekyear((int) '4');
        org.joda.time.Chronology chronology33 = dateTime30.getChronology();
        org.joda.time.DateTime.Property property34 = dateTime30.era();
        org.joda.time.DateTime.Property property35 = dateTime30.dayOfWeek();
        int int36 = dateTime30.getMillisOfDay();
        boolean boolean37 = dateTime18.isAfter((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.String str41 = dateTimeZone39.getShortName(0L);
        java.lang.String str42 = dateTimeZone39.toString();
        int int44 = dateTimeZone39.getOffsetFromLocal((long) 14);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(dateTimeZone39);
        java.lang.String str46 = dateTimeZone39.getID();
        org.joda.time.DateTime dateTime47 = dateTime18.withZone(dateTimeZone39);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(dateTimeZone39);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(chronology49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDate localDate52 = localDate50.minus(readablePeriod51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = localDate52.toDateTimeAtMidnight(dateTimeZone53);
        java.util.TimeZone timeZone55 = java.util.TimeZone.getDefault();
        java.lang.String str56 = timeZone55.getID();
        java.time.ZoneId zoneId57 = timeZone55.toZoneId();
        boolean boolean58 = dateTime54.equals((java.lang.Object) timeZone55);
        java.util.Date date65 = new java.util.Date(32, (int) (short) 0, 4, 15, 15, 3);
        org.joda.time.LocalDate localDate66 = org.joda.time.LocalDate.fromDateFields(date65);
        boolean boolean67 = dateTime54.equals((java.lang.Object) date65);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean69 = dateTime54.isSupported(dateTimeFieldType68);
        int int70 = dateTime54.getDayOfMonth();
        org.joda.time.DateTime dateTime72 = dateTime54.minusWeeks(9);
        org.joda.time.DateTime dateTime74 = dateTime72.minusMillis(35373897);
        org.joda.time.DateTime dateTime75 = dateTime72.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property76 = dateTime72.weekyear();
        int int77 = dateTime48.compareTo((org.joda.time.ReadableInstant) dateTime72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime47", (dateTime18.compareTo(dateTime47) == 0) == dateTime18.equals(dateTime47));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTime.Property property9 = dateTime7.dayOfMonth();
        org.joda.time.DateTime.Property property10 = dateTime7.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime7.withPeriodAdded(readablePeriod11, 2022);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMillis(1899);
        org.joda.time.DateTime dateTime17 = dateTime13.minusMonths(4);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate21 = localDate19.minus(readablePeriod20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localDate21.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.Chronology chronology24 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long29 = dateTimeZone27.nextTransition((long) 4);
        org.joda.time.Chronology chronology30 = chronology24.withZone(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField31 = chronology30.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone32 = chronology30.getZone();
        org.joda.time.DateTime dateTime33 = dateTime13.withZone(dateTimeZone32);
        java.util.TimeZone timeZone34 = dateTimeZone32.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime33", (dateTime5.compareTo(dateTime33) == 0) == dateTime5.equals(dateTime33));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate1.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate localDate9 = localDate1.minusYears((int) 'x');
        org.joda.time.LocalDate localDate11 = localDate1.plusYears((-1878));
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks((-27409550));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long18 = dateTimeZone15.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone15);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.LocalDate localDate22 = localDate19.withField(dateTimeFieldType20, (int) 'a');
        org.joda.time.DateTime dateTime23 = localDate19.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDate localDate25 = localDate19.plus(readablePeriod24);
        org.joda.time.LocalDate.Property property26 = localDate25.dayOfMonth();
        int int27 = localDate25.getEra();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate32 = localDate30.plus(readablePeriod31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology34 = null;
        boolean boolean35 = dateTimeFieldType33.isSupported(chronology34);
        boolean boolean36 = localDate32.isSupported(dateTimeFieldType33);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(chronology37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDate localDate40 = localDate38.minus(readablePeriod39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localDate40.toDateTimeAtMidnight(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.plusMillis(32772);
        org.joda.time.DateTime dateTime46 = dateTime42.withMillis((long) ' ');
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDate localDate50 = localDate48.plus(readablePeriod49);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology52 = null;
        boolean boolean53 = dateTimeFieldType51.isSupported(chronology52);
        boolean boolean54 = localDate50.isSupported(dateTimeFieldType51);
        int int55 = dateTime46.get(dateTimeFieldType51);
        boolean boolean56 = localDate32.isSupported(dateTimeFieldType51);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate(chronology57);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = localDate58.toDateTimeAtMidnight(dateTimeZone59);
        boolean boolean61 = localDate32.isEqual((org.joda.time.ReadablePartial) localDate58);
        org.joda.time.LocalDate localDate63 = localDate58.minusMonths(32770);
        org.joda.time.LocalTime localTime64 = null;
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long70 = dateTimeZone67.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str72 = dateTimeZone67.getNameKey(100L);
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate((long) 10, dateTimeZone67);
        org.joda.time.DateTime dateTime74 = localDate63.toDateTime(localTime64, dateTimeZone67);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(1644572942500L, dateTimeZone67);
        org.joda.time.DateTime dateTime77 = dateTime75.withMillis((long) 99);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str80 = dateTimeZone78.getShortName(1644572938028L);
        java.util.TimeZone timeZone81 = dateTimeZone78.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime82 = dateTime75.toMutableDateTime(dateTimeZone78);
        org.joda.time.DateTime dateTime83 = localDate25.toDateTimeAtCurrentTime(dateTimeZone78);
        boolean boolean84 = dateTimeZone78.isFixed();
        org.joda.time.DateTime dateTime85 = localDate13.toDateTimeAtCurrentTime(dateTimeZone78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime75 and mutableDateTime82", (dateTime75.compareTo(mutableDateTime82) == 0) == dateTime75.equals(mutableDateTime82));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.secondOfMinute();
        org.joda.time.Chronology chronology13 = chronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.hourOfHalfday();
        org.joda.time.DurationField durationField15 = chronology13.eras();
        org.joda.time.DurationField durationField16 = chronology13.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField16, and durationField15", !(durationField15.compareTo(durationField16) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField16.compareTo(durationField15))));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        org.joda.time.Instant instant9 = dateTime7.toInstant();
        org.joda.time.DateTime.Property property10 = dateTime7.centuryOfEra();
        org.joda.time.DateTime dateTime12 = property10.addToCopy(269);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant9", (dateTime5.compareTo(instant9) == 0) == dateTime5.equals(instant9));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime dateTime7 = dateTime3.plus((-25L));
        org.joda.time.DateTime dateTime9 = dateTime3.withMillisOfDay(2022);
        org.joda.time.DateTime dateTime11 = dateTime9.plusDays(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime.Property property13 = dateTime11.property(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime11.minusDays(79200000);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 5);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = dateTime15.toDateTime(dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight21 = dateTime15.toDateMidnight();
        org.joda.time.DateTime dateTime23 = dateTime15.plusMonths(32010);
        org.joda.time.DateTime dateTime25 = dateTime15.minusSeconds(41);
        org.joda.time.DateTime dateTime27 = dateTime15.plusMillis(78822310);
        int int28 = dateTime27.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime20", (dateTime15.compareTo(dateTime20) == 0) == dateTime15.equals(dateTime20));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        int int4 = localDate3.getEra();
        int int5 = localDate3.getEra();
        org.joda.time.LocalDate.Property property6 = localDate3.centuryOfEra();
        org.joda.time.LocalDate localDate7 = property6.roundCeilingCopy();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate14 = localDate9.withFieldAdded(durationFieldType12, (int) (short) 0);
        org.joda.time.LocalDate.Property property15 = localDate9.year();
        org.joda.time.LocalDate localDate16 = property15.roundCeilingCopy();
        org.joda.time.LocalDate localDate17 = property15.withMaximumValue();
        org.joda.time.LocalDate localDate19 = property15.addToCopy(7);
        int int20 = localDate19.getDayOfYear();
        org.joda.time.LocalDate localDate22 = localDate19.minusDays(6);
        org.joda.time.DateTime dateTime23 = localDate19.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDate localDate25 = localDate19.minus(readablePeriod24);
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = null;
        org.joda.time.format.DateTimeParser dateTimeParser27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter26, dateTimeParser27);
        org.joda.time.Chronology chronology29 = dateTimeFormatter28.getChronolgy();
        org.joda.time.Chronology chronology30 = dateTimeFormatter28.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter28.withZoneUTC();
        boolean boolean32 = dateTimeFormatter31.isParser();
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeFormatter31.getZone();
        org.joda.time.DateTime dateTime34 = localDate19.toDateTimeAtCurrentTime(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = localDate7.toDateTimeAtStartOfDay(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime34", (dateTime23.compareTo(dateTime34) == 0) == dateTime23.equals(dateTime34));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime2.minus(readablePeriod5);
        org.joda.time.LocalTime localTime8 = localTime2.plusSeconds(9);
        org.joda.time.Chronology chronology9 = localTime2.getChronology();
        org.joda.time.Chronology chronology10 = chronology9.withUTC();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = chronology10.add(readablePeriod12, 4810530814L, 49);
        org.joda.time.DurationField durationField16 = chronology10.eras();
        org.joda.time.DurationField durationField17 = chronology10.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField17, and durationField16", !(durationField16.compareTo(durationField17) == 0) || (Math.signum(durationField16.compareTo(durationField16)) == Math.signum(durationField17.compareTo(durationField16))));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 100);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.minus(readablePeriod2);
        org.joda.time.LocalTime localTime5 = localTime1.withMillisOfSecond(40);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfSecond();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean12 = localTime10.isSupported(durationFieldType11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime10.minus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime10.plusSeconds(9);
        org.joda.time.Chronology chronology17 = localTime10.getChronology();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = chronology17.add(readablePeriod18, (-2L), 1);
        long long25 = chronology17.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology17);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) 9, chronology17);
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.secondOfDay();
        org.joda.time.DurationField durationField30 = chronology28.centuries();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((java.lang.Object) localTime5, chronology28);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = localTime5.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType34.getField(chronology35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology38);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean41 = localTime39.isSupported(durationFieldType40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalTime localTime43 = localTime39.minus(readablePeriod42);
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.lang.String str46 = dateTimeField36.getAsShortText((org.joda.time.ReadablePartial) localTime43, (int) (short) -1, locale45);
        java.lang.String str47 = localTime43.toString();
        int int48 = localTime43.size();
        org.joda.time.LocalTime.Property property49 = localTime43.hourOfDay();
        org.joda.time.LocalTime localTime51 = property49.addNoWrapToCopy((int) (short) 1);
        org.joda.time.LocalTime localTime53 = property49.setCopy(22);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTimeField dateTimeField56 = dateTimeFieldType54.getField(chronology55);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology58);
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean61 = localTime59.isSupported(durationFieldType60);
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        org.joda.time.LocalTime localTime63 = localTime59.minus(readablePeriod62);
        java.util.Locale locale65 = java.util.Locale.KOREA;
        java.lang.String str66 = dateTimeField56.getAsShortText((org.joda.time.ReadablePartial) localTime63, (int) (short) -1, locale65);
        java.lang.String str67 = localTime63.toString();
        int int68 = localTime63.size();
        int int69 = localTime63.getMillisOfSecond();
        org.joda.time.DateTimeField[] dateTimeFieldArray70 = localTime63.getFields();
        org.joda.time.LocalTime localTime71 = localTime53.withFields((org.joda.time.ReadablePartial) localTime63);
        org.joda.time.Chronology chronology72 = localTime71.getChronology();
        org.joda.time.DurationField durationField73 = chronology72.millis();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 5);
        org.joda.time.DateTime dateTime77 = org.joda.time.DateTime.now(dateTimeZone76);
        long long81 = dateTimeZone76.convertLocalToUTC(1644572942340L, false, (long) 990);
        int int83 = dateTimeZone76.getOffset(0L);
        org.joda.time.Chronology chronology84 = chronology72.withZone(dateTimeZone76);
        org.joda.time.DateTimeField dateTimeField85 = chronology72.dayOfMonth();
        boolean boolean86 = localTime5.equals((java.lang.Object) chronology72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime32", (dateTime26.compareTo(dateTime32) == 0) == dateTime26.equals(dateTime32));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean5 = localTime3.isSupported(durationFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime3.minus(readablePeriod6);
        org.joda.time.LocalTime localTime9 = localTime3.plusSeconds(9);
        org.joda.time.Chronology chronology10 = localTime3.getChronology();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology12);
        org.joda.time.DurationField durationField15 = chronology12.eras();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long20 = dateTimeZone17.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str22 = dateTimeZone17.getNameKey(100L);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.now(dateTimeZone17);
        java.lang.String str24 = dateTimeZone17.toString();
        int int26 = dateTimeZone17.getOffset((long) (short) 10);
        org.joda.time.Chronology chronology27 = chronology12.withZone(dateTimeZone17);
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.now(chronology12);
        org.joda.time.DurationField durationField29 = chronology12.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField29, and durationField15", !(durationField15.compareTo(durationField29) == 0) || (Math.signum(durationField15.compareTo(durationField15)) == Math.signum(durationField29.compareTo(durationField15))));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.DateTime dateTime9 = property6.addToCopy(0L);
        org.joda.time.DateTime dateTime11 = dateTime9.minusHours((-1878));
        org.joda.time.Instant instant12 = dateTime11.toInstant();
        boolean boolean14 = dateTime11.isAfter((-19649634818000L));
        org.joda.time.DateTime dateTime16 = dateTime11.minus(0L);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes(985);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant12", (dateTime16.compareTo(instant12) == 0) == dateTime16.equals(instant12));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfDay(5);
        org.joda.time.DateTime dateTime7 = dateTime3.withCenturyOfEra(20);
        org.joda.time.Instant instant8 = dateTime3.toInstant();
        org.joda.time.DateTime.Property property9 = dateTime3.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant8", (dateTime3.compareTo(instant8) == 0) == dateTime3.equals(instant8));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set(16, 100, 52, (int) ' ', 59);
        calendar1.setMinimalDaysInFirstWeek(31);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        calendar11.set(5, (int) 'x', 23);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar11);
        java.util.Date date22 = new java.util.Date((-292275054), 2022, 13, 53, (-2731));
        calendar11.setTime(date22);
        calendar1.setTime(date22);
        date22.setMinutes(1932);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar11", (calendar1.compareTo(calendar11) == 0) == calendar1.equals(calendar11));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean11 = localTime9.isSupported(durationFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime9.minus(readablePeriod12);
        org.joda.time.LocalTime localTime15 = localTime9.plusSeconds(9);
        org.joda.time.Chronology chronology16 = localTime9.getChronology();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = chronology16.add(readablePeriod17, (-2L), 1);
        long long24 = chronology16.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType6.getField(chronology16);
        org.joda.time.DateTimeField dateTimeField27 = chronology16.dayOfYear();
        org.joda.time.DurationField durationField28 = chronology16.seconds();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(0L, chronology16);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology31);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime35 = localTime32.toDateTimeToday(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime35.getZone();
        int int38 = dateTimeZone36.getStandardOffset((-2L));
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology40);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean43 = localTime41.isSupported(durationFieldType42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalTime localTime45 = localTime41.minus(readablePeriod44);
        org.joda.time.LocalTime localTime47 = localTime41.plusSeconds(9);
        org.joda.time.Chronology chronology48 = localTime41.getChronology();
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        long long52 = chronology48.add(readablePeriod49, (-2L), 1);
        long long56 = chronology48.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTimeZone dateTimeZone57 = chronology48.getZone();
        long long59 = dateTimeZone36.getMillisKeepLocal(dateTimeZone57, (-2L));
        java.util.TimeZone timeZone60 = dateTimeZone36.toTimeZone();
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(dateTimeZone36);
        org.joda.time.Chronology chronology62 = chronology16.withZone(dateTimeZone36);
        boolean boolean63 = durationFieldType3.isSupported(chronology16);
        org.joda.time.DateTime dateTime65 = org.joda.time.DateTime.parse("999");
        org.joda.time.DateTime dateTime67 = dateTime65.minusWeeks((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone68 = dateTime65.getZone();
        org.joda.time.Chronology chronology69 = dateTime65.getChronology();
        boolean boolean70 = durationFieldType3.isSupported(chronology69);
        org.joda.time.DurationField durationField71 = chronology69.centuries();
        org.joda.time.DurationField durationField72 = chronology69.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField72, durationField28, and durationField71", !(durationField72.compareTo(durationField28) == 0) || (Math.signum(durationField72.compareTo(durationField71)) == Math.signum(durationField28.compareTo(durationField71))));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        int int12 = dateTime11.getWeekOfWeekyear();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("Mon Jan 10 01:02:00 UTC 1916");
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTime dateTime16 = dateTime11.withZone(dateTimeZone15);
        org.joda.time.DateTime.Property property17 = dateTime16.weekyear();
        org.joda.time.DateTime dateTime19 = property17.setCopy(35458525);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localDate21.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate26 = localDate21.withFieldAdded(durationFieldType24, (int) (short) 0);
        org.joda.time.LocalDate.Property property27 = localDate21.year();
        org.joda.time.LocalDate localDate28 = property27.roundCeilingCopy();
        org.joda.time.LocalDate localDate29 = property27.withMaximumValue();
        org.joda.time.LocalDate localDate31 = property27.addToCopy(7);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray32 = localDate31.getFieldTypes();
        org.joda.time.LocalDate localDate34 = localDate31.withYear(622);
        org.joda.time.LocalDate localDate36 = localDate31.minusDays(0);
        java.util.Date date37 = localDate31.toDate();
        int int38 = property17.compareTo((org.joda.time.ReadablePartial) localDate31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime16", (dateTime9.compareTo(dateTime16) == 0) == dateTime9.equals(dateTime16));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set(16, 100, 52, (int) ' ', 59);
        calendar1.setMinimalDaysInFirstWeek(31);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        calendar11.set(5, (int) 'x', 23);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar11);
        java.util.Date date22 = new java.util.Date((-292275054), 2022, 13, 53, (-2731));
        calendar11.setTime(date22);
        calendar1.setTime(date22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(chronology25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate28 = localDate26.minus(readablePeriod27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate28.toDateTimeAtMidnight(dateTimeZone29);
        org.joda.time.DateTime.Property property31 = dateTime30.secondOfMinute();
        org.joda.time.Interval interval32 = property31.toInterval();
        org.joda.time.DateTime dateTime33 = property31.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight34 = dateTime33.toDateMidnight();
        int int35 = dateTime33.getEra();
        java.util.Date date36 = dateTime33.toDate();
        boolean boolean37 = date22.before(date36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar11", (calendar1.compareTo(calendar11) == 0) == calendar1.equals(calendar11));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology11 = null;
        boolean boolean12 = dateTimeFieldType10.isSupported(chronology11);
        org.joda.time.Chronology chronology13 = null;
        boolean boolean14 = dateTimeFieldType10.isSupported(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime9.property(dateTimeFieldType10);
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType10.getRangeDurationType();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate18.minus(readablePeriod19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.Chronology chronology23 = localDate20.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long28 = dateTimeZone26.nextTransition((long) 4);
        org.joda.time.Chronology chronology29 = chronology23.withZone(dateTimeZone26);
        org.joda.time.DurationField durationField30 = chronology29.millis();
        org.joda.time.DurationField durationField31 = durationFieldType16.getField(chronology29);
        org.joda.time.DateTimeField dateTimeField32 = chronology29.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField30 and durationField31", Math.signum(durationField30.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField30)));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime4.minus(readablePeriod7);
        org.joda.time.LocalTime localTime10 = localTime4.plusSeconds(9);
        org.joda.time.Chronology chronology11 = localTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.hourOfDay();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj1, chronology11);
        org.joda.time.DurationField durationField15 = chronology11.halfdays();
        org.joda.time.DurationField durationField16 = durationFieldType0.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField17 = chronology11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField18 = chronology11.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone22 = dateTimeZone21.toTimeZone();
        int int24 = dateTimeZone21.getStandardOffset((long) (short) 0);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(0L, dateTimeZone21);
        org.joda.time.Chronology chronology26 = chronology11.withZone(dateTimeZone21);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.weekyearOfCentury();
        org.joda.time.DurationField durationField29 = chronology26.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField15, and durationField16", !(durationField29.compareTo(durationField15) == 0) || (Math.signum(durationField29.compareTo(durationField16)) == Math.signum(durationField15.compareTo(durationField16))));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long9 = dateTimeZone6.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime4, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime4.withMillisOfDay(5);
        org.joda.time.Chronology chronology13 = localDateTime4.getChronology();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime4.plusMonths((-292275054));
        java.lang.String str16 = localDateTime4.toString();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime4.plusYears((int) 'u');
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.hourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology19.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField22, and durationField20", !(durationField20.compareTo(durationField22) == 0) || (Math.signum(durationField20.compareTo(durationField20)) == Math.signum(durationField22.compareTo(durationField20))));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology5 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean12 = localTime10.isSupported(durationFieldType11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime10.minus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime10.plusSeconds(9);
        org.joda.time.Chronology chronology17 = localTime10.getChronology();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(chronology17);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) '#', chronology19);
        org.joda.time.DateTimeField dateTimeField22 = chronology19.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField24 = chronology19.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField25 = chronology19.millisOfDay();
        org.joda.time.DurationField durationField26 = chronology19.minutes();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter6.withChronology(chronology19);
        int int28 = dateTimeFormatter27.getDefaultYear();
        java.util.Locale locale29 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str31 = locale29.getExtension('a');
        java.util.Set<java.lang.String> strSet32 = locale29.getUnicodeLocaleAttributes();
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str34 = locale29.getDisplayScript(locale33);
        java.util.Locale locale35 = java.util.Locale.ENGLISH;
        java.lang.String str36 = locale33.getDisplayVariant(locale35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology39);
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean42 = localTime40.isSupported(durationFieldType41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalTime localTime44 = localTime40.minus(readablePeriod43);
        org.joda.time.LocalTime localTime46 = localTime40.plusSeconds(9);
        org.joda.time.Chronology chronology47 = localTime40.getChronology();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        long long51 = chronology47.add(readablePeriod48, (-2L), 1);
        long long55 = chronology47.add((long) (byte) 0, (long) 10, 2);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(chronology47);
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType37.getField(chronology47);
        java.util.Locale locale59 = java.util.Locale.KOREA;
        java.lang.String str60 = locale59.getDisplayVariant();
        java.lang.String str61 = dateTimeField57.getAsShortText(7, locale59);
        java.lang.String str62 = locale33.getDisplayName(locale59);
        java.lang.String str63 = locale33.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter27.withLocale(locale33);
        java.lang.Integer int65 = dateTimeFormatter27.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter27.withDefaultYear((-993));
        org.joda.time.Chronology chronology68 = dateTimeFormatter67.getChronology();
        org.joda.time.DurationField durationField69 = chronology68.eras();
        org.joda.time.DateTimeField dateTimeField70 = chronology68.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField26 and durationField69", Math.signum(durationField26.compareTo(durationField69)) == -Math.signum(durationField69.compareTo(durationField26)));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(6);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        calendar3.setMinimalDaysInFirstWeek(22);
        calendar3.setMinimalDaysInFirstWeek((int) 'a');
        calendar3.add(0, 13);
        boolean boolean11 = calendar3.isWeekDateSupported();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1, chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMillisOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (-1), chronology18);
        org.joda.time.DurationField durationField20 = chronology18.hours();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.yearOfEra();
        long long24 = dateTimeField21.set((-61692070122795L), 122);
        boolean boolean25 = calendar3.after((java.lang.Object) dateTimeField21);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology28);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean31 = localTime29.isSupported(durationFieldType30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime33 = localTime29.minus(readablePeriod32);
        org.joda.time.LocalTime localTime35 = localTime29.plusSeconds(9);
        org.joda.time.Chronology chronology36 = localTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.hourOfDay();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.secondOfMinute();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology36);
        boolean boolean41 = durationFieldType26.isSupported(chronology36);
        org.joda.time.DateTimeField dateTimeField42 = chronology36.hourOfDay();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((java.lang.Object) 0L, chronology44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalTime localTime47 = localTime45.plus(readablePeriod46);
        java.util.TimeZone timeZone48 = java.util.TimeZone.getDefault();
        java.lang.String str49 = timeZone48.getID();
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(timeZone48);
        boolean boolean51 = localTime47.equals((java.lang.Object) calendar50);
        int[] intArray52 = localTime47.getValues();
        org.joda.time.LocalTime.Property property53 = localTime47.millisOfDay();
        org.joda.time.LocalTime localTime54 = property53.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTimeField dateTimeField58 = dateTimeFieldType56.getField(chronology57);
        boolean boolean59 = dateTimeField58.isLenient();
        java.util.Locale locale60 = java.util.Locale.GERMANY;
        int int61 = dateTimeField58.getMaximumShortTextLength(locale60);
        java.lang.String str62 = dateTimeField42.getAsText((org.joda.time.ReadablePartial) localTime54, 82800001, locale60);
        java.lang.String str63 = locale60.getISO3Language();
        java.util.Set<java.lang.String> strSet64 = locale60.getUnicodeLocaleAttributes();
        int int65 = dateTimeField21.getMaximumShortTextLength(locale60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar50", (calendar3.compareTo(calendar50) == 0) == calendar3.equals(calendar50));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate1.withWeekyear((int) (short) -1);
        org.joda.time.LocalDate.Property property8 = localDate1.dayOfWeek();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.minus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readablePeriod15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime(chronology19);
        org.joda.time.DateTime dateTime22 = dateTime18.withMonthOfYear(5);
        org.joda.time.DateTime.Property property23 = dateTime22.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long28 = dateTimeZone25.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str30 = dateTimeZone25.getNameKey(100L);
        org.joda.time.DateTime dateTime31 = dateTime22.withZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTime dateTime32 = localDate1.toDateTimeAtStartOfDay(dateTimeZone25);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(dateTimeZone25);
        long long36 = dateTimeZone25.adjustOffset((long) '#', true);
        java.lang.String str37 = dateTimeZone25.toString();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(chronology38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDate localDate41 = localDate39.minus(readablePeriod40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = localDate41.toDateTimeAtMidnight(dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.plusMillis(32772);
        org.joda.time.DateTime dateTime47 = dateTime43.withMillis((long) ' ');
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(chronology48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDate localDate51 = localDate49.plus(readablePeriod50);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology53 = null;
        boolean boolean54 = dateTimeFieldType52.isSupported(chronology53);
        boolean boolean55 = localDate51.isSupported(dateTimeFieldType52);
        int int56 = dateTime47.get(dateTimeFieldType52);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate(chronology57);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDate localDate60 = localDate58.minus(readablePeriod59);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = localDate60.toDateTimeAtMidnight(dateTimeZone61);
        org.joda.time.Chronology chronology63 = localDate60.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long68 = dateTimeZone66.nextTransition((long) 4);
        org.joda.time.Chronology chronology69 = chronology63.withZone(dateTimeZone66);
        org.joda.time.DurationField durationField70 = chronology69.millis();
        boolean boolean71 = dateTimeFieldType52.isSupported(chronology69);
        org.joda.time.DateTime dateTime72 = org.joda.time.DateTime.now(chronology69);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime(chronology69);
        java.lang.String str74 = dateTime73.toString();
        int int75 = dateTime73.getDayOfMonth();
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.LocalDate localDate77 = new org.joda.time.LocalDate(chronology76);
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.LocalDate localDate79 = localDate77.minus(readablePeriod78);
        org.joda.time.DateTimeZone dateTimeZone80 = null;
        org.joda.time.DateTime dateTime81 = localDate79.toDateTimeAtMidnight(dateTimeZone80);
        org.joda.time.Chronology chronology82 = localDate79.getChronology();
        org.joda.time.DateTimeField dateTimeField83 = chronology82.monthOfYear();
        org.joda.time.DateTimeField dateTimeField84 = chronology82.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField85 = chronology82.weekyear();
        org.joda.time.DateTimeField dateTimeField86 = chronology82.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField87 = chronology82.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime88 = dateTime73.toMutableDateTime(chronology82);
        int int89 = dateTimeZone25.getOffset((org.joda.time.ReadableInstant) dateTime73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime72 and mutableDateTime88", (dateTime72.compareTo(mutableDateTime88) == 0) == dateTime72.equals(mutableDateTime88));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateMidnight dateMidnight9 = dateTime5.toDateMidnight();
        org.joda.time.DateTime dateTime11 = dateTime5.plusHours((int) (short) -1);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime13 = property12.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime15 = dateTime13.plus((long) 2029);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 5);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone18);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime15.withZone(dateTimeZone18);
        long long23 = dateTimeZone18.convertUTCToLocal((-2208628799990L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime21", (dateTime15.compareTo(dateTime21) == 0) == dateTime15.equals(dateTime21));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = localDate3.toDateTimeAtMidnight(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTime dateTime10 = dateTime7.plusDays(2022);
        int int11 = dateTime7.getSecondOfMinute();
        org.joda.time.DateTime.Property property12 = dateTime7.centuryOfEra();
        org.joda.time.DateTime.Property property13 = dateTime7.minuteOfDay();
        org.joda.time.DateTime dateTime14 = property13.roundCeilingCopy();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate16.minus(readablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.minus(readablePeriod21);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime24.withMonthOfYear(5);
        org.joda.time.DateTime.Property property29 = dateTime28.hourOfDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(chronology30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDate localDate33 = localDate31.minus(readablePeriod32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDate33.toDateTimeAtMidnight(dateTimeZone34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.minus(readablePeriod36);
        org.joda.time.DateMidnight dateMidnight38 = dateTime37.toDateMidnight();
        org.joda.time.DateTime dateTime39 = dateTime37.withEarlierOffsetAtOverlap();
        int int40 = dateTime28.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime.Property property41 = dateTime28.dayOfYear();
        org.joda.time.Instant instant42 = dateTime28.toInstant();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.DateTime dateTime44 = dateTime28.plus(readablePeriod43);
        boolean boolean45 = dateTime14.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.DateTime dateTime48 = dateTime28.withDurationAdded(readableDuration46, 895);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant42 and dateTime48", (instant42.compareTo(dateTime48) == 0) == instant42.equals(dateTime48));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtMidnight(dateTimeZone2);
        boolean boolean4 = dateTime3.isEqualNow();
        org.joda.time.DateTime dateTime6 = dateTime3.minusYears(82800000);
        org.joda.time.DateTime dateTime8 = dateTime3.plus((-3482730L));
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate10.minus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readablePeriod15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMillis((int) (byte) 10);
        org.joda.time.DateTime dateTime20 = dateTime16.withCenturyOfEra((int) (byte) 0);
        java.util.Date date21 = dateTime20.toDate();
        int int22 = dateTime20.getSecondOfDay();
        java.util.Date date23 = dateTime20.toDate();
        org.joda.time.DateTime dateTime25 = dateTime20.withYear((int) (byte) -1);
        org.joda.time.DateTime dateTime27 = dateTime25.withDayOfWeek(2);
        org.joda.time.DateTime dateTime29 = dateTime25.withMillisOfDay(1286);
        boolean boolean30 = dateTime8.isEqual((org.joda.time.ReadableInstant) dateTime29);
        int int31 = dateTime29.getYearOfEra();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate35 = localDate33.minus(readablePeriod34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localDate35.toDateTimeAtMidnight(dateTimeZone36);
        org.joda.time.DateTime.Property property38 = dateTime37.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTime dateTime40 = dateTime37.plus(readableDuration39);
        org.joda.time.DateMidnight dateMidnight41 = dateTime37.toDateMidnight();
        org.joda.time.DateTime dateTime43 = dateTime37.plusHours((int) (short) -1);
        org.joda.time.DateTime dateTime45 = dateTime43.withMonthOfYear(10);
        org.joda.time.Instant instant46 = dateTime45.toInstant();
        boolean boolean47 = dateTime29.isAfter((org.joda.time.ReadableInstant) instant46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(chronology48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDate localDate51 = localDate49.minus(readablePeriod50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localDate51.toDateTimeAtMidnight(dateTimeZone52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.DateTime dateTime55 = dateTime53.minus(readablePeriod54);
        org.joda.time.DateMidnight dateMidnight56 = dateTime55.toDateMidnight();
        org.joda.time.DateTime dateTime57 = dateTime55.withEarlierOffsetAtOverlap();
        long long58 = dateTime57.getMillis();
        org.joda.time.DateTime dateTime60 = dateTime57.withDayOfMonth(2);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.DateTime dateTime62 = dateTime57.plus(readableDuration61);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean64 = dateTime62.isSupported(dateTimeFieldType63);
        org.joda.time.Chronology chronology65 = dateTime62.getChronology();
        org.joda.time.DateTime dateTime66 = org.joda.time.DateTime.now(chronology65);
        org.joda.time.DateTime dateTime67 = org.joda.time.DateTime.now(chronology65);
        org.joda.time.DateTimeZone dateTimeZone68 = chronology65.getZone();
        java.lang.String str70 = dateTimeZone68.getNameKey(0L);
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate((java.lang.Object) dateTime29, dateTimeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime45 and instant46", (dateTime45.compareTo(instant46) == 0) == dateTime45.equals(instant46));
    }
}

