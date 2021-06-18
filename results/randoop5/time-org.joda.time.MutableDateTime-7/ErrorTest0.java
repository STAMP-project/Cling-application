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
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime5.millisOfSecond();
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
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime5.toGregorianCalendar();
        java.lang.Class<?> wildcardClass17 = gregorianCalendar16.getClass();
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getDayOfYear();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        boolean boolean11 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) instant10);
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
        mutableDateTime5.setTime(10, 47, 7, 20);
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime6.addMonths(4);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTime dateTime13 = mutableDateTime6.toDateTime(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
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
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime5.toGregorianCalendar();
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
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime29.add(readablePeriod30, 47);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        int int38 = mutableDateTime35.getYearOfCentury();
        org.joda.time.Chronology chronology39 = mutableDateTime35.getChronology();
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime29.toMutableDateTime(chronology39);
        int int41 = mutableDateTime5.compareTo((org.joda.time.ReadableInstant) mutableDateTime29);
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
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        int int23 = mutableDateTime5.compareTo((org.joda.time.ReadableInstant) mutableDateTime18);
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfMonth();
        int int12 = mutableDateTime10.getCenturyOfEra();
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
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        boolean boolean27 = dateTime25.isSupported(dateTimeFieldType26);
        mutableDateTime10.setTime((org.joda.time.ReadableInstant) dateTime25);
        int int29 = mutableDateTime10.getDayOfWeek();
        int int30 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime10);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.monthOfYear();
        mutableDateTime33.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.secondOfMinute();
        int int39 = property38.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime41 = property38.add((int) (short) 0);
        org.joda.time.DateTimeField dateTimeField42 = property38.getField();
        mutableDateTime10.setRounding(dateTimeField42);
        int int44 = mutableDateTime10.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and instant34", (mutableDateTime15.compareTo(instant34) == 0) == mutableDateTime15.equals(instant34));
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime5.toGregorianCalendar();
        int int17 = mutableDateTime5.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setHourOfDay(2);
        boolean boolean8 = mutableDateTime2.isAfter((long) 3);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.dayOfWeek();
        boolean boolean24 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        boolean boolean25 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime17);
        int int26 = mutableDateTime2.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime17", (instant12.compareTo(mutableDateTime17) == 0) == instant12.equals(mutableDateTime17));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.yearOfCentury();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.toMutableDateTime();
        mutableDateTime12.setSecondOfDay((int) (byte) 100);
        boolean boolean15 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant9", (mutableDateTime4.compareTo(instant9) == 0) == mutableDateTime4.equals(instant9));
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
        mutableDateTime2.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime13.add(readablePeriod16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        org.joda.time.MutableDateTime mutableDateTime20 = property18.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfMonth();
        int int23 = mutableDateTime21.getCenturyOfEra();
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        int int31 = mutableDateTime26.getWeekOfWeekyear();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.DateTime dateTime36 = mutableDateTime26.toDateTime(dateTimeZone35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = null;
        boolean boolean38 = dateTime36.isSupported(dateTimeFieldType37);
        mutableDateTime21.setTime((org.joda.time.ReadableInstant) dateTime36);
        int int40 = mutableDateTime21.getDayOfWeek();
        int int41 = property18.getDifference((org.joda.time.ReadableInstant) mutableDateTime21);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        mutableDateTime44.add(readablePeriod47);
        int int49 = mutableDateTime44.getHourOfDay();
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        mutableDateTime52.add(readablePeriod55);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime52.hourOfDay();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime52.dayOfWeek();
        int int59 = property58.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime61 = property58.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime62 = property58.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        mutableDateTime62.add(readablePeriod63, 47);
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(obj66, chronology67);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = null;
        java.lang.String str70 = mutableDateTime68.toString(dateTimeFormatter69);
        int int71 = mutableDateTime68.getYearOfCentury();
        org.joda.time.Chronology chronology72 = mutableDateTime68.getChronology();
        org.joda.time.MutableDateTime mutableDateTime73 = mutableDateTime62.toMutableDateTime(chronology72);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology75);
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime76.dayOfYear();
        int int78 = property77.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = property77.getFieldType();
        boolean boolean80 = mutableDateTime73.isSupported(dateTimeFieldType79);
        int int81 = mutableDateTime44.get(dateTimeFieldType79);
        int int82 = mutableDateTime21.get(dateTimeFieldType79);
        boolean boolean83 = mutableDateTime2.isSupported(dateTimeFieldType79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime6.addMonths(4);
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
        org.joda.time.MutableDateTime mutableDateTime21 = property17.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime21.add(readablePeriod22, 47);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime21.add(readablePeriod25, (int) (byte) 0);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime35.add(readablePeriod36);
        mutableDateTime35.add((long) 11);
        boolean boolean40 = mutableDateTime21.isBefore((org.joda.time.ReadableInstant) mutableDateTime35);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(dateTimeZone51);
        mutableDateTime43.setZone(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime21.toMutableDateTime(dateTimeZone51);
        mutableDateTime6.setZone(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime30", (instant3.compareTo(mutableDateTime30) == 0) == instant3.equals(mutableDateTime30));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.Instant instant18 = mutableDateTime17.toInstant();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.monthOfYear();
        mutableDateTime17.add((long) (byte) 1);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfYear();
        int int26 = property25.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        boolean boolean28 = mutableDateTime17.isSupported(dateTimeFieldType27);
        int int29 = mutableDateTime10.get(dateTimeFieldType27);
        int int30 = mutableDateTime2.get(dateTimeFieldType27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant18", (mutableDateTime10.compareTo(instant18) == 0) == mutableDateTime10.equals(instant18));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        int int8 = mutableDateTime2.getMillisOfSecond();
        int int9 = mutableDateTime2.getCenturyOfEra();
        mutableDateTime2.addDays(49);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.monthOfYear();
        mutableDateTime14.addDays((int) (byte) 100);
        boolean boolean19 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime14);
        boolean boolean21 = mutableDateTime2.isAfter((long) 7);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.getMutableDateTime();
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime27.add(readablePeriod30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.hourOfDay();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime27.dayOfWeek();
        int int34 = property33.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime36 = property33.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime37 = property33.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime37.add(readablePeriod38, 47);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        int int46 = mutableDateTime43.getYearOfCentury();
        org.joda.time.Chronology chronology47 = mutableDateTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime37.toMutableDateTime(chronology47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime51.dayOfYear();
        int int53 = property52.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property52.getFieldType();
        boolean boolean55 = mutableDateTime48.isSupported(dateTimeFieldType54);
        boolean boolean56 = mutableDateTime24.isSupported(dateTimeFieldType54);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime2.property(dateTimeFieldType54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime22", (instant15.compareTo(mutableDateTime22) == 0) == instant15.equals(mutableDateTime22));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone3);
        mutableDateTime5.addDays((int) '#');
        int int8 = mutableDateTime5.getMillisOfSecond();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        int int15 = mutableDateTime14.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime14.add(readablePeriod16);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = property22.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime23.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundHalfFloor();
        boolean boolean27 = mutableDateTime14.equals((java.lang.Object) property25);
        mutableDateTime5.setTime((org.joda.time.ReadableInstant) mutableDateTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant12", (mutableDateTime2.compareTo(instant12) == 0) == mutableDateTime2.equals(instant12));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.yearOfCentury();
        int int7 = mutableDateTime2.getSecondOfDay();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.Instant instant18 = mutableDateTime17.toInstant();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.monthOfYear();
        mutableDateTime17.add((long) (byte) 1);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfYear();
        int int26 = property25.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        boolean boolean28 = mutableDateTime17.isSupported(dateTimeFieldType27);
        int int29 = mutableDateTime10.get(dateTimeFieldType27);
        boolean boolean30 = mutableDateTime2.isSupported(dateTimeFieldType27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant18", (mutableDateTime10.compareTo(instant18) == 0) == mutableDateTime10.equals(instant18));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime5.toMutableDateTime();
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
        org.joda.time.MutableDateTime mutableDateTime21 = property17.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime21.add(readablePeriod22, 47);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        int int30 = mutableDateTime27.getYearOfCentury();
        org.joda.time.Chronology chronology31 = mutableDateTime27.getChronology();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime21.toMutableDateTime(chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(chronology31);
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(chronology31);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime5.toMutableDateTime(chronology31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime27", (instant3.compareTo(mutableDateTime27) == 0) == instant3.equals(mutableDateTime27));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        int int11 = mutableDateTime6.getHourOfDay();
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
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime24.add(readablePeriod25, 47);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime24.toMutableDateTime(chronology34);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.dayOfYear();
        int int40 = property39.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property39.getFieldType();
        boolean boolean42 = mutableDateTime35.isSupported(dateTimeFieldType41);
        int int43 = mutableDateTime6.get(dateTimeFieldType41);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) 'a');
        int int46 = mutableDateTime45.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime45.getZone();
        mutableDateTime6.setZoneRetainFields(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime2.toMutableDateTime(dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime6", (instant3.compareTo(mutableDateTime6) == 0) == instant3.equals(mutableDateTime6));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.copy();
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime4.toGregorianCalendar();
        org.joda.time.Instant instant6 = mutableDateTime4.toInstant();
        org.joda.time.DateTime dateTime7 = mutableDateTime4.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant6", (mutableDateTime2.compareTo(instant6) == 0) == mutableDateTime2.equals(instant6));
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
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.getMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant3", (mutableDateTime6.compareTo(instant3) == 0) == mutableDateTime6.equals(instant3));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.get();
        java.util.Locale locale5 = null;
        int int6 = property3.getMaximumShortTextLength(locale5);
        org.joda.time.MutableDateTime mutableDateTime7 = property3.roundCeiling();
        boolean boolean9 = property3.equals((java.lang.Object) "3");
        org.joda.time.MutableDateTime mutableDateTime10 = property3.roundCeiling();
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime10.add(readablePeriod12);
        org.joda.time.Instant instant14 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.dayOfMonth();
        java.util.GregorianCalendar gregorianCalendar19 = mutableDateTime17.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.secondOfDay();
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
        org.joda.time.MutableDateTime mutableDateTime34 = property30.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime34.add(readablePeriod35, 47);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        int int43 = mutableDateTime40.getYearOfCentury();
        org.joda.time.Chronology chronology44 = mutableDateTime40.getChronology();
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime34.toMutableDateTime(chronology44);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) 882, chronology44);
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(chronology44);
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime17.toMutableDateTime(chronology44);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:23.290Z", chronology44);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) 100, chronology44);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime10.toMutableDateTime(chronology44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant14", (mutableDateTime10.compareTo(instant14) == 0) == mutableDateTime10.equals(instant14));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.add((int) (short) 0);
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
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime27.add(readablePeriod30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.hourOfDay();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime27.dayOfWeek();
        int int34 = property33.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime36 = property33.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime37 = property33.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime37.add(readablePeriod38, 47);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        int int46 = mutableDateTime43.getYearOfCentury();
        org.joda.time.Chronology chronology47 = mutableDateTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime37.toMutableDateTime(chronology47);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) '#', chronology47);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) 70, chronology47);
        boolean boolean51 = mutableDateTime22.equals((java.lang.Object) chronology47);
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime10.toMutableDateTime(chronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
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
        mutableDateTime2.add((long) (byte) 1);
        boolean boolean7 = mutableDateTime2.isBeforeNow();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.minuteOfHour();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        int int18 = mutableDateTime2.get(dateTimeField17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime11", (instant3.compareTo(mutableDateTime11) == 0) == instant3.equals(mutableDateTime11));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        mutableDateTime2.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int11 = mutableDateTime2.getWeekyear();
        java.util.GregorianCalendar gregorianCalendar12 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.yearOfEra();
        int int14 = mutableDateTime2.getMillisOfDay();
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
        org.joda.time.MutableDateTime mutableDateTime27 = property23.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime27.add(readablePeriod28, 47);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime27.toMutableDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(chronology37);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime2.toMutableDateTime(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime33", (instant3.compareTo(mutableDateTime33) == 0) == instant3.equals(mutableDateTime33));
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
        boolean boolean16 = mutableDateTime5.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        int int3 = mutableDateTime2.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.yearOfCentury();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property5.getAsText(locale6);
        org.joda.time.Interval interval8 = property5.toInterval();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        int int12 = mutableDateTime11.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime11.copy();
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime13.toGregorianCalendar();
        int int15 = mutableDateTime13.getCenturyOfEra();
        mutableDateTime13.addSeconds(12);
        long long18 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime13);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime24.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime24.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime24.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.yearOfEra();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime27.centuryOfEra();
        int int30 = mutableDateTime27.getYear();
        boolean boolean31 = mutableDateTime13.isAfter((org.joda.time.ReadableInstant) mutableDateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant22", (mutableDateTime2.compareTo(instant22) == 0) == mutableDateTime2.equals(instant22));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
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
        org.joda.time.MutableDateTime mutableDateTime21 = property17.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime21.add(readablePeriod22, 47);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime21.add(readablePeriod25, (int) (byte) 0);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime35.add(readablePeriod36);
        mutableDateTime35.add((long) 11);
        boolean boolean40 = mutableDateTime21.isBefore((org.joda.time.ReadableInstant) mutableDateTime35);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(dateTimeZone51);
        mutableDateTime43.setZone(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime21.toMutableDateTime(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime((long) 366, dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime57 = mutableDateTime2.toMutableDateTime(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime30", (instant3.compareTo(mutableDateTime30) == 0) == instant3.equals(mutableDateTime30));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime6.setSecondOfDay((int) (byte) 100);
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
        mutableDateTime22.add(readablePeriod23, 47);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime22.toMutableDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) '#', chronology32);
        mutableDateTime6.setChronology(chronology32);
        int int36 = mutableDateTime6.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime6.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
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
        mutableDateTime2.setHourOfDay(2);
        boolean boolean8 = mutableDateTime2.isAfter((long) 3);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.dayOfWeek();
        boolean boolean24 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        boolean boolean25 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime17);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime28.add(readablePeriod31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.hourOfDay();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime28.dayOfWeek();
        int int35 = property34.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime37 = property34.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime38 = property34.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime38.add(readablePeriod39, 47);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        int int47 = mutableDateTime44.getYearOfCentury();
        org.joda.time.Chronology chronology48 = mutableDateTime44.getChronology();
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime38.toMutableDateTime(chronology48);
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(chronology48);
        org.joda.time.DateTime dateTime51 = mutableDateTime17.toDateTime(chronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime44", (instant12.compareTo(mutableDateTime44) == 0) == instant12.equals(mutableDateTime44));
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        boolean boolean15 = mutableDateTime5.isAfter((org.joda.time.ReadableInstant) mutableDateTime8);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime5.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        int int6 = mutableDateTime3.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.add(1);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology17);
        org.joda.time.DateTime dateTime19 = mutableDateTime10.toDateTime(chronology17);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj0, chronology17);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        mutableDateTime23.setTime((long) '#');
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime30.add(readablePeriod33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.hourOfDay();
        java.lang.String str36 = mutableDateTime30.toString();
        int int37 = mutableDateTime23.compareTo((org.joda.time.ReadableInstant) mutableDateTime30);
        mutableDateTime30.addDays(19);
        mutableDateTime30.add((long) 105);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.Instant instant45 = mutableDateTime44.toInstant();
        mutableDateTime44.setSecondOfDay((int) '#');
        mutableDateTime44.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int53 = mutableDateTime44.getWeekyear();
        java.util.GregorianCalendar gregorianCalendar54 = mutableDateTime44.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime44.yearOfEra();
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        int int61 = mutableDateTime58.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime58.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime63 = property62.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime65 = property62.add(1);
        int int66 = property55.getDifference((org.joda.time.ReadableInstant) mutableDateTime65);
        int int67 = mutableDateTime30.compareTo((org.joda.time.ReadableInstant) mutableDateTime65);
        int int68 = mutableDateTime30.getMonthOfYear();
        java.lang.Object obj69 = null;
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(obj69, chronology70);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = null;
        java.lang.String str73 = mutableDateTime71.toString(dateTimeFormatter72);
        mutableDateTime71.setTime((long) '#');
        java.lang.Object obj76 = null;
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime(obj76, chronology77);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter79 = null;
        java.lang.String str80 = mutableDateTime78.toString(dateTimeFormatter79);
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        mutableDateTime78.add(readablePeriod81);
        org.joda.time.MutableDateTime.Property property83 = mutableDateTime78.hourOfDay();
        java.lang.String str84 = mutableDateTime78.toString();
        int int85 = mutableDateTime71.compareTo((org.joda.time.ReadableInstant) mutableDateTime78);
        mutableDateTime78.setMonthOfYear((int) (short) 1);
        int int88 = mutableDateTime78.getDayOfMonth();
        java.lang.Object obj89 = null;
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.MutableDateTime mutableDateTime91 = new org.joda.time.MutableDateTime(obj89, chronology90);
        org.joda.time.DateTimeZone dateTimeZone92 = mutableDateTime91.getZone();
        org.joda.time.MutableDateTime mutableDateTime93 = org.joda.time.MutableDateTime.now(dateTimeZone92);
        org.joda.time.MutableDateTime mutableDateTime94 = new org.joda.time.MutableDateTime(dateTimeZone92);
        org.joda.time.MutableDateTime mutableDateTime95 = org.joda.time.MutableDateTime.now(dateTimeZone92);
        mutableDateTime78.setZone(dateTimeZone92);
        org.joda.time.DateTime dateTime97 = mutableDateTime30.toDateTime(dateTimeZone92);
        org.joda.time.DateTime dateTime98 = mutableDateTime20.toDateTime(dateTimeZone92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant45", (mutableDateTime13.compareTo(instant45) == 0) == mutableDateTime13.equals(instant45));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime6.setSecondOfDay((int) (byte) 100);
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
        mutableDateTime22.add(readablePeriod23, 47);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime22.toMutableDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) '#', chronology32);
        mutableDateTime6.setChronology(chronology32);
        int int36 = mutableDateTime6.getSecondOfMinute();
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        int int43 = mutableDateTime40.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime40.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime45 = property44.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime47 = property44.add(1);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        int int53 = mutableDateTime50.getYearOfCentury();
        org.joda.time.Chronology chronology54 = mutableDateTime50.getChronology();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(chronology54);
        org.joda.time.DateTime dateTime56 = mutableDateTime47.toDateTime(chronology54);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(obj37, chronology54);
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime6.toMutableDateTime(chronology54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
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
        org.joda.time.MutableDateTime mutableDateTime19 = property17.roundFloor();
        int int20 = mutableDateTime19.getSecondOfDay();
        org.joda.time.DateTime dateTime21 = mutableDateTime19.toDateTimeISO();
        boolean boolean22 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant16", (mutableDateTime10.compareTo(instant16) == 0) == mutableDateTime10.equals(instant16));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime5.toMutableDateTime();
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
        org.joda.time.MutableDateTime mutableDateTime21 = property17.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime21.add(readablePeriod22, 47);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        int int30 = mutableDateTime27.getYearOfCentury();
        org.joda.time.Chronology chronology31 = mutableDateTime27.getChronology();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime21.toMutableDateTime(chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(chronology31);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime8.toMutableDateTime(chronology31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime27", (instant3.compareTo(mutableDateTime27) == 0) == instant3.equals(mutableDateTime27));
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
        mutableDateTime2.setMillis((long) ' ');
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        int int11 = mutableDateTime10.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime10.copy();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime10.yearOfCentury();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property13.getAsText(locale14);
        org.joda.time.Interval interval16 = property13.toInterval();
        org.joda.time.MutableDateTime mutableDateTime17 = property13.getMutableDateTime();
        int int18 = mutableDateTime17.getMillisOfSecond();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime21.toString(dateTimeFormatter22);
        int int24 = mutableDateTime21.getYearOfCentury();
        org.joda.time.Chronology chronology25 = mutableDateTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(chronology25);
        org.joda.time.DateTime dateTime27 = mutableDateTime17.toDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = mutableDateTime2.toDateTime(chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
        mutableDateTime3.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.minuteOfDay();
        mutableDateTime8.setMillis((long) 'a');
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
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime24.add(readablePeriod25, 47);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        int int33 = mutableDateTime30.getYearOfCentury();
        org.joda.time.Chronology chronology34 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime24.toMutableDateTime(chronology34);
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology34);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime8.toMutableDateTime(chronology34);
        mutableDateTime3.setChronology(chronology34);
        int int40 = mutableDateTime0.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime30", (instant4.compareTo(mutableDateTime30) == 0) == instant4.equals(mutableDateTime30));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        java.lang.String str8 = property7.toString();
        int int9 = property7.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime11 = property7.addWrapField((int) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime13 = property7.add((long) (short) 10);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        int int17 = mutableDateTime16.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime16.copy();
        java.util.GregorianCalendar gregorianCalendar19 = mutableDateTime18.toGregorianCalendar();
        int int20 = mutableDateTime18.getCenturyOfEra();
        boolean boolean21 = mutableDateTime13.isAfter((org.joda.time.ReadableInstant) mutableDateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
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
        boolean boolean7 = mutableDateTime5.isAfter((long) 793);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.dayOfMonth();
        int int10 = mutableDateTime8.getCenturyOfEra();
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
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        boolean boolean25 = dateTime23.isSupported(dateTimeFieldType24);
        mutableDateTime8.setTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime8.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime29 = property27.addWrapField(11);
        org.joda.time.DateTimeField dateTimeField30 = property27.getField();
        mutableDateTime5.setRounding(dateTimeField30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime13", (instant3.compareTo(mutableDateTime13) == 0) == instant3.equals(mutableDateTime13));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property7.getFieldType();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.addMillis((int) 'a');
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        mutableDateTime17.addMillis((int) 'a');
        mutableDateTime12.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.add((long) (short) -1);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone30);
        mutableDateTime32.addDays((int) '#');
        int int35 = property24.compareTo((org.joda.time.ReadableInstant) mutableDateTime32);
        int int36 = property24.getMaximumValue();
        long long37 = property24.remainder();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.dayOfYear();
        int int42 = property41.get();
        org.joda.time.DurationField durationField43 = property41.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime44 = property41.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime46 = property41.add((long) (short) -1);
        boolean boolean47 = property24.equals((java.lang.Object) property41);
        org.joda.time.DateTimeField dateTimeField48 = property41.getField();
        int int49 = mutableDateTime12.get(dateTimeField48);
        boolean boolean50 = property7.equals((java.lang.Object) int49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime29", (instant3.compareTo(mutableDateTime29) == 0) == instant3.equals(mutableDateTime29));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.minuteOfHour();
        java.lang.String str5 = property4.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        java.lang.Object obj5 = mutableDateTime2.clone();
        mutableDateTime2.addWeeks(20);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfMonth();
        int int20 = mutableDateTime18.getCenturyOfEra();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = null;
        java.lang.String str25 = mutableDateTime23.toString(dateTimeFormatter24);
        int int26 = mutableDateTime23.getYearOfCentury();
        org.joda.time.Chronology chronology27 = mutableDateTime23.getChronology();
        int int28 = mutableDateTime23.getWeekOfWeekyear();
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        org.joda.time.DateTime dateTime33 = mutableDateTime23.toDateTime(dateTimeZone32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        boolean boolean35 = dateTime33.isSupported(dateTimeFieldType34);
        mutableDateTime18.setTime((org.joda.time.ReadableInstant) dateTime33);
        int int37 = mutableDateTime18.getDayOfWeek();
        int int38 = property15.getDifference((org.joda.time.ReadableInstant) mutableDateTime18);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.Instant instant42 = mutableDateTime41.toInstant();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime41.monthOfYear();
        mutableDateTime41.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime41.secondOfMinute();
        int int47 = property46.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime49 = property46.add((int) (short) 0);
        org.joda.time.DateTimeField dateTimeField50 = property46.getField();
        mutableDateTime18.setRounding(dateTimeField50);
        mutableDateTime2.setRounding(dateTimeField50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and instant42", (mutableDateTime23.compareTo(instant42) == 0) == mutableDateTime23.equals(instant42));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.lang.String str8 = property7.getAsString();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) (short) -1);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone19);
        mutableDateTime21.addDays((int) '#');
        int int24 = property13.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        int int25 = mutableDateTime21.getWeekyear();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.dayOfYear();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime21.secondOfDay();
        int int28 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime mutableDateTime30 = property7.add((long) 739);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime36.toMutableDateTime();
        mutableDateTime37.setSecondOfDay((int) (byte) 100);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime43.hourOfDay();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime43.dayOfWeek();
        int int50 = property49.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime52 = property49.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime53 = property49.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        mutableDateTime53.add(readablePeriod54, 47);
        java.lang.Object obj57 = null;
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(obj57, chronology58);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = null;
        java.lang.String str61 = mutableDateTime59.toString(dateTimeFormatter60);
        int int62 = mutableDateTime59.getYearOfCentury();
        org.joda.time.Chronology chronology63 = mutableDateTime59.getChronology();
        org.joda.time.MutableDateTime mutableDateTime64 = mutableDateTime53.toMutableDateTime(chronology63);
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime((long) '#', chronology63);
        mutableDateTime37.setChronology(chronology63);
        mutableDateTime30.setChronology(chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and instant34", (mutableDateTime18.compareTo(instant34) == 0) == mutableDateTime18.equals(instant34));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField(49);
        boolean boolean12 = mutableDateTime10.isEqual((long) 7);
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
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime26.add(readablePeriod27, 47);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        int int35 = mutableDateTime32.getYearOfCentury();
        org.joda.time.Chronology chronology36 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime26.toMutableDateTime(chronology36);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) '#', chronology36);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(chronology36);
        mutableDateTime10.setChronology(chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime32", (instant3.compareTo(mutableDateTime32) == 0) == instant3.equals(mutableDateTime32));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.DateTime dateTime4 = mutableDateTime2.toDateTime();
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        int int5 = property4.getMinimumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        mutableDateTime2.addMillis((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology6);
        mutableDateTime7.addMillis((int) 'a');
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime7);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.toMutableDateTime();
        mutableDateTime17.setSecondOfDay((int) (byte) 100);
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
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime33.add(readablePeriod34, 47);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        int int42 = mutableDateTime39.getYearOfCentury();
        org.joda.time.Chronology chronology43 = mutableDateTime39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime33.toMutableDateTime(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) '#', chronology43);
        mutableDateTime17.setChronology(chronology43);
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(chronology43);
        mutableDateTime7.setChronology(chronology43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and mutableDateTime39", (instant14.compareTo(mutableDateTime39) == 0) == instant14.equals(mutableDateTime39));
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
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime5.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime5.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        mutableDateTime2.setTime((long) '#');
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 100, dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime2.toMutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone12);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology26);
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
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime40.add(readablePeriod41, 47);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        int int49 = mutableDateTime46.getYearOfCentury();
        org.joda.time.Chronology chronology50 = mutableDateTime46.getChronology();
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime40.toMutableDateTime(chronology50);
        mutableDateTime27.setChronology(chronology50);
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(chronology50);
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now(chronology50);
        org.joda.time.DateTime dateTime55 = mutableDateTime19.toDateTime(chronology50);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.Instant instant59 = mutableDateTime58.toInstant();
        mutableDateTime58.setSecondOfDay((int) '#');
        mutableDateTime58.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int67 = mutableDateTime58.getMinuteOfDay();
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime58.minuteOfDay();
        boolean boolean69 = mutableDateTime19.isBefore((org.joda.time.ReadableInstant) mutableDateTime58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant59", (mutableDateTime11.compareTo(instant59) == 0) == mutableDateTime11.equals(instant59));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime2.add(readablePeriod6, 2);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        int int14 = mutableDateTime11.getYearOfCentury();
        org.joda.time.Chronology chronology15 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime16.add(readablePeriod17);
        mutableDateTime16.add((long) 11);
        mutableDateTime16.setDayOfYear((int) '4');
        int int23 = mutableDateTime16.getRoundingMode();
        boolean boolean24 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime16.minuteOfDay();
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime12.add(readablePeriod13, 47);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:47.920Z", dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12, dateTimeZone20);
        int int23 = mutableDateTime22.getSecondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime22.add(readablePeriod24, (int) (short) 0);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        mutableDateTime29.setTime((long) '#');
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime29);
        mutableDateTime34.setTime((long) 19);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        mutableDateTime39.add(readablePeriod42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.hourOfDay();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime39.dayOfWeek();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime39.secondOfDay();
        boolean boolean47 = mutableDateTime34.isAfter((org.joda.time.ReadableInstant) mutableDateTime39);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        mutableDateTime50.add(readablePeriod53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime50.hourOfDay();
        int int56 = mutableDateTime50.getMillisOfSecond();
        java.lang.Object obj57 = mutableDateTime50.clone();
        java.lang.Object obj58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(obj58, chronology59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = null;
        java.lang.String str62 = mutableDateTime60.toString(dateTimeFormatter61);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        mutableDateTime60.add(readablePeriod63);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime60.hourOfDay();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime60.dayOfWeek();
        java.lang.String str67 = mutableDateTime60.toString();
        org.joda.time.DateTimeZone dateTimeZone68 = mutableDateTime60.getZone();
        mutableDateTime50.setZoneRetainFields(dateTimeZone68);
        org.joda.time.MutableDateTime mutableDateTime70 = mutableDateTime39.toMutableDateTime(dateTimeZone68);
        org.joda.time.DateTime dateTime71 = mutableDateTime22.toDateTime(dateTimeZone68);
        java.lang.Object obj72 = null;
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(obj72, chronology73);
        org.joda.time.Instant instant75 = mutableDateTime74.toInstant();
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime74.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime77 = property76.roundHalfFloor();
        int int78 = mutableDateTime77.getDayOfYear();
        boolean boolean80 = mutableDateTime77.isEqual((long) ' ');
        mutableDateTime77.addMillis(3);
        int int83 = mutableDateTime22.compareTo((org.joda.time.ReadableInstant) mutableDateTime77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant75", (mutableDateTime19.compareTo(instant75) == 0) == mutableDateTime19.equals(instant75));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfMonth();
        java.util.GregorianCalendar gregorianCalendar4 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.secondOfDay();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = mutableDateTime9.toString(dateTimeFormatter10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime9.add(readablePeriod12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.dayOfWeek();
        int int16 = property15.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime18 = property15.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime19 = property15.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime19.add(readablePeriod20, 47);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        int int28 = mutableDateTime25.getYearOfCentury();
        org.joda.time.Chronology chronology29 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime19.toMutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 882, chronology29);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(chronology29);
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime2.toMutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:23.290Z", chronology29);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 100, chronology29);
        mutableDateTime35.setTime((long) (short) 0);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.Instant instant41 = mutableDateTime40.toInstant();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime40.monthOfYear();
        mutableDateTime40.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.secondOfMinute();
        int int46 = property45.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime48 = property45.add((int) (short) 0);
        org.joda.time.DateTimeField dateTimeField49 = property45.getField();
        int int50 = mutableDateTime35.get(dateTimeField49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant41", (mutableDateTime2.compareTo(instant41) == 0) == mutableDateTime2.equals(instant41));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.dayOfWeek();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.toMutableDateTime();
        mutableDateTime16.setSecondOfDay((int) (byte) 100);
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
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime32.add(readablePeriod33, 47);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        int int41 = mutableDateTime38.getYearOfCentury();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime32.toMutableDateTime(chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) '#', chronology42);
        mutableDateTime16.setChronology(chronology42);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime2.toMutableDateTime(chronology42);
        int int47 = mutableDateTime2.getRoundingMode();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime38", (instant13.compareTo(mutableDateTime38) == 0) == instant13.equals(mutableDateTime38));
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
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.yearOfCentury();
        int int7 = mutableDateTime2.getSecondOfDay();
        boolean boolean8 = mutableDateTime2.isBeforeNow();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime11.add(readablePeriod14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.centuryOfEra();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime11.dayOfYear();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime11.minuteOfHour();
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.monthOfYear();
        mutableDateTime21.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime21.secondOfMinute();
        int int27 = property26.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime29 = property26.add((int) (short) 0);
        org.joda.time.DateTimeField dateTimeField30 = property26.getField();
        int int31 = mutableDateTime11.get(dateTimeField30);
        mutableDateTime2.setRounding(dateTimeField30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant22", (mutableDateTime11.compareTo(instant22) == 0) == mutableDateTime11.equals(instant22));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property7.getFieldType();
        org.joda.time.Interval interval10 = property7.toInterval();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        mutableDateTime13.setDayOfYear((int) ' ');
        mutableDateTime13.setMinuteOfDay((int) (short) 10);
        java.util.GregorianCalendar gregorianCalendar22 = mutableDateTime13.toGregorianCalendar();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        mutableDateTime25.setMinuteOfDay(904);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime34.add(readablePeriod37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.hourOfDay();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime34.dayOfWeek();
        int int41 = property40.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime43 = property40.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime44 = property40.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime44.add(readablePeriod45, 47);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        int int53 = mutableDateTime50.getYearOfCentury();
        org.joda.time.Chronology chronology54 = mutableDateTime50.getChronology();
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime44.toMutableDateTime(chronology54);
        org.joda.time.DateTimeZone dateTimeZone56 = mutableDateTime55.getZone();
        mutableDateTime25.setZone(dateTimeZone56);
        mutableDateTime13.setZone(dateTimeZone56);
        org.joda.time.MutableDateTime mutableDateTime59 = org.joda.time.MutableDateTime.now(dateTimeZone56);
        int int60 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime50", (instant3.compareTo(mutableDateTime50) == 0) == instant3.equals(mutableDateTime50));
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
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime12.add(readablePeriod13, 47);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime12.toMutableDateTime(chronology22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime26.getZone();
        mutableDateTime12.setZone(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = mutableDateTime12.toDateTimeISO();
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
        org.joda.time.MutableDateTime mutableDateTime43 = property39.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        mutableDateTime43.add(readablePeriod44, 47);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        mutableDateTime43.add(readablePeriod47, (int) (byte) 0);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        int int55 = mutableDateTime52.getYearOfCentury();
        org.joda.time.Chronology chronology56 = mutableDateTime52.getChronology();
        org.joda.time.MutableDateTime mutableDateTime57 = org.joda.time.MutableDateTime.now(chronology56);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        mutableDateTime57.add(readablePeriod58);
        mutableDateTime57.add((long) 11);
        boolean boolean62 = mutableDateTime43.isBefore((org.joda.time.ReadableInstant) mutableDateTime57);
        java.lang.Object obj63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj63, chronology64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = null;
        java.lang.String str67 = mutableDateTime65.toString(dateTimeFormatter66);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        mutableDateTime65.add(readablePeriod68);
        java.lang.Object obj70 = null;
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(obj70, chronology71);
        org.joda.time.DateTimeZone dateTimeZone73 = mutableDateTime72.getZone();
        org.joda.time.MutableDateTime mutableDateTime74 = org.joda.time.MutableDateTime.now(dateTimeZone73);
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(dateTimeZone73);
        mutableDateTime65.setZone(dateTimeZone73);
        org.joda.time.MutableDateTime mutableDateTime77 = mutableDateTime43.toMutableDateTime(dateTimeZone73);
        mutableDateTime12.setZoneRetainFields(dateTimeZone73);
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime(dateTimeZone73);
        java.lang.Object obj80 = null;
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.MutableDateTime mutableDateTime82 = new org.joda.time.MutableDateTime(obj80, chronology81);
        org.joda.time.Instant instant83 = mutableDateTime82.toInstant();
        org.joda.time.MutableDateTime.Property property84 = mutableDateTime82.minuteOfHour();
        boolean boolean85 = mutableDateTime79.isEqual((org.joda.time.ReadableInstant) mutableDateTime82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and instant83", (mutableDateTime18.compareTo(instant83) == 0) == mutableDateTime18.equals(instant83));
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
        mutableDateTime2.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int11 = mutableDateTime2.getWeekyear();
        java.util.GregorianCalendar gregorianCalendar12 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.yearOfEra();
        int int14 = mutableDateTime2.getMillisOfDay();
        int int15 = mutableDateTime2.getMonthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfMonth();
        int int18 = mutableDateTime16.getCenturyOfEra();
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
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        boolean boolean33 = dateTime31.isSupported(dateTimeFieldType32);
        mutableDateTime16.setTime((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime16.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime37 = property35.addWrapField(11);
        org.joda.time.DateTimeField dateTimeField38 = property35.getField();
        int int39 = mutableDateTime2.get(dateTimeField38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime21", (instant3.compareTo(mutableDateTime21) == 0) == instant3.equals(mutableDateTime21));
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
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        mutableDateTime10.setDayOfYear((int) ' ');
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        mutableDateTime19.setMillisOfSecond(7);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.secondOfMinute();
        mutableDateTime10.setTime((org.joda.time.ReadableInstant) mutableDateTime19);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime29.hourOfDay();
        int int35 = mutableDateTime29.getMillisOfSecond();
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
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableDateTime48.add(readablePeriod49, 47);
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = null;
        java.lang.String str56 = mutableDateTime54.toString(dateTimeFormatter55);
        int int57 = mutableDateTime54.getYearOfCentury();
        org.joda.time.Chronology chronology58 = mutableDateTime54.getChronology();
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime48.toMutableDateTime(chronology58);
        org.joda.time.MutableDateTime mutableDateTime60 = org.joda.time.MutableDateTime.now(chronology58);
        org.joda.time.MutableDateTime mutableDateTime61 = org.joda.time.MutableDateTime.now(chronology58);
        org.joda.time.MutableDateTime mutableDateTime62 = mutableDateTime29.toMutableDateTime(chronology58);
        org.joda.time.DateTime dateTime63 = mutableDateTime10.toDateTime(chronology58);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        java.lang.Object obj65 = null;
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(obj65, chronology66);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = null;
        java.lang.String str69 = mutableDateTime67.toString(dateTimeFormatter68);
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        mutableDateTime67.add(readablePeriod70);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime67.hourOfDay();
        int int73 = mutableDateTime67.getMillisOfSecond();
        java.lang.Object obj74 = mutableDateTime67.clone();
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime29", (instant3.compareTo(mutableDateTime29) == 0) == instant3.equals(mutableDateTime29));
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
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime12.add(readablePeriod13, 47);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime12.toMutableDateTime(chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology22);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = mutableDateTime27.toString(dateTimeFormatter28);
        mutableDateTime27.setTime((long) '#');
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime34.add(readablePeriod37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.hourOfDay();
        java.lang.String str40 = mutableDateTime34.toString();
        int int41 = mutableDateTime27.compareTo((org.joda.time.ReadableInstant) mutableDateTime34);
        mutableDateTime34.setMonthOfYear((int) (short) 1);
        int int44 = mutableDateTime34.getDayOfMonth();
        org.joda.time.DateTime dateTime45 = mutableDateTime34.toDateTime();
        java.util.Date date46 = mutableDateTime34.toDate();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime34.millisOfSecond();
        mutableDateTime24.setMillis((org.joda.time.ReadableInstant) mutableDateTime34);
        org.joda.time.DateTimeZone dateTimeZone49 = mutableDateTime24.getZone();
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.Instant instant53 = mutableDateTime52.toInstant();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime52.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime55 = property54.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime56 = property54.roundFloor();
        int int57 = mutableDateTime56.getSecondOfDay();
        org.joda.time.DateTime dateTime58 = mutableDateTime56.toDateTimeISO();
        boolean boolean60 = dateTime58.isBefore((long) 318);
        mutableDateTime24.setMillis((org.joda.time.ReadableInstant) dateTime58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and instant53", (mutableDateTime18.compareTo(instant53) == 0) == mutableDateTime18.equals(instant53));
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
        mutableDateTime2.setTime((long) '#');
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime2);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 100, dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime2.toMutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone12);
        java.lang.Object obj20 = null;
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(obj20, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = mutableDateTime22.toString(dateTimeFormatter23);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.Chronology chronology26 = mutableDateTime22.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology26);
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
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime40.add(readablePeriod41, 47);
        java.lang.Object obj44 = null;
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(obj44, chronology45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = null;
        java.lang.String str48 = mutableDateTime46.toString(dateTimeFormatter47);
        int int49 = mutableDateTime46.getYearOfCentury();
        org.joda.time.Chronology chronology50 = mutableDateTime46.getChronology();
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime40.toMutableDateTime(chronology50);
        mutableDateTime27.setChronology(chronology50);
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now(chronology50);
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now(chronology50);
        org.joda.time.DateTime dateTime55 = mutableDateTime19.toDateTime(chronology50);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(obj56, chronology57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = null;
        java.lang.String str60 = mutableDateTime58.toString(dateTimeFormatter59);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        mutableDateTime58.add(readablePeriod61);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime58.centuryOfEra();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime58.dayOfYear();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime58.minuteOfHour();
        java.lang.Object obj66 = null;
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(obj66, chronology67);
        org.joda.time.Instant instant69 = mutableDateTime68.toInstant();
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime68.monthOfYear();
        mutableDateTime68.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime68.secondOfMinute();
        int int74 = property73.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime76 = property73.add((int) (short) 0);
        org.joda.time.DateTimeField dateTimeField77 = property73.getField();
        int int78 = mutableDateTime58.get(dateTimeField77);
        mutableDateTime19.setRounding(dateTimeField77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant69", (mutableDateTime14.compareTo(instant69) == 0) == mutableDateTime14.equals(instant69));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        mutableDateTime2.setMinuteOfDay(904);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.millisOfSecond();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        mutableDateTime12.setSecondOfDay((int) '#');
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.minuteOfDay();
        mutableDateTime17.setMillis((long) 'a');
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
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime33.add(readablePeriod34, 47);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        int int42 = mutableDateTime39.getYearOfCentury();
        org.joda.time.Chronology chronology43 = mutableDateTime39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime33.toMutableDateTime(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now(chronology43);
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(chronology43);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime17.toMutableDateTime(chronology43);
        mutableDateTime12.setChronology(chronology43);
        int int49 = mutableDateTime2.compareTo((org.joda.time.ReadableInstant) mutableDateTime12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime39", (instant13.compareTo(mutableDateTime39) == 0) == instant13.equals(mutableDateTime39));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.hourOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.dayOfWeek();
        int int17 = property16.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime19 = property16.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime20 = property16.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime20.add(readablePeriod21, 47);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime20.toMutableDateTime(chronology30);
        mutableDateTime7.setChronology(chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(chronology30);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime36.add(readablePeriod39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.hourOfDay();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime36.dayOfWeek();
        int int43 = property42.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime45 = property42.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime46 = property42.roundHalfEven();
        boolean boolean47 = property42.isLeap();
        org.joda.time.MutableDateTime mutableDateTime48 = property42.roundHalfCeiling();
        boolean boolean49 = mutableDateTime33.isBefore((org.joda.time.ReadableInstant) mutableDateTime48);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.Instant instant53 = mutableDateTime52.toInstant();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime52.monthOfYear();
        org.joda.time.Chronology chronology55 = mutableDateTime52.getChronology();
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime33.toMutableDateTime(chronology55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant53", (mutableDateTime2.compareTo(instant53) == 0) == mutableDateTime2.equals(instant53));
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
        mutableDateTime2.setHourOfDay(2);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:47.920Z", dateTimeZone11);
        mutableDateTime2.setZone(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone11);
        int int15 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Instant instant16 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant16", (mutableDateTime10.compareTo(instant16) == 0) == mutableDateTime10.equals(instant16));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        mutableDateTime2.setHourOfDay(2);
        boolean boolean8 = mutableDateTime2.isAfter((long) 3);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.dayOfWeek();
        boolean boolean24 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        boolean boolean25 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime17);
        java.lang.String str26 = mutableDateTime2.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime17", (instant12.compareTo(mutableDateTime17) == 0) == instant12.equals(mutableDateTime17));
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
        mutableDateTime2.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int11 = mutableDateTime2.getWeekyear();
        java.util.GregorianCalendar gregorianCalendar12 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.yearOfEra();
        org.joda.time.Chronology chronology14 = mutableDateTime2.getChronology();
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
        org.joda.time.MutableDateTime mutableDateTime27 = property23.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime27.add(readablePeriod28, 47);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        int int36 = mutableDateTime33.getYearOfCentury();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime27.toMutableDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(chronology37);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime33", (instant3.compareTo(mutableDateTime33) == 0) == instant3.equals(mutableDateTime33));
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
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.Instant instant9 = mutableDateTime8.toInstant();
        mutableDateTime8.setSecondOfDay((int) '#');
        mutableDateTime8.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int17 = mutableDateTime8.getMinuteOfDay();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime8.minuteOfDay();
        boolean boolean19 = property4.equals((java.lang.Object) mutableDateTime8);
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
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        mutableDateTime33.add(readablePeriod34, 47);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        int int42 = mutableDateTime39.getYearOfCentury();
        org.joda.time.Chronology chronology43 = mutableDateTime39.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime33.toMutableDateTime(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) '#', chronology43);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(chronology43);
        mutableDateTime8.setChronology(chronology43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime39", (instant3.compareTo(mutableDateTime39) == 0) == instant3.equals(mutableDateTime39));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:47.920Z", dateTimeZone4);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        mutableDateTime8.setHourOfDay(2);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime8.add(readableDuration13);
        java.util.Locale locale15 = null;
        java.util.Calendar calendar16 = mutableDateTime8.toCalendar(locale15);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.Instant instant20 = mutableDateTime19.toInstant();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.monthOfYear();
        mutableDateTime19.add((long) (byte) 1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfYear();
        int int28 = property27.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property27.getFieldType();
        boolean boolean30 = mutableDateTime19.isSupported(dateTimeFieldType29);
        int int31 = mutableDateTime8.get(dateTimeFieldType29);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime5.property(dateTimeFieldType29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant20", (mutableDateTime3.compareTo(instant20) == 0) == mutableDateTime3.equals(instant20));
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
        int int6 = mutableDateTime3.getYearOfCentury();
        org.joda.time.Chronology chronology7 = mutableDateTime3.getChronology();
        int int8 = mutableDateTime3.getWeekOfWeekyear();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTime dateTime13 = mutableDateTime3.toDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 882, dateTimeZone12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        mutableDateTime17.addMillis((int) 'a');
        int int20 = mutableDateTime17.getDayOfYear();
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        mutableDateTime23.setSecondOfDay((int) '#');
        mutableDateTime23.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int32 = mutableDateTime23.getWeekyear();
        java.util.GregorianCalendar gregorianCalendar33 = mutableDateTime23.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime23.yearOfEra();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        int int40 = mutableDateTime37.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime37.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime42 = property41.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime44 = property41.add(1);
        int int45 = property34.getDifference((org.joda.time.ReadableInstant) mutableDateTime44);
        boolean boolean46 = mutableDateTime17.isAfter((org.joda.time.ReadableInstant) mutableDateTime44);
        org.joda.time.Chronology chronology47 = mutableDateTime44.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = mutableDateTime14.toMutableDateTime(chronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant24", (mutableDateTime3.compareTo(instant24) == 0) == mutableDateTime3.equals(instant24));
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
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.dayOfWeek();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.toMutableDateTime();
        mutableDateTime16.setSecondOfDay((int) (byte) 100);
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
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime32.add(readablePeriod33, 47);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        int int41 = mutableDateTime38.getYearOfCentury();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime32.toMutableDateTime(chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) '#', chronology42);
        mutableDateTime16.setChronology(chronology42);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime2.toMutableDateTime(chronology42);
        int int47 = mutableDateTime46.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime6.setSecondOfDay((int) (byte) 100);
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
        mutableDateTime22.add(readablePeriod23, 47);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime22.toMutableDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) '#', chronology32);
        mutableDateTime6.setChronology(chronology32);
        int int36 = mutableDateTime6.getSecondOfMinute();
        org.joda.time.Chronology chronology37 = mutableDateTime6.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        mutableDateTime9.add((long) (byte) 1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        int int18 = property17.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property17.getFieldType();
        boolean boolean20 = mutableDateTime9.isSupported(dateTimeFieldType19);
        int int21 = mutableDateTime2.get(dateTimeFieldType19);
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
        org.joda.time.MutableDateTime mutableDateTime34 = property30.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime34.add(readablePeriod35, 47);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        int int43 = mutableDateTime40.getYearOfCentury();
        org.joda.time.Chronology chronology44 = mutableDateTime40.getChronology();
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime34.toMutableDateTime(chronology44);
        org.joda.time.DateTimeZone dateTimeZone46 = mutableDateTime45.getZone();
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime2.toMutableDateTime(dateTimeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime40", (instant10.compareTo(mutableDateTime40) == 0) == instant10.equals(mutableDateTime40));
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
        int int15 = mutableDateTime9.getMillisOfSecond();
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
        mutableDateTime28.add(readablePeriod29, 47);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        int int37 = mutableDateTime34.getYearOfCentury();
        org.joda.time.Chronology chronology38 = mutableDateTime34.getChronology();
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime28.toMutableDateTime(chronology38);
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now(chronology38);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(chronology38);
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime9.toMutableDateTime(chronology38);
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(chronology38);
        mutableDateTime5.setChronology(chronology38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime9", (instant3.compareTo(mutableDateTime9) == 0) == instant3.equals(mutableDateTime9));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        mutableDateTime2.setMinuteOfDay(4);
        boolean boolean7 = mutableDateTime2.isBefore(0L);
        org.joda.time.Instant instant8 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime2.toMutableDateTime();
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
        mutableDateTime22.add(readablePeriod23, 47);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime22.toMutableDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(chronology32);
        org.joda.time.DateTime dateTime35 = mutableDateTime34.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration36 = null;
        mutableDateTime34.add(readableDuration36, 949);
        mutableDateTime34.setDayOfMonth(11);
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((long) (byte) 100, dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime34.toMutableDateTime(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime2.toMutableDateTime(dateTimeZone45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime9", (instant8.compareTo(mutableDateTime9) == 0) == instant8.equals(mutableDateTime9));
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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        mutableDateTime19.setTime((long) '#');
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime19.getZone();
        org.joda.time.DateTime dateTime25 = mutableDateTime5.toDateTime(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime8", (instant3.compareTo(mutableDateTime8) == 0) == instant3.equals(mutableDateTime8));
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
        mutableDateTime6.setSecondOfDay((int) (byte) 100);
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
        mutableDateTime22.add(readablePeriod23, 47);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime22.toMutableDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) '#', chronology32);
        mutableDateTime6.setChronology(chronology32);
        int int36 = mutableDateTime6.getSecondOfMinute();
        boolean boolean37 = mutableDateTime6.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.dayOfWeek();
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.toMutableDateTime();
        mutableDateTime16.setSecondOfDay((int) (byte) 100);
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
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime32.add(readablePeriod33, 47);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        int int41 = mutableDateTime38.getYearOfCentury();
        org.joda.time.Chronology chronology42 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime32.toMutableDateTime(chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) '#', chronology42);
        mutableDateTime16.setChronology(chronology42);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime2.toMutableDateTime(chronology42);
        int int47 = mutableDateTime46.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
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
        mutableDateTime2.add((long) (short) -1);
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
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime13);
        java.lang.Object obj29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(obj29, chronology30);
        org.joda.time.Instant instant32 = mutableDateTime31.toInstant();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.monthOfYear();
        mutableDateTime31.add((long) (byte) 1);
        boolean boolean36 = mutableDateTime31.isBeforeNow();
        int int37 = mutableDateTime31.getSecondOfMinute();
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) mutableDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and instant32", (mutableDateTime20.compareTo(instant32) == 0) == mutableDateTime20.equals(instant32));
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
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.dayOfWeek();
        int int10 = property9.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime12 = property9.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime13 = property9.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime13.add(readablePeriod14, 47);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(obj18, chronology19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:47.920Z", dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime13, dateTimeZone21);
        int int24 = mutableDateTime23.getSecondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime23.add(readablePeriod25, (int) (short) 0);
        java.lang.Object obj28 = null;
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(obj28, chronology29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = mutableDateTime30.toString(dateTimeFormatter31);
        mutableDateTime30.setTime((long) '#');
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime30);
        mutableDateTime35.setTime((long) 19);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime40.dayOfWeek();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime40.secondOfDay();
        boolean boolean48 = mutableDateTime35.isAfter((org.joda.time.ReadableInstant) mutableDateTime40);
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = mutableDateTime51.toString(dateTimeFormatter52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        mutableDateTime51.add(readablePeriod54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime51.hourOfDay();
        int int57 = mutableDateTime51.getMillisOfSecond();
        java.lang.Object obj58 = mutableDateTime51.clone();
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = null;
        java.lang.String str63 = mutableDateTime61.toString(dateTimeFormatter62);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        mutableDateTime61.add(readablePeriod64);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime61.hourOfDay();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime61.dayOfWeek();
        java.lang.String str68 = mutableDateTime61.toString();
        org.joda.time.DateTimeZone dateTimeZone69 = mutableDateTime61.getZone();
        mutableDateTime51.setZoneRetainFields(dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime40.toMutableDateTime(dateTimeZone69);
        org.joda.time.DateTime dateTime72 = mutableDateTime23.toDateTime(dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime((long) 683, dateTimeZone69);
        java.lang.Object obj74 = null;
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(obj74, chronology75);
        org.joda.time.DateTimeZone dateTimeZone77 = mutableDateTime76.getZone();
        org.joda.time.MutableDateTime mutableDateTime78 = org.joda.time.MutableDateTime.now(dateTimeZone77);
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime(dateTimeZone77);
        mutableDateTime79.addDays((int) '#');
        int int82 = mutableDateTime73.compareTo((org.joda.time.ReadableInstant) mutableDateTime79);
        java.lang.Object obj83 = null;
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.MutableDateTime mutableDateTime85 = new org.joda.time.MutableDateTime(obj83, chronology84);
        org.joda.time.Instant instant86 = mutableDateTime85.toInstant();
        org.joda.time.MutableDateTime.Property property87 = mutableDateTime85.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime88 = property87.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime89 = mutableDateTime88.toMutableDateTime();
        boolean boolean90 = mutableDateTime73.isBefore((org.joda.time.ReadableInstant) mutableDateTime89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and instant86", (mutableDateTime20.compareTo(instant86) == 0) == mutableDateTime20.equals(instant86));
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
        mutableDateTime2.setHourOfDay(2);
        boolean boolean8 = mutableDateTime2.isAfter((long) 3);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.dayOfWeek();
        boolean boolean24 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        boolean boolean25 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime17);
        int int26 = mutableDateTime17.getHourOfDay();
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.572Z");
        boolean boolean29 = mutableDateTime17.isAfter((org.joda.time.ReadableInstant) mutableDateTime28);
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(obj30, chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = mutableDateTime32.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.centuryOfEra();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime32.dayOfYear();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime32.minuteOfHour();
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(obj40, chronology41);
        org.joda.time.Instant instant43 = mutableDateTime42.toInstant();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime42.monthOfYear();
        mutableDateTime42.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime42.secondOfMinute();
        int int48 = property47.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime50 = property47.add((int) (short) 0);
        org.joda.time.DateTimeField dateTimeField51 = property47.getField();
        int int52 = mutableDateTime32.get(dateTimeField51);
        mutableDateTime28.setRounding(dateTimeField51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime17", (instant12.compareTo(mutableDateTime17) == 0) == instant12.equals(mutableDateTime17));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
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
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.hourOfDay();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime6.dayOfWeek();
        int int13 = property12.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime15 = property12.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime16 = property12.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime16.add(readablePeriod17, 47);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:47.920Z", dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime16, dateTimeZone24);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.yearOfEra();
        java.util.GregorianCalendar gregorianCalendar28 = mutableDateTime26.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime26.dayOfYear();
        boolean boolean30 = instant3.equals((java.lang.Object) property29);
        java.util.Locale locale31 = null;
        int int32 = property29.getMaximumShortTextLength(locale31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.Instant instant6 = mutableDateTime2.toInstant();
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
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 882, dateTimeZone19);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property22.getFieldType();
        int int24 = mutableDateTime2.get(dateTimeFieldType23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime10", (instant6.compareTo(mutableDateTime10) == 0) == instant6.equals(mutableDateTime10));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        mutableDateTime2.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int11 = mutableDateTime2.getWeekyear();
        java.util.GregorianCalendar gregorianCalendar12 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.yearOfEra();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime16.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime23 = property20.add(1);
        int int24 = property13.getDifference((org.joda.time.ReadableInstant) mutableDateTime23);
        mutableDateTime23.setDate((long) 887);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime23.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.dayOfMonth();
        int int30 = mutableDateTime28.getCenturyOfEra();
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
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = null;
        boolean boolean45 = dateTime43.isSupported(dateTimeFieldType44);
        mutableDateTime28.setTime((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime28.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime49 = property47.add(0);
        int int50 = mutableDateTime49.getSecondOfMinute();
        org.joda.time.DateTime dateTime51 = mutableDateTime49.toDateTimeISO();
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(obj52, chronology53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = null;
        java.lang.String str56 = mutableDateTime54.toString(dateTimeFormatter55);
        java.lang.Object obj57 = mutableDateTime54.clone();
        org.joda.time.DateTimeZone dateTimeZone58 = mutableDateTime54.getZone();
        mutableDateTime49.setZone(dateTimeZone58);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology61);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime62.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone64 = mutableDateTime62.getZone();
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
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        mutableDateTime77.add(readablePeriod78, 47);
        java.lang.Object obj81 = null;
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.MutableDateTime mutableDateTime83 = new org.joda.time.MutableDateTime(obj81, chronology82);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter84 = null;
        java.lang.String str85 = mutableDateTime83.toString(dateTimeFormatter84);
        int int86 = mutableDateTime83.getYearOfCentury();
        org.joda.time.Chronology chronology87 = mutableDateTime83.getChronology();
        org.joda.time.MutableDateTime mutableDateTime88 = mutableDateTime77.toMutableDateTime(chronology87);
        org.joda.time.Chronology chronology90 = null;
        org.joda.time.MutableDateTime mutableDateTime91 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology90);
        org.joda.time.MutableDateTime.Property property92 = mutableDateTime91.dayOfYear();
        int int93 = property92.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType94 = property92.getFieldType();
        boolean boolean95 = mutableDateTime88.isSupported(dateTimeFieldType94);
        int int96 = mutableDateTime62.get(dateTimeFieldType94);
        org.joda.time.MutableDateTime.Property property97 = mutableDateTime49.property(dateTimeFieldType94);
        org.joda.time.MutableDateTime.Property property98 = mutableDateTime23.property(dateTimeFieldType94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
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
        mutableDateTime2.setHourOfDay(2);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:47.920Z", dateTimeZone11);
        mutableDateTime2.setZone(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone11);
        int int15 = mutableDateTime14.getYearOfCentury();
        org.joda.time.Instant instant16 = mutableDateTime14.toInstant();
        boolean boolean17 = mutableDateTime14.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant16", (mutableDateTime10.compareTo(instant16) == 0) == mutableDateTime10.equals(instant16));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField(49);
        boolean boolean12 = mutableDateTime10.isEqual((long) 7);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = mutableDateTime15.toString(dateTimeFormatter16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        mutableDateTime15.add(readablePeriod18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.hourOfDay();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime15.dayOfWeek();
        java.lang.String str22 = mutableDateTime15.toString();
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime15.getZone();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime10, dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime15", (instant3.compareTo(mutableDateTime15) == 0) == instant3.equals(mutableDateTime15));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = mutableDateTime3.toString(dateTimeFormatter4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime3.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.hourOfDay();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime3.dayOfWeek();
        int int10 = property9.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime12 = property9.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime13 = property9.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime13.add(readablePeriod14, 47);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = mutableDateTime19.toString(dateTimeFormatter20);
        int int22 = mutableDateTime19.getYearOfCentury();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime13.toMutableDateTime(chronology23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime27.getZone();
        mutableDateTime13.setZone(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(0L, dateTimeZone29);
        int int32 = mutableDateTime31.getWeekOfWeekyear();
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj33, chronology34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = mutableDateTime35.toString(dateTimeFormatter36);
        mutableDateTime35.setHourOfDay(2);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime43.getZone();
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:47.920Z", dateTimeZone44);
        mutableDateTime35.setZone(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone44);
        int int48 = mutableDateTime47.getYearOfCentury();
        org.joda.time.Instant instant49 = mutableDateTime47.toInstant();
        boolean boolean50 = mutableDateTime31.isBefore((org.joda.time.ReadableInstant) mutableDateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant49", (mutableDateTime19.compareTo(instant49) == 0) == mutableDateTime19.equals(instant49));
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
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime5.toMutableDateTime();
        mutableDateTime8.addDays(2);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.roundFloor();
        org.joda.time.DurationField durationField18 = property15.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime20 = property15.add((long) 6343);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.dayOfYear();
        java.util.Locale locale25 = null;
        java.lang.String str26 = property24.getAsText(locale25);
        java.lang.String str27 = property24.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime29 = property24.set(99);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.dayOfMonth();
        int int32 = mutableDateTime30.getCenturyOfEra();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:47.920Z", dateTimeZone37);
        mutableDateTime30.setZoneRetainFields(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime30.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime30.centuryOfEra();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime30.toMutableDateTime(dateTimeZone45);
        mutableDateTime29.setZone(dateTimeZone45);
        mutableDateTime20.setZoneRetainFields(dateTimeZone45);
        mutableDateTime8.setZoneRetainFields(dateTimeZone45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime30", (instant3.compareTo(mutableDateTime30) == 0) == instant3.equals(mutableDateTime30));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.yearOfCentury();
        int int7 = property6.getLeapAmount();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundFloor();
        org.joda.time.DurationField durationField9 = property6.getRangeDurationField();
        org.joda.time.MutableDateTime mutableDateTime10 = property6.roundFloor();
        mutableDateTime10.addWeekyears(806);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime18.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.yearOfCentury();
        java.lang.String str21 = property20.toString();
        int int22 = property20.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime24 = property20.add((long) 48);
        java.lang.Object obj25 = null;
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(obj25, chronology26);
        org.joda.time.Instant instant28 = mutableDateTime27.toInstant();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime27.monthOfYear();
        mutableDateTime27.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.secondOfMinute();
        int int33 = property32.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime35 = property32.add((int) (short) 0);
        org.joda.time.DateTimeField dateTimeField36 = property32.getField();
        mutableDateTime24.setRounding(dateTimeField36);
        boolean boolean38 = mutableDateTime10.isEqual((org.joda.time.ReadableInstant) mutableDateTime24);
        java.lang.Object obj39 = null;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(obj39, chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = null;
        java.lang.String str43 = mutableDateTime41.toString(dateTimeFormatter42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        mutableDateTime41.add(readablePeriod44);
        mutableDateTime41.setMinuteOfDay(904);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        mutableDateTime50.add(readablePeriod53);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime50.hourOfDay();
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime50.dayOfWeek();
        int int57 = property56.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime59 = property56.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime60 = property56.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        mutableDateTime60.add(readablePeriod61, 47);
        java.lang.Object obj64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(obj64, chronology65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = null;
        java.lang.String str68 = mutableDateTime66.toString(dateTimeFormatter67);
        int int69 = mutableDateTime66.getYearOfCentury();
        org.joda.time.Chronology chronology70 = mutableDateTime66.getChronology();
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime60.toMutableDateTime(chronology70);
        org.joda.time.DateTimeZone dateTimeZone72 = mutableDateTime71.getZone();
        mutableDateTime41.setZone(dateTimeZone72);
        org.joda.time.MutableDateTime mutableDateTime74 = org.joda.time.MutableDateTime.now(dateTimeZone72);
        org.joda.time.MutableDateTime mutableDateTime75 = mutableDateTime74.toMutableDateTime();
        mutableDateTime24.setTime((org.joda.time.ReadableInstant) mutableDateTime74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime66", (instant16.compareTo(mutableDateTime66) == 0) == instant16.equals(mutableDateTime66));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        org.joda.time.DateTimeField dateTimeField11 = property9.getField();
        mutableDateTime6.setRounding(dateTimeField11);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime18.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundFloor();
        int int22 = mutableDateTime21.getHourOfDay();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime28.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime28.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.yearOfEra();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.centuryOfEra();
        int int34 = mutableDateTime31.getYear();
        mutableDateTime21.setTime((org.joda.time.ReadableInstant) mutableDateTime31);
        mutableDateTime6.setTime((org.joda.time.ReadableInstant) mutableDateTime31);
        int int37 = mutableDateTime31.getMillisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime40 = property39.getMutableDateTime();
        int int41 = mutableDateTime40.getYearOfCentury();
        java.lang.Object obj42 = null;
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(obj42, chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = null;
        java.lang.String str46 = mutableDateTime44.toString(dateTimeFormatter45);
        mutableDateTime44.setTime((long) '#');
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime44.dayOfYear();
        int int50 = mutableDateTime44.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime44.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime52 = property51.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime53 = property51.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime55.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField57 = property56.getField();
        int int58 = mutableDateTime53.get(dateTimeField57);
        mutableDateTime40.setRounding(dateTimeField57);
        int int60 = mutableDateTime31.get(dateTimeField57);
        java.lang.Object obj61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(obj61, chronology62);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = null;
        java.lang.String str65 = mutableDateTime63.toString(dateTimeFormatter64);
        int int66 = mutableDateTime63.getYearOfCentury();
        org.joda.time.Chronology chronology67 = mutableDateTime63.getChronology();
        int int68 = mutableDateTime63.getWeekOfWeekyear();
        java.lang.Object obj69 = null;
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime(obj69, chronology70);
        org.joda.time.DateTimeZone dateTimeZone72 = mutableDateTime71.getZone();
        org.joda.time.DateTime dateTime73 = mutableDateTime63.toDateTime(dateTimeZone72);
        mutableDateTime31.setZone(dateTimeZone72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime63", (instant16.compareTo(mutableDateTime63) == 0) == instant16.equals(mutableDateTime63));
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
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfWeek();
        int int9 = property8.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime12 = property8.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime12.add(readablePeriod13, 47);
        java.lang.Object obj17 = null;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(obj17, chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:47.920Z", dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12, dateTimeZone20);
        int int23 = mutableDateTime22.getSecondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime22.add(readablePeriod24, (int) (short) 0);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.Instant instant30 = mutableDateTime29.toInstant();
        mutableDateTime29.setDate((long) 10);
        mutableDateTime29.setDayOfYear(59);
        java.util.Locale locale35 = null;
        java.util.Calendar calendar36 = mutableDateTime29.toCalendar(locale35);
        org.joda.time.Chronology chronology37 = mutableDateTime29.getChronology();
        org.joda.time.DateTime dateTime38 = mutableDateTime22.toDateTime(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant30", (mutableDateTime19.compareTo(instant30) == 0) == mutableDateTime19.equals(instant30));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setSecondOfDay((int) '#');
        mutableDateTime2.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int11 = mutableDateTime2.getWeekyear();
        java.util.GregorianCalendar gregorianCalendar12 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.yearOfEra();
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = mutableDateTime16.toString(dateTimeFormatter17);
        int int19 = mutableDateTime16.getYearOfCentury();
        org.joda.time.Chronology chronology20 = mutableDateTime16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology20);
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
        org.joda.time.MutableDateTime mutableDateTime34 = property30.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime34.add(readablePeriod35, 47);
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        int int43 = mutableDateTime40.getYearOfCentury();
        org.joda.time.Chronology chronology44 = mutableDateTime40.getChronology();
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime34.toMutableDateTime(chronology44);
        mutableDateTime21.setChronology(chronology44);
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(chronology44);
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now(chronology44);
        boolean boolean49 = property13.equals((java.lang.Object) chronology44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime16", (instant3.compareTo(mutableDateTime16) == 0) == instant3.equals(mutableDateTime16));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.getMutableDateTime();
        java.util.Locale locale9 = null;
        java.util.Calendar calendar10 = mutableDateTime8.toCalendar(locale9);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfFloor();
        int int17 = mutableDateTime16.getDayOfYear();
        boolean boolean19 = mutableDateTime16.isEqual((long) ' ');
        mutableDateTime16.addWeekyears(758);
        java.lang.Object obj22 = null;
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(obj22, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = mutableDateTime24.toString(dateTimeFormatter25);
        int int27 = mutableDateTime24.getYearOfCentury();
        org.joda.time.Chronology chronology28 = mutableDateTime24.getChronology();
        mutableDateTime24.setDayOfYear((int) ' ');
        mutableDateTime24.setMinuteOfDay((int) (short) 10);
        java.util.GregorianCalendar gregorianCalendar33 = mutableDateTime24.toGregorianCalendar();
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        mutableDateTime36.add(readablePeriod39);
        mutableDateTime36.setMinuteOfDay(904);
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
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        mutableDateTime55.add(readablePeriod56, 47);
        java.lang.Object obj59 = null;
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(obj59, chronology60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = null;
        java.lang.String str63 = mutableDateTime61.toString(dateTimeFormatter62);
        int int64 = mutableDateTime61.getYearOfCentury();
        org.joda.time.Chronology chronology65 = mutableDateTime61.getChronology();
        org.joda.time.MutableDateTime mutableDateTime66 = mutableDateTime55.toMutableDateTime(chronology65);
        org.joda.time.DateTimeZone dateTimeZone67 = mutableDateTime66.getZone();
        mutableDateTime36.setZone(dateTimeZone67);
        mutableDateTime24.setZone(dateTimeZone67);
        org.joda.time.MutableDateTime mutableDateTime70 = org.joda.time.MutableDateTime.now(dateTimeZone67);
        org.joda.time.DateTime dateTime71 = mutableDateTime16.toDateTime(dateTimeZone67);
        mutableDateTime8.setZone(dateTimeZone67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant14", (mutableDateTime8.compareTo(instant14) == 0) == mutableDateTime8.equals(instant14));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime5.toMutableDateTime();
        org.joda.time.DateTime dateTime9 = mutableDateTime5.toDateTime();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        int int14 = property13.get();
        org.joda.time.DurationField durationField15 = property13.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime16 = property13.getMutableDateTime();
        mutableDateTime16.addMillis((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime16.toString(dateTimeFormatter19);
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
        org.joda.time.MutableDateTime mutableDateTime34 = property30.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime34.add(readablePeriod35, 47);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime34.add(readablePeriod38, (int) (byte) 0);
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(obj41, chronology42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = null;
        java.lang.String str45 = mutableDateTime43.toString(dateTimeFormatter44);
        int int46 = mutableDateTime43.getYearOfCentury();
        org.joda.time.Chronology chronology47 = mutableDateTime43.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now(chronology47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        mutableDateTime48.add(readablePeriod49);
        mutableDateTime48.add((long) 11);
        boolean boolean53 = mutableDateTime34.isBefore((org.joda.time.ReadableInstant) mutableDateTime48);
        java.lang.Object obj54 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(obj54, chronology55);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = null;
        java.lang.String str58 = mutableDateTime56.toString(dateTimeFormatter57);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        mutableDateTime56.add(readablePeriod59);
        java.lang.Object obj61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(obj61, chronology62);
        org.joda.time.DateTimeZone dateTimeZone64 = mutableDateTime63.getZone();
        org.joda.time.MutableDateTime mutableDateTime65 = org.joda.time.MutableDateTime.now(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(dateTimeZone64);
        mutableDateTime56.setZone(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime34.toMutableDateTime(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime((long) 366, dateTimeZone64);
        mutableDateTime16.setZone(dateTimeZone64);
        org.joda.time.DateTime dateTime71 = mutableDateTime5.toDateTime(dateTimeZone64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime43", (instant3.compareTo(mutableDateTime43) == 0) == instant3.equals(mutableDateTime43));
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
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime6.addMonths(4);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = mutableDateTime11.toString(dateTimeFormatter12);
        mutableDateTime11.setHourOfDay(2);
        mutableDateTime11.addSeconds(0);
        int int18 = mutableDateTime11.getMonthOfYear();
        int int19 = mutableDateTime6.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
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
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = mutableDateTime33.toString(dateTimeFormatter34);
        mutableDateTime33.setTime((long) '#');
        java.lang.Object obj38 = null;
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(obj38, chronology39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = mutableDateTime40.toString(dateTimeFormatter41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        mutableDateTime40.add(readablePeriod43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        java.lang.String str46 = mutableDateTime40.toString();
        int int47 = mutableDateTime33.compareTo((org.joda.time.ReadableInstant) mutableDateTime40);
        mutableDateTime22.setTime((org.joda.time.ReadableInstant) mutableDateTime33);
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
        org.joda.time.DateTimeField dateTimeField61 = property57.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = property57.getFieldType();
        int int63 = mutableDateTime33.get(dateTimeFieldType62);
        int int64 = mutableDateTime11.get(dateTimeFieldType62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime40", (instant3.compareTo(mutableDateTime40) == 0) == instant3.equals(mutableDateTime40));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime12.add(readablePeriod13, 47);
        java.lang.Object obj16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(obj16, chronology17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = mutableDateTime18.toString(dateTimeFormatter19);
        int int21 = mutableDateTime18.getYearOfCentury();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime12.toMutableDateTime(chronology22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime26.getZone();
        mutableDateTime12.setZone(dateTimeZone28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutableDateTime12.add(readableDuration30);
        mutableDateTime12.setMillisOfDay(882);
        mutableDateTime12.setSecondOfDay(330);
        int int36 = mutableDateTime12.getSecondOfDay();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.Instant instant40 = mutableDateTime39.toInstant();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime39.monthOfYear();
        mutableDateTime39.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.secondOfMinute();
        int int45 = property44.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property44.getFieldType();
        boolean boolean47 = mutableDateTime12.isSupported(dateTimeFieldType46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and instant40", (mutableDateTime18.compareTo(instant40) == 0) == mutableDateTime18.equals(instant40));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        org.joda.time.DateTimeField dateTimeField4 = mutableDateTime2.getRoundingField();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.centuryOfEra();
        java.lang.String str6 = property5.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        mutableDateTime2.setHourOfDay(2);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:47.920Z", dateTimeZone11);
        mutableDateTime2.setZone(dateTimeZone11);
        java.lang.Object obj14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(obj14, chronology15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime22 = mutableDateTime2.toDateTime(dateTimeZone17);
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime28.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime28.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.yearOfEra();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField34 = property33.getField();
        int int35 = mutableDateTime2.get(dateTimeField34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant26", (mutableDateTime10.compareTo(instant26) == 0) == mutableDateTime10.equals(instant26));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.lang.Object obj1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(obj1, chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:47.920Z", dateTimeZone4);
        org.joda.time.DateTime dateTime6 = mutableDateTime5.toDateTimeISO();
        java.util.Date date7 = mutableDateTime5.toDate();
        int int8 = mutableDateTime5.getMillisOfSecond();
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        int int15 = mutableDateTime14.getDayOfWeek();
        boolean boolean16 = mutableDateTime5.isBefore((org.joda.time.ReadableInstant) mutableDateTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant12", (mutableDateTime3.compareTo(instant12) == 0) == mutableDateTime3.equals(instant12));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = mutableDateTime2.toString(dateTimeFormatter3);
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundCeiling();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.dayOfWeek();
        boolean boolean9 = mutableDateTime7.isAfterNow();
        int int10 = mutableDateTime7.getMillisOfSecond();
        org.joda.time.Instant instant11 = mutableDateTime7.toInstant();
        long long12 = mutableDateTime7.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant11", (mutableDateTime7.compareTo(instant11) == 0) == mutableDateTime7.equals(instant11));
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
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfMonth();
        int int12 = mutableDateTime10.getCenturyOfEra();
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
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        boolean boolean27 = dateTime25.isSupported(dateTimeFieldType26);
        mutableDateTime10.setTime((org.joda.time.ReadableInstant) dateTime25);
        int int29 = mutableDateTime10.getDayOfWeek();
        int int30 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime10);
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(obj31, chronology32);
        org.joda.time.Instant instant34 = mutableDateTime33.toInstant();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime33.monthOfYear();
        mutableDateTime33.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.secondOfMinute();
        int int39 = property38.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime41 = property38.add((int) (short) 0);
        org.joda.time.DateTimeField dateTimeField42 = property38.getField();
        mutableDateTime10.setRounding(dateTimeField42);
        mutableDateTime10.setSecondOfDay(358);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and instant34", (mutableDateTime15.compareTo(instant34) == 0) == mutableDateTime15.equals(instant34));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
        mutableDateTime2.setDate((long) 10);
        int int6 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.toMutableDateTimeISO();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = mutableDateTime10.toString(dateTimeFormatter11);
        int int13 = mutableDateTime10.getYearOfCentury();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology14);
        org.joda.time.DateTime dateTime17 = mutableDateTime7.toDateTime(chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime10", (instant3.compareTo(mutableDateTime10) == 0) == instant3.equals(mutableDateTime10));
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
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.centuryOfEra();
        java.lang.Object obj8 = mutableDateTime2.clone();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.centuryOfEra();
        int int10 = mutableDateTime2.getHourOfDay();
        mutableDateTime2.addDays(336);
        java.lang.Object obj13 = null;
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(obj13, chronology14);
        org.joda.time.Instant instant16 = mutableDateTime15.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfFloor();
        int int19 = mutableDateTime18.getDayOfYear();
        boolean boolean21 = mutableDateTime18.isEqual((long) ' ');
        mutableDateTime18.addWeekyears(758);
        java.lang.Object obj24 = null;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(obj24, chronology25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = mutableDateTime26.toString(dateTimeFormatter27);
        int int29 = mutableDateTime26.getYearOfCentury();
        org.joda.time.Chronology chronology30 = mutableDateTime26.getChronology();
        mutableDateTime26.setDayOfYear((int) ' ');
        mutableDateTime26.setMinuteOfDay((int) (short) 10);
        java.util.GregorianCalendar gregorianCalendar35 = mutableDateTime26.toGregorianCalendar();
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(obj36, chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = null;
        java.lang.String str40 = mutableDateTime38.toString(dateTimeFormatter39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime38.add(readablePeriod41);
        mutableDateTime38.setMinuteOfDay(904);
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(obj45, chronology46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = null;
        java.lang.String str49 = mutableDateTime47.toString(dateTimeFormatter48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        mutableDateTime47.add(readablePeriod50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime47.hourOfDay();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime47.dayOfWeek();
        int int54 = property53.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime56 = property53.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime57 = property53.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        mutableDateTime57.add(readablePeriod58, 47);
        java.lang.Object obj61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(obj61, chronology62);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = null;
        java.lang.String str65 = mutableDateTime63.toString(dateTimeFormatter64);
        int int66 = mutableDateTime63.getYearOfCentury();
        org.joda.time.Chronology chronology67 = mutableDateTime63.getChronology();
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime57.toMutableDateTime(chronology67);
        org.joda.time.DateTimeZone dateTimeZone69 = mutableDateTime68.getZone();
        mutableDateTime38.setZone(dateTimeZone69);
        mutableDateTime26.setZone(dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime72 = org.joda.time.MutableDateTime.now(dateTimeZone69);
        org.joda.time.DateTime dateTime73 = mutableDateTime18.toDateTime(dateTimeZone69);
        mutableDateTime2.setZoneRetainFields(dateTimeZone69);
        int int75 = mutableDateTime2.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and mutableDateTime63", (instant16.compareTo(mutableDateTime63) == 0) == instant16.equals(mutableDateTime63));
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
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.era();
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(obj6, chronology7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = mutableDateTime8.toString(dateTimeFormatter9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime8.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.hourOfDay();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.dayOfWeek();
        mutableDateTime8.add((long) (short) -1);
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
        mutableDateTime8.setTime((org.joda.time.ReadableInstant) mutableDateTime19);
        java.util.GregorianCalendar gregorianCalendar35 = mutableDateTime8.toGregorianCalendar();
        int int36 = property5.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        mutableDateTime39.add(readablePeriod42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.hourOfDay();
        int int45 = mutableDateTime39.getMillisOfSecond();
        java.lang.Object obj46 = mutableDateTime39.clone();
        java.lang.Object obj47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(obj47, chronology48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = null;
        java.lang.String str51 = mutableDateTime49.toString(dateTimeFormatter50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        mutableDateTime49.add(readablePeriod52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime49.hourOfDay();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime49.dayOfWeek();
        java.lang.String str56 = mutableDateTime49.toString();
        org.joda.time.DateTimeZone dateTimeZone57 = mutableDateTime49.getZone();
        mutableDateTime39.setZoneRetainFields(dateTimeZone57);
        mutableDateTime8.setZone(dateTimeZone57);
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime8.toMutableDateTime();
        java.lang.Object obj61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(obj61, chronology62);
        org.joda.time.Instant instant64 = mutableDateTime63.toInstant();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime63.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime66 = property65.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime66.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime66.yearOfCentury();
        java.lang.String str69 = property68.toString();
        int int70 = property68.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime72 = property68.addWrapField((int) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime74 = property68.add((long) (short) 10);
        int int75 = mutableDateTime74.getMillisOfDay();
        boolean boolean76 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant64", (mutableDateTime2.compareTo(instant64) == 0) == mutableDateTime2.equals(instant64));
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
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(obj7, chronology8);
        org.joda.time.Instant instant10 = mutableDateTime9.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.monthOfYear();
        mutableDateTime9.add((long) (byte) 1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        int int18 = property17.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property17.getFieldType();
        boolean boolean20 = mutableDateTime9.isSupported(dateTimeFieldType19);
        int int21 = mutableDateTime2.get(dateTimeFieldType19);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime2.monthOfYear();
        org.joda.time.DurationField durationField23 = property22.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime5.toMutableDateTime();
        mutableDateTime6.setSecondOfDay((int) (byte) 100);
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
        mutableDateTime22.add(readablePeriod23, 47);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime22.toMutableDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) '#', chronology32);
        mutableDateTime6.setChronology(chronology32);
        mutableDateTime6.addWeekyears(6460934);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(obj0, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        mutableDateTime2.setMinuteOfDay(4);
        boolean boolean7 = mutableDateTime2.isBefore(0L);
        org.joda.time.Instant instant8 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime2.toMutableDateTime();
        mutableDateTime2.setMinuteOfDay(98);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime9", (instant8.compareTo(mutableDateTime9) == 0) == instant8.equals(mutableDateTime9));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.572Z");
        mutableDateTime1.setMillisOfDay(494);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        mutableDateTime1.add(readablePeriod4, (int) '4');
        mutableDateTime1.setSecondOfDay(784);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfMonth();
        int int11 = mutableDateTime9.getCenturyOfEra();
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
        mutableDateTime9.setTime((org.joda.time.ReadableInstant) dateTime24);
        int int28 = mutableDateTime9.getDayOfWeek();
        org.joda.time.Chronology chronology29 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime1.toMutableDateTime(chronology29);
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime30", (mutableDateTime1.compareTo(mutableDateTime30) == 0) == mutableDateTime1.equals(mutableDateTime30));
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
        mutableDateTime6.setSecondOfDay((int) (byte) 100);
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
        mutableDateTime22.add(readablePeriod23, 47);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime22.toMutableDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) '#', chronology32);
        mutableDateTime6.setChronology(chronology32);
        int int36 = mutableDateTime6.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime6.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
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
        mutableDateTime2.setHourOfDay(2);
        boolean boolean8 = mutableDateTime2.isAfter((long) 3);
        java.lang.Object obj9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(obj9, chronology10);
        org.joda.time.Instant instant12 = mutableDateTime11.toInstant();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfFloor();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(obj15, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = mutableDateTime17.toString(dateTimeFormatter18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime17.add(readablePeriod20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.dayOfWeek();
        boolean boolean24 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        boolean boolean25 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime17);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime28.era();
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime34.add(readablePeriod37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.hourOfDay();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime34.dayOfWeek();
        mutableDateTime34.add((long) (short) -1);
        java.lang.Object obj43 = null;
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(obj43, chronology44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = null;
        java.lang.String str47 = mutableDateTime45.toString(dateTimeFormatter46);
        mutableDateTime45.setTime((long) '#');
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = null;
        java.lang.String str54 = mutableDateTime52.toString(dateTimeFormatter53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        mutableDateTime52.add(readablePeriod55);
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime52.hourOfDay();
        java.lang.String str58 = mutableDateTime52.toString();
        int int59 = mutableDateTime45.compareTo((org.joda.time.ReadableInstant) mutableDateTime52);
        mutableDateTime34.setTime((org.joda.time.ReadableInstant) mutableDateTime45);
        java.util.GregorianCalendar gregorianCalendar61 = mutableDateTime34.toGregorianCalendar();
        int int62 = property31.compareTo((org.joda.time.ReadableInstant) mutableDateTime34);
        java.lang.Object obj63 = null;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(obj63, chronology64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = null;
        java.lang.String str67 = mutableDateTime65.toString(dateTimeFormatter66);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        mutableDateTime65.add(readablePeriod68);
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime65.hourOfDay();
        int int71 = mutableDateTime65.getMillisOfSecond();
        java.lang.Object obj72 = mutableDateTime65.clone();
        java.lang.Object obj73 = null;
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutableDateTime mutableDateTime75 = new org.joda.time.MutableDateTime(obj73, chronology74);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = null;
        java.lang.String str77 = mutableDateTime75.toString(dateTimeFormatter76);
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        mutableDateTime75.add(readablePeriod78);
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime75.hourOfDay();
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime75.dayOfWeek();
        java.lang.String str82 = mutableDateTime75.toString();
        org.joda.time.DateTimeZone dateTimeZone83 = mutableDateTime75.getZone();
        mutableDateTime65.setZoneRetainFields(dateTimeZone83);
        mutableDateTime34.setZone(dateTimeZone83);
        mutableDateTime2.setZoneRetainFields(dateTimeZone83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime17", (instant12.compareTo(mutableDateTime17) == 0) == instant12.equals(mutableDateTime17));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
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
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.hourOfDay();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime6.dayOfWeek();
        int int13 = property12.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime15 = property12.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime16 = property12.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime16.add(readablePeriod17, 47);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:44:47.920Z", dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime16, dateTimeZone24);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.yearOfEra();
        java.util.GregorianCalendar gregorianCalendar28 = mutableDateTime26.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime26.dayOfYear();
        boolean boolean30 = instant3.equals((java.lang.Object) property29);
        org.joda.time.MutableDateTime mutableDateTime31 = property29.roundFloor();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant3", (mutableDateTime2.compareTo(instant3) == 0) == mutableDateTime2.equals(instant3));
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
        mutableDateTime2.addDays((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.secondOfMinute();
        int int8 = property7.getMaximumValue();
        boolean boolean9 = property7.isLeap();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology11);
        mutableDateTime12.addMillis((int) 'a');
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology16);
        mutableDateTime17.addMillis((int) 'a');
        mutableDateTime12.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.DateTime dateTime21 = mutableDateTime17.toDateTime();
        mutableDateTime17.setSecondOfMinute(49);
        int int24 = property7.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
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
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.DateTime dateTime37 = mutableDateTime27.toDateTime(dateTimeZone36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        boolean boolean39 = dateTime37.isSupported(dateTimeFieldType38);
        org.joda.time.DateTime dateTime40 = dateTime37.toDateTime();
        int int41 = dateTime40.getDayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime40.toMutableDateTimeISO();
        mutableDateTime42.add(35L);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime42.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((java.lang.Object) "2020-11-25T01:45:05.559Z");
        int int48 = mutableDateTime47.getMinuteOfDay();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime47.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime47.dayOfMonth();
        int int51 = property50.getLeapAmount();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property50.getFieldType();
        int int53 = mutableDateTime42.get(dateTimeFieldType52);
        boolean boolean54 = mutableDateTime17.isSupported(dateTimeFieldType52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime27", (instant3.compareTo(mutableDateTime27) == 0) == instant3.equals(mutableDateTime27));
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
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfFloor();
        int int6 = mutableDateTime5.getDayOfYear();
        boolean boolean8 = mutableDateTime5.isEqual((long) ' ');
        mutableDateTime5.addWeekyears(758);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        mutableDateTime13.setDayOfYear((int) ' ');
        mutableDateTime13.setMinuteOfDay((int) (short) 10);
        java.util.GregorianCalendar gregorianCalendar22 = mutableDateTime13.toGregorianCalendar();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        mutableDateTime25.setMinuteOfDay(904);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime34.add(readablePeriod37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.hourOfDay();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime34.dayOfWeek();
        int int41 = property40.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime43 = property40.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime44 = property40.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime44.add(readablePeriod45, 47);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        int int53 = mutableDateTime50.getYearOfCentury();
        org.joda.time.Chronology chronology54 = mutableDateTime50.getChronology();
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime44.toMutableDateTime(chronology54);
        org.joda.time.DateTimeZone dateTimeZone56 = mutableDateTime55.getZone();
        mutableDateTime25.setZone(dateTimeZone56);
        mutableDateTime13.setZone(dateTimeZone56);
        org.joda.time.MutableDateTime mutableDateTime59 = org.joda.time.MutableDateTime.now(dateTimeZone56);
        org.joda.time.DateTime dateTime60 = mutableDateTime5.toDateTime(dateTimeZone56);
        org.joda.time.MutableDateTime mutableDateTime61 = org.joda.time.MutableDateTime.now(dateTimeZone56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime50", (instant3.compareTo(mutableDateTime50) == 0) == instant3.equals(mutableDateTime50));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfYear();
        int int4 = property3.get();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.getMutableDateTime();
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
        mutableDateTime16.addDays(19);
        mutableDateTime16.add((long) 105);
        boolean boolean28 = mutableDateTime6.equals((java.lang.Object) 105);
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.parse("2020-11-25T01:45:07.572Z");
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.era();
        int int32 = mutableDateTime30.getYearOfEra();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) mutableDateTime30);
        int int34 = mutableDateTime6.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and mutableDateTime30", (mutableDateTime6.compareTo(mutableDateTime30) == 0) == mutableDateTime6.equals(mutableDateTime30));
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
        mutableDateTime6.setSecondOfDay((int) (byte) 100);
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
        mutableDateTime22.add(readablePeriod23, 47);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(obj26, chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = mutableDateTime28.toString(dateTimeFormatter29);
        int int31 = mutableDateTime28.getYearOfCentury();
        org.joda.time.Chronology chronology32 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = mutableDateTime22.toMutableDateTime(chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) '#', chronology32);
        mutableDateTime6.setChronology(chronology32);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(chronology32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime28", (instant3.compareTo(mutableDateTime28) == 0) == instant3.equals(mutableDateTime28));
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
        int int5 = mutableDateTime2.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime9 = property6.add(1);
        java.lang.Object obj10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj10, chronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = mutableDateTime12.toString(dateTimeFormatter13);
        int int15 = mutableDateTime12.getYearOfCentury();
        org.joda.time.Chronology chronology16 = mutableDateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(chronology16);
        org.joda.time.DateTime dateTime18 = mutableDateTime9.toDateTime(chronology16);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
        mutableDateTime21.setDate((long) 10);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime21.dayOfMonth();
        java.util.GregorianCalendar gregorianCalendar26 = mutableDateTime21.toGregorianCalendar();
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(obj27, chronology28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = mutableDateTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime29.add(readablePeriod32);
        mutableDateTime29.setMinuteOfDay(904);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime29.millisOfSecond();
        java.lang.Object obj37 = null;
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(obj37, chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = null;
        java.lang.String str41 = mutableDateTime39.toString(dateTimeFormatter40);
        int int42 = mutableDateTime39.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime39.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime44 = property43.roundCeiling();
        java.lang.String str45 = property43.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property43.getFieldType();
        int int47 = mutableDateTime29.get(dateTimeFieldType46);
        boolean boolean48 = mutableDateTime21.isSupported(dateTimeFieldType46);
        boolean boolean49 = dateTime18.isSupported(dateTimeFieldType46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant22", (mutableDateTime12.compareTo(instant22) == 0) == mutableDateTime12.equals(instant22));
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
        int int6 = mutableDateTime2.getCenturyOfEra();
        mutableDateTime2.setDate((long) '#');
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime2.add(readableDuration9, 44);
        java.lang.Object obj12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(obj12, chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = mutableDateTime14.toString(dateTimeFormatter15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime14.add(readablePeriod17);
        java.lang.Object obj19 = null;
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(obj19, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone22);
        mutableDateTime14.setZone(dateTimeZone22);
        org.joda.time.DateTime dateTime26 = mutableDateTime2.toDateTime(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime14", (instant3.compareTo(mutableDateTime14) == 0) == instant3.equals(mutableDateTime14));
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
        int int6 = mutableDateTime5.getDayOfYear();
        boolean boolean8 = mutableDateTime5.isEqual((long) ' ');
        mutableDateTime5.addWeekyears(758);
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(obj11, chronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = mutableDateTime13.toString(dateTimeFormatter14);
        int int16 = mutableDateTime13.getYearOfCentury();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        mutableDateTime13.setDayOfYear((int) ' ');
        mutableDateTime13.setMinuteOfDay((int) (short) 10);
        java.util.GregorianCalendar gregorianCalendar22 = mutableDateTime13.toGregorianCalendar();
        java.lang.Object obj23 = null;
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(obj23, chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = mutableDateTime25.toString(dateTimeFormatter26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime25.add(readablePeriod28);
        mutableDateTime25.setMinuteOfDay(904);
        java.lang.Object obj32 = null;
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(obj32, chronology33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = null;
        java.lang.String str36 = mutableDateTime34.toString(dateTimeFormatter35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime34.add(readablePeriod37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.hourOfDay();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime34.dayOfWeek();
        int int41 = property40.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime43 = property40.addWrapField(0);
        org.joda.time.MutableDateTime mutableDateTime44 = property40.roundHalfEven();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime44.add(readablePeriod45, 47);
        java.lang.Object obj48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(obj48, chronology49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = mutableDateTime50.toString(dateTimeFormatter51);
        int int53 = mutableDateTime50.getYearOfCentury();
        org.joda.time.Chronology chronology54 = mutableDateTime50.getChronology();
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime44.toMutableDateTime(chronology54);
        org.joda.time.DateTimeZone dateTimeZone56 = mutableDateTime55.getZone();
        mutableDateTime25.setZone(dateTimeZone56);
        mutableDateTime13.setZone(dateTimeZone56);
        org.joda.time.MutableDateTime mutableDateTime59 = org.joda.time.MutableDateTime.now(dateTimeZone56);
        org.joda.time.DateTime dateTime60 = mutableDateTime5.toDateTime(dateTimeZone56);
        mutableDateTime5.setMillisOfDay(109);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime50", (instant3.compareTo(mutableDateTime50) == 0) == instant3.equals(mutableDateTime50));
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
        mutableDateTime9.add((long) 105);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(obj21, chronology22);
        org.joda.time.Instant instant24 = mutableDateTime23.toInstant();
        mutableDateTime23.setSecondOfDay((int) '#');
        mutableDateTime23.setTime((int) (short) 10, (int) '#', 49, (int) (byte) 10);
        int int32 = mutableDateTime23.getWeekyear();
        java.util.GregorianCalendar gregorianCalendar33 = mutableDateTime23.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime23.yearOfEra();
        java.lang.Object obj35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(obj35, chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = null;
        java.lang.String str39 = mutableDateTime37.toString(dateTimeFormatter38);
        int int40 = mutableDateTime37.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime37.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime42 = property41.roundCeiling();
        org.joda.time.MutableDateTime mutableDateTime44 = property41.add(1);
        int int45 = property34.getDifference((org.joda.time.ReadableInstant) mutableDateTime44);
        int int46 = mutableDateTime9.compareTo((org.joda.time.ReadableInstant) mutableDateTime44);
        mutableDateTime9.setYear(350);
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(obj49, chronology50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = null;
        java.lang.String str53 = mutableDateTime51.toString(dateTimeFormatter52);
        int int54 = mutableDateTime51.getYearOfCentury();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime51.yearOfCentury();
        int int56 = mutableDateTime51.getSecondOfDay();
        boolean boolean57 = mutableDateTime51.isBeforeNow();
        mutableDateTime9.setTime((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime9.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant24 and mutableDateTime51", (instant24.compareTo(mutableDateTime51) == 0) == instant24.equals(mutableDateTime51));
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
        org.joda.time.Chronology chronology6 = mutableDateTime2.getChronology();
        int int7 = mutableDateTime2.getWeekOfWeekyear();
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(obj8, chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime2.toDateTime(dateTimeZone11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = dateTime12.isSupported(dateTimeFieldType13);
        org.joda.time.DateTime dateTime15 = dateTime12.toDateTime();
        int int16 = dateTime15.getDayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime15.toMutableDateTimeISO();
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
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime30.add(readablePeriod31, 47);
        java.lang.Object obj34 = null;
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(obj34, chronology35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = null;
        java.lang.String str38 = mutableDateTime36.toString(dateTimeFormatter37);
        int int39 = mutableDateTime36.getYearOfCentury();
        org.joda.time.Chronology chronology40 = mutableDateTime36.getChronology();
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime30.toMutableDateTime(chronology40);
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now(chronology40);
        org.joda.time.DateTime dateTime43 = mutableDateTime42.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration44 = null;
        mutableDateTime42.add(readableDuration44, 949);
        mutableDateTime42.setDayOfMonth(11);
        java.lang.Object obj50 = null;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(obj50, chronology51);
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime52.getZone();
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now(dateTimeZone53);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(dateTimeZone53);
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(dateTimeZone53);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(dateTimeZone53);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) (byte) 100, dateTimeZone53);
        org.joda.time.MutableDateTime mutableDateTime59 = mutableDateTime42.toMutableDateTime(dateTimeZone53);
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(dateTimeZone53);
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime17, dateTimeZone53);
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(dateTimeZone53);
        int int63 = mutableDateTime62.getDayOfWeek();
        java.lang.Object obj64 = null;
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(obj64, chronology65);
        org.joda.time.Instant instant67 = mutableDateTime66.toInstant();
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime66.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime69 = property68.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime70 = mutableDateTime69.toMutableDateTime();
        java.lang.Object obj71 = null;
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(obj71, chronology72);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = null;
        java.lang.String str75 = mutableDateTime73.toString(dateTimeFormatter74);
        mutableDateTime73.setTime((long) '#');
        java.lang.Object obj78 = null;
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime(obj78, chronology79);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter81 = null;
        java.lang.String str82 = mutableDateTime80.toString(dateTimeFormatter81);
        org.joda.time.ReadablePeriod readablePeriod83 = null;
        mutableDateTime80.add(readablePeriod83);
        org.joda.time.MutableDateTime.Property property85 = mutableDateTime80.hourOfDay();
        java.lang.String str86 = mutableDateTime80.toString();
        int int87 = mutableDateTime73.compareTo((org.joda.time.ReadableInstant) mutableDateTime80);
        mutableDateTime80.setMonthOfYear((int) (short) 1);
        int int90 = mutableDateTime80.getDayOfMonth();
        org.joda.time.DateTime dateTime91 = mutableDateTime80.toDateTime();
        java.util.Date date92 = mutableDateTime80.toDate();
        org.joda.time.MutableDateTime.Property property93 = mutableDateTime80.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField94 = property93.getField();
        int int95 = mutableDateTime70.get(dateTimeField94);
        int int96 = mutableDateTime62.get(dateTimeField94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant67", (mutableDateTime10.compareTo(instant67) == 0) == mutableDateTime10.equals(instant67));
    }
}

