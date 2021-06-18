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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        int int13 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant11", (mutableDateTime2.compareTo(instant11) == 0) == mutableDateTime2.equals(instant11));
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
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime5.toGregorianCalendar();
        boolean boolean17 = mutableDateTime5.isEqualNow();
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
        java.lang.Class<?> wildcardClass16 = mutableDateTime5.getClass();
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
        int int5 = property4.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime5.toGregorianCalendar();
        org.joda.time.DateTime dateTime17 = mutableDateTime5.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
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
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.copy();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.weekOfWeekyear();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        mutableDateTime16.setSecondOfDay((int) '#');
        mutableDateTime16.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int25 = property13.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant17", (mutableDateTime2.compareTo(instant17) == 0) == mutableDateTime2.equals(instant17));
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
        mutableDateTime9.add((long) (short) -1);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTime dateTime22 = mutableDateTime9.toDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime9);
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) mutableDateTime9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime22", (instant3.compareTo(dateTime22) == 0) == instant3.equals(dateTime22));
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
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfYear();
        int int20 = property19.get();
        org.joda.time.MutableDateTime mutableDateTime21 = property19.roundFloor();
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableDateTime21.add(readableDuration22);
        java.lang.String str24 = mutableDateTime21.toString();
        boolean boolean25 = mutableDateTime5.isBefore((org.joda.time.ReadableInstant) mutableDateTime21);
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant15 = null;
        mutableDateTime9.setDate(readableInstant15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime9.secondOfMinute();
        java.util.Locale locale18 = null;
        java.lang.String str19 = property17.getAsShortText(locale18);
        org.joda.time.MutableDateTime mutableDateTime20 = property17.getMutableDateTime();
        org.joda.time.DurationField durationField21 = property17.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property17.getFieldType();
        int int23 = mutableDateTime5.get(dateTimeFieldType22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        int int7 = mutableDateTime5.getDayOfWeek();
        mutableDateTime5.setMillisOfDay(100);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant18 = null;
        mutableDateTime12.setDate(readableInstant18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime12.secondOfMinute();
        java.util.GregorianCalendar gregorianCalendar21 = mutableDateTime12.toGregorianCalendar();
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
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime24.secondOfMinute();
        java.util.Locale locale33 = null;
        java.lang.String str34 = property32.getAsShortText(locale33);
        org.joda.time.MutableDateTime mutableDateTime35 = property32.getMutableDateTime();
        org.joda.time.DurationField durationField36 = property32.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property32.getFieldType();
        int int38 = mutableDateTime12.get(dateTimeFieldType37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime5.property(dateTimeFieldType37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
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
        int int16 = mutableDateTime5.getDayOfMonth();
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
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime6.add(readablePeriod9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant12 = null;
        mutableDateTime6.setDate(readableInstant12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime6.secondOfMinute();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property14.getAsShortText(locale15);
        org.joda.time.MutableDateTime mutableDateTime17 = property14.getMutableDateTime();
        org.joda.time.DurationField durationField18 = property14.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property14.getFieldType();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime2.property(dateTimeFieldType19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime6", (instant3.compareTo(mutableDateTime6) == 0) == instant3.equals(mutableDateTime6));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.DateTime dateTime7 = mutableDateTime6.toDateTimeISO();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology14);
        mutableDateTime6.setChronology(chronology14);
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
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime5.toGregorianCalendar();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime5.toMutableDateTime(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone5);
        mutableDateTime2.addSeconds(2);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (-1), dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime2.toMutableDateTime(dateTimeZone13);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.Instant instant19 = mutableDateTime18.toInstant();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.roundFloor();
        boolean boolean23 = mutableDateTime15.isBefore((org.joda.time.ReadableInstant) mutableDateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant19", (mutableDateTime6.compareTo(instant19) == 0) == mutableDateTime6.equals(instant19));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.hourOfDay();
        int int5 = property4.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime5.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime5.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.DateTime dateTime7 = mutableDateTime6.toDateTimeISO();
        mutableDateTime6.setMinuteOfDay((int) (short) 10);
        mutableDateTime6.add((long) 5);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant20 = null;
        mutableDateTime14.setDate(readableInstant20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime14.secondOfMinute();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property22.getAsShortText(locale23);
        org.joda.time.MutableDateTime mutableDateTime25 = property22.getMutableDateTime();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime25.toMutableDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime6.toMutableDateTime(chronology32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
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
        boolean boolean6 = mutableDateTime5.isEqualNow();
        mutableDateTime5.setDayOfYear((int) ' ');
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
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime11.secondOfMinute();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property19.getAsShortText(locale20);
        org.joda.time.MutableDateTime mutableDateTime22 = property19.getMutableDateTime();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = property19.compareTo((org.joda.time.ReadableInstant) mutableDateTime25);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        mutableDateTime25.setZoneRetainFields(dateTimeZone32);
        mutableDateTime5.setZone(dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutableDateTime2.setDate(readableInstant8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.secondOfMinute();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property10.getAsShortText(locale11);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime18.toMutableDateTime();
        org.joda.time.DateTime dateTime20 = mutableDateTime19.toDateTimeISO();
        int int21 = property10.getDifference((org.joda.time.ReadableInstant) dateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant16", (mutableDateTime2.compareTo(instant16) == 0) == mutableDateTime2.equals(instant16));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.hourOfDay();
        java.lang.String str21 = mutableDateTime15.toString();
        mutableDateTime15.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar24 = mutableDateTime15.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime15.secondOfDay();
        int int26 = property25.getMaximumValue();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime29, dateTimeZone32);
        int int34 = property25.compareTo((org.joda.time.ReadableInstant) mutableDateTime29);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime29);
        int int36 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.Instant instant40 = mutableDateTime39.toInstant();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime39.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime42 = property41.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime42.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime42.getZone();
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone44);
        mutableDateTime2.setZoneRetainFields(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant40", (mutableDateTime10.compareTo(instant40) == 0) == mutableDateTime10.equals(instant40));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.hourOfDay();
        java.lang.String str5 = property4.getAsString();
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        mutableDateTime5.setDate((long) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime9.toMutableDateTime();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.add((long) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = property14.getField();
        int int18 = mutableDateTime9.get(dateTimeField17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime25 = property22.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 'a');
        int int28 = mutableDateTime27.getDayOfYear();
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
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime31.secondOfMinute();
        java.util.GregorianCalendar gregorianCalendar40 = mutableDateTime31.toGregorianCalendar();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant49 = null;
        mutableDateTime43.setDate(readableInstant49);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime43.secondOfMinute();
        java.util.Locale locale52 = null;
        java.lang.String str53 = property51.getAsShortText(locale52);
        org.joda.time.MutableDateTime mutableDateTime54 = property51.getMutableDateTime();
        org.joda.time.DurationField durationField55 = property51.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property51.getFieldType();
        int int57 = mutableDateTime31.get(dateTimeFieldType56);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime27.property(dateTimeFieldType56);
        boolean boolean59 = mutableDateTime25.isSupported(dateTimeFieldType56);
        mutableDateTime9.set(dateTimeFieldType56, 59);
        boolean boolean62 = mutableDateTime5.isSupported(dateTimeFieldType56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.secondOfMinute();
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime2.toGregorianCalendar();
        long long12 = mutableDateTime2.getMillis();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.dayOfWeek();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        mutableDateTime16.setSecondOfDay((int) '#');
        int int20 = mutableDateTime16.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime16.toMutableDateTime();
        int int22 = property13.getDifference((org.joda.time.ReadableInstant) mutableDateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant17", (mutableDateTime2.compareTo(instant17) == 0) == mutableDateTime2.equals(instant17));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.yearOfEra();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        mutableDateTime9.setSecondOfDay((int) '#');
        int int13 = mutableDateTime9.getDayOfYear();
        int int14 = mutableDateTime5.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
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
        mutableDateTime2.add((long) (byte) 1);
        boolean boolean8 = mutableDateTime2.isBefore((long) (short) -1);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        mutableDateTime11.setHourOfDay(2);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime11.toMutableDateTime();
        mutableDateTime16.setTime((long) 20);
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
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime21.secondOfMinute();
        java.util.Locale locale30 = null;
        java.lang.String str31 = property29.getAsShortText(locale30);
        org.joda.time.MutableDateTime mutableDateTime32 = property29.getMutableDateTime();
        org.joda.time.DurationField durationField33 = property29.getRangeDurationField();
        java.lang.String str34 = property29.getName();
        org.joda.time.DateTimeField dateTimeField35 = property29.getField();
        org.joda.time.DateTimeField dateTimeField36 = property29.getField();
        mutableDateTime16.setRounding(dateTimeField36, 2);
        int int39 = mutableDateTime2.get(dateTimeField36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.addMinutes((int) 'a');
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.minuteOfHour();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        int int15 = mutableDateTime10.getWeekOfWeekyear();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTime dateTime20 = mutableDateTime10.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = mutableDateTime6.toDateTime(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTimeISO();
        boolean boolean9 = mutableDateTime2.isAfter((long) (short) 10);
        int int10 = mutableDateTime2.getRoundingMode();
        int int11 = mutableDateTime2.getHourOfDay();
        java.lang.Object obj12 = mutableDateTime2.clone();
        mutableDateTime2.setTime((long) 52);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.Instant instant18 = mutableDateTime17.toInstant();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime20.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime2.toMutableDateTime(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime23", (instant3.compareTo(mutableDateTime23) == 0) == instant3.equals(mutableDateTime23));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTimeISO();
        boolean boolean9 = mutableDateTime2.isAfter((long) (short) 10);
        int int10 = mutableDateTime2.getRoundingMode();
        mutableDateTime2.addMinutes(6386338);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.hourOfDay();
        java.lang.String str21 = mutableDateTime15.toString();
        mutableDateTime15.setSecondOfDay(2);
        mutableDateTime15.addYears(10);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime15.millisOfSecond();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone30);
        boolean boolean33 = mutableDateTime32.isAfterNow();
        mutableDateTime32.addSeconds(2020);
        boolean boolean36 = mutableDateTime15.isBefore((org.joda.time.ReadableInstant) mutableDateTime32);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime29", (instant3.compareTo(mutableDateTime29) == 0) == instant3.equals(mutableDateTime29));
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
        mutableDateTime2.add((long) (byte) 1);
        boolean boolean8 = mutableDateTime2.isBefore((long) (short) -1);
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
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime11.secondOfMinute();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property19.getAsShortText(locale20);
        org.joda.time.MutableDateTime mutableDateTime22 = property19.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime24 = property19.add((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime26 = property19.add((long) 50);
        boolean boolean27 = mutableDateTime2.equals((java.lang.Object) 50);
        mutableDateTime2.addYears(6327366);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant38 = null;
        mutableDateTime32.setDate(readableInstant38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime32.secondOfMinute();
        java.util.Locale locale41 = null;
        java.lang.String str42 = property40.getAsShortText(locale41);
        org.joda.time.MutableDateTime mutableDateTime43 = property40.getMutableDateTime();
        org.joda.time.DurationField durationField44 = property40.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property40.getFieldType();
        java.util.Locale locale46 = null;
        int int47 = property40.getMaximumTextLength(locale46);
        java.util.Locale locale48 = null;
        java.lang.String str49 = property40.getAsText(locale48);
        org.joda.time.DateTimeField dateTimeField50 = property40.getField();
        int int51 = mutableDateTime2.get(dateTimeField50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime32", (instant3.compareTo(mutableDateTime32) == 0) == instant3.equals(mutableDateTime32));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = mutableDateTime5.toDateTime(chronology6);
        mutableDateTime5.addMillis(46);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.hourOfDay();
        mutableDateTime5.setMillisOfDay(0);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar19 = mutableDateTime18.toGregorianCalendar();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        boolean boolean23 = mutableDateTime18.isAfter((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.monthOfYear();
        int int25 = mutableDateTime22.getWeekyear();
        int int26 = mutableDateTime5.compareTo((org.joda.time.ReadableInstant) mutableDateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant16", (mutableDateTime2.compareTo(instant16) == 0) == mutableDateTime2.equals(instant16));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfWeek();
        mutableDateTime1.setMillisOfSecond(0);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.hourOfDay();
        java.lang.String str13 = mutableDateTime7.toString();
        mutableDateTime7.setSecondOfDay(2);
        mutableDateTime7.setDayOfYear((int) (byte) 10);
        boolean boolean18 = mutableDateTime1.isEqual((org.joda.time.ReadableInstant) mutableDateTime7);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfFloor();
        boolean boolean25 = mutableDateTime24.isEqualNow();
        mutableDateTime24.setDayOfYear((int) ' ');
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = mutableDateTime30.isSupported(dateTimeFieldType31);
        java.util.GregorianCalendar gregorianCalendar33 = mutableDateTime30.toGregorianCalendar();
        mutableDateTime24.setMillis((org.joda.time.ReadableInstant) mutableDateTime30);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime37, dateTimeZone40);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        mutableDateTime44.add(readablePeriod47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime44.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant50 = null;
        mutableDateTime44.setDate(readableInstant50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime44.secondOfMinute();
        java.util.Locale locale53 = null;
        java.lang.String str54 = property52.getAsShortText(locale53);
        org.joda.time.MutableDateTime mutableDateTime55 = property52.getMutableDateTime();
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        int int61 = mutableDateTime58.getYearOfCentury();
        org.joda.time.Chronology chronology62 = mutableDateTime58.getChronology();
        org.joda.time.MutableDateTime mutableDateTime63 = mutableDateTime55.toMutableDateTime(chronology62);
        org.joda.time.Chronology chronology64 = mutableDateTime55.getChronology();
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime41.toMutableDateTime(chronology64);
        org.joda.time.MutableDateTime mutableDateTime66 = org.joda.time.MutableDateTime.now(chronology64);
        mutableDateTime24.setChronology(chronology64);
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime1, chronology64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant22 and mutableDateTime37", (instant22.compareTo(mutableDateTime37) == 0) == instant22.equals(mutableDateTime37));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
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
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.secondOfMinute();
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant20 = null;
        mutableDateTime14.setDate(readableInstant20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime14.secondOfMinute();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property22.getAsShortText(locale23);
        org.joda.time.MutableDateTime mutableDateTime25 = property22.getMutableDateTime();
        org.joda.time.DurationField durationField26 = property22.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property22.getFieldType();
        int int28 = mutableDateTime2.get(dateTimeFieldType27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime2.yearOfCentury();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.Instant instant33 = mutableDateTime32.toInstant();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime32.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime35 = property34.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.roundFloor();
        long long37 = property29.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime36);
        java.lang.String str38 = property29.getAsString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant33", (mutableDateTime2.compareTo(instant33) == 0) == mutableDateTime2.equals(instant33));
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
        mutableDateTime5.addMinutes(6434690);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.DateTime dateTime7 = mutableDateTime6.toDateTimeISO();
        mutableDateTime6.setMinuteOfDay((int) (short) 10);
        mutableDateTime6.add((long) 5);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        int int16 = mutableDateTime14.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        mutableDateTime18.setMinuteOfDay(365);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant29 = null;
        mutableDateTime23.setDate(readableInstant29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime23.secondOfMinute();
        java.util.Locale locale32 = null;
        java.lang.String str33 = property31.getAsShortText(locale32);
        org.joda.time.MutableDateTime mutableDateTime34 = property31.getMutableDateTime();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        int int40 = mutableDateTime37.getYearOfCentury();
        org.joda.time.Chronology chronology41 = mutableDateTime37.getChronology();
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime34.toMutableDateTime(chronology41);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime18.toMutableDateTime(chronology41);
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(chronology41);
        org.joda.time.DateTime dateTime45 = mutableDateTime6.toDateTime(chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime23", (instant3.compareTo(mutableDateTime23) == 0) == instant3.equals(mutableDateTime23));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        int int7 = property4.getLeapAmount();
        boolean boolean8 = property4.isLeap();
        org.joda.time.MutableDateTime mutableDateTime9 = property4.roundHalfEven();
        int int10 = mutableDateTime9.getSecondOfMinute();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.dayOfWeek();
        mutableDateTime13.add((long) (short) -1);
        int int22 = mutableDateTime13.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime23.toMutableDateTime();
        mutableDateTime23.addWeekyears(365);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant35 = null;
        mutableDateTime29.setDate(readableInstant35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime29.secondOfMinute();
        java.util.Locale locale38 = null;
        java.lang.String str39 = property37.getAsShortText(locale38);
        org.joda.time.MutableDateTime mutableDateTime40 = property37.getMutableDateTime();
        org.joda.time.DurationField durationField41 = property37.getRangeDurationField();
        java.lang.String str42 = property37.getName();
        org.joda.time.DateTimeField dateTimeField43 = property37.getField();
        mutableDateTime23.setRounding(dateTimeField43);
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime47, dateTimeZone50);
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = null;
        java.lang.String str56 = mutableDateTime54.toString(dateTimeFormatter55);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        mutableDateTime54.add(readablePeriod57);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime54.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant60 = null;
        mutableDateTime54.setDate(readableInstant60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime54.secondOfMinute();
        java.util.Locale locale63 = null;
        java.lang.String str64 = property62.getAsShortText(locale63);
        org.joda.time.MutableDateTime mutableDateTime65 = property62.getMutableDateTime();
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(obj66, chronology67);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = null;
        java.lang.String str70 = mutableDateTime68.toString(dateTimeFormatter69);
        int int71 = mutableDateTime68.getYearOfCentury();
        org.joda.time.Chronology chronology72 = mutableDateTime68.getChronology();
        org.joda.time.MutableDateTime mutableDateTime73 = mutableDateTime65.toMutableDateTime(chronology72);
        org.joda.time.Chronology chronology74 = mutableDateTime65.getChronology();
        org.joda.time.MutableDateTime mutableDateTime75 = mutableDateTime51.toMutableDateTime(chronology74);
        org.joda.time.MutableDateTime mutableDateTime76 = mutableDateTime23.toMutableDateTime(chronology74);
        org.joda.time.MutableDateTime mutableDateTime77 = mutableDateTime13.toMutableDateTime(chronology74);
        org.joda.time.MutableDateTime mutableDateTime78 = mutableDateTime9.toMutableDateTime(chronology74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.hourOfDay();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime7.add(readablePeriod10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.hourOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.dayOfWeek();
        mutableDateTime7.add((long) (short) -1);
        int int16 = mutableDateTime7.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime17.toMutableDateTime();
        mutableDateTime17.addWeekyears(365);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant29 = null;
        mutableDateTime23.setDate(readableInstant29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime23.secondOfMinute();
        java.util.Locale locale32 = null;
        java.lang.String str33 = property31.getAsShortText(locale32);
        org.joda.time.MutableDateTime mutableDateTime34 = property31.getMutableDateTime();
        org.joda.time.DurationField durationField35 = property31.getRangeDurationField();
        java.lang.String str36 = property31.getName();
        org.joda.time.DateTimeField dateTimeField37 = property31.getField();
        mutableDateTime17.setRounding(dateTimeField37);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime41, dateTimeZone44);
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = null;
        java.lang.String str50 = mutableDateTime48.toString(dateTimeFormatter49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        mutableDateTime48.add(readablePeriod51);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime48.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant54 = null;
        mutableDateTime48.setDate(readableInstant54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime48.secondOfMinute();
        java.util.Locale locale57 = null;
        java.lang.String str58 = property56.getAsShortText(locale57);
        org.joda.time.MutableDateTime mutableDateTime59 = property56.getMutableDateTime();
        java.lang.Object obj60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(obj60, chronology61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = null;
        java.lang.String str64 = mutableDateTime62.toString(dateTimeFormatter63);
        int int65 = mutableDateTime62.getYearOfCentury();
        org.joda.time.Chronology chronology66 = mutableDateTime62.getChronology();
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime59.toMutableDateTime(chronology66);
        org.joda.time.Chronology chronology68 = mutableDateTime59.getChronology();
        org.joda.time.MutableDateTime mutableDateTime69 = mutableDateTime45.toMutableDateTime(chronology68);
        org.joda.time.MutableDateTime mutableDateTime70 = mutableDateTime17.toMutableDateTime(chronology68);
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime7.toMutableDateTime(chronology68);
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, chronology68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
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
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime8.dayOfYear();
        int int17 = property16.getMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTimeISO();
        boolean boolean9 = mutableDateTime2.isAfter((long) (short) 10);
        int int10 = mutableDateTime2.getRoundingMode();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        mutableDateTime15.setWeekyear(58);
        mutableDateTime15.addYears(22);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        java.lang.String str28 = mutableDateTime22.toString();
        mutableDateTime22.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar31 = mutableDateTime22.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime22.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property32.getFieldType();
        mutableDateTime15.set(dateTimeFieldType33, 0);
        boolean boolean36 = mutableDateTime2.isSupported(dateTimeFieldType33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        mutableDateTime2.add((long) (byte) 1);
        boolean boolean8 = mutableDateTime2.isBefore((long) (short) -1);
        boolean boolean9 = mutableDateTime2.isAfterNow();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant18 = null;
        mutableDateTime12.setDate(readableInstant18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime12.secondOfMinute();
        java.util.GregorianCalendar gregorianCalendar21 = mutableDateTime12.toGregorianCalendar();
        int int22 = mutableDateTime12.getMillisOfDay();
        int int23 = mutableDateTime12.getCenturyOfEra();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime24.toMutableDateTime();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property29.add((long) (short) -1);
        org.joda.time.DateTimeField dateTimeField32 = property29.getField();
        int int33 = mutableDateTime24.get(dateTimeField32);
        mutableDateTime12.setRounding(dateTimeField32);
        mutableDateTime2.setRounding(dateTimeField32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime24", (instant3.compareTo(mutableDateTime24) == 0) == instant3.equals(mutableDateTime24));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.secondOfMinute();
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant20 = null;
        mutableDateTime14.setDate(readableInstant20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime14.secondOfMinute();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property22.getAsShortText(locale23);
        org.joda.time.MutableDateTime mutableDateTime25 = property22.getMutableDateTime();
        org.joda.time.DurationField durationField26 = property22.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property22.getFieldType();
        int int28 = mutableDateTime2.get(dateTimeFieldType27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime2.yearOfCentury();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.Instant instant33 = mutableDateTime32.toInstant();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime32.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime35 = property34.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.roundFloor();
        long long37 = property29.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime36);
        java.util.Locale locale38 = null;
        int int39 = property29.getMaximumTextLength(locale38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant33", (mutableDateTime2.compareTo(instant33) == 0) == mutableDateTime2.equals(instant33));
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
        mutableDateTime2.addDays((int) (byte) 100);
        mutableDateTime2.addHours(10);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime2.add(readablePeriod9);
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
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime13.secondOfMinute();
        java.util.GregorianCalendar gregorianCalendar22 = mutableDateTime13.toGregorianCalendar();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant31 = null;
        mutableDateTime25.setDate(readableInstant31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime25.secondOfMinute();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property33.getAsShortText(locale34);
        org.joda.time.MutableDateTime mutableDateTime36 = property33.getMutableDateTime();
        org.joda.time.DurationField durationField37 = property33.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property33.getFieldType();
        int int39 = mutableDateTime13.get(dateTimeFieldType38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime13.yearOfCentury();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime13.millisOfSecond();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        mutableDateTime44.setHourOfDay(2);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime44.toMutableDateTime();
        mutableDateTime49.setTime((long) 20);
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = null;
        java.lang.String str56 = mutableDateTime54.toString(dateTimeFormatter55);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        mutableDateTime54.add(readablePeriod57);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime54.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant60 = null;
        mutableDateTime54.setDate(readableInstant60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime54.secondOfMinute();
        java.util.Locale locale63 = null;
        java.lang.String str64 = property62.getAsShortText(locale63);
        org.joda.time.MutableDateTime mutableDateTime65 = property62.getMutableDateTime();
        org.joda.time.DurationField durationField66 = property62.getRangeDurationField();
        java.lang.String str67 = property62.getName();
        org.joda.time.DateTimeField dateTimeField68 = property62.getField();
        org.joda.time.DateTimeField dateTimeField69 = property62.getField();
        mutableDateTime49.setRounding(dateTimeField69, 2);
        int int72 = mutableDateTime13.get(dateTimeField69);
        mutableDateTime2.setRounding(dateTimeField69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.addMinutes((int) 'a');
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        boolean boolean8 = mutableDateTime2.equals((java.lang.Object) "2020-11-25T01:46:24.470Z");
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
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime20.copy();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 'a');
        int int25 = mutableDateTime24.getDayOfYear();
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
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime28.secondOfMinute();
        java.util.GregorianCalendar gregorianCalendar37 = mutableDateTime28.toGregorianCalendar();
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
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime40.secondOfMinute();
        java.util.Locale locale49 = null;
        java.lang.String str50 = property48.getAsShortText(locale49);
        org.joda.time.MutableDateTime mutableDateTime51 = property48.getMutableDateTime();
        org.joda.time.DurationField durationField52 = property48.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property48.getFieldType();
        int int54 = mutableDateTime28.get(dateTimeFieldType53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime24.property(dateTimeFieldType53);
        boolean boolean56 = mutableDateTime21.isSupported(dateTimeFieldType53);
        org.joda.time.DateTimeField dateTimeField57 = mutableDateTime21.getRoundingField();
        boolean boolean58 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar13 = mutableDateTime12.toGregorianCalendar();
        java.lang.Object obj14 = mutableDateTime12.clone();
        boolean boolean15 = mutableDateTime6.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        mutableDateTime6.setSecondOfDay((int) (short) 1);
        org.joda.time.DateTime dateTime18 = mutableDateTime6.toDateTimeISO();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime21.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.dayOfYear();
        int int28 = dateTime18.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime26", (instant10.compareTo(mutableDateTime26) == 0) == instant10.equals(mutableDateTime26));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime6.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone8);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:47:02.712Z", dateTimeZone8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime9", (instant4.compareTo(mutableDateTime9) == 0) == instant4.equals(mutableDateTime9));
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
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar6);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime13.toGregorianCalendar();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        boolean boolean18 = mutableDateTime13.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        boolean boolean19 = mutableDateTime7.isBefore((org.joda.time.ReadableInstant) mutableDateTime17);
        int int20 = mutableDateTime7.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime17", (instant11.compareTo(mutableDateTime17) == 0) == instant11.equals(mutableDateTime17));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime1 = mutableDateTime0.toMutableDateTime();
        int int2 = mutableDateTime0.getDayOfWeek();
        org.joda.time.Instant instant3 = mutableDateTime0.toInstant();
        mutableDateTime0.setMillisOfDay(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant3", (mutableDateTime1.compareTo(instant3) == 0) == mutableDateTime1.equals(instant3));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        mutableDateTime2.add((long) (short) -1);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTime dateTime15 = mutableDateTime2.toDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.year();
        org.joda.time.Instant instant18 = mutableDateTime16.toInstant();
        java.util.Locale locale19 = null;
        java.util.Calendar calendar20 = mutableDateTime16.toCalendar(locale19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant18", (mutableDateTime2.compareTo(instant18) == 0) == mutableDateTime2.equals(instant18));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone3);
        boolean boolean6 = mutableDateTime5.isAfterNow();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.minuteOfDay();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime13.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar14);
        boolean boolean17 = mutableDateTime15.isEqual((long) 19);
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant11", (mutableDateTime2.compareTo(instant11) == 0) == mutableDateTime2.equals(instant11));
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.toMutableDateTime();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.add((long) (short) -1);
        org.joda.time.DateTimeField dateTimeField24 = property21.getField();
        int int25 = mutableDateTime16.get(dateTimeField24);
        boolean boolean26 = mutableDateTime5.equals((java.lang.Object) int25);
        int int27 = mutableDateTime5.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        mutableDateTime15.setHourOfDay(2);
        int int20 = dateTime12.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant29 = null;
        mutableDateTime23.setDate(readableInstant29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime23.secondOfMinute();
        java.util.Locale locale32 = null;
        java.lang.String str33 = property31.getAsShortText(locale32);
        org.joda.time.MutableDateTime mutableDateTime34 = property31.getMutableDateTime();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        int int40 = mutableDateTime37.getYearOfCentury();
        org.joda.time.Chronology chronology41 = mutableDateTime37.getChronology();
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime34.toMutableDateTime(chronology41);
        mutableDateTime15.setChronology(chronology41);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime15.monthOfYear();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.Instant instant48 = mutableDateTime47.toInstant();
        mutableDateTime47.setSecondOfDay((int) '#');
        int int51 = mutableDateTime47.getMonthOfYear();
        org.joda.time.DateTime dateTime52 = mutableDateTime47.toDateTimeISO();
        boolean boolean54 = mutableDateTime47.isAfter((long) (short) 10);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime47.minuteOfDay();
        mutableDateTime47.setWeekyear(56);
        long long58 = property44.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant48", (mutableDateTime2.compareTo(instant48) == 0) == mutableDateTime2.equals(instant48));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.add(40);
        int int7 = mutableDateTime6.getDayOfMonth();
        int int8 = mutableDateTime6.getDayOfYear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = mutableDateTime14.toDateTime(chronology15);
        mutableDateTime14.addMillis(46);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        mutableDateTime21.setZoneRetainFields(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime14.toMutableDateTime(dateTimeZone29);
        int int34 = mutableDateTime6.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar6);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime13.toGregorianCalendar();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        boolean boolean18 = mutableDateTime13.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        boolean boolean19 = mutableDateTime7.isBefore((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime7", (mutableDateTime2.compareTo(mutableDateTime7) == 0) == mutableDateTime2.equals(mutableDateTime7));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime14 = property11.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 'a');
        int int17 = mutableDateTime16.getDayOfYear();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant26 = null;
        mutableDateTime20.setDate(readableInstant26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime20.secondOfMinute();
        java.util.GregorianCalendar gregorianCalendar29 = mutableDateTime20.toGregorianCalendar();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant38 = null;
        mutableDateTime32.setDate(readableInstant38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime32.secondOfMinute();
        java.util.Locale locale41 = null;
        java.lang.String str42 = property40.getAsShortText(locale41);
        org.joda.time.MutableDateTime mutableDateTime43 = property40.getMutableDateTime();
        org.joda.time.DurationField durationField44 = property40.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property40.getFieldType();
        int int46 = mutableDateTime20.get(dateTimeFieldType45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime16.property(dateTimeFieldType45);
        boolean boolean48 = mutableDateTime14.isSupported(dateTimeFieldType45);
        boolean boolean49 = mutableDateTime2.isSupported(dateTimeFieldType45);
        mutableDateTime2.setTime((long) 6441483);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
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
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        boolean boolean13 = mutableDateTime5.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        int int18 = property17.get();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.roundFloor();
        org.joda.time.ReadableDuration readableDuration20 = null;
        mutableDateTime19.add(readableDuration20);
        mutableDateTime19.setDate((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField24 = mutableDateTime19.getRoundingField();
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime19.getZone();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime33.toMutableDateTime();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime37.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.add((long) (short) -1);
        org.joda.time.DateTimeField dateTimeField41 = property38.getField();
        int int42 = mutableDateTime33.get(dateTimeField41);
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = mutableDateTime45.getZone();
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(dateTimeZone46);
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now(dateTimeZone46);
        mutableDateTime33.setZone(dateTimeZone46);
        mutableDateTime28.setZone(dateTimeZone46);
        mutableDateTime19.setZone(dateTimeZone46);
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime12.toMutableDateTime(dateTimeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime28", (instant10.compareTo(mutableDateTime28) == 0) == instant10.equals(mutableDateTime28));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.centuryOfEra();
        java.util.Locale locale10 = null;
        int int11 = property9.getMaximumShortTextLength(locale10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.roundFloor();
        int int12 = property9.get();
        org.joda.time.DateTimeField dateTimeField13 = property9.getField();
        mutableDateTime2.setRounding(dateTimeField13);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime17, dateTimeZone20);
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
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime24.secondOfMinute();
        java.util.Locale locale33 = null;
        java.lang.String str34 = property32.getAsShortText(locale33);
        org.joda.time.MutableDateTime mutableDateTime35 = property32.getMutableDateTime();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        int int41 = mutableDateTime38.getYearOfCentury();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime35.toMutableDateTime(chronology42);
        org.joda.time.Chronology chronology44 = mutableDateTime35.getChronology();
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime21.toMutableDateTime(chronology44);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(chronology44);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime2.toMutableDateTime(chronology44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime17", (instant8.compareTo(mutableDateTime17) == 0) == instant8.equals(mutableDateTime17));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.roundFloor();
        int int12 = property9.get();
        org.joda.time.DateTimeField dateTimeField13 = property9.getField();
        mutableDateTime2.setRounding(dateTimeField13);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        mutableDateTime2.setZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime17", (instant8.compareTo(mutableDateTime17) == 0) == instant8.equals(mutableDateTime17));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        mutableDateTime2.add((long) (short) -1);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTime dateTime15 = mutableDateTime2.toDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar23 = mutableDateTime22.toGregorianCalendar();
        mutableDateTime22.setDate((long) 10);
        mutableDateTime22.setMillisOfDay(906);
        mutableDateTime22.setMillis((long) (byte) 0);
        boolean boolean30 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant20", (mutableDateTime13.compareTo(instant20) == 0) == mutableDateTime13.equals(instant20));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.DateTime dateTime7 = mutableDateTime6.toDateTimeISO();
        mutableDateTime6.setMinuteOfDay((int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime6.copy();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.dayOfMonth();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property11.getAsText(locale12);
        org.joda.time.MutableDateTime mutableDateTime14 = property11.roundHalfCeiling();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        boolean boolean20 = mutableDateTime18.isSupported(dateTimeFieldType19);
        java.util.GregorianCalendar gregorianCalendar21 = mutableDateTime18.toGregorianCalendar();
        mutableDateTime18.addHours((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(1606262402854L, dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime14.toMutableDateTime(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime25", (instant3.compareTo(mutableDateTime25) == 0) == instant3.equals(mutableDateTime25));
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
        boolean boolean6 = mutableDateTime5.isEqualNow();
        mutableDateTime5.setDayOfYear((int) ' ');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = mutableDateTime11.isSupported(dateTimeFieldType12);
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime11.toGregorianCalendar();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.DateTime dateTime16 = mutableDateTime11.toDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime11.hourOfDay();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant26 = null;
        mutableDateTime20.setDate(readableInstant26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime20.secondOfMinute();
        java.util.Locale locale29 = null;
        java.lang.String str30 = property28.getAsShortText(locale29);
        org.joda.time.MutableDateTime mutableDateTime31 = property28.getMutableDateTime();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        int int37 = mutableDateTime34.getYearOfCentury();
        org.joda.time.Chronology chronology38 = mutableDateTime34.getChronology();
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime31.toMutableDateTime(chronology38);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(chronology38);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(chronology38);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(chronology38);
        mutableDateTime11.setChronology(chronology38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
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
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.year();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime17.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.centuryOfEra();
        mutableDateTime17.addSeconds(6373546);
        int int22 = property11.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        long long23 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar6);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime13.toGregorianCalendar();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        boolean boolean18 = mutableDateTime13.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        boolean boolean19 = mutableDateTime7.isBefore((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.DateTime dateTime20 = mutableDateTime7.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime17", (instant11.compareTo(mutableDateTime17) == 0) == instant11.equals(mutableDateTime17));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.hourOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime11.dayOfYear();
        int int18 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        int int19 = mutableDateTime11.getCenturyOfEra();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 'a');
        int int22 = mutableDateTime21.getDayOfWeek();
        int int23 = mutableDateTime21.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime21.minuteOfDay();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        int int30 = mutableDateTime28.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime28.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime32 = property31.roundHalfFloor();
        mutableDateTime32.setMinuteOfDay(365);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableDateTime37.add(readablePeriod40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime37.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant43 = null;
        mutableDateTime37.setDate(readableInstant43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime37.secondOfMinute();
        java.util.Locale locale46 = null;
        java.lang.String str47 = property45.getAsShortText(locale46);
        org.joda.time.MutableDateTime mutableDateTime48 = property45.getMutableDateTime();
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = mutableDateTime51.toString(dateTimeFormatter52);
        int int54 = mutableDateTime51.getYearOfCentury();
        org.joda.time.Chronology chronology55 = mutableDateTime51.getChronology();
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime48.toMutableDateTime(chronology55);
        org.joda.time.MutableDateTime mutableDateTime57 = mutableDateTime32.toMutableDateTime(chronology55);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(1606262402854L, chronology55);
        org.joda.time.DateTime dateTime59 = mutableDateTime21.toDateTime(chronology55);
        java.lang.Object obj60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(obj60, chronology61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = null;
        java.lang.String str64 = mutableDateTime62.toString(dateTimeFormatter63);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        mutableDateTime62.add(readablePeriod65);
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime62.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant68 = null;
        mutableDateTime62.setDate(readableInstant68);
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime62.secondOfMinute();
        java.util.Locale locale71 = null;
        java.lang.String str72 = property70.getAsShortText(locale71);
        java.util.Locale locale73 = null;
        java.lang.String str74 = property70.getAsText(locale73);
        java.lang.Object obj75 = null;
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime(obj75, chronology76);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = null;
        java.lang.String str79 = mutableDateTime77.toString(dateTimeFormatter78);
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        mutableDateTime77.add(readablePeriod80);
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime77.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone83 = mutableDateTime77.getZone();
        org.joda.time.MutableDateTime mutableDateTime84 = org.joda.time.MutableDateTime.now(dateTimeZone83);
        org.joda.time.MutableDateTime mutableDateTime85 = new org.joda.time.MutableDateTime(dateTimeZone83);
        boolean boolean86 = property70.equals((java.lang.Object) dateTimeZone83);
        org.joda.time.MutableDateTime mutableDateTime87 = dateTime59.toMutableDateTime(dateTimeZone83);
        mutableDateTime11.setZoneRetainFields(dateTimeZone83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime14 = property11.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 'a');
        int int17 = mutableDateTime16.getDayOfYear();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant26 = null;
        mutableDateTime20.setDate(readableInstant26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime20.secondOfMinute();
        java.util.GregorianCalendar gregorianCalendar29 = mutableDateTime20.toGregorianCalendar();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant38 = null;
        mutableDateTime32.setDate(readableInstant38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime32.secondOfMinute();
        java.util.Locale locale41 = null;
        java.lang.String str42 = property40.getAsShortText(locale41);
        org.joda.time.MutableDateTime mutableDateTime43 = property40.getMutableDateTime();
        org.joda.time.DurationField durationField44 = property40.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property40.getFieldType();
        int int46 = mutableDateTime20.get(dateTimeFieldType45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime16.property(dateTimeFieldType45);
        boolean boolean48 = mutableDateTime14.isSupported(dateTimeFieldType45);
        boolean boolean49 = mutableDateTime2.isSupported(dateTimeFieldType45);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime2.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:14.317Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfCeiling();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime6.add(readablePeriod9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.hourOfDay();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime6.dayOfWeek();
        mutableDateTime6.add((long) (short) -1);
        int int15 = mutableDateTime6.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.toMutableDateTime();
        mutableDateTime16.addWeekyears(365);
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
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime22.secondOfMinute();
        java.util.Locale locale31 = null;
        java.lang.String str32 = property30.getAsShortText(locale31);
        org.joda.time.MutableDateTime mutableDateTime33 = property30.getMutableDateTime();
        org.joda.time.DurationField durationField34 = property30.getRangeDurationField();
        java.lang.String str35 = property30.getName();
        org.joda.time.DateTimeField dateTimeField36 = property30.getField();
        mutableDateTime16.setRounding(dateTimeField36);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime40, dateTimeZone43);
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        mutableDateTime47.add(readablePeriod50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime47.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant53 = null;
        mutableDateTime47.setDate(readableInstant53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime47.secondOfMinute();
        java.util.Locale locale56 = null;
        java.lang.String str57 = property55.getAsShortText(locale56);
        org.joda.time.MutableDateTime mutableDateTime58 = property55.getMutableDateTime();
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = null;
        java.lang.String str63 = mutableDateTime61.toString(dateTimeFormatter62);
        int int64 = mutableDateTime61.getYearOfCentury();
        org.joda.time.Chronology chronology65 = mutableDateTime61.getChronology();
        org.joda.time.MutableDateTime mutableDateTime66 = mutableDateTime58.toMutableDateTime(chronology65);
        org.joda.time.Chronology chronology67 = mutableDateTime58.getChronology();
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime44.toMutableDateTime(chronology67);
        org.joda.time.MutableDateTime mutableDateTime69 = mutableDateTime16.toMutableDateTime(chronology67);
        org.joda.time.MutableDateTime mutableDateTime70 = mutableDateTime6.toMutableDateTime(chronology67);
        org.joda.time.MutableDateTime mutableDateTime71 = org.joda.time.MutableDateTime.now(chronology67);
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime3, chronology67);
        java.util.Date date73 = mutableDateTime3.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime72", (mutableDateTime3.compareTo(mutableDateTime72) == 0) == mutableDateTime3.equals(mutableDateTime72));
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
        int int6 = mutableDateTime2.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime14 = property11.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 'a');
        int int17 = mutableDateTime16.getDayOfYear();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant26 = null;
        mutableDateTime20.setDate(readableInstant26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime20.secondOfMinute();
        java.util.GregorianCalendar gregorianCalendar29 = mutableDateTime20.toGregorianCalendar();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant38 = null;
        mutableDateTime32.setDate(readableInstant38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime32.secondOfMinute();
        java.util.Locale locale41 = null;
        java.lang.String str42 = property40.getAsShortText(locale41);
        org.joda.time.MutableDateTime mutableDateTime43 = property40.getMutableDateTime();
        org.joda.time.DurationField durationField44 = property40.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property40.getFieldType();
        int int46 = mutableDateTime20.get(dateTimeFieldType45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime16.property(dateTimeFieldType45);
        boolean boolean48 = mutableDateTime14.isSupported(dateTimeFieldType45);
        boolean boolean49 = mutableDateTime2.isSupported(dateTimeFieldType45);
        int int50 = mutableDateTime2.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        java.lang.String str19 = mutableDateTime13.toString();
        mutableDateTime13.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar22 = mutableDateTime13.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime13.secondOfDay();
        int int24 = property23.getMaximumValue();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime27.add(readablePeriod30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.hourOfDay();
        java.lang.String str33 = mutableDateTime27.toString();
        mutableDateTime27.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar36 = mutableDateTime27.toGregorianCalendar();
        int int37 = mutableDateTime27.getMinuteOfHour();
        boolean boolean38 = property23.equals((java.lang.Object) mutableDateTime27);
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
        org.joda.time.DateTimeZone dateTimeZone50 = mutableDateTime49.getZone();
        org.joda.time.DateTime dateTime51 = mutableDateTime41.toDateTime(dateTimeZone50);
        mutableDateTime27.setZoneRetainFields(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) 26, dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime2.toMutableDateTime(dateTimeZone50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime41", (instant3.compareTo(mutableDateTime41) == 0) == instant3.equals(mutableDateTime41));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 43, dateTimeZone4);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.roundFloor();
        int int14 = property11.get();
        org.joda.time.DateTimeField dateTimeField15 = property11.getField();
        mutableDateTime6.setRounding(dateTimeField15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant10", (mutableDateTime3.compareTo(instant10) == 0) == mutableDateTime3.equals(instant10));
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
        java.lang.String str5 = property4.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar6);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime13.toGregorianCalendar();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        boolean boolean18 = mutableDateTime13.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        boolean boolean19 = mutableDateTime7.isBefore((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime7.setWeekyear(97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime17", (instant11.compareTo(mutableDateTime17) == 0) == instant11.equals(mutableDateTime17));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime14 = property11.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 'a');
        int int17 = mutableDateTime16.getDayOfYear();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant26 = null;
        mutableDateTime20.setDate(readableInstant26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime20.secondOfMinute();
        java.util.GregorianCalendar gregorianCalendar29 = mutableDateTime20.toGregorianCalendar();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant38 = null;
        mutableDateTime32.setDate(readableInstant38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime32.secondOfMinute();
        java.util.Locale locale41 = null;
        java.lang.String str42 = property40.getAsShortText(locale41);
        org.joda.time.MutableDateTime mutableDateTime43 = property40.getMutableDateTime();
        org.joda.time.DurationField durationField44 = property40.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property40.getFieldType();
        int int46 = mutableDateTime20.get(dateTimeFieldType45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime16.property(dateTimeFieldType45);
        boolean boolean48 = mutableDateTime14.isSupported(dateTimeFieldType45);
        boolean boolean49 = mutableDateTime2.isSupported(dateTimeFieldType45);
        mutableDateTime2.addWeekyears(29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone8);
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone8);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.roundFloor();
        int int18 = property15.getLeapAmount();
        boolean boolean19 = property15.isLeap();
        org.joda.time.MutableDateTime mutableDateTime20 = property15.roundHalfEven();
        java.util.Locale locale21 = null;
        int int22 = property15.getMaximumShortTextLength(locale21);
        java.lang.String str23 = property15.toString();
        org.joda.time.DateTimeField dateTimeField24 = property15.getField();
        mutableDateTime10.setRounding(dateTimeField24, 2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant14", (mutableDateTime2.compareTo(instant14) == 0) == mutableDateTime2.equals(instant14));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime2.getZone();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone12);
        boolean boolean15 = mutableDateTime14.isAfterNow();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        int int23 = mutableDateTime18.getWeekOfWeekyear();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        org.joda.time.DateTime dateTime28 = mutableDateTime18.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime14, chronology29);
        mutableDateTime2.setChronology(chronology29);
        mutableDateTime2.setWeekyear(38);
        int int34 = mutableDateTime2.getSecondOfMinute();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.Instant instant38 = mutableDateTime37.toInstant();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime37.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime40 = property39.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime40.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime40.getZone();
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(dateTimeZone42);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableDateTime46.add(readablePeriod49);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.hourOfDay();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime46.dayOfYear();
        int int53 = mutableDateTime43.compareTo((org.joda.time.ReadableInstant) mutableDateTime46);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant38", (mutableDateTime14.compareTo(instant38) == 0) == mutableDateTime14.equals(instant38));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.DateTime dateTime7 = mutableDateTime6.toDateTimeISO();
        mutableDateTime6.setMinuteOfDay((int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime6.copy();
        int int11 = mutableDateTime6.getRoundingMode();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime6.secondOfDay();
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
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime15.secondOfMinute();
        java.util.Locale locale24 = null;
        java.lang.String str25 = property23.getAsShortText(locale24);
        org.joda.time.MutableDateTime mutableDateTime26 = property23.getMutableDateTime();
        org.joda.time.DurationField durationField27 = property23.getRangeDurationField();
        java.lang.String str28 = property23.getName();
        org.joda.time.DateTimeField dateTimeField29 = property23.getField();
        org.joda.time.DateTimeField dateTimeField30 = property23.getField();
        org.joda.time.Interval interval31 = property23.toInterval();
        org.joda.time.MutableDateTime mutableDateTime32 = property23.roundFloor();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.Instant instant36 = mutableDateTime35.toInstant();
        mutableDateTime35.setSecondOfDay((int) '#');
        int int39 = mutableDateTime35.getMonthOfYear();
        org.joda.time.DateTime dateTime40 = mutableDateTime35.toDateTimeISO();
        mutableDateTime35.add((long) 15);
        int int43 = property23.getDifference((org.joda.time.ReadableInstant) mutableDateTime35);
        int int44 = property12.compareTo((org.joda.time.ReadableInstant) mutableDateTime35);
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        mutableDateTime47.add(readablePeriod50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime47.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime47.getZone();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime47.minuteOfDay();
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = mutableDateTime57.toString(dateTimeFormatter58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        mutableDateTime57.add(readablePeriod60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime57.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone63 = mutableDateTime57.getZone();
        org.joda.time.MutableDateTime mutableDateTime64 = org.joda.time.MutableDateTime.now(dateTimeZone63);
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(dateTimeZone63);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(dateTimeZone63);
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime47.toMutableDateTime(dateTimeZone63);
        mutableDateTime35.setZoneRetainFields(dateTimeZone63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime47", (instant3.compareTo(mutableDateTime47) == 0) == instant3.equals(mutableDateTime47));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.dayOfWeek();
        mutableDateTime3.add((long) (short) -1);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.DateTime dateTime16 = mutableDateTime3.toDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 48, dateTimeZone15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        mutableDateTime17.setYear(5);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.year();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfFloor();
        boolean boolean37 = mutableDateTime29.isEqual((org.joda.time.ReadableInstant) mutableDateTime36);
        boolean boolean38 = mutableDateTime17.isBefore((org.joda.time.ReadableInstant) mutableDateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant27", (mutableDateTime14.compareTo(instant27) == 0) == mutableDateTime14.equals(instant27));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.dayOfWeek();
        mutableDateTime3.add((long) (short) -1);
        int int12 = mutableDateTime3.getMinuteOfDay();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime18.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime18.getZone();
        mutableDateTime3.setZone(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(50L, dateTimeZone20);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.hourOfDay();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime25.dayOfWeek();
        int int32 = property31.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime34 = property31.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime34.copy();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) 'a');
        int int39 = mutableDateTime38.getDayOfYear();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = null;
        java.lang.String str44 = mutableDateTime42.toString(dateTimeFormatter43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime42.add(readablePeriod45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime42.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant48 = null;
        mutableDateTime42.setDate(readableInstant48);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime42.secondOfMinute();
        java.util.GregorianCalendar gregorianCalendar51 = mutableDateTime42.toGregorianCalendar();
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = null;
        java.lang.String str56 = mutableDateTime54.toString(dateTimeFormatter55);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        mutableDateTime54.add(readablePeriod57);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime54.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant60 = null;
        mutableDateTime54.setDate(readableInstant60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime54.secondOfMinute();
        java.util.Locale locale63 = null;
        java.lang.String str64 = property62.getAsShortText(locale63);
        org.joda.time.MutableDateTime mutableDateTime65 = property62.getMutableDateTime();
        org.joda.time.DurationField durationField66 = property62.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = property62.getFieldType();
        int int68 = mutableDateTime42.get(dateTimeFieldType67);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime38.property(dateTimeFieldType67);
        boolean boolean70 = mutableDateTime35.isSupported(dateTimeFieldType67);
        org.joda.time.DateTimeField dateTimeField71 = mutableDateTime35.getRoundingField();
        int int72 = mutableDateTime22.compareTo((org.joda.time.ReadableInstant) mutableDateTime35);
        org.joda.time.ReadableDuration readableDuration73 = null;
        mutableDateTime35.add(readableDuration73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime25", (instant16.compareTo(mutableDateTime25) == 0) == instant16.equals(mutableDateTime25));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTimeISO();
        boolean boolean9 = mutableDateTime2.isAfter((long) (short) 10);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.minuteOfDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.add((long) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = property14.getField();
        mutableDateTime2.setRounding(dateTimeField17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.weekyear();
        org.joda.time.DurationField durationField20 = property19.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime22 = property19.add((long) 17);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.hourOfDay();
        java.lang.String str31 = mutableDateTime25.toString();
        mutableDateTime25.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar34 = mutableDateTime25.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime25.secondOfDay();
        int int36 = mutableDateTime25.getCenturyOfEra();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        int int42 = mutableDateTime39.getYearOfCentury();
        org.joda.time.Chronology chronology43 = mutableDateTime39.getChronology();
        int int44 = mutableDateTime39.getWeekOfWeekyear();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime47.getZone();
        org.joda.time.DateTime dateTime49 = mutableDateTime39.toDateTime(dateTimeZone48);
        mutableDateTime25.setZoneRetainFields(dateTimeZone48);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.dayOfYear();
        int int55 = property54.get();
        org.joda.time.MutableDateTime mutableDateTime56 = property54.roundFloor();
        org.joda.time.DurationField durationField57 = property54.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property54.getFieldType();
        int int59 = mutableDateTime25.get(dateTimeFieldType58);
        int int60 = mutableDateTime22.get(dateTimeFieldType58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime39", (instant3.compareTo(mutableDateTime39) == 0) == instant3.equals(mutableDateTime39));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getDayOfYear();
        int int7 = mutableDateTime2.getHourOfDay();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime10, dateTimeZone13);
        mutableDateTime10.addSeconds(2);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (-1), dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime10.toMutableDateTime(dateTimeZone21);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime10.toMutableDateTime(chronology30);
        mutableDateTime33.setWeekOfWeekyear(31);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime38.add(readablePeriod41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime38.hourOfDay();
        java.lang.String str44 = mutableDateTime38.toString();
        mutableDateTime38.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar47 = mutableDateTime38.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime38.secondOfDay();
        int int49 = mutableDateTime38.getCenturyOfEra();
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
        org.joda.time.DateTimeZone dateTimeZone61 = mutableDateTime60.getZone();
        org.joda.time.DateTime dateTime62 = mutableDateTime52.toDateTime(dateTimeZone61);
        mutableDateTime38.setZoneRetainFields(dateTimeZone61);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology65);
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime66.dayOfYear();
        int int68 = property67.get();
        org.joda.time.MutableDateTime mutableDateTime69 = property67.roundFloor();
        org.joda.time.DurationField durationField70 = property67.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = property67.getFieldType();
        int int72 = mutableDateTime38.get(dateTimeFieldType71);
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime33.property(dateTimeFieldType71);
        mutableDateTime2.set(dateTimeFieldType71, 331);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
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
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutableDateTime2.setDate(readableInstant8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.secondOfMinute();
        java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime2.toGregorianCalendar();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant20 = null;
        mutableDateTime14.setDate(readableInstant20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime14.secondOfMinute();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property22.getAsShortText(locale23);
        org.joda.time.MutableDateTime mutableDateTime25 = property22.getMutableDateTime();
        org.joda.time.DurationField durationField26 = property22.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property22.getFieldType();
        int int28 = mutableDateTime2.get(dateTimeFieldType27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime2.yearOfCentury();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.Instant instant33 = mutableDateTime32.toInstant();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime32.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime35 = property34.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime36 = property34.roundFloor();
        long long37 = property29.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.MutableDateTime mutableDateTime38 = property29.roundCeiling();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant33", (mutableDateTime14.compareTo(instant33) == 0) == mutableDateTime14.equals(instant33));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        mutableDateTime3.setSecondOfDay((int) '#');
        int int7 = mutableDateTime3.getMonthOfYear();
        org.joda.time.DateTime dateTime8 = mutableDateTime3.toDateTimeISO();
        boolean boolean10 = mutableDateTime3.isAfter((long) (short) 10);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime3.minuteOfDay();
        mutableDateTime3.setWeekyear(56);
        mutableDateTime3.setDayOfWeek(6);
        mutableDateTime3.setSecondOfMinute(4);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime3.yearOfCentury();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime27 = mutableDateTime3.toDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:47:45.469Z", dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime21", (instant4.compareTo(mutableDateTime21) == 0) == instant4.equals(mutableDateTime21));
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
        mutableDateTime2.setHourOfDay(2);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfDay();
        org.joda.time.Instant instant9 = mutableDateTime2.toInstant();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime15.toGregorianCalendar();
        java.lang.Object obj17 = mutableDateTime15.clone();
        mutableDateTime15.addMonths(37);
        java.lang.Object obj20 = mutableDateTime15.clone();
        boolean boolean21 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant9", (mutableDateTime7.compareTo(instant9) == 0) == mutableDateTime7.equals(instant9));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.hourOfDay();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime11.dayOfYear();
        int int18 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        int int19 = mutableDateTime11.getCenturyOfEra();
        int int20 = mutableDateTime11.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(dateTimeZone8);
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone8);
        java.util.Date date11 = mutableDateTime10.toDate();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfFloor();
        boolean boolean18 = mutableDateTime17.isEqualNow();
        mutableDateTime17.setDayOfYear((int) ' ');
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        boolean boolean25 = mutableDateTime23.isSupported(dateTimeFieldType24);
        java.util.GregorianCalendar gregorianCalendar26 = mutableDateTime23.toGregorianCalendar();
        mutableDateTime17.setMillis((org.joda.time.ReadableInstant) mutableDateTime23);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime30, dateTimeZone33);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableDateTime37.add(readablePeriod40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime37.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant43 = null;
        mutableDateTime37.setDate(readableInstant43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime37.secondOfMinute();
        java.util.Locale locale46 = null;
        java.lang.String str47 = property45.getAsShortText(locale46);
        org.joda.time.MutableDateTime mutableDateTime48 = property45.getMutableDateTime();
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = mutableDateTime51.toString(dateTimeFormatter52);
        int int54 = mutableDateTime51.getYearOfCentury();
        org.joda.time.Chronology chronology55 = mutableDateTime51.getChronology();
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime48.toMutableDateTime(chronology55);
        org.joda.time.Chronology chronology57 = mutableDateTime48.getChronology();
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime34.toMutableDateTime(chronology57);
        org.joda.time.MutableDateTime mutableDateTime59 = org.joda.time.MutableDateTime.now(chronology57);
        mutableDateTime17.setChronology(chronology57);
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime10.toMutableDateTime(chronology57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant15", (mutableDateTime2.compareTo(instant15) == 0) == mutableDateTime2.equals(instant15));
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
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        mutableDateTime2.add((long) (short) -1);
        mutableDateTime2.setYear(4);
        org.joda.time.DateTime dateTime13 = mutableDateTime2.toDateTimeISO();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime16, dateTimeZone19);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant29 = null;
        mutableDateTime23.setDate(readableInstant29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime23.secondOfMinute();
        java.util.Locale locale32 = null;
        java.lang.String str33 = property31.getAsShortText(locale32);
        org.joda.time.MutableDateTime mutableDateTime34 = property31.getMutableDateTime();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        int int40 = mutableDateTime37.getYearOfCentury();
        org.joda.time.Chronology chronology41 = mutableDateTime37.getChronology();
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime34.toMutableDateTime(chronology41);
        org.joda.time.Chronology chronology43 = mutableDateTime34.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime20.toMutableDateTime(chronology43);
        mutableDateTime2.setChronology(chronology43);
        boolean boolean47 = mutableDateTime2.isBefore((long) (short) 1);
        int int48 = mutableDateTime2.getWeekyear();
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.Instant instant52 = mutableDateTime51.toInstant();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime51.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime54 = property53.roundHalfFloor();
        boolean boolean55 = mutableDateTime54.isEqualNow();
        mutableDateTime54.setDayOfYear((int) ' ');
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology59);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = null;
        boolean boolean62 = mutableDateTime60.isSupported(dateTimeFieldType61);
        java.util.GregorianCalendar gregorianCalendar63 = mutableDateTime60.toGregorianCalendar();
        mutableDateTime54.setMillis((org.joda.time.ReadableInstant) mutableDateTime60);
        java.lang.Object obj65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(obj65, chronology66);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = null;
        java.lang.String str69 = mutableDateTime67.toString(dateTimeFormatter68);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime67, dateTimeZone70);
        java.lang.Object obj72 = null;
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(obj72, chronology73);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = null;
        java.lang.String str76 = mutableDateTime74.toString(dateTimeFormatter75);
        org.joda.time.ReadablePeriod readablePeriod77 = null;
        mutableDateTime74.add(readablePeriod77);
        org.joda.time.MutableDateTime.Property property79 = mutableDateTime74.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant80 = null;
        mutableDateTime74.setDate(readableInstant80);
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime74.secondOfMinute();
        java.util.Locale locale83 = null;
        java.lang.String str84 = property82.getAsShortText(locale83);
        org.joda.time.MutableDateTime mutableDateTime85 = property82.getMutableDateTime();
        java.lang.Object obj86 = null;
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.MutableDateTime mutableDateTime88 = new org.joda.time.MutableDateTime(obj86, chronology87);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter89 = null;
        java.lang.String str90 = mutableDateTime88.toString(dateTimeFormatter89);
        int int91 = mutableDateTime88.getYearOfCentury();
        org.joda.time.Chronology chronology92 = mutableDateTime88.getChronology();
        org.joda.time.MutableDateTime mutableDateTime93 = mutableDateTime85.toMutableDateTime(chronology92);
        org.joda.time.Chronology chronology94 = mutableDateTime85.getChronology();
        org.joda.time.MutableDateTime mutableDateTime95 = mutableDateTime71.toMutableDateTime(chronology94);
        org.joda.time.MutableDateTime mutableDateTime96 = org.joda.time.MutableDateTime.now(chronology94);
        mutableDateTime54.setChronology(chronology94);
        org.joda.time.MutableDateTime mutableDateTime98 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, chronology94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and instant52", (mutableDateTime16.compareTo(instant52) == 0) == mutableDateTime16.equals(instant52));
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
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.centuryOfEra();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.toMutableDateTime();
        org.joda.time.DateTime dateTime17 = mutableDateTime16.toDateTimeISO();
        mutableDateTime16.setMinuteOfDay((int) (short) 10);
        mutableDateTime16.add((long) 5);
        int int22 = property9.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.centuryOfEra();
        java.lang.String str10 = property9.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        mutableDateTime2.add((long) (short) -1);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTime dateTime15 = mutableDateTime2.toDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.year();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime23.toMutableDateTime();
        int int25 = mutableDateTime23.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime23.dayOfMonth();
        mutableDateTime16.setTime((org.joda.time.ReadableInstant) mutableDateTime23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant21", (mutableDateTime13.compareTo(instant21) == 0) == mutableDateTime13.equals(instant21));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        boolean boolean8 = mutableDateTime2.isBefore((long) (short) -1);
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
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime11.secondOfMinute();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property19.getAsShortText(locale20);
        org.joda.time.MutableDateTime mutableDateTime22 = property19.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime24 = property19.add((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime26 = property19.add((long) 50);
        boolean boolean27 = mutableDateTime2.equals((java.lang.Object) 50);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime29.toMutableDateTime();
        mutableDateTime30.setHourOfDay(15);
        int int33 = property28.compareTo((org.joda.time.ReadableInstant) mutableDateTime30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime29", (instant3.compareTo(mutableDateTime29) == 0) == instant3.equals(mutableDateTime29));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.DateTime dateTime7 = mutableDateTime6.toDateTimeISO();
        mutableDateTime6.setMinuteOfDay((int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime6.copy();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.dayOfMonth();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property11.getAsText(locale12);
        org.joda.time.MutableDateTime mutableDateTime14 = property11.roundFloor();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfYear();
        int int19 = property18.get();
        org.joda.time.MutableDateTime mutableDateTime20 = property18.roundFloor();
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime20.add(readableDuration21);
        mutableDateTime20.setDate((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField25 = mutableDateTime20.getRoundingField();
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = mutableDateTime14.toDateTime(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime27", (instant3.compareTo(mutableDateTime27) == 0) == instant3.equals(mutableDateTime27));
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
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.dayOfWeek();
        mutableDateTime9.add((long) (short) -1);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTime dateTime22 = mutableDateTime9.toDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) 5, dateTimeZone21);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime23.toMutableDateTime(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(28432085748L, dateTimeZone27);
        java.lang.Object obj30 = mutableDateTime29.clone();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        int int38 = mutableDateTime33.getWeekOfWeekyear();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime41.getZone();
        org.joda.time.DateTime dateTime43 = mutableDateTime33.toDateTime(dateTimeZone42);
        org.joda.time.Chronology chronology44 = dateTime43.getChronology();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.dayOfYear();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime47.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField50 = property49.getField();
        int int51 = dateTime43.get(dateTimeField50);
        int int52 = mutableDateTime29.get(dateTimeField50);
        int int53 = mutableDateTime2.get(dateTimeField50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.add((long) (byte) 1);
        boolean boolean8 = mutableDateTime2.isBefore((long) (short) -1);
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
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime11.secondOfMinute();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property19.getAsShortText(locale20);
        org.joda.time.MutableDateTime mutableDateTime22 = property19.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime24 = property19.add((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime26 = property19.add((long) 50);
        boolean boolean27 = mutableDateTime2.equals((java.lang.Object) 50);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.hourOfDay();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime31.dayOfWeek();
        mutableDateTime31.add((long) (short) -1);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        org.joda.time.DateTime dateTime44 = mutableDateTime31.toDateTime(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) 5, dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone43);
        mutableDateTime2.setZoneRetainFields(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime42", (instant3.compareTo(mutableDateTime42) == 0) == instant3.equals(mutableDateTime42));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:14.317Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfCeiling();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime6.add(readablePeriod9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.hourOfDay();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime6.dayOfWeek();
        mutableDateTime6.add((long) (short) -1);
        int int15 = mutableDateTime6.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.toMutableDateTime();
        mutableDateTime16.addWeekyears(365);
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
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime22.secondOfMinute();
        java.util.Locale locale31 = null;
        java.lang.String str32 = property30.getAsShortText(locale31);
        org.joda.time.MutableDateTime mutableDateTime33 = property30.getMutableDateTime();
        org.joda.time.DurationField durationField34 = property30.getRangeDurationField();
        java.lang.String str35 = property30.getName();
        org.joda.time.DateTimeField dateTimeField36 = property30.getField();
        mutableDateTime16.setRounding(dateTimeField36);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime40, dateTimeZone43);
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        mutableDateTime47.add(readablePeriod50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime47.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant53 = null;
        mutableDateTime47.setDate(readableInstant53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime47.secondOfMinute();
        java.util.Locale locale56 = null;
        java.lang.String str57 = property55.getAsShortText(locale56);
        org.joda.time.MutableDateTime mutableDateTime58 = property55.getMutableDateTime();
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = null;
        java.lang.String str63 = mutableDateTime61.toString(dateTimeFormatter62);
        int int64 = mutableDateTime61.getYearOfCentury();
        org.joda.time.Chronology chronology65 = mutableDateTime61.getChronology();
        org.joda.time.MutableDateTime mutableDateTime66 = mutableDateTime58.toMutableDateTime(chronology65);
        org.joda.time.Chronology chronology67 = mutableDateTime58.getChronology();
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime44.toMutableDateTime(chronology67);
        org.joda.time.MutableDateTime mutableDateTime69 = mutableDateTime16.toMutableDateTime(chronology67);
        org.joda.time.MutableDateTime mutableDateTime70 = mutableDateTime6.toMutableDateTime(chronology67);
        org.joda.time.MutableDateTime mutableDateTime71 = org.joda.time.MutableDateTime.now(chronology67);
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime3, chronology67);
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime3.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime72", (mutableDateTime3.compareTo(mutableDateTime72) == 0) == mutableDateTime3.equals(mutableDateTime72));
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
        java.lang.String str5 = property4.getAsString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        mutableDateTime15.setHourOfDay(2);
        int int20 = dateTime12.compareTo((org.joda.time.ReadableInstant) mutableDateTime15);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant29 = null;
        mutableDateTime23.setDate(readableInstant29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime23.secondOfMinute();
        java.util.Locale locale32 = null;
        java.lang.String str33 = property31.getAsShortText(locale32);
        org.joda.time.MutableDateTime mutableDateTime34 = property31.getMutableDateTime();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        int int40 = mutableDateTime37.getYearOfCentury();
        org.joda.time.Chronology chronology41 = mutableDateTime37.getChronology();
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime34.toMutableDateTime(chronology41);
        mutableDateTime15.setChronology(chronology41);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime15.monthOfYear();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.Instant instant48 = mutableDateTime47.toInstant();
        mutableDateTime47.setSecondOfDay((int) '#');
        int int51 = mutableDateTime47.getMonthOfYear();
        org.joda.time.DateTime dateTime52 = mutableDateTime47.toDateTimeISO();
        boolean boolean54 = mutableDateTime47.isAfter((long) (short) 10);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime47.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime57 = property55.add((long) (byte) 10);
        int int58 = property44.compareTo((org.joda.time.ReadableInstant) mutableDateTime57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime37 and instant48", (mutableDateTime37.compareTo(instant48) == 0) == mutableDateTime37.equals(instant48));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        mutableDateTime2.add((long) (short) -1);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTime dateTime15 = mutableDateTime2.toDateTime(dateTimeZone14);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        int int20 = mutableDateTime18.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime18.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfFloor();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime22);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime30 = property28.roundFloor();
        int int31 = property28.getLeapAmount();
        boolean boolean32 = property28.isLeap();
        org.joda.time.MutableDateTime mutableDateTime33 = property28.roundHalfEven();
        java.util.Locale locale34 = null;
        int int35 = property28.getMaximumShortTextLength(locale34);
        java.lang.String str36 = property28.toString();
        org.joda.time.MutableDateTime mutableDateTime37 = property28.roundHalfCeiling();
        org.joda.time.DateTimeField dateTimeField38 = property28.getField();
        int int39 = mutableDateTime22.get(dateTimeField38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant27", (mutableDateTime13.compareTo(instant27) == 0) == mutableDateTime13.equals(instant27));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTimeISO();
        boolean boolean9 = mutableDateTime2.isAfter((long) (short) 10);
        int int10 = mutableDateTime2.getRoundingMode();
        int int11 = mutableDateTime2.getHourOfDay();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.hourOfDay();
        java.lang.String str20 = mutableDateTime14.toString();
        mutableDateTime14.setSecondOfDay(2);
        java.util.GregorianCalendar gregorianCalendar23 = mutableDateTime14.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime14.secondOfDay();
        int int25 = property24.getMaximumValue();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime28, dateTimeZone31);
        int int33 = property24.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        int int34 = mutableDateTime28.getYear();
        java.util.Date date35 = mutableDateTime28.toDate();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime36.toMutableDateTime();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime43 = property41.add((long) (short) -1);
        org.joda.time.DateTimeField dateTimeField44 = property41.getField();
        int int45 = mutableDateTime36.get(dateTimeField44);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime51 = property49.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime52 = property49.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((long) 'a');
        int int55 = mutableDateTime54.getDayOfYear();
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        mutableDateTime58.add(readablePeriod61);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime58.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant64 = null;
        mutableDateTime58.setDate(readableInstant64);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime58.secondOfMinute();
        java.util.GregorianCalendar gregorianCalendar67 = mutableDateTime58.toGregorianCalendar();
        java.lang.Object obj68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(obj68, chronology69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = null;
        java.lang.String str72 = mutableDateTime70.toString(dateTimeFormatter71);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        mutableDateTime70.add(readablePeriod73);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime70.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant76 = null;
        mutableDateTime70.setDate(readableInstant76);
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime70.secondOfMinute();
        java.util.Locale locale79 = null;
        java.lang.String str80 = property78.getAsShortText(locale79);
        org.joda.time.MutableDateTime mutableDateTime81 = property78.getMutableDateTime();
        org.joda.time.DurationField durationField82 = property78.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = property78.getFieldType();
        int int84 = mutableDateTime58.get(dateTimeFieldType83);
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime54.property(dateTimeFieldType83);
        boolean boolean86 = mutableDateTime52.isSupported(dateTimeFieldType83);
        mutableDateTime36.set(dateTimeFieldType83, 59);
        boolean boolean89 = mutableDateTime28.isSupported(dateTimeFieldType83);
        int int90 = mutableDateTime2.get(dateTimeFieldType83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
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
        mutableDateTime2.addDays((int) (byte) 100);
        mutableDateTime2.addHours(10);
        int int9 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        java.lang.String str18 = mutableDateTime12.toString();
        mutableDateTime12.setSecondOfDay(2);
        boolean boolean21 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime12);
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
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime24.year();
        mutableDateTime12.setDate((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.parse("2020-11-25T01:46:06.090Z");
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime40.dayOfWeek();
        mutableDateTime40.add((long) (short) -1);
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        org.joda.time.DateTime dateTime53 = mutableDateTime40.toDateTime(dateTimeZone52);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime((long) 5, dateTimeZone52);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(dateTimeZone52);
        mutableDateTime36.setZone(dateTimeZone52);
        org.joda.time.DateTime dateTime57 = mutableDateTime24.toDateTime(dateTimeZone52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime51", (instant3.compareTo(mutableDateTime51) == 0) == instant3.equals(mutableDateTime51));
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutableDateTime2.setDate(readableInstant8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.secondOfMinute();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property10.getAsShortText(locale11);
        org.joda.time.MutableDateTime mutableDateTime13 = property10.getMutableDateTime();
        org.joda.time.DurationField durationField14 = property10.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property10.getFieldType();
        java.util.Locale locale16 = null;
        int int17 = property10.getMaximumTextLength(locale16);
        java.util.Locale locale18 = null;
        java.lang.String str19 = property10.getAsText(locale18);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.Instant instant23 = mutableDateTime22.toInstant();
        mutableDateTime22.setSecondOfDay((int) '#');
        int int26 = mutableDateTime22.getMonthOfYear();
        org.joda.time.DateTime dateTime27 = mutableDateTime22.toDateTimeISO();
        boolean boolean29 = mutableDateTime22.isAfter((long) (short) 10);
        int int30 = mutableDateTime22.getRoundingMode();
        int int31 = mutableDateTime22.getHourOfDay();
        java.lang.Object obj32 = mutableDateTime22.clone();
        mutableDateTime22.setTime((long) 52);
        long long35 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant23", (mutableDateTime2.compareTo(instant23) == 0) == mutableDateTime2.equals(instant23));
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
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant15 = null;
        mutableDateTime9.setDate(readableInstant15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime9.secondOfMinute();
        java.util.Locale locale18 = null;
        java.lang.String str19 = property17.getAsShortText(locale18);
        org.joda.time.MutableDateTime mutableDateTime20 = property17.getMutableDateTime();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        int int26 = mutableDateTime23.getYearOfCentury();
        org.joda.time.Chronology chronology27 = mutableDateTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime20.toMutableDateTime(chronology27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.centuryOfEra();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.dayOfYear();
        int int34 = property33.get();
        org.joda.time.MutableDateTime mutableDateTime35 = property33.roundFloor();
        org.joda.time.DurationField durationField36 = property33.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property33.getFieldType();
        mutableDateTime28.set(dateTimeFieldType37, 27);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:59.788Z", dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) 5, dateTimeZone45);
        mutableDateTime28.setZone(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(dateTimeZone45);
        int int54 = mutableDateTime53.getDayOfMonth();
        long long55 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
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
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        boolean boolean10 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 'a');
        int int13 = mutableDateTime12.getDayOfYear();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant22 = null;
        mutableDateTime16.setDate(readableInstant22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime16.secondOfMinute();
        java.util.GregorianCalendar gregorianCalendar25 = mutableDateTime16.toGregorianCalendar();
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
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime28.secondOfMinute();
        java.util.Locale locale37 = null;
        java.lang.String str38 = property36.getAsShortText(locale37);
        org.joda.time.MutableDateTime mutableDateTime39 = property36.getMutableDateTime();
        org.joda.time.DurationField durationField40 = property36.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property36.getFieldType();
        int int42 = mutableDateTime16.get(dateTimeFieldType41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime12.property(dateTimeFieldType41);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime5.property(dateTimeFieldType41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
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
        int int17 = mutableDateTime5.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.copy();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime18.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime12.toMutableDateTime(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant16", (mutableDateTime2.compareTo(instant16) == 0) == mutableDateTime2.equals(instant16));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = mutableDateTime2.isSupported(dateTimeFieldType3);
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) gregorianCalendar5);
        int int7 = mutableDateTime6.getMillisOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.minuteOfHour();
        int int9 = property8.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime6", (mutableDateTime2.compareTo(mutableDateTime6) == 0) == mutableDateTime2.equals(mutableDateTime6));
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
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        java.lang.Object obj7 = mutableDateTime6.clone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj7);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime11.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.millisOfDay();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime16.add(readableDuration18, 27);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime21.toMutableDateTime();
        mutableDateTime21.addWeekyears(365);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime21.dayOfYear();
        int int26 = mutableDateTime21.getMillisOfSecond();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        boolean boolean31 = mutableDateTime29.isSupported(dateTimeFieldType30);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime34.add(readablePeriod37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant40 = null;
        mutableDateTime34.setDate(readableInstant40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime34.secondOfMinute();
        java.util.Locale locale43 = null;
        java.lang.String str44 = property42.getAsShortText(locale43);
        org.joda.time.MutableDateTime mutableDateTime45 = property42.getMutableDateTime();
        org.joda.time.DurationField durationField46 = property42.getRangeDurationField();
        java.lang.String str47 = property42.getName();
        org.joda.time.DateTimeField dateTimeField48 = property42.getField();
        mutableDateTime29.setRounding(dateTimeField48, 4);
        mutableDateTime21.setRounding(dateTimeField48);
        mutableDateTime16.setRounding(dateTimeField48);
        boolean boolean53 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime7 = mutableDateTime2.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.secondOfDay();
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
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime20.copy();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 'a');
        int int25 = mutableDateTime24.getDayOfYear();
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
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime28.secondOfMinute();
        java.util.GregorianCalendar gregorianCalendar37 = mutableDateTime28.toGregorianCalendar();
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
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime40.secondOfMinute();
        java.util.Locale locale49 = null;
        java.lang.String str50 = property48.getAsShortText(locale49);
        org.joda.time.MutableDateTime mutableDateTime51 = property48.getMutableDateTime();
        org.joda.time.DurationField durationField52 = property48.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property48.getFieldType();
        int int54 = mutableDateTime28.get(dateTimeFieldType53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime24.property(dateTimeFieldType53);
        boolean boolean56 = mutableDateTime21.isSupported(dateTimeFieldType53);
        boolean boolean57 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = property11.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar13 = mutableDateTime12.toGregorianCalendar();
        java.lang.Object obj14 = mutableDateTime12.clone();
        boolean boolean15 = mutableDateTime6.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        mutableDateTime6.setWeekOfWeekyear(20);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant26 = null;
        mutableDateTime20.setDate(readableInstant26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime20.secondOfMinute();
        java.util.Locale locale29 = null;
        java.lang.String str30 = property28.getAsShortText(locale29);
        org.joda.time.MutableDateTime mutableDateTime31 = property28.getMutableDateTime();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        int int37 = property28.compareTo((org.joda.time.ReadableInstant) mutableDateTime34);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(dateTimeZone41);
        mutableDateTime34.setZoneRetainFields(dateTimeZone41);
        org.joda.time.DateTime dateTime45 = mutableDateTime34.toDateTime();
        java.lang.Object obj46 = null;
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(obj46, chronology47);
        org.joda.time.DateTimeZone dateTimeZone49 = mutableDateTime48.getZone();
        int int50 = mutableDateTime48.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime48.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField52 = property51.getField();
        int int53 = mutableDateTime34.get(dateTimeField52);
        int int54 = mutableDateTime6.get(dateTimeField52);
        mutableDateTime6.addDays(13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime20", (instant10.compareTo(mutableDateTime20) == 0) == instant10.equals(mutableDateTime20));
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
        mutableDateTime2.addDays((int) (byte) 100);
        mutableDateTime2.setHourOfDay(0);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        mutableDateTime2.add(readablePeriod9);
        boolean boolean11 = mutableDateTime2.isEqualNow();
        mutableDateTime2.addMonths(6456);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        int int17 = mutableDateTime16.getDayOfYear();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.weekyear();
        org.joda.time.DurationField durationField19 = property18.getRangeDurationField();
        org.joda.time.DurationField durationField20 = property18.getLeapDurationField();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant29 = null;
        mutableDateTime23.setDate(readableInstant29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime23.secondOfMinute();
        java.util.Locale locale32 = null;
        java.lang.String str33 = property31.getAsShortText(locale32);
        org.joda.time.MutableDateTime mutableDateTime34 = property31.getMutableDateTime();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        int int40 = mutableDateTime37.getYearOfCentury();
        org.joda.time.Chronology chronology41 = mutableDateTime37.getChronology();
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime34.toMutableDateTime(chronology41);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(chronology41);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(chronology41);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(chronology41);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(chronology41);
        int int47 = property18.getDifference((org.joda.time.ReadableInstant) mutableDateTime46);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        mutableDateTime50.add(readablePeriod53);
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime50.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime50.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime58 = property56.add(102);
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = null;
        java.lang.String str63 = mutableDateTime61.toString(dateTimeFormatter62);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        mutableDateTime61.add(readablePeriod64);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime66.toMutableDateTime();
        mutableDateTime66.addWeekyears(365);
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
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime72.secondOfMinute();
        java.util.Locale locale81 = null;
        java.lang.String str82 = property80.getAsShortText(locale81);
        org.joda.time.MutableDateTime mutableDateTime83 = property80.getMutableDateTime();
        org.joda.time.DurationField durationField84 = property80.getRangeDurationField();
        java.lang.String str85 = property80.getName();
        org.joda.time.DateTimeField dateTimeField86 = property80.getField();
        mutableDateTime66.setRounding(dateTimeField86);
        mutableDateTime61.setRounding(dateTimeField86);
        int int89 = mutableDateTime58.get(dateTimeField86);
        int int90 = mutableDateTime46.get(dateTimeField86);
        int int91 = mutableDateTime2.get(dateTimeField86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime23", (instant3.compareTo(mutableDateTime23) == 0) == instant3.equals(mutableDateTime23));
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
        mutableDateTime2.add((long) (byte) 1);
        boolean boolean8 = mutableDateTime2.isBefore((long) (short) -1);
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
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime11.secondOfMinute();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property19.getAsShortText(locale20);
        org.joda.time.MutableDateTime mutableDateTime22 = property19.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime24 = property19.add((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime26 = property19.add((long) 50);
        boolean boolean27 = mutableDateTime2.equals((java.lang.Object) 50);
        mutableDateTime2.addYears(6327366);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime31.toMutableDateTime();
        mutableDateTime31.addWeekyears(365);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime31.dayOfYear();
        mutableDateTime31.setDate(1606268709192L);
        int int38 = property30.compareTo((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) 26);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.hourOfDay();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime43.dayOfWeek();
        mutableDateTime43.add((long) (short) -1);
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.DateTimeZone dateTimeZone55 = mutableDateTime54.getZone();
        org.joda.time.DateTime dateTime56 = mutableDateTime43.toDateTime(dateTimeZone55);
        int int57 = mutableDateTime43.getYear();
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime61.getZone();
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime((long) (-1), dateTimeZone62);
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime64.toMutableDateTime();
        mutableDateTime64.addWeekyears(365);
        java.lang.Object obj68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(obj68, chronology69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = null;
        java.lang.String str72 = mutableDateTime70.toString(dateTimeFormatter71);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        mutableDateTime70.add(readablePeriod73);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime70.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant76 = null;
        mutableDateTime70.setDate(readableInstant76);
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime70.secondOfMinute();
        java.util.Locale locale79 = null;
        java.lang.String str80 = property78.getAsShortText(locale79);
        org.joda.time.MutableDateTime mutableDateTime81 = property78.getMutableDateTime();
        org.joda.time.DurationField durationField82 = property78.getRangeDurationField();
        java.lang.String str83 = property78.getName();
        org.joda.time.DateTimeField dateTimeField84 = property78.getField();
        mutableDateTime64.setRounding(dateTimeField84);
        mutableDateTime63.setRounding(dateTimeField84);
        int int87 = mutableDateTime43.get(dateTimeField84);
        mutableDateTime40.setDate((org.joda.time.ReadableInstant) mutableDateTime43);
        long long89 = property30.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime31", (instant3.compareTo(mutableDateTime31) == 0) == instant3.equals(mutableDateTime31));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant9 = null;
        mutableDateTime3.setDate(readableInstant9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime3.secondOfMinute();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property11.getAsShortText(locale12);
        org.joda.time.MutableDateTime mutableDateTime14 = property11.getMutableDateTime();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime14.toMutableDateTime(chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology21);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:36.970Z", chronology21);
        boolean boolean26 = mutableDateTime24.isBefore((long) 17);
        int int27 = mutableDateTime24.getCenturyOfEra();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.Instant instant31 = mutableDateTime30.toInstant();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime30.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime33.toMutableDateTime();
        int int35 = mutableDateTime24.compareTo((org.joda.time.ReadableInstant) mutableDateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant31", (mutableDateTime3.compareTo(instant31) == 0) == mutableDateTime3.equals(instant31));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime0.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.set(48);
        int int6 = mutableDateTime5.getWeekOfWeekyear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime9, dateTimeZone12);
        mutableDateTime9.setSecondOfDay(10);
        mutableDateTime9.addMinutes(9);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime20.dayOfWeek();
        mutableDateTime20.add((long) (short) -1);
        mutableDateTime20.setYear(4);
        mutableDateTime20.setMillis((long) ' ');
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 'a');
        int int35 = mutableDateTime34.getDayOfWeek();
        mutableDateTime34.setMillisOfSecond(0);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        java.lang.String str46 = mutableDateTime40.toString();
        mutableDateTime40.setSecondOfDay(2);
        mutableDateTime40.setDayOfYear((int) (byte) 10);
        boolean boolean51 = mutableDateTime34.isEqual((org.joda.time.ReadableInstant) mutableDateTime40);
        boolean boolean52 = mutableDateTime20.equals((java.lang.Object) boolean51);
        mutableDateTime9.setTime((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.Instant instant54 = mutableDateTime9.toInstant();
        org.joda.time.Instant instant55 = instant54.toInstant();
        mutableDateTime5.setDate((org.joda.time.ReadableInstant) instant54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant54", (mutableDateTime9.compareTo(instant54) == 0) == mutableDateTime9.equals(instant54));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:47:10.202Z");
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime8.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (short) 10, dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone10);
        mutableDateTime1.setZone(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime12", (instant6.compareTo(mutableDateTime12) == 0) == instant6.equals(mutableDateTime12));
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        mutableDateTime2.setDate(readableInstant8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.secondOfMinute();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property10.getAsShortText(locale11);
        org.joda.time.MutableDateTime mutableDateTime13 = property10.getMutableDateTime();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime13.toMutableDateTime(chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.centuryOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.dayOfYear();
        int int27 = property26.get();
        org.joda.time.MutableDateTime mutableDateTime28 = property26.roundFloor();
        org.joda.time.DurationField durationField29 = property26.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property26.getFieldType();
        mutableDateTime21.set(dateTimeFieldType30, 27);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime21.yearOfCentury();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        int int38 = mutableDateTime36.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime36.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime40 = property39.roundHalfFloor();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.Instant instant44 = mutableDateTime43.toInstant();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime43.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime46 = property45.roundHalfFloor();
        java.util.GregorianCalendar gregorianCalendar47 = mutableDateTime46.toGregorianCalendar();
        java.lang.Object obj48 = mutableDateTime46.clone();
        boolean boolean49 = mutableDateTime40.isEqual((org.joda.time.ReadableInstant) mutableDateTime46);
        mutableDateTime40.setSecondOfDay((int) (short) 1);
        org.joda.time.DateTime dateTime52 = mutableDateTime40.toDateTimeISO();
        int int53 = dateTime52.getYear();
        int int54 = property33.compareTo((org.joda.time.ReadableInstant) dateTime52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant44", (mutableDateTime2.compareTo(instant44) == 0) == mutableDateTime2.equals(instant44));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.hourOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.add((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime11 = property8.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 'a');
        int int14 = mutableDateTime13.getDayOfYear();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant23 = null;
        mutableDateTime17.setDate(readableInstant23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime17.secondOfMinute();
        java.util.GregorianCalendar gregorianCalendar26 = mutableDateTime17.toGregorianCalendar();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant35 = null;
        mutableDateTime29.setDate(readableInstant35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime29.secondOfMinute();
        java.util.Locale locale38 = null;
        java.lang.String str39 = property37.getAsShortText(locale38);
        org.joda.time.MutableDateTime mutableDateTime40 = property37.getMutableDateTime();
        org.joda.time.DurationField durationField41 = property37.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property37.getFieldType();
        int int43 = mutableDateTime17.get(dateTimeFieldType42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime13.property(dateTimeFieldType42);
        boolean boolean45 = mutableDateTime11.isSupported(dateTimeFieldType42);
        int int46 = mutableDateTime2.get(dateTimeFieldType42);
        mutableDateTime2.setMillis((long) 2020);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.secondOfMinute();
        int int11 = mutableDateTime2.getYearOfEra();
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime2.add(readableDuration12);
        int int14 = mutableDateTime2.getMillisOfDay();
        mutableDateTime2.setMillisOfDay(32);
        org.joda.time.Instant instant17 = mutableDateTime2.toInstant();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime20, dateTimeZone23);
        mutableDateTime20.setSecondOfDay(10);
        mutableDateTime20.addMinutes(9);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.hourOfDay();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime31.dayOfWeek();
        mutableDateTime31.add((long) (short) -1);
        mutableDateTime31.setYear(4);
        mutableDateTime31.setMillis((long) ' ');
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) 'a');
        int int46 = mutableDateTime45.getDayOfWeek();
        mutableDateTime45.setMillisOfSecond(0);
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = mutableDateTime51.toString(dateTimeFormatter52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        mutableDateTime51.add(readablePeriod54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime51.hourOfDay();
        java.lang.String str57 = mutableDateTime51.toString();
        mutableDateTime51.setSecondOfDay(2);
        mutableDateTime51.setDayOfYear((int) (byte) 10);
        boolean boolean62 = mutableDateTime45.isEqual((org.joda.time.ReadableInstant) mutableDateTime51);
        boolean boolean63 = mutableDateTime31.equals((java.lang.Object) boolean62);
        mutableDateTime20.setTime((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.Instant instant65 = mutableDateTime20.toInstant();
        org.joda.time.Instant instant66 = instant65.toInstant();
        int int67 = instant17.compareTo((org.joda.time.ReadableInstant) instant65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant65", (mutableDateTime2.compareTo(instant65) == 0) == mutableDateTime2.equals(instant65));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.yearOfEra();
        java.util.Locale locale10 = null;
        int int11 = property9.getMaximumTextLength(locale10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }
}

