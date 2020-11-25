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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.hourOfDay();
        boolean boolean13 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime5.millisOfSecond();
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime mutableDateTime12 = property4.addWrapField(330);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.hourOfDay();
        boolean boolean13 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        mutableDateTime5.setYear(3);
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
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime8.toGregorianCalendar();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:02.268Z", dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone16);
        mutableDateTime8.setZoneRetainFields(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        mutableDateTime5.setZone(dateTimeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime8.toGregorianCalendar();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime16.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now();
        mutableDateTime20.setHourOfDay(2);
        int int23 = property18.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        boolean boolean24 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:02.268Z", dateTimeZone15);
        org.joda.time.DateTime dateTime18 = mutableDateTime8.toDateTime(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        int int5 = mutableDateTime4.getCenturyOfEra();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        mutableDateTime4.setRounding(dateTimeField14);
        mutableDateTime4.addWeeks(2021);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.monthOfYear();
        mutableDateTime20.setDate((int) (short) 0, (int) (byte) 1, (int) (short) 1);
        boolean boolean27 = mutableDateTime4.isBefore((org.joda.time.ReadableInstant) mutableDateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant21", (mutableDateTime2.compareTo(instant21) == 0) == mutableDateTime2.equals(instant21));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(chronology12);
        mutableDateTime5.setDate((org.joda.time.ReadableInstant) mutableDateTime13);
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
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        int int9 = mutableDateTime6.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.hourOfDay();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.secondOfDay();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime6.toMutableDateTime(chronology18);
        mutableDateTime2.setChronology(chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime6", (instant3.compareTo(mutableDateTime6) == 0) == instant3.equals(mutableDateTime6));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfDay();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime9.add(readablePeriod10, (int) (short) 10);
        boolean boolean13 = mutableDateTime9.isAfterNow();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime9.add(readablePeriod14, (int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime9.toMutableDateTime();
        int int18 = property6.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.DateTime dateTime15 = mutableDateTime5.toDateTime(chronology12);
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
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.Instant instant7 = mutableDateTime2.toInstant();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        mutableDateTime2.setRounding(dateTimeField16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.hourOfDay();
        boolean boolean13 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        mutableDateTime8.setZoneRetainFields(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTime dateTime1 = mutableDateTime0.toDateTime();
        int int2 = dateTime1.getYearOfCentury();
        boolean boolean3 = dateTime1.isAfterNow();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        mutableDateTime6.setSecondOfDay((int) '#');
        int int10 = mutableDateTime6.getMillisOfSecond();
        org.joda.time.Instant instant11 = mutableDateTime6.toInstant();
        boolean boolean12 = dateTime1.equals((java.lang.Object) mutableDateTime6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant7", (mutableDateTime0.compareTo(instant7) == 0) == mutableDateTime0.equals(instant7));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology6);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        mutableDateTime11.setDate((int) (short) 0, (int) (byte) 1, (int) (short) 1);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        int int24 = mutableDateTime20.getMinuteOfHour();
        boolean boolean25 = mutableDateTime11.isBefore((org.joda.time.ReadableInstant) mutableDateTime20);
        mutableDateTime8.setTime((org.joda.time.ReadableInstant) mutableDateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant12", (mutableDateTime7.compareTo(instant12) == 0) == mutableDateTime7.equals(instant12));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.hourOfDay();
        boolean boolean13 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime8.getZone();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime8.add(readablePeriod15, (int) (short) 10);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        int int27 = mutableDateTime8.get(dateTimeField26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        int int6 = mutableDateTime5.getYearOfCentury();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        java.lang.String str11 = mutableDateTime9.toString();
        mutableDateTime9.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime9.add(readablePeriod14, (-1));
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:02.268Z", dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone21);
        mutableDateTime9.setZone(dateTimeZone21);
        mutableDateTime5.setZone(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
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
        java.util.Locale locale5 = null;
        java.util.Calendar calendar6 = mutableDateTime2.toCalendar(locale5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.era();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfYear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:02.268Z", dateTimeZone13);
        mutableDateTime2.setZoneRetainFields(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
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
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundHalfEven();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        mutableDateTime9.setTime((long) '#');
        mutableDateTime9.addDays((int) '4');
        int int16 = mutableDateTime9.getMinuteOfHour();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime9.toMutableDateTime(dateTimeZone20);
        boolean boolean22 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.DateTime dateTime23 = mutableDateTime9.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.hourOfDay();
        boolean boolean13 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime5.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundHalfEven();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        mutableDateTime9.setTime((long) '#');
        mutableDateTime9.addDays((int) '4');
        int int16 = mutableDateTime9.getMinuteOfHour();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime9.toMutableDateTime(dateTimeZone20);
        boolean boolean22 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        java.util.GregorianCalendar gregorianCalendar28 = mutableDateTime27.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime27.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now();
        mutableDateTime31.setHourOfDay(2);
        int int34 = property29.compareTo((org.joda.time.ReadableInstant) mutableDateTime31);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        mutableDateTime37.setSecondOfDay(10);
        boolean boolean40 = mutableDateTime31.isEqual((org.joda.time.ReadableInstant) mutableDateTime37);
        mutableDateTime37.setDayOfYear(3);
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = mutableDateTime45.getZone();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone46);
        java.util.GregorianCalendar gregorianCalendar48 = mutableDateTime47.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime47.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime50 = property49.roundFloor();
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = null;
        java.lang.String str55 = mutableDateTime53.toString(dateTimeFormatter54);
        int int56 = mutableDateTime53.getYearOfCentury();
        org.joda.time.Chronology chronology57 = mutableDateTime53.getChronology();
        org.joda.time.MutableDateTime mutableDateTime58 = org.joda.time.MutableDateTime.now(chronology57);
        org.joda.time.MutableDateTime mutableDateTime59 = org.joda.time.MutableDateTime.now(chronology57);
        mutableDateTime50.setChronology(chronology57);
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime37.toMutableDateTime(chronology57);
        org.joda.time.MutableDateTime mutableDateTime62 = mutableDateTime9.toMutableDateTime(chronology57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
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
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.DateTime dateTime11 = mutableDateTime8.toDateTimeISO();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = dateTime11.toString(dateTimeFormatter12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        mutableDateTime5.addHours(30);
        int int8 = mutableDateTime5.getEra();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        mutableDateTime11.setTime((long) '#');
        mutableDateTime11.addDays((int) '4');
        int int18 = mutableDateTime11.getMinuteOfHour();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime11.toMutableDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone22);
        boolean boolean25 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        mutableDateTime5.setDayOfYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime5.getZone();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        int int15 = mutableDateTime13.getSecondOfMinute();
        mutableDateTime13.setMillis((long) 3);
        int int18 = mutableDateTime13.getRoundingMode();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.dayOfMonth();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        int int22 = mutableDateTime5.get(dateTimeField21);
        mutableDateTime5.setMillis((long) 100);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime26.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime26.toMutableDateTime();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        int int35 = mutableDateTime32.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime32.hourOfDay();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.secondOfDay();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        int int43 = mutableDateTime40.getYearOfCentury();
        org.joda.time.Chronology chronology44 = mutableDateTime40.getChronology();
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime32.toMutableDateTime(chronology44);
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now();
        mutableDateTime46.setHourOfDay(2);
        mutableDateTime46.addHours(1);
        boolean boolean51 = mutableDateTime46.isAfterNow();
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = null;
        java.lang.String str56 = mutableDateTime54.toString(dateTimeFormatter55);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        mutableDateTime54.add(readablePeriod57);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime60.copy();
        org.joda.time.MutableDateTime mutableDateTime62 = mutableDateTime60.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime60.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime65 = property63.add(0);
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(obj66, chronology67);
        org.joda.time.DateTimeZone dateTimeZone69 = mutableDateTime68.getZone();
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime72 = mutableDateTime71.copy();
        java.lang.Object obj73 = null;
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(obj73, chronology74);
        org.joda.time.DateTimeZone dateTimeZone76 = mutableDateTime75.getZone();
        java.lang.String str77 = mutableDateTime75.toString();
        mutableDateTime75.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        mutableDateTime75.add(readablePeriod80, (-1));
        org.joda.time.MutableDateTime.Property property83 = mutableDateTime75.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = property83.getFieldType();
        int int85 = mutableDateTime71.get(dateTimeFieldType84);
        org.joda.time.MutableDateTime.Property property86 = mutableDateTime68.property(dateTimeFieldType84);
        mutableDateTime65.set(dateTimeFieldType84, 105);
        boolean boolean89 = mutableDateTime54.isSupported(dateTimeFieldType84);
        mutableDateTime46.set(dateTimeFieldType84, 29);
        boolean boolean92 = mutableDateTime32.isSupported(dateTimeFieldType84);
        mutableDateTime26.set(dateTimeFieldType84, (int) (short) 0);
        int int95 = mutableDateTime5.get(dateTimeFieldType84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime32", (instant3.compareTo(mutableDateTime32) == 0) == instant3.equals(mutableDateTime32));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.getMutableDateTime();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 48, dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime6.toMutableDateTime(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
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
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundHalfEven();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        mutableDateTime9.setTime((long) '#');
        mutableDateTime9.addDays((int) '4');
        int int16 = mutableDateTime9.getMinuteOfHour();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime9.toMutableDateTime(dateTimeZone20);
        boolean boolean22 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        int int23 = mutableDateTime6.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.centuryOfEra();
        mutableDateTime2.setSecondOfMinute(29);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime2.add(readableDuration7);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        boolean boolean17 = mutableDateTime15.isSupported(dateTimeFieldType16);
        mutableDateTime15.setDayOfYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 105, dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime24.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime24.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.centuryOfEra();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        mutableDateTime31.addWeeks(10);
        mutableDateTime31.addDays(20);
        java.util.Date date40 = mutableDateTime31.toDate();
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime31.copy();
        int int42 = property28.compareTo((org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.Chronology chronology43 = mutableDateTime41.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime22.toMutableDateTime(chronology43);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime22", (instant13.compareTo(mutableDateTime22) == 0) == instant13.equals(mutableDateTime22));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        int int8 = mutableDateTime5.getCenturyOfEra();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        java.lang.String str13 = mutableDateTime11.toString();
        mutableDateTime11.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime11.add(readablePeriod16, (-1));
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:02.268Z", dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        mutableDateTime11.setZone(dateTimeZone23);
        org.joda.time.DateTime dateTime28 = mutableDateTime5.toDateTime(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.hourOfDay();
        boolean boolean13 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.addSeconds((int) (short) 1);
        long long10 = mutableDateTime2.getMillis();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.weekyear();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        mutableDateTime14.setSecondOfDay((int) '#');
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime14.add(readableDuration18);
        boolean boolean20 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime14);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:02.268Z", dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.secondOfMinute();
        int int30 = mutableDateTime14.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime24", (instant15.compareTo(mutableDateTime24) == 0) == instant15.equals(mutableDateTime24));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = mutableDateTime6.isSupported(dateTimeFieldType7);
        mutableDateTime6.setDayOfYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 105, dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime15.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime15.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.centuryOfEra();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        mutableDateTime22.addWeeks(10);
        mutableDateTime22.addDays(20);
        java.util.Date date31 = mutableDateTime22.toDate();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime22.copy();
        int int33 = property19.compareTo((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.Chronology chronology34 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime13.toMutableDateTime(chronology34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime13.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime35", (instant4.compareTo(mutableDateTime35) == 0) == instant4.equals(mutableDateTime35));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = mutableDateTime6.isSupported(dateTimeFieldType7);
        mutableDateTime6.setDayOfYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 105, dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime15.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime15.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.centuryOfEra();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        mutableDateTime22.addWeeks(10);
        mutableDateTime22.addDays(20);
        java.util.Date date31 = mutableDateTime22.toDate();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime22.copy();
        int int33 = property19.compareTo((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.Chronology chronology34 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime13.toMutableDateTime(chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime13.copy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime35", (instant4.compareTo(mutableDateTime35) == 0) == instant4.equals(mutableDateTime35));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        mutableDateTime5.setDayOfYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime5.getZone();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        int int15 = mutableDateTime13.getSecondOfMinute();
        mutableDateTime13.setMillis((long) 3);
        int int18 = mutableDateTime13.getRoundingMode();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.dayOfMonth();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        int int22 = mutableDateTime5.get(dateTimeField21);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime5.copy();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        java.lang.String str28 = mutableDateTime26.toString();
        mutableDateTime26.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime26.add(readablePeriod31, (-1));
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:02.268Z", dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(dateTimeZone38);
        mutableDateTime26.setZone(dateTimeZone38);
        org.joda.time.DateTime dateTime43 = mutableDateTime5.toDateTime(dateTimeZone38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime37", (instant3.compareTo(mutableDateTime37) == 0) == instant3.equals(mutableDateTime37));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        java.lang.String str5 = mutableDateTime3.toString();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime3.minuteOfHour();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = mutableDateTime12.isSupported(dateTimeFieldType13);
        mutableDateTime12.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime18 = mutableDateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime3.toMutableDateTime(chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:15.079Z", chronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant10", (mutableDateTime3.compareTo(instant10) == 0) == mutableDateTime3.equals(instant10));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.toMutableDateTime();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        int int10 = mutableDateTime7.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.hourOfDay();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.secondOfDay();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime7.toMutableDateTime(chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now();
        mutableDateTime21.setHourOfDay(2);
        mutableDateTime21.addHours(1);
        boolean boolean26 = mutableDateTime21.isAfterNow();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime35.copy();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime35.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime35.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.add(0);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime43.getZone();
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime46.copy();
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        java.lang.String str52 = mutableDateTime50.toString();
        mutableDateTime50.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        mutableDateTime50.add(readablePeriod55, (-1));
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime50.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = property58.getFieldType();
        int int60 = mutableDateTime46.get(dateTimeFieldType59);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime43.property(dateTimeFieldType59);
        mutableDateTime40.set(dateTimeFieldType59, 105);
        boolean boolean64 = mutableDateTime29.isSupported(dateTimeFieldType59);
        mutableDateTime21.set(dateTimeFieldType59, 29);
        boolean boolean67 = mutableDateTime7.isSupported(dateTimeFieldType59);
        mutableDateTime1.set(dateTimeFieldType59, (int) (short) 0);
        java.lang.Object obj70 = null;
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(obj70, chronology71);
        org.joda.time.Instant instant73 = mutableDateTime72.toInstant();
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime72.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime75 = property74.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = null;
        boolean boolean77 = mutableDateTime75.isSupported(dateTimeFieldType76);
        mutableDateTime75.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime75.yearOfCentury();
        org.joda.time.DateTime dateTime81 = mutableDateTime75.toDateTimeISO();
        org.joda.time.Chronology chronology82 = dateTime81.getChronology();
        org.joda.time.MutableDateTime mutableDateTime83 = mutableDateTime1.toMutableDateTime(chronology82);
        org.joda.time.MutableDateTime mutableDateTime84 = org.joda.time.MutableDateTime.now(chronology82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant73", (mutableDateTime7.compareTo(instant73) == 0) == mutableDateTime7.equals(instant73));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField(4);
        java.util.Locale locale11 = null;
        int int12 = property8.getMaximumTextLength(locale11);
        org.joda.time.MutableDateTime mutableDateTime14 = property8.addWrapField(33);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        java.util.GregorianCalendar gregorianCalendar20 = mutableDateTime19.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundFloor();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology29);
        mutableDateTime22.setChronology(chronology29);
        org.joda.time.DateTime dateTime33 = mutableDateTime14.toDateTime(chronology29);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology35);
        mutableDateTime36.addMillis((int) 'a');
        int int39 = mutableDateTime36.getDayOfYear();
        java.util.GregorianCalendar gregorianCalendar40 = mutableDateTime36.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.secondOfMinute();
        java.util.Locale locale42 = null;
        java.lang.String str43 = property41.getAsText(locale42);
        org.joda.time.MutableDateTime mutableDateTime44 = property41.roundCeiling();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.dayOfWeek();
        java.lang.String str46 = property45.getAsShortText();
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.Instant instant50 = mutableDateTime49.toInstant();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime49.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundHalfFloor();
        org.joda.time.DurationField durationField53 = property51.getRangeDurationField();
        boolean boolean54 = property45.equals((java.lang.Object) durationField53);
        org.joda.time.Interval interval55 = property45.toInterval();
        int int56 = property45.getLeapAmount();
        boolean boolean57 = dateTime33.equals((java.lang.Object) int56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and instant50", (mutableDateTime17.compareTo(instant50) == 0) == mutableDateTime17.equals(instant50));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        int int10 = mutableDateTime5.getSecondOfDay();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime15.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now();
        mutableDateTime19.setHourOfDay(2);
        int int22 = property17.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        mutableDateTime25.setTime((long) '#');
        mutableDateTime25.addDays((int) '4');
        int int32 = mutableDateTime25.getMinuteOfHour();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime25.toMutableDateTime(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime19.toMutableDateTime(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone36);
        mutableDateTime5.setZoneRetainFields(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:06.518Z");
        java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime1.toGregorianCalendar();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = mutableDateTime8.isSupported(dateTimeFieldType9);
        mutableDateTime8.setDayOfYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime14 = mutableDateTime1.toDateTime(dateTimeZone13);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        java.util.GregorianCalendar gregorianCalendar21 = mutableDateTime20.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now();
        mutableDateTime24.setHourOfDay(2);
        int int27 = property22.compareTo((org.joda.time.ReadableInstant) mutableDateTime24);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        mutableDateTime30.setSecondOfDay(10);
        boolean boolean33 = mutableDateTime24.isEqual((org.joda.time.ReadableInstant) mutableDateTime30);
        mutableDateTime30.setDayOfYear(3);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        java.util.GregorianCalendar gregorianCalendar41 = mutableDateTime40.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime40.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime43 = property42.roundFloor();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        int int49 = mutableDateTime46.getYearOfCentury();
        org.joda.time.Chronology chronology50 = mutableDateTime46.getChronology();
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.now(chronology50);
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(chronology50);
        mutableDateTime43.setChronology(chronology50);
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime30.toMutableDateTime(chronology50);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj15, chronology50);
        boolean boolean56 = mutableDateTime1.equals((java.lang.Object) mutableDateTime55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime18", (instant6.compareTo(mutableDateTime18) == 0) == instant6.equals(mutableDateTime18));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMillisOfSecond();
        int int7 = mutableDateTime2.getSecondOfDay();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        java.lang.String str19 = mutableDateTime17.toString();
        mutableDateTime17.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime17.add(readablePeriod22, (-1));
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime17.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property25.getFieldType();
        int int27 = mutableDateTime13.get(dateTimeFieldType26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime10.property(dateTimeFieldType26);
        boolean boolean29 = mutableDateTime2.isSupported(dateTimeFieldType26);
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
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property4.getFieldType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.toMutableDateTime();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        int int10 = mutableDateTime7.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.hourOfDay();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.secondOfDay();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime7.toMutableDateTime(chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now();
        mutableDateTime21.setHourOfDay(2);
        mutableDateTime21.addHours(1);
        boolean boolean26 = mutableDateTime21.isAfterNow();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime35.copy();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime35.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime35.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.add(0);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime43.getZone();
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime46.copy();
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        java.lang.String str52 = mutableDateTime50.toString();
        mutableDateTime50.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        mutableDateTime50.add(readablePeriod55, (-1));
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime50.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = property58.getFieldType();
        int int60 = mutableDateTime46.get(dateTimeFieldType59);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime43.property(dateTimeFieldType59);
        mutableDateTime40.set(dateTimeFieldType59, 105);
        boolean boolean64 = mutableDateTime29.isSupported(dateTimeFieldType59);
        mutableDateTime21.set(dateTimeFieldType59, 29);
        boolean boolean67 = mutableDateTime7.isSupported(dateTimeFieldType59);
        mutableDateTime1.set(dateTimeFieldType59, (int) (short) 0);
        java.lang.Object obj70 = null;
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(obj70, chronology71);
        org.joda.time.Instant instant73 = mutableDateTime72.toInstant();
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime72.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime75 = property74.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = null;
        boolean boolean77 = mutableDateTime75.isSupported(dateTimeFieldType76);
        mutableDateTime75.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime75.yearOfCentury();
        org.joda.time.DateTime dateTime81 = mutableDateTime75.toDateTimeISO();
        org.joda.time.Chronology chronology82 = dateTime81.getChronology();
        org.joda.time.MutableDateTime mutableDateTime83 = mutableDateTime1.toMutableDateTime(chronology82);
        mutableDateTime83.addSeconds(27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant73", (mutableDateTime7.compareTo(instant73) == 0) == mutableDateTime7.equals(instant73));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.era();
        java.lang.String str19 = property18.getAsString();
        org.joda.time.DateTimeField dateTimeField20 = property18.getField();
        mutableDateTime9.setRounding(dateTimeField20);
        int int22 = mutableDateTime9.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.hourOfDay();
        boolean boolean13 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        mutableDateTime8.setZoneRetainFields(dateTimeZone17);
        int int21 = mutableDateTime8.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
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
        java.util.Locale locale5 = null;
        java.util.Calendar calendar6 = mutableDateTime2.toCalendar(locale5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.era();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = mutableDateTime2.getRoundingField();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        mutableDateTime12.addWeeks(10);
        mutableDateTime12.addDays(20);
        java.util.Date date21 = mutableDateTime12.toDate();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime12.copy();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime25.hourOfDay();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.secondOfDay();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime25.toMutableDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime22.toMutableDateTime(chronology37);
        mutableDateTime2.setChronology(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime25", (instant3.compareTo(mutableDateTime25) == 0) == instant3.equals(mutableDateTime25));
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
        java.util.Locale locale5 = null;
        java.util.Calendar calendar6 = mutableDateTime2.toCalendar(locale5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.era();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfYear();
        int int9 = property8.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.setMonthOfYear((int) (byte) 10);
        mutableDateTime1.setMillisOfSecond(0);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime14.hourOfDay();
        boolean boolean19 = mutableDateTime11.isAfter((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime14.getZone();
        org.joda.time.DateTime dateTime21 = mutableDateTime1.toDateTime(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime14", (instant9.compareTo(mutableDateTime14) == 0) == instant9.equals(mutableDateTime14));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        mutableDateTime5.addMonths(6339402);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime14.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime14.secondOfMinute();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        java.lang.String str26 = mutableDateTime24.toString();
        mutableDateTime24.setDate((long) (byte) 100);
        mutableDateTime24.setSecondOfMinute((int) (byte) 0);
        boolean boolean31 = mutableDateTime14.isBefore((org.joda.time.ReadableInstant) mutableDateTime24);
        boolean boolean32 = mutableDateTime5.isEqual((org.joda.time.ReadableInstant) mutableDateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:06.518Z");
        java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime1.toGregorianCalendar();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = mutableDateTime8.isSupported(dateTimeFieldType9);
        mutableDateTime8.setDayOfYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime14 = mutableDateTime1.toDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime14", (mutableDateTime1.compareTo(dateTime14) == 0) == mutableDateTime1.equals(dateTime14));
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
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundHalfEven();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        mutableDateTime9.setTime((long) '#');
        mutableDateTime9.addDays((int) '4');
        int int16 = mutableDateTime9.getMinuteOfHour();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime9.toMutableDateTime(dateTimeZone20);
        boolean boolean22 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime9.setMillis((long) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime2.add(readableDuration6);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        java.util.GregorianCalendar gregorianCalendar13 = mutableDateTime12.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now();
        mutableDateTime16.setHourOfDay(2);
        int int19 = property14.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        mutableDateTime22.setSecondOfDay(10);
        boolean boolean25 = mutableDateTime16.isEqual((org.joda.time.ReadableInstant) mutableDateTime22);
        mutableDateTime22.setDayOfYear(3);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        java.util.GregorianCalendar gregorianCalendar33 = mutableDateTime32.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime32.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime35 = property34.roundFloor();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        int int41 = mutableDateTime38.getYearOfCentury();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(chronology42);
        mutableDateTime35.setChronology(chronology42);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime22.toMutableDateTime(chronology42);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology48);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime49.dayOfYear();
        org.joda.time.DateTimeField dateTimeField51 = property50.getField();
        int int52 = mutableDateTime46.get(dateTimeField51);
        mutableDateTime2.setRounding(dateTimeField51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        mutableDateTime5.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.yearOfCentury();
        int int11 = property10.getMaximumValue();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property10.getAsShortText(locale12);
        org.joda.time.MutableDateTime mutableDateTime14 = property10.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime16.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime16.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.centuryOfEra();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        mutableDateTime23.addWeeks(10);
        mutableDateTime23.addDays(20);
        java.util.Date date32 = mutableDateTime23.toDate();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime23.copy();
        int int34 = property20.compareTo((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.Chronology chronology35 = mutableDateTime33.getChronology();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        java.util.GregorianCalendar gregorianCalendar41 = mutableDateTime40.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime40.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime43 = property42.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now();
        mutableDateTime44.setHourOfDay(2);
        int int47 = property42.compareTo((org.joda.time.ReadableInstant) mutableDateTime44);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        mutableDateTime50.setSecondOfDay(10);
        boolean boolean53 = mutableDateTime44.isEqual((org.joda.time.ReadableInstant) mutableDateTime50);
        mutableDateTime50.setDayOfYear(3);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.DateTimeZone dateTimeZone59 = mutableDateTime58.getZone();
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(dateTimeZone59);
        java.util.GregorianCalendar gregorianCalendar61 = mutableDateTime60.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime60.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime63 = property62.roundFloor();
        java.lang.Object obj64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(obj64, chronology65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = null;
        java.lang.String str68 = mutableDateTime66.toString(dateTimeFormatter67);
        int int69 = mutableDateTime66.getYearOfCentury();
        org.joda.time.Chronology chronology70 = mutableDateTime66.getChronology();
        org.joda.time.MutableDateTime mutableDateTime71 = org.joda.time.MutableDateTime.now(chronology70);
        org.joda.time.MutableDateTime mutableDateTime72 = org.joda.time.MutableDateTime.now(chronology70);
        mutableDateTime63.setChronology(chronology70);
        org.joda.time.MutableDateTime mutableDateTime74 = mutableDateTime50.toMutableDateTime(chronology70);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology76);
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime77.dayOfYear();
        org.joda.time.DateTimeField dateTimeField79 = property78.getField();
        int int80 = mutableDateTime74.get(dateTimeField79);
        mutableDateTime33.setRounding(dateTimeField79);
        boolean boolean82 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime38", (instant3.compareTo(mutableDateTime38) == 0) == instant3.equals(mutableDateTime38));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.addSeconds((int) (short) 1);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.centuryOfEra();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        int int15 = mutableDateTime13.getSecondOfMinute();
        mutableDateTime13.setMillis((long) 3);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime13.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfMonth();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        java.lang.String str25 = mutableDateTime23.toString();
        mutableDateTime23.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime23.add(readablePeriod28, (-1));
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime23.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property31.getFieldType();
        boolean boolean33 = mutableDateTime19.isSupported(dateTimeFieldType32);
        mutableDateTime19.addMonths(1);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime19.minuteOfHour();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        int int41 = mutableDateTime39.getSecondOfMinute();
        mutableDateTime39.setMillis((long) 3);
        mutableDateTime39.add((long) 11);
        mutableDateTime19.setTime((org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.Instant instant47 = mutableDateTime19.toInstant();
        int int48 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        mutableDateTime2.addSeconds(8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant47", (mutableDateTime19.compareTo(instant47) == 0) == mutableDateTime19.equals(instant47));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.hourOfDay();
        boolean boolean13 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        mutableDateTime8.setZoneRetainFields(dateTimeZone17);
        int int21 = mutableDateTime8.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:06.518Z");
        java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime1.toGregorianCalendar();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = mutableDateTime8.isSupported(dateTimeFieldType9);
        mutableDateTime8.setDayOfYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime14 = mutableDateTime1.toDateTime(dateTimeZone13);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        java.util.GregorianCalendar gregorianCalendar20 = mutableDateTime19.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now();
        mutableDateTime23.setHourOfDay(2);
        int int26 = property21.compareTo((org.joda.time.ReadableInstant) mutableDateTime23);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        mutableDateTime29.setSecondOfDay(10);
        boolean boolean32 = mutableDateTime23.isEqual((org.joda.time.ReadableInstant) mutableDateTime29);
        mutableDateTime29.setDayOfYear(3);
        mutableDateTime29.addYears(3);
        int int37 = mutableDateTime29.getMillisOfSecond();
        boolean boolean38 = dateTime14.isBefore((org.joda.time.ReadableInstant) mutableDateTime29);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        mutableDateTime41.setTime((long) '#');
        mutableDateTime41.addDays((int) '4');
        int int48 = mutableDateTime41.getMinuteOfHour();
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime41.toMutableDateTime(dateTimeZone52);
        java.lang.Object obj54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(obj54, chronology55);
        org.joda.time.DateTimeZone dateTimeZone57 = mutableDateTime56.getZone();
        int int58 = mutableDateTime56.getSecondOfMinute();
        mutableDateTime56.setMillis((long) 3);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime56.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime62 = mutableDateTime56.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime62.dayOfMonth();
        java.lang.Object obj64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(obj64, chronology65);
        org.joda.time.DateTimeZone dateTimeZone67 = mutableDateTime66.getZone();
        java.lang.String str68 = mutableDateTime66.toString();
        mutableDateTime66.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        mutableDateTime66.add(readablePeriod71, (-1));
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime66.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = property74.getFieldType();
        boolean boolean76 = mutableDateTime62.isSupported(dateTimeFieldType75);
        boolean boolean77 = mutableDateTime53.isSupported(dateTimeFieldType75);
        mutableDateTime29.set(dateTimeFieldType75, 18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime14", (mutableDateTime1.compareTo(dateTime14) == 0) == mutableDateTime1.equals(dateTime14));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.minuteOfHour();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = mutableDateTime11.isSupported(dateTimeFieldType12);
        mutableDateTime11.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.yearOfCentury();
        org.joda.time.DateTime dateTime17 = mutableDateTime11.toDateTimeISO();
        org.joda.time.Chronology chronology18 = dateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime2.toMutableDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant9", (mutableDateTime2.compareTo(instant9) == 0) == mutableDateTime2.equals(instant9));
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
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundHalfEven();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        mutableDateTime9.setTime((long) '#');
        mutableDateTime9.addDays((int) '4');
        int int16 = mutableDateTime9.getMinuteOfHour();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime9.toMutableDateTime(dateTimeZone20);
        boolean boolean22 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime6.addMillis(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime9 = property4.roundFloor();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.secondOfDay();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        org.joda.time.Chronology chronology24 = mutableDateTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime12.toMutableDateTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology24);
        org.joda.time.DateTime dateTime28 = mutableDateTime9.toDateTime(chronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.DurationField durationField10 = property8.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.roundCeiling();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        mutableDateTime11.setDate((org.joda.time.ReadableInstant) mutableDateTime14);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone21);
        mutableDateTime14.setZoneRetainFields(dateTimeZone21);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime14.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        int int7 = mutableDateTime2.getRoundingMode();
        mutableDateTime2.setMonthOfYear((int) (short) 10);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.year();
        java.lang.String str11 = mutableDateTime2.toString();
        boolean boolean12 = mutableDateTime2.isBeforeNow();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        boolean boolean21 = mutableDateTime19.isSupported(dateTimeFieldType20);
        mutableDateTime19.setDayOfYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 105, dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime28.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime28.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.centuryOfEra();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        mutableDateTime35.addWeeks(10);
        mutableDateTime35.addDays(20);
        java.util.Date date44 = mutableDateTime35.toDate();
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime35.copy();
        int int46 = property32.compareTo((org.joda.time.ReadableInstant) mutableDateTime45);
        org.joda.time.Chronology chronology47 = mutableDateTime45.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime26.toMutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime2.toMutableDateTime(chronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and mutableDateTime26", (instant17.compareTo(mutableDateTime26) == 0) == instant17.equals(mutableDateTime26));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.DateTime dateTime11 = mutableDateTime8.toDateTimeISO();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = mutableDateTime17.isSupported(dateTimeFieldType18);
        mutableDateTime17.setDayOfYear((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime17.add(readablePeriod22, 10);
        mutableDateTime8.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime11", (instant3.compareTo(dateTime11) == 0) == instant3.equals(dateTime11));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        boolean boolean15 = mutableDateTime14.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime14.toGregorianCalendar();
        long long17 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime14);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        java.util.GregorianCalendar gregorianCalendar23 = mutableDateTime22.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now();
        mutableDateTime26.setHourOfDay(2);
        int int29 = property24.compareTo((org.joda.time.ReadableInstant) mutableDateTime26);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        mutableDateTime32.setSecondOfDay(10);
        boolean boolean35 = mutableDateTime26.isEqual((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.DateTime dateTime36 = mutableDateTime26.toDateTimeISO();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology38);
        mutableDateTime39.addMillis((int) 'a');
        boolean boolean42 = mutableDateTime39.isAfterNow();
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = mutableDateTime45.getZone();
        int int47 = mutableDateTime45.getSecondOfMinute();
        mutableDateTime45.setMillis((long) 3);
        int int50 = mutableDateTime45.getRoundingMode();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime45.dayOfMonth();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime45.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime54.copy();
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime54.toMutableDateTime();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology58);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime59.dayOfYear();
        org.joda.time.DateTimeField dateTimeField61 = property60.getField();
        int int62 = mutableDateTime54.get(dateTimeField61);
        mutableDateTime45.setRounding(dateTimeField61, 3);
        mutableDateTime39.setRounding(dateTimeField61, (int) (short) 0);
        boolean boolean67 = dateTime36.isAfter((org.joda.time.ReadableInstant) mutableDateTime39);
        int int68 = property8.getDifference((org.joda.time.ReadableInstant) mutableDateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = mutableDateTime6.isSupported(dateTimeFieldType7);
        mutableDateTime6.setDayOfYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 105, dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime13", (instant4.compareTo(mutableDateTime13) == 0) == instant4.equals(mutableDateTime13));
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
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime mutableDateTime12 = property4.add(17);
        int int13 = mutableDateTime12.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 70);
        org.joda.time.Chronology chronology6 = mutableDateTime5.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTime(chronology6);
        mutableDateTime7.setMinuteOfDay(22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfEra();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 48, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        mutableDateTime5.setZone(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 70);
        org.joda.time.Chronology chronology6 = mutableDateTime5.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTime(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField(4);
        java.util.Locale locale11 = null;
        int int12 = property8.getMaximumTextLength(locale11);
        long long13 = property8.remainder();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.centuryOfEra();
        java.util.Date date18 = mutableDateTime16.toDate();
        int int19 = mutableDateTime16.getCenturyOfEra();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        java.lang.String str24 = mutableDateTime22.toString();
        mutableDateTime22.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime22.add(readablePeriod27, (-1));
        boolean boolean30 = mutableDateTime16.isBefore((org.joda.time.ReadableInstant) mutableDateTime22);
        int int31 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        boolean boolean32 = mutableDateTime16.isEqualNow();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.Instant instant37 = mutableDateTime36.toInstant();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime36.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime39 = property38.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        boolean boolean41 = mutableDateTime39.isSupported(dateTimeFieldType40);
        mutableDateTime39.setDayOfYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime39.getZone();
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) 105, dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime48.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime48.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime51.centuryOfEra();
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = null;
        java.lang.String str57 = mutableDateTime55.toString(dateTimeFormatter56);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        mutableDateTime55.add(readablePeriod58);
        mutableDateTime55.addWeeks(10);
        mutableDateTime55.addDays(20);
        java.util.Date date64 = mutableDateTime55.toDate();
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime55.copy();
        int int66 = property52.compareTo((org.joda.time.ReadableInstant) mutableDateTime65);
        org.joda.time.Chronology chronology67 = mutableDateTime65.getChronology();
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime46.toMutableDateTime(chronology67);
        org.joda.time.MutableDateTime mutableDateTime69 = mutableDateTime16.toMutableDateTime(chronology67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant37 and mutableDateTime46", (instant37.compareTo(mutableDateTime46) == 0) == instant37.equals(mutableDateTime46));
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
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundHalfEven();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        mutableDateTime9.setTime((long) '#');
        mutableDateTime9.addDays((int) '4');
        int int16 = mutableDateTime9.getMinuteOfHour();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime9.toMutableDateTime(dateTimeZone20);
        boolean boolean22 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime6.setWeekOfWeekyear(13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundHalfEven();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        mutableDateTime9.setTime((long) '#');
        mutableDateTime9.addDays((int) '4');
        int int16 = mutableDateTime9.getMinuteOfHour();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime9.toMutableDateTime(dateTimeZone20);
        boolean boolean22 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        int int23 = mutableDateTime9.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:06.518Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        mutableDateTime4.setTime((long) '#');
        mutableDateTime4.addDays((int) '4');
        boolean boolean11 = mutableDateTime4.isEqualNow();
        boolean boolean12 = mutableDateTime4.isAfterNow();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        mutableDateTime15.setSecondOfMinute((int) '4');
        mutableDateTime4.setDate((org.joda.time.ReadableInstant) mutableDateTime15);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        mutableDateTime4.setSecondOfDay((int) '4');
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundHalfFloor();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime30.hourOfDay();
        boolean boolean35 = mutableDateTime27.isAfter((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime30.getZone();
        int int37 = mutableDateTime30.getMillisOfSecond();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology39);
        mutableDateTime40.addMinutes(5);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime40.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property43.getFieldType();
        int int45 = mutableDateTime30.get(dateTimeFieldType44);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime4.property(dateTimeFieldType44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant25 and mutableDateTime30", (instant25.compareTo(mutableDateTime30) == 0) == instant25.equals(mutableDateTime30));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime5.copy();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        boolean boolean17 = mutableDateTime15.isSupported(dateTimeFieldType16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime15.monthOfYear();
        boolean boolean19 = mutableDateTime9.isBefore((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.secondOfDay();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        mutableDateTime23.setTime((long) '#');
        mutableDateTime23.addDays((int) '4');
        int int30 = mutableDateTime23.getMinuteOfHour();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime23.toMutableDateTime(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone34);
        mutableDateTime15.setZone(dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime33", (instant3.compareTo(mutableDateTime33) == 0) == instant3.equals(mutableDateTime33));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property4.getAsText(locale6);
        int int8 = property4.getMaximumValueOverall();
        int int9 = property4.get();
        org.joda.time.MutableDateTime mutableDateTime11 = property4.addWrapField(36);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime16.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now();
        mutableDateTime20.setHourOfDay(2);
        int int23 = property18.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        int int24 = mutableDateTime20.getWeekyear();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime26.copy();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        java.lang.String str32 = mutableDateTime30.toString();
        mutableDateTime30.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime30.add(readablePeriod35, (-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime30.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property38.getFieldType();
        int int40 = mutableDateTime26.get(dateTimeFieldType39);
        int int41 = mutableDateTime20.get(dateTimeFieldType39);
        int int42 = mutableDateTime11.get(dateTimeFieldType39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        mutableDateTime2.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime2.add(readablePeriod7, (-1));
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:02.268Z", dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        mutableDateTime2.setZone(dateTimeZone14);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime2.copy();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        mutableDateTime23.addMillis((int) 'a');
        int int26 = mutableDateTime23.getDayOfYear();
        java.util.GregorianCalendar gregorianCalendar27 = mutableDateTime23.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.secondOfMinute();
        java.util.Locale locale29 = null;
        java.lang.String str30 = property28.getAsText(locale29);
        org.joda.time.MutableDateTime mutableDateTime31 = property28.roundCeiling();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.dayOfWeek();
        java.lang.String str33 = property32.getAsShortText();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.Instant instant37 = mutableDateTime36.toInstant();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime36.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime39 = property38.roundHalfFloor();
        org.joda.time.DurationField durationField40 = property38.getRangeDurationField();
        boolean boolean41 = property32.equals((java.lang.Object) durationField40);
        boolean boolean42 = mutableDateTime2.equals((java.lang.Object) property32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant37", (mutableDateTime13.compareTo(instant37) == 0) == mutableDateTime13.equals(instant37));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        int int13 = mutableDateTime11.getSecondOfMinute();
        mutableDateTime11.setMillis((long) 3);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.yearOfCentury();
        mutableDateTime11.addSeconds((int) (short) 1);
        long long19 = mutableDateTime11.getMillis();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime11.weekyear();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        java.util.GregorianCalendar gregorianCalendar26 = mutableDateTime25.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now();
        mutableDateTime29.setHourOfDay(2);
        int int32 = property27.compareTo((org.joda.time.ReadableInstant) mutableDateTime29);
        int int33 = property20.getDifference((org.joda.time.ReadableInstant) mutableDateTime29);
        mutableDateTime29.setMillisOfDay(954);
        int int36 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime23", (instant3.compareTo(mutableDateTime23) == 0) == instant3.equals(mutableDateTime23));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.copy();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime11.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime11.yearOfCentury();
        mutableDateTime11.add((long) 1);
        long long17 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime11);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfFloor();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime26.hourOfDay();
        boolean boolean31 = mutableDateTime23.isAfter((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime26.getZone();
        mutableDateTime11.setZone(dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and mutableDateTime26", (instant21.compareTo(mutableDateTime26) == 0) == instant21.equals(mutableDateTime26));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now();
        mutableDateTime8.setHourOfDay(2);
        int int11 = property6.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        mutableDateTime14.setSecondOfDay(10);
        boolean boolean17 = mutableDateTime8.isEqual((org.joda.time.ReadableInstant) mutableDateTime14);
        mutableDateTime14.setDayOfYear(3);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        java.util.GregorianCalendar gregorianCalendar25 = mutableDateTime24.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundFloor();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(chronology34);
        mutableDateTime27.setChronology(chronology34);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime14.toMutableDateTime(chronology34);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.dayOfYear();
        org.joda.time.DateTimeField dateTimeField43 = property42.getField();
        int int44 = mutableDateTime38.get(dateTimeField43);
        mutableDateTime38.setMillisOfDay(28);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.Instant instant50 = mutableDateTime49.toInstant();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime49.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = null;
        boolean boolean54 = mutableDateTime52.isSupported(dateTimeFieldType53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime52.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime56 = property55.roundFloor();
        java.lang.Object obj57 = null;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(obj57, chronology58);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = null;
        java.lang.String str61 = mutableDateTime59.toString(dateTimeFormatter60);
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        mutableDateTime59.add(readablePeriod62);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime59.hourOfDay();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime59.era();
        java.lang.String str66 = property65.getAsString();
        org.joda.time.DateTimeField dateTimeField67 = property65.getField();
        mutableDateTime56.setRounding(dateTimeField67);
        int int69 = mutableDateTime38.get(dateTimeField67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant50", (mutableDateTime2.compareTo(instant50) == 0) == mutableDateTime2.equals(instant50));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.parse("2020-11-25T01:46:28.674Z");
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime19.copy();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime19.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.add(0);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime30.copy();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        java.lang.String str36 = mutableDateTime34.toString();
        mutableDateTime34.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime34.add(readablePeriod39, (-1));
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime34.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property42.getFieldType();
        int int44 = mutableDateTime30.get(dateTimeFieldType43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime27.property(dateTimeFieldType43);
        mutableDateTime24.set(dateTimeFieldType43, 105);
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:28.837Z");
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime49.centuryOfEra();
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime53.getZone();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime57 = org.joda.time.MutableDateTime.now(dateTimeZone54);
        mutableDateTime49.setZone(dateTimeZone54);
        mutableDateTime24.setZoneRetainFields(dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) 0, dateTimeZone54);
        mutableDateTime16.setZone(dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:47:21.628Z", dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime64 = mutableDateTime8.toMutableDateTime(dateTimeZone54);
        int int65 = mutableDateTime6.compareTo((org.joda.time.ReadableInstant) mutableDateTime64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        boolean boolean15 = mutableDateTime13.isSupported(dateTimeFieldType14);
        mutableDateTime13.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.yearOfCentury();
        org.joda.time.DateTime dateTime19 = mutableDateTime13.toDateTimeISO();
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) readablePeriod6, chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 2, chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant11", (mutableDateTime3.compareTo(instant11) == 0) == mutableDateTime3.equals(instant11));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = mutableDateTime6.isSupported(dateTimeFieldType7);
        mutableDateTime6.setDayOfYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 105, dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        mutableDateTime14.addMinutes(942);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime13", (instant4.compareTo(mutableDateTime13) == 0) == instant4.equals(mutableDateTime13));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(1612316723230L, dateTimeZone4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfEven();
        int int9 = mutableDateTime8.getMillisOfDay();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        boolean boolean17 = mutableDateTime15.isSupported(dateTimeFieldType16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundFloor();
        mutableDateTime19.setWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime19.toString(dateTimeFormatter22);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:27.962Z");
        org.joda.time.Chronology chronology26 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime19.toMutableDateTime(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime8.toMutableDateTime(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant13", (mutableDateTime3.compareTo(instant13) == 0) == mutableDateTime3.equals(instant13));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = mutableDateTime12.isSupported(dateTimeFieldType13);
        mutableDateTime12.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime18 = mutableDateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((java.lang.Object) readablePeriod5, chronology19);
        java.util.Locale locale21 = null;
        java.util.Calendar calendar22 = mutableDateTime20.toCalendar(locale21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.yearOfCentury();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        java.util.Locale locale14 = null;
        java.util.Calendar calendar15 = mutableDateTime11.toCalendar(locale14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.era();
        int int17 = property8.getDifference((org.joda.time.ReadableInstant) mutableDateTime11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant12", (mutableDateTime2.compareTo(instant12) == 0) == mutableDateTime2.equals(instant12));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 48, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone4);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        int int14 = mutableDateTime13.getDayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = mutableDateTime13.getRoundingField();
        boolean boolean16 = mutableDateTime7.isAfter((org.joda.time.ReadableInstant) mutableDateTime13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant11", (mutableDateTime3.compareTo(instant11) == 0) == mutableDateTime3.equals(instant11));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        mutableDateTime2.addWeeks(10);
        long long9 = mutableDateTime2.getMillis();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(1612316750822L);
        int int13 = property10.getDifference((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        mutableDateTime12.setMillis((org.joda.time.ReadableInstant) mutableDateTime16);
        int int22 = mutableDateTime12.getDayOfMonth();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfFloor();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        int int34 = mutableDateTime31.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime31.hourOfDay();
        boolean boolean36 = mutableDateTime28.isAfter((org.joda.time.ReadableInstant) mutableDateTime31);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        mutableDateTime31.setZoneRetainFields(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime12.toMutableDateTime(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and instant26", (mutableDateTime16.compareTo(instant26) == 0) == mutableDateTime16.equals(instant26));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMillis((long) 3);
        int int7 = mutableDateTime2.getRoundingMode();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfMonth();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfCeiling();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(1612316723230L, dateTimeZone15);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.hourOfDay();
        boolean boolean19 = mutableDateTime10.equals((java.lang.Object) mutableDateTime17);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        boolean boolean27 = mutableDateTime25.isSupported(dateTimeFieldType26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime25.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundFloor();
        mutableDateTime29.setWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime29.toString(dateTimeFormatter32);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:27.962Z");
        org.joda.time.Chronology chronology36 = mutableDateTime35.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime29.toMutableDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime17, chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant23", (mutableDateTime14.compareTo(instant23) == 0) == mutableDateTime14.equals(instant23));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.hourOfDay();
        boolean boolean13 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime8.getZone();
        int int15 = mutableDateTime8.getMillisOfSecond();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        mutableDateTime18.addMillis((int) 'a');
        int int21 = mutableDateTime18.getDayOfYear();
        java.util.GregorianCalendar gregorianCalendar22 = mutableDateTime18.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.secondOfMinute();
        java.lang.String str24 = property23.getAsString();
        org.joda.time.MutableDateTime mutableDateTime25 = property23.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime26 = property23.roundHalfFloor();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime26.toMutableDateTime(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime8.toMutableDateTime(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime29", (instant3.compareTo(mutableDateTime29) == 0) == instant3.equals(mutableDateTime29));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.DateTime dateTime11 = mutableDateTime8.toDateTimeISO();
        mutableDateTime8.setSecondOfMinute(36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime11", (instant3.compareTo(dateTime11) == 0) == instant3.equals(dateTime11));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now();
        mutableDateTime8.setHourOfDay(2);
        int int11 = property6.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        mutableDateTime14.setSecondOfDay(10);
        boolean boolean17 = mutableDateTime8.isEqual((org.joda.time.ReadableInstant) mutableDateTime14);
        int int18 = mutableDateTime14.getYearOfEra();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.minuteOfHour();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundCeiling();
        java.util.Locale locale26 = null;
        java.lang.String str27 = property24.getAsText(locale26);
        int int28 = property24.getMaximumValueOverall();
        int int29 = property24.get();
        org.joda.time.MutableDateTime mutableDateTime31 = property24.addWrapField(36);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property24.getFieldType();
        int int33 = mutableDateTime14.get(dateTimeFieldType32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant23", (mutableDateTime2.compareTo(instant23) == 0) == mutableDateTime2.equals(instant23));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfDay();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology14);
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime16.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.millisOfSecond();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        int int26 = mutableDateTime21.getDayOfYear();
        boolean boolean27 = mutableDateTime21.isAfterNow();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime21.weekOfWeekyear();
        org.joda.time.DurationField durationField29 = property28.getDurationField();
        int int30 = property28.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime31 = property28.roundFloor();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime34.add(readablePeriod37);
        mutableDateTime34.addWeeks(10);
        long long41 = mutableDateTime34.getMillis();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime34.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) 70);
        org.joda.time.Chronology chronology45 = mutableDateTime44.getChronology();
        org.joda.time.DateTime dateTime46 = mutableDateTime34.toDateTime(chronology45);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.Instant instant50 = mutableDateTime49.toInstant();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime49.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundCeiling();
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.DateTimeZone dateTimeZone56 = mutableDateTime55.getZone();
        int int57 = property51.getDifference((org.joda.time.ReadableInstant) mutableDateTime55);
        java.util.GregorianCalendar gregorianCalendar58 = mutableDateTime55.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime55.monthOfYear();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology61);
        mutableDateTime62.addMinutes(5);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime62.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = property65.getFieldType();
        mutableDateTime55.set(dateTimeFieldType66, 18);
        boolean boolean69 = dateTime46.isSupported(dateTimeFieldType66);
        boolean boolean70 = property28.equals((java.lang.Object) dateTimeFieldType66);
        mutableDateTime16.set(dateTimeFieldType66, 18591);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant50", (mutableDateTime2.compareTo(instant50) == 0) == mutableDateTime2.equals(instant50));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        java.lang.String str5 = mutableDateTime3.toString();
        mutableDateTime3.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime3.add(readablePeriod8, (-1));
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:02.268Z", dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        mutableDateTime3.setZone(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 50, dateTimeZone15);
        org.joda.time.DateTime dateTime21 = mutableDateTime20.toDateTime();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.centuryOfEra();
        java.util.Date date26 = mutableDateTime24.toDate();
        org.joda.time.DateTimeField dateTimeField27 = mutableDateTime24.getRoundingField();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.Instant instant31 = mutableDateTime30.toInstant();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime30.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.roundCeiling();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property32.getAsText(locale34);
        int int36 = property32.getMaximumValueOverall();
        java.lang.String str37 = property32.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property32.getFieldType();
        int int39 = mutableDateTime24.get(dateTimeFieldType38);
        int int40 = mutableDateTime20.get(dateTimeFieldType38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant31", (mutableDateTime14.compareTo(instant31) == 0) == mutableDateTime14.equals(instant31));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.copy();
        mutableDateTime2.setSecondOfDay(48);
        mutableDateTime2.setMillisOfSecond(926);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        int int11 = mutableDateTime9.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        mutableDateTime2.setRounding(dateTimeField13);
        boolean boolean16 = mutableDateTime2.isEqual(1612316857132L);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.era();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime20.hourOfDay();
        int int25 = mutableDateTime20.getDayOfYear();
        java.lang.String str26 = mutableDateTime20.toString();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.Instant instant30 = mutableDateTime29.toInstant();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime29.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime32 = property31.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = null;
        boolean boolean34 = mutableDateTime32.isSupported(dateTimeFieldType33);
        mutableDateTime32.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.yearOfCentury();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime32.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.add(3L);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime20.toMutableDateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime2.toMutableDateTime(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant30", (mutableDateTime9.compareTo(instant30) == 0) == mutableDateTime9.equals(instant30));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        java.util.GregorianCalendar gregorianCalendar4 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 15);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.secondOfDay();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime10.toMutableDateTime(chronology22);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime26.add(readablePeriod29);
        mutableDateTime26.addWeeks(10);
        mutableDateTime26.addDays(20);
        java.util.Date date35 = mutableDateTime26.toDate();
        mutableDateTime10.setTime((org.joda.time.ReadableInstant) mutableDateTime26);
        int int37 = mutableDateTime26.getHourOfDay();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(dateTimeZone41);
        long long43 = mutableDateTime42.getMillis();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime46.getZone();
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(dateTimeZone47);
        java.util.GregorianCalendar gregorianCalendar49 = mutableDateTime48.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime48.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime51 = property50.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now();
        mutableDateTime52.setHourOfDay(2);
        int int55 = property50.compareTo((org.joda.time.ReadableInstant) mutableDateTime52);
        int int56 = mutableDateTime52.getWeekyear();
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime58.copy();
        java.lang.Object obj60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(obj60, chronology61);
        org.joda.time.DateTimeZone dateTimeZone63 = mutableDateTime62.getZone();
        java.lang.String str64 = mutableDateTime62.toString();
        mutableDateTime62.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        mutableDateTime62.add(readablePeriod67, (-1));
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime62.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = property70.getFieldType();
        int int72 = mutableDateTime58.get(dateTimeFieldType71);
        int int73 = mutableDateTime52.get(dateTimeFieldType71);
        boolean boolean74 = mutableDateTime42.isSupported(dateTimeFieldType71);
        mutableDateTime26.set(dateTimeFieldType71, 2021);
        mutableDateTime7.setTime((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.DateTimeZone dateTimeZone78 = mutableDateTime26.getZone();
        org.joda.time.MutableDateTime mutableDateTime79 = org.joda.time.MutableDateTime.now(dateTimeZone78);
        mutableDateTime2.setZone(dateTimeZone78);
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime2.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = mutableDateTime6.isSupported(dateTimeFieldType7);
        mutableDateTime6.setDayOfYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 105, dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime15.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime15.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.centuryOfEra();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        mutableDateTime22.addWeeks(10);
        mutableDateTime22.addDays(20);
        java.util.Date date31 = mutableDateTime22.toDate();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime22.copy();
        int int33 = property19.compareTo((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.Chronology chronology34 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime13.toMutableDateTime(chronology34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime13.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime35", (instant4.compareTo(mutableDateTime35) == 0) == instant4.equals(mutableDateTime35));
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
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int10 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime8);
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime8.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfCeiling();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:02.268Z", dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime13.toMutableDateTime(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now();
        mutableDateTime8.setHourOfDay(2);
        int int11 = property6.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.weekyear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundFloor();
        int int14 = property12.getMaximumValueOverall();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = mutableDateTime21.isSupported(dateTimeFieldType22);
        mutableDateTime21.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.yearOfCentury();
        org.joda.time.DateTime dateTime27 = mutableDateTime21.toDateTimeISO();
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) 42, chronology28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.secondOfMinute();
        boolean boolean31 = property12.equals((java.lang.Object) mutableDateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant19", (mutableDateTime2.compareTo(instant19) == 0) == mutableDateTime2.equals(instant19));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        java.lang.String str8 = property7.getAsString();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundFloor();
        mutableDateTime9.addYears((int) '#');
        mutableDateTime9.addYears(30);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        mutableDateTime16.setSecondOfDay((int) '#');
        org.joda.time.ReadableDuration readableDuration20 = null;
        mutableDateTime16.add(readableDuration20);
        mutableDateTime9.setTime((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 'a');
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        mutableDateTime27.setTime((long) '#');
        mutableDateTime27.addDays((int) '4');
        int int34 = mutableDateTime27.getMinuteOfHour();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime27.toMutableDateTime(dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime24.toMutableDateTime(dateTimeZone38);
        mutableDateTime9.setDate((org.joda.time.ReadableInstant) mutableDateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and mutableDateTime37", (instant17.compareTo(mutableDateTime37) == 0) == instant17.equals(mutableDateTime37));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:46:28.674Z");
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.copy();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime13.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.add(0);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime24.copy();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        java.lang.String str30 = mutableDateTime28.toString();
        mutableDateTime28.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime28.add(readablePeriod33, (-1));
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime28.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property36.getFieldType();
        int int38 = mutableDateTime24.get(dateTimeFieldType37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime21.property(dateTimeFieldType37);
        mutableDateTime18.set(dateTimeFieldType37, 105);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:28.837Z");
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.centuryOfEra();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime47.getZone();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.now(dateTimeZone48);
        mutableDateTime43.setZone(dateTimeZone48);
        mutableDateTime18.setZoneRetainFields(dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((long) 0, dateTimeZone48);
        mutableDateTime10.setZone(dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:47:21.628Z", dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime2.toMutableDateTime(dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(180L, dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime58", (mutableDateTime2.compareTo(mutableDateTime58) == 0) == mutableDateTime2.equals(mutableDateTime58));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        mutableDateTime9.setWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime9.toString(dateTimeFormatter12);
        int int14 = mutableDateTime9.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.weekyear();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        mutableDateTime19.setTime((long) '#');
        mutableDateTime19.addDays((int) '4');
        int int26 = mutableDateTime19.getMinuteOfHour();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime19.toMutableDateTime(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:46:26.510Z", dateTimeZone30);
        mutableDateTime9.setZone(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime29", (instant3.compareTo(mutableDateTime29) == 0) == instant3.equals(mutableDateTime29));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime2.copy();
        mutableDateTime3.setSecondOfDay(48);
        int int6 = mutableDateTime3.getWeekyear();
        org.joda.time.ReadableInstant readableInstant7 = null;
        mutableDateTime3.setTime(readableInstant7);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime10.setMonthOfYear((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime10.toMutableDateTime();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime16.hourOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.secondOfDay();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        int int27 = mutableDateTime24.getYearOfCentury();
        org.joda.time.Chronology chronology28 = mutableDateTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime16.toMutableDateTime(chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now();
        mutableDateTime30.setHourOfDay(2);
        mutableDateTime30.addHours(1);
        boolean boolean35 = mutableDateTime30.isAfterNow();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime38.add(readablePeriod41);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime44.copy();
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime44.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime44.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime49 = property47.add(0);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime52.getZone();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime55.copy();
        java.lang.Object obj57 = null;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(obj57, chronology58);
        org.joda.time.DateTimeZone dateTimeZone60 = mutableDateTime59.getZone();
        java.lang.String str61 = mutableDateTime59.toString();
        mutableDateTime59.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        mutableDateTime59.add(readablePeriod64, (-1));
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime59.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = property67.getFieldType();
        int int69 = mutableDateTime55.get(dateTimeFieldType68);
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime52.property(dateTimeFieldType68);
        mutableDateTime49.set(dateTimeFieldType68, 105);
        boolean boolean73 = mutableDateTime38.isSupported(dateTimeFieldType68);
        mutableDateTime30.set(dateTimeFieldType68, 29);
        boolean boolean76 = mutableDateTime16.isSupported(dateTimeFieldType68);
        mutableDateTime10.set(dateTimeFieldType68, (int) (short) 0);
        java.lang.Object obj79 = null;
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutableDateTime mutableDateTime81 = new org.joda.time.MutableDateTime(obj79, chronology80);
        org.joda.time.Instant instant82 = mutableDateTime81.toInstant();
        org.joda.time.MutableDateTime.Property property83 = mutableDateTime81.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime84 = property83.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = null;
        boolean boolean86 = mutableDateTime84.isSupported(dateTimeFieldType85);
        mutableDateTime84.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime84.yearOfCentury();
        org.joda.time.DateTime dateTime90 = mutableDateTime84.toDateTimeISO();
        org.joda.time.Chronology chronology91 = dateTime90.getChronology();
        org.joda.time.MutableDateTime mutableDateTime92 = mutableDateTime10.toMutableDateTime(chronology91);
        org.joda.time.MutableDateTime mutableDateTime93 = new org.joda.time.MutableDateTime((java.lang.Object) readableInstant7, chronology91);
        org.joda.time.MutableDateTime mutableDateTime94 = new org.joda.time.MutableDateTime(1612316746330L, chronology91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant82 and mutableDateTime93", (instant82.compareTo(mutableDateTime93) == 0) == instant82.equals(mutableDateTime93));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        mutableDateTime5.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add(3L);
        org.joda.time.MutableDateTime mutableDateTime15 = property11.add((long) 330);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        java.lang.String str20 = mutableDateTime18.toString();
        mutableDateTime18.setDate((long) (byte) 100);
        long long23 = mutableDateTime18.getMillis();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        mutableDateTime18.setZone(dateTimeZone24);
        org.joda.time.Instant instant26 = mutableDateTime18.toInstant();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.Instant instant30 = mutableDateTime29.toInstant();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime29.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime32 = property31.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = null;
        boolean boolean34 = mutableDateTime32.isSupported(dateTimeFieldType33);
        mutableDateTime32.setDayOfYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime32.getZone();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        int int42 = mutableDateTime40.getSecondOfMinute();
        mutableDateTime40.setMillis((long) 3);
        int int45 = mutableDateTime40.getRoundingMode();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime40.dayOfMonth();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime40.hourOfDay();
        org.joda.time.DateTimeField dateTimeField48 = property47.getField();
        int int49 = mutableDateTime32.get(dateTimeField48);
        int int50 = instant26.get(dateTimeField48);
        int int51 = mutableDateTime15.get(dateTimeField48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and instant26", (mutableDateTime18.compareTo(instant26) == 0) == mutableDateTime18.equals(instant26));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.copy();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime16.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime21 = property19.add(0);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime27.copy();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        java.lang.String str33 = mutableDateTime31.toString();
        mutableDateTime31.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime31.add(readablePeriod36, (-1));
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime31.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property39.getFieldType();
        int int41 = mutableDateTime27.get(dateTimeFieldType40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime24.property(dateTimeFieldType40);
        mutableDateTime21.set(dateTimeFieldType40, 105);
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:28.837Z");
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime46.centuryOfEra();
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now(dateTimeZone51);
        mutableDateTime46.setZone(dateTimeZone51);
        mutableDateTime21.setZoneRetainFields(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) 0, dateTimeZone51);
        mutableDateTime13.setZone(dateTimeZone51);
        mutableDateTime2.setZone(dateTimeZone51);
        java.lang.Object obj61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(obj61, chronology62);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = null;
        java.lang.String str65 = mutableDateTime63.toString(dateTimeFormatter64);
        int int66 = mutableDateTime63.getYearOfCentury();
        org.joda.time.Chronology chronology67 = mutableDateTime63.getChronology();
        int int68 = mutableDateTime63.getWeekOfWeekyear();
        mutableDateTime63.addWeekyears((int) (byte) 1);
        boolean boolean71 = mutableDateTime63.isEqualNow();
        int int72 = mutableDateTime63.getYearOfCentury();
        java.lang.Object obj73 = null;
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(obj73, chronology74);
        org.joda.time.Instant instant76 = mutableDateTime75.toInstant();
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime75.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime78 = property77.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = null;
        boolean boolean80 = mutableDateTime78.isSupported(dateTimeFieldType79);
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime78.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime82 = property81.roundFloor();
        mutableDateTime82.setWeekyear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = null;
        java.lang.String str86 = mutableDateTime82.toString(dateTimeFormatter85);
        org.joda.time.MutableDateTime mutableDateTime88 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:27.962Z");
        org.joda.time.Chronology chronology89 = mutableDateTime88.getChronology();
        org.joda.time.MutableDateTime mutableDateTime90 = mutableDateTime82.toMutableDateTime(chronology89);
        org.joda.time.DateTime dateTime91 = mutableDateTime63.toDateTime(chronology89);
        org.joda.time.MutableDateTime mutableDateTime92 = mutableDateTime2.toMutableDateTime(chronology89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant76", (mutableDateTime9.compareTo(instant76) == 0) == mutableDateTime9.equals(instant76));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now();
        mutableDateTime8.setHourOfDay(2);
        int int11 = property6.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        int int12 = mutableDateTime8.getWeekyear();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.copy();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        java.lang.String str20 = mutableDateTime18.toString();
        mutableDateTime18.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime18.add(readablePeriod23, (-1));
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime18.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        int int28 = mutableDateTime14.get(dateTimeFieldType27);
        int int29 = mutableDateTime8.get(dateTimeFieldType27);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime8.weekOfWeekyear();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(chronology37);
        mutableDateTime8.setChronology(chronology37);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime8.dayOfWeek();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.Instant instant44 = mutableDateTime43.toInstant();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime43.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime46 = property45.roundCeiling();
        boolean boolean47 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant44", (mutableDateTime2.compareTo(instant44) == 0) == mutableDateTime2.equals(instant44));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime8.hourOfDay();
        boolean boolean13 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        mutableDateTime8.setZoneRetainFields(dateTimeZone17);
        mutableDateTime8.addWeeks(622);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.copy();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        java.lang.String str14 = mutableDateTime12.toString();
        mutableDateTime12.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime12.add(readablePeriod17, (-1));
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime12.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property20.getFieldType();
        int int22 = mutableDateTime8.get(dateTimeFieldType21);
        int int23 = mutableDateTime8.getWeekyear();
        boolean boolean24 = mutableDateTime4.isBefore((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology26);
        mutableDateTime27.addMillis((int) 'a');
        int int30 = mutableDateTime27.getDayOfYear();
        java.util.GregorianCalendar gregorianCalendar31 = mutableDateTime27.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.secondOfMinute();
        java.util.Locale locale33 = null;
        java.lang.String str34 = property32.getAsText(locale33);
        org.joda.time.MutableDateTime mutableDateTime35 = property32.roundCeiling();
        int int36 = mutableDateTime35.getEra();
        int int37 = mutableDateTime35.getMinuteOfHour();
        int int38 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime35);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        mutableDateTime41.setTime((long) '#');
        mutableDateTime41.addDays((int) '4');
        int int48 = mutableDateTime41.getMinuteOfHour();
        java.lang.String str49 = mutableDateTime41.toString();
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.Instant instant53 = mutableDateTime52.toInstant();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime52.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime55 = property54.roundCeiling();
        java.util.Locale locale56 = null;
        java.lang.String str57 = property54.getAsText(locale56);
        int int58 = property54.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime59 = property54.roundFloor();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology61);
        mutableDateTime62.addMillis((int) 'a');
        int int65 = mutableDateTime62.getDayOfYear();
        boolean boolean67 = mutableDateTime62.isEqual((long) 3);
        org.joda.time.DateTimeZone dateTimeZone68 = mutableDateTime62.getZone();
        org.joda.time.DateTime dateTime69 = mutableDateTime59.toDateTime(dateTimeZone68);
        org.joda.time.DateTime dateTime70 = mutableDateTime41.toDateTime(dateTimeZone68);
        mutableDateTime8.setZone(dateTimeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant53", (mutableDateTime2.compareTo(instant53) == 0) == mutableDateTime2.equals(instant53));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 70);
        org.joda.time.Chronology chronology6 = mutableDateTime5.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTime(chronology6);
        org.joda.time.Chronology chronology8 = mutableDateTime2.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime7", (instant3.compareTo(mutableDateTime7) == 0) == instant3.equals(mutableDateTime7));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        boolean boolean10 = mutableDateTime9.isEqualNow();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.year();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfYear();
        int int16 = mutableDateTime14.getDayOfYear();
        mutableDateTime14.addYears(86399);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        java.util.GregorianCalendar gregorianCalendar24 = mutableDateTime23.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now();
        mutableDateTime27.setHourOfDay(2);
        int int30 = property25.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        int int31 = mutableDateTime27.getWeekyear();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime33.copy();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        java.lang.String str39 = mutableDateTime37.toString();
        mutableDateTime37.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        mutableDateTime37.add(readablePeriod42, (-1));
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime37.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property45.getFieldType();
        int int47 = mutableDateTime33.get(dateTimeFieldType46);
        int int48 = mutableDateTime27.get(dateTimeFieldType46);
        boolean boolean49 = mutableDateTime14.isSupported(dateTimeFieldType46);
        boolean boolean50 = property11.equals((java.lang.Object) dateTimeFieldType46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField(4);
        java.util.Locale locale11 = null;
        int int12 = property8.getMaximumTextLength(locale11);
        org.joda.time.MutableDateTime mutableDateTime14 = property8.addWrapField(57);
        int int15 = mutableDateTime14.getYearOfCentury();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        mutableDateTime18.setSecondOfDay((int) '#');
        int int22 = mutableDateTime18.getMillisOfSecond();
        boolean boolean23 = mutableDateTime14.isEqual((org.joda.time.ReadableInstant) mutableDateTime18);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:02.268Z", dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.roundHalfEven();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime36.add(readablePeriod39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.hourOfDay();
        org.joda.time.DateTimeField dateTimeField42 = property41.getField();
        int int43 = mutableDateTime33.get(dateTimeField42);
        int int44 = mutableDateTime33.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime33.minuteOfDay();
        boolean boolean46 = mutableDateTime14.isBefore((org.joda.time.ReadableInstant) mutableDateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and mutableDateTime27", (instant19.compareTo(mutableDateTime27) == 0) == instant19.equals(mutableDateTime27));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now();
        mutableDateTime8.setHourOfDay(2);
        int int11 = property6.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        mutableDateTime14.setSecondOfDay(10);
        boolean boolean17 = mutableDateTime8.isEqual((org.joda.time.ReadableInstant) mutableDateTime14);
        int int18 = mutableDateTime14.getYearOfEra();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime14.add(readablePeriod19, 4);
        mutableDateTime14.addSeconds(9);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        java.util.GregorianCalendar gregorianCalendar28 = mutableDateTime26.toGregorianCalendar();
        int int29 = mutableDateTime26.getMonthOfYear();
        boolean boolean30 = mutableDateTime14.equals((java.lang.Object) mutableDateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant27", (mutableDateTime2.compareTo(instant27) == 0) == mutableDateTime2.equals(instant27));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = mutableDateTime12.isSupported(dateTimeFieldType13);
        mutableDateTime12.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime18 = mutableDateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((java.lang.Object) readablePeriod5, chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.DurationField durationField10 = property8.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.roundCeiling();
        java.lang.String str12 = property8.getAsString();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime15.hourOfDay();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.secondOfDay();
        java.util.Locale locale21 = null;
        java.lang.String str22 = property20.getAsShortText(locale21);
        org.joda.time.MutableDateTime mutableDateTime24 = property20.add((long) 3);
        org.joda.time.MutableDateTime mutableDateTime25 = property20.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime26 = property20.roundHalfFloor();
        java.lang.String str27 = mutableDateTime26.toString();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime30.hourOfDay();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.secondOfDay();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        int int41 = mutableDateTime38.getYearOfCentury();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime30.toMutableDateTime(chronology42);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableDateTime46.add(readablePeriod49);
        mutableDateTime46.addWeeks(10);
        mutableDateTime46.addDays(20);
        java.util.Date date55 = mutableDateTime46.toDate();
        mutableDateTime30.setTime((org.joda.time.ReadableInstant) mutableDateTime46);
        int int57 = mutableDateTime46.getHourOfDay();
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.DateTimeZone dateTimeZone61 = mutableDateTime60.getZone();
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(dateTimeZone61);
        long long63 = mutableDateTime62.getMillis();
        java.lang.Object obj64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(obj64, chronology65);
        org.joda.time.DateTimeZone dateTimeZone67 = mutableDateTime66.getZone();
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(dateTimeZone67);
        java.util.GregorianCalendar gregorianCalendar69 = mutableDateTime68.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime68.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime71 = property70.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime72 = org.joda.time.MutableDateTime.now();
        mutableDateTime72.setHourOfDay(2);
        int int75 = property70.compareTo((org.joda.time.ReadableInstant) mutableDateTime72);
        int int76 = mutableDateTime72.getWeekyear();
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime79 = mutableDateTime78.copy();
        java.lang.Object obj80 = null;
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.MutableDateTime mutableDateTime82 = new org.joda.time.MutableDateTime(obj80, chronology81);
        org.joda.time.DateTimeZone dateTimeZone83 = mutableDateTime82.getZone();
        java.lang.String str84 = mutableDateTime82.toString();
        mutableDateTime82.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod87 = null;
        mutableDateTime82.add(readablePeriod87, (-1));
        org.joda.time.MutableDateTime.Property property90 = mutableDateTime82.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = property90.getFieldType();
        int int92 = mutableDateTime78.get(dateTimeFieldType91);
        int int93 = mutableDateTime72.get(dateTimeFieldType91);
        boolean boolean94 = mutableDateTime62.isSupported(dateTimeFieldType91);
        mutableDateTime46.set(dateTimeFieldType91, 2021);
        boolean boolean97 = mutableDateTime26.isSupported(dateTimeFieldType91);
        long long98 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime30", (instant3.compareTo(mutableDateTime30) == 0) == instant3.equals(mutableDateTime30));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.String str4 = mutableDateTime2.toString();
        mutableDateTime2.setDate((long) (byte) 100);
        long long7 = mutableDateTime2.getMillis();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime16.hourOfDay();
        boolean boolean21 = mutableDateTime13.isAfter((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime16.getZone();
        int int23 = mutableDateTime16.getMillisOfSecond();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology25);
        mutableDateTime26.addMinutes(5);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime26.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property29.getFieldType();
        int int31 = mutableDateTime16.get(dateTimeFieldType30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime2.property(dateTimeFieldType30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime16", (instant11.compareTo(mutableDateTime16) == 0) == instant11.equals(mutableDateTime16));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now();
        mutableDateTime8.setHourOfDay(2);
        int int11 = property6.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        int int12 = mutableDateTime8.getWeekyear();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.copy();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        java.lang.String str20 = mutableDateTime18.toString();
        mutableDateTime18.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime18.add(readablePeriod23, (-1));
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime18.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        int int28 = mutableDateTime14.get(dateTimeFieldType27);
        int int29 = mutableDateTime8.get(dateTimeFieldType27);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime8.weekOfWeekyear();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(chronology37);
        mutableDateTime8.setChronology(chronology37);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime8.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime41 = property40.roundFloor();
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.Instant instant46 = mutableDateTime45.toInstant();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime45.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime48 = property47.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = null;
        boolean boolean50 = mutableDateTime48.isSupported(dateTimeFieldType49);
        mutableDateTime48.setDayOfYear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime48.getZone();
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((long) 105, dateTimeZone53);
        mutableDateTime41.setZoneRetainFields(dateTimeZone53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant46", (mutableDateTime2.compareTo(instant46) == 0) == mutableDateTime2.equals(instant46));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = mutableDateTime12.isSupported(dateTimeFieldType13);
        mutableDateTime12.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime18 = mutableDateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((java.lang.Object) readablePeriod5, chronology19);
        int int21 = mutableDateTime20.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
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
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.DurationField durationField10 = property8.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.roundCeiling();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        mutableDateTime11.setDate((org.joda.time.ReadableInstant) mutableDateTime14);
        int int18 = mutableDateTime11.getWeekOfWeekyear();
        mutableDateTime11.setDate((long) 474);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.setMonthOfYear((int) (byte) 10);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTime();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        int int10 = mutableDateTime7.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.hourOfDay();
        int int12 = mutableDateTime7.getDayOfYear();
        java.lang.String str13 = mutableDateTime7.toString();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        boolean boolean21 = mutableDateTime19.isSupported(dateTimeFieldType20);
        mutableDateTime19.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.yearOfCentury();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime27 = property25.add(3L);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime7.toMutableDateTime(dateTimeZone28);
        mutableDateTime1.setZone(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant17", (mutableDateTime7.compareTo(instant17) == 0) == mutableDateTime7.equals(instant17));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        mutableDateTime4.setTime((long) '#');
        mutableDateTime4.addDays((int) '4');
        int int11 = mutableDateTime4.getMinuteOfHour();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime4.toMutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime1.toMutableDateTime(dateTimeZone15);
        mutableDateTime18.addDays((int) (short) 0);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundCeiling();
        java.util.Locale locale27 = null;
        java.lang.String str28 = property25.getAsText(locale27);
        int int29 = property25.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime30 = property25.roundFloor();
        org.joda.time.DateTimeField dateTimeField31 = property25.getField();
        int int32 = mutableDateTime18.get(dateTimeField31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant24", (mutableDateTime14.compareTo(instant24) == 0) == mutableDateTime14.equals(instant24));
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
        java.util.Locale locale5 = null;
        java.util.Calendar calendar6 = mutableDateTime2.toCalendar(locale5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.era();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = mutableDateTime2.getRoundingField();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        mutableDateTime12.addWeeks(10);
        mutableDateTime12.addDays(20);
        java.util.Date date21 = mutableDateTime12.toDate();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime12.copy();
        boolean boolean23 = mutableDateTime12.isEqualNow();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        mutableDateTime27.setTime((long) '#');
        mutableDateTime27.addDays((int) '4');
        int int34 = mutableDateTime27.getMinuteOfHour();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime27.toMutableDateTime(dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:46:26.510Z", dateTimeZone38);
        mutableDateTime12.setZoneRetainFields(dateTimeZone38);
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime2.toMutableDateTime(dateTimeZone38);
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        mutableDateTime45.add(readablePeriod48);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.hourOfDay();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime45.era();
        org.joda.time.MutableDateTime mutableDateTime53 = property51.addWrapField(4);
        org.joda.time.MutableDateTime mutableDateTime54 = property51.getMutableDateTime();
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.DateTimeZone dateTimeZone58 = mutableDateTime57.getZone();
        int int59 = mutableDateTime57.getSecondOfMinute();
        int int60 = mutableDateTime57.getMonthOfYear();
        java.lang.Object obj61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(obj61, chronology62);
        org.joda.time.DateTimeZone dateTimeZone64 = mutableDateTime63.getZone();
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime66.copy();
        java.lang.Object obj68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(obj68, chronology69);
        org.joda.time.DateTimeZone dateTimeZone71 = mutableDateTime70.getZone();
        java.lang.String str72 = mutableDateTime70.toString();
        mutableDateTime70.setDate((long) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        mutableDateTime70.add(readablePeriod75, (-1));
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime70.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = property78.getFieldType();
        int int80 = mutableDateTime66.get(dateTimeFieldType79);
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime63.property(dateTimeFieldType79);
        boolean boolean82 = mutableDateTime57.isSupported(dateTimeFieldType79);
        int int83 = mutableDateTime54.get(dateTimeFieldType79);
        int int84 = mutableDateTime42.get(dateTimeFieldType79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property7.getAsText(locale8);
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundCeiling();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfWeek();
        java.lang.String str12 = property11.getAsShortText();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        org.joda.time.DurationField durationField19 = property17.getRangeDurationField();
        boolean boolean20 = property11.equals((java.lang.Object) durationField19);
        org.joda.time.Interval interval21 = property11.toInterval();
        org.joda.time.MutableDateTime mutableDateTime23 = property11.add(522);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone27);
        mutableDateTime23.setZoneRetainFields(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime26", (instant16.compareTo(mutableDateTime26) == 0) == instant16.equals(mutableDateTime26));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = mutableDateTime5.isSupported(dateTimeFieldType6);
        org.joda.time.Instant instant8 = mutableDateTime5.toInstant();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        mutableDateTime11.setTime((long) '#');
        mutableDateTime11.addDays((int) '4');
        int int18 = mutableDateTime11.getMinuteOfHour();
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutableDateTime11.add(readableDuration19, 11);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        java.util.GregorianCalendar gregorianCalendar27 = mutableDateTime26.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now();
        mutableDateTime30.setHourOfDay(2);
        int int33 = property28.compareTo((org.joda.time.ReadableInstant) mutableDateTime30);
        int int34 = mutableDateTime30.getWeekyear();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        java.util.GregorianCalendar gregorianCalendar40 = mutableDateTime39.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime39.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime42 = property41.roundFloor();
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        int int48 = mutableDateTime45.getYearOfCentury();
        org.joda.time.Chronology chronology49 = mutableDateTime45.getChronology();
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(chronology49);
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.now(chronology49);
        mutableDateTime42.setChronology(chronology49);
        org.joda.time.DateTime dateTime53 = mutableDateTime30.toDateTime(chronology49);
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime11.toMutableDateTime(chronology49);
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime5.toMutableDateTime(chronology49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant8", (mutableDateTime5.compareTo(instant8) == 0) == mutableDateTime5.equals(instant8));
    }
}

