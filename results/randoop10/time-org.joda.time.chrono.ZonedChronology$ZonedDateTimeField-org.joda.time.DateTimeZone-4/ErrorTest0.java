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
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.weekyear();
        org.joda.time.DurationField durationField4 = chronology1.eras();
        org.joda.time.DurationField durationField5 = chronology1.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField5, and durationField4", !(durationField4.compareTo(durationField5) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField5.compareTo(durationField4))));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DateTime dateTime8 = dateTime4.toDateTime(chronology6);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime8", (dateTime2.compareTo(dateTime8) == 0) == dateTime2.equals(dateTime8));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant4.plus(readableDuration5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.DateTime dateTime5 = instant4.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean6 = instant4.isSupported(dateTimeFieldType5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int7 = instant5.get(dateTimeFieldType6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.weekyear();
        org.joda.time.DurationField durationField4 = chronology1.eras();
        org.joda.time.DurationField durationField5 = chronology1.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField5, and durationField4", !(durationField4.compareTo(durationField5) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField5.compareTo(durationField4))));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        boolean boolean16 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Instant instant18 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime19 = instant18.toMutableDateTimeISO();
        org.joda.time.Instant instant22 = instant18.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime23 = instant18.toDateTimeISO();
        boolean boolean24 = dateTime10.isBefore((org.joda.time.ReadableInstant) dateTime23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and mutableDateTime19", (instant18.compareTo(mutableDateTime19) == 0) == instant18.equals(mutableDateTime19));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.joda.time.Instant instant9 = instant1.withDurationAdded((long) 12, 23);
        org.joda.time.Instant instant12 = instant9.withDurationAdded((long) 2012, 21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.joda.time.Instant instant9 = instant1.withDurationAdded((long) 12, 23);
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfMonth();
        org.joda.time.DateTime dateTime5 = property3.setCopy(11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DateTime dateTime8 = dateTime4.toDateTime(chronology6);
        org.joda.time.Instant instant9 = dateTime4.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime8", (dateTime4.compareTo(dateTime8) == 0) == dateTime4.equals(dateTime8));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        org.joda.time.DateTime dateTime21 = dateTime6.minusYears(2021);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant19", (dateTime16.compareTo(instant19) == 0) == dateTime16.equals(instant19));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = dateTime8.toString(dateTimeFormatter10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant9", (dateTime2.compareTo(instant9) == 0) == dateTime2.equals(instant9));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj1, dateTimeZone2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime3.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.minuteOfDay();
        org.joda.time.DateTime dateTime9 = dateTime5.toDateTime(chronology7);
        boolean boolean10 = dateTimeFieldType0.isSupported(chronology7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime9", (dateTime3.compareTo(dateTime9) == 0) == dateTime3.equals(dateTime9));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
        boolean boolean20 = dateTime6.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant19", (dateTime16.compareTo(instant19) == 0) == dateTime16.equals(instant19));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime22", (dateTime4.compareTo(dateTime22) == 0) == dateTime4.equals(dateTime22));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant1.plus(readableDuration5);
        org.joda.time.DateTime dateTime7 = instant1.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant1", (mutableDateTime2.compareTo(instant1) == 0) == mutableDateTime2.equals(instant1));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withMillisOfDay((int) 'a');
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        int int11 = dateTime9.getYear();
        org.joda.time.DateTime dateTime12 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone15);
        org.joda.time.LocalTime localTime18 = localTime16.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localTime16.toDateTimeToday(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long26 = dateTimeZone21.getMillisKeepLocal(dateTimeZone24, (long) '4');
        org.joda.time.DateTime dateTime27 = dateTime12.toDateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime28 = localTime4.toDateTimeToday(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime27", (dateTime9.compareTo(dateTime27) == 0) == dateTime9.equals(dateTime27));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.joda.time.Instant instant9 = instant1.withDurationAdded((long) 12, 23);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant1.plus(readableDuration10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.plus(readableDuration12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime2", (instant13.compareTo(mutableDateTime2) == 0) == instant13.equals(mutableDateTime2));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        org.joda.time.DateTime dateTime10 = dateTime4.plus(readableDuration9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime8", (dateTime10.compareTo(dateTime8) == 0) == dateTime10.equals(dateTime8));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
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
        org.joda.time.DateTimeField dateTimeField12 = chronology8.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime11", (dateTime1.compareTo(dateTime11) == 0) == dateTime1.equals(dateTime11));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime8", (dateTime2.compareTo(dateTime8) == 0) == dateTime2.equals(dateTime8));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
        org.joda.time.DurationField durationField17 = chronology12.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime16", (dateTime4.compareTo(dateTime16) == 0) == dateTime4.equals(dateTime16));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Chronology chronology3 = instant1.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        java.util.Date date5 = instant1.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant1", (dateTime2.compareTo(instant1) == 0) == dateTime2.equals(instant1));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant7 = instant1.withDurationAdded(readableDuration5, 0);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant7.plus(readableDuration8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime2", (instant9.compareTo(mutableDateTime2) == 0) == instant9.equals(mutableDateTime2));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
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
        org.joda.time.DateTimeField dateTimeField29 = chronology22.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant1.plus(readableDuration5);
        org.joda.time.Instant instant9 = instant1.withDurationAdded((long) 66514, 86399999);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant1", (mutableDateTime2.compareTo(instant1) == 0) == mutableDateTime2.equals(instant1));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
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
        org.joda.time.DateTimeField dateTimeField29 = chronology22.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant7 = instant5.plus(readableDuration6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant7 = instant1.withDurationAdded(readableDuration5, 0);
        org.joda.time.MutableDateTime mutableDateTime8 = instant1.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant1", (mutableDateTime2.compareTo(instant1) == 0) == mutableDateTime2.equals(instant1));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Chronology chronology3 = instant1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Chronology chronology3 = instant1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Instant instant3 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant1.plus(readableDuration4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant5", (dateTime2.compareTo(instant5) == 0) == dateTime2.equals(instant5));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
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
        org.joda.time.LocalDate localDate20 = dateTime6.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant19", (dateTime16.compareTo(instant19) == 0) == dateTime16.equals(instant19));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 66514657);
        org.joda.time.DateTime dateTime6 = instant5.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime2", (instant5.compareTo(dateTime2) == 0) == instant5.equals(dateTime2));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        java.lang.String str4 = chronology1.toString();
        org.joda.time.DurationField durationField5 = chronology1.weeks();
        org.joda.time.DurationField durationField6 = chronology1.eras();
        org.joda.time.DateTimeField dateTimeField7 = chronology1.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField6", Math.signum(durationField5.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField5)));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        int int21 = localDate19.getDayOfWeek();
        boolean boolean23 = localDate19.equals((java.lang.Object) 2022);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str26 = dateTimeZone24.getNameKey(0L);
        org.joda.time.DateTime dateTime27 = localDate19.toDateTimeAtStartOfDay(dateTimeZone24);
        org.joda.time.DateTime.Property property28 = dateTime27.era();
        int int29 = dateTime18.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime18", (dateTime4.compareTo(dateTime18) == 0) == dateTime4.equals(dateTime18));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant2 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTimeISO();
        org.joda.time.Instant instant6 = instant2.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime7 = instant2.toDateTimeISO();
        boolean boolean8 = dateTime0.isAfter((org.joda.time.ReadableInstant) dateTime7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime3", (instant2.compareTo(mutableDateTime3) == 0) == instant2.equals(mutableDateTime3));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusHours(8);
        org.joda.time.Instant instant12 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime13 = instant12.toDateTimeISO();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfMonth();
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter17.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withZoneUTC();
        org.joda.time.Chronology chronology20 = dateTimeFormatter19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone22);
        org.joda.time.LocalTime localTime25 = localTime23.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localTime23.toDateTimeToday(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime27.getZone();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime32 = dateTime30.minusMinutes((int) (short) 100);
        int int33 = dateTimeZone28.getOffset((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter19.withZone(dateTimeZone28);
        java.lang.String str36 = dateTimeZone28.getShortName((long) 10);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime38 = dateTime13.toDateTime(dateTimeZone28);
        int int39 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime38", (instant12.compareTo(dateTime38) == 0) == instant12.equals(dateTime38));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
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
        org.joda.time.DurationField durationField29 = chronology22.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.joda.time.Instant instant9 = instant1.withDurationAdded((long) 12, 23);
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusSeconds((int) (byte) 1);
        org.joda.time.LocalDate localDate6 = dateTime5.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.minuteOfDay();
        boolean boolean5 = durationFieldType1.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.eras();
        org.joda.time.DurationField durationField7 = durationFieldType0.getField(chronology3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField7, and durationField6", !(durationField6.compareTo(durationField7) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField7.compareTo(durationField6))));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant7 = instant1.withDurationAdded(readableDuration5, 0);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime2", (instant7.compareTo(mutableDateTime2) == 0) == instant7.equals(mutableDateTime2));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.joda.time.Instant instant9 = instant1.withDurationAdded((long) 12, 23);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant1.plus(readableDuration10);
        org.joda.time.Instant instant13 = instant11.plus(1646723760165L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime2", (instant11.compareTo(mutableDateTime2) == 0) == instant11.equals(mutableDateTime2));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        java.lang.Class<?> wildcardClass29 = chronology22.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
        org.joda.time.DateTime dateTime15 = dateTime13.minus((long) 1649);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime11", (dateTime1.compareTo(dateTime11) == 0) == dateTime1.equals(dateTime11));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
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
        org.joda.time.DateTime.Property property19 = dateTime16.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime16", (dateTime4.compareTo(dateTime16) == 0) == dateTime4.equals(dateTime16));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withZoneUTC();
        org.joda.time.Chronology chronology15 = dateTimeFormatter14.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone17);
        org.joda.time.LocalTime localTime20 = localTime18.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localTime18.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime22.getZone();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime27 = dateTime25.minusMinutes((int) (short) 100);
        int int28 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter14.withZone(dateTimeZone23);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) dateTimePrinter7, dateTimeZone23);
        org.joda.time.DateTime dateTime31 = dateTime6.toDateTime(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        java.lang.Object obj2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(obj2, dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property7 = dateTime6.weekyear();
        long long8 = dateTime6.getMillis();
        org.joda.time.DateTime.Property property9 = dateTime6.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime6, dateTimeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime1.toMutableDateTime(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime15", (dateTime4.compareTo(dateTime15) == 0) == dateTime4.equals(dateTime15));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        java.lang.Object obj29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(obj29, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.withWeekOfWeekyear((int) (byte) 10);
        int int34 = dateTime33.getYear();
        boolean boolean35 = dateTime28.isEqual((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property36 = dateTime33.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.weekyear();
        long long12 = dateTime10.getMillis();
        org.joda.time.DateTime dateTime14 = dateTime10.withCenturyOfEra(1);
        boolean boolean15 = instant5.isAfter((org.joda.time.ReadableInstant) dateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Instant instant3 = instant1.toInstant();
        org.joda.time.Instant instant6 = instant1.withDurationAdded((long) 2024, 11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant1", (dateTime2.compareTo(instant1) == 0) == dateTime2.equals(instant1));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        java.lang.String[] strArray54 = new java.lang.String[] { "22", "", "22", "en-CA", "16", "16", "French", "1", "en-CA", "24", "0", "en-CA", "hi!", "1", "2022", "zho", "0", "", "ISOChronology[UTC]" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        java.util.Locale.LanguageRange[] languageRangeArray57 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList58 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58, languageRangeArray57);
        java.util.Locale[] localeArray60 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList61 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList61, localeArray60);
        java.util.Locale.FilteringMode filteringMode63 = null;
        java.util.List<java.util.Locale> localeList64 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, (java.util.Collection<java.util.Locale>) localeList61, filteringMode63);
        boolean boolean65 = strSet55.removeAll((java.util.Collection<java.util.Locale>) localeList61);
        boolean boolean66 = strSet18.removeAll((java.util.Collection<java.util.Locale>) localeList61);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone68);
        org.joda.time.LocalTime localTime71 = localTime69.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.DateTime dateTime73 = localTime69.toDateTimeToday(dateTimeZone72);
        boolean boolean75 = dateTime73.isAfter((long) 2);
        org.joda.time.DateTime dateTime77 = dateTime73.minusDays(1);
        org.joda.time.DateTime dateTime79 = dateTime73.minusHours((-1));
        java.lang.String str80 = dateTime73.toString();
        org.joda.time.DateTimeZone dateTimeZone82 = null;
        org.joda.time.LocalTime localTime83 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone82);
        org.joda.time.LocalTime localTime85 = localTime83.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.DateTime dateTime87 = localTime83.toDateTimeToday(dateTimeZone86);
        org.joda.time.DateTimeZone dateTimeZone88 = dateTime87.getZone();
        org.joda.time.DateTimeZone dateTimeZone91 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long93 = dateTimeZone88.getMillisKeepLocal(dateTimeZone91, (long) '4');
        org.joda.time.DateTime dateTime94 = dateTime73.toDateTime(dateTimeZone88);
        boolean boolean95 = strSet18.equals((java.lang.Object) dateTime73);
        org.joda.time.Instant instant96 = dateTime73.toInstant();
        int int97 = dateTime73.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime87 and instant96", (dateTime87.compareTo(instant96) == 0) == dateTime87.equals(instant96));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
        int int27 = dateTime14.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and mutableDateTime26", (mutableDateTime15.compareTo(mutableDateTime26) == 0) == mutableDateTime15.equals(mutableDateTime26));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        int int15 = dateTime4.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime14", (dateTime4.compareTo(dateTime14) == 0) == dateTime4.equals(dateTime14));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
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
        int int41 = dateTime40.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
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
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant33.plus(readableDuration34);
        org.joda.time.Instant instant36 = instant33.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant36", (dateTime31.compareTo(instant36) == 0) == dateTime31.equals(instant36));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfMonth();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.Chronology chronology9 = dateTimeFormatter8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime16.getZone();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime21 = dateTime19.minusMinutes((int) (short) 100);
        int int22 = dateTimeZone17.getOffset((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter8.withZone(dateTimeZone17);
        java.lang.String str25 = dateTimeZone17.getShortName((long) 10);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime27 = dateTime2.toDateTime(dateTimeZone17);
        int int28 = dateTime27.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime27", (instant1.compareTo(dateTime27) == 0) == instant1.equals(dateTime27));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DurationField durationField5 = chronology2.halfdays();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        java.lang.String str7 = chronology2.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField6", Math.signum(durationField5.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField5)));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DateTime dateTime4 = instant2.toDateTime();
        long long5 = instant2.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime4", (instant2.compareTo(dateTime4) == 0) == instant2.equals(dateTime4));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.joda.time.Instant instant9 = instant1.withDurationAdded((long) 12, 23);
        org.joda.time.Instant instant10 = instant9.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
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
        java.util.Locale locale22 = new java.util.Locale("hi!", "", "");
        java.lang.String str23 = locale22.getDisplayScript();
        java.util.Locale locale27 = new java.util.Locale("hi!", "", "");
        java.lang.String str28 = locale22.getDisplayScript(locale27);
        java.lang.String str29 = locale22.getISO3Language();
        boolean boolean30 = dateTime16.equals((java.lang.Object) str29);
        org.joda.time.DateTime dateTime32 = dateTime16.withMillis(1646723799801L);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.minus(readablePeriod35);
        org.joda.time.DateTime.Property property37 = dateTime34.millisOfSecond();
        org.joda.time.DateTime dateTime38 = dateTime34.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology41 = localDate40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.yearOfCentury();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 32769, chronology41);
        org.joda.time.DateTime dateTime44 = dateTime38.toDateTime(chronology41);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime32.toMutableDateTime(chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime44", (dateTime6.compareTo(dateTime44) == 0) == dateTime6.equals(dateTime44));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        org.joda.time.DateTime.Property property14 = dateTime13.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime11", (dateTime1.compareTo(dateTime11) == 0) == dateTime1.equals(dateTime11));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        org.joda.time.DateTimeField dateTimeField15 = chronology9.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime14", (dateTime4.compareTo(dateTime14) == 0) == dateTime4.equals(dateTime14));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 66514657);
        org.joda.time.Instant instant7 = instant5.plus(1646092800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime2", (instant5.compareTo(dateTime2) == 0) == instant5.equals(dateTime2));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant4.minus(readableDuration5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, (-2181646));
        long long6 = instant1.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant1", (dateTime2.compareTo(instant1) == 0) == dateTime2.equals(instant1));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        java.lang.String str4 = chronology1.toString();
        org.joda.time.DurationField durationField5 = chronology1.weeks();
        org.joda.time.DurationField durationField6 = chronology1.eras();
        org.joda.time.DateTimeField dateTimeField7 = chronology1.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField6", Math.signum(durationField5.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField5)));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        int int20 = dateTime6.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant19", (dateTime16.compareTo(instant19) == 0) == dateTime16.equals(instant19));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        java.lang.Class<?> wildcardClass19 = dateTime6.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant18", (dateTime6.compareTo(instant18) == 0) == dateTime6.equals(instant18));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime2.minusDays((int) (short) 100);
        org.joda.time.DateTime dateTime8 = dateTime2.plusMinutes(86399);
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withYear(7);
        int int14 = dateTime13.getMonthOfYear();
        int int15 = dateTime13.getDayOfMonth();
        boolean boolean16 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.minuteOfDay();
        boolean boolean21 = durationFieldType17.isSupported(chronology19);
        org.joda.time.DateTimeField dateTimeField22 = chronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology19.getZone();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.DateTimeField dateTimeField26 = chronology19.hourOfDay();
        org.joda.time.DurationField durationField27 = chronology19.halfdays();
        org.joda.time.DateTime dateTime28 = dateTime2.toDateTime(chronology19);
        org.joda.time.DurationField durationField29 = chronology19.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime28", (dateTime2.compareTo(dateTime28) == 0) == dateTime2.equals(dateTime28));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        java.lang.Object obj29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(obj29, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.withWeekOfWeekyear((int) (byte) 10);
        int int34 = dateTime33.getYear();
        boolean boolean35 = dateTime28.isEqual((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property36 = dateTime33.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        int int27 = dateTime14.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and mutableDateTime26", (mutableDateTime15.compareTo(mutableDateTime26) == 0) == mutableDateTime15.equals(mutableDateTime26));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant4.plus(readableDuration5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime2", (instant6.compareTo(dateTime2) == 0) == instant6.equals(dateTime2));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime8.toMutableDateTime();
        int int35 = dateTime8.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and mutableDateTime34", (dateTime28.compareTo(mutableDateTime34) == 0) == dateTime28.equals(mutableDateTime34));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeField dateTimeField3 = chronology1.monthOfYear();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = chronology1.add(readablePeriod5, (long) 435, (int) 'a');
        org.joda.time.DateTimeField dateTimeField9 = chronology1.millisOfSecond();
        java.lang.String str10 = chronology1.toString();
        org.joda.time.DurationField durationField11 = chronology1.eras();
        org.joda.time.DurationField durationField12 = chronology1.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField12, and durationField11", !(durationField11.compareTo(durationField12) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField12.compareTo(durationField11))));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTime();
        org.joda.time.Instant instant6 = instant1.withDurationAdded((long) '4', 0);
        org.joda.time.MutableDateTime mutableDateTime7 = instant1.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant1", (mutableDateTime2.compareTo(instant1) == 0) == mutableDateTime2.equals(instant1));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        boolean boolean14 = dateTime13.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime11", (dateTime1.compareTo(dateTime11) == 0) == dateTime1.equals(dateTime11));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        int int10 = dateTime6.getMonthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime6.toMutableDateTimeISO();
        org.joda.time.Instant instant13 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime14 = instant13.toDateTimeISO();
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfMonth();
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter18.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter18.withZoneUTC();
        org.joda.time.Chronology chronology21 = dateTimeFormatter20.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone23);
        org.joda.time.LocalTime localTime26 = localTime24.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localTime24.toDateTimeToday(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime28.getZone();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime33 = dateTime31.minusMinutes((int) (short) 100);
        int int34 = dateTimeZone29.getOffset((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter20.withZone(dateTimeZone29);
        java.lang.String str37 = dateTimeZone29.getShortName((long) 10);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime39 = dateTime14.toDateTime(dateTimeZone29);
        boolean boolean40 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime39", (instant13.compareTo(dateTime39) == 0) == instant13.equals(dateTime39));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.minuteOfDay();
        boolean boolean16 = durationFieldType12.isSupported(chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.millisOfSecond();
        java.lang.String str18 = chronology14.toString();
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime5.toMutableDateTime(chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime11", (dateTime5.compareTo(dateTime11) == 0) == dateTime5.equals(dateTime11));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant9.plus(readableDuration10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime8", (dateTime2.compareTo(dateTime8) == 0) == dateTime2.equals(dateTime8));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
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
        org.joda.time.Chronology chronology41 = chronology31.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTime();
        org.joda.time.Instant instant6 = instant1.withDurationAdded((long) '4', 0);
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime2", (instant6.compareTo(mutableDateTime2) == 0) == instant6.equals(mutableDateTime2));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
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
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime15", (dateTime3.compareTo(dateTime15) == 0) == dateTime3.equals(dateTime15));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusMinutes(26175799);
        org.joda.time.Instant instant5 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTimeISO();
        boolean boolean7 = localDateTime0.equals((java.lang.Object) instant5);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime0.plus(readableDuration8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime6", (instant5.compareTo(mutableDateTime6) == 0) == instant5.equals(mutableDateTime6));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfMonth();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.Chronology chronology9 = dateTimeFormatter8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime16.getZone();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime21 = dateTime19.minusMinutes((int) (short) 100);
        int int22 = dateTimeZone17.getOffset((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter8.withZone(dateTimeZone17);
        java.lang.String str25 = dateTimeZone17.getShortName((long) 10);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime27 = dateTime2.toDateTime(dateTimeZone17);
        org.joda.time.DateTime.Property property28 = dateTime27.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime27", (instant1.compareTo(dateTime27) == 0) == instant1.equals(dateTime27));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime2.minusDays((int) (short) 100);
        org.joda.time.DateTime dateTime8 = dateTime2.plusMinutes(86399);
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withYear(7);
        int int14 = dateTime13.getMonthOfYear();
        int int15 = dateTime13.getDayOfMonth();
        boolean boolean16 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.minuteOfDay();
        boolean boolean21 = durationFieldType17.isSupported(chronology19);
        org.joda.time.DateTimeField dateTimeField22 = chronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology19.getZone();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.DateTimeField dateTimeField26 = chronology19.hourOfDay();
        org.joda.time.DurationField durationField27 = chronology19.halfdays();
        org.joda.time.DateTime dateTime28 = dateTime2.toDateTime(chronology19);
        org.joda.time.DateTimeZone dateTimeZone29 = chronology19.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime28", (dateTime2.compareTo(dateTime28) == 0) == dateTime2.equals(dateTime28));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        java.lang.String str19 = dateTime16.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime16", (dateTime4.compareTo(dateTime16) == 0) == dateTime4.equals(dateTime16));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.Instant instant7 = instant4.withDurationAdded(0L, 26171150);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime2", (instant7.compareTo(dateTime2) == 0) == instant7.equals(dateTime2));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYear(22);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusDays(6);
        int int27 = localDateTime26.getDayOfYear();
        org.joda.time.Chronology chronology28 = localDateTime26.getChronology();
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.yearOfCentury();
        org.joda.time.LocalDateTime.Property property30 = localDateTime26.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property30.getFieldType();
        boolean boolean32 = dateTime3.isSupported(dateTimeFieldType31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime15", (dateTime3.compareTo(dateTime15) == 0) == dateTime3.equals(dateTime15));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((long) 12, 80982);
        org.joda.time.Instant instant7 = instant1.plus((long) (-1108));
        org.joda.time.Instant instant9 = instant7.minus(62135596800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.minuteOfDay();
        org.joda.time.DurationField durationField23 = chronology20.days();
        org.joda.time.Chronology chronology24 = chronology20.withUTC();
        org.joda.time.DateTime dateTime25 = dateTime16.withChronology(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime25", (dateTime16.compareTo(dateTime25) == 0) == dateTime16.equals(dateTime25));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.joda.time.Instant instant9 = instant1.withDurationAdded((long) 12, 23);
        org.joda.time.Chronology chronology10 = instant9.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.joda.time.Instant instant9 = instant1.withDurationAdded((long) 12, 23);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant1.plus(readableDuration10);
        org.joda.time.DateTime dateTime12 = instant11.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime2", (instant11.compareTo(mutableDateTime2) == 0) == instant11.equals(mutableDateTime2));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.minuteOfDay();
        boolean boolean27 = durationFieldType23.isSupported(chronology25);
        org.joda.time.DurationField durationField28 = chronology25.eras();
        java.lang.Object obj29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(obj29, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property34 = dateTime33.weekyear();
        org.joda.time.DateTime dateTime35 = property34.roundCeilingCopy();
        org.joda.time.DurationField durationField36 = property34.getDurationField();
        boolean boolean37 = durationField36.isSupported();
        long long40 = durationField36.add(0L, 0);
        long long43 = durationField36.add(1646723762055L, 1L);
        long long46 = durationField36.getMillis(2024, (long) 86399);
        int int49 = durationField36.getDifference(31556952000L, 1646723770045L);
        long long52 = durationField36.getMillis((long) 11, 1646723758993L);
        int int53 = durationField28.compareTo(durationField36);
        boolean boolean54 = calendar22.before((java.lang.Object) durationField36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField28", Math.signum(durationField16.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField16)));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime7 = property5.addToCopy(9);
        java.lang.Object obj8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj8, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYear(7);
        int int13 = dateTime12.getMonthOfYear();
        int int14 = dateTime12.getDayOfMonth();
        int int15 = property5.compareTo((org.joda.time.ReadableInstant) dateTime12);
        java.lang.Object obj16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj16, dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property21 = dateTime20.weekyear();
        int int22 = property21.getMaximumValue();
        org.joda.time.DateTime dateTime23 = property21.roundCeilingCopy();
        org.joda.time.DateTime dateTime25 = property21.addWrapFieldToCopy((int) 'a');
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.minuteOfDay();
        boolean boolean30 = durationFieldType26.isSupported(chronology28);
        org.joda.time.DateTimeField dateTimeField31 = chronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField32 = chronology28.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = chronology28.getZone();
        org.joda.time.DateTimeField dateTimeField34 = chronology28.halfdayOfDay();
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime25.toMutableDateTime(chronology28);
        org.joda.time.DateTime dateTime36 = dateTime12.toDateTime(chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and mutableDateTime35", (dateTime25.compareTo(mutableDateTime35) == 0) == dateTime25.equals(mutableDateTime35));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DateTime dateTime8 = dateTime4.toDateTime(chronology6);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime8", (dateTime2.compareTo(dateTime8) == 0) == dateTime2.equals(dateTime8));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        java.lang.String str4 = chronology1.toString();
        org.joda.time.DurationField durationField5 = chronology1.weeks();
        org.joda.time.DurationField durationField6 = chronology1.eras();
        org.joda.time.DurationField durationField7 = chronology1.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField6", Math.signum(durationField5.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField5)));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        org.joda.time.Instant instant24 = instant22.plus(readableDuration23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant24", (dateTime6.compareTo(instant24) == 0) == dateTime6.equals(instant24));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        int int15 = dateTimeField12.get((long) 66548193);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = property5.getMaximumValue();
        org.joda.time.DateTime dateTime7 = property5.roundCeilingCopy();
        org.joda.time.DateTime dateTime9 = property5.addWrapFieldToCopy((int) 'a');
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.minuteOfDay();
        boolean boolean14 = durationFieldType10.isSupported(chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology12.getZone();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.halfdayOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime9.toMutableDateTime(chronology12);
        org.joda.time.DateTimeField dateTimeField20 = chronology12.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime19", (dateTime9.compareTo(mutableDateTime19) == 0) == dateTime9.equals(mutableDateTime19));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        org.joda.time.DateTime dateTime17 = dateTime16.toDateTime();
        boolean boolean19 = dateTime17.equals((java.lang.Object) 1645514262635L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime17", (dateTime4.compareTo(dateTime17) == 0) == dateTime4.equals(dateTime17));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        org.joda.time.DateTime dateTime19 = dateTime6.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant18", (dateTime19.compareTo(instant18) == 0) == dateTime19.equals(instant18));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
        org.joda.time.DurationField durationField43 = chronology36.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField43 and durationField42", Math.signum(durationField43.compareTo(durationField42)) == -Math.signum(durationField42.compareTo(durationField43)));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DurationField durationField5 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.millisOfDay();
        org.joda.time.DurationField durationField7 = chronology2.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField7, and durationField5", !(durationField5.compareTo(durationField7) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField7.compareTo(durationField5))));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfMonth();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.Chronology chronology9 = dateTimeFormatter8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime16.getZone();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime21 = dateTime19.minusMinutes((int) (short) 100);
        int int22 = dateTimeZone17.getOffset((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter8.withZone(dateTimeZone17);
        java.lang.String str25 = dateTimeZone17.getShortName((long) 10);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime27 = dateTime2.toDateTime(dateTimeZone17);
        java.util.TimeZone timeZone28 = dateTimeZone17.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        java.util.Calendar.Builder builder5 = builder3.setLenient(false);
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("yearOfCentury");
        java.util.Calendar.Builder builder8 = builder3.setLocale(locale7);
        java.util.Calendar calendar9 = builder8.build();
        java.util.Calendar.Builder builder14 = builder8.setTimeOfDay(23, 194, 2012, 213120000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar9", (calendar1.compareTo(calendar9) == 0) == calendar1.equals(calendar9));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.minusWeeks(34320);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime13", (dateTime2.compareTo(dateTime13) == 0) == dateTime2.equals(dateTime13));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) ' ');
        org.joda.time.LocalTime localTime6 = localTime4.plusSeconds((int) (byte) 1);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfSecond();
        org.joda.time.LocalTime localTime8 = property7.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone10);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localTime11.toDateTimeToday(dateTimeZone14);
        boolean boolean17 = dateTime15.isAfter((long) 2);
        org.joda.time.DateTime dateTime19 = dateTime15.minusDays(1);
        org.joda.time.DateTime dateTime21 = dateTime15.minusHours((-1));
        int int22 = dateTime21.getDayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime21.plusMillis((int) '4');
        org.joda.time.DateTime.Property property25 = dateTime21.weekOfWeekyear();
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("0");
        java.util.Locale locale28 = locale27.stripExtensions();
        java.lang.String str29 = property25.getAsShortText(locale28);
        java.lang.String str30 = property7.getAsText(locale28);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone32);
        org.joda.time.LocalTime localTime35 = localTime33.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localTime33.toDateTimeToday(dateTimeZone36);
        int int38 = dateTime37.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int40 = dateTime37.get(dateTimeFieldType39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone42);
        org.joda.time.LocalTime localTime45 = localTime43.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localTime43.toDateTimeToday(dateTimeZone46);
        int int48 = dateTime37.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime.Property property49 = dateTime37.millisOfSecond();
        org.joda.time.Instant instant50 = dateTime37.toInstant();
        org.joda.time.Instant instant52 = instant50.minus((long) 8);
        boolean boolean53 = locale28.equals((java.lang.Object) instant52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant50", (dateTime15.compareTo(instant50) == 0) == dateTime15.equals(instant50));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = chronology1.weeks();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(chronology1);
        org.joda.time.DateTimeField dateTimeField5 = chronology1.secondOfDay();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        int int8 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate10 = localDate6.plusMonths((int) '4');
        org.joda.time.LocalDate localDate12 = localDate10.withWeekyear(436);
        int int13 = localDate10.getDayOfMonth();
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
        int int28 = localDate27.getEra();
        java.util.Locale locale32 = new java.util.Locale("24", "hi!");
        java.lang.String str33 = locale32.getCountry();
        java.lang.String str34 = localDate27.toString("+00:00:00.435", locale32);
        java.lang.String str35 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate10, 38, locale32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime17", (dateTime4.compareTo(dateTime17) == 0) == dateTime4.equals(dateTime17));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        org.joda.time.DateTime dateTime42 = dateTime40.plus(13727318400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        java.util.Locale locale43 = locale39.stripExtensions();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime17", (dateTime6.compareTo(dateTime17) == 0) == dateTime6.equals(dateTime17));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) (short) 100);
        int int18 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter4.withZone(dateTimeZone13);
        java.lang.String str20 = dateTimeZone13.toString();
        long long22 = dateTimeZone13.convertUTCToLocal((-19819295999995L));
        java.lang.Object obj23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj23, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property28 = dateTime27.yearOfEra();
        org.joda.time.Instant instant29 = dateTime27.toInstant();
        boolean boolean30 = dateTimeZone13.equals((java.lang.Object) dateTime27);
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and instant29", (dateTime27.compareTo(instant29) == 0) == dateTime27.equals(instant29));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
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
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant33.plus(readableDuration34);
        org.joda.time.Instant instant37 = instant35.minus(1646723755047L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant35", (dateTime31.compareTo(instant35) == 0) == dateTime31.equals(instant35));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        java.util.Calendar.Builder builder5 = builder3.setLenient(false);
        java.util.Calendar calendar6 = builder3.build();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYear(22);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusDays(6);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.plusMillis(26171150);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minus(readableDuration21);
        org.joda.time.DateTime dateTime23 = localDateTime20.toDateTime();
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.lang.String str25 = locale24.getCountry();
        java.util.Calendar calendar26 = dateTime23.toCalendar(locale24);
        java.util.Calendar.Builder builder27 = builder3.setLocale(locale24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar6", (calendar1.compareTo(calendar6) == 0) == calendar1.equals(calendar6));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        org.joda.time.DateTime.Property property19 = dateTime6.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant18", (dateTime17.compareTo(instant18) == 0) == dateTime17.equals(instant18));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        boolean boolean24 = dateTime7.isBefore(78513478L);
        org.joda.time.DateTime dateTime26 = dateTime7.plusWeeks(66571079);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        int int29 = localDate27.getDayOfWeek();
        boolean boolean31 = localDate27.equals((java.lang.Object) 2022);
        java.lang.Object obj32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(obj32, dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property37 = dateTime36.weekyear();
        int int38 = dateTime36.getYear();
        org.joda.time.DateTime dateTime39 = dateTime36.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.hours();
        boolean boolean42 = localDate40.isSupported(durationFieldType41);
        int int43 = localDate40.size();
        org.joda.time.DateTime dateTime44 = dateTime39.withFields((org.joda.time.ReadablePartial) localDate40);
        org.joda.time.LocalDate localDate46 = localDate40.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int48 = localDate40.get(dateTimeFieldType47);
        org.joda.time.LocalDate localDate50 = localDate40.minusYears((int) 'a');
        int int51 = localDate27.compareTo((org.joda.time.ReadablePartial) localDate40);
        org.joda.time.LocalDate.Property property52 = localDate40.era();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        int int55 = localDate53.getDayOfWeek();
        org.joda.time.LocalDate localDate57 = localDate53.minusYears(10);
        int[] intArray58 = localDate53.getValues();
        org.joda.time.LocalDate.Property property59 = localDate53.era();
        org.joda.time.LocalDate localDate60 = property59.roundCeilingCopy();
        org.joda.time.LocalDate localDate62 = property59.addWrapFieldToCopy((-292275054));
        org.joda.time.LocalDate localDate63 = property59.getLocalDate();
        org.joda.time.LocalDate localDate65 = localDate63.withYear(34);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = localDate65.getFieldType(0);
        boolean boolean68 = localDate40.isSupported(dateTimeFieldType67);
        int int69 = dateTime26.get(dateTimeFieldType67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime22", (dateTime4.compareTo(dateTime22) == 0) == dateTime4.equals(dateTime22));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime25 = localTime23.minusMillis(0);
        org.joda.time.LocalTime localTime27 = localTime23.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime localTime29 = localTime23.minusMinutes(11);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone31);
        org.joda.time.LocalTime localTime34 = localTime32.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localTime32.toDateTimeToday(dateTimeZone35);
        int int37 = dateTime36.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int39 = dateTime36.get(dateTimeFieldType38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone41);
        org.joda.time.LocalTime localTime44 = localTime42.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = localTime42.toDateTimeToday(dateTimeZone45);
        int int47 = dateTime36.compareTo((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime.Property property48 = dateTime36.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = dateTime36.withZone(dateTimeZone49);
        org.joda.time.DateTime.Property property51 = dateTime36.hourOfDay();
        org.joda.time.DateTime dateTime52 = localTime23.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        int int53 = dateTimeZone19.getOffset((org.joda.time.ReadableInstant) dateTime52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime22", (dateTime4.compareTo(dateTime22) == 0) == dateTime4.equals(dateTime22));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.joda.time.Instant instant9 = instant1.withDurationAdded((long) 12, 23);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant1.plus(readableDuration10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean13 = instant11.isSupported(dateTimeFieldType12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime2", (instant11.compareTo(mutableDateTime2) == 0) == instant11.equals(mutableDateTime2));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
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
        org.joda.time.Instant instant19 = dateTime16.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime16", (dateTime4.compareTo(dateTime16) == 0) == dateTime4.equals(dateTime16));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        org.joda.time.Chronology chronology27 = chronology17.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and mutableDateTime26", (dateTime14.compareTo(mutableDateTime26) == 0) == dateTime14.equals(mutableDateTime26));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.yearOfEra();
        org.joda.time.LocalDate localDate12 = localDate9.minusDays((int) '#');
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.DateTime dateTime14 = property5.withMaximumValue();
        int int15 = dateTime14.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.String str17 = dateTimeFieldType16.toString();
        boolean boolean18 = dateTime14.isSupported(dateTimeFieldType16);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime14.plus(readablePeriod19);
        java.lang.Object obj21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj21, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property26 = dateTime25.weekyear();
        long long27 = dateTime25.getMillis();
        org.joda.time.DateTime.Property property28 = dateTime25.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime25, dateTimeZone31);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime36 = dateTime14.toDateTime(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime34", (dateTime2.compareTo(dateTime34) == 0) == dateTime2.equals(dateTime34));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DurationField durationField3 = chronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.secondOfMinute();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        int int8 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate10 = localDate6.minusMonths(32770);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property16 = dateTime15.weekyear();
        org.joda.time.DateTime dateTime17 = property16.roundCeilingCopy();
        org.joda.time.DateTime dateTime19 = dateTime17.withCenturyOfEra((int) ' ');
        java.lang.Object obj20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj20, dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property25 = dateTime24.weekyear();
        java.lang.String str26 = property25.getAsText();
        org.joda.time.DurationField durationField27 = property25.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property25.getFieldType();
        java.lang.String str29 = dateTimeFieldType28.toString();
        boolean boolean30 = dateTime19.isSupported(dateTimeFieldType28);
        org.joda.time.LocalDate.Property property31 = localDate6.property(dateTimeFieldType28);
        org.joda.time.DateTimeField dateTimeField32 = property31.getField();
        org.joda.time.DurationField durationField33 = property31.getLeapDurationField();
        org.joda.time.LocalDate localDate34 = property31.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.weekyear();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology40 = localDate39.getChronology();
        int int41 = localDate39.getDayOfWeek();
        org.joda.time.LocalDate localDate43 = localDate39.minusYears(10);
        int[] intArray44 = localDate39.getValues();
        org.joda.time.LocalDate.Property property45 = localDate39.era();
        org.joda.time.LocalDate localDate47 = localDate39.minusYears(2012);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDate localDate49 = localDate39.plus(readablePeriod48);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology51 = localDate50.getChronology();
        int int52 = localDate50.getDayOfWeek();
        org.joda.time.LocalDate localDate54 = localDate50.minusYears(10);
        int[] intArray55 = localDate50.getValues();
        int int56 = dateTimeField38.getMaximumValue((org.joda.time.ReadablePartial) localDate49, intArray55);
        chronology1.validate((org.joda.time.ReadablePartial) localDate34, intArray55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField27", (durationField3.compareTo(durationField27) == 0) == durationField3.equals(durationField27));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1646723810496L);
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZoneUTC();
        org.joda.time.Chronology chronology7 = dateTimeFormatter6.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone9);
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localTime10.toDateTimeToday(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes((int) (short) 100);
        int int20 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter6.withZone(dateTimeZone15);
        java.lang.String str22 = dateTimeZone15.toString();
        long long24 = dateTimeZone15.convertUTCToLocal((-19819295999995L));
        java.lang.Object obj25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj25, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfEra();
        org.joda.time.Instant instant31 = dateTime29.toInstant();
        boolean boolean32 = dateTimeZone15.equals((java.lang.Object) dateTime29);
        org.joda.time.DateTime dateTime33 = localDateTime1.toDateTime(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and instant31", (dateTime29.compareTo(instant31) == 0) == dateTime29.equals(instant31));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.joda.time.DateTime dateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime9 = property5.roundHalfCeilingCopy();
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj10, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        int int16 = dateTime14.getYear();
        org.joda.time.DateTime dateTime17 = dateTime14.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.minuteOfDay();
        java.lang.String str22 = chronology19.toString();
        org.joda.time.DurationField durationField23 = chronology19.weeks();
        org.joda.time.DateTime dateTime24 = dateTime14.withChronology(chronology19);
        org.joda.time.DateTime dateTime26 = dateTime24.plusMillis(96);
        boolean boolean27 = dateTime9.equals((java.lang.Object) dateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime24", (dateTime4.compareTo(dateTime24) == 0) == dateTime4.equals(dateTime24));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime26 = dateTime24.minusMinutes((int) (short) 100);
        int int27 = dateTime26.getSecondOfMinute();
        boolean boolean28 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.era();
        org.joda.time.LocalDateTime localDateTime34 = property33.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfYear();
        org.joda.time.LocalDateTime localDateTime37 = property35.addToCopy((long) 26162278);
        org.joda.time.LocalDateTime localDateTime38 = property35.withMaximumValue();
        org.joda.time.Chronology chronology39 = localDateTime38.getChronology();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology39.getZone();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 194, chronology39);
        java.lang.String str42 = chronology39.toString();
        org.joda.time.DateTime dateTime43 = dateTime26.toDateTime(chronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime22", (dateTime4.compareTo(dateTime22) == 0) == dateTime4.equals(dateTime22));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant1.plus(readableDuration5);
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime13 = dateTime9.minusDays((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = dateTime9.toLocalDateTime();
        org.joda.time.Chronology chronology15 = dateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime17 = instant6.toMutableDateTime(chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime2", (instant6.compareTo(mutableDateTime2) == 0) == instant6.equals(mutableDateTime2));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone2);
        org.joda.time.LocalTime localTime5 = localTime3.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localTime3.toDateTimeToday(dateTimeZone6);
        boolean boolean9 = dateTime7.isAfter((long) 2);
        org.joda.time.DateTime dateTime11 = dateTime7.minusDays(1);
        org.joda.time.DateTime dateTime13 = dateTime7.minusHours((-1));
        java.lang.String str14 = dateTime7.toString();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.DateTime dateTime18 = dateTime7.toDateTime(dateTimeZone17);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(1646723894431L, dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime18", (dateTime7.compareTo(dateTime18) == 0) == dateTime7.equals(dateTime18));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        org.joda.time.DateTimeField dateTimeField43 = chronology36.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField39 and durationField42", Math.signum(durationField39.compareTo(durationField42)) == -Math.signum(durationField42.compareTo(durationField39)));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        org.joda.time.DateTime dateTime30 = dateTime8.plusWeeks(66514147);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.minus(readablePeriod31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
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
        org.joda.time.DateTimeField dateTimeField15 = chronology9.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime14", (dateTime4.compareTo(dateTime14) == 0) == dateTime4.equals(dateTime14));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        java.lang.String[] strArray22 = new java.lang.String[] { "0", "16", "French", "1 Jan 1970 00:00:00 GMT", "22", "1", "1439", "French", "weekyear", "zho", "97", "2024-01-23", "zho", "Etc/UTC", "2 Dec 3921 00:00:00 GMT", "centuries", "Property[weekyear]", "24", "Etc/UTC", "GMT", "centuries", "24" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        strSet23.clear();
        java.util.Iterator<java.lang.String> strItor26 = strSet23.iterator();
        java.lang.Object obj27 = null;
        boolean boolean28 = strSet23.equals(obj27);
        org.joda.time.Instant instant30 = new org.joda.time.Instant(0L);
        org.joda.time.DateTime dateTime31 = instant30.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Instant instant34 = instant30.withDurationAdded(readableDuration32, 27445396);
        boolean boolean35 = strSet23.equals((java.lang.Object) instant34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant34 and dateTime31", (instant34.compareTo(dateTime31) == 0) == instant34.equals(dateTime31));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTimeISO();
        org.joda.time.Instant instant2 = instant0.toInstant();
        org.joda.time.DateTime dateTime3 = instant2.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime1", (instant2.compareTo(dateTime1) == 0) == instant2.equals(dateTime1));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
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
        int int18 = dateTime17.getEra();
        org.joda.time.Instant instant20 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime21 = instant20.toMutableDateTime();
        boolean boolean22 = dateTime17.isBefore((org.joda.time.ReadableInstant) instant20);
        int int23 = dateTime17.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and mutableDateTime21", (instant20.compareTo(mutableDateTime21) == 0) == instant20.equals(mutableDateTime21));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.weekOfWeekyear();
        org.joda.time.DateTime dateTime7 = property6.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.minus(readablePeriod8);
        org.joda.time.DateTime dateTime11 = dateTime7.plusSeconds(122);
        org.joda.time.Instant instant13 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime14 = instant13.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant17 = instant13.withDurationAdded(readableDuration15, 66514657);
        boolean boolean18 = dateTime7.isBefore((org.joda.time.ReadableInstant) instant13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant13", (dateTime14.compareTo(instant13) == 0) == dateTime14.equals(instant13));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.joda.time.Instant instant9 = instant1.withDurationAdded((long) 12, 23);
        org.joda.time.Instant instant11 = instant9.plus((long) 30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) (short) 100);
        int int18 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter4.withZone(dateTimeZone13);
        java.lang.String str20 = dateTimeZone13.toString();
        long long22 = dateTimeZone13.convertUTCToLocal((-19819295999995L));
        java.lang.Object obj23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj23, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property28 = dateTime27.yearOfEra();
        org.joda.time.Instant instant29 = dateTime27.toInstant();
        boolean boolean30 = dateTimeZone13.equals((java.lang.Object) dateTime27);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone32);
        org.joda.time.LocalTime localTime35 = localTime33.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localTime33.toDateTimeToday(dateTimeZone36);
        int int38 = dateTime37.getWeekyear();
        int int39 = dateTime37.getSecondOfDay();
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
        int int54 = dateTime37.get(dateTimeFieldType52);
        java.lang.String str55 = dateTimeFieldType52.getName();
        boolean boolean56 = dateTime27.isSupported(dateTimeFieldType52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and dateTime48", (instant29.compareTo(dateTime48) == 0) == instant29.equals(dateTime48));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        java.lang.Object obj36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(obj36, dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property41 = dateTime40.weekyear();
        java.lang.String str42 = property41.getAsText();
        org.joda.time.DateTime dateTime43 = property41.roundHalfCeilingCopy();
        boolean boolean44 = dateTimeZone7.equals((java.lang.Object) dateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime34", (dateTime16.compareTo(dateTime34) == 0) == dateTime16.equals(dateTime34));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime20 = localTime18.minusMillis(0);
        org.joda.time.LocalTime localTime22 = localTime20.minusHours((int) ' ');
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime25 = localTime23.minusMillis(0);
        org.joda.time.LocalTime localTime27 = localTime23.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime.Property property28 = localTime23.hourOfDay();
        org.joda.time.LocalTime localTime30 = property28.addCopy(8);
        int int31 = localTime20.compareTo((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.LocalTime.Property property32 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime34 = localTime20.withMillisOfDay(26171150);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str36 = dateTimeFieldType35.toString();
        java.lang.String str37 = dateTimeFieldType35.toString();
        boolean boolean38 = localTime20.isSupported(dateTimeFieldType35);
        org.joda.time.DateTime dateTime40 = dateTime17.withField(dateTimeFieldType35, 14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant16", (dateTime3.compareTo(instant16) == 0) == dateTime3.equals(instant16));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        org.joda.time.DateTime dateTime16 = dateTime3.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime15", (dateTime16.compareTo(dateTime15) == 0) == dateTime16.equals(dateTime15));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        org.joda.time.DateTime dateTime24 = dateTime20.withWeekyear(2021);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.minuteOfDay();
        boolean boolean29 = durationFieldType25.isSupported(chronology27);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.millisOfSecond();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology27);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.plus(readableDuration32);
        boolean boolean34 = dateTime20.isEqual((org.joda.time.ReadableInstant) dateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime33", (dateTime2.compareTo(dateTime33) == 0) == dateTime2.equals(dateTime33));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localTime2.getFields();
        org.joda.time.DateTime dateTime4 = localTime2.toDateTimeToday();
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        boolean boolean14 = dateTime12.isAfter((long) 2);
        org.joda.time.DateTime dateTime16 = dateTime12.minusDays(1);
        org.joda.time.DateTime dateTime18 = dateTime12.minusHours((-1));
        java.lang.String str19 = dateTime12.toString();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.DateTime dateTime23 = dateTime12.toDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) dateTime4, dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime23", (dateTime12.compareTo(dateTime23) == 0) == dateTime12.equals(dateTime23));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime8.toMutableDateTime();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.hours();
        boolean boolean37 = localDate35.isSupported(durationFieldType36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology40 = localDate39.getChronology();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType38.getField(chronology40);
        boolean boolean43 = durationFieldType36.isSupported(chronology40);
        org.joda.time.DateTimeField dateTimeField44 = chronology40.minuteOfDay();
        int int45 = mutableDateTime34.get(dateTimeField44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(1);
        int int11 = localDateTime8.getWeekyear();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.minus(readableDuration12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMonths(21);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.plusWeeks(34);
        org.joda.time.Instant instant20 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime21 = instant20.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime22 = instant20.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime23 = localDateTime15.toDateTime((org.joda.time.ReadableInstant) mutableDateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and dateTime21", (instant20.compareTo(dateTime21) == 0) == instant20.equals(dateTime21));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = localTime2.minusHours(2021);
        int int9 = localTime2.getSecondOfMinute();
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj10, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        java.lang.String str16 = property15.getAsText();
        org.joda.time.DurationField durationField17 = property15.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property15.getFieldType();
        java.lang.String str19 = dateTimeFieldType18.toString();
        boolean boolean20 = localTime2.isSupported(dateTimeFieldType18);
        org.joda.time.DateTime dateTime21 = localTime2.toDateTimeToday();
        org.joda.time.DateTime dateTime23 = dateTime21.minusMillis(17);
        int int24 = dateTime23.getYear();
        org.joda.time.DateTime dateTime26 = dateTime23.plusMillis(2131200);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(549, 1);
        java.lang.String str31 = dateTimeZone29.getName(1646723777197L);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime26.toMutableDateTime(dateTimeZone29);
        java.lang.String str34 = dateTimeZone29.getNameKey((long) 40726);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and mutableDateTime32", (dateTime26.compareTo(mutableDateTime32) == 0) == dateTime26.equals(mutableDateTime32));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 66514657);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime13 = dateTime9.minusDays((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime14 = dateTime9.toLocalDateTime();
        int int15 = localDateTime14.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusSeconds(292278993);
        int[] intArray19 = chronology6.get((org.joda.time.ReadablePartial) localDateTime14, (long) 26174796);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((long) 12, 80982);
        org.joda.time.Instant instant8 = instant5.withDurationAdded((long) 689, 29);
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekyear();
        long long15 = dateTime13.getMillis();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone17);
        org.joda.time.LocalTime localTime20 = localTime18.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localTime18.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime22.getZone();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime27 = dateTime25.minusMinutes((int) (short) 100);
        int int28 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime29 = dateTime13.withZoneRetainFields(dateTimeZone23);
        org.joda.time.DateTime dateTime31 = dateTime29.plusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.toDateTime(dateTimeZone36);
        boolean boolean38 = dateTime29.isBefore((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime40 = dateTime35.withWeekyear(86399999);
        int int41 = dateTime40.getSecondOfDay();
        int int42 = dateTime40.getYearOfCentury();
        boolean boolean43 = instant8.isEqual((org.joda.time.ReadableInstant) dateTime40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        org.joda.time.Instant instant13 = dateTime12.toInstant();
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant13", (dateTime2.compareTo(instant13) == 0) == dateTime2.equals(instant13));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = localTime2.minusHours(2021);
        int int9 = localTime2.getSecondOfMinute();
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj10, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        java.lang.String str16 = property15.getAsText();
        org.joda.time.DurationField durationField17 = property15.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property15.getFieldType();
        java.lang.String str19 = dateTimeFieldType18.toString();
        boolean boolean20 = localTime2.isSupported(dateTimeFieldType18);
        org.joda.time.DateTime dateTime21 = localTime2.toDateTimeToday();
        org.joda.time.DateTime dateTime23 = dateTime21.minusMillis(17);
        int int24 = dateTime23.getYear();
        org.joda.time.DateTime dateTime26 = dateTime23.plusMillis(2131200);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(549, 1);
        java.lang.String str31 = dateTimeZone29.getName(1646723777197L);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime26.toMutableDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and mutableDateTime32", (dateTime26.compareTo(mutableDateTime32) == 0) == dateTime26.equals(mutableDateTime32));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = instant2.toMutableDateTime();
        org.joda.time.Instant instant6 = instant2.plus((long) 33522);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime4", (instant2.compareTo(mutableDateTime4) == 0) == instant2.equals(mutableDateTime4));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DurationField durationField5 = chronology2.eras();
        java.lang.String str6 = chronology2.toString();
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now(chronology2);
        org.joda.time.DateTimeField dateTimeField8 = chronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology2.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField9, and durationField5", !(durationField5.compareTo(durationField9) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField9.compareTo(durationField5))));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        org.joda.time.Instant instant20 = instant18.withMillis(66578439L);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant20.plus(readableDuration21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime17", (dateTime6.compareTo(dateTime17) == 0) == dateTime6.equals(dateTime17));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        java.lang.Object obj0 = null;
        org.joda.time.Instant instant2 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime3 = instant2.toDateTimeISO();
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfMonth();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.Chronology chronology10 = dateTimeFormatter9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone12);
        org.joda.time.LocalTime localTime15 = localTime13.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localTime13.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime17.getZone();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime22 = dateTime20.minusMinutes((int) (short) 100);
        int int23 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter9.withZone(dateTimeZone18);
        java.lang.String str26 = dateTimeZone18.getShortName((long) 10);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime28 = dateTime3.toDateTime(dateTimeZone18);
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(obj0, dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime3", (instant2.compareTo(dateTime3) == 0) == instant2.equals(dateTime3));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
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
        org.joda.time.DateTimeField dateTimeField30 = chronology28.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime29", (dateTime22.compareTo(dateTime29) == 0) == dateTime22.equals(dateTime29));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
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
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant33.plus(readableDuration34);
        org.joda.time.Instant instant38 = instant35.withDurationAdded(1646723873753L, 32772);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant35", (dateTime31.compareTo(instant35) == 0) == dateTime31.equals(instant35));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusMinutes(26175799);
        org.joda.time.Instant instant5 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTimeISO();
        boolean boolean7 = localDateTime0.equals((java.lang.Object) instant5);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.withDurationAdded(readableDuration8, 360);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime6", (instant5.compareTo(mutableDateTime6) == 0) == instant5.equals(mutableDateTime6));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
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
        long long57 = durationField54.getValueAsLong((long) 86399999);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and dateTime51", (dateTime35.compareTo(dateTime51) == 0) == dateTime35.equals(dateTime51));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant0.minus(readableDuration2);
        long long4 = instant0.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant0", (dateTime1.compareTo(instant0) == 0) == dateTime1.equals(instant0));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DurationField durationField5 = chronology2.eras();
        java.lang.String str6 = chronology2.toString();
        org.joda.time.DurationField durationField7 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.hourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology2.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField9, and durationField5", !(durationField5.compareTo(durationField9) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField9.compareTo(durationField5))));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
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
        org.joda.time.DateTime dateTime17 = dateTime8.minusYears(66611);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant15", (dateTime8.compareTo(instant15) == 0) == dateTime8.equals(instant15));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant33.plus(readableDuration34);
        org.joda.time.Instant instant37 = instant33.minus((long) 23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant33", (dateTime31.compareTo(instant33) == 0) == dateTime31.equals(instant33));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        java.util.Calendar.Builder builder5 = builder3.setLenient(false);
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("yearOfCentury");
        java.util.Calendar.Builder builder8 = builder3.setLocale(locale7);
        java.util.Calendar calendar9 = builder8.build();
        java.util.Calendar.Builder builder14 = builder8.setTimeOfDay(360, 86399, 0, (-284887064));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar9", (calendar1.compareTo(calendar9) == 0) == calendar1.equals(calendar9));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(2024);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withDefaultYear(13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 66592207);
        java.util.Locale.LanguageRange languageRange12 = new java.util.Locale.LanguageRange("en-CA");
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] { languageRange12 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.lang.String[] strArray28 = new java.lang.String[] { "French", "", "hi!", "weekyear", "ISOChronology[UTC]", "French", "French", "97", "French", "2022-02-22T23:59:59.999Z", "2022", "weekyear" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        strSet29.clear();
        java.lang.String str32 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strSet29);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Locale[] localeArray39 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.Locale.FilteringMode filteringMode42 = null;
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList40, filteringMode42);
        java.util.List<java.util.Locale> localeList44 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList43);
        boolean boolean45 = strSet29.containsAll((java.util.Collection<java.util.Locale>) localeList44);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology47 = localDate46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField49 = chronology47.minuteOfDay();
        org.joda.time.DurationField durationField50 = chronology47.days();
        boolean boolean51 = strSet29.remove((java.lang.Object) chronology47);
        org.joda.time.DateTimeField dateTimeField52 = chronology47.minuteOfDay();
        org.joda.time.DurationField durationField53 = chronology47.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter6.withChronology(chronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField50 and durationField53", Math.signum(durationField50.compareTo(durationField53)) == -Math.signum(durationField53.compareTo(durationField50)));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfEra();
        org.joda.time.Instant instant6 = dateTime4.toInstant();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, (int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant11", (dateTime4.compareTo(instant11) == 0) == dateTime4.equals(instant11));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
        org.joda.time.Instant instant20 = instant18.withMillis(66578439L);
        org.joda.time.MutableDateTime mutableDateTime21 = instant20.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant18", (dateTime6.compareTo(instant18) == 0) == dateTime6.equals(instant18));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        java.lang.String str6 = dateTime5.toString();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant7.withDurationAdded(readableDuration8, (-284887059));
        org.joda.time.Instant instant12 = instant10.minus(1646723869361L);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = chronology14.hours();
        long long18 = durationField16.getMillis(1646723890042L);
        boolean boolean19 = instant12.equals((java.lang.Object) 1646723890042L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant7", (dateTime3.compareTo(instant7) == 0) == dateTime3.equals(instant7));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTime();
        org.joda.time.Instant instant6 = instant1.withDurationAdded((long) '4', 0);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant9 = instant1.withDurationAdded(readableDuration7, 70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant9", (mutableDateTime2.compareTo(instant9) == 0) == mutableDateTime2.equals(instant9));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
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
        org.joda.time.LocalDateTime.Property property36 = localDateTime33.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime13", (dateTime2.compareTo(dateTime13) == 0) == dateTime2.equals(dateTime13));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 7);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant8 = instant5.withDurationAdded(readableDuration6, 959);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime2", (instant8.compareTo(dateTime2) == 0) == instant8.equals(dateTime2));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = null;
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter25, dateTimeParser26);
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter27.withLocale(locale28);
        java.lang.String str30 = dateTimeField23.getAsText((long) 66534, locale28);
        org.joda.time.DurationField durationField31 = dateTimeField23.getLeapDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime16", (dateTime2.compareTo(dateTime16) == 0) == dateTime2.equals(dateTime16));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        java.lang.String str6 = dateTime5.toString();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant7.withDurationAdded(readableDuration8, (-284887059));
        org.joda.time.MutableDateTime mutableDateTime11 = instant7.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant7", (dateTime3.compareTo(instant7) == 0) == dateTime3.equals(instant7));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.DateTime dateTime7 = property6.roundHalfCeilingCopy();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTimeISO();
        org.joda.time.Instant instant9 = dateTime7.toInstant();
        int int10 = dateTime7.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant9", (mutableDateTime8.compareTo(instant9) == 0) == mutableDateTime8.equals(instant9));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        boolean boolean8 = dateTime6.isBefore((long) 439);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = instant2.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = instant2.toMutableDateTimeISO();
        org.joda.time.Instant instant7 = instant2.minus(1645514207470L);
        org.joda.time.Chronology chronology8 = instant2.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime4", (instant2.compareTo(mutableDateTime4) == 0) == instant2.equals(mutableDateTime4));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 27445396);
        org.joda.time.Instant instant7 = instant5.minus((long) 391);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime2", (instant5.compareTo(dateTime2) == 0) == instant5.equals(dateTime2));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
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
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime29", (dateTime22.compareTo(dateTime29) == 0) == dateTime22.equals(dateTime29));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
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
        org.joda.time.DateTime dateTime17 = dateTime16.toDateTime();
        int int18 = dateTime17.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime17", (dateTime4.compareTo(dateTime17) == 0) == dateTime4.equals(dateTime17));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant7 = instant1.withDurationAdded(readableDuration5, 0);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant7.minus(readableDuration8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime2", (instant9.compareTo(mutableDateTime2) == 0) == instant9.equals(mutableDateTime2));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime2.minusDays((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime7 = dateTime2.toLocalDateTime();
        org.joda.time.Chronology chronology8 = dateTime2.getChronology();
        org.joda.time.DateTime dateTime10 = dateTime2.minusHours(0);
        org.joda.time.Instant instant11 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime13 = dateTime2.withCenturyOfEra(71670);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant11", (dateTime2.compareTo(instant11) == 0) == dateTime2.equals(instant11));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology2);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTime dateTime8 = dateTime5.withZoneRetainFields(dateTimeZone7);
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
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate23 = localDate21.plus(readablePeriod22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDate localDate25 = localDate21.plus(readablePeriod24);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.parse("0");
        java.lang.Object obj28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(obj28, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property33 = dateTime32.weekyear();
        java.lang.String str34 = property33.getAsText();
        int int35 = property33.get();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        int int38 = property33.compareTo((org.joda.time.ReadablePartial) localDate36);
        org.joda.time.LocalDate localDate40 = localDate36.plusWeeks((int) (short) 100);
        org.joda.time.LocalDate localDate41 = localDate27.withFields((org.joda.time.ReadablePartial) localDate36);
        int int42 = localDate21.compareTo((org.joda.time.ReadablePartial) localDate36);
        int int43 = localDate36.size();
        int int44 = localDate36.getWeekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType45 = org.joda.time.DurationFieldType.seconds();
        boolean boolean46 = localDate36.isSupported(durationFieldType45);
        java.lang.String str47 = durationFieldType45.toString();
        org.joda.time.DateTime dateTime49 = dateTime8.withFieldAdded(durationFieldType45, 40319);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime11", (dateTime8.compareTo(dateTime11) == 0) == dateTime8.equals(dateTime11));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("2022");
        int int8 = timeZone7.getRawOffset();
        timeZone7.setRawOffset(0);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone7);
        java.lang.String str12 = timeZone7.getID();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("2022");
        timeZone14.setID("French");
        java.util.TimeZone.setDefault(timeZone14);
        boolean boolean18 = timeZone7.hasSameRules(timeZone14);
        calendar5.setTimeZone(timeZone7);
        int int21 = timeZone7.getOffset((long) 292269054);
        java.util.Locale locale22 = java.util.Locale.CHINA;
        boolean boolean23 = locale22.hasExtensions();
        java.util.Locale locale26 = new java.util.Locale("24", "hi!");
        java.lang.String str27 = locale22.getDisplayLanguage(locale26);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(locale22);
        java.util.Calendar.Builder builder29 = new java.util.Calendar.Builder();
        java.util.Calendar calendar30 = builder29.build();
        java.util.Calendar.Builder builder32 = builder29.setLenient(false);
        java.util.Calendar.Builder builder34 = builder32.setLenient(false);
        java.util.Calendar.Builder builder39 = builder32.setTimeOfDay(20, 66514147, 600032, 24);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology42 = localDate41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.minuteOfDay();
        boolean boolean44 = durationFieldType40.isSupported(chronology42);
        org.joda.time.DateTimeField dateTimeField45 = chronology42.yearOfEra();
        org.joda.time.DateTimeField dateTimeField46 = chronology42.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField47 = chronology42.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField48 = chronology42.clockhourOfHalfday();
        java.util.Locale locale52 = new java.util.Locale("24", "hi!");
        java.lang.String str53 = dateTimeField48.getAsShortText(5555776727L, locale52);
        java.util.Calendar.Builder builder54 = builder39.setLocale(locale52);
        java.lang.String str55 = locale22.getDisplayLanguage(locale52);
        java.lang.String str56 = timeZone7.getDisplayName(locale52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar28", (calendar11.compareTo(calendar28) == 0) == calendar11.equals(calendar28));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime7 = property5.addToCopy(9);
        org.joda.time.DateTime dateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.DateTime dateTime11 = dateTime8.minusMinutes(7);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours(570);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant9", (dateTime8.compareTo(instant9) == 0) == dateTime8.equals(instant9));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone4);
        org.joda.time.LocalTime localTime7 = localTime5.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localTime5.toDateTimeToday(dateTimeZone8);
        boolean boolean11 = dateTime9.isAfter((long) 2);
        org.joda.time.DateTime dateTime13 = dateTime9.minusDays(1);
        org.joda.time.DateTime dateTime15 = dateTime9.minusHours((-1));
        int int16 = dateTime9.getCenturyOfEra();
        boolean boolean17 = instant2.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Instant instant18 = instant2.toInstant();
        org.joda.time.Instant instant19 = instant18.toInstant();
        org.joda.time.DateTime dateTime20 = instant19.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant23 = instant19.withDurationAdded(readableDuration21, 27445396);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant23 and dateTime20", (instant23.compareTo(dateTime20) == 0) == instant23.equals(dateTime20));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant7 = instant1.withDurationAdded(readableDuration5, 0);
        org.joda.time.DateTime dateTime8 = instant7.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime2", (instant7.compareTo(mutableDateTime2) == 0) == instant7.equals(mutableDateTime2));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis(292278993);
        org.joda.time.DateTime dateTime9 = dateTime3.plusMinutes(67);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.Instant instant12 = instant10.minus(1646723815209L);
        int int13 = dateTime3.compareTo((org.joda.time.ReadableInstant) instant12);
        java.lang.Object obj14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj14, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        java.lang.String str20 = property19.getAsText();
        int int21 = property19.get();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        int int24 = property19.compareTo((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.LocalDate localDate26 = localDate22.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate28 = localDate26.plus(readablePeriod27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int30 = localDate28.get(dateTimeFieldType29);
        java.lang.String str32 = localDate28.toString("24");
        int int33 = localDate28.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate35 = localDate28.withWeekyear(26182169);
        org.joda.time.DateTime dateTime36 = localDate28.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.plus(readableDuration37);
        java.lang.Object obj39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(obj39, dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property44 = dateTime43.weekyear();
        int int45 = dateTime43.getYear();
        org.joda.time.DateTime dateTime46 = dateTime43.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.hours();
        boolean boolean49 = localDate47.isSupported(durationFieldType48);
        int int50 = localDate47.size();
        org.joda.time.DateTime dateTime51 = dateTime46.withFields((org.joda.time.ReadablePartial) localDate47);
        java.lang.Object obj52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(obj52, dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property57 = dateTime56.weekyear();
        java.lang.String str58 = property57.getAsText();
        org.joda.time.DurationField durationField59 = property57.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property57.getFieldType();
        java.lang.String str61 = dateTimeFieldType60.toString();
        boolean boolean62 = dateTime46.isSupported(dateTimeFieldType60);
        int int63 = dateTime38.get(dateTimeFieldType60);
        int int64 = instant12.get(dateTimeFieldType60);
        org.joda.time.Instant instant66 = instant12.plus(1646723851079L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime16", (instant10.compareTo(dateTime16) == 0) == instant10.equals(dateTime16));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
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
        int int25 = dateTimeField23.getMinimumValue(1646205447208L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime16", (dateTime2.compareTo(dateTime16) == 0) == dateTime2.equals(dateTime16));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
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
        org.joda.time.DateTimeField dateTimeField43 = chronology36.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField39 and durationField42", Math.signum(durationField39.compareTo(durationField42)) == -Math.signum(durationField42.compareTo(durationField39)));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj1, dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours(4);
        java.util.GregorianCalendar gregorianCalendar8 = dateTime5.toGregorianCalendar();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.year();
        boolean boolean10 = dateTime5.isSupported(dateTimeFieldType9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.minuteOfDay();
        boolean boolean15 = durationFieldType11.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.millisOfSecond();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology13);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.minuteOfDay();
        java.lang.String str22 = chronology19.toString();
        org.joda.time.DateTime dateTime23 = dateTime17.withChronology(chronology19);
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType9.getField(chronology19);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(1646723911047L, chronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime17", (dateTime3.compareTo(dateTime17) == 0) == dateTime3.equals(dateTime17));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Chronology chronology3 = instant1.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localTime2.getFields();
        org.joda.time.DateTime dateTime4 = localTime2.toDateTimeToday();
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime6 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property7 = dateTime4.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime4", (instant5.compareTo(dateTime4) == 0) == instant5.equals(dateTime4));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.DateTime dateTime5 = instant1.toDateTime();
        java.lang.String str7 = dateTime5.toString("31");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
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
        org.joda.time.DateTime.Property property20 = dateTime19.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime17", (dateTime12.compareTo(dateTime17) == 0) == dateTime12.equals(dateTime17));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
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
        org.joda.time.DateTime dateTime15 = dateTime12.plusWeeks(32);
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
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology38 = localDate37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.minuteOfDay();
        boolean boolean40 = durationFieldType36.isSupported(chronology38);
        org.joda.time.DateTimeField dateTimeField41 = chronology38.millisOfSecond();
        java.lang.String str42 = chronology38.toString();
        org.joda.time.DurationField durationField43 = chronology38.halfdays();
        org.joda.time.DateTime dateTime44 = dateTime24.toDateTime(chronology38);
        java.lang.Object obj45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(obj45, dateTimeZone46);
        org.joda.time.DateTime dateTime49 = dateTime47.withWeekOfWeekyear((int) (byte) 10);
        int int50 = dateTime49.getYear();
        boolean boolean51 = dateTime44.isEqual((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType53 = dateTimeFieldType52.getDurationType();
        int int54 = dateTime44.get(dateTimeFieldType52);
        boolean boolean55 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateTime44);
        java.util.Date date57 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant58 = new org.joda.time.Instant((java.lang.Object) date57);
        org.joda.time.Chronology chronology59 = instant58.getChronology();
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime62 = localTime60.minusMillis(0);
        org.joda.time.LocalTime localTime64 = localTime60.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime.Property property65 = localTime60.hourOfDay();
        org.joda.time.LocalTime localTime67 = localTime60.plusMinutes((int) (short) 1);
        org.joda.time.LocalTime localTime68 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.LocalTime localTime71 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone70);
        org.joda.time.LocalTime localTime73 = localTime71.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.DateTime dateTime75 = localTime71.toDateTimeToday(dateTimeZone74);
        org.joda.time.DateTimeZone dateTimeZone76 = dateTime75.getZone();
        boolean boolean77 = localTime68.equals((java.lang.Object) dateTimeZone76);
        org.joda.time.DateTime dateTime78 = localTime60.toDateTimeToday(dateTimeZone76);
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime(dateTimeZone76);
        org.joda.time.Chronology chronology80 = chronology59.withZone(dateTimeZone76);
        org.joda.time.DateTime dateTime81 = dateTime12.toDateTime(dateTimeZone76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime44", (dateTime8.compareTo(dateTime44) == 0) == dateTime8.equals(dateTime44));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
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
        org.joda.time.DateTimeField dateTimeField15 = chronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime14", (dateTime4.compareTo(dateTime14) == 0) == dateTime4.equals(dateTime14));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
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
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.parse("0");
        org.joda.time.LocalDate localDate20 = localDate18.plusYears(66525863);
        int[] intArray22 = chronology12.get((org.joda.time.ReadablePartial) localDate18, (-343407230L));
        org.joda.time.DateTimeField dateTimeField23 = chronology12.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime16", (dateTime4.compareTo(dateTime16) == 0) == dateTime4.equals(dateTime16));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
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
        org.joda.time.DateTimeField dateTimeField24 = chronology18.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime16", (dateTime2.compareTo(dateTime16) == 0) == dateTime2.equals(dateTime16));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) (short) 100);
        int int18 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter4.withZone(dateTimeZone13);
        java.lang.String str21 = dateTimeZone13.getShortName((long) 10);
        java.lang.String str22 = dateTimeZone13.getID();
        org.joda.time.Instant instant23 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime24 = instant23.toDateTimeISO();
        int int25 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant23 and dateTime24", (instant23.compareTo(dateTime24) == 0) == instant23.equals(dateTime24));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
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
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj19, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property24 = dateTime23.weekyear();
        org.joda.time.DateTime dateTime25 = property24.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar26 = dateTime25.toGregorianCalendar();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        int int29 = localDate27.getDayOfWeek();
        org.joda.time.LocalDate localDate31 = localDate27.minusYears(10);
        int[] intArray32 = localDate27.getValues();
        org.joda.time.LocalDate.Property property33 = localDate27.era();
        boolean boolean34 = gregorianCalendar26.before((java.lang.Object) property33);
        java.util.Date date36 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((java.lang.Object) date36);
        gregorianCalendar26.setTime(date36);
        date36.setMonth(1340);
        gregorianCalendar7.setTime(date36);
        java.lang.Object obj42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(obj42, dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property47 = dateTime46.weekyear();
        int int48 = dateTime46.getYear();
        org.joda.time.DateTime dateTime49 = dateTime46.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime52 = dateTime46.withPeriodAdded(readablePeriod50, (int) '#');
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.year();
        org.joda.time.DateTime dateTime58 = dateTime46.withChronology(chronology54);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((java.lang.Object) date36, chronology54);
        java.lang.String str60 = date36.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime58", (dateTime4.compareTo(dateTime58) == 0) == dateTime4.equals(dateTime58));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, 51);
        org.joda.time.Instant instant8 = instant5.withDurationAdded(1646723785234L, 28);
        org.joda.time.MutableDateTime mutableDateTime9 = instant5.toMutableDateTime();
        long long10 = instant5.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime9", (instant5.compareTo(mutableDateTime9) == 0) == instant5.equals(mutableDateTime9));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
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
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.minus(readableDuration17);
        org.joda.time.DateTime.Property property19 = dateTime15.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime15", (instant16.compareTo(dateTime15) == 0) == instant16.equals(dateTime15));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
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
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj19, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property24 = dateTime23.weekyear();
        org.joda.time.DateTime dateTime25 = property24.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar26 = dateTime25.toGregorianCalendar();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        int int29 = localDate27.getDayOfWeek();
        org.joda.time.LocalDate localDate31 = localDate27.minusYears(10);
        int[] intArray32 = localDate27.getValues();
        org.joda.time.LocalDate.Property property33 = localDate27.era();
        boolean boolean34 = gregorianCalendar26.before((java.lang.Object) property33);
        java.util.Date date36 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((java.lang.Object) date36);
        gregorianCalendar26.setTime(date36);
        date36.setMonth(1340);
        gregorianCalendar7.setTime(date36);
        java.lang.Object obj42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(obj42, dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property47 = dateTime46.weekyear();
        int int48 = dateTime46.getYear();
        org.joda.time.DateTime dateTime49 = dateTime46.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime52 = dateTime46.withPeriodAdded(readablePeriod50, (int) '#');
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.year();
        org.joda.time.DateTime dateTime58 = dateTime46.withChronology(chronology54);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((java.lang.Object) date36, chronology54);
        java.util.Date date61 = new java.util.Date((long) 435);
        date61.setYear(23);
        date61.setSeconds(32770);
        date61.setSeconds(86399);
        int int68 = date36.compareTo(date61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime58", (dateTime4.compareTo(dateTime58) == 0) == dateTime4.equals(dateTime58));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
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
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime14", (dateTime4.compareTo(dateTime14) == 0) == dateTime4.equals(dateTime14));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
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
        int int17 = dateTimeZone10.getOffsetFromLocal(356400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime15", (dateTime3.compareTo(dateTime15) == 0) == dateTime3.equals(dateTime15));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
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
        org.joda.time.DateTime dateTime15 = dateTime12.plusWeeks(32);
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
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology38 = localDate37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.minuteOfDay();
        boolean boolean40 = durationFieldType36.isSupported(chronology38);
        org.joda.time.DateTimeField dateTimeField41 = chronology38.millisOfSecond();
        java.lang.String str42 = chronology38.toString();
        org.joda.time.DurationField durationField43 = chronology38.halfdays();
        org.joda.time.DateTime dateTime44 = dateTime24.toDateTime(chronology38);
        java.lang.Object obj45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(obj45, dateTimeZone46);
        org.joda.time.DateTime dateTime49 = dateTime47.withWeekOfWeekyear((int) (byte) 10);
        int int50 = dateTime49.getYear();
        boolean boolean51 = dateTime44.isEqual((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType53 = dateTimeFieldType52.getDurationType();
        int int54 = dateTime44.get(dateTimeFieldType52);
        boolean boolean55 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime57 = dateTime12.withHourOfDay(7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime44", (dateTime8.compareTo(dateTime44) == 0) == dateTime8.equals(dateTime44));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
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
        org.joda.time.DateTimeField dateTimeField12 = chronology8.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime11", (dateTime1.compareTo(dateTime11) == 0) == dateTime1.equals(dateTime11));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
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
        org.joda.time.Instant instant13 = dateTime12.toInstant();
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
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology40 = localDate39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField42 = chronology40.minuteOfDay();
        java.lang.String str43 = chronology40.toString();
        org.joda.time.DurationField durationField44 = chronology40.weeks();
        boolean boolean45 = dateTimeFieldType35.isSupported(chronology40);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology47 = localDate46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField49 = chronology47.minuteOfDay();
        org.joda.time.DurationField durationField50 = chronology47.days();
        org.joda.time.DurationField durationField51 = chronology47.centuries();
        boolean boolean52 = dateTimeFieldType35.isSupported(chronology47);
        int int53 = dateTime12.get(dateTimeFieldType35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant13", (dateTime2.compareTo(instant13) == 0) == dateTime2.equals(instant13));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime14", (dateTime8.compareTo(mutableDateTime14) == 0) == dateTime8.equals(mutableDateTime14));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime1.millisOfSecond();
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        long long11 = dateTime9.getMillis();
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime9, dateTimeZone15);
        org.joda.time.DateTime dateTime17 = dateTime1.toDateTime(dateTimeZone15);
        java.lang.String str18 = dateTimeZone15.getID();
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj19, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime25 = dateTime21.minusDays((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime26 = dateTime21.toLocalDateTime();
        int int27 = localDateTime26.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusSeconds(292278993);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusSeconds(292278993);
        boolean boolean32 = dateTimeZone15.isLocalDateTimeGap(localDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime17", (dateTime1.compareTo(dateTime17) == 0) == dateTime1.equals(dateTime17));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 32769, chronology2);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(chronology2);
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.joda.time.DurationField durationField7 = chronology2.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField7, and durationField6", !(durationField6.compareTo(durationField7) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField7.compareTo(durationField6))));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
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
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.parse("0");
        org.joda.time.LocalDate localDate20 = localDate18.plusYears(66525863);
        int[] intArray22 = chronology12.get((org.joda.time.ReadablePartial) localDate18, (-343407230L));
        org.joda.time.DateTimeField dateTimeField24 = localDate18.getField(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime16", (dateTime4.compareTo(dateTime16) == 0) == dateTime4.equals(dateTime16));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar7);
        org.joda.time.LocalDate localDate18 = localDate16.withYearOfEra(44);
        org.joda.time.LocalDate.Property property19 = localDate18.dayOfWeek();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.minuteOfDay();
        boolean boolean24 = durationFieldType20.isSupported(chronology22);
        org.joda.time.DateTimeField dateTimeField25 = chronology22.millisOfSecond();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology22);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.minuteOfDay();
        java.lang.String str31 = chronology28.toString();
        org.joda.time.DateTime dateTime32 = dateTime26.withChronology(chronology28);
        org.joda.time.DateTimeField dateTimeField33 = chronology28.secondOfDay();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((java.lang.Object) localDate18, chronology28);
        org.joda.time.DateTime dateTime35 = localDate18.toDateTimeAtMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime26", (dateTime2.compareTo(dateTime26) == 0) == dateTime2.equals(dateTime26));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
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
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime27 = dateTime1.minus(readableDuration26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime25", (dateTime27.compareTo(dateTime25) == 0) == dateTime27.equals(dateTime25));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
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
        org.joda.time.DateTimeZone dateTimeZone17 = chronology12.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime16", (dateTime4.compareTo(dateTime16) == 0) == dateTime4.equals(dateTime16));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime7 = property5.addToCopy(9);
        org.joda.time.DateTime dateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.DateTime dateTime11 = dateTime8.minusMinutes(7);
        int int12 = dateTime11.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant9", (dateTime8.compareTo(instant9) == 0) == dateTime8.equals(instant9));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) ' ');
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfCentury();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.DurationField durationField9 = chronology5.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField9, and durationField6", !(durationField6.compareTo(durationField9) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField9.compareTo(durationField6))));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
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
        java.lang.Object obj29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(obj29, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.withWeekOfWeekyear((int) (byte) 10);
        int int34 = dateTime33.getYear();
        boolean boolean35 = dateTime28.isEqual((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology36 = dateTime33.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
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
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.DateTime dateTime11 = instant9.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime8", (dateTime2.compareTo(dateTime8) == 0) == dateTime2.equals(dateTime8));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, 51);
        org.joda.time.Instant instant6 = instant5.toInstant();
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        long long8 = instant6.getMillis();
        org.joda.time.Instant instant10 = instant6.plus(1645514378763L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime7", (instant6.compareTo(dateTime7) == 0) == instant6.equals(dateTime7));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusMinutes(26175799);
        org.joda.time.Instant instant5 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTimeISO();
        boolean boolean7 = localDateTime0.equals((java.lang.Object) instant5);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYear(22);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusDays(6);
        int int19 = localDateTime18.getDayOfYear();
        org.joda.time.Chronology chronology20 = localDateTime18.getChronology();
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.yearOfCentury();
        org.joda.time.LocalDateTime.Property property22 = localDateTime18.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property22.getFieldType();
        java.lang.String str24 = dateTimeFieldType23.getName();
        java.lang.String str25 = dateTimeFieldType23.toString();
        org.joda.time.LocalDateTime.Property property26 = localDateTime0.property(dateTimeFieldType23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime6", (instant5.compareTo(mutableDateTime6) == 0) == instant5.equals(mutableDateTime6));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 27445396);
        java.lang.String str6 = instant5.toString();
        org.joda.time.Instant instant7 = instant5.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime2", (instant7.compareTo(dateTime2) == 0) == instant7.equals(dateTime2));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = chronology1.weeks();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZone(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusYears(570);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(66512921);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone10);
        long long13 = dateTimeZone10.previousTransition((long) 362);
        org.joda.time.DateTime dateTime14 = dateTime8.toDateTime(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime6", (dateTime4.compareTo(dateTime6) == 0) == dateTime4.equals(dateTime6));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) ' ');
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.yearOfCentury();
        org.joda.time.DurationField durationField8 = dateTimeField7.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField8, and durationField6", !(durationField6.compareTo(durationField8) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField8.compareTo(durationField6))));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DurationField durationField5 = chronology2.eras();
        java.lang.String str6 = chronology2.toString();
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now(chronology2);
        org.joda.time.DateTimeField dateTimeField8 = chronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = dateTimeField8.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField9, and durationField5", !(durationField5.compareTo(durationField9) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField9.compareTo(durationField5))));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone2);
        org.joda.time.LocalTime localTime5 = localTime3.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localTime3.toDateTimeToday(dateTimeZone6);
        boolean boolean9 = dateTime7.isAfter((long) 2);
        org.joda.time.DateTime dateTime11 = dateTime7.minusDays(1);
        org.joda.time.DateTime dateTime13 = dateTime7.minusHours((-1));
        java.lang.String str14 = dateTime7.toString();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.DateTime dateTime18 = dateTime7.toDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 354, dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime18", (dateTime7.compareTo(dateTime18) == 0) == dateTime7.equals(dateTime18));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getGreatestMinimum(11);
        int int3 = calendar0.getMinimalDaysInFirstWeek();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale[] localeArray13 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList14 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList14, localeArray13);
        java.util.Locale.FilteringMode filteringMode16 = null;
        java.util.List<java.util.Locale> localeList17 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList14, filteringMode16);
        java.util.List<java.util.Locale> localeList18 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList17);
        java.util.Locale locale19 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap20);
        java.lang.String[] strArray34 = new java.lang.String[] { "French", "", "hi!", "weekyear", "ISOChronology[UTC]", "French", "French", "97", "French", "2022-02-22T23:59:59.999Z", "2022", "weekyear" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        strSet35.clear();
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.util.Locale[] localeArray41 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList42 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList42, localeArray41);
        java.util.Locale.FilteringMode filteringMode44 = null;
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.util.Locale>) localeList42, filteringMode44);
        boolean boolean46 = strSet35.retainAll((java.util.Collection<java.util.Locale>) localeList45);
        boolean boolean47 = strSet35.isEmpty();
        java.util.Locale.FilteringMode filteringMode48 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strSet35, filteringMode48);
        boolean boolean50 = calendar0.before((java.lang.Object) filteringMode48);
        java.util.TimeZone timeZone51 = calendar0.getTimeZone();
        java.util.Locale.Builder builder52 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder54 = builder52.setLanguageTag("fr");
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.lang.String str56 = locale55.getDisplayVariant();
        java.util.Locale.Builder builder57 = builder52.setLocale(locale55);
        java.util.Locale.Builder builder58 = builder52.clear();
        java.util.Locale.Builder builder60 = builder58.setLanguageTag("zho");
        java.util.Locale.Builder builder61 = builder60.clear();
        java.lang.Object obj62 = null;
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(obj62, dateTimeZone63);
        org.joda.time.DateTime dateTime66 = dateTime64.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property67 = dateTime66.weekyear();
        java.util.Locale locale69 = java.util.Locale.PRC;
        org.joda.time.DateTime dateTime70 = property67.setCopy("0", locale69);
        java.util.Calendar calendar71 = java.util.Calendar.getInstance(locale69);
        java.util.Locale locale72 = java.util.Locale.UK;
        java.lang.String str73 = locale69.getDisplayCountry(locale72);
        java.util.Locale.Builder builder74 = builder61.setLocale(locale72);
        java.lang.String str75 = timeZone51.getDisplayName(locale72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar71", (calendar0.compareTo(calendar71) == 0) == calendar0.equals(calendar71));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
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
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime26 = dateTime24.minusMinutes((int) (short) 100);
        int int27 = dateTime26.getSecondOfMinute();
        boolean boolean28 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime30 = dateTime26.withYear(10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime22", (dateTime4.compareTo(dateTime22) == 0) == dateTime4.equals(dateTime22));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DurationField durationField5 = chronology2.eras();
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.weekyear();
        org.joda.time.DateTime dateTime12 = property11.roundCeilingCopy();
        org.joda.time.DurationField durationField13 = property11.getDurationField();
        boolean boolean14 = durationField13.isSupported();
        long long17 = durationField13.add(0L, 0);
        long long20 = durationField13.add(1646723762055L, 1L);
        long long23 = durationField13.getMillis(2024, (long) 86399);
        int int26 = durationField13.getDifference(31556952000L, 1646723770045L);
        long long29 = durationField13.getMillis((long) 11, 1646723758993L);
        int int30 = durationField5.compareTo(durationField13);
        boolean boolean31 = durationField13.isPrecise();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField13, and durationField5", !(durationField5.compareTo(durationField13) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField13.compareTo(durationField5))));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
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
        org.joda.time.DateTime dateTime27 = dateTime7.plusHours(51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime22", (dateTime7.compareTo(dateTime22) == 0) == dateTime7.equals(dateTime22));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
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
        java.lang.Object obj36 = timeZone26.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar7 and calendar23", (calendar7.compareTo(calendar23) == 0) == calendar7.equals(calendar23));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj1, dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        long long7 = dateTime5.getMillis();
        org.joda.time.DateTime.Property property8 = dateTime5.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime5, dateTimeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 467, dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime14", (dateTime3.compareTo(dateTime14) == 0) == dateTime3.equals(dateTime14));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 27445396);
        long long6 = instant1.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant1", (dateTime2.compareTo(instant1) == 0) == dateTime2.equals(instant1));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfMonth();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.Chronology chronology9 = dateTimeFormatter8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime16.getZone();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime21 = dateTime19.minusMinutes((int) (short) 100);
        int int22 = dateTimeZone17.getOffset((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter8.withZone(dateTimeZone17);
        java.lang.String str25 = dateTimeZone17.getShortName((long) 10);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime27 = dateTime2.toDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime27", (instant1.compareTo(dateTime27) == 0) == instant1.equals(dateTime27));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.joda.time.Instant instant9 = instant1.withDurationAdded((long) 12, 23);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant1.plus(readableDuration10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant14 = instant11.withDurationAdded(readableDuration12, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and mutableDateTime2", (instant14.compareTo(mutableDateTime2) == 0) == instant14.equals(mutableDateTime2));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 7);
        org.joda.time.DateTimeZone dateTimeZone6 = instant5.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime2", (instant5.compareTo(dateTime2) == 0) == instant5.equals(dateTime2));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        long long5 = instant1.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant1", (dateTime2.compareTo(instant1) == 0) == dateTime2.equals(instant1));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
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
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.toDateTime(dateTimeZone27);
        boolean boolean29 = dateTime20.isBefore((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime31 = dateTime26.withWeekyear(86399999);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology34 = localDate33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.minuteOfDay();
        boolean boolean36 = durationFieldType32.isSupported(chronology34);
        org.joda.time.DurationField durationField37 = chronology34.weeks();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology34);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((java.lang.Object) dateTime31, chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime38", (dateTime2.compareTo(dateTime38) == 0) == dateTime2.equals(dateTime38));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
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
        org.joda.time.Instant instant11 = instant9.withMillis(1645514268958L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime8", (dateTime2.compareTo(dateTime8) == 0) == dateTime2.equals(dateTime8));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
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
        java.util.Date date11 = dateTime10.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime8", (dateTime10.compareTo(dateTime8) == 0) == dateTime10.equals(dateTime8));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
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
        boolean boolean24 = dateTime7.isBefore(78513478L);
        org.joda.time.DateTime dateTime26 = dateTime7.plusWeeks(66571079);
        org.joda.time.DateTime dateTime28 = dateTime7.minusWeeks(0);
        int int29 = dateTime7.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime22", (dateTime7.compareTo(dateTime22) == 0) == dateTime7.equals(dateTime22));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTime();
        org.joda.time.Instant instant7 = instant1.withMillis(12L);
        long long8 = instant1.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant1", (dateTime2.compareTo(instant1) == 0) == dateTime2.equals(instant1));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
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
        int int31 = dateTime4.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime30", (dateTime4.compareTo(mutableDateTime30) == 0) == dateTime4.equals(mutableDateTime30));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '#');
        int int3 = dateTime2.getMonthOfYear();
        org.joda.time.DateTime dateTime5 = dateTime2.plusMinutes(1340);
        int int6 = dateTime5.getMillisOfSecond();
        org.joda.time.DateTime dateTime8 = dateTime5.withDayOfYear(24);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology10.weeks();
        org.joda.time.DateTime dateTime13 = dateTime5.withChronology(chronology10);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 66705121, chronology10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime13", (dateTime5.compareTo(dateTime13) == 0) == dateTime5.equals(dateTime13));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
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
        org.joda.time.LocalDateTime.Property property35 = localDateTime25.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime13", (dateTime2.compareTo(dateTime13) == 0) == dateTime2.equals(dateTime13));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, 51);
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.Instant instant9 = instant5.withDurationAdded((long) 549, 2012);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime6", (instant5.compareTo(dateTime6) == 0) == instant5.equals(dateTime6));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = instant2.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = instant2.toMutableDateTimeISO();
        org.joda.time.Instant instant7 = instant2.minus(1645514207470L);
        java.lang.Object obj8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj8, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.hourOfHalfday();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) instant2, chronology13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime4", (instant2.compareTo(mutableDateTime4) == 0) == instant2.equals(mutableDateTime4));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
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
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj19, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property24 = dateTime23.weekyear();
        org.joda.time.DateTime dateTime25 = property24.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar26 = dateTime25.toGregorianCalendar();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        int int29 = localDate27.getDayOfWeek();
        org.joda.time.LocalDate localDate31 = localDate27.minusYears(10);
        int[] intArray32 = localDate27.getValues();
        org.joda.time.LocalDate.Property property33 = localDate27.era();
        boolean boolean34 = gregorianCalendar26.before((java.lang.Object) property33);
        java.util.Date date36 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((java.lang.Object) date36);
        gregorianCalendar26.setTime(date36);
        date36.setMonth(1340);
        gregorianCalendar7.setTime(date36);
        java.lang.Object obj42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(obj42, dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property47 = dateTime46.weekyear();
        int int48 = dateTime46.getYear();
        org.joda.time.DateTime dateTime49 = dateTime46.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime52 = dateTime46.withPeriodAdded(readablePeriod50, (int) '#');
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.year();
        org.joda.time.DateTime dateTime58 = dateTime46.withChronology(chronology54);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((java.lang.Object) date36, chronology54);
        org.joda.time.DateTimeField[] dateTimeFieldArray60 = localDate59.getFields();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime58", (dateTime4.compareTo(dateTime58) == 0) == dateTime4.equals(dateTime58));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
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
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology75 = localDate74.getChronology();
        int int76 = localDate74.getDayOfWeek();
        boolean boolean78 = localDate74.equals((java.lang.Object) 2022);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str81 = dateTimeZone79.getNameKey(0L);
        org.joda.time.DateTime dateTime82 = localDate74.toDateTimeAtStartOfDay(dateTimeZone79);
        org.joda.time.DateTime dateTime83 = dateTime3.withZoneRetainFields(dateTimeZone79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime71", (dateTime3.compareTo(dateTime71) == 0) == dateTime3.equals(dateTime71));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
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
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfWeek();
        org.joda.time.ReadablePartial readablePartial32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withFields(readablePartial32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime13", (dateTime2.compareTo(dateTime13) == 0) == dateTime2.equals(dateTime13));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.Instant instant5 = instant4.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime2", (instant5.compareTo(dateTime2) == 0) == instant5.equals(dateTime2));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology2);
        org.joda.time.DurationField durationField5 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.dayOfYear();
        org.joda.time.DurationField durationField7 = dateTimeField6.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField7, and durationField5", !(durationField5.compareTo(durationField7) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField7.compareTo(durationField5))));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
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
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone18);
        org.joda.time.LocalTime localTime21 = localTime19.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localTime19.toDateTimeToday(dateTimeZone22);
        int int24 = dateTime23.getWeekyear();
        org.joda.time.DateTime dateTime25 = dateTime23.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean27 = dateTime25.isSupported(dateTimeFieldType26);
        org.joda.time.DateTime dateTime29 = dateTime25.minusMillis((int) (short) 0);
        java.lang.String str30 = dateTime25.toString();
        org.joda.time.DateTime dateTime32 = dateTime25.withDayOfYear(18);
        org.joda.time.Instant instant33 = dateTime32.toInstant();
        org.joda.time.DateTime dateTime35 = dateTime32.plusHours((-28));
        boolean boolean36 = mutableDateTime16.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.Instant instant38 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime39 = instant38.toMutableDateTimeISO();
        org.joda.time.Instant instant42 = instant38.withDurationAdded((-1893235578000L), 4);
        long long43 = instant38.getMillis();
        boolean boolean44 = dateTime32.isBefore((org.joda.time.ReadableInstant) instant38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime16", (instant15.compareTo(mutableDateTime16) == 0) == instant15.equals(mutableDateTime16));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(23);
        boolean boolean8 = dateTimeZone6.isStandardOffset((long) 0);
        boolean boolean9 = dateTimeZone6.isFixed();
        org.joda.time.DateTime dateTime10 = dateTime2.toDateTime(dateTimeZone6);
        int int11 = dateTime2.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime10", (mutableDateTime3.compareTo(dateTime10) == 0) == mutableDateTime3.equals(dateTime10));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
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
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = null;
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter25, dateTimeParser26);
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter27.withLocale(locale28);
        java.lang.String str30 = dateTimeField23.getAsText((long) 66534, locale28);
        java.lang.String str31 = locale28.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime16", (dateTime2.compareTo(dateTime16) == 0) == dateTime2.equals(dateTime16));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
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
        org.joda.time.DateTime dateTime34 = instant33.toDateTimeISO();
        int int35 = dateTime34.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant33", (dateTime31.compareTo(instant33) == 0) == dateTime31.equals(instant33));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone4);
        org.joda.time.LocalTime localTime7 = localTime5.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localTime5.toDateTimeToday(dateTimeZone8);
        boolean boolean11 = dateTime9.isAfter((long) 2);
        org.joda.time.DateTime dateTime13 = dateTime9.minusDays(1);
        org.joda.time.DateTime dateTime15 = dateTime9.minusHours((-1));
        int int16 = dateTime9.getCenturyOfEra();
        boolean boolean17 = instant2.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Instant instant18 = instant2.toInstant();
        org.joda.time.Instant instant19 = instant18.toInstant();
        org.joda.time.DateTime dateTime20 = instant19.toDateTimeISO();
        org.joda.time.DateTime dateTime22 = dateTime20.withYear((-52));
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime25 = dateTime22.withPeriodAdded(readablePeriod23, (-21803));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime20", (instant0.compareTo(dateTime20) == 0) == instant0.equals(dateTime20));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 7);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant1", (dateTime2.compareTo(instant1) == 0) == dateTime2.equals(instant1));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfMonth();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.Chronology chronology9 = dateTimeFormatter8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime16.getZone();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime21 = dateTime19.minusMinutes((int) (short) 100);
        int int22 = dateTimeZone17.getOffset((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter8.withZone(dateTimeZone17);
        java.lang.String str25 = dateTimeZone17.getShortName((long) 10);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime27 = dateTime2.toDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(48);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(435);
        int int34 = dateTimeZone32.getOffsetFromLocal(1646723759380L);
        int int36 = dateTimeZone32.getOffset(1646723769545L);
        boolean boolean37 = dateTimeZone29.equals((java.lang.Object) dateTimeZone32);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((java.lang.Object) dateTime2, dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("2022");
        int int8 = timeZone7.getRawOffset();
        timeZone7.setRawOffset(0);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone7);
        java.lang.String str12 = timeZone7.getID();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("2022");
        timeZone14.setID("French");
        java.util.TimeZone.setDefault(timeZone14);
        boolean boolean18 = timeZone7.hasSameRules(timeZone14);
        calendar5.setTimeZone(timeZone7);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        java.util.Date date22 = localDate20.toDate();
        date22.setSeconds(34);
        int int25 = date22.getMinutes();
        int int26 = date22.getMonth();
        boolean boolean27 = calendar5.before((java.lang.Object) date22);
        int int29 = calendar5.getLeastMaximum((int) (byte) 1);
        int int31 = calendar5.getGreatestMinimum((int) (short) 10);
        java.util.TimeZone timeZone33 = java.util.TimeZone.getTimeZone("2022");
        int int34 = timeZone33.getRawOffset();
        java.util.TimeZone.setDefault(timeZone33);
        java.util.TimeZone timeZone37 = java.util.TimeZone.getTimeZone("weekyear");
        boolean boolean38 = timeZone33.hasSameRules(timeZone37);
        timeZone37.setID("1970");
        java.util.TimeZone timeZone42 = java.util.TimeZone.getTimeZone("en-ca");
        timeZone42.setID("24_HI!");
        boolean boolean45 = timeZone37.hasSameRules(timeZone42);
        calendar5.setTimeZone(timeZone42);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology48 = localDate47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.minuteOfDay();
        java.lang.String str52 = dateTimeField50.getAsShortText(0L);
        int int53 = dateTimeField50.getMinimumValue();
        org.joda.time.tz.NameProvider nameProvider54 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology56 = localDate55.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.minuteOfDay();
        java.util.Locale locale61 = new java.util.Locale("hi!", "", "");
        int int62 = dateTimeField57.getMaximumShortTextLength(locale61);
        java.lang.String str65 = nameProvider54.getName(locale61, "24", "yearOfCentury");
        java.util.Locale locale66 = java.util.Locale.JAPAN;
        java.lang.String str69 = nameProvider54.getName(locale66, "centuries", "0");
        int int70 = dateTimeField50.getMaximumShortTextLength(locale66);
        java.lang.String str71 = timeZone42.getDisplayName(locale66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar11", (calendar5.compareTo(calendar11) == 0) == calendar5.equals(calendar11));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
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
        int int12 = dateTime11.getYear();
        org.joda.time.DateTime dateTime14 = dateTime11.plusHours(29);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property15.addWrapFieldToCopy(1646473215);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime11", (dateTime1.compareTo(dateTime11) == 0) == dateTime1.equals(dateTime11));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        int int2 = dateTime1.getMonthOfYear();
        org.joda.time.DateTime dateTime4 = dateTime1.plusMinutes(1340);
        int int5 = dateTime4.getMillisOfSecond();
        org.joda.time.DateTime dateTime7 = dateTime4.withDayOfYear(24);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime4.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime4.getZone();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime12 = localTime10.minusMillis(0);
        org.joda.time.LocalTime localTime14 = localTime10.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime localTime16 = localTime10.minusMinutes(11);
        int int17 = localTime10.getMillisOfDay();
        boolean boolean18 = dateTime4.equals((java.lang.Object) int17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone20);
        org.joda.time.LocalTime localTime23 = localTime21.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localTime21.toDateTimeToday(dateTimeZone24);
        int int26 = dateTime25.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int28 = dateTime25.get(dateTimeFieldType27);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone30);
        org.joda.time.LocalTime localTime33 = localTime31.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localTime31.toDateTimeToday(dateTimeZone34);
        int int36 = dateTime25.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime.Property property37 = dateTime25.millisOfSecond();
        org.joda.time.Instant instant38 = dateTime25.toInstant();
        org.joda.time.Instant instant40 = instant38.minus((long) 8);
        org.joda.time.DateTime dateTime41 = instant38.toDateTimeISO();
        boolean boolean42 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant38", (dateTime25.compareTo(instant38) == 0) == dateTime25.equals(instant38));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
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
        boolean boolean17 = dateTime8.isBefore(1646723769545L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant15", (dateTime8.compareTo(instant15) == 0) == dateTime8.equals(instant15));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
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
        org.joda.time.DateTime dateTime15 = dateTime4.plus(1646723812200L);
        org.joda.time.Instant instant16 = dateTime4.toInstant();
        java.lang.Object obj17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj17, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property22 = dateTime21.weekyear();
        org.joda.time.DateTime dateTime23 = property22.roundCeilingCopy();
        org.joda.time.DateTime dateTime25 = dateTime23.withCenturyOfEra((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime23.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime27 = dateTime23.toDateTimeISO();
        org.joda.time.DateTime dateTime29 = dateTime23.minusMonths(22);
        int int30 = dateTime29.getSecondOfDay();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.monthOfYear();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        long long39 = chronology32.add(readablePeriod36, (long) 435, (int) 'a');
        org.joda.time.DateTimeField dateTimeField40 = chronology32.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime29.toMutableDateTime(chronology32);
        boolean boolean42 = dateTime4.isBefore((org.joda.time.ReadableInstant) mutableDateTime41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant16", (dateTime4.compareTo(instant16) == 0) == dateTime4.equals(instant16));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
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
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant33.plus(readableDuration34);
        java.lang.Object obj36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(obj36, dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property41 = dateTime40.weekyear();
        int int42 = dateTime40.getYear();
        org.joda.time.DateTime dateTime43 = dateTime40.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType45 = org.joda.time.DurationFieldType.hours();
        boolean boolean46 = localDate44.isSupported(durationFieldType45);
        int int47 = localDate44.size();
        org.joda.time.DateTime dateTime48 = dateTime43.withFields((org.joda.time.ReadablePartial) localDate44);
        int int49 = dateTime43.getCenturyOfEra();
        boolean boolean50 = instant35.isBefore((org.joda.time.ReadableInstant) dateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant35", (dateTime31.compareTo(instant35) == 0) == dateTime31.equals(instant35));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.dayOfYear();
        boolean boolean13 = dateTime5.isSupported(dateTimeFieldType12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime11", (dateTime5.compareTo(dateTime11) == 0) == dateTime5.equals(dateTime11));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
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
        java.lang.String str14 = localDate12.toString();
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.parse("0");
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
        org.joda.time.LocalDate localDate30 = localDate16.withFields((org.joda.time.ReadablePartial) localDate25);
        int int31 = localDate16.getYearOfCentury();
        boolean boolean32 = localDate12.isEqual((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDate localDate34 = localDate16.plus(readablePeriod33);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        java.util.Date date37 = localDate35.toDate();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology39 = localDate38.getChronology();
        int int40 = localDate38.getDayOfWeek();
        org.joda.time.LocalDate localDate42 = localDate38.minusYears(10);
        int[] intArray43 = localDate38.getValues();
        org.joda.time.LocalDate.Property property44 = localDate38.era();
        org.joda.time.LocalDate localDate45 = property44.roundCeilingCopy();
        org.joda.time.LocalDate localDate47 = property44.addWrapFieldToCopy((-292275054));
        org.joda.time.LocalDate localDate48 = property44.getLocalDate();
        org.joda.time.LocalDate localDate50 = localDate48.withYear(34);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = localDate50.getFieldType(0);
        org.joda.time.LocalDate.Property property53 = localDate35.property(dateTimeFieldType52);
        int int54 = localDate16.get(dateTimeFieldType52);
        java.lang.Object obj55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(obj55, dateTimeZone56);
        org.joda.time.DateTime dateTime59 = dateTime57.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property60 = dateTime59.yearOfEra();
        org.joda.time.DateTime dateTime61 = property60.withMaximumValue();
        org.joda.time.DateTime.Property property62 = dateTime61.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType63 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology65 = localDate64.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.minuteOfDay();
        boolean boolean67 = durationFieldType63.isSupported(chronology65);
        org.joda.time.DateTimeField dateTimeField68 = chronology65.yearOfEra();
        org.joda.time.DateTimeField dateTimeField69 = chronology65.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField70 = chronology65.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField71 = chronology65.yearOfEra();
        org.joda.time.LocalDate localDate72 = org.joda.time.LocalDate.now(chronology65);
        org.joda.time.MutableDateTime mutableDateTime73 = dateTime61.toMutableDateTime(chronology65);
        org.joda.time.DateTimeField dateTimeField74 = dateTimeFieldType52.getField(chronology65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime61 and mutableDateTime73", (dateTime61.compareTo(mutableDateTime73) == 0) == dateTime61.equals(mutableDateTime73));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
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
        int int12 = dateTime11.getYear();
        org.joda.time.DateTime dateTime14 = dateTime11.plusHours(29);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property15.addWrapFieldToCopy(52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime11", (dateTime1.compareTo(dateTime11) == 0) == dateTime1.equals(dateTime11));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DurationField durationField5 = chronology2.eras();
        java.lang.String str6 = chronology2.toString();
        org.joda.time.DurationField durationField7 = chronology2.eras();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(66512921);
        org.joda.time.Chronology chronology10 = chronology2.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = chronology2.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField11, and durationField5", !(durationField5.compareTo(durationField11) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField11.compareTo(durationField5))));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Instant instant3 = instant1.toInstant();
        long long4 = instant3.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime2", (instant3.compareTo(dateTime2) == 0) == instant3.equals(dateTime2));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, 51);
        org.joda.time.Instant instant6 = instant5.toInstant();
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks(3);
        int int10 = dateTime9.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime7", (instant0.compareTo(dateTime7) == 0) == instant0.equals(dateTime7));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths((int) '4');
        int int5 = localDate4.getWeekOfWeekyear();
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.weekyear();
        org.joda.time.DateTime dateTime12 = property11.roundCeilingCopy();
        org.joda.time.DateTime dateTime14 = dateTime12.withCenturyOfEra((int) ' ');
        java.lang.Object obj15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj15, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property20 = dateTime19.weekyear();
        java.lang.String str21 = property20.getAsText();
        org.joda.time.DurationField durationField22 = property20.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property20.getFieldType();
        java.lang.String str24 = dateTimeFieldType23.toString();
        boolean boolean25 = dateTime14.isSupported(dateTimeFieldType23);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.minuteOfDay();
        boolean boolean30 = durationFieldType26.isSupported(chronology28);
        org.joda.time.DateTimeField dateTimeField31 = chronology28.millisOfSecond();
        java.lang.String str32 = chronology28.toString();
        org.joda.time.DurationField durationField33 = chronology28.halfdays();
        org.joda.time.DateTime dateTime34 = dateTime14.toDateTime(chronology28);
        org.joda.time.DateTime dateTime36 = dateTime14.plusWeeks(66514147);
        boolean boolean37 = localDate4.equals((java.lang.Object) 66514147);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime34", (dateTime14.compareTo(dateTime34) == 0) == dateTime14.equals(dateTime34));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
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
        org.joda.time.DateTime dateTime20 = dateTime16.plusHours((-1108));
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        int int23 = localDate21.getDayOfWeek();
        org.joda.time.LocalDate localDate25 = localDate21.minusYears(10);
        int[] intArray26 = localDate21.getValues();
        org.joda.time.LocalDate.Property property27 = localDate21.era();
        org.joda.time.Chronology chronology28 = localDate21.getChronology();
        int int29 = localDate21.getYearOfCentury();
        org.joda.time.DateMidnight dateMidnight30 = localDate21.toDateMidnight();
        boolean boolean31 = dateTime16.equals((java.lang.Object) dateMidnight30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime16", (dateTime4.compareTo(dateTime16) == 0) == dateTime4.equals(dateTime16));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DurationField durationField5 = chronology2.eras();
        java.lang.String str6 = chronology2.toString();
        org.joda.time.DurationField durationField7 = chronology2.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField7, and durationField5", !(durationField5.compareTo(durationField7) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField7.compareTo(durationField5))));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone4);
        org.joda.time.LocalTime localTime7 = localTime5.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localTime5.toDateTimeToday(dateTimeZone8);
        boolean boolean11 = dateTime9.isAfter((long) 2);
        org.joda.time.DateTime dateTime13 = dateTime9.minusDays(1);
        org.joda.time.DateTime dateTime15 = dateTime9.minusHours((-1));
        int int16 = dateTime9.getCenturyOfEra();
        boolean boolean17 = instant2.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Instant instant18 = instant2.toInstant();
        org.joda.time.Instant instant19 = instant18.toInstant();
        org.joda.time.DateTime dateTime20 = instant19.toDateTimeISO();
        org.joda.time.DateTime dateTime22 = dateTime20.withYear((-52));
        org.joda.time.DateTime dateTime24 = dateTime20.minusWeeks(60);
        int int25 = dateTime24.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime20", (instant0.compareTo(dateTime20) == 0) == instant0.equals(dateTime20));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        java.util.Date date1 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant2 = new org.joda.time.Instant((java.lang.Object) date1);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DateTime dateTime4 = instant2.toDateTimeISO();
        org.joda.time.Instant instant7 = instant2.withDurationAdded(600032L, (int) 'x');
        org.joda.time.Instant instant8 = instant7.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime4", (instant2.compareTo(dateTime4) == 0) == instant2.equals(dateTime4));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
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
        long long27 = durationField24.subtract(12L, 46319);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime16", (dateTime2.compareTo(dateTime16) == 0) == dateTime2.equals(dateTime16));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime7 = property5.addToCopy(9);
        org.joda.time.DateTime dateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.DateTime dateTime12 = dateTime8.withDurationAdded(66571079L, 0);
        org.joda.time.DateTime dateTime14 = dateTime8.minusMonths(470);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime8", (instant9.compareTo(dateTime8) == 0) == instant9.equals(dateTime8));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant0.plus(readableDuration2);
        org.joda.time.Instant instant5 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime7 = instant5.toMutableDateTime();
        long long8 = instant5.getMillis();
        boolean boolean9 = instant0.isEqual((org.joda.time.ReadableInstant) instant5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant0", (dateTime1.compareTo(instant0) == 0) == dateTime1.equals(instant0));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
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
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter22.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter22.withZoneUTC();
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.minuteOfDay();
        boolean boolean29 = durationFieldType25.isSupported(chronology27);
        org.joda.time.DurationField durationField30 = chronology27.eras();
        long long34 = chronology27.add(36000000L, 1646723968866L, 122);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter24.withChronology(chronology27);
        org.joda.time.DateTimeField dateTimeField36 = chronology27.dayOfWeek();
        org.joda.time.DateTime dateTime37 = dateTime8.toDateTime(chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField30", Math.signum(durationField16.compareTo(durationField30)) == -Math.signum(durationField30.compareTo(durationField16)));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
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
        int int57 = durationField46.getValue((long) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime51", (dateTime19.compareTo(dateTime51) == 0) == dateTime19.equals(dateTime51));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(7);
        int int5 = dateTime4.getMonthOfYear();
        int int6 = dateTime4.getDayOfMonth();
        org.joda.time.DateTime.Property property7 = dateTime4.minuteOfHour();
        org.joda.time.DateTime.Property property8 = dateTime4.minuteOfHour();
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekyear();
        long long15 = dateTime13.getMillis();
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime13, dateTimeZone19);
        long long23 = dateTimeZone19.convertLocalToUTC(5555762122L, false);
        org.joda.time.DateTime dateTime24 = dateTime4.withZone(dateTimeZone19);
        long long28 = dateTimeZone19.convertLocalToUTC(1646723780752L, true, 1640782080000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime24", (dateTime4.compareTo(dateTime24) == 0) == dateTime4.equals(dateTime24));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.joda.time.Instant instant9 = instant1.withDurationAdded((long) 12, 23);
        org.joda.time.Instant instant12 = instant1.withDurationAdded((long) 26309603, 14);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant12.plus(readableDuration13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(4);
        boolean boolean7 = dateTime6.isEqualNow();
        org.joda.time.Instant instant8 = dateTime6.toInstant();
        org.joda.time.DateTime dateTime9 = dateTime6.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate10 = dateTime6.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime6", (instant8.compareTo(dateTime6) == 0) == instant8.equals(dateTime6));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.DateTime dateTime5 = instant1.toDateTime();
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.weekyear();
        int int12 = dateTime10.getYear();
        org.joda.time.DateTime dateTime13 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone16);
        org.joda.time.LocalTime localTime19 = localTime17.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localTime17.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime21.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long27 = dateTimeZone22.getMillisKeepLocal(dateTimeZone25, (long) '4');
        org.joda.time.DateTime dateTime28 = dateTime13.toDateTime(dateTimeZone25);
        boolean boolean29 = instant1.isAfter((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime31 = dateTime13.withWeekyear((-457037));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology1 = null;
        boolean boolean2 = durationFieldType0.isSupported(chronology1);
        java.lang.String str3 = durationFieldType0.toString();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.toDateTime(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.weekOfWeekyear();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        org.joda.time.DateTime dateTime12 = property10.withMaximumValue();
        org.joda.time.DateTime dateTime14 = property10.addToCopy((long) 31);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.minuteOfDay();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((int) (byte) 1, 8, 23, 0, 4, chronology22);
        org.joda.time.DurationField durationField26 = chronology22.centuries();
        org.joda.time.DateTimeField dateTimeField27 = chronology22.yearOfEra();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 362, chronology22);
        org.joda.time.Chronology chronology29 = chronology22.withUTC();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) dateTime14, chronology29);
        boolean boolean31 = durationFieldType0.isSupported(chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime30", (dateTime14.compareTo(dateTime30) == 0) == dateTime14.equals(dateTime30));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
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
        java.util.Calendar.Builder builder36 = new java.util.Calendar.Builder();
        java.util.Calendar calendar37 = builder36.build();
        java.util.Calendar.Builder builder39 = builder36.setLenient(false);
        java.util.Calendar.Builder builder41 = builder39.setLenient(false);
        java.util.Calendar.Builder builder46 = builder39.setTimeOfDay(20, 66514147, 600032, 24);
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology49 = localDate48.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.minuteOfDay();
        boolean boolean51 = durationFieldType47.isSupported(chronology49);
        org.joda.time.DateTimeField dateTimeField52 = chronology49.yearOfEra();
        org.joda.time.DateTimeField dateTimeField53 = chronology49.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField54 = chronology49.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField55 = chronology49.clockhourOfHalfday();
        java.util.Locale locale59 = new java.util.Locale("24", "hi!");
        java.lang.String str60 = dateTimeField55.getAsShortText(5555776727L, locale59);
        java.util.Calendar.Builder builder61 = builder46.setLocale(locale59);
        java.util.Locale locale64 = new java.util.Locale("52", "2024-01-23");
        java.lang.String str65 = locale64.getDisplayVariant();
        java.lang.String str66 = locale59.getDisplayLanguage(locale64);
        java.lang.String str67 = timeZone26.getDisplayName(locale64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar7 and calendar23", (calendar7.compareTo(calendar23) == 0) == calendar7.equals(calendar23));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone4);
        org.joda.time.LocalTime localTime7 = localTime5.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localTime5.toDateTimeToday(dateTimeZone8);
        boolean boolean11 = dateTime9.isAfter((long) 2);
        org.joda.time.DateTime dateTime13 = dateTime9.minusDays(1);
        org.joda.time.DateTime dateTime15 = dateTime9.minusHours((-1));
        int int16 = dateTime9.getCenturyOfEra();
        boolean boolean17 = instant2.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Instant instant18 = instant2.toInstant();
        org.joda.time.Instant instant19 = instant18.toInstant();
        org.joda.time.DateTime dateTime20 = instant19.toDateTimeISO();
        org.joda.time.DateTime dateTime22 = dateTime20.withYear((-52));
        int int23 = dateTime22.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime20", (instant0.compareTo(dateTime20) == 0) == instant0.equals(dateTime20));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        long long8 = chronology2.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DurationField durationField9 = durationFieldType0.getField(chronology2);
        org.joda.time.DurationField durationField10 = chronology2.millis();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology2.add(readablePeriod11, (long) 19059, (int) ' ');
        org.joda.time.DurationField durationField15 = chronology2.weeks();
        org.joda.time.DurationField durationField16 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField16, durationField9, and durationField10", !(durationField16.compareTo(durationField9) == 0) || (Math.signum(durationField16.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DateTime dateTime4 = instant2.toDateTime();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("2024-01-23");
        java.lang.String str7 = locale6.getISO3Language();
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        boolean boolean9 = instant2.equals((java.lang.Object) charSet8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant2.minus(readableDuration10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime4", (instant11.compareTo(dateTime4) == 0) == instant11.equals(dateTime4));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) (short) 100);
        int int18 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter4.withZone(dateTimeZone13);
        java.lang.String str20 = dateTimeZone13.toString();
        long long22 = dateTimeZone13.convertUTCToLocal((-19819295999995L));
        java.lang.Object obj23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj23, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property28 = dateTime27.yearOfEra();
        org.joda.time.Instant instant29 = dateTime27.toInstant();
        boolean boolean30 = dateTimeZone13.equals((java.lang.Object) dateTime27);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone32);
        org.joda.time.LocalTime localTime35 = localTime33.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localTime33.toDateTimeToday(dateTimeZone36);
        int int38 = dateTime37.getWeekyear();
        int int39 = dateTime37.getSecondOfDay();
        boolean boolean40 = dateTime37.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime37.getZone();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone43);
        org.joda.time.LocalTime localTime46 = localTime44.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localTime44.toDateTimeToday(dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTime48.getZone();
        boolean boolean50 = dateTimeZone49.isFixed();
        long long52 = dateTimeZone41.getMillisKeepLocal(dateTimeZone49, 63871718400000L);
        org.joda.time.format.DateTimePrinter dateTimePrinter53 = null;
        org.joda.time.format.DateTimeParser dateTimeParser54 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter53, dateTimeParser54);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter55.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter55.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser58 = dateTimeFormatter55.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter55.withDefaultYear(10);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone62);
        org.joda.time.LocalTime localTime65 = localTime63.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = localTime63.toDateTimeToday(dateTimeZone66);
        boolean boolean69 = dateTime67.isAfter((long) 2);
        org.joda.time.DateTime dateTime71 = dateTime67.minusDays(1);
        org.joda.time.DateTime dateTime73 = dateTime67.minusHours((-1));
        java.lang.String str74 = dateTime67.toString();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.LocalTime localTime77 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone76);
        org.joda.time.LocalTime localTime79 = localTime77.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone80 = null;
        org.joda.time.DateTime dateTime81 = localTime77.toDateTimeToday(dateTimeZone80);
        org.joda.time.DateTimeZone dateTimeZone82 = dateTime81.getZone();
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long87 = dateTimeZone82.getMillisKeepLocal(dateTimeZone85, (long) '4');
        org.joda.time.DateTime dateTime88 = dateTime67.toDateTime(dateTimeZone82);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter89 = dateTimeFormatter60.withZone(dateTimeZone82);
        long long91 = dateTimeZone41.getMillisKeepLocal(dateTimeZone82, 0L);
        org.joda.time.DateTime dateTime92 = dateTime27.withZoneRetainFields(dateTimeZone41);
        org.joda.time.DateTime dateTime94 = dateTime92.withWeekyear((-1970));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime92 and instant29", (dateTime92.compareTo(instant29) == 0) == dateTime92.equals(instant29));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime1.millisOfSecond();
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        long long11 = dateTime9.getMillis();
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime9, dateTimeZone15);
        org.joda.time.DateTime dateTime17 = dateTime1.toDateTime(dateTimeZone15);
        java.lang.String str18 = dateTimeZone15.getID();
        java.util.Locale locale23 = new java.util.Locale("CN", "07:17:41.892", "DurationField[millis]");
        java.lang.String str24 = dateTimeZone15.getShortName(1646723778642L, locale23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime17", (dateTime1.compareTo(dateTime17) == 0) == dateTime1.equals(dateTime17));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
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
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusMinutes(354);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getDurationType();
        int int39 = localDateTime36.get(dateTimeFieldType37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime13", (dateTime2.compareTo(dateTime13) == 0) == dateTime2.equals(dateTime13));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withZone(dateTimeZone10);
        boolean boolean13 = dateTime9.isAfter((long) 4);
        org.joda.time.DateTime dateTime15 = dateTime9.minusMillis(53);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.now(dateTimeZone16);
        long long20 = dateTimeZone16.convertLocalToUTC(22L, true);
        org.joda.time.DateTime dateTime21 = dateTime9.toDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 82800000);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '#');
        int int26 = dateTime25.getMonthOfYear();
        org.joda.time.DateTime dateTime28 = dateTime25.plusMinutes(1340);
        int int29 = dateTime28.getMillisOfSecond();
        org.joda.time.DateTime dateTime31 = dateTime28.withDayOfYear(24);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime28.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime28.getZone();
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = dateTime23.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime21.withZoneRetainFields(dateTimeZone33);
        org.joda.time.DateTime dateTime37 = dateTime5.toDateTime(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime21", (dateTime9.compareTo(dateTime21) == 0) == dateTime9.equals(dateTime21));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
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
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(435);
        int int42 = dateTimeZone40.getOffsetFromLocal(1646723759380L);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology45 = localDate44.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField47 = chronology45.minuteOfDay();
        java.util.Locale locale49 = java.util.Locale.CANADA;
        java.lang.String str50 = locale49.toLanguageTag();
        java.lang.String str51 = locale49.getDisplayVariant();
        java.lang.String str52 = dateTimeField47.getAsText((long) (short) 100, locale49);
        java.util.Set<java.lang.Character> charSet53 = locale49.getExtensionKeys();
        java.lang.String str54 = dateTimeZone40.getShortName((long) 66514147, locale49);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime56 = dateTime36.toMutableDateTime(dateTimeZone40);
        boolean boolean58 = dateTimeZone40.isStandardOffset((long) 26174796);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and mutableDateTime56", (dateTime36.compareTo(mutableDateTime56) == 0) == dateTime36.equals(mutableDateTime56));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(23);
        boolean boolean8 = dateTimeZone6.isStandardOffset((long) 0);
        boolean boolean9 = dateTimeZone6.isFixed();
        org.joda.time.DateTime dateTime10 = dateTime2.toDateTime(dateTimeZone6);
        int int12 = dateTimeZone6.getStandardOffset((long) 32772);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime10", (dateTime2.compareTo(dateTime10) == 0) == dateTime2.equals(dateTime10));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((long) 12, 80982);
        org.joda.time.Instant instant8 = instant5.withDurationAdded((long) 689, 29);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.weekyear();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        int int15 = localDate13.getDayOfWeek();
        org.joda.time.LocalDate localDate17 = localDate13.minusYears(10);
        int[] intArray18 = localDate13.getValues();
        org.joda.time.LocalDate.Property property19 = localDate13.era();
        org.joda.time.LocalDate localDate21 = localDate13.minusYears(2012);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate23 = localDate13.plus(readablePeriod22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        int int26 = localDate24.getDayOfWeek();
        org.joda.time.LocalDate localDate28 = localDate24.minusYears(10);
        int[] intArray29 = localDate24.getValues();
        int int30 = dateTimeField12.getMaximumValue((org.joda.time.ReadablePartial) localDate23, intArray29);
        java.lang.String str32 = dateTimeField12.getAsText(1646723929634L);
        int int34 = dateTimeField12.getMaximumValue(626L);
        boolean boolean35 = instant8.equals((java.lang.Object) int34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
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
        org.joda.time.LocalDate localDate16 = localDate14.plusWeeks(32770);
        org.joda.time.LocalDate localDate18 = localDate16.minusYears(671);
        org.joda.time.LocalDate localDate20 = localDate16.minusMonths(80998);
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.Instant instant23 = instant21.plus((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant26 = instant23.withDurationAdded(readableDuration24, 51);
        org.joda.time.Instant instant27 = instant23.toInstant();
        org.joda.time.Instant instant29 = instant27.withMillis((-1260954909386381L));
        org.joda.time.DateTime dateTime30 = localDate16.toDateTime((org.joda.time.ReadableInstant) instant29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.minuteOfDay();
        boolean boolean5 = durationFieldType1.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.eras();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 26174796, chronology3);
        org.joda.time.Chronology chronology8 = chronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.dayOfMonth();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        int int12 = localDate10.getDayOfWeek();
        org.joda.time.LocalDate localDate14 = localDate10.plusMonths((int) '4');
        org.joda.time.LocalDate localDate16 = localDate14.withWeekyear(436);
        org.joda.time.LocalDate.Property property17 = localDate16.dayOfYear();
        org.joda.time.LocalDate localDate18 = property17.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.minuteOfDay();
        org.joda.time.Chronology chronology22 = chronology20.withUTC();
        org.joda.time.DurationField durationField23 = chronology20.centuries();
        org.joda.time.DateTimeField dateTimeField24 = chronology20.minuteOfDay();
        java.lang.Object obj25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj25, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property30 = dateTime29.weekyear();
        int int31 = dateTime29.getYear();
        org.joda.time.DateTime dateTime32 = dateTime29.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.hours();
        boolean boolean35 = localDate33.isSupported(durationFieldType34);
        int int36 = localDate33.size();
        org.joda.time.DateTime dateTime37 = dateTime32.withFields((org.joda.time.ReadablePartial) localDate33);
        org.joda.time.LocalDate localDate39 = localDate33.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int41 = localDate33.get(dateTimeFieldType40);
        org.joda.time.LocalDate localDate43 = localDate33.withWeekyear(26162278);
        org.joda.time.LocalDate.Property property44 = localDate43.era();
        long long46 = chronology20.set((org.joda.time.ReadablePartial) localDate43, 1645514192328L);
        java.lang.String[] strArray66 = new java.lang.String[] { "22", "", "22", "en-CA", "16", "16", "French", "1", "en-CA", "24", "0", "en-CA", "hi!", "1", "2022", "zho", "0", "", "ISOChronology[UTC]" };
        java.util.LinkedHashSet<java.lang.String> strSet67 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet67, strArray66);
        java.util.Locale.LanguageRange[] languageRangeArray69 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList70 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70, languageRangeArray69);
        java.util.Locale[] localeArray72 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList73 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList73, localeArray72);
        java.util.Locale.FilteringMode filteringMode75 = null;
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList70, (java.util.Collection<java.util.Locale>) localeList73, filteringMode75);
        boolean boolean77 = strSet67.removeAll((java.util.Collection<java.util.Locale>) localeList73);
        int int78 = strSet67.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean80 = strSet67.remove((java.lang.Object) dateTimeFieldType79);
        boolean boolean81 = localDate43.isSupported(dateTimeFieldType79);
        java.lang.Object obj82 = null;
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime(obj82, dateTimeZone83);
        org.joda.time.DateTime dateTime86 = dateTime84.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property87 = dateTime86.weekyear();
        java.lang.String str88 = property87.getAsText();
        int int89 = property87.get();
        org.joda.time.LocalDate localDate90 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology91 = localDate90.getChronology();
        int int92 = property87.compareTo((org.joda.time.ReadablePartial) localDate90);
        int[] intArray93 = localDate90.getValues();
        boolean boolean94 = localDate43.equals((java.lang.Object) intArray93);
        chronology3.validate((org.joda.time.ReadablePartial) localDate18, intArray93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField23", Math.signum(durationField6.compareTo(durationField23)) == -Math.signum(durationField23.compareTo(durationField6)));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
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
        boolean boolean16 = instant15.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant15", (dateTime13.compareTo(instant15) == 0) == dateTime13.equals(instant15));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
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
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay(0L);
        org.joda.time.LocalTime localTime20 = localTime18.plusMillis((-1));
        org.joda.time.LocalTime.Property property21 = localTime20.hourOfDay();
        org.joda.time.LocalTime localTime22 = property21.roundHalfCeilingCopy();
        java.lang.String str23 = property21.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property21.getFieldType();
        int int25 = dateTime16.get(dateTimeFieldType24);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime28 = localTime26.minusMillis(0);
        org.joda.time.LocalTime localTime30 = localTime26.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime.Property property31 = localTime26.hourOfDay();
        java.lang.String str32 = property31.getAsShortText();
        org.joda.time.LocalTime localTime33 = property31.getLocalTime();
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType24.getField(chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime16", (instant12.compareTo(dateTime16) == 0) == instant12.equals(dateTime16));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
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
        int int18 = dateTime17.getEra();
        org.joda.time.Instant instant20 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime21 = instant20.toMutableDateTime();
        boolean boolean22 = dateTime17.isBefore((org.joda.time.ReadableInstant) instant20);
        org.joda.time.DateTime dateTime23 = instant20.toDateTime();
        java.util.Date date24 = dateTime23.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime17", (dateTime6.compareTo(dateTime17) == 0) == dateTime6.equals(dateTime17));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
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
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj19, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property24 = dateTime23.weekyear();
        org.joda.time.DateTime dateTime25 = property24.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar26 = dateTime25.toGregorianCalendar();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        int int29 = localDate27.getDayOfWeek();
        org.joda.time.LocalDate localDate31 = localDate27.minusYears(10);
        int[] intArray32 = localDate27.getValues();
        org.joda.time.LocalDate.Property property33 = localDate27.era();
        boolean boolean34 = gregorianCalendar26.before((java.lang.Object) property33);
        java.util.Date date36 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((java.lang.Object) date36);
        gregorianCalendar26.setTime(date36);
        date36.setMonth(1340);
        gregorianCalendar7.setTime(date36);
        java.lang.Object obj42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(obj42, dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property47 = dateTime46.weekyear();
        int int48 = dateTime46.getYear();
        org.joda.time.DateTime dateTime49 = dateTime46.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime52 = dateTime46.withPeriodAdded(readablePeriod50, (int) '#');
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.year();
        org.joda.time.DateTime dateTime58 = dateTime46.withChronology(chronology54);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((java.lang.Object) date36, chronology54);
        org.joda.time.DateTimeField dateTimeField60 = chronology54.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime58", (dateTime23.compareTo(dateTime58) == 0) == dateTime23.equals(dateTime58));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.DateTime dateTime5 = instant1.toDateTime();
        org.joda.time.Instant instant7 = instant1.withMillis(1646723868942L);
        boolean boolean8 = instant7.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant7 = instant1.withDurationAdded(readableDuration5, 13);
        org.joda.time.DateTimeZone dateTimeZone8 = instant1.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant1", (mutableDateTime2.compareTo(instant1) == 0) == mutableDateTime2.equals(instant1));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.LocalDate localDate7 = property6.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property6.addWrapFieldToCopy((-292275054));
        int int10 = property6.getLeapAmount();
        org.joda.time.LocalDate localDate11 = property6.roundHalfFloorCopy();
        java.lang.Object obj12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj12, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusHours(4);
        java.util.GregorianCalendar gregorianCalendar19 = dateTime16.toGregorianCalendar();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.year();
        boolean boolean21 = dateTime16.isSupported(dateTimeFieldType20);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.minuteOfDay();
        boolean boolean26 = durationFieldType22.isSupported(chronology24);
        org.joda.time.DateTimeField dateTimeField27 = chronology24.millisOfSecond();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology24);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.minuteOfDay();
        java.lang.String str33 = chronology30.toString();
        org.joda.time.DateTime dateTime34 = dateTime28.withChronology(chronology30);
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType20.getField(chronology30);
        int int36 = localDate11.get(dateTimeFieldType20);
        java.lang.String str37 = dateTimeFieldType20.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime28", (dateTime14.compareTo(dateTime28) == 0) == dateTime14.equals(dateTime28));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
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
        org.joda.time.DateTime dateTime12 = dateTime4.withWeekOfWeekyear(40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime8", (dateTime4.compareTo(dateTime8) == 0) == dateTime4.equals(dateTime8));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime7 = instant1.toMutableDateTime();
        int int8 = mutableDateTime7.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.minuteOfDay();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((int) (byte) 1, 8, 23, 0, 4, chronology6);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(0);
        org.joda.time.DateTime dateTime13 = dateTime9.minusYears(59);
        org.joda.time.DateTime dateTime15 = dateTime9.withCenturyOfEra(66521);
        java.lang.Object obj16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj16, dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property21 = dateTime20.weekyear();
        org.joda.time.DateTime dateTime22 = property21.roundCeilingCopy();
        org.joda.time.DurationField durationField23 = property21.getDurationField();
        org.joda.time.DateTime dateTime24 = property21.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean28 = dateTimeZone27.isFixed();
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.now(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime24.toMutableDateTime(dateTimeZone27);
        int int31 = dateTime24.getMonthOfYear();
        boolean boolean32 = dateTime9.isBefore((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.hours();
        boolean boolean35 = localDate33.isSupported(durationFieldType34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology38 = localDate37.getChronology();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(chronology38);
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType36.getField(chronology38);
        boolean boolean41 = durationFieldType34.isSupported(chronology38);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology44 = localDate43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.minuteOfDay();
        long long50 = chronology44.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DurationField durationField51 = durationFieldType42.getField(chronology44);
        org.joda.time.DateTimeField dateTimeField52 = chronology44.secondOfDay();
        org.joda.time.DateTimeField dateTimeField53 = chronology44.secondOfMinute();
        boolean boolean54 = durationFieldType34.isSupported(chronology44);
        org.joda.time.DateTime dateTime55 = dateTime9.toDateTime(chronology44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and mutableDateTime30", (dateTime24.compareTo(mutableDateTime30) == 0) == dateTime24.equals(mutableDateTime30));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
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
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime13", (dateTime2.compareTo(dateTime13) == 0) == dateTime2.equals(dateTime13));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
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
        int int19 = localDate14.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate21 = localDate14.withWeekyear(26182169);
        org.joda.time.LocalDate localDate23 = localDate14.plusMonths(25);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        int int26 = localDate24.getDayOfWeek();
        org.joda.time.LocalDate localDate28 = localDate24.minusYears(10);
        int[] intArray29 = localDate24.getValues();
        org.joda.time.LocalDate.Property property30 = localDate24.era();
        org.joda.time.LocalDate localDate31 = property30.roundCeilingCopy();
        org.joda.time.LocalDate localDate33 = property30.addWrapFieldToCopy((-292275054));
        int int34 = property30.getLeapAmount();
        org.joda.time.LocalDate localDate35 = property30.roundHalfFloorCopy();
        java.lang.Object obj36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(obj36, dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime42 = dateTime40.plusHours(4);
        java.util.GregorianCalendar gregorianCalendar43 = dateTime40.toGregorianCalendar();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.year();
        boolean boolean45 = dateTime40.isSupported(dateTimeFieldType44);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology48 = localDate47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.minuteOfDay();
        boolean boolean50 = durationFieldType46.isSupported(chronology48);
        org.joda.time.DateTimeField dateTimeField51 = chronology48.millisOfSecond();
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(chronology48);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.minuteOfDay();
        java.lang.String str57 = chronology54.toString();
        org.joda.time.DateTime dateTime58 = dateTime52.withChronology(chronology54);
        org.joda.time.DateTimeField dateTimeField59 = dateTimeFieldType44.getField(chronology54);
        int int60 = localDate35.get(dateTimeFieldType44);
        boolean boolean61 = localDate23.isSupported(dateTimeFieldType44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime52", (dateTime2.compareTo(dateTime52) == 0) == dateTime2.equals(dateTime52));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Instant instant3 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant1.withDurationAdded(readableDuration4, 15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant6", (dateTime2.compareTo(instant6) == 0) == dateTime2.equals(instant6));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfEra();
        org.joda.time.Instant instant6 = dateTime4.toInstant();
        org.joda.time.Instant instant8 = instant6.withMillis((long) 435);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 26388882);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant6", (dateTime4.compareTo(instant6) == 0) == dateTime4.equals(instant6));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfEra();
        org.joda.time.Instant instant6 = dateTime4.toInstant();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        boolean boolean9 = instant6.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant6", (dateTime4.compareTo(instant6) == 0) == dateTime4.equals(instant6));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DateTime dateTime4 = instant2.toDateTime();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant2.plus(readableDuration5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime4", (instant6.compareTo(dateTime4) == 0) == instant6.equals(dateTime4));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
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
        org.joda.time.DateTime dateTime25 = dateTime8.withEarlierOffsetAtOverlap();
        java.util.GregorianCalendar gregorianCalendar26 = dateTime25.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime24", (dateTime25.compareTo(dateTime24) == 0) == dateTime25.equals(dateTime24));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeField dateTimeField3 = chronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = chronology1.getZone();
        long long9 = dateTimeZone5.convertLocalToUTC(604800000L, false, (long) 2001);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.withZone(dateTimeZone14);
        int int16 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) dateTime13);
        long long18 = dateTimeZone5.nextTransition(1645514177279L);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        int int20 = localDate19.getDayOfWeek();
        org.joda.time.DateTime dateTime21 = localDate19.toDateTimeAtMidnight();
        java.lang.Object obj22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj22, dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property27 = dateTime26.weekyear();
        java.lang.String str28 = property27.getAsText();
        int int29 = property27.get();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        int int32 = property27.compareTo((org.joda.time.ReadablePartial) localDate30);
        org.joda.time.LocalDate localDate34 = localDate30.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate36 = localDate34.plus(readablePeriod35);
        org.joda.time.LocalDate localDate38 = localDate36.plusWeeks(32770);
        org.joda.time.LocalDate localDate39 = localDate19.withFields((org.joda.time.ReadablePartial) localDate38);
        java.lang.Object obj40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(obj40, dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property45 = dateTime44.weekyear();
        org.joda.time.DateTime dateTime47 = property45.addToCopy(9);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.DateTime dateTime49 = dateTime47.minus(readablePeriod48);
        org.joda.time.DateTime dateTime50 = localDate39.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        java.util.Date date51 = dateTime50.toDate();
        org.joda.time.Instant instant52 = dateTime50.toInstant();
        org.joda.time.Chronology chronology53 = instant52.getChronology();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((java.lang.Object) 1645514177279L, chronology53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime50 and instant52", (dateTime50.compareTo(instant52) == 0) == dateTime50.equals(instant52));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
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
        java.lang.String str48 = calendar47.getCalendarType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime30", (dateTime4.compareTo(mutableDateTime30) == 0) == dateTime4.equals(mutableDateTime30));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
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
        boolean boolean24 = dateTime7.isBefore(78513478L);
        org.joda.time.DateTime dateTime26 = dateTime7.plusWeeks(66571079);
        org.joda.time.DateTime dateTime28 = dateTime7.minusWeeks(0);
        org.joda.time.DateTime dateTime30 = dateTime28.plusYears(44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime22", (dateTime28.compareTo(dateTime22) == 0) == dateTime28.equals(dateTime22));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
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
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime((long) '#');
        int int78 = dateTime77.getMonthOfYear();
        org.joda.time.DateTime dateTime80 = dateTime77.plusMinutes(1340);
        int int81 = dateTime80.getMillisOfSecond();
        org.joda.time.DateTime dateTime83 = dateTime80.withDayOfYear(24);
        org.joda.time.MutableDateTime mutableDateTime84 = dateTime80.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone85 = dateTime80.getZone();
        boolean boolean86 = dateTime75.equals((java.lang.Object) dateTime80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime71", (dateTime6.compareTo(dateTime71) == 0) == dateTime6.equals(dateTime71));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
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
        org.joda.time.DurationField durationField14 = chronology10.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField13", Math.signum(durationField5.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField5)));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        long long8 = chronology2.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DurationField durationField9 = durationFieldType0.getField(chronology2);
        org.joda.time.DurationField durationField10 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology2.era();
        org.joda.time.DurationField durationField13 = chronology2.days();
        org.joda.time.DurationField durationField14 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField9, and durationField10", !(durationField14.compareTo(durationField9) == 0) || (Math.signum(durationField14.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        calendar2.clear((int) (byte) 1);
        int int5 = calendar2.getWeeksInWeekYear();
        calendar2.set(15, 38, 19, (int) (byte) 0, 8);
        calendar2.set(2022, 66521, (-1970));
        java.util.Calendar calendar16 = java.util.Calendar.getInstance();
        int int18 = calendar16.getGreatestMinimum(11);
        calendar16.set((int) (short) 1, 34, 435, 435, 5, 67);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("2022");
        int int28 = timeZone27.getRawOffset();
        calendar16.setTimeZone(timeZone27);
        boolean boolean30 = calendar16.isWeekDateSupported();
        java.util.Date date31 = calendar16.getTime();
        calendar2.setTime(date31);
        date31.setSeconds(29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar16", (calendar2.compareTo(calendar16) == 0) == calendar2.equals(calendar16));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withMillisOfDay((int) 'a');
        org.joda.time.LocalTime.Property property5 = localTime0.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property5.setCopy((int) '#');
        org.joda.time.LocalTime localTime8 = property5.withMinimumValue();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.days();
        boolean boolean10 = localTime8.isSupported(durationFieldType9);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField18 = durationFieldType9.getField(chronology16);
        org.joda.time.DurationField durationField19 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField19", Math.signum(durationField18.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField18)));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        java.lang.String str4 = chronology1.toString();
        org.joda.time.DurationField durationField5 = chronology1.weeks();
        org.joda.time.DurationField durationField6 = chronology1.eras();
        org.joda.time.DurationField durationField7 = chronology1.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField6", Math.signum(durationField5.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField5)));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = chronology1.weeks();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime4.getZone();
        long long9 = dateTimeZone7.convertUTCToLocal(1646723967458L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime6", (dateTime4.compareTo(dateTime6) == 0) == dateTime4.equals(dateTime6));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
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
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime17", (dateTime6.compareTo(dateTime17) == 0) == dateTime6.equals(dateTime17));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(1646723835553L);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfDay();
        boolean boolean6 = durationFieldType2.isSupported(chronology4);
        org.joda.time.DateTimeField dateTimeField7 = chronology4.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology4.yearOfEra();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now(chronology4);
        org.joda.time.DurationField durationField12 = chronology4.seconds();
        org.joda.time.DateTime dateTime13 = dateTime1.withChronology(chronology4);
        org.joda.time.DurationField durationField14 = chronology4.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime13", (dateTime1.compareTo(dateTime13) == 0) == dateTime1.equals(dateTime13));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
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
        org.joda.time.DateTime dateTime24 = dateTime20.withWeekyear(2021);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.minus(readableDuration25);
        org.joda.time.DateTime dateTime27 = dateTime26.toDateTime();
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant28.plus((long) (short) 0);
        org.joda.time.Chronology chronology31 = instant30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime32 = instant30.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime33 = instant30.toMutableDateTimeISO();
        org.joda.time.Instant instant35 = instant30.minus(1645514207470L);
        boolean boolean36 = dateTime27.isAfter((org.joda.time.ReadableInstant) instant35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant28", (dateTime2.compareTo(instant28) == 0) == dateTime2.equals(instant28));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 27445396);
        java.lang.String str6 = instant5.toString();
        org.joda.time.Instant instant8 = instant5.minus(31536000000L);
        org.joda.time.Instant instant9 = instant8.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        java.util.Date date1 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant2 = new org.joda.time.Instant((java.lang.Object) date1);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DateTime dateTime4 = instant2.toDateTimeISO();
        org.joda.time.Instant instant7 = instant2.withDurationAdded(600032L, (int) 'x');
        org.joda.time.Instant instant10 = instant2.withDurationAdded((long) 162, 0);
        org.joda.time.Instant instant11 = instant2.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant11", (dateTime4.compareTo(instant11) == 0) == dateTime4.equals(instant11));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
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
        org.joda.time.Instant instant20 = instant18.withMillis(66578439L);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant23 = instant20.withDurationAdded(readableDuration21, 66587392);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant18", (dateTime6.compareTo(instant18) == 0) == dateTime6.equals(instant18));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
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
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        int int13 = dateTime12.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime12", (dateTime2.compareTo(dateTime12) == 0) == dateTime2.equals(dateTime12));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.Instant instant5 = instant1.toInstant();
        org.joda.time.MutableDateTime mutableDateTime6 = instant1.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant1", (mutableDateTime2.compareTo(instant1) == 0) == mutableDateTime2.equals(instant1));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
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
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        java.util.Locale.LanguageRange[] languageRangeArray34 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList35 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList35, languageRangeArray34);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.Locale[] localeArray40 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList41 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList41, localeArray40);
        java.util.Locale.FilteringMode filteringMode43 = null;
        java.util.List<java.util.Locale> localeList44 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.util.Locale>) localeList41, filteringMode43);
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList35, (java.util.Collection<java.util.Locale>) localeList44);
        java.util.Locale locale46 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.util.Locale>) localeList44);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.util.Locale[] localeArray50 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList51 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList51, localeArray50);
        java.util.Locale.FilteringMode filteringMode53 = null;
        java.util.List<java.util.Locale> localeList54 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.util.Locale>) localeList51, filteringMode53);
        java.util.Locale locale55 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.util.Locale>) localeList54);
        boolean boolean56 = strSet20.containsAll((java.util.Collection<java.util.Locale>) localeList54);
        java.lang.Object obj57 = null;
        boolean boolean58 = strSet20.equals(obj57);
        boolean boolean60 = strSet20.add("Thu Feb 24 00:00:00 GMT+00:00 2022");
        strSet20.clear();
        java.util.TimeZone timeZone63 = java.util.TimeZone.getTimeZone("2022-02-24T11:11:59.999+59:12");
        java.util.TimeZone timeZone65 = java.util.TimeZone.getTimeZone("2022");
        int int66 = timeZone65.getRawOffset();
        timeZone65.setRawOffset(0);
        java.util.Calendar calendar69 = java.util.Calendar.getInstance(timeZone65);
        java.util.TimeZone timeZone71 = java.util.TimeZone.getTimeZone("2022");
        int int72 = timeZone71.getRawOffset();
        timeZone71.setRawOffset(0);
        java.util.Calendar calendar75 = java.util.Calendar.getInstance(timeZone71);
        java.lang.String str76 = timeZone71.getID();
        java.util.TimeZone timeZone78 = java.util.TimeZone.getTimeZone("2022");
        timeZone78.setID("French");
        java.util.TimeZone.setDefault(timeZone78);
        boolean boolean82 = timeZone71.hasSameRules(timeZone78);
        calendar69.setTimeZone(timeZone71);
        boolean boolean84 = timeZone63.hasSameRules(timeZone71);
        java.util.Calendar calendar85 = java.util.Calendar.getInstance(timeZone63);
        long long86 = calendar85.getTimeInMillis();
        java.util.TimeZone timeZone88 = java.util.TimeZone.getTimeZone("2022");
        int int89 = timeZone88.getRawOffset();
        timeZone88.setRawOffset(0);
        timeZone88.setRawOffset((int) '4');
        boolean boolean94 = timeZone88.observesDaylightTime();
        java.lang.String str95 = timeZone88.getID();
        java.util.TimeZone.setDefault(timeZone88);
        calendar85.setTimeZone(timeZone88);
        boolean boolean98 = strSet20.equals((java.lang.Object) calendar85);
        java.util.Spliterator<java.lang.String> strSpliterator99 = strSet20.spliterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar69 and calendar85", (calendar69.compareTo(calendar85) == 0) == calendar69.equals(calendar85));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 66514657);
        org.joda.time.MutableDateTime mutableDateTime6 = instant1.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant1", (dateTime2.compareTo(instant1) == 0) == dateTime2.equals(instant1));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DurationField durationField5 = chronology2.eras();
        java.lang.String str6 = chronology2.toString();
        org.joda.time.DurationField durationField7 = chronology2.eras();
        org.joda.time.DurationField durationField8 = chronology2.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField8, and durationField5", !(durationField5.compareTo(durationField8) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField8.compareTo(durationField5))));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        org.joda.time.DurationField durationField4 = chronology1.days();
        org.joda.time.DurationField durationField5 = chronology1.centuries();
        org.joda.time.DurationField durationField6 = chronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField4, and durationField5", !(durationField6.compareTo(durationField4) == 0) || (Math.signum(durationField6.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = chronology1.hours();
        org.joda.time.DurationField durationField4 = chronology1.years();
        org.joda.time.DurationField durationField5 = chronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField3, and durationField4", !(durationField5.compareTo(durationField3) == 0) || (Math.signum(durationField5.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
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
        org.joda.time.DurationField durationField29 = chronology22.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
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
        org.joda.time.DateTime dateTime20 = dateTime15.minusWeeks(338);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime15", (instant16.compareTo(dateTime15) == 0) == instant16.equals(dateTime15));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
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
        org.joda.time.DateMidnight dateMidnight19 = dateTime18.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant16", (dateTime18.compareTo(instant16) == 0) == dateTime18.equals(instant16));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
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
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar7);
        org.joda.time.LocalDate localDate18 = localDate16.withYearOfEra(44);
        org.joda.time.LocalDate.Property property19 = localDate18.dayOfWeek();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.minuteOfDay();
        boolean boolean24 = durationFieldType20.isSupported(chronology22);
        org.joda.time.DateTimeField dateTimeField25 = chronology22.millisOfSecond();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology22);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.minuteOfDay();
        java.lang.String str31 = chronology28.toString();
        org.joda.time.DateTime dateTime32 = dateTime26.withChronology(chronology28);
        org.joda.time.DateTimeField dateTimeField33 = chronology28.secondOfDay();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((java.lang.Object) localDate18, chronology28);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.hourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = property37.getField();
        org.joda.time.LocalTime localTime40 = property37.addNoWrapToCopy(4);
        org.joda.time.LocalTime.Property property41 = localTime40.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.toDateTime(dateTimeZone46);
        org.joda.time.DateTime.Property property48 = dateTime47.weekOfWeekyear();
        org.joda.time.DateTime dateTime49 = property48.roundCeilingCopy();
        org.joda.time.DateTime dateTime50 = property48.withMaximumValue();
        org.joda.time.DateTime dateTime51 = dateTime50.withEarlierOffsetAtOverlap();
        java.lang.Object obj52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(obj52, dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property57 = dateTime56.weekyear();
        long long58 = dateTime56.getMillis();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone60);
        org.joda.time.LocalTime localTime63 = localTime61.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = localTime61.toDateTimeToday(dateTimeZone64);
        org.joda.time.DateTimeZone dateTimeZone66 = dateTime65.getZone();
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime70 = dateTime68.minusMinutes((int) (short) 100);
        int int71 = dateTimeZone66.getOffset((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime dateTime72 = dateTime56.withZoneRetainFields(dateTimeZone66);
        org.joda.time.DateTime dateTime73 = dateTime50.toDateTime(dateTimeZone66);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.LocalTime localTime76 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone75);
        org.joda.time.LocalTime localTime78 = localTime76.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.DateTime dateTime80 = localTime76.toDateTimeToday(dateTimeZone79);
        org.joda.time.DateTimeZone dateTimeZone81 = dateTime80.getZone();
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime85 = dateTime83.minusMinutes((int) (short) 100);
        int int86 = dateTimeZone81.getOffset((org.joda.time.ReadableInstant) dateTime85);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone81);
        long long89 = dateTimeZone66.getMillisKeepLocal(dateTimeZone81, (long) 16);
        org.joda.time.DateTime dateTime90 = localDate34.toDateTime(localTime40, dateTimeZone81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime26", (dateTime2.compareTo(dateTime26) == 0) == dateTime2.equals(dateTime26));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
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
        org.joda.time.DateTime dateTime16 = dateTime14.plusMillis(96);
        org.joda.time.DateTime.Property property17 = dateTime16.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime14", (dateTime4.compareTo(dateTime14) == 0) == dateTime4.equals(dateTime14));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        java.lang.String str6 = dateTime5.toString();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant7.withDurationAdded(readableDuration8, (-284887059));
        org.joda.time.Instant instant12 = instant10.minus(1646723869361L);
        org.joda.time.DateTime dateTime13 = instant10.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant10", (dateTime3.compareTo(instant10) == 0) == dateTime3.equals(instant10));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
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
        org.joda.time.DateTime dateTime28 = dateTime24.withDurationAdded((long) 959, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant25", (dateTime3.compareTo(instant25) == 0) == dateTime3.equals(instant25));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localTime2.getFields();
        org.joda.time.DateTime dateTime4 = localTime2.toDateTimeToday();
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime6 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime8 = dateTime4.minusMillis(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime8", (instant5.compareTo(dateTime8) == 0) == instant5.equals(dateTime8));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTime();
        org.joda.time.Instant instant7 = instant1.withMillis(12L);
        long long8 = instant7.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 66514657);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.months();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTimeISO();
        org.joda.time.DateTime dateTime2 = dateTime1.toDateTimeISO();
        java.util.Date date6 = new java.util.Date(2, 15, (int) (short) -1);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromDateFields(date6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYear(22);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusDays(6);
        int int19 = localDateTime18.getDayOfYear();
        org.joda.time.Chronology chronology20 = localDateTime18.getChronology();
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.yearOfCentury();
        org.joda.time.LocalDateTime.Property property22 = localDateTime18.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property22.getFieldType();
        org.joda.time.LocalDateTime.Property property24 = localDateTime7.property(dateTimeFieldType23);
        int int25 = dateTime2.get(dateTimeFieldType23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime2", (instant0.compareTo(dateTime2) == 0) == instant0.equals(dateTime2));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
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
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj19, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property24 = dateTime23.weekyear();
        org.joda.time.DateTime dateTime25 = property24.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar26 = dateTime25.toGregorianCalendar();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        int int29 = localDate27.getDayOfWeek();
        org.joda.time.LocalDate localDate31 = localDate27.minusYears(10);
        int[] intArray32 = localDate27.getValues();
        org.joda.time.LocalDate.Property property33 = localDate27.era();
        boolean boolean34 = gregorianCalendar26.before((java.lang.Object) property33);
        java.util.Date date36 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((java.lang.Object) date36);
        gregorianCalendar26.setTime(date36);
        date36.setMonth(1340);
        gregorianCalendar7.setTime(date36);
        java.lang.Object obj42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(obj42, dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property47 = dateTime46.weekyear();
        int int48 = dateTime46.getYear();
        org.joda.time.DateTime dateTime49 = dateTime46.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime52 = dateTime46.withPeriodAdded(readablePeriod50, (int) '#');
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.year();
        org.joda.time.DateTime dateTime58 = dateTime46.withChronology(chronology54);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((java.lang.Object) date36, chronology54);
        org.joda.time.DurationField durationField60 = chronology54.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime58", (dateTime4.compareTo(dateTime58) == 0) == dateTime4.equals(dateTime58));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
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
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withYearOfCentury(34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.withYear(32770);
        int[] intArray38 = localDateTime37.getValues();
        int int39 = localDateTime37.getMillisOfSecond();
        boolean boolean40 = dateTimeZone25.isLocalDateTimeGap(localDateTime37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime30", (dateTime4.compareTo(mutableDateTime30) == 0) == dateTime4.equals(mutableDateTime30));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
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
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime26 = dateTime24.minusMinutes((int) (short) 100);
        int int27 = dateTime26.getSecondOfMinute();
        boolean boolean28 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime26);
        int int29 = dateTime26.getYear();
        org.joda.time.DateTime.Property property30 = dateTime26.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime22", (dateTime4.compareTo(dateTime22) == 0) == dateTime4.equals(dateTime22));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("CAN");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.Object obj3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj3, dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property8 = dateTime7.weekyear();
        int int9 = dateTime7.getYear();
        org.joda.time.DateTime dateTime10 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone13);
        org.joda.time.LocalTime localTime16 = localTime14.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = localTime14.toDateTimeToday(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long24 = dateTimeZone19.getMillisKeepLocal(dateTimeZone22, (long) '4');
        org.joda.time.DateTime dateTime25 = dateTime10.toDateTime(dateTimeZone22);
        boolean boolean27 = dateTime10.isBefore(78513478L);
        org.joda.time.DateTime dateTime29 = dateTime10.plusWeeks(66571079);
        org.joda.time.DateTime dateTime31 = dateTime10.minusWeeks(0);
        boolean boolean32 = languageRange1.equals((java.lang.Object) dateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime25", (dateTime10.compareTo(dateTime25) == 0) == dateTime10.equals(dateTime25));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
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
        org.joda.time.LocalDateTime localDateTime32 = property29.addWrapFieldToCopy(116);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime13", (dateTime2.compareTo(dateTime13) == 0) == dateTime2.equals(dateTime13));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        java.util.Calendar.Builder builder5 = builder3.setLenient(false);
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("yearOfCentury");
        java.util.Calendar.Builder builder8 = builder3.setLocale(locale7);
        java.util.Calendar calendar9 = builder8.build();
        java.util.Calendar.Builder builder13 = builder8.setTimeOfDay(85680000, 194, (-27445396));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar9", (calendar1.compareTo(calendar9) == 0) == calendar1.equals(calendar9));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.DateTime dateTime5 = instant1.toDateTime();
        org.joda.time.Instant instant7 = instant1.withMillis(1646723868942L);
        org.joda.time.DateTime dateTime8 = instant7.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
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
        org.joda.time.DurationField durationField23 = chronology20.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime22", (dateTime3.compareTo(dateTime22) == 0) == dateTime3.equals(dateTime22));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        int int2 = dateTime1.getMonthOfYear();
        org.joda.time.DateTime dateTime4 = dateTime1.plusMinutes(1340);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.minus(readablePeriod5);
        int int7 = dateTime6.getHourOfDay();
        int int8 = dateTime6.getMillisOfSecond();
        org.joda.time.Instant instant9 = dateTime6.toInstant();
        org.joda.time.Instant instant11 = instant9.plus(1646724022760L);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.minus(readableDuration12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant9", (dateTime1.compareTo(instant9) == 0) == dateTime1.equals(instant9));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
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
        org.joda.time.DateTime dateTime25 = dateTime7.withMillisOfDay(59);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime27 = dateTime7.minus(readableDuration26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.plus(readablePeriod28);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.minuteOfDay();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((int) (byte) 1, 8, 23, 0, 4, chronology36);
        org.joda.time.DateTimeField dateTimeField40 = chronology36.clockhourOfDay();
        org.joda.time.DateTime dateTime41 = dateTime27.toDateTime(chronology36);
        boolean boolean43 = dateTime27.isBefore(719999L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime41", (dateTime27.compareTo(dateTime41) == 0) == dateTime27.equals(dateTime41));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = localTime2.minusHours(2021);
        int int9 = localTime2.getSecondOfMinute();
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj10, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        java.lang.String str16 = property15.getAsText();
        org.joda.time.DurationField durationField17 = property15.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property15.getFieldType();
        java.lang.String str19 = dateTimeFieldType18.toString();
        boolean boolean20 = localTime2.isSupported(dateTimeFieldType18);
        org.joda.time.DateTime dateTime21 = localTime2.toDateTimeToday();
        org.joda.time.DateTime dateTime23 = dateTime21.minusMillis(17);
        int int24 = dateTime23.getYear();
        org.joda.time.DateTime dateTime26 = dateTime23.plusMillis(2131200);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(549, 1);
        java.lang.String str31 = dateTimeZone29.getName(1646723777197L);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime26.toMutableDateTime(dateTimeZone29);
        org.joda.time.Chronology chronology33 = dateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and mutableDateTime32", (dateTime26.compareTo(mutableDateTime32) == 0) == dateTime26.equals(mutableDateTime32));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        java.lang.String str6 = dateTime5.toString();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant7.withDurationAdded(readableDuration8, (-284887059));
        org.joda.time.Instant instant12 = instant10.minus(1646723869361L);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean19 = dateTimeZone18.isFixed();
        int int21 = dateTimeZone18.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime22 = localDate15.toDateTimeAtCurrentTime(dateTimeZone18);
        long long26 = dateTimeZone18.convertLocalToUTC((long) (short) 0, false, (long) 8);
        long long29 = dateTimeZone18.adjustOffset((long) (byte) 10, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime31 = instant10.toMutableDateTime(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant10", (dateTime3.compareTo(instant10) == 0) == dateTime3.equals(instant10));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = chronology1.weeks();
        org.joda.time.DurationField durationField4 = chronology1.halfdays();
        org.joda.time.DurationField durationField5 = chronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField3, and durationField4", !(durationField5.compareTo(durationField3) == 0) || (Math.signum(durationField5.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.Instant instant7 = instant4.withDurationAdded((long) 1969, 5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime2", (instant4.compareTo(mutableDateTime2) == 0) == instant4.equals(mutableDateTime2));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
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
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime16 = localTime14.minusMillis(0);
        org.joda.time.LocalTime localTime18 = localTime14.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime localTime20 = localTime14.minusMinutes(11);
        int int21 = localTime14.getMillisOfDay();
        int int22 = localTime14.size();
        int int23 = dateTimeField12.getMaximumValue((org.joda.time.ReadablePartial) localTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        java.util.Date date1 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant2 = new org.joda.time.Instant((java.lang.Object) date1);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DateTime dateTime4 = instant2.toDateTimeISO();
        org.joda.time.Instant instant7 = instant2.withDurationAdded(600032L, (int) 'x');
        org.joda.time.Instant instant8 = instant2.toInstant();
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime11.minusDays((int) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime11.plusMinutes(86399);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone20);
        org.joda.time.LocalTime localTime23 = localTime21.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localTime21.toDateTimeToday(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        boolean boolean27 = localTime18.equals((java.lang.Object) dateTimeZone26);
        org.joda.time.DateTime dateTime28 = dateTime17.toDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime30 = dateTime17.withMillisOfDay(66609);
        boolean boolean31 = instant8.isAfter((org.joda.time.ReadableInstant) dateTime30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime4", (instant8.compareTo(dateTime4) == 0) == instant8.equals(dateTime4));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.weekyear();
        org.joda.time.DurationField durationField4 = chronology1.eras();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.hourOfHalfday();
        java.util.Locale locale8 = new java.util.Locale("1");
        java.lang.String str9 = dateTimeField5.getAsText(26312454, locale8);
        org.joda.time.DurationField durationField10 = dateTimeField5.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField10, and durationField4", !(durationField4.compareTo(durationField10) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField10.compareTo(durationField4))));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTime6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.millisOfSecond();
        org.joda.time.DurationField durationField13 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField13", Math.signum(durationField11.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField11)));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
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
        org.joda.time.DateTimeField dateTimeField19 = chronology16.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime18", (dateTime2.compareTo(dateTime18) == 0) == dateTime2.equals(dateTime18));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
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
        long long33 = dateTimeZone27.convertLocalToUTC(60144394838400000L, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime15", (dateTime3.compareTo(dateTime15) == 0) == dateTime3.equals(dateTime15));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = instant2.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant7 = instant2.withDurationAdded(readableDuration5, 26308533);
        org.joda.time.DateTime dateTime8 = instant2.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime4", (instant2.compareTo(mutableDateTime4) == 0) == instant2.equals(mutableDateTime4));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
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
        org.joda.time.Instant instant28 = instant26.plus(1645514437838L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant19", (dateTime6.compareTo(instant19) == 0) == dateTime6.equals(instant19));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfEra();
        org.joda.time.Instant instant6 = dateTime4.toInstant();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant10 = instant6.withMillis(1646724093342L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant6", (dateTime4.compareTo(instant6) == 0) == dateTime4.equals(instant6));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
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
        org.joda.time.DateTime dateTime32 = dateTime4.minusHours(443);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime30", (dateTime4.compareTo(mutableDateTime30) == 0) == dateTime4.equals(mutableDateTime30));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
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
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.minuteOfDay();
        org.joda.time.DurationField durationField23 = chronology20.days();
        org.joda.time.Chronology chronology24 = chronology20.withUTC();
        org.joda.time.DateTime dateTime25 = dateTime16.withChronology(chronology24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType26.getField(chronology28);
        int int31 = dateTime25.get(dateTimeFieldType26);
        java.lang.String str32 = dateTimeFieldType26.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime25", (dateTime16.compareTo(dateTime25) == 0) == dateTime16.equals(dateTime25));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.minuteOfDay();
        boolean boolean5 = durationFieldType1.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.eras();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(1646723766584L, chronology3);
        org.joda.time.LocalDate localDate9 = localDate7.minusWeeks(19045);
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
        org.joda.time.LocalDate localDate22 = localDate18.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate22.plus(readablePeriod23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int26 = localDate24.get(dateTimeFieldType25);
        java.lang.String str28 = localDate24.toString("24");
        int int29 = localDate24.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate31 = localDate24.withWeekyear(26182169);
        org.joda.time.DateTime dateTime32 = localDate24.toDateTimeAtMidnight();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.plus(readableDuration33);
        java.lang.Object obj35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(obj35, dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property40 = dateTime39.weekyear();
        int int41 = dateTime39.getYear();
        org.joda.time.DateTime dateTime42 = dateTime39.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.hours();
        boolean boolean45 = localDate43.isSupported(durationFieldType44);
        int int46 = localDate43.size();
        org.joda.time.DateTime dateTime47 = dateTime42.withFields((org.joda.time.ReadablePartial) localDate43);
        java.lang.Object obj48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(obj48, dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property53 = dateTime52.weekyear();
        java.lang.String str54 = property53.getAsText();
        org.joda.time.DurationField durationField55 = property53.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property53.getFieldType();
        java.lang.String str57 = dateTimeFieldType56.toString();
        boolean boolean58 = dateTime42.isSupported(dateTimeFieldType56);
        int int59 = dateTime34.get(dateTimeFieldType56);
        java.lang.String str60 = dateTimeFieldType56.toString();
        org.joda.time.LocalDate.Property property61 = localDate7.property(dateTimeFieldType56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField55", Math.signum(durationField6.compareTo(durationField55)) == -Math.signum(durationField55.compareTo(durationField6)));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(7);
        int int5 = dateTime4.getMonthOfYear();
        int int6 = dateTime4.getDayOfMonth();
        org.joda.time.DateTime.Property property7 = dateTime4.minuteOfHour();
        org.joda.time.DateTime.Property property8 = dateTime4.minuteOfHour();
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekyear();
        long long15 = dateTime13.getMillis();
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime13, dateTimeZone19);
        long long23 = dateTimeZone19.convertLocalToUTC(5555762122L, false);
        org.joda.time.DateTime dateTime24 = dateTime4.withZone(dateTimeZone19);
        org.joda.time.DateTime.Property property25 = dateTime4.yearOfCentury();
        long long26 = property25.remainder();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime24", (dateTime4.compareTo(dateTime24) == 0) == dateTime4.equals(dateTime24));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        boolean boolean8 = durationFieldType0.isSupported(chronology6);
        org.joda.time.DurationField durationField9 = chronology6.weeks();
        org.joda.time.DurationField durationField10 = chronology6.millis();
        org.joda.time.DurationField durationField11 = chronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField9, and durationField10", !(durationField11.compareTo(durationField9) == 0) || (Math.signum(durationField11.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay((int) (short) 100, 16, 3, 53);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("2022");
        timeZone8.setID("French");
        java.util.Calendar.Builder builder11 = builder6.setTimeZone(timeZone8);
        java.util.Calendar.Builder builder15 = builder6.setTimeOfDay(19059, 366, (int) (short) -1);
        java.util.Locale locale16 = java.util.Locale.CHINA;
        boolean boolean17 = locale16.hasExtensions();
        java.util.Locale locale20 = new java.util.Locale("24", "hi!");
        java.lang.String str21 = locale16.getDisplayLanguage(locale20);
        java.util.Calendar.Builder builder22 = builder6.setLocale(locale20);
        java.util.Calendar.Builder builder26 = builder6.setWeekDate(34320, 20, (int) (byte) 100);
        java.util.Calendar.Builder builder31 = builder26.setTimeOfDay(34320, (-284887120), 26308533, 2652);
        java.util.TimeZone timeZone33 = java.util.TimeZone.getTimeZone("2022");
        int int34 = timeZone33.getRawOffset();
        timeZone33.setRawOffset(0);
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone33);
        java.util.Calendar calendar38 = java.util.Calendar.getInstance();
        int int40 = calendar38.getGreatestMinimum(11);
        calendar38.set((int) (short) 1, 34, 435, 435, 5, 67);
        java.util.TimeZone timeZone49 = java.util.TimeZone.getTimeZone("2022");
        int int50 = timeZone49.getRawOffset();
        calendar38.setTimeZone(timeZone49);
        boolean boolean52 = timeZone33.hasSameRules(timeZone49);
        java.time.ZoneId zoneId53 = timeZone33.toZoneId();
        java.util.Calendar.Builder builder54 = builder31.setTimeZone(timeZone33);
        boolean boolean55 = timeZone33.observesDaylightTime();
        timeZone33.setID("Property[hourOfDay]");
        java.util.Calendar calendar58 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime59 = org.joda.time.LocalTime.fromCalendarFields(calendar58);
        calendar58.setLenient(false);
        java.util.TimeZone timeZone63 = java.util.TimeZone.getTimeZone("2022");
        int int64 = timeZone63.getRawOffset();
        java.util.TimeZone.setDefault(timeZone63);
        java.util.TimeZone timeZone67 = java.util.TimeZone.getTimeZone("weekyear");
        boolean boolean68 = timeZone63.hasSameRules(timeZone67);
        timeZone63.setID("Dec 2, 3921 12:00:00 AM");
        calendar58.setTimeZone(timeZone63);
        calendar58.set(66514657, 96, (int) '#');
        calendar58.clear();
        java.util.Date date77 = calendar58.getTime();
        boolean boolean78 = timeZone33.inDaylightTime(date77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar58", (calendar1.compareTo(calendar58) == 0) == calendar1.equals(calendar58));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.Instant instant9 = instant8.toInstant();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant8.plus(readableDuration10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant11", (dateTime3.compareTo(instant11) == 0) == dateTime3.equals(instant11));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
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
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.plus(readablePeriod30);
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str34 = locale33.getISO3Language();
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale33.getDisplayLanguage(locale35);
        boolean boolean37 = locale33.hasExtensions();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology39 = localDate38.getChronology();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate(chronology39);
        org.joda.time.Chronology chronology41 = localDate40.getChronology();
        org.joda.time.LocalDate.Property property42 = localDate40.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDate localDate44 = localDate40.plus(readablePeriod43);
        org.joda.time.LocalDate localDate46 = localDate44.withCenturyOfEra(2722);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology48 = localDate47.getChronology();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(chronology48);
        org.joda.time.LocalDate.Property property50 = localDate49.yearOfEra();
        org.joda.time.LocalDate localDate51 = property50.withMinimumValue();
        java.util.Locale locale52 = java.util.Locale.ITALIAN;
        boolean boolean53 = locale52.hasExtensions();
        int int54 = property50.getMaximumShortTextLength(locale52);
        boolean boolean55 = localDate44.equals((java.lang.Object) locale52);
        java.lang.String str56 = locale33.getDisplayCountry(locale52);
        java.lang.String str57 = dateTime29.toString("457", locale33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime29", (dateTime22.compareTo(dateTime29) == 0) == dateTime22.equals(dateTime29));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.joda.time.Instant instant9 = instant1.withDurationAdded((long) 12, 23);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant1.plus(readableDuration10);
        java.util.Date date12 = instant11.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime2", (instant11.compareTo(mutableDateTime2) == 0) == instant11.equals(mutableDateTime2));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
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
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(435);
        int int42 = dateTimeZone40.getOffsetFromLocal(1646723759380L);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology45 = localDate44.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField47 = chronology45.minuteOfDay();
        java.util.Locale locale49 = java.util.Locale.CANADA;
        java.lang.String str50 = locale49.toLanguageTag();
        java.lang.String str51 = locale49.getDisplayVariant();
        java.lang.String str52 = dateTimeField47.getAsText((long) (short) 100, locale49);
        java.util.Set<java.lang.Character> charSet53 = locale49.getExtensionKeys();
        java.lang.String str54 = dateTimeZone40.getShortName((long) 66514147, locale49);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime56 = dateTime36.toMutableDateTime(dateTimeZone40);
        java.lang.String str58 = dateTimeZone40.getNameKey(5555991681L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and mutableDateTime56", (dateTime36.compareTo(mutableDateTime56) == 0) == dateTime36.equals(mutableDateTime56));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        java.util.Date date1 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant2 = new org.joda.time.Instant((java.lang.Object) date1);
        org.joda.time.Instant instant4 = instant2.minus(1646723760165L);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant2.minus(readableDuration5);
        org.joda.time.Instant instant8 = instant2.withMillis(8L);
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekyear();
        long long15 = dateTime13.getMillis();
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime13, dateTimeZone19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime24 = instant8.toDateTime(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime22", (dateTime11.compareTo(dateTime22) == 0) == dateTime11.equals(dateTime22));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
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
        org.joda.time.DateTime dateTime30 = dateTime8.plusWeeks(66514147);
        org.joda.time.LocalTime localTime31 = dateTime30.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology2);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.minuteOfDay();
        java.lang.String str11 = chronology8.toString();
        org.joda.time.DateTime dateTime12 = dateTime6.withChronology(chronology8);
        org.joda.time.DateTime dateTime14 = dateTime12.plusHours(116);
        int int15 = dateTime14.getEra();
        java.lang.Object obj17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj17, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property22 = dateTime21.weekyear();
        int int23 = dateTime21.getYear();
        org.joda.time.DateTime dateTime24 = dateTime21.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean28 = dateTimeZone27.isFixed();
        int int30 = dateTimeZone27.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime31 = dateTime24.withZoneRetainFields(dateTimeZone27);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(725809896000L, dateTimeZone27);
        org.joda.time.DateTime dateTime33 = dateTime14.toDateTime(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime19", (dateTime6.compareTo(dateTime19) == 0) == dateTime6.equals(dateTime19));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
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
        org.joda.time.DateTimeField dateTimeField24 = chronology22.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime23", (dateTime4.compareTo(dateTime23) == 0) == dateTime4.equals(dateTime23));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getGreatestMinimum(11);
        calendar0.set((int) (short) 1, 34, 435, 435, 5, 67);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("2022");
        int int12 = timeZone11.getRawOffset();
        calendar0.setTimeZone(timeZone11);
        boolean boolean14 = calendar0.isWeekDateSupported();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        java.util.TimeZone timeZone16 = calendar0.getTimeZone();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance();
        int int19 = calendar17.getGreatestMinimum(11);
        calendar17.set((int) (short) 1, 34, 435, 435, 5, 67);
        java.util.TimeZone timeZone28 = java.util.TimeZone.getTimeZone("2022");
        int int29 = timeZone28.getRawOffset();
        calendar17.setTimeZone(timeZone28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours(23);
        java.util.TimeZone timeZone33 = dateTimeZone32.toTimeZone();
        boolean boolean34 = timeZone28.hasSameRules(timeZone33);
        timeZone28.setID("GMT+00:00");
        boolean boolean37 = timeZone16.hasSameRules(timeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar17", (calendar0.compareTo(calendar17) == 0) == calendar0.equals(calendar17));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = instant2.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = instant2.toMutableDateTimeISO();
        org.joda.time.Instant instant7 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime8 = instant7.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime9 = instant7.toMutableDateTimeISO();
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj10, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readableDuration15);
        boolean boolean17 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) dateTime14);
        boolean boolean18 = mutableDateTime5.isEqual((org.joda.time.ReadableInstant) mutableDateTime9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime4", (instant0.compareTo(mutableDateTime4) == 0) == instant0.equals(mutableDateTime4));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
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
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = null;
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter25, dateTimeParser26);
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter27.withLocale(locale28);
        java.lang.String str30 = dateTimeField23.getAsText((long) 66534, locale28);
        int int32 = dateTimeField23.getMinimumValue(971927104809387L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime16", (dateTime2.compareTo(dateTime16) == 0) == dateTime2.equals(dateTime16));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
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
        org.joda.time.LocalDate localDate16 = property14.roundHalfFloorCopy();
        org.joda.time.DurationField durationField17 = property14.getDurationField();
        org.joda.time.LocalDate localDate18 = property14.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        int int21 = localDate19.getDayOfWeek();
        org.joda.time.LocalDate localDate23 = localDate19.minusMonths(32770);
        java.lang.Object obj24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj24, dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property29 = dateTime28.weekyear();
        org.joda.time.DateTime dateTime30 = property29.roundCeilingCopy();
        org.joda.time.DateTime dateTime32 = dateTime30.withCenturyOfEra((int) ' ');
        java.lang.Object obj33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(obj33, dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property38 = dateTime37.weekyear();
        java.lang.String str39 = property38.getAsText();
        org.joda.time.DurationField durationField40 = property38.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property38.getFieldType();
        java.lang.String str42 = dateTimeFieldType41.toString();
        boolean boolean43 = dateTime32.isSupported(dateTimeFieldType41);
        org.joda.time.LocalDate.Property property44 = localDate19.property(dateTimeFieldType41);
        java.lang.String str45 = localDate19.toString();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean49 = dateTimeZone48.isFixed();
        int int51 = dateTimeZone48.getStandardOffset((long) (-1));
        org.joda.time.Interval interval52 = localDate19.toInterval(dateTimeZone48);
        org.joda.time.Interval interval53 = localDate18.toInterval(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField40", Math.signum(durationField17.compareTo(durationField40)) == -Math.signum(durationField40.compareTo(durationField17)));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
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
        org.joda.time.DateTime dateTime22 = instant19.toDateTimeISO();
        org.joda.time.DateTime dateTime24 = dateTime22.plusSeconds(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant19", (dateTime6.compareTo(instant19) == 0) == dateTime6.equals(instant19));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
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
        int int77 = dateTime76.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime71", (dateTime6.compareTo(dateTime71) == 0) == dateTime6.equals(dateTime71));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
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
        org.joda.time.DurationField durationField24 = chronology15.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime23", (dateTime4.compareTo(mutableDateTime23) == 0) == dateTime4.equals(mutableDateTime23));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
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
        org.joda.time.DateTime dateTime48 = dateTime22.withYear(67);
        int int49 = dateTime48.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime22", (dateTime4.compareTo(dateTime22) == 0) == dateTime4.equals(dateTime22));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.minuteOfDay();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((int) (byte) 1, 8, 23, 0, 4, chronology6);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(0);
        org.joda.time.DateTime dateTime13 = dateTime9.minusYears(59);
        java.lang.Object obj14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj14, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYear(7);
        boolean boolean19 = dateTime9.isBefore((org.joda.time.ReadableInstant) dateTime18);
        int int20 = dateTime18.getYear();
        int int21 = dateTime18.getYearOfCentury();
        java.lang.Object obj22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj22, dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property27 = dateTime26.weekyear();
        int int28 = dateTime26.getYear();
        org.joda.time.DateTime dateTime29 = dateTime26.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean33 = dateTimeZone32.isFixed();
        int int35 = dateTimeZone32.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime36 = dateTime29.withZoneRetainFields(dateTimeZone32);
        org.joda.time.DateTime dateTime37 = dateTime18.toDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime37", (dateTime18.compareTo(dateTime37) == 0) == dateTime18.equals(dateTime37));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime6.getZone();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime11 = dateTime9.minusMinutes((int) (short) 100);
        int int12 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) dateTime11);
        int int14 = dateTimeZone7.getStandardOffset((long) 7);
        java.lang.String str16 = dateTimeZone7.getShortName((long) 23);
        long long18 = dateTimeZone7.nextTransition(37440032L);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone20);
        org.joda.time.LocalTime localTime23 = localTime21.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localTime21.toDateTimeToday(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes((int) (short) 100);
        int int31 = dateTimeZone26.getOffset((org.joda.time.ReadableInstant) dateTime30);
        boolean boolean33 = dateTimeZone26.isStandardOffset((long) 10);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone26);
        long long36 = dateTimeZone7.getMillisKeepLocal(dateTimeZone26, 1646723948714L);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(122, 0);
        org.joda.time.LocalTime localTime40 = org.joda.time.LocalTime.now(dateTimeZone39);
        java.util.TimeZone timeZone41 = dateTimeZone39.toTimeZone();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone39);
        long long44 = dateTimeZone7.getMillisKeepLocal(dateTimeZone39, (long) 2000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and dateTime42", (dateTime34.compareTo(dateTime42) == 0) == dateTime34.equals(dateTime42));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTime.Property property4 = dateTime1.secondOfMinute();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate7 = localDate5.minusDays((int) 'a');
        org.joda.time.Chronology chronology8 = localDate5.getChronology();
        org.joda.time.DateTime dateTime9 = dateTime1.withChronology(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime9", (dateTime1.compareTo(dateTime9) == 0) == dateTime1.equals(dateTime9));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DurationField durationField5 = chronology2.eras();
        java.lang.String str6 = chronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.monthOfYear();
        org.joda.time.DurationField durationField9 = chronology2.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField9, and durationField5", !(durationField5.compareTo(durationField9) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField9.compareTo(durationField5))));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTime();
        org.joda.time.Instant instant7 = instant1.withMillis(12L);
        org.joda.time.MutableDateTime mutableDateTime8 = instant1.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime9 = instant1.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant1", (dateTime2.compareTo(instant1) == 0) == dateTime2.equals(instant1));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1646723752816L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.minus(readableDuration2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant1.plus(readableDuration4);
        org.joda.time.Instant instant7 = instant1.withMillis((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, 213120000);
        org.joda.time.DateTime dateTime11 = instant1.toDateTime();
        org.joda.time.DateTime dateTime12 = instant1.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime11", (instant1.compareTo(dateTime11) == 0) == instant1.equals(dateTime11));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.Instant instant9 = instant8.toInstant();
        org.joda.time.Instant instant11 = instant9.withMillis(1646724022936L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant9", (dateTime3.compareTo(instant9) == 0) == dateTime3.equals(instant9));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, 51);
        org.joda.time.Instant instant6 = instant5.toInstant();
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        long long8 = instant6.getMillis();
        boolean boolean9 = instant6.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime7", (instant6.compareTo(dateTime7) == 0) == instant6.equals(dateTime7));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
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
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant36 = instant33.withDurationAdded(readableDuration34, 26299625);
        org.joda.time.Instant instant37 = instant36.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant37", (dateTime31.compareTo(instant37) == 0) == dateTime31.equals(instant37));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        long long9 = dateTimeField7.roundHalfFloor(1646723823994L);
        java.lang.String str11 = dateTimeField7.getAsText((long) 216);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.minuteOfDay();
        boolean boolean17 = durationFieldType13.isSupported(chronology15);
        org.joda.time.DateTimeField dateTimeField18 = chronology15.millisOfSecond();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField20 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = chronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField23 = chronology15.yearOfCentury();
        java.lang.String str24 = dateTimeField23.toString();
        boolean boolean26 = dateTimeField23.isLeap(26891009280000L);
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.minuteOfDay();
        boolean boolean33 = durationFieldType29.isSupported(chronology31);
        org.joda.time.DateTimeField dateTimeField34 = chronology31.yearOfEra();
        org.joda.time.DateTimeField dateTimeField35 = chronology31.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = chronology31.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField37 = chronology31.clockhourOfHalfday();
        java.util.Locale locale41 = new java.util.Locale("24", "hi!");
        java.lang.String str42 = dateTimeField37.getAsShortText(5555776727L, locale41);
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.minuteOfDay();
        boolean boolean48 = durationFieldType44.isSupported(chronology46);
        org.joda.time.DateTimeField dateTimeField49 = chronology46.yearOfEra();
        org.joda.time.DateTimeField dateTimeField50 = chronology46.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField51 = chronology46.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField52 = chronology46.clockhourOfHalfday();
        java.util.Locale locale56 = new java.util.Locale("24", "hi!");
        java.lang.String str57 = dateTimeField52.getAsShortText(5555776727L, locale56);
        java.lang.String str58 = dateTimeField37.getAsShortText(35, locale56);
        java.lang.String str59 = locale56.getLanguage();
        java.util.Locale locale60 = locale56.stripExtensions();
        java.lang.String str62 = locale56.getExtension('a');
        long long63 = dateTimeField23.set(1646723960289L, "31", locale56);
        java.lang.String str64 = dateTimeField7.getAsText(66700352, locale56);
        java.lang.Class<?> wildcardClass65 = locale56.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime19", (dateTime2.compareTo(dateTime19) == 0) == dateTime2.equals(dateTime19));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay((int) (short) 100, 16, 3, 53);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("2022");
        timeZone8.setID("French");
        java.util.Calendar.Builder builder11 = builder6.setTimeZone(timeZone8);
        java.util.Calendar.Builder builder15 = builder6.setTimeOfDay(19059, 366, (int) (short) -1);
        java.util.Locale locale16 = java.util.Locale.CHINA;
        boolean boolean17 = locale16.hasExtensions();
        java.util.Locale locale20 = new java.util.Locale("24", "hi!");
        java.lang.String str21 = locale16.getDisplayLanguage(locale20);
        java.util.Calendar.Builder builder22 = builder6.setLocale(locale20);
        java.util.Calendar.Builder builder24 = builder22.setLenient(false);
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone("2022-02-24T11:11:59.999+59:12");
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
        boolean boolean47 = timeZone26.hasSameRules(timeZone34);
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone26);
        java.util.Calendar.Builder builder49 = builder22.setTimeZone(timeZone26);
        java.util.TimeZone timeZone51 = java.util.TimeZone.getTimeZone("2022");
        int int52 = timeZone51.getRawOffset();
        timeZone51.setRawOffset(0);
        java.util.Calendar calendar55 = java.util.Calendar.getInstance(timeZone51);
        java.util.Calendar calendar56 = java.util.Calendar.getInstance();
        int int58 = calendar56.getGreatestMinimum(11);
        calendar56.set((int) (short) 1, 34, 435, 435, 5, 67);
        java.util.TimeZone timeZone67 = java.util.TimeZone.getTimeZone("2022");
        int int68 = timeZone67.getRawOffset();
        calendar56.setTimeZone(timeZone67);
        boolean boolean70 = timeZone51.hasSameRules(timeZone67);
        java.time.ZoneId zoneId71 = timeZone51.toZoneId();
        java.util.TimeZone timeZone72 = java.util.TimeZone.getTimeZone(zoneId71);
        timeZone72.setID("52");
        boolean boolean75 = timeZone72.observesDaylightTime();
        java.util.Locale locale79 = new java.util.Locale("hi!", "", "");
        java.lang.String str80 = locale79.getDisplayScript();
        java.util.Locale locale84 = new java.util.Locale("hi!", "", "");
        java.lang.String str85 = locale79.getDisplayScript(locale84);
        java.lang.String str86 = locale79.getDisplayName();
        java.util.Calendar calendar87 = java.util.Calendar.getInstance(timeZone72, locale79);
        boolean boolean88 = timeZone26.hasSameRules(timeZone72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar87", (calendar32.compareTo(calendar87) == 0) == calendar32.equals(calendar87));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getYearOfEra();
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property5 = localDate0.dayOfYear();
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtMidnight();
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        int int13 = dateTime11.getYear();
        org.joda.time.DateTime dateTime14 = dateTime11.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone17);
        org.joda.time.LocalTime localTime20 = localTime18.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localTime18.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime22.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long28 = dateTimeZone23.getMillisKeepLocal(dateTimeZone26, (long) '4');
        org.joda.time.DateTime dateTime29 = dateTime14.toDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime30 = localDate0.toDateTimeAtMidnight(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime29", (dateTime11.compareTo(dateTime29) == 0) == dateTime11.equals(dateTime29));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
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
        boolean boolean19 = dateTimeZone10.isStandardOffset(55181969565353805L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime15", (dateTime2.compareTo(dateTime15) == 0) == dateTime2.equals(dateTime15));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
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
        org.joda.time.DateTime dateTime19 = dateTime17.withMillisOfDay(16);
        org.joda.time.DateTime.Property property20 = dateTime17.millisOfSecond();
        org.joda.time.DateTime dateTime21 = property20.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime21", (dateTime6.compareTo(dateTime21) == 0) == dateTime6.equals(dateTime21));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DurationField durationField3 = chronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.secondOfMinute();
        org.joda.time.DurationField durationField6 = chronology1.eras();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(chronology1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(23);
        boolean boolean8 = dateTimeZone6.isStandardOffset((long) 0);
        boolean boolean9 = dateTimeZone6.isFixed();
        org.joda.time.DateTime dateTime10 = dateTime2.toDateTime(dateTimeZone6);
        boolean boolean12 = dateTime2.isBefore(520500000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime10", (mutableDateTime3.compareTo(dateTime10) == 0) == mutableDateTime3.equals(dateTime10));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
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
        org.joda.time.LocalTime localTime72 = new org.joda.time.LocalTime(dateTimeZone63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime71", (dateTime3.compareTo(dateTime71) == 0) == dateTime3.equals(dateTime71));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
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
        org.joda.time.Instant instant20 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime21 = instant20.toMutableDateTimeISO();
        org.joda.time.Instant instant23 = instant20.plus(1646723751922L);
        org.joda.time.DateTime dateTime24 = instant20.toDateTime();
        java.lang.Object obj25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj25, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime31 = dateTime29.withMillis((long) 292278993);
        org.joda.time.DateTime dateTime33 = dateTime29.minusSeconds(66514147);
        int int34 = instant20.compareTo((org.joda.time.ReadableInstant) dateTime29);
        boolean boolean35 = instant18.isBefore((org.joda.time.ReadableInstant) dateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and mutableDateTime21", (instant20.compareTo(mutableDateTime21) == 0) == instant20.equals(mutableDateTime21));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = chronology1.weeks();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime4.getZone();
        java.lang.String str9 = dateTimeZone7.getShortName(1646723919336L);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(dateTimeZone7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime6", (dateTime4.compareTo(dateTime6) == 0) == dateTime4.equals(dateTime6));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
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
        int int19 = localDate14.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate21 = localDate14.withWeekyear(26182169);
        java.lang.Object obj22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj22, dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property27 = dateTime26.weekyear();
        long long28 = dateTime26.getMillis();
        org.joda.time.DateTime.Property property29 = dateTime26.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime26, dateTimeZone32);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.era();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.dayOfYear();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusDays(100);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withEra(0);
        boolean boolean48 = dateTimeZone32.isLocalDateTimeGap(localDateTime47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.plusMinutes(52);
        org.joda.time.LocalDateTime.Property property51 = localDateTime47.yearOfEra();
        org.joda.time.LocalDateTime localDateTime52 = property51.roundFloorCopy();
        boolean boolean53 = property51.isLeap();
        org.joda.time.LocalDateTime localDateTime54 = property51.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate55 = localDate21.withFields((org.joda.time.ReadablePartial) localDateTime54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime35", (dateTime2.compareTo(dateTime35) == 0) == dateTime2.equals(dateTime35));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant7 = instant1.withDurationAdded(readableDuration5, 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(435);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 26302, dateTimeZone10);
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime13 = instant7.toMutableDateTime(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime2", (instant7.compareTo(mutableDateTime2) == 0) == instant7.equals(mutableDateTime2));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
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
        org.joda.time.DateTimeField dateTimeField85 = chronology81.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime84", (dateTime36.compareTo(dateTime84) == 0) == dateTime36.equals(dateTime84));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
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
        org.joda.time.LocalDate localDate27 = property25.getLocalDate();
        org.joda.time.LocalDate localDate29 = property25.addToCopy(53);
        org.joda.time.DurationField durationField30 = property25.getDurationField();
        org.joda.time.LocalDate localDate31 = property25.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField30", (durationField21.compareTo(durationField30) == 0) == durationField21.equals(durationField30));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.minuteOfDay();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((int) (byte) 1, 8, 23, 0, 4, chronology6);
        org.joda.time.DurationField durationField10 = chronology6.centuries();
        java.lang.String str11 = chronology6.toString();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.centuryOfEra();
        org.joda.time.DurationField durationField13 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology6.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField13", Math.signum(durationField10.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField10)));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
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
        org.joda.time.DateTime.Property property50 = dateTime48.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime45 and instant47", (dateTime45.compareTo(instant47) == 0) == dateTime45.equals(instant47));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(20000801142000000L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DateTime dateTime6 = dateTime2.withFieldAdded(durationFieldType4, (-284887059));
        org.joda.time.DateTime.Property property7 = dateTime2.minuteOfHour();
        long long8 = property7.remainder();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTime();
        org.joda.time.Instant instant4 = instant1.plus(1646723835553L);
        org.joda.time.DateTime dateTime5 = instant1.toDateTimeISO();
        org.joda.time.DateTime dateTime7 = dateTime5.minusHours(910);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfEra();
        org.joda.time.Instant instant6 = dateTime4.toInstant();
        org.joda.time.Instant instant8 = instant6.withMillis((long) 435);
        org.joda.time.Instant instant11 = instant8.withDurationAdded(60000L, (int) 'u');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant6", (dateTime4.compareTo(instant6) == 0) == dateTime4.equals(instant6));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
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
        org.joda.time.DateTime dateTime19 = dateTime15.minusHours(999);
        org.joda.time.DateTime dateTime21 = dateTime19.minusSeconds(80998);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundHalfEvenCopy();
        org.joda.time.Chronology chronology25 = localDateTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime19.toMutableDateTime(chronology25);
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now(chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and mutableDateTime26", (dateTime19.compareTo(mutableDateTime26) == 0) == dateTime19.equals(mutableDateTime26));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = instant2.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant2.plus(readableDuration5);
        org.joda.time.DateTimeZone dateTimeZone7 = instant2.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime4", (instant2.compareTo(mutableDateTime4) == 0) == instant2.equals(mutableDateTime4));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
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
        int int12 = dateTime11.getYear();
        org.joda.time.DateTime dateTime14 = dateTime11.plusHours(29);
        java.util.Locale locale16 = new java.util.Locale("hi!");
        java.util.Locale.setDefault(locale16);
        java.util.Locale.setDefault(locale16);
        java.util.Calendar calendar19 = dateTime14.toCalendar(locale16);
        java.lang.Object obj20 = locale16.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime11", (dateTime1.compareTo(dateTime11) == 0) == dateTime1.equals(dateTime11));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 7);
        org.joda.time.DateTime dateTime6 = instant5.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime2", (instant5.compareTo(dateTime2) == 0) == instant5.equals(dateTime2));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = chronology1.weeks();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZone(dateTimeZone5);
        int int7 = dateTime6.getYearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime6.toMutableDateTime();
        org.joda.time.DateTime dateTime10 = dateTime6.minusMinutes(720);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime8", (dateTime4.compareTo(mutableDateTime8) == 0) == dateTime4.equals(mutableDateTime8));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withPeriodAdded(readablePeriod4, 40710);
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        java.lang.String str13 = property12.getAsText();
        int int14 = property12.get();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        int int17 = property12.compareTo((org.joda.time.ReadablePartial) localDate15);
        int int18 = localDate15.getYearOfEra();
        org.joda.time.LocalDate localDate20 = localDate15.plusWeeks((-17975955));
        org.joda.time.DateTime dateTime21 = dateTime2.withFields((org.joda.time.ReadablePartial) localDate15);
        boolean boolean23 = dateTime21.isEqual((long) 48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
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
        org.joda.time.DateTime dateTime15 = dateTime12.plusWeeks(32);
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
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology38 = localDate37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.minuteOfDay();
        boolean boolean40 = durationFieldType36.isSupported(chronology38);
        org.joda.time.DateTimeField dateTimeField41 = chronology38.millisOfSecond();
        java.lang.String str42 = chronology38.toString();
        org.joda.time.DurationField durationField43 = chronology38.halfdays();
        org.joda.time.DateTime dateTime44 = dateTime24.toDateTime(chronology38);
        java.lang.Object obj45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(obj45, dateTimeZone46);
        org.joda.time.DateTime dateTime49 = dateTime47.withWeekOfWeekyear((int) (byte) 10);
        int int50 = dateTime49.getYear();
        boolean boolean51 = dateTime44.isEqual((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType53 = dateTimeFieldType52.getDurationType();
        int int54 = dateTime44.get(dateTimeFieldType52);
        boolean boolean55 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime.Property property56 = dateTime44.dayOfWeek();
        org.joda.time.DateTime dateTime57 = property56.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime44", (dateTime8.compareTo(dateTime44) == 0) == dateTime8.equals(dateTime44));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
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
        java.lang.Object obj53 = date48.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar7 and calendar32", (gregorianCalendar7.compareTo(calendar32) == 0) == gregorianCalendar7.equals(calendar32));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        java.lang.Object obj2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(obj2, dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property7 = dateTime6.weekyear();
        long long8 = dateTime6.getMillis();
        org.joda.time.DateTime dateTime10 = dateTime6.withCenturyOfEra(1);
        org.joda.time.YearMonthDay yearMonthDay11 = dateTime10.toYearMonthDay();
        int int12 = dateTime1.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime14 = dateTime10.minusMonths(66675);
        java.lang.Object obj15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj15, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property20 = dateTime19.weekyear();
        int int21 = dateTime19.getYear();
        org.joda.time.DateTime dateTime22 = dateTime19.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.minuteOfDay();
        java.lang.String str27 = chronology24.toString();
        org.joda.time.DurationField durationField28 = chronology24.weeks();
        org.joda.time.DateTime dateTime29 = dateTime19.withChronology(chronology24);
        org.joda.time.Chronology chronology30 = chronology24.withUTC();
        org.joda.time.DateTime dateTime31 = dateTime14.toDateTime(chronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime29", (dateTime6.compareTo(dateTime29) == 0) == dateTime6.equals(dateTime29));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.Instant instant5 = instant1.toInstant();
        long long6 = instant5.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime2", (instant5.compareTo(mutableDateTime2) == 0) == instant5.equals(mutableDateTime2));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant1", (mutableDateTime2.compareTo(instant1) == 0) == mutableDateTime2.equals(instant1));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
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
        org.joda.time.DurationField durationField23 = chronology20.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime22", (dateTime3.compareTo(dateTime22) == 0) == dateTime3.equals(dateTime22));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
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
        int int14 = dateTime4.getMillisOfSecond();
        org.joda.time.Instant instant15 = dateTime4.toInstant();
        org.joda.time.Instant instant17 = instant15.withMillis(9223120513754242020L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime12", (dateTime4.compareTo(dateTime12) == 0) == dateTime4.equals(dateTime12));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(4);
        boolean boolean7 = dateTime6.isEqualNow();
        org.joda.time.Instant instant8 = dateTime6.toInstant();
        org.joda.time.DateTime dateTime9 = dateTime6.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '#');
        int int12 = dateTime11.getMonthOfYear();
        org.joda.time.DateTime dateTime14 = dateTime11.plusMinutes(1340);
        int int15 = dateTime14.getMillisOfSecond();
        org.joda.time.DateTime dateTime17 = dateTime14.withDayOfYear(24);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime14.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime14.getZone();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime22 = localTime20.minusMillis(0);
        org.joda.time.LocalTime localTime24 = localTime20.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime localTime26 = localTime20.minusMinutes(11);
        int int27 = localTime20.getMillisOfDay();
        boolean boolean28 = dateTime14.equals((java.lang.Object) int27);
        int int29 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Instant instant30 = dateTime14.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant8", (dateTime6.compareTo(instant8) == 0) == dateTime6.equals(instant8));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
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
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfEra();
        org.joda.time.LocalDate localDate15 = property14.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime16 = localDate15.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property17 = localDate15.weekOfWeekyear();
        boolean boolean18 = dateTime4.equals((java.lang.Object) property17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime8", (dateTime4.compareTo(dateTime8) == 0) == dateTime4.equals(dateTime8));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 32769, chronology2);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(chronology2);
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.joda.time.Chronology chronology7 = chronology2.withUTC();
        org.joda.time.DurationField durationField8 = chronology7.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField8, and durationField6", !(durationField6.compareTo(durationField8) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField8.compareTo(durationField6))));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 66514657);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.years();
        long long9 = durationField7.getMillis(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
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
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.parse("0");
        org.joda.time.LocalDate localDate20 = localDate18.plusYears(66525863);
        int[] intArray22 = chronology12.get((org.joda.time.ReadablePartial) localDate18, (-343407230L));
        java.lang.String str23 = chronology12.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime16", (dateTime4.compareTo(dateTime16) == 0) == dateTime4.equals(dateTime16));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.weekOfWeekyear();
        org.joda.time.DateTime dateTime7 = property6.roundCeilingCopy();
        org.joda.time.DateTime dateTime8 = property6.withMaximumValue();
        org.joda.time.DateTime dateTime10 = property6.addToCopy((long) 31);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.minuteOfDay();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((int) (byte) 1, 8, 23, 0, 4, chronology18);
        org.joda.time.DurationField durationField22 = chronology18.centuries();
        org.joda.time.DateTimeField dateTimeField23 = chronology18.yearOfEra();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 362, chronology18);
        org.joda.time.Chronology chronology25 = chronology18.withUTC();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((java.lang.Object) dateTime10, chronology25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = chronology25.add(readablePeriod27, 66556989000L, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime26", (dateTime10.compareTo(dateTime26) == 0) == dateTime10.equals(dateTime26));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
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
        org.joda.time.DateTime.Property property72 = dateTime3.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime71", (dateTime3.compareTo(dateTime71) == 0) == dateTime3.equals(dateTime71));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withMillisOfDay((int) 'a');
        org.joda.time.LocalTime.Property property5 = localTime0.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property5.setCopy((int) '#');
        org.joda.time.LocalTime localTime8 = property5.withMinimumValue();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.days();
        boolean boolean10 = localTime8.isSupported(durationFieldType9);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.hourOfDay();
        org.joda.time.DurationField durationField18 = durationFieldType9.getField(chronology16);
        org.joda.time.DurationField durationField19 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField19", Math.signum(durationField18.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField18)));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DurationField durationField3 = chronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.secondOfMinute();
        org.joda.time.DurationField durationField6 = chronology1.eras();
        org.joda.time.DurationField durationField7 = chronology1.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField6", Math.signum(durationField3.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField3)));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
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
        org.joda.time.LocalDateTime localDateTime30 = property29.getLocalDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime13", (dateTime2.compareTo(dateTime13) == 0) == dateTime2.equals(dateTime13));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
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
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant33.plus(readableDuration34);
        org.joda.time.DateTime dateTime36 = instant35.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant35", (dateTime31.compareTo(instant35) == 0) == dateTime31.equals(instant35));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
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
        long long15 = dateTimeField12.remainder(19054L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
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
        org.joda.time.DateTime dateTime18 = dateTime16.minusDays(689);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime16", (dateTime2.compareTo(dateTime16) == 0) == dateTime2.equals(dateTime16));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
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
        org.joda.time.DateTime dateTime25 = dateTime8.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime27 = dateTime8.minusDays(20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime24", (dateTime8.compareTo(dateTime24) == 0) == dateTime8.equals(dateTime24));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.Instant instant8 = dateTime6.toInstant();
        org.joda.time.Instant instant10 = instant8.withMillis((-16492158720000L));
        org.joda.time.Instant instant11 = instant10.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant8", (dateTime6.compareTo(instant8) == 0) == dateTime6.equals(instant8));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
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
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime8.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime24", (dateTime8.compareTo(dateTime24) == 0) == dateTime8.equals(dateTime24));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
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
        org.joda.time.DateTime.Property property70 = dateTime58.millisOfSecond();
        org.joda.time.DateTime dateTime71 = dateTime58.toDateTime();
        org.joda.time.DateTime.Property property72 = dateTime58.weekOfWeekyear();
        org.joda.time.DateTime dateTime74 = property72.addToCopy(57);
        org.joda.time.Chronology chronology75 = dateTime74.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter2.withChronology(chronology75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime25", (dateTime14.compareTo(dateTime25) == 0) == dateTime14.equals(dateTime25));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
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
        org.joda.time.Instant instant31 = instant29.withMillis(1646611200000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant19", (dateTime6.compareTo(instant19) == 0) == dateTime6.equals(instant19));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
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
        java.lang.Object obj23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj23, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime29 = dateTime27.plusHours(4);
        boolean boolean30 = dateTime29.isEqualNow();
        org.joda.time.Instant instant31 = dateTime29.toInstant();
        org.joda.time.MutableDateTime mutableDateTime32 = instant31.toMutableDateTime();
        boolean boolean33 = calendar22.equals((java.lang.Object) mutableDateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and instant31", (dateTime29.compareTo(instant31) == 0) == dateTime29.equals(instant31));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.minusMonths(4);
        org.joda.time.DateTime dateTime11 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime12 = dateTime11.withLaterOffsetAtOverlap();
        int int13 = dateTime12.getSecondOfDay();
        org.joda.time.Instant instant14 = dateTime12.toInstant();
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant14", (dateTime12.compareTo(instant14) == 0) == dateTime12.equals(instant14));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
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
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.year();
        org.joda.time.DurationField durationField31 = chronology27.days();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = chronology27.add(readablePeriod32, 1646723777197L, 19059);
        org.joda.time.Chronology chronology36 = chronology27.withUTC();
        long long40 = chronology27.add((long) 28, (long) 26171150, 3);
        org.joda.time.DurationField durationField41 = chronology27.hours();
        org.joda.time.DateTime dateTime42 = dateTime7.toDateTime(chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and dateTime22", (dateTime42.compareTo(dateTime22) == 0) == dateTime42.equals(dateTime22));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant7 = instant1.withDurationAdded(readableDuration5, 13);
        org.joda.time.Instant instant10 = instant1.withDurationAdded(1646723891409L, 2131200);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant1", (mutableDateTime2.compareTo(instant1) == 0) == mutableDateTime2.equals(instant1));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
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
        java.lang.String str26 = localDate0.toString();
        java.lang.Object obj27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj27, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime33 = dateTime29.minusDays((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime29.plusMinutes(86399);
        java.lang.Object obj36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(obj36, dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.withYear(7);
        int int41 = dateTime40.getMonthOfYear();
        int int42 = dateTime40.getDayOfMonth();
        boolean boolean43 = dateTime29.isEqual((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.minuteOfDay();
        boolean boolean48 = durationFieldType44.isSupported(chronology46);
        org.joda.time.DateTimeField dateTimeField49 = chronology46.yearOfEra();
        org.joda.time.DateTimeField dateTimeField50 = chronology46.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology46.getZone();
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate(chronology46);
        org.joda.time.DateTimeField dateTimeField53 = chronology46.hourOfDay();
        org.joda.time.DurationField durationField54 = chronology46.halfdays();
        org.joda.time.DateTime dateTime55 = dateTime29.toDateTime(chronology46);
        boolean boolean56 = localDate0.equals((java.lang.Object) dateTime29);
        org.joda.time.Chronology chronology57 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime55", (dateTime7.compareTo(dateTime55) == 0) == dateTime7.equals(dateTime55));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj1, dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        int int7 = dateTime5.getYear();
        org.joda.time.DateTime dateTime8 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime5.withPeriodAdded(readablePeriod9, (int) '#');
        org.joda.time.DateTime dateTime13 = dateTime5.minusMillis(4);
        int int14 = dateTime5.getMonthOfYear();
        org.joda.time.DateTime dateTime16 = dateTime5.withYearOfEra((int) '#');
        org.joda.time.DateTime dateTime18 = dateTime16.plusDays(19059);
        int int19 = dateTime16.getWeekyear();
        org.joda.time.DateTime dateTime21 = dateTime16.plusHours(2021);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        int int24 = localDate22.getDayOfWeek();
        org.joda.time.LocalDate localDate26 = localDate22.minusMonths(32770);
        java.lang.Object obj27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj27, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property32 = dateTime31.weekyear();
        org.joda.time.DateTime dateTime33 = property32.roundCeilingCopy();
        org.joda.time.DateTime dateTime35 = dateTime33.withCenturyOfEra((int) ' ');
        java.lang.Object obj36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(obj36, dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property41 = dateTime40.weekyear();
        java.lang.String str42 = property41.getAsText();
        org.joda.time.DurationField durationField43 = property41.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property41.getFieldType();
        java.lang.String str45 = dateTimeFieldType44.toString();
        boolean boolean46 = dateTime35.isSupported(dateTimeFieldType44);
        org.joda.time.LocalDate.Property property47 = localDate22.property(dateTimeFieldType44);
        java.lang.String str48 = localDate22.toString();
        org.joda.time.LocalDate localDate50 = localDate22.withWeekyear(26176839);
        org.joda.time.Chronology chronology51 = localDate50.getChronology();
        org.joda.time.DateTime dateTime52 = dateTime21.withChronology(chronology51);
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(1646723987524L, chronology51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime52", (dateTime21.compareTo(dateTime52) == 0) == dateTime21.equals(dateTime52));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
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
        org.joda.time.DateTime.Property property31 = dateTime4.monthOfYear();
        org.joda.time.DateTime dateTime33 = dateTime4.plusYears(237);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime30", (dateTime4.compareTo(mutableDateTime30) == 0) == dateTime4.equals(mutableDateTime30));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
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
        int int12 = dateTime11.getYear();
        org.joda.time.DateTime dateTime14 = dateTime11.plusHours(29);
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears(32818);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime11", (dateTime1.compareTo(dateTime11) == 0) == dateTime1.equals(dateTime11));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
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
        org.joda.time.DateTime dateTime24 = dateTime7.minusDays(5414);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime22", (dateTime7.compareTo(dateTime22) == 0) == dateTime7.equals(dateTime22));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime3 = localTime1.minusMillis(0);
        org.joda.time.LocalTime localTime5 = localTime3.minusHours((int) ' ');
        org.joda.time.Chronology chronology6 = localTime3.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfCentury();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(987190269392328L, chronology6);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology6);
        org.joda.time.DurationField durationField11 = chronology6.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField11, and durationField7", !(durationField7.compareTo(durationField11) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField11.compareTo(durationField7))));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
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
        java.lang.Object obj27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj27, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime33 = dateTime31.plusHours(4);
        boolean boolean34 = dateTime33.isEqualNow();
        org.joda.time.Instant instant35 = dateTime33.toInstant();
        org.joda.time.DateTime dateTime36 = dateTime33.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) '#');
        int int39 = dateTime38.getMonthOfYear();
        org.joda.time.DateTime dateTime41 = dateTime38.plusMinutes(1340);
        int int42 = dateTime41.getMillisOfSecond();
        org.joda.time.DateTime dateTime44 = dateTime41.withDayOfYear(24);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime41.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone46 = dateTime41.getZone();
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime49 = localTime47.minusMillis(0);
        org.joda.time.LocalTime localTime51 = localTime47.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime localTime53 = localTime47.minusMinutes(11);
        int int54 = localTime47.getMillisOfDay();
        boolean boolean55 = dateTime41.equals((java.lang.Object) int54);
        int int56 = dateTime33.compareTo((org.joda.time.ReadableInstant) dateTime41);
        int int57 = dateTimeZone10.getOffset((org.joda.time.ReadableInstant) dateTime41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime13", (dateTime2.compareTo(dateTime13) == 0) == dateTime2.equals(dateTime13));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
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
        boolean boolean35 = instant33.isEqual(1645514281103L);
        org.joda.time.Instant instant36 = instant33.toInstant();
        org.joda.time.DateTime dateTime37 = instant36.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant36", (dateTime31.compareTo(instant36) == 0) == dateTime31.equals(instant36));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        long long9 = dateTimeField7.roundHalfFloor(1646723823994L);
        java.lang.String str11 = dateTimeField7.getAsText((long) 216);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.minuteOfDay();
        boolean boolean17 = durationFieldType13.isSupported(chronology15);
        org.joda.time.DateTimeField dateTimeField18 = chronology15.millisOfSecond();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField20 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = chronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField23 = chronology15.yearOfCentury();
        java.lang.String str24 = dateTimeField23.toString();
        boolean boolean26 = dateTimeField23.isLeap(26891009280000L);
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.minuteOfDay();
        boolean boolean33 = durationFieldType29.isSupported(chronology31);
        org.joda.time.DateTimeField dateTimeField34 = chronology31.yearOfEra();
        org.joda.time.DateTimeField dateTimeField35 = chronology31.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = chronology31.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField37 = chronology31.clockhourOfHalfday();
        java.util.Locale locale41 = new java.util.Locale("24", "hi!");
        java.lang.String str42 = dateTimeField37.getAsShortText(5555776727L, locale41);
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.minuteOfDay();
        boolean boolean48 = durationFieldType44.isSupported(chronology46);
        org.joda.time.DateTimeField dateTimeField49 = chronology46.yearOfEra();
        org.joda.time.DateTimeField dateTimeField50 = chronology46.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField51 = chronology46.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField52 = chronology46.clockhourOfHalfday();
        java.util.Locale locale56 = new java.util.Locale("24", "hi!");
        java.lang.String str57 = dateTimeField52.getAsShortText(5555776727L, locale56);
        java.lang.String str58 = dateTimeField37.getAsShortText(35, locale56);
        java.lang.String str59 = locale56.getLanguage();
        java.util.Locale locale60 = locale56.stripExtensions();
        java.lang.String str62 = locale56.getExtension('a');
        long long63 = dateTimeField23.set(1646723960289L, "31", locale56);
        java.lang.String str64 = dateTimeField7.getAsText(66700352, locale56);
        long long67 = dateTimeField7.set(1646724067938L, 66831832);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime19", (dateTime2.compareTo(dateTime19) == 0) == dateTime2.equals(dateTime19));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
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
        org.joda.time.DateTime.Property property18 = dateTime17.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant16", (dateTime3.compareTo(instant16) == 0) == dateTime3.equals(instant16));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
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
        org.joda.time.DateTime dateTime19 = dateTime15.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime19", (instant16.compareTo(dateTime19) == 0) == instant16.equals(dateTime19));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
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
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj19, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property24 = dateTime23.weekyear();
        org.joda.time.DateTime dateTime25 = property24.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar26 = dateTime25.toGregorianCalendar();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        int int29 = localDate27.getDayOfWeek();
        org.joda.time.LocalDate localDate31 = localDate27.minusYears(10);
        int[] intArray32 = localDate27.getValues();
        org.joda.time.LocalDate.Property property33 = localDate27.era();
        boolean boolean34 = gregorianCalendar26.before((java.lang.Object) property33);
        java.util.Date date36 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((java.lang.Object) date36);
        gregorianCalendar26.setTime(date36);
        date36.setMonth(1340);
        gregorianCalendar7.setTime(date36);
        java.lang.Object obj42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(obj42, dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property47 = dateTime46.weekyear();
        int int48 = dateTime46.getYear();
        org.joda.time.DateTime dateTime49 = dateTime46.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime52 = dateTime46.withPeriodAdded(readablePeriod50, (int) '#');
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.year();
        org.joda.time.DateTime dateTime58 = dateTime46.withChronology(chronology54);
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate((java.lang.Object) date36, chronology54);
        org.joda.time.LocalDateTime localDateTime60 = org.joda.time.LocalDateTime.now(chronology54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime58", (dateTime4.compareTo(dateTime58) == 0) == dateTime4.equals(dateTime58));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
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
        int int27 = dateTime14.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and mutableDateTime26", (mutableDateTime15.compareTo(mutableDateTime26) == 0) == mutableDateTime15.equals(mutableDateTime26));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(4);
        boolean boolean7 = dateTime6.isEqualNow();
        org.joda.time.Instant instant8 = dateTime6.toInstant();
        org.joda.time.DateTime dateTime9 = dateTime6.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime11 = dateTime9.withEra(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant8", (dateTime9.compareTo(instant8) == 0) == dateTime9.equals(instant8));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj1, dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        int int7 = dateTime5.getYear();
        org.joda.time.DateTime dateTime8 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean12 = dateTimeZone11.isFixed();
        int int14 = dateTimeZone11.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime15 = dateTime8.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(725809896000L, dateTimeZone11);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.now(dateTimeZone11);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime19 = localTime17.minus(readablePeriod18);
        org.joda.time.LocalTime localTime21 = localTime19.minusMillis(2026);
        java.util.Date date24 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((java.lang.Object) date24);
        org.joda.time.Chronology chronology26 = instant25.getChronology();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.era();
        java.util.Locale locale30 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet31 = locale30.getExtensionKeys();
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("0");
        java.util.Locale locale34 = locale33.stripExtensions();
        java.lang.String str35 = locale30.getDisplayScript(locale34);
        java.util.Locale locale38 = new java.util.Locale("0", "24");
        java.lang.String str39 = locale34.getDisplayLanguage(locale38);
        java.lang.String str40 = dateTimeField28.getAsText((-213119513L), locale34);
        java.lang.String str41 = localTime21.toString("52", locale34);
        java.lang.String str42 = locale34.getCountry();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime27", (dateTime3.compareTo(dateTime27) == 0) == dateTime3.equals(dateTime27));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(4);
        boolean boolean7 = dateTime6.isEqualNow();
        org.joda.time.Instant instant8 = dateTime6.toInstant();
        org.joda.time.DateTime dateTime9 = dateTime6.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) '#');
        int int12 = dateTime11.getMonthOfYear();
        org.joda.time.DateTime dateTime14 = dateTime11.plusMinutes(1340);
        int int15 = dateTime14.getMillisOfSecond();
        org.joda.time.DateTime dateTime17 = dateTime14.withDayOfYear(24);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime14.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime14.getZone();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime22 = localTime20.minusMillis(0);
        org.joda.time.LocalTime localTime24 = localTime20.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime localTime26 = localTime20.minusMinutes(11);
        int int27 = localTime20.getMillisOfDay();
        boolean boolean28 = dateTime14.equals((java.lang.Object) int27);
        int int29 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime31 = dateTime14.plusHours(26162);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant8", (dateTime6.compareTo(instant8) == 0) == dateTime6.equals(instant8));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
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
        long long26 = gregorianCalendar7.getTimeInMillis();
        org.joda.time.Instant instant28 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime29 = instant28.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime30 = instant28.toMutableDateTime();
        org.joda.time.DateTime dateTime31 = instant28.toDateTimeISO();
        boolean boolean32 = gregorianCalendar7.after((java.lang.Object) instant28);
        org.joda.time.Instant instant34 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime35 = instant34.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime35.getZone();
        org.joda.time.DateTime dateTime38 = dateTime35.minusSeconds((int) (byte) 1);
        boolean boolean39 = instant28.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Instant instant40 = instant28.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime29 and instant34", (mutableDateTime29.compareTo(instant34) == 0) == mutableDateTime29.equals(instant34));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
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
        org.joda.time.DateTimeField dateTimeField25 = chronology15.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime24", (dateTime12.compareTo(mutableDateTime24) == 0) == dateTime12.equals(mutableDateTime24));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
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
        org.joda.time.DateTime dateTime38 = dateTime7.plusSeconds(363);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant36", (dateTime7.compareTo(instant36) == 0) == dateTime7.equals(instant36));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getDisplayScript();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYear(7);
        int int9 = dateTime8.getMonthOfYear();
        int int10 = dateTime8.getDayOfMonth();
        org.joda.time.DateTime.Property property11 = dateTime8.minuteOfHour();
        org.joda.time.DateTime.Property property12 = dateTime8.minuteOfHour();
        java.lang.Object obj13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj13, dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property18 = dateTime17.weekyear();
        long long19 = dateTime17.getMillis();
        org.joda.time.DateTime.Property property20 = dateTime17.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime17, dateTimeZone23);
        long long27 = dateTimeZone23.convertLocalToUTC(5555762122L, false);
        org.joda.time.DateTime dateTime28 = dateTime8.withZone(dateTimeZone23);
        org.joda.time.DateTime.Property property29 = dateTime8.yearOfCentury();
        boolean boolean30 = strSet3.remove((java.lang.Object) property29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(20000801142000000L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getDurationType();
        org.joda.time.DateTime dateTime6 = dateTime2.withFieldAdded(durationFieldType4, (-284887059));
        java.lang.String str7 = durationFieldType4.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
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
        org.joda.time.DateTime.Property property22 = dateTime21.dayOfWeek();
        org.joda.time.Chronology chronology23 = dateTime21.getChronology();
        java.lang.Object obj24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj24, dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property29 = dateTime28.weekyear();
        org.joda.time.DateTime dateTime31 = property29.addToCopy(9);
        int int32 = property29.getMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property29.getFieldType();
        int int34 = dateTime21.get(dateTimeFieldType33);
        org.joda.time.Chronology chronology35 = dateTime21.getChronology();
        java.lang.String str36 = dateTime21.toString();
        org.joda.time.ReadableInstant readableInstant37 = null;
        boolean boolean38 = dateTime21.isAfter(readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.era();
        org.joda.time.LocalDateTime localDateTime43 = property42.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.monthOfYear();
        java.util.TimeZone timeZone46 = java.util.TimeZone.getTimeZone("2022");
        int int47 = timeZone46.getRawOffset();
        int int49 = timeZone46.getOffset(379209600000L);
        java.time.ZoneId zoneId50 = timeZone46.toZoneId();
        java.util.TimeZone timeZone51 = java.util.TimeZone.getTimeZone(zoneId50);
        timeZone51.setRawOffset(100);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        org.joda.time.DateTime dateTime55 = localDateTime43.toDateTime(dateTimeZone54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime43.plusSeconds(66586053);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.minusHours(26);
        java.util.Date date61 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant62 = new org.joda.time.Instant((java.lang.Object) date61);
        org.joda.time.Chronology chronology63 = instant62.getChronology();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(chronology63);
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime59, chronology63);
        org.joda.time.DateTime dateTime66 = dateTime21.toDateTime(chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime64", (dateTime26.compareTo(dateTime64) == 0) == dateTime26.equals(dateTime64));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
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
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.era();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = property16.setCopy((int) (short) 100);
        org.joda.time.DateTimeField dateTimeField19 = property16.getField();
        org.joda.time.LocalDateTime localDateTime20 = property16.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.year();
        boolean boolean22 = localDateTime20.isSupported(dateTimeFieldType21);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withCenturyOfEra(55);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        java.lang.String str29 = chronology28.toString();
        org.joda.time.DurationField durationField30 = chronology28.years();
        boolean boolean31 = dateTimeFieldType21.isSupported(chronology28);
        org.joda.time.DurationFieldType durationFieldType32 = dateTimeFieldType21.getRangeDurationType();
        org.joda.time.DateTime dateTime34 = dateTime4.withField(dateTimeFieldType21, 30742);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime8", (dateTime4.compareTo(dateTime8) == 0) == dateTime4.equals(dateTime8));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
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
        org.joda.time.DateTime dateTime16 = dateTime13.plusMillis(0);
        org.joda.time.DateTime.Property property17 = dateTime16.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant14", (dateTime16.compareTo(instant14) == 0) == dateTime16.equals(instant14));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
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
        org.joda.time.LocalDate localDate16 = localDate14.plusWeeks(32770);
        org.joda.time.LocalDate localDate18 = localDate16.minusYears(671);
        org.joda.time.LocalDate localDate20 = localDate16.minusMonths(80998);
        org.joda.time.LocalDate localDate22 = localDate20.withDayOfYear(8);
        org.joda.time.LocalDate localDate24 = localDate20.plusYears(80982);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean28 = dateTimeZone27.isFixed();
        int int30 = dateTimeZone27.getStandardOffset((long) (-1));
        boolean boolean32 = dateTimeZone27.equals((java.lang.Object) (-292275054));
        java.util.Locale locale36 = new java.util.Locale("52", "2024-01-23");
        java.lang.String str37 = locale36.getDisplayVariant();
        java.lang.String str38 = dateTimeZone27.getName(1646723863664L, locale36);
        long long40 = dateTimeZone27.nextTransition(1646723968866L);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) '#');
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.DateTime dateTime45 = dateTime42.plusMinutes(1340);
        int int46 = dateTime45.getMillisOfSecond();
        org.joda.time.DateTime dateTime48 = dateTime45.withDayOfYear(24);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime45.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone50 = dateTime45.getZone();
        int int52 = dateTimeZone50.getStandardOffset(1646723800223L);
        long long54 = dateTimeZone27.getMillisKeepLocal(dateTimeZone50, (long) 689);
        org.joda.time.Interval interval55 = localDate20.toInterval(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(dateTimeZone56);
        org.joda.time.DateTime dateTime59 = dateTime57.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj60 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(obj60, dateTimeZone61);
        org.joda.time.DateTime dateTime64 = dateTime62.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property65 = dateTime64.weekyear();
        java.lang.String str66 = property65.getAsText();
        org.joda.time.DurationField durationField67 = property65.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = property65.getFieldType();
        int int69 = dateTime59.get(dateTimeFieldType68);
        org.joda.time.DateTime dateTime71 = dateTime59.minusMinutes((int) (byte) -1);
        org.joda.time.DateTime dateTime72 = dateTime59.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property73 = dateTime72.monthOfYear();
        int int74 = dateTime72.getHourOfDay();
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology76 = localDate75.getChronology();
        org.joda.time.DateTimeField dateTimeField77 = chronology76.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField78 = chronology76.minuteOfDay();
        org.joda.time.DurationField durationField79 = chronology76.days();
        org.joda.time.Chronology chronology80 = chronology76.withUTC();
        org.joda.time.DateTime dateTime81 = dateTime72.withChronology(chronology80);
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDate localDate83 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology84 = localDate83.getChronology();
        org.joda.time.LocalDate localDate85 = new org.joda.time.LocalDate(chronology84);
        org.joda.time.DateTimeField dateTimeField86 = dateTimeFieldType82.getField(chronology84);
        int int87 = dateTime81.get(dateTimeFieldType82);
        int int88 = localDate20.indexOf(dateTimeFieldType82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime72 and dateTime81", (dateTime72.compareTo(dateTime81) == 0) == dateTime72.equals(dateTime81));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((long) 12, 80982);
        org.joda.time.Instant instant7 = instant1.plus((long) (-1108));
        org.joda.time.Instant instant8 = instant7.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
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
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.parse("0");
        org.joda.time.LocalDate localDate20 = localDate18.plusYears(66525863);
        int[] intArray22 = chronology12.get((org.joda.time.ReadablePartial) localDate18, (-343407230L));
        org.joda.time.LocalDate.Property property23 = localDate18.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime16", (dateTime4.compareTo(dateTime16) == 0) == dateTime4.equals(dateTime16));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
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
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.minuteOfDay();
        org.joda.time.DurationField durationField23 = chronology20.days();
        org.joda.time.Chronology chronology24 = chronology20.withUTC();
        org.joda.time.DateTime dateTime25 = dateTime16.withChronology(chronology24);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime25", (dateTime16.compareTo(dateTime25) == 0) == dateTime16.equals(dateTime25));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        java.util.Locale locale7 = new java.util.Locale("hi!", "", "");
        int int8 = dateTimeField3.getMaximumShortTextLength(locale7);
        java.lang.String str11 = nameProvider0.getName(locale7, "24", "yearOfCentury");
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str13 = locale12.toLanguageTag();
        java.lang.String str14 = locale12.getDisplayVariant();
        java.lang.String str17 = nameProvider0.getShortName(locale12, "Property[weekyear]", "10");
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.lang.String str19 = locale18.toLanguageTag();
        java.lang.String str20 = locale18.getDisplayVariant();
        java.lang.String str23 = nameProvider0.getShortName(locale18, "1", "2022-02-22");
        java.lang.Object obj24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj24, dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYear(7);
        int int29 = dateTime28.getMonthOfYear();
        org.joda.time.DateTime dateTime30 = dateTime28.toDateTime();
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfCentury();
        boolean boolean32 = property31.isLeap();
        java.util.TimeZone timeZone34 = java.util.TimeZone.getTimeZone("2022");
        int int35 = timeZone34.getRawOffset();
        timeZone34.setRawOffset(0);
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone34);
        java.lang.String str39 = timeZone34.getID();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology41 = localDate40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.minuteOfDay();
        long long47 = chronology41.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField48 = chronology41.minuteOfHour();
        org.joda.time.DurationField durationField49 = chronology41.millis();
        org.joda.time.DateTimeField dateTimeField50 = chronology41.hourOfHalfday();
        java.util.Locale locale52 = java.util.Locale.CANADA;
        java.lang.String str53 = locale52.toLanguageTag();
        java.lang.String str54 = dateTimeField50.getAsShortText((int) (byte) 10, locale52);
        java.util.Calendar calendar55 = java.util.Calendar.getInstance(timeZone34, locale52);
        java.lang.String str56 = property31.getAsText(locale52);
        java.lang.String str57 = locale52.getCountry();
        java.lang.String str60 = nameProvider0.getShortName(locale52, "2022-02-24T18:28:56.446+59:12", "8");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Calendar calendar62 = java.util.Calendar.getInstance();
        int int64 = calendar62.getGreatestMinimum(11);
        java.util.TimeZone timeZone65 = calendar62.getTimeZone();
        int int66 = calendar62.getWeekYear();
        java.util.TimeZone timeZone67 = calendar62.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(dateTimeZone68);
        org.joda.time.DateTime dateTime71 = dateTime69.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.DateTime dateTime73 = dateTime71.toDateTime(dateTimeZone72);
        org.joda.time.DateTime.Property property74 = dateTime73.weekOfWeekyear();
        java.util.Locale locale75 = java.util.Locale.PRC;
        java.lang.String str76 = property74.getAsShortText(locale75);
        java.util.Calendar calendar77 = java.util.Calendar.getInstance(timeZone67, locale75);
        java.lang.String str80 = nameProvider0.getShortName(locale75, "2022-02-25T07:18:55.238", "2022-02-24T12:11:59.999+122:00");
        java.util.Set<java.lang.Character> charSet81 = locale75.getExtensionKeys();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar38 and calendar62", (calendar38.compareTo(calendar62) == 0) == calendar38.equals(calendar62));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
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
        java.lang.String str21 = dateTime20.toString();
        java.lang.Object obj22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj22, dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime24.toMutableDateTime();
        org.joda.time.DateTime dateTime26 = dateTime24.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.minuteOfDay();
        org.joda.time.DateTime dateTime30 = dateTime26.toDateTime(chronology28);
        org.joda.time.Instant instant31 = dateTime30.toInstant();
        org.joda.time.DateTime dateTime32 = instant31.toDateTime();
        int int33 = dateTime20.compareTo((org.joda.time.ReadableInstant) instant31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime30", (dateTime2.compareTo(dateTime30) == 0) == dateTime2.equals(dateTime30));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, 51);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant7 = instant2.plus(readableDuration6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant2.withDurationAdded(readableDuration8, 2001);
        org.joda.time.DateTime dateTime11 = instant10.toDateTimeISO();
        org.joda.time.Instant instant12 = instant10.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime11", (instant12.compareTo(dateTime11) == 0) == instant12.equals(dateTime11));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
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
        org.joda.time.DateTime dateTime16 = dateTime13.plusMillis(0);
        org.joda.time.DateTime dateTime17 = dateTime13.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime17", (instant14.compareTo(dateTime17) == 0) == instant14.equals(dateTime17));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 66514657);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.months();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.minus(readablePeriod5);
        org.joda.time.DateTime dateTime7 = dateTime6.withLaterOffsetAtOverlap();
        java.lang.Object obj8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj8, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime13 = dateTime10.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime15 = dateTime10.minusMillis(2026);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((java.lang.Object) dateTime15);
        org.joda.time.DateTime dateTime18 = dateTime15.minusSeconds(66609);
        boolean boolean19 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant16", (dateTime15.compareTo(instant16) == 0) == dateTime15.equals(instant16));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, 51);
        org.joda.time.Instant instant6 = instant2.toInstant();
        org.joda.time.Instant instant8 = instant6.withMillis((-1260954909386381L));
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant6.plus(readableDuration9);
        org.joda.time.MutableDateTime mutableDateTime11 = instant10.toMutableDateTime();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) instant10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime11", (instant10.compareTo(mutableDateTime11) == 0) == instant10.equals(mutableDateTime11));
    }
}

