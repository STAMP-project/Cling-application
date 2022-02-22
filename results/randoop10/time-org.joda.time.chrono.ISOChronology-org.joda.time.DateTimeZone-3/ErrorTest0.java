import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0001");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DurationField durationField4 = iSOChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField3", (durationField1.compareTo(durationField3) == 0) == durationField1.equals(durationField3));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField3", (durationField1.compareTo(durationField3) == 0) == durationField1.equals(durationField3));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
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
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = iSOChronology21.weekyears();
        org.joda.time.DateTimeZone dateTimeZone23 = iSOChronology21.getZone();
        org.joda.time.DateTime dateTime24 = dateTime20.withZoneRetainFields(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) ' ', dateTimeZone23);
        int int28 = dateTimeZone23.getOffsetFromLocal((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime11.toMutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean31 = mutableDateTime29.isSupported(dateTimeFieldType30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) ' ', dateTimeZone23);
        int int28 = dateTimeZone23.getOffsetFromLocal((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime11.toMutableDateTime(dateTimeZone23);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime11.minus(readableDuration30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime29", (instant16.compareTo(mutableDateTime29) == 0) == instant16.equals(mutableDateTime29));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) ' ', dateTimeZone23);
        int int28 = dateTimeZone23.getOffsetFromLocal((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime11.toMutableDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime30 = dateTime11.withTimeAtStartOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime29", (instant16.compareTo(mutableDateTime29) == 0) == instant16.equals(mutableDateTime29));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        int int22 = dateTime20.get(dateTimeFieldType21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
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
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long24 = dateTimeZone22.previousTransition((long) (-1));
        long long28 = dateTimeZone22.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = dateTimeZone22.getShortName((long) '#', locale30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime34 = dateTime32.minusHours((int) (short) 100);
        int int35 = dateTime32.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property36 = dateTime32.monthOfYear();
        org.joda.time.Instant instant37 = dateTime32.toInstant();
        boolean boolean39 = dateTime32.isBefore(1L);
        org.joda.time.DateTime dateTime41 = dateTime32.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long46 = dateTimeZone44.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) ' ', dateTimeZone44);
        int int49 = dateTimeZone44.getOffsetFromLocal((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime32.toMutableDateTime(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime20.toMutableDateTime(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField3", (durationField1.compareTo(durationField3) == 0) == durationField1.equals(durationField3));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
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
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate27 = localDate25.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property28 = localDate25.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean30 = localDate25.isSupported(dateTimeFieldType29);
        org.joda.time.DateTime.Property property31 = dateTime20.property(dateTimeFieldType29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DurationField durationField4 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
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
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime11.toMutableDateTime();
        int int18 = dateTime11.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime17", (instant16.compareTo(mutableDateTime17) == 0) == instant16.equals(mutableDateTime17));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
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
        org.joda.time.DateTime dateTime24 = dateTime11.withYearOfCentury(16);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.plus(readablePeriod25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) ' ', dateTimeZone23);
        int int28 = dateTimeZone23.getOffsetFromLocal((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime11.toMutableDateTime(dateTimeZone23);
        long long31 = dateTimeZone23.previousTransition((long) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
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
        int int23 = dateTime11.getMonthOfYear();
        org.joda.time.DateTime dateTime25 = dateTime11.plusMonths((int) (short) 100);
        org.joda.time.DateTime dateTime27 = dateTime25.plusWeeks((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField4", (durationField1.compareTo(durationField4) == 0) == durationField1.equals(durationField4));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
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
        org.joda.time.LocalDateTime localDateTime21 = dateTime11.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusWeeks((int) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
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
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant19 = instant16.withDurationAdded(readableDuration17, 14);
        org.joda.time.Instant instant21 = instant19.plus((long) 7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant19", (dateTime11.compareTo(instant19) == 0) == dateTime11.equals(instant19));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
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
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime11.toMutableDateTime();
        org.joda.time.chrono.ISOChronology iSOChronology18 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology18.era();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology18);
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology18.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology18.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology18.secondOfDay();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology18.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology18.halfdayOfDay();
        int int26 = mutableDateTime17.get(dateTimeField25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
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
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime11.toMutableDateTime();
        org.joda.time.chrono.ISOChronology iSOChronology18 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology18.era();
        org.joda.time.DateTime dateTime20 = dateTime11.toDateTime((org.joda.time.Chronology) iSOChronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime17", (instant16.compareTo(mutableDateTime17) == 0) == instant16.equals(mutableDateTime17));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
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
        org.joda.time.DateTime dateTime22 = dateTime11.withDayOfMonth(10);
        int int23 = dateTime22.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Instant instant21 = instant16.withMillis((long) 999);
        org.joda.time.Instant instant23 = instant21.plus(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        long long29 = dateTimeZone23.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale31 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str32 = dateTimeZone23.getShortName((long) '#', locale31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime35 = dateTime33.minusHours((int) (short) 100);
        int int36 = dateTime33.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property37 = dateTime33.monthOfYear();
        org.joda.time.Instant instant38 = dateTime33.toInstant();
        boolean boolean40 = instant38.isEqual((long) 30);
        org.joda.time.DateTime dateTime41 = instant38.toDateTime();
        org.joda.time.DateTime dateTime42 = instant38.toDateTimeISO();
        org.joda.time.Instant instant44 = instant38.minus((long) 45);
        boolean boolean45 = dateTime15.equals((java.lang.Object) instant38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = dateTime15.toString(dateTimeFormatter46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant38", (dateTime11.compareTo(instant38) == 0) == dateTime11.equals(instant38));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField9 = iSOChronology0.eras();
        org.joda.time.DurationField durationField10 = iSOChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DurationField durationField5 = iSOChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField4", (durationField1.compareTo(durationField4) == 0) == durationField1.equals(durationField4));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        int int20 = dateTime19.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
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
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime11.minus(readablePeriod21);
        org.joda.time.DateTime.Property property23 = dateTime22.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant16", (dateTime22.compareTo(instant16) == 0) == dateTime22.equals(instant16));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.LocalDate localDate10 = property7.setCopy("2022");
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long14 = dateTimeZone12.previousTransition((long) (-1));
        long long18 = dateTimeZone12.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = dateTimeZone12.getShortName((long) '#', locale20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime24 = dateTime22.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime26 = dateTime24.minusDays(35);
        boolean boolean27 = property7.equals((java.lang.Object) 35);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long31 = dateTimeZone29.previousTransition((long) (-1));
        long long35 = dateTimeZone29.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale37 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str38 = dateTimeZone29.getShortName((long) '#', locale37);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime41 = dateTime39.minusHours((int) (short) 100);
        int int42 = dateTime39.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property43 = dateTime39.monthOfYear();
        org.joda.time.Instant instant44 = dateTime39.toInstant();
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime39.toMutableDateTime();
        int int46 = property7.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant44", (dateTime22.compareTo(instant44) == 0) == dateTime22.equals(instant44));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField5 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField1, and durationField2", !(durationField5.compareTo(durationField1) == 0) || (Math.signum(durationField5.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone2);
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.withEra(1);
        int int15 = localDate9.compareTo((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) 0);
        org.joda.time.Interval interval19 = localDate9.toInterval(dateTimeZone16);
        org.joda.time.Chronology chronology20 = iSOChronology0.withZone(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField4", (durationField1.compareTo(durationField4) == 0) == durationField1.equals(durationField4));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField9 = iSOChronology0.eras();
        long long13 = iSOChronology0.add((long) 789, (long) (short) 10, (int) 'u');
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Instant instant21 = instant16.withMillis((long) 999);
        org.joda.time.Instant instant23 = instant21.withMillis(10L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Chronology chronology20 = instant16.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology21.era();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology21);
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology21.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology21.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology21.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology21.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime20, (org.joda.time.Chronology) iSOChronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(1);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        boolean boolean32 = instant15.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateMidnight dateMidnight33 = dateTime28.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant22 = instant16.minus((long) 45);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant16.plus(readableDuration23);
        long long25 = instant16.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology23.dayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime20.toDateTime((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology23.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime28", (dateTime20.compareTo(dateTime28) == 0) == dateTime20.equals(dateTime28));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
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
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury(45);
        org.joda.time.DateTime dateTime24 = dateTime15.minusDays(10);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime15.plus(readableDuration25);
        org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField28 = iSOChronology27.weekyears();
        org.joda.time.DateTimeZone dateTimeZone29 = iSOChronology27.getZone();
        org.joda.time.DateTime dateTime30 = dateTime15.withZone(dateTimeZone29);
        java.util.TimeZone timeZone31 = dateTimeZone29.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime30", (dateTime15.compareTo(dateTime30) == 0) == dateTime15.equals(dateTime30));
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long17 = dateTimeZone15.previousTransition((long) (-1));
        long long21 = dateTimeZone15.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = dateTimeZone15.getShortName((long) '#', locale23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime27 = dateTime25.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime29 = dateTime27.minusDays(35);
        org.joda.time.DateTime dateTime30 = localDate11.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        boolean boolean32 = dateTime30.isAfter(1645750800000L);
        org.joda.time.YearMonthDay yearMonthDay33 = dateTime30.toYearMonthDay();
        int int34 = dateTime30.getYearOfCentury();
        long long35 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long39 = dateTimeZone37.previousTransition((long) (-1));
        long long43 = dateTimeZone37.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale45 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str46 = dateTimeZone37.getShortName((long) '#', locale45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime49 = dateTime47.minusHours((int) (short) 100);
        int int50 = dateTime47.getWeekOfWeekyear();
        org.joda.time.Instant instant51 = dateTime47.toInstant();
        org.joda.time.MutableDateTime mutableDateTime52 = instant51.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long56 = dateTimeZone54.previousTransition((long) (-1));
        long long60 = dateTimeZone54.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale62 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str63 = dateTimeZone54.getShortName((long) '#', locale62);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime(dateTimeZone54);
        org.joda.time.DateTime dateTime66 = dateTime64.withWeekyear(1);
        org.joda.time.Chronology chronology67 = dateTime64.getChronology();
        boolean boolean68 = instant51.isBefore((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.MutableDateTime mutableDateTime69 = instant51.toMutableDateTime();
        int int70 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant51", (dateTime25.compareTo(instant51) == 0) == dateTime25.equals(instant51));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) ' ', dateTimeZone23);
        int int28 = dateTimeZone23.getOffsetFromLocal((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime11.toMutableDateTime(dateTimeZone23);
        java.lang.String str31 = dateTimeZone23.getShortName((long) 953);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Instant instant21 = instant16.withMillis((long) 999);
        org.joda.time.Instant instant23 = instant21.withMillis(1645455245267L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        boolean boolean17 = mutableDateTime16.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
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
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant19 = instant16.withDurationAdded(readableDuration17, 14);
        org.joda.time.Instant instant21 = instant19.plus(1645455245267L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant19", (dateTime11.compareTo(instant19) == 0) == dateTime11.equals(instant19));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(1);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        boolean boolean32 = instant15.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.MutableDateTime mutableDateTime33 = instant15.toMutableDateTime();
        org.joda.time.Instant instant34 = instant15.toInstant();
        org.joda.time.Instant instant35 = new org.joda.time.Instant((java.lang.Object) instant34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant34", (dateTime11.compareTo(instant34) == 0) == dateTime11.equals(instant34));
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(1);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        boolean boolean32 = instant15.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Chronology chronology33 = dateTime28.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long19 = dateTimeZone17.previousTransition((long) (-1));
        long long23 = dateTimeZone17.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = dateTimeZone17.getShortName((long) '#', locale25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime29 = dateTime27.minusHours((int) (short) 100);
        int int30 = dateTime27.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property31 = dateTime27.monthOfYear();
        org.joda.time.Instant instant32 = dateTime27.toInstant();
        boolean boolean34 = dateTime27.isBefore(1L);
        org.joda.time.DateTime dateTime36 = dateTime27.plusWeeks((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long41 = dateTimeZone39.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) ' ', dateTimeZone39);
        int int44 = dateTimeZone39.getOffsetFromLocal((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime27.toMutableDateTime(dateTimeZone39);
        org.joda.time.DateTime dateTime46 = dateTime11.toDateTime(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and instant32", (dateTime27.compareTo(instant32) == 0) == dateTime27.equals(instant32));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant22 = instant16.minus((long) 45);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant16.plus(readableDuration23);
        org.joda.time.MutableDateTime mutableDateTime25 = instant24.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant24", (dateTime11.compareTo(instant24) == 0) == dateTime11.equals(instant24));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
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
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant19 = instant16.withDurationAdded(readableDuration17, 14);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant19.plus(readableDuration20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant21", (dateTime11.compareTo(instant21) == 0) == dateTime11.equals(instant21));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DurationField durationField4 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField9 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology23.dayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime20.toDateTime((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime20.plus(readableDuration29);
        java.util.Date date31 = dateTime30.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime28", (dateTime30.compareTo(dateTime28) == 0) == dateTime30.equals(dateTime28));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Instant instant21 = instant16.withMillis((long) 999);
        org.joda.time.MutableDateTime mutableDateTime22 = instant21.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.Chronology chronology20 = instant16.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTimeZone dateTimeZone19 = instant16.getZone();
        int int21 = dateTimeZone19.getOffsetFromLocal((long) 9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) (short) 10);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone4 = calendar3.getTimeZone();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone6 = calendar5.getTimeZone();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone6);
        boolean boolean8 = timeZone4.hasSameRules(timeZone6);
        java.util.Calendar.Builder builder9 = builder2.setTimeZone(timeZone4);
        timeZone4.setID("DateTimeField[halfdayOfDay]");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar5", (calendar3.compareTo(calendar5) == 0) == calendar3.equals(calendar5));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.era();
        org.joda.time.DurationField durationField4 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField1, and durationField2", !(durationField4.compareTo(durationField1) == 0) || (Math.signum(durationField4.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DurationField durationField4 = iSOChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField3", (durationField1.compareTo(durationField3) == 0) == durationField1.equals(durationField3));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
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
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant19 = instant16.withDurationAdded(readableDuration17, 14);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant16.plus(readableDuration20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant21", (dateTime11.compareTo(instant21) == 0) == dateTime11.equals(instant21));
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
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
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant19 = instant16.withDurationAdded(readableDuration17, 14);
        long long20 = instant19.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant19", (dateTime11.compareTo(instant19) == 0) == dateTime11.equals(instant19));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
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
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        org.joda.time.DateTime.Property property23 = dateTime21.millisOfDay();
        boolean boolean24 = property23.isLeap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant22", (dateTime21.compareTo(instant22) == 0) == dateTime21.equals(instant22));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long5 = dateTimeZone3.previousTransition((long) (-1));
        long long9 = dateTimeZone3.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = dateTimeZone3.getShortName((long) '#', locale11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime15 = dateTime13.minusHours((int) (short) 100);
        int int16 = dateTime13.getWeekOfWeekyear();
        org.joda.time.Instant instant17 = dateTime13.toInstant();
        int int18 = dateTime13.getMinuteOfDay();
        int int19 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime dateTime20 = localTime1.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Chronology chronology21 = localTime1.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant17", (dateTime13.compareTo(instant17) == 0) == dateTime13.equals(instant17));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.plusHours((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long11 = dateTimeZone9.previousTransition((long) (-1));
        long long15 = dateTimeZone9.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale17 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str18 = dateTimeZone9.getShortName((long) '#', locale17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime21 = dateTime19.minusHours((int) (short) 100);
        int int22 = dateTime19.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property23 = dateTime19.monthOfYear();
        org.joda.time.Instant instant24 = dateTime19.toInstant();
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime19.toMutableDateTime();
        org.joda.time.DateTime dateTime26 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) mutableDateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant24", (dateTime19.compareTo(instant24) == 0) == dateTime19.equals(instant24));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
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
        org.joda.time.DateTime dateTime22 = dateTime11.withDayOfMonth(10);
        org.joda.time.DateTime dateTime24 = dateTime11.plus((long) 30);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone2);
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DurationField durationField5 = iSOChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField4", (durationField5.compareTo(durationField4) == 0) == durationField5.equals(durationField4));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.era();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfWeek();
        org.joda.time.DurationField durationField6 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField7 = iSOChronology1.eras();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(0L, (org.joda.time.Chronology) iSOChronology1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
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
        org.joda.time.LocalDateTime localDateTime21 = dateTime11.toLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime11.plus(readablePeriod22);
        org.joda.time.DateTime.Property property24 = dateTime23.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant16", (dateTime23.compareTo(instant16) == 0) == dateTime23.equals(instant16));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
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
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime11.minus(readablePeriod21);
        boolean boolean24 = dateTime22.isAfter(407L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant16", (dateTime22.compareTo(instant16) == 0) == dateTime22.equals(instant16));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
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
        int int23 = dateTime11.getMonthOfYear();
        org.joda.time.DateTime dateTime25 = dateTime11.plusMonths((int) (short) 100);
        org.joda.time.DateTime.Property property26 = dateTime25.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant22 = instant16.minus((long) 45);
        org.joda.time.MutableDateTime mutableDateTime23 = instant22.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
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
        org.joda.time.LocalDateTime localDateTime21 = dateTime11.toLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime11.plus(readablePeriod22);
        org.joda.time.DateTime.Property property24 = dateTime23.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant16", (dateTime23.compareTo(instant16) == 0) == dateTime23.equals(instant16));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
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
        int int23 = dateTime11.getMonthOfYear();
        org.joda.time.LocalTime localTime24 = dateTime11.toLocalTime();
        org.joda.time.DateTime dateTime26 = dateTime11.withMillis(657L);
        org.joda.time.DateTime dateTime28 = dateTime26.plusMonths(32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
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
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime11.minus(readablePeriod21);
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology24.era();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology24.weekyearOfCentury();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (short) 0, (org.joda.time.Chronology) iSOChronology24);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) readablePeriod21, (org.joda.time.Chronology) iSOChronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField4", (durationField1.compareTo(durationField4) == 0) == durationField1.equals(durationField4));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology23.dayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime20.toDateTime((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology23.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime28", (dateTime20.compareTo(dateTime28) == 0) == dateTime20.equals(dateTime28));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        int int9 = localTime8.getMillisOfSecond();
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday();
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.plus(readableDuration12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long17 = dateTimeZone15.previousTransition((long) (-1));
        long long21 = dateTimeZone15.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = dateTimeZone15.getShortName((long) '#', locale23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime27 = dateTime25.minusHours((int) (short) 100);
        int int28 = dateTime25.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property29 = dateTime25.monthOfYear();
        org.joda.time.Instant instant30 = dateTime25.toInstant();
        boolean boolean32 = instant30.isEqual((long) 30);
        boolean boolean33 = instant30.isBeforeNow();
        org.joda.time.Instant instant34 = instant30.toInstant();
        boolean boolean35 = instant13.isEqual((org.joda.time.ReadableInstant) instant34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant13", (dateTime10.compareTo(instant13) == 0) == dateTime10.equals(instant13));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        int int9 = localTime8.getMillisOfSecond();
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday();
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.minus(readableDuration12);
        org.joda.time.Instant instant15 = instant11.plus(4620000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant11", (dateTime10.compareTo(instant11) == 0) == dateTime10.equals(instant11));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        int int9 = localTime8.getMillisOfSecond();
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday();
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.minus(readableDuration12);
        org.joda.time.MutableDateTime mutableDateTime14 = instant13.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant13", (dateTime10.compareTo(instant13) == 0) == dateTime10.equals(instant13));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.Instant instant20 = instant16.toInstant();
        org.joda.time.Chronology chronology21 = instant16.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology23.dayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime20.toDateTime((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology23.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime28", (dateTime20.compareTo(dateTime28) == 0) == dateTime20.equals(dateTime28));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(1);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        boolean boolean32 = instant15.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.MutableDateTime mutableDateTime33 = instant15.toMutableDateTime();
        org.joda.time.Instant instant34 = instant15.toInstant();
        long long35 = instant15.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = iSOChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology2.dayOfYear();
        org.joda.time.DurationField durationField8 = iSOChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField5", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField9 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(1);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        boolean boolean32 = instant15.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.MutableDateTime mutableDateTime33 = instant15.toMutableDateTime();
        org.joda.time.Instant instant34 = instant15.toInstant();
        org.joda.time.Instant instant36 = instant34.minus((-62135596800000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant34", (dateTime11.compareTo(instant34) == 0) == dateTime11.equals(instant34));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTimeZone dateTimeZone19 = instant16.getZone();
        java.util.Calendar.Builder builder21 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder25 = builder21.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder28 = builder21.set(2, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long33 = dateTimeZone31.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) ' ', dateTimeZone31);
        org.joda.time.LocalTime.Property property35 = localTime34.minuteOfHour();
        java.util.Locale locale36 = java.util.Locale.ITALY;
        java.lang.String str37 = property35.getAsText(locale36);
        java.util.Calendar.Builder builder38 = builder21.setLocale(locale36);
        java.lang.String str39 = dateTimeZone19.getName((long) 'u', locale36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone2);
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DurationField durationField5 = iSOChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField4", (durationField1.compareTo(durationField4) == 0) == durationField1.equals(durationField4));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded(readableDuration14, 14);
        java.util.Locale locale17 = java.util.Locale.JAPAN;
        java.lang.String str18 = locale17.getScript();
        java.util.Calendar calendar19 = dateTime13.toCalendar(locale17);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        int int34 = dateTime31.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property35 = dateTime31.monthOfYear();
        org.joda.time.Instant instant36 = dateTime31.toInstant();
        boolean boolean38 = dateTime31.isBefore(1L);
        org.joda.time.DateTime dateTime40 = dateTime31.plusWeeks((int) (short) 10);
        org.joda.time.DateTime dateTime42 = dateTime31.withYearOfCentury(3);
        int int43 = dateTime31.getMonthOfYear();
        org.joda.time.LocalTime localTime44 = dateTime31.toLocalTime();
        org.joda.time.DateTime dateTime46 = dateTime31.withMillis(657L);
        boolean boolean47 = calendar19.equals((java.lang.Object) 657L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant36", (dateTime11.compareTo(instant36) == 0) == dateTime11.equals(instant36));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
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
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury(45);
        org.joda.time.DateTime dateTime24 = dateTime15.minusDays(10);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime15.plus(readableDuration25);
        org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField28 = iSOChronology27.weekyears();
        org.joda.time.DateTimeZone dateTimeZone29 = iSOChronology27.getZone();
        org.joda.time.DateTime dateTime30 = dateTime15.withZone(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long34 = dateTimeZone32.previousTransition((long) (-1));
        long long38 = dateTimeZone32.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str41 = dateTimeZone32.getShortName((long) '#', locale40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime44 = dateTime42.minusHours((int) (short) 100);
        int int45 = dateTime42.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property46 = dateTime42.monthOfYear();
        org.joda.time.Instant instant47 = dateTime42.toInstant();
        boolean boolean49 = instant47.isEqual((long) 30);
        boolean boolean50 = instant47.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime51 = instant47.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean53 = instant47.isSupported(dateTimeFieldType52);
        org.joda.time.DateTime.Property property54 = dateTime30.property(dateTimeFieldType52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant47", (dateTime11.compareTo(instant47) == 0) == dateTime11.equals(instant47));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) ' ', dateTimeZone23);
        int int28 = dateTimeZone23.getOffsetFromLocal((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime11.toMutableDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime11.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime29", (instant16.compareTo(mutableDateTime29) == 0) == instant16.equals(mutableDateTime29));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.year();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long7 = dateTimeZone5.previousTransition((long) (-1));
        long long11 = dateTimeZone5.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str14 = dateTimeZone5.getShortName((long) '#', locale13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime17 = dateTime15.minusHours((int) (short) 100);
        int int18 = dateTime15.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property19 = dateTime15.monthOfYear();
        org.joda.time.Instant instant20 = dateTime15.toInstant();
        boolean boolean22 = instant20.isEqual((long) 30);
        boolean boolean23 = instant20.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime24 = instant20.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean26 = instant20.isSupported(dateTimeFieldType25);
        int int27 = localDate2.get(dateTimeFieldType25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant20", (dateTime15.compareTo(instant20) == 0) == dateTime15.equals(instant20));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.year();
        org.joda.time.LocalDate localDate5 = localDate2.withYear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType6.getField((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.DurationField durationField11 = dateTimeField10.getDurationField();
        int int14 = dateTimeField10.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        boolean boolean23 = localDate19.isSupported(durationFieldType22);
        int[] intArray25 = new int[] { (short) 10 };
        int int26 = dateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) localDate19, intArray25);
        java.util.Locale locale28 = null;
        java.lang.String str29 = localDate19.toString("2022", locale28);
        org.joda.time.LocalDate localDate31 = localDate19.withYearOfEra(40);
        int int32 = localDate19.getWeekyear();
        org.joda.time.LocalDate localDate33 = localDate2.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate36 = localDate19.withPeriodAdded(readablePeriod34, 789);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(dateTimeZone38);
        org.joda.time.LocalDate localDate41 = localDate39.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long45 = dateTimeZone43.previousTransition((long) (-1));
        long long49 = dateTimeZone43.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = dateTimeZone43.getShortName((long) '#', locale51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime55 = dateTime53.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime57 = dateTime55.minusDays(35);
        org.joda.time.DateTime dateTime58 = localDate39.toDateTime((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime.Property property59 = dateTime57.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology60 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField61 = iSOChronology60.weekyears();
        org.joda.time.DurationField durationField62 = iSOChronology60.halfdays();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology60.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField64 = iSOChronology60.dayOfYear();
        org.joda.time.DateTime dateTime65 = dateTime57.toDateTime((org.joda.time.Chronology) iSOChronology60);
        org.joda.time.DateTime dateTime66 = localDate36.toDateTime((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.MutableDateTime mutableDateTime67 = dateTime65.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime68 = dateTime65.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime57 and mutableDateTime67", (dateTime57.compareTo(mutableDateTime67) == 0) == dateTime57.equals(mutableDateTime67));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.minuteOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField4", (durationField1.compareTo(durationField4) == 0) == durationField1.equals(durationField4));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        calendar0.setFirstDayOfWeek(0);
        java.util.TimeZone timeZone4 = calendar0.getTimeZone();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getISO3Language();
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.era();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology7);
        org.joda.time.DurationField durationField10 = iSOChronology7.months();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long17 = dateTimeZone15.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) ' ', dateTimeZone15);
        org.joda.time.LocalTime.Property property19 = localTime18.minuteOfHour();
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.lang.String str21 = property19.getAsText(locale20);
        int int22 = property19.getLeapAmount();
        java.lang.String str23 = property19.getAsShortText();
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str25 = property19.getAsText(locale24);
        java.lang.String str26 = dateTimeField11.getAsText(3, locale24);
        java.lang.String str27 = locale5.getDisplayVariant(locale24);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone4, locale24);
        java.lang.Object obj29 = timeZone4.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar28", (calendar0.compareTo(calendar28) == 0) == calendar0.equals(calendar28));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology23.dayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime20.toDateTime((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime20.plus(readableDuration29);
        org.joda.time.DateTime dateTime32 = dateTime30.plusSeconds(17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime28", (dateTime30.compareTo(dateTime28) == 0) == dateTime30.equals(dateTime28));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        int int9 = localTime8.getMillisOfSecond();
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday();
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.minus(readableDuration12);
        org.joda.time.Instant instant16 = instant11.withDurationAdded((long) 10, 12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant11", (dateTime10.compareTo(instant11) == 0) == dateTime10.equals(instant11));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long6 = dateTimeZone4.previousTransition((long) (-1));
        long long10 = dateTimeZone4.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = dateTimeZone4.getShortName((long) '#', locale12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone4);
        org.joda.time.DateTime dateTime16 = dateTime14.minusHours((int) (short) 100);
        int int17 = dateTime14.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property18 = dateTime14.monthOfYear();
        org.joda.time.Instant instant19 = dateTime14.toInstant();
        boolean boolean21 = dateTime14.isBefore(1L);
        org.joda.time.DateTime dateTime23 = dateTime14.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime24 = dateTime14.toLocalDateTime();
        int[] intArray26 = iSOChronology0.get((org.joda.time.ReadablePartial) localDateTime24, (long) 53658491);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant19", (dateTime14.compareTo(instant19) == 0) == dateTime14.equals(instant19));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(1);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        boolean boolean32 = instant15.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.MutableDateTime mutableDateTime33 = instant15.toMutableDateTime();
        org.joda.time.Instant instant34 = instant15.toInstant();
        long long35 = instant34.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant34", (dateTime11.compareTo(instant34) == 0) == dateTime11.equals(instant34));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        int int17 = dateTime16.getCenturyOfEra();
        org.joda.time.DateTime dateTime19 = dateTime16.withWeekOfWeekyear(21);
        org.joda.time.Instant instant20 = dateTime16.toInstant();
        org.joda.time.DateTime dateTime21 = dateTime16.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant20", (dateTime21.compareTo(instant20) == 0) == dateTime21.equals(instant20));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Chronology chronology20 = instant16.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        long long19 = instant16.getMillis();
        org.joda.time.Instant instant20 = instant16.toInstant();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant20.plus(readableDuration21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant22", (dateTime11.compareTo(instant22) == 0) == dateTime11.equals(instant22));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
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
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMonths(20);
        org.joda.time.DateTime.Property property20 = dateTime19.monthOfYear();
        org.joda.time.DurationField durationField21 = property20.getRangeDurationField();
        org.joda.time.DateTime dateTime22 = property20.getDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField21", (durationField1.compareTo(durationField21) == 0) == durationField1.equals(durationField21));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        long long17 = mutableDateTime16.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfYear();
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField7 = iSOChronology6.weekyears();
        org.joda.time.DurationField durationField8 = iSOChronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology6.dayOfMonth();
        org.joda.time.DurationField durationField10 = iSOChronology6.seconds();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) iSOChronology6);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        long long15 = iSOChronology0.set((org.joda.time.ReadablePartial) localDateTime13, (long) 789);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField17 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField18 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField1, and durationField2", !(durationField18.compareTo(durationField1) == 0) || (Math.signum(durationField18.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.Interval interval7 = property5.toInterval();
        org.joda.time.DurationField durationField8 = property5.getDurationField();
        org.joda.time.DurationField durationField9 = property5.getRangeDurationField();
        int int10 = property5.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField9", (durationField1.compareTo(durationField9) == 0) == durationField1.equals(durationField9));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        long long13 = dateTimeZone1.convertLocalToUTC((long) (-292275054), true);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long17 = dateTimeZone15.previousTransition((long) (-1));
        long long21 = dateTimeZone15.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = dateTimeZone15.getShortName((long) '#', locale23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime27 = dateTime25.minusHours((int) (short) 100);
        int int28 = dateTime25.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property29 = dateTime25.monthOfYear();
        org.joda.time.Instant instant30 = dateTime25.toInstant();
        org.joda.time.Instant instant32 = instant30.minus((long) 'u');
        int int33 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) instant32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant30", (dateTime25.compareTo(instant30) == 0) == dateTime25.equals(instant30));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant22 = instant16.minus((long) 59);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone24.previousTransition((long) (-1));
        long long30 = dateTimeZone24.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale32 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str33 = dateTimeZone24.getShortName((long) '#', locale32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime36 = dateTime34.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime38 = dateTime36.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology39 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology39.era();
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology39);
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology39.weekyearOfCentury();
        int int43 = dateTime38.get(dateTimeField42);
        org.joda.time.DateTime dateTime45 = dateTime38.withYearOfCentury(45);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTime38.getZone();
        boolean boolean47 = instant22.isAfter((org.joda.time.ReadableInstant) dateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
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
        boolean boolean23 = dateTime22.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.era();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfWeek();
        org.joda.time.DurationField durationField6 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        boolean boolean9 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) iSOChronology1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField8", Math.signum(durationField6.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField6)));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant22 = instant16.minus((long) 45);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant16.plus(readableDuration23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Instant instant27 = instant16.withDurationAdded(readableDuration25, 53708922);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant27", (dateTime11.compareTo(instant27) == 0) == dateTime11.equals(instant27));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DurationField durationField2 = iSOChronology0.eras();
        org.joda.time.DurationField durationField3 = iSOChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField3, and durationField2", !(durationField2.compareTo(durationField3) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField3.compareTo(durationField2))));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
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
        int int23 = dateTime11.getMonthOfYear();
        org.joda.time.Instant instant24 = dateTime11.toInstant();
        org.joda.time.DateTime.Property property25 = dateTime11.hourOfDay();
        org.joda.time.DateTime dateTime27 = property25.addWrapFieldToCopy(37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(5317346412000L);
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology2.era();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology2.dayOfWeek();
        org.joda.time.DurationField durationField7 = iSOChronology2.weeks();
        org.joda.time.DurationField durationField8 = iSOChronology2.eras();
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime((org.joda.time.Chronology) iSOChronology2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        int int9 = localTime8.getMillisOfSecond();
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday();
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.minus(readableDuration12);
        org.joda.time.MutableDateTime mutableDateTime14 = instant13.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant13", (dateTime10.compareTo(instant13) == 0) == dateTime10.equals(instant13));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime20.plusSeconds(21);
        org.joda.time.DateTime dateTime26 = dateTime20.minusDays((int) (byte) 0);
        org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField28 = iSOChronology27.weekyears();
        org.joda.time.DurationField durationField29 = iSOChronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology27.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology27.dayOfYear();
        org.joda.time.DateTime dateTime32 = dateTime26.toDateTime((org.joda.time.Chronology) iSOChronology27);
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology27.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime32", (dateTime20.compareTo(dateTime32) == 0) == dateTime20.equals(dateTime32));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
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
        boolean boolean23 = dateTime21.isAfter(1645750800000L);
        org.joda.time.YearMonthDay yearMonthDay24 = dateTime21.toYearMonthDay();
        int int25 = dateTime21.getYearOfCentury();
        org.joda.time.DateTime.Property property26 = dateTime21.weekyear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime29 = dateTime21.toDateTime(dateTimeZone28);
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime29", (dateTime21.compareTo(dateTime29) == 0) == dateTime21.equals(dateTime29));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.dayOfMonth();
        org.joda.time.DurationField durationField8 = iSOChronology0.days();
        org.joda.time.DurationField durationField9 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField2", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        int int9 = localTime8.getMillisOfSecond();
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday();
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.minus(readableDuration12);
        org.joda.time.Chronology chronology14 = instant11.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant11", (dateTime10.compareTo(instant11) == 0) == dateTime10.equals(instant11));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        int int9 = localTime8.getMillisOfSecond();
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday();
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.plus(readableDuration12);
        org.joda.time.Instant instant15 = instant11.withMillis((long) 998);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant11", (dateTime10.compareTo(instant11) == 0) == dateTime10.equals(instant11));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone3 = calendar2.getTimeZone();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone3);
        boolean boolean5 = timeZone1.hasSameRules(timeZone3);
        java.lang.String str6 = timeZone3.getID();
        timeZone3.setID("Feb");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar2", (calendar0.compareTo(calendar2) == 0) == calendar0.equals(calendar2));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
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
        org.joda.time.LocalDateTime localDateTime21 = dateTime11.toLocalDateTime();
        int int22 = localDateTime21.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone3 = calendar2.getTimeZone();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone3);
        boolean boolean5 = timeZone1.hasSameRules(timeZone3);
        java.time.ZoneId zoneId6 = timeZone1.toZoneId();
        timeZone1.setRawOffset(292278993);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar2", (calendar0.compareTo(calendar2) == 0) == calendar0.equals(calendar2));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long21 = dateTimeZone19.previousTransition((long) (-1));
        long long25 = dateTimeZone19.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str28 = dateTimeZone19.getShortName((long) '#', locale27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime31 = dateTime29.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime33 = dateTime31.minusDays(35);
        org.joda.time.DateTime dateTime34 = localDate15.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        boolean boolean36 = dateTime34.isAfter(1645750800000L);
        org.joda.time.YearMonthDay yearMonthDay37 = dateTime34.toYearMonthDay();
        int int38 = dateTime34.getYearOfCentury();
        org.joda.time.DateTime.Property property39 = dateTime34.weekyear();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime42 = dateTime34.toDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = localDate12.toDateTimeAtMidnight(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and dateTime42", (dateTime34.compareTo(dateTime42) == 0) == dateTime34.equals(dateTime42));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long17 = dateTimeZone15.previousTransition((long) (-1));
        long long21 = dateTimeZone15.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = dateTimeZone15.getShortName((long) '#', locale23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime27 = dateTime25.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime29 = dateTime27.minusDays(35);
        org.joda.time.DateTime dateTime30 = localDate11.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        boolean boolean32 = dateTime30.isAfter(1645750800000L);
        org.joda.time.YearMonthDay yearMonthDay33 = dateTime30.toYearMonthDay();
        int int34 = dateTime30.getYearOfCentury();
        long long35 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Instant instant36 = dateTime30.toInstant();
        org.joda.time.chrono.ISOChronology iSOChronology37 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField38 = iSOChronology37.weekyears();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology37.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology37.hourOfDay();
        org.joda.time.DurationField durationField41 = iSOChronology37.centuries();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long45 = dateTimeZone43.previousTransition((long) (-1));
        long long49 = dateTimeZone43.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = dateTimeZone43.getShortName((long) '#', locale51);
        org.joda.time.Chronology chronology53 = iSOChronology37.withZone(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean56 = dateTimeZone54.isStandardOffset((long) 0);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long60 = dateTimeZone54.getMillisKeepLocal(dateTimeZone58, (-1947974400000L));
        java.lang.Object obj61 = null;
        boolean boolean62 = dateTimeZone54.equals(obj61);
        long long64 = dateTimeZone43.getMillisKeepLocal(dateTimeZone54, (long) (byte) -1);
        org.joda.time.DateTime dateTime65 = instant36.toDateTime(dateTimeZone54);
        org.joda.time.DateTime dateTime66 = org.joda.time.DateTime.now(dateTimeZone54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant36", (dateTime30.compareTo(instant36) == 0) == dateTime30.equals(instant36));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
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
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfWeek();
        org.joda.time.DateTime dateTime19 = dateTime16.withMillisOfSecond((int) (short) 1);
        int int20 = dateTime16.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone23);
        long long27 = dateTimeZone22.getMillisKeepLocal(dateTimeZone23, (long) 22);
        java.lang.String str28 = dateTimeZone22.toString();
        java.lang.String str30 = dateTimeZone22.getName(0L);
        int int32 = dateTimeZone22.getOffset((long) 100);
        org.joda.time.DateTime dateTime33 = dateTime16.toDateTime(dateTimeZone22);
        boolean boolean34 = dateTimeZone22.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime33", (dateTime16.compareTo(dateTime33) == 0) == dateTime16.equals(dateTime33));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField5 = iSOChronology0.months();
        org.joda.time.DurationField durationField6 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField6", (durationField1.compareTo(durationField6) == 0) == durationField1.equals(durationField6));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate7 = localDate5.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property8 = localDate5.weekyear();
        org.joda.time.LocalDate localDate9 = property8.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long18 = dateTimeZone16.previousTransition((long) (-1));
        long long22 = dateTimeZone16.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str25 = dateTimeZone16.getShortName((long) '#', locale24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime28 = dateTime26.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime30 = dateTime28.minusDays(35);
        org.joda.time.DateTime dateTime31 = localDate12.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        boolean boolean33 = dateTime31.isAfter(1645750800000L);
        org.joda.time.YearMonthDay yearMonthDay34 = dateTime31.toYearMonthDay();
        int int35 = dateTime31.getYearOfCentury();
        long long36 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Instant instant37 = dateTime31.toInstant();
        org.joda.time.chrono.ISOChronology iSOChronology38 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField39 = iSOChronology38.weekyears();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology38.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology38.hourOfDay();
        org.joda.time.DurationField durationField42 = iSOChronology38.centuries();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long46 = dateTimeZone44.previousTransition((long) (-1));
        long long50 = dateTimeZone44.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale52 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str53 = dateTimeZone44.getShortName((long) '#', locale52);
        org.joda.time.Chronology chronology54 = iSOChronology38.withZone(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean57 = dateTimeZone55.isStandardOffset((long) 0);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long61 = dateTimeZone55.getMillisKeepLocal(dateTimeZone59, (-1947974400000L));
        java.lang.Object obj62 = null;
        boolean boolean63 = dateTimeZone55.equals(obj62);
        long long65 = dateTimeZone44.getMillisKeepLocal(dateTimeZone55, (long) (byte) -1);
        org.joda.time.DateTime dateTime66 = instant37.toDateTime(dateTimeZone55);
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate(53692971L, dateTimeZone55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant37", (dateTime31.compareTo(instant37) == 0) == dateTime31.equals(instant37));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
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
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant19 = instant16.withDurationAdded(readableDuration17, 14);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.withEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDate localDate27 = localDate22.withField(dateTimeFieldType25, 100);
        int int28 = instant19.get(dateTimeFieldType25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant19", (dateTime11.compareTo(instant19) == 0) == dateTime11.equals(instant19));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
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
        int int23 = dateTime11.getMonthOfYear();
        org.joda.time.LocalTime localTime24 = dateTime11.toLocalTime();
        org.joda.time.DateTime dateTime26 = dateTime11.withMillis(657L);
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        int int9 = localTime8.getMillisOfSecond();
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday();
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.minus(readableDuration12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant15 = instant11.plus(readableDuration14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant15", (dateTime10.compareTo(instant15) == 0) == dateTime10.equals(instant15));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        long long29 = dateTimeZone23.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale31 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str32 = dateTimeZone23.getShortName((long) '#', locale31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime35 = dateTime33.minusHours((int) (short) 100);
        int int36 = dateTime33.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property37 = dateTime33.monthOfYear();
        org.joda.time.Instant instant38 = dateTime33.toInstant();
        boolean boolean40 = instant38.isEqual((long) 30);
        org.joda.time.DateTime dateTime41 = instant38.toDateTime();
        org.joda.time.DateTime dateTime42 = instant38.toDateTimeISO();
        org.joda.time.Instant instant44 = instant38.minus((long) 45);
        boolean boolean45 = dateTime15.equals((java.lang.Object) instant38);
        org.joda.time.DateTime.Property property46 = dateTime15.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant38", (dateTime11.compareTo(instant38) == 0) == dateTime11.equals(instant38));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTimeZone dateTimeZone19 = instant16.getZone();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant22 = instant16.withDurationAdded(readableDuration20, (int) '#');
        org.joda.time.Instant instant24 = instant16.plus(3180077L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.years();
        boolean boolean8 = localDate4.isSupported(durationFieldType7);
        org.joda.time.DateTime dateTime9 = localDate4.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfEra();
        org.joda.time.DateTime dateTime12 = dateTime9.withSecondOfMinute((int) ' ');
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long17 = dateTimeZone15.previousTransition((long) (-1));
        long long21 = dateTimeZone15.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = dateTimeZone15.getShortName((long) '#', locale23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime27 = dateTime25.minusHours((int) (short) 100);
        int int28 = dateTime25.getWeekOfWeekyear();
        org.joda.time.Instant instant29 = dateTime25.toInstant();
        org.joda.time.MutableDateTime mutableDateTime30 = instant29.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long34 = dateTimeZone32.previousTransition((long) (-1));
        long long38 = dateTimeZone32.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str41 = dateTimeZone32.getShortName((long) '#', locale40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime44 = dateTime42.withWeekyear(1);
        org.joda.time.Chronology chronology45 = dateTime42.getChronology();
        boolean boolean46 = instant29.isBefore((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.MutableDateTime mutableDateTime47 = instant29.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Instant instant50 = instant29.withDurationAdded(readableDuration48, 16);
        boolean boolean51 = dateTime12.isEqual((org.joda.time.ReadableInstant) instant50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant50", (dateTime9.compareTo(instant50) == 0) == dateTime9.equals(instant50));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        long long8 = dateTimeZone2.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = dateTimeZone2.getShortName((long) '#', locale10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime14 = dateTime12.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime16 = dateTime14.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology17.era();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology17);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology17.weekyearOfCentury();
        int int21 = dateTime16.get(dateTimeField20);
        org.joda.time.DateTime dateTime23 = dateTime16.withYearOfCentury(45);
        org.joda.time.DateTime dateTime25 = dateTime16.minusDays(10);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime27 = dateTime16.plus(readableDuration26);
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField29 = iSOChronology28.weekyears();
        org.joda.time.DateTimeZone dateTimeZone30 = iSOChronology28.getZone();
        org.joda.time.DateTime dateTime31 = dateTime16.withZone(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 357, dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime31", (dateTime16.compareTo(dateTime31) == 0) == dateTime16.equals(dateTime31));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
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
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant19 = instant16.withDurationAdded(readableDuration17, 14);
        org.joda.time.Instant instant21 = instant16.minus(55080040L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        int int17 = dateTime16.getCenturyOfEra();
        org.joda.time.DateTime dateTime19 = dateTime16.withWeekOfWeekyear(21);
        org.joda.time.Instant instant20 = dateTime16.toInstant();
        boolean boolean21 = dateTime16.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant20", (dateTime16.compareTo(instant20) == 0) == dateTime16.equals(instant20));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.dayOfMonth();
        org.joda.time.DurationField durationField8 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField1, and durationField2", !(durationField8.compareTo(durationField1) == 0) || (Math.signum(durationField8.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.weekyearOfCentury();
        int int40 = dateTime35.get(dateTimeField39);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury(45);
        org.joda.time.DateTime dateTime44 = dateTime35.minusDays(10);
        boolean boolean45 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Chronology chronology46 = instant16.getChronology();
        org.joda.time.Instant instant48 = instant16.withMillis((long) 32772);
        long long49 = instant48.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) ' ', dateTimeZone23);
        int int28 = dateTimeZone23.getOffsetFromLocal((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime11.toMutableDateTime(dateTimeZone23);
        java.lang.String str30 = dateTimeZone23.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField2 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField3 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.monthOfYear();
        org.joda.time.DurationField durationField5 = iSOChronology1.years();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 42884, (org.joda.time.Chronology) iSOChronology1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField5", (durationField2.compareTo(durationField5) == 0) == durationField2.equals(durationField5));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property14 = dateTime11.weekyear();
        int int15 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long19 = dateTimeZone17.previousTransition((long) (-1));
        long long23 = dateTimeZone17.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = dateTimeZone17.getShortName((long) '#', locale25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.withEra(1);
        int int38 = localDate32.compareTo((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean41 = dateTimeZone39.isStandardOffset((long) 0);
        org.joda.time.Interval interval42 = localDate32.toInterval(dateTimeZone39);
        boolean boolean43 = dateTime27.equals((java.lang.Object) dateTimeZone39);
        int int44 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Instant instant45 = dateTime27.toInstant();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime(dateTimeZone48);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(dateTimeZone48);
        long long52 = dateTimeZone47.getMillisKeepLocal(dateTimeZone48, (long) 22);
        java.lang.String str53 = dateTimeZone47.toString();
        java.lang.String str55 = dateTimeZone47.getName(0L);
        int int57 = dateTimeZone47.getOffset((long) 100);
        org.joda.time.DateTime dateTime58 = dateTime27.toDateTime(dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant45", (dateTime11.compareTo(instant45) == 0) == dateTime11.equals(instant45));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
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
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        org.joda.time.DateTime.Property property23 = dateTime21.millisOfDay();
        org.joda.time.DateTime dateTime25 = property23.addToCopy((-1356965630000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant22", (dateTime21.compareTo(instant22) == 0) == dateTime21.equals(instant22));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        java.lang.String[] strArray6 = new java.lang.String[] { "fr-CA", "days", "0", "hi!", "2022-02-25", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "days" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.Locale.FilteringMode filteringMode18 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList16, filteringMode18);
        boolean boolean20 = strSet7.addAll((java.util.Collection<java.lang.String>) strList16);
        boolean boolean21 = strSet7.isEmpty();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        long long29 = dateTimeZone23.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale31 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str32 = dateTimeZone23.getShortName((long) '#', locale31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime35 = dateTime33.minusHours((int) (short) 100);
        int int36 = dateTime33.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property37 = dateTime33.monthOfYear();
        org.joda.time.Instant instant38 = dateTime33.toInstant();
        boolean boolean40 = dateTime33.isBefore(1L);
        org.joda.time.DateTime dateTime42 = dateTime33.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime43 = dateTime33.toLocalDateTime();
        int int44 = dateTime33.getYearOfCentury();
        org.joda.time.DateTime.Property property45 = dateTime33.minuteOfDay();
        boolean boolean46 = strSet7.contains((java.lang.Object) property45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and instant38", (dateTime33.compareTo(instant38) == 0) == dateTime33.equals(instant38));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField9 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.Chronology chronology4 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long9 = dateTimeZone7.previousTransition((long) (-1));
        long long13 = dateTimeZone7.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale15 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str16 = dateTimeZone7.getShortName((long) '#', locale15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime19 = dateTime17.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime21 = dateTime19.minusDays(35);
        boolean boolean23 = dateTime21.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime26 = dateTime21.withDurationAdded((long) 11, 16);
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfDay();
        org.joda.time.DateTime dateTime28 = property27.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime28.getZone();
        org.joda.time.Chronology chronology30 = iSOChronology0.withZone(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime17", (dateTime2.compareTo(dateTime17) == 0) == dateTime2.equals(dateTime17));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) ' ', dateTimeZone23);
        int int28 = dateTimeZone23.getOffsetFromLocal((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime11.toMutableDateTime(dateTimeZone23);
        org.joda.time.DateTime.Property property30 = dateTime11.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime29", (instant16.compareTo(mutableDateTime29) == 0) == instant16.equals(mutableDateTime29));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology23.dayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime20.toDateTime((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime20.plus(readableDuration29);
        org.joda.time.DateTime.Property property31 = dateTime20.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime20", (dateTime28.compareTo(dateTime20) == 0) == dateTime28.equals(dateTime20));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField5 = iSOChronology0.months();
        org.joda.time.DurationField durationField6 = iSOChronology0.years();
        org.joda.time.DurationField durationField7 = iSOChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField6", (durationField1.compareTo(durationField6) == 0) == durationField1.equals(durationField6));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.era();
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DurationField durationField5 = iSOChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField4", (durationField1.compareTo(durationField4) == 0) == durationField1.equals(durationField4));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField3", (durationField1.compareTo(durationField3) == 0) == durationField1.equals(durationField3));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType11.getField((org.joda.time.Chronology) iSOChronology13);
        org.joda.time.DurationField durationField16 = dateTimeField15.getDurationField();
        int int19 = dateTimeField15.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate26 = localDate24.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.years();
        boolean boolean28 = localDate24.isSupported(durationFieldType27);
        int[] intArray30 = new int[] { (short) 10 };
        int int31 = dateTimeField15.getMaximumValue((org.joda.time.ReadablePartial) localDate24, intArray30);
        int int32 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDate8, intArray30);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long36 = dateTimeZone34.previousTransition((long) (-1));
        long long40 = dateTimeZone34.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale42 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str43 = dateTimeZone34.getShortName((long) '#', locale42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone34);
        org.joda.time.DateTime dateTime46 = dateTime44.minusHours((int) (short) 100);
        int int47 = dateTime44.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property48 = dateTime44.monthOfYear();
        org.joda.time.Instant instant49 = dateTime44.toInstant();
        boolean boolean51 = instant49.isEqual((long) 30);
        org.joda.time.MutableDateTime mutableDateTime52 = instant49.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime53 = localDate8.toDateTime((org.joda.time.ReadableInstant) mutableDateTime52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and instant49", (dateTime44.compareTo(instant49) == 0) == dateTime44.equals(instant49));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        int int9 = localTime8.getMillisOfSecond();
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday();
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.plus(readableDuration12);
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant13", (dateTime10.compareTo(instant13) == 0) == dateTime10.equals(instant13));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = iSOChronology0.eras();
        org.joda.time.DurationField durationField8 = iSOChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField7", Math.signum(durationField5.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField5)));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.yearOfCentury();
        org.joda.time.DurationField durationField6 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField4", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField4)) == Math.signum(durationField1.compareTo(durationField4))));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.era();
        org.joda.time.DurationField durationField7 = iSOChronology0.years();
        org.joda.time.DurationField durationField8 = iSOChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField7", (durationField1.compareTo(durationField7) == 0) == durationField1.equals(durationField7));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
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
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury(45);
        org.joda.time.DateTime dateTime24 = dateTime15.minusDays(10);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime15.plus(readableDuration25);
        org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField28 = iSOChronology27.weekyears();
        org.joda.time.DateTimeZone dateTimeZone29 = iSOChronology27.getZone();
        org.joda.time.DateTime dateTime30 = dateTime15.withZone(dateTimeZone29);
        long long33 = dateTimeZone29.convertLocalToUTC((long) 486, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime30", (dateTime15.compareTo(dateTime30) == 0) == dateTime15.equals(dateTime30));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long17 = dateTimeZone15.previousTransition((long) (-1));
        long long21 = dateTimeZone15.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = dateTimeZone15.getShortName((long) '#', locale23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime27 = dateTime25.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime29 = dateTime27.minusDays(35);
        org.joda.time.DateTime dateTime30 = localDate11.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        boolean boolean32 = dateTime30.isAfter(1645750800000L);
        org.joda.time.YearMonthDay yearMonthDay33 = dateTime30.toYearMonthDay();
        int int34 = dateTime30.getYearOfCentury();
        long long35 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Instant instant36 = dateTime30.toInstant();
        org.joda.time.chrono.ISOChronology iSOChronology37 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField38 = iSOChronology37.weekyears();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology37.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology37.hourOfDay();
        org.joda.time.DurationField durationField41 = iSOChronology37.centuries();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long45 = dateTimeZone43.previousTransition((long) (-1));
        long long49 = dateTimeZone43.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = dateTimeZone43.getShortName((long) '#', locale51);
        org.joda.time.Chronology chronology53 = iSOChronology37.withZone(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean56 = dateTimeZone54.isStandardOffset((long) 0);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long60 = dateTimeZone54.getMillisKeepLocal(dateTimeZone58, (-1947974400000L));
        java.lang.Object obj61 = null;
        boolean boolean62 = dateTimeZone54.equals(obj61);
        long long64 = dateTimeZone43.getMillisKeepLocal(dateTimeZone54, (long) (byte) -1);
        org.joda.time.DateTime dateTime65 = instant36.toDateTime(dateTimeZone54);
        org.joda.time.ReadableDuration readableDuration66 = null;
        org.joda.time.DateTime dateTime67 = dateTime65.minus(readableDuration66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant36", (dateTime30.compareTo(instant36) == 0) == dateTime30.equals(instant36));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone2);
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DurationField durationField5 = iSOChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField4", (durationField1.compareTo(durationField4) == 0) == durationField1.equals(durationField4));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant23 = instant16.withDurationAdded((long) 25, 4);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant23.plus(readableDuration24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Chronology chronology20 = instant16.getChronology();
        org.joda.time.DateTime dateTime21 = instant16.toDateTimeISO();
        org.joda.time.Instant instant23 = instant16.withMillis((long) 86399999);
        org.joda.time.Instant instant25 = instant16.withMillis((long) 624);
        org.joda.time.Instant instant26 = instant25.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        int int16 = dateTime11.getMinuteOfDay();
        org.joda.time.DateTime dateTime18 = dateTime11.plusWeeks(657);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property10 = localDate7.weekyear();
        java.lang.String str11 = property10.getAsString();
        org.joda.time.chrono.ISOChronology iSOChronology12 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = iSOChronology12.weekyears();
        org.joda.time.DateTimeZone dateTimeZone14 = iSOChronology12.getZone();
        boolean boolean15 = property10.equals((java.lang.Object) iSOChronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology((org.joda.time.Chronology) iSOChronology12);
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology17.era();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology17.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology17.year();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology17.era();
        org.joda.time.DurationField durationField22 = iSOChronology17.seconds();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withChronology((org.joda.time.Chronology) iSOChronology17);
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology17.dayOfMonth();
        org.joda.time.DurationField durationField25 = iSOChronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField13, and durationField22", !(durationField25.compareTo(durationField13) == 0) || (Math.signum(durationField25.compareTo(durationField22)) == Math.signum(durationField13.compareTo(durationField22))));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(1);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        boolean boolean32 = instant15.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.MutableDateTime mutableDateTime33 = instant15.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant36 = instant15.withDurationAdded(readableDuration34, 16);
        org.joda.time.MutableDateTime mutableDateTime37 = instant15.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        int int15 = dateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime17 = dateTime11.minusMonths((int) (short) 10);
        org.joda.time.chrono.ISOChronology iSOChronology18 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = iSOChronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology18.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology18);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusMinutes((int) 'a');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.minusWeeks(100);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusMinutes(100);
        int int29 = localDateTime28.getDayOfWeek();
        int int30 = localDateTime28.getDayOfMonth();
        org.joda.time.DateTime dateTime31 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime28);
        boolean boolean32 = dateTime31.isAfterNow();
        org.joda.time.DateTime dateTime33 = dateTime31.toDateTime();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime36 = dateTime31.withDurationAdded(readableDuration34, (int) (byte) 0);
        org.joda.time.chrono.ISOChronology iSOChronology38 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology38.era();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology38.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        long long44 = iSOChronology38.add(readablePeriod41, (long) (short) 1, 954);
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology38.clockhourOfDay();
        org.joda.time.LocalTime localTime46 = org.joda.time.LocalTime.fromMillisOfDay((long) 56, (org.joda.time.Chronology) iSOChronology38);
        org.joda.time.DurationField durationField47 = iSOChronology38.years();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((org.joda.time.Chronology) iSOChronology38);
        org.joda.time.DateTime.Property property49 = dateTime48.millisOfSecond();
        boolean boolean50 = dateTime31.isEqual((org.joda.time.ReadableInstant) dateTime48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField19 and durationField47", (durationField19.compareTo(durationField47) == 0) == durationField19.equals(durationField47));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.year();
        org.joda.time.LocalDate localDate5 = localDate2.withYear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType6.getField((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.DurationField durationField11 = dateTimeField10.getDurationField();
        int int14 = dateTimeField10.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        boolean boolean23 = localDate19.isSupported(durationFieldType22);
        int[] intArray25 = new int[] { (short) 10 };
        int int26 = dateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) localDate19, intArray25);
        java.util.Locale locale28 = null;
        java.lang.String str29 = localDate19.toString("2022", locale28);
        org.joda.time.LocalDate localDate31 = localDate19.withYearOfEra(40);
        int int32 = localDate19.getWeekyear();
        org.joda.time.LocalDate localDate33 = localDate2.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate36 = localDate19.withPeriodAdded(readablePeriod34, 789);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(dateTimeZone38);
        org.joda.time.LocalDate localDate41 = localDate39.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long45 = dateTimeZone43.previousTransition((long) (-1));
        long long49 = dateTimeZone43.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = dateTimeZone43.getShortName((long) '#', locale51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime55 = dateTime53.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime57 = dateTime55.minusDays(35);
        org.joda.time.DateTime dateTime58 = localDate39.toDateTime((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime.Property property59 = dateTime57.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology60 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField61 = iSOChronology60.weekyears();
        org.joda.time.DurationField durationField62 = iSOChronology60.halfdays();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology60.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField64 = iSOChronology60.dayOfYear();
        org.joda.time.DateTime dateTime65 = dateTime57.toDateTime((org.joda.time.Chronology) iSOChronology60);
        org.joda.time.DateTime dateTime66 = localDate36.toDateTime((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.MutableDateTime mutableDateTime67 = dateTime65.toMutableDateTime();
        org.joda.time.DateTime.Property property68 = dateTime65.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime57 and mutableDateTime67", (dateTime57.compareTo(mutableDateTime67) == 0) == dateTime57.equals(mutableDateTime67));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
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
        org.joda.time.LocalDate localDate23 = localDate2.withYearOfEra(15);
        org.joda.time.LocalDate.Property property24 = localDate23.yearOfEra();
        org.joda.time.LocalDate localDate25 = property24.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate28.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long34 = dateTimeZone32.previousTransition((long) (-1));
        long long38 = dateTimeZone32.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str41 = dateTimeZone32.getShortName((long) '#', locale40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime44 = dateTime42.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime46 = dateTime44.minusDays(35);
        org.joda.time.DateTime dateTime47 = localDate28.toDateTime((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime49 = dateTime46.withMillisOfSecond((int) (short) 10);
        long long50 = property24.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime49);
        java.util.Locale locale51 = java.util.Locale.ITALY;
        java.util.Locale locale53 = new java.util.Locale("days");
        java.lang.String str54 = locale51.getDisplayCountry(locale53);
        boolean boolean55 = dateTime49.equals((java.lang.Object) locale53);
        org.joda.time.DateTime dateTime57 = dateTime49.minusDays(53658491);
        org.joda.time.chrono.ISOChronology iSOChronology58 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField59 = iSOChronology58.weekyears();
        org.joda.time.DurationField durationField60 = iSOChronology58.minutes();
        org.joda.time.DateTimeField dateTimeField61 = iSOChronology58.era();
        org.joda.time.DateTimeField dateTimeField62 = iSOChronology58.yearOfEra();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology58.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField64 = iSOChronology58.weekyear();
        org.joda.time.DurationField durationField65 = iSOChronology58.months();
        org.joda.time.DateTime dateTime66 = dateTime57.toDateTime((org.joda.time.Chronology) iSOChronology58);
        org.joda.time.LocalTime localTime67 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime57 and dateTime66", (dateTime57.compareTo(dateTime66) == 0) == dateTime57.equals(dateTime66));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(1);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        boolean boolean32 = instant15.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.MutableDateTime mutableDateTime33 = instant15.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant36 = instant15.withDurationAdded(readableDuration34, 16);
        org.joda.time.Instant instant38 = instant36.minus((long) 185);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant36", (dateTime11.compareTo(instant36) == 0) == dateTime11.equals(instant36));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime20.plusSeconds(21);
        org.joda.time.DateTime dateTime26 = dateTime24.withSecondOfMinute((int) (byte) 1);
        org.joda.time.LocalDate localDate27 = dateTime24.toLocalDate();
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField29 = iSOChronology28.weekyears();
        org.joda.time.DateTimeZone dateTimeZone30 = iSOChronology28.getZone();
        org.joda.time.DurationField durationField31 = iSOChronology28.seconds();
        org.joda.time.DurationField durationField32 = iSOChronology28.halfdays();
        org.joda.time.DurationField durationField33 = iSOChronology28.months();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime24.toMutableDateTime((org.joda.time.Chronology) iSOChronology28);
        org.joda.time.DurationField durationField35 = iSOChronology28.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and mutableDateTime34", (dateTime24.compareTo(mutableDateTime34) == 0) == dateTime24.equals(mutableDateTime34));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.year();
        org.joda.time.LocalDate localDate5 = localDate2.withYear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType6.getField((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.DurationField durationField11 = dateTimeField10.getDurationField();
        int int14 = dateTimeField10.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        boolean boolean23 = localDate19.isSupported(durationFieldType22);
        int[] intArray25 = new int[] { (short) 10 };
        int int26 = dateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) localDate19, intArray25);
        java.util.Locale locale28 = null;
        java.lang.String str29 = localDate19.toString("2022", locale28);
        org.joda.time.LocalDate localDate31 = localDate19.withYearOfEra(40);
        int int32 = localDate19.getWeekyear();
        org.joda.time.LocalDate localDate33 = localDate2.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate36 = localDate19.withPeriodAdded(readablePeriod34, 789);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(dateTimeZone38);
        org.joda.time.LocalDate localDate41 = localDate39.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long45 = dateTimeZone43.previousTransition((long) (-1));
        long long49 = dateTimeZone43.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = dateTimeZone43.getShortName((long) '#', locale51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime55 = dateTime53.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime57 = dateTime55.minusDays(35);
        org.joda.time.DateTime dateTime58 = localDate39.toDateTime((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime.Property property59 = dateTime57.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology60 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField61 = iSOChronology60.weekyears();
        org.joda.time.DurationField durationField62 = iSOChronology60.halfdays();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology60.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField64 = iSOChronology60.dayOfYear();
        org.joda.time.DateTime dateTime65 = dateTime57.toDateTime((org.joda.time.Chronology) iSOChronology60);
        org.joda.time.DateTime dateTime66 = localDate36.toDateTime((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate(dateTimeZone68);
        org.joda.time.LocalDate localDate71 = localDate69.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long75 = dateTimeZone73.previousTransition((long) (-1));
        long long79 = dateTimeZone73.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale81 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str82 = dateTimeZone73.getShortName((long) '#', locale81);
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime(dateTimeZone73);
        org.joda.time.DateTime dateTime85 = dateTime83.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime87 = dateTime85.minusDays(35);
        org.joda.time.DateTime dateTime88 = localDate69.toDateTime((org.joda.time.ReadableInstant) dateTime87);
        org.joda.time.LocalDate localDate90 = localDate69.withYearOfEra(15);
        org.joda.time.LocalDate localDate92 = localDate90.minusYears(11);
        boolean boolean93 = localDate36.isBefore((org.joda.time.ReadablePartial) localDate90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime57 and dateTime65", (dateTime57.compareTo(dateTime65) == 0) == dateTime57.equals(dateTime65));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology0.halfdays();
        org.joda.time.DurationField durationField5 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField6 = iSOChronology0.years();
        long long10 = iSOChronology0.add(0L, 1645052400000L, (int) 'u');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField6", (durationField1.compareTo(durationField6) == 0) == durationField1.equals(durationField6));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(1);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        boolean boolean32 = instant15.isBefore((org.joda.time.ReadableInstant) dateTime28);
        int int33 = dateTime28.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        calendar0.setFirstDayOfWeek(0);
        java.util.TimeZone timeZone4 = calendar0.getTimeZone();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getISO3Language();
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.era();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology7);
        org.joda.time.DurationField durationField10 = iSOChronology7.months();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long17 = dateTimeZone15.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) ' ', dateTimeZone15);
        org.joda.time.LocalTime.Property property19 = localTime18.minuteOfHour();
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.lang.String str21 = property19.getAsText(locale20);
        int int22 = property19.getLeapAmount();
        java.lang.String str23 = property19.getAsShortText();
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str25 = property19.getAsText(locale24);
        java.lang.String str26 = dateTimeField11.getAsText(3, locale24);
        java.lang.String str27 = locale5.getDisplayVariant(locale24);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone4, locale24);
        java.lang.String str29 = timeZone4.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar28", (calendar0.compareTo(calendar28) == 0) == calendar0.equals(calendar28));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant23 = instant16.withDurationAdded((long) 25, 4);
        org.joda.time.Instant instant25 = instant16.withMillis(1L);
        org.joda.time.Chronology chronology26 = instant25.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        int int3 = calendar0.getWeekYear();
        calendar0.set(2021, (-27424194), 30, (int) 'x', 18, 15);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long14 = dateTimeZone12.previousTransition((long) (-1));
        long long18 = dateTimeZone12.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = dateTimeZone12.getShortName((long) '#', locale20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime24 = dateTime22.minusHours((int) (short) 100);
        int int25 = dateTime22.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property26 = dateTime22.monthOfYear();
        org.joda.time.Instant instant27 = dateTime22.toInstant();
        boolean boolean29 = instant27.isEqual((long) 30);
        org.joda.time.DateTime dateTime30 = instant27.toDateTime();
        org.joda.time.Instant instant32 = instant27.withMillis((long) 999);
        org.joda.time.Instant instant35 = instant27.withDurationAdded((long) 77, 657);
        boolean boolean36 = instant27.isBeforeNow();
        boolean boolean37 = calendar0.before((java.lang.Object) boolean36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant27", (dateTime22.compareTo(instant27) == 0) == dateTime22.equals(instant27));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField5 = iSOChronology0.eras();
        java.lang.String str6 = iSOChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField5", Math.signum(durationField1.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField1)));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime11.toMutableDateTime();
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology17.era();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology17);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) ' ', dateTimeZone23);
        java.lang.String str27 = dateTimeZone23.getID();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 32772, dateTimeZone23);
        org.joda.time.Chronology chronology29 = iSOChronology17.withZone(dateTimeZone23);
        org.joda.time.DateTime dateTime30 = mutableDateTime16.toDateTime((org.joda.time.Chronology) iSOChronology17);
        java.lang.String str31 = iSOChronology17.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime30", (dateTime11.compareTo(dateTime30) == 0) == dateTime11.equals(dateTime30));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
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
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMonths(20);
        org.joda.time.DateTime.Property property20 = dateTime19.monthOfYear();
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology21.era();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology21);
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology21.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology21.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology21.secondOfDay();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology21.millisOfSecond();
        java.lang.String str28 = iSOChronology21.toString();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology21.secondOfDay();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now((org.joda.time.Chronology) iSOChronology21);
        org.joda.time.DurationField durationField31 = iSOChronology21.minutes();
        org.joda.time.DateTime dateTime32 = dateTime19.toDateTime((org.joda.time.Chronology) iSOChronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime30", (dateTime17.compareTo(dateTime30) == 0) == dateTime17.equals(dateTime30));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        int int9 = localTime8.getMillisOfSecond();
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday();
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.minus(readableDuration12);
        org.joda.time.Instant instant15 = instant13.withMillis(953L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant13", (dateTime10.compareTo(instant13) == 0) == dateTime10.equals(instant13));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra((int) (byte) 1);
        org.joda.time.LocalDate.Property property5 = localDate4.weekyear();
        org.joda.time.LocalDate localDate7 = localDate4.withWeekOfWeekyear(30);
        org.joda.time.LocalDate localDate9 = localDate4.withDayOfYear(3);
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long14 = dateTimeZone12.previousTransition((long) (-1));
        long long18 = dateTimeZone12.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = dateTimeZone12.getShortName((long) '#', locale20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime24 = dateTime22.minusHours((int) (short) 100);
        int int25 = dateTime22.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property26 = dateTime22.monthOfYear();
        org.joda.time.Instant instant27 = dateTime22.toInstant();
        boolean boolean29 = instant27.isEqual((long) 30);
        boolean boolean30 = instant27.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime31 = instant27.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean33 = instant27.isSupported(dateTimeFieldType32);
        boolean boolean34 = dateTime10.isEqual((org.joda.time.ReadableInstant) instant27);
        java.util.Calendar.Builder builder35 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder39 = builder35.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder42 = builder35.set(2, (int) (byte) -1);
        java.util.Locale locale43 = java.util.Locale.ITALY;
        java.util.Locale locale45 = new java.util.Locale("days");
        java.lang.String str46 = locale43.getDisplayCountry(locale45);
        java.lang.String str47 = locale45.getCountry();
        java.util.Calendar.Builder builder48 = builder35.setLocale(locale45);
        java.util.Calendar calendar49 = dateTime10.toCalendar(locale45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant27", (dateTime22.compareTo(instant27) == 0) == dateTime22.equals(instant27));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime20.plusSeconds(21);
        org.joda.time.DateTime dateTime26 = dateTime20.minusDays((int) (byte) 0);
        org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField28 = iSOChronology27.weekyears();
        org.joda.time.DurationField durationField29 = iSOChronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology27.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology27.dayOfYear();
        org.joda.time.DateTime dateTime32 = dateTime26.toDateTime((org.joda.time.Chronology) iSOChronology27);
        long long36 = iSOChronology27.add((long) 375, (long) 375, 252);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime32", (dateTime20.compareTo(dateTime32) == 0) == dateTime20.equals(dateTime32));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Chronology chronology20 = instant16.getChronology();
        org.joda.time.DateTime dateTime21 = instant16.toDateTimeISO();
        org.joda.time.Instant instant23 = instant16.withMillis((long) 86399999);
        org.joda.time.Instant instant25 = instant16.withMillis((long) 624);
        org.joda.time.MutableDateTime mutableDateTime26 = instant25.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(1);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        boolean boolean32 = instant15.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.MutableDateTime mutableDateTime33 = instant15.toMutableDateTime();
        org.joda.time.Instant instant34 = instant15.toInstant();
        org.joda.time.MutableDateTime mutableDateTime35 = instant34.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant34", (dateTime11.compareTo(instant34) == 0) == dateTime11.equals(instant34));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology17.era();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology17);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology17.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology17.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime16.toMutableDateTime((org.joda.time.Chronology) iSOChronology17);
        org.joda.time.DateTime dateTime24 = dateTime16.minusMinutes(36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and mutableDateTime22", (dateTime16.compareTo(mutableDateTime22) == 0) == dateTime16.equals(mutableDateTime22));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
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
        org.joda.time.LocalDateTime localDateTime21 = dateTime11.toLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime11.plus(readablePeriod22);
        boolean boolean25 = dateTime23.isEqual(3180077L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant16", (dateTime23.compareTo(instant16) == 0) == dateTime23.equals(instant16));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
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
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMonths(20);
        org.joda.time.DateTime.Property property20 = dateTime19.monthOfYear();
        org.joda.time.DurationField durationField21 = property20.getRangeDurationField();
        org.joda.time.ReadableInstant readableInstant22 = null;
        long long23 = property20.getDifferenceAsLong(readableInstant22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField21", (durationField1.compareTo(durationField21) == 0) == durationField1.equals(durationField21));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = iSOChronology0.eras();
        org.joda.time.DurationField durationField6 = iSOChronology0.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField5", Math.signum(durationField1.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField1)));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.year();
        org.joda.time.LocalDate localDate5 = localDate2.withYear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType6.getField((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.DurationField durationField11 = dateTimeField10.getDurationField();
        int int14 = dateTimeField10.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        boolean boolean23 = localDate19.isSupported(durationFieldType22);
        int[] intArray25 = new int[] { (short) 10 };
        int int26 = dateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) localDate19, intArray25);
        java.util.Locale locale28 = null;
        java.lang.String str29 = localDate19.toString("2022", locale28);
        org.joda.time.LocalDate localDate31 = localDate19.withYearOfEra(40);
        int int32 = localDate19.getWeekyear();
        org.joda.time.LocalDate localDate33 = localDate2.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate36 = localDate19.withPeriodAdded(readablePeriod34, 789);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(dateTimeZone38);
        org.joda.time.LocalDate localDate41 = localDate39.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long45 = dateTimeZone43.previousTransition((long) (-1));
        long long49 = dateTimeZone43.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = dateTimeZone43.getShortName((long) '#', locale51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime55 = dateTime53.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime57 = dateTime55.minusDays(35);
        org.joda.time.DateTime dateTime58 = localDate39.toDateTime((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime.Property property59 = dateTime57.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology60 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField61 = iSOChronology60.weekyears();
        org.joda.time.DurationField durationField62 = iSOChronology60.halfdays();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology60.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField64 = iSOChronology60.dayOfYear();
        org.joda.time.DateTime dateTime65 = dateTime57.toDateTime((org.joda.time.Chronology) iSOChronology60);
        org.joda.time.DateTime dateTime66 = localDate36.toDateTime((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.MutableDateTime mutableDateTime67 = dateTime65.toMutableDateTime();
        int int68 = mutableDateTime67.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime57 and dateTime65", (dateTime57.compareTo(dateTime65) == 0) == dateTime57.equals(dateTime65));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        calendar0.setFirstDayOfWeek(0);
        java.util.TimeZone timeZone4 = calendar0.getTimeZone();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getISO3Language();
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.era();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology7);
        org.joda.time.DurationField durationField10 = iSOChronology7.months();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long17 = dateTimeZone15.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) ' ', dateTimeZone15);
        org.joda.time.LocalTime.Property property19 = localTime18.minuteOfHour();
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.lang.String str21 = property19.getAsText(locale20);
        int int22 = property19.getLeapAmount();
        java.lang.String str23 = property19.getAsShortText();
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str25 = property19.getAsText(locale24);
        java.lang.String str26 = dateTimeField11.getAsText(3, locale24);
        java.lang.String str27 = locale5.getDisplayVariant(locale24);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone4, locale24);
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology29.era();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology29.yearOfCentury();
        org.joda.time.DurationField durationField32 = iSOChronology29.months();
        org.joda.time.Chronology chronology33 = iSOChronology29.withUTC();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology29.weekyearOfCentury();
        org.joda.time.DurationField durationField35 = iSOChronology29.days();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long39 = dateTimeZone37.previousTransition((long) (-1));
        long long43 = dateTimeZone37.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale45 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str46 = dateTimeZone37.getShortName((long) '#', locale45);
        java.lang.String str48 = locale45.getExtension('u');
        java.util.Locale locale49 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str50 = locale45.getDisplayName(locale49);
        boolean boolean51 = iSOChronology29.equals((java.lang.Object) locale49);
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(timeZone4, locale49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar28", (calendar0.compareTo(calendar28) == 0) == calendar0.equals(calendar28));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Instant instant21 = instant16.withMillis((long) 999);
        org.joda.time.Instant instant24 = instant16.withDurationAdded((long) 77, 657);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long28 = dateTimeZone26.previousTransition((long) (-1));
        long long32 = dateTimeZone26.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale34 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str35 = dateTimeZone26.getShortName((long) '#', locale34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime38 = dateTime36.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime40 = dateTime38.minusDays(35);
        boolean boolean42 = dateTime40.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime45 = dateTime40.withDurationAdded((long) 11, 16);
        org.joda.time.DateTime.Property property46 = dateTime45.minuteOfDay();
        org.joda.time.DateTime.Property property47 = dateTime45.yearOfCentury();
        org.joda.time.DateTime dateTime48 = property47.getDateTime();
        int int49 = instant16.compareTo((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.MutableDateTime mutableDateTime50 = instant16.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime19", (dateTime11.compareTo(dateTime19) == 0) == dateTime11.equals(dateTime19));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withEra(1);
        org.joda.time.LocalDate.Property property10 = localDate7.dayOfWeek();
        org.joda.time.LocalDate localDate11 = property10.getLocalDate();
        int int12 = localDate11.size();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long21 = dateTimeZone19.previousTransition((long) (-1));
        long long25 = dateTimeZone19.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str28 = dateTimeZone19.getShortName((long) '#', locale27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime31 = dateTime29.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime33 = dateTime31.minusDays(35);
        org.joda.time.DateTime dateTime34 = localDate15.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.LocalDate localDate36 = localDate15.withYearOfEra(15);
        org.joda.time.LocalDate.Property property37 = localDate36.yearOfEra();
        org.joda.time.LocalDate localDate38 = property37.roundHalfEvenCopy();
        boolean boolean39 = localDate11.isAfter((org.joda.time.ReadablePartial) localDate38);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(dateTimeZone41);
        org.joda.time.LocalDate localDate44 = localDate42.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate46 = localDate44.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property47 = localDate44.weekyear();
        org.joda.time.LocalDate localDate48 = property47.roundFloorCopy();
        org.joda.time.LocalDate localDate49 = property47.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate50 = property47.roundHalfCeilingCopy();
        org.joda.time.LocalDate.Property property51 = localDate50.yearOfCentury();
        int[] intArray52 = localDate50.getValues();
        iSOChronology0.validate((org.joda.time.ReadablePartial) localDate11, intArray52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime29", (dateTime2.compareTo(dateTime29) == 0) == dateTime2.equals(dateTime29));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        int int3 = calendar2.getWeeksInWeekYear();
        long long4 = calendar2.getTimeInMillis();
        calendar2.setMinimalDaysInFirstWeek(7);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone8 = calendar7.getTimeZone();
        calendar7.setFirstDayOfWeek(0);
        java.util.TimeZone timeZone11 = calendar7.getTimeZone();
        calendar2.setTimeZone(timeZone11);
        java.lang.String str13 = timeZone11.getDisplayName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar7", (calendar2.compareTo(calendar7) == 0) == calendar2.equals(calendar7));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.Chronology chronology7 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField9 = iSOChronology0.days();
        org.joda.time.DurationField durationField10 = iSOChronology0.years();
        org.joda.time.DurationField durationField11 = iSOChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField10", (durationField1.compareTo(durationField10) == 0) == durationField1.equals(durationField10));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withEra(1);
        int int10 = localDate4.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean13 = dateTimeZone11.isStandardOffset((long) 0);
        org.joda.time.Interval interval14 = localDate4.toInterval(dateTimeZone11);
        org.joda.time.LocalDate.Property property15 = localDate4.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long24 = dateTimeZone22.previousTransition((long) (-1));
        long long28 = dateTimeZone22.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = dateTimeZone22.getShortName((long) '#', locale30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime34 = dateTime32.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime36 = dateTime34.minusDays(35);
        org.joda.time.DateTime dateTime37 = localDate18.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        boolean boolean39 = dateTime37.isAfter(1645750800000L);
        org.joda.time.YearMonthDay yearMonthDay40 = dateTime37.toYearMonthDay();
        int int41 = dateTime37.getYearOfCentury();
        org.joda.time.DateTime.Property property42 = dateTime37.secondOfDay();
        java.util.Locale locale43 = java.util.Locale.TRADITIONAL_CHINESE;
        int int44 = property42.getMaximumTextLength(locale43);
        java.lang.String str45 = property42.getName();
        org.joda.time.DateTime dateTime46 = property42.getDateTime();
        int int47 = property15.getDifference((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long51 = dateTimeZone49.previousTransition((long) (-1));
        long long55 = dateTimeZone49.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale57 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str58 = dateTimeZone49.getShortName((long) '#', locale57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(dateTimeZone49);
        org.joda.time.DateTime dateTime61 = dateTime59.minusHours((int) (short) 100);
        int int62 = dateTime59.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property63 = dateTime59.monthOfYear();
        org.joda.time.Instant instant64 = dateTime59.toInstant();
        boolean boolean66 = instant64.isEqual((long) 30);
        boolean boolean67 = instant64.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime68 = instant64.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean70 = instant64.isSupported(dateTimeFieldType69);
        boolean boolean71 = dateTime46.isAfter((org.joda.time.ReadableInstant) instant64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and mutableDateTime68", (dateTime32.compareTo(mutableDateTime68) == 0) == dateTime32.equals(mutableDateTime68));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant22 = instant16.minus((long) 45);
        org.joda.time.MutableDateTime mutableDateTime23 = instant16.toMutableDateTimeISO();
        boolean boolean25 = instant16.isAfter((long) 580);
        org.joda.time.DateTime dateTime26 = instant16.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant16.plus(readableDuration27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime19", (dateTime11.compareTo(dateTime19) == 0) == dateTime11.equals(dateTime19));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
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
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate25.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long31 = dateTimeZone29.previousTransition((long) (-1));
        long long35 = dateTimeZone29.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale37 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str38 = dateTimeZone29.getShortName((long) '#', locale37);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime41 = dateTime39.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime43 = dateTime41.minusDays(35);
        org.joda.time.DateTime dateTime44 = localDate25.toDateTime((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime.Property property45 = dateTime43.dayOfMonth();
        org.joda.time.DateTime dateTime47 = dateTime43.plusSeconds(21);
        org.joda.time.DateTime dateTime49 = dateTime47.withSecondOfMinute((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime51 = dateTime49.plus(readablePeriod50);
        org.joda.time.Chronology chronology52 = dateTime51.getChronology();
        org.joda.time.Instant instant53 = dateTime51.toInstant();
        boolean boolean54 = instant22.isBefore((org.joda.time.ReadableInstant) dateTime51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime51 and instant53", (dateTime51.compareTo(instant53) == 0) == dateTime51.equals(instant53));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
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
        org.joda.time.LocalDateTime localDateTime21 = dateTime11.toLocalDateTime();
        int int22 = dateTime11.getYearOfCentury();
        org.joda.time.DateTime.Property property23 = dateTime11.minuteOfDay();
        org.joda.time.DateTime dateTime24 = property23.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
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
        int int23 = dateTime11.getMonthOfYear();
        org.joda.time.Instant instant24 = dateTime11.toInstant();
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology25.era();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology25);
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology25.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology25.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology25.secondOfDay();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology25.millisOfSecond();
        java.lang.String str32 = iSOChronology25.toString();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology25.secondOfDay();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now((org.joda.time.Chronology) iSOChronology25);
        org.joda.time.DateTime dateTime36 = dateTime34.minus((long) 130);
        boolean boolean37 = instant24.isBefore((org.joda.time.ReadableInstant) dateTime34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime20.plusSeconds(21);
        org.joda.time.DateTime dateTime26 = dateTime24.withSecondOfMinute((int) (byte) 1);
        org.joda.time.LocalDate localDate27 = dateTime24.toLocalDate();
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField29 = iSOChronology28.weekyears();
        org.joda.time.DateTimeZone dateTimeZone30 = iSOChronology28.getZone();
        org.joda.time.DurationField durationField31 = iSOChronology28.seconds();
        org.joda.time.DurationField durationField32 = iSOChronology28.halfdays();
        org.joda.time.DurationField durationField33 = iSOChronology28.months();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime24.toMutableDateTime((org.joda.time.Chronology) iSOChronology28);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology36.weekyearOfCentury();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (short) 0, (org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean42 = dateTimeZone40.isStandardOffset((long) 0);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long46 = dateTimeZone40.getMillisKeepLocal(dateTimeZone44, (-1947974400000L));
        org.joda.time.Chronology chronology47 = iSOChronology36.withZone(dateTimeZone44);
        java.lang.String str49 = dateTimeZone44.getNameKey(5317346412000L);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(dateTimeZone44);
        org.joda.time.Chronology chronology51 = iSOChronology28.withZone(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime50", (dateTime16.compareTo(dateTime50) == 0) == dateTime16.equals(dateTime50));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant22 = instant16.minus((long) 45);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant16.plus(readableDuration23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Instant instant27 = instant16.withDurationAdded(readableDuration25, 59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime19", (dateTime11.compareTo(dateTime19) == 0) == dateTime11.equals(dateTime19));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = iSOChronology0.eras();
        org.joda.time.DurationField durationField6 = iSOChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField5", Math.signum(durationField1.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField1)));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant22 = instant16.minus((long) 59);
        org.joda.time.MutableDateTime mutableDateTime23 = instant16.toMutableDateTime();
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology24.era();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology24);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology24.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology24.dayOfWeek();
        org.joda.time.DurationField durationField29 = iSOChronology24.weeks();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology24.millisOfDay();
        org.joda.time.DurationField durationField31 = iSOChronology24.eras();
        org.joda.time.DateTime dateTime32 = instant16.toDateTime((org.joda.time.Chronology) iSOChronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime19", (dateTime11.compareTo(dateTime19) == 0) == dateTime11.equals(dateTime19));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.Instant instant20 = instant16.toInstant();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant23 = instant20.withDurationAdded(readableDuration21, 42970913);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant23", (dateTime11.compareTo(instant23) == 0) == dateTime11.equals(instant23));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DurationField durationField4 = iSOChronology0.eras();
        org.joda.time.DurationField durationField5 = iSOChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField4", Math.signum(durationField3.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField3)));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.hours();
        org.joda.time.DurationField durationField9 = iSOChronology0.millis();
        org.joda.time.DurationField durationField10 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField2", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
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
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        org.joda.time.DateTime.Property property23 = dateTime21.millisOfDay();
        org.joda.time.DateTime dateTime25 = dateTime21.withYearOfCentury(7);
        org.joda.time.DateTime dateTime27 = dateTime25.withMinuteOfHour(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant22", (dateTime21.compareTo(instant22) == 0) == dateTime21.equals(instant22));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property10 = localDate7.weekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = localDate7.toString(dateTimeFormatter11);
        long long14 = iSOChronology0.set((org.joda.time.ReadablePartial) localDate7, (long) 349200000);
        org.joda.time.DurationField durationField15 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField16 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField17 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField1, and durationField15", !(durationField17.compareTo(durationField1) == 0) || (Math.signum(durationField17.compareTo(durationField15)) == Math.signum(durationField1.compareTo(durationField15))));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
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
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime11.minus(readablePeriod21);
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology23.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology23.era();
        java.lang.String str30 = iSOChronology23.toString();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology23.dayOfMonth();
        org.joda.time.DateTime dateTime32 = dateTime11.toDateTime((org.joda.time.Chronology) iSOChronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime11", (instant16.compareTo(dateTime11) == 0) == instant16.equals(dateTime11));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
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
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant19 = instant16.withDurationAdded(readableDuration17, 14);
        org.joda.time.MutableDateTime mutableDateTime20 = instant16.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.months();
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.era();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfSecond();
        java.lang.String str8 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.halfdayOfDay();
        boolean boolean10 = durationFieldType0.isSupported((org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DurationField durationField11 = iSOChronology1.eras();
        org.joda.time.DurationField durationField12 = iSOChronology1.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField12, and durationField11", !(durationField11.compareTo(durationField12) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField12.compareTo(durationField11))));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        int int4 = calendar0.getActualMinimum(0);
        calendar0.set(0, (-27424193), 918, 918, 25);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.chrono.ISOChronology iSOChronology12 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = iSOChronology12.weekyears();
        org.joda.time.DateTimeZone dateTimeZone14 = iSOChronology12.getZone();
        org.joda.time.DurationField durationField15 = iSOChronology12.seconds();
        org.joda.time.DurationField durationField16 = iSOChronology12.halfdays();
        org.joda.time.DurationField durationField17 = iSOChronology12.months();
        boolean boolean18 = calendar0.after((java.lang.Object) iSOChronology12);
        org.joda.time.DurationField durationField19 = iSOChronology12.months();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology12.secondOfDay();
        org.joda.time.DurationField durationField21 = iSOChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField13, and durationField15", !(durationField21.compareTo(durationField13) == 0) || (Math.signum(durationField21.compareTo(durationField15)) == Math.signum(durationField13.compareTo(durationField15))));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology17.era();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology17);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology17.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology17.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime16.toMutableDateTime((org.joda.time.Chronology) iSOChronology17);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology17.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime22", (dateTime11.compareTo(mutableDateTime22) == 0) == dateTime11.equals(mutableDateTime22));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withEra(1);
        int int10 = localDate4.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean13 = dateTimeZone11.isStandardOffset((long) 0);
        org.joda.time.Interval interval14 = localDate4.toInterval(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = localDate4.toDateMidnight();
        org.joda.time.Instant instant16 = new org.joda.time.Instant((java.lang.Object) dateMidnight15);
        org.joda.time.Instant instant18 = instant16.minus(53691560L);
        org.joda.time.DateTime dateTime19 = instant16.toDateTimeISO();
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology20.era();
        int int23 = dateTimeField21.getLeapAmount((long) 10);
        int int24 = dateTime19.get(dateTimeField21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight15 and instant16", (dateMidnight15.compareTo(instant16) == 0) == dateMidnight15.equals(instant16));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField2 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.hourOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField6 = iSOChronology1.months();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 12, (org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField2, and durationField5", !(durationField8.compareTo(durationField2) == 0) || (Math.signum(durationField8.compareTo(durationField5)) == Math.signum(durationField2.compareTo(durationField5))));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField5 = iSOChronology0.eras();
        long long9 = iSOChronology0.add(59L, (long) 42941140, 18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property14 = dateTime11.weekyear();
        org.joda.time.DateTime dateTime16 = property14.addToCopy((long) 407);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.minusHours((int) (short) 100);
        int int31 = dateTime28.getWeekOfWeekyear();
        org.joda.time.Instant instant32 = dateTime28.toInstant();
        org.joda.time.MutableDateTime mutableDateTime33 = instant32.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long37 = dateTimeZone35.previousTransition((long) (-1));
        long long41 = dateTimeZone35.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale43 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str44 = dateTimeZone35.getShortName((long) '#', locale43);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone35);
        org.joda.time.DateTime dateTime47 = dateTime45.withWeekyear(1);
        org.joda.time.Chronology chronology48 = dateTime45.getChronology();
        boolean boolean49 = instant32.isBefore((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.MutableDateTime mutableDateTime50 = instant32.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Instant instant53 = instant32.withDurationAdded(readableDuration51, 16);
        boolean boolean54 = dateTime16.isEqual((org.joda.time.ReadableInstant) instant32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant32", (dateTime11.compareTo(instant32) == 0) == dateTime11.equals(instant32));
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField5", Math.signum(durationField1.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField1)));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.Chronology chronology7 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField9 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField1, and durationField2", !(durationField9.compareTo(durationField1) == 0) || (Math.signum(durationField9.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.era();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology16.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology16.millisOfSecond();
        java.lang.String str23 = iSOChronology16.toString();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology16.halfdayOfDay();
        org.joda.time.DateTime dateTime25 = dateTime11.toDateTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now((org.joda.time.Chronology) iSOChronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime25", (dateTime11.compareTo(dateTime25) == 0) == dateTime11.equals(dateTime25));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.weekyearOfCentury();
        int int40 = dateTime35.get(dateTimeField39);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury(45);
        org.joda.time.DateTime dateTime44 = dateTime35.minusDays(10);
        boolean boolean45 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Instant instant48 = instant16.withDurationAdded(readableDuration46, 1439);
        java.lang.String str49 = instant16.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
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
        org.joda.time.DateTime dateTime17 = property15.roundHalfEvenCopy();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.plus(readableDuration18);
        org.joda.time.DateTime.Property property20 = dateTime17.yearOfCentury();
        java.util.Locale locale22 = java.util.Locale.JAPAN;
        java.lang.String str23 = locale22.getScript();
        java.util.Locale locale24 = java.util.Locale.TAIWAN;
        java.lang.String str25 = locale22.getDisplayVariant(locale24);
        java.lang.String str26 = locale24.getDisplayCountry();
        org.joda.time.DateTime dateTime27 = property20.setCopy("20", locale24);
        org.joda.time.DateTime dateTime28 = property20.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType29.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology31 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField32 = iSOChronology31.weekyears();
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType29.getField((org.joda.time.Chronology) iSOChronology31);
        org.joda.time.DurationField durationField34 = iSOChronology31.years();
        org.joda.time.DateTime dateTime35 = dateTime28.toDateTime((org.joda.time.Chronology) iSOChronology31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField32 and durationField34", (durationField32.compareTo(durationField34) == 0) == durationField32.equals(durationField34));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.weekyearOfCentury();
        int int40 = dateTime35.get(dateTimeField39);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury(45);
        org.joda.time.DateTime dateTime44 = dateTime35.minusDays(10);
        boolean boolean45 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Chronology chronology46 = instant16.getChronology();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Instant instant48 = instant16.plus(readableDuration47);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long52 = dateTimeZone50.previousTransition((long) (-1));
        long long56 = dateTimeZone50.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale58 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str59 = dateTimeZone50.getShortName((long) '#', locale58);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime62 = dateTime60.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime64 = dateTime62.minusDays(35);
        boolean boolean66 = dateTime64.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime69 = dateTime64.withDurationAdded((long) 11, 16);
        org.joda.time.DateTime.Property property70 = dateTime69.minuteOfDay();
        org.joda.time.DateTime dateTime71 = property70.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime72 = dateTime71.toDateTime();
        org.joda.time.DateTime.Property property73 = dateTime71.minuteOfHour();
        int int74 = dateTime71.getYear();
        org.joda.time.DateTime dateTime76 = dateTime71.withWeekOfWeekyear(6);
        org.joda.time.MutableDateTime mutableDateTime77 = dateTime76.toMutableDateTimeISO();
        boolean boolean78 = instant16.isBefore((org.joda.time.ReadableInstant) mutableDateTime77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
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
        org.joda.time.Instant instant19 = instant16.withDurationAdded((long) 643, 1970);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((long) 2022, 12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
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
        int int11 = localDateTime6.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.plusMonths(16);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusSeconds(45);
        int int16 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime.Property property17 = localDateTime13.year();
        org.joda.time.DurationField durationField18 = property17.getDurationField();
        org.joda.time.LocalDateTime localDateTime20 = property17.addWrapFieldToCopy(42884);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField18", (durationField1.compareTo(durationField18) == 0) == durationField1.equals(durationField18));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
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
        org.joda.time.LocalDateTime localDateTime21 = dateTime11.toLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime11.plus(readablePeriod22);
        boolean boolean25 = dateTime23.isAfter((long) 998);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant16", (dateTime23.compareTo(instant16) == 0) == dateTime23.equals(instant16));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.millis();
        org.joda.time.DurationField durationField4 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField4", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField4)) == Math.signum(durationField3.compareTo(durationField4))));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DurationField durationField2 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = iSOChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField5, and durationField2", !(durationField2.compareTo(durationField5) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField5.compareTo(durationField2))));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long5 = dateTimeZone3.previousTransition((long) (-1));
        long long9 = dateTimeZone3.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = dateTimeZone3.getShortName((long) '#', locale11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime15 = dateTime13.minusHours((int) (short) 100);
        int int16 = dateTime13.getWeekOfWeekyear();
        org.joda.time.Instant instant17 = dateTime13.toInstant();
        int int18 = dateTime13.getMinuteOfDay();
        int int19 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime dateTime20 = localTime1.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long24 = dateTimeZone22.previousTransition((long) (-1));
        long long28 = dateTimeZone22.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = dateTimeZone22.getShortName((long) '#', locale30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime34 = dateTime32.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime36 = dateTime34.minusDays(35);
        boolean boolean38 = dateTime36.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime41 = dateTime36.withDurationAdded((long) 11, 16);
        org.joda.time.DateTime.Property property42 = dateTime41.minuteOfDay();
        org.joda.time.DateTime dateTime43 = property42.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone44 = dateTime43.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology45 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField46 = iSOChronology45.weekyears();
        org.joda.time.DateTimeField dateTimeField47 = iSOChronology45.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField48 = iSOChronology45.hourOfDay();
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology45);
        long long53 = iSOChronology45.add((long) 100, (long) 15, (int) '4');
        org.joda.time.DateTimeField dateTimeField54 = iSOChronology45.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        long long58 = iSOChronology45.add(readablePeriod55, 55080040L, 789);
        org.joda.time.DurationField durationField59 = iSOChronology45.weeks();
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime43.toMutableDateTime((org.joda.time.Chronology) iSOChronology45);
        org.joda.time.DateTime dateTime61 = localTime1.toDateTime((org.joda.time.ReadableInstant) dateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant17", (dateTime13.compareTo(instant17) == 0) == dateTime13.equals(instant17));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property14 = dateTime11.weekyear();
        int int15 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long19 = dateTimeZone17.previousTransition((long) (-1));
        long long23 = dateTimeZone17.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = dateTimeZone17.getShortName((long) '#', locale25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.withEra(1);
        int int38 = localDate32.compareTo((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean41 = dateTimeZone39.isStandardOffset((long) 0);
        org.joda.time.Interval interval42 = localDate32.toInterval(dateTimeZone39);
        boolean boolean43 = dateTime27.equals((java.lang.Object) dateTimeZone39);
        int int44 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Instant instant45 = dateTime27.toInstant();
        org.joda.time.DateTime dateTime46 = dateTime27.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant45", (dateTime11.compareTo(instant45) == 0) == dateTime11.equals(instant45));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
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
        int int22 = dateTime20.getDayOfWeek();
        org.joda.time.DateTime dateTime24 = dateTime20.withMillisOfSecond(100);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTime dateTime27 = dateTime24.plusMonths(25);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long36 = dateTimeZone34.previousTransition((long) (-1));
        long long40 = dateTimeZone34.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale42 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str43 = dateTimeZone34.getShortName((long) '#', locale42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone34);
        org.joda.time.DateTime dateTime46 = dateTime44.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime48 = dateTime46.minusDays(35);
        org.joda.time.DateTime dateTime49 = localDate30.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Instant instant50 = new org.joda.time.Instant((java.lang.Object) dateTime49);
        org.joda.time.DateTime dateTime52 = dateTime49.minusMonths((int) 'x');
        org.joda.time.DateTime.Property property53 = dateTime49.dayOfYear();
        boolean boolean54 = dateTime27.isBefore((org.joda.time.ReadableInstant) dateTime49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant50", (dateTime21.compareTo(instant50) == 0) == dateTime21.equals(instant50));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        long long19 = instant16.getMillis();
        org.joda.time.Instant instant20 = instant16.toInstant();
        org.joda.time.Instant instant22 = instant20.withMillis((-113486044348000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant20", (dateTime11.compareTo(instant20) == 0) == dateTime11.equals(instant20));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.era();
        org.joda.time.DurationField durationField5 = iSOChronology0.hours();
        org.joda.time.DurationField durationField6 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField2", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) (short) 10);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone4 = calendar3.getTimeZone();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone6 = calendar5.getTimeZone();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone6);
        boolean boolean8 = timeZone4.hasSameRules(timeZone6);
        java.util.Calendar.Builder builder9 = builder2.setTimeZone(timeZone4);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate16 = localDate14.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property17 = localDate14.weekyear();
        org.joda.time.LocalDate localDate18 = property17.roundFloorCopy();
        org.joda.time.LocalDate localDate19 = property17.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField21 = localDate19.getField((int) (byte) 0);
        int int23 = dateTimeField21.getLeapAmount((long) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate30 = localDate28.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property31 = localDate28.weekyear();
        org.joda.time.LocalDate localDate32 = property31.roundFloorCopy();
        org.joda.time.LocalDate localDate34 = property31.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate36 = localDate34.minus(readablePeriod35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDate localDate38 = localDate34.minus(readablePeriod37);
        java.util.Locale locale40 = java.util.Locale.JAPAN;
        java.lang.String str41 = locale40.getScript();
        java.util.Locale locale42 = java.util.Locale.TAIWAN;
        java.lang.String str43 = locale40.getDisplayVariant(locale42);
        java.lang.String str44 = locale40.toLanguageTag();
        java.lang.String str45 = dateTimeField21.getAsText((org.joda.time.ReadablePartial) localDate34, (int) (short) -1, locale40);
        java.util.Calendar.Builder builder46 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder50 = builder46.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder53 = builder46.set(2, (int) (byte) -1);
        java.util.Locale locale54 = java.util.Locale.ITALY;
        java.util.Locale locale56 = new java.util.Locale("days");
        java.lang.String str57 = locale54.getDisplayCountry(locale56);
        java.lang.String str58 = locale56.getCountry();
        java.util.Calendar.Builder builder59 = builder46.setLocale(locale56);
        boolean boolean60 = locale56.hasExtensions();
        java.lang.String str61 = locale40.getDisplayLanguage(locale56);
        java.util.Calendar.Builder builder62 = builder9.setLocale(locale56);
        java.util.Calendar.Builder builder63 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder67 = builder63.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder70 = builder63.set(2, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long75 = dateTimeZone73.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime76 = new org.joda.time.LocalTime((long) ' ', dateTimeZone73);
        org.joda.time.LocalTime.Property property77 = localTime76.minuteOfHour();
        java.util.Locale locale78 = java.util.Locale.ITALY;
        java.lang.String str79 = property77.getAsText(locale78);
        java.util.Calendar.Builder builder80 = builder63.setLocale(locale78);
        java.util.Calendar calendar81 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone82 = calendar81.getTimeZone();
        java.util.Calendar calendar83 = java.util.Calendar.getInstance(timeZone82);
        int int84 = timeZone82.getRawOffset();
        java.util.Calendar.Builder builder85 = builder80.setTimeZone(timeZone82);
        timeZone82.setID("DateTimeField[halfdayOfDay]");
        java.util.Calendar.Builder builder88 = builder9.setTimeZone(timeZone82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar81", (calendar3.compareTo(calendar81) == 0) == calendar3.equals(calendar81));
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate22 = localDate20.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property23 = localDate20.weekyear();
        java.lang.String str24 = property23.getAsString();
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField26 = iSOChronology25.weekyears();
        org.joda.time.DateTimeZone dateTimeZone27 = iSOChronology25.getZone();
        boolean boolean28 = property23.equals((java.lang.Object) iSOChronology25);
        org.joda.time.DateTime dateTime29 = dateTime13.toDateTime((org.joda.time.Chronology) iSOChronology25);
        org.joda.time.DateTimeZone dateTimeZone30 = iSOChronology25.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime29", (dateTime13.compareTo(dateTime29) == 0) == dateTime13.equals(dateTime29));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
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
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury(45);
        org.joda.time.DateTime dateTime24 = dateTime15.minusDays(10);
        org.joda.time.DateTime dateTime26 = dateTime15.withYear(32772);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime28 = dateTime15.minus(readablePeriod27);
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology29.era();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.DurationField durationField32 = iSOChronology29.months();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology29.weekyear();
        org.joda.time.DurationField durationField34 = iSOChronology29.halfdays();
        org.joda.time.DateTimeZone dateTimeZone35 = iSOChronology29.getZone();
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime15.toMutableDateTime(dateTimeZone35);
        int int38 = dateTimeZone35.getOffsetFromLocal((long) 53688639);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and mutableDateTime36", (dateTime15.compareTo(mutableDateTime36) == 0) == dateTime15.equals(mutableDateTime36));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
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
        org.joda.time.Instant instant22 = new org.joda.time.Instant((java.lang.Object) dateTime21);
        org.joda.time.DateTime dateTime24 = dateTime21.minusMonths((int) 'x');
        org.joda.time.DateTime.Property property25 = dateTime24.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant22", (dateTime21.compareTo(instant22) == 0) == dateTime21.equals(instant22));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime20 = instant16.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean22 = instant16.isSupported(dateTimeFieldType21);
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.monthOfYear();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology23.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology23.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime30 = instant16.toMutableDateTime((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.Instant instant32 = instant16.minus((long) 15132824);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime30", (dateTime11.compareTo(mutableDateTime30) == 0) == dateTime11.equals(mutableDateTime30));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.weekyear();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField8 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField8", (durationField1.compareTo(durationField8) == 0) == durationField1.equals(durationField8));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfMonth();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        long long7 = durationField4.subtract(10L, 30);
        long long10 = durationField4.subtract((long) 53745097, 741);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours(12);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology13.eras();
        int int15 = durationField4.compareTo(durationField14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField1, and durationField2", !(durationField14.compareTo(durationField1) == 0) || (Math.signum(durationField14.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField25 = iSOChronology24.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType22.getField((org.joda.time.Chronology) iSOChronology24);
        org.joda.time.DurationField durationField27 = dateTimeField26.getDurationField();
        org.joda.time.DurationFieldType durationFieldType28 = durationField27.getType();
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField30 = iSOChronology29.weekyears();
        org.joda.time.DateTimeZone dateTimeZone31 = iSOChronology29.getZone();
        org.joda.time.DurationField durationField32 = iSOChronology29.seconds();
        org.joda.time.DurationField durationField33 = iSOChronology29.hours();
        boolean boolean34 = durationFieldType28.isSupported((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.DateTime dateTime35 = dateTime21.toDateTime((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.DateTime dateTime37 = dateTime35.minusWeeks((-19008));
        org.joda.time.Chronology chronology38 = dateTime37.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime35", (dateTime21.compareTo(dateTime35) == 0) == dateTime21.equals(dateTime35));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
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
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury(45);
        org.joda.time.DateTime dateTime24 = dateTime15.minusDays(10);
        org.joda.time.DateTime dateTime26 = dateTime15.withYear(32772);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime28 = dateTime15.minus(readablePeriod27);
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology29.era();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.DurationField durationField32 = iSOChronology29.months();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology29.weekyear();
        org.joda.time.DurationField durationField34 = iSOChronology29.halfdays();
        org.joda.time.DateTimeZone dateTimeZone35 = iSOChronology29.getZone();
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime15.toMutableDateTime(dateTimeZone35);
        org.joda.time.DateTime.Property property37 = dateTime15.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and mutableDateTime36", (dateTime15.compareTo(mutableDateTime36) == 0) == dateTime15.equals(mutableDateTime36));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
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
        org.joda.time.DurationField durationField17 = iSOChronology0.years();
        org.joda.time.DurationField durationField18 = iSOChronology0.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField17", (durationField1.compareTo(durationField17) == 0) == durationField1.equals(durationField17));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded(readableDuration14, 14);
        java.util.Locale locale17 = java.util.Locale.JAPAN;
        java.lang.String str18 = locale17.getScript();
        java.util.Calendar calendar19 = dateTime13.toCalendar(locale17);
        org.joda.time.Instant instant20 = dateTime13.toInstant();
        org.joda.time.DateTime.Property property21 = dateTime13.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant20", (dateTime13.compareTo(instant20) == 0) == dateTime13.equals(instant20));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTimeZone dateTimeZone19 = instant16.getZone();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant22 = instant16.withDurationAdded(readableDuration20, (int) '#');
        org.joda.time.Instant instant24 = instant16.plus((long) 40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone2);
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField6 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField4", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField4)) == Math.signum(durationField1.compareTo(durationField4))));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long17 = dateTimeZone15.previousTransition((long) (-1));
        long long21 = dateTimeZone15.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = dateTimeZone15.getShortName((long) '#', locale23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime27 = dateTime25.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime29 = dateTime27.minusDays(35);
        org.joda.time.DateTime dateTime30 = localDate11.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        boolean boolean32 = dateTime30.isAfter(1645750800000L);
        org.joda.time.YearMonthDay yearMonthDay33 = dateTime30.toYearMonthDay();
        int int34 = dateTime30.getYearOfCentury();
        long long35 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Instant instant36 = dateTime30.toInstant();
        org.joda.time.chrono.ISOChronology iSOChronology37 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField38 = iSOChronology37.weekyears();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology37.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology37.hourOfDay();
        org.joda.time.DurationField durationField41 = iSOChronology37.centuries();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long45 = dateTimeZone43.previousTransition((long) (-1));
        long long49 = dateTimeZone43.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = dateTimeZone43.getShortName((long) '#', locale51);
        org.joda.time.Chronology chronology53 = iSOChronology37.withZone(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean56 = dateTimeZone54.isStandardOffset((long) 0);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long60 = dateTimeZone54.getMillisKeepLocal(dateTimeZone58, (-1947974400000L));
        java.lang.Object obj61 = null;
        boolean boolean62 = dateTimeZone54.equals(obj61);
        long long64 = dateTimeZone43.getMillisKeepLocal(dateTimeZone54, (long) (byte) -1);
        org.joda.time.DateTime dateTime65 = instant36.toDateTime(dateTimeZone54);
        org.joda.time.chrono.ISOChronology iSOChronology66 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField67 = iSOChronology66.weekyears();
        org.joda.time.DurationField durationField68 = iSOChronology66.minutes();
        org.joda.time.DateTimeField dateTimeField69 = iSOChronology66.era();
        org.joda.time.DateTimeField dateTimeField70 = iSOChronology66.yearOfEra();
        org.joda.time.DateTimeField dateTimeField71 = iSOChronology66.monthOfYear();
        long long75 = iSOChronology66.add((long) 130, 53669112L, 580);
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long79 = dateTimeZone77.previousTransition((long) (-1));
        long long83 = dateTimeZone77.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale85 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str86 = dateTimeZone77.getShortName((long) '#', locale85);
        org.joda.time.Chronology chronology87 = iSOChronology66.withZone(dateTimeZone77);
        org.joda.time.DateTime dateTime88 = dateTime65.toDateTime(dateTimeZone77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant36", (dateTime30.compareTo(instant36) == 0) == dateTime30.equals(instant36));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        long long19 = instant16.getMillis();
        org.joda.time.Instant instant22 = instant16.withDurationAdded((long) 326, 54);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant22.minus(readableDuration23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.weekyearOfCentury();
        int int40 = dateTime35.get(dateTimeField39);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury(45);
        org.joda.time.DateTime dateTime44 = dateTime35.minusDays(10);
        boolean boolean45 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Chronology chronology46 = instant16.getChronology();
        org.joda.time.Instant instant48 = instant16.withMillis((long) 32772);
        org.joda.time.MutableDateTime mutableDateTime49 = instant16.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime19", (dateTime11.compareTo(dateTime19) == 0) == dateTime11.equals(dateTime19));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime20 = instant16.toMutableDateTime();
        org.joda.time.Instant instant22 = instant16.plus((long) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime20", (dateTime11.compareTo(mutableDateTime20) == 0) == dateTime11.equals(mutableDateTime20));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Instant instant21 = instant16.withMillis((long) 999);
        org.joda.time.Instant instant24 = instant16.withDurationAdded((long) 77, 657);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Instant instant26 = instant16.plus(readableDuration25);
        org.joda.time.DateTime dateTime27 = instant26.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant26", (dateTime11.compareTo(instant26) == 0) == dateTime11.equals(instant26));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.yearOfEra();
        org.joda.time.DurationField durationField10 = dateTimeField9.getDurationField();
        int int12 = dateTimeField9.getMinimumValue(4102444800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField10", (durationField1.compareTo(durationField10) == 0) == durationField1.equals(durationField10));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
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
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfWeek();
        org.joda.time.DateTime dateTime18 = property17.roundHalfFloorCopy();
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
        org.joda.time.DateTime.Property property41 = dateTime39.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology42 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField43 = iSOChronology42.weekyears();
        org.joda.time.DurationField durationField44 = iSOChronology42.halfdays();
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology42.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology42.dayOfYear();
        org.joda.time.DateTime dateTime47 = dateTime39.toDateTime((org.joda.time.Chronology) iSOChronology42);
        org.joda.time.DateTime.Property property48 = dateTime39.dayOfWeek();
        org.joda.time.DateTime.Property property49 = dateTime39.secondOfDay();
        boolean boolean50 = property17.equals((java.lang.Object) dateTime39);
        java.lang.String str51 = property17.getAsText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime47", (dateTime39.compareTo(dateTime47) == 0) == dateTime39.equals(dateTime47));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DurationField durationField4 = iSOChronology0.eras();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = iSOChronology5.weekyears();
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology5.getZone();
        org.joda.time.DurationField durationField8 = iSOChronology5.seconds();
        org.joda.time.DurationField durationField9 = iSOChronology5.halfdays();
        org.joda.time.DurationField durationField10 = iSOChronology5.days();
        int int11 = durationField4.compareTo(durationField10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField3, and durationField6", !(durationField4.compareTo(durationField3) == 0) || (Math.signum(durationField4.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        java.util.Locale locale3 = new java.util.Locale("fra", "3", "10 Feb 1900 04:11:40 GMT");
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale3);
        java.util.TimeZone timeZone5 = calendar4.getTimeZone();
        java.util.TimeZone timeZone6 = calendar4.getTimeZone();
        timeZone6.setID("gioved\354");
        java.util.Calendar.Builder builder9 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder13 = builder9.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder16 = builder9.set(2, (int) (byte) -1);
        java.util.Calendar.Builder builder20 = builder9.setTimeOfDay(22, 24, 12);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone22 = calendar21.getTimeZone();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone22);
        int int24 = timeZone22.getRawOffset();
        java.util.Calendar.Builder builder25 = builder9.setTimeZone(timeZone22);
        boolean boolean26 = timeZone6.hasSameRules(timeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar21", (calendar4.compareTo(calendar21) == 0) == calendar4.equals(calendar21));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime20 = instant16.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime21 = instant16.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime20", (dateTime11.compareTo(mutableDateTime20) == 0) == dateTime11.equals(mutableDateTime20));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property14 = dateTime11.weekyear();
        int int15 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long19 = dateTimeZone17.previousTransition((long) (-1));
        long long23 = dateTimeZone17.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = dateTimeZone17.getShortName((long) '#', locale25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.withEra(1);
        int int38 = localDate32.compareTo((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean41 = dateTimeZone39.isStandardOffset((long) 0);
        org.joda.time.Interval interval42 = localDate32.toInterval(dateTimeZone39);
        boolean boolean43 = dateTime27.equals((java.lang.Object) dateTimeZone39);
        int int44 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Instant instant45 = dateTime27.toInstant();
        org.joda.time.DateTime.Property property46 = dateTime27.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant45", (dateTime11.compareTo(instant45) == 0) == dateTime11.equals(instant45));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime17 = property15.addWrapFieldToCopy((-27424193));
        boolean boolean18 = dateTime17.isAfterNow();
        org.joda.time.DateTime dateTime20 = dateTime17.plusYears((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) ' ', dateTimeZone23);
        org.joda.time.LocalTime.Property property27 = localTime26.minuteOfHour();
        org.joda.time.LocalTime localTime29 = localTime26.withMillisOfSecond((int) (short) 0);
        int int30 = localTime29.getMillisOfSecond();
        org.joda.time.DateTime dateTime31 = localTime29.toDateTimeToday();
        org.joda.time.Instant instant32 = dateTime31.toInstant();
        boolean boolean33 = dateTime20.isAfter((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Instant instant35 = instant32.withMillis(0L);
        org.joda.time.Chronology chronology36 = instant35.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant32", (dateTime31.compareTo(instant32) == 0) == dateTime31.equals(instant32));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.years();
        boolean boolean8 = localDate4.isSupported(durationFieldType7);
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField10 = iSOChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology9.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = iSOChronology9.getZone();
        org.joda.time.DurationField durationField14 = iSOChronology9.eras();
        org.joda.time.DurationField durationField15 = durationFieldType7.getField((org.joda.time.Chronology) iSOChronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField14", Math.signum(durationField10.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField10)));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long17 = dateTimeZone15.previousTransition((long) (-1));
        long long21 = dateTimeZone15.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = dateTimeZone15.getShortName((long) '#', locale23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime27 = dateTime25.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime29 = dateTime27.minusDays(35);
        org.joda.time.DateTime dateTime30 = localDate11.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        boolean boolean32 = dateTime30.isAfter(1645750800000L);
        org.joda.time.YearMonthDay yearMonthDay33 = dateTime30.toYearMonthDay();
        int int34 = dateTime30.getYearOfCentury();
        long long35 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Instant instant36 = dateTime30.toInstant();
        org.joda.time.chrono.ISOChronology iSOChronology37 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField38 = iSOChronology37.weekyears();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology37.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology37.hourOfDay();
        org.joda.time.DurationField durationField41 = iSOChronology37.centuries();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long45 = dateTimeZone43.previousTransition((long) (-1));
        long long49 = dateTimeZone43.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = dateTimeZone43.getShortName((long) '#', locale51);
        org.joda.time.Chronology chronology53 = iSOChronology37.withZone(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean56 = dateTimeZone54.isStandardOffset((long) 0);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long60 = dateTimeZone54.getMillisKeepLocal(dateTimeZone58, (-1947974400000L));
        java.lang.Object obj61 = null;
        boolean boolean62 = dateTimeZone54.equals(obj61);
        long long64 = dateTimeZone43.getMillisKeepLocal(dateTimeZone54, (long) (byte) -1);
        org.joda.time.DateTime dateTime65 = instant36.toDateTime(dateTimeZone54);
        long long67 = dateTimeZone54.convertUTCToLocal((long) 3600032);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant36", (dateTime30.compareTo(instant36) == 0) == dateTime30.equals(instant36));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        int int17 = dateTime16.getCenturyOfEra();
        org.joda.time.DateTime dateTime19 = dateTime16.withWeekOfWeekyear(21);
        org.joda.time.Instant instant20 = dateTime16.toInstant();
        boolean boolean22 = instant20.isEqual((long) (-27424194));
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant20.minus(readableDuration23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Instant instant26 = instant24.plus(readableDuration25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant26", (dateTime11.compareTo(instant26) == 0) == dateTime11.equals(instant26));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField5 = iSOChronology0.months();
        org.joda.time.DurationField durationField6 = iSOChronology0.years();
        java.lang.String str7 = iSOChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField6", (durationField1.compareTo(durationField6) == 0) == durationField1.equals(durationField6));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime20 = instant16.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean22 = instant16.isSupported(dateTimeFieldType21);
        org.joda.time.Chronology chronology23 = instant16.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate22 = localDate20.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property23 = localDate20.weekyear();
        java.lang.String str24 = property23.getAsString();
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField26 = iSOChronology25.weekyears();
        org.joda.time.DateTimeZone dateTimeZone27 = iSOChronology25.getZone();
        boolean boolean28 = property23.equals((java.lang.Object) iSOChronology25);
        org.joda.time.DateTime dateTime29 = dateTime13.toDateTime((org.joda.time.Chronology) iSOChronology25);
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology25.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime29", (dateTime13.compareTo(dateTime29) == 0) == dateTime13.equals(dateTime29));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime20 = dateTime15.withDurationAdded((long) 11, 16);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        org.joda.time.DateTime dateTime22 = property21.roundHalfEvenCopy();
        org.joda.time.YearMonthDay yearMonthDay23 = dateTime22.toYearMonthDay();
        org.joda.time.DateTime dateTime25 = dateTime22.minusSeconds(16);
        org.joda.time.DateTime dateTime27 = dateTime25.plusHours((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.years();
        java.lang.String str29 = durationFieldType28.toString();
        java.lang.String str30 = durationFieldType28.getName();
        org.joda.time.chrono.ISOChronology iSOChronology31 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology31.era();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now((org.joda.time.Chronology) iSOChronology31);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((org.joda.time.Chronology) iSOChronology31);
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology31.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology31.minuteOfDay();
        boolean boolean37 = durationFieldType28.isSupported((org.joda.time.Chronology) iSOChronology31);
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology31.centuryOfEra();
        int int39 = dateTime25.get(dateTimeField38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime33", (dateTime11.compareTo(dateTime33) == 0) == dateTime11.equals(dateTime33));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
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
        org.joda.time.DateTime.Property property17 = dateTime11.dayOfWeek();
        org.joda.time.DurationField durationField18 = property17.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology17.era();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology17);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology17.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology17.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime16.toMutableDateTime((org.joda.time.Chronology) iSOChronology17);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology17.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime22", (dateTime11.compareTo(mutableDateTime22) == 0) == dateTime11.equals(mutableDateTime22));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.weekyearOfCentury();
        int int40 = dateTime35.get(dateTimeField39);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury(45);
        org.joda.time.DateTime dateTime44 = dateTime35.minusDays(10);
        boolean boolean45 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime35);
        boolean boolean47 = instant16.isAfter((long) 741);
        org.joda.time.DateTime dateTime48 = instant16.toDateTime();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.Instant instant50 = instant16.plus(readableDuration49);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long54 = dateTimeZone52.previousTransition((long) (-1));
        long long58 = dateTimeZone52.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale60 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str61 = dateTimeZone52.getShortName((long) '#', locale60);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(dateTimeZone52);
        org.joda.time.DateTime dateTime64 = dateTime62.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime66 = dateTime64.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology67 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField68 = iSOChronology67.era();
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology67);
        org.joda.time.DateTimeField dateTimeField70 = iSOChronology67.weekyearOfCentury();
        int int71 = dateTime66.get(dateTimeField70);
        org.joda.time.DateTime dateTime73 = dateTime66.withYearOfCentury(45);
        org.joda.time.DateTime dateTime75 = dateTime66.minusDays(10);
        org.joda.time.ReadableDuration readableDuration76 = null;
        org.joda.time.DateTime dateTime77 = dateTime66.plus(readableDuration76);
        org.joda.time.DateTime.Property property78 = dateTime77.centuryOfEra();
        boolean boolean79 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        long long19 = instant16.getMillis();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant16.plus(readableDuration20);
        org.joda.time.MutableDateTime mutableDateTime22 = instant16.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        int int2 = localTime1.getMillisOfSecond();
        org.joda.time.LocalTime.Property property3 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property3.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        int int19 = dateTime16.getWeekOfWeekyear();
        org.joda.time.Instant instant20 = dateTime16.toInstant();
        org.joda.time.MutableDateTime mutableDateTime21 = instant20.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        long long29 = dateTimeZone23.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale31 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str32 = dateTimeZone23.getShortName((long) '#', locale31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime35 = dateTime33.withWeekyear(1);
        org.joda.time.Chronology chronology36 = dateTime33.getChronology();
        boolean boolean37 = instant20.isBefore((org.joda.time.ReadableInstant) dateTime33);
        long long38 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant20", (dateTime16.compareTo(instant20) == 0) == dateTime16.equals(instant20));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.weekyearOfCentury();
        int int40 = dateTime35.get(dateTimeField39);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury(45);
        org.joda.time.DateTime dateTime44 = dateTime35.minusDays(10);
        boolean boolean45 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime.Property property46 = dateTime35.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder7 = builder0.set(2, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long12 = dateTimeZone10.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) ' ', dateTimeZone10);
        org.joda.time.LocalTime.Property property14 = localTime13.minuteOfHour();
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.lang.String str16 = property14.getAsText(locale15);
        java.util.Calendar.Builder builder17 = builder0.setLocale(locale15);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone19 = calendar18.getTimeZone();
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone19);
        int int21 = timeZone19.getRawOffset();
        java.util.Calendar.Builder builder22 = builder17.setTimeZone(timeZone19);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone19);
        timeZone19.setID("21 Jan 2022 14:54:23 GMT");
        java.lang.String str26 = timeZone19.getID();
        java.util.Calendar.Builder builder27 = new java.util.Calendar.Builder();
        java.util.Date date34 = new java.util.Date((int) (short) -1, 10, 100, (int) '4', (int) (byte) 10, (int) (byte) 100);
        java.time.Instant instant35 = date34.toInstant();
        java.util.Date date36 = java.util.Date.from(instant35);
        java.util.Calendar.Builder builder37 = builder27.setInstant(date36);
        java.util.Calendar calendar38 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone39 = calendar38.getTimeZone();
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone39);
        java.util.Calendar.Builder builder41 = builder27.setTimeZone(timeZone39);
        boolean boolean42 = timeZone39.observesDaylightTime();
        boolean boolean43 = timeZone39.observesDaylightTime();
        boolean boolean44 = timeZone19.hasSameRules(timeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar38", (calendar18.compareTo(calendar38) == 0) == calendar18.equals(calendar38));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
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
        org.joda.time.DateTime.Property property23 = dateTime21.minuteOfHour();
        org.joda.time.DateTime dateTime25 = property23.addWrapFieldToCopy((int) (short) -1);
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField27 = iSOChronology26.weekyears();
        java.lang.String str28 = iSOChronology26.toString();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime25.toMutableDateTime((org.joda.time.Chronology) iSOChronology26);
        org.joda.time.DurationField durationField30 = iSOChronology26.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and mutableDateTime29", (dateTime25.compareTo(mutableDateTime29) == 0) == dateTime25.equals(mutableDateTime29));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology0.hours();
        org.joda.time.DurationField durationField5 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField1, and durationField3", !(durationField5.compareTo(durationField1) == 0) || (Math.signum(durationField5.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = instant15.toDateTime(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight19 = dateTime18.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DurationField durationField2 = durationFieldType0.getField(chronology1);
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology3.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long11 = dateTimeZone9.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) ' ', dateTimeZone9);
        org.joda.time.LocalTime.Property property13 = localTime12.minuteOfHour();
        java.util.Locale locale14 = java.util.Locale.ITALY;
        java.lang.String str15 = property13.getAsText(locale14);
        int int16 = property13.getLeapAmount();
        java.lang.String str17 = property13.getAsShortText();
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str19 = property13.getAsText(locale18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = property13.getDifference(readableInstant20);
        org.joda.time.LocalTime localTime23 = property13.addCopy((-29990L));
        java.lang.String str24 = localTime23.toString();
        int[] intArray26 = iSOChronology3.get((org.joda.time.ReadablePartial) localTime23, (long) 3);
        org.joda.time.DurationField durationField27 = durationFieldType0.getField((org.joda.time.Chronology) iSOChronology3);
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology28.era();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now((org.joda.time.Chronology) iSOChronology28);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((org.joda.time.Chronology) iSOChronology28);
        org.joda.time.Chronology chronology32 = iSOChronology28.withUTC();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology28.millisOfDay();
        org.joda.time.DurationField durationField34 = durationFieldType0.getField((org.joda.time.Chronology) iSOChronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField34", (durationField2.compareTo(durationField34) == 0) == durationField2.equals(durationField34));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        long long29 = dateTimeZone23.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale31 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str32 = dateTimeZone23.getShortName((long) '#', locale31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime35 = dateTime33.minusHours((int) (short) 100);
        int int36 = dateTime33.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property37 = dateTime33.monthOfYear();
        org.joda.time.Instant instant38 = dateTime33.toInstant();
        boolean boolean40 = instant38.isEqual((long) 30);
        org.joda.time.DateTime dateTime41 = instant38.toDateTime();
        org.joda.time.DateTime dateTime42 = instant38.toDateTimeISO();
        org.joda.time.Instant instant44 = instant38.minus((long) 45);
        boolean boolean45 = dateTime15.equals((java.lang.Object) instant38);
        java.util.Locale locale46 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str47 = locale46.getISO3Language();
        java.util.Set<java.lang.String> strSet48 = locale46.getUnicodeLocaleKeys();
        java.util.Spliterator<java.lang.String> strSpliterator49 = strSet48.spliterator();
        java.util.Locale locale52 = new java.util.Locale("2022-02-25", "+97:00");
        java.util.Set<java.lang.String> strSet53 = locale52.getUnicodeLocaleKeys();
        boolean boolean54 = strSet48.addAll((java.util.Collection<java.lang.String>) strSet53);
        org.joda.time.chrono.ISOChronology iSOChronology55 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField56 = iSOChronology55.weekyears();
        org.joda.time.DurationField durationField57 = iSOChronology55.halfdays();
        org.joda.time.DateTimeField dateTimeField58 = iSOChronology55.monthOfYear();
        org.joda.time.LocalTime localTime59 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology55);
        org.joda.time.DateTimeField dateTimeField60 = iSOChronology55.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField61 = iSOChronology55.clockhourOfHalfday();
        org.joda.time.Chronology chronology62 = iSOChronology55.withUTC();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.dayOfWeek();
        boolean boolean64 = strSet48.remove((java.lang.Object) chronology62);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        long long68 = chronology62.add(readablePeriod65, 98727314565360000L, 53);
        org.joda.time.DateTime dateTime69 = dateTime15.withChronology(chronology62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant38", (dateTime11.compareTo(instant38) == 0) == dateTime11.equals(instant38));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
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
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        org.joda.time.DateTime.Property property23 = dateTime21.millisOfDay();
        org.joda.time.DateTime dateTime25 = dateTime21.withYearOfCentury(7);
        org.joda.time.DateTime.Property property26 = dateTime25.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant22", (dateTime21.compareTo(instant22) == 0) == dateTime21.equals(instant22));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.weekyearOfCentury();
        int int40 = dateTime35.get(dateTimeField39);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury(45);
        org.joda.time.DateTime dateTime44 = dateTime35.minusDays(10);
        boolean boolean45 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime35);
        boolean boolean47 = instant16.isAfter((long) 741);
        org.joda.time.DateTime dateTime48 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long52 = dateTimeZone50.previousTransition((long) (-1));
        long long56 = dateTimeZone50.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale58 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str59 = dateTimeZone50.getShortName((long) '#', locale58);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime62 = dateTime60.minusHours((int) (short) 100);
        int int63 = dateTime60.getWeekOfWeekyear();
        int int64 = dateTime60.getSecondOfMinute();
        org.joda.time.DateTime dateTime66 = dateTime60.plusDays(86399999);
        boolean boolean67 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime.Property property68 = dateTime66.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Instant instant21 = instant16.withMillis((long) 999);
        org.joda.time.Instant instant24 = instant16.withDurationAdded((long) 77, 657);
        org.joda.time.Instant instant25 = instant24.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime20 = instant16.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean22 = instant16.isSupported(dateTimeFieldType21);
        org.joda.time.Chronology chronology23 = instant16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = instant16.toMutableDateTimeISO();
        int int25 = mutableDateTime24.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 2);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long11 = dateTimeZone9.previousTransition((long) (-1));
        long long15 = dateTimeZone9.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale17 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str18 = dateTimeZone9.getShortName((long) '#', locale17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime21 = dateTime19.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime23 = dateTime21.minusDays(35);
        org.joda.time.DateTime dateTime24 = localDate5.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Instant instant25 = new org.joda.time.Instant((java.lang.Object) dateTime24);
        org.joda.time.MutableDateTime mutableDateTime26 = instant25.toMutableDateTimeISO();
        int int27 = dateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant25", (dateTime24.compareTo(instant25) == 0) == dateTime24.equals(instant25));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
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
        int int23 = dateTime11.getMonthOfYear();
        org.joda.time.LocalTime localTime24 = dateTime11.toLocalTime();
        org.joda.time.DateTime dateTime26 = dateTime11.withMillis(657L);
        org.joda.time.DateTime dateTime27 = dateTime11.toDateTimeISO();
        int int28 = dateTime11.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime11", (instant16.compareTo(dateTime11) == 0) == instant16.equals(dateTime11));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant16.minus(readableDuration21);
        org.joda.time.MutableDateTime mutableDateTime23 = instant16.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime20 = instant16.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean22 = instant16.isSupported(dateTimeFieldType21);
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.monthOfYear();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology23.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology23.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime30 = instant16.toMutableDateTime((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.chrono.ISOChronology iSOChronology31 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology31.era();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology31.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology31.secondOfMinute();
        org.joda.time.DurationField durationField35 = iSOChronology31.seconds();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(dateTimeZone37);
        org.joda.time.LocalDate localDate40 = localDate38.withEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDate localDate43 = localDate38.withField(dateTimeFieldType41, 100);
        boolean boolean44 = iSOChronology31.equals((java.lang.Object) dateTimeFieldType41);
        org.joda.time.DurationFieldType durationFieldType45 = dateTimeFieldType41.getRangeDurationType();
        int int46 = mutableDateTime30.get(dateTimeFieldType41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Instant instant21 = instant16.withMillis((long) 999);
        org.joda.time.Instant instant24 = instant16.withDurationAdded((long) 77, 657);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long28 = dateTimeZone26.previousTransition((long) (-1));
        long long32 = dateTimeZone26.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale34 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str35 = dateTimeZone26.getShortName((long) '#', locale34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime38 = dateTime36.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime40 = dateTime38.minusDays(35);
        boolean boolean42 = dateTime40.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime45 = dateTime40.withDurationAdded((long) 11, 16);
        org.joda.time.DateTime.Property property46 = dateTime45.minuteOfDay();
        org.joda.time.DateTime.Property property47 = dateTime45.yearOfCentury();
        org.joda.time.DateTime dateTime48 = property47.getDateTime();
        int int49 = instant16.compareTo((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long53 = dateTimeZone51.previousTransition((long) (-1));
        long long57 = dateTimeZone51.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale59 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str60 = dateTimeZone51.getShortName((long) '#', locale59);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime63 = dateTime61.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime65 = dateTime63.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology66 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField67 = iSOChronology66.era();
        org.joda.time.LocalTime localTime68 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology66);
        org.joda.time.DateTimeField dateTimeField69 = iSOChronology66.weekyearOfCentury();
        int int70 = dateTime65.get(dateTimeField69);
        boolean boolean71 = dateTime48.equals((java.lang.Object) int70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField9 = iSOChronology0.eras();
        org.joda.time.DurationField durationField10 = iSOChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.Instant instant20 = instant16.toInstant();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant23 = instant20.withDurationAdded(readableDuration21, 170);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant23", (dateTime11.compareTo(instant23) == 0) == dateTime11.equals(instant23));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.Chronology chronology7 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField9 = iSOChronology0.days();
        org.joda.time.DurationField durationField10 = iSOChronology0.years();
        org.joda.time.DurationField durationField11 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField10", (durationField1.compareTo(durationField10) == 0) == durationField1.equals(durationField10));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime20 = instant16.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean22 = instant16.isSupported(dateTimeFieldType21);
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.monthOfYear();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology23.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology23.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime30 = instant16.toMutableDateTime((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology23.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime20.plusSeconds(21);
        org.joda.time.DateTime dateTime26 = dateTime24.withSecondOfMinute((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.plus(readablePeriod27);
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.Instant instant30 = dateTime28.toInstant();
        org.joda.time.DateTime dateTime31 = instant30.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long35 = dateTimeZone33.previousTransition((long) (-1));
        long long39 = dateTimeZone33.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale41 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str42 = dateTimeZone33.getShortName((long) '#', locale41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime45 = dateTime43.withWeekyear(1);
        org.joda.time.Chronology chronology46 = dateTime43.getChronology();
        int int47 = dateTime31.compareTo((org.joda.time.ReadableInstant) dateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant30", (dateTime26.compareTo(instant30) == 0) == dateTime26.equals(instant30));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long5 = dateTimeZone3.previousTransition((long) (-1));
        long long9 = dateTimeZone3.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = dateTimeZone3.getShortName((long) '#', locale11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime15 = dateTime13.minusHours((int) (short) 100);
        int int16 = dateTime13.getWeekOfWeekyear();
        org.joda.time.Instant instant17 = dateTime13.toInstant();
        int int18 = dateTime13.getMinuteOfDay();
        int int19 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime dateTime20 = localTime1.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime22 = dateTime20.plusSeconds(32119);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant17", (dateTime13.compareTo(instant17) == 0) == dateTime13.equals(instant17));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfYear();
        org.joda.time.DurationField durationField5 = iSOChronology0.years();
        org.joda.time.DurationField durationField6 = iSOChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField5", (durationField1.compareTo(durationField5) == 0) == durationField1.equals(durationField5));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.era();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology16.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology16.millisOfSecond();
        java.lang.String str23 = iSOChronology16.toString();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology16.halfdayOfDay();
        org.joda.time.DateTime dateTime25 = dateTime11.toDateTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTime dateTime27 = dateTime25.withMillisOfSecond(715);
        org.joda.time.DateTime.Property property28 = dateTime27.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime25", (dateTime11.compareTo(dateTime25) == 0) == dateTime11.equals(dateTime25));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.weekyearOfCentury();
        int int40 = dateTime35.get(dateTimeField39);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury(45);
        org.joda.time.DateTime dateTime44 = dateTime35.minusDays(10);
        boolean boolean45 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Chronology chronology46 = instant16.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
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
        int int23 = dateTime11.getMonthOfYear();
        org.joda.time.Instant instant24 = dateTime11.toInstant();
        java.lang.String str25 = instant24.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
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
        org.joda.time.Instant instant18 = instant16.minus((long) 'u');
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology19.era();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology19);
        org.joda.time.DurationField durationField22 = iSOChronology19.months();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology19.weekyear();
        org.joda.time.DurationField durationField24 = iSOChronology19.halfdays();
        org.joda.time.DateTimeZone dateTimeZone25 = iSOChronology19.getZone();
        org.joda.time.DateTime dateTime26 = instant16.toDateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long5 = dateTimeZone3.previousTransition((long) (-1));
        long long9 = dateTimeZone3.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = dateTimeZone3.getShortName((long) '#', locale11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime15 = dateTime13.minusHours((int) (short) 100);
        int int16 = dateTime13.getWeekOfWeekyear();
        org.joda.time.Instant instant17 = dateTime13.toInstant();
        int int18 = dateTime13.getMinuteOfDay();
        int int19 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime dateTime20 = localTime1.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime21 = localTime1.toDateTimeToday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant17", (dateTime13.compareTo(instant17) == 0) == dateTime13.equals(instant17));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        int int16 = dateTime15.getMillisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime15.withYearOfEra(54);
        org.joda.time.DateTime.Property property19 = dateTime15.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime15.minus(readablePeriod20);
        org.joda.time.DateTime dateTime22 = dateTime21.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone24.previousTransition((long) (-1));
        long long30 = dateTimeZone24.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale32 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str33 = dateTimeZone24.getShortName((long) '#', locale32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime36 = dateTime34.minusHours((int) (short) 100);
        int int37 = dateTime34.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property38 = dateTime34.monthOfYear();
        org.joda.time.DateTime dateTime39 = property38.getDateTime();
        org.joda.time.DateTime.Property property40 = dateTime39.dayOfYear();
        boolean boolean41 = dateTime39.isAfterNow();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.DateTime dateTime43 = dateTime39.minus(readablePeriod42);
        boolean boolean44 = dateTime21.isBefore((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Instant instant45 = dateTime39.toInstant();
        org.joda.time.DateTime dateTime47 = dateTime39.minus((-1642071391548L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant45", (dateTime11.compareTo(instant45) == 0) == dateTime11.equals(instant45));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = iSOChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology2.hourOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField3, and durationField5", !(durationField8.compareTo(durationField3) == 0) || (Math.signum(durationField8.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        int int17 = dateTime16.getCenturyOfEra();
        org.joda.time.DateTime dateTime19 = dateTime16.withWeekOfWeekyear(21);
        org.joda.time.Instant instant20 = dateTime16.toInstant();
        boolean boolean22 = instant20.isEqual((long) (-27424194));
        org.joda.time.Instant instant23 = instant20.toInstant();
        org.joda.time.Instant instant25 = instant23.withMillis((long) 185);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant23", (dateTime11.compareTo(instant23) == 0) == dateTime11.equals(instant23));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.lang.String str8 = property6.getAsText(locale7);
        org.joda.time.LocalTime localTime9 = property6.withMinimumValue();
        org.joda.time.LocalTime localTime10 = property6.withMaximumValue();
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = iSOChronology11.weekyears();
        org.joda.time.DurationField durationField13 = iSOChronology11.minutes();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology11.era();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology11.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology11.weekyear();
        org.joda.time.DurationField durationField18 = iSOChronology11.months();
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = iSOChronology19.weekyears();
        org.joda.time.DateTimeZone dateTimeZone21 = iSOChronology19.getZone();
        long long23 = dateTimeZone21.nextTransition((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long27 = dateTimeZone25.previousTransition((long) (-1));
        long long31 = dateTimeZone25.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale33 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str34 = dateTimeZone25.getShortName((long) '#', locale33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime37 = dateTime35.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime39 = dateTime37.minusDays(35);
        boolean boolean41 = dateTime39.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime44 = dateTime39.withDurationAdded((long) 11, 16);
        org.joda.time.DateTime.Property property45 = dateTime44.minuteOfDay();
        org.joda.time.DateTime dateTime46 = property45.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property47 = dateTime46.dayOfMonth();
        boolean boolean48 = dateTimeZone21.equals((java.lang.Object) dateTime46);
        org.joda.time.Chronology chronology49 = iSOChronology11.withZone(dateTimeZone21);
        org.joda.time.DateTime dateTime50 = localTime10.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long54 = dateTimeZone52.previousTransition((long) (-1));
        long long58 = dateTimeZone52.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale60 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str61 = dateTimeZone52.getShortName((long) '#', locale60);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(dateTimeZone52);
        org.joda.time.DateTime dateTime64 = dateTime62.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime66 = dateTime64.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology67 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField68 = iSOChronology67.era();
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology67);
        org.joda.time.DateTimeField dateTimeField70 = iSOChronology67.weekyearOfCentury();
        int int71 = dateTime66.get(dateTimeField70);
        org.joda.time.DateTime dateTime73 = dateTime66.withYearOfCentury(45);
        org.joda.time.Instant instant74 = dateTime66.toInstant();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long78 = dateTimeZone76.previousTransition((long) (-1));
        long long82 = dateTimeZone76.convertLocalToUTC((long) 'x', true, (long) 10);
        int int84 = dateTimeZone76.getOffset((long) '4');
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime(dateTimeZone76);
        int int87 = dateTimeZone76.getOffset(0L);
        long long89 = dateTimeZone76.convertUTCToLocal((-105235200000L));
        org.joda.time.MutableDateTime mutableDateTime90 = dateTime66.toMutableDateTime(dateTimeZone76);
        int int91 = dateTime50.compareTo((org.joda.time.ReadableInstant) mutableDateTime90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and instant74", (dateTime39.compareTo(instant74) == 0) == dateTime39.equals(instant74));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
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
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury(45);
        org.joda.time.DateTime dateTime24 = dateTime15.minusDays(10);
        org.joda.time.DateTime dateTime26 = dateTime15.withYear(32772);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime28 = dateTime15.minus(readablePeriod27);
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology29.era();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.DurationField durationField32 = iSOChronology29.months();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology29.weekyear();
        org.joda.time.DurationField durationField34 = iSOChronology29.halfdays();
        org.joda.time.DateTimeZone dateTimeZone35 = iSOChronology29.getZone();
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime15.toMutableDateTime(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime15.plusWeeks(301);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and mutableDateTime36", (dateTime15.compareTo(mutableDateTime36) == 0) == dateTime15.equals(mutableDateTime36));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
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
        org.joda.time.DateTime dateTime24 = dateTime11.withYearOfCentury(16);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(dateTimeZone26);
        org.joda.time.LocalDate localDate29 = localDate27.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate31 = localDate29.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(dateTimeZone33);
        org.joda.time.LocalDate localDate36 = localDate34.withEra(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology39 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField40 = iSOChronology39.weekyears();
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType37.getField((org.joda.time.Chronology) iSOChronology39);
        org.joda.time.DurationField durationField42 = iSOChronology39.hours();
        boolean boolean43 = localDate36.equals((java.lang.Object) durationField42);
        boolean boolean44 = localDate31.isBefore((org.joda.time.ReadablePartial) localDate36);
        org.joda.time.DateTime dateTime45 = dateTime11.withFields((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.DateTime dateTime47 = dateTime45.withMillisOfDay(97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        int int15 = dateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime17 = dateTime11.minusMonths((int) (short) 10);
        org.joda.time.YearMonthDay yearMonthDay18 = dateTime17.toYearMonthDay();
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = iSOChronology19.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology19.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology19.hourOfDay();
        org.joda.time.DurationField durationField23 = iSOChronology19.centuries();
        org.joda.time.DurationField durationField24 = iSOChronology19.months();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology19.weekyear();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology19.weekyear();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology19.weekyear();
        org.joda.time.DateTime dateTime28 = dateTime17.withChronology((org.joda.time.Chronology) iSOChronology19);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.DateTime dateTime31 = dateTime17.toDateTime(dateTimeZone30);
        int int32 = dateTime31.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime28", (dateTime17.compareTo(dateTime28) == 0) == dateTime17.equals(dateTime28));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
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
        int int23 = dateTime11.getMonthOfYear();
        org.joda.time.DateTime dateTime25 = dateTime11.plusMonths((int) (short) 100);
        org.joda.time.Instant instant26 = dateTime11.toInstant();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(dateTimeZone31);
        org.joda.time.LocalDate localDate34 = localDate32.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(dateTimeZone36);
        org.joda.time.LocalDate localDate39 = localDate37.withEra(1);
        int int40 = localDate34.compareTo((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.LocalDate localDate42 = localDate34.withCenturyOfEra((int) (byte) 0);
        org.joda.time.LocalDate.Property property43 = localDate42.centuryOfEra();
        org.joda.time.LocalDate localDate44 = property43.roundFloorCopy();
        org.joda.time.LocalDate localDate45 = property43.getLocalDate();
        org.joda.time.LocalDate.Property property46 = localDate45.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long50 = dateTimeZone48.previousTransition((long) (-1));
        long long54 = dateTimeZone48.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale56 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str57 = dateTimeZone48.getShortName((long) '#', locale56);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(dateTimeZone48);
        org.joda.time.DateTime dateTime60 = dateTime58.minusHours((int) (short) 100);
        int int61 = dateTime58.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property62 = dateTime58.monthOfYear();
        org.joda.time.DateTime dateTime63 = property62.withMinimumValue();
        org.joda.time.DateTime dateTime64 = property62.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate((java.lang.Object) dateTime64, dateTimeZone66);
        org.joda.time.DateTime dateTime68 = localDate45.toDateTimeAtMidnight(dateTimeZone66);
        long long70 = dateTimeZone28.getMillisKeepLocal(dateTimeZone66, 15085436803200040L);
        org.joda.time.MutableDateTime mutableDateTime71 = instant26.toMutableDateTime(dateTimeZone66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfHalfday();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = iSOChronology5.weekyears();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = iSOChronology5.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology5.yearOfCentury();
        boolean boolean10 = iSOChronology0.equals((java.lang.Object) iSOChronology5);
        java.lang.String str11 = iSOChronology5.toString();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology5);
        org.joda.time.DurationField durationField13 = iSOChronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField6", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField6)) == Math.signum(durationField3.compareTo(durationField6))));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
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
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant19 = instant16.withDurationAdded(readableDuration17, 14);
        long long20 = instant16.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField4", (durationField1.compareTo(durationField4) == 0) == durationField1.equals(durationField4));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
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
        org.joda.time.Instant instant18 = instant16.minus((long) 'u');
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology19.era();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology19);
        org.joda.time.DurationField durationField22 = iSOChronology19.months();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology19.weekyear();
        org.joda.time.DurationField durationField24 = iSOChronology19.halfdays();
        org.joda.time.DateTimeZone dateTimeZone25 = iSOChronology19.getZone();
        org.joda.time.DateTime dateTime26 = instant16.toDateTime(dateTimeZone25);
        long long29 = dateTimeZone25.adjustOffset((long) 624, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        int int9 = localTime8.getMillisOfSecond();
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday();
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.minus(readableDuration12);
        org.joda.time.Instant instant15 = instant13.minus((-349200000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant13", (dateTime10.compareTo(instant13) == 0) == dateTime10.equals(instant13));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType1.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = iSOChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType1.getField((org.joda.time.Chronology) iSOChronology3);
        org.joda.time.DurationField durationField6 = iSOChronology3.hours();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology3.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology3.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) iSOChronology3);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 1, (org.joda.time.Chronology) iSOChronology3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long16 = dateTimeZone14.previousTransition((long) (-1));
        long long20 = dateTimeZone14.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale22 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str23 = dateTimeZone14.getShortName((long) '#', locale22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime26 = dateTime24.minusHours((int) (short) 100);
        int int27 = dateTime24.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property28 = dateTime24.monthOfYear();
        org.joda.time.Instant instant29 = dateTime24.toInstant();
        boolean boolean31 = dateTime24.isBefore(1L);
        org.joda.time.DateTime dateTime33 = dateTime24.plusWeeks((int) (short) 10);
        org.joda.time.DateTime dateTime35 = dateTime24.withYearOfCentury(3);
        int int36 = dateTime12.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant29", (dateTime24.compareTo(instant29) == 0) == dateTime24.equals(instant29));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate22 = localDate20.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property23 = localDate20.weekyear();
        java.lang.String str24 = property23.getAsString();
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField26 = iSOChronology25.weekyears();
        org.joda.time.DateTimeZone dateTimeZone27 = iSOChronology25.getZone();
        boolean boolean28 = property23.equals((java.lang.Object) iSOChronology25);
        org.joda.time.DateTime dateTime29 = dateTime13.toDateTime((org.joda.time.Chronology) iSOChronology25);
        org.joda.time.DateTime dateTime31 = dateTime13.withYearOfEra(7);
        org.joda.time.DateTime dateTime33 = dateTime13.withYear(998);
        org.joda.time.DateTime dateTime35 = dateTime13.minusSeconds(41);
        org.joda.time.DateTime dateTime37 = dateTime35.withYearOfEra(569);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime29", (dateTime13.compareTo(dateTime29) == 0) == dateTime13.equals(dateTime29));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField3", (durationField1.compareTo(durationField3) == 0) == durationField1.equals(durationField3));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property14 = dateTime11.weekyear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long18 = dateTimeZone16.previousTransition((long) (-1));
        long long22 = dateTimeZone16.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str25 = dateTimeZone16.getShortName((long) '#', locale24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime28 = dateTime26.minusHours((int) (short) 100);
        int int29 = dateTime26.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property30 = dateTime26.monthOfYear();
        org.joda.time.DateTime dateTime32 = dateTime26.plus(1L);
        int int33 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime35 = dateTime11.plusSeconds(440);
        org.joda.time.DateTime dateTime37 = dateTime35.plusSeconds(11);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime40 = dateTime37.withDurationAdded(readableDuration38, 53806439);
        org.joda.time.chrono.ISOChronology iSOChronology41 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology41.era();
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now((org.joda.time.Chronology) iSOChronology41);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((org.joda.time.Chronology) iSOChronology41);
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology41.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology41.clockhourOfDay();
        org.joda.time.DateTime dateTime47 = dateTime37.toDateTime((org.joda.time.Chronology) iSOChronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime43", (dateTime11.compareTo(dateTime43) == 0) == dateTime11.equals(dateTime43));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra((int) (byte) 1);
        org.joda.time.LocalDate.Property property5 = localDate4.weekyear();
        org.joda.time.LocalDate localDate7 = localDate4.withWeekOfWeekyear(30);
        org.joda.time.LocalDate localDate9 = localDate4.withDayOfYear(3);
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long14 = dateTimeZone12.previousTransition((long) (-1));
        long long18 = dateTimeZone12.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = dateTimeZone12.getShortName((long) '#', locale20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime24 = dateTime22.minusHours((int) (short) 100);
        int int25 = dateTime22.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property26 = dateTime22.monthOfYear();
        org.joda.time.Instant instant27 = dateTime22.toInstant();
        boolean boolean29 = instant27.isEqual((long) 30);
        boolean boolean30 = instant27.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime31 = instant27.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean33 = instant27.isSupported(dateTimeFieldType32);
        boolean boolean34 = dateTime10.isEqual((org.joda.time.ReadableInstant) instant27);
        org.joda.time.DateTime dateTime36 = dateTime10.minusMinutes(305);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant27", (dateTime22.compareTo(instant27) == 0) == dateTime22.equals(instant27));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder7 = builder0.set(2, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long12 = dateTimeZone10.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) ' ', dateTimeZone10);
        org.joda.time.LocalTime.Property property14 = localTime13.minuteOfHour();
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.lang.String str16 = property14.getAsText(locale15);
        java.util.Calendar.Builder builder17 = builder0.setLocale(locale15);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone19 = calendar18.getTimeZone();
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone19);
        int int21 = timeZone19.getRawOffset();
        java.util.Calendar.Builder builder22 = builder17.setTimeZone(timeZone19);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone19);
        int int24 = timeZone19.getRawOffset();
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology25.era();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology25.yearOfCentury();
        org.joda.time.DurationField durationField28 = iSOChronology25.months();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology25.halfdayOfDay();
        java.util.Locale locale30 = java.util.Locale.ROOT;
        int int31 = dateTimeField29.getMaximumShortTextLength(locale30);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long36 = dateTimeZone34.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime((long) ' ', dateTimeZone34);
        org.joda.time.LocalTime.Property property38 = localTime37.minuteOfHour();
        java.util.Locale locale39 = java.util.Locale.ITALY;
        java.lang.String str40 = property38.getAsText(locale39);
        java.lang.String str41 = locale39.getISO3Country();
        java.lang.String str42 = locale39.getISO3Country();
        java.lang.String str43 = locale30.getDisplayCountry(locale39);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone19, locale30);
        calendar44.setFirstDayOfWeek(2000);
        java.util.TimeZone timeZone47 = calendar44.getTimeZone();
        timeZone47.setID("UTC");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar44", (calendar18.compareTo(calendar44) == 0) == calendar18.equals(calendar44));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfYear();
        org.joda.time.Chronology chronology18 = dateTime16.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType19.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = iSOChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType19.getField((org.joda.time.Chronology) iSOChronology21);
        org.joda.time.DurationField durationField24 = iSOChronology21.hours();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology21.minuteOfHour();
        long long29 = iSOChronology21.add((long) 53655688, (long) 16, 839);
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology21.dayOfWeek();
        org.joda.time.DateTime dateTime31 = dateTime16.toDateTime((org.joda.time.Chronology) iSOChronology21);
        org.joda.time.DateTime dateTime33 = dateTime16.plusMillis(131);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime31", (dateTime16.compareTo(dateTime31) == 0) == dateTime16.equals(dateTime31));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone7);
        long long11 = dateTimeZone6.getMillisKeepLocal(dateTimeZone7, (long) 22);
        java.lang.String str12 = dateTimeZone6.toString();
        java.lang.String str14 = dateTimeZone6.getName(0L);
        org.joda.time.Chronology chronology15 = iSOChronology0.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology0.clockhourOfDay();
        java.lang.String str18 = iSOChronology0.toString();
        org.joda.time.DurationField durationField19 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField1, and durationField3", !(durationField19.compareTo(durationField1) == 0) || (Math.signum(durationField19.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        int int17 = dateTime16.getCenturyOfEra();
        org.joda.time.DateTime dateTime19 = dateTime16.withWeekOfWeekyear(21);
        org.joda.time.Instant instant20 = dateTime16.toInstant();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long24 = dateTimeZone22.previousTransition((long) (-1));
        long long28 = dateTimeZone22.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = dateTimeZone22.getShortName((long) '#', locale30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime34 = dateTime32.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime36 = dateTime34.minusDays(35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.DateTime dateTime38 = dateTime34.minus(readablePeriod37);
        boolean boolean39 = instant20.isEqual((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Chronology chronology40 = dateTime34.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant20", (dateTime11.compareTo(instant20) == 0) == dateTime11.equals(instant20));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
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
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        org.joda.time.DateTime.Property property23 = dateTime21.millisOfDay();
        org.joda.time.DateTime dateTime25 = dateTime21.withYearOfCentury(7);
        boolean boolean26 = dateTime25.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant22", (dateTime21.compareTo(instant22) == 0) == dateTime21.equals(instant22));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        int int16 = dateTime15.getMillisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime15.withYearOfEra(54);
        org.joda.time.DateTime.Property property19 = dateTime15.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime15.minus(readablePeriod20);
        org.joda.time.DateTime dateTime22 = dateTime21.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone24.previousTransition((long) (-1));
        long long30 = dateTimeZone24.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale32 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str33 = dateTimeZone24.getShortName((long) '#', locale32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime36 = dateTime34.minusHours((int) (short) 100);
        int int37 = dateTime34.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property38 = dateTime34.monthOfYear();
        org.joda.time.DateTime dateTime39 = property38.getDateTime();
        org.joda.time.DateTime.Property property40 = dateTime39.dayOfYear();
        boolean boolean41 = dateTime39.isAfterNow();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.DateTime dateTime43 = dateTime39.minus(readablePeriod42);
        boolean boolean44 = dateTime21.isBefore((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Instant instant45 = dateTime39.toInstant();
        org.joda.time.DateTime dateTime46 = dateTime39.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant45", (dateTime11.compareTo(instant45) == 0) == dateTime11.equals(instant45));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.year();
        org.joda.time.LocalDate localDate5 = localDate2.withYear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType6.getField((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.DurationField durationField11 = dateTimeField10.getDurationField();
        int int14 = dateTimeField10.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        boolean boolean23 = localDate19.isSupported(durationFieldType22);
        int[] intArray25 = new int[] { (short) 10 };
        int int26 = dateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) localDate19, intArray25);
        java.util.Locale locale28 = null;
        java.lang.String str29 = localDate19.toString("2022", locale28);
        org.joda.time.LocalDate localDate31 = localDate19.withYearOfEra(40);
        int int32 = localDate19.getWeekyear();
        org.joda.time.LocalDate localDate33 = localDate2.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate36 = localDate19.withPeriodAdded(readablePeriod34, 789);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(dateTimeZone38);
        org.joda.time.LocalDate localDate41 = localDate39.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long45 = dateTimeZone43.previousTransition((long) (-1));
        long long49 = dateTimeZone43.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = dateTimeZone43.getShortName((long) '#', locale51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime55 = dateTime53.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime57 = dateTime55.minusDays(35);
        org.joda.time.DateTime dateTime58 = localDate39.toDateTime((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime.Property property59 = dateTime57.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology60 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField61 = iSOChronology60.weekyears();
        org.joda.time.DurationField durationField62 = iSOChronology60.halfdays();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology60.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField64 = iSOChronology60.dayOfYear();
        org.joda.time.DateTime dateTime65 = dateTime57.toDateTime((org.joda.time.Chronology) iSOChronology60);
        org.joda.time.DateTime dateTime66 = localDate36.toDateTime((org.joda.time.ReadableInstant) dateTime65);
        int int67 = dateTime66.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime57 and dateTime65", (dateTime57.compareTo(dateTime65) == 0) == dateTime57.equals(dateTime65));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField5 = iSOChronology0.eras();
        java.lang.String str6 = iSOChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.weekyearOfCentury();
        int int40 = dateTime35.get(dateTimeField39);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury(45);
        org.joda.time.DateTime dateTime44 = dateTime35.minusDays(10);
        boolean boolean45 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime35);
        boolean boolean47 = instant16.isAfter((long) 741);
        org.joda.time.DateTime dateTime48 = instant16.toDateTime();
        int int49 = dateTime48.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
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
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfWeek();
        org.joda.time.DateTime dateTime19 = dateTime16.withMillisOfSecond((int) (short) 1);
        int int20 = dateTime16.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone23);
        long long27 = dateTimeZone22.getMillisKeepLocal(dateTimeZone23, (long) 22);
        java.lang.String str28 = dateTimeZone22.toString();
        java.lang.String str30 = dateTimeZone22.getName(0L);
        int int32 = dateTimeZone22.getOffset((long) 100);
        org.joda.time.DateTime dateTime33 = dateTime16.toDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime33", (dateTime16.compareTo(dateTime33) == 0) == dateTime16.equals(dateTime33));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours(12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withZone(dateTimeZone5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withDefaultYear(357);
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long13 = dateTimeZone11.previousTransition((long) (-1));
        long long17 = dateTimeZone11.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = dateTimeZone11.getShortName((long) '#', locale19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime23 = dateTime21.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime25 = dateTime23.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology26.era();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology26);
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology26.weekyearOfCentury();
        int int30 = dateTime25.get(dateTimeField29);
        org.joda.time.DateTime dateTime32 = dateTime25.withYearOfCentury(45);
        org.joda.time.Instant instant33 = dateTime25.toInstant();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long37 = dateTimeZone35.previousTransition((long) (-1));
        long long41 = dateTimeZone35.convertLocalToUTC((long) 'x', true, (long) 10);
        int int43 = dateTimeZone35.getOffset((long) '4');
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone35);
        int int46 = dateTimeZone35.getOffset(0L);
        long long48 = dateTimeZone35.convertUTCToLocal((-105235200000L));
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime25.toMutableDateTime(dateTimeZone35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter8.withZone(dateTimeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant33", (dateTime25.compareTo(instant33) == 0) == dateTime25.equals(instant33));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
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
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury(45);
        org.joda.time.Instant instant23 = dateTime15.toInstant();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long27 = dateTimeZone25.previousTransition((long) (-1));
        long long31 = dateTimeZone25.convertLocalToUTC((long) 'x', true, (long) 10);
        int int33 = dateTimeZone25.getOffset((long) '4');
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone25);
        int int36 = dateTimeZone25.getOffset(0L);
        long long38 = dateTimeZone25.convertUTCToLocal((-105235200000L));
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime15.toMutableDateTime(dateTimeZone25);
        org.joda.time.chrono.ISOChronology iSOChronology40 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField41 = iSOChronology40.weekyears();
        org.joda.time.DurationField durationField42 = iSOChronology40.halfdays();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology40.monthOfYear();
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology40);
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology40.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology40.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField47 = iSOChronology40.secondOfDay();
        org.joda.time.DateTimeField dateTimeField48 = iSOChronology40.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime15.toMutableDateTime((org.joda.time.Chronology) iSOChronology40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant23 and mutableDateTime39", (instant23.compareTo(mutableDateTime39) == 0) == instant23.equals(mutableDateTime39));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField7 = iSOChronology0.months();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeZone dateTimeZone10 = iSOChronology8.getZone();
        long long12 = dateTimeZone10.nextTransition((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long16 = dateTimeZone14.previousTransition((long) (-1));
        long long20 = dateTimeZone14.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale22 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str23 = dateTimeZone14.getShortName((long) '#', locale22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime26 = dateTime24.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime28 = dateTime26.minusDays(35);
        boolean boolean30 = dateTime28.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime33 = dateTime28.withDurationAdded((long) 11, 16);
        org.joda.time.DateTime.Property property34 = dateTime33.minuteOfDay();
        org.joda.time.DateTime dateTime35 = property34.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property36 = dateTime35.dayOfMonth();
        boolean boolean37 = dateTimeZone10.equals((java.lang.Object) dateTime35);
        org.joda.time.Chronology chronology38 = iSOChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime39", (dateTime24.compareTo(dateTime39) == 0) == dateTime24.equals(dateTime39));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Instant instant21 = instant16.withMillis((long) 999);
        org.joda.time.Instant instant24 = instant16.withDurationAdded((long) 77, 657);
        org.joda.time.Chronology chronology25 = instant24.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        int int2 = localTime1.getMillisOfSecond();
        org.joda.time.LocalTime.Property property3 = localTime1.millisOfDay();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.LocalTime localTime5 = property3.getLocalTime();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.years();
        java.lang.String str7 = durationFieldType6.toString();
        boolean boolean8 = localTime5.isSupported(durationFieldType6);
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.era();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology9);
        org.joda.time.DurationField durationField12 = iSOChronology9.months();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology9.hourOfHalfday();
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = iSOChronology14.weekyears();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Chronology chronology17 = iSOChronology14.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology14.yearOfCentury();
        boolean boolean19 = iSOChronology9.equals((java.lang.Object) iSOChronology14);
        java.lang.String str20 = iSOChronology14.toString();
        org.joda.time.DurationField durationField21 = durationFieldType6.getField((org.joda.time.Chronology) iSOChronology14);
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology14.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField15 and durationField21", (durationField15.compareTo(durationField21) == 0) == durationField15.equals(durationField21));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        long long29 = dateTimeZone23.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale31 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str32 = dateTimeZone23.getShortName((long) '#', locale31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime35 = dateTime33.minusHours((int) (short) 100);
        int int36 = dateTime33.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property37 = dateTime33.monthOfYear();
        org.joda.time.Instant instant38 = dateTime33.toInstant();
        boolean boolean40 = instant38.isEqual((long) 30);
        org.joda.time.DateTime dateTime41 = instant38.toDateTime();
        org.joda.time.DateTime dateTime42 = instant38.toDateTimeISO();
        org.joda.time.Instant instant44 = instant38.minus((long) 45);
        boolean boolean45 = dateTime15.equals((java.lang.Object) instant38);
        org.joda.time.Instant instant46 = instant38.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and dateTime41", (dateTime33.compareTo(dateTime41) == 0) == dateTime33.equals(dateTime41));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.weekyearOfCentury();
        int int40 = dateTime35.get(dateTimeField39);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury(45);
        org.joda.time.DateTime dateTime44 = dateTime35.minusDays(10);
        boolean boolean45 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime35);
        boolean boolean47 = instant16.isAfter((long) 741);
        org.joda.time.DateTime dateTime48 = instant16.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime49 = instant16.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime19", (dateTime11.compareTo(dateTime19) == 0) == dateTime11.equals(dateTime19));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfMonth();
        org.joda.time.DurationField durationField4 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField1, and durationField2", !(durationField4.compareTo(durationField1) == 0) || (Math.signum(durationField4.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
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
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury(45);
        org.joda.time.Instant instant23 = dateTime15.toInstant();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long27 = dateTimeZone25.previousTransition((long) (-1));
        long long31 = dateTimeZone25.convertLocalToUTC((long) 'x', true, (long) 10);
        int int33 = dateTimeZone25.getOffset((long) '4');
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone25);
        int int36 = dateTimeZone25.getOffset(0L);
        long long38 = dateTimeZone25.convertUTCToLocal((-105235200000L));
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime15.toMutableDateTime(dateTimeZone25);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant23", (dateTime15.compareTo(instant23) == 0) == dateTime15.equals(instant23));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime20.plusSeconds(21);
        org.joda.time.DateTime dateTime26 = dateTime20.minusDays((int) (byte) 0);
        org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField28 = iSOChronology27.weekyears();
        org.joda.time.DurationField durationField29 = iSOChronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology27.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology27.dayOfYear();
        org.joda.time.DateTime dateTime32 = dateTime26.toDateTime((org.joda.time.Chronology) iSOChronology27);
        org.joda.time.DateTime dateTime34 = dateTime26.minusDays(2629746);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime32", (dateTime26.compareTo(dateTime32) == 0) == dateTime26.equals(dateTime32));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        int int15 = dateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime17 = dateTime11.minusMonths((int) (short) 10);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfEra();
        org.joda.time.DateTime dateTime19 = property18.roundHalfFloorCopy();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.withDurationAdded(readableDuration20, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone24.previousTransition((long) (-1));
        long long30 = dateTimeZone24.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale32 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str33 = dateTimeZone24.getShortName((long) '#', locale32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime36 = dateTime34.minusHours((int) (short) 100);
        int int37 = dateTime34.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property38 = dateTime34.monthOfYear();
        org.joda.time.Instant instant39 = dateTime34.toInstant();
        boolean boolean41 = instant39.isEqual((long) 30);
        org.joda.time.DateTime dateTime42 = instant39.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long46 = dateTimeZone44.previousTransition((long) (-1));
        long long50 = dateTimeZone44.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale52 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str53 = dateTimeZone44.getShortName((long) '#', locale52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime56 = dateTime54.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime58 = dateTime56.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology59 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField60 = iSOChronology59.era();
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology59);
        org.joda.time.DateTimeField dateTimeField62 = iSOChronology59.weekyearOfCentury();
        int int63 = dateTime58.get(dateTimeField62);
        org.joda.time.DateTime dateTime65 = dateTime58.withYearOfCentury(45);
        org.joda.time.DateTime dateTime67 = dateTime58.minusDays(10);
        boolean boolean68 = instant39.isAfter((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Chronology chronology69 = instant39.getChronology();
        org.joda.time.DateTime dateTime70 = dateTime22.withChronology(chronology69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant39", (dateTime11.compareTo(instant39) == 0) == dateTime11.equals(instant39));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        long long8 = dateTimeZone2.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = dateTimeZone2.getShortName((long) '#', locale10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime14 = dateTime12.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime16 = dateTime14.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology17.era();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology17);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology17.weekyearOfCentury();
        int int21 = dateTime16.get(dateTimeField20);
        org.joda.time.DateTime dateTime23 = dateTime16.withYearOfCentury(45);
        org.joda.time.DateTime dateTime25 = dateTime16.minusDays(10);
        org.joda.time.DateTime dateTime27 = dateTime16.withYear(32772);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime16.minus(readablePeriod28);
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology30.era();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology30);
        org.joda.time.DurationField durationField33 = iSOChronology30.months();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology30.weekyear();
        org.joda.time.DurationField durationField35 = iSOChronology30.halfdays();
        org.joda.time.DateTimeZone dateTimeZone36 = iSOChronology30.getZone();
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime16.toMutableDateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) 218, dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and mutableDateTime37", (dateTime16.compareTo(mutableDateTime37) == 0) == dateTime16.equals(mutableDateTime37));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long17 = dateTimeZone15.previousTransition((long) (-1));
        long long21 = dateTimeZone15.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = dateTimeZone15.getShortName((long) '#', locale23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime27 = dateTime25.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime29 = dateTime27.minusDays(35);
        org.joda.time.DateTime dateTime30 = localDate11.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        boolean boolean32 = dateTime30.isAfter(1645750800000L);
        org.joda.time.YearMonthDay yearMonthDay33 = dateTime30.toYearMonthDay();
        int int34 = dateTime30.getYearOfCentury();
        long long35 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Instant instant36 = dateTime30.toInstant();
        boolean boolean38 = dateTime30.isEqual(407L);
        org.joda.time.DateTime dateTime40 = dateTime30.plusWeeks(81);
        java.util.Date date41 = dateTime40.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant36", (dateTime30.compareTo(instant36) == 0) == dateTime30.equals(instant36));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant22 = instant16.minus((long) 45);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant16.plus(readableDuration23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((java.lang.Object) instant24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant24", (dateTime11.compareTo(instant24) == 0) == dateTime11.equals(instant24));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        org.joda.time.DateTime dateTime17 = dateTime15.withYear(99);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(40);
        boolean boolean21 = dateTimeZone19.isStandardOffset(0L);
        org.joda.time.DateTime dateTime22 = dateTime15.toDateTime(dateTimeZone19);
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime22", (dateTime15.compareTo(dateTime22) == 0) == dateTime15.equals(dateTime22));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
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
        org.joda.time.Instant instant18 = instant16.minus((long) 'u');
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology19.era();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology19);
        org.joda.time.DurationField durationField22 = iSOChronology19.months();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology19.weekyear();
        org.joda.time.DurationField durationField24 = iSOChronology19.halfdays();
        org.joda.time.DateTimeZone dateTimeZone25 = iSOChronology19.getZone();
        org.joda.time.DateTime dateTime26 = instant16.toDateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfEra(441);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
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
        org.joda.time.Instant instant19 = instant16.withDurationAdded((long) 643, 1970);
        org.joda.time.Instant instant21 = instant16.withMillis((long) 40);
        org.joda.time.MutableDateTime mutableDateTime22 = instant21.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime17 = property15.addWrapFieldToCopy((-27424193));
        boolean boolean18 = dateTime17.isAfterNow();
        org.joda.time.DateTime dateTime20 = dateTime17.plusYears((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) ' ', dateTimeZone23);
        org.joda.time.LocalTime.Property property27 = localTime26.minuteOfHour();
        org.joda.time.LocalTime localTime29 = localTime26.withMillisOfSecond((int) (short) 0);
        int int30 = localTime29.getMillisOfSecond();
        org.joda.time.DateTime dateTime31 = localTime29.toDateTimeToday();
        org.joda.time.Instant instant32 = dateTime31.toInstant();
        boolean boolean33 = dateTime20.isAfter((org.joda.time.ReadableInstant) instant32);
        org.joda.time.chrono.ISOChronology iSOChronology34 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField35 = iSOChronology34.weekyears();
        org.joda.time.DurationField durationField36 = iSOChronology34.halfdays();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology34.dayOfMonth();
        org.joda.time.DurationField durationField38 = iSOChronology34.seconds();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology34.dayOfYear();
        org.joda.time.chrono.ISOChronology iSOChronology40 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField41 = iSOChronology40.weekyears();
        org.joda.time.DateTimeZone dateTimeZone42 = iSOChronology40.getZone();
        long long44 = dateTimeZone42.nextTransition((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long48 = dateTimeZone46.previousTransition((long) (-1));
        long long52 = dateTimeZone46.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale54 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str55 = dateTimeZone46.getShortName((long) '#', locale54);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(dateTimeZone46);
        org.joda.time.DateTime dateTime58 = dateTime56.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime60 = dateTime58.minusDays(35);
        boolean boolean62 = dateTime60.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime65 = dateTime60.withDurationAdded((long) 11, 16);
        org.joda.time.DateTime.Property property66 = dateTime65.minuteOfDay();
        org.joda.time.DateTime dateTime67 = property66.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property68 = dateTime67.dayOfMonth();
        boolean boolean69 = dateTimeZone42.equals((java.lang.Object) dateTime67);
        org.joda.time.Chronology chronology70 = iSOChronology34.withZone(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long74 = dateTimeZone72.previousTransition((long) (-1));
        long long78 = dateTimeZone72.convertLocalToUTC((long) 'x', true, (long) 10);
        org.joda.time.DateTime dateTime79 = org.joda.time.DateTime.now(dateTimeZone72);
        long long81 = dateTimeZone42.getMillisKeepLocal(dateTimeZone72, (long) 785);
        org.joda.time.DateTime dateTime82 = dateTime20.withZone(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant32", (dateTime31.compareTo(instant32) == 0) == dateTime31.equals(instant32));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekyear(1);
        org.joda.time.DateTime.Property property14 = dateTime11.secondOfDay();
        org.joda.time.DateTime dateTime16 = dateTime11.plusWeeks((-27424193));
        org.joda.time.DateTime.Property property17 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime19 = property17.addToCopy((long) 53708922);
        org.joda.time.DateTime dateTime20 = property17.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField21 = property17.getField();
        java.lang.Object obj22 = null;
        org.joda.time.Instant instant23 = new org.joda.time.Instant(obj22);
        org.joda.time.DateTime dateTime24 = instant23.toDateTime();
        long long25 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant23", (dateTime11.compareTo(instant23) == 0) == dateTime11.equals(instant23));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.weekyearOfCentury();
        int int40 = dateTime35.get(dateTimeField39);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury(45);
        org.joda.time.DateTime dateTime44 = dateTime35.minusDays(10);
        boolean boolean45 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime35);
        boolean boolean47 = instant16.isAfter((long) 741);
        org.joda.time.DateTime dateTime48 = instant16.toDateTime();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.Instant instant50 = instant16.plus(readableDuration49);
        org.joda.time.Instant instant53 = instant16.withDurationAdded((long) 357, 786);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withEra(1);
        int int10 = localDate4.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean13 = dateTimeZone11.isStandardOffset((long) 0);
        org.joda.time.Interval interval14 = localDate4.toInterval(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = localDate4.toDateMidnight();
        org.joda.time.Instant instant16 = new org.joda.time.Instant((java.lang.Object) dateMidnight15);
        org.joda.time.Instant instant18 = instant16.minus(53691560L);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant18.plus(readableDuration19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight15 and instant16", (dateMidnight15.compareTo(instant16) == 0) == dateMidnight15.equals(instant16));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        java.util.Locale locale3 = new java.util.Locale("fra", "3", "10 Feb 1900 04:11:40 GMT");
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale3);
        java.util.TimeZone timeZone5 = calendar4.getTimeZone();
        java.util.Calendar.Builder builder6 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder10 = builder6.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder13 = builder6.set(2, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long18 = dateTimeZone16.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) ' ', dateTimeZone16);
        org.joda.time.LocalTime.Property property20 = localTime19.minuteOfHour();
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = property20.getAsText(locale21);
        java.util.Calendar.Builder builder23 = builder6.setLocale(locale21);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone25 = calendar24.getTimeZone();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone25);
        int int27 = timeZone25.getRawOffset();
        java.util.Calendar.Builder builder28 = builder23.setTimeZone(timeZone25);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone25);
        timeZone25.setID("21 Jan 2022 14:54:23 GMT");
        java.lang.String str32 = timeZone25.getID();
        boolean boolean33 = timeZone5.hasSameRules(timeZone25);
        int int34 = timeZone25.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar24", (calendar4.compareTo(calendar24) == 0) == calendar4.equals(calendar24));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded(readableDuration14, 14);
        java.util.Locale locale17 = java.util.Locale.JAPAN;
        java.lang.String str18 = locale17.getScript();
        java.util.Calendar calendar19 = dateTime13.toCalendar(locale17);
        org.joda.time.Instant instant20 = dateTime13.toInstant();
        org.joda.time.Instant instant22 = instant20.minus((long) 42856587);
        org.joda.time.Instant instant24 = instant22.withMillis((long) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant20", (dateTime13.compareTo(instant20) == 0) == dateTime13.equals(instant20));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        boolean boolean3 = calendar2.isWeekDateSupported();
        java.util.Locale locale7 = new java.util.Locale("fra", "3", "10 Feb 1900 04:11:40 GMT");
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale7);
        java.util.TimeZone timeZone9 = calendar8.getTimeZone();
        java.util.Calendar.Builder builder10 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder14 = builder10.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder17 = builder10.set(2, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long22 = dateTimeZone20.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) ' ', dateTimeZone20);
        org.joda.time.LocalTime.Property property24 = localTime23.minuteOfHour();
        java.util.Locale locale25 = java.util.Locale.ITALY;
        java.lang.String str26 = property24.getAsText(locale25);
        java.util.Calendar.Builder builder27 = builder10.setLocale(locale25);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone29 = calendar28.getTimeZone();
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone29);
        int int31 = timeZone29.getRawOffset();
        java.util.Calendar.Builder builder32 = builder27.setTimeZone(timeZone29);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone29);
        timeZone29.setID("21 Jan 2022 14:54:23 GMT");
        java.lang.String str36 = timeZone29.getID();
        boolean boolean37 = timeZone9.hasSameRules(timeZone29);
        calendar2.setTimeZone(timeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar28", (calendar8.compareTo(calendar28) == 0) == calendar8.equals(calendar28));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField3", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        calendar0.setFirstDayOfWeek(0);
        java.util.TimeZone timeZone4 = calendar0.getTimeZone();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getISO3Language();
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.era();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology7);
        org.joda.time.DurationField durationField10 = iSOChronology7.months();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long17 = dateTimeZone15.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) ' ', dateTimeZone15);
        org.joda.time.LocalTime.Property property19 = localTime18.minuteOfHour();
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.lang.String str21 = property19.getAsText(locale20);
        int int22 = property19.getLeapAmount();
        java.lang.String str23 = property19.getAsShortText();
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str25 = property19.getAsText(locale24);
        java.lang.String str26 = dateTimeField11.getAsText(3, locale24);
        java.lang.String str27 = locale5.getDisplayVariant(locale24);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone4, locale24);
        java.time.Instant instant29 = calendar28.toInstant();
        java.util.Date date30 = java.util.Date.from(instant29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar28", (calendar0.compareTo(calendar28) == 0) == calendar0.equals(calendar28));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.Chronology chronology20 = instant16.getChronology();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology23.dayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime20.toDateTime((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime20.plus(readableDuration29);
        boolean boolean31 = dateTime30.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime28", (dateTime30.compareTo(dateTime28) == 0) == dateTime30.equals(dateTime28));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        calendar0.setFirstDayOfWeek(0);
        java.util.TimeZone timeZone4 = calendar0.getTimeZone();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getISO3Language();
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.era();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology7);
        org.joda.time.DurationField durationField10 = iSOChronology7.months();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long17 = dateTimeZone15.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) ' ', dateTimeZone15);
        org.joda.time.LocalTime.Property property19 = localTime18.minuteOfHour();
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.lang.String str21 = property19.getAsText(locale20);
        int int22 = property19.getLeapAmount();
        java.lang.String str23 = property19.getAsShortText();
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str25 = property19.getAsText(locale24);
        java.lang.String str26 = dateTimeField11.getAsText(3, locale24);
        java.lang.String str27 = locale5.getDisplayVariant(locale24);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone4, locale24);
        java.lang.String str29 = locale24.getDisplayVariant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar28", (calendar0.compareTo(calendar28) == 0) == calendar0.equals(calendar28));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = iSOChronology1.add(readablePeriod4, (long) (short) 1, 954);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.clockhourOfDay();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) 56, (org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DurationField durationField10 = iSOChronology1.years();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DateTime.Property property12 = dateTime11.millisOfSecond();
        org.joda.time.DateTime dateTime14 = dateTime11.plusWeeks(7);
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = iSOChronology15.weekyears();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Chronology chronology18 = iSOChronology15.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology15.dayOfMonth();
        org.joda.time.Chronology chronology20 = iSOChronology15.withUTC();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology15.secondOfDay();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now((org.joda.time.Chronology) iSOChronology15);
        org.joda.time.DurationField durationField23 = iSOChronology15.months();
        org.joda.time.DateTime dateTime24 = dateTime11.toDateTime((org.joda.time.Chronology) iSOChronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField16", (durationField10.compareTo(durationField16) == 0) == durationField10.equals(durationField16));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = dateTimeField4.getDurationField();
        int int8 = dateTimeField4.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.years();
        boolean boolean17 = localDate13.isSupported(durationFieldType16);
        int[] intArray19 = new int[] { (short) 10 };
        int int20 = dateTimeField4.getMaximumValue((org.joda.time.ReadablePartial) localDate13, intArray19);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = localDate13.getFieldTypes();
        int int22 = localDate13.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate13.toDateTimeAtStartOfDay(dateTimeZone23);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance();
        int int27 = calendar25.getMinimum(10);
        calendar25.setFirstDayOfWeek(100);
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.fromCalendarFields(calendar25);
        org.joda.time.LocalDate localDate32 = localDate30.plusYears(56);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(0L, dateTimeZone34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDate localDate37 = localDate35.plus(readablePeriod36);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate(dateTimeZone39);
        org.joda.time.LocalDate localDate42 = localDate40.withEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDate localDate45 = localDate40.withField(dateTimeFieldType43, 100);
        boolean boolean46 = localDate35.isSupported(dateTimeFieldType43);
        org.joda.time.LocalDate.Property property47 = localDate32.property(dateTimeFieldType43);
        boolean boolean48 = localDate13.isSupported(dateTimeFieldType43);
        java.lang.String str49 = dateTimeFieldType43.getName();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long53 = dateTimeZone51.previousTransition((long) (-1));
        long long57 = dateTimeZone51.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale59 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str60 = dateTimeZone51.getShortName((long) '#', locale59);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime63 = dateTime61.minusHours((int) (short) 100);
        int int64 = dateTime61.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property65 = dateTime61.monthOfYear();
        org.joda.time.DateTime dateTime66 = property65.getDateTime();
        org.joda.time.DateTime.Property property67 = dateTime66.dayOfYear();
        org.joda.time.Chronology chronology68 = dateTime66.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType70 = dateTimeFieldType69.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology71 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField72 = iSOChronology71.weekyears();
        org.joda.time.DateTimeField dateTimeField73 = dateTimeFieldType69.getField((org.joda.time.Chronology) iSOChronology71);
        org.joda.time.DurationField durationField74 = iSOChronology71.hours();
        org.joda.time.DateTimeField dateTimeField75 = iSOChronology71.minuteOfHour();
        long long79 = iSOChronology71.add((long) 53655688, (long) 16, 839);
        org.joda.time.DateTimeField dateTimeField80 = iSOChronology71.dayOfWeek();
        org.joda.time.DateTime dateTime81 = dateTime66.toDateTime((org.joda.time.Chronology) iSOChronology71);
        boolean boolean82 = dateTimeFieldType43.isSupported((org.joda.time.Chronology) iSOChronology71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime61 and dateTime81", (dateTime61.compareTo(dateTime81) == 0) == dateTime61.equals(dateTime81));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime20.plusSeconds(21);
        org.joda.time.DateTime dateTime26 = dateTime20.minusDays((int) (byte) 0);
        org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField28 = iSOChronology27.weekyears();
        org.joda.time.DurationField durationField29 = iSOChronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology27.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology27.dayOfYear();
        org.joda.time.DateTime dateTime32 = dateTime26.toDateTime((org.joda.time.Chronology) iSOChronology27);
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology27.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime32", (dateTime20.compareTo(dateTime32) == 0) == dateTime20.equals(dateTime32));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology0.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField3", (durationField1.compareTo(durationField3) == 0) == durationField1.equals(durationField3));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        int int2 = timeZone1.getRawOffset();
        boolean boolean3 = timeZone1.observesDaylightTime();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone5 = calendar4.getTimeZone();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone5);
        timeZone5.setID("05:10:00.032");
        java.lang.String str9 = timeZone5.getID();
        boolean boolean10 = timeZone1.hasSameRules(timeZone5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar4", (calendar0.compareTo(calendar4) == 0) == calendar0.equals(calendar4));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.weekyearOfCentury();
        int int40 = dateTime35.get(dateTimeField39);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury(45);
        org.joda.time.DateTime dateTime44 = dateTime35.minusDays(10);
        boolean boolean45 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Chronology chronology46 = instant16.getChronology();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Instant instant48 = instant16.plus(readableDuration47);
        org.joda.time.Instant instant49 = instant48.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant49", (dateTime11.compareTo(instant49) == 0) == dateTime11.equals(instant49));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.year();
        org.joda.time.DurationField durationField5 = iSOChronology0.hours();
        org.joda.time.DurationField durationField6 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField7 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField5", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.yearOfCentury();
        org.joda.time.DurationField durationField3 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyearOfCentury();
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.era();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology6.yearOfCentury();
        org.joda.time.DurationField durationField9 = iSOChronology6.months();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology6.halfdayOfDay();
        java.util.Locale locale11 = java.util.Locale.ROOT;
        int int12 = dateTimeField10.getMaximumShortTextLength(locale11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long17 = dateTimeZone15.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) ' ', dateTimeZone15);
        org.joda.time.LocalTime.Property property19 = localTime18.minuteOfHour();
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.lang.String str21 = property19.getAsText(locale20);
        java.lang.String str22 = locale20.getISO3Country();
        java.lang.String str23 = locale20.getISO3Country();
        java.lang.String str24 = locale11.getDisplayCountry(locale20);
        java.lang.String str25 = dateTimeField4.getAsText((long) (-1645041600), locale11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField9", Math.signum(durationField3.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField3)));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.yearOfCentury();
        org.joda.time.DurationField durationField6 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField7 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField4", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField4)) == Math.signum(durationField1.compareTo(durationField4))));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        java.util.Locale locale3 = new java.util.Locale("fra", "3", "10 Feb 1900 04:11:40 GMT");
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale3);
        java.util.TimeZone timeZone5 = calendar4.getTimeZone();
        java.util.TimeZone timeZone6 = calendar4.getTimeZone();
        timeZone6.setID("gioved\354");
        int int9 = timeZone6.getRawOffset();
        java.util.Calendar calendar10 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone11 = calendar10.getTimeZone();
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone11);
        timeZone11.setID("years");
        int int15 = timeZone11.getRawOffset();
        int int17 = timeZone11.getOffset((long) 104);
        boolean boolean18 = timeZone6.hasSameRules(timeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar10", (calendar4.compareTo(calendar10) == 0) == calendar4.equals(calendar10));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
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
        org.joda.time.LocalDateTime localDateTime21 = dateTime11.toLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime11.plus(readablePeriod22);
        org.joda.time.LocalTime localTime24 = dateTime23.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant16", (dateTime23.compareTo(instant16) == 0) == dateTime23.equals(instant16));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Chronology chronology20 = instant16.getChronology();
        org.joda.time.DateTime dateTime21 = instant16.toDateTimeISO();
        org.joda.time.Instant instant23 = instant16.withMillis((long) 86399999);
        org.joda.time.Instant instant26 = instant23.withDurationAdded((long) 76, 439);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Instant instant21 = instant16.plus((long) 8);
        org.joda.time.DateTime dateTime22 = instant21.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
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
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfWeek();
        org.joda.time.DateTime dateTime18 = property17.roundHalfFloorCopy();
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
        org.joda.time.DateTime.Property property41 = dateTime39.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology42 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField43 = iSOChronology42.weekyears();
        org.joda.time.DurationField durationField44 = iSOChronology42.halfdays();
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology42.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology42.dayOfYear();
        org.joda.time.DateTime dateTime47 = dateTime39.toDateTime((org.joda.time.Chronology) iSOChronology42);
        org.joda.time.DateTime.Property property48 = dateTime39.dayOfWeek();
        org.joda.time.DateTime.Property property49 = dateTime39.secondOfDay();
        boolean boolean50 = property17.equals((java.lang.Object) dateTime39);
        org.joda.time.chrono.ISOChronology iSOChronology51 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField52 = iSOChronology51.weekyears();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.Chronology chronology54 = iSOChronology51.withZone(dateTimeZone53);
        org.joda.time.DateTimeField dateTimeField55 = iSOChronology51.yearOfCentury();
        long long57 = dateTimeField55.remainder((long) '#');
        boolean boolean58 = property17.equals((java.lang.Object) long57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime47", (dateTime39.compareTo(dateTime47) == 0) == dateTime39.equals(dateTime47));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder7 = builder0.set(2, (int) (byte) -1);
        java.util.Calendar.Builder builder11 = builder0.setTimeOfDay(22, 24, 12);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone13 = calendar12.getTimeZone();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone13);
        int int15 = timeZone13.getRawOffset();
        java.util.Calendar.Builder builder16 = builder0.setTimeZone(timeZone13);
        java.util.Calendar.Builder builder18 = builder16.setLenient(true);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance();
        int int21 = calendar19.getMinimum(10);
        calendar19.setFirstDayOfWeek(100);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.fromCalendarFields(calendar19);
        boolean boolean25 = calendar19.isWeekDateSupported();
        boolean boolean26 = calendar19.isWeekDateSupported();
        int int27 = calendar19.getWeekYear();
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField29 = iSOChronology28.weekyears();
        org.joda.time.DateTimeZone dateTimeZone30 = iSOChronology28.getZone();
        org.joda.time.DurationField durationField31 = iSOChronology28.seconds();
        org.joda.time.DurationField durationField32 = iSOChronology28.halfdays();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology28.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(dateTimeZone35);
        org.joda.time.LocalDate localDate38 = localDate36.withEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType40 = dateTimeFieldType39.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology41 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField42 = iSOChronology41.weekyears();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType39.getField((org.joda.time.Chronology) iSOChronology41);
        org.joda.time.DurationField durationField44 = dateTimeField43.getDurationField();
        int int47 = dateTimeField43.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(dateTimeZone49);
        org.joda.time.LocalDate localDate52 = localDate50.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate54 = localDate52.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType55 = org.joda.time.DurationFieldType.years();
        boolean boolean56 = localDate52.isSupported(durationFieldType55);
        int[] intArray58 = new int[] { (short) 10 };
        int int59 = dateTimeField43.getMaximumValue((org.joda.time.ReadablePartial) localDate52, intArray58);
        int int60 = dateTimeField33.getMaximumValue((org.joda.time.ReadablePartial) localDate36, intArray58);
        boolean boolean61 = calendar19.before((java.lang.Object) localDate36);
        boolean boolean62 = calendar19.isWeekDateSupported();
        java.util.TimeZone timeZone63 = calendar19.getTimeZone();
        java.util.Calendar.Builder builder64 = builder16.setTimeZone(timeZone63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar12 and calendar19", (calendar12.compareTo(calendar19) == 0) == calendar12.equals(calendar19));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology23.dayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime20.toDateTime((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime20.plus(readableDuration29);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(dateTimeZone32);
        org.joda.time.LocalDate localDate35 = localDate33.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate37 = localDate35.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property38 = localDate35.weekyear();
        org.joda.time.LocalDate localDate39 = property38.roundFloorCopy();
        org.joda.time.LocalDate localDate40 = property38.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate41 = property38.roundHalfCeilingCopy();
        org.joda.time.LocalDate.Property property42 = localDate41.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(dateTimeZone44);
        org.joda.time.LocalDate localDate47 = localDate45.withEra((int) (byte) 1);
        org.joda.time.LocalDate.Property property48 = localDate47.weekyear();
        org.joda.time.LocalDate localDate50 = localDate47.withWeekOfWeekyear(30);
        org.joda.time.LocalDate localDate52 = localDate47.withDayOfYear(3);
        org.joda.time.DateTime dateTime53 = localDate52.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate55 = localDate52.withYearOfEra(53684103);
        org.joda.time.LocalDate localDate57 = localDate55.minusMonths((int) 'x');
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetMillis(42970913);
        org.joda.time.DateTime dateTime60 = localDate57.toDateTimeAtMidnight(dateTimeZone59);
        org.joda.time.DateMidnight dateMidnight61 = localDate41.toDateMidnight(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime30.toDateTime(dateTimeZone59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime28", (dateTime30.compareTo(dateTime28) == 0) == dateTime30.equals(dateTime28));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property14 = dateTime11.weekyear();
        int int15 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long19 = dateTimeZone17.previousTransition((long) (-1));
        long long23 = dateTimeZone17.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = dateTimeZone17.getShortName((long) '#', locale25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.withEra(1);
        int int38 = localDate32.compareTo((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean41 = dateTimeZone39.isStandardOffset((long) 0);
        org.joda.time.Interval interval42 = localDate32.toInterval(dateTimeZone39);
        boolean boolean43 = dateTime27.equals((java.lang.Object) dateTimeZone39);
        int int44 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Instant instant45 = dateTime27.toInstant();
        org.joda.time.TimeOfDay timeOfDay46 = dateTime27.toTimeOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant45", (dateTime11.compareTo(instant45) == 0) == dateTime11.equals(instant45));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        org.joda.time.DateTime dateTime17 = dateTime15.withYear(99);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(40);
        boolean boolean21 = dateTimeZone19.isStandardOffset(0L);
        org.joda.time.DateTime dateTime22 = dateTime15.toDateTime(dateTimeZone19);
        org.joda.time.DateTime.Property property23 = dateTime15.secondOfDay();
        org.joda.time.DateTime dateTime24 = property23.getDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime22", (dateTime24.compareTo(dateTime22) == 0) == dateTime24.equals(dateTime22));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        calendar0.setFirstDayOfWeek(100);
        int int5 = calendar0.getFirstDayOfWeek();
        boolean boolean6 = calendar0.isWeekDateSupported();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone8 = calendar7.getTimeZone();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone8);
        calendar9.roll(11, false);
        calendar9.setLenient(true);
        java.util.TimeZone timeZone15 = calendar9.getTimeZone();
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone15);
        boolean boolean17 = calendar0.after((java.lang.Object) calendar16);
        int int18 = calendar16.getFirstDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar7", (calendar0.compareTo(calendar7) == 0) == calendar0.equals(calendar7));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.weekyearOfCentury();
        int int40 = dateTime35.get(dateTimeField39);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury(45);
        org.joda.time.DateTime dateTime44 = dateTime35.minusDays(10);
        boolean boolean45 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Instant instant48 = instant16.withDurationAdded(readableDuration46, 1439);
        org.joda.time.Instant instant49 = instant48.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant49", (dateTime11.compareTo(instant49) == 0) == dateTime11.equals(instant49));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField9 = iSOChronology0.eras();
        org.joda.time.DurationField durationField10 = iSOChronology0.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
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
        org.joda.time.LocalDateTime localDateTime21 = dateTime11.toLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime11.plus(readablePeriod22);
        int int24 = dateTime11.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime11", (instant16.compareTo(dateTime11) == 0) == instant16.equals(dateTime11));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfHalfday();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = iSOChronology5.weekyears();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = iSOChronology5.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology5.yearOfCentury();
        boolean boolean10 = iSOChronology0.equals((java.lang.Object) iSOChronology5);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = iSOChronology0.add(readablePeriod11, (-113486044348000L), 2139);
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField17 = iSOChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = iSOChronology0.add(readablePeriod18, (long) 956, 53788949);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField6 and durationField17", (durationField6.compareTo(durationField17) == 0) == durationField6.equals(durationField17));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) ' ', dateTimeZone23);
        int int28 = dateTimeZone23.getOffsetFromLocal((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime11.toMutableDateTime(dateTimeZone23);
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.now(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone2);
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DurationField durationField5 = iSOChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField5", (durationField1.compareTo(durationField5) == 0) == durationField1.equals(durationField5));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        int int17 = dateTime16.getCenturyOfEra();
        org.joda.time.DateTime dateTime19 = dateTime16.withWeekOfWeekyear(21);
        org.joda.time.Instant instant20 = dateTime16.toInstant();
        org.joda.time.MutableDateTime mutableDateTime21 = instant20.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Instant instant24 = instant20.withDurationAdded(readableDuration22, 18600032);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime21", (dateTime11.compareTo(mutableDateTime21) == 0) == dateTime11.equals(mutableDateTime21));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime20 = instant16.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean22 = instant16.isSupported(dateTimeFieldType21);
        org.joda.time.Chronology chronology23 = instant16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = instant16.toMutableDateTimeISO();
        int int25 = mutableDateTime24.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
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
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        org.joda.time.DateTime.Property property23 = dateTime21.millisOfDay();
        org.joda.time.DateTime dateTime24 = property23.withMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant22", (dateTime21.compareTo(instant22) == 0) == dateTime21.equals(instant22));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Instant instant21 = instant16.withMillis((long) 999);
        org.joda.time.Instant instant24 = instant16.withDurationAdded((long) 77, 657);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Instant instant26 = instant16.plus(readableDuration25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant26.plus(readableDuration27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant28", (dateTime11.compareTo(instant28) == 0) == dateTime11.equals(instant28));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant22 = instant16.minus((long) 59);
        org.joda.time.Instant instant24 = instant22.plus(1645095426798L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone2);
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField4", (durationField1.compareTo(durationField4) == 0) == durationField1.equals(durationField4));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.minuteOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DurationField durationField5 = iSOChronology0.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField4", (durationField5.compareTo(durationField4) == 0) == durationField5.equals(durationField4));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfYear();
        boolean boolean18 = dateTime16.isAfterNow();
        org.joda.time.DateTime dateTime20 = dateTime16.plusMillis(20);
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology21.era();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology21);
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology21.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology21.dayOfWeek();
        org.joda.time.DurationField durationField26 = iSOChronology21.weeks();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology21.millisOfDay();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology21.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology21.clockhourOfDay();
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology21);
        org.joda.time.DateTime dateTime31 = dateTime20.toDateTime((org.joda.time.Chronology) iSOChronology21);
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology21.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime31", (dateTime20.compareTo(dateTime31) == 0) == dateTime20.equals(dateTime31));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DurationField durationField2 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType4.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField7 = iSOChronology6.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField((org.joda.time.Chronology) iSOChronology6);
        org.joda.time.DurationField durationField9 = dateTimeField8.getDurationField();
        int int12 = dateTimeField8.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate19 = localDate17.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        boolean boolean21 = localDate17.isSupported(durationFieldType20);
        int[] intArray23 = new int[] { (short) 10 };
        int int24 = dateTimeField8.getMaximumValue((org.joda.time.ReadablePartial) localDate17, intArray23);
        org.joda.time.LocalDate.Property property25 = localDate17.yearOfCentury();
        int int26 = localDate17.size();
        org.joda.time.LocalDate localDate28 = localDate17.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate.Property property29 = localDate28.monthOfYear();
        org.joda.time.LocalDate localDate30 = property29.getLocalDate();
        int int31 = localDate30.getWeekyear();
        org.joda.time.LocalDate localDate33 = localDate30.withYearOfEra(42970913);
        org.joda.time.chrono.ISOChronology iSOChronology34 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField35 = iSOChronology34.weekyears();
        org.joda.time.DateTimeZone dateTimeZone36 = iSOChronology34.getZone();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(dateTimeZone38);
        org.joda.time.LocalDate localDate41 = localDate39.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate43 = localDate41.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property44 = localDate41.weekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = localDate41.toString(dateTimeFormatter45);
        long long48 = iSOChronology34.set((org.joda.time.ReadablePartial) localDate41, (long) 349200000);
        org.joda.time.DurationField durationField49 = iSOChronology34.centuries();
        org.joda.time.DateTimeField dateTimeField50 = iSOChronology34.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType52 = dateTimeFieldType51.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology53 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField54 = iSOChronology53.weekyears();
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType51.getField((org.joda.time.Chronology) iSOChronology53);
        org.joda.time.DurationField durationField56 = dateTimeField55.getDurationField();
        int int59 = dateTimeField55.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate(dateTimeZone61);
        org.joda.time.LocalDate localDate64 = localDate62.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate66 = localDate64.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType67 = org.joda.time.DurationFieldType.years();
        boolean boolean68 = localDate64.isSupported(durationFieldType67);
        int[] intArray70 = new int[] { (short) 10 };
        int int71 = dateTimeField55.getMaximumValue((org.joda.time.ReadablePartial) localDate64, intArray70);
        org.joda.time.LocalDate.Property property72 = localDate64.yearOfCentury();
        int int73 = localDate64.size();
        int[] intArray75 = iSOChronology34.get((org.joda.time.ReadablePartial) localDate64, (long) 59);
        iSOChronology0.validate((org.joda.time.ReadablePartial) localDate30, intArray75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField7", Math.signum(durationField2.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField2)));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.minuteOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DurationField durationField5 = iSOChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField5", (durationField1.compareTo(durationField5) == 0) == durationField1.equals(durationField5));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField7 = iSOChronology0.months();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeZone dateTimeZone10 = iSOChronology8.getZone();
        long long12 = dateTimeZone10.nextTransition((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long16 = dateTimeZone14.previousTransition((long) (-1));
        long long20 = dateTimeZone14.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale22 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str23 = dateTimeZone14.getShortName((long) '#', locale22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime26 = dateTime24.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime28 = dateTime26.minusDays(35);
        boolean boolean30 = dateTime28.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime33 = dateTime28.withDurationAdded((long) 11, 16);
        org.joda.time.DateTime.Property property34 = dateTime33.minuteOfDay();
        org.joda.time.DateTime dateTime35 = property34.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property36 = dateTime35.dayOfMonth();
        boolean boolean37 = dateTimeZone10.equals((java.lang.Object) dateTime35);
        org.joda.time.Chronology chronology38 = iSOChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField39 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology0.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField39", (durationField1.compareTo(durationField39) == 0) == durationField1.equals(durationField39));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime20 = instant16.toMutableDateTime();
        java.util.GregorianCalendar gregorianCalendar21 = mutableDateTime20.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
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
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        org.joda.time.DateTime.Property property23 = dateTime21.millisOfDay();
        org.joda.time.DateTime dateTime25 = dateTime21.withYearOfCentury(7);
        org.joda.time.DateTime.Property property26 = dateTime25.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant22", (dateTime21.compareTo(instant22) == 0) == dateTime21.equals(instant22));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded(readableDuration14, 14);
        java.util.Locale locale17 = java.util.Locale.JAPAN;
        java.lang.String str18 = locale17.getScript();
        java.util.Calendar calendar19 = dateTime13.toCalendar(locale17);
        org.joda.time.Instant instant20 = dateTime13.toInstant();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime13.plus(readablePeriod21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant20", (dateTime22.compareTo(instant20) == 0) == dateTime22.equals(instant20));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.minusMonths(0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long14 = dateTimeZone12.previousTransition((long) (-1));
        long long18 = dateTimeZone12.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = dateTimeZone12.getShortName((long) '#', locale20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime24 = dateTime22.minusHours((int) (short) 100);
        int int25 = dateTime22.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property26 = dateTime22.monthOfYear();
        org.joda.time.Instant instant27 = dateTime22.toInstant();
        boolean boolean29 = instant27.isEqual((long) 30);
        org.joda.time.DateTime dateTime30 = instant27.toDateTime();
        org.joda.time.Instant instant32 = instant27.plus((long) 8);
        int int33 = property10.getDifference((org.joda.time.ReadableInstant) instant32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant27", (dateTime22.compareTo(instant27) == 0) == dateTime22.equals(instant27));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = iSOChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology2.minuteOfHour();
        long long10 = iSOChronology2.add((long) 53655688, (long) 16, 839);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology2.year();
        org.joda.time.DurationField durationField13 = dateTimeField12.getDurationField();
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = iSOChronology15.weekyears();
        org.joda.time.DateTimeZone dateTimeZone17 = iSOChronology15.getZone();
        org.joda.time.DurationField durationField18 = iSOChronology15.seconds();
        org.joda.time.DurationField durationField19 = iSOChronology15.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology15.millisOfSecond();
        java.util.Locale locale25 = new java.util.Locale("AM", "2022-02-21T14:54:09.980", "21");
        java.lang.String str26 = dateTimeField20.getAsShortText((-349200000L), locale25);
        java.lang.String str27 = dateTimeField12.getAsText((long) 789, locale25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField13", (durationField3.compareTo(durationField13) == 0) == durationField3.equals(durationField13));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.era();
        org.joda.time.DurationField durationField5 = iSOChronology0.halfdays();
        org.joda.time.DurationField durationField6 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField3, and durationField5", !(durationField6.compareTo(durationField3) == 0) || (Math.signum(durationField6.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = iSOChronology0.eras();
        java.lang.String str8 = iSOChronology0.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField7", Math.signum(durationField5.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField5)));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime8 = property6.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime10 = property6.setCopy(59);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.getLocalDateTime();
        java.lang.String str13 = property11.toString();
        org.joda.time.LocalDateTime localDateTime14 = property11.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long18 = dateTimeZone16.previousTransition((long) (-1));
        long long22 = dateTimeZone16.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str25 = dateTimeZone16.getShortName((long) '#', locale24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime28 = dateTime26.minusHours((int) (short) 100);
        int int29 = dateTime26.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property30 = dateTime26.monthOfYear();
        org.joda.time.Instant instant31 = dateTime26.toInstant();
        org.joda.time.DateTime dateTime33 = dateTime26.minusSeconds(53724700);
        int int34 = property11.getDifference((org.joda.time.ReadableInstant) dateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant31", (dateTime26.compareTo(instant31) == 0) == dateTime26.equals(instant31));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime20 = dateTime15.withDurationAdded((long) 11, 16);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        org.joda.time.DateTime dateTime22 = property21.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime23 = dateTime22.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone26);
        long long30 = dateTimeZone25.getMillisKeepLocal(dateTimeZone26, (long) 22);
        java.lang.String str31 = dateTimeZone25.toString();
        java.lang.String str33 = dateTimeZone25.getName(0L);
        long long35 = dateTimeZone25.previousTransition((long) 32770);
        org.joda.time.DateTime dateTime36 = dateTime23.toDateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime36", (dateTime22.compareTo(dateTime36) == 0) == dateTime22.equals(dateTime36));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        calendar2.roll(11, false);
        java.util.TimeZone timeZone6 = calendar2.getTimeZone();
        boolean boolean7 = calendar2.isWeekDateSupported();
        java.util.TimeZone timeZone8 = calendar2.getTimeZone();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone10 = calendar9.getTimeZone();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone10);
        calendar11.roll(11, false);
        calendar11.setLenient(false);
        int int18 = calendar11.getMinimum(0);
        int int19 = calendar11.getWeekYear();
        java.util.TimeZone timeZone20 = calendar11.getTimeZone();
        java.util.Calendar.Builder builder21 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder23 = builder21.setInstant((long) (short) 10);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone25 = calendar24.getTimeZone();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone27 = calendar26.getTimeZone();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone27);
        boolean boolean29 = timeZone25.hasSameRules(timeZone27);
        java.util.Calendar.Builder builder30 = builder23.setTimeZone(timeZone25);
        boolean boolean31 = timeZone20.hasSameRules(timeZone25);
        boolean boolean32 = timeZone8.hasSameRules(timeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar11", (calendar2.compareTo(calendar11) == 0) == calendar2.equals(calendar11));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime20 = dateTime15.withDurationAdded((long) 11, 16);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        org.joda.time.DateTime dateTime22 = property21.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime23 = dateTime22.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone26);
        long long30 = dateTimeZone25.getMillisKeepLocal(dateTimeZone26, (long) 22);
        java.lang.String str31 = dateTimeZone25.toString();
        java.lang.String str33 = dateTimeZone25.getName(0L);
        long long35 = dateTimeZone25.previousTransition((long) 32770);
        org.joda.time.DateTime dateTime36 = dateTime23.toDateTime(dateTimeZone25);
        org.joda.time.DateTime.Property property37 = dateTime23.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime36", (dateTime23.compareTo(dateTime36) == 0) == dateTime23.equals(dateTime36));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        long long29 = dateTimeZone23.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale31 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str32 = dateTimeZone23.getShortName((long) '#', locale31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime35 = dateTime33.minusHours((int) (short) 100);
        int int36 = dateTime33.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property37 = dateTime33.monthOfYear();
        org.joda.time.Instant instant38 = dateTime33.toInstant();
        boolean boolean40 = instant38.isEqual((long) 30);
        org.joda.time.DateTime dateTime41 = instant38.toDateTime();
        org.joda.time.DateTime dateTime42 = instant38.toDateTimeISO();
        org.joda.time.Instant instant44 = instant38.minus((long) 45);
        boolean boolean45 = dateTime15.equals((java.lang.Object) instant38);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Instant instant47 = instant38.minus(readableDuration46);
        org.joda.time.Instant instant50 = instant38.withDurationAdded(4809368759L, 833);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime41", (dateTime11.compareTo(dateTime41) == 0) == dateTime11.equals(dateTime41));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime localDateTime6 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = property5.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = property5.addToCopy(349200000);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withWeekyear(636);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone13.previousTransition((long) (-1));
        long long19 = dateTimeZone13.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str22 = dateTimeZone13.getShortName((long) '#', locale21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime25 = dateTime23.minusHours((int) (short) 100);
        int int26 = dateTime23.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property27 = dateTime23.monthOfYear();
        org.joda.time.Instant instant28 = dateTime23.toInstant();
        boolean boolean30 = instant28.isEqual((long) 30);
        boolean boolean31 = instant28.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime32 = instant28.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean34 = instant28.isSupported(dateTimeFieldType33);
        org.joda.time.DateTime dateTime35 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) instant28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and mutableDateTime32", (dateTime23.compareTo(mutableDateTime32) == 0) == dateTime23.equals(mutableDateTime32));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTimeISO();
        java.util.Date date20 = instant16.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime19", (dateTime11.compareTo(dateTime19) == 0) == dateTime11.equals(dateTime19));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        int int16 = dateTime11.getMinuteOfDay();
        org.joda.time.DateTime dateTime18 = dateTime11.plusWeeks(657);
        org.joda.time.DateMidnight dateMidnight19 = dateTime11.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate26 = localDate24.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property27 = localDate24.weekyear();
        org.joda.time.LocalDate localDate28 = property27.roundFloorCopy();
        org.joda.time.LocalDate localDate30 = property27.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate32 = localDate30.minus(readablePeriod31);
        org.joda.time.LocalDate.Property property33 = localDate32.weekOfWeekyear();
        org.joda.time.LocalDate.Property property34 = localDate32.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property34.getFieldType();
        int int36 = dateTime11.get(dateTimeFieldType35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology39 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField40 = iSOChronology39.weekyears();
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType37.getField((org.joda.time.Chronology) iSOChronology39);
        org.joda.time.DurationField durationField42 = iSOChronology39.hours();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology39.dayOfYear();
        org.joda.time.DurationField durationField44 = iSOChronology39.hours();
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology39.dayOfMonth();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((java.lang.Object) dateTime11, (org.joda.time.Chronology) iSOChronology39);
        org.joda.time.DateTimeField dateTimeField47 = iSOChronology39.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology4 = iSOChronology0.withUTC();
        org.joda.time.DurationField durationField5 = iSOChronology0.eras();
        org.joda.time.DurationField durationField6 = iSOChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField6, and durationField5", !(durationField5.compareTo(durationField6) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField6.compareTo(durationField5))));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime20 = instant16.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean22 = instant16.isSupported(dateTimeFieldType21);
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.monthOfYear();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology23.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology23.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime30 = instant16.toMutableDateTime((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Instant instant33 = instant16.withDurationAdded(readableDuration31, 31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime20", (dateTime11.compareTo(mutableDateTime20) == 0) == dateTime11.equals(mutableDateTime20));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
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
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField22 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField1, and durationField4", !(durationField22.compareTo(durationField1) == 0) || (Math.signum(durationField22.compareTo(durationField4)) == Math.signum(durationField1.compareTo(durationField4))));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(1);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        boolean boolean32 = instant15.isBefore((org.joda.time.ReadableInstant) dateTime28);
        long long33 = instant15.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime16", (dateTime11.compareTo(mutableDateTime16) == 0) == dateTime11.equals(mutableDateTime16));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long5 = dateTimeZone3.previousTransition((long) (-1));
        long long9 = dateTimeZone3.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = dateTimeZone3.getShortName((long) '#', locale11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime15 = dateTime13.minusHours((int) (short) 100);
        int int16 = dateTime13.getWeekOfWeekyear();
        org.joda.time.Instant instant17 = dateTime13.toInstant();
        int int18 = dateTime13.getMinuteOfDay();
        int int19 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime dateTime20 = localTime1.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = iSOChronology22.weekyears();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(1L, (org.joda.time.Chronology) iSOChronology22);
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology22.weekyear();
        org.joda.time.DateTime dateTime26 = dateTime13.withChronology((org.joda.time.Chronology) iSOChronology22);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology22.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant17", (dateTime13.compareTo(instant17) == 0) == dateTime13.equals(instant17));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime4.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long9 = dateTimeZone7.previousTransition((long) (-1));
        long long13 = dateTimeZone7.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale15 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str16 = dateTimeZone7.getShortName((long) '#', locale15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime19 = dateTime17.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime21 = dateTime19.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology22.era();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology22);
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology22.weekyearOfCentury();
        int int26 = dateTime21.get(dateTimeField25);
        org.joda.time.DateMidnight dateMidnight27 = dateTime21.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long31 = dateTimeZone29.previousTransition((long) (-1));
        long long35 = dateTimeZone29.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale37 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str38 = dateTimeZone29.getShortName((long) '#', locale37);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime41 = dateTime39.minusHours((int) (short) 100);
        int int42 = dateTime39.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property43 = dateTime39.monthOfYear();
        org.joda.time.Instant instant44 = dateTime39.toInstant();
        boolean boolean46 = instant44.isEqual((long) 30);
        org.joda.time.DateTime dateTime47 = instant44.toDateTime();
        org.joda.time.DateTime dateTime48 = instant44.toDateTimeISO();
        org.joda.time.Instant instant50 = instant44.minus((long) 45);
        boolean boolean51 = dateTime21.equals((java.lang.Object) instant44);
        boolean boolean52 = dateTime5.isBefore((org.joda.time.ReadableInstant) instant44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime47", (dateTime5.compareTo(dateTime47) == 0) == dateTime5.equals(dateTime47));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.year();
        org.joda.time.LocalDate localDate5 = localDate2.withYear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType6.getField((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.DurationField durationField11 = dateTimeField10.getDurationField();
        int int14 = dateTimeField10.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        boolean boolean23 = localDate19.isSupported(durationFieldType22);
        int[] intArray25 = new int[] { (short) 10 };
        int int26 = dateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) localDate19, intArray25);
        java.util.Locale locale28 = null;
        java.lang.String str29 = localDate19.toString("2022", locale28);
        org.joda.time.LocalDate localDate31 = localDate19.withYearOfEra(40);
        int int32 = localDate19.getWeekyear();
        org.joda.time.LocalDate localDate33 = localDate2.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate36 = localDate19.withPeriodAdded(readablePeriod34, 789);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(dateTimeZone38);
        org.joda.time.LocalDate localDate41 = localDate39.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long45 = dateTimeZone43.previousTransition((long) (-1));
        long long49 = dateTimeZone43.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = dateTimeZone43.getShortName((long) '#', locale51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime55 = dateTime53.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime57 = dateTime55.minusDays(35);
        org.joda.time.DateTime dateTime58 = localDate39.toDateTime((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime.Property property59 = dateTime57.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology60 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField61 = iSOChronology60.weekyears();
        org.joda.time.DurationField durationField62 = iSOChronology60.halfdays();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology60.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField64 = iSOChronology60.dayOfYear();
        org.joda.time.DateTime dateTime65 = dateTime57.toDateTime((org.joda.time.Chronology) iSOChronology60);
        org.joda.time.DateTime dateTime66 = localDate36.toDateTime((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.MutableDateTime mutableDateTime67 = dateTime65.toMutableDateTime();
        org.joda.time.TimeOfDay timeOfDay68 = dateTime65.toTimeOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime57 and mutableDateTime67", (dateTime57.compareTo(mutableDateTime67) == 0) == dateTime57.equals(mutableDateTime67));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTimeISO();
        org.joda.time.Instant instant21 = instant16.withMillis((long) 30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime19", (dateTime11.compareTo(dateTime19) == 0) == dateTime11.equals(dateTime19));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        calendar0.setFirstDayOfWeek(100);
        int int5 = calendar0.getFirstDayOfWeek();
        boolean boolean6 = calendar0.isWeekDateSupported();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone8 = calendar7.getTimeZone();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone8);
        calendar9.roll(11, false);
        calendar9.setLenient(true);
        java.util.TimeZone timeZone15 = calendar9.getTimeZone();
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone15);
        boolean boolean17 = calendar0.after((java.lang.Object) calendar16);
        calendar16.setFirstDayOfWeek(364);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar7", (calendar0.compareTo(calendar7) == 0) == calendar0.equals(calendar7));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long5 = dateTimeZone3.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) ' ', dateTimeZone3);
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        int int9 = localTime6.compareTo((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        boolean boolean12 = localTime8.isAfter((org.joda.time.ReadablePartial) localTime11);
        int int13 = localTime11.getMillisOfSecond();
        org.joda.time.Chronology chronology14 = localTime11.getChronology();
        org.joda.time.DateTime dateTime15 = localTime11.toDateTimeToday();
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = iSOChronology16.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.hourOfDay();
        org.joda.time.DurationField durationField20 = iSOChronology16.centuries();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long24 = dateTimeZone22.previousTransition((long) (-1));
        long long28 = dateTimeZone22.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = dateTimeZone22.getShortName((long) '#', locale30);
        org.joda.time.Chronology chronology32 = iSOChronology16.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField33 = chronology32.secondOfMinute();
        org.joda.time.DateTime dateTime34 = dateTime15.toDateTime(chronology32);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) 5819, chronology32);
        org.joda.time.LocalTime.Property property36 = localTime35.minuteOfHour();
        org.joda.time.LocalTime localTime38 = localTime35.minusMillis(28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime34", (dateTime15.compareTo(dateTime34) == 0) == dateTime15.equals(dateTime34));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime20.plusSeconds(21);
        org.joda.time.DateTime dateTime26 = dateTime24.withSecondOfMinute((int) (byte) 1);
        org.joda.time.LocalDate localDate27 = dateTime24.toLocalDate();
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField29 = iSOChronology28.weekyears();
        org.joda.time.DateTimeZone dateTimeZone30 = iSOChronology28.getZone();
        org.joda.time.DurationField durationField31 = iSOChronology28.seconds();
        org.joda.time.DurationField durationField32 = iSOChronology28.halfdays();
        org.joda.time.DurationField durationField33 = iSOChronology28.months();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime24.toMutableDateTime((org.joda.time.Chronology) iSOChronology28);
        org.joda.time.DurationField durationField35 = iSOChronology28.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and mutableDateTime34", (dateTime24.compareTo(mutableDateTime34) == 0) == dateTime24.equals(mutableDateTime34));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = iSOChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology2.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology2.add(readablePeriod9, (long) 2022, (-292275054));
        org.joda.time.DurationField durationField13 = iSOChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField5", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate22 = localDate20.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property23 = localDate20.weekyear();
        java.lang.String str24 = property23.getAsString();
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField26 = iSOChronology25.weekyears();
        org.joda.time.DateTimeZone dateTimeZone27 = iSOChronology25.getZone();
        boolean boolean28 = property23.equals((java.lang.Object) iSOChronology25);
        org.joda.time.DateTime dateTime29 = dateTime13.toDateTime((org.joda.time.Chronology) iSOChronology25);
        org.joda.time.DateTime dateTime31 = dateTime13.withYearOfEra(7);
        org.joda.time.DateTime dateTime33 = dateTime13.withCenturyOfEra(486);
        boolean boolean34 = dateTime13.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long38 = dateTimeZone36.previousTransition((long) (-1));
        long long42 = dateTimeZone36.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale44 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str45 = dateTimeZone36.getShortName((long) '#', locale44);
        long long48 = dateTimeZone36.convertLocalToUTC((long) (-292275054), true);
        org.joda.time.DateTime dateTime49 = dateTime13.toDateTime(dateTimeZone36);
        org.joda.time.DateTime.Property property50 = dateTime49.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and dateTime29", (dateTime49.compareTo(dateTime29) == 0) == dateTime49.equals(dateTime29));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(1);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        boolean boolean32 = instant15.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.MutableDateTime mutableDateTime33 = instant15.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant36 = instant15.withDurationAdded(readableDuration34, 16);
        org.joda.time.Instant instant38 = instant15.plus(1645455425389L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime16", (dateTime11.compareTo(mutableDateTime16) == 0) == dateTime11.equals(mutableDateTime16));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant23 = instant16.withDurationAdded((long) 25, 4);
        org.joda.time.Chronology chronology24 = instant23.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField25 = iSOChronology24.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType22.getField((org.joda.time.Chronology) iSOChronology24);
        org.joda.time.DurationField durationField27 = dateTimeField26.getDurationField();
        org.joda.time.DurationFieldType durationFieldType28 = durationField27.getType();
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField30 = iSOChronology29.weekyears();
        org.joda.time.DateTimeZone dateTimeZone31 = iSOChronology29.getZone();
        org.joda.time.DurationField durationField32 = iSOChronology29.seconds();
        org.joda.time.DurationField durationField33 = iSOChronology29.hours();
        boolean boolean34 = durationFieldType28.isSupported((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.DateTime dateTime35 = dateTime21.toDateTime((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.DurationField durationField36 = iSOChronology29.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime35", (dateTime21.compareTo(dateTime35) == 0) == dateTime21.equals(dateTime35));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
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
        org.joda.time.Instant instant18 = instant16.minus((long) 'u');
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant16.plus(readableDuration19);
        long long21 = instant16.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.year();
        org.joda.time.LocalDate localDate5 = localDate2.withYear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType6.getField((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.DurationField durationField11 = dateTimeField10.getDurationField();
        int int14 = dateTimeField10.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        boolean boolean23 = localDate19.isSupported(durationFieldType22);
        int[] intArray25 = new int[] { (short) 10 };
        int int26 = dateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) localDate19, intArray25);
        java.util.Locale locale28 = null;
        java.lang.String str29 = localDate19.toString("2022", locale28);
        org.joda.time.LocalDate localDate31 = localDate19.withYearOfEra(40);
        int int32 = localDate19.getWeekyear();
        org.joda.time.LocalDate localDate33 = localDate2.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate36 = localDate19.withPeriodAdded(readablePeriod34, 789);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(dateTimeZone38);
        org.joda.time.LocalDate localDate41 = localDate39.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long45 = dateTimeZone43.previousTransition((long) (-1));
        long long49 = dateTimeZone43.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = dateTimeZone43.getShortName((long) '#', locale51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime55 = dateTime53.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime57 = dateTime55.minusDays(35);
        org.joda.time.DateTime dateTime58 = localDate39.toDateTime((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime.Property property59 = dateTime57.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology60 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField61 = iSOChronology60.weekyears();
        org.joda.time.DurationField durationField62 = iSOChronology60.halfdays();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology60.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField64 = iSOChronology60.dayOfYear();
        org.joda.time.DateTime dateTime65 = dateTime57.toDateTime((org.joda.time.Chronology) iSOChronology60);
        org.joda.time.DateTime dateTime66 = localDate36.toDateTime((org.joda.time.ReadableInstant) dateTime65);
        int int67 = dateTime66.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime57 and dateTime65", (dateTime57.compareTo(dateTime65) == 0) == dateTime57.equals(dateTime65));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField25 = iSOChronology24.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType22.getField((org.joda.time.Chronology) iSOChronology24);
        org.joda.time.DurationField durationField27 = dateTimeField26.getDurationField();
        org.joda.time.DurationFieldType durationFieldType28 = durationField27.getType();
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField30 = iSOChronology29.weekyears();
        org.joda.time.DateTimeZone dateTimeZone31 = iSOChronology29.getZone();
        org.joda.time.DurationField durationField32 = iSOChronology29.seconds();
        org.joda.time.DurationField durationField33 = iSOChronology29.hours();
        boolean boolean34 = durationFieldType28.isSupported((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.DateTime dateTime35 = dateTime21.toDateTime((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.DurationField durationField36 = iSOChronology29.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime35", (dateTime21.compareTo(dateTime35) == 0) == dateTime21.equals(dateTime35));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        long long29 = dateTimeZone23.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale31 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str32 = dateTimeZone23.getShortName((long) '#', locale31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime35 = dateTime33.minusHours((int) (short) 100);
        int int36 = dateTime33.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property37 = dateTime33.monthOfYear();
        org.joda.time.Instant instant38 = dateTime33.toInstant();
        boolean boolean40 = instant38.isEqual((long) 30);
        org.joda.time.DateTime dateTime41 = instant38.toDateTime();
        org.joda.time.DateTime dateTime42 = instant38.toDateTimeISO();
        org.joda.time.Instant instant44 = instant38.minus((long) 45);
        boolean boolean45 = dateTime15.equals((java.lang.Object) instant38);
        org.joda.time.DateTime dateTime47 = dateTime15.withMillisOfDay(10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant38", (dateTime11.compareTo(instant38) == 0) == dateTime11.equals(instant38));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
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
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) ' ', dateTimeZone23);
        int int28 = dateTimeZone23.getOffsetFromLocal((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime11.toMutableDateTime(dateTimeZone23);
        int int30 = dateTime11.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime29", (instant16.compareTo(mutableDateTime29) == 0) == instant16.equals(mutableDateTime29));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(1);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        boolean boolean32 = instant15.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.MutableDateTime mutableDateTime33 = instant15.toMutableDateTime();
        org.joda.time.Instant instant35 = instant15.plus((long) (-1));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime16", (dateTime11.compareTo(mutableDateTime16) == 0) == dateTime11.equals(mutableDateTime16));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = iSOChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology2.hourOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withWeekOfWeekyear(35);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withDayOfYear(25);
        java.util.Locale locale17 = java.util.Locale.JAPAN;
        java.lang.String str18 = locale17.getScript();
        java.util.Locale locale19 = java.util.Locale.TAIWAN;
        java.lang.String str20 = locale17.getDisplayVariant(locale19);
        java.lang.String str21 = dateTimeField7.getAsText((org.joda.time.ReadablePartial) localDateTime16, locale17);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime16.plusMinutes(32);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks(999);
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long30 = dateTimeZone28.previousTransition((long) (-1));
        long long34 = dateTimeZone28.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale36 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str37 = dateTimeZone28.getShortName((long) '#', locale36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours((int) (short) 100);
        int int41 = dateTime38.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property42 = dateTime38.monthOfYear();
        org.joda.time.DateTime dateTime43 = property42.getDateTime();
        int int44 = dateTime43.getCenturyOfEra();
        org.joda.time.DateTime dateTime46 = dateTime43.withWeekOfWeekyear(21);
        int int47 = dateTime46.getDayOfWeek();
        org.joda.time.DateTime dateTime49 = dateTime46.plusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours(12);
        org.joda.time.chrono.ISOChronology iSOChronology52 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone51);
        org.joda.time.DurationField durationField53 = iSOChronology52.eras();
        org.joda.time.DateTime dateTime54 = dateTime49.toDateTime((org.joda.time.Chronology) iSOChronology52);
        long long55 = property26.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField53", Math.signum(durationField3.compareTo(durationField53)) == -Math.signum(durationField53.compareTo(durationField3)));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Instant instant21 = instant16.withMillis((long) 999);
        org.joda.time.Instant instant24 = instant16.withDurationAdded((long) 77, 657);
        long long25 = instant24.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate22 = localDate20.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property23 = localDate20.weekyear();
        java.lang.String str24 = property23.getAsString();
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField26 = iSOChronology25.weekyears();
        org.joda.time.DateTimeZone dateTimeZone27 = iSOChronology25.getZone();
        boolean boolean28 = property23.equals((java.lang.Object) iSOChronology25);
        org.joda.time.DateTime dateTime29 = dateTime13.toDateTime((org.joda.time.Chronology) iSOChronology25);
        org.joda.time.DurationField durationField30 = iSOChronology25.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime29", (dateTime13.compareTo(dateTime29) == 0) == dateTime13.equals(dateTime29));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        int int17 = dateTime16.getCenturyOfEra();
        org.joda.time.DateTime dateTime19 = dateTime16.withWeekOfWeekyear(21);
        org.joda.time.Instant instant20 = dateTime16.toInstant();
        org.joda.time.Instant instant21 = dateTime16.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant20", (dateTime16.compareTo(instant20) == 0) == dateTime16.equals(instant20));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
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
        org.joda.time.DateTime dateTime22 = dateTime11.withDayOfMonth(10);
        org.joda.time.DateTime dateTime23 = dateTime22.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.yearOfCentury();
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.Chronology chronology4 = iSOChronology0.withUTC();
        org.joda.time.DurationField durationField5 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.year();
        org.joda.time.DurationField durationField7 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField3, and durationField5", !(durationField7.compareTo(durationField3) == 0) || (Math.signum(durationField7.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = instant15.toDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMillis(57325);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
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
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfWeek();
        org.joda.time.DateTime dateTime19 = dateTime16.withMillisOfSecond((int) (short) 1);
        int int20 = dateTime16.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone23);
        long long27 = dateTimeZone22.getMillisKeepLocal(dateTimeZone23, (long) 22);
        java.lang.String str28 = dateTimeZone22.toString();
        java.lang.String str30 = dateTimeZone22.getName(0L);
        int int32 = dateTimeZone22.getOffset((long) 100);
        org.joda.time.DateTime dateTime33 = dateTime16.toDateTime(dateTimeZone22);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime33", (dateTime16.compareTo(dateTime33) == 0) == dateTime16.equals(dateTime33));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long17 = dateTimeZone15.previousTransition((long) (-1));
        long long21 = dateTimeZone15.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale23 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str24 = dateTimeZone15.getShortName((long) '#', locale23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime27 = dateTime25.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime29 = dateTime27.minusDays(35);
        org.joda.time.DateTime dateTime30 = localDate11.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        boolean boolean32 = dateTime30.isAfter(1645750800000L);
        org.joda.time.YearMonthDay yearMonthDay33 = dateTime30.toYearMonthDay();
        int int34 = dateTime30.getYearOfCentury();
        long long35 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Instant instant36 = dateTime30.toInstant();
        org.joda.time.chrono.ISOChronology iSOChronology37 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField38 = iSOChronology37.weekyears();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology37.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology37.hourOfDay();
        org.joda.time.DurationField durationField41 = iSOChronology37.centuries();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long45 = dateTimeZone43.previousTransition((long) (-1));
        long long49 = dateTimeZone43.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = dateTimeZone43.getShortName((long) '#', locale51);
        org.joda.time.Chronology chronology53 = iSOChronology37.withZone(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean56 = dateTimeZone54.isStandardOffset((long) 0);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long60 = dateTimeZone54.getMillisKeepLocal(dateTimeZone58, (-1947974400000L));
        java.lang.Object obj61 = null;
        boolean boolean62 = dateTimeZone54.equals(obj61);
        long long64 = dateTimeZone43.getMillisKeepLocal(dateTimeZone54, (long) (byte) -1);
        org.joda.time.DateTime dateTime65 = instant36.toDateTime(dateTimeZone54);
        org.joda.time.chrono.ISOChronology iSOChronology66 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant36", (dateTime30.compareTo(instant36) == 0) == dateTime30.equals(instant36));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        java.util.Locale locale3 = new java.util.Locale("fra", "3", "10 Feb 1900 04:11:40 GMT");
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale3);
        java.util.TimeZone timeZone5 = calendar4.getTimeZone();
        java.util.Calendar.Builder builder6 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder10 = builder6.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder13 = builder6.set(2, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long18 = dateTimeZone16.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) ' ', dateTimeZone16);
        org.joda.time.LocalTime.Property property20 = localTime19.minuteOfHour();
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = property20.getAsText(locale21);
        java.util.Calendar.Builder builder23 = builder6.setLocale(locale21);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone25 = calendar24.getTimeZone();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone25);
        int int27 = timeZone25.getRawOffset();
        java.util.Calendar.Builder builder28 = builder23.setTimeZone(timeZone25);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone25);
        timeZone25.setID("21 Jan 2022 14:54:23 GMT");
        java.lang.String str32 = timeZone25.getID();
        boolean boolean33 = timeZone5.hasSameRules(timeZone25);
        timeZone25.setID("2022-02-21T14:54:38.700");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar24", (calendar4.compareTo(calendar24) == 0) == calendar4.equals(calendar24));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = iSOChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = iSOChronology2.days();
        org.joda.time.DurationField durationField11 = iSOChronology2.millis();
        java.lang.String str12 = iSOChronology2.toString();
        org.joda.time.DurationField durationField13 = iSOChronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField3, and durationField5", !(durationField13.compareTo(durationField3) == 0) || (Math.signum(durationField13.compareTo(durationField5)) == Math.signum(durationField3.compareTo(durationField5))));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone2);
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DurationField durationField5 = iSOChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField4", (durationField1.compareTo(durationField4) == 0) == durationField1.equals(durationField4));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
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
        org.joda.time.DateTime dateTime18 = dateTime11.withSecondOfMinute(7);
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = iSOChronology19.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology19.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology19.hourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology19);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.monthOfYear();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime27 = property25.addToCopy((long) 22);
        org.joda.time.Chronology chronology28 = localDateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.millisOfSecond();
        org.joda.time.DurationField durationField30 = chronology28.halfdays();
        org.joda.time.DateTime dateTime31 = dateTime11.toDateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField32 = chronology28.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        boolean boolean20 = instant16.isBeforeNow();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant16.minus(readableDuration21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime19", (dateTime11.compareTo(dateTime19) == 0) == dateTime11.equals(dateTime19));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        int int17 = dateTime16.getCenturyOfEra();
        org.joda.time.DateTime dateTime19 = dateTime16.withWeekOfWeekyear(21);
        org.joda.time.Instant instant20 = dateTime16.toInstant();
        org.joda.time.MutableDateTime mutableDateTime21 = instant20.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant20", (dateTime11.compareTo(instant20) == 0) == dateTime11.equals(instant20));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
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
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury(45);
        org.joda.time.Instant instant23 = dateTime15.toInstant();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long27 = dateTimeZone25.previousTransition((long) (-1));
        long long31 = dateTimeZone25.convertLocalToUTC((long) 'x', true, (long) 10);
        int int33 = dateTimeZone25.getOffset((long) '4');
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone25);
        int int36 = dateTimeZone25.getOffset(0L);
        long long38 = dateTimeZone25.convertUTCToLocal((-105235200000L));
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime15.toMutableDateTime(dateTimeZone25);
        org.joda.time.LocalDate localDate40 = org.joda.time.LocalDate.now(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant23", (dateTime15.compareTo(instant23) == 0) == dateTime15.equals(instant23));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DurationField durationField2 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(23, 0, 45);
        org.joda.time.LocalTime localTime10 = localTime8.withHourOfDay(23);
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfSecond(76);
        int[] intArray14 = iSOChronology0.get((org.joda.time.ReadablePartial) localTime12, (-1645451640000L));
        org.joda.time.DurationField durationField15 = iSOChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField2, durationField15, and durationField2", !(durationField2.compareTo(durationField15) == 0) || (Math.signum(durationField2.compareTo(durationField2)) == Math.signum(durationField15.compareTo(durationField2))));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime20 = instant16.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean22 = instant16.isSupported(dateTimeFieldType21);
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.monthOfYear();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology23.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology23.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime30 = instant16.toMutableDateTime((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.DateTime dateTime31 = instant16.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime30", (dateTime11.compareTo(mutableDateTime30) == 0) == dateTime11.equals(mutableDateTime30));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime17 = property15.addWrapFieldToCopy((-27424193));
        boolean boolean18 = dateTime17.isAfterNow();
        org.joda.time.DateTime dateTime20 = dateTime17.plusYears((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) ' ', dateTimeZone23);
        org.joda.time.LocalTime.Property property27 = localTime26.minuteOfHour();
        org.joda.time.LocalTime localTime29 = localTime26.withMillisOfSecond((int) (short) 0);
        int int30 = localTime29.getMillisOfSecond();
        org.joda.time.DateTime dateTime31 = localTime29.toDateTimeToday();
        org.joda.time.Instant instant32 = dateTime31.toInstant();
        boolean boolean33 = dateTime20.isAfter((org.joda.time.ReadableInstant) instant32);
        org.joda.time.Instant instant35 = instant32.withMillis(0L);
        org.joda.time.Instant instant37 = instant35.plus((long) 571);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant32", (dateTime31.compareTo(instant32) == 0) == dateTime31.equals(instant32));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.weekyearOfCentury();
        int int40 = dateTime35.get(dateTimeField39);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury(45);
        org.joda.time.DateTime dateTime44 = dateTime35.minusDays(10);
        boolean boolean45 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Chronology chronology46 = instant16.getChronology();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Instant instant48 = instant16.plus(readableDuration47);
        org.joda.time.Instant instant50 = instant48.withMillis((-11707199988L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant48", (dateTime11.compareTo(instant48) == 0) == dateTime11.equals(instant48));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime20.plusSeconds(21);
        org.joda.time.DateTime dateTime26 = dateTime20.minusDays((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate29.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate33 = localDate31.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(dateTimeZone35);
        org.joda.time.LocalDate localDate38 = localDate36.withEra(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType40 = dateTimeFieldType39.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology41 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField42 = iSOChronology41.weekyears();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType39.getField((org.joda.time.Chronology) iSOChronology41);
        org.joda.time.DurationField durationField44 = iSOChronology41.hours();
        boolean boolean45 = localDate38.equals((java.lang.Object) durationField44);
        boolean boolean46 = localDate33.isBefore((org.joda.time.ReadablePartial) localDate38);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long50 = dateTimeZone48.previousTransition((long) (-1));
        long long54 = dateTimeZone48.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale56 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str57 = dateTimeZone48.getShortName((long) '#', locale56);
        java.lang.String str58 = dateTimeZone48.getID();
        org.joda.time.DateTime dateTime59 = localDate33.toDateTimeAtMidnight(dateTimeZone48);
        org.joda.time.DateTime dateTime61 = dateTime59.withYearOfEra((int) 'a');
        int int62 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime61);
        boolean boolean64 = dateTime20.equals((java.lang.Object) (-20L));
        org.joda.time.LocalDate localDate65 = dateTime20.toLocalDate();
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(0L);
        org.joda.time.DateTime dateTime68 = dateTime67.toDateTime();
        org.joda.time.DateTime dateTime69 = dateTime68.toDateTimeISO();
        org.joda.time.Instant instant70 = dateTime68.toInstant();
        boolean boolean72 = instant70.isBefore((long) 353);
        org.joda.time.Instant instant73 = instant70.toInstant();
        int int74 = dateTime20.compareTo((org.joda.time.ReadableInstant) instant70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime67 and instant70", (dateTime67.compareTo(instant70) == 0) == dateTime67.equals(instant70));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDate.Property property6 = localDate5.weekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Instant instant8 = new org.joda.time.Instant(obj7);
        org.joda.time.DateTime dateTime9 = instant8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra(53708922);
        int int12 = property6.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDate localDate13 = property6.getLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime9", (instant8.compareTo(dateTime9) == 0) == instant8.equals(dateTime9));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Instant instant21 = instant16.plus((long) 8);
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
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
        int int23 = dateTime11.getMonthOfYear();
        org.joda.time.Instant instant24 = dateTime11.toInstant();
        org.joda.time.DateTime.Property property25 = dateTime11.hourOfDay();
        org.joda.time.DateTime dateTime26 = property25.getDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant16", (dateTime26.compareTo(instant16) == 0) == dateTime26.equals(instant16));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
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
        org.joda.time.DateTime dateTime24 = dateTime11.withYearOfCentury(16);
        int int25 = dateTime24.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime20.plusSeconds(21);
        org.joda.time.DateTime dateTime26 = dateTime24.withSecondOfMinute((int) (byte) 1);
        org.joda.time.DateTime dateTime27 = dateTime24.withLaterOffsetAtOverlap();
        int int28 = dateTime27.getSecondOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology29.era();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology29.yearOfCentury();
        org.joda.time.DurationField durationField32 = iSOChronology29.months();
        org.joda.time.Chronology chronology33 = iSOChronology29.withUTC();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology29.weekyearOfCentury();
        org.joda.time.DurationField durationField35 = iSOChronology29.days();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long39 = dateTimeZone37.previousTransition((long) (-1));
        long long43 = dateTimeZone37.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale45 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str46 = dateTimeZone37.getShortName((long) '#', locale45);
        java.lang.String str48 = locale45.getExtension('u');
        java.util.Locale locale49 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str50 = locale45.getDisplayName(locale49);
        boolean boolean51 = iSOChronology29.equals((java.lang.Object) locale49);
        org.joda.time.DateTimeField dateTimeField52 = iSOChronology29.year();
        org.joda.time.DateTime dateTime53 = dateTime27.toDateTime((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.DateTime dateTime54 = dateTime27.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime54 and dateTime53", (dateTime54.compareTo(dateTime53) == 0) == dateTime54.equals(dateTime53));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField5", Math.signum(durationField1.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField1)));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTimeZone dateTimeZone19 = instant16.getZone();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime20.plusSeconds(21);
        org.joda.time.DateTime dateTime26 = dateTime24.withSecondOfMinute((int) (byte) 1);
        org.joda.time.DateTime dateTime27 = dateTime24.withLaterOffsetAtOverlap();
        int int28 = dateTime27.getSecondOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology29.era();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology29.yearOfCentury();
        org.joda.time.DurationField durationField32 = iSOChronology29.months();
        org.joda.time.Chronology chronology33 = iSOChronology29.withUTC();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology29.weekyearOfCentury();
        org.joda.time.DurationField durationField35 = iSOChronology29.days();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long39 = dateTimeZone37.previousTransition((long) (-1));
        long long43 = dateTimeZone37.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale45 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str46 = dateTimeZone37.getShortName((long) '#', locale45);
        java.lang.String str48 = locale45.getExtension('u');
        java.util.Locale locale49 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str50 = locale45.getDisplayName(locale49);
        boolean boolean51 = iSOChronology29.equals((java.lang.Object) locale49);
        org.joda.time.DateTimeField dateTimeField52 = iSOChronology29.year();
        org.joda.time.DateTime dateTime53 = dateTime27.toDateTime((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now((org.joda.time.Chronology) iSOChronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime53", (dateTime24.compareTo(dateTime53) == 0) == dateTime24.equals(dateTime53));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime20 = instant16.toMutableDateTimeISO();
        boolean boolean22 = mutableDateTime20.isEqual((-16586152531200000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
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
        boolean boolean23 = dateTime21.isAfter(1645750800000L);
        org.joda.time.YearMonthDay yearMonthDay24 = dateTime21.toYearMonthDay();
        int int25 = dateTime21.getYearOfCentury();
        org.joda.time.DateTime.Property property26 = dateTime21.secondOfDay();
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        int int28 = property26.getMaximumTextLength(locale27);
        java.lang.String str29 = property26.getName();
        org.joda.time.DateTime dateTime30 = property26.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long34 = dateTimeZone32.previousTransition((long) (-1));
        long long38 = dateTimeZone32.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str41 = dateTimeZone32.getShortName((long) '#', locale40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime44 = dateTime42.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime46 = dateTime44.minusDays(35);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(dateTimeZone48);
        org.joda.time.LocalDate localDate51 = localDate49.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate53 = localDate51.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property54 = localDate51.weekyear();
        java.lang.String str55 = property54.getAsString();
        org.joda.time.chrono.ISOChronology iSOChronology56 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField57 = iSOChronology56.weekyears();
        org.joda.time.DateTimeZone dateTimeZone58 = iSOChronology56.getZone();
        boolean boolean59 = property54.equals((java.lang.Object) iSOChronology56);
        org.joda.time.DateTime dateTime60 = dateTime44.toDateTime((org.joda.time.Chronology) iSOChronology56);
        org.joda.time.DateTime dateTime62 = dateTime44.withYearOfEra(7);
        org.joda.time.DateTime dateTime64 = dateTime44.withCenturyOfEra(486);
        boolean boolean65 = dateTime44.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long69 = dateTimeZone67.previousTransition((long) (-1));
        long long73 = dateTimeZone67.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale75 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str76 = dateTimeZone67.getShortName((long) '#', locale75);
        long long79 = dateTimeZone67.convertLocalToUTC((long) (-292275054), true);
        org.joda.time.DateTime dateTime80 = dateTime44.toDateTime(dateTimeZone67);
        long long81 = property26.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime60", (dateTime18.compareTo(dateTime60) == 0) == dateTime18.equals(dateTime60));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        java.util.Locale locale3 = new java.util.Locale("fra", "3", "10 Feb 1900 04:11:40 GMT");
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale3);
        java.util.TimeZone timeZone5 = calendar4.getTimeZone();
        java.util.Calendar.Builder builder6 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder10 = builder6.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder13 = builder6.set(2, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long18 = dateTimeZone16.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) ' ', dateTimeZone16);
        org.joda.time.LocalTime.Property property20 = localTime19.minuteOfHour();
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = property20.getAsText(locale21);
        java.util.Calendar.Builder builder23 = builder6.setLocale(locale21);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone25 = calendar24.getTimeZone();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone25);
        int int27 = timeZone25.getRawOffset();
        java.util.Calendar.Builder builder28 = builder23.setTimeZone(timeZone25);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone25);
        timeZone25.setID("21 Jan 2022 14:54:23 GMT");
        java.lang.String str32 = timeZone25.getID();
        boolean boolean33 = timeZone5.hasSameRules(timeZone25);
        java.lang.Object obj34 = timeZone5.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar24", (calendar4.compareTo(calendar24) == 0) == calendar4.equals(calendar24));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.era();
        org.joda.time.DurationField durationField7 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField7", (durationField1.compareTo(durationField7) == 0) == durationField1.equals(durationField7));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
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
        org.joda.time.Instant instant18 = instant16.minus((long) 'u');
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.days();
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate25.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate29 = localDate27.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property30 = localDate27.weekyear();
        java.lang.String str31 = property30.getAsString();
        org.joda.time.chrono.ISOChronology iSOChronology32 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField33 = iSOChronology32.weekyears();
        org.joda.time.DateTimeZone dateTimeZone34 = iSOChronology32.getZone();
        boolean boolean35 = property30.equals((java.lang.Object) iSOChronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter22.withChronology((org.joda.time.Chronology) iSOChronology32);
        org.joda.time.DurationField durationField37 = iSOChronology32.millis();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology32.secondOfMinute();
        org.joda.time.DurationField durationField39 = durationFieldType19.getField((org.joda.time.Chronology) iSOChronology32);
        org.joda.time.DateTime dateTime40 = instant16.toDateTime((org.joda.time.Chronology) iSOChronology32);
        org.joda.time.Chronology chronology41 = dateTime40.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        boolean boolean20 = instant16.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) ' ', dateTimeZone23);
        org.joda.time.LocalTime.Property property27 = localTime26.minuteOfHour();
        org.joda.time.LocalTime localTime29 = localTime26.withMillisOfSecond((int) (short) 0);
        int int30 = localTime29.getMillisOfSecond();
        org.joda.time.DateTime dateTime31 = localTime29.toDateTimeToday();
        int int32 = instant16.compareTo((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        boolean boolean34 = dateTime31.isAfter(readableInstant33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate22 = localDate20.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property23 = localDate20.weekyear();
        java.lang.String str24 = property23.getAsString();
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField26 = iSOChronology25.weekyears();
        org.joda.time.DateTimeZone dateTimeZone27 = iSOChronology25.getZone();
        boolean boolean28 = property23.equals((java.lang.Object) iSOChronology25);
        org.joda.time.DateTime dateTime29 = dateTime13.toDateTime((org.joda.time.Chronology) iSOChronology25);
        org.joda.time.DateTime dateTime31 = dateTime13.withYearOfEra(7);
        org.joda.time.DateTime.Property property32 = dateTime13.weekOfWeekyear();
        java.lang.String str33 = property32.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime29", (dateTime13.compareTo(dateTime29) == 0) == dateTime13.equals(dateTime29));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology23.dayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime20.toDateTime((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.DateTime.Property property29 = dateTime20.weekOfWeekyear();
        boolean boolean30 = dateTime20.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime20.getZone();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long35 = dateTimeZone33.previousTransition((long) (-1));
        long long39 = dateTimeZone33.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale41 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str42 = dateTimeZone33.getShortName((long) '#', locale41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime45 = dateTime43.minusHours((int) (short) 100);
        int int46 = dateTime43.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property47 = dateTime43.monthOfYear();
        org.joda.time.Instant instant48 = dateTime43.toInstant();
        org.joda.time.DateTime dateTime50 = dateTime43.withSecondOfMinute(7);
        org.joda.time.DateTime dateTime51 = dateTime43.withTimeAtStartOfDay();
        int int52 = dateTimeZone31.getOffset((org.joda.time.ReadableInstant) dateTime51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant48", (dateTime16.compareTo(instant48) == 0) == dateTime16.equals(instant48));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate22 = localDate20.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property23 = localDate20.weekyear();
        java.lang.String str24 = property23.getAsString();
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField26 = iSOChronology25.weekyears();
        org.joda.time.DateTimeZone dateTimeZone27 = iSOChronology25.getZone();
        boolean boolean28 = property23.equals((java.lang.Object) iSOChronology25);
        org.joda.time.DateTime dateTime29 = dateTime13.toDateTime((org.joda.time.Chronology) iSOChronology25);
        org.joda.time.DateTime dateTime31 = dateTime13.withYearOfEra(7);
        org.joda.time.DateTime dateTime33 = dateTime13.withCenturyOfEra(486);
        boolean boolean34 = dateTime13.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long38 = dateTimeZone36.previousTransition((long) (-1));
        long long42 = dateTimeZone36.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale44 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str45 = dateTimeZone36.getShortName((long) '#', locale44);
        long long48 = dateTimeZone36.convertLocalToUTC((long) (-292275054), true);
        org.joda.time.DateTime dateTime49 = dateTime13.toDateTime(dateTimeZone36);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType51 = dateTimeFieldType50.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology52 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField53 = iSOChronology52.weekyears();
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType50.getField((org.joda.time.Chronology) iSOChronology52);
        org.joda.time.DurationField durationField55 = dateTimeField54.getDurationField();
        org.joda.time.DurationFieldType durationFieldType56 = durationField55.getType();
        org.joda.time.chrono.ISOChronology iSOChronology57 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField58 = iSOChronology57.weekyears();
        org.joda.time.DurationField durationField59 = iSOChronology57.minutes();
        org.joda.time.DateTimeField dateTimeField60 = iSOChronology57.era();
        boolean boolean61 = durationFieldType56.isSupported((org.joda.time.Chronology) iSOChronology57);
        org.joda.time.DurationField durationField62 = iSOChronology57.weeks();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology57.clockhourOfHalfday();
        org.joda.time.DateTime dateTime64 = dateTime13.toDateTime((org.joda.time.Chronology) iSOChronology57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and dateTime13", (dateTime29.compareTo(dateTime13) == 0) == dateTime29.equals(dateTime13));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField5 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField4", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField4)) == Math.signum(durationField1.compareTo(durationField4))));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
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
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime20.plusSeconds(21);
        org.joda.time.DateTime dateTime26 = dateTime24.withSecondOfMinute((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.plus(readablePeriod27);
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.Instant instant30 = dateTime28.toInstant();
        org.joda.time.DateTime dateTime31 = instant30.toDateTime();
        org.joda.time.Instant instant32 = instant30.toInstant();
        org.joda.time.Chronology chronology33 = instant32.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant32", (dateTime26.compareTo(instant32) == 0) == dateTime26.equals(instant32));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.Instant instant20 = instant16.toInstant();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant20.minus(readableDuration21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant22", (dateTime11.compareTo(instant22) == 0) == dateTime11.equals(instant22));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        int int16 = dateTime15.getMillisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime15.withYearOfEra(54);
        org.joda.time.DateTime dateTime20 = dateTime18.minusYears(100);
        org.joda.time.DateTime dateTime22 = dateTime20.plusYears((-27424193));
        int int23 = dateTime22.getDayOfYear();
        org.joda.time.DateTime.Property property24 = dateTime22.dayOfMonth();
        org.joda.time.DateTime dateTime26 = property24.addWrapFieldToCopy(1970);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long30 = dateTimeZone28.previousTransition((long) (-1));
        long long34 = dateTimeZone28.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale36 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str37 = dateTimeZone28.getShortName((long) '#', locale36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime42 = dateTime40.minusDays(35);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(dateTimeZone44);
        org.joda.time.LocalDate localDate47 = localDate45.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate49 = localDate47.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property50 = localDate47.weekyear();
        java.lang.String str51 = property50.getAsString();
        org.joda.time.chrono.ISOChronology iSOChronology52 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField53 = iSOChronology52.weekyears();
        org.joda.time.DateTimeZone dateTimeZone54 = iSOChronology52.getZone();
        boolean boolean55 = property50.equals((java.lang.Object) iSOChronology52);
        org.joda.time.DateTime dateTime56 = dateTime40.toDateTime((org.joda.time.Chronology) iSOChronology52);
        int int57 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime56", (dateTime13.compareTo(dateTime56) == 0) == dateTime13.equals(dateTime56));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant22 = instant16.minus((long) 45);
        org.joda.time.MutableDateTime mutableDateTime23 = instant16.toMutableDateTimeISO();
        boolean boolean25 = instant16.isAfter((long) 580);
        org.joda.time.DateTime dateTime26 = instant16.toDateTimeISO();
        org.joda.time.DateTime dateTime28 = dateTime26.withYear(43084258);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant22 = instant16.minus((long) 59);
        boolean boolean24 = instant22.isAfter((-14L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
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
        int int23 = dateTime11.getMonthOfYear();
        org.joda.time.DateTime dateTime25 = dateTime11.plusSeconds(53772862);
        int int26 = dateTime25.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        int int17 = dateTime16.getCenturyOfEra();
        org.joda.time.chrono.ISOChronology iSOChronology18 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = iSOChronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology18.year();
        org.joda.time.DateTime dateTime21 = dateTime16.toDateTime((org.joda.time.Chronology) iSOChronology18);
        org.joda.time.DateTime dateTime23 = dateTime21.minus((long) 57325);
        org.joda.time.DateTime dateTime24 = dateTime23.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime21", (dateTime11.compareTo(dateTime21) == 0) == dateTime11.equals(dateTime21));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
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
        int int23 = dateTime11.getMonthOfYear();
        org.joda.time.DateTime dateTime25 = dateTime11.plusMonths((int) (short) 100);
        org.joda.time.Instant instant26 = dateTime11.toInstant();
        org.joda.time.Instant instant28 = instant26.plus((long) 585);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
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
        org.joda.time.LocalDateTime localDateTime21 = dateTime11.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime11.minus(readableDuration22);
        org.joda.time.DateTime.Property property24 = dateTime11.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime11", (instant16.compareTo(dateTime11) == 0) == instant16.equals(dateTime11));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        calendar0.setFirstDayOfWeek(0);
        java.util.TimeZone timeZone4 = calendar0.getTimeZone();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone6 = calendar5.getTimeZone();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone6);
        timeZone6.setID("05:10:00.032");
        calendar0.setTimeZone(timeZone6);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar5", (calendar0.compareTo(calendar5) == 0) == calendar0.equals(calendar5));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
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
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury(45);
        org.joda.time.Instant instant23 = dateTime15.toInstant();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long27 = dateTimeZone25.previousTransition((long) (-1));
        long long31 = dateTimeZone25.convertLocalToUTC((long) 'x', true, (long) 10);
        int int33 = dateTimeZone25.getOffset((long) '4');
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone25);
        int int36 = dateTimeZone25.getOffset(0L);
        long long38 = dateTimeZone25.convertUTCToLocal((-105235200000L));
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime15.toMutableDateTime(dateTimeZone25);
        long long42 = dateTimeZone25.adjustOffset((-31506082475258L), false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant23", (dateTime15.compareTo(instant23) == 0) == dateTime15.equals(instant23));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime17 = property15.addWrapFieldToCopy((-27424193));
        boolean boolean18 = dateTime17.isAfterNow();
        org.joda.time.DateTime dateTime20 = dateTime17.plusYears((int) (byte) -1);
        org.joda.time.DateTime.Property property21 = dateTime17.weekyear();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone24.previousTransition((long) (-1));
        long long30 = dateTimeZone24.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale32 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str33 = dateTimeZone24.getShortName((long) '#', locale32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime36 = dateTime34.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime38 = dateTime36.minusDays(35);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(dateTimeZone40);
        org.joda.time.LocalDate localDate43 = localDate41.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate45 = localDate43.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property46 = localDate43.weekyear();
        java.lang.String str47 = property46.getAsString();
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField49 = iSOChronology48.weekyears();
        org.joda.time.DateTimeZone dateTimeZone50 = iSOChronology48.getZone();
        boolean boolean51 = property46.equals((java.lang.Object) iSOChronology48);
        org.joda.time.DateTime dateTime52 = dateTime36.toDateTime((org.joda.time.Chronology) iSOChronology48);
        boolean boolean53 = property21.equals((java.lang.Object) dateTime52);
        org.joda.time.DateTime dateTime54 = property21.roundFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime52", (dateTime13.compareTo(dateTime52) == 0) == dateTime13.equals(dateTime52));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        int int17 = dateTime16.getCenturyOfEra();
        org.joda.time.DateTime dateTime19 = dateTime16.withWeekOfWeekyear(21);
        org.joda.time.DateTime dateTime21 = dateTime16.plusHours((int) (short) 10);
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = iSOChronology22.weekyears();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology22.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology22.hourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology22);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withWeekOfWeekyear(35);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.hourOfDay();
        int int30 = localDateTime26.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.minusHours(918);
        org.joda.time.Chronology chronology33 = localDateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime16.toMutableDateTime(chronology33);
        int int36 = dateTime16.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and mutableDateTime35", (dateTime16.compareTo(mutableDateTime35) == 0) == dateTime16.equals(mutableDateTime35));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withEra(1);
        int int10 = localDate4.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean13 = dateTimeZone11.isStandardOffset((long) 0);
        org.joda.time.Interval interval14 = localDate4.toInterval(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = localDate4.toDateMidnight();
        org.joda.time.Instant instant16 = new org.joda.time.Instant((java.lang.Object) dateMidnight15);
        org.joda.time.Instant instant18 = instant16.minus(53691560L);
        org.joda.time.Instant instant20 = instant18.minus(14488988193007L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight15 and instant16", (dateMidnight15.compareTo(instant16) == 0) == dateMidnight15.equals(instant16));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
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
        org.joda.time.Instant instant19 = instant16.withDurationAdded((long) 643, 1970);
        org.joda.time.DateTime dateTime20 = instant16.toDateTime();
        org.joda.time.DateTime dateTime22 = dateTime20.withYear(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = iSOChronology20.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType18.getField((org.joda.time.Chronology) iSOChronology20);
        org.joda.time.DurationField durationField23 = dateTimeField22.getDurationField();
        int int26 = dateTimeField22.getDifference((long) 15, (long) 'x');
        int int28 = dateTimeField22.get((long) 32770);
        int int29 = dateTime15.get(dateTimeField22);
        org.joda.time.DateTime dateTime31 = dateTime15.plusMonths(10);
        org.joda.time.DateTime dateTime33 = dateTime15.plusHours(21);
        org.joda.time.DateTime dateTime35 = dateTime15.plusMinutes(2);
        java.lang.Object obj36 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(obj36, dateTimeZone38);
        java.lang.String str40 = dateTimeZone38.toString();
        long long42 = dateTimeZone38.nextTransition((long) 549);
        long long44 = dateTimeZone38.previousTransition((long) 44);
        org.joda.time.DateTime dateTime45 = dateTime15.withZone(dateTimeZone38);
        org.joda.time.chrono.ISOChronology iSOChronology46 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime45", (dateTime15.compareTo(dateTime45) == 0) == dateTime15.equals(dateTime45));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate22 = localDate20.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property23 = localDate20.weekyear();
        java.lang.String str24 = property23.getAsString();
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField26 = iSOChronology25.weekyears();
        org.joda.time.DateTimeZone dateTimeZone27 = iSOChronology25.getZone();
        boolean boolean28 = property23.equals((java.lang.Object) iSOChronology25);
        org.joda.time.DateTime dateTime29 = dateTime13.toDateTime((org.joda.time.Chronology) iSOChronology25);
        org.joda.time.DateTime dateTime31 = dateTime13.withYearOfEra(7);
        org.joda.time.DateTime dateTime33 = dateTime13.withYear(998);
        org.joda.time.DateTime dateTime35 = dateTime13.minusSeconds(41);
        org.joda.time.DateTime dateTime37 = dateTime35.withYearOfEra(218);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime29", (dateTime13.compareTo(dateTime29) == 0) == dateTime13.equals(dateTime29));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant22 = instant16.minus((long) 45);
        org.joda.time.Chronology chronology23 = instant22.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        int int16 = dateTime15.getMillisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime15.withYearOfEra(54);
        org.joda.time.DateTime dateTime20 = dateTime18.plusHours((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long24 = dateTimeZone22.previousTransition((long) (-1));
        long long28 = dateTimeZone22.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = dateTimeZone22.getShortName((long) '#', locale30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime34 = dateTime32.minusHours((int) (short) 100);
        int int35 = dateTime32.getWeekOfWeekyear();
        org.joda.time.Instant instant36 = dateTime32.toInstant();
        int int37 = dateTime32.getMinuteOfDay();
        org.joda.time.DateTime dateTime39 = dateTime32.plusWeeks(657);
        int int40 = dateTime18.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant36", (dateTime11.compareTo(instant36) == 0) == dateTime11.equals(instant36));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.weekyearOfCentury();
        int int40 = dateTime35.get(dateTimeField39);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury(45);
        org.joda.time.DateTime dateTime44 = dateTime35.minusDays(10);
        boolean boolean45 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime35);
        boolean boolean47 = instant16.isAfter((long) 741);
        org.joda.time.DateTime dateTime48 = instant16.toDateTime();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.Instant instant50 = instant16.plus(readableDuration49);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.Instant instant53 = instant16.withDurationAdded(readableDuration51, (int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant53", (dateTime11.compareTo(instant53) == 0) == dateTime11.equals(instant53));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
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
        org.joda.time.DateTime.Property property17 = dateTime11.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate20.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate25.withEra(1);
        int int28 = localDate22.compareTo((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate localDate30 = localDate25.plusWeeks(2);
        org.joda.time.LocalDate localDate32 = localDate25.plusDays(56);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate39 = localDate37.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.years();
        boolean boolean41 = localDate37.isSupported(durationFieldType40);
        org.joda.time.DateTime dateTime42 = localDate37.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property43 = dateTime42.yearOfEra();
        org.joda.time.DateTime dateTime45 = dateTime42.withSecondOfMinute((int) ' ');
        org.joda.time.DateTime dateTime46 = localDate25.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.LocalDate localDate47 = dateTime42.toLocalDate();
        org.joda.time.DateTime dateTime49 = dateTime42.withMonthOfYear(12);
        int int50 = property17.getDifference((org.joda.time.ReadableInstant) dateTime42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.Instant instant21 = instant16.withMillis((long) 999);
        org.joda.time.Instant instant23 = instant21.withMillis((long) 844);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.DateTime dateTime17 = dateTime11.minusHours(53819211);
        int int18 = dateTime17.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        int int17 = dateTime16.getCenturyOfEra();
        org.joda.time.DateTime dateTime19 = dateTime16.withWeekOfWeekyear(21);
        org.joda.time.Instant instant20 = dateTime16.toInstant();
        boolean boolean22 = instant20.isEqual((long) (-27424194));
        java.util.Date date23 = instant20.toDate();
        long long24 = date23.getTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant20", (dateTime11.compareTo(instant20) == 0) == dateTime11.equals(instant20));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
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
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long23 = dateTimeZone21.previousTransition((long) (-1));
        long long27 = dateTimeZone21.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str30 = dateTimeZone21.getShortName((long) '#', locale29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime33 = dateTime31.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.weekyearOfCentury();
        int int40 = dateTime35.get(dateTimeField39);
        org.joda.time.DateTime dateTime42 = dateTime35.withYearOfCentury(45);
        org.joda.time.DateTime dateTime44 = dateTime35.minusDays(10);
        boolean boolean45 = instant16.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Instant instant48 = instant16.withDurationAdded(readableDuration46, 1439);
        org.joda.time.MutableDateTime mutableDateTime49 = instant48.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant48", (dateTime11.compareTo(instant48) == 0) == dateTime11.equals(instant48));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 0, (org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean7 = dateTimeZone5.isStandardOffset((long) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long11 = dateTimeZone5.getMillisKeepLocal(dateTimeZone9, (-1947974400000L));
        org.joda.time.Chronology chronology12 = iSOChronology1.withZone(dateTimeZone9);
        java.lang.String str14 = dateTimeZone9.getNameKey(5317346412000L);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone9);
        boolean boolean16 = dateTimeZone9.isFixed();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        long long29 = dateTimeZone23.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale31 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str32 = dateTimeZone23.getShortName((long) '#', locale31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime35 = dateTime33.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime37 = dateTime35.minusDays(35);
        org.joda.time.DateTime dateTime38 = localDate19.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        int int39 = dateTime37.getDayOfWeek();
        org.joda.time.DateTime dateTime41 = dateTime37.withMillisOfSecond(100);
        org.joda.time.DateTime dateTime43 = dateTime41.minusYears(2);
        int int44 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) dateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime33", (dateTime15.compareTo(dateTime33) == 0) == dateTime15.equals(dateTime33));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
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
        org.joda.time.Instant instant18 = instant16.minus((long) 'u');
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology19.era();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology19);
        org.joda.time.DurationField durationField22 = iSOChronology19.months();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology19.weekyear();
        org.joda.time.DurationField durationField24 = iSOChronology19.halfdays();
        org.joda.time.DateTimeZone dateTimeZone25 = iSOChronology19.getZone();
        org.joda.time.DateTime dateTime26 = instant16.toDateTime(dateTimeZone25);
        org.joda.time.Instant instant29 = instant16.withDurationAdded((long) 53841493, 39540000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime26", (dateTime11.compareTo(dateTime26) == 0) == dateTime11.equals(dateTime26));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.era();
        org.joda.time.DurationField durationField9 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField9", (durationField1.compareTo(durationField9) == 0) == durationField1.equals(durationField9));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.era();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology16.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology16.millisOfSecond();
        java.lang.String str23 = iSOChronology16.toString();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology16.halfdayOfDay();
        org.joda.time.DateTime dateTime25 = dateTime11.toDateTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DurationField durationField26 = iSOChronology16.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime25", (dateTime11.compareTo(dateTime25) == 0) == dateTime11.equals(dateTime25));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField5 = iSOChronology0.months();
        org.joda.time.DurationField durationField6 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField7 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField4", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField4)) == Math.signum(durationField1.compareTo(durationField4))));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime20 = dateTime15.withDurationAdded((long) 11, 16);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        org.joda.time.DateTime dateTime22 = property21.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime23 = dateTime22.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone26);
        long long30 = dateTimeZone25.getMillisKeepLocal(dateTimeZone26, (long) 22);
        java.lang.String str31 = dateTimeZone25.toString();
        java.lang.String str33 = dateTimeZone25.getName(0L);
        long long35 = dateTimeZone25.previousTransition((long) 32770);
        org.joda.time.DateTime dateTime36 = dateTime23.toDateTime(dateTimeZone25);
        int int37 = dateTime23.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime36", (dateTime23.compareTo(dateTime36) == 0) == dateTime23.equals(dateTime36));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.Chronology chronology7 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField9 = iSOChronology0.millis();
        org.joda.time.DurationField durationField10 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField2", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("0");
        org.joda.time.Instant instant4 = instant1.withDurationAdded((long) 364, 1439);
        org.joda.time.Instant instant6 = instant4.plus((long) 27);
        org.joda.time.Instant instant7 = instant6.toInstant();
        org.joda.time.DateTime dateTime8 = instant6.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime9 = instant6.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime8", (instant6.compareTo(dateTime8) == 0) == instant6.equals(dateTime8));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.dayOfMonth();
        org.joda.time.DurationField durationField2 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.minuteOfHour();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = iSOChronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology5);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMinutes((int) 'a');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusWeeks((int) (byte) 1);
        int int14 = localDateTime13.getDayOfYear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy(23);
        org.joda.time.LocalDateTime localDateTime19 = property15.addToCopy((long) 59);
        org.joda.time.LocalDateTime localDateTime20 = property15.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime21 = property15.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks(22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusYears(140);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate29.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate33 = localDate31.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property34 = localDate33.dayOfMonth();
        java.util.Locale locale35 = java.util.Locale.ENGLISH;
        java.lang.String str36 = property34.getAsText(locale35);
        java.lang.String str37 = locale35.getDisplayLanguage();
        java.util.Locale locale38 = locale35.stripExtensions();
        java.lang.String str39 = locale35.getCountry();
        java.lang.String str40 = locale35.getISO3Language();
        java.lang.String str41 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) localDateTime25, 53891798, locale35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField6", (durationField3.compareTo(durationField6) == 0) == durationField3.equals(durationField6));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        int int4 = calendar0.getActualMinimum(0);
        calendar0.set(0, (-27424193), 918, 918, 25);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.chrono.ISOChronology iSOChronology12 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = iSOChronology12.weekyears();
        org.joda.time.DateTimeZone dateTimeZone14 = iSOChronology12.getZone();
        org.joda.time.DurationField durationField15 = iSOChronology12.seconds();
        org.joda.time.DurationField durationField16 = iSOChronology12.halfdays();
        org.joda.time.DurationField durationField17 = iSOChronology12.months();
        boolean boolean18 = calendar0.after((java.lang.Object) iSOChronology12);
        org.joda.time.DurationField durationField19 = iSOChronology12.months();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology12.monthOfYear();
        org.joda.time.DurationField durationField22 = iSOChronology12.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField13, and durationField15", !(durationField22.compareTo(durationField13) == 0) || (Math.signum(durationField22.compareTo(durationField15)) == Math.signum(durationField13.compareTo(durationField15))));
    }
}

