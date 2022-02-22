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
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime dateTime6 = dateTime0.plusYears(26160835);
        boolean boolean8 = dateTime6.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.plusDays(50);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.centuries();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime6.toMutableDateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField18 = chronology14.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.years();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        int int25 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone23);
        java.lang.String str28 = dateTimeZone23.getName((long) 18);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(dateTimeZone23);
        org.joda.time.Chronology chronology30 = zonedChronology21.withZone(dateTimeZone23);
        int int32 = dateTimeZone23.getStandardOffset(25171671L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime26", (dateTime16.compareTo(dateTime26) == 0) == dateTime16.equals(dateTime26));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now(dateTimeZone24);
        org.joda.time.Instant instant26 = new org.joda.time.Instant();
        org.joda.time.Instant instant28 = instant26.withMillis((long) 11);
        org.joda.time.Instant instant29 = instant28.toInstant();
        org.joda.time.Chronology chronology30 = instant28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 100, dateTimeZone33);
        int int35 = dateTimeField31.getMaximumValue((org.joda.time.ReadablePartial) localDate34);
        int int37 = localDate34.getValue(2);
        org.joda.time.DateMidnight dateMidnight38 = localDate34.toDateMidnight();
        int int39 = localDate34.getDayOfWeek();
        java.util.Date date40 = localDate34.toDate();
        int int41 = date40.getYear();
        boolean boolean42 = localDate25.equals((java.lang.Object) date40);
        date40.setYear(26182);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) 100, dateTimeZone46);
        java.util.Date date48 = localDate47.toDate();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) 100, dateTimeZone50);
        java.util.Date date52 = localDate51.toDate();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) 100, dateTimeZone54);
        java.util.Date date56 = localDate55.toDate();
        boolean boolean57 = date52.after(date56);
        boolean boolean58 = date48.before(date52);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate((long) 100, dateTimeZone60);
        java.util.Date date62 = localDate61.toDate();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) 100, dateTimeZone64);
        java.util.Date date66 = localDate65.toDate();
        boolean boolean67 = date62.after(date66);
        boolean boolean68 = date48.before(date62);
        int int69 = date62.getMinutes();
        java.time.Instant instant70 = date62.toInstant();
        date62.setHours(11953927);
        date62.setTime((long) 12042325);
        boolean boolean75 = date40.after(date62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant26", (dateTime16.compareTo(instant26) == 0) == dateTime16.equals(instant26));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Chronology chronology2 = dateTime0.getChronology();
        org.joda.time.DateTime dateTime4 = dateTime0.plusDays(2);
        java.util.Date date5 = dateTime0.toDate();
        java.lang.String str7 = dateTime0.toString("15");
        org.joda.time.DateTime dateTime9 = dateTime0.withYearOfEra(54600898);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(26235382);
        org.joda.time.DateTime.Property property12 = dateTime11.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay3 = dateTime2.toTimeOfDay();
        org.joda.time.DateTime.Property property4 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime5 = property4.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime6 = property4.withMaximumValue();
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.Instant instant9 = instant7.minus((long) 26302600);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant7.minus(readableDuration10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.minus(readableDuration12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant13", (dateTime6.compareTo(instant13) == 0) == dateTime6.equals(instant13));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DurationField durationField25 = zonedChronology21.months();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.clockhourOfHalfday();
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.Instant instant29 = instant27.withMillis((long) 11);
        org.joda.time.Instant instant30 = instant29.toInstant();
        org.joda.time.Chronology chronology31 = instant29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 100, dateTimeZone34);
        int int36 = dateTimeField32.getMaximumValue((org.joda.time.ReadablePartial) localDate35);
        int int37 = dateTimeField32.getMinimumValue();
        boolean boolean38 = zonedChronology21.equals((java.lang.Object) int37);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology21.millisOfSecond();
        org.joda.time.DurationField durationField40 = zonedChronology21.weekyears();
        org.joda.time.Chronology chronology41 = zonedChronology21.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant27", (dateTime16.compareTo(instant27) == 0) == dateTime16.equals(instant27));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 100, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.plusDays(50);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(50);
        int int13 = localDate10.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate15 = localDate10.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        int int18 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateMidnight dateMidnight19 = localDate10.toDateMidnight(dateTimeZone16);
        long long21 = dateTimeZone16.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology22 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone16);
        org.joda.time.DurationField durationField23 = zonedChronology22.weeks();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology22.year();
        org.joda.time.DateTimeZone dateTimeZone25 = zonedChronology22.getZone();
        org.joda.time.DurationField durationField26 = zonedChronology22.months();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology22.clockhourOfHalfday();
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant28.withMillis((long) 11);
        org.joda.time.Instant instant31 = instant30.toInstant();
        org.joda.time.Chronology chronology32 = instant30.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 100, dateTimeZone35);
        int int37 = dateTimeField33.getMaximumValue((org.joda.time.ReadablePartial) localDate36);
        int int38 = dateTimeField33.getMinimumValue();
        boolean boolean39 = zonedChronology22.equals((java.lang.Object) int38);
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology22.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        long long44 = zonedChronology22.add(readablePeriod41, (long) 11936063, 26349267);
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology22.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology22.minuteOfDay();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(0L, (org.joda.time.Chronology) zonedChronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant28", (dateTime17.compareTo(instant28) == 0) == dateTime17.equals(instant28));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        int int5 = localDate4.getDayOfMonth();
        int int6 = localDate4.getYear();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMillis((int) '#');
        org.joda.time.DateTime dateTime15 = dateTime13.plusDays(11);
        org.joda.time.DateTime dateTime18 = dateTime13.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime20 = dateTime13.plusDays(26159400);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 100, dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.plusDays(50);
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime13.toMutableDateTime(chronology26);
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.now(chronology26);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekyear();
        int int31 = localDate29.get(dateTimeFieldType30);
        org.joda.time.LocalDate.Property property32 = localDate4.property(dateTimeFieldType30);
        org.joda.time.LocalDate.Property property33 = localDate4.centuryOfEra();
        org.joda.time.LocalDate.Property property34 = localDate4.yearOfCentury();
        org.joda.time.LocalDate.Property property35 = localDate4.dayOfYear();
        org.joda.time.LocalDate.Property property36 = localDate4.dayOfYear();
        org.joda.time.LocalDate localDate38 = localDate4.minusMonths(12116958);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime28", (dateTime13.compareTo(mutableDateTime28) == 0) == dateTime13.equals(mutableDateTime28));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant2.minus(readableDuration4);
        org.joda.time.Instant instant6 = instant2.toInstant();
        org.joda.time.Instant instant8 = instant6.withMillis((long) 59);
        org.joda.time.Instant instant10 = instant6.minus((long) 26193);
        org.joda.time.DateTime dateTime11 = instant6.toDateTime();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant6.plus(readableDuration12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime11", (instant13.compareTo(dateTime11) == 0) == instant13.equals(dateTime11));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        org.joda.time.DurationField durationField25 = zonedChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.millisOfSecond();
        org.joda.time.DurationField durationField27 = zonedChronology21.minutes();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 100, dateTimeZone29);
        java.util.Date date31 = localDate30.toDate();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 100, dateTimeZone33);
        java.util.Date date35 = localDate34.toDate();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 100, dateTimeZone37);
        java.util.Date date39 = localDate38.toDate();
        boolean boolean40 = date35.after(date39);
        boolean boolean41 = date31.before(date35);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) 100, dateTimeZone43);
        java.util.Date date45 = localDate44.toDate();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) 100, dateTimeZone47);
        java.util.Date date49 = localDate48.toDate();
        boolean boolean50 = date45.after(date49);
        boolean boolean51 = date31.before(date45);
        java.util.Date date53 = new java.util.Date((long) 11756302);
        boolean boolean54 = date31.before(date53);
        boolean boolean55 = zonedChronology21.equals((java.lang.Object) date53);
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology21.halfdayOfDay();
        java.lang.Object obj57 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate((long) 100, dateTimeZone59);
        org.joda.time.LocalDate localDate62 = localDate60.plusDays(50);
        org.joda.time.Chronology chronology63 = localDate62.getChronology();
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate(obj57, chronology63);
        org.joda.time.LocalDate localDate66 = localDate64.minusYears(12060853);
        int[] intArray68 = zonedChronology21.get((org.joda.time.ReadablePartial) localDate64, (long) 12132613);
        org.joda.time.DurationField durationField69 = zonedChronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField69, durationField22, and durationField24", !(durationField69.compareTo(durationField22) == 0) || (Math.signum(durationField69.compareTo(durationField24)) == Math.signum(durationField22.compareTo(durationField24))));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        int int9 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone7);
        boolean boolean11 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minusMinutes(11814974);
        org.joda.time.DateTime dateTime14 = dateTime10.toDateTimeISO();
        org.joda.time.DateTime.Property property15 = dateTime10.millisOfDay();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int20 = dateTime18.get(dateTimeFieldType19);
        org.joda.time.DateTime dateTime22 = dateTime18.minusMillis((int) '#');
        org.joda.time.DateTime dateTime24 = dateTime22.plusDays(11);
        org.joda.time.DateTime dateTime27 = dateTime22.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime29 = dateTime27.withMinuteOfHour(20);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime29.getZone();
        org.joda.time.DateTime dateTime31 = dateTime10.withZone(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime10.withYearOfEra(11809176);
        org.joda.time.DateTime dateTime35 = dateTime10.withEra(0);
        org.joda.time.DateTime dateTime37 = dateTime35.minus((long) 26370176);
        org.joda.time.TimeOfDay timeOfDay38 = dateTime35.toTimeOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime10", (dateTime0.compareTo(dateTime10) == 0) == dateTime0.equals(dateTime10));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DurationField durationField23 = zonedChronology21.millis();
        org.joda.time.DurationField durationField24 = zonedChronology21.millis();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        int int26 = dateTime25.getDayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime25.withYear(11751002);
        org.joda.time.Instant instant29 = dateTime25.toInstant();
        org.joda.time.DateTime.Property property30 = dateTime25.monthOfYear();
        boolean boolean31 = zonedChronology21.equals((java.lang.Object) dateTime25);
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology21.minuteOfDay();
        org.joda.time.DurationField durationField33 = zonedChronology21.hours();
        long long36 = durationField33.subtract(11864421752L, 26583070);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant29", (dateTime16.compareTo(instant29) == 0) == dateTime16.equals(instant29));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfDay();
        org.joda.time.Chronology chronology6 = chronology4.withUTC();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(chronology6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks(11756302);
        org.joda.time.DateTime.Property property10 = dateTime7.hourOfDay();
        int int11 = dateTime7.getWeekyear();
        org.joda.time.DateTime.Property property12 = dateTime7.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 100, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.plusDays(50);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 100, dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.plusDays(50);
        int int25 = localDate22.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate27 = localDate22.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        int int30 = dateTimeZone28.getOffset((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateMidnight dateMidnight31 = localDate22.toDateMidnight(dateTimeZone28);
        long long33 = dateTimeZone28.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology34 = org.joda.time.chrono.ZonedChronology.getInstance(chronology18, dateTimeZone28);
        org.joda.time.DurationField durationField35 = zonedChronology34.weeks();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology34.year();
        org.joda.time.DateTimeZone dateTimeZone37 = zonedChronology34.getZone();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology34.weekyear();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        long long42 = zonedChronology34.add(readablePeriod39, (long) 11783576, 26163273);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        long long46 = zonedChronology34.add(readablePeriod43, 11776486L, 38);
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology34.secondOfMinute();
        org.joda.time.DurationField durationField48 = zonedChronology34.halfdays();
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime7.toMutableDateTime((org.joda.time.Chronology) zonedChronology34);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.Instant instant51 = dateTime50.toInstant();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime55 = property53.addWrapFieldToCopy(11756302);
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.secondOfMinute();
        java.util.Locale locale57 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar58 = java.util.Calendar.getInstance(locale57);
        boolean boolean59 = locale57.hasExtensions();
        java.lang.String str60 = property56.getAsShortText(locale57);
        int int61 = property56.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime63 = property56.addToCopy((long) 11780270);
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.monthOfYear();
        java.util.Date date65 = localDateTime63.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int67 = localDateTime63.get(dateTimeFieldType66);
        boolean boolean68 = dateTime50.isSupported(dateTimeFieldType66);
        int int69 = dateTime7.get(dateTimeFieldType66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime29", (instant0.compareTo(dateTime29) == 0) == instant0.equals(dateTime29));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.DateTimeZone dateTimeZone3 = instant0.getZone();
        org.joda.time.DateTime dateTime4 = instant0.toDateTime();
        org.joda.time.Instant instant6 = instant0.minus((long) 292278994);
        org.joda.time.Instant instant8 = instant0.minus((long) 26207777);
        org.joda.time.Instant instant10 = instant8.withMillis((long) 12139046);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Chronology chronology2 = dateTime0.getChronology();
        org.joda.time.DateTime dateTime4 = dateTime0.plusDays(2);
        java.util.Date date5 = dateTime0.toDate();
        java.lang.String str7 = dateTime0.toString("15");
        java.util.GregorianCalendar gregorianCalendar8 = dateTime0.toGregorianCalendar();
        gregorianCalendar8.setFirstDayOfWeek(11760949);
        int int11 = gregorianCalendar8.getWeekYear();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromCalendarFields((java.util.Calendar) gregorianCalendar8);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYearOfEra(11826235);
        int int15 = localDateTime14.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minus(0L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 100, dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime4.withZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.plusDays(50);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.dayOfMonth();
        int int18 = dateTimeField16.get((long) 11768869);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = dateTimeField16.getType();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType19.getRangeDurationType();
        boolean boolean21 = dateTime4.isSupported(dateTimeFieldType19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime8", (dateTime4.compareTo(dateTime8) == 0) == dateTime4.equals(dateTime8));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime0.withZone(dateTimeZone3);
        boolean boolean7 = dateTimeZone3.isStandardOffset((long) 54626);
        long long11 = dateTimeZone3.convertLocalToUTC((long) 26624089, true, (long) 11949997);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime5", (dateTime0.compareTo(dateTime5) == 0) == dateTime0.equals(dateTime5));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime dateTime6 = dateTime0.plusYears(26160835);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        java.util.Date date10 = localDate9.toDate();
        org.joda.time.LocalDate localDate12 = localDate9.withCenturyOfEra((int) 'u');
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime();
        int int14 = localDate9.getDayOfWeek();
        org.joda.time.LocalDate localDate16 = localDate9.minusMonths(11771566);
        org.joda.time.LocalDate localDate18 = localDate9.plusWeeks(11820917);
        org.joda.time.LocalDate localDate20 = localDate9.plusYears(11788319);
        boolean boolean21 = dateTime0.equals((java.lang.Object) localDate9);
        java.util.Date date23 = new java.util.Date((long) 11756302);
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.fromDateFields(date23);
        org.joda.time.ReadablePartial readablePartial25 = null;
        org.joda.time.LocalTime localTime26 = localTime24.withFields(readablePartial25);
        org.joda.time.LocalTime.Property property27 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime29 = localTime24.withMillisOfSecond(18);
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = null;
        org.joda.time.format.DateTimeParser dateTimeParser31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter32.withPivotYear((int) 'u');
        java.lang.Integer int35 = dateTimeFormatter34.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter34.withPivotYear(13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter37.withDefaultYear(11766958);
        java.util.Locale locale40 = dateTimeFormatter39.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter39.withPivotYear((java.lang.Integer) 26211201);
        java.util.Locale locale43 = java.util.Locale.GERMAN;
        java.util.Locale locale44 = locale43.stripExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter42.withLocale(locale44);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) 100, dateTimeZone47);
        org.joda.time.LocalDate localDate50 = localDate48.plusDays(50);
        org.joda.time.Chronology chronology51 = localDate50.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.millisOfDay();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(chronology51);
        org.joda.time.DateTimeField dateTimeField54 = chronology51.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone59 = dateTimeZone58.toTimeZone();
        java.util.TimeZone timeZone60 = dateTimeZone58.toTimeZone();
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(72000000L, dateTimeZone58);
        int int63 = dateTimeZone58.getStandardOffset((long) 'u');
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate(dateTimeZone58);
        org.joda.time.chrono.ZonedChronology zonedChronology65 = org.joda.time.chrono.ZonedChronology.getInstance(chronology51, dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology65.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone67 = zonedChronology65.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter45.withZone(dateTimeZone67);
        org.joda.time.DateTime dateTime69 = localDate9.toDateTime(localTime24, dateTimeZone67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMillisOfSecond((int) '4');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minus(readablePeriod9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusDays(33226165);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.plusMinutes(26314999);
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime16.withHourOfDay(10);
        java.util.GregorianCalendar gregorianCalendar21 = dateTime16.toGregorianCalendar();
        org.joda.time.Instant instant23 = new org.joda.time.Instant();
        org.joda.time.Instant instant25 = instant23.withMillis((long) 11);
        org.joda.time.Instant instant26 = instant25.toInstant();
        org.joda.time.Chronology chronology27 = instant25.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 11760560, chronology27);
        org.joda.time.DateTime dateTime30 = dateTime16.withChronology(chronology27);
        org.joda.time.DateTime dateTime32 = dateTime30.plusYears(11792895);
        org.joda.time.DateTime dateTime33 = localDateTime14.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime.Property property34 = dateTime33.millisOfSecond();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime37 = dateTime35.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime39 = dateTime35.withCenturyOfEra(50);
        org.joda.time.Instant instant40 = new org.joda.time.Instant();
        org.joda.time.Instant instant42 = instant40.minus((long) 2);
        int int43 = dateTime39.compareTo((org.joda.time.ReadableInstant) instant40);
        org.joda.time.Instant instant45 = instant40.plus((long) (short) 100);
        org.joda.time.Instant instant48 = instant45.withDurationAdded((long) 11811003, 26207777);
        org.joda.time.DateTime dateTime49 = instant45.toDateTime();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime50.withField(dateTimeFieldType52, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime50.minusYears(5);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.withMillisOfDay(8);
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime61.withField(dateTimeFieldType63, (int) (short) 10);
        boolean boolean66 = localDateTime57.isSupported(dateTimeFieldType63);
        boolean boolean67 = localDateTime56.isSupported(dateTimeFieldType63);
        int int68 = dateTime49.get(dateTimeFieldType63);
        org.joda.time.DateTime dateTime70 = dateTime33.withField(dateTimeFieldType63, 12071411);
        org.joda.time.DateTime.Property property71 = dateTime33.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant23", (dateTime16.compareTo(instant23) == 0) == dateTime16.equals(instant23));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfHalfday();
        org.joda.time.Chronology chronology6 = chronology4.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = chronology4.getZone();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDate8.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(11764515);
        org.joda.time.DateTime dateTime12 = localDate8.toDateTimeAtMidnight(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.minus(readableDuration14);
        java.lang.String str16 = dateTime13.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime13", (instant0.compareTo(dateTime13) == 0) == instant0.equals(dateTime13));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime.Property property5 = dateTime0.dayOfWeek();
        org.joda.time.DateTime.Property property6 = dateTime0.secondOfMinute();
        org.joda.time.DateTime dateTime8 = dateTime0.plusHours(11763042);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readableDuration9);
        int int11 = dateTime8.getHourOfDay();
        org.joda.time.DateTime dateTime13 = dateTime8.minusWeeks(11956994);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime13 = dateTime6.plusDays(26159400);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        int int17 = dateTimeZone14.getStandardOffset((long) 49);
        int int19 = dateTimeZone14.getOffset((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime6.toMutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        boolean boolean22 = dateTime6.isSupported(dateTimeFieldType21);
        org.joda.time.DateTime.Property property23 = dateTime6.dayOfWeek();
        int int24 = dateTime6.getMinuteOfDay();
        org.joda.time.DateTime dateTime26 = dateTime6.plusHours(11857717);
        org.joda.time.DateTime dateTime28 = dateTime26.plusMinutes(11871396);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and mutableDateTime20", (dateTime6.compareTo(mutableDateTime20) == 0) == dateTime6.equals(mutableDateTime20));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant2.minus(readableDuration4);
        org.joda.time.Instant instant6 = instant2.toInstant();
        org.joda.time.Instant instant8 = instant6.withMillis((long) 59);
        org.joda.time.Instant instant10 = instant8.withMillis((long) 11782828);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 10);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes(49);
        org.joda.time.DateTime dateTime16 = dateTime14.plus(10L);
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        org.joda.time.DateTime dateTime19 = dateTime16.minusMonths((int) 'a');
        boolean boolean20 = instant8.isEqual((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter23.withPivotYear((java.lang.Integer) (-26151846));
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime28 = dateTime26.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight29 = dateTime28.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int31 = dateTime28.get(dateTimeFieldType30);
        int int32 = dateTime28.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 100, dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.plusDays(50);
        org.joda.time.Chronology chronology38 = localDate37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.dayOfMonth();
        org.joda.time.DateTime dateTime41 = dateTime28.withChronology(chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter25.withChronology(chronology38);
        org.joda.time.DateTime dateTime43 = dateTime16.toDateTime(chronology38);
        org.joda.time.Chronology chronology44 = dateTime43.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime26", (instant0.compareTo(dateTime26) == 0) == instant0.equals(dateTime26));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.minus((long) 2);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.plus(readableDuration12);
        long long14 = instant11.getMillis();
        org.joda.time.Chronology chronology15 = instant11.getChronology();
        org.joda.time.Instant instant18 = instant11.withDurationAdded((long) 20, 11871230);
        int int19 = dateTime6.compareTo((org.joda.time.ReadableInstant) instant11);
        org.joda.time.Instant instant22 = instant11.withDurationAdded((long) 11926100, 11820840);
        org.joda.time.Chronology chronology23 = instant11.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant9", (dateTime0.compareTo(instant9) == 0) == dateTime0.equals(instant9));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfHalfday();
        org.joda.time.Chronology chronology6 = chronology4.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = chronology4.getZone();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDate8.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(11764515);
        org.joda.time.DateTime dateTime12 = localDate8.toDateTimeAtMidnight(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone11);
        java.lang.String str15 = dateTimeZone11.getShortName((long) 43640);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime13", (instant0.compareTo(dateTime13) == 0) == instant0.equals(dateTime13));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        int int8 = dateTime2.getYearOfEra();
        org.joda.time.Instant instant9 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant9.withDurationAdded(readableDuration11, 11768869);
        org.joda.time.Instant instant15 = instant13.plus((long) 11859299);
        org.joda.time.Instant instant18 = instant13.withDurationAdded(1645514222453L, 32);
        org.joda.time.Instant instant20 = instant13.minus((long) 54595491);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant20.plus(readableDuration21);
        org.joda.time.MutableDateTime mutableDateTime23 = instant22.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant9", (dateTime2.compareTo(instant9) == 0) == dateTime2.equals(instant9));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Instant instant2 = dateTime1.toInstant();
        org.joda.time.Chronology chronology3 = dateTime1.getChronology();
        boolean boolean4 = dateTime0.isEqual((org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localTime11.getFieldType((int) (byte) 1);
        int int14 = localTime9.get(dateTimeFieldType13);
        org.joda.time.LocalTime.Property property15 = localTime7.property(dateTimeFieldType13);
        org.joda.time.LocalTime localTime16 = property15.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime17 = property15.getLocalTime();
        org.joda.time.LocalTime localTime18 = property15.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = property15.addWrapFieldToCopy(26159400);
        org.joda.time.DateTimeField dateTimeField21 = property15.getField();
        org.joda.time.LocalTime localTime22 = property15.roundCeilingCopy();
        org.joda.time.LocalTime localTime24 = localTime22.minusHours(11753441);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        int int27 = dateTimeZone25.getStandardOffset((long) (byte) 1);
        org.joda.time.DateTime dateTime28 = localTime24.toDateTimeToday(dateTimeZone25);
        org.joda.time.DateTime dateTime29 = dateTime0.withZone(dateTimeZone25);
        boolean boolean30 = dateTime0.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant2", (dateTime1.compareTo(instant2) == 0) == dateTime1.equals(instant2));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.millisOfDay();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        java.util.TimeZone timeZone14 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(72000000L, dateTimeZone12);
        int int17 = dateTimeZone12.getStandardOffset((long) 'u');
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.chrono.ZonedChronology zonedChronology19 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology19.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology19.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology19.millisOfDay();
        org.joda.time.DurationField durationField23 = zonedChronology19.years();
        org.joda.time.DurationField durationField24 = zonedChronology19.weeks();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology19.year();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology19.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 100, dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.plusDays(50);
        org.joda.time.Chronology chronology33 = localDate32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 100, dateTimeZone36);
        org.joda.time.LocalDate localDate39 = localDate37.plusDays(50);
        int int40 = localDate37.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate42 = localDate37.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        int int45 = dateTimeZone43.getOffset((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateMidnight dateMidnight46 = localDate37.toDateMidnight(dateTimeZone43);
        long long48 = dateTimeZone43.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology49 = org.joda.time.chrono.ZonedChronology.getInstance(chronology33, dateTimeZone43);
        org.joda.time.DurationField durationField50 = zonedChronology49.weeks();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology49.year();
        org.joda.time.DateTimeZone dateTimeZone52 = zonedChronology49.getZone();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology49.weekyear();
        org.joda.time.DateTimeField dateTimeField54 = zonedChronology49.minuteOfHour();
        org.joda.time.DurationField durationField55 = zonedChronology49.hours();
        org.joda.time.DurationField durationField56 = zonedChronology49.weeks();
        org.joda.time.DateTimeField dateTimeField57 = zonedChronology49.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial58 = null;
        java.util.Locale locale61 = java.util.Locale.forLanguageTag("minuteOfHour");
        java.lang.String str62 = dateTimeField57.getAsText(readablePartial58, 11815565, locale61);
        java.util.Set<java.lang.String> strSet63 = locale61.getUnicodeLocaleAttributes();
        java.lang.String str64 = dateTimeField26.getAsText((long) (-26151846), locale61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField24 and durationField50", (durationField24.compareTo(durationField50) == 0) == durationField24.equals(durationField50));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        int int9 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        int int11 = localDate8.getValue(2);
        org.joda.time.DateMidnight dateMidnight12 = localDate8.toDateMidnight();
        org.joda.time.LocalDate.Property property13 = localDate8.era();
        org.joda.time.LocalDate localDate14 = property13.getLocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.weekyear();
        org.joda.time.LocalDate.Property property16 = localDate14.dayOfYear();
        org.joda.time.LocalDate localDate18 = property16.addWrapFieldToCopy(917);
        org.joda.time.LocalDate localDate19 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime20 = localDate19.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 100, dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.plusDays(50);
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 100, dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.plusDays(50);
        int int33 = localDate30.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate35 = localDate30.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        int int38 = dateTimeZone36.getOffset((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateMidnight dateMidnight39 = localDate30.toDateMidnight(dateTimeZone36);
        long long41 = dateTimeZone36.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology42 = org.joda.time.chrono.ZonedChronology.getInstance(chronology26, dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology42.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology42.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology42.yearOfCentury();
        org.joda.time.DateTime dateTime46 = dateTime20.toDateTime((org.joda.time.Chronology) zonedChronology42);
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology42.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime37", (instant0.compareTo(dateTime37) == 0) == instant0.equals(dateTime37));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        boolean boolean4 = dateTime2.isBefore(13910400000L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str7 = dateTimeZone6.toString();
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.toDateTime(dateTimeZone6);
        java.lang.String str11 = dateTimeZone6.getName((-31319912032904646L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime9", (dateTime2.compareTo(dateTime9) == 0) == dateTime2.equals(dateTime9));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMillisOfSecond((int) '4');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusWeeks(26160458);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minusMinutes((int) 'u');
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusMonths(3);
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Instant instant17 = new org.joda.time.Instant();
        org.joda.time.Instant instant19 = instant17.withMillis((long) 11);
        org.joda.time.Instant instant20 = instant19.toInstant();
        org.joda.time.Chronology chronology21 = instant19.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.minuteOfDay();
        org.joda.time.Chronology chronology23 = chronology21.withUTC();
        boolean boolean24 = durationFieldType16.isSupported(chronology23);
        java.lang.String str25 = durationFieldType16.toString();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime12.withFieldAdded(durationFieldType16, 7);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withDurationAdded(readableDuration28, 26336);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime();
        int int32 = localDateTime31.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusDays(17);
        int int35 = localDateTime31.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime31.minusHours(22);
        org.joda.time.DateTime dateTime38 = localDateTime37.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime();
        int int41 = dateTimeZone39.getOffset((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone39);
        java.lang.String str44 = dateTimeZone39.getName((long) 18);
        org.joda.time.Instant instant45 = org.joda.time.Instant.now();
        org.joda.time.Instant instant47 = instant45.plus((long) 11753187);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Instant instant49 = instant47.plus(readableDuration48);
        org.joda.time.Instant instant51 = instant49.plus((long) (short) -1);
        org.joda.time.Instant instant53 = instant49.plus((long) 20);
        int int54 = dateTimeZone39.getOffset((org.joda.time.ReadableInstant) instant49);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean56 = instant49.isSupported(dateTimeFieldType55);
        int int57 = localDateTime37.get(dateTimeFieldType55);
        boolean boolean58 = localDateTime27.isSupported(dateTimeFieldType55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and dateTime40", (instant17.compareTo(dateTime40) == 0) == instant17.equals(dateTime40));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = instant2.toMutableDateTimeISO();
        org.joda.time.Instant instant7 = instant2.plus(0L);
        org.joda.time.Instant instant9 = instant2.withMillis(7131721778230648L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 100, dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.plusDays(50);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 100, dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.plusDays(50);
        int int22 = localDate19.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate24 = localDate19.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        int int27 = dateTimeZone25.getOffset((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateMidnight dateMidnight28 = localDate19.toDateMidnight(dateTimeZone25);
        long long30 = dateTimeZone25.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology31 = org.joda.time.chrono.ZonedChronology.getInstance(chronology15, dateTimeZone25);
        org.joda.time.DurationField durationField32 = zonedChronology31.weeks();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology31.weekyear();
        org.joda.time.DurationField durationField34 = zonedChronology31.weekyears();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology31.centuryOfEra();
        org.joda.time.DurationField durationField36 = zonedChronology31.weekyears();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology31.monthOfYear();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology31.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology31.dayOfMonth();
        int int40 = instant2.get(dateTimeField39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime26", (instant0.compareTo(dateTime26) == 0) == instant0.equals(dateTime26));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 58);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        int int3 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(11751002);
        org.joda.time.Instant instant6 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime8 = dateTime2.plusYears(26160835);
        boolean boolean10 = dateTime8.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime17 = dateTime13.minusMillis((int) '#');
        org.joda.time.DateTime dateTime19 = dateTime17.plusDays(11);
        org.joda.time.DateTime dateTime22 = dateTime17.withDurationAdded((long) 11757696, (int) ' ');
        int int23 = dateTime17.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime25 = dateTime17.minusWeeks(215400000);
        boolean boolean26 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int28 = dateTime8.get(dateTimeFieldType27);
        int int29 = dateTime1.get(dateTimeFieldType27);
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType27.getRangeDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant6", (dateTime2.compareTo(instant6) == 0) == dateTime2.equals(instant6));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime dateTime6 = dateTime0.plusYears(26160835);
        boolean boolean8 = dateTime6.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTime dateTime10 = dateTime6.minusMinutes(11775531);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekyear(26163273);
        org.joda.time.DateTime.Property property13 = dateTime10.yearOfCentury();
        org.joda.time.DateTime dateTime15 = property13.addWrapFieldToCopy(11810407);
        org.joda.time.DateTimeField dateTimeField16 = property13.getField();
        org.joda.time.DurationField durationField17 = property13.getRangeDurationField();
        org.joda.time.DateTime dateTime18 = property13.withMaximumValue();
        org.joda.time.DateTime dateTime20 = property13.addToCopy((long) 12134238);
        org.joda.time.DateTime dateTime21 = property13.roundCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(53);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.DateTime dateTime11 = dateTime7.minusMillis((int) '#');
        org.joda.time.DateTime dateTime13 = dateTime11.plusDays(11);
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime18 = dateTime11.plusDays(26159400);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime11.getZone();
        boolean boolean20 = localDate4.equals((java.lang.Object) dateTime11);
        org.joda.time.LocalDate localDate22 = localDate4.plusDays(11826610);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = dateTime23.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight26 = dateTime25.toDateMidnight();
        int int27 = dateMidnight26.getDayOfYear();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        int int29 = dateTime28.getDayOfYear();
        org.joda.time.DateTime dateTime31 = dateTime28.withYear(11751002);
        org.joda.time.Instant instant32 = dateTime28.toInstant();
        org.joda.time.DateTime dateTime34 = dateTime28.plusYears(26160835);
        boolean boolean36 = dateTime34.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime39 = dateTime37.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int41 = dateTime39.get(dateTimeFieldType40);
        org.joda.time.DateTime dateTime43 = dateTime39.minusMillis((int) '#');
        org.joda.time.DateTime dateTime45 = dateTime43.plusDays(11);
        org.joda.time.DateTime dateTime48 = dateTime43.withDurationAdded((long) 11757696, (int) ' ');
        int int49 = dateTime43.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime51 = dateTime43.minusWeeks(215400000);
        boolean boolean52 = dateTime34.isAfter((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int54 = dateTime34.get(dateTimeFieldType53);
        boolean boolean55 = dateMidnight26.isSupported(dateTimeFieldType53);
        int int56 = localDate22.get(dateTimeFieldType53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant32", (dateTime5.compareTo(instant32) == 0) == dateTime5.equals(instant32));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = zonedChronology21.add(readablePeriod24, (long) 2022, 0);
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.dayOfYear();
        org.joda.time.DurationField durationField29 = zonedChronology21.days();
        org.joda.time.DurationField durationField30 = zonedChronology21.hours();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.clockhourOfHalfday();
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now((org.joda.time.Chronology) zonedChronology21);
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology21.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime32", (dateTime16.compareTo(dateTime32) == 0) == dateTime16.equals(dateTime32));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.minus((long) 2);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.plus(readableDuration12);
        long long14 = instant11.getMillis();
        org.joda.time.Chronology chronology15 = instant11.getChronology();
        org.joda.time.Instant instant18 = instant11.withDurationAdded((long) 20, 11871230);
        int int19 = dateTime6.compareTo((org.joda.time.ReadableInstant) instant11);
        boolean boolean20 = dateTime6.isBeforeNow();
        org.joda.time.DateTime dateTime21 = dateTime6.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = localTime28.getFieldType((int) (byte) 1);
        int int31 = localTime26.get(dateTimeFieldType30);
        org.joda.time.LocalTime.Property property32 = localTime24.property(dateTimeFieldType30);
        org.joda.time.LocalTime localTime33 = property32.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime34 = property32.getLocalTime();
        org.joda.time.LocalTime localTime35 = property32.roundFloorCopy();
        org.joda.time.LocalTime localTime37 = property32.addWrapFieldToCopy(26159400);
        java.lang.String str38 = localTime37.toString();
        org.joda.time.DateTime dateTime39 = localTime37.toDateTimeToday();
        boolean boolean40 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime39);
        int int41 = dateTime6.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant9", (dateTime0.compareTo(instant9) == 0) == dateTime0.equals(instant9));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime0.withHourOfDay(10);
        org.joda.time.DateMidnight dateMidnight5 = dateTime0.toDateMidnight();
        int int6 = dateTime0.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.millisOfDay();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone20 = dateTimeZone19.toTimeZone();
        java.util.TimeZone timeZone21 = dateTimeZone19.toTimeZone();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(72000000L, dateTimeZone19);
        int int24 = dateTimeZone19.getStandardOffset((long) 'u');
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(dateTimeZone19);
        org.joda.time.chrono.ZonedChronology zonedChronology26 = org.joda.time.chrono.ZonedChronology.getInstance(chronology12, dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology26.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone28 = zonedChronology26.getZone();
        org.joda.time.DurationField durationField29 = zonedChronology26.centuries();
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime0.toMutableDateTime((org.joda.time.Chronology) zonedChronology26);
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology26.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and mutableDateTime30", (dateTime0.compareTo(mutableDateTime30) == 0) == dateTime0.equals(mutableDateTime30));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime dateTime6 = dateTime0.plusYears(26160835);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay10 = dateTime9.toTimeOfDay();
        org.joda.time.DateTime.Property property11 = dateTime9.yearOfEra();
        org.joda.time.DateTime dateTime13 = property11.setCopy(26156834);
        int int14 = dateTime13.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.plus(readableDuration15);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime6.toMutableDateTime(dateTimeZone17);
        org.joda.time.DateTime.Property property19 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime21 = dateTime6.plusMinutes(3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        int int9 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        int int11 = localDate8.getValue(2);
        org.joda.time.DateMidnight dateMidnight12 = localDate8.toDateMidnight();
        org.joda.time.LocalDate localDate14 = localDate8.plusMonths(26160535);
        org.joda.time.LocalDate.Property property15 = localDate8.yearOfEra();
        int int16 = property15.getLeapAmount();
        int int17 = property15.get();
        org.joda.time.LocalDate localDate19 = property15.addWrapFieldToCopy(26182);
        int int20 = localDate19.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 100, dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.plusDays(50);
        org.joda.time.LocalDate.Property property26 = localDate25.monthOfYear();
        org.joda.time.LocalDate.Property property27 = localDate25.year();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 100, dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.plusDays(50);
        org.joda.time.Chronology chronology33 = localDate32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 100, dateTimeZone36);
        org.joda.time.LocalDate localDate39 = localDate37.plusDays(50);
        int int40 = localDate37.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate42 = localDate37.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        int int45 = dateTimeZone43.getOffset((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateMidnight dateMidnight46 = localDate37.toDateMidnight(dateTimeZone43);
        long long48 = dateTimeZone43.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology49 = org.joda.time.chrono.ZonedChronology.getInstance(chronology33, dateTimeZone43);
        org.joda.time.DateTime dateTime50 = localDate25.toDateTimeAtStartOfDay(dateTimeZone43);
        java.lang.String str52 = dateTimeZone43.getName((-3155695200000L));
        org.joda.time.Interval interval53 = localDate19.toInterval(dateTimeZone43);
        int int55 = dateTimeZone43.getOffsetFromLocal((long) 12127502);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime44", (instant0.compareTo(dateTime44) == 0) == instant0.equals(dateTime44));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        int int8 = dateTime2.getYearOfEra();
        org.joda.time.Instant instant9 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int12 = dateTime10.get(dateTimeFieldType11);
        java.lang.String str13 = dateTimeFieldType11.getName();
        int int14 = dateTime2.get(dateTimeFieldType11);
        int int15 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime2.withWeekyear(26200344);
        org.joda.time.DateTime dateTime19 = dateTime17.withYear(11968451);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant9", (dateTime2.compareTo(instant9) == 0) == dateTime2.equals(instant9));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime4 = dateTime0.withCenturyOfEra(50);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.minus((long) 2);
        int int8 = dateTime4.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.DateTime.Property property9 = dateTime4.centuryOfEra();
        org.joda.time.DateTime dateTime11 = dateTime4.plusDays(58);
        java.util.Locale locale12 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleAttributes();
        java.lang.String str14 = locale12.getScript();
        java.util.Set<java.lang.String> strSet15 = locale12.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet16 = locale12.getUnicodeLocaleKeys();
        java.util.Calendar calendar17 = dateTime4.toCalendar(locale12);
        java.lang.String str18 = locale12.getISO3Country();
        java.util.Set<java.lang.Character> charSet19 = locale12.getExtensionKeys();
        java.util.Set<java.lang.Character> charSet20 = locale12.getExtensionKeys();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant5", (dateTime0.compareTo(instant5) == 0) == dateTime0.equals(instant5));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMillisOfSecond((int) '4');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plus(readablePeriod9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYear(11779950);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYearOfEra(11769266);
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.millisOfSecond();
        int int16 = localDateTime12.getMinuteOfHour();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        int int18 = dateTime17.getDayOfYear();
        org.joda.time.DateTime dateTime20 = dateTime17.withYear(11751002);
        org.joda.time.Instant instant21 = dateTime17.toInstant();
        org.joda.time.DateTime dateTime23 = dateTime17.withMillisOfDay(16);
        org.joda.time.DateTime dateTime25 = dateTime17.plusWeeks(11);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime28 = dateTime26.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int30 = dateTime28.get(dateTimeFieldType29);
        org.joda.time.DateTime dateTime32 = dateTime28.minusMillis((int) '#');
        org.joda.time.DateTime dateTime34 = dateTime28.withYearOfEra(17);
        org.joda.time.DateTime dateTime36 = dateTime34.minusDays(292278993);
        org.joda.time.Instant instant37 = dateTime36.toInstant();
        boolean boolean38 = dateTime25.isBefore((org.joda.time.ReadableInstant) dateTime36);
        int int39 = dateTime25.getYear();
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTime25.toString("11904773", locale41);
        org.joda.time.DateTime.Property property43 = dateTime25.hourOfDay();
        org.joda.time.DateTime dateTime44 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant21", (dateTime17.compareTo(instant21) == 0) == dateTime17.equals(instant21));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        int int8 = dateTime2.getYearOfEra();
        org.joda.time.Instant instant9 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant9.withDurationAdded(readableDuration11, 11768869);
        org.joda.time.Instant instant15 = instant13.withMillis(25200000L);
        org.joda.time.MutableDateTime mutableDateTime16 = instant13.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime17 = instant13.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant13", (dateTime2.compareTo(instant13) == 0) == dateTime2.equals(instant13));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        java.util.Date date3 = localDate2.toDate();
        org.joda.time.LocalDate localDate5 = localDate2.withCenturyOfEra((int) 'u');
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtCurrentTime();
        int int7 = localDate2.getDayOfWeek();
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Instant instant10 = instant8.minus((long) 2);
        org.joda.time.MutableDateTime mutableDateTime11 = instant8.toMutableDateTimeISO();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTime dateTime14 = instant8.toDateTime(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight15 = localDate2.toDateMidnight(dateTimeZone13);
        boolean boolean16 = dateMidnight15.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime11", (instant8.compareTo(mutableDateTime11) == 0) == instant8.equals(mutableDateTime11));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime13 = dateTime6.plusDays(26159400);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        int int17 = dateTimeZone14.getStandardOffset((long) 49);
        int int19 = dateTimeZone14.getOffset((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime6.toMutableDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime22 = dateTime6.withYearOfEra(26160458);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMillis(11831033);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        long long26 = property25.remainder();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and mutableDateTime20", (dateTime6.compareTo(mutableDateTime20) == 0) == dateTime6.equals(mutableDateTime20));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Chronology chronology2 = dateTime0.getChronology();
        org.joda.time.DateTime dateTime4 = dateTime0.plusDays(2);
        java.util.Date date5 = dateTime0.toDate();
        java.lang.String str7 = dateTime0.toString("15");
        java.util.GregorianCalendar gregorianCalendar8 = dateTime0.toGregorianCalendar();
        gregorianCalendar8.setFirstDayOfWeek(11760949);
        gregorianCalendar8.setMinimalDaysInFirstWeek(11917854);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay3 = dateTime2.toTimeOfDay();
        org.joda.time.DateTime.Property property4 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime5 = property4.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime6 = property4.withMaximumValue();
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.Instant instant9 = instant7.minus((long) 26302600);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant7.minus(readableDuration10);
        org.joda.time.Instant instant13 = instant7.plus((long) 205);
        org.joda.time.Instant instant15 = instant13.withMillis((long) (-27418800));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant7", (dateTime6.compareTo(instant7) == 0) == dateTime6.equals(instant7));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        int int5 = localDate2.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        int int8 = localDate2.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        java.util.TimeZone timeZone14 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(72000000L, dateTimeZone12);
        int int17 = dateTimeZone12.getOffsetFromLocal((long) 1970);
        org.joda.time.DateTime dateTime18 = localDate2.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 100, dateTimeZone20);
        org.joda.time.LocalDate.Property property22 = localDate21.weekyear();
        org.joda.time.LocalDate localDate24 = localDate21.plusDays(51);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate26 = localDate21.minus(readablePeriod25);
        org.joda.time.LocalDate.Property property27 = localDate21.yearOfEra();
        org.joda.time.LocalDate localDate29 = property27.setCopy(47);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 100, dateTimeZone32);
        org.joda.time.LocalDate localDate35 = localDate33.plusDays(50);
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.millisOfDay();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology36);
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType30.getField(chronology36);
        boolean boolean40 = localDate29.isSupported(dateTimeFieldType30);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 100, dateTimeZone42);
        org.joda.time.LocalDate localDate45 = localDate43.plusDays(50);
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) 100, dateTimeZone49);
        org.joda.time.LocalDate localDate52 = localDate50.plusDays(50);
        int int53 = localDate50.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate55 = localDate50.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime();
        int int58 = dateTimeZone56.getOffset((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateMidnight dateMidnight59 = localDate50.toDateMidnight(dateTimeZone56);
        long long61 = dateTimeZone56.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology62 = org.joda.time.chrono.ZonedChronology.getInstance(chronology46, dateTimeZone56);
        org.joda.time.DurationField durationField63 = zonedChronology62.weeks();
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology62.year();
        org.joda.time.DateTimeZone dateTimeZone65 = zonedChronology62.getZone();
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology62.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology62.yearOfCentury();
        java.lang.String str68 = zonedChronology62.toString();
        org.joda.time.DateTimeField dateTimeField69 = zonedChronology62.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField70 = zonedChronology62.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField71 = dateTimeFieldType30.getField((org.joda.time.Chronology) zonedChronology62);
        org.joda.time.DateTimeField dateTimeField72 = zonedChronology62.secondOfDay();
        boolean boolean73 = dateTimeZone12.equals((java.lang.Object) dateTimeField72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and dateTime57", (dateTime38.compareTo(dateTime57) == 0) == dateTime38.equals(dateTime57));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.DateTimeZone dateTimeZone3 = instant0.getZone();
        org.joda.time.DateTime dateTime4 = instant0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.plusDays(50);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.millisOfDay();
        boolean boolean13 = durationFieldType5.isSupported(chronology11);
        org.joda.time.DateTime dateTime15 = dateTime4.withFieldAdded(durationFieldType5, 0);
        org.joda.time.DateTime dateTime16 = dateTime4.withLaterOffsetAtOverlap();
        int int17 = dateTime16.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime16", (instant0.compareTo(dateTime16) == 0) == instant0.equals(dateTime16));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DurationField durationField25 = zonedChronology21.months();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.clockhourOfHalfday();
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.Instant instant29 = instant27.withMillis((long) 11);
        org.joda.time.Instant instant30 = instant29.toInstant();
        org.joda.time.Chronology chronology31 = instant29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 100, dateTimeZone34);
        int int36 = dateTimeField32.getMaximumValue((org.joda.time.ReadablePartial) localDate35);
        int int37 = dateTimeField32.getMinimumValue();
        boolean boolean38 = zonedChronology21.equals((java.lang.Object) int37);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology21.millisOfSecond();
        org.joda.time.DurationField durationField40 = zonedChronology21.weekyears();
        org.joda.time.DurationField durationField41 = zonedChronology21.months();
        org.joda.time.DurationField durationField42 = zonedChronology21.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant27", (dateTime16.compareTo(instant27) == 0) == dateTime16.equals(instant27));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime15 = dateTime13.withMillisOfDay(12160731);
        long long16 = dateTime13.getMillis();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.Instant instant18 = dateTime17.toInstant();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        int int21 = dateTimeZone19.getOffset((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) instant18, dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean24 = localDateTime22.isSupported(dateTimeFieldType23);
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType23.getRangeDurationType();
        boolean boolean26 = dateTime13.isSupported(dateTimeFieldType23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant18", (dateTime0.compareTo(instant18) == 0) == dateTime0.equals(instant18));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        org.joda.time.DateTime dateTime14 = dateTime6.minusDays(22);
        org.joda.time.DateTime dateTime16 = dateTime6.withYearOfCentury(14);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.Instant instant19 = instant17.plus((long) 11753187);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant19.plus(readableDuration20);
        boolean boolean22 = dateTime6.equals((java.lang.Object) instant21);
        org.joda.time.DateTime.Property property23 = dateTime6.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withField(dateTimeFieldType26, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.plusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withMillisOfSecond((int) '4');
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.plusWeeks(26160458);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.minusMinutes((int) 'u');
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusMonths(3);
        org.joda.time.DateTime dateTime39 = dateTime6.withFields((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.plusMonths(11884191);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDateTime.Property property43 = localDateTime36.property(dateTimeFieldType42);
        int int44 = localDateTime36.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant17", (dateTime0.compareTo(instant17) == 0) == dateTime0.equals(instant17));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.millisOfDay();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        java.util.TimeZone timeZone14 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(72000000L, dateTimeZone12);
        int int17 = dateTimeZone12.getStandardOffset((long) 'u');
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.chrono.ZonedChronology zonedChronology19 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology19.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology19.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology19.year();
        org.joda.time.DurationField durationField23 = zonedChronology19.weeks();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology19.getZone();
        java.util.Locale locale26 = java.util.Locale.JAPANESE;
        java.lang.String str27 = locale26.getDisplayVariant();
        java.lang.String str28 = locale26.getVariant();
        java.lang.String str29 = locale26.getVariant();
        java.util.Locale.Category category30 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale31 = java.util.Locale.ROOT;
        java.util.Locale locale32 = locale31.stripExtensions();
        java.util.Locale.setDefault(category30, locale32);
        java.util.Locale locale34 = java.util.Locale.getDefault(category30);
        java.lang.String str36 = locale34.getExtension('u');
        java.lang.String str37 = locale26.getDisplayName(locale34);
        java.lang.String str38 = dateTimeZone24.getName(0L, locale26);
        java.util.Locale locale39 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleAttributes();
        java.lang.String str41 = locale39.toLanguageTag();
        boolean boolean42 = locale39.hasExtensions();
        java.util.Locale locale43 = locale39.stripExtensions();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime46 = dateTime44.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime48 = dateTime44.withCenturyOfEra(50);
        org.joda.time.Instant instant49 = new org.joda.time.Instant();
        org.joda.time.Instant instant51 = instant49.minus((long) 2);
        int int52 = dateTime48.compareTo((org.joda.time.ReadableInstant) instant49);
        org.joda.time.DateTime.Property property53 = dateTime48.centuryOfEra();
        org.joda.time.DateTime dateTime55 = dateTime48.plusDays(58);
        java.util.Locale locale56 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet57 = locale56.getUnicodeLocaleAttributes();
        java.lang.String str58 = locale56.getScript();
        java.util.Set<java.lang.String> strSet59 = locale56.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet60 = locale56.getUnicodeLocaleKeys();
        java.util.Calendar calendar61 = dateTime48.toCalendar(locale56);
        java.lang.String str62 = locale43.getDisplayCountry(locale56);
        java.lang.String str63 = locale56.toLanguageTag();
        java.lang.String str64 = locale26.getDisplayVariant(locale56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and instant49", (dateTime44.compareTo(instant49) == 0) == dateTime44.equals(instant49));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Chronology chronology2 = dateTime0.getChronology();
        org.joda.time.DateTime dateTime4 = dateTime0.plusDays(2);
        org.joda.time.DateTime dateTime6 = dateTime4.plusSeconds(11751002);
        int int7 = dateTime6.getYearOfCentury();
        org.joda.time.DateTime dateTime9 = dateTime6.plusWeeks(12147499);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        java.util.Date date3 = localDate2.toDate();
        org.joda.time.LocalDate localDate5 = localDate2.withCenturyOfEra((int) 'u');
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtCurrentTime();
        int int7 = localDate2.getDayOfWeek();
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Instant instant10 = instant8.minus((long) 2);
        org.joda.time.MutableDateTime mutableDateTime11 = instant8.toMutableDateTimeISO();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTime dateTime14 = instant8.toDateTime(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight15 = localDate2.toDateMidnight(dateTimeZone13);
        org.joda.time.LocalDate localDate17 = localDate2.withYearOfEra(54613793);
        org.joda.time.LocalDate.Property property18 = localDate17.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime11", (instant8.compareTo(mutableDateTime11) == 0) == instant8.equals(mutableDateTime11));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime4 = dateTime0.withCenturyOfEra(50);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.minus((long) 2);
        int int8 = dateTime4.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.DateTime.Property property9 = dateTime4.centuryOfEra();
        org.joda.time.DateTime dateTime11 = dateTime4.plusDays(58);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMonths(32770);
        int int14 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime.Property property15 = dateTime13.hourOfDay();
        java.lang.String str16 = property15.getAsString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant5", (dateTime0.compareTo(instant5) == 0) == dateTime0.equals(instant5));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.minuteOfDay();
        org.joda.time.Chronology chronology24 = zonedChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.monthOfYear();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.monthOfYear();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.secondOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology21.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField30, and durationField22", !(durationField22.compareTo(durationField30) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField30.compareTo(durationField22))));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.plus((long) 11753187);
        org.joda.time.DateTime dateTime3 = instant0.toDateTime();
        org.joda.time.Instant instant6 = instant0.withDurationAdded((long) 54616017, 11807362);
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.plus((long) 11753187);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant2.plus(readableDuration3);
        org.joda.time.Instant instant6 = instant4.plus((long) (short) -1);
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.Instant instant9 = instant7.withMillis((long) 11);
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant9.minus(readableDuration11);
        org.joda.time.Instant instant13 = instant9.toInstant();
        org.joda.time.DateTime dateTime14 = instant9.toDateTime();
        boolean boolean15 = instant4.isEqual((org.joda.time.ReadableInstant) instant9);
        boolean boolean17 = instant4.isEqual(10075L);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant4.plus(readableDuration18);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withField(dateTimeFieldType22, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.minusYears(5);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusHours((int) '4');
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.weekyear();
        java.lang.String str30 = property29.getAsString();
        org.joda.time.LocalDateTime localDateTime31 = property29.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withMillisOfSecond((int) '#');
        org.joda.time.LocalDateTime.Property property34 = localDateTime31.era();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.withField(dateTimeFieldType37, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.minusYears(5);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withMillisOfDay(8);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime46.withField(dateTimeFieldType48, (int) (short) 10);
        boolean boolean51 = localDateTime42.isSupported(dateTimeFieldType48);
        boolean boolean52 = localDateTime41.isSupported(dateTimeFieldType48);
        boolean boolean53 = localDateTime31.isSupported(dateTimeFieldType48);
        boolean boolean54 = instant4.isSupported(dateTimeFieldType48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime14", (instant9.compareTo(dateTime14) == 0) == instant9.equals(dateTime14));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withYearOfEra(17);
        org.joda.time.DateTime dateTime10 = dateTime8.minusDays(292278993);
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.DateTime dateTime12 = instant11.toDateTime();
        org.joda.time.DateTime dateTime13 = instant11.toDateTimeISO();
        boolean boolean14 = dateTime13.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant11", (dateTime10.compareTo(instant11) == 0) == dateTime10.equals(instant11));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField26 = zonedChronology21.years();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.era();
        org.joda.time.DurationField durationField30 = zonedChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField26 and durationField30", (durationField26.compareTo(durationField30) == 0) == durationField26.equals(durationField30));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        int int7 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter4.withZone(dateTimeZone5);
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime8", (dateTime6.compareTo(dateTime8) == 0) == dateTime6.equals(dateTime8));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology21.millisOfDay();
        long long28 = zonedChronology21.add((long) 11922203, (long) 69014661, 12105178);
        org.joda.time.DurationField durationField29 = zonedChronology21.millis();
        org.joda.time.DurationField durationField30 = zonedChronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField22, and durationField29", !(durationField30.compareTo(durationField22) == 0) || (Math.signum(durationField30.compareTo(durationField29)) == Math.signum(durationField22.compareTo(durationField29))));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        long long28 = zonedChronology21.add(0L, 11776486L, 0);
        long long32 = zonedChronology21.add((long) 26198001, (long) 11797368, 32);
        org.joda.time.DurationField durationField33 = zonedChronology21.centuries();
        org.joda.time.DurationField durationField34 = zonedChronology21.millis();
        org.joda.time.DurationField durationField35 = zonedChronology21.millis();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology21.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology21.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) 100, dateTimeZone40);
        org.joda.time.LocalDate localDate43 = localDate41.plusDays(50);
        org.joda.time.Chronology chronology44 = localDate43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) 100, dateTimeZone47);
        org.joda.time.LocalDate localDate50 = localDate48.plusDays(50);
        int int51 = localDate48.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate53 = localDate48.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime();
        int int56 = dateTimeZone54.getOffset((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateMidnight dateMidnight57 = localDate48.toDateMidnight(dateTimeZone54);
        long long59 = dateTimeZone54.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology60 = org.joda.time.chrono.ZonedChronology.getInstance(chronology44, dateTimeZone54);
        org.joda.time.DurationField durationField61 = zonedChronology60.eras();
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology60.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField63 = zonedChronology60.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology60.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology60.hourOfDay();
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology60.dayOfYear();
        java.util.Locale locale71 = new java.util.Locale("", "Taiwan", "2017-02-22T07:16:52.191");
        java.lang.String str72 = dateTimeField66.getAsText(271082567L, locale71);
        java.lang.String str73 = dateTimeField37.getAsShortText(26591608, locale71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField61", Math.signum(durationField22.compareTo(durationField61)) == -Math.signum(durationField61.compareTo(durationField22)));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight3 = dateTime2.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int5 = dateTime2.get(dateTimeFieldType4);
        org.joda.time.DateTime dateTime7 = dateTime2.withMillisOfSecond(616);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(50);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.millisOfDay();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        java.util.TimeZone timeZone22 = dateTimeZone20.toTimeZone();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(72000000L, dateTimeZone20);
        int int25 = dateTimeZone20.getStandardOffset((long) 'u');
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.chrono.ZonedChronology zonedChronology27 = org.joda.time.chrono.ZonedChronology.getInstance(chronology13, dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology27.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone29 = zonedChronology27.getZone();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 100, dateTimeZone31);
        org.joda.time.LocalDate localDate34 = localDate32.plusDays(50);
        int int35 = localDate32.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate37 = localDate32.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        int int40 = dateTimeZone38.getOffset((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateMidnight dateMidnight41 = localDate32.toDateMidnight(dateTimeZone38);
        long long43 = dateTimeZone38.convertUTCToLocal(60000L);
        org.joda.time.LocalDate localDate44 = org.joda.time.LocalDate.now(dateTimeZone38);
        boolean boolean45 = zonedChronology27.equals((java.lang.Object) dateTimeZone38);
        org.joda.time.DateTime dateTime46 = dateTime7.toDateTime((org.joda.time.Chronology) zonedChronology27);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime49 = dateTime47.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int51 = dateTime49.get(dateTimeFieldType50);
        org.joda.time.DateTime dateTime53 = dateTime49.minusSeconds((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone59 = dateTimeZone58.toTimeZone();
        java.util.TimeZone timeZone60 = dateTimeZone58.toTimeZone();
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(72000000L, dateTimeZone58);
        int int63 = dateTimeZone58.getStandardOffset((long) 'u');
        java.lang.String str65 = dateTimeZone58.getName(1645142400000L);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) 11779950, dateTimeZone58);
        org.joda.time.DateTime dateTime67 = dateTime49.withZoneRetainFields(dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone73 = dateTimeZone72.toTimeZone();
        java.util.TimeZone timeZone74 = dateTimeZone72.toTimeZone();
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime(72000000L, dateTimeZone72);
        int int77 = dateTimeZone72.getStandardOffset((long) 'u');
        java.lang.String str79 = dateTimeZone72.getName(1645142400000L);
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime((long) 11779950, dateTimeZone72);
        long long82 = dateTimeZone58.getMillisKeepLocal(dateTimeZone72, (long) 11817955);
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime(dateTimeZone72);
        boolean boolean84 = dateTime46.isBefore((org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.Instant instant85 = dateTime83.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime46", (dateTime7.compareTo(dateTime46) == 0) == dateTime7.equals(dateTime46));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = zonedChronology21.add(readablePeriod24, (long) 2022, 0);
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.millisOfDay();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.year();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 100, dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.plusDays(50);
        int int38 = localDate35.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate40 = localDate35.plusMonths(6);
        int int41 = localDate35.getYearOfEra();
        int int42 = localDate35.getCenturyOfEra();
        org.joda.time.LocalDate localDate44 = localDate35.withWeekOfWeekyear((int) '#');
        org.joda.time.DateTime dateTime45 = localDate44.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.Locale locale50 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet51 = locale50.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale50);
        java.lang.String str53 = locale50.toLanguageTag();
        java.lang.String str54 = dateTimeZone48.getName((long) (byte) 1, locale50);
        org.joda.time.DateMidnight dateMidnight55 = localDate44.toDateMidnight(dateTimeZone48);
        java.lang.String str57 = dateTimeZone48.getNameKey((long) 54580);
        org.joda.time.chrono.ZonedChronology zonedChronology58 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology21, dateTimeZone48);
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology58.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology58.dayOfYear();
        org.joda.time.DurationField durationField61 = zonedChronology58.weeks();
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology58.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField61", (durationField22.compareTo(durationField61) == 0) == durationField22.equals(durationField61));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now(dateTimeZone24);
        org.joda.time.Instant instant26 = new org.joda.time.Instant();
        org.joda.time.Instant instant28 = instant26.withMillis((long) 11);
        org.joda.time.Instant instant29 = instant28.toInstant();
        org.joda.time.Chronology chronology30 = instant28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 100, dateTimeZone33);
        int int35 = dateTimeField31.getMaximumValue((org.joda.time.ReadablePartial) localDate34);
        int int37 = localDate34.getValue(2);
        org.joda.time.DateMidnight dateMidnight38 = localDate34.toDateMidnight();
        int int39 = localDate34.getDayOfWeek();
        java.util.Date date40 = localDate34.toDate();
        int int41 = date40.getYear();
        boolean boolean42 = localDate25.equals((java.lang.Object) date40);
        date40.setYear(26182);
        int int45 = date40.getTimezoneOffset();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) 100, dateTimeZone47);
        org.joda.time.LocalDate localDate50 = localDate48.plusDays(50);
        org.joda.time.Chronology chronology51 = localDate50.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) 100, dateTimeZone54);
        org.joda.time.LocalDate localDate57 = localDate55.plusDays(50);
        int int58 = localDate55.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate60 = localDate55.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime();
        int int63 = dateTimeZone61.getOffset((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.DateMidnight dateMidnight64 = localDate55.toDateMidnight(dateTimeZone61);
        long long66 = dateTimeZone61.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology67 = org.joda.time.chrono.ZonedChronology.getInstance(chronology51, dateTimeZone61);
        org.joda.time.DurationField durationField68 = zonedChronology67.eras();
        org.joda.time.DateTimeField dateTimeField69 = zonedChronology67.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField70 = zonedChronology67.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField71 = zonedChronology67.year();
        org.joda.time.DateTimeField dateTimeField72 = zonedChronology67.yearOfCentury();
        boolean boolean73 = date40.equals((java.lang.Object) zonedChronology67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField68", Math.signum(durationField22.compareTo(durationField68)) == -Math.signum(durationField68.compareTo(durationField22)));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight3 = dateTime2.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int5 = dateTime2.get(dateTimeFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.minus(readablePeriod6);
        org.joda.time.DateTime dateTime9 = dateTime2.minus((long) 43);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale19);
        java.lang.String str22 = locale19.toLanguageTag();
        java.lang.String str23 = dateTimeZone17.getName((long) (byte) 1, locale19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter12.withZone(dateTimeZone17);
        java.lang.String str26 = dateTimeZone17.getShortName((long) 11832312);
        java.util.Locale locale28 = java.util.Locale.JAPANESE;
        java.lang.String str29 = locale28.getDisplayScript();
        org.joda.time.tz.NameProvider nameProvider30 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider30);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 100, dateTimeZone33);
        org.joda.time.LocalDate localDate36 = localDate34.plusDays(50);
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.millisOfDay();
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale42 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet43 = locale42.getUnicodeLocaleAttributes();
        java.lang.String str44 = locale41.getDisplayLanguage(locale42);
        java.lang.String str45 = dateTimeField38.getAsShortText(26150856, locale42);
        java.lang.String str48 = nameProvider30.getName(locale42, "", "26150856");
        java.util.Locale locale49 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = nameProvider30.getName(locale49, "hi!", "1970");
        java.lang.String str53 = locale28.getDisplayVariant(locale49);
        java.lang.String str54 = locale49.getCountry();
        java.lang.String str55 = dateTimeZone17.getShortName((long) 11883681, locale49);
        org.joda.time.DateTime dateTime56 = dateTime2.toDateTime(dateTimeZone17);
        int int57 = dateTime2.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime56", (dateTime2.compareTo(dateTime56) == 0) == dateTime2.equals(dateTime56));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getWeeksInWeekYear();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromCalendarFields(calendar1);
        calendar1.setFirstDayOfWeek(100);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromCalendarFields(calendar1);
        boolean boolean7 = calendar1.isWeekDateSupported();
        java.util.Locale locale8 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale8);
        int int10 = calendar9.getWeeksInWeekYear();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.fromCalendarFields(calendar9);
        calendar9.setFirstDayOfWeek(100);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromCalendarFields(calendar9);
        boolean boolean15 = calendar9.isWeekDateSupported();
        java.util.Date date16 = calendar9.getTime();
        java.util.Calendar.Builder builder17 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder21 = builder17.setWeekDate((int) (short) 0, (int) '4', (int) '4');
        java.util.Calendar.Builder builder23 = builder21.setLenient(false);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        java.util.TimeZone timeZone30 = dateTimeZone28.toTimeZone();
        boolean boolean31 = timeZone25.hasSameRules(timeZone30);
        java.util.Calendar.Builder builder32 = builder21.setTimeZone(timeZone30);
        java.util.TimeZone.setDefault(timeZone30);
        java.util.TimeZone.setDefault(timeZone30);
        java.time.ZoneId zoneId35 = timeZone30.toZoneId();
        java.util.TimeZone timeZone36 = java.util.TimeZone.getTimeZone(zoneId35);
        calendar9.setTimeZone(timeZone36);
        calendar1.setTimeZone(timeZone36);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        org.joda.time.Instant instant40 = dateTime39.toInstant();
        org.joda.time.Chronology chronology41 = dateTime39.getChronology();
        org.joda.time.DateTime dateTime43 = dateTime39.plusDays(2);
        java.util.Date date44 = dateTime39.toDate();
        java.lang.String str46 = dateTime39.toString("15");
        org.joda.time.DateTime dateTime48 = dateTime39.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) 100, dateTimeZone50);
        org.joda.time.LocalDate localDate53 = localDate51.plusDays(50);
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate((long) 100, dateTimeZone57);
        org.joda.time.LocalDate localDate60 = localDate58.plusDays(50);
        int int61 = localDate58.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate63 = localDate58.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime();
        int int66 = dateTimeZone64.getOffset((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.DateMidnight dateMidnight67 = localDate58.toDateMidnight(dateTimeZone64);
        long long69 = dateTimeZone64.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology70 = org.joda.time.chrono.ZonedChronology.getInstance(chronology54, dateTimeZone64);
        org.joda.time.DurationField durationField71 = zonedChronology70.weeks();
        org.joda.time.DateTimeField dateTimeField72 = zonedChronology70.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        long long76 = zonedChronology70.add(readablePeriod73, (long) 2022, 0);
        org.joda.time.DateTimeField dateTimeField77 = zonedChronology70.millisOfDay();
        org.joda.time.DateTimeField dateTimeField78 = zonedChronology70.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField79 = zonedChronology70.year();
        org.joda.time.DateTimeField dateTimeField80 = zonedChronology70.yearOfEra();
        org.joda.time.DateTimeField dateTimeField81 = zonedChronology70.year();
        org.joda.time.DateTimeField dateTimeField82 = zonedChronology70.secondOfDay();
        org.joda.time.DateTimeField dateTimeField83 = zonedChronology70.secondOfMinute();
        org.joda.time.DateTime dateTime84 = dateTime39.toDateTime((org.joda.time.Chronology) zonedChronology70);
        boolean boolean85 = calendar1.after((java.lang.Object) zonedChronology70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime84", (dateTime39.compareTo(dateTime84) == 0) == dateTime39.equals(dateTime84));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DurationField durationField23 = zonedChronology21.millis();
        long long25 = durationField23.getValueAsLong((long) 11781671);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 100, dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate28.plusDays(50);
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 100, dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.plusDays(50);
        int int38 = localDate35.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate40 = localDate35.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime();
        int int43 = dateTimeZone41.getOffset((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateMidnight dateMidnight44 = localDate35.toDateMidnight(dateTimeZone41);
        long long46 = dateTimeZone41.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology47 = org.joda.time.chrono.ZonedChronology.getInstance(chronology31, dateTimeZone41);
        org.joda.time.DurationField durationField48 = zonedChronology47.weeks();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology47.year();
        org.joda.time.DateTimeZone dateTimeZone50 = zonedChronology47.getZone();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology47.weekyear();
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology47.minuteOfHour();
        org.joda.time.DurationField durationField53 = zonedChronology47.hours();
        org.joda.time.DurationField durationField54 = zonedChronology47.weeks();
        org.joda.time.DateTimeField dateTimeField55 = zonedChronology47.hourOfHalfday();
        org.joda.time.DurationField durationField56 = dateTimeField55.getRangeDurationField();
        long long59 = durationField56.getMillis(11764640, (long) 11786512);
        boolean boolean60 = durationField56.isSupported();
        int int61 = durationField23.compareTo(durationField56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField48", (durationField22.compareTo(durationField48) == 0) == durationField22.equals(durationField48));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) 11757696, (int) ' ');
        int int12 = dateTime6.getWeekOfWeekyear();
        int int13 = dateTime6.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        java.util.TimeZone timeZone19 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(72000000L, dateTimeZone17);
        int int22 = dateTimeZone17.getStandardOffset((long) 'u');
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.DateTime dateTime24 = dateTime6.withZone(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight25 = dateTime24.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 100, dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate28.plusDays(50);
        int int31 = localDate28.getWeekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight32 = localDate28.toDateMidnight();
        int int33 = localDate28.getDayOfWeek();
        org.joda.time.LocalDate localDate35 = localDate28.plusYears(11751002);
        int int36 = localDate35.getWeekyear();
        org.joda.time.DateTime dateTime37 = dateTime24.withFields((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 100, dateTimeZone39);
        org.joda.time.LocalDate.Property property41 = localDate40.weekyear();
        org.joda.time.LocalDate localDate43 = property41.setCopy(2022);
        org.joda.time.Instant instant44 = new org.joda.time.Instant();
        org.joda.time.Instant instant46 = instant44.withMillis((long) 11);
        org.joda.time.Instant instant47 = instant46.toInstant();
        org.joda.time.Chronology chronology48 = instant46.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) 100, dateTimeZone51);
        int int53 = dateTimeField49.getMaximumValue((org.joda.time.ReadablePartial) localDate52);
        int int55 = localDate52.getValue(2);
        org.joda.time.DateMidnight dateMidnight56 = localDate52.toDateMidnight();
        org.joda.time.LocalDate localDate58 = localDate52.plusMonths(26160535);
        int int59 = localDate58.getYear();
        boolean boolean60 = property41.equals((java.lang.Object) localDate58);
        org.joda.time.LocalDate localDate62 = localDate58.minusWeeks(73644);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalDate localDate64 = localDate58.plus(readablePeriod63);
        java.util.Date date65 = localDate64.toDate();
        org.joda.time.LocalDate localDate67 = localDate64.withYearOfCentury(1);
        org.joda.time.LocalDate localDate69 = localDate67.minusMonths(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = localDate69.getFieldType(0);
        boolean boolean72 = localDate35.isSupported(dateTimeFieldType71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime24", (dateTime6.compareTo(dateTime24) == 0) == dateTime6.equals(dateTime24));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.millisOfDay();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        java.util.TimeZone timeZone14 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(72000000L, dateTimeZone12);
        int int17 = dateTimeZone12.getStandardOffset((long) 'u');
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.chrono.ZonedChronology zonedChronology19 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology19.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone21 = zonedChronology19.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 100, dateTimeZone23);
        org.joda.time.LocalDate localDate26 = localDate24.plusDays(50);
        int int27 = localDate24.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate29 = localDate24.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        int int32 = dateTimeZone30.getOffset((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateMidnight dateMidnight33 = localDate24.toDateMidnight(dateTimeZone30);
        long long35 = dateTimeZone30.convertUTCToLocal(60000L);
        org.joda.time.LocalDate localDate36 = org.joda.time.LocalDate.now(dateTimeZone30);
        boolean boolean37 = zonedChronology19.equals((java.lang.Object) dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology19.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology19.weekyear();
        org.joda.time.DurationField durationField40 = zonedChronology19.eras();
        org.joda.time.DurationField durationField41 = zonedChronology19.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField40, durationField41, and durationField40", !(durationField40.compareTo(durationField41) == 0) || (Math.signum(durationField40.compareTo(durationField40)) == Math.signum(durationField41.compareTo(durationField40))));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.centuryOfEra();
        org.joda.time.DurationField durationField26 = zonedChronology21.centuries();
        org.joda.time.DurationField durationField27 = zonedChronology21.minutes();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = zonedChronology21.getZone();
        org.joda.time.DurationField durationField30 = zonedChronology21.years();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField24 and durationField30", (durationField24.compareTo(durationField30) == 0) == durationField24.equals(durationField30));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.LocalDate localDate5 = localDate2.plusDays(51);
        org.joda.time.DateTime dateTime6 = localDate5.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime8 = dateTime6.plusMonths(11803413);
        org.joda.time.DateTime dateTime10 = dateTime8.plus((long) 26212957);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 100, dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate13.plusDays(50);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 100, dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate20.plusDays(50);
        int int23 = localDate20.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate25 = localDate20.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        int int28 = dateTimeZone26.getOffset((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateMidnight dateMidnight29 = localDate20.toDateMidnight(dateTimeZone26);
        long long31 = dateTimeZone26.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology32 = org.joda.time.chrono.ZonedChronology.getInstance(chronology16, dateTimeZone26);
        org.joda.time.DurationField durationField33 = zonedChronology32.weeks();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology32.year();
        org.joda.time.DateTimeZone dateTimeZone35 = zonedChronology32.getZone();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology32.halfdayOfDay();
        org.joda.time.DurationField durationField37 = zonedChronology32.hours();
        org.joda.time.DurationField durationField38 = zonedChronology32.months();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology32.monthOfYear();
        org.joda.time.DurationField durationField40 = zonedChronology32.seconds();
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology32.millisOfDay();
        java.util.Locale locale42 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet43 = locale42.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor44 = strSet43.iterator();
        java.util.stream.Stream<java.lang.String> strStream45 = strSet43.parallelStream();
        java.util.Locale locale46 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet47 = locale46.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor48 = strSet47.iterator();
        boolean boolean49 = strSet43.removeAll((java.util.Collection<java.lang.String>) strSet47);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone53 = dateTimeZone52.toTimeZone();
        boolean boolean54 = strSet43.equals((java.lang.Object) dateTimeZone52);
        long long56 = dateTimeZone52.previousTransition(6059809176L);
        org.joda.time.Chronology chronology57 = zonedChronology32.withZone(dateTimeZone52);
        org.joda.time.DateTime dateTime58 = dateTime10.toDateTime(dateTimeZone52);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate((long) 100, dateTimeZone61);
        org.joda.time.LocalDate localDate64 = localDate62.plusDays(50);
        org.joda.time.Chronology chronology65 = localDate64.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate((long) 100, dateTimeZone68);
        org.joda.time.LocalDate localDate71 = localDate69.plusDays(50);
        int int72 = localDate69.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate74 = localDate69.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime();
        int int77 = dateTimeZone75.getOffset((org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.DateMidnight dateMidnight78 = localDate69.toDateMidnight(dateTimeZone75);
        long long80 = dateTimeZone75.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology81 = org.joda.time.chrono.ZonedChronology.getInstance(chronology65, dateTimeZone75);
        org.joda.time.DurationField durationField82 = zonedChronology81.weeks();
        org.joda.time.DateTimeField dateTimeField83 = zonedChronology81.centuryOfEra();
        org.joda.time.DurationField durationField84 = zonedChronology81.minutes();
        org.joda.time.DateTimeField dateTimeField85 = zonedChronology81.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone86 = zonedChronology81.getZone();
        boolean boolean88 = dateTimeZone86.isStandardOffset(5923851084717420000L);
        long long91 = dateTimeZone86.convertLocalToUTC((long) 26226390, false);
        org.joda.time.DateTime dateTime92 = org.joda.time.DateTime.now(dateTimeZone86);
        org.joda.time.DateTime dateTime93 = localDate59.toDateTimeAtMidnight(dateTimeZone86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime58", (dateTime10.compareTo(dateTime58) == 0) == dateTime10.equals(dateTime58));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusYears(5);
        int int7 = localDateTime0.getYearOfCentury();
        org.joda.time.Chronology chronology8 = localDateTime0.getChronology();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.withMillis((long) 11);
        org.joda.time.DateTimeZone dateTimeZone13 = instant10.getZone();
        org.joda.time.Chronology chronology14 = chronology8.withZone(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime15.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.DateTime dateTime21 = dateTime15.toDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime21", (instant10.compareTo(dateTime21) == 0) == instant10.equals(dateTime21));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(53);
        org.joda.time.Chronology chronology5 = localDate2.getChronology();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.plusDays(50);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 100, dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.plusDays(50);
        int int21 = localDate18.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate23 = localDate18.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        int int26 = dateTimeZone24.getOffset((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateMidnight dateMidnight27 = localDate18.toDateMidnight(dateTimeZone24);
        long long29 = dateTimeZone24.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology30 = org.joda.time.chrono.ZonedChronology.getInstance(chronology14, dateTimeZone24);
        org.joda.time.DurationField durationField31 = zonedChronology30.weeks();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology30.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = zonedChronology30.centuries();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology30.dayOfWeek();
        org.joda.time.DurationField durationField35 = zonedChronology30.millis();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 52, (org.joda.time.Chronology) zonedChronology30);
        boolean boolean37 = localDate7.equals((java.lang.Object) zonedChronology30);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology30.dayOfMonth();
        org.joda.time.DurationField durationField39 = zonedChronology30.weekyears();
        org.joda.time.DurationField durationField40 = zonedChronology30.days();
        org.joda.time.DurationField durationField41 = zonedChronology30.years();
        org.joda.time.DurationField durationField42 = zonedChronology30.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField42 and durationField41", (durationField42.compareTo(durationField41) == 0) == durationField42.equals(durationField41));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setMinimalDaysInFirstWeek(26168469);
        calendar1.set(11757696, 16, (int) (short) 100);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis((long) 11);
        org.joda.time.Instant instant12 = instant11.toInstant();
        org.joda.time.Chronology chronology13 = instant11.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) '#', chronology13);
        boolean boolean15 = calendar1.before((java.lang.Object) chronology13);
        org.joda.time.DurationField durationField16 = chronology13.millis();
        org.joda.time.DurationFieldType durationFieldType17 = durationField16.getType();
        org.joda.time.DurationFieldType durationFieldType18 = durationField16.getType();
        java.util.Locale locale19 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(locale19);
        calendar20.setMinimalDaysInFirstWeek(26168469);
        calendar20.set(11757696, 16, (int) (short) 100);
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant28.withMillis((long) 11);
        org.joda.time.Instant instant31 = instant30.toInstant();
        org.joda.time.Chronology chronology32 = instant30.getChronology();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) '#', chronology32);
        boolean boolean34 = calendar20.before((java.lang.Object) chronology32);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 10);
        org.joda.time.DateTime dateTime38 = dateTime36.plusMinutes(49);
        org.joda.time.DateTime dateTime40 = dateTime38.plus(10L);
        org.joda.time.Chronology chronology41 = dateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.monthOfYear();
        boolean boolean43 = calendar20.after((java.lang.Object) chronology41);
        org.joda.time.DurationField durationField44 = durationFieldType18.getField(chronology41);
        org.joda.time.DurationField durationField45 = chronology41.eras();
        org.joda.time.DateTimeField dateTimeField46 = chronology41.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField45", Math.signum(durationField16.compareTo(durationField45)) == -Math.signum(durationField45.compareTo(durationField16)));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMonths(11821997);
        int int5 = dateTime2.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.plusDays(50);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 100, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.plusDays(50);
        int int18 = localDate15.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate20 = localDate15.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        int int23 = dateTimeZone21.getOffset((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateMidnight dateMidnight24 = localDate15.toDateMidnight(dateTimeZone21);
        long long26 = dateTimeZone21.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology27 = org.joda.time.chrono.ZonedChronology.getInstance(chronology11, dateTimeZone21);
        org.joda.time.DurationField durationField28 = zonedChronology27.weeks();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology27.year();
        org.joda.time.DateTimeZone dateTimeZone30 = zonedChronology27.getZone();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology27.weekyear();
        org.joda.time.DurationField durationField32 = zonedChronology27.years();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology27.centuryOfEra();
        org.joda.time.DurationField durationField34 = zonedChronology27.halfdays();
        org.joda.time.DurationField durationField35 = zonedChronology27.millis();
        org.joda.time.DateTime dateTime36 = dateTime2.toDateTime((org.joda.time.Chronology) zonedChronology27);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((org.joda.time.Chronology) zonedChronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime36", (dateTime2.compareTo(dateTime36) == 0) == dateTime2.equals(dateTime36));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        java.lang.String str1 = durationFieldType0.getName();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 100, dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.plusDays(50);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.plusDays(50);
        int int14 = localDate11.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate16 = localDate11.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        int int19 = dateTimeZone17.getOffset((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateMidnight dateMidnight20 = localDate11.toDateMidnight(dateTimeZone17);
        long long22 = dateTimeZone17.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology23 = org.joda.time.chrono.ZonedChronology.getInstance(chronology7, dateTimeZone17);
        org.joda.time.DurationField durationField24 = zonedChronology23.weeks();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology23.weekyear();
        org.joda.time.DurationField durationField26 = zonedChronology23.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology23.year();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology23.hourOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology23.dayOfYear();
        org.joda.time.DurationField durationField31 = zonedChronology23.weeks();
        org.joda.time.DurationField durationField32 = zonedChronology23.seconds();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology23.hourOfDay();
        org.joda.time.DurationField durationField34 = durationFieldType0.getField((org.joda.time.Chronology) zonedChronology23);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 100, dateTimeZone36);
        org.joda.time.LocalDate localDate39 = localDate37.plusDays(50);
        org.joda.time.Chronology chronology40 = localDate39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) 100, dateTimeZone43);
        org.joda.time.LocalDate localDate46 = localDate44.plusDays(50);
        int int47 = localDate44.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate49 = localDate44.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        int int52 = dateTimeZone50.getOffset((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateMidnight dateMidnight53 = localDate44.toDateMidnight(dateTimeZone50);
        long long55 = dateTimeZone50.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology56 = org.joda.time.chrono.ZonedChronology.getInstance(chronology40, dateTimeZone50);
        org.joda.time.DurationField durationField57 = zonedChronology56.weeks();
        org.joda.time.DateTimeField dateTimeField58 = zonedChronology56.year();
        org.joda.time.DateTimeZone dateTimeZone59 = zonedChronology56.getZone();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology56.weekyear();
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        long long64 = zonedChronology56.add(readablePeriod61, (long) 11783576, 26163273);
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology56.dayOfYear();
        org.joda.time.DurationField durationField66 = zonedChronology56.weeks();
        org.joda.time.DateTimeField dateTimeField67 = zonedChronology56.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField68 = zonedChronology56.secondOfDay();
        org.joda.time.DurationField durationField69 = zonedChronology56.weekyears();
        org.joda.time.DateTimeZone dateTimeZone70 = zonedChronology56.getZone();
        org.joda.time.DurationField durationField71 = durationFieldType0.getField((org.joda.time.Chronology) zonedChronology56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField24 and durationField57", (durationField24.compareTo(durationField57) == 0) == durationField24.equals(durationField57));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int5 = dateTime3.get(dateTimeFieldType4);
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType4.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.centuries();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfDay();
        org.joda.time.DurationField durationField15 = durationFieldType6.getField(chronology12);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now(chronology12);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 11949779, chronology12);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(11797708);
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        java.lang.String str21 = dateTimeZone19.toString();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) dateTime17, dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime20", (dateTime1.compareTo(dateTime20) == 0) == dateTime1.equals(dateTime20));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withMinuteOfHour(14);
        int int3 = dateTime2.getYearOfCentury();
        org.joda.time.DateTime dateTime5 = dateTime2.plus((long) 11767256);
        long long6 = dateTime5.getMillis();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.minus(readablePeriod7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        int int11 = dateTimeZone9.getOffsetFromLocal((long) 'a');
        long long14 = dateTimeZone9.adjustOffset(9505L, true);
        int int16 = dateTimeZone9.getOffsetFromLocal((long) 365);
        org.joda.time.DateTime dateTime17 = dateTime8.withZoneRetainFields(dateTimeZone9);
        int int18 = dateTime8.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 100, dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.plusDays(50);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 100, dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate28.plusDays(50);
        int int31 = localDate28.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate33 = localDate28.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        int int36 = dateTimeZone34.getOffset((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateMidnight dateMidnight37 = localDate28.toDateMidnight(dateTimeZone34);
        long long39 = dateTimeZone34.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology40 = org.joda.time.chrono.ZonedChronology.getInstance(chronology24, dateTimeZone34);
        org.joda.time.DurationField durationField41 = zonedChronology40.weeks();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology40.year();
        org.joda.time.DateTimeZone dateTimeZone43 = zonedChronology40.getZone();
        org.joda.time.DurationField durationField44 = zonedChronology40.weekyears();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology40.clockhourOfHalfday();
        org.joda.time.DurationField durationField46 = zonedChronology40.seconds();
        org.joda.time.DurationField durationField47 = zonedChronology40.millis();
        org.joda.time.DateTime dateTime48 = dateTime8.toDateTime((org.joda.time.Chronology) zonedChronology40);
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology40.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime48", (dateTime5.compareTo(dateTime48) == 0) == dateTime5.equals(dateTime48));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DurationField durationField23 = zonedChronology21.millis();
        org.joda.time.DurationField durationField24 = zonedChronology21.millis();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        int int26 = dateTime25.getDayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime25.withYear(11751002);
        org.joda.time.Instant instant29 = dateTime25.toInstant();
        org.joda.time.DateTime.Property property30 = dateTime25.monthOfYear();
        boolean boolean31 = zonedChronology21.equals((java.lang.Object) dateTime25);
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology21.minuteOfDay();
        org.joda.time.DurationField durationField33 = zonedChronology21.hours();
        org.joda.time.DurationField durationField34 = zonedChronology21.months();
        int int37 = durationField34.getValue(0L, 227188536L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant29", (dateTime16.compareTo(instant29) == 0) == dateTime16.equals(instant29));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        int int9 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        int int11 = localDate8.getValue(2);
        org.joda.time.DateMidnight dateMidnight12 = localDate8.toDateMidnight();
        org.joda.time.LocalDate.Property property13 = localDate8.era();
        org.joda.time.LocalDate localDate14 = property13.getLocalDate();
        org.joda.time.LocalDate.Property property15 = localDate14.weekyear();
        org.joda.time.LocalDate.Property property16 = localDate14.yearOfCentury();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int21 = dateTime19.get(dateTimeFieldType20);
        org.joda.time.DateTime dateTime23 = dateTime19.minusMillis((int) '#');
        org.joda.time.DateTime dateTime25 = dateTime23.plusDays(11);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime23.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime28 = dateTime23.withMillis((long) 11898375);
        long long29 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime17", (instant0.compareTo(dateTime17) == 0) == instant0.equals(dateTime17));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = instant2.toMutableDateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = dateTime9.plusDays(5);
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded((long) 1969, 11821997);
        boolean boolean17 = instant2.isAfter((org.joda.time.ReadableInstant) dateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime7", (instant0.compareTo(dateTime7) == 0) == instant0.equals(dateTime7));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone26 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = zonedChronology21.getZone();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.minusMonths(11825569);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 100, dateTimeZone34);
        org.joda.time.LocalDate.Property property36 = localDate35.weekyear();
        org.joda.time.LocalDate localDate38 = localDate35.minusMonths(11753234);
        org.joda.time.tz.NameProvider nameProvider40 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider40);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) 100, dateTimeZone43);
        org.joda.time.LocalDate localDate46 = localDate44.plusDays(50);
        org.joda.time.Chronology chronology47 = localDate46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.millisOfDay();
        java.util.Locale locale51 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale52 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet53 = locale52.getUnicodeLocaleAttributes();
        java.lang.String str54 = locale51.getDisplayLanguage(locale52);
        java.lang.String str55 = dateTimeField48.getAsShortText(26150856, locale52);
        java.lang.String str58 = nameProvider40.getName(locale52, "", "26150856");
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate((long) 100, dateTimeZone60);
        org.joda.time.LocalDate localDate63 = localDate61.minusYears(53);
        org.joda.time.Chronology chronology64 = localDate61.getChronology();
        org.joda.time.Chronology chronology65 = localDate61.getChronology();
        org.joda.time.LocalDate.Property property66 = localDate61.weekOfWeekyear();
        java.util.Locale locale67 = java.util.Locale.KOREAN;
        int int68 = property66.getMaximumShortTextLength(locale67);
        java.lang.String str71 = nameProvider40.getName(locale67, "14", "DurationField[years]");
        java.util.Locale locale73 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale74 = java.util.Locale.TAIWAN;
        java.lang.String str75 = locale73.getDisplayCountry(locale74);
        java.util.Calendar calendar76 = java.util.Calendar.getInstance(locale74);
        java.util.Locale locale77 = java.util.Locale.PRC;
        java.lang.String str78 = locale74.getDisplayCountry(locale77);
        java.lang.String str79 = locale74.getISO3Country();
        java.util.Locale.setDefault(locale74);
        java.lang.String str83 = nameProvider40.getShortName(locale74, "1970-01-01T00:00:00.010Z", "1970-4-10 0:00:00");
        java.lang.String str84 = localDate38.toString("72057722", locale74);
        java.util.Calendar calendar85 = dateTime32.toCalendar(locale74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime30", (dateTime16.compareTo(dateTime30) == 0) == dateTime16.equals(dateTime30));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusSeconds((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = localTime13.getFieldType((int) (byte) 1);
        int int16 = localTime11.get(dateTimeFieldType15);
        org.joda.time.LocalTime.Property property17 = localTime9.property(dateTimeFieldType15);
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.DateTime dateTime20 = dateTime6.withFields((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.LocalTime localTime22 = localTime19.plusHours(11941322);
        org.joda.time.DateTime dateTime23 = localTime22.toDateTimeToday();
        int int24 = localTime22.getMillisOfDay();
        org.joda.time.DateTime dateTime25 = localTime22.toDateTimeToday();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Instant instant27 = dateTime26.toInstant();
        org.joda.time.Chronology chronology28 = dateTime26.getChronology();
        org.joda.time.DateTime dateTime30 = dateTime26.plusDays(2);
        java.util.Date date31 = dateTime26.toDate();
        java.lang.String str33 = dateTime26.toString("15");
        org.joda.time.DateTime dateTime35 = dateTime26.withYearOfEra(54600898);
        org.joda.time.DateTime dateTime37 = dateTime26.withYearOfEra(11847029);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((java.lang.Object) dateTime37);
        boolean boolean39 = dateTime25.isAfter((org.joda.time.ReadableInstant) dateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant27", (dateTime0.compareTo(instant27) == 0) == dateTime0.equals(instant27));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(32772L, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 100, dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.plusDays(50);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 100, dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate13.plusDays(50);
        int int16 = localDate13.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate18 = localDate13.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        int int21 = dateTimeZone19.getOffset((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateMidnight dateMidnight22 = localDate13.toDateMidnight(dateTimeZone19);
        long long24 = dateTimeZone19.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology25 = org.joda.time.chrono.ZonedChronology.getInstance(chronology9, dateTimeZone19);
        org.joda.time.DurationField durationField26 = zonedChronology25.weeks();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology25.centuryOfEra();
        org.joda.time.DurationField durationField28 = zonedChronology25.minutes();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology25.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone30 = zonedChronology25.getZone();
        boolean boolean32 = dateTimeZone30.isStandardOffset(5923851084717420000L);
        long long34 = dateTimeZone30.convertUTCToLocal((long) 11828);
        java.lang.String str36 = dateTimeZone30.getShortName(1645525836972L);
        boolean boolean37 = dateTimeZone30.isFixed();
        org.joda.time.DateTime dateTime38 = dateTime2.withZone(dateTimeZone30);
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime38", (dateTime2.compareTo(dateTime38) == 0) == dateTime2.equals(dateTime38));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        int int8 = dateTime2.getYearOfEra();
        org.joda.time.Instant instant9 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant9.withDurationAdded(readableDuration11, 11768869);
        org.joda.time.Instant instant15 = instant13.plus((long) 11859299);
        org.joda.time.Instant instant17 = instant15.withMillis((long) 11883681);
        org.joda.time.Chronology chronology18 = instant15.getChronology();
        org.joda.time.Instant instant19 = instant15.toInstant();
        org.joda.time.MutableDateTime mutableDateTime20 = instant15.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant9", (dateTime2.compareTo(instant9) == 0) == dateTime2.equals(instant9));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = instant5.toDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfWeek();
        int int8 = property7.getLeapAmount();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime6", (instant2.compareTo(dateTime6) == 0) == instant2.equals(dateTime6));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        org.joda.time.DateTime dateTime14 = dateTime6.minusDays(22);
        org.joda.time.DateTime dateTime16 = dateTime6.withYearOfCentury(14);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.Instant instant19 = instant17.plus((long) 11753187);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant19.plus(readableDuration20);
        boolean boolean22 = dateTime6.equals((java.lang.Object) instant21);
        org.joda.time.DateMidnight dateMidnight23 = dateTime6.toDateMidnight();
        org.joda.time.Instant instant24 = dateTime6.toInstant();
        org.joda.time.DateTime.Property property25 = dateTime6.hourOfDay();
        org.joda.time.DateTime dateTime26 = property25.roundFloorCopy();
        org.joda.time.DateTime dateTime27 = property25.roundFloorCopy();
        java.lang.String str28 = property25.getAsString();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime31 = dateTime29.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight32 = dateTime31.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int34 = dateTime31.get(dateTimeFieldType33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime36 = dateTime31.minus(readablePeriod35);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) 100, dateTimeZone38);
        org.joda.time.LocalDate localDate41 = localDate39.plusDays(50);
        org.joda.time.Chronology chronology42 = localDate41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 100, dateTimeZone45);
        org.joda.time.LocalDate localDate48 = localDate46.plusDays(50);
        int int49 = localDate46.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate51 = localDate46.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime();
        int int54 = dateTimeZone52.getOffset((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateMidnight dateMidnight55 = localDate46.toDateMidnight(dateTimeZone52);
        long long57 = dateTimeZone52.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology58 = org.joda.time.chrono.ZonedChronology.getInstance(chronology42, dateTimeZone52);
        org.joda.time.DurationField durationField59 = zonedChronology58.weeks();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology58.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        long long64 = zonedChronology58.add(readablePeriod61, (long) 2022, 0);
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology58.millisOfDay();
        java.util.Locale locale67 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(locale67);
        java.lang.String str69 = dateTimeField65.getAsText(11802246, locale67);
        java.lang.String str70 = locale67.getVariant();
        java.lang.String str71 = locale67.getLanguage();
        java.util.Calendar calendar72 = dateTime36.toCalendar(locale67);
        java.lang.String str73 = locale67.getDisplayVariant();
        java.lang.String str74 = locale67.getDisplayCountry();
        java.lang.String str75 = property25.getAsShortText(locale67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant17", (dateTime0.compareTo(instant17) == 0) == dateTime0.equals(instant17));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withMinuteOfHour(14);
        int int3 = dateTime2.getYearOfCentury();
        org.joda.time.DateTime dateTime5 = dateTime2.plus((long) 11767256);
        long long6 = dateTime5.getMillis();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.minus(readablePeriod7);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis((long) 11);
        org.joda.time.Instant instant12 = instant11.toInstant();
        org.joda.time.Chronology chronology13 = instant11.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.minuteOfHour();
        org.joda.time.DateTime dateTime16 = dateTime8.withChronology(chronology13);
        int int17 = dateTime16.getDayOfWeek();
        java.lang.String str18 = dateTime16.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant9", (dateTime0.compareTo(instant9) == 0) == dateTime0.equals(instant9));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        java.lang.String str23 = zonedChronology21.toString();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 100, dateTimeZone25);
        org.joda.time.LocalDate.Property property27 = localDate26.weekyear();
        org.joda.time.LocalDate localDate29 = property27.setCopy(2022);
        org.joda.time.Instant instant30 = new org.joda.time.Instant();
        org.joda.time.Instant instant32 = instant30.withMillis((long) 11);
        org.joda.time.Instant instant33 = instant32.toInstant();
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 100, dateTimeZone37);
        int int39 = dateTimeField35.getMaximumValue((org.joda.time.ReadablePartial) localDate38);
        int int41 = localDate38.getValue(2);
        org.joda.time.DateMidnight dateMidnight42 = localDate38.toDateMidnight();
        org.joda.time.LocalDate localDate44 = localDate38.plusMonths(26160535);
        int int45 = localDate44.getYear();
        boolean boolean46 = property27.equals((java.lang.Object) localDate44);
        org.joda.time.DateTime dateTime47 = localDate44.toDateTimeAtStartOfDay();
        boolean boolean48 = zonedChronology21.equals((java.lang.Object) dateTime47);
        org.joda.time.DurationField durationField49 = zonedChronology21.days();
        org.joda.time.DurationField durationField50 = zonedChronology21.minutes();
        org.joda.time.DurationField durationField51 = zonedChronology21.centuries();
        org.joda.time.DateTimeZone dateTimeZone52 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField54 = zonedChronology21.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField55 = zonedChronology21.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant30", (dateTime16.compareTo(instant30) == 0) == dateTime16.equals(instant30));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays((int) (short) 1);
        org.joda.time.LocalDate localDate6 = localDate4.plusDays((int) (short) 0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekyear();
        int int8 = localDate6.getYearOfEra();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime13 = dateTime11.minus(0L);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        org.joda.time.DateTime dateTime17 = dateTime13.withZone(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = localDate6.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime20 = dateTime18.withYear(73644);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 100, dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.plusDays(50);
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        int int27 = localDate25.size();
        org.joda.time.LocalDate.Property property28 = localDate25.monthOfYear();
        org.joda.time.LocalDate localDate29 = property28.getLocalDate();
        org.joda.time.Instant instant30 = new org.joda.time.Instant();
        org.joda.time.Instant instant32 = instant30.withMillis((long) 11);
        org.joda.time.Instant instant33 = instant32.toInstant();
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 100, dateTimeZone37);
        int int39 = dateTimeField35.getMaximumValue((org.joda.time.ReadablePartial) localDate38);
        boolean boolean40 = dateTimeField35.isSupported();
        int int43 = dateTimeField35.getDifference((long) 4, (long) (-1));
        java.util.Locale locale45 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet46 = locale45.getUnicodeLocaleAttributes();
        java.lang.String str47 = locale45.toLanguageTag();
        java.lang.String str48 = dateTimeField35.getAsText((long) 11753441, locale45);
        long long51 = dateTimeField35.add((long) (short) 0, 20);
        java.util.Locale locale54 = java.util.Locale.forLanguageTag("java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        java.lang.String str55 = dateTimeField35.getAsText(26351, locale54);
        int int56 = property28.getMaximumShortTextLength(locale54);
        java.util.Calendar calendar57 = dateTime20.toCalendar(locale54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant30", (dateTime9.compareTo(instant30) == 0) == dateTime9.equals(instant30));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.DateTimeZone dateTimeZone3 = instant0.getZone();
        org.joda.time.DateTime dateTime4 = instant0.toDateTime();
        org.joda.time.DateTime.Property property5 = dateTime4.monthOfYear();
        org.joda.time.DateTime dateTime6 = property5.roundFloorCopy();
        org.joda.time.DateTime dateTime8 = dateTime6.plusMonths(11872969);
        org.joda.time.DateTime.Property property9 = dateTime6.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology21.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 100, dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate25.plusDays(50);
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 100, dateTimeZone31);
        org.joda.time.LocalDate localDate34 = localDate32.plusDays(50);
        int int35 = localDate32.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate37 = localDate32.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        int int40 = dateTimeZone38.getOffset((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateMidnight dateMidnight41 = localDate32.toDateMidnight(dateTimeZone38);
        long long43 = dateTimeZone38.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology44 = org.joda.time.chrono.ZonedChronology.getInstance(chronology28, dateTimeZone38);
        org.joda.time.DurationField durationField45 = zonedChronology44.eras();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology44.minuteOfDay();
        org.joda.time.Chronology chronology47 = zonedChronology44.withUTC();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology44.dayOfMonth();
        java.lang.String str50 = dateTimeField48.getAsText((long) 11817955);
        boolean boolean51 = zonedChronology21.equals((java.lang.Object) dateTimeField48);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) 100, dateTimeZone53);
        org.joda.time.LocalDate localDate56 = localDate54.plusDays(50);
        org.joda.time.Chronology chronology57 = localDate56.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate((long) 100, dateTimeZone60);
        org.joda.time.LocalDate localDate63 = localDate61.plusDays(50);
        int int64 = localDate61.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate66 = localDate61.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime();
        int int69 = dateTimeZone67.getOffset((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.DateMidnight dateMidnight70 = localDate61.toDateMidnight(dateTimeZone67);
        long long72 = dateTimeZone67.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology73 = org.joda.time.chrono.ZonedChronology.getInstance(chronology57, dateTimeZone67);
        org.joda.time.DateTimeField dateTimeField74 = zonedChronology73.yearOfCentury();
        org.joda.time.DurationField durationField75 = zonedChronology73.millis();
        org.joda.time.DurationField durationField76 = zonedChronology73.seconds();
        org.joda.time.DateTimeField dateTimeField77 = zonedChronology73.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField78 = zonedChronology73.secondOfMinute();
        org.joda.time.DurationField durationField79 = zonedChronology73.seconds();
        org.joda.time.DateTimeZone dateTimeZone80 = zonedChronology73.getZone();
        org.joda.time.Chronology chronology81 = zonedChronology21.withZone(dateTimeZone80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField45 and durationField75", Math.signum(durationField45.compareTo(durationField75)) == -Math.signum(durationField75.compareTo(durationField45)));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant2.minus(readableDuration4);
        org.joda.time.Instant instant6 = instant2.toInstant();
        org.joda.time.Instant instant8 = instant6.withMillis((long) 59);
        org.joda.time.Instant instant10 = instant6.plus((long) '4');
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str13 = dateTimeZone12.toString();
        org.joda.time.MutableDateTime mutableDateTime14 = instant6.toMutableDateTime(dateTimeZone12);
        int int15 = mutableDateTime14.getMinuteOfDay();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int20 = dateTime18.get(dateTimeFieldType19);
        org.joda.time.DateTime dateTime22 = dateTime18.minusSeconds((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        java.util.TimeZone timeZone29 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(72000000L, dateTimeZone27);
        int int32 = dateTimeZone27.getStandardOffset((long) 'u');
        java.lang.String str34 = dateTimeZone27.getName(1645142400000L);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 11779950, dateTimeZone27);
        org.joda.time.DateTime dateTime36 = dateTime18.withZoneRetainFields(dateTimeZone27);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime39 = dateTime18.withDurationAdded(readableDuration37, (int) (short) 0);
        boolean boolean41 = dateTime39.isAfter((long) 11925070);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime44 = dateTime42.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int46 = dateTime44.get(dateTimeFieldType45);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(dateTimeZone49);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = localTime50.getFieldType((int) (byte) 1);
        int int53 = localTime48.get(dateTimeFieldType52);
        org.joda.time.DurationFieldType durationFieldType54 = dateTimeFieldType52.getDurationType();
        int int55 = dateTime44.get(dateTimeFieldType52);
        org.joda.time.DurationFieldType durationFieldType56 = dateTimeFieldType52.getRangeDurationType();
        int int57 = dateTime39.get(dateTimeFieldType52);
        int int58 = mutableDateTime14.get(dateTimeFieldType52);
        int int59 = mutableDateTime14.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime16", (instant0.compareTo(dateTime16) == 0) == instant0.equals(dateTime16));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime dateTime6 = dateTime0.plusYears(26160835);
        boolean boolean8 = dateTime6.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTime dateTime10 = dateTime6.minusMinutes(11775531);
        org.joda.time.DateTime.Property property11 = dateTime6.era();
        org.joda.time.DateTime dateTime12 = dateTime6.toDateTime();
        org.joda.time.DateMidnight dateMidnight13 = dateTime6.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.dayOfMonth();
        org.joda.time.DurationField durationField26 = zonedChronology21.weeks();
        org.joda.time.Chronology chronology27 = zonedChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.monthOfYear();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.era();
        org.joda.time.DurationField durationField30 = zonedChronology21.centuries();
        org.joda.time.DurationField durationField31 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology21.weekyear();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now((org.joda.time.Chronology) zonedChronology21);
        org.joda.time.DurationField durationField34 = zonedChronology21.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime33", (dateTime16.compareTo(dateTime33) == 0) == dateTime16.equals(dateTime33));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.plus((long) 11753187);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant2.plus(readableDuration3);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.withMillis((long) 11);
        org.joda.time.Instant instant8 = instant7.toInstant();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant7.minus(readableDuration9);
        org.joda.time.Instant instant11 = instant7.toInstant();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant7.plus(readableDuration12);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.Instant instant16 = instant14.withMillis((long) 11);
        org.joda.time.Instant instant17 = instant16.toInstant();
        org.joda.time.Chronology chronology18 = instant16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = instant16.toMutableDateTimeISO();
        boolean boolean20 = instant7.isAfter((org.joda.time.ReadableInstant) instant16);
        int int21 = instant2.compareTo((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Chronology chronology22 = instant2.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime19", (instant7.compareTo(mutableDateTime19) == 0) == instant7.equals(mutableDateTime19));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant2.minus(readableDuration4);
        org.joda.time.Instant instant6 = instant2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTime();
        java.util.GregorianCalendar gregorianCalendar8 = mutableDateTime7.toGregorianCalendar();
        org.joda.time.Instant instant9 = mutableDateTime7.toInstant();
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        int int11 = dateTime10.getEra();
        org.joda.time.DateTime dateTime12 = dateTime10.withLaterOffsetAtOverlap();
        org.joda.time.TimeOfDay timeOfDay13 = dateTime12.toTimeOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime7", (instant2.compareTo(mutableDateTime7) == 0) == instant2.equals(mutableDateTime7));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime0.withZone(dateTimeZone3);
        org.joda.time.DateTime dateTime7 = dateTime0.withMillisOfSecond(11);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.Chronology chronology9 = dateTime7.getChronology();
        org.joda.time.DateTime dateTime10 = dateTime7.toDateTime();
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfYear();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.withDurationAdded(readableDuration12, 551);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime5", (dateTime0.compareTo(dateTime5) == 0) == dateTime0.equals(dateTime5));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime dateTime6 = dateTime0.plusYears(26160835);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay10 = dateTime9.toTimeOfDay();
        org.joda.time.DateTime.Property property11 = dateTime9.yearOfEra();
        org.joda.time.DateTime dateTime13 = property11.setCopy(26156834);
        int int14 = dateTime13.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.plus(readableDuration15);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime6.toMutableDateTime(dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime6.minus(readablePeriod19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Chronology chronology2 = dateTime0.getChronology();
        org.joda.time.DateTime dateTime4 = dateTime0.plusDays(2);
        java.util.Date date5 = dateTime0.toDate();
        java.lang.String str7 = dateTime0.toString("15");
        java.util.GregorianCalendar gregorianCalendar8 = dateTime0.toGregorianCalendar();
        gregorianCalendar8.setFirstDayOfWeek(11760949);
        java.time.Instant instant11 = gregorianCalendar8.toInstant();
        long long12 = gregorianCalendar8.getTimeInMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.DateTime dateTime5 = dateTime0.minusYears(100);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime5.getZone();
        org.joda.time.DateTime dateTime8 = dateTime5.plusSeconds((int) 'x');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.plusDays(50);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 100, dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.plusDays(50);
        int int21 = localDate18.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate23 = localDate18.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        int int26 = dateTimeZone24.getOffset((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateMidnight dateMidnight27 = localDate18.toDateMidnight(dateTimeZone24);
        long long29 = dateTimeZone24.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology30 = org.joda.time.chrono.ZonedChronology.getInstance(chronology14, dateTimeZone24);
        org.joda.time.DurationField durationField31 = zonedChronology30.weeks();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology30.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = zonedChronology30.add(readablePeriod33, (long) 2022, 0);
        org.joda.time.DurationField durationField37 = zonedChronology30.seconds();
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime5.toMutableDateTime((org.joda.time.Chronology) zonedChronology30);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology30.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime38", (dateTime5.compareTo(mutableDateTime38) == 0) == dateTime5.equals(mutableDateTime38));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withYearOfEra(17);
        org.joda.time.DateTime dateTime10 = dateTime8.minusDays(292278993);
        org.joda.time.DateTime dateTime12 = dateTime10.withMillisOfDay(0);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withField(dateTimeFieldType15, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.minusYears(5);
        int int20 = localDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology21 = localDateTime13.getChronology();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(chronology21);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withMinuteOfHour(0);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.minus(readableDuration26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.plusHours(11783192);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.monthOfYear();
        int int31 = localDateTime29.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime();
        int int33 = localDateTime32.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.minusDays(17);
        int int36 = localDateTime32.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.minusHours(22);
        org.joda.time.DateTime dateTime39 = localDateTime38.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime();
        int int42 = dateTimeZone40.getOffset((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone40);
        java.lang.String str45 = dateTimeZone40.getName((long) 18);
        org.joda.time.Instant instant46 = org.joda.time.Instant.now();
        org.joda.time.Instant instant48 = instant46.plus((long) 11753187);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.Instant instant50 = instant48.plus(readableDuration49);
        org.joda.time.Instant instant52 = instant50.plus((long) (short) -1);
        org.joda.time.Instant instant54 = instant50.plus((long) 20);
        int int55 = dateTimeZone40.getOffset((org.joda.time.ReadableInstant) instant50);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean57 = instant50.isSupported(dateTimeFieldType56);
        int int58 = localDateTime38.get(dateTimeFieldType56);
        boolean boolean59 = localDateTime29.isSupported(dateTimeFieldType56);
        org.joda.time.DateTime.Property property60 = dateTime12.property(dateTimeFieldType56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and dateTime43", (dateTime41.compareTo(dateTime43) == 0) == dateTime41.equals(dateTime43));
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        int int5 = dateTime2.getWeekyear();
        org.joda.time.DateTime dateTime7 = dateTime2.minusMillis((int) (short) 1);
        int int8 = dateTime2.getYearOfEra();
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis((long) 11);
        org.joda.time.Instant instant12 = instant11.toInstant();
        org.joda.time.Chronology chronology13 = instant11.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 100, dateTimeZone16);
        int int18 = dateTimeField14.getMaximumValue((org.joda.time.ReadablePartial) localDate17);
        int int19 = localDate17.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        int int21 = dateTime20.getDayOfYear();
        org.joda.time.DateTime dateTime23 = dateTime20.withYear(11751002);
        org.joda.time.DateTime dateTime25 = dateTime20.minusYears(100);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        long long29 = dateTimeZone26.convertLocalToUTC((long) 2000, false);
        long long31 = dateTimeZone26.nextTransition((long) 11839594);
        org.joda.time.Interval interval32 = localDate17.toInterval(dateTimeZone26);
        org.joda.time.DateTime dateTime33 = dateTime2.toDateTime(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant9", (dateTime0.compareTo(instant9) == 0) == dateTime0.equals(instant9));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = zonedChronology21.add(readablePeriod24, (long) 2022, 0);
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.weekyearOfCentury();
        org.joda.time.DurationField durationField31 = zonedChronology21.years();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology21.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField34 = zonedChronology21.halfdays();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now((org.joda.time.Chronology) zonedChronology21);
        org.joda.time.DurationField durationField36 = zonedChronology21.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime35", (dateTime16.compareTo(dateTime35) == 0) == dateTime16.equals(dateTime35));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.millisOfDay();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        java.util.TimeZone timeZone14 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(72000000L, dateTimeZone12);
        int int17 = dateTimeZone12.getStandardOffset((long) 'u');
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.chrono.ZonedChronology zonedChronology19 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology19.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology19.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology19.millisOfDay();
        org.joda.time.DurationField durationField23 = zonedChronology19.years();
        org.joda.time.DurationField durationField24 = zonedChronology19.weeks();
        org.joda.time.DurationField durationField25 = zonedChronology19.weekyears();
        org.joda.time.DateTimeZone dateTimeZone26 = zonedChronology19.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField25", (durationField23.compareTo(durationField25) == 0) == durationField23.equals(durationField25));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.minuteOfDay();
        org.joda.time.Chronology chronology24 = zonedChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.monthOfYear();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.weekOfWeekyear();
        org.joda.time.DurationField durationField29 = dateTimeField28.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField29, and durationField22", !(durationField22.compareTo(durationField29) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField29.compareTo(durationField22))));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime4 = dateTime0.withCenturyOfEra(50);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.minus((long) 2);
        int int8 = dateTime4.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Instant instant10 = instant5.plus((long) (short) 100);
        org.joda.time.Instant instant13 = instant10.withDurationAdded((long) 11811003, 26207777);
        org.joda.time.DateTime dateTime14 = instant10.toDateTime();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withField(dateTimeFieldType17, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.minusYears(5);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withMillisOfDay(8);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withField(dateTimeFieldType28, (int) (short) 10);
        boolean boolean31 = localDateTime22.isSupported(dateTimeFieldType28);
        boolean boolean32 = localDateTime21.isSupported(dateTimeFieldType28);
        int int33 = dateTime14.get(dateTimeFieldType28);
        org.joda.time.DurationFieldType durationFieldType34 = dateTimeFieldType28.getDurationType();
        java.lang.String str35 = durationFieldType34.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant5", (dateTime0.compareTo(instant5) == 0) == dateTime0.equals(instant5));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minus(0L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 100, dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime4.withZone(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = dateTime4.toLocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.plusMonths(49);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.years();
        org.joda.time.LocalDate localDate14 = localDate9.withFieldAdded(durationFieldType12, 26275822);
        org.joda.time.LocalDate.Property property15 = localDate9.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime8", (dateTime2.compareTo(dateTime8) == 0) == dateTime2.equals(dateTime8));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 11949779);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        int int3 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(11751002);
        org.joda.time.Instant instant6 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime8 = dateTime2.plusYears(26160835);
        int int9 = dateTime2.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 100, dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.plusDays(50);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 100, dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.plusDays(50);
        int int22 = localDate19.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate24 = localDate19.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        int int27 = dateTimeZone25.getOffset((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateMidnight dateMidnight28 = localDate19.toDateMidnight(dateTimeZone25);
        long long30 = dateTimeZone25.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology31 = org.joda.time.chrono.ZonedChronology.getInstance(chronology15, dateTimeZone25);
        org.joda.time.DurationField durationField32 = zonedChronology31.weeks();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology31.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = zonedChronology31.add(readablePeriod34, (long) 2022, 0);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology31.millisOfDay();
        org.joda.time.DurationField durationField39 = zonedChronology31.millis();
        org.joda.time.DateTimeZone dateTimeZone40 = zonedChronology31.getZone();
        org.joda.time.DateTime dateTime41 = dateTime2.withZoneRetainFields(dateTimeZone40);
        int int43 = dateTimeZone40.getOffsetFromLocal((long) 12089034);
        org.joda.time.DateTime dateTime44 = dateTime1.withZone(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant6", (dateTime2.compareTo(instant6) == 0) == dateTime2.equals(instant6));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime0.withHourOfDay(10);
        org.joda.time.DateMidnight dateMidnight5 = dateTime0.toDateMidnight();
        org.joda.time.DateTime.Property property6 = dateTime0.secondOfDay();
        java.lang.String str7 = dateTime0.toString();
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis((long) 11);
        org.joda.time.Instant instant12 = instant11.toInstant();
        org.joda.time.Chronology chronology13 = instant11.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.seconds();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) 26160535, chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.hourOfDay();
        int int18 = dateTime0.get(dateTimeField17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant9", (dateTime0.compareTo(instant9) == 0) == dateTime0.equals(instant9));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime0.withZone(dateTimeZone3);
        org.joda.time.DateTime dateTime7 = dateTime0.withMillisOfSecond(11);
        org.joda.time.DateTime dateTime9 = dateTime7.minus((long) 11808074);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime7.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime12 = dateTime7.plusWeeks(26499190);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime5", (dateTime0.compareTo(dateTime5) == 0) == dateTime0.equals(dateTime5));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay3 = dateTime2.toTimeOfDay();
        org.joda.time.DateTime.Property property4 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime6 = property4.setCopy(26156834);
        org.joda.time.DateTime dateTime8 = property4.addToCopy((long) 1970);
        org.joda.time.DateTime dateTime9 = property4.withMaximumValue();
        org.joda.time.DateTime dateTime11 = property4.addWrapFieldToCopy(11753234);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfMonth();
        org.joda.time.DateTime dateTime14 = property12.addToCopy(11926728);
        int int15 = dateTime14.getYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        int int18 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone16);
        java.lang.String str21 = dateTimeZone16.getName((long) 18);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate.Property property23 = localDate22.era();
        boolean boolean24 = dateTime14.equals((java.lang.Object) localDate22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime19", (dateTime0.compareTo(dateTime19) == 0) == dateTime0.equals(dateTime19));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        int int2 = dateTime0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 100, dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.plusDays(50);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.minuteOfHour();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (-1), chronology9);
        org.joda.time.DurationField durationField13 = chronology9.minutes();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime0.toMutableDateTime(chronology9);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 100, dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.plusDays(50);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 100, dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.plusDays(50);
        int int29 = localDate26.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate31 = localDate26.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        int int34 = dateTimeZone32.getOffset((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateMidnight dateMidnight35 = localDate26.toDateMidnight(dateTimeZone32);
        long long37 = dateTimeZone32.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology38 = org.joda.time.chrono.ZonedChronology.getInstance(chronology22, dateTimeZone32);
        org.joda.time.DurationField durationField39 = zonedChronology38.weeks();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology38.weekyear();
        org.joda.time.DurationField durationField41 = zonedChronology38.weekyears();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology38.minuteOfDay();
        java.lang.String str43 = zonedChronology38.toString();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) 11843814, (org.joda.time.Chronology) zonedChronology38);
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology38.dayOfYear();
        int int46 = dateTimeField45.getMinimumValue();
        int int47 = mutableDateTime15.get(dateTimeField45);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone53 = dateTimeZone52.toTimeZone();
        java.util.TimeZone timeZone54 = dateTimeZone52.toTimeZone();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(72000000L, dateTimeZone52);
        int int57 = dateTimeZone52.getStandardOffset((long) 'u');
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate((long) 49, dateTimeZone52);
        int int59 = localDate58.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate61 = localDate58.withDayOfMonth(17);
        org.joda.time.LocalDate localDate63 = localDate58.plusWeeks(26511295);
        int int64 = dateTimeField45.getMaximumValue((org.joda.time.ReadablePartial) localDate63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime11", (dateTime0.compareTo(dateTime11) == 0) == dateTime0.equals(dateTime11));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.minusHours((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = localTime11.getFieldType(0);
        org.joda.time.DateTime dateTime17 = dateTime3.withField(dateTimeFieldType15, 5);
        org.joda.time.DateTime dateTime19 = dateTime3.plusDays(0);
        boolean boolean20 = dateTime0.isBefore((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime.Property property21 = dateTime0.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime8", (dateTime3.compareTo(dateTime8) == 0) == dateTime3.equals(dateTime8));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        int int4 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((java.lang.Object) instant1, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfEra();
        int int7 = property6.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime8 = property6.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withField(dateTimeFieldType11, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime.Property property16 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withWeekyear(26175513);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int22 = dateTime20.get(dateTimeFieldType21);
        java.lang.String str23 = dateTimeFieldType21.getName();
        int int24 = localDateTime19.indexOf(dateTimeFieldType21);
        boolean boolean25 = localDateTime8.isSupported(dateTimeFieldType21);
        java.lang.String str26 = dateTimeFieldType21.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(53);
        org.joda.time.Chronology chronology5 = localDate2.getChronology();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.plusDays(50);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 100, dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.plusDays(50);
        int int21 = localDate18.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate23 = localDate18.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        int int26 = dateTimeZone24.getOffset((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateMidnight dateMidnight27 = localDate18.toDateMidnight(dateTimeZone24);
        long long29 = dateTimeZone24.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology30 = org.joda.time.chrono.ZonedChronology.getInstance(chronology14, dateTimeZone24);
        org.joda.time.DurationField durationField31 = zonedChronology30.weeks();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology30.weekOfWeekyear();
        org.joda.time.DurationField durationField33 = zonedChronology30.centuries();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology30.dayOfWeek();
        org.joda.time.DurationField durationField35 = zonedChronology30.millis();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 52, (org.joda.time.Chronology) zonedChronology30);
        boolean boolean37 = localDate7.equals((java.lang.Object) zonedChronology30);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology30.dayOfMonth();
        int int40 = dateTimeField38.getMinimumValue(1573526126850L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime25", (dateTime6.compareTo(dateTime25) == 0) == dateTime6.equals(dateTime25));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-26151846));
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int10 = dateTime7.get(dateTimeFieldType9);
        int int11 = dateTime7.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 100, dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.plusDays(50);
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.dayOfMonth();
        org.joda.time.DateTime dateTime20 = dateTime7.withChronology(chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter4.withChronology(chronology17);
        boolean boolean22 = dateTimeFormatter21.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 100, dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate25.plusDays(50);
        org.joda.time.DateTime dateTime28 = localDate27.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property29 = localDate27.yearOfEra();
        org.joda.time.LocalDate localDate30 = property29.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate32 = property29.addToCopy((int) (short) 1);
        org.joda.time.LocalDate localDate33 = property29.roundFloorCopy();
        org.joda.time.LocalDate localDate34 = property29.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 100, dateTimeZone37);
        org.joda.time.LocalDate.Property property39 = localDate38.weekyear();
        org.joda.time.LocalDate localDate41 = localDate38.plusDays(51);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDate localDate43 = localDate38.minus(readablePeriod42);
        org.joda.time.LocalDate.Property property44 = localDate38.yearOfEra();
        org.joda.time.LocalDate localDate46 = property44.setCopy(47);
        int int47 = localDate46.getCenturyOfEra();
        java.util.Locale locale50 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale51 = java.util.Locale.TAIWAN;
        java.lang.String str52 = locale50.getDisplayCountry(locale51);
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(locale51);
        java.lang.String str54 = localDate46.toString("32", locale51);
        org.joda.time.LocalDate localDate55 = property29.setCopy("11771566", locale51);
        java.lang.String str56 = locale51.getDisplayVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter21.withLocale(locale51);
        java.util.Locale locale58 = dateTimeFormatter57.getLocale();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime20", (dateTime7.compareTo(dateTime20) == 0) == dateTime7.equals(dateTime20));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-26151846));
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int10 = dateTime7.get(dateTimeFieldType9);
        int int11 = dateTime7.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 100, dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.plusDays(50);
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.dayOfMonth();
        org.joda.time.DateTime dateTime20 = dateTime7.withChronology(chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter4.withChronology(chronology17);
        int int22 = dateTimeFormatter4.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter4.withPivotYear(589);
        int int25 = dateTimeFormatter24.getDefaultYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime20", (dateTime7.compareTo(dateTime20) == 0) == dateTime7.equals(dateTime20));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-26151846));
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int10 = dateTime7.get(dateTimeFieldType9);
        int int11 = dateTime7.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 100, dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.plusDays(50);
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.dayOfMonth();
        org.joda.time.DateTime dateTime20 = dateTime7.withChronology(chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter4.withChronology(chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 11830400);
        java.util.Date date30 = new java.util.Date(49, 22, (int) (short) -1, 17, 51, 11752861);
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.fromDateFields(date30);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 100, dateTimeZone33);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone33);
        boolean boolean37 = dateTimeZone33.isStandardOffset((long) 26151878);
        org.joda.time.DateTime dateTime38 = localDate31.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) 100, dateTimeZone40);
        org.joda.time.LocalDate localDate43 = localDate41.plusDays(50);
        org.joda.time.Chronology chronology44 = localDate43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) 100, dateTimeZone47);
        org.joda.time.LocalDate localDate50 = localDate48.plusDays(50);
        int int51 = localDate48.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate53 = localDate48.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime();
        int int56 = dateTimeZone54.getOffset((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateMidnight dateMidnight57 = localDate48.toDateMidnight(dateTimeZone54);
        long long59 = dateTimeZone54.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology60 = org.joda.time.chrono.ZonedChronology.getInstance(chronology44, dateTimeZone54);
        java.lang.String str61 = zonedChronology60.toString();
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology60.clockhourOfHalfday();
        org.joda.time.Chronology chronology63 = zonedChronology60.withUTC();
        org.joda.time.Chronology chronology64 = zonedChronology60.withUTC();
        org.joda.time.DateTimeZone dateTimeZone65 = chronology64.getZone();
        long long67 = dateTimeZone33.getMillisKeepLocal(dateTimeZone65, 26157373L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter23.withZone(dateTimeZone65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = dateTimeFormatter23.withDefaultYear(12099031);
        org.joda.time.Chronology chronology71 = dateTimeFormatter70.getChronolgy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime20", (dateTime7.compareTo(dateTime20) == 0) == dateTime7.equals(dateTime20));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime4 = dateTime0.withCenturyOfEra(50);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.minus((long) 2);
        int int8 = dateTime4.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.DateTime.Property property9 = dateTime4.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 100, dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.plusDays(50);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.minuteOfHour();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMonths(11767873);
        int int20 = dateTime19.getSecondOfDay();
        org.joda.time.DateTime dateTime22 = dateTime19.withWeekyear(11775531);
        org.joda.time.DateTime dateTime24 = dateTime22.plusMinutes(26180512);
        int int25 = property9.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.minus(readablePeriod26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 100, dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.plusDays(50);
        org.joda.time.LocalDate.Property property33 = localDate32.monthOfYear();
        org.joda.time.LocalDate.Property property34 = localDate32.year();
        org.joda.time.LocalDate localDate35 = property34.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate36 = property34.withMinimumValue();
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.Instant instant39 = dateTime38.toInstant();
        org.joda.time.Chronology chronology40 = dateTime38.getChronology();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime();
        int int43 = dateTimeZone41.getOffset((org.joda.time.ReadableInstant) dateTime42);
        int int45 = dateTimeZone41.getOffsetFromLocal((long) 26187981);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((java.lang.Object) dateTime38, dateTimeZone41);
        int int47 = localDate36.compareTo((org.joda.time.ReadablePartial) localDate46);
        int int48 = localDate36.getDayOfMonth();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime51 = dateTime49.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int53 = dateTime51.get(dateTimeFieldType52);
        org.joda.time.DateTime dateTime55 = dateTime51.minusMillis((int) '#');
        org.joda.time.DateTime dateTime57 = dateTime55.plusDays(11);
        org.joda.time.DateTime dateTime60 = dateTime55.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime62 = dateTime55.plusDays(26159400);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) 100, dateTimeZone64);
        org.joda.time.LocalDate localDate67 = localDate65.plusDays(50);
        org.joda.time.Chronology chronology68 = localDate67.getChronology();
        org.joda.time.DateTimeField dateTimeField69 = chronology68.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime70 = dateTime55.toMutableDateTime(chronology68);
        org.joda.time.LocalDate localDate71 = org.joda.time.LocalDate.now(chronology68);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.weekyear();
        int int73 = localDate71.get(dateTimeFieldType72);
        org.joda.time.LocalDate localDate75 = localDate36.withField(dateTimeFieldType72, 26180512);
        java.lang.String str76 = dateTimeFieldType72.toString();
        org.joda.time.DateTime.Property property77 = dateTime24.property(dateTimeFieldType72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime38", (instant5.compareTo(dateTime38) == 0) == instant5.equals(dateTime38));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.millisOfDay();
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withCenturyOfEra(320);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime16 = dateTime12.withHourOfDay(10);
        java.util.GregorianCalendar gregorianCalendar17 = dateTime12.toGregorianCalendar();
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.Instant instant21 = instant19.withMillis((long) 11);
        org.joda.time.Instant instant22 = instant21.toInstant();
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 11760560, chronology23);
        org.joda.time.DateTime dateTime26 = dateTime12.withChronology(chronology23);
        boolean boolean27 = dateTimeFieldType11.isSupported(chronology23);
        boolean boolean28 = localDateTime8.isSupported(dateTimeFieldType11);
        org.joda.time.LocalDateTime.Property property29 = localDateTime8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField30 = property29.getField();
        org.joda.time.LocalDateTime localDateTime32 = property29.addWrapFieldToCopy(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant19", (dateTime12.compareTo(instant19) == 0) == dateTime12.equals(instant19));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays((int) (short) 1);
        java.lang.String str5 = localDate2.toString();
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtMidnight();
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfWeek();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.Chronology chronology10 = dateTime8.getChronology();
        org.joda.time.DateTime dateTime12 = dateTime8.plusDays(2);
        int int13 = dateTime8.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property14 = dateTime8.weekyear();
        org.joda.time.DateTime dateTime15 = property14.roundCeilingCopy();
        boolean boolean16 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Instant instant18 = new org.joda.time.Instant(1645154464457L);
        int int19 = dateTime15.compareTo((org.joda.time.ReadableInstant) instant18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant9", (dateTime8.compareTo(instant9) == 0) == dateTime8.equals(instant9));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        org.joda.time.DateTime dateTime14 = dateTime6.minusDays(22);
        org.joda.time.DateTime dateTime16 = dateTime6.withYearOfCentury(14);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.Instant instant19 = instant17.plus((long) 11753187);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant19.plus(readableDuration20);
        boolean boolean22 = dateTime6.equals((java.lang.Object) instant21);
        org.joda.time.DateTime.Property property23 = dateTime6.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withField(dateTimeFieldType26, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.plusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withMillisOfSecond((int) '4');
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.plusWeeks(26160458);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.minusMinutes((int) 'u');
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusMonths(3);
        org.joda.time.DateTime dateTime39 = dateTime6.withFields((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.DateTime dateTime41 = dateTime39.plusHours(11764640);
        org.joda.time.DateTime dateTime43 = dateTime39.plusDays(11811527);
        org.joda.time.DateTime dateTime45 = dateTime39.withYearOfEra(11800667);
        org.joda.time.DateTime dateTime47 = dateTime45.withWeekyear(54860232);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant17", (dateTime0.compareTo(instant17) == 0) == dateTime0.equals(instant17));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (byte) 10);
        org.joda.time.DateTime dateTime3 = dateTime1.plusMinutes(49);
        org.joda.time.DateTime dateTime5 = dateTime3.plus(10L);
        org.joda.time.Chronology chronology6 = dateTime5.getChronology();
        org.joda.time.DateTime dateTime8 = dateTime5.minusMonths((int) 'a');
        org.joda.time.DateTime dateTime10 = dateTime8.plusSeconds(11781671);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone11);
        int int15 = dateTimeZone11.getStandardOffset(100L);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime8.toMutableDateTime(dateTimeZone11);
        long long20 = dateTimeZone11.convertLocalToUTC((long) 2, true, (long) 11874926);
        java.util.TimeZone timeZone21 = dateTimeZone11.toTimeZone();
        int int22 = timeZone21.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime16", (dateTime8.compareTo(mutableDateTime16) == 0) == dateTime8.equals(mutableDateTime16));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime.Property property5 = dateTime0.dayOfWeek();
        org.joda.time.DateTime.Property property6 = dateTime0.secondOfMinute();
        org.joda.time.DateTime dateTime8 = dateTime0.plusHours(11763042);
        org.joda.time.DateTime dateTime10 = dateTime0.withMillis((long) 11765847);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.centuries();
        java.lang.String str12 = durationFieldType11.getName();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 100, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.plusDays(50);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 100, dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.plusDays(50);
        int int25 = localDate22.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate27 = localDate22.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        int int30 = dateTimeZone28.getOffset((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateMidnight dateMidnight31 = localDate22.toDateMidnight(dateTimeZone28);
        long long33 = dateTimeZone28.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology34 = org.joda.time.chrono.ZonedChronology.getInstance(chronology18, dateTimeZone28);
        org.joda.time.DurationField durationField35 = zonedChronology34.eras();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology34.minuteOfDay();
        org.joda.time.Chronology chronology37 = zonedChronology34.withUTC();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology34.monthOfYear();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology34.yearOfEra();
        boolean boolean40 = durationFieldType11.isSupported((org.joda.time.Chronology) zonedChronology34);
        java.util.TimeZone timeZone42 = java.util.TimeZone.getTimeZone("minutes");
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        org.joda.time.Chronology chronology44 = zonedChronology34.withZone(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = dateTime10.toDateTime(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = instant2.toMutableDateTimeISO();
        org.joda.time.Instant instant7 = instant2.withMillis((long) 11787436);
        org.joda.time.DateTime dateTime8 = instant7.toDateTimeISO();
        int int9 = dateTime8.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime5", (instant2.compareTo(mutableDateTime5) == 0) == instant2.equals(mutableDateTime5));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.minuteOfDay();
        org.joda.time.Chronology chronology24 = zonedChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(20);
        org.joda.time.Chronology chronology28 = zonedChronology21.withZone(dateTimeZone27);
        org.joda.time.DurationField durationField29 = zonedChronology21.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField29, and durationField22", !(durationField22.compareTo(durationField29) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField29.compareTo(durationField22))));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        int int9 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone7);
        boolean boolean11 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minusMinutes(11814974);
        org.joda.time.DateTime.Property property14 = dateTime10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime10", (dateTime0.compareTo(dateTime10) == 0) == dateTime0.equals(dateTime10));
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        int int2 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.now(dateTimeZone0);
        int int5 = dateTimeZone0.getStandardOffset((long) 26156834);
        java.lang.String str7 = dateTimeZone0.getNameKey((long) 26160458);
        long long9 = dateTimeZone0.previousTransition((long) 11767256);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) 2017);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        int int13 = dateTime12.getDayOfYear();
        org.joda.time.DateTime dateTime15 = dateTime12.withYear(11751002);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTime16.getDayOfYear();
        org.joda.time.DateTime dateTime19 = dateTime16.withYear(11751002);
        org.joda.time.Instant instant20 = dateTime16.toInstant();
        boolean boolean21 = dateTime12.isEqual((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Instant instant24 = instant20.withDurationAdded((long) 26260461, 11844162);
        int int25 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) instant24);
        org.joda.time.MutableDateTime mutableDateTime26 = instant24.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime27 = instant24.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant20", (dateTime1.compareTo(instant20) == 0) == dateTime1.equals(instant20));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone6 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(72000000L, dateTimeZone4);
        int int9 = dateTimeZone4.getStandardOffset((long) 'u');
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(0L, dateTimeZone4);
        int int11 = localTime10.getMinuteOfHour();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        int int13 = dateTime12.getDayOfYear();
        org.joda.time.DateTime dateTime15 = dateTime12.withYear(11751002);
        org.joda.time.Instant instant16 = dateTime12.toInstant();
        org.joda.time.DateTime dateTime18 = dateTime12.plusYears(26160835);
        boolean boolean20 = dateTime18.equals((java.lang.Object) 0.0f);
        java.lang.String str21 = dateTime18.toString();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = localTime28.getFieldType((int) (byte) 1);
        int int31 = localTime26.get(dateTimeFieldType30);
        org.joda.time.LocalTime.Property property32 = localTime24.property(dateTimeFieldType30);
        int int33 = property32.getMaximumValueOverall();
        org.joda.time.LocalTime localTime35 = property32.setCopy("50");
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.lang.String str40 = dateTimeZone39.getID();
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) 26150856, dateTimeZone39);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.year();
        boolean boolean43 = localTime41.isSupported(dateTimeFieldType42);
        boolean boolean44 = localTime35.isSupported(dateTimeFieldType42);
        org.joda.time.DateTime.Property property45 = dateTime18.property(dateTimeFieldType42);
        boolean boolean46 = localTime10.isSupported(dateTimeFieldType42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant16", (dateTime12.compareTo(instant16) == 0) == dateTime12.equals(instant16));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Instant instant5 = instant3.plus((long) 11757325);
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.Instant instant8 = instant6.minus((long) 2);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant8.plus(readableDuration9);
        boolean boolean11 = instant3.isBefore((org.joda.time.ReadableInstant) instant8);
        org.joda.time.DateTime dateTime12 = instant3.toDateTimeISO();
        org.joda.time.DateTime dateTime13 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property14 = dateTime12.yearOfCentury();
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.Instant instant17 = instant15.withMillis((long) 11);
        org.joda.time.Instant instant18 = instant17.toInstant();
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 100, dateTimeZone22);
        int int24 = dateTimeField20.getMaximumValue((org.joda.time.ReadablePartial) localDate23);
        boolean boolean25 = dateTimeField20.isSupported();
        java.util.Calendar.Builder builder27 = new java.util.Calendar.Builder();
        java.util.Locale locale28 = java.util.Locale.JAPAN;
        java.util.Calendar.Builder builder29 = builder27.setLocale(locale28);
        java.util.Locale.setDefault(locale28);
        java.lang.String str31 = dateTimeField20.getAsText(350L, locale28);
        int int32 = property14.getMaximumShortTextLength(locale28);
        org.joda.time.DateTime dateTime34 = property14.addToCopy((-177281104L));
        int int35 = property14.getMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime12", (instant2.compareTo(dateTime12) == 0) == instant2.equals(dateTime12));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate.Property property6 = localDate4.era();
        org.joda.time.LocalDate localDate7 = property6.getLocalDate();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate7.plus(readablePeriod8);
        int int10 = localDate7.getMonthOfYear();
        org.joda.time.LocalDate localDate12 = localDate7.plusYears(12050201);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.Instant instant14 = dateTime13.toInstant();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusDays(2);
        java.util.Date date18 = dateTime13.toDate();
        org.joda.time.DateTime.Property property19 = dateTime13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property19.getFieldType();
        boolean boolean22 = localDate12.isSupported(dateTimeFieldType21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant14", (dateTime13.compareTo(instant14) == 0) == dateTime13.equals(instant14));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime4 = dateTime0.withCenturyOfEra(50);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.minus((long) 2);
        int int8 = dateTime4.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.DateTime.Property property9 = dateTime4.centuryOfEra();
        org.joda.time.DateTime dateTime11 = dateTime4.plusDays(58);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMonths(32770);
        org.joda.time.DateTime dateTime15 = dateTime13.minusYears(11863811);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 100, dateTimeZone17);
        org.joda.time.LocalDate.Property property19 = localDate18.weekyear();
        org.joda.time.LocalDate localDate21 = property19.setCopy(2022);
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.Instant instant24 = instant22.withMillis((long) 11);
        org.joda.time.Instant instant25 = instant24.toInstant();
        org.joda.time.Chronology chronology26 = instant24.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 100, dateTimeZone29);
        int int31 = dateTimeField27.getMaximumValue((org.joda.time.ReadablePartial) localDate30);
        int int33 = localDate30.getValue(2);
        org.joda.time.DateMidnight dateMidnight34 = localDate30.toDateMidnight();
        org.joda.time.LocalDate localDate36 = localDate30.plusMonths(26160535);
        int int37 = localDate36.getYear();
        boolean boolean38 = property19.equals((java.lang.Object) localDate36);
        org.joda.time.LocalDate localDate40 = localDate36.minusWeeks(73644);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDate localDate42 = localDate36.plus(readablePeriod41);
        java.util.Date date43 = localDate42.toDate();
        org.joda.time.LocalDate localDate45 = localDate42.withYearOfCentury(1);
        org.joda.time.LocalDate localDate47 = localDate45.minusMonths(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = localDate47.getFieldType(0);
        java.lang.String str50 = dateTimeFieldType49.toString();
        int int51 = dateTime15.get(dateTimeFieldType49);
        org.joda.time.YearMonthDay yearMonthDay52 = dateTime15.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) 100, dateTimeZone54);
        org.joda.time.LocalDate localDate57 = localDate55.plusDays(50);
        org.joda.time.Chronology chronology58 = localDate57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate((long) 100, dateTimeZone61);
        org.joda.time.LocalDate localDate64 = localDate62.plusDays(50);
        int int65 = localDate62.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate67 = localDate62.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime();
        int int70 = dateTimeZone68.getOffset((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.DateMidnight dateMidnight71 = localDate62.toDateMidnight(dateTimeZone68);
        long long73 = dateTimeZone68.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology74 = org.joda.time.chrono.ZonedChronology.getInstance(chronology58, dateTimeZone68);
        org.joda.time.DurationField durationField75 = zonedChronology74.eras();
        org.joda.time.DateTimeField dateTimeField76 = zonedChronology74.minuteOfDay();
        org.joda.time.Chronology chronology77 = zonedChronology74.withUTC();
        org.joda.time.DateTimeField dateTimeField78 = zonedChronology74.monthOfYear();
        org.joda.time.DateTimeField dateTimeField79 = zonedChronology74.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField80 = zonedChronology74.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField81 = zonedChronology74.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField82 = zonedChronology74.millisOfDay();
        org.joda.time.DateTimeField dateTimeField83 = zonedChronology74.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField84 = zonedChronology74.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = dateTimeField84.getType();
        org.joda.time.DateTime.Property property86 = dateTime15.property(dateTimeFieldType85);
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.DateTimeField dateTimeField88 = dateTimeFieldType85.getField(chronology87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant5", (dateTime0.compareTo(instant5) == 0) == dateTime0.equals(instant5));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.minuteOfDay();
        org.joda.time.Chronology chronology24 = zonedChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.yearOfEra();
        org.joda.time.DurationField durationField26 = zonedChronology21.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField26, and durationField22", !(durationField22.compareTo(durationField26) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField26.compareTo(durationField22))));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime.Property property5 = dateTime0.monthOfYear();
        org.joda.time.DateTime dateTime6 = property5.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.LocalDate localDate5 = property3.setCopy(2022);
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.Instant instant8 = instant6.withMillis((long) 11);
        org.joda.time.Instant instant9 = instant8.toInstant();
        org.joda.time.Chronology chronology10 = instant8.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 100, dateTimeZone13);
        int int15 = dateTimeField11.getMaximumValue((org.joda.time.ReadablePartial) localDate14);
        int int17 = localDate14.getValue(2);
        org.joda.time.DateMidnight dateMidnight18 = localDate14.toDateMidnight();
        org.joda.time.LocalDate localDate20 = localDate14.plusMonths(26160535);
        int int21 = localDate20.getYear();
        boolean boolean22 = property3.equals((java.lang.Object) localDate20);
        org.joda.time.DateTime dateTime23 = localDate20.toDateTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime26 = dateTime23.withPeriodAdded(readablePeriod24, 11761333);
        org.joda.time.DateTime dateTime28 = dateTime23.minusHours(11735);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime31 = dateTime29.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int33 = dateTime31.get(dateTimeFieldType32);
        org.joda.time.DateTime dateTime35 = dateTime31.minusSeconds((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone41 = dateTimeZone40.toTimeZone();
        java.util.TimeZone timeZone42 = dateTimeZone40.toTimeZone();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(72000000L, dateTimeZone40);
        int int45 = dateTimeZone40.getStandardOffset((long) 'u');
        java.lang.String str47 = dateTimeZone40.getName(1645142400000L);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) 11779950, dateTimeZone40);
        org.joda.time.DateTime dateTime49 = dateTime31.withZoneRetainFields(dateTimeZone40);
        boolean boolean50 = dateTime23.equals((java.lang.Object) dateTimeZone40);
        org.joda.time.DateTime.Property property51 = dateTime23.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime29", (instant6.compareTo(dateTime29) == 0) == instant6.equals(dateTime29));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology21.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone25 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.millisOfDay();
        org.joda.time.Chronology chronology27 = zonedChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.millisOfDay();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now((org.joda.time.Chronology) zonedChronology21);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 100, dateTimeZone32);
        org.joda.time.LocalDate localDate35 = localDate33.plusDays(50);
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 100, dateTimeZone39);
        org.joda.time.LocalDate localDate42 = localDate40.plusDays(50);
        int int43 = localDate40.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate45 = localDate40.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        int int48 = dateTimeZone46.getOffset((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateMidnight dateMidnight49 = localDate40.toDateMidnight(dateTimeZone46);
        long long51 = dateTimeZone46.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology52 = org.joda.time.chrono.ZonedChronology.getInstance(chronology36, dateTimeZone46);
        org.joda.time.DurationField durationField53 = zonedChronology52.weeks();
        org.joda.time.DateTimeField dateTimeField54 = zonedChronology52.year();
        org.joda.time.DateTimeZone dateTimeZone55 = zonedChronology52.getZone();
        org.joda.time.DurationField durationField56 = zonedChronology52.months();
        org.joda.time.DateTimeField dateTimeField57 = zonedChronology52.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField58 = zonedChronology52.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology52.yearOfEra();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) 11821997, (org.joda.time.Chronology) zonedChronology52);
        boolean boolean61 = dateTime29.isBefore((org.joda.time.ReadableInstant) dateTime60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField53", (durationField22.compareTo(durationField53) == 0) == durationField22.equals(durationField53));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime13 = dateTime6.plusDays(26159400);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        int int17 = dateTimeZone14.getStandardOffset((long) 49);
        int int19 = dateTimeZone14.getOffset((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime6.toMutableDateTime(dateTimeZone14);
        java.lang.String str22 = dateTimeZone14.getShortName(0L);
        java.util.TimeZone timeZone23 = dateTimeZone14.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and mutableDateTime20", (dateTime6.compareTo(mutableDateTime20) == 0) == dateTime6.equals(mutableDateTime20));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.withMinuteOfHour(14);
        int int9 = dateTime8.getYearOfCentury();
        org.joda.time.DateTime dateTime11 = dateTime8.plus((long) 11767256);
        int int12 = property5.compareTo((org.joda.time.ReadableInstant) dateTime8);
        boolean boolean13 = dateTime8.isBeforeNow();
        org.joda.time.DateTime dateTime15 = dateTime8.minusHours(11842);
        org.joda.time.DateTime dateTime17 = dateTime8.minusWeeks(26504062);
        org.joda.time.Instant instant18 = new org.joda.time.Instant();
        org.joda.time.Instant instant20 = instant18.withMillis((long) 11);
        org.joda.time.Instant instant21 = instant20.toInstant();
        org.joda.time.Chronology chronology22 = instant20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 100, dateTimeZone25);
        int int27 = dateTimeField23.getMaximumValue((org.joda.time.ReadablePartial) localDate26);
        int int29 = localDate26.getValue(2);
        org.joda.time.DateMidnight dateMidnight30 = localDate26.toDateMidnight();
        org.joda.time.LocalDate.Property property31 = localDate26.era();
        org.joda.time.LocalDate localDate32 = property31.getLocalDate();
        org.joda.time.LocalDate.Property property33 = localDate32.weekyear();
        org.joda.time.LocalDate.Property property34 = localDate32.dayOfYear();
        org.joda.time.LocalDate localDate35 = property34.roundCeilingCopy();
        java.util.Locale locale37 = java.util.Locale.JAPAN;
        java.lang.String str38 = locale37.getCountry();
        java.lang.String str39 = localDate35.toString("\u53f0\u6e7e", locale37);
        java.util.Calendar calendar40 = dateTime17.toCalendar(locale37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant18", (dateTime6.compareTo(instant18) == 0) == dateTime6.equals(instant18));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 100, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.plusDays(50);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(50);
        int int13 = localDate10.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate15 = localDate10.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        int int18 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateMidnight dateMidnight19 = localDate10.toDateMidnight(dateTimeZone16);
        long long21 = dateTimeZone16.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology22 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone16);
        org.joda.time.DurationField durationField23 = zonedChronology22.weeks();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology22.year();
        org.joda.time.DateTimeZone dateTimeZone25 = zonedChronology22.getZone();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology22.weekyear();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = zonedChronology22.add(readablePeriod27, (long) 11783576, 26163273);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        long long34 = zonedChronology22.add(readablePeriod31, 11776486L, 38);
        org.joda.time.Chronology chronology35 = zonedChronology22.withUTC();
        org.joda.time.DurationField durationField36 = chronology35.weekyears();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 11943803, chronology35);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 100, dateTimeZone39);
        org.joda.time.LocalDate localDate42 = localDate40.plusDays(50);
        org.joda.time.Chronology chronology43 = localDate42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) 100, dateTimeZone46);
        org.joda.time.LocalDate localDate49 = localDate47.plusDays(50);
        int int50 = localDate47.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate52 = localDate47.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime();
        int int55 = dateTimeZone53.getOffset((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateMidnight dateMidnight56 = localDate47.toDateMidnight(dateTimeZone53);
        long long58 = dateTimeZone53.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology59 = org.joda.time.chrono.ZonedChronology.getInstance(chronology43, dateTimeZone53);
        org.joda.time.DurationField durationField60 = zonedChronology59.weeks();
        org.joda.time.DateTimeField dateTimeField61 = zonedChronology59.year();
        org.joda.time.DateTimeZone dateTimeZone62 = zonedChronology59.getZone();
        org.joda.time.DurationField durationField63 = zonedChronology59.weekyears();
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology59.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology59.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology59.weekyear();
        org.joda.time.DurationField durationField67 = zonedChronology59.centuries();
        org.joda.time.DurationField durationField68 = zonedChronology59.halfdays();
        java.lang.String str69 = zonedChronology59.toString();
        org.joda.time.DurationField durationField70 = zonedChronology59.days();
        org.joda.time.DateTimeField dateTimeField71 = zonedChronology59.weekyear();
        org.joda.time.DateTime dateTime72 = dateTime37.toDateTime((org.joda.time.Chronology) zonedChronology59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField60", (durationField23.compareTo(durationField60) == 0) == durationField23.equals(durationField60));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 100, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.plusDays(50);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(50);
        int int13 = localDate10.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate15 = localDate10.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        int int18 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateMidnight dateMidnight19 = localDate10.toDateMidnight(dateTimeZone16);
        long long21 = dateTimeZone16.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology22 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone16);
        org.joda.time.DurationField durationField23 = zonedChronology22.weeks();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology22.weekOfWeekyear();
        org.joda.time.DurationField durationField25 = zonedChronology22.centuries();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology22.dayOfWeek();
        org.joda.time.DurationField durationField27 = zonedChronology22.millis();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 52, (org.joda.time.Chronology) zonedChronology22);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology22.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology22.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology22.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology22.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology22.year();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 100, dateTimeZone36);
        org.joda.time.LocalDate localDate39 = localDate37.plusDays(50);
        org.joda.time.Chronology chronology40 = localDate39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) 100, dateTimeZone43);
        org.joda.time.LocalDate localDate46 = localDate44.plusDays(50);
        int int47 = localDate44.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate49 = localDate44.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        int int52 = dateTimeZone50.getOffset((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateMidnight dateMidnight53 = localDate44.toDateMidnight(dateTimeZone50);
        long long55 = dateTimeZone50.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology56 = org.joda.time.chrono.ZonedChronology.getInstance(chronology40, dateTimeZone50);
        org.joda.time.DurationField durationField57 = zonedChronology56.weeks();
        org.joda.time.DateTimeField dateTimeField58 = zonedChronology56.year();
        org.joda.time.DateTimeZone dateTimeZone59 = zonedChronology56.getZone();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology56.weekyear();
        org.joda.time.DateTimeField dateTimeField61 = zonedChronology56.minuteOfHour();
        org.joda.time.DurationField durationField62 = zonedChronology56.hours();
        org.joda.time.DurationField durationField63 = zonedChronology56.weeks();
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology56.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial65 = null;
        java.util.Locale locale68 = java.util.Locale.forLanguageTag("minuteOfHour");
        java.lang.String str69 = dateTimeField64.getAsText(readablePartial65, 11815565, locale68);
        java.util.Set<java.lang.String> strSet70 = locale68.getUnicodeLocaleAttributes();
        java.lang.String str71 = dateTimeField33.getAsText(26165440, locale68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField57", (durationField23.compareTo(durationField57) == 0) == durationField23.equals(durationField57));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay3 = dateTime2.toTimeOfDay();
        org.joda.time.DateTime.Property property4 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime5 = property4.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime6 = property4.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime7 = property4.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(50);
        int int13 = localDate10.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property14 = localDate10.dayOfMonth();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.Instant instant16 = dateTime15.toInstant();
        org.joda.time.Chronology chronology17 = dateTime15.getChronology();
        org.joda.time.DateTime dateTime19 = dateTime15.plusDays(2);
        int int20 = property14.getDifference((org.joda.time.ReadableInstant) dateTime15);
        int int21 = dateTime15.getSecondOfMinute();
        int int22 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant16", (dateTime0.compareTo(instant16) == 0) == dateTime0.equals(instant16));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        java.util.TimeZone timeZone18 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(72000000L, dateTimeZone16);
        int int21 = dateTimeZone16.getStandardOffset((long) 'u');
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 49, dateTimeZone16);
        org.joda.time.DateTime dateTime23 = dateTime11.withZone(dateTimeZone16);
        org.joda.time.DateTime dateTime25 = dateTime11.plusWeeks(26277);
        int int26 = dateTime25.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime23", (dateTime11.compareTo(dateTime23) == 0) == dateTime11.equals(dateTime23));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone4 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone5 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(72000000L, dateTimeZone3);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfWeek();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        int int9 = dateTime8.getDayOfYear();
        org.joda.time.DateTime dateTime11 = dateTime8.withYear(11751002);
        org.joda.time.Instant instant12 = dateTime8.toInstant();
        org.joda.time.DateTime.Property property13 = dateTime8.monthOfYear();
        long long14 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime16 = property7.addToCopy(11904752);
        org.joda.time.DateTime dateTime17 = property7.withMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant12", (dateTime8.compareTo(instant12) == 0) == dateTime8.equals(instant12));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        int int8 = dateTime2.getYearOfEra();
        org.joda.time.Instant instant9 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant9.minus(readableDuration11);
        long long13 = instant12.getMillis();
        org.joda.time.DateTime dateTime14 = instant12.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant12", (dateTime2.compareTo(instant12) == 0) == dateTime2.equals(instant12));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        int int12 = dateTime6.getYearOfEra();
        org.joda.time.DateTime dateTime14 = dateTime6.withMinuteOfHour(11);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 100, dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.plusDays(50);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 100, dateTimeZone23);
        org.joda.time.LocalDate localDate26 = localDate24.plusDays(50);
        int int27 = localDate24.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate29 = localDate24.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        int int32 = dateTimeZone30.getOffset((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateMidnight dateMidnight33 = localDate24.toDateMidnight(dateTimeZone30);
        long long35 = dateTimeZone30.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology36 = org.joda.time.chrono.ZonedChronology.getInstance(chronology20, dateTimeZone30);
        org.joda.time.DurationField durationField37 = zonedChronology36.weeks();
        java.lang.String str38 = zonedChronology36.toString();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) 100, dateTimeZone40);
        org.joda.time.LocalDate.Property property42 = localDate41.weekyear();
        org.joda.time.LocalDate localDate44 = property42.setCopy(2022);
        org.joda.time.Instant instant45 = new org.joda.time.Instant();
        org.joda.time.Instant instant47 = instant45.withMillis((long) 11);
        org.joda.time.Instant instant48 = instant47.toInstant();
        org.joda.time.Chronology chronology49 = instant47.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) 100, dateTimeZone52);
        int int54 = dateTimeField50.getMaximumValue((org.joda.time.ReadablePartial) localDate53);
        int int56 = localDate53.getValue(2);
        org.joda.time.DateMidnight dateMidnight57 = localDate53.toDateMidnight();
        org.joda.time.LocalDate localDate59 = localDate53.plusMonths(26160535);
        int int60 = localDate59.getYear();
        boolean boolean61 = property42.equals((java.lang.Object) localDate59);
        org.joda.time.DateTime dateTime62 = localDate59.toDateTimeAtStartOfDay();
        boolean boolean63 = zonedChronology36.equals((java.lang.Object) dateTime62);
        org.joda.time.DurationField durationField64 = zonedChronology36.days();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology36.hourOfDay();
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate((java.lang.Object) dateTime14, (org.joda.time.Chronology) zonedChronology36);
        org.joda.time.DurationField durationField67 = zonedChronology36.centuries();
        org.joda.time.DateTimeField dateTimeField68 = zonedChronology36.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant45", (dateTime0.compareTo(instant45) == 0) == dateTime0.equals(instant45));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor2 = strSet1.iterator();
        java.util.stream.Stream<java.lang.String> strStream3 = strSet1.parallelStream();
        java.lang.Object[] objArray4 = strSet1.toArray();
        boolean boolean6 = strSet1.contains((java.lang.Object) "it");
        java.util.Locale locale7 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale7.toLanguageTag();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = locale7.getDisplayCountry(locale10);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(locale10);
        java.util.Set<java.lang.String> strSet13 = locale10.getUnicodeLocaleAttributes();
        boolean boolean14 = strSet1.retainAll((java.util.Collection<java.lang.String>) strSet13);
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.util.Locale locale17 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor19 = strSet18.iterator();
        java.util.stream.Stream<java.lang.String> strStream20 = strSet18.parallelStream();
        java.lang.String[] strArray30 = new java.lang.String[] { "zh_TW", "centuries", "minutes", "zh-TW", "Coordinated Universal Time", "hi!", "Property[minuteOfHour]", "2017", "Property[minuteOfHour]" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        boolean boolean33 = strSet18.retainAll((java.util.Collection<java.lang.String>) strList31);
        boolean boolean34 = strSet16.removeAll((java.util.Collection<java.lang.String>) strList31);
        org.joda.time.Instant instant35 = new org.joda.time.Instant();
        org.joda.time.Instant instant37 = instant35.withMillis((long) 11);
        org.joda.time.Instant instant38 = instant37.toInstant();
        org.joda.time.Chronology chronology39 = instant37.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 100, dateTimeZone42);
        int int44 = dateTimeField40.getMaximumValue((org.joda.time.ReadablePartial) localDate43);
        boolean boolean45 = dateTimeField40.isSupported();
        int int48 = dateTimeField40.getDifference((long) 4, (long) (-1));
        java.util.Locale locale50 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet51 = locale50.getUnicodeLocaleAttributes();
        java.lang.String str52 = locale50.toLanguageTag();
        java.lang.String str53 = dateTimeField40.getAsText((long) 11753441, locale50);
        java.lang.String str54 = locale50.toLanguageTag();
        boolean boolean55 = strSet16.remove((java.lang.Object) locale50);
        boolean boolean56 = strSet13.retainAll((java.util.Collection<java.lang.String>) strSet16);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((long) 100, dateTimeZone58);
        org.joda.time.LocalDate localDate61 = localDate59.plusDays(50);
        org.joda.time.Chronology chronology62 = localDate61.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate((long) 100, dateTimeZone65);
        org.joda.time.LocalDate localDate68 = localDate66.plusDays(50);
        int int69 = localDate66.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate71 = localDate66.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime();
        int int74 = dateTimeZone72.getOffset((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateMidnight dateMidnight75 = localDate66.toDateMidnight(dateTimeZone72);
        long long77 = dateTimeZone72.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology78 = org.joda.time.chrono.ZonedChronology.getInstance(chronology62, dateTimeZone72);
        org.joda.time.DurationField durationField79 = zonedChronology78.weeks();
        org.joda.time.DurationField durationField80 = zonedChronology78.millis();
        org.joda.time.DurationField durationField81 = zonedChronology78.millis();
        org.joda.time.DateTimeField dateTimeField82 = zonedChronology78.monthOfYear();
        org.joda.time.LocalDate localDate83 = org.joda.time.LocalDate.now((org.joda.time.Chronology) zonedChronology78);
        org.joda.time.DateTimeField dateTimeField84 = zonedChronology78.millisOfDay();
        boolean boolean85 = strSet13.contains((java.lang.Object) zonedChronology78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant35 and dateTime73", (instant35.compareTo(dateTime73) == 0) == instant35.equals(dateTime73));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        org.joda.time.DateTime dateTime14 = dateTime6.minusDays(22);
        org.joda.time.DateTime dateTime16 = dateTime6.withYearOfCentury(14);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.Instant instant19 = instant17.plus((long) 11753187);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant19.plus(readableDuration20);
        boolean boolean22 = dateTime6.equals((java.lang.Object) instant21);
        org.joda.time.DateTime.Property property23 = dateTime6.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withField(dateTimeFieldType26, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.plusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withMillisOfSecond((int) '4');
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.plusWeeks(26160458);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.minusMinutes((int) 'u');
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusMonths(3);
        org.joda.time.DateTime dateTime39 = dateTime6.withFields((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.DateTime dateTime41 = dateTime39.plusHours(11764640);
        java.util.Date date42 = dateTime39.toDate();
        java.lang.String str43 = date42.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant17", (dateTime0.compareTo(instant17) == 0) == dateTime0.equals(instant17));
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        int int8 = dateTime2.getYearOfEra();
        org.joda.time.Instant instant9 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant9.withDurationAdded(readableDuration11, 11768869);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant16 = instant9.withDurationAdded(readableDuration14, 11869983);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant18 = instant16.minus(readableDuration17);
        org.joda.time.DateTime dateTime19 = instant18.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant18", (dateTime2.compareTo(instant18) == 0) == dateTime2.equals(instant18));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusDays(11866645);
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusYears(12052898);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        int int11 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) instant8, dateTimeZone9);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean14 = localDateTime12.isSupported(dateTimeFieldType13);
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType13.getDurationType();
        boolean boolean16 = localDateTime6.isSupported(durationFieldType15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant8", (dateTime7.compareTo(instant8) == 0) == dateTime7.equals(instant8));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        long long28 = zonedChronology21.add(0L, 11776486L, 0);
        org.joda.time.DurationField durationField29 = zonedChronology21.halfdays();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.clockhourOfDay();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((org.joda.time.Chronology) zonedChronology21);
        org.joda.time.DurationField durationField32 = zonedChronology21.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime31", (dateTime16.compareTo(dateTime31) == 0) == dateTime16.equals(dateTime31));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime0.withHourOfDay(10);
        java.util.GregorianCalendar gregorianCalendar5 = dateTime0.toGregorianCalendar();
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.Instant instant9 = instant7.withMillis((long) 11);
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 11760560, chronology11);
        org.joda.time.DateTime dateTime14 = dateTime0.withChronology(chronology11);
        org.joda.time.DateTime dateTime15 = dateTime0.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant7", (dateTime15.compareTo(instant7) == 0) == dateTime15.equals(instant7));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        int int12 = dateTime6.getYearOfEra();
        org.joda.time.DateTime dateTime14 = dateTime6.withMinuteOfHour(11);
        org.joda.time.DateTime dateTime16 = dateTime14.minusWeeks(1);
        org.joda.time.Instant instant17 = new org.joda.time.Instant();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.DateTime dateTime20 = instant19.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime21 = instant19.toMutableDateTimeISO();
        boolean boolean22 = dateTime16.isEqual((org.joda.time.ReadableInstant) instant19);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant25 = instant19.withDurationAdded(readableDuration23, 54633941);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant25", (dateTime0.compareTo(instant25) == 0) == dateTime0.equals(instant25));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime4 = dateTime0.withCenturyOfEra(50);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.minus((long) 2);
        int int8 = dateTime4.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.Instant instant10 = instant5.plus((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant5.minus(readableDuration11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant12.minus(readableDuration13);
        org.joda.time.Instant instant16 = instant14.plus(13231L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant14", (dateTime0.compareTo(instant14) == 0) == dateTime0.equals(instant14));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        int int2 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.now(dateTimeZone0);
        int int5 = dateTimeZone0.getStandardOffset((long) 26156834);
        java.lang.String str7 = dateTimeZone0.getNameKey((long) 26160458);
        long long9 = dateTimeZone0.previousTransition((long) 11767256);
        int int11 = dateTimeZone0.getOffsetFromLocal((long) 2017);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        int int13 = dateTime12.getDayOfYear();
        org.joda.time.DateTime dateTime15 = dateTime12.withYear(11751002);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTime16.getDayOfYear();
        org.joda.time.DateTime dateTime19 = dateTime16.withYear(11751002);
        org.joda.time.Instant instant20 = dateTime16.toInstant();
        boolean boolean21 = dateTime12.isEqual((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Instant instant24 = instant20.withDurationAdded((long) 26260461, 11844162);
        int int25 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) instant24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Instant instant27 = instant24.minus(readableDuration26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant30 = instant27.withDurationAdded(readableDuration28, 54585415);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant20", (dateTime1.compareTo(instant20) == 0) == dateTime1.equals(instant20));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant2.minus(readableDuration4);
        org.joda.time.Instant instant6 = instant2.toInstant();
        org.joda.time.DateTime dateTime7 = instant6.toDateTimeISO();
        org.joda.time.DateTime dateTime9 = dateTime7.plusHours(11861177);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withField(dateTimeFieldType12, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.minusYears(5);
        int int17 = localDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology18 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(chronology18);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withMinuteOfHour(0);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.minus(readableDuration23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusHours(11783192);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.monthOfYear();
        int int28 = localDateTime26.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        int int30 = localDateTime29.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.minusDays(17);
        int int33 = localDateTime29.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.minusHours(22);
        org.joda.time.DateTime dateTime36 = localDateTime35.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        int int39 = dateTimeZone37.getOffset((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(dateTimeZone37);
        java.lang.String str42 = dateTimeZone37.getName((long) 18);
        org.joda.time.Instant instant43 = org.joda.time.Instant.now();
        org.joda.time.Instant instant45 = instant43.plus((long) 11753187);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Instant instant47 = instant45.plus(readableDuration46);
        org.joda.time.Instant instant49 = instant47.plus((long) (short) -1);
        org.joda.time.Instant instant51 = instant47.plus((long) 20);
        int int52 = dateTimeZone37.getOffset((org.joda.time.ReadableInstant) instant47);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean54 = instant47.isSupported(dateTimeFieldType53);
        int int55 = localDateTime35.get(dateTimeFieldType53);
        boolean boolean56 = localDateTime26.isSupported(dateTimeFieldType53);
        int int57 = dateTime9.get(dateTimeFieldType53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime38", (instant0.compareTo(dateTime38) == 0) == instant0.equals(dateTime38));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Chronology chronology2 = dateTime0.getChronology();
        org.joda.time.DateTime dateTime4 = dateTime0.plusDays(2);
        java.util.Date date5 = dateTime0.toDate();
        java.lang.String str7 = dateTime0.toString("15");
        java.util.GregorianCalendar gregorianCalendar8 = dateTime0.toGregorianCalendar();
        gregorianCalendar8.setFirstDayOfWeek(11760949);
        int int11 = gregorianCalendar8.getWeekYear();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar8);
        org.joda.time.DateTime dateTime13 = localDate12.toDateTimeAtMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.minusHours(11771697);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.Instant instant16 = dateTime15.toInstant();
        org.joda.time.Chronology chronology17 = dateTime15.getChronology();
        org.joda.time.DateTime dateTime19 = dateTime15.plusDays(2);
        int int20 = dateTime15.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime15.withMillisOfDay(11771566);
        boolean boolean23 = dateTime14.isEqual((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.YearMonthDay yearMonthDay24 = dateTime22.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 100, dateTimeZone26);
        org.joda.time.LocalDate localDate29 = localDate27.plusDays(50);
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        org.joda.time.LocalDate.Property property31 = localDate29.era();
        org.joda.time.LocalDate localDate32 = property31.getLocalDate();
        org.joda.time.LocalDate localDate33 = property31.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime34 = dateTime22.withFields((org.joda.time.ReadablePartial) localDate33);
        java.lang.String str35 = dateTime22.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant16", (dateTime0.compareTo(instant16) == 0) == dateTime0.equals(instant16));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        int int9 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        int int11 = localDate8.getValue(2);
        org.joda.time.DateMidnight dateMidnight12 = localDate8.toDateMidnight();
        org.joda.time.LocalDate localDate14 = localDate8.plusMonths(26160535);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        int int16 = dateTime15.getDayOfYear();
        org.joda.time.DateTime dateTime18 = dateTime15.withYear(11751002);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        int int20 = dateTime19.getDayOfYear();
        org.joda.time.DateTime dateTime22 = dateTime19.withYear(11751002);
        org.joda.time.Instant instant23 = dateTime19.toInstant();
        boolean boolean24 = dateTime15.isEqual((org.joda.time.ReadableInstant) instant23);
        org.joda.time.DateTime dateTime25 = localDate14.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime27 = dateTime25.withSecondOfMinute(0);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime27.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime15", (instant0.compareTo(dateTime15) == 0) == instant0.equals(dateTime15));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minus(0L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 100, dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime4.withZone(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = dateTime4.toLocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.plusMonths(49);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 100, dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.plusDays(50);
        org.joda.time.LocalDate.Property property17 = localDate16.monthOfYear();
        org.joda.time.LocalDate.Property property18 = localDate16.year();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 100, dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.plusDays(50);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 100, dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate28.plusDays(50);
        int int31 = localDate28.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate33 = localDate28.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        int int36 = dateTimeZone34.getOffset((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateMidnight dateMidnight37 = localDate28.toDateMidnight(dateTimeZone34);
        long long39 = dateTimeZone34.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology40 = org.joda.time.chrono.ZonedChronology.getInstance(chronology24, dateTimeZone34);
        org.joda.time.DateTime dateTime41 = localDate16.toDateTimeAtStartOfDay(dateTimeZone34);
        java.lang.String str43 = dateTimeZone34.getName((-3155695200000L));
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate(dateTimeZone34);
        org.joda.time.Interval interval45 = localDate11.toInterval(dateTimeZone34);
        org.joda.time.LocalDate localDate47 = localDate11.plusMonths(11842946);
        org.joda.time.LocalDate localDate49 = localDate47.minusWeeks(26235382);
        org.joda.time.LocalDate.Property property50 = localDate49.weekyear();
        org.joda.time.LocalDate localDate52 = localDate49.withWeekyear(201);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime8", (dateTime2.compareTo(dateTime8) == 0) == dateTime2.equals(dateTime8));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTime();
        long long4 = instant2.getMillis();
        org.joda.time.Instant instant6 = instant2.plus(4374598513L);
        org.joda.time.Instant instant8 = instant6.withMillis(4L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime3", (instant2.compareTo(mutableDateTime3) == 0) == instant2.equals(mutableDateTime3));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        int int5 = dateTime2.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.plusDays(50);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = chronology11.weeks();
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime2.toMutableDateTime(chronology11);
        org.joda.time.DurationField durationField15 = chronology11.weeks();
        org.joda.time.DateTimeField dateTimeField16 = chronology11.weekOfWeekyear();
        java.lang.String str18 = dateTimeField16.getAsText((long) 12085194);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and mutableDateTime14", (dateTime2.compareTo(mutableDateTime14) == 0) == dateTime2.equals(mutableDateTime14));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 58);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        int int3 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(11751002);
        org.joda.time.Instant instant6 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime8 = dateTime2.plusYears(26160835);
        boolean boolean10 = dateTime8.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime17 = dateTime13.minusMillis((int) '#');
        org.joda.time.DateTime dateTime19 = dateTime17.plusDays(11);
        org.joda.time.DateTime dateTime22 = dateTime17.withDurationAdded((long) 11757696, (int) ' ');
        int int23 = dateTime17.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime25 = dateTime17.minusWeeks(215400000);
        boolean boolean26 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int28 = dateTime8.get(dateTimeFieldType27);
        int int29 = dateTime1.get(dateTimeFieldType27);
        org.joda.time.DateTime dateTime31 = dateTime1.minusYears(11854316);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 100, dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.plusDays(50);
        org.joda.time.Chronology chronology38 = localDate37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.millisOfDay();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate(chronology38);
        org.joda.time.DateTimeField dateTimeField41 = chronology38.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone46 = dateTimeZone45.toTimeZone();
        java.util.TimeZone timeZone47 = dateTimeZone45.toTimeZone();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(72000000L, dateTimeZone45);
        int int50 = dateTimeZone45.getStandardOffset((long) 'u');
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate(dateTimeZone45);
        org.joda.time.chrono.ZonedChronology zonedChronology52 = org.joda.time.chrono.ZonedChronology.getInstance(chronology38, dateTimeZone45);
        org.joda.time.DurationField durationField53 = durationFieldType32.getField(chronology38);
        org.joda.time.DateTime dateTime55 = dateTime31.withFieldAdded(durationFieldType32, 11885623);
        org.joda.time.DateTime.Property property56 = dateTime31.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant6", (dateTime2.compareTo(instant6) == 0) == dateTime2.equals(instant6));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime4 = dateTime0.withCenturyOfEra(50);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.minus((long) 2);
        int int8 = dateTime4.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.DateTime dateTime10 = dateTime4.minusWeeks(26194721);
        org.joda.time.DateTime dateTime11 = dateTime10.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime13 = dateTime10.withMillis((long) 11892763);
        org.joda.time.DateTime dateTime15 = dateTime13.minusHours(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant5", (dateTime0.compareTo(instant5) == 0) == dateTime0.equals(instant5));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime0.withHourOfDay(10);
        java.util.GregorianCalendar gregorianCalendar5 = dateTime0.toGregorianCalendar();
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.Instant instant9 = instant7.withMillis((long) 11);
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 11760560, chronology11);
        org.joda.time.DateTime dateTime14 = dateTime0.withChronology(chronology11);
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears(11792895);
        org.joda.time.DateTime.Property property17 = dateTime14.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant7", (dateTime0.compareTo(instant7) == 0) == dateTime0.equals(instant7));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusSeconds((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.minusHours(0);
        org.joda.time.LocalTime localTime12 = localTime10.plusMillis(8);
        org.joda.time.LocalTime localTime14 = localTime12.plusMinutes(26156834);
        org.joda.time.LocalTime localTime16 = localTime12.withMillisOfDay(11764152);
        org.joda.time.DateTime dateTime17 = dateTime6.withFields((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.Instant instant20 = dateTime19.toInstant();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        boolean boolean22 = dateTime18.isEqual((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = localTime29.getFieldType((int) (byte) 1);
        int int32 = localTime27.get(dateTimeFieldType31);
        org.joda.time.LocalTime.Property property33 = localTime25.property(dateTimeFieldType31);
        org.joda.time.LocalTime localTime34 = property33.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime35 = property33.getLocalTime();
        org.joda.time.LocalTime localTime36 = property33.roundFloorCopy();
        org.joda.time.LocalTime localTime38 = property33.addWrapFieldToCopy(26159400);
        org.joda.time.DateTimeField dateTimeField39 = property33.getField();
        org.joda.time.LocalTime localTime40 = property33.roundCeilingCopy();
        org.joda.time.LocalTime localTime42 = localTime40.minusHours(11753441);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        int int45 = dateTimeZone43.getStandardOffset((long) (byte) 1);
        org.joda.time.DateTime dateTime46 = localTime42.toDateTimeToday(dateTimeZone43);
        org.joda.time.DateTime dateTime47 = dateTime18.withZone(dateTimeZone43);
        int int48 = dateTime47.getCenturyOfEra();
        org.joda.time.DateTime dateTime50 = dateTime47.withYearOfEra(32769);
        boolean boolean51 = dateTime17.isAfter((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTime.Property property52 = dateTime50.millisOfSecond();
        org.joda.time.Instant instant53 = new org.joda.time.Instant();
        org.joda.time.Instant instant55 = instant53.withMillis((long) 11);
        org.joda.time.Instant instant56 = instant55.toInstant();
        org.joda.time.Instant instant58 = instant56.plus((long) 589);
        org.joda.time.Instant instant60 = instant56.plus(11781L);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.Instant instant63 = instant56.withDurationAdded(readableDuration61, (int) 'x');
        org.joda.time.Instant instant64 = instant63.toInstant();
        boolean boolean65 = dateTime50.isEqual((org.joda.time.ReadableInstant) instant64);
        java.util.Date date66 = instant64.toDate();
        java.util.Date date68 = new java.util.Date(30902150430976312L);
        int int69 = date68.getMinutes();
        boolean boolean70 = date66.before(date68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant20", (dateTime0.compareTo(instant20) == 0) == dateTime0.equals(instant20));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        int int2 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone0);
        java.lang.String str5 = dateTimeZone0.getName((long) 18);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone0);
        long long8 = dateTimeZone0.nextTransition(23850L);
        java.util.Locale locale13 = new java.util.Locale("\u30c9\u30a4\u30c4\u8a9e\u30c9\u30a4\u30c4)", "14", "Italian");
        java.lang.String str14 = locale13.getDisplayVariant();
        java.lang.String str15 = dateTimeZone0.getShortName((long) 26323732, locale13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime3", (dateTime1.compareTo(dateTime3) == 0) == dateTime1.equals(dateTime3));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        int int2 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone0);
        boolean boolean4 = dateTime3.isEqualNow();
        org.joda.time.DateTime dateTime6 = dateTime3.withMillisOfDay(11905697);
        org.joda.time.DateTime dateTime8 = dateTime6.minusWeeks(209);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime localTime12 = localTime10.minusHours(0);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime12.plus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime12.plusMinutes(3);
        org.joda.time.LocalTime localTime18 = localTime16.minusHours(11832888);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime21 = localTime16.withPeriodAdded(readablePeriod19, 11936014);
        org.joda.time.LocalTime localTime23 = localTime21.plusSeconds(11830648);
        boolean boolean24 = dateTime8.equals((java.lang.Object) 11830648);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime3", (dateTime1.compareTo(dateTime3) == 0) == dateTime1.equals(dateTime3));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (byte) 10);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Chronology chronology4 = dateTime2.getChronology();
        long long5 = dateTime2.getMillis();
        boolean boolean6 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime1.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime6.getFieldType((int) (byte) 1);
        int int9 = localTime4.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime2.property(dateTimeFieldType8);
        org.joda.time.LocalTime localTime11 = property10.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime12 = property10.getLocalTime();
        org.joda.time.LocalTime localTime13 = property10.getLocalTime();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.minusHours((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = dateTime14.withZone(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime localTime24 = localTime22.plusSeconds(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = localTime22.getFieldType(0);
        org.joda.time.DateTime dateTime28 = dateTime14.withField(dateTimeFieldType26, 5);
        boolean boolean29 = localTime13.isSupported(dateTimeFieldType26);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(14);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) 11825569, dateTimeZone32);
        boolean boolean34 = localTime13.equals((java.lang.Object) 11825569);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime19", (dateTime14.compareTo(dateTime19) == 0) == dateTime14.equals(dateTime19));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight3 = dateTime2.toDateMidnight();
        int int4 = dateMidnight3.getDayOfYear();
        int int5 = dateMidnight3.getSecondOfMinute();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.Instant instant8 = instant6.withMillis((long) 11);
        org.joda.time.Instant instant9 = instant8.toInstant();
        org.joda.time.Chronology chronology10 = instant8.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.yearOfCentury();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology10);
        boolean boolean14 = dateMidnight3.isAfter((org.joda.time.ReadableInstant) dateTime13);
        int int15 = dateTime13.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withPeriodAdded(readablePeriod16, 12187090);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant6", (dateTime0.compareTo(instant6) == 0) == dateTime0.equals(instant6));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        int int8 = dateTime2.getYearOfEra();
        org.joda.time.Instant instant9 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(14);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) 11825569, dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localTime14.toDateTimeToday();
        org.joda.time.DateTime dateTime16 = dateTime10.withFields((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime20 = property18.addWrapFieldToCopy(11756302);
        org.joda.time.LocalDateTime localDateTime22 = property18.addWrapFieldToCopy(100);
        java.lang.String str23 = property18.getAsText();
        int int24 = property18.get();
        org.joda.time.LocalDateTime localDateTime25 = property18.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField26 = property18.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = dateTimeField26.getType();
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType27.getRangeDurationType();
        org.joda.time.LocalTime localTime30 = localTime14.withFieldAdded(durationFieldType28, 11913589);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant9", (dateTime2.compareTo(instant9) == 0) == dateTime2.equals(instant9));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusDays(17);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.minusSeconds((int) 'u');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusWeeks((int) (short) 100);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.Chronology chronology10 = dateTime8.getChronology();
        org.joda.time.DateTime dateTime12 = dateTime8.plusDays(2);
        int int13 = dateTime8.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime15 = dateTime8.withMillisOfDay(11771566);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfEra();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusDays((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int22 = localDateTime20.get(dateTimeFieldType21);
        int int23 = dateTime15.get(dateTimeFieldType21);
        boolean boolean24 = localDateTime5.isSupported(dateTimeFieldType21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant9", (dateTime8.compareTo(instant9) == 0) == dateTime8.equals(instant9));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.yearOfCentury();
        org.joda.time.DurationField durationField27 = zonedChronology21.months();
        org.joda.time.DurationField durationField28 = zonedChronology21.hours();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 100, dateTimeZone33);
        org.joda.time.LocalDate localDate36 = localDate34.plusDays(50);
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.millisOfDay();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology37);
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType31.getField(chronology37);
        org.joda.time.DateTimeField dateTimeField41 = chronology37.yearOfEra();
        org.joda.time.DateTimeField dateTimeField42 = chronology37.dayOfMonth();
        java.util.Locale locale44 = java.util.Locale.GERMAN;
        java.lang.String str45 = dateTimeField42.getAsShortText(26336, locale44);
        java.util.Locale.setDefault(locale44);
        java.lang.String str47 = dateTimeField29.getAsText(12181669, locale44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime39", (dateTime16.compareTo(dateTime39) == 0) == dateTime16.equals(dateTime39));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        int int9 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        int int11 = localDate8.getValue(2);
        org.joda.time.DateMidnight dateMidnight12 = localDate8.toDateMidnight();
        org.joda.time.LocalDate localDate14 = localDate8.plusMonths(26160535);
        org.joda.time.LocalDate.Property property15 = localDate8.yearOfEra();
        int int16 = property15.getLeapAmount();
        int int17 = property15.get();
        java.util.Locale locale21 = new java.util.Locale("2017-02-22T07:16:35.021", "07:10:28.915");
        org.joda.time.LocalDate localDate22 = property15.setCopy("26340000", locale21);
        org.joda.time.Interval interval23 = property15.toInterval();
        org.joda.time.LocalDate localDate24 = property15.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = dateTime25.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int29 = dateTime27.get(dateTimeFieldType28);
        org.joda.time.DateTime dateTime31 = dateTime27.minusMillis((int) '#');
        org.joda.time.DateTime.Property property32 = dateTime27.weekyear();
        java.util.GregorianCalendar gregorianCalendar33 = dateTime27.toGregorianCalendar();
        boolean boolean34 = localDate24.equals((java.lang.Object) gregorianCalendar33);
        boolean boolean35 = gregorianCalendar33.isLenient();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime25", (instant0.compareTo(dateTime25) == 0) == instant0.equals(dateTime25));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime4 = dateTime0.withCenturyOfEra(50);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.minus((long) 2);
        int int8 = dateTime4.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.DateTime.Property property9 = dateTime4.centuryOfEra();
        org.joda.time.DateTime dateTime11 = dateTime4.plusDays(58);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMonths(32770);
        int int14 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime.Property property15 = dateTime13.hourOfDay();
        org.joda.time.DateTime.Property property16 = dateTime13.millisOfDay();
        org.joda.time.DateTime dateTime17 = property16.roundHalfFloorCopy();
        boolean boolean18 = dateTime17.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant5", (dateTime0.compareTo(instant5) == 0) == dateTime0.equals(instant5));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.centuryOfEra();
        org.joda.time.DurationField durationField24 = zonedChronology21.minutes();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone26 = zonedChronology21.getZone();
        boolean boolean28 = dateTimeZone26.isStandardOffset(5923851084717420000L);
        long long31 = dateTimeZone26.convertLocalToUTC((long) 26226390, false);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime33 = dateTime32.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime35 = dateTime33.minusHours(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime35", (dateTime16.compareTo(dateTime35) == 0) == dateTime16.equals(dateTime35));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DurationField durationField25 = zonedChronology21.weekyears();
        org.joda.time.DurationField durationField26 = zonedChronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField22, and durationField25", !(durationField26.compareTo(durationField22) == 0) || (Math.signum(durationField26.compareTo(durationField25)) == Math.signum(durationField22.compareTo(durationField25))));
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusSeconds((int) (short) 0);
        org.joda.time.LocalDate localDate7 = dateTime2.toLocalDate();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int12 = dateTime10.get(dateTimeFieldType11);
        org.joda.time.DateTime dateTime14 = dateTime10.minusMillis((int) '#');
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone15);
        boolean boolean19 = dateTime14.isEqual((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateMidnight dateMidnight20 = dateTime18.toDateMidnight();
        int int21 = dateMidnight20.getHourOfDay();
        org.joda.time.DateTime dateTime22 = localDate7.toDateTime((org.joda.time.ReadableInstant) dateMidnight20);
        java.util.GregorianCalendar gregorianCalendar23 = dateTime22.toGregorianCalendar();
        org.joda.time.DateTime.Property property24 = dateTime22.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime18", (dateTime0.compareTo(dateTime18) == 0) == dateTime0.equals(dateTime18));
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = instant2.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 10);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(49);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes(11767480);
        int int12 = mutableDateTime5.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime.Property property13 = dateTime9.year();
        org.joda.time.DateTime dateTime15 = dateTime9.minusHours(11861273);
        org.joda.time.DateTime dateTime16 = dateTime9.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime5", (instant2.compareTo(mutableDateTime5) == 0) == instant2.equals(mutableDateTime5));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Chronology chronology2 = dateTime0.getChronology();
        org.joda.time.DateTime dateTime4 = dateTime0.plusDays(2);
        int int5 = dateTime0.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property6 = dateTime0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.minusHours(11771697);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.Instant instant16 = dateTime15.toInstant();
        org.joda.time.Chronology chronology17 = dateTime15.getChronology();
        org.joda.time.DateTime dateTime19 = dateTime15.plusDays(2);
        int int20 = dateTime15.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime15.withMillisOfDay(11771566);
        boolean boolean23 = dateTime14.isEqual((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.YearMonthDay yearMonthDay24 = dateTime22.toYearMonthDay();
        org.joda.time.Instant instant25 = new org.joda.time.Instant();
        org.joda.time.Instant instant27 = instant25.withMillis((long) 11);
        org.joda.time.Instant instant28 = instant27.toInstant();
        org.joda.time.Chronology chronology29 = instant27.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.minuteOfHour();
        boolean boolean31 = dateTimeField30.isSupported();
        java.util.Locale locale32 = java.util.Locale.TAIWAN;
        java.lang.String str33 = locale32.toLanguageTag();
        java.lang.String str34 = locale32.toLanguageTag();
        java.lang.String str35 = locale32.getDisplayScript();
        int int36 = dateTimeField30.getMaximumShortTextLength(locale32);
        java.lang.String str38 = dateTimeField30.getAsText((long) 26221127);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = dateTimeField30.getType();
        boolean boolean40 = dateTime22.isSupported(dateTimeFieldType39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant16", (dateTime0.compareTo(instant16) == 0) == dateTime0.equals(instant16));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight3 = dateTime2.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int5 = dateTime2.get(dateTimeFieldType4);
        int int6 = dateTime2.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.dayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime2.withChronology(chronology12);
        org.joda.time.DateTime dateTime17 = dateTime15.plusSeconds(100);
        org.joda.time.DateTime.Property property18 = dateTime15.hourOfDay();
        int int19 = property18.getLeapAmount();
        boolean boolean20 = property18.isLeap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime15", (dateTime2.compareTo(dateTime15) == 0) == dateTime2.equals(dateTime15));
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = instant2.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 10);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(49);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes(11767480);
        int int12 = mutableDateTime5.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime14 = dateTime9.plus((long) 28);
        java.util.Locale locale15 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        boolean boolean17 = strSet16.isEmpty();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int22 = dateTime20.get(dateTimeFieldType21);
        org.joda.time.DateTime dateTime24 = dateTime20.minusMillis((int) '#');
        org.joda.time.DateTime dateTime26 = dateTime24.plusDays(11);
        org.joda.time.DateTime dateTime29 = dateTime24.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime31 = dateTime24.plusDays(26159400);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime24.getZone();
        boolean boolean33 = strSet16.remove((java.lang.Object) dateTime24);
        java.lang.Object obj34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        int int37 = dateTimeZone35.getStandardOffset((long) (byte) 1);
        java.lang.String str39 = dateTimeZone35.getShortName((long) 11756302);
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(obj34, dateTimeZone35);
        boolean boolean41 = strSet16.equals((java.lang.Object) dateTimeZone35);
        java.lang.String str43 = dateTimeZone35.getName((long) 4);
        java.lang.String str45 = dateTimeZone35.getName((long) 11826361);
        org.joda.time.DateTime dateTime46 = dateTime14.toDateTime(dateTimeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime5", (instant2.compareTo(mutableDateTime5) == 0) == instant2.equals(mutableDateTime5));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 100, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.plusDays(50);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(50);
        int int13 = localDate10.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate15 = localDate10.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        int int18 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateMidnight dateMidnight19 = localDate10.toDateMidnight(dateTimeZone16);
        long long21 = dateTimeZone16.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology22 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone16);
        org.joda.time.DurationField durationField23 = zonedChronology22.weeks();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology22.centuryOfEra();
        org.joda.time.DurationField durationField25 = zonedChronology22.minutes();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology22.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone27 = zonedChronology22.getZone();
        org.joda.time.Chronology chronology28 = zonedChronology22.withUTC();
        org.joda.time.Instant instant29 = new org.joda.time.Instant();
        org.joda.time.Instant instant31 = instant29.withMillis((long) 11);
        org.joda.time.Instant instant32 = instant31.toInstant();
        org.joda.time.Chronology chronology33 = instant31.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 100, dateTimeZone36);
        int int38 = dateTimeField34.getMaximumValue((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDate localDate40 = localDate37.minus(readablePeriod39);
        java.util.Date date41 = localDate40.toDate();
        long long43 = zonedChronology22.set((org.joda.time.ReadablePartial) localDate40, (long) 11836898);
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology22.yearOfCentury();
        org.joda.time.LocalTime localTime45 = org.joda.time.LocalTime.fromMillisOfDay(371294268940800000L, (org.joda.time.Chronology) zonedChronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant29", (dateTime17.compareTo(instant29) == 0) == dateTime17.equals(instant29));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        int int5 = localDate4.getDayOfMonth();
        int int6 = localDate4.getYear();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMillis((int) '#');
        org.joda.time.DateTime dateTime15 = dateTime13.plusDays(11);
        org.joda.time.DateTime dateTime18 = dateTime13.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime20 = dateTime13.plusDays(26159400);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 100, dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.plusDays(50);
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime13.toMutableDateTime(chronology26);
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.now(chronology26);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekyear();
        int int31 = localDate29.get(dateTimeFieldType30);
        org.joda.time.LocalDate.Property property32 = localDate4.property(dateTimeFieldType30);
        org.joda.time.LocalDate.Property property33 = localDate4.centuryOfEra();
        org.joda.time.LocalDate.Property property34 = localDate4.yearOfCentury();
        java.util.Date date35 = localDate4.toDate();
        date35.setTime((long) 11808002);
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.fromDateFields(date35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime28", (dateTime13.compareTo(mutableDateTime28) == 0) == dateTime13.equals(mutableDateTime28));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DurationField durationField23 = zonedChronology21.millis();
        org.joda.time.DurationField durationField24 = zonedChronology21.millis();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.monthOfYear();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.monthOfYear();
        org.joda.time.DurationField durationField27 = zonedChronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField22, and durationField23", !(durationField27.compareTo(durationField22) == 0) || (Math.signum(durationField27.compareTo(durationField23)) == Math.signum(durationField22.compareTo(durationField23))));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Instant instant2 = dateTime1.toInstant();
        org.joda.time.Chronology chronology3 = dateTime1.getChronology();
        boolean boolean4 = dateTime0.isEqual((org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localTime11.getFieldType((int) (byte) 1);
        int int14 = localTime9.get(dateTimeFieldType13);
        org.joda.time.LocalTime.Property property15 = localTime7.property(dateTimeFieldType13);
        org.joda.time.LocalTime localTime16 = property15.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime17 = property15.getLocalTime();
        org.joda.time.LocalTime localTime18 = property15.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = property15.addWrapFieldToCopy(26159400);
        org.joda.time.DateTimeField dateTimeField21 = property15.getField();
        org.joda.time.LocalTime localTime22 = property15.roundCeilingCopy();
        org.joda.time.LocalTime localTime24 = localTime22.minusHours(11753441);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        int int27 = dateTimeZone25.getStandardOffset((long) (byte) 1);
        org.joda.time.DateTime dateTime28 = localTime24.toDateTimeToday(dateTimeZone25);
        org.joda.time.DateTime dateTime29 = dateTime0.withZone(dateTimeZone25);
        long long33 = dateTimeZone25.convertLocalToUTC((long) 19, false, (long) 11753234);
        java.lang.String str35 = dateTimeZone25.getNameKey((long) 11851047);
        long long37 = dateTimeZone25.nextTransition((long) 11865564);
        java.lang.String str39 = dateTimeZone25.getName(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant2", (dateTime0.compareTo(instant2) == 0) == dateTime0.equals(instant2));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        int int8 = dateTime2.getYearOfEra();
        org.joda.time.Instant instant9 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant9.withDurationAdded(readableDuration11, 11768869);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant16 = instant9.withDurationAdded(readableDuration14, 11869983);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 100, dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.plusDays(50);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 100, dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.plusDays(50);
        int int29 = localDate26.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate31 = localDate26.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        int int34 = dateTimeZone32.getOffset((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateMidnight dateMidnight35 = localDate26.toDateMidnight(dateTimeZone32);
        long long37 = dateTimeZone32.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology38 = org.joda.time.chrono.ZonedChronology.getInstance(chronology22, dateTimeZone32);
        org.joda.time.DurationField durationField39 = zonedChronology38.weeks();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology38.centuryOfEra();
        org.joda.time.DurationField durationField41 = zonedChronology38.minutes();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology38.year();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology38.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology38.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime45 = instant16.toMutableDateTime((org.joda.time.Chronology) zonedChronology38);
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology38.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant9", (dateTime2.compareTo(instant9) == 0) == dateTime2.equals(instant9));
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        int int8 = dateTime2.getYearOfEra();
        org.joda.time.Instant instant9 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant9.withDurationAdded(readableDuration11, 11768869);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant16 = instant9.withDurationAdded(readableDuration14, 11869983);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 100, dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.plusDays(50);
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 100, dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.plusDays(50);
        int int29 = localDate26.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate31 = localDate26.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        int int34 = dateTimeZone32.getOffset((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateMidnight dateMidnight35 = localDate26.toDateMidnight(dateTimeZone32);
        long long37 = dateTimeZone32.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology38 = org.joda.time.chrono.ZonedChronology.getInstance(chronology22, dateTimeZone32);
        org.joda.time.DurationField durationField39 = zonedChronology38.weeks();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology38.centuryOfEra();
        org.joda.time.DurationField durationField41 = zonedChronology38.minutes();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology38.year();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology38.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology38.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime45 = instant16.toMutableDateTime((org.joda.time.Chronology) zonedChronology38);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) 100, dateTimeZone47);
        org.joda.time.LocalDate localDate50 = localDate48.plusDays(50);
        org.joda.time.Chronology chronology51 = localDate50.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) 100, dateTimeZone54);
        org.joda.time.LocalDate localDate57 = localDate55.plusDays(50);
        int int58 = localDate55.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate60 = localDate55.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime();
        int int63 = dateTimeZone61.getOffset((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.DateMidnight dateMidnight64 = localDate55.toDateMidnight(dateTimeZone61);
        long long66 = dateTimeZone61.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology67 = org.joda.time.chrono.ZonedChronology.getInstance(chronology51, dateTimeZone61);
        org.joda.time.DateTimeField dateTimeField68 = zonedChronology67.yearOfCentury();
        org.joda.time.DurationField durationField69 = zonedChronology67.millis();
        org.joda.time.DurationField durationField70 = zonedChronology67.seconds();
        org.joda.time.DateTimeField dateTimeField71 = zonedChronology67.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField72 = zonedChronology67.secondOfMinute();
        org.joda.time.DurationField durationField73 = zonedChronology67.seconds();
        org.joda.time.DateTimeField dateTimeField74 = zonedChronology67.year();
        org.joda.time.DateTime dateTime75 = instant16.toDateTime((org.joda.time.Chronology) zonedChronology67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant16", (dateTime2.compareTo(instant16) == 0) == dateTime2.equals(instant16));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        int int9 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone7);
        boolean boolean11 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.plusYears(21);
        java.util.GregorianCalendar gregorianCalendar14 = dateTime13.toGregorianCalendar();
        gregorianCalendar14.setFirstDayOfWeek(24046591);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime10", (dateTime0.compareTo(dateTime10) == 0) == dateTime0.equals(dateTime10));
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(0);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalTime localTime5 = localTime3.plus(readablePeriod4);
        org.joda.time.LocalTime localTime7 = localTime3.minusSeconds(5);
        org.joda.time.LocalTime localTime9 = localTime3.plusMillis((int) (byte) 0);
        int int10 = localTime9.getMillisOfDay();
        int int11 = localTime9.getHourOfDay();
        org.joda.time.LocalTime localTime13 = localTime9.plusMinutes(26257734);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.Instant instant16 = instant14.withMillis((long) 11);
        org.joda.time.Instant instant17 = instant16.toInstant();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant16.minus(readableDuration18);
        org.joda.time.MutableDateTime mutableDateTime20 = instant16.toMutableDateTime();
        org.joda.time.Chronology chronology21 = instant16.getChronology();
        org.joda.time.DateTime dateTime22 = localTime9.toDateTime((org.joda.time.ReadableInstant) instant16);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfEra(12190885);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime20", (instant16.compareTo(mutableDateTime20) == 0) == instant16.equals(mutableDateTime20));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime dateTime6 = dateTime0.plusYears(26160835);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.lang.String str10 = dateTimeZone9.getID();
        org.joda.time.DateTime dateTime11 = dateTime6.toDateTime(dateTimeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime0.withZone(dateTimeZone3);
        org.joda.time.DateTime dateTime7 = dateTime0.withMillisOfSecond(11);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.Chronology chronology9 = dateTime7.getChronology();
        org.joda.time.DateTime dateTime10 = dateTime7.toDateTime();
        org.joda.time.LocalDate localDate11 = dateTime7.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime5", (dateTime0.compareTo(dateTime5) == 0) == dateTime0.equals(dateTime5));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.weekyear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = zonedChronology21.add(readablePeriod26, (long) 11783576, 26163273);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        long long33 = zonedChronology21.add(readablePeriod30, 11776486L, 38);
        org.joda.time.Chronology chronology34 = zonedChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone36 = chronology34.getZone();
        org.joda.time.Instant instant37 = new org.joda.time.Instant();
        org.joda.time.Instant instant39 = instant37.minus((long) 2);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Instant instant41 = instant39.plus(readableDuration40);
        org.joda.time.Instant instant43 = instant41.minus((long) 11790918);
        boolean boolean44 = dateTimeZone36.equals((java.lang.Object) 11790918);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant37", (dateTime16.compareTo(instant37) == 0) == dateTime16.equals(instant37));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localTime3.getFieldType((int) (byte) 1);
        int int6 = localTime1.get(dateTimeFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime1.minus(readablePeriod7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = localTime15.getFieldType((int) (byte) 1);
        int int18 = localTime13.get(dateTimeFieldType17);
        org.joda.time.LocalTime.Property property19 = localTime11.property(dateTimeFieldType17);
        org.joda.time.LocalTime.Property property20 = localTime8.property(dateTimeFieldType17);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime23 = localTime8.withPeriodAdded(readablePeriod21, 11903402);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) 11777629);
        org.joda.time.DateTime dateTime27 = instant26.toDateTime();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int32 = dateTime30.get(dateTimeFieldType31);
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType31.getDurationType();
        org.joda.time.DateTime dateTime35 = dateTime27.withFieldAdded(durationFieldType33, 11811894);
        boolean boolean36 = localTime23.isSupported(durationFieldType33);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalTime localTime38 = localTime23.plus(readablePeriod37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant26 and dateTime27", (instant26.compareTo(dateTime27) == 0) == instant26.equals(dateTime27));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight3 = dateTime2.toDateMidnight();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime8 = dateTime4.withCenturyOfEra(50);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.minus((long) 2);
        int int12 = dateTime8.compareTo((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Instant instant14 = instant9.plus((long) (short) 100);
        org.joda.time.Instant instant17 = instant14.withDurationAdded((long) 11811003, 26207777);
        org.joda.time.DateTime dateTime18 = instant14.toDateTime();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withField(dateTimeFieldType21, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.minusYears(5);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withMillisOfDay(8);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withField(dateTimeFieldType32, (int) (short) 10);
        boolean boolean35 = localDateTime26.isSupported(dateTimeFieldType32);
        boolean boolean36 = localDateTime25.isSupported(dateTimeFieldType32);
        int int37 = dateTime18.get(dateTimeFieldType32);
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType32.getDurationType();
        int int39 = dateTime2.get(dateTimeFieldType32);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 100, dateTimeZone41);
        org.joda.time.LocalDate localDate44 = localDate42.plusDays(50);
        org.joda.time.Chronology chronology45 = localDate44.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) 100, dateTimeZone48);
        org.joda.time.LocalDate localDate51 = localDate49.plusDays(50);
        int int52 = localDate49.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate54 = localDate49.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime();
        int int57 = dateTimeZone55.getOffset((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateMidnight dateMidnight58 = localDate49.toDateMidnight(dateTimeZone55);
        long long60 = dateTimeZone55.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology61 = org.joda.time.chrono.ZonedChronology.getInstance(chronology45, dateTimeZone55);
        org.joda.time.DurationField durationField62 = zonedChronology61.weeks();
        org.joda.time.DateTimeField dateTimeField63 = zonedChronology61.year();
        org.joda.time.DateTimeZone dateTimeZone64 = zonedChronology61.getZone();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology61.weekyear();
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        long long69 = zonedChronology61.add(readablePeriod66, (long) 11783576, 26163273);
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        long long73 = zonedChronology61.add(readablePeriod70, 30902150430976312L, 0);
        org.joda.time.DateTimeZone dateTimeZone74 = zonedChronology61.getZone();
        org.joda.time.DateTimeField dateTimeField75 = zonedChronology61.yearOfCentury();
        org.joda.time.DurationField durationField76 = zonedChronology61.days();
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate79 = new org.joda.time.LocalDate((long) 100, dateTimeZone78);
        long long83 = dateTimeZone78.convertLocalToUTC((long) 2017, false, (long) 0);
        java.util.Locale locale86 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale87 = java.util.Locale.TAIWAN;
        java.lang.String str88 = locale86.getDisplayCountry(locale87);
        java.lang.String str89 = dateTimeZone78.getName((long) 26160535, locale86);
        java.lang.String str90 = dateTimeZone78.getID();
        boolean boolean91 = dateTimeZone78.isFixed();
        java.util.Locale locale93 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str94 = dateTimeZone78.getShortName((long) 438, locale93);
        int int96 = dateTimeZone78.getOffset((long) 117);
        org.joda.time.Chronology chronology97 = zonedChronology61.withZone(dateTimeZone78);
        org.joda.time.DateTime dateTime98 = dateTime2.toDateTime(dateTimeZone78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant9", (dateTime0.compareTo(instant9) == 0) == dateTime0.equals(instant9));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime.Property property5 = dateTime0.dayOfWeek();
        org.joda.time.DateTime.Property property6 = dateTime0.secondOfMinute();
        org.joda.time.DateTime dateTime7 = property6.getDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant4", (dateTime7.compareTo(instant4) == 0) == dateTime7.equals(instant4));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = zonedChronology21.add(readablePeriod24, (long) 2022, 0);
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.weekyearOfCentury();
        org.joda.time.DurationField durationField31 = zonedChronology21.years();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology21.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField34 = zonedChronology21.halfdays();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now((org.joda.time.Chronology) zonedChronology21);
        org.joda.time.DurationField durationField36 = zonedChronology21.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime35", (dateTime16.compareTo(dateTime35) == 0) == dateTime16.equals(dateTime35));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        long long27 = dateTimeZone24.convertUTCToLocal((long) 11752861);
        java.util.TimeZone timeZone28 = dateTimeZone24.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime25", (dateTime16.compareTo(dateTime25) == 0) == dateTime16.equals(dateTime25));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        int int2 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone0);
        java.lang.String str5 = dateTimeZone0.getName((long) 18);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone0);
        long long8 = dateTimeZone0.nextTransition(23850L);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 100, dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.plusDays(50);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.hourOfHalfday();
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale20 = java.util.Locale.TAIWAN;
        java.lang.String str21 = locale19.getDisplayCountry(locale20);
        java.lang.String str22 = locale20.toLanguageTag();
        java.lang.String str23 = dateTimeField16.getAsShortText(1, locale20);
        java.lang.String str24 = locale20.getDisplayScript();
        java.lang.String str25 = locale20.getDisplayName();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone9, locale20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime3", (dateTime1.compareTo(dateTime3) == 0) == dateTime1.equals(dateTime3));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getWeeksInWeekYear();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromCalendarFields(calendar1);
        org.joda.time.Interval interval4 = localDate3.toInterval();
        int int5 = localDate3.getDayOfMonth();
        org.joda.time.Chronology chronology6 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withField(dateTimeFieldType11, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.minusYears(5);
        int int16 = localDateTime9.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property17 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime9.plusYears(26160835);
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = localDateTime19.toString("11802246", locale21);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone("+59:50");
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale25);
        java.lang.String str28 = locale25.toLanguageTag();
        java.util.Set<java.lang.String> strSet29 = locale25.getUnicodeLocaleKeys();
        java.util.Locale locale30 = java.util.Locale.GERMANY;
        java.lang.String str31 = locale30.getDisplayName();
        java.util.Locale.setDefault(locale30);
        java.lang.String str33 = locale25.getDisplayName(locale30);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone24, locale30);
        java.lang.String str35 = locale21.getDisplayLanguage(locale30);
        java.lang.String str36 = locale21.getDisplayVariant();
        java.lang.String str37 = dateTimeField7.getAsText(26587, locale21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar34", (calendar1.compareTo(calendar34) == 0) == calendar1.equals(calendar34));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay3 = dateTime2.toTimeOfDay();
        org.joda.time.DateTime.Property property4 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime6 = property4.setCopy(26156834);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight10 = dateTime9.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime localTime15 = localTime13.plusSeconds(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = localTime13.getFieldType(0);
        int int18 = dateMidnight10.get(dateTimeFieldType17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        int int21 = dateTimeZone19.getOffsetFromLocal((long) 'a');
        org.joda.time.DateTime dateTime22 = dateMidnight10.toDateTime(dateTimeZone19);
        boolean boolean23 = dateMidnight10.isEqualNow();
        long long24 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.DateTime dateTime26 = property4.setCopy("54600");
        org.joda.time.DateTime dateTime27 = property4.roundFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight10 and dateTime22", (dateMidnight10.compareTo(dateTime22) == 0) == dateMidnight10.equals(dateTime22));
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        java.lang.String str23 = zonedChronology21.toString();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 100, dateTimeZone25);
        org.joda.time.LocalDate.Property property27 = localDate26.weekyear();
        org.joda.time.LocalDate localDate29 = property27.setCopy(2022);
        org.joda.time.Instant instant30 = new org.joda.time.Instant();
        org.joda.time.Instant instant32 = instant30.withMillis((long) 11);
        org.joda.time.Instant instant33 = instant32.toInstant();
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 100, dateTimeZone37);
        int int39 = dateTimeField35.getMaximumValue((org.joda.time.ReadablePartial) localDate38);
        int int41 = localDate38.getValue(2);
        org.joda.time.DateMidnight dateMidnight42 = localDate38.toDateMidnight();
        org.joda.time.LocalDate localDate44 = localDate38.plusMonths(26160535);
        int int45 = localDate44.getYear();
        boolean boolean46 = property27.equals((java.lang.Object) localDate44);
        org.joda.time.DateTime dateTime47 = localDate44.toDateTimeAtStartOfDay();
        boolean boolean48 = zonedChronology21.equals((java.lang.Object) dateTime47);
        org.joda.time.DurationField durationField49 = zonedChronology21.days();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology21.hourOfDay();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology21.hourOfDay();
        org.joda.time.DurationField durationField52 = zonedChronology21.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant30", (dateTime16.compareTo(instant30) == 0) == dateTime16.equals(instant30));
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.DateTime dateTime3 = instant0.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant0.withDurationAdded(readableDuration4, 26269);
        org.joda.time.Instant instant8 = instant0.minus((-17104853310719981L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant0", (dateTime3.compareTo(instant0) == 0) == dateTime3.equals(instant0));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(0);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalTime localTime5 = localTime3.plus(readablePeriod4);
        org.joda.time.LocalTime localTime7 = localTime3.minusSeconds(5);
        org.joda.time.LocalTime localTime9 = localTime3.plusMillis((int) (byte) 0);
        int int10 = localTime9.getMillisOfDay();
        int int11 = localTime9.getHourOfDay();
        org.joda.time.DateTime dateTime12 = localTime9.toDateTimeToday();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime localTime16 = localTime14.minusHours(0);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime18 = localTime16.plus(readablePeriod17);
        org.joda.time.LocalTime localTime20 = localTime16.minusSeconds(5);
        org.joda.time.LocalTime localTime22 = localTime16.plusMillis((int) (byte) 0);
        int int23 = localTime22.getMillisOfDay();
        org.joda.time.LocalTime.Property property24 = localTime22.minuteOfHour();
        org.joda.time.LocalTime localTime26 = property24.addWrapFieldToCopy((int) (short) 0);
        org.joda.time.LocalTime localTime27 = localTime9.withFields((org.joda.time.ReadablePartial) localTime26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        int int29 = dateTime28.getDayOfYear();
        org.joda.time.DateTime dateTime31 = dateTime28.withYear(11751002);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        int int33 = dateTime32.getDayOfYear();
        org.joda.time.DateTime dateTime35 = dateTime32.withYear(11751002);
        org.joda.time.Instant instant36 = dateTime32.toInstant();
        boolean boolean37 = dateTime28.isEqual((org.joda.time.ReadableInstant) instant36);
        org.joda.time.Instant instant40 = instant36.withDurationAdded((long) 26260461, 11844162);
        org.joda.time.DateTime dateTime41 = localTime9.toDateTime((org.joda.time.ReadableInstant) instant40);
        org.joda.time.DateTime dateTime43 = dateTime41.withYearOfCentury(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and instant36", (dateTime28.compareTo(instant36) == 0) == dateTime28.equals(instant36));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.dayOfWeek();
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant28.withMillis((long) 11);
        org.joda.time.Instant instant31 = instant30.toInstant();
        org.joda.time.Chronology chronology32 = instant30.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 100, dateTimeZone35);
        int int37 = dateTimeField33.getMaximumValue((org.joda.time.ReadablePartial) localDate36);
        int int39 = localDate36.getValue(2);
        org.joda.time.DateMidnight dateMidnight40 = localDate36.toDateMidnight();
        org.joda.time.LocalDate localDate42 = localDate36.plusMonths(26160535);
        org.joda.time.LocalDate.Property property43 = localDate36.yearOfEra();
        int int44 = property43.getLeapAmount();
        int int45 = property43.get();
        org.joda.time.LocalDate localDate47 = property43.addWrapFieldToCopy(26182);
        int int48 = localDate47.getCenturyOfEra();
        org.joda.time.LocalDate localDate50 = localDate47.plusDays(1970);
        int[] intArray52 = zonedChronology21.get((org.joda.time.ReadablePartial) localDate47, (long) 650);
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology21.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant28", (dateTime16.compareTo(instant28) == 0) == dateTime16.equals(instant28));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology21.hourOfDay();
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now((org.joda.time.Chronology) zonedChronology21);
        org.joda.time.Instant instant26 = new org.joda.time.Instant();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant26.minus(readableDuration27);
        org.joda.time.DateTime dateTime29 = instant28.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime29.getZone();
        org.joda.time.DateTime dateTime31 = localDate25.toDateTimeAtStartOfDay(dateTimeZone30);
        long long33 = dateTimeZone30.previousTransition((long) 26600242);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant26", (dateTime16.compareTo(instant26) == 0) == dateTime16.equals(instant26));
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime dateTime6 = dateTime0.plusYears(26160835);
        boolean boolean8 = dateTime6.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int13 = dateTime11.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime11.minusMillis((int) '#');
        org.joda.time.DateTime dateTime17 = dateTime15.plusDays(11);
        org.joda.time.DateTime dateTime20 = dateTime15.withDurationAdded((long) 11757696, (int) ' ');
        int int21 = dateTime15.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime23 = dateTime15.minusWeeks(215400000);
        boolean boolean24 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime26 = dateTime6.plusHours(34);
        org.joda.time.DateTime dateTime28 = dateTime6.plusYears(11810407);
        org.joda.time.Instant instant29 = dateTime28.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.millisOfDay();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        java.util.TimeZone timeZone14 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(72000000L, dateTimeZone12);
        int int17 = dateTimeZone12.getStandardOffset((long) 'u');
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.chrono.ZonedChronology zonedChronology19 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology19.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology19.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology19.year();
        org.joda.time.DurationField durationField23 = zonedChronology19.weeks();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology19.millisOfSecond();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = dateTime25.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime29 = dateTime27.minus(0L);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 100, dateTimeZone31);
        org.joda.time.DateTime dateTime33 = dateTime29.withZone(dateTimeZone31);
        org.joda.time.Chronology chronology34 = zonedChronology19.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology19.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime33", (dateTime27.compareTo(dateTime33) == 0) == dateTime27.equals(dateTime33));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.minuteOfDay();
        org.joda.time.Chronology chronology24 = zonedChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = zonedChronology21.add(readablePeriod26, (long) 37, 26161850);
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 100, dateTimeZone32);
        org.joda.time.LocalDate localDate35 = localDate33.plusDays(50);
        org.joda.time.DateTime dateTime36 = localDate35.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property37 = localDate35.yearOfEra();
        org.joda.time.LocalDate localDate38 = property37.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate40 = property37.addToCopy((int) (short) 1);
        org.joda.time.LocalDate localDate41 = property37.roundFloorCopy();
        org.joda.time.LocalDate localDate42 = property37.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 100, dateTimeZone45);
        org.joda.time.LocalDate.Property property47 = localDate46.weekyear();
        org.joda.time.LocalDate localDate49 = localDate46.plusDays(51);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDate localDate51 = localDate46.minus(readablePeriod50);
        org.joda.time.LocalDate.Property property52 = localDate46.yearOfEra();
        org.joda.time.LocalDate localDate54 = property52.setCopy(47);
        int int55 = localDate54.getCenturyOfEra();
        java.util.Locale locale58 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale59 = java.util.Locale.TAIWAN;
        java.lang.String str60 = locale58.getDisplayCountry(locale59);
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(locale59);
        java.lang.String str62 = localDate54.toString("32", locale59);
        org.joda.time.LocalDate localDate63 = property37.setCopy("11771566", locale59);
        int[] intArray65 = zonedChronology21.get((org.joda.time.ReadablePartial) localDate63, (long) 70);
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology21.centuryOfEra();
        org.joda.time.DurationField durationField67 = zonedChronology21.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField67, and durationField22", !(durationField22.compareTo(durationField67) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField67.compareTo(durationField22))));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DurationField durationField23 = zonedChronology21.millis();
        org.joda.time.DurationField durationField24 = zonedChronology21.millis();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        int int26 = dateTime25.getDayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime25.withYear(11751002);
        org.joda.time.Instant instant29 = dateTime25.toInstant();
        org.joda.time.DateTime.Property property30 = dateTime25.monthOfYear();
        boolean boolean31 = zonedChronology21.equals((java.lang.Object) dateTime25);
        org.joda.time.DateTime dateTime33 = dateTime25.minusSeconds(26414);
        java.util.GregorianCalendar gregorianCalendar34 = dateTime25.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant29", (dateTime16.compareTo(instant29) == 0) == dateTime16.equals(instant29));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DurationField durationField25 = zonedChronology21.months();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.clockhourOfHalfday();
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.Instant instant29 = instant27.withMillis((long) 11);
        org.joda.time.Instant instant30 = instant29.toInstant();
        org.joda.time.Chronology chronology31 = instant29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 100, dateTimeZone34);
        int int36 = dateTimeField32.getMaximumValue((org.joda.time.ReadablePartial) localDate35);
        int int37 = dateTimeField32.getMinimumValue();
        boolean boolean38 = zonedChronology21.equals((java.lang.Object) int37);
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology21.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone40 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology21.year();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology21.dayOfYear();
        org.joda.time.DurationField durationField43 = zonedChronology21.weekyears();
        org.joda.time.DurationField durationField44 = zonedChronology21.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant27", (dateTime16.compareTo(instant27) == 0) == dateTime16.equals(instant27));
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime0.withHourOfDay(10);
        java.util.GregorianCalendar gregorianCalendar5 = dateTime0.toGregorianCalendar();
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.Instant instant9 = instant7.withMillis((long) 11);
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 11760560, chronology11);
        org.joda.time.DateTime dateTime14 = dateTime0.withChronology(chronology11);
        org.joda.time.DateTime dateTime16 = dateTime14.withYear(12053552);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant7", (dateTime0.compareTo(instant7) == 0) == dateTime0.equals(instant7));
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime4 = dateTime0.withCenturyOfEra(50);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.minus((long) 2);
        int int8 = dateTime4.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.DateTime dateTime10 = dateTime4.minusWeeks(26194721);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime10.getZone();
        int int14 = dateTimeZone12.getOffset((long) 26346697);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant5", (dateTime0.compareTo(instant5) == 0) == dateTime0.equals(instant5));
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int2 = dateTime0.get(dateTimeFieldType1);
        java.util.Calendar.Builder builder3 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder7 = builder3.setWeekDate((int) (short) 0, (int) '4', (int) '4');
        java.util.Calendar.Builder builder9 = builder7.setLenient(false);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        java.util.TimeZone timeZone16 = dateTimeZone14.toTimeZone();
        boolean boolean17 = timeZone11.hasSameRules(timeZone16);
        java.util.Calendar.Builder builder18 = builder7.setTimeZone(timeZone16);
        boolean boolean19 = dateTime0.equals((java.lang.Object) builder18);
        int int20 = dateTime0.getDayOfMonth();
        org.joda.time.Instant instant21 = dateTime0.toInstant();
        org.joda.time.DateTime dateTime23 = dateTime0.plusHours(11861348);
        int int24 = dateTime0.getSecondOfDay();
        org.joda.time.DateTime dateTime26 = dateTime0.withMillisOfDay(2283);
        org.joda.time.format.DateTimePrinter dateTimePrinter27 = null;
        org.joda.time.format.DateTimeParser dateTimeParser28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter27, dateTimeParser28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter29.withPivotYear((java.lang.Integer) (-26151846));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter29.withZoneUTC();
        boolean boolean33 = dateTimeFormatter29.isPrinter();
        boolean boolean34 = dateTimeFormatter29.isParser();
        int int35 = dateTimeFormatter29.getDefaultYear();
        org.joda.time.Instant instant37 = new org.joda.time.Instant();
        org.joda.time.Instant instant39 = instant37.withMillis((long) 11);
        org.joda.time.Instant instant40 = instant39.toInstant();
        org.joda.time.Chronology chronology41 = instant39.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.seconds();
        org.joda.time.LocalTime localTime43 = org.joda.time.LocalTime.fromMillisOfDay((long) 26160535, chronology41);
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter29.withChronology(chronology41);
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime26.toMutableDateTime(chronology41);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime49 = dateTime47.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int51 = dateTime49.get(dateTimeFieldType50);
        org.joda.time.DateTime dateTime53 = dateTime49.minusMillis((int) '#');
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime();
        int int56 = dateTimeZone54.getOffset((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(dateTimeZone54);
        boolean boolean58 = dateTime53.isEqual((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime dateTime60 = dateTime57.minusMinutes(11814974);
        org.joda.time.DateTime dateTime61 = dateTime57.toDateTimeISO();
        org.joda.time.DateTime.Property property62 = dateTime57.millisOfDay();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime65 = dateTime63.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int67 = dateTime65.get(dateTimeFieldType66);
        org.joda.time.DateTime dateTime69 = dateTime65.minusMillis((int) '#');
        org.joda.time.DateTime dateTime71 = dateTime69.plusDays(11);
        org.joda.time.DateTime dateTime74 = dateTime69.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime76 = dateTime74.withMinuteOfHour(20);
        org.joda.time.DateTimeZone dateTimeZone77 = dateTime76.getZone();
        org.joda.time.DateTime dateTime78 = dateTime57.withZone(dateTimeZone77);
        org.joda.time.DateTime dateTime80 = dateTime57.withYearOfEra(11809176);
        org.joda.time.DateTime dateTime82 = dateTime57.withEra(0);
        org.joda.time.DateTime dateTime84 = dateTime82.minus((long) 26370176);
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = org.joda.time.DateTimeFieldType.era();
        boolean boolean86 = dateTime82.isSupported(dateTimeFieldType85);
        int int87 = mutableDateTime46.get(dateTimeFieldType85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant21", (dateTime0.compareTo(instant21) == 0) == dateTime0.equals(instant21));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DurationField durationField23 = zonedChronology21.millis();
        org.joda.time.DurationField durationField24 = zonedChronology21.millis();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        int int26 = dateTime25.getDayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime25.withYear(11751002);
        org.joda.time.Instant instant29 = dateTime25.toInstant();
        org.joda.time.DateTime.Property property30 = dateTime25.monthOfYear();
        boolean boolean31 = zonedChronology21.equals((java.lang.Object) dateTime25);
        int int32 = dateTime25.getMillisOfSecond();
        org.joda.time.DateTime dateTime34 = dateTime25.minusHours(11769266);
        boolean boolean35 = dateTime34.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant29", (dateTime16.compareTo(instant29) == 0) == dateTime16.equals(instant29));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        int int2 = dateTime0.getWeekyear();
        int int3 = dateTime0.getWeekyear();
        org.joda.time.DateTime dateTime5 = dateTime0.withWeekyear(11846850);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((java.lang.Integer) (-26151846));
        int int11 = dateTimeFormatter10.getDefaultYear();
        int int12 = dateTimeFormatter10.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 100, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.plusDays(50);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 100, dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.plusDays(50);
        int int25 = localDate22.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate27 = localDate22.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        int int30 = dateTimeZone28.getOffset((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateMidnight dateMidnight31 = localDate22.toDateMidnight(dateTimeZone28);
        long long33 = dateTimeZone28.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology34 = org.joda.time.chrono.ZonedChronology.getInstance(chronology18, dateTimeZone28);
        org.joda.time.DurationField durationField35 = zonedChronology34.weeks();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology34.year();
        org.joda.time.DateTimeZone dateTimeZone37 = zonedChronology34.getZone();
        org.joda.time.DurationField durationField38 = zonedChronology34.weekyears();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology34.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology34.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter10.withChronology((org.joda.time.Chronology) zonedChronology34);
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime0.toMutableDateTime((org.joda.time.Chronology) zonedChronology34);
        org.joda.time.DurationField durationField43 = zonedChronology34.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and mutableDateTime42", (dateTime0.compareTo(mutableDateTime42) == 0) == dateTime0.equals(mutableDateTime42));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime dateTime6 = dateTime0.plusYears(26160835);
        boolean boolean8 = dateTime6.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.plusDays(50);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.centuries();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime6.toMutableDateTime(chronology14);
        java.util.GregorianCalendar gregorianCalendar18 = mutableDateTime17.toGregorianCalendar();
        gregorianCalendar18.clear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(10);
        java.util.GregorianCalendar gregorianCalendar6 = dateTime1.toGregorianCalendar();
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Instant instant10 = instant8.withMillis((long) 11);
        org.joda.time.Instant instant11 = instant10.toInstant();
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 11760560, chronology12);
        org.joda.time.DateTime dateTime15 = dateTime1.withChronology(chronology12);
        boolean boolean16 = dateTimeFieldType0.isSupported(chronology12);
        org.joda.time.DateTimeField dateTimeField17 = chronology12.minuteOfDay();
        int int18 = dateTimeField17.getMinimumValue();
        int int19 = dateTimeField17.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant8", (dateTime1.compareTo(instant8) == 0) == dateTime1.equals(instant8));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) 11757696, (int) ' ');
        int int12 = dateTime6.getWeekOfWeekyear();
        int int13 = dateTime6.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        java.util.TimeZone timeZone19 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(72000000L, dateTimeZone17);
        int int22 = dateTimeZone17.getStandardOffset((long) 'u');
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.DateTime dateTime24 = dateTime6.withZone(dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.minus(readablePeriod25);
        org.joda.time.DateTime dateTime27 = dateTime24.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime27", (dateTime6.compareTo(dateTime27) == 0) == dateTime6.equals(dateTime27));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfDay();
        org.joda.time.Chronology chronology6 = chronology4.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds(10);
        org.joda.time.LocalTime.Property property13 = localTime10.hourOfDay();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime localTime16 = localTime14.minusMillis(11789162);
        int int17 = dateTimeField7.getMinimumValue((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime localTime19 = localTime14.plusMillis(11959388);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = localTime26.getFieldType((int) (byte) 1);
        int int29 = localTime24.get(dateTimeFieldType28);
        org.joda.time.LocalTime.Property property30 = localTime22.property(dateTimeFieldType28);
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime34 = dateTime32.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int36 = dateTime34.get(dateTimeFieldType35);
        org.joda.time.DurationFieldType durationFieldType37 = dateTimeFieldType35.getRangeDurationType();
        org.joda.time.LocalTime.Property property38 = localTime31.property(dateTimeFieldType35);
        org.joda.time.DurationFieldType durationFieldType39 = dateTimeFieldType35.getDurationType();
        boolean boolean40 = localTime14.isSupported(dateTimeFieldType35);
        java.lang.String str42 = localTime14.toString("49");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime32", (instant0.compareTo(dateTime32) == 0) == instant0.equals(dateTime32));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusDays(5);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(50);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 100, dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.plusDays(50);
        int int20 = localDate17.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate22 = localDate17.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        int int25 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateMidnight dateMidnight26 = localDate17.toDateMidnight(dateTimeZone23);
        long long28 = dateTimeZone23.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology29 = org.joda.time.chrono.ZonedChronology.getInstance(chronology13, dateTimeZone23);
        org.joda.time.DurationField durationField30 = zonedChronology29.weeks();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology29.weekyear();
        org.joda.time.DurationField durationField32 = zonedChronology29.weekyears();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology29.year();
        org.joda.time.DateTimeZone dateTimeZone34 = zonedChronology29.getZone();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology29.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology29.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = zonedChronology29.getZone();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology29.monthOfYear();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology29.minuteOfDay();
        org.joda.time.Chronology chronology40 = zonedChronology29.withUTC();
        org.joda.time.DateTime dateTime41 = dateTime6.toDateTime(chronology40);
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime41.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant7", (dateTime6.compareTo(instant7) == 0) == dateTime6.equals(instant7));
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.weekyear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = zonedChronology21.add(readablePeriod26, (long) 11783576, 26163273);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        long long33 = zonedChronology21.add(readablePeriod30, 30902150430976312L, 0);
        org.joda.time.DurationField durationField34 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology21.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField34", Math.signum(durationField22.compareTo(durationField34)) == -Math.signum(durationField34.compareTo(durationField22)));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int3 = calendar1.getMinimum(1);
        calendar1.setFirstDayOfWeek(0);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("");
        timeZone7.setRawOffset((int) (short) 0);
        java.util.TimeZone.setDefault(timeZone7);
        calendar1.setTimeZone(timeZone7);
        java.util.Locale locale14 = new java.util.Locale("\u4e2d\u56fd\u8a9e", "10.04.1970 00:00:00");
        java.lang.String str15 = locale14.getCountry();
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone7, locale14);
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.fromCalendarFields(calendar16);
        org.joda.time.LocalDate localDate19 = localDate17.plusDays(11951603);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar16", (calendar1.compareTo(calendar16) == 0) == calendar1.equals(calendar16));
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.minuteOfHour();
        org.joda.time.DurationField durationField27 = zonedChronology21.hours();
        org.joda.time.DurationFieldType durationFieldType28 = durationField27.getType();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 100, dateTimeZone30);
        org.joda.time.LocalDate localDate33 = localDate31.plusDays(50);
        org.joda.time.Chronology chronology34 = localDate33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 100, dateTimeZone37);
        org.joda.time.LocalDate localDate40 = localDate38.plusDays(50);
        int int41 = localDate38.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate43 = localDate38.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime();
        int int46 = dateTimeZone44.getOffset((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateMidnight dateMidnight47 = localDate38.toDateMidnight(dateTimeZone44);
        long long49 = dateTimeZone44.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology50 = org.joda.time.chrono.ZonedChronology.getInstance(chronology34, dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology50.yearOfCentury();
        org.joda.time.DurationField durationField52 = zonedChronology50.millis();
        org.joda.time.DurationField durationField53 = zonedChronology50.seconds();
        org.joda.time.DateTimeField dateTimeField54 = zonedChronology50.millisOfDay();
        org.joda.time.DateTimeField dateTimeField55 = zonedChronology50.weekyear();
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now((org.joda.time.Chronology) zonedChronology50);
        org.joda.time.DurationField durationField57 = zonedChronology50.weekyears();
        int int58 = durationField27.compareTo(durationField57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime56", (dateTime16.compareTo(dateTime56) == 0) == dateTime16.equals(dateTime56));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.minuteOfDay();
        org.joda.time.Chronology chronology24 = zonedChronology21.withUTC();
        org.joda.time.DurationField durationField25 = chronology24.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField25, and durationField22", !(durationField22.compareTo(durationField25) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField25.compareTo(durationField22))));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-26151846));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear(54617010);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay11 = dateTime10.toTimeOfDay();
        org.joda.time.DateTime.Property property12 = dateTime10.yearOfEra();
        org.joda.time.DateTime dateTime14 = property12.setCopy(26156834);
        org.joda.time.DateTime dateTime16 = property12.addToCopy((long) 1970);
        org.joda.time.DateTime.Property property17 = dateTime16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        org.joda.time.DateTime dateTime20 = property17.addWrapFieldToCopy(18);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.lang.String str25 = dateTimeZone24.getID();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) 26150856, dateTimeZone24);
        java.lang.String str28 = dateTimeZone24.getShortName(2022L);
        org.joda.time.DateTime dateTime29 = dateTime20.withZone(dateTimeZone24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter7.withZone(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime29", (dateTime20.compareTo(dateTime29) == 0) == dateTime20.equals(dateTime29));
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology21.yearOfCentury();
        org.joda.time.DurationField durationField23 = zonedChronology21.millis();
        org.joda.time.DurationField durationField24 = zonedChronology21.seconds();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.weekyearOfCentury();
        org.joda.time.DurationField durationField27 = zonedChronology21.months();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.secondOfDay();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.minuteOfHour();
        org.joda.time.DurationField durationField30 = zonedChronology21.minutes();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.dayOfWeek();
        org.joda.time.DurationField durationField32 = zonedChronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField23, and durationField24", !(durationField32.compareTo(durationField23) == 0) || (Math.signum(durationField32.compareTo(durationField24)) == Math.signum(durationField23.compareTo(durationField24))));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 100, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.plusDays(50);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(50);
        int int13 = localDate10.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate15 = localDate10.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        int int18 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateMidnight dateMidnight19 = localDate10.toDateMidnight(dateTimeZone16);
        long long21 = dateTimeZone16.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology22 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone16);
        org.joda.time.DurationField durationField23 = zonedChronology22.weeks();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology22.weekyear();
        org.joda.time.DurationField durationField25 = zonedChronology22.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology22.minuteOfHour();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(11860797L, (org.joda.time.Chronology) zonedChronology22);
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology22.era();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology22.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology22.year();
        org.joda.time.tz.NameProvider nameProvider32 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider32);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 100, dateTimeZone35);
        org.joda.time.LocalDate localDate38 = localDate36.plusDays(50);
        org.joda.time.Chronology chronology39 = localDate38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.millisOfDay();
        java.util.Locale locale43 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale44 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet45 = locale44.getUnicodeLocaleAttributes();
        java.lang.String str46 = locale43.getDisplayLanguage(locale44);
        java.lang.String str47 = dateTimeField40.getAsShortText(26150856, locale44);
        java.lang.String str50 = nameProvider32.getName(locale44, "", "26150856");
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str54 = nameProvider32.getName(locale51, "hi!", "1970");
        java.lang.String str55 = dateTimeField30.getAsText((long) 725, locale51);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((long) 100, dateTimeZone58);
        org.joda.time.LocalDate localDate61 = localDate59.plusDays(50);
        org.joda.time.Chronology chronology62 = localDate61.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate((long) 100, dateTimeZone65);
        org.joda.time.LocalDate localDate68 = localDate66.plusDays(50);
        int int69 = localDate66.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate71 = localDate66.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime();
        int int74 = dateTimeZone72.getOffset((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateMidnight dateMidnight75 = localDate66.toDateMidnight(dateTimeZone72);
        long long77 = dateTimeZone72.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology78 = org.joda.time.chrono.ZonedChronology.getInstance(chronology62, dateTimeZone72);
        org.joda.time.DurationField durationField79 = zonedChronology78.weeks();
        org.joda.time.DateTimeField dateTimeField80 = zonedChronology78.year();
        org.joda.time.DateTimeZone dateTimeZone81 = zonedChronology78.getZone();
        org.joda.time.DateTimeField dateTimeField82 = zonedChronology78.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField83 = zonedChronology78.secondOfDay();
        org.joda.time.DurationField durationField84 = zonedChronology78.halfdays();
        org.joda.time.DateTimeField dateTimeField85 = zonedChronology78.centuryOfEra();
        org.joda.time.DurationField durationField86 = dateTimeField85.getLeapDurationField();
        java.util.Locale locale88 = java.util.Locale.GERMAN;
        java.util.Set<java.lang.String> strSet89 = locale88.getUnicodeLocaleKeys();
        java.lang.String str90 = dateTimeField85.getAsShortText(11871620, locale88);
        java.lang.String str91 = dateTimeField30.getAsShortText(26352671, locale88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField79", (durationField23.compareTo(durationField79) == 0) == durationField23.equals(durationField79));
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.minuteOfDay();
        org.joda.time.Chronology chronology24 = zonedChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.monthOfYear();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.clockhourOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology21.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField30, and durationField22", !(durationField22.compareTo(durationField30) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField30.compareTo(durationField22))));
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology21.millisOfDay();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 100, dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate28.plusDays(50);
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 100, dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.plusDays(50);
        int int38 = localDate35.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate40 = localDate35.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime();
        int int43 = dateTimeZone41.getOffset((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateMidnight dateMidnight44 = localDate35.toDateMidnight(dateTimeZone41);
        long long46 = dateTimeZone41.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology47 = org.joda.time.chrono.ZonedChronology.getInstance(chronology31, dateTimeZone41);
        org.joda.time.DurationField durationField48 = zonedChronology47.weeks();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology47.weekyear();
        org.joda.time.DurationField durationField50 = zonedChronology47.weekyears();
        long long54 = zonedChronology47.add(0L, 11776486L, 0);
        org.joda.time.DateTimeField dateTimeField55 = zonedChronology47.secondOfMinute();
        org.joda.time.DurationField durationField56 = zonedChronology47.millis();
        org.joda.time.LocalDate localDate57 = org.joda.time.LocalDate.now((org.joda.time.Chronology) zonedChronology47);
        org.joda.time.DateTimeZone dateTimeZone58 = zonedChronology47.getZone();
        org.joda.time.Chronology chronology59 = zonedChronology21.withZone(dateTimeZone58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField48", (durationField22.compareTo(durationField48) == 0) == durationField22.equals(durationField48));
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        long long28 = zonedChronology21.add(0L, 11776486L, 0);
        org.joda.time.DurationField durationField29 = zonedChronology21.halfdays();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.clockhourOfDay();
        org.joda.time.DurationField durationField31 = zonedChronology21.halfdays();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology21.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology21.yearOfEra();
        org.joda.time.DurationField durationField35 = zonedChronology21.years();
        org.joda.time.DurationField durationField36 = zonedChronology21.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField24 and durationField35", (durationField24.compareTo(durationField35) == 0) == durationField24.equals(durationField35));
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfHalfday();
        org.joda.time.Chronology chronology6 = chronology4.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = chronology4.getZone();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDate8.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(11764515);
        org.joda.time.DateTime dateTime12 = localDate8.toDateTimeAtMidnight(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.minus(readableDuration14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfEra(69265578);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime15", (instant0.compareTo(dateTime15) == 0) == instant0.equals(dateTime15));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone26 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.era();
        org.joda.time.DurationField durationField30 = zonedChronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField22, and durationField24", !(durationField30.compareTo(durationField22) == 0) || (Math.signum(durationField30.compareTo(durationField24)) == Math.signum(durationField22.compareTo(durationField24))));
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime4 = dateTime0.withCenturyOfEra(50);
        org.joda.time.DateTime dateTime5 = dateTime4.toDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.minus(readablePeriod6);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime12 = dateTime8.withCenturyOfEra(50);
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTime();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.minus(readablePeriod14);
        boolean boolean16 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime15);
        boolean boolean18 = dateTime15.equals((java.lang.Object) '4');
        org.joda.time.DateTime dateTime20 = dateTime15.plusMinutes(11762043);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int25 = dateTime23.get(dateTimeFieldType24);
        org.joda.time.DateTime dateTime27 = dateTime23.minusMillis((int) '#');
        org.joda.time.DateTime dateTime29 = dateTime27.plusDays(11);
        org.joda.time.DateTime dateTime32 = dateTime27.withDurationAdded((long) 11757696, (int) ' ');
        int int33 = dateTime27.getWeekOfWeekyear();
        int int34 = dateTime27.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone39 = dateTimeZone38.toTimeZone();
        java.util.TimeZone timeZone40 = dateTimeZone38.toTimeZone();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(72000000L, dateTimeZone38);
        int int43 = dateTimeZone38.getStandardOffset((long) 'u');
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate(dateTimeZone38);
        org.joda.time.DateTime dateTime45 = dateTime27.withZone(dateTimeZone38);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.minus(readablePeriod46);
        boolean boolean48 = dateTime20.isBefore((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime50 = dateTime20.withYear(12165473);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime45", (dateTime27.compareTo(dateTime45) == 0) == dateTime27.equals(dateTime45));
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 100, dateTimeZone26);
        org.joda.time.LocalDate localDate29 = localDate27.plusDays(50);
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        org.joda.time.LocalDate.Property property31 = localDate29.era();
        org.joda.time.DateTimeField dateTimeField32 = property31.getField();
        org.joda.time.LocalDate localDate33 = property31.getLocalDate();
        org.joda.time.LocalDate localDate35 = localDate33.withYear(26160535);
        org.joda.time.LocalDate localDate37 = localDate35.minusYears(11766550);
        int[] intArray39 = zonedChronology21.get((org.joda.time.ReadablePartial) localDate37, (long) 11764640);
        java.lang.String str40 = zonedChronology21.toString();
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology21.monthOfYear();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology21.millisOfDay();
        java.lang.String str43 = zonedChronology21.toString();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology21.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology21.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology21.millisOfSecond();
        org.joda.time.DurationField durationField47 = zonedChronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField22, and durationField24", !(durationField47.compareTo(durationField22) == 0) || (Math.signum(durationField47.compareTo(durationField24)) == Math.signum(durationField22.compareTo(durationField24))));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology21.yearOfCentury();
        org.joda.time.DurationField durationField23 = zonedChronology21.millis();
        org.joda.time.DurationField durationField24 = zonedChronology21.seconds();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 100, dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.plusDays(50);
        org.joda.time.Chronology chronology33 = localDate32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 100, dateTimeZone36);
        org.joda.time.LocalDate localDate39 = localDate37.plusDays(50);
        int int40 = localDate37.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate42 = localDate37.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        int int45 = dateTimeZone43.getOffset((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateMidnight dateMidnight46 = localDate37.toDateMidnight(dateTimeZone43);
        long long48 = dateTimeZone43.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology49 = org.joda.time.chrono.ZonedChronology.getInstance(chronology33, dateTimeZone43);
        org.joda.time.DurationField durationField50 = zonedChronology49.eras();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology49.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) 100, dateTimeZone53);
        org.joda.time.LocalDate localDate56 = localDate54.plusDays(50);
        int int57 = localDate54.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate59 = localDate54.plusMonths(6);
        int int60 = localDate54.getYearOfEra();
        int int61 = localDate54.getCenturyOfEra();
        int int62 = localDate54.getMonthOfYear();
        int int63 = localDate54.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate65 = localDate54.plusYears(11856325);
        org.joda.time.format.DateTimePrinter dateTimePrinter66 = null;
        org.joda.time.format.DateTimeParser dateTimeParser67 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter66, dateTimeParser67);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = dateTimeFormatter68.withPivotYear((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.Locale locale75 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet76 = locale75.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale75);
        java.lang.String str78 = locale75.toLanguageTag();
        java.lang.String str79 = dateTimeZone73.getName((long) (byte) 1, locale75);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter80 = dateTimeFormatter68.withZone(dateTimeZone73);
        org.joda.time.Interval interval81 = localDate65.toInterval(dateTimeZone73);
        int[] intArray83 = zonedChronology49.get((org.joda.time.ReadablePartial) localDate65, (long) 11928070);
        org.joda.time.DurationField durationField84 = zonedChronology49.eras();
        boolean boolean85 = zonedChronology21.equals((java.lang.Object) durationField84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField23 and durationField84", Math.signum(durationField23.compareTo(durationField84)) == -Math.signum(durationField84.compareTo(durationField23)));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) 11757696, (int) ' ');
        int int12 = dateTime6.getWeekOfWeekyear();
        int int13 = dateTime6.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        java.util.TimeZone timeZone19 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(72000000L, dateTimeZone17);
        int int22 = dateTimeZone17.getStandardOffset((long) 'u');
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.DateTime dateTime24 = dateTime6.withZone(dateTimeZone17);
        org.joda.time.DateTime.Property property25 = dateTime24.monthOfYear();
        org.joda.time.DateTime dateTime27 = property25.addWrapFieldToCopy(236);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime24", (dateTime6.compareTo(dateTime24) == 0) == dateTime6.equals(dateTime24));
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology21.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.minuteOfHour();
        org.joda.time.DurationField durationField26 = zonedChronology21.weeks();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 100, dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate29.plusDays(50);
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 100, dateTimeZone35);
        org.joda.time.LocalDate localDate38 = localDate36.plusDays(50);
        int int39 = localDate36.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate41 = localDate36.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        int int44 = dateTimeZone42.getOffset((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateMidnight dateMidnight45 = localDate36.toDateMidnight(dateTimeZone42);
        long long47 = dateTimeZone42.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology48 = org.joda.time.chrono.ZonedChronology.getInstance(chronology32, dateTimeZone42);
        org.joda.time.DurationField durationField49 = zonedChronology48.weeks();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology48.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology48.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone52 = zonedChronology48.getZone();
        org.joda.time.DurationField durationField53 = zonedChronology48.days();
        org.joda.time.DurationField durationField54 = zonedChronology48.millis();
        long long56 = durationField54.getMillis(11904918);
        long long59 = durationField54.getDifferenceAsLong((long) 54628572, (long) 12063338);
        int int60 = durationField26.compareTo(durationField54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField26 and durationField49", (durationField26.compareTo(durationField49) == 0) == durationField26.equals(durationField49));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime8 = dateTime6.withMillisOfDay(11781671);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekyear(11847733);
        org.joda.time.DateTime dateTime12 = dateTime10.withYear(43308);
        org.joda.time.DateTime dateTime14 = dateTime12.minus((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 100, dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.plusDays(50);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 100, dateTimeZone23);
        org.joda.time.LocalDate localDate26 = localDate24.plusDays(50);
        int int27 = localDate24.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate29 = localDate24.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        int int32 = dateTimeZone30.getOffset((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateMidnight dateMidnight33 = localDate24.toDateMidnight(dateTimeZone30);
        long long35 = dateTimeZone30.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology36 = org.joda.time.chrono.ZonedChronology.getInstance(chronology20, dateTimeZone30);
        org.joda.time.DurationField durationField37 = zonedChronology36.weeks();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology36.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology36.hourOfDay();
        org.joda.time.DurationField durationField40 = zonedChronology36.seconds();
        org.joda.time.DateTime dateTime41 = dateTime14.toDateTime((org.joda.time.Chronology) zonedChronology36);
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology36.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime41", (dateTime14.compareTo(dateTime41) == 0) == dateTime14.equals(dateTime41));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        long long28 = zonedChronology21.add(0L, 11776486L, 0);
        org.joda.time.DurationField durationField29 = zonedChronology21.years();
        org.joda.time.DurationField durationField30 = zonedChronology21.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField24 and durationField29", (durationField24.compareTo(durationField29) == 0) == durationField24.equals(durationField29));
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology21.millisOfDay();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.era();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.secondOfDay();
        org.joda.time.DurationField durationField27 = zonedChronology21.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.era();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((org.joda.time.Chronology) zonedChronology21);
        org.joda.time.DurationField durationField30 = zonedChronology21.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime29", (dateTime16.compareTo(dateTime29) == 0) == dateTime16.equals(dateTime29));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.LocalDate.Property property6 = localDate4.year();
        org.joda.time.LocalDate localDate7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate8 = property6.getLocalDate();
        org.joda.time.LocalDate localDate9 = property6.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 100, dateTimeZone11);
        org.joda.time.LocalDate.Property property13 = localDate12.weekyear();
        org.joda.time.LocalDate localDate15 = localDate12.plusDays(51);
        org.joda.time.DateTime dateTime16 = localDate15.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths(11803413);
        org.joda.time.DateTime dateTime20 = dateTime18.plus((long) 26212957);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 100, dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.plusDays(50);
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 100, dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.plusDays(50);
        int int33 = localDate30.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate35 = localDate30.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        int int38 = dateTimeZone36.getOffset((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateMidnight dateMidnight39 = localDate30.toDateMidnight(dateTimeZone36);
        long long41 = dateTimeZone36.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology42 = org.joda.time.chrono.ZonedChronology.getInstance(chronology26, dateTimeZone36);
        org.joda.time.DurationField durationField43 = zonedChronology42.weeks();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology42.year();
        org.joda.time.DateTimeZone dateTimeZone45 = zonedChronology42.getZone();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology42.halfdayOfDay();
        org.joda.time.DurationField durationField47 = zonedChronology42.hours();
        org.joda.time.DurationField durationField48 = zonedChronology42.months();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology42.monthOfYear();
        org.joda.time.DurationField durationField50 = zonedChronology42.seconds();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology42.millisOfDay();
        java.util.Locale locale52 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet53 = locale52.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor54 = strSet53.iterator();
        java.util.stream.Stream<java.lang.String> strStream55 = strSet53.parallelStream();
        java.util.Locale locale56 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet57 = locale56.getUnicodeLocaleAttributes();
        java.util.Iterator<java.lang.String> strItor58 = strSet57.iterator();
        boolean boolean59 = strSet53.removeAll((java.util.Collection<java.lang.String>) strSet57);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone63 = dateTimeZone62.toTimeZone();
        boolean boolean64 = strSet53.equals((java.lang.Object) dateTimeZone62);
        long long66 = dateTimeZone62.previousTransition(6059809176L);
        org.joda.time.Chronology chronology67 = zonedChronology42.withZone(dateTimeZone62);
        org.joda.time.DateTime dateTime68 = dateTime20.toDateTime(dateTimeZone62);
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate(dateTimeZone62);
        int int70 = property6.compareTo((org.joda.time.ReadablePartial) localDate69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime68", (dateTime20.compareTo(dateTime68) == 0) == dateTime20.equals(dateTime68));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology21.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone25 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.dayOfMonth();
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        java.lang.String str31 = locale30.getScript();
        java.util.Locale locale32 = java.util.Locale.ROOT;
        java.lang.String str33 = locale30.getDisplayName(locale32);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 100, dateTimeZone35);
        org.joda.time.LocalDate localDate38 = localDate36.plusDays(50);
        org.joda.time.Chronology chronology39 = localDate38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 100, dateTimeZone42);
        org.joda.time.LocalDate localDate45 = localDate43.plusDays(50);
        int int46 = localDate43.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate48 = localDate43.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        int int51 = dateTimeZone49.getOffset((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateMidnight dateMidnight52 = localDate43.toDateMidnight(dateTimeZone49);
        long long54 = dateTimeZone49.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology55 = org.joda.time.chrono.ZonedChronology.getInstance(chronology39, dateTimeZone49);
        org.joda.time.DurationField durationField56 = zonedChronology55.weeks();
        org.joda.time.DateTimeField dateTimeField57 = zonedChronology55.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        long long61 = zonedChronology55.add(readablePeriod58, (long) 2022, 0);
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology55.millisOfDay();
        java.util.Locale locale64 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar65 = java.util.Calendar.getInstance(locale64);
        java.lang.String str66 = dateTimeField62.getAsText(11802246, locale64);
        java.lang.String str67 = locale64.getVariant();
        java.lang.String str68 = locale32.getDisplayName(locale64);
        java.util.Set<java.lang.Character> charSet69 = locale64.getExtensionKeys();
        java.lang.String str70 = dateTimeField28.getAsText((long) 11967890, locale64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField56", (durationField22.compareTo(durationField56) == 0) == durationField22.equals(durationField56));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.plusYears(32770);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 100, dateTimeZone4);
        org.joda.time.LocalDate.Property property6 = localDate5.weekyear();
        org.joda.time.LocalDate localDate8 = property6.setCopy(2022);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis((long) 11);
        org.joda.time.Instant instant12 = instant11.toInstant();
        org.joda.time.Chronology chronology13 = instant11.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 100, dateTimeZone16);
        int int18 = dateTimeField14.getMaximumValue((org.joda.time.ReadablePartial) localDate17);
        int int20 = localDate17.getValue(2);
        org.joda.time.DateMidnight dateMidnight21 = localDate17.toDateMidnight();
        org.joda.time.LocalDate localDate23 = localDate17.plusMonths(26160535);
        int int24 = localDate23.getYear();
        boolean boolean25 = property6.equals((java.lang.Object) localDate23);
        org.joda.time.DateTime dateTime26 = localDate23.toDateTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime29 = dateTime26.withPeriodAdded(readablePeriod27, 11761333);
        org.joda.time.DateTime dateTime31 = dateTime26.minusHours(11735);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime34 = dateTime31.withDurationAdded(readableDuration32, 11814492);
        org.joda.time.DateTime dateTime36 = dateTime34.plusYears(11788202);
        org.joda.time.DateTime dateTime37 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 10);
        org.joda.time.DateTime dateTime41 = dateTime39.plusMinutes(49);
        org.joda.time.DateTime dateTime43 = dateTime41.plus(10L);
        org.joda.time.Chronology chronology44 = dateTime43.getChronology();
        org.joda.time.DateTime dateTime46 = dateTime43.minusMonths((int) 'a');
        org.joda.time.DateTime dateTime48 = dateTime46.plusSeconds(11781671);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) 100, dateTimeZone50);
        org.joda.time.LocalDate localDate53 = localDate51.plusDays(50);
        int int54 = localDate51.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate56 = localDate51.plusMonths(6);
        int int57 = localDate51.getYearOfEra();
        int int58 = localDate51.getCenturyOfEra();
        org.joda.time.LocalDate localDate60 = localDate51.withWeekOfWeekyear((int) '#');
        org.joda.time.DateTime dateTime61 = localDate60.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean63 = localDate60.isSupported(dateTimeFieldType62);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone68 = dateTimeZone67.toTimeZone();
        java.util.TimeZone timeZone69 = dateTimeZone67.toTimeZone();
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(72000000L, dateTimeZone67);
        int int72 = dateTimeZone67.getStandardOffset((long) 'u');
        java.lang.String str74 = dateTimeZone67.getName(1645142400000L);
        org.joda.time.DateTime dateTime75 = org.joda.time.DateTime.now(dateTimeZone67);
        org.joda.time.DateTime dateTime76 = localDate60.toDateTimeAtStartOfDay(dateTimeZone67);
        org.joda.time.LocalDate localDate77 = org.joda.time.LocalDate.now(dateTimeZone67);
        java.util.Locale locale82 = new java.util.Locale("22", "11763-01-01", "dayOfYear");
        java.lang.String str83 = dateTimeZone67.getShortName((long) 41, locale82);
        org.joda.time.MutableDateTime mutableDateTime84 = dateTime46.toMutableDateTime(dateTimeZone67);
        org.joda.time.DateTime dateTime85 = localDate0.toDateTimeAtStartOfDay(dateTimeZone67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime75", (instant9.compareTo(dateTime75) == 0) == instant9.equals(dateTime75));
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.dayOfMonth();
        org.joda.time.DurationField durationField26 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.year();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.secondOfDay();
        org.joda.time.DurationField durationField29 = zonedChronology21.millis();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.millisOfDay();
        org.joda.time.DurationField durationField32 = zonedChronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField22, and durationField29", !(durationField32.compareTo(durationField22) == 0) || (Math.signum(durationField32.compareTo(durationField29)) == Math.signum(durationField22.compareTo(durationField29))));
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.minuteOfHour();
        org.joda.time.DurationField durationField27 = zonedChronology21.hours();
        org.joda.time.DurationField durationField28 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial30 = null;
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("minuteOfHour");
        java.lang.String str34 = dateTimeField29.getAsText(readablePartial30, 11815565, locale33);
        java.util.Set<java.lang.String> strSet35 = locale33.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 100, dateTimeZone37);
        org.joda.time.LocalDate localDate40 = localDate38.plusDays(50);
        org.joda.time.Chronology chronology41 = localDate40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 100, dateTimeZone44);
        org.joda.time.LocalDate localDate47 = localDate45.plusDays(50);
        int int48 = localDate45.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate50 = localDate45.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime();
        int int53 = dateTimeZone51.getOffset((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateMidnight dateMidnight54 = localDate45.toDateMidnight(dateTimeZone51);
        long long56 = dateTimeZone51.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology57 = org.joda.time.chrono.ZonedChronology.getInstance(chronology41, dateTimeZone51);
        org.joda.time.DurationField durationField58 = zonedChronology57.weeks();
        java.lang.String str59 = zonedChronology57.toString();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology57.secondOfDay();
        org.joda.time.DateTimeField dateTimeField61 = zonedChronology57.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology57.hourOfDay();
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((org.joda.time.Chronology) zonedChronology57);
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology57.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField65 = zonedChronology57.clockhourOfHalfday();
        boolean boolean66 = strSet35.remove((java.lang.Object) zonedChronology57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField58", (durationField22.compareTo(durationField58) == 0) == durationField22.equals(durationField58));
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.weekyear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = zonedChronology21.add(readablePeriod26, (long) 11783576, 26163273);
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.yearOfEra();
        org.joda.time.DurationField durationField32 = zonedChronology21.millis();
        org.joda.time.DurationField durationField33 = zonedChronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField22, and durationField32", !(durationField33.compareTo(durationField22) == 0) || (Math.signum(durationField33.compareTo(durationField32)) == Math.signum(durationField22.compareTo(durationField32))));
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology21.yearOfCentury();
        org.joda.time.DurationField durationField23 = zonedChronology21.millis();
        org.joda.time.DurationField durationField24 = zonedChronology21.seconds();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.hourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.year();
        org.joda.time.DurationField durationField28 = zonedChronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField23, and durationField24", !(durationField28.compareTo(durationField23) == 0) || (Math.signum(durationField28.compareTo(durationField24)) == Math.signum(durationField23.compareTo(durationField24))));
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = zonedChronology21.add(readablePeriod24, (long) 2022, 0);
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.yearOfEra();
        org.joda.time.Chronology chronology30 = zonedChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.year();
        org.joda.time.DurationField durationField32 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology21.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField32", Math.signum(durationField22.compareTo(durationField32)) == -Math.signum(durationField32.compareTo(durationField22)));
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 100, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.plusDays(50);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 100, dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.plusDays(50);
        int int25 = localDate22.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate27 = localDate22.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        int int30 = dateTimeZone28.getOffset((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateMidnight dateMidnight31 = localDate22.toDateMidnight(dateTimeZone28);
        long long33 = dateTimeZone28.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology34 = org.joda.time.chrono.ZonedChronology.getInstance(chronology18, dateTimeZone28);
        org.joda.time.DurationField durationField35 = zonedChronology34.weeks();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology34.weekyear();
        org.joda.time.DurationField durationField37 = zonedChronology34.weekyears();
        long long41 = zonedChronology34.add(0L, 11776486L, 0);
        org.joda.time.DurationField durationField42 = zonedChronology34.halfdays();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology34.clockhourOfDay();
        java.lang.String str44 = zonedChronology34.toString();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology34.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology34.yearOfEra();
        org.joda.time.DateTimeField dateTimeField47 = zonedChronology34.year();
        org.joda.time.DateTime dateTime48 = dateTime12.toDateTime((org.joda.time.Chronology) zonedChronology34);
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology34.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime48", (dateTime11.compareTo(dateTime48) == 0) == dateTime11.equals(dateTime48));
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.centuries();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.centuries();
        long long16 = durationField13.getMillis((long) (byte) 1, (long) 11752861);
        int int17 = durationField6.compareTo(durationField13);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 100, dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate20.plusDays(50);
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 100, dateTimeZone26);
        org.joda.time.LocalDate localDate29 = localDate27.plusDays(50);
        int int30 = localDate27.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate32 = localDate27.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime();
        int int35 = dateTimeZone33.getOffset((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateMidnight dateMidnight36 = localDate27.toDateMidnight(dateTimeZone33);
        long long38 = dateTimeZone33.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology39 = org.joda.time.chrono.ZonedChronology.getInstance(chronology23, dateTimeZone33);
        org.joda.time.DurationField durationField40 = zonedChronology39.weeks();
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology39.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology39.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone43 = zonedChronology39.getZone();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology39.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField45 = zonedChronology39.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology39.secondOfDay();
        org.joda.time.DurationField durationField47 = zonedChronology39.eras();
        int int48 = durationField6.compareTo(durationField47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField47, durationField6, and durationField40", !(durationField47.compareTo(durationField6) == 0) || (Math.signum(durationField47.compareTo(durationField40)) == Math.signum(durationField6.compareTo(durationField40))));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.minuteOfDay();
        org.joda.time.Chronology chronology24 = zonedChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = zonedChronology21.add(readablePeriod26, (long) 37, 26161850);
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology21.monthOfYear();
        org.joda.time.DurationField durationField33 = zonedChronology21.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField33, and durationField22", !(durationField22.compareTo(durationField33) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField33.compareTo(durationField22))));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone4 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone5 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(72000000L, dateTimeZone3);
        int int8 = dateTimeZone3.getStandardOffset((long) 'u');
        java.lang.String str10 = dateTimeZone3.getName(1645142400000L);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.plus(readablePeriod12);
        boolean boolean15 = dateTime11.isAfter((long) 11766958);
        org.joda.time.DateTime dateTime17 = dateTime11.withYear(289);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime20 = dateTime11.withDurationAdded(readableDuration18, 54626981);
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.Instant instant23 = instant21.withMillis((long) 11);
        org.joda.time.Instant instant24 = instant23.toInstant();
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 100, dateTimeZone28);
        int int30 = dateTimeField26.getMaximumValue((org.joda.time.ReadablePartial) localDate29);
        int int32 = localDate29.getValue(2);
        org.joda.time.DateMidnight dateMidnight33 = localDate29.toDateMidnight();
        org.joda.time.LocalDate localDate35 = localDate29.plusMonths(26160535);
        org.joda.time.LocalDate.Property property36 = localDate29.yearOfEra();
        org.joda.time.LocalDate localDate37 = property36.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate38 = property36.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.monthOfYear();
        int int40 = localDate38.get(dateTimeFieldType39);
        java.lang.String str41 = dateTimeFieldType39.toString();
        org.joda.time.DurationFieldType durationFieldType42 = dateTimeFieldType39.getDurationType();
        boolean boolean43 = dateTime11.isSupported(dateTimeFieldType39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant21", (dateTime11.compareTo(instant21) == 0) == dateTime11.equals(instant21));
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (byte) 10);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Chronology chronology4 = dateTime2.getChronology();
        long long5 = dateTime2.getMillis();
        boolean boolean6 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.plusDays(50);
        int int19 = localDate16.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate21 = localDate16.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        int int24 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateMidnight dateMidnight25 = localDate16.toDateMidnight(dateTimeZone22);
        long long27 = dateTimeZone22.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology12, dateTimeZone22);
        org.joda.time.DurationField durationField29 = zonedChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.year();
        org.joda.time.DateTimeZone dateTimeZone31 = zonedChronology28.getZone();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology28.hourOfHalfday();
        org.joda.time.DurationField durationField34 = zonedChronology28.hours();
        org.joda.time.DateTime dateTime35 = dateTime2.withChronology((org.joda.time.Chronology) zonedChronology28);
        org.joda.time.DateTime.Property property36 = dateTime2.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime35", (instant3.compareTo(dateTime35) == 0) == instant3.equals(dateTime35));
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.seconds();
        int int8 = durationField5.getDifference((long) 11760637, (long) 8);
        long long11 = durationField5.subtract((long) 50, (long) 32772);
        java.lang.String str12 = durationField5.toString();
        long long14 = durationField5.getValueAsLong((long) 11781671);
        long long17 = durationField5.getDifferenceAsLong(2969L, (long) ' ');
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 100, dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate20.plusDays(50);
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 100, dateTimeZone26);
        org.joda.time.LocalDate localDate29 = localDate27.plusDays(50);
        int int30 = localDate27.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate32 = localDate27.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime();
        int int35 = dateTimeZone33.getOffset((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateMidnight dateMidnight36 = localDate27.toDateMidnight(dateTimeZone33);
        long long38 = dateTimeZone33.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology39 = org.joda.time.chrono.ZonedChronology.getInstance(chronology23, dateTimeZone33);
        org.joda.time.DurationField durationField40 = zonedChronology39.weeks();
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology39.year();
        org.joda.time.DateTimeZone dateTimeZone42 = zonedChronology39.getZone();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology39.dayOfMonth();
        org.joda.time.DurationField durationField44 = zonedChronology39.weeks();
        org.joda.time.DurationField durationField45 = zonedChronology39.eras();
        int int46 = durationField5.compareTo(durationField45);
        long long49 = durationField5.getMillis((long) 12324579, (long) 69262259);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField40 and durationField45", Math.signum(durationField40.compareTo(durationField45)) == -Math.signum(durationField45.compareTo(durationField40)));
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        long long28 = zonedChronology21.add(0L, 11776486L, 0);
        org.joda.time.DurationField durationField29 = zonedChronology21.halfdays();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 100, dateTimeZone31);
        org.joda.time.LocalDate.Property property33 = localDate32.weekyear();
        org.joda.time.LocalDate localDate35 = localDate32.plusDays(51);
        int int36 = localDate35.getWeekyear();
        org.joda.time.LocalDate.Property property37 = localDate35.dayOfMonth();
        long long39 = zonedChronology21.set((org.joda.time.ReadablePartial) localDate35, (long) 22);
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology21.millisOfDay();
        org.joda.time.DurationField durationField41 = zonedChronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField41, durationField22, and durationField24", !(durationField41.compareTo(durationField22) == 0) || (Math.signum(durationField41.compareTo(durationField24)) == Math.signum(durationField22.compareTo(durationField24))));
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        boolean boolean4 = dateTime2.isBefore(13910400000L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localTime11.getFieldType((int) (byte) 1);
        int int14 = localTime9.get(dateTimeFieldType13);
        org.joda.time.LocalTime.Property property15 = localTime7.property(dateTimeFieldType13);
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        int int17 = localTime16.getSecondOfMinute();
        java.lang.String str18 = localTime16.toString();
        org.joda.time.DateTime dateTime19 = dateTime2.withFields((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.Instant instant23 = instant21.withMillis((long) 11);
        org.joda.time.Instant instant24 = instant23.toInstant();
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.minuteOfDay();
        org.joda.time.Chronology chronology27 = chronology25.withUTC();
        boolean boolean28 = durationFieldType20.isSupported(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.clockhourOfHalfday();
        org.joda.time.DurationField durationField30 = chronology27.seconds();
        org.joda.time.DurationFieldType durationFieldType31 = durationField30.getType();
        java.lang.String str32 = durationFieldType31.toString();
        org.joda.time.DateTime dateTime34 = dateTime19.withFieldAdded(durationFieldType31, 12052898);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime37 = dateTime34.withDurationAdded(readableDuration35, 11945083);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime39 = dateTime34.minus(readableDuration38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant21", (dateTime0.compareTo(instant21) == 0) == dateTime0.equals(instant21));
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.minuteOfHour();
        org.joda.time.DurationField durationField27 = zonedChronology21.hours();
        org.joda.time.DurationField durationField28 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.clockhourOfDay();
        org.joda.time.DurationField durationField30 = zonedChronology21.seconds();
        org.joda.time.DurationField durationField31 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology21.minuteOfDay();
        org.joda.time.Instant instant35 = new org.joda.time.Instant();
        org.joda.time.Instant instant37 = instant35.withMillis((long) 11);
        org.joda.time.Instant instant38 = instant37.toInstant();
        org.joda.time.Instant instant40 = instant38.plus((long) 11757325);
        org.joda.time.Instant instant41 = new org.joda.time.Instant();
        org.joda.time.Instant instant43 = instant41.minus((long) 2);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Instant instant45 = instant43.plus(readableDuration44);
        boolean boolean46 = instant38.isBefore((org.joda.time.ReadableInstant) instant43);
        org.joda.time.DateTime dateTime47 = instant38.toDateTimeISO();
        int int48 = dateTime47.getSecondOfMinute();
        long long49 = dateTime47.getMillis();
        java.util.Locale locale50 = java.util.Locale.FRENCH;
        java.util.Locale locale52 = new java.util.Locale("it");
        java.lang.String str53 = locale50.getDisplayName(locale52);
        java.util.Calendar calendar54 = dateTime47.toCalendar(locale52);
        java.lang.String str55 = dateTimeField33.getAsText(11958000, locale52);
        java.util.Set<java.lang.String> strSet56 = locale52.getUnicodeLocaleKeys();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant35", (dateTime16.compareTo(instant35) == 0) == dateTime16.equals(instant35));
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.minuteOfDay();
        org.joda.time.Chronology chronology24 = zonedChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = zonedChronology21.add(readablePeriod26, (long) 37, 26161850);
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.dayOfMonth();
        org.joda.time.DurationField durationField32 = zonedChronology21.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField32, and durationField22", !(durationField22.compareTo(durationField32) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField32.compareTo(durationField22))));
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DurationField durationField23 = zonedChronology21.millis();
        org.joda.time.DurationField durationField24 = zonedChronology21.millis();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        int int26 = dateTime25.getDayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime25.withYear(11751002);
        org.joda.time.Instant instant29 = dateTime25.toInstant();
        org.joda.time.DateTime.Property property30 = dateTime25.monthOfYear();
        boolean boolean31 = zonedChronology21.equals((java.lang.Object) dateTime25);
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology21.minuteOfDay();
        org.joda.time.DurationField durationField33 = zonedChronology21.hours();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 100, dateTimeZone35);
        org.joda.time.LocalDate.Property property37 = localDate36.weekyear();
        org.joda.time.LocalDate localDate39 = localDate36.plusDays(51);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDate localDate41 = localDate36.minus(readablePeriod40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.Interval interval43 = localDate41.toInterval(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 100, dateTimeZone45);
        org.joda.time.LocalDate localDate48 = localDate46.plusDays(50);
        int int49 = localDate46.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate51 = localDate46.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime();
        int int54 = dateTimeZone52.getOffset((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateMidnight dateMidnight55 = localDate46.toDateMidnight(dateTimeZone52);
        long long57 = dateTimeZone52.convertUTCToLocal(60000L);
        org.joda.time.LocalDate localDate58 = org.joda.time.LocalDate.now(dateTimeZone52);
        long long60 = dateTimeZone52.previousTransition((long) 11763042);
        org.joda.time.DateTime dateTime61 = localDate41.toDateTimeAtCurrentTime(dateTimeZone52);
        java.util.Locale locale63 = java.util.Locale.GERMAN;
        java.util.Locale locale64 = locale63.stripExtensions();
        java.lang.String str65 = dateTimeZone52.getName((long) 11878909, locale64);
        int int67 = dateTimeZone52.getOffset((long) 26192);
        org.joda.time.Chronology chronology68 = zonedChronology21.withZone(dateTimeZone52);
        org.joda.time.DateTimeField dateTimeField69 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone70 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField71 = zonedChronology21.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant29", (dateTime16.compareTo(instant29) == 0) == dateTime16.equals(instant29));
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime0.withZone(dateTimeZone3);
        org.joda.time.DateTime dateTime7 = dateTime0.withMillisOfSecond(11);
        org.joda.time.DateTime dateTime9 = dateTime7.minus((long) 11808074);
        boolean boolean11 = dateTime7.isAfter((-25245549812564L));
        int int12 = dateTime7.getDayOfYear();
        org.joda.time.DateTime dateTime14 = dateTime7.minusHours(11858182);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime5", (dateTime0.compareTo(dateTime5) == 0) == dateTime0.equals(dateTime5));
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime dateTime6 = dateTime0.withMillisOfDay(16);
        org.joda.time.DateTime dateTime8 = dateTime0.plusWeeks(11);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int13 = dateTime11.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime11.minusMillis((int) '#');
        org.joda.time.DateTime dateTime17 = dateTime11.withYearOfEra(17);
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays(292278993);
        org.joda.time.Instant instant20 = dateTime19.toInstant();
        boolean boolean21 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime19);
        java.util.GregorianCalendar gregorianCalendar22 = dateTime19.toGregorianCalendar();
        java.util.Date date26 = new java.util.Date(11757696, 94, 38);
        java.lang.String str27 = date26.toLocaleString();
        int int28 = date26.getMonth();
        gregorianCalendar22.setTime(date26);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime32 = dateTime30.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int34 = dateTime32.get(dateTimeFieldType33);
        org.joda.time.DateTime dateTime36 = dateTime32.minusMillis((int) '#');
        org.joda.time.DateTime dateTime38 = dateTime32.withYearOfEra(11760560);
        org.joda.time.DateTime dateTime40 = dateTime32.plusHours(11847553);
        org.joda.time.DateTime dateTime43 = dateTime40.withDurationAdded((long) 11844929, 0);
        boolean boolean44 = gregorianCalendar22.before((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime dateTime6 = dateTime0.plusYears(26160835);
        boolean boolean8 = dateTime6.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTime dateTime10 = dateTime6.minusMinutes(11775531);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekyear(26163273);
        org.joda.time.DateTime.Property property13 = dateTime10.yearOfCentury();
        org.joda.time.DateTime dateTime15 = property13.addWrapFieldToCopy(11810407);
        org.joda.time.DateTimeField dateTimeField16 = property13.getField();
        org.joda.time.DurationField durationField17 = property13.getRangeDurationField();
        org.joda.time.DateTime dateTime18 = property13.withMaximumValue();
        org.joda.time.DateTime dateTime20 = property13.addToCopy((long) 12134238);
        org.joda.time.DateTime dateTime21 = dateTime20.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.Chronology chronology5 = dateTime3.getChronology();
        org.joda.time.DateTime dateTime7 = dateTime3.plusDays(2);
        java.util.Date date8 = dateTime3.toDate();
        java.lang.String str10 = dateTime3.toString("15");
        java.util.GregorianCalendar gregorianCalendar11 = dateTime3.toGregorianCalendar();
        org.joda.time.DateTime.Property property12 = dateTime3.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime3.getZone();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime15 = dateTime3.minus(readablePeriod14);
        int int16 = property1.getDifference((org.joda.time.ReadableInstant) dateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant4", (dateTime15.compareTo(instant4) == 0) == dateTime15.equals(instant4));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 100, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.plusDays(50);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(50);
        int int13 = localDate10.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate15 = localDate10.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        int int18 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateMidnight dateMidnight19 = localDate10.toDateMidnight(dateTimeZone16);
        long long21 = dateTimeZone16.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology22 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone16);
        org.joda.time.DurationField durationField23 = zonedChronology22.weeks();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology22.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology22.era();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 2000, (org.joda.time.Chronology) zonedChronology22);
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology22.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology22.secondOfDay();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology22.era();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology22.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 100, dateTimeZone32);
        org.joda.time.LocalDate localDate35 = localDate33.plusDays(50);
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 100, dateTimeZone39);
        org.joda.time.LocalDate localDate42 = localDate40.plusDays(50);
        int int43 = localDate40.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate45 = localDate40.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        int int48 = dateTimeZone46.getOffset((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateMidnight dateMidnight49 = localDate40.toDateMidnight(dateTimeZone46);
        long long51 = dateTimeZone46.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology52 = org.joda.time.chrono.ZonedChronology.getInstance(chronology36, dateTimeZone46);
        org.joda.time.DurationField durationField53 = zonedChronology52.weeks();
        org.joda.time.DateTimeField dateTimeField54 = zonedChronology52.weekyear();
        org.joda.time.DurationField durationField55 = zonedChronology52.weekyears();
        long long59 = zonedChronology52.add(0L, 11776486L, 0);
        org.joda.time.DurationField durationField60 = zonedChronology52.halfdays();
        org.joda.time.DateTimeField dateTimeField61 = zonedChronology52.clockhourOfDay();
        org.joda.time.DurationField durationField62 = zonedChronology52.halfdays();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone69 = dateTimeZone68.toTimeZone();
        java.util.TimeZone timeZone70 = dateTimeZone68.toTimeZone();
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime(72000000L, dateTimeZone68);
        int int73 = dateTimeZone68.getStandardOffset((long) 'u');
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate((long) 49, dateTimeZone68);
        int int76 = dateTimeZone68.getOffset((long) 11775074);
        org.joda.time.LocalDate localDate77 = new org.joda.time.LocalDate((long) 39, dateTimeZone68);
        java.lang.String str79 = dateTimeZone68.getName((long) 26212957);
        org.joda.time.Chronology chronology80 = zonedChronology52.withZone(dateTimeZone68);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone68);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone68);
        org.joda.time.chrono.ZonedChronology zonedChronology83 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) zonedChronology22, dateTimeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField53", (durationField23.compareTo(durationField53) == 0) == durationField23.equals(durationField53));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology21.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.hourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.dayOfMonth();
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant28.withMillis((long) 11);
        org.joda.time.Instant instant31 = instant30.toInstant();
        org.joda.time.Chronology chronology32 = instant30.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 100, dateTimeZone35);
        int int37 = dateTimeField33.getMaximumValue((org.joda.time.ReadablePartial) localDate36);
        int int39 = localDate36.getValue(2);
        org.joda.time.DateMidnight dateMidnight40 = localDate36.toDateMidnight();
        org.joda.time.LocalDate localDate42 = localDate36.plusMonths(26160535);
        org.joda.time.LocalDate.Property property43 = localDate36.yearOfEra();
        org.joda.time.LocalDate.Property property44 = localDate36.weekOfWeekyear();
        boolean boolean45 = zonedChronology21.equals((java.lang.Object) localDate36);
        org.joda.time.DurationField durationField46 = zonedChronology21.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant28", (dateTime16.compareTo(instant28) == 0) == dateTime16.equals(instant28));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        int int8 = dateTime2.getYearOfEra();
        org.joda.time.Instant instant9 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant9.withDurationAdded(readableDuration11, 11768869);
        org.joda.time.Instant instant15 = instant13.plus((long) 11859299);
        org.joda.time.Instant instant17 = instant15.withMillis((long) 11883681);
        org.joda.time.Chronology chronology18 = instant15.getChronology();
        java.lang.String str19 = instant15.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant9", (dateTime2.compareTo(instant9) == 0) == dateTime2.equals(instant9));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        int int4 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((java.lang.Object) instant1, dateTimeZone2);
        long long7 = dateTimeZone2.nextTransition((long) 11860797);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        int int10 = dateTimeZone2.getOffset(139471960885078L);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withField(dateTimeFieldType13, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withMillisOfSecond((int) '4');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plusWeeks(26160458);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime24 = dateTime22.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int26 = dateTime24.get(dateTimeFieldType25);
        org.joda.time.DateTime dateTime28 = dateTime24.minusMillis((int) '#');
        org.joda.time.DateTime dateTime29 = localDateTime17.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 10);
        org.joda.time.DateTime dateTime33 = dateTime31.plusMinutes(49);
        org.joda.time.DateTime dateTime34 = localDateTime17.toDateTime((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime35 = dateTime31.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime31.getZone();
        long long38 = dateTimeZone2.getMillisKeepLocal(dateTimeZone36, (long) 12228690);
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant1", (dateTime0.compareTo(instant1) == 0) == dateTime0.equals(instant1));
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 100, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.plusDays(50);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(50);
        int int13 = localDate10.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate15 = localDate10.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        int int18 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateMidnight dateMidnight19 = localDate10.toDateMidnight(dateTimeZone16);
        long long21 = dateTimeZone16.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology22 = org.joda.time.chrono.ZonedChronology.getInstance(chronology6, dateTimeZone16);
        org.joda.time.DurationField durationField23 = zonedChronology22.eras();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology22.minuteOfDay();
        org.joda.time.Chronology chronology25 = zonedChronology22.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology22.monthOfYear();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology22.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = zonedChronology22.add(readablePeriod28, (long) 26199721, 196);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime35 = dateTime33.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime37 = dateTime35.minus(0L);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 100, dateTimeZone39);
        org.joda.time.DateTime dateTime41 = dateTime37.withZone(dateTimeZone39);
        long long44 = dateTimeZone39.convertLocalToUTC((long) 34, false);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(917L, dateTimeZone39);
        org.joda.time.Chronology chronology46 = zonedChronology22.withZone(dateTimeZone39);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) 24044562, dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and dateTime41", (dateTime35.compareTo(dateTime41) == 0) == dateTime35.equals(dateTime41));
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay3 = dateTime2.toTimeOfDay();
        org.joda.time.DateTime.Property property4 = dateTime2.yearOfEra();
        org.joda.time.DateTime dateTime6 = property4.setCopy(26156834);
        org.joda.time.DateTime dateTime8 = property4.addToCopy((long) 1970);
        org.joda.time.DateTimeField dateTimeField9 = property4.getField();
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis((long) 11);
        org.joda.time.Instant instant14 = instant13.toInstant();
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.minuteOfDay();
        org.joda.time.Chronology chronology17 = chronology15.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.era();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        java.lang.String str21 = dateTimeField19.getAsText((long) 26287316);
        int int23 = dateTimeField19.getMaximumValue((long) 36524);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.Locale locale29 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale29);
        java.lang.String str32 = locale29.toLanguageTag();
        java.lang.String str33 = dateTimeZone27.getName((long) (byte) 1, locale29);
        java.lang.String str34 = dateTimeField19.getAsShortText((long) 15, locale29);
        org.joda.time.DateTime dateTime35 = property4.setCopy("11777", locale29);
        java.util.Locale locale36 = locale29.stripExtensions();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant11", (dateTime0.compareTo(instant11) == 0) == dateTime0.equals(instant11));
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.minuteOfDay();
        org.joda.time.Chronology chronology24 = zonedChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.monthOfYear();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.minuteOfDay();
        org.joda.time.Chronology chronology28 = zonedChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.monthOfYear();
        org.joda.time.DurationField durationField30 = zonedChronology21.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField30, and durationField22", !(durationField22.compareTo(durationField30) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField30.compareTo(durationField22))));
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = zonedChronology21.add(readablePeriod24, (long) 2022, 0);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        int int30 = dateTimeZone28.getStandardOffset((long) (byte) 1);
        java.util.TimeZone timeZone31 = dateTimeZone28.toTimeZone();
        org.joda.time.Chronology chronology32 = zonedChronology21.withZone(dateTimeZone28);
        org.joda.time.DurationField durationField33 = zonedChronology21.weeks();
        org.joda.time.DurationField durationField34 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology21.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField34", Math.signum(durationField22.compareTo(durationField34)) == -Math.signum(durationField34.compareTo(durationField22)));
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        long long27 = dateTimeZone24.convertUTCToLocal((long) 11752861);
        int int29 = dateTimeZone24.getOffsetFromLocal((long) 54857066);
        boolean boolean30 = dateTimeZone24.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime25", (dateTime16.compareTo(dateTime25) == 0) == dateTime16.equals(dateTime25));
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Chronology chronology2 = dateTime0.getChronology();
        org.joda.time.DateTime dateTime4 = dateTime0.plusDays(2);
        java.util.Date date5 = dateTime0.toDate();
        org.joda.time.DateTime.Property property6 = dateTime0.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime9 = dateTime0.withPeriodAdded(readablePeriod7, 11788139);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfEra();
        org.joda.time.DateTime dateTime12 = dateTime9.minusMonths(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant1", (dateTime12.compareTo(instant1) == 0) == dateTime12.equals(instant1));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Instant instant2 = dateTime1.toInstant();
        org.joda.time.Chronology chronology3 = dateTime1.getChronology();
        boolean boolean4 = dateTime0.isEqual((org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localTime11.getFieldType((int) (byte) 1);
        int int14 = localTime9.get(dateTimeFieldType13);
        org.joda.time.LocalTime.Property property15 = localTime7.property(dateTimeFieldType13);
        org.joda.time.LocalTime localTime16 = property15.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime17 = property15.getLocalTime();
        org.joda.time.LocalTime localTime18 = property15.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = property15.addWrapFieldToCopy(26159400);
        org.joda.time.DateTimeField dateTimeField21 = property15.getField();
        org.joda.time.LocalTime localTime22 = property15.roundCeilingCopy();
        org.joda.time.LocalTime localTime24 = localTime22.minusHours(11753441);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        int int27 = dateTimeZone25.getStandardOffset((long) (byte) 1);
        org.joda.time.DateTime dateTime28 = localTime24.toDateTimeToday(dateTimeZone25);
        org.joda.time.DateTime dateTime29 = dateTime0.withZone(dateTimeZone25);
        boolean boolean30 = dateTime29.isAfterNow();
        org.joda.time.DateTime dateTime31 = dateTime29.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant2", (dateTime0.compareTo(instant2) == 0) == dateTime0.equals(instant2));
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.millisOfDay();
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withCenturyOfEra(320);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime16 = dateTime12.withHourOfDay(10);
        java.util.GregorianCalendar gregorianCalendar17 = dateTime12.toGregorianCalendar();
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.Instant instant21 = instant19.withMillis((long) 11);
        org.joda.time.Instant instant22 = instant21.toInstant();
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 11760560, chronology23);
        org.joda.time.DateTime dateTime26 = dateTime12.withChronology(chronology23);
        boolean boolean27 = dateTimeFieldType11.isSupported(chronology23);
        boolean boolean28 = localDateTime8.isSupported(dateTimeFieldType11);
        org.joda.time.LocalDateTime.Property property29 = localDateTime8.monthOfYear();
        org.joda.time.LocalDateTime.Property property30 = localDateTime8.weekyear();
        org.joda.time.LocalDateTime localDateTime32 = property30.addToCopy(54602);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.withField(dateTimeFieldType35, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.minusYears(5);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusHours((int) '4');
        org.joda.time.LocalDateTime.Property property42 = localDateTime39.weekyear();
        java.lang.String str43 = property42.getAsString();
        org.joda.time.LocalDateTime localDateTime44 = property42.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.withMillisOfSecond((int) '#');
        org.joda.time.LocalDateTime.Property property47 = localDateTime44.era();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.withField(dateTimeFieldType50, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime48.minusYears(5);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.withMillisOfDay(8);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime59.withField(dateTimeFieldType61, (int) (short) 10);
        boolean boolean64 = localDateTime55.isSupported(dateTimeFieldType61);
        boolean boolean65 = localDateTime54.isSupported(dateTimeFieldType61);
        boolean boolean66 = localDateTime44.isSupported(dateTimeFieldType61);
        boolean boolean67 = localDateTime32.isSupported(dateTimeFieldType61);
        org.joda.time.Chronology chronology68 = null;
        boolean boolean69 = dateTimeFieldType61.isSupported(chronology68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant19", (dateTime12.compareTo(instant19) == 0) == dateTime12.equals(instant19));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.LocalDate localDate5 = property3.setCopy(2022);
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.Instant instant8 = instant6.withMillis((long) 11);
        org.joda.time.Instant instant9 = instant8.toInstant();
        org.joda.time.Chronology chronology10 = instant8.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 100, dateTimeZone13);
        int int15 = dateTimeField11.getMaximumValue((org.joda.time.ReadablePartial) localDate14);
        int int17 = localDate14.getValue(2);
        org.joda.time.DateMidnight dateMidnight18 = localDate14.toDateMidnight();
        org.joda.time.LocalDate localDate20 = localDate14.plusMonths(26160535);
        int int21 = localDate20.getYear();
        boolean boolean22 = property3.equals((java.lang.Object) localDate20);
        org.joda.time.LocalDate localDate23 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate25 = property3.addWrapFieldToCopy(11959660);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime28 = dateTime26.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int30 = dateTime28.get(dateTimeFieldType29);
        org.joda.time.DateTime dateTime32 = dateTime28.minusMillis((int) '#');
        org.joda.time.DateTime dateTime34 = dateTime28.withYearOfEra(17);
        org.joda.time.DateTime dateTime36 = dateTime34.minusDays(292278993);
        org.joda.time.Instant instant38 = new org.joda.time.Instant();
        org.joda.time.Instant instant40 = instant38.withMillis((long) 11);
        org.joda.time.Instant instant41 = instant40.toInstant();
        org.joda.time.Chronology chronology42 = instant40.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.minuteOfHour();
        boolean boolean44 = dateTimeField43.isSupported();
        java.util.Locale locale45 = java.util.Locale.TAIWAN;
        java.lang.String str46 = locale45.toLanguageTag();
        java.lang.String str47 = locale45.toLanguageTag();
        java.lang.String str48 = locale45.getDisplayScript();
        int int49 = dateTimeField43.getMaximumShortTextLength(locale45);
        java.lang.String str50 = dateTime34.toString("5", locale45);
        int int51 = property3.getMaximumTextLength(locale45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime26", (instant6.compareTo(dateTime26) == 0) == instant6.equals(dateTime26));
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime dateTime6 = dateTime0.withMillisOfDay(16);
        org.joda.time.DateTime dateTime8 = dateTime0.plusWeeks(11);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int13 = dateTime11.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime11.minusMillis((int) '#');
        org.joda.time.DateTime dateTime17 = dateTime11.withYearOfEra(17);
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays(292278993);
        org.joda.time.Instant instant20 = dateTime19.toInstant();
        boolean boolean21 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime19);
        java.util.Locale locale22 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(locale22);
        calendar23.clear();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.fromCalendarFields(calendar23);
        java.time.Instant instant26 = calendar23.toInstant();
        java.util.Locale locale27 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(locale27);
        calendar28.clear();
        calendar28.setTimeInMillis((long) (byte) 1);
        java.util.Date date32 = calendar28.getTime();
        date32.setSeconds(26161850);
        date32.setYear(19);
        calendar23.setTime(date32);
        int int39 = calendar23.getGreatestMinimum(0);
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.fromCalendarFields(calendar23);
        org.joda.time.DateTime dateTime41 = dateTime19.withFields((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.yearOfEra();
        int int43 = localDateTime40.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        int int2 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone0);
        java.lang.String str5 = dateTimeZone0.getName((long) 18);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.plusDays(50);
        int int19 = localDate16.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate21 = localDate16.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        int int24 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateMidnight dateMidnight25 = localDate16.toDateMidnight(dateTimeZone22);
        long long27 = dateTimeZone22.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance(chronology12, dateTimeZone22);
        org.joda.time.DurationField durationField29 = zonedChronology28.weeks();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology28.year();
        org.joda.time.DateTimeZone dateTimeZone31 = zonedChronology28.getZone();
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.now(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = localDate6.toDateTimeAtMidnight(dateTimeZone31);
        int int34 = dateTime33.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime3", (dateTime1.compareTo(dateTime3) == 0) == dateTime1.equals(dateTime3));
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(0);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalTime localTime5 = localTime3.plus(readablePeriod4);
        org.joda.time.LocalTime localTime7 = localTime3.minusSeconds(5);
        org.joda.time.LocalTime localTime9 = localTime3.plusMillis((int) (byte) 0);
        int int10 = localTime9.getMillisOfDay();
        org.joda.time.LocalTime.Property property11 = localTime9.minuteOfHour();
        org.joda.time.LocalTime localTime13 = property11.addWrapFieldToCopy((int) (short) 0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay17 = dateTime16.toTimeOfDay();
        org.joda.time.DateTime.Property property18 = dateTime16.yearOfEra();
        org.joda.time.DateTime dateTime20 = property18.setCopy(26156834);
        org.joda.time.DateTime dateTime22 = property18.addToCopy((long) 1970);
        org.joda.time.DateTime.Property property23 = dateTime22.hourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        org.joda.time.DateTime dateTime26 = property23.addWrapFieldToCopy(18);
        boolean boolean27 = dateTime26.isBeforeNow();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime32 = dateTime28.withCenturyOfEra(50);
        org.joda.time.Instant instant33 = new org.joda.time.Instant();
        org.joda.time.Instant instant35 = instant33.minus((long) 2);
        int int36 = dateTime32.compareTo((org.joda.time.ReadableInstant) instant33);
        org.joda.time.DateTime.Property property37 = dateTime32.centuryOfEra();
        org.joda.time.DateTime dateTime39 = dateTime32.plusDays(58);
        boolean boolean40 = dateTime26.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime26.getZone();
        org.joda.time.DateTime dateTime42 = localTime13.toDateTimeToday(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime13.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant33", (dateTime14.compareTo(instant33) == 0) == dateTime14.equals(instant33));
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime dateTime6 = dateTime0.plusYears(26160835);
        boolean boolean8 = dateTime6.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.plusDays(50);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.centuries();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime6.toMutableDateTime(chronology14);
        java.util.GregorianCalendar gregorianCalendar18 = mutableDateTime17.toGregorianCalendar();
        java.util.Calendar.Builder builder19 = new java.util.Calendar.Builder();
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        java.util.Calendar.Builder builder21 = builder19.setLocale(locale20);
        java.util.Calendar.Builder builder23 = builder19.setLenient(true);
        java.util.Calendar.Builder builder27 = builder23.setDate(11767256, 11775531, (int) (short) 10);
        org.joda.time.tz.NameProvider nameProvider28 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider28);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 100, dateTimeZone31);
        org.joda.time.LocalDate localDate34 = localDate32.plusDays(50);
        org.joda.time.Chronology chronology35 = localDate34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.millisOfDay();
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale40 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet41 = locale40.getUnicodeLocaleAttributes();
        java.lang.String str42 = locale39.getDisplayLanguage(locale40);
        java.lang.String str43 = dateTimeField36.getAsShortText(26150856, locale40);
        java.lang.String str46 = nameProvider28.getName(locale40, "", "26150856");
        org.joda.time.tz.NameProvider nameProvider47 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider47);
        java.util.Locale locale49 = java.util.Locale.JAPAN;
        java.lang.String str52 = nameProvider47.getName(locale49, "Thu Jan 01 00:00:00 UTC 1970", "it");
        java.util.Locale.Builder builder53 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder54 = builder53.clear();
        java.util.Locale.Builder builder55 = builder54.clearExtensions();
        java.util.Locale locale56 = builder54.build();
        java.lang.String str59 = nameProvider47.getName(locale56, "it", "1970");
        java.lang.String str60 = locale40.getDisplayScript(locale56);
        java.lang.String str61 = locale40.getISO3Country();
        java.util.Calendar.Builder builder62 = builder23.setLocale(locale40);
        java.util.Calendar.Builder builder67 = builder62.setTimeOfDay(11888920, 11870514, 11868878, 11878483);
        java.util.Calendar calendar68 = builder62.build();
        java.util.Calendar.Builder builder73 = builder62.setTimeOfDay(11839810, 11895593, 38252189, 12072117);
        boolean boolean74 = gregorianCalendar18.after((java.lang.Object) builder73);
        gregorianCalendar18.clear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant2.minus(readableDuration4);
        org.joda.time.Instant instant6 = instant2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTime();
        java.util.Date date8 = mutableDateTime7.toDate();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromDateFields(date8);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.withMillis((long) 11);
        org.joda.time.Instant instant13 = instant12.toInstant();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant15 = instant12.minus(readableDuration14);
        org.joda.time.Instant instant16 = instant12.toInstant();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant18 = instant12.plus(readableDuration17);
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.Instant instant21 = instant19.withMillis((long) 11);
        org.joda.time.Instant instant22 = instant21.toInstant();
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = instant21.toMutableDateTimeISO();
        boolean boolean25 = instant12.isAfter((org.joda.time.ReadableInstant) instant21);
        org.joda.time.MutableDateTime mutableDateTime26 = instant12.toMutableDateTime();
        java.lang.String str27 = mutableDateTime26.toString();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 100, dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.plusDays(50);
        int int33 = localDate30.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate35 = localDate30.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        int int38 = dateTimeZone36.getOffset((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateMidnight dateMidnight39 = localDate30.toDateMidnight(dateTimeZone36);
        long long41 = dateTimeZone36.convertUTCToLocal(60000L);
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.now(dateTimeZone36);
        long long44 = dateTimeZone36.previousTransition((long) 11763042);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime26.toMutableDateTime(dateTimeZone36);
        int int46 = mutableDateTime45.getWeekyear();
        org.joda.time.DateTime dateTime47 = localTime9.toDateTime((org.joda.time.ReadableInstant) mutableDateTime45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime37", (instant0.compareTo(dateTime37) == 0) == instant0.equals(dateTime37));
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(0);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalTime localTime5 = localTime3.plus(readablePeriod4);
        org.joda.time.LocalTime localTime7 = localTime3.plusMinutes(3);
        org.joda.time.LocalTime localTime9 = localTime7.minusSeconds(36);
        java.lang.String str10 = localTime7.toString();
        org.joda.time.LocalTime localTime12 = localTime7.minusMillis(11815600);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        int int14 = dateTime13.getDayOfYear();
        org.joda.time.DateTime dateTime16 = dateTime13.withYear(11751002);
        org.joda.time.DateTime dateTime18 = dateTime13.minusYears(100);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight22 = dateTime21.toDateMidnight();
        int int23 = dateMidnight22.getDayOfYear();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        int int25 = dateTime24.getDayOfYear();
        org.joda.time.DateTime dateTime27 = dateTime24.withYear(11751002);
        org.joda.time.Instant instant28 = dateTime24.toInstant();
        org.joda.time.DateTime dateTime30 = dateTime24.plusYears(26160835);
        boolean boolean32 = dateTime30.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime35 = dateTime33.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int37 = dateTime35.get(dateTimeFieldType36);
        org.joda.time.DateTime dateTime39 = dateTime35.minusMillis((int) '#');
        org.joda.time.DateTime dateTime41 = dateTime39.plusDays(11);
        org.joda.time.DateTime dateTime44 = dateTime39.withDurationAdded((long) 11757696, (int) ' ');
        int int45 = dateTime39.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime47 = dateTime39.minusWeeks(215400000);
        boolean boolean48 = dateTime30.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int50 = dateTime30.get(dateTimeFieldType49);
        boolean boolean51 = dateMidnight22.isSupported(dateTimeFieldType49);
        int int52 = dateTime13.get(dateTimeFieldType49);
        boolean boolean53 = localTime12.isSupported(dateTimeFieldType49);
        org.joda.time.DurationFieldType durationFieldType54 = dateTimeFieldType49.getRangeDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant28", (dateTime13.compareTo(instant28) == 0) == dateTime13.equals(instant28));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime.Property property5 = dateTime0.dayOfWeek();
        org.joda.time.DateTime dateTime7 = property5.addToCopy((long) 26163273);
        int int8 = dateTime7.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        int int8 = dateTime2.getYearOfEra();
        org.joda.time.Instant instant9 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant9.minus(readableDuration11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant9.minus(readableDuration13);
        org.joda.time.MutableDateTime mutableDateTime15 = instant9.toMutableDateTimeISO();
        org.joda.time.Instant instant16 = new org.joda.time.Instant();
        org.joda.time.Instant instant18 = instant16.minus((long) 2);
        org.joda.time.Instant instant20 = instant16.withMillis((long) 11);
        org.joda.time.Instant instant22 = instant16.minus((long) '#');
        org.joda.time.DateTime dateTime23 = instant22.toDateTime();
        boolean boolean25 = instant22.isBefore((long) 11912016);
        boolean boolean26 = instant9.isBefore((org.joda.time.ReadableInstant) instant22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant16", (dateTime0.compareTo(instant16) == 0) == dateTime0.equals(instant16));
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        long long28 = zonedChronology21.add(0L, 11776486L, 0);
        org.joda.time.DurationField durationField29 = zonedChronology21.halfdays();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.clockhourOfDay();
        java.lang.String str31 = zonedChronology21.toString();
        java.lang.String str32 = zonedChronology21.toString();
        org.joda.time.DurationField durationField33 = zonedChronology21.years();
        org.joda.time.DurationField durationField34 = zonedChronology21.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField24 and durationField33", (durationField24.compareTo(durationField33) == 0) == durationField24.equals(durationField33));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime3 = property1.addWrapFieldToCopy(11756302);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        int int7 = dateTime6.getDayOfYear();
        org.joda.time.DateTime dateTime9 = dateTime6.withYear(11751002);
        org.joda.time.Instant instant10 = dateTime6.toInstant();
        org.joda.time.DateTime dateTime12 = dateTime6.plusYears(26160835);
        boolean boolean14 = dateTime12.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int19 = dateTime17.get(dateTimeFieldType18);
        org.joda.time.DateTime dateTime21 = dateTime17.minusMillis((int) '#');
        org.joda.time.DateTime dateTime23 = dateTime21.plusDays(11);
        org.joda.time.DateTime dateTime26 = dateTime21.withDurationAdded((long) 11757696, (int) ' ');
        int int27 = dateTime21.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime29 = dateTime21.minusWeeks(215400000);
        boolean boolean30 = dateTime12.isAfter((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int32 = dateTime12.get(dateTimeFieldType31);
        boolean boolean33 = localDateTime5.isSupported(dateTimeFieldType31);
        int int34 = localDateTime5.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime5.plusMonths(12061800);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime39 = dateTime37.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int41 = dateTime39.get(dateTimeFieldType40);
        org.joda.time.DateTime dateTime43 = dateTime39.minusMillis((int) '#');
        org.joda.time.DateTime dateTime45 = dateTime43.plusDays(11);
        org.joda.time.DateTime dateTime48 = dateTime43.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime49 = dateTime48.toDateTime();
        org.joda.time.DateTime dateTime51 = dateTime49.minusHours(11771697);
        org.joda.time.DateTime dateTime53 = dateTime49.minusHours(11783576);
        org.joda.time.DateTime dateTime56 = dateTime53.withDurationAdded((long) 11787846, 47);
        org.joda.time.DateTime dateTime58 = dateTime53.minus((long) 26180236);
        int int59 = dateTime58.getSecondOfDay();
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.DateTime dateTime61 = dateTime58.minus(readablePeriod60);
        int int62 = dateTime58.getMillisOfDay();
        org.joda.time.DateTime dateTime63 = localDateTime36.toDateTime((org.joda.time.ReadableInstant) dateTime58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant10", (dateTime6.compareTo(instant10) == 0) == dateTime6.equals(instant10));
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime4 = dateTime0.withCenturyOfEra(50);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.minus((long) 2);
        int int8 = dateTime4.compareTo((org.joda.time.ReadableInstant) instant5);
        org.joda.time.DateTime.Property property9 = dateTime4.centuryOfEra();
        org.joda.time.DateTime dateTime11 = dateTime4.plusDays(58);
        org.joda.time.DateTime dateTime12 = dateTime4.withLaterOffsetAtOverlap();
        int int13 = dateTime12.getWeekOfWeekyear();
        boolean boolean14 = dateTime12.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant5", (dateTime0.compareTo(instant5) == 0) == dateTime0.equals(instant5));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds(10);
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime7 = property5.addCopy((long) 59);
        org.joda.time.LocalTime localTime8 = property5.roundCeilingCopy();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.Chronology chronology12 = dateTime10.getChronology();
        boolean boolean13 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = localTime20.getFieldType((int) (byte) 1);
        int int23 = localTime18.get(dateTimeFieldType22);
        org.joda.time.LocalTime.Property property24 = localTime16.property(dateTimeFieldType22);
        org.joda.time.LocalTime localTime25 = property24.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime26 = property24.getLocalTime();
        org.joda.time.LocalTime localTime27 = property24.roundFloorCopy();
        org.joda.time.LocalTime localTime29 = property24.addWrapFieldToCopy(26159400);
        org.joda.time.DateTimeField dateTimeField30 = property24.getField();
        org.joda.time.LocalTime localTime31 = property24.roundCeilingCopy();
        org.joda.time.LocalTime localTime33 = localTime31.minusHours(11753441);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        int int36 = dateTimeZone34.getStandardOffset((long) (byte) 1);
        org.joda.time.DateTime dateTime37 = localTime33.toDateTimeToday(dateTimeZone34);
        org.joda.time.DateTime dateTime38 = dateTime9.withZone(dateTimeZone34);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime41 = dateTime9.withPeriodAdded(readablePeriod39, 54);
        org.joda.time.DateTime dateTime42 = localTime8.toDateTime((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime42.getZone();
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.now(dateTimeZone43);
        java.lang.String str45 = dateTimeZone43.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant11", (dateTime9.compareTo(instant11) == 0) == dateTime9.equals(instant11));
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.LocalDate.Property property6 = localDate4.year();
        org.joda.time.LocalDate localDate7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate8 = property6.withMinimumValue();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.Chronology chronology12 = dateTime10.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        int int15 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime14);
        int int17 = dateTimeZone13.getOffsetFromLocal((long) 26187981);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) dateTime10, dateTimeZone13);
        int int19 = localDate8.compareTo((org.joda.time.ReadablePartial) localDate18);
        int int20 = localDate8.getDayOfMonth();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int25 = dateTime23.get(dateTimeFieldType24);
        org.joda.time.DateTime dateTime27 = dateTime23.minusMillis((int) '#');
        org.joda.time.DateTime dateTime29 = dateTime27.plusDays(11);
        org.joda.time.DateTime dateTime32 = dateTime27.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime34 = dateTime27.plusDays(26159400);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 100, dateTimeZone36);
        org.joda.time.LocalDate localDate39 = localDate37.plusDays(50);
        org.joda.time.Chronology chronology40 = localDate39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime27.toMutableDateTime(chronology40);
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now(chronology40);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.weekyear();
        int int45 = localDate43.get(dateTimeFieldType44);
        org.joda.time.LocalDate localDate47 = localDate8.withField(dateTimeFieldType44, 26180512);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean49 = localDate8.isSupported(dateTimeFieldType48);
        org.joda.time.LocalDate.Property property50 = localDate8.weekyear();
        org.joda.time.LocalDate localDate52 = property50.addToCopy((-201));
        org.joda.time.LocalDate localDate54 = localDate52.withWeekyear(12113028);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDate localDate56 = localDate54.minus(readablePeriod55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant11", (dateTime10.compareTo(instant11) == 0) == dateTime10.equals(instant11));
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight3 = dateTime2.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int5 = dateTime2.get(dateTimeFieldType4);
        int int6 = dateTime2.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.dayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime2.withChronology(chronology12);
        org.joda.time.DateTime dateTime17 = dateTime15.plusSeconds(100);
        org.joda.time.DateTime.Property property18 = dateTime15.hourOfDay();
        java.lang.String str19 = property18.getAsString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime15", (dateTime2.compareTo(dateTime15) == 0) == dateTime2.equals(dateTime15));
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-26151846));
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int10 = dateTime7.get(dateTimeFieldType9);
        int int11 = dateTime7.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 100, dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.plusDays(50);
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.dayOfMonth();
        org.joda.time.DateTime dateTime20 = dateTime7.withChronology(chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter4.withChronology(chronology17);
        int int22 = dateTimeFormatter4.getDefaultYear();
        org.joda.time.format.DateTimeParser dateTimeParser23 = dateTimeFormatter4.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter4.withOffsetParsed();
        boolean boolean25 = dateTimeFormatter24.isParser();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime20", (dateTime7.compareTo(dateTime20) == 0) == dateTime7.equals(dateTime20));
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime dateTime6 = dateTime0.plusYears(26160835);
        boolean boolean8 = dateTime6.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTime dateTime10 = dateTime6.minusMinutes(11775531);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekyear(26163273);
        org.joda.time.DateTime.Property property13 = dateTime10.yearOfCentury();
        org.joda.time.DateTime dateTime15 = dateTime10.plusMillis(24051508);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology21.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = zonedChronology21.add(readablePeriod25, (long) 38, 11809825);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.yearOfEra();
        org.joda.time.DurationField durationField30 = zonedChronology21.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField30, and durationField22", !(durationField22.compareTo(durationField30) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField30.compareTo(durationField22))));
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone26 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.millisOfSecond();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((org.joda.time.Chronology) zonedChronology21);
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology21.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime31", (dateTime16.compareTo(dateTime31) == 0) == dateTime16.equals(dateTime31));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.minuteOfDay();
        org.joda.time.Chronology chronology24 = zonedChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.monthOfYear();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = zonedChronology21.add(readablePeriod27, (long) 26199721, 196);
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.dayOfYear();
        org.joda.time.DurationField durationField32 = zonedChronology21.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField32, and durationField22", !(durationField22.compareTo(durationField32) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField32.compareTo(durationField22))));
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        int int9 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate8.minus(readablePeriod10);
        int int12 = localDate8.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 100, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.plusDays(50);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.LocalDate.Property property19 = localDate17.era();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        org.joda.time.LocalDate localDate21 = property19.getLocalDate();
        org.joda.time.LocalDate localDate23 = localDate21.withYear(26160535);
        boolean boolean24 = localDate8.isEqual((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.DateTime dateTime25 = localDate23.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property26 = localDate23.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 100, dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate29.plusDays(50);
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        org.joda.time.LocalDate.Property property33 = localDate31.era();
        org.joda.time.LocalDate localDate34 = property33.getLocalDate();
        org.joda.time.LocalDate localDate36 = localDate34.minusMonths(11753234);
        org.joda.time.Instant instant37 = new org.joda.time.Instant();
        org.joda.time.Instant instant39 = instant37.withMillis((long) 11);
        org.joda.time.Instant instant40 = instant39.toInstant();
        org.joda.time.Instant instant42 = instant40.plus((long) 11757325);
        org.joda.time.Instant instant43 = new org.joda.time.Instant();
        org.joda.time.Instant instant45 = instant43.minus((long) 2);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Instant instant47 = instant45.plus(readableDuration46);
        boolean boolean48 = instant40.isBefore((org.joda.time.ReadableInstant) instant45);
        org.joda.time.DateTimeZone dateTimeZone49 = instant40.getZone();
        org.joda.time.DateTime dateTime50 = localDate36.toDateTimeAtMidnight(dateTimeZone49);
        java.lang.String str52 = dateTimeZone49.getShortName((long) 11803413);
        org.joda.time.DateMidnight dateMidnight53 = localDate23.toDateMidnight(dateTimeZone49);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) 100, dateTimeZone56);
        org.joda.time.LocalDate localDate59 = localDate57.plusDays(50);
        org.joda.time.Chronology chronology60 = localDate59.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = chronology60.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((long) 100, dateTimeZone63);
        org.joda.time.LocalDate localDate66 = localDate64.plusDays(50);
        int int67 = localDate64.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate69 = localDate64.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime();
        int int72 = dateTimeZone70.getOffset((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateMidnight dateMidnight73 = localDate64.toDateMidnight(dateTimeZone70);
        long long75 = dateTimeZone70.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology76 = org.joda.time.chrono.ZonedChronology.getInstance(chronology60, dateTimeZone70);
        org.joda.time.DurationField durationField77 = zonedChronology76.eras();
        org.joda.time.DateTimeField dateTimeField78 = zonedChronology76.minuteOfDay();
        org.joda.time.Chronology chronology79 = zonedChronology76.withUTC();
        org.joda.time.DateTimeField dateTimeField80 = zonedChronology76.monthOfYear();
        org.joda.time.DateTimeField dateTimeField81 = zonedChronology76.dayOfYear();
        org.joda.time.DateTimeField dateTimeField82 = zonedChronology76.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField83 = zonedChronology76.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField84 = dateTimeFieldType54.getField((org.joda.time.Chronology) zonedChronology76);
        boolean boolean85 = localDate23.isSupported(dateTimeFieldType54);
        java.lang.String str86 = dateTimeFieldType54.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant43 and dateTime71", (instant43.compareTo(dateTime71) == 0) == instant43.equals(dateTime71));
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime.Property property5 = dateTime0.monthOfYear();
        org.joda.time.DateTime dateTime6 = property5.roundFloorCopy();
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.Instant instant9 = instant7.withMillis((long) 11);
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.joda.time.Chronology chronology11 = instant9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 100, dateTimeZone14);
        int int16 = dateTimeField12.getMaximumValue((org.joda.time.ReadablePartial) localDate15);
        boolean boolean17 = dateTimeField12.isSupported();
        int int20 = dateTimeField12.getDifference((long) 4, (long) (-1));
        java.util.Locale locale22 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleAttributes();
        java.lang.String str24 = locale22.toLanguageTag();
        java.lang.String str25 = dateTimeField12.getAsText((long) 11753441, locale22);
        int int26 = property5.getMaximumShortTextLength(locale22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.minus((long) 2);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant2.plus(readableDuration3);
        org.joda.time.MutableDateTime mutableDateTime5 = instant2.toMutableDateTime();
        org.joda.time.Instant instant7 = instant2.minus((long) 9);
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant7.plus(readableDuration9);
        long long11 = instant10.getMillis();
        org.joda.time.Instant instant13 = instant10.plus(0L);
        long long14 = instant13.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime5", (instant2.compareTo(mutableDateTime5) == 0) == instant2.equals(mutableDateTime5));
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusDays(17);
        int int4 = localDateTime0.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusHours(22);
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        int int10 = dateTimeZone8.getOffset((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone8);
        java.lang.String str13 = dateTimeZone8.getName((long) 18);
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.Instant instant16 = instant14.plus((long) 11753187);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant18 = instant16.plus(readableDuration17);
        org.joda.time.Instant instant20 = instant18.plus((long) (short) -1);
        org.joda.time.Instant instant22 = instant18.plus((long) 20);
        int int23 = dateTimeZone8.getOffset((org.joda.time.ReadableInstant) instant18);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean25 = instant18.isSupported(dateTimeFieldType24);
        int int26 = localDateTime6.get(dateTimeFieldType24);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 10);
        org.joda.time.DateTime dateTime30 = dateTime28.plusMinutes(49);
        org.joda.time.DateTime dateTime32 = dateTime30.plus(10L);
        org.joda.time.Chronology chronology33 = dateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.monthOfYear();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType24.getField(chronology33);
        boolean boolean36 = dateTimeField35.isLenient();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime11", (dateTime9.compareTo(dateTime11) == 0) == dateTime9.equals(dateTime11));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(0);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalTime localTime5 = localTime3.plus(readablePeriod4);
        org.joda.time.LocalTime localTime7 = localTime3.plusMinutes(3);
        org.joda.time.LocalTime localTime9 = localTime7.minusSeconds(36);
        java.lang.String str10 = localTime7.toString();
        org.joda.time.LocalTime localTime12 = localTime7.minusMillis(11815600);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        int int14 = dateTime13.getDayOfYear();
        org.joda.time.DateTime dateTime16 = dateTime13.withYear(11751002);
        org.joda.time.DateTime dateTime18 = dateTime13.minusYears(100);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight22 = dateTime21.toDateMidnight();
        int int23 = dateMidnight22.getDayOfYear();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        int int25 = dateTime24.getDayOfYear();
        org.joda.time.DateTime dateTime27 = dateTime24.withYear(11751002);
        org.joda.time.Instant instant28 = dateTime24.toInstant();
        org.joda.time.DateTime dateTime30 = dateTime24.plusYears(26160835);
        boolean boolean32 = dateTime30.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime35 = dateTime33.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int37 = dateTime35.get(dateTimeFieldType36);
        org.joda.time.DateTime dateTime39 = dateTime35.minusMillis((int) '#');
        org.joda.time.DateTime dateTime41 = dateTime39.plusDays(11);
        org.joda.time.DateTime dateTime44 = dateTime39.withDurationAdded((long) 11757696, (int) ' ');
        int int45 = dateTime39.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime47 = dateTime39.minusWeeks(215400000);
        boolean boolean48 = dateTime30.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int50 = dateTime30.get(dateTimeFieldType49);
        boolean boolean51 = dateMidnight22.isSupported(dateTimeFieldType49);
        int int52 = dateTime13.get(dateTimeFieldType49);
        boolean boolean53 = localTime12.isSupported(dateTimeFieldType49);
        org.joda.time.LocalTime localTime55 = localTime12.minusMinutes(740);
        org.joda.time.LocalTime localTime57 = localTime12.minusHours(12105496);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant28", (dateTime13.compareTo(instant28) == 0) == dateTime13.equals(instant28));
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.millisOfDay();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        java.util.TimeZone timeZone14 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(72000000L, dateTimeZone12);
        int int17 = dateTimeZone12.getStandardOffset((long) 'u');
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.chrono.ZonedChronology zonedChronology19 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField20 = zonedChronology19.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology19.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology19.year();
        org.joda.time.DurationField durationField23 = zonedChronology19.weeks();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology19.millisOfSecond();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = dateTime25.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime29 = dateTime27.minus(0L);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 100, dateTimeZone31);
        org.joda.time.DateTime dateTime33 = dateTime29.withZone(dateTimeZone31);
        org.joda.time.Chronology chronology34 = zonedChronology19.withZone(dateTimeZone31);
        long long38 = zonedChronology19.add((long) 11941084, (long) 12250763, 12101387);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime33", (dateTime27.compareTo(dateTime33) == 0) == dateTime27.equals(dateTime33));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        java.lang.String str22 = zonedChronology21.toString();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now((org.joda.time.Chronology) zonedChronology21);
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology21.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime23", (dateTime16.compareTo(dateTime23) == 0) == dateTime16.equals(dateTime23));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate.Property property6 = localDate4.era();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.LocalDate localDate8 = property6.getLocalDate();
        org.joda.time.LocalDate localDate9 = property6.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate11 = localDate9.minusWeeks(11903689);
        int int12 = localDate11.getDayOfYear();
        org.joda.time.Interval interval13 = localDate11.toInterval();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 100, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.plusDays(50);
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        org.joda.time.LocalDate.Property property20 = localDate18.year();
        org.joda.time.LocalDate localDate21 = property20.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate22 = property20.withMinimumValue();
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.Instant instant25 = dateTime24.toInstant();
        org.joda.time.Chronology chronology26 = dateTime24.getChronology();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        int int29 = dateTimeZone27.getOffset((org.joda.time.ReadableInstant) dateTime28);
        int int31 = dateTimeZone27.getOffsetFromLocal((long) 26187981);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) dateTime24, dateTimeZone27);
        int int33 = localDate22.compareTo((org.joda.time.ReadablePartial) localDate32);
        int int34 = localDate22.getDayOfMonth();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime37 = dateTime35.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int39 = dateTime37.get(dateTimeFieldType38);
        org.joda.time.DateTime dateTime41 = dateTime37.minusMillis((int) '#');
        org.joda.time.DateTime dateTime43 = dateTime41.plusDays(11);
        org.joda.time.DateTime dateTime46 = dateTime41.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime48 = dateTime41.plusDays(26159400);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) 100, dateTimeZone50);
        org.joda.time.LocalDate localDate53 = localDate51.plusDays(50);
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime56 = dateTime41.toMutableDateTime(chronology54);
        org.joda.time.LocalDate localDate57 = org.joda.time.LocalDate.now(chronology54);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.weekyear();
        int int59 = localDate57.get(dateTimeFieldType58);
        org.joda.time.LocalDate localDate61 = localDate22.withField(dateTimeFieldType58, 26180512);
        java.lang.String str62 = dateTimeFieldType58.toString();
        int int63 = localDate11.get(dateTimeFieldType58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant25", (dateTime24.compareTo(instant25) == 0) == dateTime24.equals(instant25));
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.years();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        int int25 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone23);
        java.lang.String str28 = dateTimeZone23.getName((long) 18);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(dateTimeZone23);
        org.joda.time.Chronology chronology30 = zonedChronology21.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology21.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology21.clockhourOfHalfday();
        org.joda.time.DurationField durationField33 = zonedChronology21.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime26", (dateTime16.compareTo(dateTime26) == 0) == dateTime16.equals(dateTime26));
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-26151846));
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int10 = dateTime7.get(dateTimeFieldType9);
        int int11 = dateTime7.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 100, dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.plusDays(50);
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.dayOfMonth();
        org.joda.time.DateTime dateTime20 = dateTime7.withChronology(chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter4.withChronology(chronology17);
        org.joda.time.format.DateTimeParser dateTimeParser22 = dateTimeFormatter4.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter4.withOffsetParsed();
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale26 = java.util.Locale.TAIWAN;
        java.lang.String str27 = locale25.getDisplayCountry(locale26);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(locale26);
        java.util.Locale locale29 = java.util.Locale.PRC;
        java.lang.String str30 = locale26.getDisplayCountry(locale29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter23.withLocale(locale29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter31.withPivotYear((java.lang.Integer) 226);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime20", (dateTime7.compareTo(dateTime20) == 0) == dateTime7.equals(dateTime20));
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (byte) 10);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Chronology chronology4 = dateTime2.getChronology();
        long long5 = dateTime2.getMillis();
        boolean boolean6 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime dateTime7 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime2.plus(readableDuration8);
        org.joda.time.DateTime.Property property10 = dateTime9.centuryOfEra();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime17 = dateTime13.minusMillis((int) '#');
        org.joda.time.DateTime.Property property18 = dateTime13.weekyear();
        int int19 = dateTime13.getEra();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.DateTime dateTime22 = dateTime13.withFieldAdded(durationFieldType20, 11844408);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 100, dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate25.plusDays(50);
        org.joda.time.DateTime dateTime28 = localDate27.toDateTimeAtMidnight();
        boolean boolean29 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Instant instant30 = dateTime28.toInstant();
        org.joda.time.DateTime dateTime31 = instant30.toDateTime();
        int int32 = property10.compareTo((org.joda.time.ReadableInstant) instant30);
        org.joda.time.DateTime dateTime33 = property10.withMinimumValue();
        org.joda.time.DateTime dateTime34 = property10.getDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and instant3", (dateTime34.compareTo(instant3) == 0) == dateTime34.equals(instant3));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime13 = dateTime6.plusDays(26159400);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        int int17 = dateTimeZone14.getStandardOffset((long) 49);
        int int19 = dateTimeZone14.getOffset((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime6.toMutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        boolean boolean22 = dateTime6.isSupported(dateTimeFieldType21);
        org.joda.time.DateTime dateTime24 = dateTime6.minus((long) 11800667);
        org.joda.time.DateTime dateTime26 = dateTime24.minus((long) 12327995);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and mutableDateTime20", (dateTime6.compareTo(mutableDateTime20) == 0) == dateTime6.equals(mutableDateTime20));
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (byte) 10);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Chronology chronology4 = dateTime2.getChronology();
        long long5 = dateTime2.getMillis();
        boolean boolean6 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        int int8 = dateTime7.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.withYear(11751002);
        org.joda.time.Instant instant11 = dateTime7.toInstant();
        org.joda.time.DateTime dateTime13 = dateTime7.plusYears(26160835);
        boolean boolean14 = dateTime2.isBefore((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int19 = dateTime17.get(dateTimeFieldType18);
        org.joda.time.DateTime dateTime21 = dateTime17.minusMillis((int) '#');
        org.joda.time.DateTime dateTime23 = dateTime21.plusDays(11);
        org.joda.time.DateTime dateTime26 = dateTime21.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime21.getZone();
        org.joda.time.DateTime dateTime29 = dateTime21.minusDays(22);
        org.joda.time.DateTime dateTime31 = dateTime29.plusMillis(11789419);
        boolean boolean32 = dateTime31.isAfterNow();
        org.joda.time.DateTime.Property property33 = dateTime31.yearOfEra();
        int int34 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime.Property property35 = dateTime13.millisOfSecond();
        org.joda.time.DateTime dateTime37 = dateTime13.plusMinutes(12177829);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.minus(readableDuration1);
        org.joda.time.DateTime dateTime3 = instant2.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime4 = instant2.toMutableDateTimeISO();
        int int5 = mutableDateTime4.getYearOfCentury();
        boolean boolean6 = mutableDateTime4.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        int int9 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone7);
        boolean boolean11 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.plusYears(21);
        org.joda.time.ReadableInstant readableInstant14 = null;
        boolean boolean15 = dateTime13.isAfter(readableInstant14);
        int int16 = dateTime13.getMinuteOfDay();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay20 = dateTime19.toTimeOfDay();
        org.joda.time.DateTime.Property property21 = dateTime19.yearOfEra();
        org.joda.time.DateTime dateTime23 = property21.setCopy(26156834);
        org.joda.time.DateTime dateTime25 = property21.addToCopy((long) 1970);
        org.joda.time.DateTime.Property property26 = dateTime25.hourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = property26.getField();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        int int29 = dateTime28.getDayOfYear();
        int int30 = dateTime28.getWeekyear();
        int int31 = dateTime28.getWeekyear();
        org.joda.time.DateTime.Property property32 = dateTime28.secondOfDay();
        org.joda.time.DateTime dateTime34 = property32.addWrapFieldToCopy(11771566);
        org.joda.time.DateTime dateTime36 = property32.addWrapFieldToCopy(11936570);
        int int37 = property26.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime39 = dateTime36.minus((long) 26430022);
        org.joda.time.DateTime dateTime40 = dateTime36.toDateTimeISO();
        boolean boolean41 = dateTime13.isEqual((org.joda.time.ReadableInstant) dateTime40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime10", (dateTime0.compareTo(dateTime10) == 0) == dateTime0.equals(dateTime10));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        int int12 = dateTime6.getYearOfEra();
        org.joda.time.DateTime dateTime14 = dateTime6.withMinuteOfHour(11);
        org.joda.time.DateTime dateTime16 = dateTime14.minusWeeks(1);
        org.joda.time.DateTime dateTime18 = dateTime16.withMillisOfDay(11785612);
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.Instant instant21 = instant19.withMillis((long) 11);
        org.joda.time.Instant instant22 = instant21.toInstant();
        org.joda.time.Chronology chronology23 = instant21.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.weekyearOfCentury();
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str28 = locale26.getExtension('x');
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 100, dateTimeZone30);
        long long35 = dateTimeZone30.convertLocalToUTC((long) 2017, false, (long) 0);
        java.util.Locale locale38 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale39 = java.util.Locale.TAIWAN;
        java.lang.String str40 = locale38.getDisplayCountry(locale39);
        java.lang.String str41 = dateTimeZone30.getName((long) 26160535, locale38);
        java.lang.String str42 = locale26.getDisplayVariant(locale38);
        java.lang.String str43 = dateTimeField24.getAsShortText((long) 11762043, locale26);
        java.lang.String str44 = locale26.getDisplayCountry();
        java.util.Calendar calendar45 = dateTime16.toCalendar(locale26);
        calendar45.set(11895403, 11911745, 11901296);
        boolean boolean50 = calendar45.isWeekDateSupported();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant19", (dateTime0.compareTo(instant19) == 0) == dateTime0.equals(instant19));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.centuryOfEra();
        org.joda.time.DurationField durationField24 = zonedChronology21.minutes();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone26 = zonedChronology21.getZone();
        org.joda.time.Chronology chronology27 = zonedChronology21.withUTC();
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant28.withMillis((long) 11);
        org.joda.time.Instant instant31 = instant30.toInstant();
        org.joda.time.Chronology chronology32 = instant30.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 100, dateTimeZone35);
        int int37 = dateTimeField33.getMaximumValue((org.joda.time.ReadablePartial) localDate36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDate localDate39 = localDate36.minus(readablePeriod38);
        java.util.Date date40 = localDate39.toDate();
        long long42 = zonedChronology21.set((org.joda.time.ReadablePartial) localDate39, (long) 11836898);
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology21.yearOfCentury();
        int int45 = dateTimeField43.get((long) 11785439);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant28", (dateTime16.compareTo(instant28) == 0) == dateTime16.equals(instant28));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology21.yearOfCentury();
        org.joda.time.DurationField durationField23 = zonedChronology21.millis();
        org.joda.time.DurationField durationField24 = zonedChronology21.centuries();
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now((org.joda.time.Chronology) zonedChronology21);
        org.joda.time.LocalDate localDate27 = localDate25.plusDays(11898794);
        org.joda.time.LocalDate.Property property28 = localDate27.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.Interval interval30 = localDate27.toInterval(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate27.withYearOfEra(11863811);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Instant instant34 = new org.joda.time.Instant();
        org.joda.time.Instant instant36 = instant34.withMillis((long) 11);
        org.joda.time.Instant instant37 = instant36.toInstant();
        org.joda.time.Chronology chronology38 = instant36.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 100, dateTimeZone41);
        int int43 = dateTimeField39.getMaximumValue((org.joda.time.ReadablePartial) localDate42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDate localDate45 = localDate42.minus(readablePeriod44);
        org.joda.time.Chronology chronology46 = localDate42.getChronology();
        boolean boolean47 = durationFieldType33.isSupported(chronology46);
        boolean boolean48 = localDate27.isSupported(durationFieldType33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant34", (dateTime16.compareTo(instant34) == 0) == dateTime16.equals(instant34));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime3 = property1.addWrapFieldToCopy(11756302);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.secondOfMinute();
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        boolean boolean7 = locale5.hasExtensions();
        java.lang.String str8 = property4.getAsShortText(locale5);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 10);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.Instant instant12 = dateTime11.toInstant();
        org.joda.time.Chronology chronology13 = dateTime11.getChronology();
        long long14 = dateTime11.getMillis();
        boolean boolean15 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime16 = dateTime11.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime18 = dateTime11.minusMonths(11833538);
        boolean boolean19 = property4.equals((java.lang.Object) dateTime18);
        org.joda.time.LocalDateTime localDateTime21 = property4.addWrapFieldToCopy(11907242);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.year();
        int int23 = localDateTime21.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant12", (dateTime11.compareTo(instant12) == 0) == dateTime11.equals(instant12));
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.dayOfYear();
        org.joda.time.DurationField durationField28 = zonedChronology21.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField28, and durationField22", !(durationField22.compareTo(durationField28) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField28.compareTo(durationField22))));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        int int9 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        int int11 = localDate8.getValue(2);
        org.joda.time.DateMidnight dateMidnight12 = localDate8.toDateMidnight();
        org.joda.time.LocalDate localDate14 = localDate8.plusMonths(26160535);
        int int15 = localDate8.getEra();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.LocalDate localDate18 = localDate8.withFieldAdded(durationFieldType16, 11810407);
        org.joda.time.LocalDate.Property property19 = localDate8.yearOfCentury();
        int int20 = localDate8.getWeekyear();
        org.joda.time.LocalDate localDate22 = localDate8.withCenturyOfEra(12037);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 100, dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate25.plusDays(50);
        int int28 = localDate25.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate30 = localDate25.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        int int33 = dateTimeZone31.getOffset((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateMidnight dateMidnight34 = localDate25.toDateMidnight(dateTimeZone31);
        long long38 = dateTimeZone31.convertLocalToUTC((long) '#', false, (long) 6);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.Interval interval40 = localDate8.toInterval(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime32", (instant0.compareTo(dateTime32) == 0) == instant0.equals(dateTime32));
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        int int6 = localDate4.getEra();
        org.joda.time.LocalDate.Property property7 = localDate4.monthOfYear();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.LocalDate localDate10 = property7.addToCopy(26220000);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime17 = dateTime13.minusMillis((int) '#');
        org.joda.time.DateTime dateTime19 = dateTime17.plusDays(11);
        org.joda.time.DateTime dateTime22 = dateTime17.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime17.getZone();
        org.joda.time.DateTime dateTime25 = dateTime17.minusDays(22);
        org.joda.time.DateTime dateTime27 = dateTime17.withYearOfCentury(14);
        org.joda.time.Instant instant28 = org.joda.time.Instant.now();
        org.joda.time.Instant instant30 = instant28.plus((long) 11753187);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Instant instant32 = instant30.plus(readableDuration31);
        boolean boolean33 = dateTime17.equals((java.lang.Object) instant32);
        org.joda.time.DateMidnight dateMidnight34 = dateTime17.toDateMidnight();
        org.joda.time.Instant instant35 = dateTime17.toInstant();
        org.joda.time.DateTime.Property property36 = dateTime17.hourOfDay();
        org.joda.time.DateTime dateTime37 = property36.roundFloorCopy();
        org.joda.time.DateTime dateTime38 = property36.roundFloorCopy();
        long long39 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalDate localDate40 = property7.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant28", (dateTime11.compareTo(instant28) == 0) == dateTime11.equals(instant28));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        int int2 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime4", (dateTime1.compareTo(dateTime4) == 0) == dateTime1.equals(dateTime4));
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (byte) 10);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Chronology chronology4 = dateTime2.getChronology();
        long long5 = dateTime2.getMillis();
        boolean boolean6 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime2);
        int int7 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime9 = dateTime1.minusWeeks(3);
        long long10 = dateTime9.getMillis();
        org.joda.time.DateTime.Property property11 = dateTime9.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        int int2 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readableDuration6);
        long long8 = dateTime5.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime4", (dateTime1.compareTo(dateTime4) == 0) == dateTime1.equals(dateTime4));
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology21.yearOfCentury();
        org.joda.time.DurationField durationField23 = zonedChronology21.millis();
        org.joda.time.DurationField durationField24 = zonedChronology21.seconds();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.millisOfDay();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.weekyearOfCentury();
        org.joda.time.DurationField durationField27 = zonedChronology21.weekyears();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 100, dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.plusDays(50);
        org.joda.time.Chronology chronology33 = localDate32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 100, dateTimeZone36);
        org.joda.time.LocalDate localDate39 = localDate37.plusDays(50);
        int int40 = localDate37.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate42 = localDate37.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        int int45 = dateTimeZone43.getOffset((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateMidnight dateMidnight46 = localDate37.toDateMidnight(dateTimeZone43);
        long long48 = dateTimeZone43.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology49 = org.joda.time.chrono.ZonedChronology.getInstance(chronology33, dateTimeZone43);
        org.joda.time.DurationField durationField50 = zonedChronology49.weeks();
        org.joda.time.DateTimeField dateTimeField51 = zonedChronology49.year();
        org.joda.time.DateTimeZone dateTimeZone52 = zonedChronology49.getZone();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology49.dayOfMonth();
        org.joda.time.DurationField durationField54 = zonedChronology49.weeks();
        boolean boolean55 = zonedChronology21.equals((java.lang.Object) durationField54);
        java.lang.String str56 = zonedChronology21.toString();
        org.joda.time.DurationField durationField57 = zonedChronology21.years();
        org.joda.time.DateTimeField dateTimeField58 = zonedChronology21.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField27 and durationField57", (durationField27.compareTo(durationField57) == 0) == durationField27.equals(durationField57));
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        int int2 = dateTime0.getWeekyear();
        org.joda.time.DateTime dateTime3 = dateTime0.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 100, dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.minusYears(53);
        org.joda.time.DateMidnight dateMidnight9 = localDate6.toDateMidnight();
        int int10 = localDate6.getWeekOfWeekyear();
        java.util.Calendar.Builder builder11 = new java.util.Calendar.Builder();
        java.util.Locale locale12 = java.util.Locale.JAPAN;
        java.util.Calendar.Builder builder13 = builder11.setLocale(locale12);
        java.util.Calendar.Builder builder14 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder18 = builder14.setWeekDate((int) (short) 0, (int) '4', (int) '4');
        java.util.Calendar.Builder builder20 = builder18.setLenient(false);
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        java.util.TimeZone timeZone27 = dateTimeZone25.toTimeZone();
        boolean boolean28 = timeZone22.hasSameRules(timeZone27);
        java.util.Calendar.Builder builder29 = builder18.setTimeZone(timeZone27);
        java.util.Calendar.Builder builder30 = builder11.setTimeZone(timeZone27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTime dateTime32 = localDate6.toDateTimeAtStartOfDay(dateTimeZone31);
        java.util.TimeZone timeZone33 = dateTimeZone31.toTimeZone();
        long long36 = dateTimeZone31.adjustOffset(1645514214684L, false);
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.DateTime dateTime38 = dateTime0.toDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime39 = dateTime0.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime37", (dateTime39.compareTo(dateTime37) == 0) == dateTime39.equals(dateTime37));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        org.joda.time.DateTime dateTime14 = dateTime6.minusDays(22);
        org.joda.time.DateTime dateTime16 = dateTime6.withYearOfCentury(14);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.Instant instant19 = instant17.plus((long) 11753187);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant19.plus(readableDuration20);
        boolean boolean22 = dateTime6.equals((java.lang.Object) instant21);
        org.joda.time.DateTime.Property property23 = dateTime6.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withField(dateTimeFieldType26, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.plusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withMillisOfSecond((int) '4');
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.plusWeeks(26160458);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.minusMinutes((int) 'u');
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusMonths(3);
        org.joda.time.DateTime dateTime39 = dateTime6.withFields((org.joda.time.ReadablePartial) localDateTime36);
        int int40 = dateTime39.getMinuteOfDay();
        int int41 = dateTime39.getMinuteOfDay();
        org.joda.time.DateTime.Property property42 = dateTime39.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant17", (dateTime0.compareTo(instant17) == 0) == dateTime0.equals(instant17));
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        int int9 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        int int11 = localDate8.getValue(2);
        org.joda.time.DateMidnight dateMidnight12 = localDate8.toDateMidnight();
        org.joda.time.LocalDate localDate14 = localDate8.plusMonths(26160535);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        int int16 = dateTime15.getDayOfYear();
        org.joda.time.DateTime dateTime18 = dateTime15.withYear(11751002);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        int int20 = dateTime19.getDayOfYear();
        org.joda.time.DateTime dateTime22 = dateTime19.withYear(11751002);
        org.joda.time.Instant instant23 = dateTime19.toInstant();
        boolean boolean24 = dateTime15.isEqual((org.joda.time.ReadableInstant) instant23);
        org.joda.time.DateTime dateTime25 = localDate14.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime27 = dateTime25.withSecondOfMinute(0);
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 100, dateTimeZone30);
        org.joda.time.LocalDate localDate33 = localDate31.plusDays(50);
        org.joda.time.Chronology chronology34 = localDate33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 100, dateTimeZone37);
        org.joda.time.LocalDate localDate40 = localDate38.plusDays(50);
        int int41 = localDate38.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate43 = localDate38.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime();
        int int46 = dateTimeZone44.getOffset((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateMidnight dateMidnight47 = localDate38.toDateMidnight(dateTimeZone44);
        long long49 = dateTimeZone44.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology50 = org.joda.time.chrono.ZonedChronology.getInstance(chronology34, dateTimeZone44);
        org.joda.time.DurationField durationField51 = zonedChronology50.eras();
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology50.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField53 = zonedChronology50.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField54 = zonedChronology50.era();
        int int55 = dateTime27.get(dateTimeField54);
        org.joda.time.DateTime dateTime57 = dateTime27.plusWeeks(11827568);
        org.joda.time.DateTime dateTime59 = dateTime57.plus(4308236958L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime15", (instant0.compareTo(dateTime15) == 0) == instant0.equals(dateTime15));
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(10);
        java.util.GregorianCalendar gregorianCalendar6 = dateTime1.toGregorianCalendar();
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Instant instant10 = instant8.withMillis((long) 11);
        org.joda.time.Instant instant11 = instant10.toInstant();
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 11760560, chronology12);
        org.joda.time.DateTime dateTime15 = dateTime1.withChronology(chronology12);
        boolean boolean16 = dateTimeFieldType0.isSupported(chronology12);
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType0.getDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant8", (dateTime1.compareTo(instant8) == 0) == dateTime1.equals(instant8));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 100, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.plusDays(50);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfHour();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology6);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (-1), chronology6);
        org.joda.time.DurationField durationField10 = chronology6.minutes();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField12 = chronology6.weeks();
        org.joda.time.DurationField durationField13 = chronology6.weeks();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology6);
        int int15 = dateTime14.getEra();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 100, dateTimeZone17);
        java.util.Date date19 = localDate18.toDate();
        org.joda.time.LocalDate localDate21 = localDate18.withCenturyOfEra((int) 'u');
        org.joda.time.DateTime dateTime22 = localDate18.toDateTimeAtCurrentTime();
        int int23 = localDate18.getDayOfWeek();
        org.joda.time.LocalDate localDate25 = localDate18.minusMonths(11771566);
        org.joda.time.LocalDate.Property property26 = localDate25.weekOfWeekyear();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime29 = dateTime27.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int31 = dateTime29.get(dateTimeFieldType30);
        org.joda.time.DateTime dateTime33 = dateTime29.minusSeconds((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone39 = dateTimeZone38.toTimeZone();
        java.util.TimeZone timeZone40 = dateTimeZone38.toTimeZone();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(72000000L, dateTimeZone38);
        int int43 = dateTimeZone38.getStandardOffset((long) 'u');
        java.lang.String str45 = dateTimeZone38.getName(1645142400000L);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 11779950, dateTimeZone38);
        org.joda.time.DateTime dateTime47 = dateTime29.withZoneRetainFields(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone53 = dateTimeZone52.toTimeZone();
        java.util.TimeZone timeZone54 = dateTimeZone52.toTimeZone();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(72000000L, dateTimeZone52);
        int int57 = dateTimeZone52.getStandardOffset((long) 'u');
        java.lang.String str59 = dateTimeZone52.getName(1645142400000L);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) 11779950, dateTimeZone52);
        long long62 = dateTimeZone38.getMillisKeepLocal(dateTimeZone52, (long) 11817955);
        org.joda.time.DateTime dateTime63 = localDate25.toDateTimeAtCurrentTime(dateTimeZone38);
        org.joda.time.Chronology chronology64 = dateTime63.getChronology();
        boolean boolean65 = dateTime14.equals((java.lang.Object) chronology64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime27", (dateTime8.compareTo(dateTime27) == 0) == dateTime8.equals(dateTime27));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DurationField durationField25 = zonedChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.millisOfDay();
        org.joda.time.DurationField durationField29 = zonedChronology21.years();
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.now((org.joda.time.Chronology) zonedChronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField29", (durationField25.compareTo(durationField29) == 0) == durationField25.equals(durationField29));
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.LocalDate localDate5 = localDate2.minusMonths(11753234);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        org.joda.time.LocalDate.Property property9 = localDate8.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean11 = localDate8.isSupported(dateTimeFieldType10);
        int int12 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        int int15 = dateTimeZone13.getOffsetFromLocal((long) 'a');
        long long18 = dateTimeZone13.adjustOffset(9505L, true);
        org.joda.time.DateTime dateTime19 = localDate2.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime22 = dateTime20.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime24 = dateTime20.withHourOfDay(10);
        java.util.GregorianCalendar gregorianCalendar25 = dateTime20.toGregorianCalendar();
        boolean boolean26 = dateTime19.isAfter((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime28 = dateTime20.minus(readableDuration27);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(11849599);
        org.joda.time.DateTime.Property property31 = dateTime30.monthOfYear();
        org.joda.time.DateTime dateTime32 = property31.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 100, dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.plusDays(50);
        org.joda.time.Chronology chronology38 = localDate37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 100, dateTimeZone41);
        org.joda.time.LocalDate localDate44 = localDate42.plusDays(50);
        int int45 = localDate42.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate47 = localDate42.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime();
        int int50 = dateTimeZone48.getOffset((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateMidnight dateMidnight51 = localDate42.toDateMidnight(dateTimeZone48);
        long long53 = dateTimeZone48.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology54 = org.joda.time.chrono.ZonedChronology.getInstance(chronology38, dateTimeZone48);
        org.joda.time.DurationField durationField55 = zonedChronology54.weeks();
        org.joda.time.DateTimeField dateTimeField56 = zonedChronology54.year();
        org.joda.time.DateTimeZone dateTimeZone57 = zonedChronology54.getZone();
        org.joda.time.DurationField durationField58 = zonedChronology54.weekyears();
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology54.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology54.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField61 = zonedChronology54.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime32.toMutableDateTime((org.joda.time.Chronology) zonedChronology54);
        boolean boolean64 = zonedChronology54.equals((java.lang.Object) 12193216);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and mutableDateTime62", (dateTime32.compareTo(mutableDateTime62) == 0) == dateTime32.equals(mutableDateTime62));
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.weekyear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = zonedChronology21.add(readablePeriod26, (long) 11783576, 26163273);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        long long33 = zonedChronology21.add(readablePeriod30, 30902150430976312L, 0);
        org.joda.time.DateTimeZone dateTimeZone34 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology21.yearOfCentury();
        org.joda.time.DurationField durationField36 = zonedChronology21.days();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now((org.joda.time.Chronology) zonedChronology21);
        org.joda.time.DurationField durationField38 = zonedChronology21.weekyears();
        long long42 = zonedChronology21.add((long) 33723886, (long) 54810401, 54625632);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime37", (dateTime16.compareTo(dateTime37) == 0) == dateTime16.equals(dateTime37));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        boolean boolean7 = dateTime2.isBeforeNow();
        int int8 = dateTime2.getYearOfEra();
        org.joda.time.Instant instant9 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant9.withDurationAdded(readableDuration11, 11768869);
        org.joda.time.Instant instant15 = instant13.withMillis(25200000L);
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant9", (dateTime2.compareTo(instant9) == 0) == dateTime2.equals(instant9));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        int int5 = dateTime0.getEra();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime0.plus(readableDuration6);
        org.joda.time.DateTime.Property property8 = dateTime0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime0", (instant4.compareTo(dateTime0) == 0) == instant4.equals(dateTime0));
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.Instant instant4 = dateTime0.toInstant();
        org.joda.time.DateTime.Property property5 = dateTime0.monthOfYear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DateTime dateTime8 = property5.addToCopy((long) 999);
        org.joda.time.DateTime dateTime10 = property5.addWrapFieldToCopy(12150909);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant4", (dateTime0.compareTo(instant4) == 0) == dateTime0.equals(instant4));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        java.util.Calendar.Builder builder2 = builder0.setLocale(locale1);
        java.util.Calendar.Builder builder6 = builder0.setWeekDate(49, 53, 2022);
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.util.Calendar.Builder builder9 = builder6.setLocale(locale8);
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale10.toLanguageTag();
        boolean boolean13 = locale10.hasExtensions();
        java.util.Locale locale14 = locale10.stripExtensions();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour(14);
        org.joda.time.DateTime dateTime19 = dateTime15.withCenturyOfEra(50);
        org.joda.time.Instant instant20 = new org.joda.time.Instant();
        org.joda.time.Instant instant22 = instant20.minus((long) 2);
        int int23 = dateTime19.compareTo((org.joda.time.ReadableInstant) instant20);
        org.joda.time.DateTime.Property property24 = dateTime19.centuryOfEra();
        org.joda.time.DateTime dateTime26 = dateTime19.plusDays(58);
        java.util.Locale locale27 = java.util.Locale.JAPAN;
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleAttributes();
        java.lang.String str29 = locale27.getScript();
        java.util.Set<java.lang.String> strSet30 = locale27.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet31 = locale27.getUnicodeLocaleKeys();
        java.util.Calendar calendar32 = dateTime19.toCalendar(locale27);
        java.lang.String str33 = locale14.getDisplayCountry(locale27);
        java.util.Calendar.Builder builder34 = builder9.setLocale(locale14);
        java.util.Calendar.Builder builder36 = builder9.setLenient(true);
        java.util.Calendar.Builder builder41 = builder36.setTimeOfDay(11888, 11896961, 26352671, 11886791);
        java.util.Locale locale43 = java.util.Locale.forLanguageTag("2022-02-22T07:16:14.198");
        java.util.Set<java.lang.String> strSet44 = locale43.getUnicodeLocaleAttributes();
        java.lang.String str45 = locale43.getISO3Country();
        java.util.Calendar.Builder builder46 = builder41.setLocale(locale43);
        java.util.Locale locale47 = java.util.Locale.JAPAN;
        java.util.Locale.setDefault(locale47);
        java.lang.String str49 = locale43.getDisplayScript(locale47);
        java.util.Locale.Builder builder50 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder51 = builder50.clear();
        java.util.Locale.Builder builder53 = builder51.addUnicodeLocaleAttribute("2017");
        java.util.Locale locale54 = java.util.Locale.ITALIAN;
        java.lang.String str55 = locale54.getScript();
        java.util.Locale locale56 = java.util.Locale.ROOT;
        java.lang.String str57 = locale54.getDisplayName(locale56);
        java.util.Locale.Builder builder58 = builder51.setLocale(locale54);
        java.util.Locale locale59 = builder51.build();
        java.util.Set<java.lang.String> strSet60 = locale59.getUnicodeLocaleKeys();
        java.lang.String str62 = locale59.getExtension('x');
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(locale59);
        java.util.Locale locale64 = locale59.stripExtensions();
        java.lang.String str65 = locale47.getDisplayName(locale64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant20", (dateTime15.compareTo(instant20) == 0) == dateTime15.equals(instant20));
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime0.withHourOfDay(10);
        java.util.GregorianCalendar gregorianCalendar5 = dateTime0.toGregorianCalendar();
        java.util.TimeZone timeZone6 = gregorianCalendar5.getTimeZone();
        java.util.Locale locale7 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale7);
        int int10 = calendar8.getMinimum(1);
        java.util.Locale locale11 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(locale11);
        int int13 = calendar12.getWeeksInWeekYear();
        java.util.Calendar.Builder builder14 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder18 = builder14.setWeekDate((int) (short) 0, (int) '4', (int) '4');
        java.util.Calendar.Builder builder20 = builder18.setLenient(false);
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        java.util.TimeZone timeZone27 = dateTimeZone25.toTimeZone();
        boolean boolean28 = timeZone22.hasSameRules(timeZone27);
        java.util.Calendar.Builder builder29 = builder18.setTimeZone(timeZone27);
        calendar12.setTimeZone(timeZone27);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay34 = dateTime33.toTimeOfDay();
        org.joda.time.DateTime.Property property35 = dateTime33.yearOfEra();
        org.joda.time.DateTime dateTime36 = property35.roundCeilingCopy();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime39 = dateTime37.withMinuteOfHour(14);
        boolean boolean40 = dateTime36.isBefore((org.joda.time.ReadableInstant) dateTime37);
        java.util.Locale locale41 = java.util.Locale.JAPAN;
        java.util.Locale.setDefault(locale41);
        java.util.Calendar calendar43 = dateTime36.toCalendar(locale41);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone27, locale41);
        calendar8.setTimeZone(timeZone27);
        boolean boolean46 = timeZone6.hasSameRules(timeZone27);
        java.util.Calendar.Builder builder47 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder51 = builder47.setWeekDate((int) (short) 0, (int) '4', (int) '4');
        java.util.Calendar.Builder builder53 = builder51.setLenient(false);
        java.util.TimeZone timeZone55 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone59 = dateTimeZone58.toTimeZone();
        java.util.TimeZone timeZone60 = dateTimeZone58.toTimeZone();
        boolean boolean61 = timeZone55.hasSameRules(timeZone60);
        java.util.Calendar.Builder builder62 = builder51.setTimeZone(timeZone60);
        java.util.TimeZone.setDefault(timeZone60);
        java.util.TimeZone.setDefault(timeZone60);
        java.time.ZoneId zoneId65 = timeZone60.toZoneId();
        java.util.TimeZone timeZone66 = java.util.TimeZone.getTimeZone(zoneId65);
        java.util.TimeZone timeZone67 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone69 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone73 = dateTimeZone72.toTimeZone();
        java.util.TimeZone timeZone74 = dateTimeZone72.toTimeZone();
        boolean boolean75 = timeZone69.hasSameRules(timeZone74);
        boolean boolean76 = timeZone67.hasSameRules(timeZone69);
        boolean boolean77 = timeZone66.hasSameRules(timeZone69);
        java.time.ZoneId zoneId78 = timeZone66.toZoneId();
        java.util.TimeZone timeZone79 = java.util.TimeZone.getTimeZone(zoneId78);
        boolean boolean80 = timeZone27.hasSameRules(timeZone79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar5 and calendar8", (gregorianCalendar5.compareTo(calendar8) == 0) == gregorianCalendar5.equals(calendar8));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (byte) 10);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Chronology chronology4 = dateTime2.getChronology();
        long long5 = dateTime2.getMillis();
        boolean boolean6 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime dateTime7 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime9 = dateTime2.minusMonths(11833538);
        org.joda.time.DateTime dateTime11 = dateTime9.plusYears(11949564);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMillis(25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Chronology chronology4 = instant2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        int int9 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDate8);
        int int11 = localDate8.getValue(2);
        int int12 = localDate8.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate8.minusMonths(54570875);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 100, dateTimeZone16);
        java.util.Date date18 = localDate17.toDate();
        org.joda.time.LocalDate localDate20 = localDate17.withCenturyOfEra((int) 'u');
        org.joda.time.DateTime dateTime21 = localDate17.toDateTimeAtCurrentTime();
        int int22 = localDate17.getDayOfWeek();
        org.joda.time.LocalDate localDate24 = localDate17.minusMonths(11771566);
        org.joda.time.LocalDate.Property property25 = localDate24.weekOfWeekyear();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime28 = dateTime26.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int30 = dateTime28.get(dateTimeFieldType29);
        org.joda.time.DateTime dateTime32 = dateTime28.minusSeconds((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        java.util.TimeZone timeZone39 = dateTimeZone37.toTimeZone();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(72000000L, dateTimeZone37);
        int int42 = dateTimeZone37.getStandardOffset((long) 'u');
        java.lang.String str44 = dateTimeZone37.getName(1645142400000L);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 11779950, dateTimeZone37);
        org.joda.time.DateTime dateTime46 = dateTime28.withZoneRetainFields(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone52 = dateTimeZone51.toTimeZone();
        java.util.TimeZone timeZone53 = dateTimeZone51.toTimeZone();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(72000000L, dateTimeZone51);
        int int56 = dateTimeZone51.getStandardOffset((long) 'u');
        java.lang.String str58 = dateTimeZone51.getName(1645142400000L);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) 11779950, dateTimeZone51);
        long long61 = dateTimeZone37.getMillisKeepLocal(dateTimeZone51, (long) 11817955);
        org.joda.time.DateTime dateTime62 = localDate24.toDateTimeAtCurrentTime(dateTimeZone37);
        boolean boolean63 = dateTimeZone37.isFixed();
        int int65 = dateTimeZone37.getOffset((long) 332);
        org.joda.time.DateTime dateTime66 = localDate14.toDateTimeAtMidnight(dateTimeZone37);
        java.lang.String str67 = dateTimeZone37.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime26", (instant0.compareTo(dateTime26) == 0) == instant0.equals(dateTime26));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime13 = dateTime6.plusDays(26159400);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        int int17 = dateTimeZone14.getStandardOffset((long) 49);
        int int19 = dateTimeZone14.getOffset((long) 'a');
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime6.toMutableDateTime(dateTimeZone14);
        java.lang.String str22 = dateTimeZone14.getShortName(0L);
        java.lang.String str23 = dateTimeZone14.toString();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and mutableDateTime20", (dateTime6.compareTo(mutableDateTime20) == 0) == dateTime6.equals(mutableDateTime20));
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight3 = dateTime2.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int5 = dateTime2.get(dateTimeFieldType4);
        int int6 = dateTime2.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.dayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime2.withChronology(chronology12);
        org.joda.time.DateTime dateTime17 = dateTime15.plusSeconds(100);
        org.joda.time.DateTime.Property property18 = dateTime15.hourOfDay();
        org.joda.time.DateTime dateTime19 = property18.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime21 = dateTime19.minusMinutes(0);
        org.joda.time.DateTime dateTime23 = dateTime21.minus((long) 499774);
        org.joda.time.DateTime.Property property24 = dateTime21.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime15", (dateTime2.compareTo(dateTime15) == 0) == dateTime2.equals(dateTime15));
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime6.getZone();
        org.joda.time.DateTime dateTime14 = dateTime6.minusDays(22);
        org.joda.time.DateTime dateTime16 = dateTime6.withYearOfCentury(14);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.Instant instant19 = instant17.plus((long) 11753187);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant19.plus(readableDuration20);
        boolean boolean22 = dateTime6.equals((java.lang.Object) instant21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 100, dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate25.plusDays(50);
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 100, dateTimeZone31);
        org.joda.time.LocalDate localDate34 = localDate32.plusDays(50);
        int int35 = localDate32.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate37 = localDate32.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        int int40 = dateTimeZone38.getOffset((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateMidnight dateMidnight41 = localDate32.toDateMidnight(dateTimeZone38);
        long long43 = dateTimeZone38.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology44 = org.joda.time.chrono.ZonedChronology.getInstance(chronology28, dateTimeZone38);
        org.joda.time.DurationField durationField45 = zonedChronology44.eras();
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology44.minuteOfDay();
        org.joda.time.Chronology chronology47 = zonedChronology44.withUTC();
        org.joda.time.DateTimeField dateTimeField48 = zonedChronology44.monthOfYear();
        org.joda.time.DateTimeField dateTimeField49 = zonedChronology44.dayOfYear();
        org.joda.time.DateTimeField dateTimeField50 = zonedChronology44.halfdayOfDay();
        org.joda.time.DateTime dateTime51 = dateTime6.toDateTime((org.joda.time.Chronology) zonedChronology44);
        org.joda.time.DateTimeField dateTimeField52 = zonedChronology44.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime51", (dateTime6.compareTo(dateTime51) == 0) == dateTime6.equals(dateTime51));
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology21.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone25 = zonedChronology21.getZone();
        org.joda.time.Chronology chronology26 = zonedChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.millisOfDay();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.monthOfYear();
        org.joda.time.DurationField durationField29 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField29", Math.signum(durationField22.compareTo(durationField29)) == -Math.signum(durationField29.compareTo(durationField22)));
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 11);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = instant2.toDateTimeISO();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = dateTime9.minusSeconds((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        java.util.TimeZone timeZone20 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(72000000L, dateTimeZone18);
        int int23 = dateTimeZone18.getStandardOffset((long) 'u');
        java.lang.String str25 = dateTimeZone18.getName(1645142400000L);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 11779950, dateTimeZone18);
        org.joda.time.DateTime dateTime27 = dateTime9.withZoneRetainFields(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime6.toMutableDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime28", (instant2.compareTo(mutableDateTime28) == 0) == instant2.equals(mutableDateTime28));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.year();
        org.joda.time.DateTimeZone dateTimeZone24 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.dayOfWeek();
        org.joda.time.DurationField durationField26 = zonedChronology21.weekyears();
        org.joda.time.DurationField durationField27 = zonedChronology21.years();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField26 and durationField27", (durationField26.compareTo(durationField27) == 0) == durationField26.equals(durationField27));
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.eras();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.minuteOfDay();
        org.joda.time.Chronology chronology24 = zonedChronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.monthOfYear();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = zonedChronology21.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.monthOfYear();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.minuteOfDay();
        org.joda.time.DurationField durationField31 = zonedChronology21.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField31, and durationField22", !(durationField22.compareTo(durationField31) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField31.compareTo(durationField22))));
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMonths(11821997);
        int int5 = dateTime2.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 100, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.plusDays(50);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 100, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.plusDays(50);
        int int18 = localDate15.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate20 = localDate15.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        int int23 = dateTimeZone21.getOffset((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateMidnight dateMidnight24 = localDate15.toDateMidnight(dateTimeZone21);
        long long26 = dateTimeZone21.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology27 = org.joda.time.chrono.ZonedChronology.getInstance(chronology11, dateTimeZone21);
        org.joda.time.DurationField durationField28 = zonedChronology27.weeks();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology27.year();
        org.joda.time.DateTimeZone dateTimeZone30 = zonedChronology27.getZone();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology27.weekyear();
        org.joda.time.DurationField durationField32 = zonedChronology27.years();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology27.centuryOfEra();
        org.joda.time.DurationField durationField34 = zonedChronology27.halfdays();
        org.joda.time.DurationField durationField35 = zonedChronology27.millis();
        org.joda.time.DateTime dateTime36 = dateTime2.toDateTime((org.joda.time.Chronology) zonedChronology27);
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology27.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime36", (dateTime2.compareTo(dateTime36) == 0) == dateTime2.equals(dateTime36));
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(53);
        org.joda.time.Chronology chronology5 = localDate2.getChronology();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology5);
        int int7 = dateTime6.getEra();
        int int8 = dateTime6.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 100, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.plusDays(50);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 100, dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.plusDays(50);
        int int21 = localDate18.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate23 = localDate18.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        int int26 = dateTimeZone24.getOffset((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateMidnight dateMidnight27 = localDate18.toDateMidnight(dateTimeZone24);
        long long29 = dateTimeZone24.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology30 = org.joda.time.chrono.ZonedChronology.getInstance(chronology14, dateTimeZone24);
        org.joda.time.DurationField durationField31 = zonedChronology30.weeks();
        org.joda.time.DateTimeField dateTimeField32 = zonedChronology30.weekyear();
        org.joda.time.DurationField durationField33 = zonedChronology30.weekyears();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology30.year();
        org.joda.time.DateTimeZone dateTimeZone35 = zonedChronology30.getZone();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology30.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField37 = zonedChronology30.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology30.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime6.toMutableDateTime((org.joda.time.Chronology) zonedChronology30);
        int int40 = dateTime6.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and mutableDateTime39", (dateTime25.compareTo(mutableDateTime39) == 0) == dateTime25.equals(mutableDateTime39));
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        org.joda.time.DateTime dateTime3 = dateTime0.withYear(11751002);
        org.joda.time.DateTime dateTime6 = dateTime0.withDurationAdded((long) 50, 11826950);
        org.joda.time.DateTime.Property property7 = dateTime0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 100, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(50);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 100, dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.plusDays(50);
        int int20 = localDate17.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate22 = localDate17.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        int int25 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateMidnight dateMidnight26 = localDate17.toDateMidnight(dateTimeZone23);
        long long28 = dateTimeZone23.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology29 = org.joda.time.chrono.ZonedChronology.getInstance(chronology13, dateTimeZone23);
        org.joda.time.DurationField durationField30 = zonedChronology29.weeks();
        org.joda.time.DateTimeField dateTimeField31 = zonedChronology29.year();
        org.joda.time.DateTimeZone dateTimeZone32 = zonedChronology29.getZone();
        org.joda.time.DurationField durationField33 = zonedChronology29.weekyears();
        org.joda.time.DateTimeField dateTimeField34 = zonedChronology29.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology29.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField36 = zonedChronology29.millisOfDay();
        long long40 = zonedChronology29.add((long) 54603212, 0L, 68979002);
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology29.dayOfWeek();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((java.lang.Object) dateTime0, (org.joda.time.Chronology) zonedChronology29);
        org.joda.time.Instant instant43 = new org.joda.time.Instant();
        org.joda.time.Instant instant45 = instant43.withMillis((long) 11);
        org.joda.time.Instant instant46 = instant45.toInstant();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Instant instant48 = instant45.minus(readableDuration47);
        org.joda.time.Instant instant49 = instant45.toInstant();
        org.joda.time.Instant instant51 = instant49.withMillis((long) 59);
        org.joda.time.Instant instant53 = instant49.plus((long) '4');
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.Instant instant56 = instant49.withDurationAdded(readableDuration54, 26425);
        boolean boolean57 = dateTime0.isAfter((org.joda.time.ReadableInstant) instant49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime42", (dateTime24.compareTo(dateTime42) == 0) == dateTime24.equals(dateTime42));
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1354");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.minusMillis((int) '#');
        org.joda.time.DateTime dateTime8 = dateTime6.plusDays(11);
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded((long) 11757696, (int) ' ');
        int int12 = dateTime6.getWeekOfWeekyear();
        int int13 = dateTime6.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        java.util.TimeZone timeZone19 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(72000000L, dateTimeZone17);
        int int22 = dateTimeZone17.getStandardOffset((long) 'u');
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.DateTime dateTime24 = dateTime6.withZone(dateTimeZone17);
        org.joda.time.DateTime.Property property25 = dateTime6.year();
        java.util.Locale locale26 = null;
        int int27 = property25.getMaximumTextLength(locale26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime24", (dateTime6.compareTo(dateTime24) == 0) == dateTime6.equals(dateTime24));
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1355");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology21.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.era();
        org.joda.time.DurationField durationField27 = zonedChronology21.eras();
        org.joda.time.DurationField durationField28 = zonedChronology21.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField27", Math.signum(durationField22.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField22)));
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1356");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        int int2 = dateTime0.getWeekyear();
        int int3 = dateTime0.getWeekyear();
        org.joda.time.DateTime.Property property4 = dateTime0.secondOfDay();
        org.joda.time.DateTime dateTime6 = property4.addToCopy(0);
        org.joda.time.DateTime dateTime7 = property4.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime9 = property4.addToCopy(11776486);
        org.joda.time.DurationField durationField10 = property4.getDurationField();
        org.joda.time.DateTime dateTime11 = property4.getDateTime();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay15 = dateTime14.toTimeOfDay();
        org.joda.time.DateTime.Property property16 = dateTime14.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.roundCeilingCopy();
        org.joda.time.Interval interval18 = property16.toInterval();
        org.joda.time.DateTime dateTime20 = property16.setCopy(11762);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.minusHours((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int25 = dateTime23.get(dateTimeFieldType24);
        org.joda.time.DateTime dateTime27 = dateTime23.minusMillis((int) '#');
        org.joda.time.DateTime dateTime29 = dateTime27.plusDays(11);
        org.joda.time.DateTime dateTime32 = dateTime27.withDurationAdded((long) (byte) 10, 11);
        org.joda.time.DateTime dateTime34 = dateTime27.plusDays(26159400);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime27.getZone();
        org.joda.time.DateTime dateTime36 = dateTime20.withZoneRetainFields(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime11.toMutableDateTime(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 100, dateTimeZone39);
        org.joda.time.LocalDate localDate42 = localDate40.plusDays(50);
        org.joda.time.Chronology chronology43 = localDate42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) 100, dateTimeZone46);
        org.joda.time.LocalDate localDate49 = localDate47.plusDays(50);
        int int50 = localDate47.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate52 = localDate47.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime();
        int int55 = dateTimeZone53.getOffset((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateMidnight dateMidnight56 = localDate47.toDateMidnight(dateTimeZone53);
        long long58 = dateTimeZone53.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology59 = org.joda.time.chrono.ZonedChronology.getInstance(chronology43, dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology59.yearOfCentury();
        org.joda.time.DurationField durationField61 = zonedChronology59.millis();
        org.joda.time.DurationField durationField62 = zonedChronology59.seconds();
        org.joda.time.DateTimeField dateTimeField63 = zonedChronology59.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField64 = zonedChronology59.secondOfMinute();
        org.joda.time.DurationField durationField65 = zonedChronology59.seconds();
        org.joda.time.DateTimeField dateTimeField66 = zonedChronology59.dayOfYear();
        boolean boolean67 = dateTimeField66.isLenient();
        int int68 = mutableDateTime37.get(dateTimeField66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField62", (durationField10.compareTo(durationField62) == 0) == durationField10.equals(durationField62));
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1357");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.centuryOfEra();
        org.joda.time.DurationField durationField24 = zonedChronology21.minutes();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone26 = zonedChronology21.getZone();
        org.joda.time.Chronology chronology27 = zonedChronology21.withUTC();
        java.lang.String str28 = zonedChronology21.toString();
        org.joda.time.DurationField durationField29 = zonedChronology21.millis();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.centuryOfEra();
        org.joda.time.DurationField durationField31 = zonedChronology21.weekyears();
        org.joda.time.DurationField durationField32 = zonedChronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField22, and durationField24", !(durationField32.compareTo(durationField22) == 0) || (Math.signum(durationField32.compareTo(durationField24)) == Math.signum(durationField22.compareTo(durationField24))));
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1358");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.years();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.dayOfMonth();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = zonedChronology21.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField24", (durationField22.compareTo(durationField24) == 0) == durationField22.equals(durationField24));
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1359");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getDayOfYear();
        int int2 = dateTime0.getWeekyear();
        int int3 = dateTime0.getWeekyear();
        org.joda.time.DateTime dateTime5 = dateTime0.withWeekyear(11846850);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.lang.String str9 = dateTimeZone8.getID();
        int int11 = dateTimeZone8.getOffsetFromLocal(27425237L);
        java.lang.String str13 = dateTimeZone8.getName((long) 11889572);
        int int15 = dateTimeZone8.getOffsetFromLocal(26220000L);
        long long18 = dateTimeZone8.adjustOffset((long) 388, true);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime5.toMutableDateTime(dateTimeZone8);
        org.joda.time.DateTime.Property property21 = dateTime5.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime20", (dateTime5.compareTo(mutableDateTime20) == 0) == dateTime5.equals(mutableDateTime20));
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1360");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.weekyear();
        org.joda.time.DurationField durationField24 = zonedChronology21.weekyears();
        long long28 = zonedChronology21.add(0L, 11776486L, 0);
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.secondOfMinute();
        org.joda.time.DurationField durationField30 = zonedChronology21.days();
        org.joda.time.DurationField durationField31 = zonedChronology21.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField22, and durationField24", !(durationField31.compareTo(durationField22) == 0) || (Math.signum(durationField31.compareTo(durationField24)) == Math.signum(durationField22.compareTo(durationField24))));
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1361");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 100, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(50);
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 100, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(50);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate14 = localDate9.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        int int17 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight18 = localDate9.toDateMidnight(dateTimeZone15);
        long long20 = dateTimeZone15.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance(chronology5, dateTimeZone15);
        org.joda.time.DurationField durationField22 = zonedChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField23 = zonedChronology21.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = zonedChronology21.add(readablePeriod24, (long) 2022, 0);
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField29 = zonedChronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = zonedChronology21.weekyearOfCentury();
        org.joda.time.DurationField durationField31 = zonedChronology21.years();
        java.lang.String str32 = durationField31.toString();
        long long35 = durationField31.subtract(1645514212957L, 29);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 100, dateTimeZone37);
        org.joda.time.LocalDate localDate40 = localDate38.plusDays(50);
        org.joda.time.Chronology chronology41 = localDate40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 100, dateTimeZone44);
        org.joda.time.LocalDate localDate47 = localDate45.plusDays(50);
        int int48 = localDate45.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate50 = localDate45.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime();
        int int53 = dateTimeZone51.getOffset((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateMidnight dateMidnight54 = localDate45.toDateMidnight(dateTimeZone51);
        long long56 = dateTimeZone51.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology57 = org.joda.time.chrono.ZonedChronology.getInstance(chronology41, dateTimeZone51);
        org.joda.time.DurationField durationField58 = zonedChronology57.weeks();
        org.joda.time.DateTimeField dateTimeField59 = zonedChronology57.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField60 = zonedChronology57.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone61 = zonedChronology57.getZone();
        org.joda.time.DateTimeField dateTimeField62 = zonedChronology57.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField63 = zonedChronology57.dayOfYear();
        org.joda.time.DurationField durationField64 = zonedChronology57.halfdays();
        int int65 = durationField31.compareTo(durationField64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField22 and durationField58", (durationField22.compareTo(durationField58) == 0) == durationField22.equals(durationField58));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1362");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.Chronology chronology2 = dateTime0.getChronology();
        org.joda.time.DateTime dateTime4 = dateTime0.plusDays(2);
        java.util.Date date5 = dateTime0.toDate();
        java.lang.String str7 = dateTime0.toString("15");
        org.joda.time.DateTime dateTime9 = dateTime0.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 100, dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.plusDays(50);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 100, dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.plusDays(50);
        int int22 = localDate19.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate24 = localDate19.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        int int27 = dateTimeZone25.getOffset((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateMidnight dateMidnight28 = localDate19.toDateMidnight(dateTimeZone25);
        long long30 = dateTimeZone25.convertUTCToLocal(60000L);
        org.joda.time.chrono.ZonedChronology zonedChronology31 = org.joda.time.chrono.ZonedChronology.getInstance(chronology15, dateTimeZone25);
        org.joda.time.DurationField durationField32 = zonedChronology31.weeks();
        org.joda.time.DateTimeField dateTimeField33 = zonedChronology31.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = zonedChronology31.add(readablePeriod34, (long) 2022, 0);
        org.joda.time.DateTimeField dateTimeField38 = zonedChronology31.millisOfDay();
        org.joda.time.DateTimeField dateTimeField39 = zonedChronology31.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField40 = zonedChronology31.year();
        org.joda.time.DateTimeField dateTimeField41 = zonedChronology31.yearOfEra();
        org.joda.time.DateTimeField dateTimeField42 = zonedChronology31.year();
        org.joda.time.DateTimeField dateTimeField43 = zonedChronology31.secondOfDay();
        org.joda.time.DateTimeField dateTimeField44 = zonedChronology31.secondOfMinute();
        org.joda.time.DateTime dateTime45 = dateTime0.toDateTime((org.joda.time.Chronology) zonedChronology31);
        org.joda.time.DateTimeField dateTimeField46 = zonedChronology31.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime45", (dateTime0.compareTo(dateTime45) == 0) == dateTime0.equals(dateTime45));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1363");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 50);
        java.util.TimeZone timeZone4 = dateTimeZone3.toTimeZone();
        java.util.TimeZone timeZone5 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(72000000L, dateTimeZone3);
        int int8 = dateTimeZone3.getStandardOffset((long) 'u');
        java.lang.String str10 = dateTimeZone3.getName(1645142400000L);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.DateTime dateTime12 = dateTime11.withTimeAtStartOfDay();
        org.joda.time.LocalTime localTime13 = dateTime11.toLocalTime();
        org.joda.time.DateTime dateTime15 = dateTime11.withMinuteOfHour(20);
        int int16 = dateTime15.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime15.getZone();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.minusHours((int) (short) 100);
        org.joda.time.TimeOfDay timeOfDay21 = dateTime20.toTimeOfDay();
        org.joda.time.DateTime.Property property22 = dateTime20.yearOfEra();
        org.joda.time.DateTime dateTime24 = dateTime20.plusWeeks(11777610);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTime dateTime26 = dateTime24.withLaterOffsetAtOverlap();
        org.joda.time.DateMidnight dateMidnight27 = dateTime24.toDateMidnight();
        org.joda.time.DateTime dateTime30 = dateTime24.withDurationAdded((long) 18, 49);
        int int31 = dateTime30.getYear();
        org.joda.time.DateTime dateTime33 = dateTime30.plusMonths(11826950);
        boolean boolean34 = dateTime15.isEqual((org.joda.time.ReadableInstant) dateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime18", (dateTime11.compareTo(dateTime18) == 0) == dateTime11.equals(dateTime18));
    }
}

