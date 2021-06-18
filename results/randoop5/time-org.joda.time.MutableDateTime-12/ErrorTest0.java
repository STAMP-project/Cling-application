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
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property4.getAsText(locale5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        int int11 = dateTime10.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        java.util.Locale locale11 = null;
        int int12 = property4.getMaximumShortTextLength(locale11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getWeekOfWeekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        mutableDateTime5.setZone(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.DateTimeField dateTimeField11 = property4.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = property4.getAsShortText(locale11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.DateTime dateTime18 = mutableDateTime13.toDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime7.toMutableDateTime(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        java.lang.String str5 = property4.getAsString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime();
        int int6 = mutableDateTime2.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime5", (instant3.compareTo(mutableDateTime5) == 0) == instant3.equals(mutableDateTime5));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundCeiling();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.secondOfMinute();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        mutableDateTime5.setZoneRetainFields(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.DurationField durationField11 = property4.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime13 = property4.add(999);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTimeISO();
        long long12 = dateTime10.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.secondOfMinute();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime5.weekyear();
        mutableDateTime5.setSecondOfMinute(1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.secondOfMinute();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime5.weekyear();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property12.getAsShortText(locale13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property13.getAsText(locale15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology18);
        mutableDateTime19.addMillis((int) 'a');
        int int22 = mutableDateTime19.getDayOfYear();
        java.util.Date date23 = mutableDateTime19.toDate();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now();
        int int25 = mutableDateTime24.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime24.add(readablePeriod26, (int) (byte) -1);
        int int29 = mutableDateTime19.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        java.lang.String str30 = mutableDateTime24.toString();
        long long31 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property13.getFieldType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) str4, dateTimeZone9);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        mutableDateTime14.setSecondOfDay((int) '#');
        int int18 = mutableDateTime11.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant15", (mutableDateTime2.compareTo(instant15) == 0) == mutableDateTime2.equals(instant15));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = property4.getAsText(locale11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime3 = property1.set((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableDateTime3.add(readablePeriod4, 20);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundCeiling();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property11.getAsText(locale13);
        org.joda.time.DateTimeField dateTimeField15 = property11.getField();
        int int16 = mutableDateTime3.get(dateTimeField15);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        mutableDateTime3.setZone(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime19", (instant10.compareTo(mutableDateTime19) == 0) == instant10.equals(mutableDateTime19));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) 20);
        org.joda.time.ReadableInstant readableInstant11 = null;
        long long12 = property4.getDifferenceAsLong(readableInstant11);
        org.joda.time.MutableDateTime mutableDateTime13 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime15 = property4.add(0);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        java.util.GregorianCalendar gregorianCalendar23 = mutableDateTime18.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property24.getFieldType();
        boolean boolean26 = mutableDateTime15.isSupported(dateTimeFieldType25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.yearOfCentury();
        java.lang.String str2 = property1.getAsString();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        mutableDateTime8.setSecondOfDay((int) (short) 0);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.centuryOfEra();
        boolean boolean12 = property1.equals((java.lang.Object) property11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant6", (mutableDateTime0.compareTo(instant6) == 0) == mutableDateTime0.equals(instant6));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        java.lang.String str8 = mutableDateTime7.toString();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now();
        int int10 = mutableDateTime9.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime9.add(readablePeriod11, (int) (byte) -1);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        mutableDateTime9.setChronology(chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology20);
        mutableDateTime7.setChronology(chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.secondOfMinute();
        long long12 = mutableDateTime5.getMillis();
        mutableDateTime5.setMinuteOfDay(24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        mutableDateTime2.addDays((int) '4');
        int int5 = mutableDateTime2.getRoundingMode();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.secondOfMinute();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.getMutableDateTime();
        boolean boolean23 = mutableDateTime14.isBefore((org.joda.time.ReadableInstant) mutableDateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant19", (mutableDateTime8.compareTo(instant19) == 0) == mutableDateTime8.equals(instant19));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        int int12 = mutableDateTime11.getCenturyOfEra();
        int int13 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime mutableDateTime14 = property4.roundFloor();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        mutableDateTime11.addDays((int) '4');
        int int14 = mutableDateTime11.getRoundingMode();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime11.toMutableDateTime(chronology21);
        mutableDateTime7.setChronology(chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.util.GregorianCalendar gregorianCalendar7 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property8.getFieldType();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfYear();
        boolean boolean17 = property8.equals((java.lang.Object) property16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        mutableDateTime7.setWeekOfWeekyear((int) '4');
        java.lang.Object obj15 = mutableDateTime7.clone();
        mutableDateTime7.addMonths((int) ' ');
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        java.util.GregorianCalendar gregorianCalendar25 = mutableDateTime20.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime20.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime7.property(dateTimeFieldType27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.secondOfMinute();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime5.weekyear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.secondOfMinute();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime5.weekyear();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime5.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTimeISO();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.hourOfDay();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        int int20 = mutableDateTime18.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        boolean boolean22 = mutableDateTime18.isSupported(dateTimeFieldType21);
        boolean boolean23 = mutableDateTime12.isAfter((org.joda.time.ReadableInstant) mutableDateTime18);
        int int24 = mutableDateTime18.getMillisOfDay();
        mutableDateTime18.setMinuteOfDay((int) (short) 10);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) str31, dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime18.toMutableDateTime(dateTimeZone36);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime43.getZone();
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone44);
        mutableDateTime39.setZoneRetainFields(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime8, dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime29", (instant3.compareTo(mutableDateTime29) == 0) == instant3.equals(mutableDateTime29));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime3 = property1.set((int) (short) 1);
        org.joda.time.DurationField durationField4 = property1.getDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property1.getField();
        org.joda.time.MutableDateTime mutableDateTime7 = property1.addWrapField((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now();
        int int9 = mutableDateTime8.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime8.add(readablePeriod10, (int) (byte) -1);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        mutableDateTime8.setChronology(chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology19);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(chronology19);
        boolean boolean24 = mutableDateTime22.isBefore((long) 6311871);
        boolean boolean25 = mutableDateTime7.isEqual((org.joda.time.ReadableInstant) mutableDateTime22);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime33 = property30.addWrapField((int) 'a');
        java.lang.String str34 = property30.getAsShortText();
        org.joda.time.DurationField durationField35 = property30.getDurationField();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.Instant instant39 = mutableDateTime38.toInstant();
        mutableDateTime38.setSecondOfDay((int) '#');
        int int42 = property30.compareTo((org.joda.time.ReadableInstant) mutableDateTime38);
        mutableDateTime22.setTime((org.joda.time.ReadableInstant) mutableDateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant29", (mutableDateTime8.compareTo(instant29) == 0) == mutableDateTime8.equals(instant29));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        mutableDateTime5.addDays(70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) 20);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        mutableDateTime13.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.hourOfDay();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        int int21 = mutableDateTime19.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = mutableDateTime19.isSupported(dateTimeFieldType22);
        boolean boolean24 = mutableDateTime13.isAfter((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime19.getZone();
        mutableDateTime10.setZone(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime3 = property1.set((int) (short) 1);
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfFloor();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTime dateTime14 = mutableDateTime9.toDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime3.toMutableDateTime(dateTimeZone13);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime23 = property20.addWrapField((int) 'a');
        mutableDateTime23.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime23.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime31 = property29.roundHalfFloor();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.Instant instant35 = mutableDateTime34.toInstant();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime34.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime37 = property36.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime39 = property36.addWrapField((int) 'a');
        mutableDateTime39.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        mutableDateTime39.setWeekOfWeekyear((int) '4');
        java.lang.Object obj47 = mutableDateTime39.clone();
        int int48 = mutableDateTime39.getYearOfCentury();
        boolean boolean49 = mutableDateTime31.isBefore((org.joda.time.ReadableInstant) mutableDateTime39);
        int int50 = mutableDateTime3.compareTo((org.joda.time.ReadableInstant) mutableDateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime12", (instant7.compareTo(mutableDateTime12) == 0) == instant7.equals(mutableDateTime12));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        int int15 = mutableDateTime14.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.centuryOfEra();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology18);
        mutableDateTime19.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.hourOfDay();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        int int27 = mutableDateTime25.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        boolean boolean29 = mutableDateTime25.isSupported(dateTimeFieldType28);
        boolean boolean30 = mutableDateTime19.isAfter((org.joda.time.ReadableInstant) mutableDateTime25);
        int int31 = mutableDateTime25.getMillisOfDay();
        mutableDateTime25.setMinuteOfDay((int) (short) 10);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((java.lang.Object) str38, dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime25.toMutableDateTime(dateTimeZone43);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone51);
        mutableDateTime46.setZoneRetainFields(dateTimeZone51);
        boolean boolean54 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime36", (instant3.compareTo(mutableDateTime36) == 0) == instant3.equals(mutableDateTime36));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        int int14 = property13.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.roundFloor();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) str20, dateTimeZone25);
        int int28 = mutableDateTime27.getDayOfYear();
        boolean boolean29 = mutableDateTime15.equals((java.lang.Object) mutableDateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        mutableDateTime5.addMinutes(12);
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime5.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfMonth();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.dayOfWeek();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        java.util.GregorianCalendar gregorianCalendar20 = mutableDateTime15.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime15.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property21.getFieldType();
        int int23 = mutableDateTime10.get(dateTimeFieldType22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime5.property(dateTimeFieldType22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime();
        mutableDateTime5.add(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        int int7 = mutableDateTime6.getWeekOfWeekyear();
        boolean boolean8 = mutableDateTime0.isEqual((org.joda.time.ReadableInstant) mutableDateTime6);
        mutableDateTime6.setTime((long) 6329976);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant4", (mutableDateTime0.compareTo(instant4) == 0) == mutableDateTime0.equals(instant4));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        mutableDateTime2.setZoneRetainFields(dateTimeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now();
        int int7 = mutableDateTime6.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime6.add(readablePeriod8, (int) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfMonth();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.dayOfWeek();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        java.util.GregorianCalendar gregorianCalendar21 = mutableDateTime16.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property22.getFieldType();
        int int24 = mutableDateTime11.get(dateTimeFieldType23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime6.property(dateTimeFieldType23);
        int int26 = mutableDateTime5.get(dateTimeFieldType23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.getMaximumValueOverall();
        org.joda.time.DurationField durationField9 = property4.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.roundFloor();
        mutableDateTime10.addMinutes(283);
        org.joda.time.Instant instant13 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now();
        int int15 = mutableDateTime14.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime14.add(readablePeriod16, (int) (byte) -1);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        mutableDateTime14.setChronology(chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(chronology25);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(chronology25);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        mutableDateTime28.setZone(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime10.toMutableDateTime(dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant13", (mutableDateTime10.compareTo(instant13) == 0) == mutableDateTime10.equals(instant13));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.getMaximumValueOverall();
        org.joda.time.DurationField durationField9 = property4.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.roundFloor();
        mutableDateTime10.addMinutes(283);
        org.joda.time.Instant instant13 = mutableDateTime10.toInstant();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        mutableDateTime16.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.hourOfDay();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        int int24 = mutableDateTime22.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = mutableDateTime22.isSupported(dateTimeFieldType25);
        boolean boolean27 = mutableDateTime16.isAfter((org.joda.time.ReadableInstant) mutableDateTime22);
        int int28 = mutableDateTime22.getMillisOfDay();
        mutableDateTime22.setMinuteOfDay((int) (short) 10);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((java.lang.Object) str35, dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime22.toMutableDateTime(dateTimeZone40);
        org.joda.time.Chronology chronology44 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime10.toMutableDateTime(chronology44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant13", (mutableDateTime10.compareTo(instant13) == 0) == mutableDateTime10.equals(instant13));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        mutableDateTime5.setSecondOfDay((int) (short) 0);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.centuryOfEra();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        int int19 = mutableDateTime18.getWeekOfWeekyear();
        boolean boolean20 = mutableDateTime12.isEqual((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12, dateTimeZone21);
        int int23 = property9.compareTo((org.joda.time.ReadableInstant) mutableDateTime12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.roundHalfFloor();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime23 = property20.addWrapField((int) 'a');
        mutableDateTime23.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        mutableDateTime23.setWeekOfWeekyear((int) '4');
        java.lang.Object obj31 = mutableDateTime23.clone();
        int int32 = mutableDateTime23.getYearOfCentury();
        boolean boolean33 = mutableDateTime15.isBefore((org.joda.time.ReadableInstant) mutableDateTime23);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.Instant instant37 = mutableDateTime36.toInstant();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime36.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime39 = property38.roundCeiling();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        int int44 = property38.getDifference((org.joda.time.ReadableInstant) mutableDateTime42);
        mutableDateTime42.add((long) ' ');
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.yearOfCentury();
        java.lang.String str49 = property48.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property48.getFieldType();
        boolean boolean51 = mutableDateTime42.isSupported(dateTimeFieldType50);
        boolean boolean52 = mutableDateTime23.isSupported(dateTimeFieldType50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime47", (instant3.compareTo(mutableDateTime47) == 0) == instant3.equals(mutableDateTime47));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology13);
        mutableDateTime14.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.hourOfDay();
        boolean boolean18 = mutableDateTime14.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime14.copy();
        java.util.Locale locale20 = null;
        java.util.Calendar calendar21 = mutableDateTime19.toCalendar(locale20);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime19.setDate((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime28 = property26.set((int) (short) 1);
        mutableDateTime28.setTime(4, 16, (int) (byte) 1, (int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.dayOfMonth();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime34.dayOfWeek();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        mutableDateTime39.add(readablePeriod42);
        java.util.GregorianCalendar gregorianCalendar44 = mutableDateTime39.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime39.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property45.getFieldType();
        int int47 = mutableDateTime34.get(dateTimeFieldType46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime28.property(dateTimeFieldType46);
        boolean boolean49 = mutableDateTime23.isSupported(dateTimeFieldType46);
        boolean boolean50 = mutableDateTime11.isSupported(dateTimeFieldType46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property13.getAsText(locale15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology18);
        mutableDateTime19.addMillis((int) 'a');
        int int22 = mutableDateTime19.getDayOfYear();
        java.util.Date date23 = mutableDateTime19.toDate();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now();
        int int25 = mutableDateTime24.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime24.add(readablePeriod26, (int) (byte) -1);
        int int29 = mutableDateTime19.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        java.lang.String str30 = mutableDateTime24.toString();
        long long31 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime24.dayOfYear();
        java.util.Locale locale33 = null;
        int int34 = property32.getMaximumTextLength(locale33);
        int int35 = property32.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        int int6 = mutableDateTime5.getDayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now();
        int int9 = mutableDateTime8.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime8.add(readablePeriod10, (int) (byte) -1);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        mutableDateTime8.setChronology(chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology19);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:24.291Z", chronology19);
        org.joda.time.DateTime dateTime23 = mutableDateTime5.toDateTime(chronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.secondOfMinute();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime5.weekyear();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.set((int) (short) 1);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfFloor();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.DateTime dateTime27 = mutableDateTime22.toDateTime(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime16.toMutableDateTime(dateTimeZone26);
        int int29 = property12.getDifference((org.joda.time.ReadableInstant) mutableDateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        boolean boolean3 = mutableDateTime0.isEqual((long) (byte) 0);
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfFloor();
        java.lang.String str10 = mutableDateTime9.toString();
        mutableDateTime9.addMinutes(12);
        java.util.GregorianCalendar gregorianCalendar13 = mutableDateTime9.toGregorianCalendar();
        mutableDateTime9.setMillisOfDay((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime9.add(readablePeriod16, (-1));
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.DateTimeField dateTimeField20 = mutableDateTime9.getRoundingField();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now();
        int int22 = mutableDateTime21.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime21.add(readablePeriod23, (int) (byte) -1);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        mutableDateTime21.setChronology(chronology32);
        boolean boolean34 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) mutableDateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime28", (instant7.compareTo(mutableDateTime28) == 0) == instant7.equals(mutableDateTime28));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        mutableDateTime5.setMillisOfSecond((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfMonth();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.dayOfWeek();
        mutableDateTime8.setSecondOfDay(15);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime8.toMutableDateTimeISO();
        int int14 = mutableDateTime8.getYear();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        mutableDateTime18.addDays((int) '4');
        int int21 = mutableDateTime18.getRoundingMode();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        int int27 = mutableDateTime24.getYearOfCentury();
        org.joda.time.Chronology chronology28 = mutableDateTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime18.toMutableDateTime(chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology28);
        mutableDateTime5.setChronology(chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.addWrapField(39);
        org.joda.time.MutableDateTime mutableDateTime7 = property4.roundHalfFloor();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property4.getAsText(locale8);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime12.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.yearOfCentury();
        int int19 = property4.compareTo((org.joda.time.ReadableInstant) mutableDateTime12);
        java.util.Locale locale20 = null;
        int int21 = property4.getMaximumShortTextLength(locale20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        java.util.Date date9 = dateTime8.toDate();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTime dateTime20 = mutableDateTime15.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = dateTime8.toDateTime(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) 20);
        org.joda.time.MutableDateTime mutableDateTime12 = property4.add((int) 'a');
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfMonth();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.dayOfWeek();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        java.util.GregorianCalendar gregorianCalendar27 = mutableDateTime22.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property28.getFieldType();
        int int30 = mutableDateTime17.get(dateTimeFieldType29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime16.property(dateTimeFieldType29);
        java.lang.String str32 = mutableDateTime16.toString();
        int int33 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        int int7 = mutableDateTime6.getWeekOfWeekyear();
        boolean boolean8 = mutableDateTime0.isEqual((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone9);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime18 = property15.addWrapField((int) 'a');
        mutableDateTime18.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        int int27 = mutableDateTime10.get(dateTimeFieldType26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant4", (mutableDateTime0.compareTo(instant4) == 0) == mutableDateTime0.equals(instant4));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundCeiling();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        boolean boolean11 = mutableDateTime9.isAfterNow();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) str16, dateTimeZone21);
        mutableDateTime9.setZone(dateTimeZone21);
        mutableDateTime6.setZoneRetainFields(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(0L, dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime9", (instant4.compareTo(mutableDateTime9) == 0) == instant4.equals(mutableDateTime9));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        boolean boolean10 = mutableDateTime8.isAfterNow();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) str15, dateTimeZone20);
        mutableDateTime8.setZone(dateTimeZone20);
        mutableDateTime5.setZoneRetainFields(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.DurationField durationField5 = property4.getLeapDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) 20);
        org.joda.time.ReadableInstant readableInstant11 = null;
        long long12 = property4.getDifferenceAsLong(readableInstant11);
        org.joda.time.MutableDateTime mutableDateTime13 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime15 = property4.add(0);
        org.joda.time.MutableDateTime mutableDateTime16 = property4.getMutableDateTime();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        java.util.Date date21 = mutableDateTime19.toDate();
        mutableDateTime16.setDate((org.joda.time.ReadableInstant) mutableDateTime19);
        mutableDateTime16.setYear(6329976);
        int int25 = mutableDateTime16.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property13.getAsText(locale15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology18);
        mutableDateTime19.addMillis((int) 'a');
        int int22 = mutableDateTime19.getDayOfYear();
        java.util.Date date23 = mutableDateTime19.toDate();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now();
        int int25 = mutableDateTime24.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime24.add(readablePeriod26, (int) (byte) -1);
        int int29 = mutableDateTime19.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        java.lang.String str30 = mutableDateTime24.toString();
        long long31 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime24.dayOfYear();
        java.util.Locale locale33 = null;
        int int34 = property32.getMaximumTextLength(locale33);
        org.joda.time.Interval interval35 = property32.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        int int13 = mutableDateTime11.getSecondOfMinute();
        int int14 = mutableDateTime11.getYearOfCentury();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime11.toMutableDateTime(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone19);
        long long24 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.util.Date date4 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.set((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime8.add(readablePeriod9, 20);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundCeiling();
        java.util.Locale locale18 = null;
        java.lang.String str19 = property16.getAsText(locale18);
        org.joda.time.DateTimeField dateTimeField20 = property16.getField();
        int int21 = mutableDateTime8.get(dateTimeField20);
        int int22 = mutableDateTime2.get(dateTimeField20);
        org.joda.time.DateTimeField dateTimeField23 = mutableDateTime2.getRoundingField();
        mutableDateTime2.addDays(31);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfMonth();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.dayOfWeek();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        java.util.GregorianCalendar gregorianCalendar36 = mutableDateTime31.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime31.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property37.getFieldType();
        int int39 = mutableDateTime26.get(dateTimeFieldType38);
        int int40 = mutableDateTime2.get(dateTimeFieldType38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime26", (instant15.compareTo(mutableDateTime26) == 0) == instant15.equals(mutableDateTime26));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfWeek();
        mutableDateTime0.setSecondOfDay(15);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime0.toMutableDateTimeISO();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime0.toMutableDateTime(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.toMutableDateTime();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        int int19 = property13.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
        int int20 = mutableDateTime17.getYearOfEra();
        mutableDateTime8.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime22.toMutableDateTime();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime26.add(readablePeriod29);
        java.util.GregorianCalendar gregorianCalendar31 = mutableDateTime26.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime26.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property32.getFieldType();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime22.property(dateTimeFieldType33);
        int int35 = mutableDateTime17.get(dateTimeFieldType33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant12", (mutableDateTime8.compareTo(instant12) == 0) == mutableDateTime8.equals(instant12));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime1.addSeconds(3);
        org.joda.time.Chronology chronology4 = mutableDateTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.copy();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        java.util.Date date11 = mutableDateTime9.toDate();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.set((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime15.add(readablePeriod16, 20);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundCeiling();
        java.util.Locale locale25 = null;
        java.lang.String str26 = property23.getAsText(locale25);
        org.joda.time.DateTimeField dateTimeField27 = property23.getField();
        int int28 = mutableDateTime15.get(dateTimeField27);
        int int29 = mutableDateTime9.get(dateTimeField27);
        int int30 = mutableDateTime5.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime5.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant22", (mutableDateTime9.compareTo(instant22) == 0) == mutableDateTime9.equals(instant22));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        boolean boolean7 = mutableDateTime2.isBefore(100L);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfEven();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        java.util.Date date14 = mutableDateTime12.toDate();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.set((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime18.add(readablePeriod19, 20);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundCeiling();
        java.util.Locale locale28 = null;
        java.lang.String str29 = property26.getAsText(locale28);
        org.joda.time.DateTimeField dateTimeField30 = property26.getField();
        int int31 = mutableDateTime18.get(dateTimeField30);
        int int32 = mutableDateTime12.get(dateTimeField30);
        int int33 = mutableDateTime9.get(dateTimeField30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant25", (mutableDateTime12.compareTo(instant25) == 0) == mutableDateTime12.equals(instant25));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        mutableDateTime5.setMillisOfSecond((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.hourOfDay();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        int int20 = mutableDateTime18.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        boolean boolean22 = mutableDateTime18.isSupported(dateTimeFieldType21);
        boolean boolean23 = mutableDateTime12.isAfter((org.joda.time.ReadableInstant) mutableDateTime18);
        int int24 = mutableDateTime18.getMillisOfDay();
        mutableDateTime18.setMinuteOfHour(2);
        int int27 = mutableDateTime18.getDayOfWeek();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime18.toMutableDateTime(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime9.toMutableDateTime(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime30", (instant3.compareTo(mutableDateTime30) == 0) == instant3.equals(mutableDateTime30));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfWeek();
        mutableDateTime0.setSecondOfDay(15);
        int int5 = mutableDateTime0.getWeekOfWeekyear();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.DateTime dateTime16 = mutableDateTime11.toDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime0.toMutableDateTime(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime14", (instant9.compareTo(mutableDateTime14) == 0) == instant9.equals(mutableDateTime14));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.copy();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.era();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        mutableDateTime6.setRounding(dateTimeField17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime();
        mutableDateTime5.setWeekOfWeekyear(47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        mutableDateTime2.addDays((int) '4');
        int int5 = mutableDateTime2.getRoundingMode();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology12);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.secondOfMinute();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime23 = property20.addWrapField((int) 'a');
        mutableDateTime23.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime23.millisOfSecond();
        int int30 = property29.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime31 = property29.roundFloor();
        mutableDateTime31.setWeekyear(31);
        boolean boolean34 = property15.equals((java.lang.Object) mutableDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant19", (mutableDateTime8.compareTo(instant19) == 0) == mutableDateTime8.equals(instant19));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        int int7 = mutableDateTime6.getWeekOfWeekyear();
        boolean boolean8 = mutableDateTime0.isEqual((org.joda.time.ReadableInstant) mutableDateTime6);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        int int19 = property13.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime17.add((long) ' ');
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.yearOfCentury();
        java.lang.String str24 = property23.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property23.getFieldType();
        boolean boolean26 = mutableDateTime17.isSupported(dateTimeFieldType25);
        boolean boolean27 = mutableDateTime0.isSupported(dateTimeFieldType25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime22", (instant4.compareTo(mutableDateTime22) == 0) == instant4.equals(mutableDateTime22));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime2.addSeconds(3);
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 6345190, chronology5);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundCeiling();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property12.getAsText(locale14);
        int int16 = property12.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime17 = property12.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.yearOfEra();
        mutableDateTime17.setDate(1606262400035L);
        mutableDateTime7.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant11", (mutableDateTime6.compareTo(instant11) == 0) == mutableDateTime6.equals(instant11));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.set((int) (short) 1);
        mutableDateTime9.setTime(4, 16, (int) (byte) 1, (int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfMonth();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.dayOfWeek();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        java.util.GregorianCalendar gregorianCalendar25 = mutableDateTime20.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime20.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        int int28 = mutableDateTime15.get(dateTimeFieldType27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime9.property(dateTimeFieldType27);
        boolean boolean30 = mutableDateTime5.isSupported(dateTimeFieldType27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundCeiling();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        boolean boolean16 = mutableDateTime14.isAfterNow();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) str21, dateTimeZone26);
        mutableDateTime14.setZone(dateTimeZone26);
        mutableDateTime11.setZoneRetainFields(dateTimeZone26);
        org.joda.time.DateTime dateTime31 = mutableDateTime5.toDateTime(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.setDate((-28393824324L));
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.yearOfCentury();
        java.lang.String str9 = property8.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        boolean boolean11 = mutableDateTime2.isSupported(dateTimeFieldType10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime7", (instant3.compareTo(mutableDateTime7) == 0) == instant3.equals(mutableDateTime7));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        java.util.Date date6 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now();
        int int8 = mutableDateTime7.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime7.add(readablePeriod9, (int) (byte) -1);
        int int12 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime7);
        java.lang.String str13 = mutableDateTime7.toString();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime21 = property18.addWrapField((int) 'a');
        java.lang.String str22 = mutableDateTime21.toString();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime30 = property27.addWrapField((int) 'a');
        mutableDateTime30.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime30.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime37 = property36.roundCeiling();
        java.util.Locale locale38 = null;
        java.lang.String str39 = property36.getAsText(locale38);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology41);
        mutableDateTime42.addMillis((int) 'a');
        int int45 = mutableDateTime42.getDayOfYear();
        java.util.Date date46 = mutableDateTime42.toDate();
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now();
        int int48 = mutableDateTime47.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableDateTime47.add(readablePeriod49, (int) (byte) -1);
        int int52 = mutableDateTime42.compareTo((org.joda.time.ReadableInstant) mutableDateTime47);
        java.lang.String str53 = mutableDateTime47.toString();
        long long54 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime47);
        mutableDateTime47.setTime((long) (short) 1);
        boolean boolean57 = mutableDateTime21.isBefore((org.joda.time.ReadableInstant) mutableDateTime47);
        boolean boolean58 = mutableDateTime7.isBefore((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        mutableDateTime21.add(readablePeriod59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant17", (mutableDateTime7.compareTo(instant17) == 0) == mutableDateTime7.equals(instant17));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        boolean boolean10 = mutableDateTime8.isAfterNow();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) str15, dateTimeZone20);
        mutableDateTime8.setZone(dateTimeZone20);
        mutableDateTime5.setZoneRetainFields(dateTimeZone20);
        int int25 = mutableDateTime5.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.secondOfMinute();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime5.weekyear();
        java.lang.String str13 = property12.getAsText();
        org.joda.time.Interval interval14 = property12.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        mutableDateTime9.addWeeks(10);
        boolean boolean16 = mutableDateTime5.isEqual((org.joda.time.ReadableInstant) mutableDateTime9);
        int int17 = mutableDateTime9.getEra();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        java.util.GregorianCalendar gregorianCalendar25 = mutableDateTime20.toGregorianCalendar();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        mutableDateTime28.addDays((int) '4');
        int int31 = mutableDateTime28.getRoundingMode();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        int int37 = mutableDateTime34.getYearOfCentury();
        org.joda.time.Chronology chronology38 = mutableDateTime34.getChronology();
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime28.toMutableDateTime(chronology38);
        mutableDateTime20.setChronology(chronology38);
        org.joda.time.DateTime dateTime41 = mutableDateTime9.toDateTime(chronology38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        mutableDateTime5.setSecondOfDay((int) (short) 0);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.centuryOfEra();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfCeiling();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.minuteOfHour();
        long long15 = mutableDateTime13.getMillis();
        mutableDateTime13.addYears((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.centuryOfEra();
        boolean boolean19 = mutableDateTime10.equals((java.lang.Object) property18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.secondOfDay();
        mutableDateTime2.addMonths((int) 'a');
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (short) -1, dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 6368642, dateTimeZone13);
        org.joda.time.DateTime dateTime18 = mutableDateTime2.toDateTime(dateTimeZone13);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfFloor();
        mutableDateTime24.setSecondOfDay((int) (short) 0);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime24.centuryOfEra();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime24.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfCeiling();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.Instant instant33 = mutableDateTime32.toInstant();
        mutableDateTime32.setSecondOfDay((int) '#');
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.Instant instant39 = mutableDateTime38.toInstant();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime38.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime41 = property40.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime43 = property40.addWrapField((int) 'a');
        mutableDateTime43.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime43.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime50 = property49.roundCeiling();
        org.joda.time.DateTimeField dateTimeField51 = property49.getField();
        int int52 = mutableDateTime32.get(dateTimeField51);
        mutableDateTime29.setRounding(dateTimeField51);
        mutableDateTime2.setRounding(dateTimeField51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant22", (mutableDateTime12.compareTo(instant22) == 0) == mutableDateTime12.equals(instant22));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) 20);
        org.joda.time.ReadableInstant readableInstant11 = null;
        long long12 = property4.getDifferenceAsLong(readableInstant11);
        org.joda.time.MutableDateTime mutableDateTime13 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime15 = property4.add(0);
        int int16 = mutableDateTime15.getMillisOfSecond();
        mutableDateTime15.addDays(0);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        java.util.Date date23 = mutableDateTime21.toDate();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime27 = property25.set((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime27.add(readablePeriod28, 20);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundCeiling();
        java.util.Locale locale37 = null;
        java.lang.String str38 = property35.getAsText(locale37);
        org.joda.time.DateTimeField dateTimeField39 = property35.getField();
        int int40 = mutableDateTime27.get(dateTimeField39);
        int int41 = mutableDateTime21.get(dateTimeField39);
        mutableDateTime15.setRounding(dateTimeField39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        mutableDateTime2.add((long) '4');
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.set((int) (short) 1);
        mutableDateTime12.setTime(4, 16, (int) (byte) 1, (int) (byte) 1);
        boolean boolean18 = mutableDateTime12.isAfterNow();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime21.addSeconds(3);
        org.joda.time.Chronology chronology24 = mutableDateTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 6345190, chronology24);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime12.toMutableDateTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(chronology24);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime2.toMutableDateTime(chronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime25", (instant3.compareTo(mutableDateTime25) == 0) == instant3.equals(mutableDateTime25));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        mutableDateTime5.setMillisOfSecond((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.yearOfEra();
        int int9 = mutableDateTime5.getSecondOfMinute();
        boolean boolean11 = mutableDateTime5.isAfter(0L);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.set((int) (short) 1);
        mutableDateTime15.setTime(4, 16, (int) (byte) 1, (int) (byte) 1);
        boolean boolean21 = mutableDateTime15.isAfterNow();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime24.addSeconds(3);
        org.joda.time.Chronology chronology27 = mutableDateTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(chronology27);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) 6345190, chronology27);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime15.toMutableDateTime(chronology27);
        org.joda.time.DateTime dateTime31 = mutableDateTime5.toDateTime(chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        mutableDateTime2.add((long) '4');
        int int9 = mutableDateTime2.getHourOfDay();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        boolean boolean19 = mutableDateTime17.isAfterNow();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((java.lang.Object) str24, dateTimeZone29);
        mutableDateTime17.setZone(dateTimeZone29);
        mutableDateTime13.setZoneRetainFields(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((-28393521215L), dateTimeZone29);
        mutableDateTime2.setZone(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        mutableDateTime5.setMillisOfSecond((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.yearOfCentury();
        java.lang.String str12 = property11.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property11.getFieldType();
        boolean boolean14 = mutableDateTime9.isSupported(dateTimeFieldType13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone11);
        mutableDateTime12.setTime(1L);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.DateTime dateTime19 = mutableDateTime12.toDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime6.toMutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:46:01.406Z", dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime10", (instant4.compareTo(mutableDateTime10) == 0) == instant4.equals(mutableDateTime10));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:46:07.964Z");
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:15.745Z");
        mutableDateTime3.addHours(5);
        mutableDateTime3.setDate((-28393836952L));
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.millisOfSecond();
        org.joda.time.DateTime dateTime9 = mutableDateTime3.toDateTime();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundCeiling();
        java.util.Locale locale16 = null;
        java.lang.String str17 = property14.getAsText(locale16);
        org.joda.time.DateTimeField dateTimeField18 = property14.getField();
        org.joda.time.MutableDateTime mutableDateTime20 = property14.add((long) 20);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        int int23 = mutableDateTime3.get(dateTimeField22);
        int int24 = mutableDateTime1.get(dateTimeField22);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.yearOfCentury();
        java.lang.String str27 = property26.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property26.getFieldType();
        boolean boolean29 = mutableDateTime1.isSupported(dateTimeFieldType28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime25", (instant13.compareTo(mutableDateTime25) == 0) == instant13.equals(mutableDateTime25));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.setMillis((long) (byte) -1);
        int int7 = mutableDateTime2.getRoundingMode();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.toMutableDateTime();
        mutableDateTime8.setSecondOfDay(10);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime8.toMutableDateTime();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone4);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime5.toMutableDateTime(dateTimeZone9);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundCeiling();
        java.util.Locale locale17 = null;
        java.lang.String str18 = property15.getAsText(locale17);
        org.joda.time.DateTimeField dateTimeField19 = property15.getField();
        org.joda.time.MutableDateTime mutableDateTime21 = property15.add((long) 20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        long long23 = property15.getDifferenceAsLong(readableInstant22);
        org.joda.time.MutableDateTime mutableDateTime24 = property15.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime26 = property15.add((long) 970);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.Instant instant30 = mutableDateTime29.toInstant();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime29.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime32 = property31.roundHalfFloor();
        java.lang.String str33 = mutableDateTime32.toString();
        mutableDateTime32.setMillis((long) 105);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime32.secondOfMinute();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.Instant instant40 = mutableDateTime39.toInstant();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime39.monthOfYear();
        mutableDateTime39.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.yearOfCentury();
        boolean boolean45 = mutableDateTime32.equals((java.lang.Object) property44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property44.getFieldType();
        mutableDateTime26.set(dateTimeFieldType46, 18);
        int int49 = mutableDateTime10.get(dateTimeFieldType46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant14", (mutableDateTime3.compareTo(instant14) == 0) == mutableDateTime3.equals(instant14));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.Instant instant13 = mutableDateTime7.toInstant();
        int int14 = mutableDateTime7.getRoundingMode();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant13", (mutableDateTime7.compareTo(instant13) == 0) == mutableDateTime7.equals(instant13));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.getMaximumValueOverall();
        org.joda.time.DurationField durationField9 = property4.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.roundFloor();
        mutableDateTime10.addMinutes(283);
        org.joda.time.Instant instant13 = mutableDateTime10.toInstant();
        int int14 = mutableDateTime10.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant13", (mutableDateTime10.compareTo(instant13) == 0) == mutableDateTime10.equals(instant13));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.DateTime dateTime11 = mutableDateTime6.toDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 6439001, dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime9", (instant4.compareTo(mutableDateTime9) == 0) == instant4.equals(mutableDateTime9));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.setMillis((long) (byte) -1);
        int int7 = mutableDateTime2.getRoundingMode();
        mutableDateTime2.setDate(1606262415090L);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfMonth();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.dayOfWeek();
        mutableDateTime11.setSecondOfDay(15);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime11.toMutableDateTimeISO();
        mutableDateTime11.setMinuteOfHour(10);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime11.toMutableDateTime(chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 25, chronology25);
        org.joda.time.DateTime dateTime28 = mutableDateTime2.toDateTime(chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = mutableDateTime8.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = mutableDateTime8.isSupported(dateTimeFieldType11);
        boolean boolean13 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        int int14 = mutableDateTime8.getMillisOfDay();
        mutableDateTime8.setMinuteOfDay((int) (short) 10);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) str21, dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime8.toMutableDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology30 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology30);
        org.joda.time.Instant instant32 = mutableDateTime31.toInstant();
        int int33 = mutableDateTime31.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant32", (mutableDateTime19.compareTo(instant32) == 0) == mutableDateTime19.equals(instant32));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:15.745Z");
        mutableDateTime1.addHours(5);
        mutableDateTime1.setDate((-28393836952L));
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.millisOfSecond();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime1.add(readablePeriod8);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTime dateTime20 = mutableDateTime15.toDateTime(dateTimeZone19);
        mutableDateTime1.setZoneRetainFields(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime18", (instant13.compareTo(mutableDateTime18) == 0) == instant13.equals(mutableDateTime18));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        boolean boolean6 = mutableDateTime5.isEqualNow();
        java.util.Date date7 = mutableDateTime5.toDate();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime5.toMutableDateTime();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        int int14 = mutableDateTime11.getYearOfCentury();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology15);
        org.joda.time.DateTime dateTime17 = mutableDateTime5.toDateTime(chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone10);
        mutableDateTime11.setTime(1L);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.DateTime dateTime18 = mutableDateTime11.toDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime5.toMutableDateTime(dateTimeZone17);
        mutableDateTime19.setWeekyear(59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime3 = property1.set((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableDateTime3.add(readablePeriod4, 20);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundCeiling();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property11.getAsText(locale13);
        org.joda.time.DateTimeField dateTimeField15 = property11.getField();
        int int16 = mutableDateTime3.get(dateTimeField15);
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime3.toGregorianCalendar();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        int int27 = mutableDateTime24.getYearOfCentury();
        org.joda.time.Chronology chronology28 = mutableDateTime24.getChronology();
        int int29 = mutableDateTime24.getWeekOfWeekyear();
        boolean boolean30 = instant21.isAfter((org.joda.time.ReadableInstant) mutableDateTime24);
        boolean boolean31 = mutableDateTime3.equals((java.lang.Object) mutableDateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime20", (instant10.compareTo(mutableDateTime20) == 0) == instant10.equals(mutableDateTime20));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        mutableDateTime7.setWeekOfWeekyear((int) '4');
        java.lang.Object obj15 = mutableDateTime7.clone();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundCeiling();
        java.util.Locale locale22 = null;
        java.lang.String str23 = property20.getAsText(locale22);
        org.joda.time.DateTimeField dateTimeField24 = property20.getField();
        org.joda.time.MutableDateTime mutableDateTime26 = property20.add((long) 20);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = property27.getField();
        mutableDateTime7.setRounding(dateTimeField28);
        boolean boolean31 = mutableDateTime7.isAfter((long) 6357078);
        mutableDateTime7.addMillis(13);
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now();
        int int35 = mutableDateTime34.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime34.add(readablePeriod36, (int) (byte) -1);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        int int44 = mutableDateTime41.getYearOfCentury();
        org.joda.time.Chronology chronology45 = mutableDateTime41.getChronology();
        mutableDateTime34.setChronology(chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(chronology45);
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime7.toMutableDateTime(chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and mutableDateTime34", (instant19.compareTo(mutableDateTime34) == 0) == instant19.equals(mutableDateTime34));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        int int15 = mutableDateTime14.getMinuteOfHour();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone20);
        org.joda.time.DateTime dateTime22 = mutableDateTime21.toDateTime();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        int int27 = mutableDateTime25.getSecondOfMinute();
        int int28 = mutableDateTime25.getYearOfCentury();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime25.toMutableDateTime(dateTimeZone33);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology38);
        mutableDateTime39.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime39.hourOfDay();
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = mutableDateTime45.getZone();
        int int47 = mutableDateTime45.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        boolean boolean49 = mutableDateTime45.isSupported(dateTimeFieldType48);
        boolean boolean50 = mutableDateTime39.isAfter((org.joda.time.ReadableInstant) mutableDateTime45);
        int int51 = mutableDateTime45.getMillisOfDay();
        mutableDateTime45.setMinuteOfDay((int) (short) 10);
        java.lang.Object obj54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(obj54, chronology55);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = null;
        java.lang.String str58 = mutableDateTime56.toString(dateTimeFormatter57);
        java.lang.Object obj60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(obj60, chronology61);
        org.joda.time.DateTimeZone dateTimeZone63 = mutableDateTime62.getZone();
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone63);
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime((java.lang.Object) str58, dateTimeZone63);
        org.joda.time.MutableDateTime mutableDateTime66 = mutableDateTime45.toMutableDateTime(dateTimeZone63);
        org.joda.time.Chronology chronology67 = mutableDateTime45.getChronology();
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime36.toMutableDateTime(chronology67);
        org.joda.time.MutableDateTime mutableDateTime69 = dateTime22.toMutableDateTime(chronology67);
        org.joda.time.DateTime dateTime70 = mutableDateTime14.toDateTime(chronology67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        org.joda.time.MutableDateTime mutableDateTime9 = property4.addWrapField(31);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        boolean boolean15 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.secondOfDay();
        mutableDateTime18.addMonths((int) 'a');
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.secondOfMinute();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.minuteOfHour();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime35 = property33.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.dayOfMonth();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime36.dayOfWeek();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        mutableDateTime41.add(readablePeriod44);
        java.util.GregorianCalendar gregorianCalendar46 = mutableDateTime41.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime41.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property47.getFieldType();
        int int49 = mutableDateTime36.get(dateTimeFieldType48);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime35.property(dateTimeFieldType48);
        mutableDateTime31.set(dateTimeFieldType48, 49);
        mutableDateTime18.setMillis((org.joda.time.ReadableInstant) mutableDateTime31);
        boolean boolean54 = mutableDateTime12.isAfter((org.joda.time.ReadableInstant) mutableDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime28", (instant13.compareTo(mutableDateTime28) == 0) == instant13.equals(mutableDateTime28));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        int int7 = mutableDateTime6.getWeekOfWeekyear();
        boolean boolean8 = mutableDateTime0.isEqual((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone9);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.DateTime dateTime21 = mutableDateTime16.toDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime10.toMutableDateTime(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant4", (mutableDateTime0.compareTo(instant4) == 0) == mutableDateTime0.equals(instant4));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property13.getAsText(locale15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology18);
        mutableDateTime19.addMillis((int) 'a');
        int int22 = mutableDateTime19.getDayOfYear();
        java.util.Date date23 = mutableDateTime19.toDate();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now();
        int int25 = mutableDateTime24.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime24.add(readablePeriod26, (int) (byte) -1);
        int int29 = mutableDateTime19.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        java.lang.String str30 = mutableDateTime24.toString();
        long long31 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime24.dayOfYear();
        int int33 = mutableDateTime24.getSecondOfDay();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime36.add(readablePeriod39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime42 = property41.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime42.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime44 = property43.roundHalfEven();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        mutableDateTime47.add(readablePeriod50);
        java.util.GregorianCalendar gregorianCalendar52 = mutableDateTime47.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime47.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property53.getFieldType();
        int int55 = mutableDateTime44.get(dateTimeFieldType54);
        boolean boolean56 = mutableDateTime24.isSupported(dateTimeFieldType54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime47", (instant3.compareTo(mutableDateTime47) == 0) == instant3.equals(mutableDateTime47));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        boolean boolean6 = mutableDateTime2.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.copy();
        mutableDateTime7.add((long) 6357078);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10, 25);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        int int20 = mutableDateTime19.getWeekOfWeekyear();
        boolean boolean21 = mutableDateTime13.isEqual((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime13.secondOfDay();
        mutableDateTime7.setMillis((org.joda.time.ReadableInstant) mutableDateTime13);
        int int24 = mutableDateTime7.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant17", (mutableDateTime13.compareTo(instant17) == 0) == mutableDateTime13.equals(instant17));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime3 = property1.set((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableDateTime3.add(readablePeriod4, 20);
        mutableDateTime3.setDayOfYear(22);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime16 = property13.addWrapField((int) 'a');
        mutableDateTime16.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        mutableDateTime16.setWeekOfWeekyear((int) '4');
        java.lang.Object obj24 = mutableDateTime16.clone();
        mutableDateTime16.addMonths((int) ' ');
        org.joda.time.DateTime dateTime27 = mutableDateTime16.toDateTimeISO();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        mutableDateTime30.setTime((long) '#');
        int int35 = dateTime27.compareTo((org.joda.time.ReadableInstant) mutableDateTime30);
        boolean boolean36 = mutableDateTime3.isAfter((org.joda.time.ReadableInstant) mutableDateTime30);
        int int37 = mutableDateTime3.getWeekOfWeekyear();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.Instant instant41 = mutableDateTime40.toInstant();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime40.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime43 = property42.roundHalfFloor();
        java.lang.String str44 = mutableDateTime43.toString();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        mutableDateTime47.add(readablePeriod50);
        mutableDateTime47.addWeeks(10);
        boolean boolean54 = mutableDateTime43.isEqual((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime43.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField56 = property55.getField();
        int int57 = mutableDateTime3.get(dateTimeField56);
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime61.getZone();
        java.lang.Object obj63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj63, chronology64);
        org.joda.time.DateTimeZone dateTimeZone66 = mutableDateTime65.getZone();
        boolean boolean67 = mutableDateTime65.isAfterNow();
        java.lang.Object obj68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(obj68, chronology69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = null;
        java.lang.String str72 = mutableDateTime70.toString(dateTimeFormatter71);
        java.lang.Object obj74 = null;
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(obj74, chronology75);
        org.joda.time.DateTimeZone dateTimeZone77 = mutableDateTime76.getZone();
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone77);
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime((java.lang.Object) str72, dateTimeZone77);
        mutableDateTime65.setZone(dateTimeZone77);
        mutableDateTime61.setZoneRetainFields(dateTimeZone77);
        org.joda.time.MutableDateTime mutableDateTime82 = new org.joda.time.MutableDateTime((-28393521215L), dateTimeZone77);
        org.joda.time.MutableDateTime mutableDateTime83 = mutableDateTime3.toMutableDateTime(dateTimeZone77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime61", (instant12.compareTo(mutableDateTime61) == 0) == instant12.equals(mutableDateTime61));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        mutableDateTime7.setWeekOfWeekyear((int) '4');
        java.lang.Object obj15 = mutableDateTime7.clone();
        mutableDateTime7.addMonths((int) ' ');
        org.joda.time.DateTime dateTime18 = mutableDateTime7.toDateTimeISO();
        int int19 = mutableDateTime7.getYearOfCentury();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundCeiling();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        int int30 = property24.getDifference((org.joda.time.ReadableInstant) mutableDateTime28);
        mutableDateTime28.add((long) ' ');
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.yearOfCentury();
        java.lang.String str35 = property34.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property34.getFieldType();
        boolean boolean37 = mutableDateTime28.isSupported(dateTimeFieldType36);
        int int38 = mutableDateTime7.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime33", (instant3.compareTo(mutableDateTime33) == 0) == instant3.equals(mutableDateTime33));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        boolean boolean6 = mutableDateTime2.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.copy();
        mutableDateTime7.add((long) 6357078);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10, 25);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        int int20 = mutableDateTime19.getWeekOfWeekyear();
        boolean boolean21 = mutableDateTime13.isEqual((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime13.secondOfDay();
        mutableDateTime7.setMillis((org.joda.time.ReadableInstant) mutableDateTime13);
        java.util.GregorianCalendar gregorianCalendar24 = mutableDateTime13.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant17", (mutableDateTime7.compareTo(instant17) == 0) == mutableDateTime7.equals(instant17));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        org.joda.time.MutableDateTime mutableDateTime9 = property4.addWrapField(31);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        boolean boolean15 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        mutableDateTime9.addWeeks(6432360);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.getMutableDateTime();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        java.util.Date date7 = mutableDateTime5.toDate();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.set((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime11.add(readablePeriod12, 20);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.Instant instant18 = mutableDateTime17.toInstant();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundCeiling();
        java.util.Locale locale21 = null;
        java.lang.String str22 = property19.getAsText(locale21);
        org.joda.time.DateTimeField dateTimeField23 = property19.getField();
        int int24 = mutableDateTime11.get(dateTimeField23);
        int int25 = mutableDateTime5.get(dateTimeField23);
        int int26 = mutableDateTime2.get(dateTimeField23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant18", (mutableDateTime2.compareTo(instant18) == 0) == mutableDateTime2.equals(instant18));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        int int1 = mutableDateTime0.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        mutableDateTime0.add(readablePeriod2, (int) (byte) -1);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        int int10 = mutableDateTime7.getYearOfCentury();
        org.joda.time.Chronology chronology11 = mutableDateTime7.getChronology();
        mutableDateTime0.setChronology(chronology11);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime20 = property17.addWrapField((int) 'a');
        mutableDateTime20.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime20.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property26.getFieldType();
        boolean boolean29 = mutableDateTime0.equals((java.lang.Object) property26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant16", (mutableDateTime7.compareTo(instant16) == 0) == mutableDateTime7.equals(instant16));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.secondOfMinute();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property11.getAsText(locale12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        org.joda.time.DurationField durationField14 = property13.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.roundCeiling();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (short) -1, dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 6368642, dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime15, dateTimeZone21);
        int int27 = mutableDateTime26.getSecondOfMinute();
        org.joda.time.Chronology chronology28 = mutableDateTime26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfWeek();
        mutableDateTime0.setSecondOfDay(15);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime0.toMutableDateTimeISO();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime0.toMutableDateTime(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.toMutableDateTime();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        int int19 = property13.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
        int int20 = mutableDateTime17.getYearOfEra();
        mutableDateTime8.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        java.util.GregorianCalendar gregorianCalendar22 = mutableDateTime17.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant12", (mutableDateTime8.compareTo(instant12) == 0) == mutableDateTime8.equals(instant12));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property13.getAsText(locale15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology18);
        mutableDateTime19.addMillis((int) 'a');
        int int22 = mutableDateTime19.getDayOfYear();
        java.util.Date date23 = mutableDateTime19.toDate();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now();
        int int25 = mutableDateTime24.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime24.add(readablePeriod26, (int) (byte) -1);
        int int29 = mutableDateTime19.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        java.lang.String str30 = mutableDateTime24.toString();
        long long31 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime24.dayOfYear();
        java.util.Locale locale33 = null;
        int int34 = property32.getMaximumTextLength(locale33);
        java.util.Locale locale35 = null;
        int int36 = property32.getMaximumTextLength(locale35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        boolean boolean7 = mutableDateTime2.isBefore(100L);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField((int) (byte) 0);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime18 = property15.addWrapField((int) 'a');
        mutableDateTime18.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.millisOfSecond();
        int int25 = mutableDateTime18.getYear();
        org.joda.time.Chronology chronology26 = mutableDateTime18.getChronology();
        org.joda.time.DateTime dateTime27 = mutableDateTime10.toDateTime(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant14", (mutableDateTime10.compareTo(instant14) == 0) == mutableDateTime10.equals(instant14));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        mutableDateTime2.add((long) '4');
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        int int14 = mutableDateTime11.getYearOfCentury();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology15);
        org.joda.time.DateTime dateTime17 = mutableDateTime2.toDateTime(chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        mutableDateTime5.setMinuteOfDay(52);
        java.lang.Object obj8 = mutableDateTime5.clone();
        int int9 = mutableDateTime5.getWeekyear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(chronology16);
        org.joda.time.Chronology chronology18 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        mutableDateTime5.setChronology(chronology18);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        mutableDateTime9.addWeeks(10);
        boolean boolean16 = mutableDateTime5.isEqual((org.joda.time.ReadableInstant) mutableDateTime9);
        int int17 = mutableDateTime9.getEra();
        mutableDateTime9.addMillis(6315406);
        mutableDateTime9.addMinutes(826);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        boolean boolean31 = mutableDateTime29.isAfterNow();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((java.lang.Object) str36, dateTimeZone41);
        mutableDateTime29.setZone(dateTimeZone41);
        mutableDateTime25.setZoneRetainFields(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((-28393521215L), dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime9.toMutableDateTime(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime25", (instant3.compareTo(mutableDateTime25) == 0) == instant3.equals(mutableDateTime25));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) 20);
        org.joda.time.ReadableInstant readableInstant11 = null;
        long long12 = property4.getDifferenceAsLong(readableInstant11);
        org.joda.time.MutableDateTime mutableDateTime13 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime15 = property4.add((long) 970);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        java.lang.String str22 = mutableDateTime21.toString();
        mutableDateTime21.setMillis((long) 105);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime21.secondOfMinute();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.monthOfYear();
        mutableDateTime28.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.yearOfCentury();
        boolean boolean34 = mutableDateTime21.equals((java.lang.Object) property33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property33.getFieldType();
        mutableDateTime15.set(dateTimeFieldType35, 18);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime15.minuteOfDay();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.DateTimeZone dateTimeZone49 = mutableDateTime48.getZone();
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone49);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((java.lang.Object) str44, dateTimeZone49);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) 51, dateTimeZone49);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime15, dateTimeZone49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime42", (instant3.compareTo(mutableDateTime42) == 0) == instant3.equals(mutableDateTime42));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        int int12 = mutableDateTime11.getCenturyOfEra();
        int int13 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.Chronology chronology14 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime11);
        mutableDateTime15.setWeekyear(6440709);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime3 = property1.set((int) (short) 1);
        mutableDateTime3.setTime(4, 16, (int) (byte) 1, (int) (byte) 1);
        boolean boolean9 = mutableDateTime3.isAfterNow();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime12.addSeconds(3);
        org.joda.time.Chronology chronology15 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 6345190, chronology15);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime3.toMutableDateTime(chronology15);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime3.weekyear();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundCeiling();
        java.util.Locale locale26 = null;
        java.lang.String str27 = property24.getAsText(locale26);
        int int28 = property24.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime29 = property24.getMutableDateTime();
        java.lang.String str30 = property24.getAsShortText();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime38 = property35.addWrapField((int) 'a');
        mutableDateTime38.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology45);
        mutableDateTime46.setSecondOfMinute((int) '4');
        mutableDateTime38.setTime((org.joda.time.ReadableInstant) mutableDateTime46);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime38.toMutableDateTime();
        int int51 = property24.compareTo((org.joda.time.ReadableInstant) mutableDateTime38);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime55 = property53.set((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        mutableDateTime55.add(readablePeriod56, 20);
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.Instant instant62 = mutableDateTime61.toInstant();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime61.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime64 = property63.roundCeiling();
        java.util.Locale locale65 = null;
        java.lang.String str66 = property63.getAsText(locale65);
        org.joda.time.DateTimeField dateTimeField67 = property63.getField();
        int int68 = mutableDateTime55.get(dateTimeField67);
        mutableDateTime38.setRounding(dateTimeField67);
        mutableDateTime3.setRounding(dateTimeField67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and instant23", (mutableDateTime16.compareTo(instant23) == 0) == mutableDateTime16.equals(instant23));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.getMaximumValueOverall();
        org.joda.time.DurationField durationField9 = property4.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.roundFloor();
        mutableDateTime10.addMinutes(283);
        org.joda.time.Instant instant13 = mutableDateTime10.toInstant();
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime10.add(readableDuration14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant13", (mutableDateTime10.compareTo(instant13) == 0) == mutableDateTime10.equals(instant13));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = mutableDateTime8.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = mutableDateTime8.isSupported(dateTimeFieldType11);
        boolean boolean13 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        int int14 = mutableDateTime8.getMillisOfDay();
        mutableDateTime8.setMinuteOfDay((int) (short) 10);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) str21, dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime8.toMutableDateTime(dateTimeZone26);
        mutableDateTime8.setMinuteOfHour((int) (byte) 1);
        int int32 = mutableDateTime8.getYearOfEra();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime40 = property37.addWrapField((int) 'a');
        java.lang.String str41 = property37.getAsShortText();
        int int42 = property37.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property37.getFieldType();
        boolean boolean44 = mutableDateTime8.isSupported(dateTimeFieldType43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant36", (mutableDateTime19.compareTo(instant36) == 0) == mutableDateTime19.equals(instant36));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        int int7 = mutableDateTime6.getWeekOfWeekyear();
        boolean boolean8 = mutableDateTime0.isEqual((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime12 = property10.set((int) (short) 1);
        org.joda.time.DurationField durationField13 = property10.getDurationField();
        org.joda.time.DateTimeField dateTimeField14 = property10.getField();
        int int15 = mutableDateTime6.get(dateTimeField14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant4", (mutableDateTime0.compareTo(instant4) == 0) == mutableDateTime0.equals(instant4));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime9 = property4.getMutableDateTime();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property4.getAsShortText(locale10);
        org.joda.time.DurationField durationField12 = property4.getLeapDurationField();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        java.util.GregorianCalendar gregorianCalendar20 = mutableDateTime15.toGregorianCalendar();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        mutableDateTime23.addDays((int) '4');
        int int26 = mutableDateTime23.getRoundingMode();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        int int32 = mutableDateTime29.getYearOfCentury();
        org.joda.time.Chronology chronology33 = mutableDateTime29.getChronology();
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime23.toMutableDateTime(chronology33);
        mutableDateTime15.setChronology(chronology33);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(chronology33);
        long long37 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        mutableDateTime5.setSecondOfDay((int) (short) 0);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.centuryOfEra();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfCeiling();
        boolean boolean12 = mutableDateTime10.isAfter((long) 6375617);
        int int13 = mutableDateTime10.getMinuteOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        mutableDateTime17.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.hourOfDay();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        int int25 = mutableDateTime23.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        boolean boolean27 = mutableDateTime23.isSupported(dateTimeFieldType26);
        boolean boolean28 = mutableDateTime17.isAfter((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((-28393866631L), dateTimeZone29);
        mutableDateTime10.setZone(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime23", (instant3.compareTo(mutableDateTime23) == 0) == instant3.equals(mutableDateTime23));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        boolean boolean3 = mutableDateTime0.isEqual((long) (byte) 0);
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfFloor();
        java.lang.String str10 = mutableDateTime9.toString();
        mutableDateTime9.addMinutes(12);
        java.util.GregorianCalendar gregorianCalendar13 = mutableDateTime9.toGregorianCalendar();
        mutableDateTime9.setMillisOfDay((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime9.add(readablePeriod16, (-1));
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundCeiling();
        java.util.Locale locale26 = null;
        java.lang.String str27 = property24.getAsText(locale26);
        org.joda.time.DateTimeField dateTimeField28 = property24.getField();
        org.joda.time.MutableDateTime mutableDateTime30 = property24.add((long) 20);
        org.joda.time.ReadableInstant readableInstant31 = null;
        long long32 = property24.getDifferenceAsLong(readableInstant31);
        org.joda.time.MutableDateTime mutableDateTime33 = property24.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime35 = property24.add(0);
        int int36 = mutableDateTime35.getMillisOfSecond();
        org.joda.time.Instant instant37 = mutableDateTime35.toInstant();
        boolean boolean38 = mutableDateTime9.equals((java.lang.Object) mutableDateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime35 and instant37", (mutableDateTime35.compareTo(instant37) == 0) == mutableDateTime35.equals(instant37));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now();
        mutableDateTime15.setMinuteOfDay(100);
        long long18 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime15);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundCeiling();
        java.util.Locale locale25 = null;
        java.lang.String str26 = property23.getAsText(locale25);
        int int27 = property23.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime28 = property23.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime30 = property23.add(6317426);
        int int31 = property13.compareTo((org.joda.time.ReadableInstant) mutableDateTime30);
        int int32 = mutableDateTime30.getYearOfEra();
        org.joda.time.ReadableDuration readableDuration33 = null;
        mutableDateTime30.add(readableDuration33, (int) ' ');
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.Instant instant39 = mutableDateTime38.toInstant();
        mutableDateTime38.setSecondOfDay((int) '#');
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.Instant instant45 = mutableDateTime44.toInstant();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime44.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime47 = property46.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime49 = property46.addWrapField((int) 'a');
        mutableDateTime49.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime49.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime56 = property55.roundCeiling();
        org.joda.time.DateTimeField dateTimeField57 = property55.getField();
        int int58 = mutableDateTime38.get(dateTimeField57);
        boolean boolean59 = mutableDateTime38.isAfterNow();
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime38.minuteOfHour();
        boolean boolean61 = mutableDateTime30.isAfter((org.joda.time.ReadableInstant) mutableDateTime38);
        org.joda.time.MutableDateTime mutableDateTime62 = mutableDateTime38.toMutableDateTimeISO();
        int int63 = mutableDateTime62.getDayOfMonth();
        java.lang.Object obj64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(obj64, chronology65);
        org.joda.time.DateTimeZone dateTimeZone67 = mutableDateTime66.getZone();
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime66.secondOfDay();
        mutableDateTime66.addMonths((int) 'a');
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime66.secondOfMinute();
        java.lang.Object obj74 = null;
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(obj74, chronology75);
        org.joda.time.DateTimeZone dateTimeZone77 = mutableDateTime76.getZone();
        org.joda.time.MutableDateTime mutableDateTime78 = org.joda.time.MutableDateTime.now(dateTimeZone77);
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime(dateTimeZone77);
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime((long) (short) -1, dateTimeZone77);
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime((long) 6368642, dateTimeZone77);
        org.joda.time.DateTime dateTime82 = mutableDateTime66.toDateTime(dateTimeZone77);
        org.joda.time.DateTime dateTime83 = mutableDateTime62.toDateTime(dateTimeZone77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime76", (instant3.compareTo(mutableDateTime76) == 0) == instant3.equals(mutableDateTime76));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.secondOfMinute();
        mutableDateTime5.addMinutes(6434018);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        mutableDateTime15.setSecondOfMinute((int) '4');
        mutableDateTime7.setTime((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime7.minuteOfHour();
        int int20 = mutableDateTime7.getEra();
        int int21 = mutableDateTime7.getWeekyear();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTime dateTime26 = mutableDateTime7.toDateTime(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfMonth();
        org.joda.time.DateTime dateTime29 = mutableDateTime27.toDateTime();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime27.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property30.getFieldType();
        int int32 = dateTime26.get(dateTimeFieldType31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        int int7 = mutableDateTime6.getWeekOfWeekyear();
        boolean boolean8 = mutableDateTime0.isEqual((org.joda.time.ReadableInstant) mutableDateTime6);
        mutableDateTime6.addWeekyears(6348753);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant4", (mutableDateTime0.compareTo(instant4) == 0) == mutableDateTime0.equals(instant4));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        mutableDateTime5.setMillis((long) 105);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.secondOfMinute();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        mutableDateTime12.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.yearOfCentury();
        boolean boolean18 = mutableDateTime5.equals((java.lang.Object) property17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property17.getFieldType();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        java.util.Date date24 = mutableDateTime22.toDate();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime28 = property26.set((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime28.add(readablePeriod29, 20);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.Instant instant35 = mutableDateTime34.toInstant();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime34.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime37 = property36.roundCeiling();
        java.util.Locale locale38 = null;
        java.lang.String str39 = property36.getAsText(locale38);
        org.joda.time.DateTimeField dateTimeField40 = property36.getField();
        int int41 = mutableDateTime28.get(dateTimeField40);
        int int42 = mutableDateTime22.get(dateTimeField40);
        org.joda.time.DateTimeField dateTimeField43 = mutableDateTime22.getRoundingField();
        mutableDateTime22.addDays(31);
        int int46 = mutableDateTime22.getEra();
        int int47 = mutableDateTime22.getYear();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) (byte) 10);
        int int50 = mutableDateTime49.getMillisOfDay();
        int int51 = mutableDateTime49.getMonthOfYear();
        mutableDateTime22.setTime((org.joda.time.ReadableInstant) mutableDateTime49);
        int int53 = property17.compareTo((org.joda.time.ReadableInstant) mutableDateTime49);
        java.lang.String str54 = property17.getAsShortText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant35", (mutableDateTime12.compareTo(instant35) == 0) == mutableDateTime12.equals(instant35));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime1 = mutableDateTime0.toMutableDateTime();
        mutableDateTime0.setSecondOfDay(10);
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfFloor();
        java.lang.String str10 = mutableDateTime9.toString();
        mutableDateTime9.setMillis((long) 105);
        mutableDateTime9.setDayOfYear(19);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.weekOfWeekyear();
        boolean boolean16 = mutableDateTime0.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant7", (mutableDateTime1.compareTo(instant7) == 0) == mutableDateTime1.equals(instant7));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundCeiling();
        boolean boolean20 = property13.equals((java.lang.Object) property18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = property13.getAsShortText(locale21);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now();
        int int25 = mutableDateTime24.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime24.add(readablePeriod26, (int) (byte) -1);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        int int34 = mutableDateTime31.getYearOfCentury();
        org.joda.time.Chronology chronology35 = mutableDateTime31.getChronology();
        mutableDateTime24.setChronology(chronology35);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(chronology35);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:24.291Z", chronology35);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((java.lang.Object) str22, chronology35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        int int12 = mutableDateTime11.getCenturyOfEra();
        int int13 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.Chronology chronology14 = mutableDateTime11.getChronology();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        mutableDateTime17.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.hourOfDay();
        boolean boolean21 = mutableDateTime17.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime17.copy();
        java.util.Locale locale23 = null;
        java.util.Calendar calendar24 = mutableDateTime22.toCalendar(locale23);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone29);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime30.toMutableDateTime(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime22.toMutableDateTime(dateTimeZone34);
        mutableDateTime11.setZone(dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        int int7 = mutableDateTime6.getWeekOfWeekyear();
        boolean boolean8 = mutableDateTime0.isEqual((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime0.millisOfDay();
        int int12 = property11.getMinimumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant4", (mutableDateTime0.compareTo(instant4) == 0) == mutableDateTime0.equals(instant4));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        mutableDateTime5.setSecondOfDay((int) (short) 0);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.centuryOfEra();
        mutableDateTime5.addWeeks((-292275054));
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        java.lang.String str20 = mutableDateTime19.toString();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        int int27 = mutableDateTime24.getYearOfCentury();
        org.joda.time.Chronology chronology28 = mutableDateTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 6466094, chronology28);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime19.toMutableDateTime(chronology28);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime5.toMutableDateTime(chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = mutableDateTime8.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = mutableDateTime8.isSupported(dateTimeFieldType11);
        boolean boolean13 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.ReadableInstant readableInstant14 = null;
        mutableDateTime2.setDate(readableInstant14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.add((int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField19 = property16.getField();
        org.joda.time.DurationField durationField20 = property16.getLeapDurationField();
        java.lang.String str21 = property16.getAsString();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime29 = property26.addWrapField((int) 'a');
        mutableDateTime29.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime29.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property35.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime39 = property35.add(9);
        int int40 = property35.getMinimumValue();
        boolean boolean41 = property16.equals((java.lang.Object) int40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant25", (mutableDateTime8.compareTo(instant25) == 0) == mutableDateTime8.equals(instant25));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = mutableDateTime5.toDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.secondOfMinute();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime5.weekyear();
        boolean boolean13 = mutableDateTime5.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.minuteOfDay();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        mutableDateTime16.addDays((int) '4');
        int int19 = mutableDateTime16.getRoundingMode();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime16.toMutableDateTime(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(chronology26);
        mutableDateTime13.setChronology(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        org.joda.time.DurationField durationField14 = property13.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.roundCeiling();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (short) -1, dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 6368642, dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime15, dateTimeZone21);
        int int27 = mutableDateTime26.getSecondOfMinute();
        org.joda.time.Chronology chronology28 = mutableDateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = mutableDateTime26.getRoundingField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.weekOfWeekyear();
        mutableDateTime6.addWeekyears(6329976);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) str15, dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) 51, dateTimeZone20);
        org.joda.time.DateTime dateTime24 = mutableDateTime6.toDateTime(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime();
        boolean boolean6 = mutableDateTime5.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        mutableDateTime5.setMillis((long) 105);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.secondOfMinute();
        int int10 = mutableDateTime5.getEra();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        boolean boolean18 = mutableDateTime13.isBefore(100L);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.secondOfDay();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone24);
        mutableDateTime25.setTime(1L);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.DateTime dateTime32 = mutableDateTime25.toDateTime(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime13.toMutableDateTime(dateTimeZone31);
        mutableDateTime5.setZone(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        mutableDateTime5.setMillisOfSecond((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundCeiling();
        org.joda.time.DurationField durationField10 = property8.getRangeDurationField();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone14);
        int int17 = property8.getDifference((org.joda.time.ReadableInstant) mutableDateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.Interval interval5 = property4.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime9 = property4.getMutableDateTime();
        int int10 = mutableDateTime9.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.hourOfDay();
        mutableDateTime9.setHourOfDay(9);
        mutableDateTime9.setWeekyear(999);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone26);
        mutableDateTime27.setTime(1L);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        org.joda.time.DateTime dateTime34 = mutableDateTime27.toDateTime(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime21.toMutableDateTime(dateTimeZone33);
        int int36 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and mutableDateTime25", (instant19.compareTo(mutableDateTime25) == 0) == instant19.equals(mutableDateTime25));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.getMutableDateTime();
        org.joda.time.DurationField durationField3 = property1.getLeapDurationField();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfFloor();
        mutableDateTime9.setSecondOfDay((int) (short) 0);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.centuryOfEra();
        mutableDateTime9.setMinuteOfDay((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.dayOfWeek();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundHalfEven();
        boolean boolean27 = mutableDateTime9.isBefore((org.joda.time.ReadableInstant) mutableDateTime26);
        int int28 = property1.compareTo((org.joda.time.ReadableInstant) mutableDateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant7", (mutableDateTime0.compareTo(instant7) == 0) == mutableDateTime0.equals(instant7));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        boolean boolean7 = mutableDateTime2.isBefore(100L);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.secondOfDay();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone13);
        mutableDateTime14.setTime(1L);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.DateTime dateTime21 = mutableDateTime14.toDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime2.toMutableDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.minuteOfHour();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfFloor();
        java.lang.String str30 = mutableDateTime29.toString();
        mutableDateTime29.addMinutes(12);
        java.util.GregorianCalendar gregorianCalendar33 = mutableDateTime29.toGregorianCalendar();
        int int34 = mutableDateTime29.getDayOfMonth();
        int int35 = mutableDateTime29.getYearOfEra();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime29.yearOfEra();
        org.joda.time.DateTime dateTime37 = mutableDateTime29.toDateTime();
        mutableDateTime22.setMillis((org.joda.time.ReadableInstant) mutableDateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant27", (mutableDateTime19.compareTo(instant27) == 0) == mutableDateTime19.equals(instant27));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:46:57.654Z");
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.dayOfMonth();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.dayOfWeek();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        mutableDateTime8.addDays((int) '4');
        int int11 = mutableDateTime8.getRoundingMode();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime8.toMutableDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime3.toMutableDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime2.toMutableDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) 6433194, chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime22", (mutableDateTime2.compareTo(mutableDateTime22) == 0) == mutableDateTime2.equals(mutableDateTime22));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTime dateTime6 = mutableDateTime5.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.weekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundCeiling();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property12.getAsText(locale14);
        int int16 = property12.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime17 = property12.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.yearOfEra();
        int int19 = mutableDateTime17.getDayOfYear();
        java.util.GregorianCalendar gregorianCalendar20 = mutableDateTime17.toGregorianCalendar();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime17);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone25);
        mutableDateTime27.setDayOfMonth((int) (short) 1);
        mutableDateTime17.setTime((org.joda.time.ReadableInstant) mutableDateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTimeISO();
        java.util.Date date9 = dateTime8.toDate();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone14);
        mutableDateTime15.setTime(1L);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTime dateTime22 = mutableDateTime15.toDateTime(dateTimeZone21);
        boolean boolean23 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime8.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) 20);
        org.joda.time.ReadableInstant readableInstant11 = null;
        long long12 = property4.getDifferenceAsLong(readableInstant11);
        org.joda.time.MutableDateTime mutableDateTime13 = property4.roundHalfCeiling();
        mutableDateTime13.addMillis((int) (short) -1);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        int int20 = mutableDateTime18.getSecondOfMinute();
        int int21 = mutableDateTime18.getYearOfCentury();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime18.toMutableDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology31);
        mutableDateTime32.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime32.hourOfDay();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        int int40 = mutableDateTime38.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = null;
        boolean boolean42 = mutableDateTime38.isSupported(dateTimeFieldType41);
        boolean boolean43 = mutableDateTime32.isAfter((org.joda.time.ReadableInstant) mutableDateTime38);
        int int44 = mutableDateTime38.getMillisOfDay();
        mutableDateTime38.setMinuteOfDay((int) (short) 10);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.DateTimeZone dateTimeZone56 = mutableDateTime55.getZone();
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone56);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((java.lang.Object) str51, dateTimeZone56);
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime38.toMutableDateTime(dateTimeZone56);
        org.joda.time.Chronology chronology60 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime29.toMutableDateTime(chronology60);
        org.joda.time.MutableDateTime mutableDateTime62 = mutableDateTime13.toMutableDateTime(chronology60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.addWrapField(39);
        org.joda.time.MutableDateTime mutableDateTime7 = property4.roundHalfFloor();
        int int8 = mutableDateTime7.getDayOfYear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        java.lang.String str15 = mutableDateTime14.toString();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) str15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology18);
        mutableDateTime19.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.hourOfDay();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        int int27 = mutableDateTime25.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        boolean boolean29 = mutableDateTime25.isSupported(dateTimeFieldType28);
        boolean boolean30 = mutableDateTime19.isAfter((org.joda.time.ReadableInstant) mutableDateTime25);
        int int31 = mutableDateTime25.getMillisOfDay();
        mutableDateTime25.setMinuteOfDay((int) (short) 10);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((java.lang.Object) str38, dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime25.toMutableDateTime(dateTimeZone43);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone51);
        mutableDateTime46.setZoneRetainFields(dateTimeZone51);
        mutableDateTime16.setZone(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime7.toMutableDateTime(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime36", (instant3.compareTo(mutableDateTime36) == 0) == instant3.equals(mutableDateTime36));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        int int12 = mutableDateTime11.getCenturyOfEra();
        int int13 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.Chronology chronology14 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime11);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) str4, dateTimeZone9);
        int int12 = mutableDateTime11.getMonthOfYear();
        boolean boolean14 = mutableDateTime11.isAfter((long) 6439001);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.Instant instant18 = mutableDateTime17.toInstant();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundHalfFloor();
        java.lang.String str21 = mutableDateTime20.toString();
        mutableDateTime20.setMillis((long) 105);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime20.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property24.getFieldType();
        boolean boolean26 = mutableDateTime11.isSupported(dateTimeFieldType25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant18", (mutableDateTime2.compareTo(instant18) == 0) == mutableDateTime2.equals(instant18));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.Instant instant13 = mutableDateTime7.toInstant();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        mutableDateTime16.addDays((int) '4');
        int int19 = mutableDateTime16.getRoundingMode();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime16.toMutableDateTime(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(chronology26);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime7.toMutableDateTime(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant13", (mutableDateTime7.compareTo(instant13) == 0) == mutableDateTime7.equals(instant13));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.getMaximumValueOverall();
        org.joda.time.DurationField durationField9 = property4.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.roundFloor();
        mutableDateTime10.addMinutes(283);
        org.joda.time.Instant instant13 = mutableDateTime10.toInstant();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        mutableDateTime16.addDays((int) '4');
        int int19 = mutableDateTime16.getRoundingMode();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime16.toMutableDateTime(chronology26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology29);
        mutableDateTime30.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime30.hourOfDay();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        int int38 = mutableDateTime36.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        boolean boolean40 = mutableDateTime36.isSupported(dateTimeFieldType39);
        boolean boolean41 = mutableDateTime30.isAfter((org.joda.time.ReadableInstant) mutableDateTime36);
        int int42 = mutableDateTime36.getMillisOfDay();
        mutableDateTime36.setMinuteOfDay((int) (short) 10);
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime53.getZone();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime((java.lang.Object) str49, dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime57 = mutableDateTime36.toMutableDateTime(dateTimeZone54);
        mutableDateTime16.setZoneRetainFields(dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime59 = org.joda.time.MutableDateTime.now();
        int int60 = mutableDateTime59.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        mutableDateTime59.add(readablePeriod61, (int) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime64.dayOfMonth();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime64.dayOfWeek();
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = null;
        java.lang.String str71 = mutableDateTime69.toString(dateTimeFormatter70);
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        mutableDateTime69.add(readablePeriod72);
        java.util.GregorianCalendar gregorianCalendar74 = mutableDateTime69.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime69.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = property75.getFieldType();
        int int77 = mutableDateTime64.get(dateTimeFieldType76);
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime59.property(dateTimeFieldType76);
        boolean boolean79 = mutableDateTime16.isSupported(dateTimeFieldType76);
        boolean boolean80 = mutableDateTime10.isSupported(dateTimeFieldType76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant13", (mutableDateTime10.compareTo(instant13) == 0) == mutableDateTime10.equals(instant13));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone10);
        mutableDateTime11.setTime(1L);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.DateTime dateTime18 = mutableDateTime11.toDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime5.toMutableDateTime(dateTimeZone17);
        int int20 = mutableDateTime19.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.add((long) 43);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        java.util.Date date12 = mutableDateTime10.toDate();
        int int13 = mutableDateTime10.getYear();
        int int14 = mutableDateTime10.getWeekyear();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.Instant instant18 = mutableDateTime17.toInstant();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundCeiling();
        java.util.Locale locale21 = null;
        java.lang.String str22 = property19.getAsText(locale21);
        org.joda.time.DateTimeField dateTimeField23 = property19.getField();
        org.joda.time.MutableDateTime mutableDateTime25 = property19.add((long) 20);
        org.joda.time.MutableDateTime mutableDateTime27 = property19.add((int) 'a');
        java.lang.String str28 = property19.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property19.getFieldType();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime10.property(dateTimeFieldType29);
        int int31 = mutableDateTime7.get(dateTimeFieldType29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant18", (mutableDateTime2.compareTo(instant18) == 0) == mutableDateTime2.equals(instant18));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundCeiling();
        boolean boolean20 = property13.equals((java.lang.Object) property18);
        org.joda.time.MutableDateTime mutableDateTime21 = property13.roundHalfCeiling();
        long long22 = mutableDateTime21.getMillis();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now();
        int int24 = mutableDateTime23.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime23.add(readablePeriod25, (int) (byte) -1);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        mutableDateTime23.setChronology(chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(chronology34);
        mutableDateTime21.setChronology(chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime23", (instant3.compareTo(mutableDateTime23) == 0) == instant3.equals(mutableDateTime23));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property13.getAsText(locale15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology18);
        mutableDateTime19.addMillis((int) 'a');
        int int22 = mutableDateTime19.getDayOfYear();
        java.util.Date date23 = mutableDateTime19.toDate();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now();
        int int25 = mutableDateTime24.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime24.add(readablePeriod26, (int) (byte) -1);
        int int29 = mutableDateTime19.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        java.lang.String str30 = mutableDateTime24.toString();
        long long31 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime24.dayOfYear();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime24.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime34.toMutableDateTime();
        java.util.Date date36 = mutableDateTime34.toDate();
        boolean boolean37 = mutableDateTime34.isEqualNow();
        int int38 = mutableDateTime34.getHourOfDay();
        java.lang.Object obj39 = mutableDateTime34.clone();
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutableDateTime34.add(readableDuration40, 355);
        mutableDateTime34.addWeekyears(6479556);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime34.dayOfYear();
        boolean boolean46 = mutableDateTime24.isBefore((org.joda.time.ReadableInstant) mutableDateTime34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime35", (instant3.compareTo(mutableDateTime35) == 0) == instant3.equals(mutableDateTime35));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime mutableDateTime11 = property4.getMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        mutableDateTime5.addMinutes(12);
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime5.toGregorianCalendar();
        int int10 = mutableDateTime5.getDayOfMonth();
        int int11 = mutableDateTime5.getYearOfEra();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone16);
        mutableDateTime5.setZoneRetainFields(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone10);
        mutableDateTime11.setTime(1L);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.DateTime dateTime18 = mutableDateTime11.toDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime5.toMutableDateTime(dateTimeZone17);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime5.add(readablePeriod20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.yearOfCentury();
        mutableDateTime0.add((long) 6311871);
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField((int) 'a');
        mutableDateTime11.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology18);
        mutableDateTime19.setSecondOfMinute((int) '4');
        mutableDateTime11.setTime((org.joda.time.ReadableInstant) mutableDateTime19);
        long long23 = mutableDateTime19.getMillis();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime19.toMutableDateTimeISO();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        mutableDateTime27.addDays((int) '4');
        int int30 = mutableDateTime27.getRoundingMode();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime27.toMutableDateTime(chronology37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology40);
        mutableDateTime41.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime41.hourOfDay();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime47.getZone();
        int int49 = mutableDateTime47.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = null;
        boolean boolean51 = mutableDateTime47.isSupported(dateTimeFieldType50);
        boolean boolean52 = mutableDateTime41.isAfter((org.joda.time.ReadableInstant) mutableDateTime47);
        int int53 = mutableDateTime47.getMillisOfDay();
        mutableDateTime47.setMinuteOfDay((int) (short) 10);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.DateTimeZone dateTimeZone65 = mutableDateTime64.getZone();
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone65);
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime((java.lang.Object) str60, dateTimeZone65);
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime47.toMutableDateTime(dateTimeZone65);
        mutableDateTime27.setZoneRetainFields(dateTimeZone65);
        mutableDateTime24.setZone(dateTimeZone65);
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime0.toMutableDateTime(dateTimeZone65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime33", (instant7.compareTo(mutableDateTime33) == 0) == instant7.equals(mutableDateTime33));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:21.023Z");
        int int8 = mutableDateTime7.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfMonth();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.dayOfWeek();
        mutableDateTime9.setSecondOfDay(15);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime9.toMutableDateTimeISO();
        mutableDateTime9.setMinuteOfHour(10);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime9.toMutableDateTime(chronology23);
        mutableDateTime7.setDate((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime7.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundHalfCeiling();
        boolean boolean28 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime27);
        mutableDateTime2.addSeconds(100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) str4, dateTimeZone9);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundCeiling();
        boolean boolean18 = mutableDateTime17.isEqualNow();
        mutableDateTime17.setWeekyear(290);
        mutableDateTime11.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant15", (mutableDateTime2.compareTo(instant15) == 0) == mutableDateTime2.equals(instant15));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.addWrapField(39);
        int int7 = property4.getMinimumValue();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology8);
        boolean boolean10 = property4.equals((java.lang.Object) chronology8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        int int7 = mutableDateTime6.getWeekOfWeekyear();
        boolean boolean8 = mutableDateTime0.isEqual((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime0.millisOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        mutableDateTime16.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.hourOfDay();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        int int24 = mutableDateTime22.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = mutableDateTime22.isSupported(dateTimeFieldType25);
        boolean boolean27 = mutableDateTime16.isAfter((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((-28393866631L), dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 58, dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        mutableDateTime0.setZone(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime10", (instant4.compareTo(mutableDateTime10) == 0) == instant4.equals(mutableDateTime10));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        org.joda.time.MutableDateTime mutableDateTime9 = property4.addWrapField(31);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime12.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        mutableDateTime9.set(dateTimeFieldType19, 35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property13.getAsText(locale15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology18);
        mutableDateTime19.addMillis((int) 'a');
        int int22 = mutableDateTime19.getDayOfYear();
        java.util.Date date23 = mutableDateTime19.toDate();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now();
        int int25 = mutableDateTime24.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime24.add(readablePeriod26, (int) (byte) -1);
        int int29 = mutableDateTime19.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        java.lang.String str30 = mutableDateTime24.toString();
        long long31 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime24.dayOfYear();
        int int33 = mutableDateTime24.getWeekOfWeekyear();
        java.lang.Object obj34 = null;
        boolean boolean35 = mutableDateTime24.equals(obj34);
        java.lang.Object obj36 = mutableDateTime24.clone();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        java.util.Date date41 = mutableDateTime39.toDate();
        int int42 = mutableDateTime39.getYear();
        int int43 = mutableDateTime39.getWeekyear();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.Instant instant47 = mutableDateTime46.toInstant();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime46.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime49 = property48.roundCeiling();
        java.util.Locale locale50 = null;
        java.lang.String str51 = property48.getAsText(locale50);
        org.joda.time.DateTimeField dateTimeField52 = property48.getField();
        org.joda.time.MutableDateTime mutableDateTime54 = property48.add((long) 20);
        org.joda.time.MutableDateTime mutableDateTime56 = property48.add((int) 'a');
        java.lang.String str57 = property48.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property48.getFieldType();
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime39.property(dateTimeFieldType58);
        boolean boolean60 = mutableDateTime24.isSupported(dateTimeFieldType58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime39", (instant3.compareTo(mutableDateTime39) == 0) == instant3.equals(mutableDateTime39));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        org.joda.time.MutableDateTime mutableDateTime9 = property4.addWrapField(31);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        boolean boolean15 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.DateTimeField dateTimeField16 = mutableDateTime9.getRoundingField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        mutableDateTime7.setWeekOfWeekyear((int) '4');
        java.lang.Object obj15 = mutableDateTime7.clone();
        mutableDateTime7.addMonths((int) ' ');
        org.joda.time.DateTime dateTime18 = mutableDateTime7.toDateTimeISO();
        mutableDateTime7.setMinuteOfHour(56);
        int int21 = mutableDateTime7.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfFloor();
        int int29 = mutableDateTime28.getWeekOfWeekyear();
        boolean boolean30 = mutableDateTime22.isEqual((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime22.secondOfDay();
        boolean boolean32 = mutableDateTime7.equals((java.lang.Object) property31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        mutableDateTime5.setMillis((long) 105);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfCeiling();
        mutableDateTime10.setMillis((long) (byte) 10);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone17);
        org.joda.time.DateTime dateTime19 = mutableDateTime18.toDateTime();
        mutableDateTime18.addYears(6315406);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfMonth();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.dayOfWeek();
        mutableDateTime22.setSecondOfDay(15);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime22.toMutableDateTimeISO();
        mutableDateTime22.setMinuteOfHour(10);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        int int35 = mutableDateTime32.getYearOfCentury();
        org.joda.time.Chronology chronology36 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime22.toMutableDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime18.toMutableDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(chronology36);
        org.joda.time.DateTime dateTime40 = mutableDateTime10.toDateTime(chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime1.addSeconds(3);
        org.joda.time.Chronology chronology4 = mutableDateTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.copy();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        java.util.Date date11 = mutableDateTime9.toDate();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.set((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime15.add(readablePeriod16, 20);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundCeiling();
        java.util.Locale locale25 = null;
        java.lang.String str26 = property23.getAsText(locale25);
        org.joda.time.DateTimeField dateTimeField27 = property23.getField();
        int int28 = mutableDateTime15.get(dateTimeField27);
        int int29 = mutableDateTime9.get(dateTimeField27);
        int int30 = mutableDateTime5.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime5.setMillis((-28393885776L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant22", (mutableDateTime9.compareTo(instant22) == 0) == mutableDateTime9.equals(instant22));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.lang.String str7 = mutableDateTime2.toString();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        java.util.GregorianCalendar gregorianCalendar15 = mutableDateTime10.toGregorianCalendar();
        mutableDateTime10.setSecondOfDay((int) (short) 100);
        boolean boolean18 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime10);
        boolean boolean19 = mutableDateTime10.isEqualNow();
        java.util.Locale locale20 = null;
        java.util.Calendar calendar21 = mutableDateTime10.toCalendar(locale20);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        boolean boolean26 = mutableDateTime24.isAfterNow();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) str31, dateTimeZone36);
        mutableDateTime24.setZone(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime10.toMutableDateTime(dateTimeZone36);
        mutableDateTime10.setDate((-28393836952L));
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime10.yearOfCentury();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.Instant instant47 = mutableDateTime46.toInstant();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime46.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime49 = property48.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime51 = property48.addWrapField((int) 'a');
        org.joda.time.MutableDateTime mutableDateTime53 = property48.addWrapField(31);
        java.lang.Object obj54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(obj54, chronology55);
        org.joda.time.Instant instant57 = mutableDateTime56.toInstant();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime56.monthOfYear();
        boolean boolean59 = mutableDateTime53.isEqual((org.joda.time.ReadableInstant) mutableDateTime56);
        int int60 = mutableDateTime56.getCenturyOfEra();
        int int61 = property43.compareTo((org.joda.time.ReadableInstant) mutableDateTime56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and instant47", (mutableDateTime24.compareTo(instant47) == 0) == mutableDateTime24.equals(instant47));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        mutableDateTime5.setMillis((long) 105);
        mutableDateTime5.setDayOfYear(19);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.weekOfWeekyear();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime19 = property16.addWrapField((int) 'a');
        mutableDateTime19.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.millisOfSecond();
        org.joda.time.DurationField durationField26 = property25.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime27 = property25.roundCeiling();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) (short) -1, dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) 6368642, dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime27, dateTimeZone33);
        boolean boolean39 = property11.equals((java.lang.Object) mutableDateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime32", (instant15.compareTo(mutableDateTime32) == 0) == instant15.equals(mutableDateTime32));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        int int14 = property13.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.roundFloor();
        org.joda.time.Interval interval16 = property13.toInterval();
        org.joda.time.MutableDateTime mutableDateTime17 = property13.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime19 = property13.add(361);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.set((int) (short) 1);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfFloor();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        org.joda.time.DateTime dateTime34 = mutableDateTime29.toDateTime(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime23.toMutableDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = mutableDateTime19.toDateTime(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime32", (instant3.compareTo(mutableDateTime32) == 0) == instant3.equals(mutableDateTime32));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfWeek();
        mutableDateTime0.setSecondOfDay(15);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime0.toMutableDateTimeISO();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime0.toMutableDateTime(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.toMutableDateTime();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        int int19 = property13.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
        int int20 = mutableDateTime17.getYearOfEra();
        mutableDateTime8.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        int int22 = mutableDateTime17.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant12", (mutableDateTime8.compareTo(instant12) == 0) == mutableDateTime8.equals(instant12));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) 20);
        org.joda.time.ReadableInstant readableInstant11 = null;
        long long12 = property4.getDifferenceAsLong(readableInstant11);
        org.joda.time.MutableDateTime mutableDateTime13 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime15 = property4.add(0);
        org.joda.time.MutableDateTime mutableDateTime16 = property4.getMutableDateTime();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        java.util.Date date21 = mutableDateTime19.toDate();
        mutableDateTime16.setDate((org.joda.time.ReadableInstant) mutableDateTime19);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfFloor();
        java.lang.String str29 = mutableDateTime28.toString();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        mutableDateTime32.addWeeks(10);
        boolean boolean39 = mutableDateTime28.isEqual((org.joda.time.ReadableInstant) mutableDateTime32);
        int int40 = mutableDateTime32.getEra();
        boolean boolean41 = mutableDateTime16.isBefore((org.joda.time.ReadableInstant) mutableDateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant26", (mutableDateTime19.compareTo(instant26) == 0) == mutableDateTime19.equals(instant26));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.secondOfDay();
        mutableDateTime2.addMonths((int) 'a');
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfHour();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfMonth();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.dayOfWeek();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        java.util.GregorianCalendar gregorianCalendar30 = mutableDateTime25.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime25.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property31.getFieldType();
        int int33 = mutableDateTime20.get(dateTimeFieldType32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime19.property(dateTimeFieldType32);
        mutableDateTime15.set(dateTimeFieldType32, 49);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime15);
        int int38 = mutableDateTime2.getYear();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime42 = property40.set((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime42.add(readablePeriod43, 20);
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.Instant instant49 = mutableDateTime48.toInstant();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime48.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime51 = property50.roundCeiling();
        java.util.Locale locale52 = null;
        java.lang.String str53 = property50.getAsText(locale52);
        org.joda.time.DateTimeField dateTimeField54 = property50.getField();
        int int55 = mutableDateTime42.get(dateTimeField54);
        mutableDateTime2.setRounding(dateTimeField54, 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant49", (mutableDateTime12.compareTo(instant49) == 0) == mutableDateTime12.equals(instant49));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.roundCeiling();
        java.util.Locale locale3 = null;
        java.lang.String str4 = property1.getAsShortText(locale3);
        int int5 = property1.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime7 = property1.add(6328532);
        org.joda.time.MutableDateTime mutableDateTime8 = property1.getMutableDateTime();
        int int9 = mutableDateTime8.getYearOfEra();
        org.joda.time.Instant instant10 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now();
        int int12 = mutableDateTime11.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime11.add(readablePeriod13, (int) (byte) -1);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        mutableDateTime11.setChronology(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime8, chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant10", (mutableDateTime8.compareTo(instant10) == 0) == mutableDateTime8.equals(instant10));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = mutableDateTime8.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = mutableDateTime8.isSupported(dateTimeFieldType11);
        boolean boolean13 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        int int14 = mutableDateTime8.getMillisOfDay();
        mutableDateTime8.setMinuteOfHour(2);
        int int17 = mutableDateTime8.getDayOfWeek();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime8.toMutableDateTime(dateTimeZone21);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfFloor();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone34);
        mutableDateTime35.setTime(1L);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.DateTime dateTime42 = mutableDateTime35.toDateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime29.toMutableDateTime(dateTimeZone41);
        mutableDateTime23.setZoneRetainFields(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and instant27", (mutableDateTime20.compareTo(instant27) == 0) == mutableDateTime20.equals(instant27));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.String str6 = mutableDateTime5.toString();
        mutableDateTime5.setMillis((long) 105);
        boolean boolean10 = mutableDateTime5.isBefore((long) 6317426);
        boolean boolean11 = mutableDateTime5.isBeforeNow();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime5.hourOfDay();
        mutableDateTime5.addWeeks(28);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfMonth();
        org.joda.time.DurationField durationField17 = property16.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime19 = property16.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.set((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime24 = property21.roundCeiling();
        int int25 = property16.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.era();
        java.lang.Object obj27 = mutableDateTime24.clone();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        java.util.Date date32 = mutableDateTime30.toDate();
        org.joda.time.Chronology chronology33 = mutableDateTime30.getChronology();
        mutableDateTime24.setChronology(chronology33);
        mutableDateTime5.setChronology(chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime30", (instant3.compareTo(mutableDateTime30) == 0) == instant3.equals(mutableDateTime30));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        int int7 = mutableDateTime6.getWeekOfWeekyear();
        boolean boolean8 = mutableDateTime0.isEqual((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone9);
        mutableDateTime0.addYears(6479045);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime10", (instant4.compareTo(mutableDateTime10) == 0) == instant4.equals(mutableDateTime10));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        mutableDateTime2.setDate((long) 49);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfMonth();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.dayOfWeek();
        mutableDateTime9.setSecondOfDay(15);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime9.toMutableDateTimeISO();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime9.toMutableDateTime(chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.toMutableDateTime();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundCeiling();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        int int28 = property22.getDifference((org.joda.time.ReadableInstant) mutableDateTime26);
        int int29 = mutableDateTime26.getYearOfEra();
        mutableDateTime17.setTime((org.joda.time.ReadableInstant) mutableDateTime26);
        boolean boolean31 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and mutableDateTime26", (instant21.compareTo(mutableDateTime26) == 0) == instant21.equals(mutableDateTime26));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        org.joda.time.MutableDateTime mutableDateTime9 = property4.addWrapField(31);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        boolean boolean15 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        int int16 = mutableDateTime12.getRoundingMode();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundCeiling();
        mutableDateTime22.setMillisOfSecond((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime22.yearOfEra();
        int int26 = mutableDateTime22.getSecondOfMinute();
        boolean boolean27 = mutableDateTime12.equals((java.lang.Object) mutableDateTime22);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime22.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant13", (mutableDateTime12.compareTo(instant13) == 0) == mutableDateTime12.equals(instant13));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfEven();
        int int11 = mutableDateTime10.getYear();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime13.addSeconds(3);
        org.joda.time.Chronology chronology16 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(chronology16);
        mutableDateTime10.setChronology(chronology16);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfFloor();
        mutableDateTime24.setSecondOfDay((int) (short) 0);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime24.centuryOfEra();
        org.joda.time.DateTime dateTime28 = mutableDateTime24.toDateTime();
        boolean boolean29 = mutableDateTime10.isAfter((org.joda.time.ReadableInstant) mutableDateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and instant22", (mutableDateTime17.compareTo(instant22) == 0) == mutableDateTime17.equals(instant22));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) 20);
        org.joda.time.ReadableInstant readableInstant11 = null;
        long long12 = property4.getDifferenceAsLong(readableInstant11);
        org.joda.time.MutableDateTime mutableDateTime13 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime15 = property4.add(0);
        int int16 = mutableDateTime15.getMillisOfSecond();
        org.joda.time.Instant instant17 = mutableDateTime15.toInstant();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        org.joda.time.Chronology chronology24 = mutableDateTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology24);
        org.joda.time.Chronology chronology26 = mutableDateTime25.getChronology();
        org.joda.time.DateTime dateTime27 = mutableDateTime15.toDateTime(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and instant17", (mutableDateTime15.compareTo(instant17) == 0) == mutableDateTime15.equals(instant17));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        mutableDateTime2.addDays((int) '4');
        int int5 = mutableDateTime2.getHourOfDay();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTime();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundCeiling();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property11.getAsText(locale13);
        org.joda.time.DateTimeField dateTimeField15 = property11.getField();
        org.joda.time.MutableDateTime mutableDateTime17 = property11.add((long) 20);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        mutableDateTime2.setRounding(dateTimeField19);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundHalfFloor();
        java.lang.String str27 = mutableDateTime26.toString();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) str27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology30);
        mutableDateTime31.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime31.hourOfDay();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        int int39 = mutableDateTime37.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        boolean boolean41 = mutableDateTime37.isSupported(dateTimeFieldType40);
        boolean boolean42 = mutableDateTime31.isAfter((org.joda.time.ReadableInstant) mutableDateTime37);
        int int43 = mutableDateTime37.getMillisOfDay();
        mutableDateTime37.setMinuteOfDay((int) (short) 10);
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = null;
        java.lang.String str50 = mutableDateTime48.toString(dateTimeFormatter49);
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.DateTimeZone dateTimeZone55 = mutableDateTime54.getZone();
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone55);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((java.lang.Object) str50, dateTimeZone55);
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime37.toMutableDateTime(dateTimeZone55);
        java.lang.Object obj60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(obj60, chronology61);
        org.joda.time.DateTimeZone dateTimeZone63 = mutableDateTime62.getZone();
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone63);
        mutableDateTime58.setZoneRetainFields(dateTimeZone63);
        mutableDateTime28.setZone(dateTimeZone63);
        org.joda.time.DateTime dateTime67 = mutableDateTime2.toDateTime(dateTimeZone63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime48", (instant10.compareTo(mutableDateTime48) == 0) == instant10.equals(mutableDateTime48));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getWeekOfWeekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundCeiling();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property11.getAsText(locale13);
        org.joda.time.DateTimeField dateTimeField15 = property11.getField();
        int int16 = mutableDateTime5.get(dateTimeField15);
        org.joda.time.DateTime dateTime17 = mutableDateTime5.toDateTime();
        org.joda.time.DateTime dateTime18 = mutableDateTime5.toDateTimeISO();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundCeiling();
        java.util.Locale locale25 = null;
        java.lang.String str26 = property23.getAsText(locale25);
        org.joda.time.DateTimeField dateTimeField27 = property23.getField();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        int int31 = mutableDateTime30.getCenturyOfEra();
        int int32 = property23.getDifference((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.Chronology chronology33 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime18.toMutableDateTime(chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime30", (instant3.compareTo(mutableDateTime30) == 0) == instant3.equals(mutableDateTime30));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.getMaximumValueOverall();
        org.joda.time.DurationField durationField9 = property4.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.roundFloor();
        mutableDateTime10.addMinutes(283);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.set((int) (short) 1);
        mutableDateTime16.setTime(4, 16, (int) (byte) 1, (int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfMonth();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.dayOfWeek();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime27.add(readablePeriod30);
        java.util.GregorianCalendar gregorianCalendar32 = mutableDateTime27.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime27.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property33.getFieldType();
        int int35 = mutableDateTime22.get(dateTimeFieldType34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime16.property(dateTimeFieldType34);
        boolean boolean37 = mutableDateTime16.isAfterNow();
        boolean boolean38 = mutableDateTime10.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        java.lang.String str8 = property4.getAsShortText();
        org.joda.time.DurationField durationField9 = property4.getDurationField();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        java.lang.String str16 = mutableDateTime15.toString();
        mutableDateTime15.addMinutes(12);
        java.util.GregorianCalendar gregorianCalendar19 = mutableDateTime15.toGregorianCalendar();
        mutableDateTime15.setMillisOfDay((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime15.add(readablePeriod22, (-1));
        int int25 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.MutableDateTime mutableDateTime26 = property4.roundCeiling();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfMonth();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        int int33 = mutableDateTime31.getSecondOfMinute();
        int int34 = mutableDateTime31.getYearOfCentury();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime31.toMutableDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) 6, dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(dateTimeZone39);
        mutableDateTime26.setZoneRetainFields(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime31", (instant3.compareTo(mutableDateTime31) == 0) == instant3.equals(mutableDateTime31));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        mutableDateTime5.setSecondOfDay((int) (short) 0);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.centuryOfEra();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime5.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.roundHalfFloor();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        boolean boolean19 = mutableDateTime14.isBefore(100L);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.dayOfMonth();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.dayOfWeek();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime30.add(readablePeriod33);
        java.util.GregorianCalendar gregorianCalendar35 = mutableDateTime30.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime30.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property36.getFieldType();
        int int38 = mutableDateTime25.get(dateTimeFieldType37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime24.property(dateTimeFieldType37);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime14.property(dateTimeFieldType37);
        mutableDateTime11.setMillis((org.joda.time.ReadableInstant) mutableDateTime14);
        mutableDateTime14.addDays(32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime13 = property10.addWrapField((int) 'a');
        mutableDateTime13.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundCeiling();
        org.joda.time.DateTimeField dateTimeField21 = property19.getField();
        int int22 = mutableDateTime2.get(dateTimeField21);
        boolean boolean23 = mutableDateTime2.isAfterNow();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime26.toMutableDateTime();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime30.add(readablePeriod33);
        java.util.GregorianCalendar gregorianCalendar35 = mutableDateTime30.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime30.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property36.getFieldType();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime26.property(dateTimeFieldType37);
        boolean boolean39 = mutableDateTime25.isSupported(dateTimeFieldType37);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime2.property(dateTimeFieldType37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime26", (instant9.compareTo(mutableDateTime26) == 0) == instant9.equals(mutableDateTime26));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.add((long) 4);
        int int10 = mutableDateTime2.getMinuteOfDay();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfDay();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) str17, dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 51, dateTimeZone22);
        mutableDateTime2.setZoneRetainFields(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime1.addSeconds(3);
        org.joda.time.Chronology chronology4 = mutableDateTime1.getChronology();
        int int5 = mutableDateTime1.getRoundingMode();
        int int6 = mutableDateTime1.getYear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology8);
        mutableDateTime9.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.hourOfDay();
        boolean boolean13 = mutableDateTime9.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime9.copy();
        mutableDateTime14.add((long) 6357078);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17, 25);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundHalfFloor();
        int int27 = mutableDateTime26.getWeekOfWeekyear();
        boolean boolean28 = mutableDateTime20.isEqual((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime20.secondOfDay();
        mutableDateTime14.setMillis((org.joda.time.ReadableInstant) mutableDateTime20);
        boolean boolean31 = mutableDateTime1.isEqual((org.joda.time.ReadableInstant) mutableDateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant24", (mutableDateTime14.compareTo(instant24) == 0) == mutableDateTime14.equals(instant24));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        int int7 = mutableDateTime6.getWeekOfWeekyear();
        boolean boolean8 = mutableDateTime0.isEqual((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime0, dateTimeZone9);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfEven();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        java.util.GregorianCalendar gregorianCalendar29 = mutableDateTime24.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime24.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property30.getFieldType();
        int int32 = mutableDateTime21.get(dateTimeFieldType31);
        int int33 = mutableDateTime0.get(dateTimeFieldType31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime10", (instant4.compareTo(mutableDateTime10) == 0) == instant4.equals(mutableDateTime10));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) 20);
        org.joda.time.ReadableInstant readableInstant11 = null;
        long long12 = property4.getDifferenceAsLong(readableInstant11);
        org.joda.time.MutableDateTime mutableDateTime13 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime15 = property4.add(0);
        org.joda.time.MutableDateTime mutableDateTime16 = property4.getMutableDateTime();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        java.util.Date date21 = mutableDateTime19.toDate();
        mutableDateTime16.setDate((org.joda.time.ReadableInstant) mutableDateTime19);
        mutableDateTime16.setYear(6329976);
        org.joda.time.DateTime dateTime25 = mutableDateTime16.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        mutableDateTime7.setWeekOfWeekyear((int) '4');
        java.lang.Object obj15 = mutableDateTime7.clone();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundCeiling();
        java.util.Locale locale22 = null;
        java.lang.String str23 = property20.getAsText(locale22);
        org.joda.time.DateTimeField dateTimeField24 = property20.getField();
        org.joda.time.MutableDateTime mutableDateTime26 = property20.add((long) 20);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = property27.getField();
        mutableDateTime7.setRounding(dateTimeField28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology31);
        mutableDateTime32.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime32.hourOfDay();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        int int40 = mutableDateTime38.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = null;
        boolean boolean42 = mutableDateTime38.isSupported(dateTimeFieldType41);
        boolean boolean43 = mutableDateTime32.isAfter((org.joda.time.ReadableInstant) mutableDateTime38);
        int int44 = mutableDateTime38.getMillisOfDay();
        mutableDateTime38.setMinuteOfDay((int) (short) 10);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.DateTimeZone dateTimeZone56 = mutableDateTime55.getZone();
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone56);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((java.lang.Object) str51, dateTimeZone56);
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime38.toMutableDateTime(dateTimeZone56);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime59.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime62 = property60.add(6434018);
        mutableDateTime7.setTime((org.joda.time.ReadableInstant) mutableDateTime62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime49", (instant3.compareTo(mutableDateTime49) == 0) == instant3.equals(mutableDateTime49));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfFloor();
        org.joda.time.DurationField durationField11 = property9.getDurationField();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime19 = property16.addWrapField((int) 'a');
        mutableDateTime19.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime29 = property25.add(9);
        int int30 = property25.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime31 = property25.roundCeiling();
        int int32 = property9.getDifference((org.joda.time.ReadableInstant) mutableDateTime31);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        mutableDateTime35.addDays((int) '4');
        int int38 = mutableDateTime35.getRoundingMode();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        int int44 = mutableDateTime41.getYearOfCentury();
        org.joda.time.Chronology chronology45 = mutableDateTime41.getChronology();
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime35.toMutableDateTime(chronology45);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(chronology45);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.secondOfMinute();
        java.util.Locale locale49 = null;
        int int50 = property48.getMaximumShortTextLength(locale49);
        long long51 = property48.remainder();
        java.util.Locale locale53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = property48.set("20", locale53);
        int int55 = property9.compareTo((org.joda.time.ReadableInstant) mutableDateTime54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime41", (instant15.compareTo(mutableDateTime41) == 0) == instant15.equals(mutableDateTime41));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = mutableDateTime8.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = mutableDateTime8.isSupported(dateTimeFieldType11);
        boolean boolean13 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        boolean boolean15 = mutableDateTime2.isEqual((long) 6311620);
        int int16 = mutableDateTime2.getDayOfMonth();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfFloor();
        java.lang.String str23 = mutableDateTime22.toString();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime26.add(readablePeriod29);
        mutableDateTime26.addWeeks(10);
        boolean boolean33 = mutableDateTime22.isEqual((org.joda.time.ReadableInstant) mutableDateTime26);
        boolean boolean34 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant20", (mutableDateTime8.compareTo(instant20) == 0) == mutableDateTime8.equals(instant20));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.copy();
        mutableDateTime6.addDays(2021);
        mutableDateTime6.addSeconds(12);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.hourOfDay();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone15);
        mutableDateTime17.setDayOfMonth((int) (short) 1);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        int int25 = mutableDateTime23.getSecondOfMinute();
        int int26 = mutableDateTime23.getYearOfCentury();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime23.toMutableDateTime(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 6, dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone31);
        mutableDateTime17.setZoneRetainFields(dateTimeZone31);
        mutableDateTime6.setZone(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        int int15 = mutableDateTime14.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.centuryOfEra();
        mutableDateTime14.setMillisOfDay((int) (short) 0);
        boolean boolean20 = mutableDateTime14.isBefore(1946L);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime32 = property31.roundHalfEven();
        int int33 = mutableDateTime32.getYear();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime35.addSeconds(3);
        org.joda.time.Chronology chronology38 = mutableDateTime35.getChronology();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(chronology38);
        mutableDateTime32.setChronology(chronology38);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) 6474871, chronology38);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime42.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime45 = property43.set((int) (short) 1);
        int int46 = mutableDateTime45.getDayOfMonth();
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone51);
        org.joda.time.DateTime dateTime53 = mutableDateTime52.toDateTime();
        mutableDateTime52.addYears(6315406);
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime56.dayOfMonth();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime56.dayOfWeek();
        mutableDateTime56.setSecondOfDay(15);
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime56.toMutableDateTimeISO();
        mutableDateTime56.setMinuteOfHour(10);
        java.lang.Object obj64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(obj64, chronology65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = null;
        java.lang.String str68 = mutableDateTime66.toString(dateTimeFormatter67);
        int int69 = mutableDateTime66.getYearOfCentury();
        org.joda.time.Chronology chronology70 = mutableDateTime66.getChronology();
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime56.toMutableDateTime(chronology70);
        org.joda.time.MutableDateTime mutableDateTime72 = mutableDateTime52.toMutableDateTime(chronology70);
        org.joda.time.MutableDateTime mutableDateTime73 = org.joda.time.MutableDateTime.now(chronology70);
        mutableDateTime45.setChronology(chronology70);
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime41, chronology70);
        mutableDateTime14.setChronology(chronology70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime39", (instant3.compareTo(mutableDateTime39) == 0) == instant3.equals(mutableDateTime39));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:15.745Z");
        mutableDateTime1.addHours(5);
        mutableDateTime1.setDate((-28393836952L));
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.millisOfSecond();
        org.joda.time.DateTime dateTime7 = mutableDateTime1.toDateTime();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundCeiling();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property12.getAsText(locale14);
        org.joda.time.DateTimeField dateTimeField16 = property12.getField();
        org.joda.time.MutableDateTime mutableDateTime18 = property12.add((long) 20);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfYear();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        int int21 = mutableDateTime1.get(dateTimeField20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfMonth();
        org.joda.time.DateTime dateTime24 = mutableDateTime22.toDateTime();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime22.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property25.getFieldType();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime1.property(dateTimeFieldType26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime22", (instant11.compareTo(mutableDateTime22) == 0) == instant11.equals(mutableDateTime22));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) 20);
        org.joda.time.ReadableInstant readableInstant11 = null;
        long long12 = property4.getDifferenceAsLong(readableInstant11);
        org.joda.time.MutableDateTime mutableDateTime13 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime15 = property4.add((long) 970);
        int int16 = mutableDateTime15.getRoundingMode();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology23);
        org.joda.time.Chronology chronology25 = mutableDateTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(chronology25);
        mutableDateTime15.setChronology(chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        boolean boolean6 = mutableDateTime2.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.copy();
        mutableDateTime7.add((long) 6357078);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10, 25);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        int int20 = mutableDateTime19.getWeekOfWeekyear();
        boolean boolean21 = mutableDateTime13.isEqual((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime13.secondOfDay();
        mutableDateTime7.setMillis((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime13.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant17", (mutableDateTime7.compareTo(instant17) == 0) == mutableDateTime7.equals(instant17));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.copy();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.yearOfEra();
        mutableDateTime6.setDate((org.joda.time.ReadableInstant) mutableDateTime11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        org.joda.time.MutableDateTime mutableDateTime9 = property4.addWrapField(31);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        boolean boolean15 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        int int16 = mutableDateTime12.getRoundingMode();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundCeiling();
        mutableDateTime22.setMillisOfSecond((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime22.yearOfEra();
        int int26 = mutableDateTime22.getSecondOfMinute();
        boolean boolean27 = mutableDateTime12.equals((java.lang.Object) mutableDateTime22);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.Instant instant13 = mutableDateTime7.toInstant();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime21 = property18.addWrapField((int) 'a');
        mutableDateTime21.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.millisOfSecond();
        int int28 = property27.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime29 = property27.roundFloor();
        mutableDateTime29.setWeekyear(31);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime36 = property33.add((long) 1970);
        int int37 = mutableDateTime36.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime41 = property39.set((int) (short) 1);
        mutableDateTime41.setTime(4, 16, (int) (byte) 1, (int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.dayOfMonth();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime47.dayOfWeek();
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        mutableDateTime52.add(readablePeriod55);
        java.util.GregorianCalendar gregorianCalendar57 = mutableDateTime52.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime52.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = property58.getFieldType();
        int int60 = mutableDateTime47.get(dateTimeFieldType59);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime41.property(dateTimeFieldType59);
        int int62 = mutableDateTime36.get(dateTimeFieldType59);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime29.property(dateTimeFieldType59);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime7.property(dateTimeFieldType59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant13", (mutableDateTime7.compareTo(instant13) == 0) == mutableDateTime7.equals(instant13));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.weekyear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        int int15 = property5.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.addWrapField(56);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfFloor();
        mutableDateTime24.setSecondOfDay((int) (short) 0);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime24.centuryOfEra();
        mutableDateTime24.setMinuteOfDay((int) (byte) 0);
        org.joda.time.DateTime dateTime30 = mutableDateTime24.toDateTime();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        int int36 = mutableDateTime34.getSecondOfMinute();
        int int37 = mutableDateTime34.getYearOfCentury();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime41.getZone();
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone42);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime34.toMutableDateTime(dateTimeZone42);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology47);
        mutableDateTime48.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime48.hourOfDay();
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.DateTimeZone dateTimeZone55 = mutableDateTime54.getZone();
        int int56 = mutableDateTime54.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        boolean boolean58 = mutableDateTime54.isSupported(dateTimeFieldType57);
        boolean boolean59 = mutableDateTime48.isAfter((org.joda.time.ReadableInstant) mutableDateTime54);
        int int60 = mutableDateTime54.getMillisOfDay();
        mutableDateTime54.setMinuteOfDay((int) (short) 10);
        java.lang.Object obj63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj63, chronology64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = null;
        java.lang.String str67 = mutableDateTime65.toString(dateTimeFormatter66);
        java.lang.Object obj69 = null;
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(obj69, chronology70);
        org.joda.time.DateTimeZone dateTimeZone72 = mutableDateTime71.getZone();
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone72);
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime((java.lang.Object) str67, dateTimeZone72);
        org.joda.time.MutableDateTime mutableDateTime75 = mutableDateTime54.toMutableDateTime(dateTimeZone72);
        org.joda.time.Chronology chronology76 = mutableDateTime54.getChronology();
        org.joda.time.MutableDateTime mutableDateTime77 = mutableDateTime45.toMutableDateTime(chronology76);
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime((long) 57, chronology76);
        org.joda.time.MutableDateTime mutableDateTime79 = mutableDateTime24.toMutableDateTime(chronology76);
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime79.secondOfDay();
        int int81 = mutableDateTime18.compareTo((org.joda.time.ReadableInstant) mutableDateTime79);
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime79.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant22 and mutableDateTime34", (instant22.compareTo(mutableDateTime34) == 0) == instant22.equals(mutableDateTime34));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfWeek();
        mutableDateTime0.setSecondOfDay(15);
        int int5 = mutableDateTime0.getWeekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime0.add(readableDuration6, 6368642);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone13);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime14.toMutableDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = mutableDateTime0.toDateTime(dateTimeZone18);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundCeiling();
        java.util.Locale locale27 = null;
        java.lang.String str28 = property25.getAsText(locale27);
        int int29 = property25.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime30 = property25.getMutableDateTime();
        java.util.Locale locale31 = null;
        java.lang.String str32 = property25.getAsShortText(locale31);
        org.joda.time.MutableDateTime mutableDateTime33 = property25.getMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property25.getFieldType();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime0.property(dateTimeFieldType34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant24", (mutableDateTime12.compareTo(instant24) == 0) == mutableDateTime12.equals(instant24));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone10);
        mutableDateTime11.setTime(1L);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.DateTime dateTime18 = mutableDateTime11.toDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime5.toMutableDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundCeiling();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.millisOfDay();
        mutableDateTime12.setSecondOfDay(0);
        boolean boolean16 = mutableDateTime12.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.yearOfCentury();
        boolean boolean19 = property18.isLeap();
        boolean boolean20 = mutableDateTime12.equals((java.lang.Object) property18);
        java.lang.String str21 = property18.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) 20);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        org.joda.time.MutableDateTime mutableDateTime14 = property11.addWrapField(0);
        java.lang.String str15 = property11.getAsString();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        int int22 = mutableDateTime20.getSecondOfMinute();
        int int23 = mutableDateTime20.getYearOfCentury();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime20.toMutableDateTime(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 6, dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(1606262415427L, dateTimeZone28);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.era();
        long long36 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfWeek();
        mutableDateTime0.setSecondOfDay(15);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime0.toMutableDateTimeISO();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime0.toMutableDateTime(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime7.toMutableDateTime();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        int int19 = property13.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
        int int20 = mutableDateTime17.getYearOfEra();
        mutableDateTime8.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        int int22 = mutableDateTime8.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime17", (instant12.compareTo(mutableDateTime17) == 0) == instant12.equals(mutableDateTime17));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = mutableDateTime8.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = mutableDateTime8.isSupported(dateTimeFieldType11);
        boolean boolean13 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.ReadableInstant readableInstant14 = null;
        mutableDateTime2.setDate(readableInstant14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.add((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.year();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property19.getAsText(locale20);
        org.joda.time.MutableDateTime mutableDateTime23 = property19.add((long) 6428557);
        mutableDateTime23.setDayOfWeek((int) (short) 1);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundCeiling();
        java.util.Locale locale32 = null;
        java.lang.String str33 = property30.getAsText(locale32);
        int int34 = property30.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime35 = property30.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.yearOfEra();
        int int37 = mutableDateTime35.getDayOfYear();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime35.dayOfMonth();
        java.lang.String str39 = property38.getAsText();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.getMutableDateTime();
        java.lang.String str41 = property38.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime43 = property38.add(6451761);
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime46 = property45.roundCeiling();
        org.joda.time.DateTime dateTime47 = mutableDateTime46.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime46.yearOfEra();
        boolean boolean50 = mutableDateTime46.isAfter((long) ' ');
        mutableDateTime46.setDate((long) 56);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime46.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField54 = property53.getField();
        int int55 = mutableDateTime43.get(dateTimeField54);
        mutableDateTime23.setRounding(dateTimeField54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant29", (mutableDateTime8.compareTo(instant29) == 0) == mutableDateTime8.equals(instant29));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.roundHalfFloor();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime23 = property20.addWrapField((int) 'a');
        mutableDateTime23.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        mutableDateTime23.setWeekOfWeekyear((int) '4');
        java.lang.Object obj31 = mutableDateTime23.clone();
        int int32 = mutableDateTime23.getYearOfCentury();
        boolean boolean33 = mutableDateTime15.isBefore((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime15.add(readablePeriod34);
        java.lang.Object obj36 = mutableDateTime15.clone();
        org.joda.time.DateTimeField dateTimeField37 = mutableDateTime15.getRoundingField();
        mutableDateTime15.addDays(283);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime42.add(readablePeriod45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime42.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime48 = property47.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime50 = property49.roundHalfEven();
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = null;
        java.lang.String str55 = mutableDateTime53.toString(dateTimeFormatter54);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        mutableDateTime53.add(readablePeriod56);
        java.util.GregorianCalendar gregorianCalendar58 = mutableDateTime53.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime53.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property59.getFieldType();
        int int61 = mutableDateTime50.get(dateTimeFieldType60);
        mutableDateTime15.setDate((org.joda.time.ReadableInstant) mutableDateTime50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime53", (instant3.compareTo(mutableDateTime53) == 0) == instant3.equals(mutableDateTime53));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:15.745Z");
        mutableDateTime1.addHours(5);
        mutableDateTime1.setDate((-28393836952L));
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundCeiling();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundCeiling();
        mutableDateTime13.setMillisOfSecond((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundFloor();
        mutableDateTime7.setMillis((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and mutableDateTime17", (mutableDateTime7.compareTo(mutableDateTime17) == 0) == mutableDateTime7.equals(mutableDateTime17));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.util.Date date4 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.set((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime8.add(readablePeriod9, 20);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundCeiling();
        java.util.Locale locale18 = null;
        java.lang.String str19 = property16.getAsText(locale18);
        org.joda.time.DateTimeField dateTimeField20 = property16.getField();
        int int21 = mutableDateTime8.get(dateTimeField20);
        int int22 = mutableDateTime2.get(dateTimeField20);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundCeiling();
        mutableDateTime28.setMillisOfSecond((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.dayOfMonth();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.dayOfWeek();
        mutableDateTime31.setSecondOfDay(15);
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime31.toMutableDateTimeISO();
        int int37 = mutableDateTime31.getYear();
        mutableDateTime28.setMillis((org.joda.time.ReadableInstant) mutableDateTime31);
        boolean boolean39 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime28);
        java.lang.Object obj40 = mutableDateTime28.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant15", (mutableDateTime2.compareTo(instant15) == 0) == mutableDateTime2.equals(instant15));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        org.joda.time.DateTimeField dateTimeField8 = property4.getField();
        org.joda.time.MutableDateTime mutableDateTime10 = property4.add((long) 20);
        org.joda.time.ReadableInstant readableInstant11 = null;
        long long12 = property4.getDifferenceAsLong(readableInstant11);
        org.joda.time.MutableDateTime mutableDateTime13 = property4.roundHalfCeiling();
        mutableDateTime13.addMillis((int) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.toMutableDateTime();
        mutableDateTime16.setSecondOfDay(10);
        java.util.GregorianCalendar gregorianCalendar20 = mutableDateTime16.toGregorianCalendar();
        int int21 = mutableDateTime16.getSecondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:29.177Z");
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.millisOfDay();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.minuteOfDay();
        int int26 = mutableDateTime16.compareTo((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime16.getZone();
        mutableDateTime13.setTime((org.joda.time.ReadableInstant) mutableDateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.addWrapField((int) 'a');
        mutableDateTime7.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.millisOfSecond();
        org.joda.time.DurationField durationField14 = property13.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.roundCeiling();
        org.joda.time.Interval interval16 = property13.toInterval();
        org.joda.time.MutableDateTime mutableDateTime17 = property13.roundHalfFloor();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        java.util.GregorianCalendar gregorianCalendar25 = mutableDateTime20.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime20.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        int int28 = mutableDateTime17.get(dateTimeFieldType27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        int int1 = mutableDateTime0.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        mutableDateTime0.add(readablePeriod2, (int) (byte) -1);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        int int10 = mutableDateTime7.getYearOfCentury();
        org.joda.time.Chronology chronology11 = mutableDateTime7.getChronology();
        mutableDateTime0.setChronology(chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology11);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology11);
        mutableDateTime14.setMillisOfDay(58);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        mutableDateTime19.setMonthOfYear((int) (short) 1);
        int int25 = mutableDateTime19.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime27.addSeconds(3);
        org.joda.time.Chronology chronology30 = mutableDateTime27.getChronology();
        org.joda.time.DateTime dateTime31 = mutableDateTime19.toDateTime(chronology30);
        int int32 = mutableDateTime19.getHourOfDay();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology34);
        mutableDateTime35.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime35.hourOfDay();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime41.getZone();
        int int43 = mutableDateTime41.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = null;
        boolean boolean45 = mutableDateTime41.isSupported(dateTimeFieldType44);
        boolean boolean46 = mutableDateTime35.isAfter((org.joda.time.ReadableInstant) mutableDateTime41);
        int int47 = mutableDateTime41.getMillisOfDay();
        mutableDateTime41.setMinuteOfHour(2);
        int int50 = mutableDateTime41.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime51.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime54 = property52.set((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        mutableDateTime54.add(readablePeriod55, 20);
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.Instant instant61 = mutableDateTime60.toInstant();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime60.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime63 = property62.roundCeiling();
        java.util.Locale locale64 = null;
        java.lang.String str65 = property62.getAsText(locale64);
        org.joda.time.DateTimeField dateTimeField66 = property62.getField();
        int int67 = mutableDateTime54.get(dateTimeField66);
        int int68 = mutableDateTime41.get(dateTimeField66);
        mutableDateTime19.setRounding(dateTimeField66);
        int int70 = mutableDateTime14.get(dateTimeField66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant61", (mutableDateTime0.compareTo(instant61) == 0) == mutableDateTime0.equals(instant61));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = mutableDateTime8.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = mutableDateTime8.isSupported(dateTimeFieldType11);
        boolean boolean13 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        int int14 = mutableDateTime8.getMillisOfDay();
        mutableDateTime8.setMinuteOfDay((int) (short) 10);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) str21, dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime8.toMutableDateTime(dateTimeZone26);
        mutableDateTime8.setSecondOfDay((int) 'a');
        int int32 = mutableDateTime8.getMinuteOfHour();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        int int38 = mutableDateTime35.getYearOfCentury();
        mutableDateTime35.setMonthOfYear((int) (short) 1);
        int int41 = mutableDateTime35.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime43.addSeconds(3);
        org.joda.time.Chronology chronology46 = mutableDateTime43.getChronology();
        org.joda.time.DateTime dateTime47 = mutableDateTime35.toDateTime(chronology46);
        int int48 = mutableDateTime35.getHourOfDay();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology50);
        mutableDateTime51.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime51.hourOfDay();
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.DateTimeZone dateTimeZone58 = mutableDateTime57.getZone();
        int int59 = mutableDateTime57.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = null;
        boolean boolean61 = mutableDateTime57.isSupported(dateTimeFieldType60);
        boolean boolean62 = mutableDateTime51.isAfter((org.joda.time.ReadableInstant) mutableDateTime57);
        int int63 = mutableDateTime57.getMillisOfDay();
        mutableDateTime57.setMinuteOfHour(2);
        int int66 = mutableDateTime57.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime67.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime70 = property68.set((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        mutableDateTime70.add(readablePeriod71, 20);
        java.lang.Object obj74 = null;
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(obj74, chronology75);
        org.joda.time.Instant instant77 = mutableDateTime76.toInstant();
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime76.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime79 = property78.roundCeiling();
        java.util.Locale locale80 = null;
        java.lang.String str81 = property78.getAsText(locale80);
        org.joda.time.DateTimeField dateTimeField82 = property78.getField();
        int int83 = mutableDateTime70.get(dateTimeField82);
        int int84 = mutableDateTime57.get(dateTimeField82);
        mutableDateTime35.setRounding(dateTimeField82);
        mutableDateTime8.setDate((org.joda.time.ReadableInstant) mutableDateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant77", (mutableDateTime19.compareTo(instant77) == 0) == mutableDateTime19.equals(instant77));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        mutableDateTime5.setSecondOfDay((int) (short) 0);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.centuryOfEra();
        mutableDateTime5.setMinuteOfDay((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.dayOfWeek();
        org.joda.time.DateTime dateTime12 = mutableDateTime5.toDateTime();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        boolean boolean21 = mutableDateTime19.isAfterNow();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((java.lang.Object) str26, dateTimeZone31);
        mutableDateTime19.setZone(dateTimeZone31);
        mutableDateTime15.setZoneRetainFields(dateTimeZone31);
        java.util.Date date36 = mutableDateTime15.toDate();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology39);
        mutableDateTime40.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime40.hourOfDay();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime46.getZone();
        int int48 = mutableDateTime46.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = null;
        boolean boolean50 = mutableDateTime46.isSupported(dateTimeFieldType49);
        boolean boolean51 = mutableDateTime40.isAfter((org.joda.time.ReadableInstant) mutableDateTime46);
        int int52 = mutableDateTime46.getMillisOfDay();
        mutableDateTime46.setMinuteOfDay((int) (short) 10);
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = mutableDateTime57.toString(dateTimeFormatter58);
        java.lang.Object obj61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(obj61, chronology62);
        org.joda.time.DateTimeZone dateTimeZone64 = mutableDateTime63.getZone();
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((java.lang.Object) str59, dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime46.toMutableDateTime(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime((long) 753, dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime69 = org.joda.time.MutableDateTime.now(dateTimeZone64);
        org.joda.time.DateTime dateTime70 = mutableDateTime15.toDateTime(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime71 = org.joda.time.MutableDateTime.now(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime73 = org.joda.time.MutableDateTime.now(dateTimeZone64);
        org.joda.time.DateTime dateTime74 = dateTime12.toDateTime(dateTimeZone64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime3 = property1.set((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableDateTime3.add(readablePeriod4, 20);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundCeiling();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property11.getAsText(locale13);
        org.joda.time.DateTimeField dateTimeField15 = property11.getField();
        int int16 = mutableDateTime3.get(dateTimeField15);
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime3.toGregorianCalendar();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfFloor();
        java.lang.String str24 = mutableDateTime23.toString();
        mutableDateTime23.setMillis((long) 105);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime23.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime28.copy();
        boolean boolean30 = mutableDateTime3.equals((java.lang.Object) mutableDateTime29);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime33.add(readablePeriod36);
        java.util.GregorianCalendar gregorianCalendar38 = mutableDateTime33.toGregorianCalendar();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        mutableDateTime41.addDays((int) '4');
        int int44 = mutableDateTime41.getRoundingMode();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        int int50 = mutableDateTime47.getYearOfCentury();
        org.joda.time.Chronology chronology51 = mutableDateTime47.getChronology();
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime41.toMutableDateTime(chronology51);
        mutableDateTime33.setChronology(chronology51);
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now(chronology51);
        org.joda.time.MutableDateTime mutableDateTime55 = org.joda.time.MutableDateTime.now(chronology51);
        mutableDateTime29.setChronology(chronology51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime33", (instant10.compareTo(mutableDateTime33) == 0) == instant10.equals(mutableDateTime33));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology5);
        mutableDateTime6.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.hourOfDay();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        int int14 = mutableDateTime12.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        boolean boolean16 = mutableDateTime12.isSupported(dateTimeFieldType15);
        boolean boolean17 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
        int int18 = mutableDateTime12.getMillisOfDay();
        mutableDateTime12.setMinuteOfHour(2);
        int int21 = mutableDateTime12.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime25 = property23.set((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime25.add(readablePeriod26, 20);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.Instant instant32 = mutableDateTime31.toInstant();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundCeiling();
        java.util.Locale locale35 = null;
        java.lang.String str36 = property33.getAsText(locale35);
        org.joda.time.DateTimeField dateTimeField37 = property33.getField();
        int int38 = mutableDateTime25.get(dateTimeField37);
        int int39 = mutableDateTime12.get(dateTimeField37);
        mutableDateTime2.setRounding(dateTimeField37);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.dayOfMonth();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime41.dayOfWeek();
        mutableDateTime41.setSecondOfDay(15);
        int int46 = mutableDateTime41.getWeekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime41.add(readableDuration47, 6368642);
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime53.getZone();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone54);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.DateTimeZone dateTimeZone59 = mutableDateTime58.getZone();
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime55.toMutableDateTime(dateTimeZone59);
        org.joda.time.DateTime dateTime61 = mutableDateTime41.toDateTime(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = mutableDateTime2.toDateTime(dateTimeZone59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant32 and mutableDateTime53", (instant32.compareTo(mutableDateTime53) == 0) == instant32.equals(mutableDateTime53));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfEven();
        int int12 = mutableDateTime11.getYear();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 'a');
        mutableDateTime14.addSeconds(3);
        org.joda.time.Chronology chronology17 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology17);
        mutableDateTime11.setChronology(chronology17);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 6474871, chronology17);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.set((int) (short) 1);
        int int25 = mutableDateTime24.getDayOfMonth();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone30);
        org.joda.time.DateTime dateTime32 = mutableDateTime31.toDateTime();
        mutableDateTime31.addYears(6315406);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.dayOfMonth();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.dayOfWeek();
        mutableDateTime35.setSecondOfDay(15);
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime35.toMutableDateTimeISO();
        mutableDateTime35.setMinuteOfHour(10);
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        int int48 = mutableDateTime45.getYearOfCentury();
        org.joda.time.Chronology chronology49 = mutableDateTime45.getChronology();
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime35.toMutableDateTime(chronology49);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime31.toMutableDateTime(chronology49);
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(chronology49);
        mutableDateTime24.setChronology(chronology49);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime20, chronology49);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime55.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime58 = property56.set((int) (short) 1);
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.Instant instant62 = mutableDateTime61.toInstant();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime61.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime64 = property63.roundHalfFloor();
        java.lang.Object obj65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(obj65, chronology66);
        org.joda.time.DateTimeZone dateTimeZone68 = mutableDateTime67.getZone();
        org.joda.time.DateTime dateTime69 = mutableDateTime64.toDateTime(dateTimeZone68);
        org.joda.time.MutableDateTime mutableDateTime70 = mutableDateTime58.toMutableDateTime(dateTimeZone68);
        mutableDateTime20.setZone(dateTimeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and instant62", (mutableDateTime18.compareTo(instant62) == 0) == mutableDateTime18.equals(instant62));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.addWrapField(39);
        org.joda.time.MutableDateTime mutableDateTime7 = property4.roundHalfFloor();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property4.getAsText(locale8);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        boolean boolean16 = mutableDateTime15.isEqualNow();
        long long17 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime15.minuteOfDay();
        java.util.Date date19 = mutableDateTime15.toDate();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime24 = property21.add((long) 1970);
        java.util.GregorianCalendar gregorianCalendar25 = mutableDateTime24.toGregorianCalendar();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        java.util.GregorianCalendar gregorianCalendar33 = mutableDateTime28.toGregorianCalendar();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        mutableDateTime36.addDays((int) '4');
        int int39 = mutableDateTime36.getRoundingMode();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        int int45 = mutableDateTime42.getYearOfCentury();
        org.joda.time.Chronology chronology46 = mutableDateTime42.getChronology();
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime36.toMutableDateTime(chronology46);
        mutableDateTime28.setChronology(chronology46);
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(chronology46);
        boolean boolean50 = mutableDateTime24.isAfter((org.joda.time.ReadableInstant) mutableDateTime49);
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = null;
        java.lang.String str55 = mutableDateTime53.toString(dateTimeFormatter54);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        mutableDateTime53.add(readablePeriod56);
        java.util.GregorianCalendar gregorianCalendar58 = mutableDateTime53.toGregorianCalendar();
        int int59 = mutableDateTime53.getDayOfMonth();
        mutableDateTime24.setTime((org.joda.time.ReadableInstant) mutableDateTime53);
        java.lang.Object obj61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(obj61, chronology62);
        org.joda.time.DateTimeZone dateTimeZone64 = mutableDateTime63.getZone();
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(dateTimeZone64);
        org.joda.time.DateTime dateTime66 = mutableDateTime53.toDateTime(dateTimeZone64);
        mutableDateTime15.setZone(dateTimeZone64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) 10, dateTimeZone4);
        int int7 = mutableDateTime6.getEra();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime14 = property12.roundCeiling();
        int int15 = property12.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime16 = property12.roundFloor();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime24 = property21.addWrapField((int) 'a');
        mutableDateTime24.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime24.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundCeiling();
        org.joda.time.DateTimeField dateTimeField32 = property30.getField();
        org.joda.time.MutableDateTime mutableDateTime33 = property30.roundHalfFloor();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.Instant instant39 = mutableDateTime38.toInstant();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime38.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime41 = property40.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime43 = property40.addWrapField((int) 'a');
        mutableDateTime43.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime43.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime50 = property49.roundCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property49.getFieldType();
        int int52 = mutableDateTime33.get(dateTimeFieldType51);
        boolean boolean53 = mutableDateTime16.isSupported(dateTimeFieldType51);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime6.property(dateTimeFieldType51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant11", (mutableDateTime3.compareTo(instant11) == 0) == mutableDateTime3.equals(instant11));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.util.Date date4 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.set((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime8.add(readablePeriod9, 20);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundCeiling();
        java.util.Locale locale18 = null;
        java.lang.String str19 = property16.getAsText(locale18);
        org.joda.time.DateTimeField dateTimeField20 = property16.getField();
        int int21 = mutableDateTime8.get(dateTimeField20);
        int int22 = mutableDateTime2.get(dateTimeField20);
        org.joda.time.DateTimeField dateTimeField23 = mutableDateTime2.getRoundingField();
        mutableDateTime2.addDays(31);
        int int26 = mutableDateTime2.getEra();
        int int27 = mutableDateTime2.getYear();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) (byte) 10);
        int int30 = mutableDateTime29.getMillisOfDay();
        int int31 = mutableDateTime29.getMonthOfYear();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.dayOfMonth();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.dayOfWeek();
        mutableDateTime33.setSecondOfDay(15);
        int int38 = mutableDateTime33.getWeekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration39 = null;
        mutableDateTime33.add(readableDuration39, 6368642);
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = mutableDateTime45.getZone();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:00.549Z", dateTimeZone46);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime47.toMutableDateTime(dateTimeZone51);
        org.joda.time.DateTime dateTime53 = mutableDateTime33.toDateTime(dateTimeZone51);
        mutableDateTime29.setDate((org.joda.time.ReadableInstant) dateTime53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime45", (instant15.compareTo(mutableDateTime45) == 0) == instant15.equals(mutableDateTime45));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.now();
        int int3 = mutableDateTime2.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableDateTime2.add(readablePeriod4, (int) (byte) -1);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        mutableDateTime2.setChronology(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology13);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 720, chronology13);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(0L, chronology13);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        mutableDateTime20.setSecondOfDay((int) '#');
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime31 = property28.addWrapField((int) 'a');
        mutableDateTime31.setTime((int) (short) 10, (int) '#', 5, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime31.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundCeiling();
        org.joda.time.DateTimeField dateTimeField39 = property37.getField();
        int int40 = mutableDateTime20.get(dateTimeField39);
        int int41 = mutableDateTime20.getCenturyOfEra();
        boolean boolean42 = mutableDateTime17.isAfter((org.joda.time.ReadableInstant) mutableDateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant21", (mutableDateTime2.compareTo(instant21) == 0) == mutableDateTime2.equals(instant21));
    }
}

