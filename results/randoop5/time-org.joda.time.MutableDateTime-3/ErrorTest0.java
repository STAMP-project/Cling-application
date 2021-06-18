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
        java.util.Locale locale5 = null;
        java.lang.String str6 = property4.getAsShortText(locale5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        int int17 = mutableDateTime5.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        int int4 = mutableDateTime2.getSecondOfMinute();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime7.toString(dateTimeFormatter8);
        mutableDateTime7.setTime((long) '#');
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.hourOfDay();
        java.lang.String str20 = mutableDateTime14.toString();
        int int21 = mutableDateTime7.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        boolean boolean22 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime7);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfFloor();
        int int29 = mutableDateTime28.getDayOfMonth();
        boolean boolean30 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant26", (mutableDateTime14.compareTo(instant26) == 0) == mutableDateTime14.equals(instant26));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = mutableDateTime5.toDateTime(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        int int10 = mutableDateTime9.getDayOfWeek();
        mutableDateTime9.addSeconds((int) (byte) 0);
        mutableDateTime9.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.millisOfSecond();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime9);
        int int17 = mutableDateTime9.getYear();
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
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setSecondOfDay((int) (byte) 100);
        mutableDateTime2.setYear(48);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.yearOfCentury();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime15.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        mutableDateTime2.setRounding(dateTimeField23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
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
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.centuryOfEra();
        long long24 = mutableDateTime18.getMillis();
        boolean boolean25 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime18);
        int int26 = mutableDateTime18.getMillisOfDay();
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
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setSecondOfDay((int) (byte) 100);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone19);
        mutableDateTime12.setZoneRetainFields(dateTimeZone19);
        mutableDateTime2.setZoneRetainFields(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
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
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.centuryOfEra();
        long long24 = mutableDateTime18.getMillis();
        boolean boolean25 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime18.monthOfYear();
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(chronology16);
        mutableDateTime9.setChronology(chronology16);
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime5.addHours(59);
        mutableDateTime5.setTime((long) 6288045);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology17);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime5.toMutableDateTime(chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        long long7 = mutableDateTime2.getMillis();
        int int8 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime11.toMutableDateTime(chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.add((long) (short) -1);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        mutableDateTime29.setTime((long) '#');
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime36.add(readablePeriod39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.hourOfDay();
        java.lang.String str42 = mutableDateTime36.toString();
        int int43 = mutableDateTime29.compareTo((org.joda.time.ReadableInstant) mutableDateTime36);
        int int44 = property24.compareTo((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property24.getFieldType();
        boolean boolean46 = mutableDateTime20.isSupported(dateTimeFieldType45);
        int int47 = mutableDateTime2.get(dateTimeFieldType45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime8.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (short) -1, dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime4.toMutableDateTime(dateTimeZone15);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.monthOfYear();
        mutableDateTime20.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.secondOfMinute();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime28.dayOfWeek();
        org.joda.time.DurationField durationField35 = property34.getRangeDurationField();
        java.lang.String str36 = property34.getName();
        org.joda.time.DateTimeField dateTimeField37 = property34.getField();
        mutableDateTime20.setRounding(dateTimeField37);
        mutableDateTime17.setRounding(dateTimeField37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant21", (mutableDateTime0.compareTo(instant21) == 0) == mutableDateTime0.equals(instant21));
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
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.centuryOfEra();
        long long24 = mutableDateTime18.getMillis();
        boolean boolean25 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime18);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime28.getZone();
        mutableDateTime18.setZoneRetainFields(dateTimeZone33);
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
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        int int10 = mutableDateTime9.getDayOfWeek();
        mutableDateTime9.addSeconds((int) (byte) 0);
        mutableDateTime9.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.millisOfSecond();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.String str17 = mutableDateTime9.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getWeekOfWeekyear();
        int int7 = mutableDateTime5.getDayOfYear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime10.secondOfDay();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant3", (mutableDateTime5.compareTo(instant3) == 0) == mutableDateTime5.equals(instant3));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now(dateTimeZone9);
        boolean boolean13 = mutableDateTime11.isBefore(1L);
        int int14 = mutableDateTime11.getMillisOfSecond();
        int int15 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
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
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        int int10 = mutableDateTime9.getDayOfWeek();
        mutableDateTime9.addSeconds((int) (byte) 0);
        mutableDateTime9.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.millisOfSecond();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.dayOfWeek();
        java.lang.String str18 = property17.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        mutableDateTime2.addDays((int) (byte) 100);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology13);
        mutableDateTime2.setChronology(chronology13);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        mutableDateTime19.add((long) (byte) 1);
        int int24 = mutableDateTime19.getMinuteOfDay();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        int int10 = mutableDateTime9.getDayOfWeek();
        mutableDateTime9.addSeconds((int) (byte) 0);
        mutableDateTime9.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.millisOfSecond();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        mutableDateTime19.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.secondOfMinute();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime27.add(readablePeriod30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.hourOfDay();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime27.dayOfWeek();
        org.joda.time.DurationField durationField34 = property33.getRangeDurationField();
        java.lang.String str35 = property33.getName();
        org.joda.time.DateTimeField dateTimeField36 = property33.getField();
        mutableDateTime19.setRounding(dateTimeField36);
        int int38 = mutableDateTime2.get(dateTimeField36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and mutableDateTime27", (instant20.compareTo(mutableDateTime27) == 0) == instant20.equals(mutableDateTime27));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        int int10 = mutableDateTime9.getDayOfWeek();
        mutableDateTime9.addSeconds((int) (byte) 0);
        mutableDateTime9.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.millisOfSecond();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.dayOfWeek();
        java.util.Locale locale18 = null;
        java.lang.String str19 = property17.getAsShortText(locale18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        mutableDateTime2.setWeekyear((int) (short) 10);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime9.toMutableDateTime(chronology17);
        mutableDateTime2.setChronology(chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime7", (instant3.compareTo(mutableDateTime7) == 0) == instant3.equals(mutableDateTime7));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        int int2 = mutableDateTime0.getCenturyOfEra();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.monthOfYear();
        mutableDateTime5.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.secondOfMinute();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.hourOfDay();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime13.dayOfWeek();
        org.joda.time.DurationField durationField20 = property19.getRangeDurationField();
        java.lang.String str21 = property19.getName();
        org.joda.time.DateTimeField dateTimeField22 = property19.getField();
        mutableDateTime5.setRounding(dateTimeField22);
        mutableDateTime0.setRounding(dateTimeField22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime13", (instant6.compareTo(mutableDateTime13) == 0) == instant6.equals(mutableDateTime13));
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
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime9.setSecondOfDay((int) (short) 0);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        mutableDateTime9.setZone(dateTimeZone22);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        mutableDateTime26.setSecondOfDay((int) '#');
        int int30 = mutableDateTime26.getMonthOfYear();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        int int34 = mutableDateTime33.getDayOfWeek();
        mutableDateTime33.addSeconds((int) (byte) 0);
        mutableDateTime33.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime33.millisOfSecond();
        mutableDateTime26.setTime((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime26.dayOfWeek();
        boolean boolean42 = mutableDateTime9.isEqual((org.joda.time.ReadableInstant) mutableDateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and instant27", (mutableDateTime21.compareTo(instant27) == 0) == mutableDateTime21.equals(instant27));
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
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.dayOfWeek();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.dayOfWeek();
        int int16 = property15.get();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        mutableDateTime19.setTime((long) '#');
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime26.add(readablePeriod29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime26.hourOfDay();
        java.lang.String str32 = mutableDateTime26.toString();
        int int33 = mutableDateTime19.compareTo((org.joda.time.ReadableInstant) mutableDateTime26);
        int int34 = property15.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime26", (instant3.compareTo(mutableDateTime26) == 0) == instant3.equals(mutableDateTime26));
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.centuryOfEra();
        long long24 = mutableDateTime18.getMillis();
        boolean boolean25 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime18);
        mutableDateTime8.setMinuteOfDay(336);
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime5.addHours(59);
        mutableDateTime5.setTime((long) 6288045);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 20, dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone15);
        mutableDateTime5.setZone(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        mutableDateTime2.add((long) (short) -1);
        int int11 = mutableDateTime2.getMinuteOfDay();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        org.joda.time.DateTime dateTime20 = mutableDateTime2.toDateTime(chronology18);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.monthOfYear();
        mutableDateTime23.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.secondOfMinute();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.hourOfDay();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime31.dayOfWeek();
        org.joda.time.DurationField durationField38 = property37.getRangeDurationField();
        java.lang.String str39 = property37.getName();
        org.joda.time.DateTimeField dateTimeField40 = property37.getField();
        mutableDateTime23.setRounding(dateTimeField40);
        mutableDateTime2.setRounding(dateTimeField40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant24", (mutableDateTime19.compareTo(instant24) == 0) == mutableDateTime19.equals(instant24));
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
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.centuryOfEra();
        long long24 = mutableDateTime18.getMillis();
        boolean boolean25 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.DateTimeField dateTimeField26 = mutableDateTime8.getRoundingField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
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
        int int5 = mutableDateTime2.getYearOfEra();
        mutableDateTime2.addDays(0);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfYear();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        mutableDateTime5.setSecondOfDay((int) '#');
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.dayOfWeek();
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) mutableDateTime14);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime5);
        java.util.GregorianCalendar gregorianCalendar19 = mutableDateTime5.toGregorianCalendar();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property29.getFieldType();
        boolean boolean31 = mutableDateTime22.isSupported(dateTimeFieldType30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime5.property(dateTimeFieldType30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime22", (instant6.compareTo(mutableDateTime22) == 0) == instant6.equals(mutableDateTime22));
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
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setSecondOfDay((int) (byte) 100);
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
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime22.add(readablePeriod23, 30);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime22.monthOfYear();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property36.getFieldType();
        boolean boolean38 = mutableDateTime29.isSupported(dateTimeFieldType37);
        int int39 = mutableDateTime22.get(dateTimeFieldType37);
        mutableDateTime2.set(dateTimeFieldType37, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime29", (instant3.compareTo(mutableDateTime29) == 0) == instant3.equals(mutableDateTime29));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime10.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2, dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
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
        int int5 = mutableDateTime2.getYearOfEra();
        mutableDateTime2.addDays(0);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTime dateTime9 = mutableDateTime8.toDateTime();
        int int10 = mutableDateTime8.getWeekyear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology12);
        mutableDateTime13.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone20);
        mutableDateTime13.setZoneRetainFields(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime8.toMutableDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = mutableDateTime2.toDateTime(dateTimeZone20);
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
        mutableDateTime2.addSeconds(0);
        mutableDateTime2.setMillis((long) 45);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.year();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField(2);
        org.joda.time.MutableDateTime mutableDateTime11 = property8.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTime();
        int int14 = mutableDateTime12.getWeekyear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        mutableDateTime17.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        mutableDateTime17.setZoneRetainFields(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime12.toMutableDateTime(dateTimeZone24);
        mutableDateTime11.setZone(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
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
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.dayOfWeek();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime17.secondOfDay();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime17.yearOfEra();
        int int26 = property25.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime28 = property25.add((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime31 = property30.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        int int38 = mutableDateTime35.getYearOfCentury();
        org.joda.time.Chronology chronology39 = mutableDateTime35.getChronology();
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime31.toMutableDateTime(chronology39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime46 = property44.add((long) (short) -1);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        mutableDateTime49.setTime((long) '#');
        java.lang.Object obj54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(obj54, chronology55);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = null;
        java.lang.String str58 = mutableDateTime56.toString(dateTimeFormatter57);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        mutableDateTime56.add(readablePeriod59);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime56.hourOfDay();
        java.lang.String str62 = mutableDateTime56.toString();
        int int63 = mutableDateTime49.compareTo((org.joda.time.ReadableInstant) mutableDateTime56);
        int int64 = property44.compareTo((org.joda.time.ReadableInstant) mutableDateTime56);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property44.getFieldType();
        boolean boolean66 = mutableDateTime40.isSupported(dateTimeFieldType65);
        mutableDateTime28.set(dateTimeFieldType65, (int) (byte) 1);
        int int69 = mutableDateTime11.get(dateTimeFieldType65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime29", (instant3.compareTo(mutableDateTime29) == 0) == instant3.equals(mutableDateTime29));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.010Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.Instant instant5 = mutableDateTime4.toInstant();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfFloor();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        boolean boolean17 = mutableDateTime7.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime10", (instant5.compareTo(mutableDateTime10) == 0) == instant5.equals(mutableDateTime10));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTime dateTime1 = mutableDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = mutableDateTime0.getChronology();
        mutableDateTime0.setDate((long) 971);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:31.401Z", dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfMonth();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        mutableDateTime15.setSecondOfDay((int) '#');
        int int19 = mutableDateTime15.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.yearOfCentury();
        mutableDateTime15.setSecondOfDay((int) (byte) 100);
        mutableDateTime15.setYear(48);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime15.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundHalfFloor();
        mutableDateTime11.setMillis((org.joda.time.ReadableInstant) mutableDateTime26);
        boolean boolean28 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant16", (dateTime1.compareTo(instant16) == 0) == dateTime1.equals(instant16));
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
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.dayOfWeek();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.dayOfWeek();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime18.getZone();
        org.joda.time.DateTime dateTime24 = mutableDateTime2.toDateTime(dateTimeZone23);
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
        mutableDateTime2.setDate((long) 10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.add((long) (short) -1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology13);
        mutableDateTime14.addMillis((int) 'a');
        mutableDateTime11.setTime((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.652Z");
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime22.dayOfWeek();
        java.lang.String str29 = mutableDateTime22.toString();
        int int30 = mutableDateTime22.getYear();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime22.add(readablePeriod31, 20);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        int int37 = mutableDateTime36.getDayOfWeek();
        mutableDateTime36.addSeconds((int) (byte) 0);
        mutableDateTime36.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime36.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property45.getFieldType();
        boolean boolean47 = mutableDateTime36.isSupported(dateTimeFieldType46);
        int int48 = mutableDateTime22.get(dateTimeFieldType46);
        boolean boolean49 = mutableDateTime19.isSupported(dateTimeFieldType46);
        mutableDateTime11.set(dateTimeFieldType46, 6321642);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime2.property(dateTimeFieldType46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime22", (instant3.compareTo(mutableDateTime22) == 0) == instant3.equals(mutableDateTime22));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.get();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.roundFloor();
        org.joda.time.DurationField durationField6 = property3.getRangeDurationField();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        mutableDateTime9.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.dayOfYear();
        int int15 = property14.getMaximumValue();
        boolean boolean16 = property3.equals((java.lang.Object) property14);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 'a');
        int int19 = mutableDateTime18.getDayOfYear();
        int int20 = mutableDateTime18.getYearOfCentury();
        int int21 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:31.401Z", dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.dayOfMonth();
        boolean boolean31 = mutableDateTime28.isAfter(1606268698659L);
        boolean boolean32 = mutableDateTime18.isBefore((org.joda.time.ReadableInstant) mutableDateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime25", (instant10.compareTo(mutableDateTime25) == 0) == instant10.equals(mutableDateTime25));
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
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:31.401Z", dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:41.867Z", dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone11);
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant3", (mutableDateTime5.compareTo(instant3) == 0) == mutableDateTime5.equals(instant3));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime5.addHours(59);
        boolean boolean9 = mutableDateTime5.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTime dateTime11 = mutableDateTime10.toDateTime();
        int int12 = mutableDateTime10.getWeekyear();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology14);
        mutableDateTime15.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime15.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        mutableDateTime15.setZoneRetainFields(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime10.toMutableDateTime(dateTimeZone22);
        mutableDateTime5.setZoneRetainFields(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
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
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        int int10 = mutableDateTime9.getDayOfWeek();
        mutableDateTime9.addSeconds((int) (byte) 0);
        mutableDateTime9.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.millisOfSecond();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime9);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        mutableDateTime19.setTime((long) '#');
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime26.add(readablePeriod29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime26.hourOfDay();
        java.lang.String str32 = mutableDateTime26.toString();
        int int33 = mutableDateTime19.compareTo((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.DateTime dateTime34 = mutableDateTime26.toDateTimeISO();
        boolean boolean35 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) dateTime34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime26", (instant3.compareTo(mutableDateTime26) == 0) == instant3.equals(mutableDateTime26));
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
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime5.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        int int11 = mutableDateTime10.getDayOfWeek();
        mutableDateTime10.addSeconds((int) (byte) 0);
        mutableDateTime10.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfCeiling();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.millisOfSecond();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 20, dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime28 = mutableDateTime2.toDateTime(dateTimeZone24);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.Instant instant32 = mutableDateTime31.toInstant();
        mutableDateTime31.setSecondOfDay((int) '#');
        int int35 = mutableDateTime31.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.yearOfCentury();
        mutableDateTime31.setSecondOfDay((int) (byte) 100);
        boolean boolean39 = dateTime28.isBefore((org.joda.time.ReadableInstant) mutableDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and instant32", (mutableDateTime23.compareTo(instant32) == 0) == mutableDateTime23.equals(instant32));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.addSeconds(0);
        boolean boolean6 = mutableDateTime2.isAfterNow();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        int int10 = mutableDateTime9.getDayOfWeek();
        mutableDateTime9.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.secondOfMinute();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.weekyear();
        org.joda.time.DurationField durationField15 = property14.getDurationField();
        org.joda.time.DateTimeField dateTimeField16 = property14.getField();
        int int17 = mutableDateTime2.get(dateTimeField16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime9.addDays(19);
        mutableDateTime9.setMillisOfDay(49);
        boolean boolean21 = mutableDateTime9.isBeforeNow();
        mutableDateTime9.addMonths(0);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.parse("2020-11-25T01:44:52.747Z");
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        mutableDateTime25.setZone(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = mutableDateTime9.toDateTime(dateTimeZone29);
        org.joda.time.Instant instant33 = mutableDateTime9.toInstant();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime9.add(readablePeriod34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and instant33", (dateTime32.compareTo(instant33) == 0) == dateTime32.equals(instant33));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime5.addHours(59);
        boolean boolean9 = mutableDateTime5.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfMonth();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.dayOfMonth();
        java.lang.String str13 = property12.getAsString();
        java.lang.String str14 = property12.getAsShortText();
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property12.getFieldType();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime5.property(dateTimeFieldType16);
        org.joda.time.MutableDateTime mutableDateTime18 = property17.getMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setSecondOfDay((int) (byte) 100);
        mutableDateTime2.setYear(48);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        org.joda.time.Chronology chronology24 = mutableDateTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime16.toMutableDateTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(chronology24);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime13, chronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
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
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime9.addDays(19);
        mutableDateTime9.setMillisOfDay(49);
        boolean boolean21 = mutableDateTime9.isBeforeNow();
        mutableDateTime9.addMonths(0);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.parse("2020-11-25T01:44:52.747Z");
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        mutableDateTime25.setZone(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = mutableDateTime9.toDateTime(dateTimeZone29);
        org.joda.time.Instant instant33 = mutableDateTime9.toInstant();
        mutableDateTime9.addHours(42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and instant33", (dateTime32.compareTo(instant33) == 0) == dateTime32.equals(instant33));
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime8.yearOfEra();
        org.joda.time.DurationField durationField17 = property16.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        int int10 = mutableDateTime9.getDayOfWeek();
        mutableDateTime9.addSeconds((int) (byte) 0);
        mutableDateTime9.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.millisOfSecond();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 'a');
        int int19 = mutableDateTime18.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        boolean boolean21 = mutableDateTime2.equals((java.lang.Object) property20);
        boolean boolean22 = property20.isLeap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        int int9 = mutableDateTime6.getYearOfCentury();
        org.joda.time.Chronology chronology10 = mutableDateTime6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(chronology10);
        mutableDateTime12.add(1606268671401L);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.Instant instant18 = mutableDateTime17.toInstant();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime20.toMutableDateTime();
        mutableDateTime20.addHours(59);
        int int24 = mutableDateTime20.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime20.add(readablePeriod25, 6292);
        int int28 = mutableDateTime12.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant18", (mutableDateTime0.compareTo(instant18) == 0) == mutableDateTime0.equals(instant18));
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
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime9.setSecondOfDay((int) (short) 0);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        mutableDateTime9.setZone(dateTimeZone22);
        java.util.Date date24 = mutableDateTime9.toDate();
        int int25 = mutableDateTime9.getMillisOfSecond();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        mutableDateTime28.setSecondOfDay((int) '#');
        int int32 = mutableDateTime28.getMonthOfYear();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        int int36 = mutableDateTime35.getDayOfWeek();
        mutableDateTime35.addSeconds((int) (byte) 0);
        mutableDateTime35.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime35.millisOfSecond();
        mutableDateTime28.setTime((org.joda.time.ReadableInstant) mutableDateTime35);
        mutableDateTime28.setSecondOfDay((int) ' ');
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        int int50 = mutableDateTime47.getYearOfCentury();
        org.joda.time.Chronology chronology51 = mutableDateTime47.getChronology();
        int int52 = mutableDateTime47.getWeekOfWeekyear();
        mutableDateTime47.setWeekyear(1970);
        org.joda.time.DateTimeField dateTimeField55 = mutableDateTime47.getRoundingField();
        int int56 = mutableDateTime28.compareTo((org.joda.time.ReadableInstant) mutableDateTime47);
        mutableDateTime9.setDate((org.joda.time.ReadableInstant) mutableDateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and instant29", (mutableDateTime21.compareTo(instant29) == 0) == mutableDateTime21.equals(instant29));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        int int2 = mutableDateTime1.getDayOfYear();
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(obj3, chronology4);
        org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
        mutableDateTime5.setSecondOfDay((int) '#');
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime14.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.dayOfWeek();
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) mutableDateTime14);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime5);
        java.util.GregorianCalendar gregorianCalendar19 = mutableDateTime5.toGregorianCalendar();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        mutableDateTime22.setTime((long) '#');
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.hourOfDay();
        java.lang.String str35 = mutableDateTime29.toString();
        int int36 = mutableDateTime22.compareTo((org.joda.time.ReadableInstant) mutableDateTime29);
        int int37 = mutableDateTime29.getYearOfCentury();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        int int41 = mutableDateTime40.getDayOfWeek();
        mutableDateTime40.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime40.secondOfMinute();
        mutableDateTime40.setSecondOfMinute((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime40.weekyear();
        org.joda.time.Chronology chronology48 = mutableDateTime40.getChronology();
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(chronology48);
        org.joda.time.DateTime dateTime50 = mutableDateTime29.toDateTime(chronology48);
        org.joda.time.DateTime dateTime51 = mutableDateTime5.toDateTime(chronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime29", (instant6.compareTo(mutableDateTime29) == 0) == instant6.equals(mutableDateTime29));
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        int int11 = mutableDateTime10.getDayOfWeek();
        mutableDateTime10.addSeconds((int) (byte) 0);
        mutableDateTime10.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime17 = property16.roundHalfCeiling();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime17);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        mutableDateTime21.setSecondOfDay((int) '#');
        int int25 = mutableDateTime21.getMonthOfYear();
        org.joda.time.ReadableDuration readableDuration26 = null;
        mutableDateTime21.add(readableDuration26);
        mutableDateTime17.setDate((org.joda.time.ReadableInstant) mutableDateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and instant22", (mutableDateTime17.compareTo(instant22) == 0) == mutableDateTime17.equals(instant22));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setSecondOfDay((int) (byte) 100);
        mutableDateTime2.setYear(48);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 6296);
        int int15 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime14);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime19.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (short) -1, dateTimeZone26);
        org.joda.time.DateTime dateTime28 = mutableDateTime14.toDateTime(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime11.toMutableDateTime(chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology19);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(chronology19);
        java.lang.String str23 = mutableDateTime22.toString();
        mutableDateTime22.addDays(2);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime22.minuteOfDay();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        int int30 = mutableDateTime29.getDayOfWeek();
        mutableDateTime29.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime29.secondOfMinute();
        mutableDateTime29.setSecondOfMinute((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime29.weekyear();
        org.joda.time.Chronology chronology37 = mutableDateTime29.getChronology();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime22.toMutableDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime8, chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
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
        mutableDateTime5.addYears(1);
        int int9 = mutableDateTime5.getWeekyear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        mutableDateTime5.setRounding(dateTimeField18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
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
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.centuryOfEra();
        long long24 = mutableDateTime18.getMillis();
        boolean boolean25 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:44:52.747Z");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now(dateTimeZone5);
        mutableDateTime1.setZone(dateTimeZone5);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime1.dayOfYear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        mutableDateTime11.setSecondOfDay((int) '#');
        int int15 = mutableDateTime11.getMonthOfYear();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        int int19 = mutableDateTime18.getDayOfWeek();
        mutableDateTime18.addSeconds((int) (byte) 0);
        mutableDateTime18.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.millisOfSecond();
        mutableDateTime11.setTime((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime11.dayOfWeek();
        int int27 = property8.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant12", (mutableDateTime2.compareTo(instant12) == 0) == mutableDateTime2.equals(instant12));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTime dateTime1 = mutableDateTime0.toDateTime();
        int int2 = mutableDateTime0.getWeekyear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology4);
        mutableDateTime5.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        mutableDateTime5.setZoneRetainFields(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime0.toMutableDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology17);
        mutableDateTime18.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime18.minuteOfDay();
        java.lang.String str22 = property21.getAsString();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        mutableDateTime25.addDays((int) (byte) 100);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        int int35 = mutableDateTime32.getYearOfCentury();
        org.joda.time.Chronology chronology36 = mutableDateTime32.getChronology();
        int int37 = mutableDateTime25.compareTo((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.ReadableDuration readableDuration38 = null;
        mutableDateTime32.add(readableDuration38, 45);
        int int41 = property21.compareTo((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.ReadableDuration readableDuration42 = null;
        mutableDateTime32.add(readableDuration42);
        mutableDateTime0.setTime((org.joda.time.ReadableInstant) mutableDateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant26", (dateTime1.compareTo(instant26) == 0) == dateTime1.equals(instant26));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime9.addDays(19);
        mutableDateTime9.setMillisOfDay(49);
        boolean boolean21 = mutableDateTime9.isBeforeNow();
        mutableDateTime9.addMonths(0);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.parse("2020-11-25T01:44:52.747Z");
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        mutableDateTime25.setZone(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = mutableDateTime9.toDateTime(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.weekyear();
        int int36 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime34);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.Instant instant40 = mutableDateTime39.toInstant();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime39.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime42 = property41.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime43 = property41.roundFloor();
        boolean boolean44 = mutableDateTime9.equals((java.lang.Object) mutableDateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime26 and instant40", (mutableDateTime26.compareTo(instant40) == 0) == mutableDateTime26.equals(instant40));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        int int9 = mutableDateTime6.getYearOfCentury();
        org.joda.time.Chronology chronology10 = mutableDateTime6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(chronology10);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology18);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime11.toMutableDateTime(chronology18);
        org.joda.time.ReadableInstant readableInstant22 = null;
        mutableDateTime11.setDate(readableInstant22);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime30 = property28.roundFloor();
        java.util.Locale locale31 = null;
        int int32 = property28.getMaximumTextLength(locale31);
        org.joda.time.MutableDateTime mutableDateTime33 = property28.getMutableDateTime();
        boolean boolean34 = mutableDateTime11.isBefore((org.joda.time.ReadableInstant) mutableDateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant27", (mutableDateTime0.compareTo(instant27) == 0) == mutableDateTime0.equals(instant27));
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
        int int6 = mutableDateTime2.getMonthOfYear();
        long long7 = mutableDateTime2.getMillis();
        mutableDateTime2.setMillisOfSecond(0);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime12.toMutableDateTimeISO();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        mutableDateTime21.setTime((long) '#');
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        java.lang.String str34 = mutableDateTime28.toString();
        int int35 = mutableDateTime21.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        java.lang.Object obj36 = mutableDateTime21.clone();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime21.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property37.getFieldType();
        boolean boolean39 = mutableDateTime12.isSupported(dateTimeFieldType38);
        boolean boolean40 = mutableDateTime2.isSupported(dateTimeFieldType38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
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
        mutableDateTime2.addDays((int) (byte) 100);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        int int14 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        int int15 = mutableDateTime2.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
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
        mutableDateTime5.addWeeks((int) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        mutableDateTime3.setTime((long) '#');
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        java.lang.String str16 = mutableDateTime10.toString();
        int int17 = mutableDateTime3.compareTo((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime10.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfCeiling();
        boolean boolean21 = mutableDateTime19.isEqual(1606268698659L);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        int int27 = mutableDateTime24.getYearOfCentury();
        org.joda.time.Chronology chronology28 = mutableDateTime24.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime19.toMutableDateTime(chronology28);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 42, chronology28);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.Instant instant35 = mutableDateTime34.toInstant();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime34.monthOfYear();
        mutableDateTime34.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime40 = property39.roundCeiling();
        org.joda.time.DateTimeField dateTimeField41 = property39.getField();
        mutableDateTime31.setRounding(dateTimeField41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant35", (mutableDateTime10.compareTo(instant35) == 0) == mutableDateTime10.equals(instant35));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:31.401Z", dateTimeZone12);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.dayOfWeek();
        int int23 = property22.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime25 = property22.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime26 = property22.roundHalfEven();
        int int27 = mutableDateTime26.getCenturyOfEra();
        mutableDateTime13.setTime((org.joda.time.ReadableInstant) mutableDateTime26);
        mutableDateTime26.addWeeks(660);
        long long31 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        boolean boolean7 = mutableDateTime2.isBefore((long) (short) -1);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfMonth();
        java.lang.String str9 = property8.getAsString();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:31.401Z", dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone14);
        long long18 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundFloor();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime11.toMutableDateTimeISO();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime11.toString(dateTimeFormatter18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime11.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.getMutableDateTime();
        boolean boolean22 = mutableDateTime8.isAfter((org.joda.time.ReadableInstant) mutableDateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
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
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfYear();
        int int10 = property9.get();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime13 = property9.add((int) (short) -1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        java.util.Locale locale18 = null;
        java.lang.String str19 = property17.getAsText(locale18);
        boolean boolean20 = property17.isLeap();
        org.joda.time.MutableDateTime mutableDateTime21 = property17.roundHalfEven();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.minuteOfDay();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime21.toMutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime13, chronology29);
        org.joda.time.DateTime dateTime33 = mutableDateTime2.toDateTime(chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime25", (instant3.compareTo(mutableDateTime25) == 0) == instant3.equals(mutableDateTime25));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.get();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime7 = property3.add((int) (short) -1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property11.getAsText(locale12);
        boolean boolean14 = property11.isLeap();
        org.joda.time.MutableDateTime mutableDateTime15 = property11.roundHalfEven();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.minuteOfDay();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime15.toMutableDateTime(chronology23);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime7, chronology23);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime29.toMutableDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(chronology37);
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(chronology37);
        java.lang.String str41 = mutableDateTime40.toString();
        mutableDateTime40.addDays(2);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime40.minuteOfDay();
        int int45 = mutableDateTime40.getYear();
        mutableDateTime26.setMillis((org.joda.time.ReadableInstant) mutableDateTime40);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.Instant instant50 = mutableDateTime49.toInstant();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime49.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime53 = property51.roundFloor();
        java.util.Locale locale54 = null;
        java.lang.String str55 = property51.getAsText(locale54);
        org.joda.time.MutableDateTime mutableDateTime56 = property51.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property51.getFieldType();
        int int58 = mutableDateTime26.get(dateTimeFieldType57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant50", (mutableDateTime19.compareTo(instant50) == 0) == mutableDateTime19.equals(instant50));
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
        mutableDateTime2.addDays((int) (byte) 100);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        int int14 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime2.setWeekyear(606);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:44:52.747Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfMonth();
        java.lang.String str3 = property2.toString();
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
        int int15 = mutableDateTime6.getMinuteOfDay();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.DateTime dateTime24 = mutableDateTime6.toDateTime(chronology22);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime6.add(readablePeriod25, (int) (short) 100);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        mutableDateTime30.setTime((long) '#');
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableDateTime37.add(readablePeriod40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime37.hourOfDay();
        java.lang.String str43 = mutableDateTime37.toString();
        int int44 = mutableDateTime30.compareTo((org.joda.time.ReadableInstant) mutableDateTime37);
        boolean boolean45 = mutableDateTime6.isBefore((org.joda.time.ReadableInstant) mutableDateTime30);
        int int46 = property2.compareTo((org.joda.time.ReadableInstant) mutableDateTime6);
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.Instant instant50 = mutableDateTime49.toInstant();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime49.monthOfYear();
        mutableDateTime49.addDays((int) (byte) 100);
        int int54 = property2.compareTo((org.joda.time.ReadableInstant) mutableDateTime49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and instant50", (mutableDateTime18.compareTo(instant50) == 0) == mutableDateTime18.equals(instant50));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.addWrapField(4);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        org.joda.time.DateTime dateTime18 = mutableDateTime12.toDateTimeISO();
        org.joda.time.DateTime dateTime19 = mutableDateTime12.toDateTime();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime12.era();
        mutableDateTime9.setMillis((org.joda.time.ReadableInstant) mutableDateTime12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant3", (mutableDateTime9.compareTo(instant3) == 0) == mutableDateTime9.equals(instant3));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundCeiling();
        org.joda.time.DateTime dateTime9 = mutableDateTime8.toDateTimeISO();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime13.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) (short) -1, dateTimeZone20);
        java.lang.String str22 = mutableDateTime21.toString();
        org.joda.time.ReadableDuration readableDuration23 = null;
        mutableDateTime21.add(readableDuration23, 0);
        mutableDateTime21.addMillis(177);
        boolean boolean28 = mutableDateTime8.isAfter((org.joda.time.ReadableInstant) mutableDateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
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
        mutableDateTime2.add((long) (byte) 1);
        int int7 = mutableDateTime2.getMinuteOfDay();
        mutableDateTime2.setMillis((long) 19);
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.parse("2020-11-25T01:44:52.111Z");
        mutableDateTime11.addYears(49);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        org.joda.time.DateTime dateTime22 = mutableDateTime16.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime16.yearOfEra();
        mutableDateTime16.setTime((long) 336);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime16.getZone();
        boolean boolean27 = mutableDateTime11.equals((java.lang.Object) dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        mutableDateTime2.setZone(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime22", (instant3.compareTo(dateTime22) == 0) == instant3.equals(dateTime22));
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
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime2.add(readableDuration7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property13.getAsText(locale14);
        boolean boolean16 = property13.isLeap();
        org.joda.time.MutableDateTime mutableDateTime17 = property13.roundHalfEven();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.minuteOfDay();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime17.toMutableDateTime(chronology25);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 7, chronology25);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime2.toMutableDateTime(chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
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
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundFloor();
        java.util.Locale locale7 = null;
        int int8 = property4.getMaximumTextLength(locale7);
        org.joda.time.MutableDateTime mutableDateTime9 = property4.getMutableDateTime();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        mutableDateTime12.setMillisOfSecond(7);
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
        int int28 = mutableDateTime20.getYear();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime20.add(readablePeriod29, 20);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        int int35 = mutableDateTime34.getDayOfWeek();
        mutableDateTime34.addSeconds((int) (byte) 0);
        mutableDateTime34.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime34.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime42.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property43.getFieldType();
        boolean boolean45 = mutableDateTime34.isSupported(dateTimeFieldType44);
        int int46 = mutableDateTime20.get(dateTimeFieldType44);
        boolean boolean47 = mutableDateTime12.isSupported(dateTimeFieldType44);
        int int48 = mutableDateTime9.get(dateTimeFieldType44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
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
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime8.yearOfEra();
        java.lang.String str17 = property16.getAsShortText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime13 = property8.addWrapField(10025);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.add((long) (short) -1);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        mutableDateTime22.setTime((long) '#');
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.hourOfDay();
        java.lang.String str35 = mutableDateTime29.toString();
        int int36 = mutableDateTime22.compareTo((org.joda.time.ReadableInstant) mutableDateTime29);
        int int37 = property17.compareTo((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property40.getFieldType();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime29.property(dateTimeFieldType41);
        int int43 = mutableDateTime13.get(dateTimeFieldType41);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.Instant instant47 = mutableDateTime46.toInstant();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime46.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime49 = property48.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime50 = property48.roundFloor();
        org.joda.time.Chronology chronology51 = mutableDateTime50.getChronology();
        org.joda.time.DateTime dateTime52 = mutableDateTime13.toDateTime(chronology51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime29 and instant47", (mutableDateTime29.compareTo(instant47) == 0) == mutableDateTime29.equals(instant47));
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
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.Instant instant9 = mutableDateTime2.toInstant();
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutableDateTime2.add(readableDuration10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.weekyear();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.hourOfDay();
        org.joda.time.DateTime dateTime21 = mutableDateTime15.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime15.weekyear();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone26);
        boolean boolean30 = mutableDateTime28.isBefore(1L);
        int int31 = mutableDateTime28.getMillisOfSecond();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime28.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTime dateTime34 = mutableDateTime33.toDateTime();
        int int35 = mutableDateTime33.getWeekyear();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology37);
        mutableDateTime38.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime38.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime42.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime44 = property43.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(dateTimeZone45);
        mutableDateTime38.setZoneRetainFields(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime33.toMutableDateTime(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime28, dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime15, dateTimeZone45);
        mutableDateTime2.setZoneRetainFields(dateTimeZone45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime15", (instant9.compareTo(mutableDateTime15) == 0) == instant9.equals(mutableDateTime15));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:31.401Z", dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfMonth();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime19.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (short) -1, dateTimeZone26);
        int int28 = property15.getDifference((org.joda.time.ReadableInstant) mutableDateTime27);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = null;
        java.lang.String str33 = mutableDateTime31.toString(dateTimeFormatter32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime31.add(readablePeriod34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.hourOfDay();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime31.dayOfWeek();
        java.lang.String str38 = mutableDateTime31.toString();
        int int39 = mutableDateTime31.getYear();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableDateTime31.add(readablePeriod40, 20);
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        int int46 = mutableDateTime45.getDayOfWeek();
        mutableDateTime45.addSeconds((int) (byte) 0);
        mutableDateTime45.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime45.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime53.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property54.getFieldType();
        boolean boolean56 = mutableDateTime45.isSupported(dateTimeFieldType55);
        int int57 = mutableDateTime31.get(dateTimeFieldType55);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime27.property(dateTimeFieldType55);
        org.joda.time.MutableDateTime mutableDateTime60 = property58.addWrapField(48);
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.DateTimeZone dateTimeZone65 = mutableDateTime64.getZone();
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:31.401Z", dateTimeZone65);
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(dateTimeZone65);
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime67.dayOfMonth();
        int int69 = mutableDateTime67.getMonthOfYear();
        int int70 = property58.getDifference((org.joda.time.ReadableInstant) mutableDateTime67);
        org.joda.time.DateTimeField dateTimeField71 = property58.getField();
        mutableDateTime5.setRounding(dateTimeField71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundCeiling();
        org.joda.time.DateTime dateTime9 = mutableDateTime8.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime8.copy();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        mutableDateTime13.setTime((long) '#');
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime20.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        java.lang.String str26 = mutableDateTime20.toString();
        int int27 = mutableDateTime13.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        mutableDateTime20.setSecondOfDay((int) (short) 0);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        mutableDateTime20.setZone(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = mutableDateTime8.toDateTime(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime32", (instant3.compareTo(mutableDateTime32) == 0) == instant3.equals(mutableDateTime32));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.addSeconds(0);
        mutableDateTime2.setMillis((long) 45);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.year();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.addWrapField(2);
        org.joda.time.MutableDateTime mutableDateTime11 = property8.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime14.toMutableDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology22);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology22);
        java.lang.String str26 = mutableDateTime25.toString();
        mutableDateTime25.addDays(2);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime25.minuteOfDay();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        int int33 = mutableDateTime32.getDayOfWeek();
        mutableDateTime32.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime32.secondOfMinute();
        mutableDateTime32.setSecondOfMinute((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime32.weekyear();
        org.joda.time.Chronology chronology40 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime25.toMutableDateTime(chronology40);
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime11.toMutableDateTime(chronology40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
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
        mutableDateTime2.setMonthOfYear((int) (byte) 10);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        mutableDateTime9.setTime((long) '#');
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.hourOfDay();
        java.lang.String str22 = mutableDateTime16.toString();
        int int23 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        mutableDateTime16.setSecondOfDay((int) (short) 0);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        mutableDateTime16.setZone(dateTimeZone29);
        java.util.Date date31 = mutableDateTime16.toDate();
        mutableDateTime16.setMillisOfDay((int) '4');
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        int int39 = mutableDateTime36.getYearOfCentury();
        org.joda.time.Chronology chronology40 = mutableDateTime36.getChronology();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        int int44 = mutableDateTime43.getDayOfWeek();
        mutableDateTime43.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime43.secondOfMinute();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.weekyear();
        org.joda.time.DurationField durationField49 = property48.getDurationField();
        org.joda.time.DateTimeField dateTimeField50 = property48.getField();
        mutableDateTime36.setRounding(dateTimeField50);
        mutableDateTime16.setRounding(dateTimeField50);
        mutableDateTime2.setRounding(dateTimeField50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        int int10 = mutableDateTime9.getDayOfWeek();
        mutableDateTime9.addSeconds((int) (byte) 0);
        mutableDateTime9.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.millisOfSecond();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 'a');
        int int19 = mutableDateTime18.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.monthOfYear();
        boolean boolean21 = mutableDateTime2.equals((java.lang.Object) property20);
        long long22 = property20.remainder();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        mutableDateTime2.addDays((int) (byte) 100);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        int int14 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.Chronology chronology15 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime9.toMutableDateTimeISO();
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
        int int30 = mutableDateTime19.getMillisOfSecond();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime33.add(readablePeriod36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.hourOfDay();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime33.dayOfWeek();
        org.joda.time.DurationField durationField40 = property39.getRangeDurationField();
        java.lang.String str41 = property39.toString();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.dayOfYear();
        java.util.Locale locale46 = null;
        java.lang.String str47 = property45.getAsText(locale46);
        boolean boolean48 = property45.isLeap();
        org.joda.time.MutableDateTime mutableDateTime49 = property45.roundHalfEven();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime49.minuteOfDay();
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = null;
        java.lang.String str55 = mutableDateTime53.toString(dateTimeFormatter54);
        int int56 = mutableDateTime53.getYearOfCentury();
        org.joda.time.Chronology chronology57 = mutableDateTime53.getChronology();
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(chronology57);
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime49.toMutableDateTime(chronology57);
        boolean boolean60 = property39.equals((java.lang.Object) mutableDateTime49);
        org.joda.time.DateTimeZone dateTimeZone61 = mutableDateTime49.getZone();
        org.joda.time.DateTime dateTime62 = mutableDateTime19.toDateTime(dateTimeZone61);
        mutableDateTime16.setZone(dateTimeZone61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.add(6352411);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.yearOfCentury();
        mutableDateTime17.setTime((long) 'a');
        long long21 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime12", (instant3.compareTo(mutableDateTime12) == 0) == instant3.equals(mutableDateTime12));
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
        int int5 = mutableDateTime2.getYearOfEra();
        mutableDateTime2.addDays(0);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        mutableDateTime10.setTime((long) '#');
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        java.lang.String str23 = mutableDateTime17.toString();
        int int24 = mutableDateTime10.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime10.setWeekOfWeekyear(11);
        mutableDateTime10.addDays((-1));
        boolean boolean29 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setSecondOfDay((int) (byte) 100);
        mutableDateTime2.setYear(48);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.yearOfCentury();
        int int13 = property12.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.util.Date date16 = mutableDateTime15.toDate();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime15);
        mutableDateTime17.setDate((long) 606);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        int int30 = mutableDateTime27.getYearOfCentury();
        org.joda.time.Chronology chronology31 = mutableDateTime27.getChronology();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime23.toMutableDateTime(chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(chronology31);
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(chronology31);
        java.lang.String str35 = mutableDateTime34.toString();
        mutableDateTime34.addDays(2);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime34.minuteOfDay();
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        int int42 = mutableDateTime41.getDayOfWeek();
        mutableDateTime41.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime41.secondOfMinute();
        mutableDateTime41.setSecondOfMinute((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime41.weekyear();
        org.joda.time.Chronology chronology49 = mutableDateTime41.getChronology();
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime34.toMutableDateTime(chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime34.getZone();
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) 204, dateTimeZone51);
        mutableDateTime17.setZone(dateTimeZone51);
        int int54 = property12.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
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
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.centuryOfEra();
        long long24 = mutableDateTime18.getMillis();
        boolean boolean25 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime18);
        mutableDateTime8.addYears(6428);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:44:52.747Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundFloor();
        int int4 = mutableDateTime3.getSecondOfMinute();
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
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime17.add(readablePeriod18, 30);
        int int21 = mutableDateTime17.getWeekyear();
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        int int25 = mutableDateTime24.getDayOfWeek();
        mutableDateTime24.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime24.secondOfMinute();
        mutableDateTime24.setSecondOfMinute((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime24.weekyear();
        org.joda.time.Chronology chronology32 = mutableDateTime24.getChronology();
        mutableDateTime17.setChronology(chronology32);
        boolean boolean34 = mutableDateTime3.equals((java.lang.Object) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime17", (mutableDateTime3.compareTo(mutableDateTime17) == 0) == mutableDateTime3.equals(mutableDateTime17));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:31.401Z", dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:41.867Z", dateTimeZone5);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.roundFloor();
        java.util.Locale locale16 = null;
        java.lang.String str17 = property13.getAsText(locale16);
        org.joda.time.MutableDateTime mutableDateTime18 = property13.roundHalfFloor();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property13.getFieldType();
        boolean boolean20 = mutableDateTime8.isSupported(dateTimeFieldType19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant12", (mutableDateTime4.compareTo(instant12) == 0) == mutableDateTime4.equals(instant12));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.get();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime7 = property3.add((int) (short) -1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property11.getAsText(locale12);
        boolean boolean14 = property11.isLeap();
        org.joda.time.MutableDateTime mutableDateTime15 = property11.roundHalfEven();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.minuteOfDay();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime15.toMutableDateTime(chronology23);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime7, chronology23);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.era();
        mutableDateTime26.setDate((long) (byte) -1);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.hourOfDay();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime32.dayOfWeek();
        org.joda.time.Instant instant39 = mutableDateTime32.toInstant();
        mutableDateTime32.addMillis((int) 'a');
        mutableDateTime26.setDate((org.joda.time.ReadableInstant) mutableDateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant39", (mutableDateTime19.compareTo(instant39) == 0) == mutableDateTime19.equals(instant39));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getRoundingMode();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.yearOfCentury();
        int int16 = mutableDateTime14.getYearOfEra();
        mutableDateTime14.addMillis(403);
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
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
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology13);
        mutableDateTime2.setChronology(chronology13);
        java.lang.String str17 = mutableDateTime2.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.dayOfWeek();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.dayOfWeek();
        int int16 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.dayOfWeek();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime19.secondOfDay();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime19.yearOfEra();
        int int28 = property27.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime30 = property27.addWrapField(100);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime30);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        int int35 = mutableDateTime34.getDayOfWeek();
        mutableDateTime34.addSeconds((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration38 = null;
        mutableDateTime34.add(readableDuration38, (int) (short) -1);
        boolean boolean41 = mutableDateTime34.isEqualNow();
        mutableDateTime30.setMillis((org.joda.time.ReadableInstant) mutableDateTime34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime30", (instant3.compareTo(mutableDateTime30) == 0) == instant3.equals(mutableDateTime30));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        int int10 = mutableDateTime9.getDayOfWeek();
        mutableDateTime9.addSeconds((int) (byte) 0);
        mutableDateTime9.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.millisOfSecond();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime2.dayOfWeek();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        int int22 = mutableDateTime21.getDayOfWeek();
        mutableDateTime21.addSeconds((int) (byte) 0);
        mutableDateTime21.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfCeiling();
        java.lang.String str29 = property27.getAsText();
        org.joda.time.MutableDateTime mutableDateTime31 = property27.add((int) (byte) 1);
        int int32 = property18.compareTo((org.joda.time.ReadableInstant) mutableDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        mutableDateTime2.add((long) (short) -1);
        int int11 = mutableDateTime2.getMinuteOfDay();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        org.joda.time.DateTime dateTime20 = mutableDateTime2.toDateTime(chronology18);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime2.add(readablePeriod21, (int) (short) 100);
        mutableDateTime2.setMillisOfDay(69);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTime dateTime27 = mutableDateTime26.toDateTime();
        org.joda.time.Chronology chronology28 = mutableDateTime26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime2.toMutableDateTime(chronology28);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime36.toMutableDateTime();
        mutableDateTime36.addHours(59);
        boolean boolean40 = mutableDateTime36.isEqualNow();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.weekyear();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime36.yearOfEra();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime36.dayOfWeek();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime36.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property44.getFieldType();
        int int46 = mutableDateTime2.get(dateTimeFieldType45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant34", (mutableDateTime19.compareTo(instant34) == 0) == mutableDateTime19.equals(instant34));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:31.401Z", dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfMonth();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime11.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) (short) -1, dateTimeZone18);
        int int20 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime19);
        mutableDateTime19.addSeconds(971);
        int int23 = mutableDateTime19.getEra();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.millisOfDay();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.Instant instant28 = mutableDateTime27.toInstant();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime27.monthOfYear();
        mutableDateTime27.setWeekyear((int) (short) 10);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField33 = property32.getField();
        mutableDateTime19.setRounding(dateTimeField33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant28", (mutableDateTime3.compareTo(instant28) == 0) == mutableDateTime3.equals(instant28));
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
        mutableDateTime2.add((long) (byte) 1);
        int int7 = mutableDateTime2.getMinuteOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = mutableDateTime2.toString(dateTimeFormatter8);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime12.add(readablePeriod15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        mutableDateTime12.addMillis((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime12.toMutableDateTime();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.hourOfDay();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime23.dayOfWeek();
        int int30 = property29.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime32 = property29.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime33 = property29.roundHalfEven();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        mutableDateTime36.setMinuteOfDay(4);
        int int40 = property29.getDifference((org.joda.time.ReadableInstant) mutableDateTime36);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        int int46 = mutableDateTime43.getYearOfCentury();
        org.joda.time.Chronology chronology47 = mutableDateTime43.getChronology();
        int int48 = property29.getDifference((org.joda.time.ReadableInstant) mutableDateTime43);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        int int53 = mutableDateTime52.getDayOfWeek();
        mutableDateTime52.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime52.secondOfMinute();
        mutableDateTime52.setSecondOfMinute((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime52.weekyear();
        org.joda.time.Chronology chronology60 = mutableDateTime52.getChronology();
        org.joda.time.MutableDateTime mutableDateTime61 = org.joda.time.MutableDateTime.now(chronology60);
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((long) (byte) 10, chronology60);
        org.joda.time.MutableDateTime mutableDateTime63 = mutableDateTime43.toMutableDateTime(chronology60);
        org.joda.time.MutableDateTime mutableDateTime64 = mutableDateTime12.toMutableDateTime(chronology60);
        mutableDateTime2.setChronology(chronology60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime43", (instant3.compareTo(mutableDateTime43) == 0) == instant3.equals(mutableDateTime43));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = mutableDateTime6.toString(dateTimeFormatter7);
        int int9 = mutableDateTime6.getYearOfCentury();
        org.joda.time.Chronology chronology10 = mutableDateTime6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(chronology10);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(chronology10);
        java.lang.String str14 = mutableDateTime13.toString();
        mutableDateTime13.addDays(2);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.minuteOfDay();
        java.lang.String str18 = property17.getAsString();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        mutableDateTime21.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime28 = property26.addWrapField(4);
        mutableDateTime28.add((long) 4);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime28.minuteOfDay();
        long long32 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant22", (mutableDateTime0.compareTo(instant22) == 0) == mutableDateTime0.equals(instant22));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime9.millisOfDay();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.weekyear();
        org.joda.time.DurationField durationField22 = property21.getLeapDurationField();
        java.lang.String str23 = property21.getAsString();
        org.joda.time.DurationField durationField24 = property21.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime25 = property21.roundHalfCeiling();
        int int26 = property17.compareTo((org.joda.time.ReadableInstant) mutableDateTime25);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.Instant instant30 = mutableDateTime29.toInstant();
        mutableDateTime29.addSeconds(0);
        java.util.Locale locale33 = null;
        java.util.Calendar calendar34 = mutableDateTime29.toCalendar(locale33);
        int int35 = property17.getDifference((org.joda.time.ReadableInstant) mutableDateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant30", (mutableDateTime9.compareTo(instant30) == 0) == mutableDateTime9.equals(instant30));
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
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime10 = property9.getMutableDateTime();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        mutableDateTime13.setSecondOfDay((int) '#');
        int int17 = mutableDateTime13.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.yearOfCentury();
        mutableDateTime13.setSecondOfDay((int) (byte) 100);
        mutableDateTime13.setYear(48);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime13.yearOfCentury();
        int int24 = property23.getMaximumValueOverall();
        org.joda.time.DurationField durationField25 = property23.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime26 = property23.getMutableDateTime();
        int int27 = property9.compareTo((org.joda.time.ReadableInstant) mutableDateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant14", (mutableDateTime2.compareTo(instant14) == 0) == mutableDateTime2.equals(instant14));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:31.401Z", dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfMonth();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        mutableDateTime10.setSecondOfDay((int) '#');
        int int14 = mutableDateTime10.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.yearOfCentury();
        mutableDateTime10.setSecondOfDay((int) (byte) 100);
        mutableDateTime10.setYear(48);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime10.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime6.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant11", (mutableDateTime3.compareTo(instant11) == 0) == mutableDateTime3.equals(instant11));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime9.addDays(19);
        mutableDateTime9.setMillisOfDay(49);
        boolean boolean21 = mutableDateTime9.isBeforeNow();
        mutableDateTime9.addMonths(0);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.parse("2020-11-25T01:44:52.747Z");
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        mutableDateTime25.setZone(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = mutableDateTime9.toDateTime(dateTimeZone29);
        org.joda.time.Instant instant33 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime9.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and instant33", (dateTime32.compareTo(instant33) == 0) == dateTime32.equals(instant33));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
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
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.dayOfWeek();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime2.toMutableDateTime();
        int int17 = mutableDateTime2.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfMonth();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.dayOfMonth();
        java.lang.String str21 = property20.getAsString();
        java.lang.String str22 = property20.getAsShortText();
        org.joda.time.DateTimeField dateTimeField23 = property20.getField();
        mutableDateTime2.setRounding(dateTimeField23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime18", (instant3.compareTo(mutableDateTime18) == 0) == instant3.equals(mutableDateTime18));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.roundHalfCeiling();
        mutableDateTime10.setMinuteOfDay((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime10.copy();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:29.826Z");
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
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime28.add(readablePeriod29, 30);
        int int32 = mutableDateTime28.getWeekyear();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        int int36 = mutableDateTime35.getDayOfWeek();
        mutableDateTime35.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime35.secondOfMinute();
        mutableDateTime35.setSecondOfMinute((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime35.weekyear();
        org.joda.time.Chronology chronology43 = mutableDateTime35.getChronology();
        mutableDateTime28.setChronology(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(chronology43);
        org.joda.time.DateTime dateTime46 = mutableDateTime15.toDateTime(chronology43);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime10.toMutableDateTime(chronology43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and dateTime46", (mutableDateTime15.compareTo(dateTime46) == 0) == mutableDateTime15.equals(dateTime46));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:29.826Z");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(obj2, chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = mutableDateTime4.toString(dateTimeFormatter5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime4.add(readablePeriod7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime4.hourOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime4.dayOfWeek();
        int int11 = property10.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime13 = property10.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime14 = property10.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime14.add(readablePeriod15, 30);
        int int18 = mutableDateTime14.getWeekyear();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        int int22 = mutableDateTime21.getDayOfWeek();
        mutableDateTime21.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime21.secondOfMinute();
        mutableDateTime21.setSecondOfMinute((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime21.weekyear();
        org.joda.time.Chronology chronology29 = mutableDateTime21.getChronology();
        mutableDateTime14.setChronology(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = mutableDateTime1.toDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime32);
        mutableDateTime33.addYears(334);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime32", (mutableDateTime1.compareTo(dateTime32) == 0) == mutableDateTime1.equals(dateTime32));
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
        int int5 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime8.toMutableDateTime(chronology16);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        org.joda.time.Chronology chronology24 = mutableDateTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime17.toMutableDateTime(chronology24);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(chronology24);
        mutableDateTime2.setChronology(chronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime6", (instant3.compareTo(mutableDateTime6) == 0) == instant3.equals(mutableDateTime6));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime5.addHours(59);
        boolean boolean9 = mutableDateTime5.isEqualNow();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.weekyear();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        mutableDateTime16.setSecondOfDay(685);
        boolean boolean19 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.getMutableDateTime();
        boolean boolean23 = mutableDateTime16.isBefore((org.joda.time.ReadableInstant) mutableDateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.yearOfEra();
        int int11 = property10.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime13 = property10.add((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = null;
        java.lang.String str22 = mutableDateTime20.toString(dateTimeFormatter21);
        int int23 = mutableDateTime20.getYearOfCentury();
        org.joda.time.Chronology chronology24 = mutableDateTime20.getChronology();
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime16.toMutableDateTime(chronology24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime31 = property29.add((long) (short) -1);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        mutableDateTime34.setTime((long) '#');
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        mutableDateTime41.add(readablePeriod44);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime41.hourOfDay();
        java.lang.String str47 = mutableDateTime41.toString();
        int int48 = mutableDateTime34.compareTo((org.joda.time.ReadableInstant) mutableDateTime41);
        int int49 = property29.compareTo((org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property29.getFieldType();
        boolean boolean51 = mutableDateTime25.isSupported(dateTimeFieldType50);
        mutableDateTime13.set(dateTimeFieldType50, (int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime54.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime56 = property55.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone57 = mutableDateTime56.getZone();
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = null;
        java.lang.String str62 = mutableDateTime60.toString(dateTimeFormatter61);
        int int63 = mutableDateTime60.getYearOfCentury();
        org.joda.time.Chronology chronology64 = mutableDateTime60.getChronology();
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime56.toMutableDateTime(chronology64);
        org.joda.time.MutableDateTime mutableDateTime66 = org.joda.time.MutableDateTime.now(chronology64);
        org.joda.time.MutableDateTime mutableDateTime67 = org.joda.time.MutableDateTime.now(chronology64);
        java.lang.Object obj68 = null;
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime(obj68, chronology69);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = null;
        java.lang.String str72 = mutableDateTime70.toString(dateTimeFormatter71);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        mutableDateTime70.add(readablePeriod73);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime70.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime76 = mutableDateTime70.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone77 = mutableDateTime70.getZone();
        mutableDateTime67.setZone(dateTimeZone77);
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime(dateTimeZone77);
        org.joda.time.DateTime dateTime80 = mutableDateTime13.toDateTime(dateTimeZone77);
        org.joda.time.DateTime dateTime81 = dateTime80.toDateTime();
        java.lang.Object obj82 = null;
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.MutableDateTime mutableDateTime84 = new org.joda.time.MutableDateTime(obj82, chronology83);
        org.joda.time.Instant instant85 = mutableDateTime84.toInstant();
        org.joda.time.MutableDateTime.Property property86 = mutableDateTime84.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime87 = property86.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime88 = mutableDateTime87.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property89 = mutableDateTime87.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime90 = property89.roundHalfFloor();
        org.joda.time.DurationField durationField91 = property89.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType92 = property89.getFieldType();
        boolean boolean93 = dateTime80.isSupported(dateTimeFieldType92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant85", (mutableDateTime14.compareTo(instant85) == 0) == mutableDateTime14.equals(instant85));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        int int10 = mutableDateTime9.getDayOfWeek();
        mutableDateTime9.addSeconds((int) (byte) 0);
        mutableDateTime9.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.millisOfSecond();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime9.add(readableDuration17);
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
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        int int14 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.Chronology chronology15 = mutableDateTime9.getChronology();
        boolean boolean17 = mutableDateTime9.isBefore((long) 162);
        int int18 = mutableDateTime9.getWeekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime9.toMutableDateTime();
        int int20 = mutableDateTime9.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        int int8 = property7.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundFloor();
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime20 = property18.roundHalfCeiling();
        long long21 = property18.remainder();
        boolean boolean23 = property18.equals((java.lang.Object) "2020-11-25T01:44:58.659Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property18.getFieldType();
        int int25 = mutableDateTime9.get(dateTimeFieldType24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant10", (mutableDateTime9.compareTo(instant10) == 0) == mutableDateTime9.equals(instant10));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.copy();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        int int11 = mutableDateTime8.getYearOfCentury();
        org.joda.time.Chronology chronology12 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime5, chronology12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        int int7 = mutableDateTime5.getMillisOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 6296);
        org.joda.time.DateTime dateTime10 = mutableDateTime9.toDateTimeISO();
        mutableDateTime9.setMillis((long) (short) 0);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.millisOfSecond();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        mutableDateTime16.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(dateTimeZone23);
        mutableDateTime16.setZoneRetainFields(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime9, dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime5.toMutableDateTime(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime20", (instant3.compareTo(mutableDateTime20) == 0) == instant3.equals(mutableDateTime20));
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
        mutableDateTime2.addDays((int) (byte) 100);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        int int14 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.Chronology chronology15 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime9.toMutableDateTimeISO();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone20);
        boolean boolean24 = mutableDateTime22.isBefore(1L);
        int int25 = mutableDateTime22.getMillisOfSecond();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime22.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTime dateTime28 = mutableDateTime27.toDateTime();
        int int29 = mutableDateTime27.getWeekyear();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology31);
        mutableDateTime32.setSecondOfMinute((int) '4');
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime32.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime38 = property37.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(dateTimeZone39);
        mutableDateTime32.setZoneRetainFields(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime27.toMutableDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime22, dateTimeZone39);
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
        org.joda.time.DateTimeZone dateTimeZone55 = mutableDateTime54.getZone();
        org.joda.time.DateTime dateTime56 = mutableDateTime46.toDateTime(dateTimeZone55);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology58);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime59.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime62 = property60.add((long) (short) -1);
        java.lang.Object obj63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj63, chronology64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = null;
        java.lang.String str67 = mutableDateTime65.toString(dateTimeFormatter66);
        mutableDateTime65.setTime((long) '#');
        java.lang.Object obj70 = null;
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(obj70, chronology71);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = null;
        java.lang.String str74 = mutableDateTime72.toString(dateTimeFormatter73);
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        mutableDateTime72.add(readablePeriod75);
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime72.hourOfDay();
        java.lang.String str78 = mutableDateTime72.toString();
        int int79 = mutableDateTime65.compareTo((org.joda.time.ReadableInstant) mutableDateTime72);
        int int80 = property60.compareTo((org.joda.time.ReadableInstant) mutableDateTime72);
        org.joda.time.MutableDateTime mutableDateTime82 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property83 = mutableDateTime82.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = property83.getFieldType();
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime72.property(dateTimeFieldType84);
        mutableDateTime46.set(dateTimeFieldType84, 162);
        boolean boolean88 = mutableDateTime22.isSupported(dateTimeFieldType84);
        boolean boolean89 = mutableDateTime9.isSupported(dateTimeFieldType84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        int int11 = mutableDateTime10.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.minuteOfHour();
        java.lang.String str13 = property12.getAsString();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone17);
        mutableDateTime20.addMinutes((int) '#');
        boolean boolean23 = property12.equals((java.lang.Object) mutableDateTime20);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.Instant instant27 = mutableDateTime26.toInstant();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.monthOfYear();
        mutableDateTime26.setWeekyear((int) (short) 10);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime26.minuteOfHour();
        int int32 = property12.compareTo((org.joda.time.ReadableInstant) mutableDateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant27", (mutableDateTime2.compareTo(instant27) == 0) == mutableDateTime2.equals(instant27));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:44:52.747Z");
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundFloor();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime3.copy();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        int int8 = mutableDateTime7.getDayOfWeek();
        mutableDateTime7.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.secondOfMinute();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.weekyear();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.dayOfYear();
        mutableDateTime7.setWeekyear(3);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime18.add(readablePeriod21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime18.getZone();
        mutableDateTime7.setZoneRetainFields(dateTimeZone23);
        mutableDateTime4.setTime((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.weekyear();
        org.joda.time.DurationField durationField29 = property28.getLeapDurationField();
        org.joda.time.DateTimeField dateTimeField30 = property28.getField();
        int int31 = mutableDateTime7.get(dateTimeField30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and mutableDateTime18", (mutableDateTime4.compareTo(mutableDateTime18) == 0) == mutableDateTime4.equals(mutableDateTime18));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        int int13 = mutableDateTime12.getCenturyOfEra();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime19.toMutableDateTime();
        mutableDateTime19.addHours(59);
        boolean boolean23 = mutableDateTime19.isEqualNow();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.dayOfWeek();
        mutableDateTime12.setMillis((org.joda.time.ReadableInstant) mutableDateTime19);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        mutableDateTime28.addMillis((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime36 = mutableDateTime28.toMutableDateTime();
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
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime52.getZone();
        mutableDateTime52.setMinuteOfDay(4);
        int int56 = property45.getDifference((org.joda.time.ReadableInstant) mutableDateTime52);
        java.lang.Object obj57 = null;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(obj57, chronology58);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = null;
        java.lang.String str61 = mutableDateTime59.toString(dateTimeFormatter60);
        int int62 = mutableDateTime59.getYearOfCentury();
        org.joda.time.Chronology chronology63 = mutableDateTime59.getChronology();
        int int64 = property45.getDifference((org.joda.time.ReadableInstant) mutableDateTime59);
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(obj66, chronology67);
        int int69 = mutableDateTime68.getDayOfWeek();
        mutableDateTime68.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime68.secondOfMinute();
        mutableDateTime68.setSecondOfMinute((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime68.weekyear();
        org.joda.time.Chronology chronology76 = mutableDateTime68.getChronology();
        org.joda.time.MutableDateTime mutableDateTime77 = org.joda.time.MutableDateTime.now(chronology76);
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime((long) (byte) 10, chronology76);
        org.joda.time.MutableDateTime mutableDateTime79 = mutableDateTime59.toMutableDateTime(chronology76);
        org.joda.time.MutableDateTime mutableDateTime80 = mutableDateTime28.toMutableDateTime(chronology76);
        org.joda.time.MutableDateTime mutableDateTime82 = new org.joda.time.MutableDateTime((long) 606);
        int int83 = mutableDateTime82.getRoundingMode();
        int int84 = mutableDateTime82.getEra();
        int int85 = mutableDateTime80.compareTo((org.joda.time.ReadableInstant) mutableDateTime82);
        mutableDateTime12.setDate((org.joda.time.ReadableInstant) mutableDateTime80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and mutableDateTime59", (instant17.compareTo(mutableDateTime59) == 0) == instant17.equals(mutableDateTime59));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.dayOfMonth();
        java.lang.String str3 = property2.getAsString();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(obj4, chronology5);
        org.joda.time.Instant instant7 = mutableDateTime6.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.monthOfYear();
        mutableDateTime6.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.secondOfMinute();
        int int12 = property2.compareTo((org.joda.time.ReadableInstant) mutableDateTime6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and instant7", (mutableDateTime0.compareTo(instant7) == 0) == mutableDateTime0.equals(instant7));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        mutableDateTime2.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.secondOfMinute();
        int int7 = property6.getMaximumValue();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.toMutableDateTime();
        mutableDateTime13.addHours(59);
        int int17 = mutableDateTime13.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime13.add(readablePeriod18, 6292);
        mutableDateTime13.setMinuteOfHour(30);
        mutableDateTime13.setTime((long) (byte) -1);
        boolean boolean25 = property6.equals((java.lang.Object) mutableDateTime13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant11", (mutableDateTime2.compareTo(instant11) == 0) == mutableDateTime2.equals(instant11));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.dayOfWeek();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.dayOfWeek();
        int int16 = mutableDateTime2.getWeekOfWeekyear();
        mutableDateTime2.addSeconds(334);
        int int19 = mutableDateTime2.getDayOfWeek();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime23.add(readablePeriod26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.hourOfDay();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime23.dayOfWeek();
        mutableDateTime23.add((long) (short) -1);
        int int32 = mutableDateTime23.getMinuteOfDay();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        int int38 = mutableDateTime35.getYearOfCentury();
        org.joda.time.Chronology chronology39 = mutableDateTime35.getChronology();
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(chronology39);
        org.joda.time.DateTime dateTime41 = mutableDateTime23.toDateTime(chronology39);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((long) 170, chronology39);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(chronology39);
        mutableDateTime2.setChronology(chronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime23", (instant3.compareTo(mutableDateTime23) == 0) == instant3.equals(mutableDateTime23));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime5.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime2 = property1.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime8.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (short) -1, dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime4.toMutableDateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime18.add(readablePeriod19);
        java.util.Locale locale21 = null;
        java.util.Calendar calendar22 = mutableDateTime18.toCalendar(locale21);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.hourOfDay();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime25.dayOfWeek();
        org.joda.time.DurationField durationField32 = property31.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime33 = property31.roundHalfCeiling();
        mutableDateTime33.add((long) (byte) 0);
        org.joda.time.Instant instant36 = mutableDateTime33.toInstant();
        mutableDateTime18.setDate((org.joda.time.ReadableInstant) instant36);
        long long38 = mutableDateTime18.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime25 and instant36", (mutableDateTime25.compareTo(instant36) == 0) == mutableDateTime25.equals(instant36));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfCeiling();
        long long10 = property7.remainder();
        boolean boolean12 = property7.equals((java.lang.Object) "2020-11-25T01:44:58.659Z");
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property7.getFieldType();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:31.401Z", dateTimeZone18);
        org.joda.time.DateTime dateTime20 = mutableDateTime19.toDateTimeISO();
        java.util.Date date21 = mutableDateTime19.toDate();
        boolean boolean23 = mutableDateTime19.isAfter((-1L));
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime26.toMutableDateTime(chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(chronology34);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime19.toMutableDateTime(chronology34);
        boolean boolean40 = property7.equals((java.lang.Object) chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime17", (instant3.compareTo(mutableDateTime17) == 0) == instant3.equals(mutableDateTime17));
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
        mutableDateTime2.setWeekyear((int) (short) 10);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.yearOfCentury();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        mutableDateTime15.setTime((long) '#');
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime22.add(readablePeriod25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.hourOfDay();
        java.lang.String str28 = mutableDateTime22.toString();
        int int29 = mutableDateTime15.compareTo((org.joda.time.ReadableInstant) mutableDateTime22);
        mutableDateTime22.addDays(19);
        mutableDateTime22.setMillisOfDay(49);
        boolean boolean34 = mutableDateTime22.isBeforeNow();
        mutableDateTime10.setDate((org.joda.time.ReadableInstant) mutableDateTime22);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        int int41 = mutableDateTime38.getYearOfCentury();
        mutableDateTime38.setMillisOfSecond(7);
        int int44 = mutableDateTime38.getSecondOfDay();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        int int48 = mutableDateTime47.getDayOfWeek();
        mutableDateTime47.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime47.secondOfMinute();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime47.weekyear();
        org.joda.time.DurationField durationField53 = property52.getDurationField();
        org.joda.time.DateTimeField dateTimeField54 = property52.getField();
        mutableDateTime38.setRounding(dateTimeField54);
        mutableDateTime10.setRounding(dateTimeField54);
        int int57 = mutableDateTime2.get(dateTimeField54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime47", (instant3.compareTo(mutableDateTime47) == 0) == instant3.equals(mutableDateTime47));
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
        int int5 = mutableDateTime2.getYearOfEra();
        mutableDateTime2.addDays(0);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime10.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        int int19 = mutableDateTime2.get(dateTimeField18);
        mutableDateTime2.setSecondOfDay(643);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.weekyear();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.weekyear();
        int int4 = mutableDateTime1.getYearOfCentury();
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(obj5, chronology6);
        boolean boolean9 = mutableDateTime7.isEqual((long) 'a');
        mutableDateTime7.addWeekyears((-1));
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.weekyear();
        mutableDateTime13.setMillis((long) (byte) -1);
        boolean boolean18 = mutableDateTime13.isEqual((long) (byte) -1);
        boolean boolean19 = mutableDateTime7.isBefore((org.joda.time.ReadableInstant) mutableDateTime13);
        mutableDateTime13.addYears(104);
        boolean boolean22 = mutableDateTime1.equals((java.lang.Object) mutableDateTime13);
        mutableDateTime1.setMinuteOfDay(168);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime1.dayOfWeek();
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.Instant instant29 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.monthOfYear();
        mutableDateTime28.addDays((int) (byte) 100);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        int int38 = mutableDateTime35.getYearOfCentury();
        org.joda.time.Chronology chronology39 = mutableDateTime35.getChronology();
        int int40 = mutableDateTime28.compareTo((org.joda.time.ReadableInstant) mutableDateTime35);
        org.joda.time.Chronology chronology41 = mutableDateTime35.getChronology();
        boolean boolean43 = mutableDateTime35.isBefore((long) 162);
        int int44 = mutableDateTime35.getWeekOfWeekyear();
        boolean boolean45 = property25.equals((java.lang.Object) mutableDateTime35);
        java.util.Locale locale46 = null;
        int int47 = property25.getMaximumShortTextLength(locale46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and mutableDateTime35", (instant29.compareTo(mutableDateTime35) == 0) == instant29.equals(mutableDateTime35));
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
        mutableDateTime2.setMonthOfYear((int) (byte) 10);
        boolean boolean8 = mutableDateTime2.isEqual((long) 19);
        mutableDateTime2.setDayOfWeek((int) (short) 1);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        int int14 = mutableDateTime13.getDayOfWeek();
        mutableDateTime13.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.secondOfMinute();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.weekyear();
        int int19 = mutableDateTime13.getDayOfYear();
        org.joda.time.Chronology chronology20 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime2.toMutableDateTime(chronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setTime((long) '#');
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        java.lang.String str15 = mutableDateTime9.toString();
        int int16 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime9.addDays(19);
        mutableDateTime9.setMillisOfDay(49);
        boolean boolean21 = mutableDateTime9.isBeforeNow();
        mutableDateTime9.addMonths(0);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.parse("2020-11-25T01:44:52.747Z");
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(dateTimeZone29);
        mutableDateTime25.setZone(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = mutableDateTime9.toDateTime(dateTimeZone29);
        org.joda.time.Instant instant33 = mutableDateTime9.toInstant();
        int int34 = mutableDateTime9.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and instant33", (dateTime32.compareTo(instant33) == 0) == dateTime32.equals(instant33));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        mutableDateTime2.addMillis((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime2.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.yearOfCentury();
        java.lang.String str12 = property11.getAsString();
        java.lang.String str13 = property11.getAsShortText();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
        mutableDateTime16.setSecondOfDay((int) '#');
        int int20 = mutableDateTime16.getMonthOfYear();
        long long21 = mutableDateTime16.getMillis();
        int int22 = mutableDateTime16.getMillisOfSecond();
        mutableDateTime16.addYears((int) (short) -1);
        long long25 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant17", (mutableDateTime2.compareTo(instant17) == 0) == mutableDateTime2.equals(instant17));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime5.addHours(59);
        boolean boolean9 = mutableDateTime5.isEqualNow();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.weekyear();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        mutableDateTime16.setSecondOfDay(685);
        boolean boolean19 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime16);
        int int20 = mutableDateTime5.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.get();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.roundFloor();
        org.joda.time.DurationField durationField6 = property3.getRangeDurationField();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        mutableDateTime9.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.dayOfYear();
        int int15 = property14.getMaximumValue();
        boolean boolean16 = property3.equals((java.lang.Object) property14);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 'a');
        int int19 = mutableDateTime18.getDayOfYear();
        int int20 = mutableDateTime18.getYearOfCentury();
        int int21 = property3.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
        int int22 = property3.getMinimumValueOverall();
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
        int int33 = mutableDateTime25.getYear();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime25.add(readablePeriod34, 20);
        long long37 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime25.getZone();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime25", (instant10.compareTo(mutableDateTime25) == 0) == instant10.equals(mutableDateTime25));
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
        mutableDateTime2.addDays((int) (byte) 100);
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology13);
        mutableDateTime2.setChronology(chronology13);
        int int17 = mutableDateTime2.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.dayOfWeek();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime2.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.copy();
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
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        mutableDateTime33.setMinuteOfDay(4);
        int int37 = property26.getDifference((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.dayOfYear();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime40.yearOfCentury();
        int int43 = property26.compareTo((org.joda.time.ReadableInstant) mutableDateTime40);
        mutableDateTime40.setTime((long) 329);
        int int46 = mutableDateTime16.compareTo((org.joda.time.ReadableInstant) mutableDateTime40);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime49 = property48.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone50 = mutableDateTime49.getZone();
        java.lang.Object obj51 = null;
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(obj51, chronology52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = null;
        java.lang.String str55 = mutableDateTime53.toString(dateTimeFormatter54);
        int int56 = mutableDateTime53.getYearOfCentury();
        org.joda.time.Chronology chronology57 = mutableDateTime53.getChronology();
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime49.toMutableDateTime(chronology57);
        org.joda.time.MutableDateTime mutableDateTime59 = org.joda.time.MutableDateTime.now(chronology57);
        org.joda.time.MutableDateTime mutableDateTime60 = org.joda.time.MutableDateTime.now(chronology57);
        java.lang.String str61 = mutableDateTime60.toString();
        org.joda.time.MutableDateTime mutableDateTime62 = mutableDateTime60.toMutableDateTimeISO();
        int int63 = mutableDateTime62.getMillisOfDay();
        int int64 = mutableDateTime62.getHourOfDay();
        mutableDateTime40.setDate((org.joda.time.ReadableInstant) mutableDateTime62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime47", (instant3.compareTo(mutableDateTime47) == 0) == instant3.equals(mutableDateTime47));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setSecondOfDay((int) (byte) 100);
        boolean boolean10 = mutableDateTime2.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        int int20 = mutableDateTime17.getYearOfCentury();
        org.joda.time.Chronology chronology21 = mutableDateTime17.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime13.toMutableDateTime(chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology21);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime2.toMutableDateTime(chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.addSeconds(0);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.millisOfDay();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        int int12 = mutableDateTime9.getYearOfCentury();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime2.toMutableDateTime(chronology13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.millisOfSecond();
        org.joda.time.DateTime dateTime8 = mutableDateTime2.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        int int18 = mutableDateTime15.getYearOfCentury();
        org.joda.time.Chronology chronology19 = mutableDateTime15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime11.toMutableDateTime(chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology19);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(chronology19);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime25.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime25.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime25.getZone();
        mutableDateTime22.setZone(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone32);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.millisOfSecond();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:31.401Z", dateTimeZone41);
        org.joda.time.DateTime dateTime43 = mutableDateTime42.toDateTimeISO();
        java.util.Date date44 = mutableDateTime42.toDate();
        mutableDateTime42.setYear((int) (short) -1);
        int int47 = mutableDateTime42.getWeekyear();
        long long48 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime42);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setSecondOfDay((int) (byte) 100);
        mutableDateTime2.setYear(48);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.yearOfCentury();
        int int13 = property12.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime15 = property12.add((long) 12020);
        java.lang.String str16 = property12.toString();
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.hourOfDay();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.dayOfWeek();
        int int26 = property25.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime28 = property25.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime29 = property25.roundHalfEven();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.year();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        mutableDateTime29.setZoneRetainFields(dateTimeZone34);
        int int37 = mutableDateTime29.getWeekOfWeekyear();
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.centuryOfEra();
        int int46 = mutableDateTime40.getDayOfYear();
        boolean boolean47 = mutableDateTime40.isEqualNow();
        mutableDateTime29.setMillis((org.joda.time.ReadableInstant) mutableDateTime40);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        int int55 = mutableDateTime52.getYearOfCentury();
        org.joda.time.Chronology chronology56 = mutableDateTime52.getChronology();
        org.joda.time.MutableDateTime mutableDateTime57 = org.joda.time.MutableDateTime.now(chronology56);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(chronology56);
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) 6292, chronology56);
        org.joda.time.DateTime dateTime60 = mutableDateTime40.toDateTime(chronology56);
        int int61 = property12.getDifference((org.joda.time.ReadableInstant) dateTime60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime19", (instant3.compareTo(mutableDateTime19) == 0) == instant3.equals(mutableDateTime19));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:31.401Z", dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfMonth();
        java.util.GregorianCalendar gregorianCalendar8 = mutableDateTime6.toGregorianCalendar();
        int int9 = mutableDateTime6.getWeekOfWeekyear();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        mutableDateTime12.addDays((int) (byte) 100);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        int int24 = mutableDateTime12.compareTo((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.Chronology chronology25 = mutableDateTime19.getChronology();
        boolean boolean27 = mutableDateTime19.isBefore((long) 162);
        int int28 = mutableDateTime19.getWeekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime19.toMutableDateTime();
        boolean boolean30 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant13", (mutableDateTime3.compareTo(instant13) == 0) == mutableDateTime3.equals(instant13));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        long long7 = mutableDateTime2.getMillis();
        int int8 = mutableDateTime2.getMillisOfSecond();
        mutableDateTime2.addYears((int) (short) -1);
        int int11 = mutableDateTime2.getWeekyear();
        mutableDateTime2.addWeeks(2922789);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:31.401Z", dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfMonth();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime29.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime29.getZone();
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) (short) -1, dateTimeZone36);
        int int38 = property25.getDifference((org.joda.time.ReadableInstant) mutableDateTime37);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        mutableDateTime41.add(readablePeriod44);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime41.hourOfDay();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime41.dayOfWeek();
        java.lang.String str48 = mutableDateTime41.toString();
        int int49 = mutableDateTime41.getYear();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        mutableDateTime41.add(readablePeriod50, 20);
        java.lang.Object obj53 = null;
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(obj53, chronology54);
        int int56 = mutableDateTime55.getDayOfWeek();
        mutableDateTime55.addSeconds((int) (byte) 0);
        mutableDateTime55.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime55.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime63.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property64.getFieldType();
        boolean boolean66 = mutableDateTime55.isSupported(dateTimeFieldType65);
        int int67 = mutableDateTime41.get(dateTimeFieldType65);
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime37.property(dateTimeFieldType65);
        org.joda.time.MutableDateTime mutableDateTime70 = property68.addWrapField(48);
        java.lang.Object obj72 = null;
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(obj72, chronology73);
        org.joda.time.DateTimeZone dateTimeZone75 = mutableDateTime74.getZone();
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:31.401Z", dateTimeZone75);
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime(dateTimeZone75);
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime77.dayOfMonth();
        int int79 = mutableDateTime77.getMonthOfYear();
        int int80 = property68.getDifference((org.joda.time.ReadableInstant) mutableDateTime77);
        org.joda.time.DateTimeField dateTimeField81 = property68.getField();
        mutableDateTime16.setRounding(dateTimeField81);
        mutableDateTime2.setRounding(dateTimeField81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setSecondOfDay((int) (byte) 100);
        mutableDateTime2.setYear(48);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime18.toMutableDateTime(chronology26);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(chronology34);
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime27.toMutableDateTime(chronology34);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        int int41 = mutableDateTime40.getDayOfWeek();
        mutableDateTime40.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime40.secondOfMinute();
        mutableDateTime40.setSecondOfMinute((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime40.weekyear();
        org.joda.time.Chronology chronology48 = mutableDateTime40.getChronology();
        org.joda.time.MutableDateTime mutableDateTime49 = org.joda.time.MutableDateTime.now(chronology48);
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(chronology48);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime37, chronology48);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((java.lang.Object) "2020", chronology48);
        long long53 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.util.Date date8 = mutableDateTime2.toDate();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.secondOfMinute();
        org.joda.time.DateTime dateTime10 = mutableDateTime2.toDateTime();
        int int11 = dateTime10.getMillisOfSecond();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        mutableDateTime14.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.roundCeiling();
        org.joda.time.DateTimeField dateTimeField21 = property19.getField();
        int int22 = dateTime10.get(dateTimeField21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant15", (mutableDateTime2.compareTo(instant15) == 0) == mutableDateTime2.equals(instant15));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setSecondOfDay((int) (byte) 100);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:31.401Z", dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfMonth();
        java.util.GregorianCalendar gregorianCalendar18 = mutableDateTime16.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime16.millisOfSecond();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime25 = property23.add((long) (short) -1);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        mutableDateTime28.setTime((long) '#');
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime35.add(readablePeriod38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime35.hourOfDay();
        java.lang.String str41 = mutableDateTime35.toString();
        int int42 = mutableDateTime28.compareTo((org.joda.time.ReadableInstant) mutableDateTime35);
        int int43 = property23.compareTo((org.joda.time.ReadableInstant) mutableDateTime35);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property23.getFieldType();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime16.property(dateTimeFieldType44);
        boolean boolean46 = mutableDateTime2.isSupported(dateTimeFieldType44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTimeISO();
        mutableDateTime2.addHours(25);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.dayOfWeek();
        int int12 = mutableDateTime2.getSecondOfDay();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:01.652Z");
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.dayOfWeek();
        java.lang.String str24 = mutableDateTime17.toString();
        int int25 = mutableDateTime17.getYear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime17.add(readablePeriod26, 20);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        int int32 = mutableDateTime31.getDayOfWeek();
        mutableDateTime31.addSeconds((int) (byte) 0);
        mutableDateTime31.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime31.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property40.getFieldType();
        boolean boolean42 = mutableDateTime31.isSupported(dateTimeFieldType41);
        int int43 = mutableDateTime17.get(dateTimeFieldType41);
        boolean boolean44 = mutableDateTime14.isSupported(dateTimeFieldType41);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime14.toMutableDateTime();
        long long46 = mutableDateTime45.getMillis();
        org.joda.time.Instant instant47 = mutableDateTime45.toInstant();
        boolean boolean48 = mutableDateTime2.equals((java.lang.Object) mutableDateTime45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant47", (mutableDateTime14.compareTo(instant47) == 0) == mutableDateTime14.equals(instant47));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.Instant instant9 = mutableDateTime2.toInstant();
        mutableDateTime2.addMillis((int) 'a');
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.minuteOfHour();
        mutableDateTime2.addMinutes(0);
        mutableDateTime2.addMinutes(107);
        mutableDateTime2.addMillis(6313);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime21.add(readablePeriod24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.hourOfDay();
        java.lang.String str27 = mutableDateTime21.toString();
        mutableDateTime21.setSecondOfDay(2);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.parse("2020-11-25T01:44:52.747Z");
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(dateTimeZone35);
        mutableDateTime31.setZone(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime21.toMutableDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone35);
        boolean boolean40 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime32", (instant9.compareTo(mutableDateTime32) == 0) == instant9.equals(mutableDateTime32));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime5.addHours(59);
        boolean boolean9 = mutableDateTime5.isEqualNow();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfMonth();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.dayOfMonth();
        java.lang.String str13 = property12.getAsString();
        java.lang.String str14 = property12.getAsShortText();
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property12.getFieldType();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime5.property(dateTimeFieldType16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime5.add(readableDuration18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.monthOfYear();
        mutableDateTime2.setWeekyear((int) (short) 10);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime10.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        int int26 = mutableDateTime23.getYearOfCentury();
        org.joda.time.Chronology chronology27 = mutableDateTime23.getChronology();
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime19.toMutableDateTime(chronology27);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(chronology27);
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(chronology27);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(chronology27);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime10, chronology27);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime2.toMutableDateTime(chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        int int6 = mutableDateTime2.getMonthOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        int int10 = mutableDateTime9.getDayOfWeek();
        mutableDateTime9.addSeconds((int) (byte) 0);
        mutableDateTime9.setDayOfYear((int) ' ');
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.millisOfSecond();
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime9);
        mutableDateTime2.setSecondOfDay((int) ' ');
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        int int23 = mutableDateTime22.getDayOfWeek();
        mutableDateTime22.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime22.secondOfMinute();
        mutableDateTime22.setSecondOfMinute((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime22.weekyear();
        org.joda.time.Chronology chronology30 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) (byte) -1, chronology30);
        int int32 = mutableDateTime31.getMonthOfYear();
        org.joda.time.Chronology chronology33 = mutableDateTime31.getChronology();
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime2.toMutableDateTime(chronology33);
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        mutableDateTime37.add(readablePeriod40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime37.hourOfDay();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime37.dayOfWeek();
        int int44 = property43.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime46 = property43.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime48 = property43.addWrapField(10025);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime51.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime54 = property52.add((long) (short) -1);
        java.lang.Object obj55 = null;
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj55, chronology56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = null;
        java.lang.String str59 = mutableDateTime57.toString(dateTimeFormatter58);
        mutableDateTime57.setTime((long) '#');
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = null;
        java.lang.String str66 = mutableDateTime64.toString(dateTimeFormatter65);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        mutableDateTime64.add(readablePeriod67);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime64.hourOfDay();
        java.lang.String str70 = mutableDateTime64.toString();
        int int71 = mutableDateTime57.compareTo((org.joda.time.ReadableInstant) mutableDateTime64);
        int int72 = property52.compareTo((org.joda.time.ReadableInstant) mutableDateTime64);
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime74.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = property75.getFieldType();
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime64.property(dateTimeFieldType76);
        int int78 = mutableDateTime48.get(dateTimeFieldType76);
        int int79 = mutableDateTime2.get(dateTimeFieldType76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime64", (instant3.compareTo(mutableDateTime64) == 0) == instant3.equals(mutableDateTime64));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        mutableDateTime2.addMillis((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime2.toMutableDateTime();
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
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        mutableDateTime26.setMinuteOfDay(4);
        int int30 = property19.getDifference((org.joda.time.ReadableInstant) mutableDateTime26);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        int int38 = property19.getDifference((org.joda.time.ReadableInstant) mutableDateTime33);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        int int43 = mutableDateTime42.getDayOfWeek();
        mutableDateTime42.addSeconds((int) (byte) 0);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime42.secondOfMinute();
        mutableDateTime42.setSecondOfMinute((int) (byte) 10);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime42.weekyear();
        org.joda.time.Chronology chronology50 = mutableDateTime42.getChronology();
        org.joda.time.MutableDateTime mutableDateTime51 = org.joda.time.MutableDateTime.now(chronology50);
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) (byte) 10, chronology50);
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime33.toMutableDateTime(chronology50);
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime2.toMutableDateTime(chronology50);
        int int55 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((long) (byte) 10);
        java.util.Date date58 = mutableDateTime57.toDate();
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime57);
        int int60 = mutableDateTime59.getDayOfYear();
        int int61 = mutableDateTime59.getYearOfEra();
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(obj62, chronology63);
        org.joda.time.Instant instant65 = mutableDateTime64.toInstant();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime64.monthOfYear();
        mutableDateTime64.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime64.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime70 = property69.roundCeiling();
        org.joda.time.DateTimeField dateTimeField71 = property69.getField();
        int int72 = mutableDateTime59.get(dateTimeField71);
        mutableDateTime2.setRounding(dateTimeField71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and instant65", (mutableDateTime33.compareTo(instant65) == 0) == mutableDateTime33.equals(instant65));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        mutableDateTime2.add((long) (short) -1);
        int int11 = mutableDateTime2.getMinuteOfDay();
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        int int17 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Chronology chronology18 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        org.joda.time.DateTime dateTime20 = mutableDateTime2.toDateTime(chronology18);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime2.add(readablePeriod21, (int) (short) 100);
        mutableDateTime2.setMillisOfDay(69);
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
        int int36 = mutableDateTime28.getHourOfDay();
        int int37 = mutableDateTime28.getDayOfWeek();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime28.hourOfDay();
        mutableDateTime28.addYears(6387);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.Instant instant44 = mutableDateTime43.toInstant();
        mutableDateTime43.setSecondOfDay((int) '#');
        int int47 = mutableDateTime43.getMonthOfYear();
        long long48 = mutableDateTime43.getMillis();
        mutableDateTime43.setMillisOfSecond(0);
        boolean boolean51 = mutableDateTime28.isAfter((org.joda.time.ReadableInstant) mutableDateTime43);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant44", (mutableDateTime14.compareTo(instant44) == 0) == mutableDateTime14.equals(instant44));
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
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime8.yearOfEra();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:31.401Z", dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.dayOfMonth();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        mutableDateTime10.setSecondOfDay((int) '#');
        int int14 = mutableDateTime10.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.yearOfCentury();
        mutableDateTime10.setSecondOfDay((int) (byte) 100);
        mutableDateTime10.setYear(48);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime10.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfFloor();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) mutableDateTime21);
        int int23 = mutableDateTime21.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant11", (mutableDateTime3.compareTo(instant11) == 0) == mutableDateTime3.equals(instant11));
    }
}

