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
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 'a');
        int int18 = mutableDateTime17.getDayOfYear();
        int int19 = mutableDateTime17.getYearOfCentury();
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
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
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.hourOfDay();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.dayOfWeek();
        boolean boolean28 = mutableDateTime18.isAfter((org.joda.time.ReadableInstant) mutableDateTime21);
        mutableDateTime18.addMonths((int) '#');
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime21", (instant16.compareTo(mutableDateTime21) == 0) == instant16.equals(mutableDateTime21));
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
        mutableDateTime2.addSeconds(0);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.copy();
        mutableDateTime2.addWeeks((int) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime7", (instant3.compareTo(mutableDateTime7) == 0) == instant3.equals(mutableDateTime7));
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
        mutableDateTime5.setMonthOfYear((int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        boolean boolean17 = mutableDateTime8.isBefore((long) (byte) 100);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology19);
        boolean boolean21 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime20);
        mutableDateTime20.setDayOfYear((int) 'a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        int int7 = property4.get();
        org.joda.time.MutableDateTime mutableDateTime8 = property4.roundCeiling();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        mutableDateTime11.setDate((long) 10);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime17.toString(dateTimeFormatter22);
        int int24 = mutableDateTime11.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        boolean boolean26 = mutableDateTime17.isBefore((long) (byte) 100);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology28);
        boolean boolean30 = mutableDateTime17.isBefore((org.joda.time.ReadableInstant) mutableDateTime29);
        int int31 = property4.compareTo((org.joda.time.ReadableInstant) mutableDateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime17", (instant12.compareTo(mutableDateTime17) == 0) == instant12.equals(mutableDateTime17));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
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
        boolean boolean17 = mutableDateTime8.isBefore((long) (byte) 100);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology19);
        boolean boolean21 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime20);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property26.getFieldType();
        int int29 = mutableDateTime20.get(dateTimeFieldType28);
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
        mutableDateTime2.addSeconds(0);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.copy();
        mutableDateTime2.add((long) 70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime7", (instant3.compareTo(mutableDateTime7) == 0) == instant3.equals(mutableDateTime7));
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
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        mutableDateTime5.addMonths((int) '#');
        mutableDateTime5.addYears(365);
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
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getCenturyOfEra();
        boolean boolean7 = mutableDateTime2.isEqualNow();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property12.getFieldType();
        int int15 = mutableDateTime2.get(dateTimeFieldType14);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology22);
        org.joda.time.Chronology chronology25 = mutableDateTime24.getChronology();
        mutableDateTime2.setChronology(chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology14);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime2.property(dateTimeFieldType22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant19", (mutableDateTime10.compareTo(instant19) == 0) == mutableDateTime10.equals(instant19));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
        int int16 = mutableDateTime2.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addSeconds(0);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.copy();
        mutableDateTime2.setMinuteOfHour(59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime7", (instant3.compareTo(mutableDateTime7) == 0) == instant3.equals(mutableDateTime7));
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
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField((int) (short) 10);
        mutableDateTime10.addWeeks(30);
        org.joda.time.Instant instant13 = mutableDateTime10.toInstant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime10.toString(dateTimeFormatter14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant13", (mutableDateTime10.compareTo(instant13) == 0) == mutableDateTime10.equals(instant13));
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
        int int6 = mutableDateTime2.getCenturyOfEra();
        boolean boolean7 = mutableDateTime2.isEqualNow();
        mutableDateTime2.add((long) (byte) 10);
        int int10 = mutableDateTime2.getYearOfCentury();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 'a');
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        mutableDateTime23.setDate((long) 10);
        int int27 = mutableDateTime23.getCenturyOfEra();
        boolean boolean28 = mutableDateTime23.isEqualNow();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.Instant instant32 = mutableDateTime31.toInstant();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property33.getFieldType();
        int int36 = mutableDateTime23.get(dateTimeFieldType35);
        boolean boolean37 = mutableDateTime20.isSupported(dateTimeFieldType35);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime13.property(dateTimeFieldType35);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime2.property(dateTimeFieldType35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant24", (mutableDateTime13.compareTo(instant24) == 0) == mutableDateTime13.equals(instant24));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.getMaximumValueOverall();
        org.joda.time.DurationField durationField5 = property3.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.MutableDateTime mutableDateTime7 = property3.roundHalfEven();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        int int14 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime13);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        mutableDateTime17.setZone(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        mutableDateTime22.setWeekyear(48);
        org.joda.time.ReadableDuration readableDuration25 = null;
        mutableDateTime22.add(readableDuration25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.secondOfDay();
        boolean boolean28 = mutableDateTime13.isEqual((org.joda.time.ReadableInstant) mutableDateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime17", (instant11.compareTo(mutableDateTime17) == 0) == instant11.equals(mutableDateTime17));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        org.joda.time.Instant instant13 = mutableDateTime10.toInstant();
        int int14 = mutableDateTime10.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant13", (mutableDateTime10.compareTo(instant13) == 0) == mutableDateTime10.equals(instant13));
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
        mutableDateTime2.addSeconds(0);
        java.util.Locale locale7 = null;
        java.util.Calendar calendar8 = mutableDateTime2.toCalendar(locale7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.centuryOfEra();
        int int10 = property9.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        int int5 = mutableDateTime2.getDayOfYear();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        mutableDateTime8.setTime((long) '#');
        java.util.Locale locale13 = null;
        java.util.Calendar calendar14 = mutableDateTime8.toCalendar(locale13);
        java.util.GregorianCalendar gregorianCalendar15 = mutableDateTime8.toGregorianCalendar();
        int int16 = mutableDateTime8.getYearOfCentury();
        boolean boolean17 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 'a');
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.Instant instant32 = mutableDateTime31.toInstant();
        mutableDateTime31.setDate((long) 10);
        int int35 = mutableDateTime31.getCenturyOfEra();
        boolean boolean36 = mutableDateTime31.isEqualNow();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.Instant instant40 = mutableDateTime39.toInstant();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime39.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime42 = property41.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property41.getFieldType();
        int int44 = mutableDateTime31.get(dateTimeFieldType43);
        boolean boolean45 = mutableDateTime28.isSupported(dateTimeFieldType43);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime21.property(dateTimeFieldType43);
        int int47 = mutableDateTime18.get(dateTimeFieldType43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and instant32", (mutableDateTime21.compareTo(instant32) == 0) == mutableDateTime21.equals(instant32));
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
        java.util.Locale locale5 = null;
        int int6 = property4.getMaximumShortTextLength(locale5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime21.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 'a');
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.Instant instant28 = mutableDateTime27.toInstant();
        mutableDateTime27.setDate((long) 10);
        int int31 = mutableDateTime27.getCenturyOfEra();
        boolean boolean32 = mutableDateTime27.isEqualNow();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property37.getFieldType();
        int int40 = mutableDateTime27.get(dateTimeFieldType39);
        boolean boolean41 = mutableDateTime24.isSupported(dateTimeFieldType39);
        mutableDateTime21.set(dateTimeFieldType39, (int) (short) 1);
        int int44 = mutableDateTime2.get(dateTimeFieldType39);
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
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getYearOfEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime2.add(readableDuration7, 12);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology16);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar24 = mutableDateTime23.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime23.getZone();
        mutableDateTime17.setZone(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime2.toMutableDateTime(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        java.lang.String str8 = property7.toString();
        int int9 = property7.getMinimumValueOverall();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.dayOfWeek();
        boolean boolean25 = mutableDateTime15.isAfter((org.joda.time.ReadableInstant) mutableDateTime18);
        mutableDateTime15.addMonths((int) '#');
        boolean boolean28 = property7.equals((java.lang.Object) mutableDateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.toMutableDateTimeISO();
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
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(1L, dateTimeZone17);
        mutableDateTime4.setZoneRetainFields(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        mutableDateTime25.addSeconds(0);
        java.util.Locale locale30 = null;
        java.util.Calendar calendar31 = mutableDateTime25.toCalendar(locale30);
        java.util.Date date32 = mutableDateTime25.toDate();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology34);
        mutableDateTime35.addMillis((int) 'a');
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:52.126Z", dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime35.toMutableDateTime(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime25.toMutableDateTime(dateTimeZone43);
        mutableDateTime22.setZoneRetainFields(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant26", (mutableDateTime2.compareTo(instant26) == 0) == mutableDateTime2.equals(instant26));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime19.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime22.setMonthOfYear((int) (byte) 10);
        boolean boolean25 = mutableDateTime20.isAfter((org.joda.time.ReadableInstant) mutableDateTime22);
        int int26 = mutableDateTime13.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant17", (mutableDateTime2.compareTo(instant17) == 0) == mutableDateTime2.equals(instant17));
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
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField((int) (short) 10);
        mutableDateTime10.addWeeks(30);
        org.joda.time.Instant instant13 = mutableDateTime10.toInstant();
        org.joda.time.DateTime dateTime14 = mutableDateTime10.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant13", (mutableDateTime10.compareTo(instant13) == 0) == mutableDateTime10.equals(instant13));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.dayOfWeek();
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
        mutableDateTime2.setZone(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime2.toMutableDateTimeISO();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.Instant instant35 = mutableDateTime34.toInstant();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime34.monthOfYear();
        mutableDateTime34.addSeconds(0);
        java.util.Locale locale39 = null;
        java.util.Calendar calendar40 = mutableDateTime34.toCalendar(locale39);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant35", (mutableDateTime10.compareTo(instant35) == 0) == mutableDateTime10.equals(instant35));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.lang.String str9 = mutableDateTime2.toString();
        mutableDateTime2.setMillisOfSecond((int) (short) 10);
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.hourOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime15.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.addWrapField((int) (short) 10);
        mutableDateTime23.addWeeks(30);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:52.126Z", dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime23, dateTimeZone30);
        boolean boolean33 = dateTime12.isEqual((org.joda.time.ReadableInstant) mutableDateTime23);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.Instant instant37 = mutableDateTime36.toInstant();
        mutableDateTime36.setDate((long) 10);
        boolean boolean40 = dateTime12.equals((java.lang.Object) mutableDateTime36);
        int int41 = mutableDateTime36.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime29 and instant37", (mutableDateTime29.compareTo(instant37) == 0) == mutableDateTime29.equals(instant37));
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
        mutableDateTime2.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        mutableDateTime13.addSeconds(0);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime13.copy();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
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
        mutableDateTime2.addSeconds(0);
        mutableDateTime2.setMillis((long) 4);
        java.lang.String str9 = mutableDateTime2.toString();
        mutableDateTime2.setWeekyear(14);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        mutableDateTime2.setZone(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        int int5 = mutableDateTime2.getDayOfYear();
        mutableDateTime2.setSecondOfDay((int) (byte) 100);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        java.lang.String str16 = mutableDateTime10.toString();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property21.getFieldType();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime10.property(dateTimeFieldType23);
        boolean boolean25 = mutableDateTime2.isSupported(dateTimeFieldType23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant20", (mutableDateTime10.compareTo(instant20) == 0) == mutableDateTime10.equals(instant20));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
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
        mutableDateTime13.setDate((long) 10);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime19.toString(dateTimeFormatter24);
        int int26 = mutableDateTime13.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        boolean boolean28 = mutableDateTime19.isBefore((long) (byte) 100);
        boolean boolean29 = property10.equals((java.lang.Object) mutableDateTime19);
        int int30 = property10.getMinimumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and mutableDateTime19", (instant14.compareTo(mutableDateTime19) == 0) == instant14.equals(mutableDateTime19));
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
        mutableDateTime2.addSeconds(0);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.copy();
        int int8 = mutableDateTime7.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.dayOfWeek();
        int int25 = property24.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime27 = property24.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime28 = property24.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime29 = property24.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime29.toMutableDateTime();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(chronology37);
        mutableDateTime29.setChronology(chronology37);
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime8.toMutableDateTime(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime33", (instant3.compareTo(mutableDateTime33) == 0) == instant3.equals(mutableDateTime33));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        java.lang.String str8 = property7.toString();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfCeiling();
        mutableDateTime9.setTime((long) (short) 0);
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
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime9.toMutableDateTime(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.lang.String str9 = mutableDateTime2.toString();
        mutableDateTime2.setMillisOfSecond((int) (short) 10);
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.hourOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime15.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.addWrapField((int) (short) 10);
        mutableDateTime23.addWeeks(30);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:52.126Z", dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime23, dateTimeZone30);
        boolean boolean33 = dateTime12.isEqual((org.joda.time.ReadableInstant) mutableDateTime23);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.Instant instant37 = mutableDateTime36.toInstant();
        mutableDateTime36.setDate((long) 10);
        boolean boolean40 = dateTime12.equals((java.lang.Object) mutableDateTime36);
        boolean boolean42 = dateTime12.isAfter((long) 50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime29 and instant37", (mutableDateTime29.compareTo(instant37) == 0) == mutableDateTime29.equals(instant37));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        int int4 = mutableDateTime2.getYear();
        java.lang.Object obj5 = mutableDateTime2.clone();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(chronology12);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar20 = mutableDateTime19.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime19.getZone();
        mutableDateTime13.setZone(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant17", (mutableDateTime8.compareTo(instant17) == 0) == mutableDateTime8.equals(instant17));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.toMutableDateTimeISO();
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
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(1L, dateTimeZone17);
        mutableDateTime4.setZoneRetainFields(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        java.lang.String str23 = mutableDateTime22.toString();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property28.getFieldType();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime22.property(dateTimeFieldType30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant27", (mutableDateTime2.compareTo(instant27) == 0) == mutableDateTime2.equals(instant27));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        java.lang.String str8 = property7.toString();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfCeiling();
        int int10 = mutableDateTime9.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime9.add(readableDuration11, (int) (short) -1);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(chronology20);
        java.lang.String str23 = mutableDateTime22.toString();
        mutableDateTime22.add((long) 30);
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime9.toMutableDateTime(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 'a');
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        mutableDateTime12.setDate((long) 10);
        int int16 = mutableDateTime12.getCenturyOfEra();
        boolean boolean17 = mutableDateTime12.isEqualNow();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property22.getFieldType();
        int int25 = mutableDateTime12.get(dateTimeFieldType24);
        boolean boolean26 = mutableDateTime9.isSupported(dateTimeFieldType24);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime2.property(dateTimeFieldType24);
        org.joda.time.Interval interval28 = property27.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTime();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology14);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar22 = mutableDateTime21.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime21.getZone();
        mutableDateTime15.setZone(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = mutableDateTime7.toDateTime(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        mutableDateTime5.setWeekOfWeekyear(51);
        mutableDateTime5.setDate((long) (short) 100);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.dayOfWeek();
        int int19 = property18.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime21 = property18.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime22 = property18.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime23 = property18.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime23.toMutableDateTime();
        int int25 = mutableDateTime24.getMonthOfYear();
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.Instant instant27 = mutableDateTime5.toInstant();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime34 = property32.add((long) (short) -1);
        mutableDateTime34.setWeekOfWeekyear(51);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime34.getZone();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) (short) -1, dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime5.toMutableDateTime(dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant27", (mutableDateTime5.compareTo(instant27) == 0) == mutableDateTime5.equals(instant27));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.add((long) (short) -1);
        mutableDateTime6.setWeekOfWeekyear(51);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (short) -1, dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfEven();
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        int int26 = mutableDateTime23.getYearOfCentury();
        org.joda.time.Chronology chronology27 = mutableDateTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime15.toMutableDateTime(chronology27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime15.dayOfWeek();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        int int35 = mutableDateTime32.getYearOfCentury();
        org.joda.time.Chronology chronology36 = mutableDateTime32.getChronology();
        int int37 = mutableDateTime32.getWeekOfWeekyear();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.DateTime dateTime42 = mutableDateTime32.toDateTime(dateTimeZone41);
        mutableDateTime15.setZone(dateTimeZone41);
        org.joda.time.Instant instant44 = mutableDateTime15.toInstant();
        int int45 = mutableDateTime12.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and instant44", (mutableDateTime23.compareTo(instant44) == 0) == mutableDateTime23.equals(instant44));
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        mutableDateTime14.setZone(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        mutableDateTime11.setZone(dateTimeZone18);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime30 = property28.addWrapField((int) (short) 1);
        java.util.Locale locale31 = null;
        int int32 = property28.getMaximumShortTextLength(locale31);
        org.joda.time.MutableDateTime mutableDateTime33 = property28.roundCeiling();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.yearOfCentury();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.Instant instant38 = mutableDateTime37.toInstant();
        mutableDateTime37.setDate((long) 10);
        int int41 = mutableDateTime37.getCenturyOfEra();
        boolean boolean42 = mutableDateTime37.isEqualNow();
        mutableDateTime37.add((long) (byte) 10);
        int int45 = mutableDateTime37.getYearOfCentury();
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.Instant instant49 = mutableDateTime48.toInstant();
        mutableDateTime48.setDate((long) 10);
        int int52 = mutableDateTime48.getCenturyOfEra();
        boolean boolean53 = mutableDateTime48.isEqualNow();
        java.lang.Object obj54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(obj54, chronology55);
        org.joda.time.Instant instant57 = mutableDateTime56.toInstant();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime56.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime59 = property58.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property58.getFieldType();
        int int61 = mutableDateTime48.get(dateTimeFieldType60);
        boolean boolean62 = mutableDateTime37.isSupported(dateTimeFieldType60);
        int int63 = mutableDateTime33.get(dateTimeFieldType60);
        boolean boolean64 = mutableDateTime11.equals((java.lang.Object) int63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant38", (mutableDateTime11.compareTo(instant38) == 0) == mutableDateTime11.equals(instant38));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        mutableDateTime2.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.year();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.hourOfDay();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.dayOfWeek();
        int int21 = property20.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime23 = property20.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime24 = property20.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime25 = property20.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime25.toMutableDateTime();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        int int32 = mutableDateTime29.getYearOfCentury();
        org.joda.time.Chronology chronology33 = mutableDateTime29.getChronology();
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(chronology33);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology33);
        mutableDateTime25.setChronology(chronology33);
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime2.toMutableDateTime(chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime29", (instant3.compareTo(mutableDateTime29) == 0) == instant3.equals(mutableDateTime29));
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
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.roundFloor();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        int int12 = mutableDateTime10.getSecondOfMinute();
        int int13 = mutableDateTime10.getDayOfYear();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        mutableDateTime16.setTime((long) '#');
        java.util.Locale locale21 = null;
        java.util.Calendar calendar22 = mutableDateTime16.toCalendar(locale21);
        java.util.GregorianCalendar gregorianCalendar23 = mutableDateTime16.toGregorianCalendar();
        int int24 = mutableDateTime16.getYearOfCentury();
        boolean boolean25 = mutableDateTime10.isEqual((org.joda.time.ReadableInstant) mutableDateTime16);
        int int26 = mutableDateTime10.getDayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime10.toMutableDateTimeISO();
        int int28 = mutableDateTime10.getMillisOfSecond();
        int int29 = property4.getDifference((org.joda.time.ReadableInstant) mutableDateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime27", (instant3.compareTo(mutableDateTime27) == 0) == instant3.equals(mutableDateTime27));
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
        mutableDateTime2.addSeconds(0);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.copy();
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = mutableDateTime2.toCalendar(locale8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime7", (instant3.compareTo(mutableDateTime7) == 0) == instant3.equals(mutableDateTime7));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.weekOfWeekyear();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        mutableDateTime21.addSeconds(0);
        java.util.Locale locale26 = null;
        java.util.Calendar calendar27 = mutableDateTime21.toCalendar(locale26);
        java.util.Date date28 = mutableDateTime21.toDate();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.Instant instant32 = mutableDateTime31.toInstant();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.monthOfYear();
        mutableDateTime31.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.secondOfMinute();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime42 = property40.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime44 = property40.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField45 = property40.getField();
        mutableDateTime31.setRounding(dateTimeField45);
        mutableDateTime21.setRounding(dateTimeField45, 1);
        mutableDateTime17.setRounding(dateTimeField45, (int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant22", (mutableDateTime10.compareTo(instant22) == 0) == mutableDateTime10.equals(instant22));
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
        int int6 = mutableDateTime5.getWeekOfWeekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        mutableDateTime9.setHourOfDay(2);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        int int21 = mutableDateTime16.getWeekOfWeekyear();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        int int27 = mutableDateTime24.getYearOfCentury();
        org.joda.time.Chronology chronology28 = mutableDateTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime16.toMutableDateTime(chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime9.toMutableDateTime(chronology28);
        mutableDateTime5.setChronology(chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        java.lang.String str8 = property7.toString();
        int int9 = property7.getMinimumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property7.addWrapField(365);
        java.lang.Object obj12 = mutableDateTime11.clone();
        int int13 = mutableDateTime11.getCenturyOfEra();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.centuryOfEra();
        java.lang.String str22 = property21.getName();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.roundCeiling();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.weekyear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundCeiling();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property29.add((long) (short) -1);
        mutableDateTime31.setWeekOfWeekyear(51);
        mutableDateTime31.setDate((long) (short) 100);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime38.add(readablePeriod41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime38.hourOfDay();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime38.dayOfWeek();
        int int45 = property44.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime47 = property44.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime48 = property44.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime49 = property44.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime49.toMutableDateTime();
        int int51 = mutableDateTime50.getMonthOfYear();
        mutableDateTime31.setTime((org.joda.time.ReadableInstant) mutableDateTime50);
        org.joda.time.Instant instant53 = mutableDateTime31.toInstant();
        boolean boolean54 = mutableDateTime25.isAfter((org.joda.time.ReadableInstant) instant53);
        boolean boolean55 = mutableDateTime11.isBefore((org.joda.time.ReadableInstant) mutableDateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime28 and instant53", (mutableDateTime28.compareTo(instant53) == 0) == mutableDateTime28.equals(instant53));
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
        mutableDateTime2.addSeconds(0);
        mutableDateTime2.setMillis((long) 4);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime10.setMonthOfYear((int) (byte) 10);
        mutableDateTime10.setMinuteOfHour(5);
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
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        mutableDateTime29.setZone(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime29.getZone();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone33);
        mutableDateTime26.setZone(dateTimeZone33);
        mutableDateTime26.addWeekyears((int) (byte) -1);
        int int38 = mutableDateTime26.getMillisOfSecond();
        mutableDateTime26.setWeekyear(146);
        int int41 = mutableDateTime10.compareTo((org.joda.time.ReadableInstant) mutableDateTime26);
        boolean boolean42 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime29", (instant3.compareTo(mutableDateTime29) == 0) == instant3.equals(mutableDateTime29));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.secondOfMinute();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        mutableDateTime13.setDate((long) 10);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime19.toString(dateTimeFormatter24);
        int int26 = mutableDateTime13.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        boolean boolean28 = mutableDateTime19.isBefore((long) (byte) 100);
        boolean boolean29 = property10.equals((java.lang.Object) mutableDateTime19);
        mutableDateTime19.setSecondOfMinute(59);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime37 = property35.add((long) (short) -1);
        mutableDateTime37.setWeekOfWeekyear(51);
        mutableDateTime37.setDate((long) (short) 100);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        int int47 = mutableDateTime44.getYearOfCentury();
        org.joda.time.Chronology chronology48 = mutableDateTime44.getChronology();
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(chronology48);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(chronology48);
        mutableDateTime37.setChronology(chronology48);
        org.joda.time.DateTime dateTime52 = mutableDateTime19.toDateTime(chronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and mutableDateTime44", (instant14.compareTo(mutableDateTime44) == 0) == instant14.equals(mutableDateTime44));
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
        mutableDateTime5.addMillis((int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        java.lang.String str9 = mutableDateTime2.toString();
        mutableDateTime2.setMillisOfSecond((int) (short) 10);
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.hourOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime15.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.addWrapField((int) (short) 10);
        mutableDateTime23.addWeeks(30);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:52.126Z", dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime23, dateTimeZone30);
        boolean boolean33 = dateTime12.isEqual((org.joda.time.ReadableInstant) mutableDateTime23);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.Instant instant37 = mutableDateTime36.toInstant();
        mutableDateTime36.setDate((long) 10);
        boolean boolean40 = dateTime12.equals((java.lang.Object) mutableDateTime36);
        mutableDateTime36.setYear(45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime29 and instant37", (mutableDateTime29.compareTo(instant37) == 0) == mutableDateTime29.equals(instant37));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.dayOfWeek();
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
        mutableDateTime2.setZone(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 'a');
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        mutableDateTime35.setDate((long) 10);
        int int39 = mutableDateTime35.getCenturyOfEra();
        boolean boolean40 = mutableDateTime35.isEqualNow();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.Instant instant44 = mutableDateTime43.toInstant();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime43.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime46 = property45.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property45.getFieldType();
        int int48 = mutableDateTime35.get(dateTimeFieldType47);
        boolean boolean49 = mutableDateTime32.isSupported(dateTimeFieldType47);
        boolean boolean50 = mutableDateTime2.isSupported(dateTimeFieldType47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant36", (mutableDateTime10.compareTo(instant36) == 0) == mutableDateTime10.equals(instant36));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
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
        boolean boolean17 = mutableDateTime8.isBefore((long) (byte) 100);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime8.add(readableDuration18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime8.weekOfWeekyear();
        org.joda.time.Interval interval21 = property20.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:52.126Z", dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        int int14 = property13.getMaximumValueOverall();
        org.joda.time.DurationField durationField15 = property13.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField16 = property13.getField();
        org.joda.time.MutableDateTime mutableDateTime17 = property13.roundHalfEven();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        mutableDateTime20.setSecondOfDay((int) '#');
        mutableDateTime20.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime20.year();
        mutableDateTime20.addMonths(330);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.dayOfYear();
        int int36 = property35.getMaximumValueOverall();
        org.joda.time.DurationField durationField37 = property35.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField38 = property35.getField();
        int int39 = mutableDateTime20.get(dateTimeField38);
        mutableDateTime17.setRounding(dateTimeField38);
        mutableDateTime8.setRounding(dateTimeField38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant21", (mutableDateTime4.compareTo(instant21) == 0) == mutableDateTime4.equals(instant21));
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundFloor();
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime10.toGregorianCalendar();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.hourOfDay();
        java.lang.String str20 = mutableDateTime14.toString();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime14.property(dateTimeFieldType27);
        boolean boolean29 = mutableDateTime10.isSupported(dateTimeFieldType27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant24", (mutableDateTime14.compareTo(instant24) == 0) == mutableDateTime14.equals(instant24));
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
        mutableDateTime2.setHourOfDay(20);
        long long9 = mutableDateTime2.getMillis();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        boolean boolean17 = mutableDateTime12.isBefore((long) (short) -1);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.millisOfDay();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.hourOfDay();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.dayOfWeek();
        int int28 = property27.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime30 = property27.addWrapField(0);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        boolean boolean35 = property27.equals((java.lang.Object) dateTimeZone34);
        org.joda.time.DateTime dateTime36 = mutableDateTime12.toDateTime(dateTimeZone34);
        boolean boolean37 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) dateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        java.lang.String str8 = property7.toString();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property7.getAsShortText(locale9);
        org.joda.time.MutableDateTime mutableDateTime12 = property7.add(12);
        org.joda.time.Interval interval13 = property7.toInterval();
        java.lang.String str14 = property7.getName();
        org.joda.time.MutableDateTime mutableDateTime15 = property7.getMutableDateTime();
        mutableDateTime15.setTime((long) (-18591));
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        int int26 = mutableDateTime21.getWeekOfWeekyear();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.DateTime dateTime31 = mutableDateTime21.toDateTime(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 1970, dateTimeZone30);
        mutableDateTime15.setZoneRetainFields(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
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
        mutableDateTime2.addSeconds(0);
        mutableDateTime2.setMillis((long) 4);
        java.lang.String str9 = mutableDateTime2.toString();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.hourOfDay();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology17);
        java.lang.String str20 = mutableDateTime19.toString();
        mutableDateTime19.add((long) 30);
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology23);
        org.joda.time.DateTime dateTime25 = mutableDateTime2.toDateTime(chronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
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
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.centuryOfEra();
        java.lang.String str16 = property15.getName();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.roundCeiling();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.weekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundCeiling();
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        mutableDateTime7.setMillis((org.joda.time.ReadableInstant) instant20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime7.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant20", (mutableDateTime7.compareTo(instant20) == 0) == mutableDateTime7.equals(instant20));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime13.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime13.getZone();
        mutableDateTime7.setZone(dateTimeZone15);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        org.joda.time.Chronology chronology24 = mutableDateTime20.getChronology();
        int int25 = mutableDateTime20.getWeekOfWeekyear();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.DateTime dateTime30 = mutableDateTime20.toDateTime(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 1970, dateTimeZone29);
        org.joda.time.DateTime dateTime34 = mutableDateTime7.toDateTime(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant11", (mutableDateTime2.compareTo(instant11) == 0) == mutableDateTime2.equals(instant11));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        org.joda.time.MutableDateTime mutableDateTime12 = property7.add(12);
        org.joda.time.Interval interval13 = property7.toInterval();
        java.lang.String str14 = property7.getName();
        org.joda.time.MutableDateTime mutableDateTime15 = property7.getMutableDateTime();
        mutableDateTime15.setTime((long) (-18591));
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        int int26 = mutableDateTime21.getWeekOfWeekyear();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.DateTime dateTime31 = mutableDateTime21.toDateTime(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 1970, dateTimeZone30);
        mutableDateTime15.setZoneRetainFields(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfEra();
        java.lang.String str8 = property7.toString();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.add((long) 3);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime10, chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        mutableDateTime5.setWeekOfWeekyear(51);
        mutableDateTime5.setDate((long) (short) 100);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.dayOfWeek();
        int int19 = property18.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime21 = property18.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime22 = property18.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime23 = property18.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime23.toMutableDateTime();
        int int25 = mutableDateTime24.getMonthOfYear();
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.Instant instant27 = mutableDateTime5.toInstant();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:52.126Z", dateTimeZone32);
        mutableDateTime5.setZoneRetainFields(dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant27", (mutableDateTime5.compareTo(instant27) == 0) == mutableDateTime5.equals(instant27));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime10 = property7.roundFloor();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.minuteOfDay();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        mutableDateTime14.setHourOfDay(2);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.hourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = property26.getField();
        mutableDateTime14.setRounding(dateTimeField27);
        mutableDateTime10.setRounding(dateTimeField27);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.Instant instant33 = mutableDateTime32.toInstant();
        mutableDateTime32.setDate((long) 10);
        int int36 = mutableDateTime32.getCenturyOfEra();
        boolean boolean37 = mutableDateTime32.isEqualNow();
        mutableDateTime32.add((long) (byte) 10);
        int int40 = mutableDateTime32.getYearOfCentury();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.Instant instant44 = mutableDateTime43.toInstant();
        mutableDateTime43.setDate((long) 10);
        int int47 = mutableDateTime43.getCenturyOfEra();
        boolean boolean48 = mutableDateTime43.isEqualNow();
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.Instant instant52 = mutableDateTime51.toInstant();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime51.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime54 = property53.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property53.getFieldType();
        int int56 = mutableDateTime43.get(dateTimeFieldType55);
        boolean boolean57 = mutableDateTime32.isSupported(dateTimeFieldType55);
        boolean boolean58 = mutableDateTime10.isSupported(dateTimeFieldType55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and instant33", (mutableDateTime21.compareTo(instant33) == 0) == mutableDateTime21.equals(instant33));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        int int14 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        boolean boolean16 = mutableDateTime10.isAfter(1L);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime10.dayOfMonth();
        java.lang.String str18 = property17.getAsString();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.getMutableDateTime();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime25.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.yearOfCentury();
        java.lang.String str28 = property27.toString();
        java.util.Locale locale29 = null;
        java.lang.String str30 = property27.getAsShortText(locale29);
        org.joda.time.MutableDateTime mutableDateTime32 = property27.add(12);
        org.joda.time.Interval interval33 = property27.toInterval();
        org.joda.time.MutableDateTime mutableDateTime35 = property27.add(9);
        org.joda.time.MutableDateTime mutableDateTime36 = property27.getMutableDateTime();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        mutableDateTime39.add(readablePeriod42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.hourOfDay();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime39.dayOfWeek();
        int int46 = property45.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime48 = property45.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime49 = property45.roundHalfEven();
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.Instant instant53 = mutableDateTime52.toInstant();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime52.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime55 = property54.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime55.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) 'a');
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.Instant instant62 = mutableDateTime61.toInstant();
        mutableDateTime61.setDate((long) 10);
        int int65 = mutableDateTime61.getCenturyOfEra();
        boolean boolean66 = mutableDateTime61.isEqualNow();
        java.lang.Object obj67 = null;
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(obj67, chronology68);
        org.joda.time.Instant instant70 = mutableDateTime69.toInstant();
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime69.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime72 = property71.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = property71.getFieldType();
        int int74 = mutableDateTime61.get(dateTimeFieldType73);
        boolean boolean75 = mutableDateTime58.isSupported(dateTimeFieldType73);
        mutableDateTime55.set(dateTimeFieldType73, (int) (short) 1);
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime49.property(dateTimeFieldType73);
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime36.property(dateTimeFieldType73);
        int int80 = mutableDateTime36.getSecondOfDay();
        int int81 = property17.getDifference((org.joda.time.ReadableInstant) mutableDateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant23", (mutableDateTime2.compareTo(instant23) == 0) == mutableDateTime2.equals(instant23));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        int int6 = mutableDateTime3.getYearOfCentury();
        org.joda.time.Chronology chronology7 = mutableDateTime3.getChronology();
        int int8 = mutableDateTime3.getWeekOfWeekyear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTime dateTime13 = mutableDateTime3.toDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 1970, dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime20.dayOfWeek();
        int int27 = property26.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime29 = property26.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime30 = property26.roundHalfEven();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime36.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) 'a');
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.Instant instant43 = mutableDateTime42.toInstant();
        mutableDateTime42.setDate((long) 10);
        int int46 = mutableDateTime42.getCenturyOfEra();
        boolean boolean47 = mutableDateTime42.isEqualNow();
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.Instant instant51 = mutableDateTime50.toInstant();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime50.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime53 = property52.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property52.getFieldType();
        int int55 = mutableDateTime42.get(dateTimeFieldType54);
        boolean boolean56 = mutableDateTime39.isSupported(dateTimeFieldType54);
        mutableDateTime36.set(dateTimeFieldType54, (int) (short) 1);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime30.property(dateTimeFieldType54);
        int int60 = mutableDateTime17.get(dateTimeFieldType54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant34", (mutableDateTime3.compareTo(instant34) == 0) == mutableDateTime3.equals(instant34));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime2.copy();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime12.toString(dateTimeFormatter17);
        int int19 = mutableDateTime12.getYearOfEra();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology26);
        mutableDateTime12.setChronology(chronology26);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime2.toMutableDateTime(chronology26);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.Instant instant33 = mutableDateTime32.toInstant();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime32.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime35 = property34.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime35.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.yearOfCentury();
        java.lang.String str38 = property37.toString();
        java.util.Locale locale39 = null;
        java.lang.String str40 = property37.getAsShortText(locale39);
        org.joda.time.MutableDateTime mutableDateTime42 = property37.add(12);
        org.joda.time.Interval interval43 = property37.toInterval();
        org.joda.time.MutableDateTime mutableDateTime45 = property37.add(9);
        org.joda.time.MutableDateTime mutableDateTime46 = property37.getMutableDateTime();
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        mutableDateTime49.add(readablePeriod52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime49.hourOfDay();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime49.dayOfWeek();
        int int56 = property55.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime58 = property55.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime59 = property55.roundHalfEven();
        java.lang.Object obj60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(obj60, chronology61);
        org.joda.time.Instant instant63 = mutableDateTime62.toInstant();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime62.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime65 = property64.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime66 = mutableDateTime65.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime((long) 'a');
        java.lang.Object obj69 = null;
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(obj69, chronology70);
        org.joda.time.Instant instant72 = mutableDateTime71.toInstant();
        mutableDateTime71.setDate((long) 10);
        int int75 = mutableDateTime71.getCenturyOfEra();
        boolean boolean76 = mutableDateTime71.isEqualNow();
        java.lang.Object obj77 = null;
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime(obj77, chronology78);
        org.joda.time.Instant instant80 = mutableDateTime79.toInstant();
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime79.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime82 = property81.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = property81.getFieldType();
        int int84 = mutableDateTime71.get(dateTimeFieldType83);
        boolean boolean85 = mutableDateTime68.isSupported(dateTimeFieldType83);
        mutableDateTime65.set(dateTimeFieldType83, (int) (short) 1);
        org.joda.time.MutableDateTime.Property property88 = mutableDateTime59.property(dateTimeFieldType83);
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime46.property(dateTimeFieldType83);
        org.joda.time.MutableDateTime.Property property90 = mutableDateTime2.property(dateTimeFieldType83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant33", (mutableDateTime9.compareTo(instant33) == 0) == mutableDateTime9.equals(instant33));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.addWrapField(10);
        org.joda.time.MutableDateTime mutableDateTime19 = property16.roundFloor();
        int int20 = mutableDateTime19.getYear();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime26.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.yearOfCentury();
        java.lang.String str29 = property28.toString();
        java.util.Locale locale30 = null;
        java.lang.String str31 = property28.getAsShortText(locale30);
        org.joda.time.MutableDateTime mutableDateTime33 = property28.add(12);
        org.joda.time.Interval interval34 = property28.toInterval();
        java.lang.String str35 = property28.getName();
        org.joda.time.DurationField durationField36 = property28.getRangeDurationField();
        java.lang.String str37 = property28.getAsShortText();
        org.joda.time.DateTimeField dateTimeField38 = property28.getField();
        mutableDateTime19.setRounding(dateTimeField38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant24", (mutableDateTime10.compareTo(instant24) == 0) == mutableDateTime10.equals(instant24));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.getMaximumValueOverall();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        mutableDateTime7.setDate((long) 10);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime13.toString(dateTimeFormatter18);
        int int20 = mutableDateTime7.compareTo((org.joda.time.ReadableInstant) mutableDateTime13);
        boolean boolean22 = mutableDateTime13.isBefore((long) (byte) 100);
        int int23 = property3.getDifference((org.joda.time.ReadableInstant) mutableDateTime13);
        java.util.Locale locale24 = null;
        int int25 = property3.getMaximumShortTextLength(locale24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime13", (instant8.compareTo(mutableDateTime13) == 0) == instant8.equals(mutableDateTime13));
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
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime5.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        mutableDateTime12.setDate((long) 10);
        mutableDateTime12.setDayOfYear((int) ' ');
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        int int19 = mutableDateTime12.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        int int5 = mutableDateTime2.getDayOfYear();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        mutableDateTime8.setTime((long) '#');
        java.util.Locale locale13 = null;
        java.util.Calendar calendar14 = mutableDateTime8.toCalendar(locale13);
        java.util.GregorianCalendar gregorianCalendar15 = mutableDateTime8.toGregorianCalendar();
        int int16 = mutableDateTime8.getYearOfCentury();
        boolean boolean17 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime8);
        int int18 = mutableDateTime2.getDayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime2.toMutableDateTimeISO();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime25.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.yearOfCentury();
        java.lang.String str28 = property27.toString();
        org.joda.time.MutableDateTime mutableDateTime29 = property27.roundHalfCeiling();
        java.lang.String str30 = property27.getAsText();
        org.joda.time.DateTimeField dateTimeField31 = property27.getField();
        int int32 = mutableDateTime19.get(dateTimeField31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant23", (mutableDateTime2.compareTo(instant23) == 0) == mutableDateTime2.equals(instant23));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addSeconds(0);
        java.util.Locale locale7 = null;
        java.util.Calendar calendar8 = mutableDateTime2.toCalendar(locale7);
        java.util.Date date9 = mutableDateTime2.toDate();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.addMillis((int) 'a');
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:52.126Z", dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime12.toMutableDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime2.toMutableDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime2.toString(dateTimeFormatter7);
        int int9 = mutableDateTime2.getYearOfEra();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology16);
        mutableDateTime2.setChronology(chronology16);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology16);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        boolean boolean27 = mutableDateTime19.isSupported(dateTimeFieldType26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant23", (mutableDateTime2.compareTo(instant23) == 0) == mutableDateTime2.equals(instant23));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.lang.String str8 = property7.getName();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundCeiling();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.weekyear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundCeiling();
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant12", (mutableDateTime11.compareTo(instant12) == 0) == mutableDateTime11.equals(instant12));
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
        mutableDateTime2.addSeconds(0);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime7", (instant3.compareTo(mutableDateTime7) == 0) == instant3.equals(mutableDateTime7));
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
        boolean boolean18 = mutableDateTime5.isAfterNow();
        mutableDateTime5.setDayOfYear((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        boolean boolean17 = mutableDateTime8.isBefore((long) (byte) 100);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime8.add(readableDuration18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime8.weekOfWeekyear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.add((long) (short) -1);
        mutableDateTime26.setWeekOfWeekyear(51);
        mutableDateTime26.setDate((long) (short) 100);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(chronology37);
        mutableDateTime26.setChronology(chronology37);
        org.joda.time.DateTime dateTime41 = mutableDateTime8.toDateTime(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime33", (instant3.compareTo(mutableDateTime33) == 0) == instant3.equals(mutableDateTime33));
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField((int) (short) 1);
        int int10 = property7.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime11 = property7.roundCeiling();
        int int12 = mutableDateTime11.getSecondOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfYear();
        int int17 = property16.getMaximumValueOverall();
        org.joda.time.DurationField durationField18 = property16.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField19 = property16.getField();
        org.joda.time.MutableDateTime mutableDateTime20 = property16.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime21 = property16.getMutableDateTime();
        boolean boolean22 = mutableDateTime11.isBefore((org.joda.time.ReadableInstant) mutableDateTime21);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.hourOfDay();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime25.dayOfWeek();
        java.lang.String str32 = mutableDateTime25.toString();
        mutableDateTime25.setMillisOfSecond((int) (short) 10);
        org.joda.time.DateTime dateTime35 = mutableDateTime25.toDateTime();
        boolean boolean36 = mutableDateTime25.isAfterNow();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.Instant instant40 = mutableDateTime39.toInstant();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime39.monthOfYear();
        mutableDateTime39.addSeconds(0);
        java.util.Locale locale44 = null;
        java.util.Calendar calendar45 = mutableDateTime39.toCalendar(locale44);
        java.util.Date date46 = mutableDateTime39.toDate();
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.Instant instant50 = mutableDateTime49.toInstant();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime49.monthOfYear();
        mutableDateTime49.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime49.secondOfMinute();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology56);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime57.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime60 = property58.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime62 = property58.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField63 = property58.getField();
        mutableDateTime49.setRounding(dateTimeField63);
        mutableDateTime39.setRounding(dateTimeField63, 1);
        int int67 = mutableDateTime25.get(dateTimeField63);
        org.joda.time.Instant instant68 = mutableDateTime25.toInstant();
        boolean boolean69 = mutableDateTime11.isAfter((org.joda.time.ReadableInstant) instant68);
        java.lang.Object obj70 = null;
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(obj70, chronology71);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = null;
        java.lang.String str74 = mutableDateTime72.toString(dateTimeFormatter73);
        mutableDateTime72.setHourOfDay(2);
        java.lang.Object obj77 = null;
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime(obj77, chronology78);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter80 = null;
        java.lang.String str81 = mutableDateTime79.toString(dateTimeFormatter80);
        org.joda.time.ReadablePeriod readablePeriod82 = null;
        mutableDateTime79.add(readablePeriod82);
        org.joda.time.MutableDateTime.Property property84 = mutableDateTime79.hourOfDay();
        org.joda.time.DateTimeField dateTimeField85 = property84.getField();
        mutableDateTime72.setRounding(dateTimeField85);
        mutableDateTime72.addYears(9);
        int int89 = instant68.compareTo((org.joda.time.ReadableInstant) mutableDateTime72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant40 and mutableDateTime79", (instant40.compareTo(mutableDateTime79) == 0) == instant40.equals(mutableDateTime79));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        mutableDateTime2.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int11 = mutableDateTime2.getDayOfMonth();
        int int12 = mutableDateTime2.getYearOfCentury();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        int int17 = mutableDateTime15.getSecondOfMinute();
        int int18 = mutableDateTime15.getDayOfYear();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        mutableDateTime21.setTime((long) '#');
        java.util.Locale locale26 = null;
        java.util.Calendar calendar27 = mutableDateTime21.toCalendar(locale26);
        java.util.GregorianCalendar gregorianCalendar28 = mutableDateTime21.toGregorianCalendar();
        int int29 = mutableDateTime21.getYearOfCentury();
        boolean boolean30 = mutableDateTime15.isEqual((org.joda.time.ReadableInstant) mutableDateTime21);
        int int31 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        java.lang.String str8 = property7.toString();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfCeiling();
        int int10 = mutableDateTime9.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.addWrapField((int) (short) 1);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.secondOfMinute();
        long long24 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime22);
        int int25 = mutableDateTime22.getSecondOfDay();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        boolean boolean33 = mutableDateTime28.isBefore((long) (short) -1);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        int int39 = mutableDateTime36.getYearOfCentury();
        org.joda.time.Chronology chronology40 = mutableDateTime36.getChronology();
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(chronology40);
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(chronology40);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime28.toMutableDateTime(chronology40);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime22, chronology40);
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
        mutableDateTime2.setSecondOfDay((int) '#');
        mutableDateTime2.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int11 = mutableDateTime2.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 'a');
        int int15 = mutableDateTime14.getCenturyOfEra();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology22);
        mutableDateTime24.setMinuteOfHour(30);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime24.getZone();
        mutableDateTime14.setZoneRetainFields(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime2.toMutableDateTime(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
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
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumTextLength(locale8);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.dayOfWeek();
        boolean boolean25 = mutableDateTime15.isAfter((org.joda.time.ReadableInstant) mutableDateTime18);
        mutableDateTime18.addSeconds(3);
        int int28 = mutableDateTime18.getMillisOfDay();
        long long29 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime18);
        mutableDateTime18.setMillisOfSecond(633);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.hourOfDay();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime35.dayOfWeek();
        int int42 = property41.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime44 = property41.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime45 = property41.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime46 = property41.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime46.toMutableDateTime();
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        int int53 = mutableDateTime50.getYearOfCentury();
        org.joda.time.Chronology chronology54 = mutableDateTime50.getChronology();
        org.joda.time.MutableDateTime mutableDateTime55 = org.joda.time.MutableDateTime.now(chronology54);
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(chronology54);
        mutableDateTime46.setChronology(chronology54);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) 366, chronology54);
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime18.toMutableDateTime(chronology54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime50", (instant3.compareTo(mutableDateTime50) == 0) == instant3.equals(mutableDateTime50));
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
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology14);
        mutableDateTime15.setMonthOfYear(12);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime20.dayOfWeek();
        int int27 = property26.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime29 = property26.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime30 = property26.roundHalfEven();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime36.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) 'a');
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.Instant instant43 = mutableDateTime42.toInstant();
        mutableDateTime42.setDate((long) 10);
        int int46 = mutableDateTime42.getCenturyOfEra();
        boolean boolean47 = mutableDateTime42.isEqualNow();
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.Instant instant51 = mutableDateTime50.toInstant();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime50.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime53 = property52.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property52.getFieldType();
        int int55 = mutableDateTime42.get(dateTimeFieldType54);
        boolean boolean56 = mutableDateTime39.isSupported(dateTimeFieldType54);
        mutableDateTime36.set(dateTimeFieldType54, (int) (short) 1);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime30.property(dateTimeFieldType54);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime15.property(dateTimeFieldType54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant34", (mutableDateTime2.compareTo(instant34) == 0) == mutableDateTime2.equals(instant34));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        boolean boolean7 = mutableDateTime2.isBefore((long) (short) -1);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology14);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime2.toMutableDateTime(chronology14);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime20.dayOfWeek();
        java.lang.String str27 = mutableDateTime20.toString();
        mutableDateTime20.setMillisOfSecond((int) (short) 10);
        org.joda.time.DateTime dateTime30 = mutableDateTime20.toDateTime();
        boolean boolean31 = mutableDateTime20.isAfterNow();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.Instant instant35 = mutableDateTime34.toInstant();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime34.monthOfYear();
        mutableDateTime34.addSeconds(0);
        java.util.Locale locale39 = null;
        java.util.Calendar calendar40 = mutableDateTime34.toCalendar(locale39);
        java.util.Date date41 = mutableDateTime34.toDate();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.Instant instant45 = mutableDateTime44.toInstant();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime44.monthOfYear();
        mutableDateTime44.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime44.secondOfMinute();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology51);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime55 = property53.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime57 = property53.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField58 = property53.getField();
        mutableDateTime44.setRounding(dateTimeField58);
        mutableDateTime34.setRounding(dateTimeField58, 1);
        int int62 = mutableDateTime20.get(dateTimeField58);
        int int63 = mutableDateTime2.get(dateTimeField58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant35", (mutableDateTime10.compareTo(instant35) == 0) == mutableDateTime10.equals(instant35));
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
        mutableDateTime2.addSeconds(0);
        java.util.Locale locale7 = null;
        java.util.Calendar calendar8 = mutableDateTime2.toCalendar(locale7);
        java.util.Date date9 = mutableDateTime2.toDate();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        mutableDateTime12.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.secondOfMinute();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime25 = property21.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField26 = property21.getField();
        mutableDateTime12.setRounding(dateTimeField26);
        mutableDateTime2.setRounding(dateTimeField26, 1);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        mutableDateTime2.setZone(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime32", (instant3.compareTo(mutableDateTime32) == 0) == instant3.equals(mutableDateTime32));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        int int4 = mutableDateTime2.getYear();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.add((long) (short) -1);
        mutableDateTime10.setWeekOfWeekyear(51);
        mutableDateTime10.setDate((long) (short) 100);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology21);
        mutableDateTime10.setChronology(chronology21);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime2.toMutableDateTime(chronology21);
        int int26 = mutableDateTime2.getMinuteOfHour();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.Instant instant30 = mutableDateTime29.toInstant();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime29.monthOfYear();
        mutableDateTime29.addSeconds(0);
        java.util.Locale locale34 = null;
        java.util.Calendar calendar35 = mutableDateTime29.toCalendar(locale34);
        java.util.Date date36 = mutableDateTime29.toDate();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.Instant instant40 = mutableDateTime39.toInstant();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime39.monthOfYear();
        mutableDateTime39.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.secondOfMinute();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime50 = property48.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime52 = property48.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField53 = property48.getField();
        mutableDateTime39.setRounding(dateTimeField53);
        mutableDateTime29.setRounding(dateTimeField53, 1);
        int int57 = mutableDateTime2.get(dateTimeField53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and instant30", (mutableDateTime17.compareTo(instant30) == 0) == mutableDateTime17.equals(instant30));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.setMonthOfYear((int) (byte) 10);
        mutableDateTime1.setMinuteOfHour(5);
        boolean boolean7 = mutableDateTime1.isBefore((long) (byte) -1);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime13.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = mutableDateTime1.toDateTime(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime16", (instant11.compareTo(mutableDateTime16) == 0) == instant11.equals(mutableDateTime16));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        boolean boolean17 = mutableDateTime8.isBefore((long) (byte) 100);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology19);
        boolean boolean21 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime20);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime27.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime27.yearOfCentury();
        java.lang.String str30 = property29.toString();
        java.util.Locale locale31 = null;
        java.lang.String str32 = property29.getAsShortText(locale31);
        int int33 = property29.get();
        org.joda.time.DurationField durationField34 = property29.getRangeDurationField();
        boolean boolean35 = mutableDateTime20.equals((java.lang.Object) durationField34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        org.joda.time.Instant instant13 = mutableDateTime10.toInstant();
        int int14 = mutableDateTime10.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant13", (mutableDateTime10.compareTo(instant13) == 0) == mutableDateTime10.equals(instant13));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.getMaximumValueOverall();
        org.joda.time.DurationField durationField5 = property3.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        int int7 = property3.getMaximumValue();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        mutableDateTime10.setDate((long) 10);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime16.toString(dateTimeFormatter21);
        int int23 = mutableDateTime10.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        boolean boolean25 = mutableDateTime16.isBefore((long) (byte) 100);
        int int26 = property3.getDifference((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DurationField durationField27 = property3.getLeapDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime16", (instant11.compareTo(mutableDateTime16) == 0) == instant11.equals(mutableDateTime16));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        mutableDateTime2.setZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        mutableDateTime7.setWeekyear(48);
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutableDateTime7.add(readableDuration10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.secondOfDay();
        boolean boolean13 = property12.isLeap();
        java.lang.String str14 = property12.getAsString();
        java.lang.String str15 = property12.getAsShortText();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        mutableDateTime18.setSecondOfDay((int) '#');
        int int22 = mutableDateTime18.getMonthOfYear();
        java.util.Date date23 = mutableDateTime18.toDate();
        long long24 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant19", (mutableDateTime2.compareTo(instant19) == 0) == mutableDateTime2.equals(instant19));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.getMaximumValueOverall();
        org.joda.time.DurationField durationField5 = property3.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        int int10 = mutableDateTime9.getDayOfWeek();
        int int11 = mutableDateTime9.getYear();
        java.lang.Object obj12 = mutableDateTime9.clone();
        long long13 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        mutableDateTime16.setSecondOfMinute((int) '4');
        java.util.Date date19 = mutableDateTime16.toDate();
        org.joda.time.DateTime dateTime20 = mutableDateTime16.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 'a');
        int int23 = mutableDateTime22.getDayOfYear();
        int int24 = mutableDateTime22.getYearOfCentury();
        int int25 = mutableDateTime22.getMillisOfDay();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime35 = property33.addWrapField((int) (short) 1);
        java.util.Locale locale36 = null;
        int int37 = property33.getMaximumShortTextLength(locale36);
        org.joda.time.MutableDateTime mutableDateTime38 = property33.roundCeiling();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.yearOfCentury();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.Instant instant43 = mutableDateTime42.toInstant();
        mutableDateTime42.setDate((long) 10);
        int int46 = mutableDateTime42.getCenturyOfEra();
        boolean boolean47 = mutableDateTime42.isEqualNow();
        mutableDateTime42.add((long) (byte) 10);
        int int50 = mutableDateTime42.getYearOfCentury();
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.Instant instant54 = mutableDateTime53.toInstant();
        mutableDateTime53.setDate((long) 10);
        int int57 = mutableDateTime53.getCenturyOfEra();
        boolean boolean58 = mutableDateTime53.isEqualNow();
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.Instant instant62 = mutableDateTime61.toInstant();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime61.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime64 = property63.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property63.getFieldType();
        int int66 = mutableDateTime53.get(dateTimeFieldType65);
        boolean boolean67 = mutableDateTime42.isSupported(dateTimeFieldType65);
        int int68 = mutableDateTime38.get(dateTimeFieldType65);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime22.property(dateTimeFieldType65);
        int int70 = mutableDateTime16.get(dateTimeFieldType65);
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime9.property(dateTimeFieldType65);
        org.joda.time.DateTimeField dateTimeField72 = property71.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant43", (mutableDateTime9.compareTo(instant43) == 0) == mutableDateTime9.equals(instant43));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        int int7 = property4.get();
        org.joda.time.MutableDateTime mutableDateTime8 = property4.roundCeiling();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime8.toMutableDateTimeISO();
        int int11 = mutableDateTime10.getMillisOfDay();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.hourOfDay();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime14.dayOfWeek();
        int int21 = property20.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime23 = property20.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime24 = property20.roundHalfEven();
        mutableDateTime24.setMillis((long) 365);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        int int32 = mutableDateTime29.getYearOfCentury();
        org.joda.time.Chronology chronology33 = mutableDateTime29.getChronology();
        mutableDateTime24.setChronology(chronology33);
        mutableDateTime10.setMillis((org.joda.time.ReadableInstant) mutableDateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime29", (instant3.compareTo(mutableDateTime29) == 0) == instant3.equals(mutableDateTime29));
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
        mutableDateTime2.addSeconds(0);
        java.util.Locale locale7 = null;
        java.util.Calendar calendar8 = mutableDateTime2.toCalendar(locale7);
        java.util.Date date9 = mutableDateTime2.toDate();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        mutableDateTime12.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.secondOfMinute();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime25 = property21.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField26 = property21.getField();
        mutableDateTime12.setRounding(dateTimeField26);
        mutableDateTime2.setRounding(dateTimeField26, 1);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime2.weekyear();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime2.add(readablePeriod31);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        mutableDateTime35.setHourOfDay(2);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime42.add(readablePeriod45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime42.hourOfDay();
        org.joda.time.DateTimeField dateTimeField48 = property47.getField();
        mutableDateTime35.setRounding(dateTimeField48);
        mutableDateTime2.setRounding(dateTimeField48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime42", (instant13.compareTo(mutableDateTime42) == 0) == instant13.equals(mutableDateTime42));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        boolean boolean18 = mutableDateTime5.isAfterNow();
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutableDateTime5.add(readableDuration19, 6414);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        mutableDateTime12.setMillis((long) 365);
        org.joda.time.Instant instant15 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        int int17 = mutableDateTime16.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant15", (mutableDateTime2.compareTo(instant15) == 0) == mutableDateTime2.equals(instant15));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        int int7 = mutableDateTime4.getYearOfCentury();
        org.joda.time.Chronology chronology8 = mutableDateTime4.getChronology();
        int int9 = mutableDateTime4.getWeekOfWeekyear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTime dateTime14 = mutableDateTime4.toDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology22);
        mutableDateTime15.setDate((org.joda.time.ReadableInstant) mutableDateTime24);
        boolean boolean26 = mutableDateTime15.isEqualNow();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime15);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.Instant instant31 = mutableDateTime30.toInstant();
        mutableDateTime30.setDate((long) 10);
        int int34 = mutableDateTime30.getCenturyOfEra();
        boolean boolean35 = mutableDateTime30.isEqualNow();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.Instant instant39 = mutableDateTime38.toInstant();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime38.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime41 = property40.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property40.getFieldType();
        int int43 = mutableDateTime30.get(dateTimeFieldType42);
        boolean boolean44 = mutableDateTime15.isSupported(dateTimeFieldType42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant31", (mutableDateTime1.compareTo(instant31) == 0) == mutableDateTime1.equals(instant31));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.getMaximumValueOverall();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        mutableDateTime7.setDate((long) 10);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime13.toString(dateTimeFormatter18);
        int int20 = mutableDateTime7.compareTo((org.joda.time.ReadableInstant) mutableDateTime13);
        boolean boolean22 = mutableDateTime13.isBefore((long) (byte) 100);
        int int23 = property3.getDifference((org.joda.time.ReadableInstant) mutableDateTime13);
        java.lang.Class<?> wildcardClass24 = property3.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime13", (instant8.compareTo(mutableDateTime13) == 0) == instant8.equals(mutableDateTime13));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        java.lang.String str8 = property7.toString();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfCeiling();
        int int10 = mutableDateTime9.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime9.add(readableDuration11, (int) (short) -1);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        mutableDateTime16.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.secondOfMinute();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime27 = property25.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = property25.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField30 = property25.getField();
        mutableDateTime16.setRounding(dateTimeField30);
        mutableDateTime9.setRounding(dateTimeField30);
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
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime43.getZone();
        org.joda.time.DateTime dateTime45 = mutableDateTime35.toDateTime(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(dateTimeZone44);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        int int52 = mutableDateTime49.getYearOfCentury();
        org.joda.time.Chronology chronology53 = mutableDateTime49.getChronology();
        int int54 = mutableDateTime49.getWeekOfWeekyear();
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.DateTimeZone dateTimeZone58 = mutableDateTime57.getZone();
        org.joda.time.DateTime dateTime59 = mutableDateTime49.toDateTime(dateTimeZone58);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = null;
        boolean boolean61 = dateTime59.isSupported(dateTimeFieldType60);
        java.util.GregorianCalendar gregorianCalendar62 = dateTime59.toGregorianCalendar();
        java.lang.Object obj63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj63, chronology64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = null;
        java.lang.String str67 = mutableDateTime65.toString(dateTimeFormatter66);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        mutableDateTime65.add(readablePeriod68);
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime65.hourOfDay();
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime65.dayOfWeek();
        int int72 = property71.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime74 = property71.addWrapField(0);
        java.lang.Object obj75 = null;
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime(obj75, chronology76);
        org.joda.time.DateTimeZone dateTimeZone78 = mutableDateTime77.getZone();
        boolean boolean79 = property71.equals((java.lang.Object) dateTimeZone78);
        org.joda.time.DateTime dateTime80 = dateTime59.toDateTime(dateTimeZone78);
        org.joda.time.DateTime dateTime81 = mutableDateTime46.toDateTime(dateTimeZone78);
        mutableDateTime9.setZone(dateTimeZone78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime35", (instant3.compareTo(mutableDateTime35) == 0) == instant3.equals(mutableDateTime35));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        java.lang.String str8 = mutableDateTime2.toString();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.property(dateTimeFieldType15);
        int int17 = property16.getMaximumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant12", (mutableDateTime2.compareTo(instant12) == 0) == mutableDateTime2.equals(instant12));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        java.lang.String str8 = property7.toString();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfCeiling();
        int int10 = mutableDateTime9.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.addWrapField((int) (short) 1);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.secondOfMinute();
        long long24 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime22);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        int int30 = mutableDateTime27.getYearOfCentury();
        org.joda.time.Chronology chronology31 = mutableDateTime27.getChronology();
        int int32 = mutableDateTime27.getWeekOfWeekyear();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        int int38 = mutableDateTime35.getYearOfCentury();
        org.joda.time.Chronology chronology39 = mutableDateTime35.getChronology();
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime27.toMutableDateTime(chronology39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime27.dayOfWeek();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        int int47 = mutableDateTime44.getYearOfCentury();
        org.joda.time.Chronology chronology48 = mutableDateTime44.getChronology();
        int int49 = mutableDateTime44.getWeekOfWeekyear();
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime52.getZone();
        org.joda.time.DateTime dateTime54 = mutableDateTime44.toDateTime(dateTimeZone53);
        mutableDateTime27.setZone(dateTimeZone53);
        mutableDateTime22.setZone(dateTimeZone53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime27", (instant3.compareTo(mutableDateTime27) == 0) == instant3.equals(mutableDateTime27));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.addSeconds(0);
        java.util.Locale locale7 = null;
        java.util.Calendar calendar8 = mutableDateTime2.toCalendar(locale7);
        java.util.Date date9 = mutableDateTime2.toDate();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        mutableDateTime12.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.secondOfMinute();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime25 = property21.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField26 = property21.getField();
        mutableDateTime12.setRounding(dateTimeField26);
        mutableDateTime2.setRounding(dateTimeField26, 1);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime2.weekyear();
        java.lang.String str31 = property30.getAsText();
        java.lang.String str32 = property30.toString();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime34.setMonthOfYear((int) (byte) 10);
        boolean boolean37 = mutableDateTime34.isEqualNow();
        boolean boolean38 = mutableDateTime34.isAfterNow();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        int int45 = mutableDateTime42.getYearOfCentury();
        org.joda.time.Chronology chronology46 = mutableDateTime42.getChronology();
        int int47 = mutableDateTime42.getWeekOfWeekyear();
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.DateTime dateTime52 = mutableDateTime42.toDateTime(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((long) 1970, dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(dateTimeZone51);
        mutableDateTime34.setZoneRetainFields(dateTimeZone51);
        boolean boolean58 = property30.equals((java.lang.Object) mutableDateTime34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime42", (instant3.compareTo(mutableDateTime42) == 0) == instant3.equals(mutableDateTime42));
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 'a');
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        mutableDateTime12.setDate((long) 10);
        int int16 = mutableDateTime12.getCenturyOfEra();
        boolean boolean17 = mutableDateTime12.isEqualNow();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property22.getFieldType();
        int int25 = mutableDateTime12.get(dateTimeFieldType24);
        boolean boolean26 = mutableDateTime9.isSupported(dateTimeFieldType24);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime2.property(dateTimeFieldType24);
        java.lang.String str28 = property27.getAsString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        int int5 = mutableDateTime2.getDayOfYear();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        mutableDateTime8.setTime((long) '#');
        java.util.Locale locale13 = null;
        java.util.Calendar calendar14 = mutableDateTime8.toCalendar(locale13);
        java.util.GregorianCalendar gregorianCalendar15 = mutableDateTime8.toGregorianCalendar();
        int int16 = mutableDateTime8.getYearOfCentury();
        boolean boolean17 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime8);
        int int18 = mutableDateTime2.getDayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime2.toMutableDateTimeISO();
        int int20 = mutableDateTime2.getMillisOfSecond();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.hourOfDay();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime23.dayOfWeek();
        java.util.GregorianCalendar gregorianCalendar30 = mutableDateTime23.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime23.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime32 = property31.roundHalfCeiling();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        mutableDateTime35.addSeconds(0);
        java.util.Locale locale40 = null;
        java.util.Calendar calendar41 = mutableDateTime35.toCalendar(locale40);
        java.util.Date date42 = mutableDateTime35.toDate();
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.Instant instant46 = mutableDateTime45.toInstant();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime45.monthOfYear();
        mutableDateTime45.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.secondOfMinute();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime56 = property54.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime58 = property54.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField59 = property54.getField();
        mutableDateTime45.setRounding(dateTimeField59);
        mutableDateTime35.setRounding(dateTimeField59, 1);
        java.lang.Object obj63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj63, chronology64);
        org.joda.time.Instant instant66 = mutableDateTime65.toInstant();
        mutableDateTime65.setDate((long) 10);
        int int69 = mutableDateTime65.getCenturyOfEra();
        boolean boolean70 = mutableDateTime65.isEqualNow();
        java.lang.Object obj71 = null;
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(obj71, chronology72);
        org.joda.time.Instant instant74 = mutableDateTime73.toInstant();
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime73.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime76 = property75.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = property75.getFieldType();
        int int78 = mutableDateTime65.get(dateTimeFieldType77);
        int int79 = mutableDateTime35.get(dateTimeFieldType77);
        boolean boolean80 = mutableDateTime32.isSupported(dateTimeFieldType77);
        boolean boolean81 = mutableDateTime2.isSupported(dateTimeFieldType77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant36", (mutableDateTime19.compareTo(instant36) == 0) == mutableDateTime19.equals(instant36));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        int int5 = mutableDateTime2.getDayOfYear();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        mutableDateTime8.setTime((long) '#');
        java.util.Locale locale13 = null;
        java.util.Calendar calendar14 = mutableDateTime8.toCalendar(locale13);
        java.util.GregorianCalendar gregorianCalendar15 = mutableDateTime8.toGregorianCalendar();
        int int16 = mutableDateTime8.getYearOfCentury();
        boolean boolean17 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime8);
        mutableDateTime8.setDayOfYear((int) (byte) 10);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        mutableDateTime22.setSecondOfDay((int) '#');
        mutableDateTime22.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime22.year();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.Instant instant35 = mutableDateTime34.toInstant();
        mutableDateTime34.setDate((long) 10);
        int int38 = mutableDateTime34.getCenturyOfEra();
        boolean boolean39 = mutableDateTime34.isEqualNow();
        mutableDateTime34.add((long) (byte) 10);
        int int42 = mutableDateTime34.getYearOfCentury();
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.Instant instant46 = mutableDateTime45.toInstant();
        mutableDateTime45.setDate((long) 10);
        int int49 = mutableDateTime45.getCenturyOfEra();
        boolean boolean50 = mutableDateTime45.isEqualNow();
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.Instant instant54 = mutableDateTime53.toInstant();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime53.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime56 = property55.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property55.getFieldType();
        int int58 = mutableDateTime45.get(dateTimeFieldType57);
        boolean boolean59 = mutableDateTime34.isSupported(dateTimeFieldType57);
        boolean boolean60 = mutableDateTime22.isSupported(dateTimeFieldType57);
        boolean boolean61 = mutableDateTime8.isSupported(dateTimeFieldType57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant23", (mutableDateTime2.compareTo(instant23) == 0) == mutableDateTime2.equals(instant23));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 'a');
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        mutableDateTime12.setDate((long) 10);
        int int16 = mutableDateTime12.getCenturyOfEra();
        boolean boolean17 = mutableDateTime12.isEqualNow();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property22.getFieldType();
        int int25 = mutableDateTime12.get(dateTimeFieldType24);
        boolean boolean26 = mutableDateTime9.isSupported(dateTimeFieldType24);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime2.property(dateTimeFieldType24);
        boolean boolean29 = mutableDateTime2.isEqual((long) 4);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.getMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime31 and instant13", (mutableDateTime31.compareTo(instant13) == 0) == mutableDateTime31.equals(instant13));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime2.add(readableDuration16, 46);
        int int19 = mutableDateTime2.getMinuteOfDay();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(chronology26);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime2.toMutableDateTime(chronology26);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.Instant instant33 = mutableDateTime32.toInstant();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime32.monthOfYear();
        mutableDateTime32.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.secondOfMinute();
        mutableDateTime32.add(1606268683767L);
        boolean boolean40 = mutableDateTime29.isBefore((org.joda.time.ReadableInstant) mutableDateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant33", (mutableDateTime2.compareTo(instant33) == 0) == mutableDateTime2.equals(instant33));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        int int6 = mutableDateTime3.getYearOfCentury();
        org.joda.time.Chronology chronology7 = mutableDateTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology7);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology7);
        java.lang.String str10 = mutableDateTime9.toString();
        mutableDateTime9.add((long) 30);
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 25, chronology13);
        boolean boolean15 = mutableDateTime14.isBeforeNow();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime21.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.yearOfCentury();
        java.lang.String str24 = property23.toString();
        java.util.Locale locale25 = null;
        java.lang.String str26 = property23.getAsShortText(locale25);
        org.joda.time.MutableDateTime mutableDateTime28 = property23.add(12);
        org.joda.time.Interval interval29 = property23.toInterval();
        org.joda.time.MutableDateTime mutableDateTime31 = property23.add(9);
        boolean boolean33 = mutableDateTime31.isAfter((long) 33);
        int int34 = mutableDateTime31.getMonthOfYear();
        mutableDateTime31.addMinutes(414);
        org.joda.time.DateTime dateTime37 = mutableDateTime31.toDateTime();
        org.joda.time.DateTime dateTime38 = mutableDateTime31.toDateTimeISO();
        boolean boolean39 = mutableDateTime14.isEqual((org.joda.time.ReadableInstant) dateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant19", (mutableDateTime3.compareTo(instant19) == 0) == mutableDateTime3.equals(instant19));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        int int16 = mutableDateTime2.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.toMutableDateTimeISO();
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
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(1L, dateTimeZone17);
        mutableDateTime4.setZoneRetainFields(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:52.126Z", dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone28);
        mutableDateTime22.setZone(dateTimeZone28);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.Instant instant35 = mutableDateTime34.toInstant();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime34.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime37 = property36.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime37.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) 'a');
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.Instant instant44 = mutableDateTime43.toInstant();
        mutableDateTime43.setDate((long) 10);
        int int47 = mutableDateTime43.getCenturyOfEra();
        boolean boolean48 = mutableDateTime43.isEqualNow();
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.Instant instant52 = mutableDateTime51.toInstant();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime51.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime54 = property53.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property53.getFieldType();
        int int56 = mutableDateTime43.get(dateTimeFieldType55);
        boolean boolean57 = mutableDateTime40.isSupported(dateTimeFieldType55);
        mutableDateTime37.set(dateTimeFieldType55, (int) (short) 1);
        int int60 = mutableDateTime22.get(dateTimeFieldType55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant35", (mutableDateTime2.compareTo(instant35) == 0) == mutableDateTime2.equals(instant35));
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
        mutableDateTime2.addSeconds(0);
        int int7 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundFloor();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant3", (mutableDateTime9.compareTo(instant3) == 0) == mutableDateTime9.equals(instant3));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime1.setMonthOfYear((int) (byte) 10);
        mutableDateTime1.setMinuteOfHour(5);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        int int15 = property14.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime17 = property14.addWrapField(0);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        mutableDateTime20.setZone(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        mutableDateTime17.setZone(dateTimeZone24);
        mutableDateTime17.addWeekyears((int) (byte) -1);
        int int29 = mutableDateTime17.getMillisOfSecond();
        mutableDateTime17.setWeekyear(146);
        int int32 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime17.add(readablePeriod33, (int) (byte) -1);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.Instant instant39 = mutableDateTime38.toInstant();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime38.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime41 = property40.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime41.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime41.yearOfCentury();
        java.lang.String str44 = property43.toString();
        java.util.Locale locale45 = null;
        java.lang.String str46 = property43.getAsShortText(locale45);
        org.joda.time.MutableDateTime mutableDateTime48 = property43.add(12);
        org.joda.time.Interval interval49 = property43.toInterval();
        java.lang.String str50 = property43.getName();
        org.joda.time.MutableDateTime mutableDateTime51 = property43.getMutableDateTime();
        org.joda.time.Chronology chronology52 = mutableDateTime51.getChronology();
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(chronology52);
        mutableDateTime17.setChronology(chronology52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and instant39", (mutableDateTime20.compareTo(instant39) == 0) == mutableDateTime20.equals(instant39));
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
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 'a');
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        mutableDateTime12.setDate((long) 10);
        int int16 = mutableDateTime12.getCenturyOfEra();
        boolean boolean17 = mutableDateTime12.isEqualNow();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property22.getFieldType();
        int int25 = mutableDateTime12.get(dateTimeFieldType24);
        boolean boolean26 = mutableDateTime9.isSupported(dateTimeFieldType24);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime2.property(dateTimeFieldType24);
        boolean boolean29 = mutableDateTime2.isEqual((long) 4);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime2.dayOfYear();
        int int31 = property30.getMaximumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.getMaximumValueOverall();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        mutableDateTime7.setDate((long) 10);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime13.toString(dateTimeFormatter18);
        int int20 = mutableDateTime7.compareTo((org.joda.time.ReadableInstant) mutableDateTime13);
        boolean boolean22 = mutableDateTime13.isBefore((long) (byte) 100);
        int int23 = property3.getDifference((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime13.copy();
        org.joda.time.DateTime dateTime25 = mutableDateTime24.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime13", (instant8.compareTo(mutableDateTime13) == 0) == instant8.equals(mutableDateTime13));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        int int14 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.dayOfWeek();
        int int25 = property24.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime27 = property24.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime28 = property24.roundHalfEven();
        mutableDateTime28.setMillis((long) 365);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        mutableDateTime28.setChronology(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) (short) 0, chronology37);
        mutableDateTime10.setChronology(chronology37);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.Instant instant44 = mutableDateTime43.toInstant();
        mutableDateTime43.setDate((long) 10);
        int int47 = mutableDateTime43.getCenturyOfEra();
        boolean boolean48 = mutableDateTime43.isEqualNow();
        int int49 = mutableDateTime43.getDayOfYear();
        org.joda.time.Chronology chronology50 = mutableDateTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(chronology50);
        mutableDateTime10.setChronology(chronology50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant44", (mutableDateTime2.compareTo(instant44) == 0) == mutableDateTime2.equals(instant44));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        mutableDateTime5.setWeekOfWeekyear(51);
        mutableDateTime5.setDate((long) (short) 100);
        long long10 = mutableDateTime5.getMillis();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        mutableDateTime13.setHourOfDay(2);
        java.lang.Object obj18 = mutableDateTime13.clone();
        org.joda.time.DateTime dateTime19 = mutableDateTime13.toDateTimeISO();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        mutableDateTime22.setDate((long) 10);
        int int26 = mutableDateTime22.getCenturyOfEra();
        boolean boolean27 = mutableDateTime22.isEqualNow();
        mutableDateTime22.add((long) (byte) 10);
        int int30 = mutableDateTime22.getYearOfCentury();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        mutableDateTime33.setDate((long) 10);
        int int37 = mutableDateTime33.getCenturyOfEra();
        boolean boolean38 = mutableDateTime33.isEqualNow();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.Instant instant42 = mutableDateTime41.toInstant();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime41.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime44 = property43.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property43.getFieldType();
        int int46 = mutableDateTime33.get(dateTimeFieldType45);
        boolean boolean47 = mutableDateTime22.isSupported(dateTimeFieldType45);
        boolean boolean48 = dateTime19.isSupported(dateTimeFieldType45);
        boolean boolean49 = mutableDateTime5.isSupported(dateTimeFieldType45);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        int int55 = mutableDateTime52.getYearOfCentury();
        org.joda.time.Chronology chronology56 = mutableDateTime52.getChronology();
        org.joda.time.MutableDateTime mutableDateTime57 = org.joda.time.MutableDateTime.now(chronology56);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(chronology56);
        org.joda.time.Chronology chronology59 = mutableDateTime58.getChronology();
        boolean boolean60 = mutableDateTime58.isBeforeNow();
        org.joda.time.Chronology chronology61 = mutableDateTime58.getChronology();
        org.joda.time.Chronology chronology62 = mutableDateTime58.getChronology();
        mutableDateTime5.setChronology(chronology62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant23 and mutableDateTime52", (instant23.compareTo(mutableDateTime52) == 0) == instant23.equals(mutableDateTime52));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.getMaximumValueOverall();
        org.joda.time.DurationField durationField5 = property3.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.getMutableDateTime();
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        java.util.Date date8 = mutableDateTime6.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant7", (mutableDateTime6.compareTo(instant7) == 0) == mutableDateTime6.equals(instant7));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        int int7 = property4.get();
        org.joda.time.MutableDateTime mutableDateTime8 = property4.roundCeiling();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.yearOfCentury();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.yearOfCentury();
        java.lang.String str18 = property17.toString();
        java.util.Locale locale19 = null;
        java.lang.String str20 = property17.getAsShortText(locale19);
        org.joda.time.MutableDateTime mutableDateTime22 = property17.add(12);
        org.joda.time.Interval interval23 = property17.toInterval();
        java.lang.String str24 = property17.getName();
        org.joda.time.MutableDateTime mutableDateTime25 = property17.getMutableDateTime();
        org.joda.time.Chronology chronology26 = mutableDateTime25.getChronology();
        org.joda.time.DateTime dateTime27 = mutableDateTime8.toDateTime(chronology26);
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
        org.joda.time.MutableDateTime mutableDateTime40 = property36.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime41 = property36.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime41.toMutableDateTime();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology44);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime45.dayOfYear();
        mutableDateTime45.setYear((int) (short) -1);
        boolean boolean49 = mutableDateTime42.isBefore((org.joda.time.ReadableInstant) mutableDateTime45);
        boolean boolean50 = mutableDateTime8.isAfter((org.joda.time.ReadableInstant) mutableDateTime42);
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = null;
        java.lang.String str56 = mutableDateTime54.toString(dateTimeFormatter55);
        int int57 = mutableDateTime54.getYearOfCentury();
        org.joda.time.Chronology chronology58 = mutableDateTime54.getChronology();
        org.joda.time.MutableDateTime mutableDateTime59 = org.joda.time.MutableDateTime.now(chronology58);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(chronology58);
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(chronology58);
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(1606268705422L, chronology58);
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime42, chronology58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime54", (instant3.compareTo(mutableDateTime54) == 0) == instant3.equals(mutableDateTime54));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        mutableDateTime12.setDate((long) 10);
        mutableDateTime12.setDayOfYear((int) ' ');
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 10);
        mutableDateTime20.setMonthOfYear((int) (byte) 10);
        mutableDateTime20.setMinuteOfHour(5);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.yearOfEra();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime35 = property33.addWrapField((int) (short) 1);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.secondOfMinute();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.hourOfDay();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        mutableDateTime40.setZone(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime40.getZone();
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone44);
        long long46 = property37.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime45);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        int int52 = mutableDateTime49.getYearOfCentury();
        org.joda.time.Chronology chronology53 = mutableDateTime49.getChronology();
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now(chronology53);
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime45.toMutableDateTime(chronology53);
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime20.toMutableDateTime(chronology53);
        org.joda.time.MutableDateTime mutableDateTime57 = mutableDateTime12.toMutableDateTime(chronology53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        boolean boolean17 = mutableDateTime8.isBefore((long) (byte) 100);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology19);
        boolean boolean21 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime20);
        mutableDateTime20.setDayOfYear(4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfEra();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) (short) -1);
        mutableDateTime13.setWeekOfWeekyear(51);
        mutableDateTime13.setDate((long) (short) 100);
        long long18 = mutableDateTime13.getMillis();
        mutableDateTime13.setMillis((long) 49);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:52.126Z", dateTimeZone25);
        org.joda.time.DateTime dateTime27 = mutableDateTime13.toDateTime(dateTimeZone25);
        mutableDateTime2.setZoneRetainFields(dateTimeZone25);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime2.millisOfSecond();
        org.joda.time.DurationField durationField30 = property29.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfEra();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) (short) -1);
        mutableDateTime13.setWeekOfWeekyear(51);
        mutableDateTime13.setDate((long) (short) 100);
        long long18 = mutableDateTime13.getMillis();
        mutableDateTime13.setMillis((long) 49);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:52.126Z", dateTimeZone25);
        org.joda.time.DateTime dateTime27 = mutableDateTime13.toDateTime(dateTimeZone25);
        mutableDateTime2.setZoneRetainFields(dateTimeZone25);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime2.millisOfSecond();
        java.util.GregorianCalendar gregorianCalendar30 = mutableDateTime2.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.dayOfWeek();
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
        mutableDateTime2.setZone(dateTimeZone28);
        boolean boolean31 = mutableDateTime2.isAfterNow();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime2.dayOfMonth();
        int int33 = property32.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime34 = property32.roundCeiling();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableDateTime37.add(readablePeriod40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime37.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime44 = property42.addWrapField((int) (short) 1);
        java.util.Locale locale45 = null;
        int int46 = property42.getMaximumShortTextLength(locale45);
        int int47 = property42.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime48 = property42.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime49 = property42.roundFloor();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime49.dayOfWeek();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime49.era();
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.Instant instant55 = mutableDateTime54.toInstant();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime54.monthOfYear();
        mutableDateTime54.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime54.secondOfMinute();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology61);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime62.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime65 = property63.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime67 = property63.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField68 = property63.getField();
        mutableDateTime54.setRounding(dateTimeField68);
        mutableDateTime49.setRounding(dateTimeField68);
        int int71 = mutableDateTime34.get(dateTimeField68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant55", (mutableDateTime10.compareTo(instant55) == 0) == mutableDateTime10.equals(instant55));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.addMillis((int) 'a');
        int int15 = mutableDateTime12.getDayOfYear();
        java.util.Date date16 = mutableDateTime12.toDate();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime12.toMutableDateTimeISO();
        int int18 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.centuryOfEra();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.year();
        int int21 = mutableDateTime17.getWeekOfWeekyear();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        int int25 = mutableDateTime24.getDayOfWeek();
        int int26 = mutableDateTime24.getYear();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime32 = property30.add((long) (short) -1);
        mutableDateTime32.setWeekOfWeekyear(51);
        mutableDateTime32.setDate((long) (short) 100);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        int int42 = mutableDateTime39.getYearOfCentury();
        org.joda.time.Chronology chronology43 = mutableDateTime39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(chronology43);
        mutableDateTime32.setChronology(chronology43);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime24.toMutableDateTime(chronology43);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology49);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime50.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime53 = property51.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime55 = property51.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField56 = property51.getField();
        int int57 = mutableDateTime47.get(dateTimeField56);
        mutableDateTime17.setRounding(dateTimeField56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
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
        java.lang.Object obj16 = mutableDateTime2.clone();
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology6);
        java.lang.String str9 = mutableDateTime8.toString();
        mutableDateTime8.add((long) 30);
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        int int13 = mutableDateTime8.getHourOfDay();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime19.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.yearOfCentury();
        java.lang.String str22 = property21.toString();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property21.getAsShortText(locale23);
        org.joda.time.MutableDateTime mutableDateTime26 = property21.add(12);
        org.joda.time.Interval interval27 = property21.toInterval();
        org.joda.time.MutableDateTime mutableDateTime29 = property21.add(9);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.dayOfWeek();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology32);
        mutableDateTime33.addMillis((int) 'a');
        int int36 = mutableDateTime33.getDayOfYear();
        java.lang.Object obj37 = mutableDateTime33.clone();
        int int38 = mutableDateTime33.getDayOfWeek();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.Instant instant42 = mutableDateTime41.toInstant();
        mutableDateTime41.setDate((long) 10);
        int int45 = mutableDateTime41.getCenturyOfEra();
        boolean boolean46 = mutableDateTime41.isEqualNow();
        mutableDateTime41.add((long) (byte) 10);
        int int49 = mutableDateTime41.getYearOfCentury();
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.Instant instant53 = mutableDateTime52.toInstant();
        mutableDateTime52.setDate((long) 10);
        int int56 = mutableDateTime52.getCenturyOfEra();
        boolean boolean57 = mutableDateTime52.isEqualNow();
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.Instant instant61 = mutableDateTime60.toInstant();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime60.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime63 = property62.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = property62.getFieldType();
        int int65 = mutableDateTime52.get(dateTimeFieldType64);
        boolean boolean66 = mutableDateTime41.isSupported(dateTimeFieldType64);
        int int67 = mutableDateTime33.get(dateTimeFieldType64);
        boolean boolean68 = mutableDateTime29.isSupported(dateTimeFieldType64);
        int int69 = mutableDateTime8.get(dateTimeFieldType64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant17", (mutableDateTime2.compareTo(instant17) == 0) == mutableDateTime2.equals(instant17));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.toMutableDateTimeISO();
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
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(1L, dateTimeZone17);
        mutableDateTime4.setZoneRetainFields(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:52.126Z", dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone28);
        mutableDateTime22.setZone(dateTimeZone28);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime22.minuteOfHour();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        mutableDateTime35.addSeconds(0);
        mutableDateTime35.setMillis((long) 4);
        java.lang.String str42 = mutableDateTime35.toString();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime35.hourOfDay();
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableDateTime46.add(readablePeriod49);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime53 = property51.addWrapField((int) (short) 1);
        int int54 = property51.get();
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = mutableDateTime57.toString(dateTimeFormatter58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        mutableDateTime57.add(readablePeriod60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime57.hourOfDay();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime57.dayOfWeek();
        java.lang.String str64 = mutableDateTime57.toString();
        mutableDateTime57.setMillisOfSecond((int) (short) 10);
        long long67 = property51.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime57);
        java.lang.Object obj68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(obj68, chronology69);
        org.joda.time.DateTimeZone dateTimeZone71 = mutableDateTime70.getZone();
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        mutableDateTime70.setZone(dateTimeZone72);
        org.joda.time.DateTimeZone dateTimeZone74 = mutableDateTime70.getZone();
        int int75 = property51.getDifference((org.joda.time.ReadableInstant) mutableDateTime70);
        mutableDateTime70.setSecondOfMinute(5);
        long long78 = property43.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime70);
        int int79 = mutableDateTime70.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime70.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime82 = property80.addWrapField((int) '4');
        boolean boolean83 = mutableDateTime22.isBefore((org.joda.time.ReadableInstant) mutableDateTime82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant36", (mutableDateTime2.compareTo(instant36) == 0) == mutableDateTime2.equals(instant36));
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
        mutableDateTime2.addSeconds(0);
        mutableDateTime2.setMillis((long) 4);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.hourOfDay();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        int int14 = mutableDateTime12.getSecondOfMinute();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        mutableDateTime17.setZone(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime17.getZone();
        mutableDateTime12.setZoneRetainFields(dateTimeZone21);
        mutableDateTime12.addMillis(1);
        mutableDateTime12.setMinuteOfHour(49);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime12.weekyear();
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime12.toMutableDateTime();
        int int29 = property9.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.getMaximumValueOverall();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        mutableDateTime7.setDate((long) 10);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime13.toString(dateTimeFormatter18);
        int int20 = mutableDateTime7.compareTo((org.joda.time.ReadableInstant) mutableDateTime13);
        boolean boolean22 = mutableDateTime13.isBefore((long) (byte) 100);
        int int23 = property3.getDifference((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime13.copy();
        int int25 = mutableDateTime13.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime24", (instant8.compareTo(mutableDateTime24) == 0) == instant8.equals(mutableDateTime24));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.dayOfWeek();
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
        mutableDateTime2.setZone(dateTimeZone28);
        org.joda.time.Instant instant31 = mutableDateTime2.toInstant();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar39 = mutableDateTime38.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime38.getZone();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:30.065Z", dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime43 = instant31.toMutableDateTime(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant36", (mutableDateTime2.compareTo(instant36) == 0) == mutableDateTime2.equals(instant36));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.getMaximumValueOverall();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        mutableDateTime7.setDate((long) 10);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime13.toString(dateTimeFormatter18);
        int int20 = mutableDateTime7.compareTo((org.joda.time.ReadableInstant) mutableDateTime13);
        boolean boolean22 = mutableDateTime13.isBefore((long) (byte) 100);
        int int23 = property3.getDifference((org.joda.time.ReadableInstant) mutableDateTime13);
        int int24 = property3.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime13", (instant8.compareTo(mutableDateTime13) == 0) == instant8.equals(mutableDateTime13));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
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
        int int16 = dateTime12.getEra();
        org.joda.time.Instant instant17 = dateTime12.toInstant();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime27 = property25.addWrapField((int) (short) 1);
        int int28 = mutableDateTime27.getEra();
        boolean boolean29 = dateTime12.equals((java.lang.Object) mutableDateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant17", (mutableDateTime2.compareTo(instant17) == 0) == mutableDateTime2.equals(instant17));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.addWrapField((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime17 = property14.roundFloor();
        mutableDateTime17.setDate((long) 4);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property23.add((long) (short) -1);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        int int33 = mutableDateTime28.getWeekOfWeekyear();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        org.joda.time.DateTime dateTime38 = mutableDateTime28.toDateTime(dateTimeZone37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        boolean boolean40 = dateTime38.isSupported(dateTimeFieldType39);
        int int41 = dateTime38.getSecondOfMinute();
        int int42 = dateTime38.getEra();
        int int43 = property23.compareTo((org.joda.time.ReadableInstant) dateTime38);
        mutableDateTime17.setTime((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime51 = property49.add((long) (short) -1);
        mutableDateTime51.setWeekOfWeekyear(51);
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime51.getZone();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((long) (short) -1, dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(dateTimeZone54);
        org.joda.time.DateTime dateTime57 = mutableDateTime17.toDateTime(dateTimeZone54);
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime6.toMutableDateTime(dateTimeZone54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(chronology6);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime13.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime13.getZone();
        mutableDateTime7.setZone(dateTimeZone15);
        int int17 = mutableDateTime7.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant11", (mutableDateTime2.compareTo(instant11) == 0) == mutableDateTime2.equals(instant11));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.weekyear();
        int int8 = mutableDateTime6.getMillisOfSecond();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.addWrapField((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime19 = property16.roundFloor();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.minuteOfDay();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        mutableDateTime23.setHourOfDay(2);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime30.add(readablePeriod33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.hourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = property35.getField();
        mutableDateTime23.setRounding(dateTimeField36);
        mutableDateTime19.setRounding(dateTimeField36);
        int int39 = mutableDateTime6.get(dateTimeField36);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        int int44 = mutableDateTime42.getSecondOfMinute();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime47.getZone();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        mutableDateTime47.setZone(dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime47.getZone();
        mutableDateTime42.setZoneRetainFields(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(dateTimeZone51);
        mutableDateTime6.setZone(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime30", (instant3.compareTo(mutableDateTime30) == 0) == instant3.equals(mutableDateTime30));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        java.lang.String str8 = property7.toString();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property7.getAsShortText(locale9);
        org.joda.time.MutableDateTime mutableDateTime12 = property7.add(12);
        org.joda.time.MutableDateTime mutableDateTime13 = property7.roundHalfFloor();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.add((long) (short) -1);
        mutableDateTime19.setWeekOfWeekyear(51);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.yearOfCentury();
        int int23 = mutableDateTime19.getEra();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(chronology30);
        java.lang.String str33 = mutableDateTime32.toString();
        mutableDateTime32.add((long) 30);
        org.joda.time.Chronology chronology36 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime19.toMutableDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime13.toMutableDateTime(chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime26", (instant3.compareTo(mutableDateTime26) == 0) == instant3.equals(mutableDateTime26));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        mutableDateTime14.setZone(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        mutableDateTime11.setZone(dateTimeZone18);
        mutableDateTime11.addWeekyears((int) (byte) -1);
        int int23 = mutableDateTime11.getMillisOfSecond();
        mutableDateTime11.setWeekyear(146);
        java.lang.String str26 = mutableDateTime11.toString();
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime11.getZone();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology29);
        mutableDateTime30.addMillis((int) 'a');
        int int33 = mutableDateTime30.getDayOfYear();
        java.lang.Object obj34 = mutableDateTime30.clone();
        int int35 = mutableDateTime30.getDayOfWeek();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.Instant instant39 = mutableDateTime38.toInstant();
        mutableDateTime38.setDate((long) 10);
        int int42 = mutableDateTime38.getCenturyOfEra();
        boolean boolean43 = mutableDateTime38.isEqualNow();
        mutableDateTime38.add((long) (byte) 10);
        int int46 = mutableDateTime38.getYearOfCentury();
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.Instant instant50 = mutableDateTime49.toInstant();
        mutableDateTime49.setDate((long) 10);
        int int53 = mutableDateTime49.getCenturyOfEra();
        boolean boolean54 = mutableDateTime49.isEqualNow();
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.Instant instant58 = mutableDateTime57.toInstant();
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime57.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime60 = property59.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = property59.getFieldType();
        int int62 = mutableDateTime49.get(dateTimeFieldType61);
        boolean boolean63 = mutableDateTime38.isSupported(dateTimeFieldType61);
        int int64 = mutableDateTime30.get(dateTimeFieldType61);
        boolean boolean65 = mutableDateTime11.isSupported(dateTimeFieldType61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant39", (mutableDateTime14.compareTo(instant39) == 0) == mutableDateTime14.equals(instant39));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar7 = mutableDateTime6.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:30.065Z", dateTimeZone8);
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone8);
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
        java.lang.String str25 = mutableDateTime24.toString();
        long long26 = mutableDateTime24.getMillis();
        boolean boolean28 = mutableDateTime24.isEqual((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime24.toMutableDateTimeISO();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        int int35 = mutableDateTime32.getYearOfCentury();
        org.joda.time.Chronology chronology36 = mutableDateTime32.getChronology();
        int int37 = mutableDateTime32.getWeekOfWeekyear();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.DateTime dateTime42 = mutableDateTime32.toDateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone41);
        mutableDateTime24.setZone(dateTimeZone41);
        mutableDateTime10.setZoneRetainFields(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime32", (instant4.compareTo(mutableDateTime32) == 0) == instant4.equals(mutableDateTime32));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getCenturyOfEra();
        boolean boolean7 = mutableDateTime2.isEqualNow();
        mutableDateTime2.add((long) (byte) 10);
        int int10 = mutableDateTime2.getYearOfCentury();
        java.util.Date date11 = mutableDateTime2.toDate();
        mutableDateTime2.setMinuteOfDay(15);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.addWrapField((int) (short) 10);
        mutableDateTime24.addWeeks(30);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:52.126Z", dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime24, dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime2.toMutableDateTime(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime30", (instant3.compareTo(mutableDateTime30) == 0) == instant3.equals(mutableDateTime30));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime2.add(readableDuration16, 46);
        boolean boolean20 = mutableDateTime2.isBefore((long) 59);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.monthOfYear();
        mutableDateTime23.addSeconds(0);
        mutableDateTime23.setMillis((long) 4);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime23.hourOfDay();
        org.joda.time.Interval interval31 = property30.toInterval();
        org.joda.time.MutableDateTime mutableDateTime32 = property30.roundFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property30.getFieldType();
        int int34 = mutableDateTime2.get(dateTimeFieldType33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant24", (mutableDateTime10.compareTo(instant24) == 0) == mutableDateTime10.equals(instant24));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.util.Locale locale7 = null;
        java.util.Calendar calendar8 = mutableDateTime2.toCalendar(locale7);
        java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.millisOfDay();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.monthOfYear();
        int int12 = mutableDateTime2.getRoundingMode();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.hourOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime15.dayOfWeek();
        int int22 = property21.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime24 = property21.addWrapField(0);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        mutableDateTime27.setZone(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime27.getZone();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        mutableDateTime24.setZone(dateTimeZone31);
        mutableDateTime24.addWeekyears((int) (byte) -1);
        int int36 = mutableDateTime24.getMillisOfSecond();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        int int42 = mutableDateTime39.getYearOfCentury();
        org.joda.time.Chronology chronology43 = mutableDateTime39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now(chronology43);
        mutableDateTime24.setChronology(chronology43);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime2.toMutableDateTime(chronology43);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) 'a');
        int int50 = mutableDateTime49.getDayOfYear();
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = null;
        java.lang.String str55 = mutableDateTime53.toString(dateTimeFormatter54);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        mutableDateTime53.add(readablePeriod56);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime53.hourOfDay();
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime53.dayOfWeek();
        java.lang.String str60 = mutableDateTime53.toString();
        mutableDateTime53.setMillisOfSecond((int) (short) 10);
        org.joda.time.DateTime dateTime63 = mutableDateTime53.toDateTime();
        boolean boolean64 = mutableDateTime53.isAfterNow();
        java.lang.Object obj65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(obj65, chronology66);
        org.joda.time.Instant instant68 = mutableDateTime67.toInstant();
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime67.monthOfYear();
        mutableDateTime67.addSeconds(0);
        java.util.Locale locale72 = null;
        java.util.Calendar calendar73 = mutableDateTime67.toCalendar(locale72);
        java.util.Date date74 = mutableDateTime67.toDate();
        java.lang.Object obj75 = null;
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime(obj75, chronology76);
        org.joda.time.Instant instant78 = mutableDateTime77.toInstant();
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime77.monthOfYear();
        mutableDateTime77.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime77.secondOfMinute();
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.MutableDateTime mutableDateTime85 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology84);
        org.joda.time.MutableDateTime.Property property86 = mutableDateTime85.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime88 = property86.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime90 = property86.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField91 = property86.getField();
        mutableDateTime77.setRounding(dateTimeField91);
        mutableDateTime67.setRounding(dateTimeField91, 1);
        int int95 = mutableDateTime53.get(dateTimeField91);
        int int96 = mutableDateTime49.get(dateTimeField91);
        int int97 = mutableDateTime2.get(dateTimeField91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime27 and instant68", (mutableDateTime27.compareTo(instant68) == 0) == mutableDateTime27.equals(instant68));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 'a');
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        mutableDateTime12.setDate((long) 10);
        int int16 = mutableDateTime12.getCenturyOfEra();
        boolean boolean17 = mutableDateTime12.isEqualNow();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property22.getFieldType();
        int int25 = mutableDateTime12.get(dateTimeFieldType24);
        boolean boolean26 = mutableDateTime9.isSupported(dateTimeFieldType24);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime2.property(dateTimeFieldType24);
        boolean boolean29 = mutableDateTime2.isEqual((long) 4);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime2.dayOfYear();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(chronology37);
        mutableDateTime39.add((long) 59);
        int int42 = mutableDateTime39.getHourOfDay();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime47.getZone();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:52.126Z", dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone48);
        org.joda.time.DateTime dateTime51 = mutableDateTime39.toDateTime(dateTimeZone48);
        mutableDateTime39.addMinutes(0);
        int int54 = property30.getDifference((org.joda.time.ReadableInstant) mutableDateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        int int6 = mutableDateTime3.getYearOfCentury();
        org.joda.time.Chronology chronology7 = mutableDateTime3.getChronology();
        int int8 = mutableDateTime3.getWeekOfWeekyear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTime dateTime13 = mutableDateTime3.toDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 1970, dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfWeek();
        org.joda.time.ReadableInstant readableInstant19 = null;
        long long20 = property18.getDifferenceAsLong(readableInstant19);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        mutableDateTime23.setHourOfDay(2);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime33 = property31.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime35 = property31.addWrapField((int) 'a');
        org.joda.time.DateTimeField dateTimeField36 = property31.getField();
        mutableDateTime23.setRounding(dateTimeField36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime23.hourOfDay();
        int int39 = mutableDateTime23.getYearOfCentury();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology41);
        mutableDateTime42.addMillis((int) 'a');
        int int45 = mutableDateTime42.getDayOfYear();
        java.util.Date date46 = mutableDateTime42.toDate();
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime42.toMutableDateTimeISO();
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        mutableDateTime50.add(readablePeriod53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime50.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime57 = property55.addWrapField((int) (short) 1);
        java.util.Locale locale58 = null;
        int int59 = property55.getMaximumShortTextLength(locale58);
        org.joda.time.MutableDateTime mutableDateTime60 = property55.roundCeiling();
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime60.yearOfCentury();
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.Instant instant65 = mutableDateTime64.toInstant();
        mutableDateTime64.setDate((long) 10);
        int int68 = mutableDateTime64.getCenturyOfEra();
        boolean boolean69 = mutableDateTime64.isEqualNow();
        mutableDateTime64.add((long) (byte) 10);
        int int72 = mutableDateTime64.getYearOfCentury();
        java.lang.Object obj73 = null;
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(obj73, chronology74);
        org.joda.time.Instant instant76 = mutableDateTime75.toInstant();
        mutableDateTime75.setDate((long) 10);
        int int79 = mutableDateTime75.getCenturyOfEra();
        boolean boolean80 = mutableDateTime75.isEqualNow();
        java.lang.Object obj81 = null;
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.MutableDateTime mutableDateTime83 = new org.joda.time.MutableDateTime(obj81, chronology82);
        org.joda.time.Instant instant84 = mutableDateTime83.toInstant();
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime83.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime86 = property85.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = property85.getFieldType();
        int int88 = mutableDateTime75.get(dateTimeFieldType87);
        boolean boolean89 = mutableDateTime64.isSupported(dateTimeFieldType87);
        int int90 = mutableDateTime60.get(dateTimeFieldType87);
        org.joda.time.MutableDateTime.Property property91 = mutableDateTime42.property(dateTimeFieldType87);
        int int92 = mutableDateTime23.get(dateTimeFieldType87);
        int int93 = mutableDateTime23.getSecondOfDay();
        int int94 = property18.compareTo((org.joda.time.ReadableInstant) mutableDateTime23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant65", (mutableDateTime3.compareTo(instant65) == 0) == mutableDateTime3.equals(instant65));
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
        mutableDateTime2.addSeconds(0);
        mutableDateTime2.setMillis((long) 4);
        java.lang.String str9 = mutableDateTime2.toString();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.hourOfDay();
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
        java.lang.String str31 = mutableDateTime24.toString();
        mutableDateTime24.setMillisOfSecond((int) (short) 10);
        long long34 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime24);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        mutableDateTime37.setZone(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime37.getZone();
        int int42 = property18.getDifference((org.joda.time.ReadableInstant) mutableDateTime37);
        mutableDateTime37.setSecondOfMinute(5);
        long long45 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime37);
        int int46 = mutableDateTime37.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime37.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime49 = property47.addWrapField((int) '4');
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime52.getZone();
        int int54 = mutableDateTime52.getSecondOfMinute();
        int int55 = mutableDateTime52.getDayOfYear();
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        mutableDateTime58.setTime((long) '#');
        java.util.Locale locale63 = null;
        java.util.Calendar calendar64 = mutableDateTime58.toCalendar(locale63);
        java.util.GregorianCalendar gregorianCalendar65 = mutableDateTime58.toGregorianCalendar();
        int int66 = mutableDateTime58.getYearOfCentury();
        boolean boolean67 = mutableDateTime52.isEqual((org.joda.time.ReadableInstant) mutableDateTime58);
        int int68 = mutableDateTime52.getDayOfMonth();
        java.util.Locale locale69 = null;
        java.util.Calendar calendar70 = mutableDateTime52.toCalendar(locale69);
        boolean boolean71 = mutableDateTime49.equals((java.lang.Object) locale69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime52", (instant3.compareTo(mutableDateTime52) == 0) == instant3.equals(mutableDateTime52));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.weekOfWeekyear();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime24.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.yearOfCentury();
        java.lang.String str27 = property26.toString();
        java.util.Locale locale28 = null;
        java.lang.String str29 = property26.getAsShortText(locale28);
        org.joda.time.MutableDateTime mutableDateTime31 = property26.add(12);
        org.joda.time.Interval interval32 = property26.toInterval();
        java.lang.String str33 = property26.getName();
        org.joda.time.DurationField durationField34 = property26.getRangeDurationField();
        java.lang.String str35 = property26.getAsShortText();
        int int36 = property26.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime37 = property26.getMutableDateTime();
        mutableDateTime37.setMinuteOfHour(35);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) 'a');
        int int42 = mutableDateTime41.getDayOfYear();
        int int43 = mutableDateTime41.getYearOfCentury();
        int int44 = mutableDateTime41.getMillisOfDay();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        mutableDateTime47.add(readablePeriod50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime47.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime54 = property52.addWrapField((int) (short) 1);
        java.util.Locale locale55 = null;
        int int56 = property52.getMaximumShortTextLength(locale55);
        org.joda.time.MutableDateTime mutableDateTime57 = property52.roundCeiling();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime57.yearOfCentury();
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.Instant instant62 = mutableDateTime61.toInstant();
        mutableDateTime61.setDate((long) 10);
        int int65 = mutableDateTime61.getCenturyOfEra();
        boolean boolean66 = mutableDateTime61.isEqualNow();
        mutableDateTime61.add((long) (byte) 10);
        int int69 = mutableDateTime61.getYearOfCentury();
        java.lang.Object obj70 = null;
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(obj70, chronology71);
        org.joda.time.Instant instant73 = mutableDateTime72.toInstant();
        mutableDateTime72.setDate((long) 10);
        int int76 = mutableDateTime72.getCenturyOfEra();
        boolean boolean77 = mutableDateTime72.isEqualNow();
        java.lang.Object obj78 = null;
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime(obj78, chronology79);
        org.joda.time.Instant instant81 = mutableDateTime80.toInstant();
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime80.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime83 = property82.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = property82.getFieldType();
        int int85 = mutableDateTime72.get(dateTimeFieldType84);
        boolean boolean86 = mutableDateTime61.isSupported(dateTimeFieldType84);
        int int87 = mutableDateTime57.get(dateTimeFieldType84);
        org.joda.time.MutableDateTime.Property property88 = mutableDateTime41.property(dateTimeFieldType84);
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime37.property(dateTimeFieldType84);
        org.joda.time.MutableDateTime.Property property90 = mutableDateTime17.property(dateTimeFieldType84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and instant22", (mutableDateTime17.compareTo(instant22) == 0) == mutableDateTime17.equals(instant22));
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
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.dayOfWeek();
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
        mutableDateTime2.setZone(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime2.toMutableDateTimeISO();
        mutableDateTime31.addHours(12);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.Instant instant37 = mutableDateTime36.toInstant();
        mutableDateTime36.setSecondOfDay((int) '#');
        mutableDateTime36.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime36.year();
        mutableDateTime36.addMonths(330);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology49);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime50.dayOfYear();
        int int52 = property51.getMaximumValueOverall();
        org.joda.time.DurationField durationField53 = property51.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField54 = property51.getField();
        int int55 = mutableDateTime36.get(dateTimeField54);
        mutableDateTime36.setDate((long) 30);
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.Instant instant61 = mutableDateTime60.toInstant();
        mutableDateTime60.setDate((long) 10);
        int int64 = mutableDateTime60.getCenturyOfEra();
        boolean boolean65 = mutableDateTime60.isEqualNow();
        int int66 = mutableDateTime60.getDayOfYear();
        org.joda.time.Chronology chronology67 = mutableDateTime60.getChronology();
        mutableDateTime36.setChronology(chronology67);
        org.joda.time.DateTimeZone dateTimeZone69 = mutableDateTime36.getZone();
        mutableDateTime31.setZoneRetainFields(dateTimeZone69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant37", (mutableDateTime10.compareTo(instant37) == 0) == mutableDateTime10.equals(instant37));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar7 = mutableDateTime6.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:30.065Z", dateTimeZone8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.era();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        mutableDateTime13.addMillis((int) 'a');
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:43:52.126Z", dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime13.toMutableDateTime(dateTimeZone21);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(chronology32);
        org.joda.time.Chronology chronology35 = mutableDateTime34.getChronology();
        mutableDateTime13.setChronology(chronology35);
        boolean boolean37 = property10.equals((java.lang.Object) mutableDateTime13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime20", (instant4.compareTo(mutableDateTime20) == 0) == instant4.equals(mutableDateTime20));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.add((long) (short) -1);
        mutableDateTime5.setWeekOfWeekyear(51);
        mutableDateTime5.setDate((long) (short) 100);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime12.dayOfWeek();
        int int19 = property18.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime21 = property18.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime22 = property18.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime23 = property18.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime23.toMutableDateTime();
        int int25 = mutableDateTime24.getMonthOfYear();
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.Instant instant27 = mutableDateTime5.toInstant();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime5.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant27", (mutableDateTime5.compareTo(instant27) == 0) == mutableDateTime5.equals(instant27));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime2.dayOfWeek();
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
        mutableDateTime2.setZone(dateTimeZone28);
        org.joda.time.Instant instant31 = mutableDateTime2.toInstant();
        boolean boolean33 = mutableDateTime2.equals((java.lang.Object) "2020-11-25T01:47:29.190Z");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant31", (mutableDateTime10.compareTo(instant31) == 0) == mutableDateTime10.equals(instant31));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getYearOfEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime2.add(readableDuration7, 12);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.addWrapField((int) (short) 1);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.secondOfMinute();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.hourOfDay();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        mutableDateTime24.setZone(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime24.getZone();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone28);
        long long30 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime29);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime29.toMutableDateTime(chronology37);
        mutableDateTime2.setChronology(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }
}

