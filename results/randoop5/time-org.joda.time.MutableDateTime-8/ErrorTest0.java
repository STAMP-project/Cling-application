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
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime5.toGregorianCalendar();
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
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        mutableDateTime5.setMillisOfSecond(0);
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
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        mutableDateTime5.addMonths((int) '#');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        mutableDateTime10.setSecondOfDay((int) '#');
        mutableDateTime10.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int19 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant11", (mutableDateTime2.compareTo(instant11) == 0) == mutableDateTime2.equals(instant11));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        mutableDateTime10.setZone(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        mutableDateTime2.setZoneRetainFields(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime8.toString(dateTimeFormatter13);
        int int15 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        boolean boolean16 = mutableDateTime2.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        mutableDateTime16.setSecondOfDay((int) '#');
        int int20 = mutableDateTime16.getMonthOfYear();
        mutableDateTime13.setDate((org.joda.time.ReadableInstant) mutableDateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant17", (mutableDateTime10.compareTo(instant17) == 0) == mutableDateTime10.equals(instant17));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime8.toString(dateTimeFormatter13);
        int int15 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property18.getFieldType();
        int int21 = mutableDateTime13.get(dateTimeFieldType20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant17", (mutableDateTime10.compareTo(instant17) == 0) == mutableDateTime10.equals(instant17));
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
        mutableDateTime2.addSeconds(0);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime7", (instant3.compareTo(mutableDateTime7) == 0) == instant3.equals(mutableDateTime7));
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
        java.lang.String str5 = property4.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        mutableDateTime5.setWeekOfWeekyear(53);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) (short) -1);
        mutableDateTime13.setWeekOfWeekyear(53);
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) mutableDateTime13);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        mutableDateTime19.addSeconds(0);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime19.copy();
        mutableDateTime5.setDate((org.joda.time.ReadableInstant) mutableDateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and mutableDateTime24", (instant20.compareTo(mutableDateTime24) == 0) == instant20.equals(mutableDateTime24));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        java.util.GregorianCalendar gregorianCalendar18 = mutableDateTime12.toGregorianCalendar();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime12.toMutableDateTime(chronology26);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant37 = null;
        mutableDateTime31.setDate(readableInstant37);
        mutableDateTime31.setMinuteOfDay(4);
        int int41 = mutableDateTime31.getMonthOfYear();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.Instant instant45 = mutableDateTime44.toInstant();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime44.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime47 = property46.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property46.getFieldType();
        int int49 = mutableDateTime31.get(dateTimeFieldType48);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime12.property(dateTimeFieldType48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime22 and instant45", (mutableDateTime22.compareTo(instant45) == 0) == mutableDateTime22.equals(instant45));
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
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar25 = mutableDateTime18.toGregorianCalendar();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        java.util.GregorianCalendar gregorianCalendar34 = mutableDateTime28.toGregorianCalendar();
        mutableDateTime18.setDate((org.joda.time.ReadableInstant) mutableDateTime28);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        int int41 = mutableDateTime38.getYearOfCentury();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime28.toMutableDateTime(chronology42);
        mutableDateTime44.addMillis(59);
        boolean boolean47 = mutableDateTime5.isBefore((org.joda.time.ReadableInstant) mutableDateTime44);
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
        int int5 = mutableDateTime2.getCenturyOfEra();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime2.toString(dateTimeFormatter7);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        mutableDateTime11.setDate((long) 10);
        int int15 = mutableDateTime11.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.add((int) (short) 10);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology25);
        org.joda.time.DateTime dateTime28 = mutableDateTime18.toDateTime(chronology25);
        boolean boolean29 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime21", (instant12.compareTo(mutableDateTime21) == 0) == instant12.equals(mutableDateTime21));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        java.util.GregorianCalendar gregorianCalendar18 = mutableDateTime12.toGregorianCalendar();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        boolean boolean23 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime22);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime29.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime29.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime32 = property31.roundFloor();
        int int33 = mutableDateTime32.getMillisOfDay();
        boolean boolean34 = mutableDateTime22.isEqual((org.joda.time.ReadableInstant) mutableDateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant27", (mutableDateTime2.compareTo(instant27) == 0) == mutableDateTime2.equals(instant27));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime8.toString(dateTimeFormatter13);
        int int15 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime8.millisOfDay();
        int int17 = property16.getMaximumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        mutableDateTime10.add((long) (short) -1);
        boolean boolean19 = property3.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime21 = property3.add((int) '#');
        org.joda.time.MutableDateTime mutableDateTime22 = property3.roundFloor();
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        int int24 = mutableDateTime22.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime22 and instant23", (mutableDateTime22.compareTo(instant23) == 0) == mutableDateTime22.equals(instant23));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime9.toGregorianCalendar();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        java.util.GregorianCalendar gregorianCalendar25 = mutableDateTime19.toGregorianCalendar();
        mutableDateTime9.setDate((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property28.getFieldType();
        boolean boolean30 = mutableDateTime19.isSupported(dateTimeFieldType29);
        boolean boolean31 = mutableDateTime5.isSupported(dateTimeFieldType29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
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
        int int5 = mutableDateTime2.getCenturyOfEra();
        boolean boolean7 = mutableDateTime2.isEqual((-1L));
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        mutableDateTime10.addMillis((int) 'a');
        int int13 = mutableDateTime10.getDayOfYear();
        boolean boolean14 = mutableDateTime10.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property16.getFieldType();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime10.property(dateTimeFieldType17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.property(dateTimeFieldType17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime13.addYears((int) (short) 10);
        mutableDateTime11.setDate((org.joda.time.ReadableInstant) mutableDateTime13);
        int int17 = mutableDateTime13.getRoundingMode();
        int int18 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        java.util.GregorianCalendar gregorianCalendar12 = mutableDateTime11.toGregorianCalendar();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        mutableDateTime15.setDate((long) 10);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime21.toString(dateTimeFormatter26);
        int int28 = mutableDateTime15.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime21.millisOfDay();
        boolean boolean30 = mutableDateTime11.equals((java.lang.Object) mutableDateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant16", (mutableDateTime11.compareTo(instant16) == 0) == mutableDateTime11.equals(instant16));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime8.toString(dateTimeFormatter13);
        int int15 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime8.millisOfDay();
        java.util.Locale locale17 = null;
        int int18 = property16.getMaximumTextLength(locale17);
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
        int int6 = mutableDateTime5.getWeekOfWeekyear();
        org.joda.time.Instant instant7 = mutableDateTime5.toInstant();
        int int8 = mutableDateTime5.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant7", (mutableDateTime5.compareTo(instant7) == 0) == mutableDateTime5.equals(instant7));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        mutableDateTime18.setZone(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime18.getZone();
        int int23 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        int int24 = mutableDateTime8.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime15 = property11.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField16 = property11.getField();
        mutableDateTime2.setRounding(dateTimeField16, 2);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone24);
        mutableDateTime2.setZoneRetainFields(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime23", (instant3.compareTo(mutableDateTime23) == 0) == instant3.equals(mutableDateTime23));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.add((int) (short) 10);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.DateTime dateTime19 = mutableDateTime9.toDateTime(chronology16);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        int int10 = property7.getLeapAmount();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.yearOfCentury();
        java.lang.String str19 = property18.toString();
        org.joda.time.DurationField durationField20 = property18.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime21 = property18.roundFloor();
        boolean boolean22 = property7.equals((java.lang.Object) mutableDateTime21);
        int int23 = mutableDateTime21.getDayOfMonth();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology30);
        mutableDateTime31.addWeekyears((int) (byte) 1);
        boolean boolean34 = mutableDateTime21.isBefore((org.joda.time.ReadableInstant) mutableDateTime31);
        mutableDateTime31.setDayOfYear((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and mutableDateTime26", (instant14.compareTo(mutableDateTime26) == 0) == instant14.equals(mutableDateTime26));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        java.util.Date date6 = mutableDateTime2.toDate();
        long long7 = mutableDateTime2.getMillis();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        mutableDateTime10.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.secondOfMinute();
        int int16 = property15.getMaximumValue();
        int int17 = property15.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField18 = property15.getField();
        int int19 = mutableDateTime2.get(dateTimeField18);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone25);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        int int35 = mutableDateTime30.getWeekOfWeekyear();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        int int41 = mutableDateTime38.getYearOfCentury();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime30.toMutableDateTime(chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(chronology42);
        mutableDateTime27.setChronology(chronology42);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime2.toMutableDateTime(chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime24", (instant11.compareTo(mutableDateTime24) == 0) == instant11.equals(mutableDateTime24));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime2.setZone(dateTimeZone4);
        int int6 = mutableDateTime2.getMinuteOfHour();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        mutableDateTime2.setChronology(chronology13);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.secondOfMinute();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        mutableDateTime19.add((long) (byte) 1);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant20", (mutableDateTime9.compareTo(instant20) == 0) == mutableDateTime9.equals(instant20));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        mutableDateTime8.setSecondOfDay((int) '#');
        mutableDateTime8.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int17 = mutableDateTime8.getHourOfDay();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime8);
        int int19 = mutableDateTime2.getDayOfMonth();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(chronology26);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getWeekOfWeekyear();
        org.joda.time.Instant instant7 = mutableDateTime5.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant7", (mutableDateTime5.compareTo(instant7) == 0) == mutableDateTime5.equals(instant7));
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
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime8 = mutableDateTime2.toDateTimeISO();
        int int9 = mutableDateTime2.getSecondOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) (short) -1);
        mutableDateTime15.setWeekOfWeekyear(53);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime15.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime20 = property18.getMutableDateTime();
        boolean boolean21 = mutableDateTime20.isAfterNow();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.hourOfDay();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime24.dayOfWeek();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime24.secondOfDay();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime24.monthOfYear();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology34);
        mutableDateTime35.addMillis((int) 'a');
        int int38 = mutableDateTime35.getDayOfYear();
        boolean boolean39 = mutableDateTime35.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime35.getZone();
        mutableDateTime24.setZoneRetainFields(dateTimeZone40);
        mutableDateTime20.setZone(dateTimeZone40);
        mutableDateTime2.setZoneRetainFields(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
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
        mutableDateTime2.addSeconds(0);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 'a');
        int int10 = mutableDateTime9.getDayOfWeek();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        int int18 = mutableDateTime13.getWeekOfWeekyear();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.DateTime dateTime23 = mutableDateTime13.toDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        boolean boolean26 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime25);
        java.lang.Object obj27 = mutableDateTime25.clone();
        mutableDateTime25.addDays(18331);
        boolean boolean30 = mutableDateTime7.isBefore((org.joda.time.ReadableInstant) mutableDateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime15.toGregorianCalendar();
        java.lang.Class<?> wildcardClass17 = mutableDateTime15.getClass();
        boolean boolean18 = mutableDateTime2.equals((java.lang.Object) wildcardClass17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant13", (mutableDateTime8.compareTo(instant13) == 0) == mutableDateTime8.equals(instant13));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.add((int) (short) 10);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.DateTime dateTime19 = mutableDateTime9.toDateTime(chronology16);
        int int20 = dateTime19.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfWeek();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        int int8 = mutableDateTime5.getYearOfCentury();
        org.joda.time.Chronology chronology9 = mutableDateTime5.getChronology();
        int int10 = mutableDateTime5.getWeekOfWeekyear();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTime dateTime15 = mutableDateTime5.toDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        boolean boolean18 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        int int19 = mutableDateTime17.getDayOfMonth();
        java.lang.Object obj20 = mutableDateTime17.clone();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.hourOfDay();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant30 = null;
        mutableDateTime24.setDate(readableInstant30);
        mutableDateTime24.setMinuteOfDay(4);
        int int34 = mutableDateTime24.getMonthOfYear();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.Instant instant38 = mutableDateTime37.toInstant();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime37.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime40 = property39.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property39.getFieldType();
        int int42 = mutableDateTime24.get(dateTimeFieldType41);
        mutableDateTime17.set(dateTimeFieldType41, 4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant38", (mutableDateTime5.compareTo(instant38) == 0) == mutableDateTime5.equals(instant38));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        mutableDateTime18.setZone(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime18.getZone();
        int int23 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        java.util.Locale locale24 = null;
        java.util.Calendar calendar25 = mutableDateTime18.toCalendar(locale24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.util.Locale locale7 = null;
        java.util.Calendar calendar8 = mutableDateTime2.toCalendar(locale7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.weekyear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.getMutableDateTime();
        org.joda.time.DurationField durationField11 = property9.getLeapDurationField();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        mutableDateTime14.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.dayOfWeek();
        org.joda.time.DurationField durationField20 = property19.getLeapDurationField();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        mutableDateTime23.setZone(dateTimeZone25);
        int int27 = mutableDateTime23.getMinuteOfHour();
        int int28 = property19.compareTo((org.joda.time.ReadableInstant) mutableDateTime23);
        int int29 = property9.getDifference((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.MutableDateTime mutableDateTime30 = property9.getMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime23", (instant15.compareTo(mutableDateTime23) == 0) == instant15.equals(mutableDateTime23));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.addYears((int) (short) 10);
        int int4 = mutableDateTime1.getMonthOfYear();
        boolean boolean5 = mutableDateTime1.isAfterNow();
        int int6 = mutableDateTime1.getSecondOfDay();
        java.util.GregorianCalendar gregorianCalendar7 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime8", (mutableDateTime1.compareTo(mutableDateTime8) == 0) == mutableDateTime1.equals(mutableDateTime8));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.addYears((int) (short) 10);
        int int4 = mutableDateTime1.getMonthOfYear();
        boolean boolean5 = mutableDateTime1.isAfterNow();
        int int6 = mutableDateTime1.getSecondOfDay();
        java.util.GregorianCalendar gregorianCalendar7 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.toMutableDateTimeISO();
        int int10 = mutableDateTime9.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime8", (mutableDateTime1.compareTo(mutableDateTime8) == 0) == mutableDateTime1.equals(mutableDateTime8));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:01.767Z");
        mutableDateTime1.addWeeks((int) (byte) 0);
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        mutableDateTime6.setZone(dateTimeZone8);
        int int10 = mutableDateTime6.getMinuteOfHour();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        mutableDateTime6.setChronology(chronology17);
        org.joda.time.DateTime dateTime20 = mutableDateTime1.toDateTime(chronology17);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        mutableDateTime23.setZone(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration29 = null;
        mutableDateTime27.add(readableDuration29);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property35.getFieldType();
        mutableDateTime27.set(dateTimeFieldType37, 1);
        boolean boolean40 = mutableDateTime23.isSupported(dateTimeFieldType37);
        boolean boolean41 = dateTime20.isSupported(dateTimeFieldType37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant34", (mutableDateTime6.compareTo(instant34) == 0) == mutableDateTime6.equals(instant34));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.add((long) (short) -1);
        mutableDateTime10.setWeekOfWeekyear(53);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.add((long) (short) -1);
        mutableDateTime18.setWeekOfWeekyear(53);
        mutableDateTime10.setTime((org.joda.time.ReadableInstant) mutableDateTime18);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property26.getFieldType();
        int int29 = mutableDateTime18.get(dateTimeFieldType28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration32 = null;
        mutableDateTime30.add(readableDuration32);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.Instant instant37 = mutableDateTime36.toInstant();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime36.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime39 = property38.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property38.getFieldType();
        mutableDateTime30.set(dateTimeFieldType40, 1);
        boolean boolean43 = mutableDateTime18.isSupported(dateTimeFieldType40);
        boolean boolean44 = mutableDateTime4.isSupported(dateTimeFieldType40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant25", (mutableDateTime2.compareTo(instant25) == 0) == mutableDateTime2.equals(instant25));
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
        mutableDateTime2.addSeconds(0);
        int int7 = mutableDateTime2.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.yearOfCentury();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        int int5 = mutableDateTime2.getRoundingMode();
        int int6 = mutableDateTime2.getYearOfCentury();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = mutableDateTime2.toDateTime(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutableDateTime2.setDate(readableInstant8);
        mutableDateTime2.setMinuteOfDay(4);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime17.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundFloor();
        java.util.Locale locale21 = null;
        int int22 = property19.getMaximumTextLength(locale21);
        org.joda.time.MutableDateTime mutableDateTime23 = property19.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property19.getFieldType();
        int int25 = mutableDateTime2.get(dateTimeFieldType24);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime2.toMutableDateTime(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime28", (instant15.compareTo(mutableDateTime28) == 0) == instant15.equals(mutableDateTime28));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime6 = property3.roundCeiling();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        mutableDateTime6.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime6.add(readablePeriod14);
        int int16 = mutableDateTime6.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:01.767Z");
        mutableDateTime18.addWeeks((int) (byte) 0);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        mutableDateTime23.setZone(dateTimeZone25);
        int int27 = mutableDateTime23.getMinuteOfHour();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(chronology34);
        mutableDateTime23.setChronology(chronology34);
        org.joda.time.DateTime dateTime37 = mutableDateTime18.toDateTime(chronology34);
        mutableDateTime6.setChronology(chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime23", (instant10.compareTo(mutableDateTime23) == 0) == instant10.equals(mutableDateTime23));
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        mutableDateTime18.setZone(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime18.getZone();
        int int23 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime8.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        mutableDateTime7.addWeekyears((int) (byte) 1);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        mutableDateTime12.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        mutableDateTime7.setRounding(dateTimeField18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
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
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.dayOfWeek();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        mutableDateTime11.setZone(dateTimeZone13);
        int int15 = mutableDateTime11.getMinuteOfHour();
        int int16 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        boolean boolean18 = property7.equals((java.lang.Object) "20");
        org.joda.time.MutableDateTime mutableDateTime19 = property7.getMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = dateTime12.isSupported(dateTimeFieldType13);
        int int15 = dateTime12.getSecondOfMinute();
        int int16 = dateTime12.getYearOfEra();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime22.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundFloor();
        java.util.Locale locale26 = null;
        int int27 = property24.getMaximumTextLength(locale26);
        org.joda.time.MutableDateTime mutableDateTime28 = property24.roundHalfEven();
        boolean boolean29 = dateTime12.equals((java.lang.Object) mutableDateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant20", (mutableDateTime2.compareTo(instant20) == 0) == mutableDateTime2.equals(instant20));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.dayOfWeek();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        mutableDateTime11.setZone(dateTimeZone13);
        int int15 = mutableDateTime11.getMinuteOfHour();
        int int16 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        java.util.Locale locale17 = null;
        java.lang.String str18 = property7.getAsText(locale17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
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
        mutableDateTime2.setDayOfYear(70);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.dayOfWeek();
        int int16 = mutableDateTime9.getSecondOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology18);
        mutableDateTime19.addMillis((int) 'a');
        int int22 = mutableDateTime19.getDayOfYear();
        boolean boolean23 = mutableDateTime19.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property25.getFieldType();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime19.property(dateTimeFieldType26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology29);
        mutableDateTime30.addMillis((int) 'a');
        int int33 = mutableDateTime30.getDayOfYear();
        boolean boolean34 = mutableDateTime30.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime30.getZone();
        mutableDateTime19.setZoneRetainFields(dateTimeZone35);
        mutableDateTime9.setTime((org.joda.time.ReadableInstant) mutableDateTime19);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime47 = property45.addWrapField((int) (short) 1);
        int int48 = property45.get();
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = mutableDateTime51.toString(dateTimeFormatter52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        mutableDateTime51.add(readablePeriod54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime51.hourOfDay();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime51.dayOfWeek();
        int int58 = property57.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime60 = property57.addWrapField(0);
        long long61 = property45.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime60);
        boolean boolean63 = mutableDateTime60.isBefore((long) (byte) 10);
        org.joda.time.DateTime dateTime64 = mutableDateTime60.toDateTimeISO();
        java.lang.Object obj65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(obj65, chronology66);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = null;
        java.lang.String str69 = mutableDateTime67.toString(dateTimeFormatter68);
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        mutableDateTime67.add(readablePeriod70);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime67.hourOfDay();
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime67.dayOfWeek();
        int int74 = property73.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime76 = property73.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime77 = property73.roundHalfEven();
        java.lang.Object obj78 = null;
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime(obj78, chronology79);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter81 = null;
        java.lang.String str82 = mutableDateTime80.toString(dateTimeFormatter81);
        int int83 = mutableDateTime80.getYearOfCentury();
        org.joda.time.Chronology chronology84 = mutableDateTime80.getChronology();
        org.joda.time.MutableDateTime mutableDateTime85 = new org.joda.time.MutableDateTime(chronology84);
        org.joda.time.MutableDateTime mutableDateTime86 = mutableDateTime77.toMutableDateTime(chronology84);
        org.joda.time.MutableDateTime mutableDateTime87 = mutableDateTime60.toMutableDateTime(chronology84);
        org.joda.time.DateTime dateTime88 = mutableDateTime9.toDateTime(chronology84);
        org.joda.time.DateTime dateTime89 = mutableDateTime2.toDateTime(chronology84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology8);
        mutableDateTime9.addMillis((int) 'a');
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime19 = property15.addWrapField((int) 'a');
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.dayOfWeek();
        mutableDateTime22.add((long) (short) -1);
        boolean boolean31 = property15.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime33 = property15.add((int) '#');
        org.joda.time.MutableDateTime mutableDateTime34 = property15.roundHalfFloor();
        java.util.Locale locale35 = null;
        java.util.Calendar calendar36 = mutableDateTime34.toCalendar(locale35);
        boolean boolean37 = mutableDateTime9.isBefore((org.joda.time.ReadableInstant) mutableDateTime34);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        int int43 = mutableDateTime40.getYearOfCentury();
        org.joda.time.Chronology chronology44 = mutableDateTime40.getChronology();
        int int45 = mutableDateTime40.getWeekOfWeekyear();
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = null;
        java.lang.String str50 = mutableDateTime48.toString(dateTimeFormatter49);
        int int51 = mutableDateTime48.getYearOfCentury();
        org.joda.time.Chronology chronology52 = mutableDateTime48.getChronology();
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime40.toMutableDateTime(chronology52);
        org.joda.time.DateTime dateTime54 = mutableDateTime34.toDateTime(chronology52);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((long) 53, chronology52);
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime2.toMutableDateTime(chronology52);
        java.lang.Object obj57 = null;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(obj57, chronology58);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = null;
        java.lang.String str61 = mutableDateTime59.toString(dateTimeFormatter60);
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        mutableDateTime59.add(readablePeriod62);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime59.hourOfDay();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime59.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime67 = property65.addWrapField((int) (short) 10);
        mutableDateTime67.addWeeks(30);
        java.lang.Object obj70 = null;
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(obj70, chronology71);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = null;
        java.lang.String str74 = mutableDateTime72.toString(dateTimeFormatter73);
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        mutableDateTime72.add(readablePeriod75);
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime72.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant78 = null;
        mutableDateTime72.setDate(readableInstant78);
        mutableDateTime72.setMinuteOfDay(4);
        int int82 = mutableDateTime72.getMonthOfYear();
        java.lang.Object obj83 = null;
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.MutableDateTime mutableDateTime85 = new org.joda.time.MutableDateTime(obj83, chronology84);
        org.joda.time.Instant instant86 = mutableDateTime85.toInstant();
        org.joda.time.MutableDateTime.Property property87 = mutableDateTime85.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime88 = property87.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = property87.getFieldType();
        int int90 = mutableDateTime72.get(dateTimeFieldType89);
        org.joda.time.MutableDateTime.Property property91 = mutableDateTime67.property(dateTimeFieldType89);
        int int92 = mutableDateTime56.get(dateTimeFieldType89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant86", (mutableDateTime2.compareTo(instant86) == 0) == mutableDateTime2.equals(instant86));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime6 = property3.roundCeiling();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        mutableDateTime6.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        mutableDateTime6.setYear(46);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property19.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime23 = property19.addWrapField((int) 'a');
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime26.add(readablePeriod29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime26.hourOfDay();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime26.dayOfWeek();
        mutableDateTime26.add((long) (short) -1);
        boolean boolean35 = property19.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime37 = property19.add((int) '#');
        org.joda.time.MutableDateTime mutableDateTime38 = property19.roundHalfFloor();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology40);
        mutableDateTime41.addMillis((int) 'a');
        int int44 = mutableDateTime41.getDayOfYear();
        boolean boolean45 = mutableDateTime41.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime46.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property47.getFieldType();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime41.property(dateTimeFieldType48);
        org.joda.time.MutableDateTime mutableDateTime50 = property49.roundHalfFloor();
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime53.getZone();
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime50.toMutableDateTime(dateTimeZone54);
        mutableDateTime38.setZoneRetainFields(dateTimeZone54);
        mutableDateTime6.setZone(dateTimeZone54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime26", (instant10.compareTo(mutableDateTime26) == 0) == instant10.equals(mutableDateTime26));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfWeek();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        int int8 = mutableDateTime5.getYearOfCentury();
        org.joda.time.Chronology chronology9 = mutableDateTime5.getChronology();
        int int10 = mutableDateTime5.getWeekOfWeekyear();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTime dateTime15 = mutableDateTime5.toDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        boolean boolean18 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        int int19 = mutableDateTime17.getDayOfMonth();
        java.lang.Object obj20 = mutableDateTime17.clone();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfCeiling();
        org.joda.time.ReadableDuration readableDuration23 = null;
        mutableDateTime22.add(readableDuration23);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.Instant instant28 = mutableDateTime27.toInstant();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime27.monthOfYear();
        int int30 = mutableDateTime27.getYearOfCentury();
        boolean boolean31 = mutableDateTime22.isBefore((org.joda.time.ReadableInstant) mutableDateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant28", (mutableDateTime5.compareTo(instant28) == 0) == mutableDateTime5.equals(instant28));
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
        mutableDateTime2.addSeconds(0);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.copy();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        mutableDateTime10.setZone(dateTimeZone12);
        int int14 = mutableDateTime10.getMinuteOfHour();
        mutableDateTime10.setTime((int) (byte) 1, 7, (int) (short) 1, 4);
        int int20 = mutableDateTime10.getRoundingMode();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime28 = property24.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField29 = property24.getField();
        int int30 = mutableDateTime10.get(dateTimeField29);
        mutableDateTime2.setRounding(dateTimeField29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime7", (instant3.compareTo(mutableDateTime7) == 0) == instant3.equals(mutableDateTime7));
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
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        mutableDateTime18.setZone(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime18.getZone();
        int int23 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.monthOfYear();
        mutableDateTime26.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime26.dayOfWeek();
        org.joda.time.DurationField durationField32 = property31.getLeapDurationField();
        org.joda.time.DateTimeField dateTimeField33 = property31.getField();
        boolean boolean34 = mutableDateTime18.equals((java.lang.Object) property31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundFloor();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        mutableDateTime11.addMillis((int) 'a');
        int int14 = mutableDateTime11.getDayOfYear();
        boolean boolean15 = mutableDateTime8.isAfter((org.joda.time.ReadableInstant) mutableDateTime11);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        mutableDateTime18.setZone(dateTimeZone20);
        int int22 = mutableDateTime18.getMinuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime18.add(readablePeriod23, (int) (short) 10);
        org.joda.time.Chronology chronology26 = mutableDateTime18.getChronology();
        org.joda.time.DateTime dateTime27 = mutableDateTime11.toDateTime(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutableDateTime2.setDate(readableInstant8);
        mutableDateTime2.setMinuteOfDay(4);
        int int12 = mutableDateTime2.getMonthOfYear();
        mutableDateTime2.addWeekyears((int) (short) -1);
        java.util.GregorianCalendar gregorianCalendar15 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundFloor();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        mutableDateTime20.setSecondOfDay((int) '#');
        mutableDateTime20.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int29 = mutableDateTime20.getHourOfDay();
        mutableDateTime20.setSecondOfDay(1969);
        int int32 = property16.getDifference((org.joda.time.ReadableInstant) mutableDateTime20);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant41 = null;
        mutableDateTime35.setDate(readableInstant41);
        mutableDateTime35.setMinuteOfDay(4);
        int int45 = mutableDateTime35.getMonthOfYear();
        mutableDateTime35.addWeekyears((int) (short) -1);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology49);
        mutableDateTime50.addMillis((int) 'a');
        int int53 = mutableDateTime50.getDayOfYear();
        boolean boolean54 = mutableDateTime50.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime55.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property56.getFieldType();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime50.property(dateTimeFieldType57);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology60);
        mutableDateTime61.addMillis((int) 'a');
        int int64 = mutableDateTime61.getDayOfYear();
        boolean boolean65 = mutableDateTime61.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone66 = mutableDateTime61.getZone();
        mutableDateTime50.setZoneRetainFields(dateTimeZone66);
        mutableDateTime35.setZoneRetainFields(dateTimeZone66);
        org.joda.time.DateTime dateTime69 = mutableDateTime20.toDateTime(dateTimeZone66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and mutableDateTime55", (instant21.compareTo(mutableDateTime55) == 0) == instant21.equals(mutableDateTime55));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(19);
        long long10 = mutableDateTime9.getMillis();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.dayOfWeek();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime13.secondOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime13.monthOfYear();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology23);
        mutableDateTime24.addMillis((int) 'a');
        int int27 = mutableDateTime24.getDayOfYear();
        boolean boolean28 = mutableDateTime24.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime24.getZone();
        mutableDateTime13.setZoneRetainFields(dateTimeZone29);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime33.add(readablePeriod36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant39 = null;
        mutableDateTime33.setDate(readableInstant39);
        mutableDateTime33.setMinuteOfDay(4);
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.Instant instant46 = mutableDateTime45.toInstant();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime45.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime48 = property47.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime48.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime48.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime51 = property50.roundFloor();
        java.util.Locale locale52 = null;
        int int53 = property50.getMaximumTextLength(locale52);
        org.joda.time.MutableDateTime mutableDateTime54 = property50.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property50.getFieldType();
        int int56 = mutableDateTime33.get(dateTimeFieldType55);
        boolean boolean57 = mutableDateTime13.isSupported(dateTimeFieldType55);
        boolean boolean58 = mutableDateTime9.isSupported(dateTimeFieldType55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone5);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.hourOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime11.dayOfWeek();
        int int18 = property17.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime20 = property17.addWrapField(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.monthOfYear();
        mutableDateTime26.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime26.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField32 = property31.getField();
        mutableDateTime20.setRounding(dateTimeField32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant27", (mutableDateTime4.compareTo(instant27) == 0) == mutableDateTime4.equals(instant27));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime15 = property11.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField16 = property11.getField();
        mutableDateTime2.setRounding(dateTimeField16, 2);
        mutableDateTime2.setMinuteOfDay(49);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.dayOfYear();
        int int25 = property24.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime27 = property24.set((int) (short) 1);
        int int28 = mutableDateTime27.getYear();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime2.toMutableDateTime();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone36);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        int int44 = mutableDateTime41.getYearOfCentury();
        org.joda.time.Chronology chronology45 = mutableDateTime41.getChronology();
        int int46 = mutableDateTime41.getWeekOfWeekyear();
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        int int52 = mutableDateTime49.getYearOfCentury();
        org.joda.time.Chronology chronology53 = mutableDateTime49.getChronology();
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime41.toMutableDateTime(chronology53);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(chronology53);
        mutableDateTime38.setChronology(chronology53);
        org.joda.time.MutableDateTime mutableDateTime57 = org.joda.time.MutableDateTime.now(chronology53);
        mutableDateTime2.setChronology(chronology53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime35", (instant3.compareTo(mutableDateTime35) == 0) == instant3.equals(mutableDateTime35));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:03.895Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.centuryOfEra();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        int int8 = mutableDateTime5.getYearOfCentury();
        org.joda.time.Chronology chronology9 = mutableDateTime5.getChronology();
        int int10 = mutableDateTime5.getWeekOfWeekyear();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTime dateTime15 = mutableDateTime5.toDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime1.toMutableDateTime(dateTimeZone14);
        int int18 = mutableDateTime1.getMillisOfSecond();
        java.util.GregorianCalendar gregorianCalendar19 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime1.copy();
        int int21 = mutableDateTime20.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime17", (mutableDateTime1.compareTo(mutableDateTime17) == 0) == mutableDateTime1.equals(mutableDateTime17));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.util.Date date8 = mutableDateTime2.toDate();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        mutableDateTime2.add((long) 53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant12", (mutableDateTime11.compareTo(instant12) == 0) == mutableDateTime11.equals(instant12));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone4);
        org.joda.time.DateTime dateTime6 = mutableDateTime5.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:03.895Z");
        mutableDateTime8.setDayOfWeek(2);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.dayOfWeek();
        int int20 = property19.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime23 = property19.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime24 = property19.getMutableDateTime();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant34 = null;
        mutableDateTime28.setDate(readableInstant34);
        mutableDateTime28.setMinuteOfDay(4);
        int int38 = mutableDateTime28.getMonthOfYear();
        mutableDateTime28.setMinuteOfHour((int) '#');
        boolean boolean41 = mutableDateTime28.isEqualNow();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime46.getZone();
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone47);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        int int55 = mutableDateTime52.getYearOfCentury();
        org.joda.time.Chronology chronology56 = mutableDateTime52.getChronology();
        int int57 = mutableDateTime52.getWeekOfWeekyear();
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = null;
        java.lang.String str62 = mutableDateTime60.toString(dateTimeFormatter61);
        int int63 = mutableDateTime60.getYearOfCentury();
        org.joda.time.Chronology chronology64 = mutableDateTime60.getChronology();
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime52.toMutableDateTime(chronology64);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(chronology64);
        mutableDateTime49.setChronology(chronology64);
        org.joda.time.DateTime dateTime68 = mutableDateTime28.toDateTime(chronology64);
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:28.134Z", chronology64);
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime24, chronology64);
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime8.toMutableDateTime(chronology64);
        org.joda.time.DateTime dateTime72 = mutableDateTime5.toDateTime(chronology64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime71", (mutableDateTime8.compareTo(mutableDateTime71) == 0) == mutableDateTime8.equals(mutableDateTime71));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.dayOfWeek();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        mutableDateTime11.setZone(dateTimeZone13);
        int int15 = mutableDateTime11.getMinuteOfHour();
        int int16 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        int int24 = mutableDateTime19.getWeekOfWeekyear();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.DateTime dateTime29 = mutableDateTime19.toDateTime(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime11.toMutableDateTime(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.util.Date date8 = mutableDateTime2.toDate();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        mutableDateTime2.addDays(18331);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant12", (mutableDateTime11.compareTo(instant12) == 0) == mutableDateTime11.equals(instant12));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        int int8 = property3.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime9 = property3.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:03.895Z");
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.centuryOfEra();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        int int20 = mutableDateTime15.getWeekOfWeekyear();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.DateTime dateTime25 = mutableDateTime15.toDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime11.toMutableDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime9.toMutableDateTime(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and mutableDateTime27", (mutableDateTime11.compareTo(mutableDateTime27) == 0) == mutableDateTime11.equals(mutableDateTime27));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfWeek();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        int int8 = mutableDateTime5.getYearOfCentury();
        org.joda.time.Chronology chronology9 = mutableDateTime5.getChronology();
        int int10 = mutableDateTime5.getWeekOfWeekyear();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTime dateTime15 = mutableDateTime5.toDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        boolean boolean18 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime17.setMinuteOfDay(45);
        int int21 = mutableDateTime17.getCenturyOfEra();
        mutableDateTime17.setDayOfMonth((int) (byte) 1);
        mutableDateTime17.setMillis((long) 132);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        mutableDateTime28.setSecondOfDay((int) '#');
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.Instant instant35 = mutableDateTime34.toInstant();
        mutableDateTime34.setSecondOfDay((int) '#');
        mutableDateTime34.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int43 = mutableDateTime34.getHourOfDay();
        mutableDateTime28.setTime((org.joda.time.ReadableInstant) mutableDateTime34);
        int int45 = mutableDateTime28.getDayOfMonth();
        boolean boolean46 = mutableDateTime17.isAfter((org.joda.time.ReadableInstant) mutableDateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant29", (mutableDateTime5.compareTo(instant29) == 0) == mutableDateTime5.equals(instant29));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:15.134Z");
        long long11 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime10);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        int int19 = mutableDateTime14.getWeekOfWeekyear();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.DateTime dateTime24 = mutableDateTime14.toDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        mutableDateTime10.setZone(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfWeek();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.toMutableDateTime();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        int int14 = mutableDateTime13.getDayOfWeek();
        boolean boolean15 = mutableDateTime13.isAfterNow();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.minuteOfDay();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        int int24 = mutableDateTime19.getWeekOfWeekyear();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        int int30 = mutableDateTime27.getYearOfCentury();
        org.joda.time.Chronology chronology31 = mutableDateTime27.getChronology();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime19.toMutableDateTime(chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(chronology31);
        mutableDateTime13.setChronology(chronology31);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField36 = property35.getField();
        mutableDateTime1.setRounding(dateTimeField36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime13", (instant6.compareTo(mutableDateTime13) == 0) == instant6.equals(mutableDateTime13));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutableDateTime2.setDate(readableInstant8);
        mutableDateTime2.setMinuteOfDay(4);
        int int12 = mutableDateTime2.getMonthOfYear();
        mutableDateTime2.setMinuteOfHour((int) '#');
        boolean boolean15 = mutableDateTime2.isEqualNow();
        mutableDateTime2.setMillisOfDay(19);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology19);
        mutableDateTime20.addMillis((int) 'a');
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property26.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime30 = property26.addWrapField((int) 'a');
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime33.add(readablePeriod36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.hourOfDay();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime33.dayOfWeek();
        mutableDateTime33.add((long) (short) -1);
        boolean boolean42 = property26.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime44 = property26.add((int) '#');
        org.joda.time.MutableDateTime mutableDateTime45 = property26.roundHalfFloor();
        java.util.Locale locale46 = null;
        java.util.Calendar calendar47 = mutableDateTime45.toCalendar(locale46);
        boolean boolean48 = mutableDateTime20.isBefore((org.joda.time.ReadableInstant) mutableDateTime45);
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = mutableDateTime51.toString(dateTimeFormatter52);
        int int54 = mutableDateTime51.getYearOfCentury();
        org.joda.time.Chronology chronology55 = mutableDateTime51.getChronology();
        int int56 = mutableDateTime51.getWeekOfWeekyear();
        java.lang.Object obj57 = null;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(obj57, chronology58);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = null;
        java.lang.String str61 = mutableDateTime59.toString(dateTimeFormatter60);
        int int62 = mutableDateTime59.getYearOfCentury();
        org.joda.time.Chronology chronology63 = mutableDateTime59.getChronology();
        org.joda.time.MutableDateTime mutableDateTime64 = mutableDateTime51.toMutableDateTime(chronology63);
        org.joda.time.DateTime dateTime65 = mutableDateTime45.toDateTime(chronology63);
        boolean boolean66 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime45);
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime45.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime68.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration70 = null;
        mutableDateTime68.add(readableDuration70);
        java.lang.Object obj72 = null;
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(obj72, chronology73);
        org.joda.time.Instant instant75 = mutableDateTime74.toInstant();
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime74.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime77 = property76.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = property76.getFieldType();
        mutableDateTime68.set(dateTimeFieldType78, 1);
        boolean boolean81 = mutableDateTime45.isSupported(dateTimeFieldType78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime51 and instant75", (mutableDateTime51.compareTo(instant75) == 0) == mutableDateTime51.equals(instant75));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime2.setZone(dateTimeZone4);
        int int6 = mutableDateTime2.getMinuteOfHour();
        mutableDateTime2.setTime((int) (byte) 1, 7, (int) (short) 1, 4);
        int int12 = mutableDateTime2.getRoundingMode();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        mutableDateTime15.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.dayOfWeek();
        org.joda.time.DurationField durationField21 = property20.getLeapDurationField();
        long long22 = property20.remainder();
        int int23 = property20.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime24 = property20.getMutableDateTime();
        boolean boolean26 = mutableDateTime24.isAfter((long) 59);
        boolean boolean27 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime24);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        mutableDateTime31.setZone(dateTimeZone33);
        int int35 = mutableDateTime31.getMinuteOfHour();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        int int41 = mutableDateTime38.getYearOfCentury();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(chronology42);
        mutableDateTime31.setChronology(chronology42);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(6387311L, chronology42);
        org.joda.time.DateTime dateTime46 = mutableDateTime2.toDateTime(chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime31", (instant16.compareTo(mutableDateTime31) == 0) == instant16.equals(mutableDateTime31));
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
        mutableDateTime2.addSeconds(0);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime7", (instant3.compareTo(mutableDateTime7) == 0) == instant3.equals(mutableDateTime7));
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        mutableDateTime18.setZone(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime18.getZone();
        int int23 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        mutableDateTime8.addDays(70);
        mutableDateTime8.addWeeks(1970);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property8.getAsShortText(locale13);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.dayOfWeek();
        int int24 = property23.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime26 = property23.addWrapField(0);
        java.util.GregorianCalendar gregorianCalendar27 = mutableDateTime26.toGregorianCalendar();
        boolean boolean28 = property8.equals((java.lang.Object) mutableDateTime26);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime26.copy();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.Instant instant33 = mutableDateTime32.toInstant();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime32.monthOfYear();
        mutableDateTime32.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.secondOfMinute();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime43 = property41.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime45 = property41.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField46 = property41.getField();
        mutableDateTime32.setRounding(dateTimeField46, 2);
        mutableDateTime26.setRounding(dateTimeField46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime29 and instant33", (mutableDateTime29.compareTo(instant33) == 0) == mutableDateTime29.equals(instant33));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime2.setZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime2.getZone();
        int int7 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfDay();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        mutableDateTime11.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.dayOfWeek();
        org.joda.time.DurationField durationField17 = property16.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property16.getFieldType();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.property(dateTimeFieldType18);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 'a');
        int int22 = mutableDateTime21.getDayOfWeek();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        int int30 = mutableDateTime25.getWeekOfWeekyear();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.DateTime dateTime35 = mutableDateTime25.toDateTime(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        boolean boolean38 = mutableDateTime21.isAfter((org.joda.time.ReadableInstant) mutableDateTime37);
        mutableDateTime37.setDayOfMonth((int) (byte) 10);
        int int41 = property19.compareTo((org.joda.time.ReadableInstant) mutableDateTime37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant12", (mutableDateTime2.compareTo(instant12) == 0) == mutableDateTime2.equals(instant12));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        mutableDateTime2.setSecondOfMinute((int) (byte) 10);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        mutableDateTime12.setZone(dateTimeZone14);
        int int16 = mutableDateTime12.getMinuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime12.add(readablePeriod17, (int) (short) 10);
        org.joda.time.Chronology chronology20 = mutableDateTime12.getChronology();
        mutableDateTime2.setChronology(chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        mutableDateTime18.setZone(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime18.getZone();
        int int23 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        mutableDateTime8.addDays(70);
        mutableDateTime8.setTime((long) 365);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.secondOfMinute();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.dayOfWeek();
        boolean boolean26 = mutableDateTime16.isAfter((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.ReadableDuration readableDuration27 = null;
        mutableDateTime19.add(readableDuration27, 4);
        int int30 = property10.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        mutableDateTime33.setHourOfDay(2);
        java.lang.Object obj38 = mutableDateTime33.clone();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime33.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime33.copy();
        int int41 = property10.compareTo((org.joda.time.ReadableInstant) mutableDateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and mutableDateTime19", (instant14.compareTo(mutableDateTime19) == 0) == instant14.equals(mutableDateTime19));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfWeek();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        int int8 = mutableDateTime5.getYearOfCentury();
        org.joda.time.Chronology chronology9 = mutableDateTime5.getChronology();
        int int10 = mutableDateTime5.getWeekOfWeekyear();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTime dateTime15 = mutableDateTime5.toDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        boolean boolean18 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        java.lang.Object obj19 = mutableDateTime17.clone();
        mutableDateTime17.addDays(18331);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.monthOfYear();
        mutableDateTime24.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = property29.getField();
        mutableDateTime17.setRounding(dateTimeField30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant25", (mutableDateTime5.compareTo(instant25) == 0) == mutableDateTime5.equals(instant25));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        int int10 = property7.get();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.dayOfWeek();
        int int20 = property19.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.addWrapField(0);
        long long23 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime22);
        boolean boolean25 = mutableDateTime22.isBefore((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime28.setSecondOfDay(54);
        boolean boolean31 = mutableDateTime22.isEqual((org.joda.time.ReadableInstant) mutableDateTime28);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime34.add(readablePeriod37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.hourOfDay();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime34.dayOfWeek();
        java.lang.String str41 = mutableDateTime34.toString();
        mutableDateTime34.setMillisOfSecond((int) (short) 10);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime34.yearOfCentury();
        mutableDateTime34.setMinuteOfDay((int) 'a');
        mutableDateTime34.setSecondOfDay((int) (short) 1);
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.Instant instant52 = mutableDateTime51.toInstant();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime51.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime54 = property53.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime55 = property53.roundFloor();
        int int56 = property53.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime57 = property53.getMutableDateTime();
        org.joda.time.DateTimeField dateTimeField58 = property53.getField();
        mutableDateTime34.setRounding(dateTimeField58);
        mutableDateTime28.setRounding(dateTimeField58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant52", (mutableDateTime13.compareTo(instant52) == 0) == mutableDateTime13.equals(instant52));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime8.toString(dateTimeFormatter13);
        int int15 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime8.toMutableDateTimeISO();
        int int17 = mutableDateTime16.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        int int10 = property7.getLeapAmount();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.yearOfCentury();
        java.lang.String str19 = property18.toString();
        org.joda.time.DurationField durationField20 = property18.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime21 = property18.roundFloor();
        boolean boolean22 = property7.equals((java.lang.Object) mutableDateTime21);
        int int23 = mutableDateTime21.getDayOfMonth();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology30);
        mutableDateTime31.addWeekyears((int) (byte) 1);
        boolean boolean34 = mutableDateTime21.isBefore((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime21.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and mutableDateTime26", (instant14.compareTo(mutableDateTime26) == 0) == instant14.equals(mutableDateTime26));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:01.767Z");
        mutableDateTime2.addWeeks((int) (byte) 0);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        mutableDateTime7.setZone(dateTimeZone9);
        int int11 = mutableDateTime7.getMinuteOfHour();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        mutableDateTime7.setChronology(chronology18);
        org.joda.time.DateTime dateTime21 = mutableDateTime2.toDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:47:05.570Z", chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime21", (mutableDateTime2.compareTo(dateTime21) == 0) == mutableDateTime2.equals(dateTime21));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfWeek();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        int int8 = mutableDateTime5.getYearOfCentury();
        org.joda.time.Chronology chronology9 = mutableDateTime5.getChronology();
        int int10 = mutableDateTime5.getWeekOfWeekyear();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTime dateTime15 = mutableDateTime5.toDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        boolean boolean18 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime17.setMinuteOfDay(45);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime17.toMutableDateTimeISO();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant30 = null;
        mutableDateTime24.setDate(readableInstant30);
        mutableDateTime24.setMinuteOfDay(4);
        int int34 = mutableDateTime24.getMonthOfYear();
        mutableDateTime24.setMinuteOfHour((int) '#');
        boolean boolean37 = mutableDateTime24.isEqualNow();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.Instant instant41 = mutableDateTime40.toInstant();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime40.monthOfYear();
        mutableDateTime40.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField46 = property45.getField();
        mutableDateTime24.setRounding(dateTimeField46);
        int int48 = mutableDateTime17.get(dateTimeField46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant41", (mutableDateTime5.compareTo(instant41) == 0) == mutableDateTime5.equals(instant41));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime15 = property11.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField16 = property11.getField();
        mutableDateTime2.setRounding(dateTimeField16, 2);
        mutableDateTime2.setMinuteOfDay(49);
        mutableDateTime2.setTime(10L);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime2.weekyear();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime26.toString(dateTimeFormatter31);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime26.copy();
        int int34 = mutableDateTime26.getWeekyear();
        int int35 = property23.compareTo((org.joda.time.ReadableInstant) mutableDateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime33", (instant3.compareTo(mutableDateTime33) == 0) == instant3.equals(mutableDateTime33));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.toMutableDateTimeISO();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.monthOfYear();
        mutableDateTime7.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.dayOfWeek();
        org.joda.time.Instant instant13 = mutableDateTime7.toInstant();
        mutableDateTime7.setSecondOfMinute(46);
        boolean boolean16 = mutableDateTime4.isAfter((org.joda.time.ReadableInstant) mutableDateTime7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant8", (mutableDateTime2.compareTo(instant8) == 0) == mutableDateTime2.equals(instant8));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        mutableDateTime18.setZone(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime18.getZone();
        int int23 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime8.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.addYears((int) (short) 10);
        int int4 = mutableDateTime1.getMonthOfYear();
        boolean boolean5 = mutableDateTime1.isAfterNow();
        int int6 = mutableDateTime1.getSecondOfDay();
        java.util.GregorianCalendar gregorianCalendar7 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime8", (mutableDateTime1.compareTo(mutableDateTime8) == 0) == mutableDateTime1.equals(mutableDateTime8));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:08.366Z");
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 'a');
        int int5 = mutableDateTime4.getDayOfWeek();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        int int13 = mutableDateTime8.getWeekOfWeekyear();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.DateTime dateTime18 = mutableDateTime8.toDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        boolean boolean21 = mutableDateTime4.isAfter((org.joda.time.ReadableInstant) mutableDateTime20);
        int int22 = mutableDateTime20.getDayOfMonth();
        java.lang.Object obj23 = mutableDateTime20.clone();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime20.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.addWrapField(3);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(1606265154146L);
        boolean boolean29 = mutableDateTime26.isBefore((org.joda.time.ReadableInstant) mutableDateTime28);
        boolean boolean30 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology32);
        mutableDateTime33.addMillis((int) 'a');
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime41 = property39.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime43 = property39.addWrapField((int) 'a');
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableDateTime46.add(readablePeriod49);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.hourOfDay();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime46.dayOfWeek();
        mutableDateTime46.add((long) (short) -1);
        boolean boolean55 = property39.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime57 = property39.add((int) '#');
        org.joda.time.MutableDateTime mutableDateTime58 = property39.roundHalfFloor();
        java.util.Locale locale59 = null;
        java.util.Calendar calendar60 = mutableDateTime58.toCalendar(locale59);
        boolean boolean61 = mutableDateTime33.isBefore((org.joda.time.ReadableInstant) mutableDateTime58);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology63);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime64.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime67 = property65.add((long) (short) -1);
        mutableDateTime67.setWeekOfWeekyear(53);
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime67.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime71 = property70.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime72 = property70.getMutableDateTime();
        boolean boolean73 = mutableDateTime72.isAfterNow();
        java.lang.Object obj74 = null;
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(obj74, chronology75);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = null;
        java.lang.String str78 = mutableDateTime76.toString(dateTimeFormatter77);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        mutableDateTime76.add(readablePeriod79);
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime76.hourOfDay();
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime76.dayOfWeek();
        org.joda.time.MutableDateTime.Property property83 = mutableDateTime76.secondOfDay();
        org.joda.time.MutableDateTime.Property property84 = mutableDateTime76.monthOfYear();
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.MutableDateTime mutableDateTime87 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology86);
        mutableDateTime87.addMillis((int) 'a');
        int int90 = mutableDateTime87.getDayOfYear();
        boolean boolean91 = mutableDateTime87.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone92 = mutableDateTime87.getZone();
        mutableDateTime76.setZoneRetainFields(dateTimeZone92);
        mutableDateTime72.setZone(dateTimeZone92);
        mutableDateTime33.setZoneRetainFields(dateTimeZone92);
        org.joda.time.MutableDateTime mutableDateTime96 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime1, dateTimeZone92);
        int int97 = mutableDateTime1.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime96", (mutableDateTime2.compareTo(mutableDateTime96) == 0) == mutableDateTime2.equals(mutableDateTime96));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:03.895Z");
        mutableDateTime2.setDayOfWeek(2);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.hourOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.dayOfWeek();
        int int14 = property13.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime16 = property13.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime17 = property13.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime18 = property13.getMutableDateTime();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant28 = null;
        mutableDateTime22.setDate(readableInstant28);
        mutableDateTime22.setMinuteOfDay(4);
        int int32 = mutableDateTime22.getMonthOfYear();
        mutableDateTime22.setMinuteOfHour((int) '#');
        boolean boolean35 = mutableDateTime22.isEqualNow();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone41);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        int int49 = mutableDateTime46.getYearOfCentury();
        org.joda.time.Chronology chronology50 = mutableDateTime46.getChronology();
        int int51 = mutableDateTime46.getWeekOfWeekyear();
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = null;
        java.lang.String str56 = mutableDateTime54.toString(dateTimeFormatter55);
        int int57 = mutableDateTime54.getYearOfCentury();
        org.joda.time.Chronology chronology58 = mutableDateTime54.getChronology();
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime46.toMutableDateTime(chronology58);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(chronology58);
        mutableDateTime43.setChronology(chronology58);
        org.joda.time.DateTime dateTime62 = mutableDateTime22.toDateTime(chronology58);
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:28.134Z", chronology58);
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime18, chronology58);
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime2.toMutableDateTime(chronology58);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(6359571L, chronology58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime65", (mutableDateTime2.compareTo(mutableDateTime65) == 0) == mutableDateTime2.equals(mutableDateTime65));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.lang.Object obj0 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:01.767Z");
        mutableDateTime2.addWeeks((int) (byte) 0);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        mutableDateTime7.setZone(dateTimeZone9);
        int int11 = mutableDateTime7.getMinuteOfHour();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        mutableDateTime7.setChronology(chronology18);
        org.joda.time.DateTime dateTime21 = mutableDateTime2.toDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj0, chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime21", (mutableDateTime2.compareTo(dateTime21) == 0) == mutableDateTime2.equals(dateTime21));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        java.lang.String str8 = property7.toString();
        org.joda.time.DurationField durationField9 = property7.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property7.roundHalfEven();
        mutableDateTime11.setMillisOfSecond(25);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        mutableDateTime16.setZone(dateTimeZone18);
        int int20 = mutableDateTime16.getMinuteOfHour();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        int int26 = mutableDateTime23.getYearOfCentury();
        org.joda.time.Chronology chronology27 = mutableDateTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(chronology27);
        mutableDateTime16.setChronology(chronology27);
        org.joda.time.DateTime dateTime30 = mutableDateTime11.toDateTime(chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
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
        int int5 = property4.getLeapAmount();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        mutableDateTime10.add((long) (short) -1);
        boolean boolean19 = property3.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime21 = property3.add((int) '#');
        org.joda.time.MutableDateTime mutableDateTime22 = property3.roundFloor();
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime22 and instant23", (mutableDateTime22.compareTo(instant23) == 0) == mutableDateTime22.equals(instant23));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        java.util.Date date6 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 'a');
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.millisOfSecond();
        boolean boolean10 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime8);
        java.util.Date date11 = mutableDateTime2.toDate();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        int int19 = mutableDateTime14.getWeekOfWeekyear();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.DateTime dateTime24 = mutableDateTime14.toDateTime(dateTimeZone23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = dateTime24.isSupported(dateTimeFieldType25);
        int int27 = dateTime24.getSecondOfMinute();
        int int28 = dateTime24.getYearOfEra();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime24);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) dateTime24);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        mutableDateTime33.setZone(dateTimeZone35);
        int int37 = mutableDateTime33.getMinuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime33.add(readablePeriod38, (int) (short) 10);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.Instant instant44 = mutableDateTime43.toInstant();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime43.monthOfYear();
        mutableDateTime43.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.secondOfMinute();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime51.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime54 = property52.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime56 = property52.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField57 = property52.getField();
        mutableDateTime43.setRounding(dateTimeField57, 2);
        mutableDateTime33.setRounding(dateTimeField57);
        int int61 = dateTime24.get(dateTimeField57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant44", (mutableDateTime2.compareTo(instant44) == 0) == mutableDateTime2.equals(instant44));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        int int10 = property7.get();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.dayOfWeek();
        int int20 = property19.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.addWrapField(0);
        long long23 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime22);
        boolean boolean25 = mutableDateTime22.isBefore((long) (byte) 10);
        org.joda.time.DateTime dateTime26 = mutableDateTime22.toDateTimeISO();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.hourOfDay();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime29.dayOfWeek();
        int int36 = property35.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime38 = property35.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime39 = property35.roundHalfEven();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        int int45 = mutableDateTime42.getYearOfCentury();
        org.joda.time.Chronology chronology46 = mutableDateTime42.getChronology();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(chronology46);
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime39.toMutableDateTime(chronology46);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime22.toMutableDateTime(chronology46);
        mutableDateTime22.setYear(45);
        int int52 = mutableDateTime22.getWeekyear();
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.Instant instant56 = mutableDateTime55.toInstant();
        mutableDateTime55.setDate((long) 10);
        int int59 = mutableDateTime55.getCenturyOfEra();
        boolean boolean61 = mutableDateTime55.isBefore((long) (short) -1);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime55.minuteOfDay();
        int int63 = mutableDateTime22.compareTo((org.joda.time.ReadableInstant) mutableDateTime55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant56", (dateTime26.compareTo(instant56) == 0) == dateTime26.equals(instant56));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime9.toString(dateTimeFormatter14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime9.copy();
        int int17 = mutableDateTime9.getWeekyear();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) mutableDateTime9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        mutableDateTime8.setSecondOfDay((int) '#');
        mutableDateTime8.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int17 = mutableDateTime8.getHourOfDay();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime8);
        mutableDateTime2.setMillisOfDay(23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime2.toString(dateTimeFormatter21);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.hourOfDay();
        mutableDateTime25.setDayOfWeek(3);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = property36.add((long) (short) -1);
        mutableDateTime38.setWeekOfWeekyear(53);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime46 = property44.add((long) (short) -1);
        mutableDateTime46.setWeekOfWeekyear(53);
        mutableDateTime38.setTime((org.joda.time.ReadableInstant) mutableDateTime46);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.Instant instant53 = mutableDateTime52.toInstant();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime52.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime55 = property54.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property54.getFieldType();
        int int57 = mutableDateTime46.get(dateTimeFieldType56);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime58.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration60 = null;
        mutableDateTime58.add(readableDuration60);
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.Instant instant65 = mutableDateTime64.toInstant();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime64.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime67 = property66.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = property66.getFieldType();
        mutableDateTime58.set(dateTimeFieldType68, 1);
        boolean boolean71 = mutableDateTime46.isSupported(dateTimeFieldType68);
        int int72 = mutableDateTime25.get(dateTimeFieldType68);
        int int73 = mutableDateTime2.get(dateTimeFieldType68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime25", (instant3.compareTo(mutableDateTime25) == 0) == instant3.equals(mutableDateTime25));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime6 = property3.roundCeiling();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        mutableDateTime6.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        mutableDateTime6.setYear(46);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime18.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime18.dayOfMonth();
        mutableDateTime18.setSecondOfDay(259);
        int int24 = mutableDateTime6.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime20", (instant10.compareTo(mutableDateTime20) == 0) == instant10.equals(mutableDateTime20));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addDays(0);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        mutableDateTime8.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.secondOfMinute();
        mutableDateTime8.setSecondOfMinute((int) (byte) 10);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        int int23 = mutableDateTime8.get(dateTimeFieldType22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime2.property(dateTimeFieldType22);
        int int25 = property24.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant9", (mutableDateTime2.compareTo(instant9) == 0) == mutableDateTime2.equals(instant9));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime2.setZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime2.getZone();
        int int7 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfDay();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        mutableDateTime11.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.dayOfWeek();
        org.joda.time.DurationField durationField17 = property16.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property16.getFieldType();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.property(dateTimeFieldType18);
        int int20 = property19.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant12", (mutableDateTime2.compareTo(instant12) == 0) == mutableDateTime2.equals(instant12));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.add((int) (short) 10);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.DateTime dateTime19 = mutableDateTime9.toDateTime(chronology16);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setHourOfDay(2);
        java.lang.Object obj7 = mutableDateTime2.clone();
        mutableDateTime2.setWeekyear(999);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        mutableDateTime12.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.secondOfMinute();
        int int18 = property17.getMaximumValue();
        int int19 = property17.get();
        org.joda.time.MutableDateTime mutableDateTime20 = property17.roundHalfCeiling();
        int int21 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.hourOfDay();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime24.dayOfWeek();
        mutableDateTime24.add((long) (short) -1);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime24.secondOfDay();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime39 = property37.add((long) (short) -1);
        mutableDateTime39.setWeekOfWeekyear(53);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime39.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime43 = property42.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime44 = property42.getMutableDateTime();
        boolean boolean45 = mutableDateTime44.isAfterNow();
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = null;
        java.lang.String str50 = mutableDateTime48.toString(dateTimeFormatter49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        mutableDateTime48.add(readablePeriod51);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime48.hourOfDay();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime48.dayOfWeek();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime48.secondOfDay();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime48.monthOfYear();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology58);
        mutableDateTime59.addMillis((int) 'a');
        int int62 = mutableDateTime59.getDayOfYear();
        boolean boolean63 = mutableDateTime59.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone64 = mutableDateTime59.getZone();
        mutableDateTime48.setZoneRetainFields(dateTimeZone64);
        mutableDateTime44.setZone(dateTimeZone64);
        mutableDateTime24.setZone(dateTimeZone64);
        mutableDateTime20.setTime((org.joda.time.ReadableInstant) mutableDateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime48", (instant13.compareTo(mutableDateTime48) == 0) == instant13.equals(mutableDateTime48));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfWeek();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        int int8 = mutableDateTime5.getYearOfCentury();
        org.joda.time.Chronology chronology9 = mutableDateTime5.getChronology();
        int int10 = mutableDateTime5.getWeekOfWeekyear();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTime dateTime15 = mutableDateTime5.toDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        boolean boolean18 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        int int19 = mutableDateTime17.getDayOfMonth();
        java.lang.Object obj20 = mutableDateTime17.clone();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.addWrapField(3);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(1606265154146L);
        boolean boolean26 = mutableDateTime23.isBefore((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime32 = property30.add((long) (short) -1);
        mutableDateTime32.setWeekOfWeekyear(53);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime37.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.add((long) (short) -1);
        mutableDateTime40.setWeekOfWeekyear(53);
        mutableDateTime32.setTime((org.joda.time.ReadableInstant) mutableDateTime40);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.Instant instant47 = mutableDateTime46.toInstant();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime46.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime49 = property48.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property48.getFieldType();
        int int51 = mutableDateTime40.get(dateTimeFieldType50);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration54 = null;
        mutableDateTime52.add(readableDuration54);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.Instant instant59 = mutableDateTime58.toInstant();
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime58.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime61 = property60.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = property60.getFieldType();
        mutableDateTime52.set(dateTimeFieldType62, 1);
        boolean boolean65 = mutableDateTime40.isSupported(dateTimeFieldType62);
        boolean boolean66 = mutableDateTime25.isSupported(dateTimeFieldType62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant47", (mutableDateTime13.compareTo(instant47) == 0) == mutableDateTime13.equals(instant47));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.add((int) (short) 10);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.DateTime dateTime19 = mutableDateTime9.toDateTime(chronology16);
        java.util.GregorianCalendar gregorianCalendar20 = dateTime19.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime2.setZone(dateTimeZone4);
        int int6 = mutableDateTime2.getMinuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime2.add(readablePeriod7, (int) (short) 10);
        org.joda.time.Chronology chronology10 = mutableDateTime2.getChronology();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        int int14 = mutableDateTime13.getDayOfWeek();
        boolean boolean15 = mutableDateTime13.isAfterNow();
        int int16 = mutableDateTime13.getRoundingMode();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutableDateTime17.add(readableDuration19);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        mutableDateTime17.set(dateTimeFieldType27, 1);
        boolean boolean30 = mutableDateTime13.isSupported(dateTimeFieldType27);
        int int31 = mutableDateTime2.get(dateTimeFieldType27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant24", (mutableDateTime13.compareTo(instant24) == 0) == mutableDateTime13.equals(instant24));
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
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.dayOfWeek();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfFloor();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.addMillis((int) 'a');
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = property18.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime22 = property18.addWrapField((int) 'a');
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.hourOfDay();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime25.dayOfWeek();
        mutableDateTime25.add((long) (short) -1);
        boolean boolean34 = property18.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime36 = property18.add((int) '#');
        org.joda.time.MutableDateTime mutableDateTime37 = property18.roundHalfFloor();
        java.util.Locale locale38 = null;
        java.util.Calendar calendar39 = mutableDateTime37.toCalendar(locale38);
        boolean boolean40 = mutableDateTime12.isBefore((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime46 = property44.add((long) (short) -1);
        mutableDateTime46.setWeekOfWeekyear(53);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime46.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime50 = property49.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime51 = property49.getMutableDateTime();
        boolean boolean52 = mutableDateTime51.isAfterNow();
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = null;
        java.lang.String str57 = mutableDateTime55.toString(dateTimeFormatter56);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        mutableDateTime55.add(readablePeriod58);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime55.hourOfDay();
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime55.dayOfWeek();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime55.secondOfDay();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime55.monthOfYear();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology65);
        mutableDateTime66.addMillis((int) 'a');
        int int69 = mutableDateTime66.getDayOfYear();
        boolean boolean70 = mutableDateTime66.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone71 = mutableDateTime66.getZone();
        mutableDateTime55.setZoneRetainFields(dateTimeZone71);
        mutableDateTime51.setZone(dateTimeZone71);
        mutableDateTime12.setZoneRetainFields(dateTimeZone71);
        org.joda.time.DateTime dateTime75 = mutableDateTime9.toDateTime(dateTimeZone71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime55", (instant3.compareTo(mutableDateTime55) == 0) == instant3.equals(mutableDateTime55));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        mutableDateTime2.setSecondOfMinute((int) (byte) 10);
        long long10 = mutableDateTime2.getMillis();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.monthOfYear();
        int int12 = mutableDateTime2.getDayOfWeek();
        boolean boolean13 = mutableDateTime2.isEqualNow();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        mutableDateTime16.addMillis((int) 'a');
        int int19 = mutableDateTime16.getDayOfYear();
        java.util.Date date20 = mutableDateTime16.toDate();
        long long21 = mutableDateTime16.getMillis();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        int int27 = mutableDateTime24.getYearOfCentury();
        org.joda.time.Chronology chronology28 = mutableDateTime24.getChronology();
        int int29 = mutableDateTime24.getWeekOfWeekyear();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        org.joda.time.DateTime dateTime34 = mutableDateTime24.toDateTime(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(dateTimeZone33);
        mutableDateTime16.setZoneRetainFields(dateTimeZone33);
        boolean boolean37 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundFloor();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        mutableDateTime11.addMillis((int) 'a');
        int int14 = mutableDateTime11.getDayOfYear();
        boolean boolean15 = mutableDateTime8.isAfter((org.joda.time.ReadableInstant) mutableDateTime11);
        boolean boolean17 = mutableDateTime11.equals((java.lang.Object) "2020-11-25T01:45:41.539Z");
        int int18 = mutableDateTime11.getMonthOfYear();
        boolean boolean19 = mutableDateTime11.isBeforeNow();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        mutableDateTime22.setHourOfDay(2);
        java.lang.Object obj27 = mutableDateTime22.clone();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.secondOfDay();
        int int29 = mutableDateTime22.getYearOfEra();
        mutableDateTime22.addSeconds(30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime22.millisOfDay();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant41 = null;
        mutableDateTime35.setDate(readableInstant41);
        mutableDateTime35.setMinuteOfDay(4);
        int int45 = mutableDateTime35.getMonthOfYear();
        mutableDateTime35.addWeekyears((int) (short) -1);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology49);
        mutableDateTime50.addMillis((int) 'a');
        int int53 = mutableDateTime50.getDayOfYear();
        boolean boolean54 = mutableDateTime50.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime55.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property56.getFieldType();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime50.property(dateTimeFieldType57);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology60);
        mutableDateTime61.addMillis((int) 'a');
        int int64 = mutableDateTime61.getDayOfYear();
        boolean boolean65 = mutableDateTime61.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone66 = mutableDateTime61.getZone();
        mutableDateTime50.setZoneRetainFields(dateTimeZone66);
        mutableDateTime35.setZoneRetainFields(dateTimeZone66);
        mutableDateTime22.setZone(dateTimeZone66);
        boolean boolean70 = mutableDateTime11.isBefore((org.joda.time.ReadableInstant) mutableDateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime55", (instant3.compareTo(mutableDateTime55) == 0) == instant3.equals(mutableDateTime55));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology8);
        mutableDateTime9.addMillis((int) 'a');
        int int12 = mutableDateTime9.getDayOfYear();
        boolean boolean13 = mutableDateTime9.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime9.property(dateTimeFieldType16);
        mutableDateTime9.add((long) 8);
        boolean boolean20 = mutableDateTime6.isEqual((org.joda.time.ReadableInstant) mutableDateTime9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.add((long) (short) -1);
        mutableDateTime6.setWeekOfWeekyear(53);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property12.add((long) (short) -1);
        mutableDateTime14.setWeekOfWeekyear(53);
        mutableDateTime6.setTime((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime6.centuryOfEra();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        mutableDateTime21.setZone(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime21.getZone();
        mutableDateTime6.setZone(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 21, dateTimeZone25);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        mutableDateTime30.setZone(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime30.getZone();
        int int35 = mutableDateTime30.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime30.minuteOfDay();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.Instant instant40 = mutableDateTime39.toInstant();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime39.monthOfYear();
        mutableDateTime39.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.dayOfWeek();
        org.joda.time.DurationField durationField45 = property44.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property44.getFieldType();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime30.property(dateTimeFieldType46);
        boolean boolean48 = mutableDateTime27.isSupported(dateTimeFieldType46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and instant40", (mutableDateTime21.compareTo(instant40) == 0) == mutableDateTime21.equals(instant40));
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
        int int5 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime2.add(readablePeriod6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime15 = property11.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField16 = property11.getField();
        mutableDateTime2.setRounding(dateTimeField16, 2);
        mutableDateTime2.addWeekyears((int) 'a');
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime2.yearOfEra();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        int int27 = mutableDateTime24.getYearOfCentury();
        org.joda.time.Chronology chronology28 = mutableDateTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime24.toMutableDateTimeISO();
        mutableDateTime29.setSecondOfDay(53);
        int int32 = mutableDateTime29.getEra();
        org.joda.time.DateTime dateTime33 = mutableDateTime29.toDateTime();
        int int34 = property21.getDifference((org.joda.time.ReadableInstant) dateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        mutableDateTime5.setTime((long) 6467);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        mutableDateTime11.setMillisOfDay((int) '#');
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        int int22 = mutableDateTime17.getWeekOfWeekyear();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.DateTime dateTime27 = mutableDateTime17.toDateTime(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone26);
        mutableDateTime11.setZoneRetainFields(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        mutableDateTime11.setZone(dateTimeZone33);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.Instant instant38 = mutableDateTime37.toInstant();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime37.monthOfYear();
        mutableDateTime37.addSeconds(0);
        int int42 = mutableDateTime37.getDayOfMonth();
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        mutableDateTime45.add(readablePeriod48);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.hourOfDay();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime45.dayOfWeek();
        int int52 = property51.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime54 = property51.addWrapField(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property51.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime56 = property51.roundHalfFloor();
        mutableDateTime37.setMillis((org.joda.time.ReadableInstant) mutableDateTime56);
        mutableDateTime11.setTime((org.joda.time.ReadableInstant) mutableDateTime56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and instant38", (mutableDateTime17.compareTo(instant38) == 0) == mutableDateTime17.equals(instant38));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        int int10 = property7.getLeapAmount();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.yearOfCentury();
        java.lang.String str19 = property18.toString();
        org.joda.time.DurationField durationField20 = property18.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime21 = property18.roundFloor();
        boolean boolean22 = property7.equals((java.lang.Object) mutableDateTime21);
        int int23 = mutableDateTime21.getDayOfMonth();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology30);
        mutableDateTime31.addWeekyears((int) (byte) 1);
        boolean boolean34 = mutableDateTime21.isBefore((org.joda.time.ReadableInstant) mutableDateTime31);
        java.util.Date date35 = mutableDateTime21.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and mutableDateTime26", (instant14.compareTo(mutableDateTime26) == 0) == instant14.equals(mutableDateTime26));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addDays(0);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        mutableDateTime8.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.secondOfMinute();
        mutableDateTime8.setSecondOfMinute((int) (byte) 10);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        int int23 = mutableDateTime8.get(dateTimeFieldType22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime2.property(dateTimeFieldType22);
        org.joda.time.DurationField durationField25 = property24.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant9", (mutableDateTime2.compareTo(instant9) == 0) == mutableDateTime2.equals(instant9));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        mutableDateTime5.setWeekOfWeekyear(53);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) (short) -1);
        mutableDateTime13.setWeekOfWeekyear(53);
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) mutableDateTime13);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property21.getFieldType();
        int int24 = mutableDateTime13.get(dateTimeFieldType23);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone30);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        int int38 = mutableDateTime35.getYearOfCentury();
        org.joda.time.Chronology chronology39 = mutableDateTime35.getChronology();
        int int40 = mutableDateTime35.getWeekOfWeekyear();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        int int46 = mutableDateTime43.getYearOfCentury();
        org.joda.time.Chronology chronology47 = mutableDateTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime35.toMutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(chronology47);
        mutableDateTime32.setChronology(chronology47);
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.now(chronology47);
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(chronology47);
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime13.toMutableDateTime(chronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and mutableDateTime29", (instant20.compareTo(mutableDateTime29) == 0) == instant20.equals(mutableDateTime29));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone5);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.Instant instant11 = mutableDateTime9.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant10", (mutableDateTime8.compareTo(instant10) == 0) == mutableDateTime8.equals(instant10));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:08.366Z");
        org.joda.time.MutableDateTime mutableDateTime2 = mutableDateTime1.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 'a');
        int int5 = mutableDateTime4.getDayOfWeek();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        int int13 = mutableDateTime8.getWeekOfWeekyear();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.DateTime dateTime18 = mutableDateTime8.toDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        boolean boolean21 = mutableDateTime4.isAfter((org.joda.time.ReadableInstant) mutableDateTime20);
        int int22 = mutableDateTime20.getDayOfMonth();
        java.lang.Object obj23 = mutableDateTime20.clone();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime20.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.addWrapField(3);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(1606265154146L);
        boolean boolean29 = mutableDateTime26.isBefore((org.joda.time.ReadableInstant) mutableDateTime28);
        boolean boolean30 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology32);
        mutableDateTime33.addMillis((int) 'a');
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime41 = property39.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime43 = property39.addWrapField((int) 'a');
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableDateTime46.add(readablePeriod49);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.hourOfDay();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime46.dayOfWeek();
        mutableDateTime46.add((long) (short) -1);
        boolean boolean55 = property39.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime57 = property39.add((int) '#');
        org.joda.time.MutableDateTime mutableDateTime58 = property39.roundHalfFloor();
        java.util.Locale locale59 = null;
        java.util.Calendar calendar60 = mutableDateTime58.toCalendar(locale59);
        boolean boolean61 = mutableDateTime33.isBefore((org.joda.time.ReadableInstant) mutableDateTime58);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology63);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime64.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime67 = property65.add((long) (short) -1);
        mutableDateTime67.setWeekOfWeekyear(53);
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime67.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime71 = property70.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime72 = property70.getMutableDateTime();
        boolean boolean73 = mutableDateTime72.isAfterNow();
        java.lang.Object obj74 = null;
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(obj74, chronology75);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = null;
        java.lang.String str78 = mutableDateTime76.toString(dateTimeFormatter77);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        mutableDateTime76.add(readablePeriod79);
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime76.hourOfDay();
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime76.dayOfWeek();
        org.joda.time.MutableDateTime.Property property83 = mutableDateTime76.secondOfDay();
        org.joda.time.MutableDateTime.Property property84 = mutableDateTime76.monthOfYear();
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.MutableDateTime mutableDateTime87 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology86);
        mutableDateTime87.addMillis((int) 'a');
        int int90 = mutableDateTime87.getDayOfYear();
        boolean boolean91 = mutableDateTime87.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone92 = mutableDateTime87.getZone();
        mutableDateTime76.setZoneRetainFields(dateTimeZone92);
        mutableDateTime72.setZone(dateTimeZone92);
        mutableDateTime33.setZoneRetainFields(dateTimeZone92);
        org.joda.time.MutableDateTime mutableDateTime96 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime1, dateTimeZone92);
        int int97 = mutableDateTime1.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime96", (mutableDateTime2.compareTo(mutableDateTime96) == 0) == mutableDateTime2.equals(mutableDateTime96));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.addYears((int) (short) 10);
        int int4 = mutableDateTime1.getMonthOfYear();
        boolean boolean5 = mutableDateTime1.isAfterNow();
        int int6 = mutableDateTime1.getSecondOfDay();
        java.util.GregorianCalendar gregorianCalendar7 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.centuryOfEra();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = mutableDateTime16.getRoundingField();
        mutableDateTime16.addMonths(292278993);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology21);
        mutableDateTime22.addMillis((int) 'a');
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime30 = property28.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime32 = property28.addWrapField((int) 'a');
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.hourOfDay();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime35.dayOfWeek();
        mutableDateTime35.add((long) (short) -1);
        boolean boolean44 = property28.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime46 = property28.add((int) '#');
        org.joda.time.MutableDateTime mutableDateTime47 = property28.roundHalfFloor();
        java.util.Locale locale48 = null;
        java.util.Calendar calendar49 = mutableDateTime47.toCalendar(locale48);
        boolean boolean50 = mutableDateTime22.isBefore((org.joda.time.ReadableInstant) mutableDateTime47);
        boolean boolean51 = mutableDateTime16.isEqual((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime16.secondOfMinute();
        boolean boolean53 = property10.equals((java.lang.Object) mutableDateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime8", (mutableDateTime1.compareTo(mutableDateTime8) == 0) == mutableDateTime1.equals(mutableDateTime8));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        mutableDateTime2.setSecondOfMinute((int) (byte) 10);
        mutableDateTime2.addWeekyears(1);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:03.895Z");
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        mutableDateTime16.setHourOfDay(2);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone26);
        mutableDateTime16.setZone(dateTimeZone26);
        mutableDateTime13.setZone(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime2.toMutableDateTime(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime25", (instant3.compareTo(mutableDateTime25) == 0) == instant3.equals(mutableDateTime25));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.addYears((int) (short) 10);
        mutableDateTime1.setDate(10L);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.addWrapField((int) (short) 10);
        mutableDateTime16.addWeeks(30);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant27 = null;
        mutableDateTime21.setDate(readableInstant27);
        mutableDateTime21.setMinuteOfDay(4);
        int int31 = mutableDateTime21.getMonthOfYear();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.Instant instant35 = mutableDateTime34.toInstant();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime34.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime37 = property36.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property36.getFieldType();
        int int39 = mutableDateTime21.get(dateTimeFieldType38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime16.property(dateTimeFieldType38);
        int int41 = property40.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime43 = property40.addWrapField(132);
        boolean boolean44 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime43);
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        mutableDateTime47.setHourOfDay(2);
        java.lang.Object obj52 = mutableDateTime47.clone();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime47.secondOfDay();
        int int54 = mutableDateTime47.getYearOfEra();
        mutableDateTime47.setSecondOfDay(70);
        java.lang.Object obj57 = null;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(obj57, chronology58);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = null;
        java.lang.String str61 = mutableDateTime59.toString(dateTimeFormatter60);
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        mutableDateTime59.add(readablePeriod62);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime59.hourOfDay();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime59.dayOfWeek();
        int int66 = property65.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime68 = property65.addWrapField(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = property65.getFieldType();
        int int70 = mutableDateTime47.get(dateTimeFieldType69);
        int int71 = mutableDateTime1.get(dateTimeFieldType69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant35 and mutableDateTime59", (instant35.compareTo(mutableDateTime59) == 0) == instant35.equals(mutableDateTime59));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property8.getAsShortText(locale13);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.dayOfWeek();
        int int24 = property23.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime26 = property23.addWrapField(0);
        java.util.GregorianCalendar gregorianCalendar27 = mutableDateTime26.toGregorianCalendar();
        boolean boolean28 = property8.equals((java.lang.Object) mutableDateTime26);
        org.joda.time.DateTimeField dateTimeField29 = property8.getField();
        org.joda.time.MutableDateTime mutableDateTime30 = property8.roundHalfEven();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        mutableDateTime33.setDate((long) 10);
        int int37 = mutableDateTime33.getCenturyOfEra();
        boolean boolean39 = mutableDateTime33.isBefore((long) (short) -1);
        boolean boolean40 = mutableDateTime33.isBeforeNow();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime46 = property44.add((long) (short) -1);
        mutableDateTime46.setWeekOfWeekyear(53);
        boolean boolean49 = mutableDateTime33.equals((java.lang.Object) 53);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology51);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime55 = property53.add((long) (short) -1);
        mutableDateTime55.setWeekOfWeekyear(53);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology59);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime60.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime63 = property61.add((long) (short) -1);
        mutableDateTime63.setWeekOfWeekyear(53);
        mutableDateTime55.setTime((org.joda.time.ReadableInstant) mutableDateTime63);
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.Instant instant70 = mutableDateTime69.toInstant();
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime69.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime72 = property71.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = property71.getFieldType();
        int int74 = mutableDateTime63.get(dateTimeFieldType73);
        mutableDateTime33.setMillis((org.joda.time.ReadableInstant) mutableDateTime63);
        mutableDateTime63.setMillisOfDay(2);
        org.joda.time.Chronology chronology78 = mutableDateTime63.getChronology();
        int int79 = property8.getDifference((org.joda.time.ReadableInstant) mutableDateTime63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and instant34", (mutableDateTime17.compareTo(instant34) == 0) == mutableDateTime17.equals(instant34));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:02.825Z");
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime3.addYears((int) (short) 10);
        int int6 = mutableDateTime3.getMonthOfYear();
        boolean boolean7 = mutableDateTime3.isAfterNow();
        int int8 = mutableDateTime3.getSecondOfDay();
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime3.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar9);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime1.setMonthOfYear(1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime10", (mutableDateTime3.compareTo(mutableDateTime10) == 0) == mutableDateTime3.equals(mutableDateTime10));
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
        mutableDateTime2.addSeconds(0);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.copy();
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime7.add(readableDuration8, 2021);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.yearOfCentury();
        mutableDateTime4.setTime(1606262453266L);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime4.year();
        java.util.Locale locale9 = null;
        java.util.Calendar calendar10 = mutableDateTime4.toCalendar(locale9);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundFloor();
        java.util.Locale locale20 = null;
        int int21 = property18.getMaximumTextLength(locale20);
        org.joda.time.MutableDateTime mutableDateTime22 = property18.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property18.getFieldType();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime4.property(dateTimeFieldType23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant14", (mutableDateTime2.compareTo(instant14) == 0) == mutableDateTime2.equals(instant14));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        mutableDateTime18.setZone(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime18.getZone();
        int int23 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        int int24 = mutableDateTime18.getRoundingMode();
        org.joda.time.DateTimeField dateTimeField25 = mutableDateTime18.getRoundingField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        int int10 = mutableDateTime9.getDayOfMonth();
        org.joda.time.Instant instant11 = mutableDateTime9.toInstant();
        boolean boolean12 = mutableDateTime9.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant11", (mutableDateTime9.compareTo(instant11) == 0) == mutableDateTime9.equals(instant11));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField((int) (short) 10);
        mutableDateTime10.addWeeks(30);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant21 = null;
        mutableDateTime15.setDate(readableInstant21);
        mutableDateTime15.setMinuteOfDay(4);
        int int25 = mutableDateTime15.getMonthOfYear();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property30.getFieldType();
        int int33 = mutableDateTime15.get(dateTimeFieldType32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime10.property(dateTimeFieldType32);
        java.util.Locale locale35 = null;
        int int36 = property34.getMaximumShortTextLength(locale35);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant46 = null;
        mutableDateTime40.setDate(readableInstant46);
        mutableDateTime40.setMinuteOfDay(4);
        int int50 = mutableDateTime40.getMonthOfYear();
        mutableDateTime40.setMinuteOfHour((int) '#');
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.DateTimeZone dateTimeZone58 = mutableDateTime57.getZone();
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime62 = mutableDateTime40.toMutableDateTime(dateTimeZone58);
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime((long) 177, dateTimeZone58);
        long long64 = property34.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and mutableDateTime57", (instant29.compareTo(mutableDateTime57) == 0) == instant29.equals(mutableDateTime57));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundFloor();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        mutableDateTime11.addMillis((int) 'a');
        int int14 = mutableDateTime11.getDayOfYear();
        boolean boolean15 = mutableDateTime8.isAfter((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime11.toMutableDateTime(chronology16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.minuteOfHour();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime29 = property27.addWrapField((int) (short) 1);
        int int30 = property27.get();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime33.add(readablePeriod36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.hourOfDay();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime33.dayOfWeek();
        int int40 = property39.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime42 = property39.addWrapField(0);
        long long43 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime42);
        boolean boolean45 = mutableDateTime42.isBefore((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone46 = mutableDateTime42.getZone();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) 100, dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime47.getZone();
        org.joda.time.DateTime dateTime49 = mutableDateTime17.toDateTime(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime33", (instant3.compareTo(mutableDateTime33) == 0) == instant3.equals(mutableDateTime33));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        java.lang.Object obj0 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:01.767Z");
        mutableDateTime2.addWeeks((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        int int6 = mutableDateTime2.getHourOfDay();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime9.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime9.dayOfMonth();
        int int18 = property17.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property17.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime22 = property17.add((long) 11);
        org.joda.time.DateTime dateTime23 = mutableDateTime22.toDateTime();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime26.add(readablePeriod29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime26.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant32 = null;
        mutableDateTime26.setDate(readableInstant32);
        mutableDateTime26.setMinuteOfDay(4);
        int int36 = mutableDateTime26.getMonthOfYear();
        mutableDateTime26.setMinuteOfHour((int) '#');
        boolean boolean39 = mutableDateTime26.isEqualNow();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone45);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        int int53 = mutableDateTime50.getYearOfCentury();
        org.joda.time.Chronology chronology54 = mutableDateTime50.getChronology();
        int int55 = mutableDateTime50.getWeekOfWeekyear();
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        int int61 = mutableDateTime58.getYearOfCentury();
        org.joda.time.Chronology chronology62 = mutableDateTime58.getChronology();
        org.joda.time.MutableDateTime mutableDateTime63 = mutableDateTime50.toMutableDateTime(chronology62);
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(chronology62);
        mutableDateTime47.setChronology(chronology62);
        org.joda.time.DateTime dateTime66 = mutableDateTime26.toDateTime(chronology62);
        org.joda.time.MutableDateTime mutableDateTime67 = dateTime23.toMutableDateTime(chronology62);
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, chronology62);
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj0, chronology62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime68", (mutableDateTime2.compareTo(mutableDateTime68) == 0) == mutableDateTime2.equals(mutableDateTime68));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:47:07.812Z", dateTimeZone4);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime10.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime10.dayOfMonth();
        int int19 = property18.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime20 = property18.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property18.getFieldType();
        org.joda.time.MutableDateTime mutableDateTime23 = property18.add((long) 11);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        mutableDateTime26.setSecondOfDay((int) '#');
        boolean boolean30 = mutableDateTime23.isEqual((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime23.minuteOfHour();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.Instant instant35 = mutableDateTime34.toInstant();
        mutableDateTime34.setDate((long) 10);
        int int38 = mutableDateTime34.getCenturyOfEra();
        boolean boolean40 = mutableDateTime34.isBefore((long) (short) -1);
        boolean boolean41 = mutableDateTime34.isBeforeNow();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime47 = property45.add((long) (short) -1);
        mutableDateTime47.setWeekOfWeekyear(53);
        boolean boolean50 = mutableDateTime34.equals((java.lang.Object) 53);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime56 = property54.add((long) (short) -1);
        mutableDateTime56.setWeekOfWeekyear(53);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime61.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime64 = property62.add((long) (short) -1);
        mutableDateTime64.setWeekOfWeekyear(53);
        mutableDateTime56.setTime((org.joda.time.ReadableInstant) mutableDateTime64);
        java.lang.Object obj68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(obj68, chronology69);
        org.joda.time.Instant instant71 = mutableDateTime70.toInstant();
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime70.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime73 = property72.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = property72.getFieldType();
        int int75 = mutableDateTime64.get(dateTimeFieldType74);
        mutableDateTime34.setMillis((org.joda.time.ReadableInstant) mutableDateTime64);
        mutableDateTime64.setMillisOfDay(2);
        org.joda.time.Chronology chronology79 = mutableDateTime64.getChronology();
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime23, chronology79);
        org.joda.time.MutableDateTime mutableDateTime81 = org.joda.time.MutableDateTime.now(chronology79);
        mutableDateTime7.setChronology(chronology79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant27", (mutableDateTime3.compareTo(instant27) == 0) == mutableDateTime3.equals(instant27));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:40.074Z");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology5);
        mutableDateTime6.addMillis((int) 'a');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property12.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = property12.addWrapField((int) 'a');
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.dayOfWeek();
        mutableDateTime19.add((long) (short) -1);
        boolean boolean28 = property12.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime30 = property12.add((int) '#');
        org.joda.time.MutableDateTime mutableDateTime31 = property12.roundHalfFloor();
        java.util.Locale locale32 = null;
        java.util.Calendar calendar33 = mutableDateTime31.toCalendar(locale32);
        boolean boolean34 = mutableDateTime6.isBefore((org.joda.time.ReadableInstant) mutableDateTime31);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        int int40 = mutableDateTime37.getYearOfCentury();
        org.joda.time.Chronology chronology41 = mutableDateTime37.getChronology();
        int int42 = mutableDateTime37.getWeekOfWeekyear();
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        int int48 = mutableDateTime45.getYearOfCentury();
        org.joda.time.Chronology chronology49 = mutableDateTime45.getChronology();
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime37.toMutableDateTime(chronology49);
        org.joda.time.DateTime dateTime51 = mutableDateTime31.toDateTime(chronology49);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) 53, chronology49);
        org.joda.time.DateTime dateTime53 = mutableDateTime2.toDateTime(chronology49);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(176L, chronology49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime53", (mutableDateTime2.compareTo(dateTime53) == 0) == mutableDateTime2.equals(dateTime53));
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
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.dayOfWeek();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        mutableDateTime11.setZone(dateTimeZone13);
        int int15 = mutableDateTime11.getMinuteOfHour();
        int int16 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        int int24 = mutableDateTime19.getWeekOfWeekyear();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.DateTime dateTime29 = mutableDateTime19.toDateTime(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone28);
        mutableDateTime11.setZoneRetainFields(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        int int10 = property7.get();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.dayOfWeek();
        int int20 = property19.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.addWrapField(0);
        long long23 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime22);
        boolean boolean25 = mutableDateTime22.isBefore((long) (byte) 10);
        org.joda.time.DateTime dateTime26 = mutableDateTime22.toDateTimeISO();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.hourOfDay();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime29.dayOfWeek();
        int int36 = property35.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime38 = property35.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime39 = property35.roundHalfEven();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        int int45 = mutableDateTime42.getYearOfCentury();
        org.joda.time.Chronology chronology46 = mutableDateTime42.getChronology();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(chronology46);
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime39.toMutableDateTime(chronology46);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime22.toMutableDateTime(chronology46);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        mutableDateTime52.add(readablePeriod55);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime52.hourOfDay();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime52.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime60 = property58.addWrapField((int) (short) 10);
        mutableDateTime60.addWeeks(30);
        java.lang.Object obj63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj63, chronology64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = null;
        java.lang.String str67 = mutableDateTime65.toString(dateTimeFormatter66);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        mutableDateTime65.add(readablePeriod68);
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime65.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant71 = null;
        mutableDateTime65.setDate(readableInstant71);
        mutableDateTime65.setMinuteOfDay(4);
        int int75 = mutableDateTime65.getMonthOfYear();
        java.lang.Object obj76 = null;
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime(obj76, chronology77);
        org.joda.time.Instant instant79 = mutableDateTime78.toInstant();
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime78.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime81 = property80.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = property80.getFieldType();
        int int83 = mutableDateTime65.get(dateTimeFieldType82);
        org.joda.time.MutableDateTime.Property property84 = mutableDateTime60.property(dateTimeFieldType82);
        int int85 = mutableDateTime49.get(dateTimeFieldType82);
        org.joda.time.Instant instant86 = mutableDateTime49.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant79", (mutableDateTime13.compareTo(instant79) == 0) == mutableDateTime13.equals(instant79));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime6 = property3.roundCeiling();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        mutableDateTime6.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime6.add(readablePeriod14);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime25 = property23.addWrapField((int) (short) 1);
        int int26 = property23.get();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.hourOfDay();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime29.dayOfWeek();
        int int36 = property35.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime38 = property35.addWrapField(0);
        long long39 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime38);
        boolean boolean41 = mutableDateTime38.isBefore((long) (byte) 10);
        org.joda.time.DateTime dateTime42 = mutableDateTime38.toDateTimeISO();
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        mutableDateTime45.add(readablePeriod48);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.hourOfDay();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime45.dayOfWeek();
        int int52 = property51.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime54 = property51.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime55 = property51.roundHalfEven();
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        int int61 = mutableDateTime58.getYearOfCentury();
        org.joda.time.Chronology chronology62 = mutableDateTime58.getChronology();
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(chronology62);
        org.joda.time.MutableDateTime mutableDateTime64 = mutableDateTime55.toMutableDateTime(chronology62);
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime38.toMutableDateTime(chronology62);
        mutableDateTime38.setYear(45);
        int int68 = mutableDateTime38.getWeekyear();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) mutableDateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime42", (instant10.compareTo(dateTime42) == 0) == instant10.equals(dateTime42));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = mutableDateTime2.getSecondOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.addMillis((int) 'a');
        int int15 = mutableDateTime12.getDayOfYear();
        boolean boolean16 = mutableDateTime12.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime12.property(dateTimeFieldType19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        mutableDateTime23.addMillis((int) 'a');
        int int26 = mutableDateTime23.getDayOfYear();
        boolean boolean27 = mutableDateTime23.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime23.getZone();
        mutableDateTime12.setZoneRetainFields(dateTimeZone28);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime33.add(readablePeriod36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.addWrapField((int) (short) 1);
        int int41 = property38.get();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        mutableDateTime44.add(readablePeriod47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime44.hourOfDay();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime44.dayOfWeek();
        int int51 = property50.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime53 = property50.addWrapField(0);
        long long54 = property38.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime53);
        boolean boolean56 = mutableDateTime53.isBefore((long) (byte) 10);
        org.joda.time.DateTime dateTime57 = mutableDateTime53.toDateTimeISO();
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = null;
        java.lang.String str62 = mutableDateTime60.toString(dateTimeFormatter61);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        mutableDateTime60.add(readablePeriod63);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime60.hourOfDay();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime60.dayOfWeek();
        int int67 = property66.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime69 = property66.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime70 = property66.roundHalfEven();
        java.lang.Object obj71 = null;
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(obj71, chronology72);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = null;
        java.lang.String str75 = mutableDateTime73.toString(dateTimeFormatter74);
        int int76 = mutableDateTime73.getYearOfCentury();
        org.joda.time.Chronology chronology77 = mutableDateTime73.getChronology();
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime(chronology77);
        org.joda.time.MutableDateTime mutableDateTime79 = mutableDateTime70.toMutableDateTime(chronology77);
        org.joda.time.MutableDateTime mutableDateTime80 = mutableDateTime53.toMutableDateTime(chronology77);
        org.joda.time.DateTime dateTime81 = mutableDateTime2.toDateTime(chronology77);
        org.joda.time.MutableDateTime mutableDateTime82 = org.joda.time.MutableDateTime.now(chronology77);
        int int83 = mutableDateTime82.getHourOfDay();
        org.joda.time.Instant instant84 = mutableDateTime82.toInstant();
        java.lang.String str85 = mutableDateTime82.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and instant84", (mutableDateTime17.compareTo(instant84) == 0) == mutableDateTime17.equals(instant84));
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
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime8 = mutableDateTime2.toDateTimeISO();
        int int9 = mutableDateTime2.getSecondOfDay();
        java.util.Date date10 = mutableDateTime2.toDate();
        mutableDateTime2.add((long) 46);
        mutableDateTime2.setMillisOfSecond(941);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.weekOfWeekyear();
        long long16 = property15.remainder();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        int int24 = mutableDateTime19.getWeekOfWeekyear();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.DateTime dateTime29 = mutableDateTime19.toDateTime(dateTimeZone28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        boolean boolean31 = dateTime29.isSupported(dateTimeFieldType30);
        int int32 = dateTime29.getSecondOfMinute();
        int int33 = dateTime29.getYearOfEra();
        int int34 = property15.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:40.074Z");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology5);
        mutableDateTime6.addMillis((int) 'a');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property12.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime16 = property12.addWrapField((int) 'a');
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.dayOfWeek();
        mutableDateTime19.add((long) (short) -1);
        boolean boolean28 = property12.equals((java.lang.Object) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime30 = property12.add((int) '#');
        org.joda.time.MutableDateTime mutableDateTime31 = property12.roundHalfFloor();
        java.util.Locale locale32 = null;
        java.util.Calendar calendar33 = mutableDateTime31.toCalendar(locale32);
        boolean boolean34 = mutableDateTime6.isBefore((org.joda.time.ReadableInstant) mutableDateTime31);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        int int40 = mutableDateTime37.getYearOfCentury();
        org.joda.time.Chronology chronology41 = mutableDateTime37.getChronology();
        int int42 = mutableDateTime37.getWeekOfWeekyear();
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        int int48 = mutableDateTime45.getYearOfCentury();
        org.joda.time.Chronology chronology49 = mutableDateTime45.getChronology();
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime37.toMutableDateTime(chronology49);
        org.joda.time.DateTime dateTime51 = mutableDateTime31.toDateTime(chronology49);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) 53, chronology49);
        org.joda.time.DateTime dateTime53 = mutableDateTime2.toDateTime(chronology49);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((long) 6541, chronology49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime53", (mutableDateTime2.compareTo(dateTime53) == 0) == mutableDateTime2.equals(dateTime53));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime2.setZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime2.getZone();
        int int7 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfDay();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        mutableDateTime11.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.dayOfWeek();
        org.joda.time.DurationField durationField17 = property16.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property16.getFieldType();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.property(dateTimeFieldType18);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.dayOfWeek();
        int int29 = property28.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime31 = property28.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime32 = property28.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime33 = property28.getMutableDateTime();
        mutableDateTime33.addMinutes(20);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime33.getZone();
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime33.getZone();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime47 = property45.addWrapField((int) (short) 1);
        int int48 = property45.get();
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = mutableDateTime51.toString(dateTimeFormatter52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        mutableDateTime51.add(readablePeriod54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime51.hourOfDay();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime51.dayOfWeek();
        int int58 = property57.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime60 = property57.addWrapField(0);
        long long61 = property45.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime60);
        boolean boolean63 = mutableDateTime60.isBefore((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone64 = mutableDateTime60.getZone();
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime33.toMutableDateTime(dateTimeZone64);
        java.lang.Object obj68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(obj68, chronology69);
        org.joda.time.DateTimeZone dateTimeZone71 = mutableDateTime70.getZone();
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone71);
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime((-2655L), dateTimeZone71);
        mutableDateTime65.setZone(dateTimeZone71);
        mutableDateTime2.setZone(dateTimeZone71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime51", (instant12.compareTo(mutableDateTime51) == 0) == instant12.equals(mutableDateTime51));
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
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.dayOfWeek();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property7.getFieldType();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        java.lang.String str18 = mutableDateTime12.toString();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime12.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime12.toMutableDateTime();
        int int21 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime4.add(readablePeriod7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime4.hourOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime4.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime4.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime4.monthOfYear();
        boolean boolean13 = mutableDateTime1.isEqual((org.joda.time.ReadableInstant) mutableDateTime4);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        mutableDateTime16.setDate((long) 10);
        mutableDateTime16.setDayOfYear((int) ' ');
        long long22 = mutableDateTime16.getMillis();
        org.joda.time.Chronology chronology23 = mutableDateTime16.getChronology();
        mutableDateTime4.setChronology(chronology23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime4.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundCeiling();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        int int32 = mutableDateTime29.getYearOfCentury();
        org.joda.time.Chronology chronology33 = mutableDateTime29.getChronology();
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(chronology33);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology33);
        int int36 = property25.getDifference((org.joda.time.ReadableInstant) mutableDateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and mutableDateTime29", (instant17.compareTo(mutableDateTime29) == 0) == instant17.equals(mutableDateTime29));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = mutableDateTime2.getRoundingField();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:17.098Z");
        org.joda.time.DateTime dateTime8 = mutableDateTime7.toDateTime();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant17 = null;
        mutableDateTime11.setDate(readableInstant17);
        mutableDateTime11.setMinuteOfDay(4);
        int int21 = mutableDateTime11.getMonthOfYear();
        mutableDateTime11.setMinuteOfHour((int) '#');
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime11.toMutableDateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime34 = dateTime8.toDateTime(dateTimeZone29);
        boolean boolean35 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) dateTime8);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.Instant instant39 = mutableDateTime38.toInstant();
        mutableDateTime38.setDate((long) 10);
        int int42 = mutableDateTime38.getCenturyOfEra();
        boolean boolean44 = mutableDateTime38.isBefore((long) (short) -1);
        boolean boolean45 = mutableDateTime38.isBeforeNow();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime51 = property49.add((long) (short) -1);
        mutableDateTime51.setWeekOfWeekyear(53);
        boolean boolean54 = mutableDateTime38.equals((java.lang.Object) 53);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology56);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime57.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime60 = property58.add((long) (short) -1);
        mutableDateTime60.setWeekOfWeekyear(53);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology64);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime65.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime68 = property66.add((long) (short) -1);
        mutableDateTime68.setWeekOfWeekyear(53);
        mutableDateTime60.setTime((org.joda.time.ReadableInstant) mutableDateTime68);
        java.lang.Object obj72 = null;
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(obj72, chronology73);
        org.joda.time.Instant instant75 = mutableDateTime74.toInstant();
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime74.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime77 = property76.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = property76.getFieldType();
        int int79 = mutableDateTime68.get(dateTimeFieldType78);
        mutableDateTime38.setMillis((org.joda.time.ReadableInstant) mutableDateTime68);
        mutableDateTime68.setMillisOfDay(2);
        int int83 = mutableDateTime68.getEra();
        int int84 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime28 and instant39", (mutableDateTime28.compareTo(instant39) == 0) == mutableDateTime28.equals(instant39));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        org.joda.time.DurationField durationField8 = property3.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime9 = property3.roundCeiling();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.yearOfCentury();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        mutableDateTime13.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.dayOfWeek();
        org.joda.time.DurationField durationField19 = property18.getLeapDurationField();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        mutableDateTime22.setZone(dateTimeZone24);
        int int26 = mutableDateTime22.getMinuteOfHour();
        int int27 = property18.compareTo((org.joda.time.ReadableInstant) mutableDateTime22);
        int int28 = mutableDateTime22.getMillisOfSecond();
        mutableDateTime22.setSecondOfDay(437);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime22.toString(dateTimeFormatter31);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime38.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime38.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime41 = property40.roundFloor();
        java.util.Locale locale42 = null;
        int int43 = property40.getMaximumTextLength(locale42);
        org.joda.time.MutableDateTime mutableDateTime44 = property40.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property40.getFieldType();
        int int46 = mutableDateTime22.get(dateTimeFieldType45);
        boolean boolean47 = mutableDateTime9.isSupported(dateTimeFieldType45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant36", (mutableDateTime13.compareTo(instant36) == 0) == mutableDateTime13.equals(instant36));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.util.Locale locale7 = null;
        java.util.Calendar calendar8 = mutableDateTime2.toCalendar(locale7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.weekyear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.getMutableDateTime();
        org.joda.time.DurationField durationField11 = property9.getLeapDurationField();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        mutableDateTime14.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.dayOfWeek();
        org.joda.time.DurationField durationField20 = property19.getLeapDurationField();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        mutableDateTime23.setZone(dateTimeZone25);
        int int27 = mutableDateTime23.getMinuteOfHour();
        int int28 = property19.compareTo((org.joda.time.ReadableInstant) mutableDateTime23);
        int int29 = property9.getDifference((org.joda.time.ReadableInstant) mutableDateTime23);
        java.util.Locale locale30 = null;
        int int31 = property9.getMaximumTextLength(locale30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime23", (instant15.compareTo(mutableDateTime23) == 0) == instant15.equals(mutableDateTime23));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        mutableDateTime2.setDayOfYear((int) ' ');
        int int8 = mutableDateTime2.getCenturyOfEra();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.hourOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime11.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar18 = mutableDateTime11.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime11.dayOfMonth();
        int int20 = property19.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.add((long) 0);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfWeek();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = mutableDateTime5.toString(dateTimeFormatter6);
        int int8 = mutableDateTime5.getYearOfCentury();
        org.joda.time.Chronology chronology9 = mutableDateTime5.getChronology();
        int int10 = mutableDateTime5.getWeekOfWeekyear();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTime dateTime15 = mutableDateTime5.toDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        boolean boolean18 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        int int19 = mutableDateTime17.getDayOfMonth();
        java.lang.Object obj20 = mutableDateTime17.clone();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfCeiling();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime28.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundHalfFloor();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime31.add(readablePeriod32);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 'a');
        int int36 = mutableDateTime35.getDayOfWeek();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.Instant instant40 = mutableDateTime39.toInstant();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime39.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime42 = property41.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime42.toMutableDateTime();
        mutableDateTime35.setTime((org.joda.time.ReadableInstant) mutableDateTime42);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime42.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property45.getFieldType();
        mutableDateTime31.set(dateTimeFieldType46, 10);
        mutableDateTime22.set(dateTimeFieldType46, 6380);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant26", (mutableDateTime13.compareTo(instant26) == 0) == mutableDateTime13.equals(instant26));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTimeISO();
        boolean boolean10 = mutableDateTime2.isEqual((long) (short) -1);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant19 = null;
        mutableDateTime13.setDate(readableInstant19);
        mutableDateTime13.setMinuteOfDay(4);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime28.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.roundFloor();
        java.util.Locale locale32 = null;
        int int33 = property30.getMaximumTextLength(locale32);
        org.joda.time.MutableDateTime mutableDateTime34 = property30.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property30.getFieldType();
        int int36 = mutableDateTime13.get(dateTimeFieldType35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime2.property(dateTimeFieldType35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant26", (mutableDateTime8.compareTo(instant26) == 0) == mutableDateTime8.equals(instant26));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        mutableDateTime5.setWeekOfWeekyear(53);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.getMutableDateTime();
        boolean boolean11 = mutableDateTime10.isAfterNow();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.hourOfDay();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.dayOfWeek();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime14.secondOfDay();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime14.monthOfYear();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology24);
        mutableDateTime25.addMillis((int) 'a');
        int int28 = mutableDateTime25.getDayOfYear();
        boolean boolean29 = mutableDateTime25.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime25.getZone();
        mutableDateTime14.setZoneRetainFields(dateTimeZone30);
        mutableDateTime10.setZone(dateTimeZone30);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.hourOfDay();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime35.dayOfWeek();
        java.lang.String str42 = mutableDateTime35.toString();
        mutableDateTime35.setMillisOfSecond((int) (short) 10);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime35.yearOfCentury();
        mutableDateTime35.setMinuteOfDay((int) 'a');
        mutableDateTime35.setSecondOfDay((int) (short) 1);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.Instant instant53 = mutableDateTime52.toInstant();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime52.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime55 = property54.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime56 = property54.roundFloor();
        int int57 = property54.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime58 = property54.getMutableDateTime();
        org.joda.time.DateTimeField dateTimeField59 = property54.getField();
        mutableDateTime35.setRounding(dateTimeField59);
        mutableDateTime10.setRounding(dateTimeField59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant53", (mutableDateTime14.compareTo(instant53) == 0) == mutableDateTime14.equals(instant53));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        int int5 = mutableDateTime2.getDayOfYear();
        boolean boolean6 = mutableDateTime2.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property8.getFieldType();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.property(dateTimeFieldType9);
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime11.toMutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime11.toMutableDateTimeISO();
        mutableDateTime17.addDays((-1));
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundCeiling();
        int int22 = mutableDateTime21.getMillisOfSecond();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        mutableDateTime25.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.secondOfMinute();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime38 = property34.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField39 = property34.getField();
        mutableDateTime25.setRounding(dateTimeField39, 2);
        mutableDateTime25.setMinuteOfDay(49);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime46.dayOfYear();
        int int48 = property47.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime50 = property47.set((int) (short) 1);
        int int51 = mutableDateTime50.getYear();
        mutableDateTime25.setTime((org.joda.time.ReadableInstant) mutableDateTime50);
        boolean boolean54 = mutableDateTime25.isBefore(0L);
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = mutableDateTime57.toString(dateTimeFormatter58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        mutableDateTime57.add(readablePeriod60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime57.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant63 = null;
        mutableDateTime57.setDate(readableInstant63);
        mutableDateTime57.setMinuteOfDay(4);
        int int67 = mutableDateTime57.getMonthOfYear();
        java.lang.Object obj68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(obj68, chronology69);
        org.joda.time.Instant instant71 = mutableDateTime70.toInstant();
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime70.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime73 = property72.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = property72.getFieldType();
        int int75 = mutableDateTime57.get(dateTimeFieldType74);
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime25.property(dateTimeFieldType74);
        boolean boolean77 = mutableDateTime21.isSupported(dateTimeFieldType74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant26", (mutableDateTime14.compareTo(instant26) == 0) == mutableDateTime14.equals(instant26));
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
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.DateTime dateTime11 = mutableDateTime2.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime7", (instant3.compareTo(mutableDateTime7) == 0) == instant3.equals(mutableDateTime7));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:03.895Z");
        mutableDateTime1.setDayOfWeek(2);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 'a');
        int int6 = mutableDateTime5.getDayOfWeek();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        int int14 = mutableDateTime9.getWeekOfWeekyear();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.DateTime dateTime19 = mutableDateTime9.toDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        boolean boolean22 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime21);
        int int23 = mutableDateTime21.getDayOfMonth();
        java.lang.Object obj24 = mutableDateTime21.clone();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime21.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime26.copy();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfYear();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime27.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime21", (mutableDateTime1.compareTo(mutableDateTime21) == 0) == mutableDateTime1.equals(mutableDateTime21));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        int int16 = mutableDateTime5.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        mutableDateTime2.setSecondOfDay(2);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        mutableDateTime13.addMillis((int) 'a');
        int int16 = mutableDateTime13.getDayOfYear();
        boolean boolean17 = mutableDateTime13.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property19.getFieldType();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime13.property(dateTimeFieldType20);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property26.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime30 = property26.addWrapField((int) 'a');
        org.joda.time.DurationField durationField31 = property26.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime32 = property26.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration35 = null;
        mutableDateTime33.add(readableDuration35);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.Instant instant40 = mutableDateTime39.toInstant();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime39.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime42 = property41.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property41.getFieldType();
        mutableDateTime33.set(dateTimeFieldType43, 1);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime32.property(dateTimeFieldType43);
        int int47 = mutableDateTime2.get(dateTimeFieldType43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and instant40", (mutableDateTime18.compareTo(instant40) == 0) == mutableDateTime18.equals(instant40));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime8.toString(dateTimeFormatter13);
        int int15 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime8.millisOfDay();
        int int17 = property16.getMinimumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:03.895Z");
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.centuryOfEra();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        int int9 = mutableDateTime6.getYearOfCentury();
        org.joda.time.Chronology chronology10 = mutableDateTime6.getChronology();
        int int11 = mutableDateTime6.getWeekOfWeekyear();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.DateTime dateTime16 = mutableDateTime6.toDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime2.toMutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:47:34.737Z", dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime18", (mutableDateTime2.compareTo(mutableDateTime18) == 0) == mutableDateTime2.equals(mutableDateTime18));
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
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime7);
        mutableDateTime2.addSeconds(177);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime7", (instant3.compareTo(mutableDateTime7) == 0) == instant3.equals(mutableDateTime7));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.addMillis(132);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology8);
        mutableDateTime9.addMillis((int) 'a');
        int int12 = mutableDateTime9.getDayOfYear();
        boolean boolean13 = mutableDateTime9.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime9.property(dateTimeFieldType16);
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        boolean boolean19 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property23.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime27 = property23.addWrapField((int) 'a');
        java.lang.String str28 = property23.getAsShortText();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.hourOfDay();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime31.dayOfWeek();
        int int38 = property37.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime40 = property37.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime41 = property37.roundHalfEven();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        int int47 = mutableDateTime44.getYearOfCentury();
        org.joda.time.Chronology chronology48 = mutableDateTime44.getChronology();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(chronology48);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime41.toMutableDateTime(chronology48);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((java.lang.Object) str28, chronology48);
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime2.toMutableDateTime(chronology48);
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        org.joda.time.Instant instant56 = mutableDateTime55.toInstant();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime55.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime58 = property57.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime58.toMutableDateTime();
        boolean boolean60 = mutableDateTime52.isBefore((org.joda.time.ReadableInstant) mutableDateTime59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant56", (mutableDateTime14.compareTo(instant56) == 0) == mutableDateTime14.equals(instant56));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getCenturyOfEra();
        boolean boolean8 = mutableDateTime2.isBefore((long) (short) -1);
        boolean boolean9 = mutableDateTime2.isBeforeNow();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) (short) -1);
        mutableDateTime15.setWeekOfWeekyear(53);
        boolean boolean18 = mutableDateTime2.equals((java.lang.Object) 53);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.add((long) (short) -1);
        mutableDateTime24.setWeekOfWeekyear(53);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime32 = property30.add((long) (short) -1);
        mutableDateTime32.setWeekOfWeekyear(53);
        mutableDateTime24.setTime((org.joda.time.ReadableInstant) mutableDateTime32);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.Instant instant39 = mutableDateTime38.toInstant();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime38.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime41 = property40.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property40.getFieldType();
        int int43 = mutableDateTime32.get(dateTimeFieldType42);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime32.millisOfSecond();
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = null;
        java.lang.String str50 = mutableDateTime48.toString(dateTimeFormatter49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        mutableDateTime48.add(readablePeriod51);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime48.hourOfDay();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime48.dayOfWeek();
        int int55 = mutableDateTime48.getSecondOfDay();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology57);
        mutableDateTime58.addMillis((int) 'a');
        int int61 = mutableDateTime58.getDayOfYear();
        boolean boolean62 = mutableDateTime58.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime63.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property64.getFieldType();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime58.property(dateTimeFieldType65);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology68);
        mutableDateTime69.addMillis((int) 'a');
        int int72 = mutableDateTime69.getDayOfYear();
        boolean boolean73 = mutableDateTime69.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone74 = mutableDateTime69.getZone();
        mutableDateTime58.setZoneRetainFields(dateTimeZone74);
        mutableDateTime48.setTime((org.joda.time.ReadableInstant) mutableDateTime58);
        mutableDateTime48.setMillis((long) '#');
        mutableDateTime48.setWeekyear(617);
        boolean boolean81 = mutableDateTime32.isBefore((org.joda.time.ReadableInstant) mutableDateTime48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime63", (instant3.compareTo(mutableDateTime63) == 0) == instant3.equals(mutableDateTime63));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology7);
        mutableDateTime8.addMillis((int) 'a');
        int int11 = mutableDateTime8.getDayOfYear();
        boolean boolean12 = mutableDateTime8.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime5.toMutableDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        int int18 = mutableDateTime17.getYearOfCentury();
        boolean boolean19 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        int int20 = mutableDateTime14.getHourOfDay();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        mutableDateTime24.setZone(dateTimeZone26);
        int int28 = mutableDateTime24.getMinuteOfHour();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        int int34 = mutableDateTime31.getYearOfCentury();
        org.joda.time.Chronology chronology35 = mutableDateTime31.getChronology();
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(chronology35);
        mutableDateTime24.setChronology(chronology35);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(6387311L, chronology35);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology40);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime41.getZone();
        org.joda.time.DateTime dateTime43 = mutableDateTime38.toDateTime(dateTimeZone42);
        mutableDateTime14.setZone(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        int int10 = property7.getLeapAmount();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.yearOfCentury();
        java.lang.String str19 = property18.toString();
        org.joda.time.DurationField durationField20 = property18.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime21 = property18.roundFloor();
        boolean boolean22 = property7.equals((java.lang.Object) mutableDateTime21);
        int int23 = mutableDateTime21.getDayOfMonth();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology30);
        mutableDateTime31.addWeekyears((int) (byte) 1);
        boolean boolean34 = mutableDateTime21.isBefore((org.joda.time.ReadableInstant) mutableDateTime31);
        mutableDateTime31.addDays(6537);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and mutableDateTime26", (instant14.compareTo(mutableDateTime26) == 0) == instant14.equals(mutableDateTime26));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        java.lang.String str8 = property7.toString();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property7.getAsShortText(locale9);
        org.joda.time.MutableDateTime mutableDateTime11 = property7.roundFloor();
        int int12 = mutableDateTime11.getMinuteOfDay();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        int int17 = mutableDateTime15.getSecondOfMinute();
        int int18 = mutableDateTime15.getEra();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:54.005Z", dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = mutableDateTime24.getRoundingField();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.centuryOfEra();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.joda.time.DateTime dateTime34 = mutableDateTime24.toDateTime(dateTimeZone30);
        mutableDateTime15.setZone(dateTimeZone30);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime38.add(readablePeriod41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime38.hourOfDay();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime38.dayOfWeek();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime38.secondOfDay();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime38.monthOfYear();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology48);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime49.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime52 = property50.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime54 = property50.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField55 = property50.getField();
        mutableDateTime38.setRounding(dateTimeField55);
        int int57 = mutableDateTime15.get(dateTimeField55);
        boolean boolean58 = mutableDateTime11.equals((java.lang.Object) mutableDateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.addWrapField((int) 'a');
        int int8 = property3.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime9 = property3.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime20 = property18.addWrapField((int) (short) 1);
        int int21 = property18.get();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime24.add(readablePeriod27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime24.hourOfDay();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime24.dayOfWeek();
        int int31 = property30.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime33 = property30.addWrapField(0);
        long long34 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime33);
        boolean boolean36 = mutableDateTime33.isBefore((long) (byte) 10);
        org.joda.time.DateTime dateTime37 = mutableDateTime33.toDateTimeISO();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime40.dayOfWeek();
        int int47 = property46.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime49 = property46.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime50 = property46.roundHalfEven();
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = null;
        java.lang.String str55 = mutableDateTime53.toString(dateTimeFormatter54);
        int int56 = mutableDateTime53.getYearOfCentury();
        org.joda.time.Chronology chronology57 = mutableDateTime53.getChronology();
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(chronology57);
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime50.toMutableDateTime(chronology57);
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime33.toMutableDateTime(chronology57);
        org.joda.time.DateTime dateTime61 = mutableDateTime60.toDateTimeISO();
        boolean boolean62 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) mutableDateTime60);
        org.joda.time.Instant instant63 = mutableDateTime9.toInstant();
        int int64 = mutableDateTime9.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant63", (mutableDateTime9.compareTo(instant63) == 0) == mutableDateTime9.equals(instant63));
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
        mutableDateTime2.add((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.dayOfWeek();
        int int8 = mutableDateTime2.getCenturyOfEra();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.hourOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime11.dayOfWeek();
        mutableDateTime11.add((long) (short) -1);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime11.secondOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.add((long) (short) -1);
        mutableDateTime26.setWeekOfWeekyear(53);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime26.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime31 = property29.getMutableDateTime();
        boolean boolean32 = mutableDateTime31.isAfterNow();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.hourOfDay();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime35.dayOfWeek();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime35.secondOfDay();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime35.monthOfYear();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology45);
        mutableDateTime46.addMillis((int) 'a');
        int int49 = mutableDateTime46.getDayOfYear();
        boolean boolean50 = mutableDateTime46.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime46.getZone();
        mutableDateTime35.setZoneRetainFields(dateTimeZone51);
        mutableDateTime31.setZone(dateTimeZone51);
        mutableDateTime11.setZone(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime55 = org.joda.time.MutableDateTime.now(dateTimeZone51);
        int int56 = mutableDateTime55.getSecondOfDay();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime55.dayOfMonth();
        boolean boolean58 = mutableDateTime2.equals((java.lang.Object) property57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime35", (instant3.compareTo(mutableDateTime35) == 0) == instant3.equals(mutableDateTime35));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime8.toString(dateTimeFormatter13);
        int int15 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime8.toMutableDateTimeISO();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.addWrapField((int) (short) 1);
        int int27 = property24.get();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime30.add(readablePeriod33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.hourOfDay();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime30.dayOfWeek();
        int int37 = property36.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime39 = property36.addWrapField(0);
        long long40 = property24.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime39);
        boolean boolean42 = mutableDateTime39.isBefore((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime39.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(dateTimeZone43);
        int int45 = mutableDateTime44.getHourOfDay();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime44.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime47 = property46.roundFloor();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology50);
        mutableDateTime51.addMillis((int) 'a');
        int int54 = mutableDateTime51.getDayOfYear();
        boolean boolean55 = mutableDateTime51.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime56.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property57.getFieldType();
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime51.property(dateTimeFieldType58);
        org.joda.time.MutableDateTime mutableDateTime60 = property59.roundHalfFloor();
        java.lang.Object obj61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(obj61, chronology62);
        org.joda.time.DateTimeZone dateTimeZone64 = mutableDateTime63.getZone();
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime60.toMutableDateTime(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:46:09.970Z", dateTimeZone64);
        mutableDateTime47.setZoneRetainFields(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime16.toMutableDateTime(dateTimeZone64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.addYears((int) (short) 10);
        int int4 = mutableDateTime1.getMonthOfYear();
        boolean boolean5 = mutableDateTime1.isAfterNow();
        int int6 = mutableDateTime1.getSecondOfDay();
        java.util.GregorianCalendar gregorianCalendar7 = mutableDateTime1.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar7);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.centuryOfEra();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone14);
        mutableDateTime8.setZoneRetainFields(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime8", (mutableDateTime1.compareTo(mutableDateTime8) == 0) == mutableDateTime1.equals(mutableDateTime8));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutableDateTime2.setDate(readableInstant8);
        mutableDateTime2.setMinuteOfDay(4);
        int int12 = mutableDateTime2.getMonthOfYear();
        mutableDateTime2.addWeekyears((int) (short) -1);
        java.util.GregorianCalendar gregorianCalendar15 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.yearOfEra();
        java.lang.String str17 = mutableDateTime2.toString();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        mutableDateTime20.setDayOfWeek(3);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime33 = property31.add((long) (short) -1);
        mutableDateTime33.setWeekOfWeekyear(53);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime41 = property39.add((long) (short) -1);
        mutableDateTime41.setWeekOfWeekyear(53);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime41);
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.Instant instant48 = mutableDateTime47.toInstant();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime47.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime50 = property49.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property49.getFieldType();
        int int52 = mutableDateTime41.get(dateTimeFieldType51);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration55 = null;
        mutableDateTime53.add(readableDuration55);
        java.lang.Object obj57 = null;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(obj57, chronology58);
        org.joda.time.Instant instant60 = mutableDateTime59.toInstant();
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime59.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime62 = property61.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property61.getFieldType();
        mutableDateTime53.set(dateTimeFieldType63, 1);
        boolean boolean66 = mutableDateTime41.isSupported(dateTimeFieldType63);
        int int67 = mutableDateTime20.get(dateTimeFieldType63);
        boolean boolean68 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime20);
        mutableDateTime2.setWeekyear(51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and instant48", (mutableDateTime20.compareTo(instant48) == 0) == mutableDateTime20.equals(instant48));
    }
}

